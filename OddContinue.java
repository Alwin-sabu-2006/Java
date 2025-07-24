import java.util.Scanner;
public class OddContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower class:");
        int lower=sc.nextInt();
        System.out.println("Enter upper class:");
        int upper=sc.nextInt();
        int i;
        for(i=lower;i<upper;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
