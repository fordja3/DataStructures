
public class Stack {
    static final int MAX_SIZE = 5000;
    int[] arr = new int[MAX_SIZE];
    //private boolean empty;
    int top;

    Stack(){
        top = -1;
    }

    int peek() {
        if( top < 0){
            // check elements in stack first
            System.out.println("Nothing to peek");
            return 0;
        }else{
            int x = arr[top];
            System.out.println(arr[top]);

            return x;
        }
    }

    int pop(){
        if(top < 0){
            // check elements in stack first
            System.out.println("Nothing to pop");
            return 0;
        }else{
            int x = arr[top--];
            return x;
        }
    }

    Boolean push(int x){
        if(top >= MAX_SIZE-1){
            // check elements in stack first
            System.out.println("Stack is full");
            return false;
        }else{
            arr[++top] = x;
            return true;
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack();
        
        // add elements to stack
        for(int i = 0; i<25; i++){
            if(i%2 == 0 && i > 0){
                st.push(i+i);
                st.peek();

            }
        }

        st.push(10);
        st.push(100);
        st.peek();
        
    }

}