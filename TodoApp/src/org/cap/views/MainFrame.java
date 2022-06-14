/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cap.views;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.cap.include.Config;
import org.cap.include.DatabaseConnection;
import org.cap.model.Task;
import org.hibernate.Query;
import org.hibernate.classic.Session;

/**
 *
 * @author Giridhar
 */
public class MainFrame extends javax.swing.JFrame {

    private Task taske;
    private int status=0;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        Config.mainframe = this;
        
        
        //will get list of objects from db & put them into cityMap as key & values
            //or setCityMap(); from mainform but from other form we have in following
            Config.mainframe.setCriticaltaskMap();
            Config.mainframe.setMajortaskMap();
            Config.mainframe.setMinortaskMap();



            //will display all records of cities into table of cityframe
            Config.mainframe.setTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TaskField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priorityCombobox = new javax.swing.JComboBox<>();
        SubmitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        CriticalData = new javax.swing.JButton();
        majorData = new javax.swing.JButton();
        minorData = new javax.swing.JButton();
        completeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TaskField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Add Task");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Priority");

        priorityCombobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priorityCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical", "Major", "Minor" }));
        priorityCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityComboboxActionPerformed(evt);
            }
        });

        SubmitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TaskField, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(priorityCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TaskField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(priorityCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Task", "Mark"
            }
        ));
        taskTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taskTable);

        CriticalData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CriticalData.setText("Critical");
        CriticalData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriticalDataActionPerformed(evt);
            }
        });

        majorData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        majorData.setText("Major");
        majorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorDataActionPerformed(evt);
            }
        });

        minorData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        minorData.setText("Minor");
        minorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minorDataActionPerformed(evt);
            }
        });

        completeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        completeButton.setText("Mark as Complete");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(CriticalData)
                .addGap(94, 94, 94)
                .addComponent(majorData)
                .addGap(92, 92, 92)
                .addComponent(minorData)
                .addGap(85, 85, 85)
                .addComponent(completeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CriticalData)
                    .addComponent(majorData)
                    .addComponent(minorData)
                    .addComponent(completeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priorityComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityComboboxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_priorityComboboxActionPerformed

    private void TaskFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaskFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        try
        { 
            if(taske==null)
            {
                String task = TaskField.getText();
                String priority = priorityCombobox.getSelectedItem().toString();

                
                if (priority.equals("Critical")) {
                    status = 1;
                } else if (priority.equals("Major")) {
                    status = 2;
                } else if (priority.equals("Minor")) {
                    status = 3;
                }
                if(task.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Invalid Entry", "Main Form", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    Task task1 = new Task();//empty object
                    task1.setTask(task);
                    task1.setPriority(priority);
                    task1.setMark("Pending");//will return 
                    task1.setCreated(new Date());//return current date
                    task1.setModified(new Date());
                    task1.setStatus(status);

                    Session ses = (Session) DatabaseConnection.getDatabaseSession();
                    ses.beginTransaction();
                    ses.save(task1);
                    ses.getTransaction().commit();
                    
                    JOptionPane.showMessageDialog(this, "Task added Successfully ", "Main Form", JOptionPane.INFORMATION_MESSAGE);
                    resetData();
                   
                }
                
            }
            else
            {
                String task = TaskField.getText();
                String priority = priorityCombobox.getSelectedItem().toString();
                if (priority.equals("Critical")) {
                    status = 1;
                } else if (priority.equals("Major")) {
                    status = 2;
                } else if (priority.equals("Minor")) {
                    status = 3;
                }
                
                taske.setPriority(priority);
                taske.setCreated(new Date());//return current date
                taske.setModified(new Date());
                taske.setStatus(status);
                 Session ses = (Session) DatabaseConnection.getDatabaseSession();
                    ses.beginTransaction();
                    ses.update(taske);
                    ses.getTransaction().commit();
                    Config.mainframe.setTableData();
                    JOptionPane.showMessageDialog(this, "Priority of task Updated ", "Main Form", JOptionPane.INFORMATION_MESSAGE);
                    resetData();
                    taske=null;
                
            }
        }
        catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "Main Frame", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void majorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorDataActionPerformed
        // TODO add your handling code here
         Config.mainframe.setMajortaskMap();//will refres map var
         Config.mainframe.setTableData();//will dispaly record in table
        
    }//GEN-LAST:event_majorDataActionPerformed

    private void CriticalDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriticalDataActionPerformed
        // TODO add your handling code here:
         Config.mainframe.setCriticaltaskMap();//will refres map var
         Config.mainframe.setTableData();//will dispaly record in table
    }//GEN-LAST:event_CriticalDataActionPerformed

    private void minorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minorDataActionPerformed
        // TODO add your handling code here:
         Config.mainframe.setMinortaskMap();//will refres map var
         Config.mainframe.setTableData();//will dispaly record in table
    }//GEN-LAST:event_minorDataActionPerformed

    private void taskTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskTableMouseClicked
        // TODO add your handling code here:
         try {
            //returns object hence we need to convert in string
            int taskid =Integer.parseInt(taskTable.getValueAt(taskTable.getSelectedRow(), 0).toString());
            System.out.println(taskid);
            
             Session ses = (Session) DatabaseConnection.getDatabaseSession();
             ses.beginTransaction();
            
             taske=(Task)ses.get(Task.class,taskid); //assign in class variable of Persons type
             System.out.println(taske);
             
            if (taske != null) {
                TaskField.setText(taske.getTask());
                priorityCombobox.setSelectedItem(taske.getPriority());
                
                
            
  
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Form", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_taskTableMouseClicked

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        // TODO add your handling code here:
        try {
           
            
            if (taske == null) {
                JOptionPane.showMessageDialog(this, "Please Select Record To Update", "Main Form", JOptionPane.ERROR_MESSAGE);
            } else {
                 taske.setMark("Completed");
                 Session ses = (Session) DatabaseConnection.getDatabaseSession();
                    ses.beginTransaction();
                    ses.update(taske);
                    ses.getTransaction().commit();
                    Config.mainframe.setTableData();
                    JOptionPane.showMessageDialog(this, "Person Record Updated ", "Main Form", JOptionPane.INFORMATION_MESSAGE);
                    resetData();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Form", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_completeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CriticalData;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField TaskField;
    private javax.swing.JButton completeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton majorData;
    private javax.swing.JButton minorData;
    private javax.swing.JComboBox<String> priorityCombobox;
    private javax.swing.JTable taskTable;
    // End of variables declaration//GEN-END:variables

    private void resetData() {
        TaskField.setText("");
    }
    public void setCriticaltaskMap()
    {
        try {
            Session ses = (Session) DatabaseConnection.getDatabaseSession();
            ses.beginTransaction();
            Query query = ses.createQuery("from Task where status=1");
            List<Task> taskList = query.list();
            Config.taskMap.clear();
            for (Task task : taskList) {
                Config.taskMap.put(task.getTask(), task);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "MainFrame-CriticalTask Map", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void setMajortaskMap()
    {
        try {
            Session ses = (Session) DatabaseConnection.getDatabaseSession();
            ses.beginTransaction();
            Query query = ses.createQuery("from Task where status=2");
            List<Task> taskList = query.list();
            Config.taskMap.clear();
            for (Task task : taskList) {
                Config.taskMap.put(task.getTask(), task);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "MainFrame-Majortask Map", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void setMinortaskMap()
    {
        try {
            Session ses = (Session) DatabaseConnection.getDatabaseSession();
            ses.beginTransaction();
            Query query = ses.createQuery("from Task where status=3");
            List<Task> taskList = query.list();
            Config.taskMap.clear();
            for (Task task : taskList) {
                Config.taskMap.put(task.getTask(), task);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "MainFrame-MinorTask Map", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void setTableData() {
        try {
            String[] cols = {"ID","Priority", "Task", "Mark"};
            Collection<Task> taskValues = Config.taskMap.values();
            String[][] data = new String[taskValues.size()][cols.length];
            int i = 0;
            for (Task task : taskValues) {
                data[i][0] = task.getId()+ "";
                data[i][1] = task.getPriority();
                data[i][2] = task.getTask();
                data[i][3] = task.getMark();
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, cols);
            taskTable.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "MainForm-Table", JOptionPane.ERROR_MESSAGE);
        }
    }
}
