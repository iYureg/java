/**
 * array
 * 
 * массивы в java
 */
public class array {

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr[3]);
        System.out.println(arr.length);
        arr[3] = 13;
        System.out.println(arr[3]);

        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr[3]);
        System.out.println(arr.length);

        // многомерные массивы
        int[] array[] = new int[3][5];
        for(int[] line: array){
            for (int item: line){
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        System.out.println("___________");
        
        int[][] array2 = new int[3][5];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.printf("%d ", array2[i][j]);
            }
            System.out.println();
        }

    }
}