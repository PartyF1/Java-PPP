/*Примитивы выражений. Алгебраические выражения могут содержать в себе примитивы, то есть простейшие элементы, имеющие целочисленное значение. Каждый
примитив имеет строковое представление (последовательность символов) и их можно
суммировать. Примитивы бывают двух видов: переменные-идентификаторы (состоит
из последовательности латинских букв, имеет текущее значение) и целые литералы
(последовательность десятичных цифр, константное значение). Значение переменной
можно изменять. Найти сумму примитивов, которыми заполнен массив.*/

package Lab7;
import java.util.HashSet;

public class Lab7 {
	public static void main(String[] args) {
		HashSet<Primitive> a = new HashSet<>();
		a.add(new Primitive(5));
		a.add(new Literal(2));
		a.add(new Variable(4, "swag"));
		a.add(new Primitive(8));
		a.add(new Primitive(3));
		
		System.out.println(a);
		Primitive result = new Primitive(0);
		for (Primitive element : a) {
			result.setValue(result.add(element));
		}
		System.out.print(result);
	}
}
