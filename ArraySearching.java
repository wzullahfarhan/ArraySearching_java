import java.util.Scanner;
public class ArraySearching {
    public static void main(String args[]){
        Scanner SC= new Scanner(System.in);
        int n,FE;
        System.out.print("Enter the Number of array: ");
        n=SC.nextInt();
        int[] Arr=new int[n];
        for(int i=0;i< Arr.length ; i++){
            Arr[i]=SC.nextInt();
        }
        System.out.print("Enter The Finding Element: ");
        FE=SC.nextInt();
        int flag=0;
        for(int i=0;i< Arr.length ;i++){
            if(Arr[i]==FE){
                flag=1;
           }
        }
        if(flag==1){
        System.out.println("The Finding Element is in the array");
        System.out.println("and There index are: ");
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]==FE){
                System.out.println(i+" ");
           }

        }
        }
        else{
            System.out.println("The Finding element isn't in the array");
        }



    }   
}
