/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package umpsalarysystem;

/**
 *
 * @author SavethequeeN
 */
public class ProgramTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee();
        Salary sal = new Salary(0,0,0,0);
        
        emp.employeeInput();
        sal.salaryInput();
        sal.income(emp.getGrade());
        sal.deduction();
        sal.nettSalary();
        sal.display(emp);
    }
}
