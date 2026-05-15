public class solidpyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1 ; row <= n ;row++){
            //for each row -> variable columns
            //part 1 formula -> n - row
            //part 2 star 2 * row - 1
            for(int col  = 1 ; col <= n - row ; col++)
            {
                System.out.print("  ");
            }
           //stars 
           for(int col = 1 ; col <=  2 * row - 1 ; col++){
              System.out.print("* ");
           }
           System.out.println();
        }
    }
}
