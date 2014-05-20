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
public class ComparatorByName implements Comparator<Employee>{
    
    public int compare(Employee e1, Employee e2) {
        return e1.compareTo(e2);
    }
    
}
