/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyAppFrames;

import Db.pharmacistOperation;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laurentera_sd2022
 */
public class PharmacistDashboard extends javax.swing.JFrame {

    pharmacistOperation po = new pharmacistOperation();
    Object[][] medCough = po.viewMedicineForCough();
    String[] columns = {"Brand name", "Generic name", "Price", "Type", "Quantity"};

    DefaultTableModel tableMedCough = new DefaultTableModel(medCough, columns) {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all ceisCellEditablells false
            return false;
        }
    };

    public PharmacistDashboard() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        pharTable.setModel(tableMedCough);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PharContainer = new javax.swing.JPanel();
        medNav = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        pharMenu = new javax.swing.JMenuBar();
        Logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rangie Drug Store");

        PharContainer.setBackground(new java.awt.Color(255, 153, 204));

        medNav.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine For Cough", "Medicine For Headache", "Medicine For Body pain", "Medicine For Allergies" }));
        medNav.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                medNavComponentShown(evt);
            }
        });
        medNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNavActionPerformed(evt);
            }
        });

        pharTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand name", "Generic name", "Price", "Type", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(pharTable);

        addBtn.setText("Add");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PharContainerLayout = new javax.swing.GroupLayout(PharContainer);
        PharContainer.setLayout(PharContainerLayout);
        PharContainerLayout.setHorizontalGroup(
            PharContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PharContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PharContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PharContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PharContainerLayout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PharContainerLayout.setVerticalGroup(
            PharContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PharContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PharContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn)
                    .addComponent(removeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        pharMenu.add(Logout);

        setJMenuBar(pharMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PharContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PharContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medNavComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_medNavComponentShown

    }//GEN-LAST:event_medNavComponentShown

    private void medNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNavActionPerformed
        Object selected = medNav.getSelectedItem();
        Object[][] medCough = po.viewMedicineForCough();
        Object[][] medHeadache = po.viewMedicineForHeadache();
        Object[][] medBodyPain = po.viewMedicineForBodyPain();
        Object[][] medAllergies = po.viewMedicineForAllergies();
        if (selected.equals("Medicine For Headache")) {
            DefaultTableModel tableMedHeadache = new DefaultTableModel(medHeadache, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all ceisCellEditablells false
                    return false;
                }
            };
            pharTable.setModel(tableMedHeadache);
        } else if (selected.equals("Medicine For Cough")) {
            DefaultTableModel tableMedCough = new DefaultTableModel(medCough, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all ceisCellEditablells false
                    return false;
                }
            };
            pharTable.setModel(tableMedCough);
        } else if (selected.equals("Medicine For Allergies")) {
            DefaultTableModel tableMedAllergies = new DefaultTableModel(medAllergies, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all ceisCellEditablells false
                    return false;
                }
            };
            pharTable.setModel(tableMedAllergies);
        } else if (selected.equals("Medicine For Body pain")) {
            DefaultTableModel tableMedBodyPain = new DefaultTableModel(medBodyPain, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all ceisCellEditablells false
                    return false;
                }
            };
            pharTable.setModel(tableMedBodyPain);
        }
    }//GEN-LAST:event_medNavActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        
        String[] options = {"Medicine For Cough\n", "Medicine For Headache", "Medicine For Body Pain", "Medicine For Allrgies"};
        int x = JOptionPane.showOptionDialog(null, "SELECT A LIST OF MEDICINE",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        
        DefaultTableModel model = new DefaultTableModel();
        JTextField addBrandname = new JTextField();
        JTextField addGenericname = new JTextField();
        JTextField addPrice = new JTextField();
        JTextField addType = new JTextField();
        JTextField addQuantity = new JTextField();
        Object[] message = {
            "Brand name:", addBrandname,
            "Generic name:", addGenericname,
            "Price:", addPrice,
            "Type:", addType,
            "Quantity:", addQuantity
        };
        JOptionPane.showConfirmDialog(null, message, "Add Medicine", JOptionPane.OK_CANCEL_OPTION);

        String brandname = addBrandname.getText();
        String genericname = addGenericname.getText();
        String price = addPrice.getText();
        String type = addType.getText();
        String quantity = addQuantity.getText();

        po.addMedicineForCough(brandname, genericname, parseInt(price), type, parseInt(quantity));
        
        model.addColumn("Brand name");
        model.addColumn("Generic name");
        model.addColumn("Price");
        model.addColumn("Type");
        model.addColumn("Quantity");
        
        model.addRow(new Object[]{brandname, genericname, price, type, quantity});
        
        pharTable.setModel(model);

    }//GEN-LAST:event_addBtnMouseClicked

    private void removeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeBtnMouseClicked
        JTextField remBrandname = new JTextField();
        JTextField remGenericname = new JTextField();
        JTextField remQuantity = new JTextField();
        Object[] message = {
            "Brand name:", remBrandname,
            "Generic name:", remGenericname,
            "Quantity:", remQuantity
        };
        JOptionPane.showConfirmDialog(null, message, "Remove Medicine", JOptionPane.OK_CANCEL_OPTION);

        String brandname = remBrandname.getText();
        String genericname = remGenericname.getText();
        String quantity = remQuantity.getText();

        po.removeMedicineForCough(brandname, genericname, parseInt(quantity));
    }//GEN-LAST:event_removeBtnMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Login login = new Login();
        int input = JOptionPane.showConfirmDialog(null, "Do you want to logout?");
        // 0=yes, 1=no, 2=cancel
        if (input == 0) {
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_LogoutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new PharmacistDashboard().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Logout;
    private javax.swing.JPanel PharContainer;
    private javax.swing.JButton addBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> medNav;
    private javax.swing.JMenuBar pharMenu;
    private javax.swing.JTable pharTable;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}