public class rhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ; i <= n ; i++){
            //for each -> row spaces , stars
            
            //for spaces
            for(int col = 1 ; col <= n - i ; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 1 ; col <= n ; col++){
                System.out.print("* ");
            }
            //move next line
            System.out.println();
        }
    }
}
