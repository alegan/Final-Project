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
public class Hourly extends Employee {
    private String name;
    private double salary;
    private double hourlyRate;
    private double hours;
    
    public Hourly(String aName, double aHourlyRate, double someHours) {
        super(aName, aHourlyRate*someHours);
        hourlyRate = aHourlyRate;
        hours = someHours;
    }
    
    public void setHours(double someHours) {
        hours = someHours;
    }
    
    public void setHourlyRate(double aRate) {
        hourlyRate = aRate;
    }
    
    public double getSalary() {
        return hours*hourlyRate;
    }
    
}
