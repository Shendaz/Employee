/**
 * La classe employee estableix com a atributs un nom i un salari per a cada treballador i 
 * ens permet mitjan�ant m�todes saber el seu nom, el seu salari, incrementar el salari en un
 * percentatge, posar un nou salari i mostrar la informaci� del treballador
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
    * M�tode que retorna el nom del treballador
    * @return Retorna el nom del treballador
    */
   public String getName() {
      return myName;
   }
   /**
    * M�tode que retorna el salari del treballador
    * @return Retorna el salari del treballador
    */
   public double getSalary() {
      return mySalary;
   }
   /**
    * M�tode per a incrementar el salari del treballador en un determinat percentatge
    * @param percent El per cent que li volem pujar al treballador
    */
   public void raiseSalary(int percent) {
      mySalary = mySalary +
         percent * 0.01 * mySalary;
   }
   /**
    * M�tode per posar un nou salari al treballador
    * @param salary �s el salari que volem que tingui el treballador
    */
   public void setSalary(double salary) {
      mySalary = salary;
      // Versio 4
   }
   /**
    * M�tode que retorna la informaci� del treballador, el seu nom i el seu salari.
    * @return Retorna el nom i el salari del treballador
    */
   public String toString() {
      return "Name: " + getName() +
             ", Salary: " + getSalary();
   }
}