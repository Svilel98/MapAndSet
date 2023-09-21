import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of());
        System.out.println(getOddNumbers(nums));
    }

    public static List<Integer> getOddNumbers(List<Integer> listNumbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i) % 2 != 0) {
                oddNumbers.add(listNumbers.get(i));
            }
        }
        return oddNumbers;
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 6, 18, 0, 12, 24));
        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1 : o1.equals(o2) ? 0 : -1;
            }
        });
        System.out.println(getEvenNumbers(nums));
    }

    public static List<Integer> getEvenNumbers(List<Integer> listNumbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i) % 2 == 0) {
                oddNumbers.add(listNumbers.get(i));
            }
        }
        return oddNumbers;
    }

    public static void task3() {
        System.out.println("Задача 3");
        Set<String> text = new HashSet<>(List.of("Solo", "Two", "Solo", "Three"));
        System.out.println(text);
    }

    public static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> stringCounterMap = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (stringCounterMap.containsKey(s)) {
                Integer value = stringCounterMap.get(s);
                value++;
                stringCounterMap.put(s, value);
            } else {
                stringCounterMap.put(s, 1);
            }
        }
        Set<String> stringsSet = new HashSet<>(strings);
        for (String string : stringsSet) {
            if (stringCounterMap.containsKey(string)) {
                System.out.println(stringCounterMap.get(string));
            }
        }
    } public static void task5() {
        System.out.println("Задача 5");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> stringCounterMap = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (stringCounterMap.containsKey(s)) {
                Integer value = stringCounterMap.get(s);
                value++;
                stringCounterMap.put(s, value);
            } else {
                stringCounterMap.put(s, 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = stringCounterMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
