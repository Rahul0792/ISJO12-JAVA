package _11_Array;

public class Demo2 {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};

        System.out.println(array);

        for(int i = 1 ; i< array.length ; i++){
            System.out.println(array[i]);
        }

        for(int element : array){
            System.out.print(element + " ");
        }
    }
}
