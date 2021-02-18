public class Queue {
    
    int front, end, size;
    int capacity;
    int arr[];

    public Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        end = capacity - 1;
        arr = new int[this.capacity];

    }


    boolean isFull(Queue q){
        return (q.size == q.capacity);
    }

    boolean isEmpty(Queue q){
        return (q.size == 0);
    }

    void enqueue(int input){
        if(isFull(this)) {
            return;
        }else{
            this.end = (this.end + 1)% this.capacity;
            this.arr[this.end] = input;
            this.size++;
            System.out.println(input + " added");
        }
    }

    void dequeue(){
        if(isEmpty(this)){
            return;
        }else{
            
        }
    }

}
