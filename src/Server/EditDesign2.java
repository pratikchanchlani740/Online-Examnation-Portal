/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Pratik
 */
public class EditDesign2 extends DefaultTableCellRenderer{
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,boolean hasFocus, int row, int column){
      Component cell;    
        cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    
            ((JLabel) cell).setHorizontalAlignment(SwingConstants.CENTER);
            cell.setFont(new Font("Serif", Font.BOLD, 18));
                cell.setForeground(Color.BLACK);
             ((JLabel) cell).setText(value.toString()); 
       
    
     return this;
    
    } 
}
