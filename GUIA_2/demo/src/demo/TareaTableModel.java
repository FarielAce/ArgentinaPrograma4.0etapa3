/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fernando
 */
class TareaTableModel extends AbstractTableModel {
        private String[] columnNames = {"Nombre", "Completada"};
        private List<Tarea> data = new ArrayList<>();

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Tarea tarea = data.get(row);
            if (col == 0) {
                return tarea.getNombre();
            } else if (col == 1) {
                return tarea.isCompletada();
            }
            return null;
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1) {
                return Boolean.class;
            }
            return super.getColumnClass(col);
        }

        @Override
        public boolean isCellEditable(int row, int col) {
            return col == 1;
        }

        @Override
        public void setValueAt(Object value, int row, int col) {
            if (col == 1) {
                Tarea tarea = data.get(row);
                tarea.setCompletada((boolean) value);
                fireTableCellUpdated(row, col);
            }
        }

        public void agregarTarea(Tarea tarea) {
            data.add(tarea);
            fireTableRowsInserted(data.size() - 1, data.size() - 1);
        }
    }