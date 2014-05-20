/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeemanagementprogram;

/**
 *
 * @author alexanderegan
 */
public class Manager extends Employee {
    private String name;
    private double salary;
    private double bonus;
    
    public Manager(String aName, double aSalary, double aBonus) {
        super(aName, aSalary);
        bonus = aBonus;
    }
    
    public Manager(String aName, double aSalary) {
        super(aName, aSalary);
        bonus = 0;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public double getSalary() {
        return super.getSalary();
    }
    
    public String getName() {
        return name;
    }
    
    public void setBonus(double aBonus) {
        bonus = aBonus;
    }
    
    public String toString() {
        return (super.toString() + " -- BONUS: " + bonus);
    }
    
}
