import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Введите 5 строк для списка А:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список А:");
        for (String out : listA) {
            System.out.println(out);
        }

        System.out.println("Введите 5 строк для списка Б:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
        }

        System.out.println("Список Б:");
        for (String out : listB) {
            System.out.println(out);
        }

        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Список С:");
        for (String out : listC) {
            System.out.println(out);
        }

        listC.sort(Comparator.comparingInt(String::length));

        System.out.println("Показать список С:");
        for (String out : listC) {
            System.out.println(out);
        }
    }
}