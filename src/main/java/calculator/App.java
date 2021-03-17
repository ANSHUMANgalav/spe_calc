package calculator;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args)
    {
        int choice;
        boolean flag=true;
        double n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("**********CALCULATOR**********");
        while(flag) {
            System.out.println("for square root press : 1");
            System.out.println("for factorial press   : 2");
            System.out.println("for natural log press : 3");
            System.out.println("for power func. press : 4");
            System.out.println("To exit press         : 5");
            choice = sc.nextInt();
            if (choice > 5 || choice <1) {
                System.out.println("Enter a valid option mate\n");
            }
            else if(choice == 1){

                System.out.println("enter the number");
                n1 = sc.nextDouble();
                System.out.println("the root of "+n1+" is : "+ root(n1));
            }
            else if(choice == 2){
                System.out.println("enter the number");
                n1 = sc.nextDouble();
                System.out.println("the factorial is : " + fac(n1));
            }
            else if(choice == 3){
                System.out.println("enter the number");
                n1= sc.nextDouble();
                System.out.println("the log of "+n1+" is : "+log(n1));
            }
            else if(choice == 4){
                System.out.println("enter base");
                n1=sc.nextDouble();
                System.out.println("enter power");
                n2=sc.nextDouble();
                System.out.println("the result is : " + pow(n1,n2));
            }
            else if(choice == 5){
                System.out.println("**********EXITING**********");
                flag = false;
            }


            }
    }
    

    static double root(double a) {
        return Math.sqrt(a) ;
    }

    static double fac(double a) {

        logger.info("factorial of "+a );
        double fac =1;
        try {
            if(a<0){
                fac = Double.NaN;
                throw new ArithmeticException("fac not defined for negative numbers");
            }
            if(a!= (int)a){
                fac = Double.NaN;
                throw new ArithmeticException("fac not defined for fractional numbers");

            }

            else {
                for (double i = 1; i <= a; i++) {
                    fac = fac * i;
                }
            }
        } catch (ArithmeticException e) {
            logger.error("Error : " + e.getMessage());
        } finally {
            logger.info("Result : " + fac);
        }
        return fac ;
    }
    static double log(double a) {

    	logger.info("taking natural log of "+a);
        return Math.log(a) ;
    }
    static double pow(double a, double b) {
    	 return Math.pow(a, b);
    }
}
