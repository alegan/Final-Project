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
public class Salaried extends Employee{
    private double overtimeRate;
    private double overtimeHours;
    private String name;
    private double salary;
    
    public Salaried(String aName, double aSalary, double aOvertimeRate, double someOvertimeHours) {
        super(aName, aSalary);
        overtimeRate = aOvertimeRate;
        overtimeHours = someOvertimeHours;
    }
    
    public void setOvertime(double someHours) {
        overtimeHours = someHours;
    }
    
    public void setOvertimeRate(double aRate) {
        overtimeRate = aRate;
    }
    
    public double getSalary() {
        return salary + overtimeHours*overtimeRate;
    }
    
    public String toString() {
        return (super.toString() + " OVERTIME: " +(overtimeHours*overtimeRate));
    }
}
