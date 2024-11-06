package actividad;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana {

    private JTextField textFieldTarea;
    private JTextField textFieldFecha;
    private JButton btnEliminar;
    private JButton btnAgregar;
    private JTextField textFieldMateria;
    private JLabel txtMateteria;
    private JLabel txtTarea;
    private JLabel txtFecha;
    private JComboBox comboEstado ;
    private JPanel ventanaprincipal;

    private JTable table;



    public JPanel getVentanaprincipal() {
        return ventanaprincipal;
    }

    public Ventana(){

        String[] columnas = {"Materia", "Descripción", "Fecha", "Estado"};

        DefaultTableModel tableModel = new DefaultTableModel(columnas, 0);
        table.setModel(tableModel);
        table.setFillsViewportHeight(true);
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tarea = textFieldTarea.getText();
                String materia = textFieldMateria.getText();
                String fecha= textFieldFecha.getText();
                String estado= comboEstado.getSelectedItem().toString();


                if (!materia.isEmpty() && !tarea.isEmpty() && !fecha.isEmpty()) {
                    tableModel.addRow(new Object[]{materia, tarea, fecha, estado});
                    textFieldTarea.setText("");
                    textFieldMateria.setText("");
                    textFieldFecha.setText("");
                    comboEstado.setSelectedIndex(0);

                }else {
                   JOptionPane.showMessageDialog(null,"rellene los campos para agregar la tarea");
                }









            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.removeRow(table.getSelectedRow());
            }
        });
    }




}
