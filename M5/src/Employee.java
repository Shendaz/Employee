/**
 * La classe employee estableix com a atributs un nom i un salari per a cada treballador i 
 * ens permet mitjançant mètodes saber el seu nom, el seu salari, incrementar el salari en un
 * percentatge, posar un nou salari i mostrar la informació del treballador
 * @author Bilal Boulaich
 * @version 18/11/2014
 *
 */
public class Employee {

   private String myName;
   private double mySalary;
   /**
    * Constructor per a un nou treballador
    * @param name Nom del treballador
    * @param salary Salari del treballador
    */
   public Employee(String name, double salary) {
      myName = name;
      mySalary = salary;
   }
   /**
    * Mètode que retorna el nom del treballador
    * @return Retorna el nom del treballador
    */
   public String getName() {
      return myName;
   }
   /**
    * Mètode que retorna el salari del treballador
    * @return Retorna el salari del treballador
    */
   public double getSalary() {
      return mySalary;
   }
   /**
    * Mètode per a incrementar el salari del treballador en un determinat percentatge
    * @param percent El per cent que li volem pujar al treballador
    */
   public void raiseSalary(int percent) {
      mySalary = mySalary +
         percent * 0.01 * mySalary;
   }
   /**
    * Mètode per posar un nou salari al treballador
    * @param salary És el salari que volem que tingui el treballador
    */
   public void setSalary(double salary) {
      mySalary = salary;
      // Versio 4
   }
   /**
    * Mètode que retorna la informació del treballador, el seu nom i el seu salari.
    * @return Retorna el nom i el salari del treballador
    */
   public String toString() {
      return "Name: " + getName() +
             ", Salary: " + getSalary();
   }
}