/*Задача 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам.*/

package HW_4;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static LinkedList<String> reverse(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<String>();
        for (String element : list) {
            reversedList.addFirst(element);
        }
        return reversedList;
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");
        list.add("пять");
        LinkedList<String> reversedList = reverse(list);
        System.out.println("Заданный список: " + list);
        System.out.println("Перевернутый список: " + reversedList);
    }
}