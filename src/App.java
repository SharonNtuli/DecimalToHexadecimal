
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Conversion from 10th to 16th
        Scanner deci =  new Scanner (System.in);
        Scanner Deci =  new Scanner (System.in);
        
        int decimalNo,remainder,number,i=0,baseValue=2,expValue=0,powerValue=1,decNum=0;
        String binaryString;
        
        char[]hexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int[]Binary=new int[100];
        
        String hexaValue="";

        System.out.print("Enter any number to convert from from 10th to 16th (hexadecimal to decimal) from 0 to 10000 :");
        decimalNo = deci.nextInt();

        if(decimalNo>=0 && decimalNo<=10000) 
        {
            
            while (decimalNo>1)
        {
             remainder=decimalNo%16;
             hexaValue=hexa[remainder]+hexaValue;
             decimalNo=decimalNo/16;
        }
        System.out.print("Hexadecimal value is : "+ hexaValue+"\n");
       } else {
          
            System.out.print("The number must be from 0 to 10000");
         }
         //Conversion from 10th to 2nd
         System.out.print("Enter any number to convert from from 10th to 2nd(decimal to binary) from 0 to 10000 :");
         number = Deci.nextInt();
         if(number>=0 && number <=10000) 
        {
         while (number!=0)
         {
              Binary[i]=number%2;
              number=number/2;
              i++;
              
         }
         
         System.out.println("Binary value is : ");
         for (int j=i-1;j>=0;j--)
         {
            System.out.print(Binary[j]);
         }
     }
     else{
          System.out.print("The number must be from 0 to 10000");

     }


         //Conversion from 2nd to 10th
         Scanner binary =  new Scanner (System.in);
         System.out.print("\n"+"Enter any number to convert from from 2ndth to 10th(binary to decimal) from 0 to 10000 :");
         binaryString = binary.next();
         int k = binaryString.length() - 1;
         while(k>=0)
         {
               if (binaryString.charAt(k)=='1')
               {
                    for( int s=0;s<expValue;s++)
                    {
                         powerValue*=baseValue;
                    }
                    decNum+=powerValue;
                    powerValue=1;

               }
             k--;
             expValue++;
         }

           System.out.println("Decimal Number is : "+decNum);
        
    }
}
