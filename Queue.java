/* Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
   enqueue() - помещает элемент в конец очереди, 
   dequeue() - возвращает первый элемент из очереди и удаляет его, 
   first() - возвращает первый элемент из очереди, не удаляя. */

package HW_4;

    // импортируем класс LinkedList из стандартной библиотеки Java
 import java.util.LinkedList;

public class Queue {
    // Создаем список LinkedList для хранения элементов очереди
    private LinkedList<Object> list = new LinkedList<Object>();
    
    // Метод для добавления нового элемента в конец очереди
    public void enqueue(Object item) {
        list.addLast(item);
    }
    
    // Метод для извлечения и удаления первого элемента из очереди
    public Object dequeue() {
        return list.removeFirst();
    }
    
    // Метод для получения первого элемента в очереди, не удаляя его
    public Object first() {
        return list.getFirst();
    }
    
    // Пример использования очереди
    public static void main(String[] args) {
        // Создаем новый экземпляр очереди
        Queue queue = new Queue();
        
        // Добавляем несколько элементов в очередь
        queue.enqueue("Один");
        queue.enqueue("Два");
        queue.enqueue("Три");
     
        // Выводим первый элемент в очереди на экран
        System.out.println("Первый элемент в очереди: " + queue.first());

        // Извлекаем и удаляем первый элемент из очереди
        Object item = queue.dequeue();
        System.out.println("Удаленный элемент: " + item);
        
        // Извлекаем и удаляем еще один элемент из очереди
        item = queue.dequeue();
        System.out.println("Ещё удаленный элемент: " + item);
        
        // Выводим первый элемент в очереди на экран после удаления двух элементов
        System.out.println("Первый элемент в очереди: " + queue.first());
    }
}
