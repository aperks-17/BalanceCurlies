import java.util.Scanner;

public class BalanceCurlies {
    public static void main(String[] args) 
    {
        curlies();
    }

    public static void curlies()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter curlie brackets");
        String x=input.next();
        int count=0;
       for(int i=0; i<=x.length;i++);{
           if(x(i)=='{')
           counter++;
           if(x(i)=='}')
           counter--;
       }
    if(counter==0)
    System.out.println("The curlies are balanced!");
    else if(counter<0)
    System.out.println("There are too many closed brackets");
    else if(counter>0)
    System.out.println("There are too many opened brackets");
    }

}