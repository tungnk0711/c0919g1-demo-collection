package com.codegym;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Employee employee1 = new Employee(1, "Nam", "Quang Ninh");
        //System.out.println(employee1.getName());

        Employee employee2 = new Employee(2, "Hung", "Hai Phong");
        //System.out.println(employee2.getName());

        Employee employee3 = new Employee(3, "Khanh", "Nam Dinh");
        //System.out.println(employee3.getName());

        Employee employee4 = new Employee(4, "Cuong", "Nghe An");
        //System.out.println(employee4.getName());

        Employee employee5 = new Employee(5, "An", "Phu Yen");
        //System.out.println(employee5.getName());

        /*Set<Employee> set = new HashSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee1);


        for (Employee e:set) {
            System.out.println(e.getName());
        }*/



        //demo linked list
        /*LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.add(employee1);
        linkedList.add(employee2);
        linkedList.add(employee3);

        System.out.println("Before:");
        for (Employee e : linkedList) {
            System.out.println(e.getName());
        }

        int size = linkedList.size();

        linkedList.addLast(employee5);

        //System.out.println(size);

        //linkedList.remove(1);

        System.out.println("After:");
        for (Employee e : linkedList) {
            System.out.println(e.getName());
        }*/


        //demo arraylist
        ArrayList<Employee> listEmployee = new ArrayList();
        listEmployee.add(employee1);
        listEmployee.add(employee2);
        listEmployee.add(employee3);
        listEmployee.add(employee4);
        listEmployee.add(employee5);
        listEmployee.add(employee1);

        System.out.println("Before:");
        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println(listEmployee.get(i).getName());
        }

        listEmployee.remove(3);

        System.out.println("After:");
        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println(listEmployee.get(i).getName());
        }


    }
}
