import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.print(s1);
            int num = 15-s1.length();

            String repeated = new String(new char[num]).replace("\0", " ");
            System.out.print(repeated);

            if(x<100)
                System.out.println("0" + x);
            else
                System.out.println(x);
        }
        System.out.println("================================");

    }
}
