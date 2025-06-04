public class Jagged_Arrays {
    public static void main(String[] args) {
        //2D array with unequal row lwngth
        //Array of 3 arrays 3row x 4col
        int[][] jagged = {{1,2,3,4,5},
                          {4,5,6,7},
                          {7,8,9}};

        for(int i=0;i< jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();
        }
        // For each loop -> Enhanced For loop
        for(int[] arr : jagged) {
            for(int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        char[][] languages = {{'j','a','v','a'},{'c','+','+'},{'p','y','t','h','o','n'}};
        for(char[] arr : languages) {
            for(char x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
