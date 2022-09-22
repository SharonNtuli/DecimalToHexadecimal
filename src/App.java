
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner scan =  new Scanner (System.in);
        int decimalNo,remainder;
        char[]hexa={'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        String hexaValue="";

        System.out.print("Enter any number from 0 to 10000 :");
        decimalNo = scan.nextInt();

        if(decimalNo<=10000) 
        {
            // Executes when the Boolean expression is true
            while (decimalNo>1)
        {
             remainder=decimalNo%16;
             hexaValue=hexa[remainder]+hexaValue;
             decimalNo=decimalNo/16;
        }
        System.out.print("Hexa value is : "+ hexaValue);
       } else {
            // Executes when the Boolean expression is false
            System.out.print("The number must be from 0 to 10000");
         }
        
    }
}
