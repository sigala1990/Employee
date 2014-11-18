package m5examen;
/**
 * Classe Employee amb 2 parametres al constructor String name, double salary.
 * @author adria
 * @version 18/11/2014
 */
public class Employee {

   private String myName;
   private double mySalary;
   /**
    * Introduir nom i salary per guardar en myName i my Salary
    * @param name
    * @param salary
    */
   public Employee(String name, double salary) {
      myName = name;
      mySalary = salary;
   }
   /**
    * Es un get que agafara el Name i retornara  myName
    * @return myName
    */
   public String getName() {
      return myName;
   }
   /**
    * Get que agafa el Salary i retorna el mySalary
    * @return mySalary
    */
   public double getSalary() {
      return mySalary;
   }
   /**
   * Es passa un integer per parametre i es fara una serie de 
   * operacions   * 
   * @param percent
   */
   public void raiseSalary(int percent) {
      mySalary = mySalary +
         percent * 0.01 * mySalary;
   }

   /**
    * S'introdueix el salary per parametre
    * @param salary
    */
   public void setSalary(double salary) {
      mySalary = salary;
   }
   /**
    * Printa el nom i salary de la persona
    * @return getName(), getSalary()
    * @see getName()
    * @see getSalary()
    */
   public String toString() {
      return "Name: " + getName() +
             ", Salary: " + getSalary();
   }
}