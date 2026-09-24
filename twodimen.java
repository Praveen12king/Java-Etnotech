
public class twodimen {
    public static void main(String[] args){
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int total = 0;
        int largest = array[0][0];
        System.out.println("Matrix:");
        for(int i=0;i<array.length;i++){
            int rowSum = 0;
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
                total += array[i][j];
                rowSum += array[i][j];
                if(array[i][j] > largest){
                    largest = array[i][j];
                }
            }
            System.out.println("  Row " + (i + 1) + " sum: " + rowSum);
        }
        System.out.println("\nColumn sums:");
        for(int j=0;j<array[0].length;j++){
            int columnSum = 0;
            for(int i=0;i<array.length;i++){
                columnSum += array[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum: " + columnSum);
        }

        int diagonalSum = 0;
        for(int i=0;i<Math.min(array.length, array[0].length);i++){
            diagonalSum += array[i][i];
        }

        System.out.println("\nSum of all elements: " + total);
        System.out.println("Largest element: " + largest);
        System.out.println("Diagonal sum: " + diagonalSum);
    }
}
