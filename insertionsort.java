//insertion sort in java

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements:");
        int n = sc.nextInt();
        int i,j,k;
        int a[]=new int[n];
        System.out.println("enter the elements of array");
        for(k=0;k<n;k++){
            a[k]=sc.nextInt();
        }
        System.out.println("elements of array are:");
        for(k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
        for(i=1;i<n;i++){
            int temp = a[i];
            j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println(" \nelements after sorted:");
        for(k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
        
    }
}
