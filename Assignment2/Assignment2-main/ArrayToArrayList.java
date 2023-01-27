import java.util.*;
public class ArrayToArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int[] arr = new int[in.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();


        List<Integer> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);

    }
    }

