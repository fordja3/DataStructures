public class BubbleSort {

    int[] sort(int arr[]){
        int n = arr.length -1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j< n - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                        
                }
            }
        }

        printSort(arr);
        return arr;
    }


    void printSort(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args){

        BubbleSort bs = new BubbleSort();

        int[] ar = new int[]{9,8,4,2,8,1,1,1,16,6,1,5,1};

        
        bs.sort(ar);


    }

}
