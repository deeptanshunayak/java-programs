//solid rectangle pattern
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows:");
        int r = sc.nextInt();
        System.out.println("enter the no of columns:");
        int c = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
