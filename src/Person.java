public class Person {

       protected String firstName;

              protected String lastName;

              public Person()

              {

                     firstName = "John";

                     lastName="Doe";

              }

             

             

       public Person(String first, String last)

       {setName(first, last);

       }

      

       public String toString() 

       {return (firstName+ " " + lastName);

       }

       public void setName(String first, String last)

       {firstName = first;

       lastName = last;

       }

       public String getFirstName()

       {return firstName;

      

       }

       public String getLastName()

       {return lastName;

      

       }     

}

 