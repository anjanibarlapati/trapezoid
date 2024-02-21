import java.util.Scanner;
class main
{
        public static int multiplication(int div,int h)
    {
        int x=div*h;
        return x;
    }

    public static int divsion(int add)
    {
        int x=add/2;
        return x;
    }
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int add=addition(a,b);
        int div=divsion(add);
        int mul=multiplication(div,h);
        System.out.println("Area is: "+mul);
    }
}