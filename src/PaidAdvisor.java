public class PaidAdvisor extends Person {

 

       private double regularPayRate = 25;

       private double specialPayRate = 50;

       private double overtimePayRate = regularPayRate * 1.5;

       private double overtimePay = 0;

       private double specialPay = 0;

       private double regularPay = 0;

 

       public double calculatePay(double totalhours, double specialhours) {

              if (totalhours - specialhours > 30) {

                     overtimePay = (totalhours - specialhours - 30) * overtimePayRate;

                     regularPay = 30 * regularPayRate;

              } else {

                     regularPay = (totalhours - specialhours) * regularPayRate;

              }

 

              if (specialhours > 0) {

                     specialPay = specialhours * specialPayRate;

              }

              double wages = specialPay + regularPay + overtimePay;

 

              return wages;

 

       }

 

       public double getHoursWorked(double totalhours) {

              return totalhours;

       }

 

       public double getPayRate() {

 

              return regularPayRate;

       }

      

       public void setNameRateHours(double totalhours) {

              String Name = toString();

              double Rate = getPayRate();

              double hours = totalhours;

              System.out.println("Method to set values for Consultant" +"\n"+  "Set Name: " +  Name + "; Regular Rate: " + Rate + "; Hours: " + hours);

       }

}