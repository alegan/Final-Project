/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeemanagementprogram;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
/**
 *
 * @author alexanderegan
 */
public class View {
    
    
    public View() {
        primaryFrame = new JFrame();
        primaryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        initSortPanel();
        initSavePrintReadPanel();
        initManagePanel();
        initPrintArea();
        
        primaryFrame.pack();
        primaryFrame.setVisible(true);
    }
    
    public void print(Employee e) {
        printArea.append(e.toString());
    }
    
    public void initSortPanel() {
        sortPanel = new JPanel();
        sortPanel.setLayout(new GridLayout(2,1));
        
        JButton sortByNameButton = new JButton("Sort By Name");
        sortByNameButton.addActionListener(new 
                ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                empList.sort(new ComparatorByName());
                //System.out.println("Up");
            }
        });
        JButton sortBySalaryButton = new JButton("Sort By Salary");
        sortBySalaryButton.addActionListener(new 
                ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                empList.sort(new ComparatorBySalary());
                //System.out.println("Up");
            }
        });
        sortPanel.add(sortByNameButton);
        sortPanel.add(sortBySalaryButton);
        primaryFrame.add(sortPanel, BorderLayout.WEST);
    }
    
    public void initSavePrintReadPanel() {
        savePrintReadPanel = new JPanel();
        savePrintReadPanel.setLayout(new GridLayout(1,3));
        
        JPanel savePanel = new JPanel();
        savePanel.setLayout(ENTRY_LAYOUT);
        savePanel.add(new JLabel("Enter a file name"));
        JButton saveToFileButton = new JButton("Save to File");
        saveFileArea = new JTextArea(1,4);
        savePanel.add(saveFileArea);
        savePanel.add(saveToFileButton);
        
        JPanel readPanel = new JPanel();
        readPanel.setLayout(ENTRY_LAYOUT);
        readPanel.add(new JLabel("Enter a file name"));
        readFileArea = new JTextArea(1,4);
        JButton readFromFileButton = new JButton("Read File");
        readPanel.add(readFileArea);
        readPanel.add(readFromFileButton);
        
        JButton printButton = new JButton("Print employee list to screen");
        readFileArea = new JTextArea(1,4);
        
        savePrintReadPanel.add(readPanel);
        savePrintReadPanel.add(savePanel);
        savePrintReadPanel.add(printButton);
        
        primaryFrame.add(savePrintReadPanel,BorderLayout.NORTH);
    }
    
    public void initManagePanel() {
        managePanel = new JPanel();
        managePanel.setLayout(new GridLayout(3,1));
        
        JButton addWorkerButton = new JButton("Add Worker");
        addWorkerButton.addActionListener(new 
                ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                
                //System.out.println("Up");
            }
        });
        JPanel changeHourlyPanel = new JPanel();
        changeHourlyPanel.setLayout(ENTRY_LAYOUT);
        JButton changeHourlyButton = new JButton("Change Hourly Rates");
        changeHourlyPanel.add(new JLabel("Enter a new hourly rate:"));
        setHourlyArea = new JTextArea(1,4);
        changeHourlyPanel.add(setHourlyArea);
        changeHourlyPanel.add(changeHourlyButton);
        
        JPanel changeOvertimePanel = new JPanel();
        changeOvertimePanel.setLayout(ENTRY_LAYOUT);
        JButton changeOvertimeButton = new JButton("Change Overtime Rates");
        setOvertimeArea = new JTextArea(1,4);
        changeOvertimePanel.add(new JLabel("Enter a new overtime rate:"));
        changeOvertimePanel.add(setOvertimeArea);
        changeOvertimePanel.add(changeOvertimeButton);
        
        managePanel.add(changeOvertimePanel);
        managePanel.add(changeHourlyPanel);
        managePanel.add(addWorkerButton);
        
        primaryFrame.add(managePanel, BorderLayout.EAST);
    }
    
    public void initPrintArea() {
        printArea = new JTextArea(PRINT_AREA_WIDTH,PRINT_AREA_HEIGHT);
        primaryFrame.add(printArea, BorderLayout.CENTER);
    }
    
    private JFrame primaryFrame;
    
    
    
    //Parent panels for the JButtons
    private JPanel mainPanel;
    private JPanel sortPanel;
    private JPanel managePanel;
    private JPanel savePrintReadPanel;
    
    public static final int PRINT_AREA_WIDTH = 35;
    public static final int PRINT_AREA_HEIGHT = 50;
    public static final GridLayout ENTRY_LAYOUT = new GridLayout(2,1);
    
    private JTextArea readFileArea;
    private JTextArea saveFileArea;
    private JTextArea printArea;
    private JTextArea setHourlyArea;
    private JTextArea setOvertimeArea;
    private EmpList empList;
}
