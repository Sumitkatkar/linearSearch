import java.util.ArrayList;
import java.util.Scanner;

public class userValue {
    public static void main(String args[]){
        ArrayList<Integer> a1 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your array size = ");
        int a = sc.nextInt();
        System.out.print("enter your array element = ");
        for(int i = 0; i<a;i++){
            int b = sc.nextInt();
            a1.add(b);
        }

        System.out.print("which no do you have to find = ");
        int find = sc.nextInt();
        int check = 0;
        for(int i=0; i<a1.size();i++){
            if(a1.indexOf(i) == find){
                check = 1;
            }
        }

        if(check==1){
            System.out.println("number is present");
        }
        else{
            System.out.println("number is not present");
        }
    }
}
