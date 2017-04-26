
import common.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ltrinastic
 */
public class Practice {
    public static void main(String[] args) {
        //HashMap, HashTable, treemap, LinkedHashMap
        Employee e1 = new Employee(1, "doe", "John", "333-33-3333");
        Employee e2 = new Employee(2, "Barker", "John", "123-33-3333");
        Employee e3 = new Employee(3, "Tweetle", "John", "456-33-3333");
        
        //String is the value of the key("333-333-3333" etc) and employee is the value of the value (e1, e2, etc)
        Map <String, Employee> myMap = new HashMap<>();
        myMap.put("333-33-3333", e1);
        myMap.put("123-33-3333",e2);
        myMap.put("456-33-3333", e3);
        //Employee m = (Employee)myMap.get("333-33-3333");
        //System.out.println(m);
        
        Collection <Employee> empCol = myMap.values();
        for(Employee empObj : empCol){
            Employee e = empObj;
            System.out.println(e);
        }
        
        
        //its a set instead of a list because you cant have duplicates
        //retrieve set
        Set <String> keys = myMap.keySet();
        
        for(String key : keys){
            Employee e = (Employee) myMap.get(key);
            System.out.println(e);
        }
        

        
    }
    
}
