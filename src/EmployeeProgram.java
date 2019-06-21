import java.util.Scanner;

 

public class EmployeeProgram {

 

       public static void main(String[] args) {

 

//Prompt User for Total Hours and Special Hours

              double totalhours = 0;

             

              Scanner user = new Scanner(System.in);

              do {

                     System.out.println("Total Hours Worked: ");

                     while (!user.hasNextInt()) {

                           System.out.println("Please enter hours");

                           user.next();

                     }

                     totalhours = user.nextInt();

              } while (totalhours < 1);

 

              double specialhours = 0;

              System.out.println("How many of these hours were special session hours?: ");

              do {

                     System.out.println("Total Hours Worked: ");

                     while (!user.hasNextInt()) {

                           System.out.println("Please enter hours");

                           user.next();

                     }

                     specialhours = user.nextInt();

              } while (specialhours < 0);

 

              user.close();

             

              PaidAdvisor test = new PaidAdvisor();

              System.out.println("Advisor Name: " + test.toString());

 

              System.out.println("Wages: " + test.calculatePay(totalhours, specialhours));

              System.out.println("Regular Pay Rate: " + test.getPayRate());

              System.out.println("Hours Worked: " +test.getHoursWorked(totalhours));

              test.setNameRateHours(totalhours);

 

       }

 

}