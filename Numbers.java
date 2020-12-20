import java.util.*;
class Numbers
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int len, num, a;
        String Out="", Str="";
        System.out.print("Enter a Number ");
        num = in.nextInt();
        do
        {
            a = num%10;
            num/=10;

            if(a==0)
              Out = "Zero";
            if(a==1)
              Out = "One";
            if(a==2)
              Out = "Two";
            if(a==3)
              Out = "Three";
            if(a==4)
              Out = "Four";
            if(a==5)
              Out = "Five";
            if(a==6)
              Out = "Six";
            if(a==7)
              Out = "Seven";
            if(a==8)
              Out = "Eight";
            if(a==9)
              Out = "Nine";
            
            Str = Out +" "+Str;
        }while(num!=0);
        System.out.print(Str);
    }
}