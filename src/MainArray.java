import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class MainArray {

    static public int NaturalNumberRange(int down, int up) {

        int num = 0;
        boolean ok = true;
        do {
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                num = in.nextInt();
                ok = true;
            }
            if (num < down || num > up) {
                ok = false;
            }

        } while (ok == false);
        return num;
    }

    static public int NaturalNum() {

        int num = 0;
        boolean ok = true;
        do {
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                num = in.nextInt();
                ok = true;
            }

        } while (ok == false);
        return num;
    }

    static public void ShowStorage(ArrayStorage storage) {
        for (int i = 0; i < storage.size; i++) {
            System.out.println(storage.getStorageElement(i).toString());
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayStorage ResumeArr = null;
        int choice = 0; // Переменная для выбора меню
        Scanner in = new Scanner(System.in); // для ввода данных с клавиатуры
        do {
            System.out.println("1. Создать массив резюме с произвольной длинной\n2. Добавить элемент\n3. Удалить элемент\n4. Удалить массив\n5. Вывести массив\n6. Получение элемента из массива\n7. Выход");
            choice = NaturalNumberRange(1, 7);
            switch (choice) {
                case (1): // Создание
                    ResumeArr = new ArrayStorage();
                    MainTestArrayStorage.CreateStorage(5, ResumeArr);
                    ShowStorage(ResumeArr);

                    break;

                case (2): // Добавление
                    if (ResumeArr.size != 0 && ResumeArr != null) {
                        Resume r = new Resume();
                        ResumeArr.save(r);
                        ShowStorage(ResumeArr);
                    } else {
                        System.out.println("Массив не создан");
                    }
                    break;

                case (3):// Удаление элемента
                    if (ResumeArr.size != 0 && ResumeArr != null) {
                        System.out.println("Введите id элемента");
                        ResumeArr.delete(in.nextLine());
                    } else {
                        System.out.println("Массив удалён");
                    }

                    break;

                case (4): // Удаление массива из памяти
                    if (ResumeArr.size != 0 && ResumeArr != null) {
                        System.out.println("Массив не создан");
                    } else {
                        ResumeArr.clear();
                        System.out.println("Массив удалён");
                    }

                    break;
                case (5): // Вывод всех элементов
                    if (ResumeArr.size != 0 && ResumeArr != null) {
                        ShowStorage(ResumeArr);
                    } else {
                        System.out.println("Массив не создан");
                    }

                    break;

                case (6): {
                    choice = 0;
                    do {
                        System.out.println("1. Вывести элемент по id\n2. Получить все резюме");
                        choice = NaturalNumberRange(1, 3);
                        switch (choice) {
                            case (1): {
                                if (ResumeArr.size != 0 && ResumeArr != null) {
                                    System.out.println("Введите id элемента");
                                    String id = in.nextLine();
                                    System.out.println(ResumeArr.get(id).toString());
                                }
                            }
                            break;
                            case (2): {
                                if (ResumeArr.size != 0 && ResumeArr != null) {
                                    Resume[] sw = ResumeArr.getAll();
                                    System.out.println("Все резюме клонированы в новый массив");
                                } else {
                                    System.out.println("Массив не создан");
                                }
                            }
                            break;
                        }
                    } while (choice != 3);
                }
                break;
            }
        } while (choice != 7);
    }
}

