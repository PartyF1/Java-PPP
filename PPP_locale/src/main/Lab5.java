/*
Расстоянием между двумя словами одинаковой длины назовём количество о несовпадающих
у них символов на одинаковых позициях. Например, между словами "LIKE" и
"LOVE" расстояние равно 2.
В первой строке входного файла расположено контрольное слово, а во второй строке -
текст,содержащий слова (в словах используется только латиница). 
Найти в тексте слово, имеющее самое малое расстояние до контрольного слова и указать это расстояние. 
 */

package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab5 {
	public static void main(String[] args) {
		File file = new File("arg.txt");
		String control = readControl(file);
		String[] words = readWords(file);
		findLowest(control, words);
	}

	private static void findLowest(String control, String[] words) {
		List<String> list = new ArrayList<String>(Arrays.asList(words));
		list.remove(0);
		int tempRange = control.length();
		String resultWord = "";
		for (String word: list) {
			if (word.length() == control.length()) {
				if(word.equals(control)) {
					System.out.print("В тексте найдено идентичное слово - " + control);
					return;
				}
				else {
					int currentRange = 0;
					for (int i = 0; i < word.length(); i++) {
						if (word.charAt(i) != control.charAt(i)) {
							currentRange++;
						}
					}
					if (currentRange <= tempRange) {
						tempRange = currentRange;
						resultWord = word;
					}
				}
			}
		}
		if (resultWord != "") {
			System.out.println("С данным словом: " + control + " наименьшее расстояние имеет слово: " + resultWord);
			System.out.println("Расстояние = " + tempRange);
		} else {
			System.out.println("С данным словом: " + control + " не было найдено необходимых слов");
		}
	}

	private static String[] readWords(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String tempStr1 = "";
			String tempStr2;
			while ((tempStr2 = br.readLine()) != null) {
				tempStr1 += tempStr2 + " ";
			}
			tempStr1.toLowerCase();
			return tempStr1.toLowerCase().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	private static String readControl(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
			String controlWord = br.readLine();
            return controlWord.toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
	}
}
