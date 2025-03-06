public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {1,2,3,4};

        int size = arr.length;

        for (int j : arr) {

            System.out.print(j);

        }

        defaultValuesDemo();


    }

    private static void defaultValuesDemo() {
        System.out.println(" array default values demo ");

        // int array
        System.out.println("\n int array default values demo \n");
        int[] num = new int[5];
        for(int i:num) {
            System.out.print(i + " ");
        }

        // string array
        System.out.println("\n string array default values demo \n");
        String[] arr = new String[5];
        for(String j : arr) {
            System.out.print(j + " ");
        }
    }
}