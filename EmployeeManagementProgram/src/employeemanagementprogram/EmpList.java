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
public class EmpList {
    private ArrayList<Employee> empList;
    private View view;
    
    public void sort(Comparator c) {
        Collections.sort(empList, c);
    }
    
    public void printAll() {
        for (Employee e: empList) 
           view.print(e); 
    }
    
    public void printManagers() {
        for (Employee e: empList)
            if (e.getClass().getName().equals("Manager"))
                    view.print(e);
    }
    
    public void printSalaried() {
        for (Employee e: empList)
            if (e.getClass().getName().equals("Salaried"))
                    view.print(e);
    }
    
    public void printHourly() {
        for (Employee e: empList)
            if (e.getClass().getName().equals("Hourly"))
                    view.print(e);
    }
    
    public void changeOvertimeRate(double aRate) {
        for (Employee e: empList) {
            if (e.getClass().getName().equals("Salaried")) {
                    Salaried s = (Salaried) e;
                    s.setOvertimeRate(aRate);
                    empList.remove(e);
                    empList.add(s);
            }
        }
    }
    
    public void changeHourlyRate(double aRate) {
        for (Employee e: empList) {
            if (e.getClass().getName().equals("Hourly")) {
                    Hourly h = (Hourly) e;
                    h.setHourlyRate(aRate);
                    empList.remove(e);
                    empList.add(h);
            }
        }
    }
    
    public void add(Manager m) {
        Employee e = (Employee) m;
        empList.add(e);
    }
    
    public void add(Salaried s) {
        Employee e = (Employee) s;
        empList.add(e);
    }
    
    public void add(Hourly h) {
        Employee e = (Employee) h;
        empList.add(e);
    }
    
    public void remove(Employee e) {
        empList.remove(e);
    }
}
