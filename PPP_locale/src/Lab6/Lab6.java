/* Список целых чисел Вставка, исключение из списка, доступ по номеру,
 * поиск значения в списке. Не использовать стандартные коллекции.
 * Реализовать итератор по элементам списка*/

package Lab6;

public class Lab6 {	
	public static void main(String[] args) {
		ListOfInt list = new ListOfInt();
		
		list.insert(4);
		list.insert(2);
		list.insert(5);
		list.insert(6);
		
		list.print();
		System.out.println();
		list.erase(3);
		list.print();
		System.out.println();
		System.out.println(list.find(7));
	}
}
