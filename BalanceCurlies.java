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
        int length=x.length();
       for(int i=0; i<length;i++){  
        if(x.charAt(i)=='{')
           count++;
           if(x.charAt(i)=='}')
           count--;

        }
    if(count==0)
    System.out.println("The curlies are balanced!");
    else if(count<0)
    System.out.println("There are too many closed brackets");
    else if(count>0)
    System.out.println("There are too many opened brackets");
    }

}
