/*Сочетания. Дано натуральное число n. Построить и вывести множество всех сочетаний
натуральных чисел из n первых натуральных чисел по k чисел в каждом сочетании, для
всех k от 0 до n. Например, для n = 3 искомое множество будет таким: {{}, {1}, {2}, {3},
{1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}. А сколько всего таких сочетаний?*/


package main;
import java.util.*;

public class Lab8 {
	public static Set<Set<Integer>> generate(int n) {
        Set<Set<Integer>> result = new HashSet<>();
        for (int k = 0; k <= n; k++) {
            Set<Set<Integer>> combinations = generateCombinations(n, k);
            result.addAll(combinations);
        }
        return result;
    }

    private static Set<Set<Integer>> generateCombinations(int n, int k) {
        Set<Set<Integer>> result = new HashSet<>();
        if (k == 0) {
            result.add(new HashSet<>());
            return result;
        }
        if (n == k) {
            Set<Integer> combination = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                combination.add(i);
            }
            result.add(combination);
            return result;
        }
        Set<Set<Integer>> combinationsWithoutN = generateCombinations(n - 1, k);
        result.addAll(combinationsWithoutN);
        Set<Set<Integer>> combinationsWithN = generateCombinations(n - 1, k - 1);
        for (Set<Integer> combination : combinationsWithN) {
            combination.add(n);
        }
        result.addAll(combinationsWithN);

        return result;
    }

    public static void main(String[] args) {
        Set<Set<Integer>> combinations = generate(2);
        System.out.println(combinations);
    }
}
