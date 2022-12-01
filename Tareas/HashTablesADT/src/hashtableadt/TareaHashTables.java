/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtableadt;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class TareaHashTables<T> {

    int position;
    ArrayList<T> table;
    int table_size;

    public TareaHashTables(int table_size) {
        table = new ArrayList(table_size);
    }

    
    public void add(int key, T value) {
        position = key % table_size;
        table.add(position, value);
    }

    
    public T valueOf(int key) {
        position = key % table_size;
        return table.get(position);
    }

    
    public void remove(int key) {
        position = key % table_size;
        table.remove(position);
        
        
    }
}
