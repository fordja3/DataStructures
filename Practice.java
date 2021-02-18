import java.util.HashSet;

public class Practice {
    
    void printNumPrime(int n){
        for(int i = 2; i<n; i++){
            boolean isPrime = true;
            for(int j = 2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }

    boolean perfSqr(int n){
        boolean sqr = false;
        int num = 0;
        for(int i=0; i<n; i++){
            if(i*i == n){
                sqr = true;
                num = i;
                break;
            }
        }
        if(sqr){
            System.out.println("The squareroot of "+ n + " is "+ num);
            return sqr;
        }else{
            System.out.println(n + " is not a perfect square.");
            return sqr;
        }

    }


	int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    void printFibinacci(int n){
        // Print the first N numbers 
        for (int i = 0; i < n; i++) { 
            System.out.print(fibonacci(i) + " "); 
        } 
    }

    int total(String in) {
        char[] ch = in.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != ' ') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();
       for(char c:jewels.toCharArray()){
           // checking for each character in string jewels & add it to hashSet
           jewelsSet.add(c);
       }
       int numJewels=0;    // initially count of numJewels
       for(char c:stones.toCharArray()){
           if(jewelsSet.contains(c))
               numJewels++;
       }
       return numJewels;
       
   
   }

    int[] reverseArray(int[] r) {
        int start = 0;
        int end = r.length - 1;
        for (int k = 0; k < r.length; k++) {
            if (end > start) {
                int temp = r[start];
                r[start] = r[end];
                r[end] = temp;
                end--;
                start++;
            }

            System.out.println(r[k] + " ");
        }
        return r;
    }

    boolean isPalindrome(String s) {

        char[] ch = s.toCharArray();
        int front = 0;
        int back = ch.length - 1;
        boolean isPalindrome = true;

        for (int j = 0; j < back; j++) {
            if (ch[front] == ch[back]) {
                front++;
                back--;
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);
        return isPalindrome;
    }

    // System.out.println(st.total("Last podcast on the left"));

    // for(int i=1; i<=12; i++ ){
    // for(int j=1; j<=12;j++){
    // System.out.print( i*j + " ");
    // }
    // System.out.println(" ");

    // }

    public String restoreString(String s, int[] indices) {
        char[] c = s.toCharArray();
        char[] t = new char[indices.length];
       
        for(int i = 0; i<indices.length; i++){
            t[indices[i]] = c[i];
        }
        
        String a = t.toString();
        System.out.println(a);
        return a;
    }


    public int sumOddLengthSubarrays(int[] arr) {
        int count = 0;
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(j%2 != 0 || j == 0){
                     for(int k = i; k<=j; k++){
                        count = count + arr[j];
                     }                     
                }              
            }  
        }
        
     return count;

    }

    public static void main(String[] args) {

        Practice pr = new Practice();
        int[] r = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        String a = "1234567891001987654321";

        pr.isPalindrome(a);

        pr.total("this should be 14");
        pr.perfSqr(4);
        pr.perfSqr(55);
        pr.perfSqr(25);
        pr.perfSqr(1);
        pr.perfSqr(81);


    }
}
