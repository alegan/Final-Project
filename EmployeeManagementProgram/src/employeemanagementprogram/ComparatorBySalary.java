/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeemanagementprogram;
import java.util.*;
/**
 *
 * @author alexanderegan
 */
public class ComparatorBySalary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() == e2.getSalary())
            return 0;
        else if (e1.getSalary() > e2.getSalary())
            return 1;
        else 
            return -1;
    }
}
