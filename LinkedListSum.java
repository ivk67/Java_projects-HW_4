/* Задача 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор. */

package HW_4;
// импортируем классы LinkedList и Iterator из стандартной библиотеки Java
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSum {
   
    public static void main(String[] args) {
        // создаем LinkedList с типом Integer
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // добавляем элементы в LinkedList
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // вычисляем сумму всех элементов LinkedList
        int sum = 0;
        Iterator<Integer> iterator = linkedList.iterator();

        //  с помощью цикла while мы обходим LinkedList, пока он не закончится, и считаем сумму всех его элементов
        while (iterator.hasNext()) {
            int element = iterator.next();
            sum += element;
        }

        // выводим сумму элементов исходного LinkedList
        System.out.println("Сумма всех элементов LinkedList: " + sum);
    }
}
