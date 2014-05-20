/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeemanagementprogram;
import java.util.*;
import java.awt.*;

/**
 *
 * @author alexanderegan
 */
public abstract class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
    
    public Employee(String aName, double aSalary) {
        name = aName;
        salary = aSalary;
    }
    
    public void setSalary(double aSalary) {
        salary = aSalary;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return (name + " : $" + salary);
    }
    
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
