public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) {  //Check to prevent exception
            System.out.println(arr[4]); // Accessing the last valid element
        }
    }
}