/*
  	Протокол соревнований по марафонскому бегу содержит номера финишировавших
  	участников (целые положительные числа, все различные) и их результаты – время в
  	минутах (вещественные числа). Данные хранятся в двух массивах одинакового 
	размера: в массиве numbers номера, а в массиве results - соответствующие результаты.
	Вывести итоговый протокол соревнований в виде списка номеров и результатов участников, 
	упорядоченный по возрастанию результатов
 */

package main;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Lab3 {
	//Номера бегунов
	static int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
	//Соответствующие результаты
	static double[] results = new double[] {40, 39, 39.5, 45, 19.48, 60};
	public static void main(String[] args) {
		List<Runner> runners = runners(numbers, results);
		Collections.sort(runners, new RunnerComparator());
		print(runners);
	}
	
	//Вывод списка бегунов в консоль
	public static void print(List<Runner> runners) {
		runners.forEach((Runner runner) -> {
			System.out.println(runner.num + " - " + runner.time);
		});
	}
	
	//Создание списка бегунов из массивов numbers и results
	static final List<Runner> runners(int[] numbers, double[] results) {
		List<Runner> tempResults = new ArrayList<Runner>();
		for (int i = 0; i < numbers.length; i++) {
			tempResults.add(new Runner(numbers[i], results[i]));
		}
		return tempResults;
	}
}
