public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size;   //Количестов резюме в массиве

    public int getSize() {
        return size;
    }

    // Добавление элемента в массив
    public void save(Resume r) {
        if (size < storage.length) {
            storage[size] = r;
            size++;
        } else {
            System.out.println("Массив заполнен полностью");
        }


    }

    // Удаление массива из памяти
    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    // Запись всех резюме в отдельный массив
    public Resume[] getAll() {
        Resume[] allResume = new Resume[size];
        for (int i = 0; i < size; i++) {
            allResume[i] = storage[i];
        }
        return allResume;
    }

    // Возвращает резюме по id
    public Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    // Удаление элемента из массива
    public void delete(String uuid) {
        for (int i = 0; i < size; i++) { // Ищем элемент с нужным id
            if (storage[i].getUuid().equals(uuid)) {
                for (int j = i; j < size - 1; j++) { // Сдвигаем массив влево на 1 элемент ,
                    storage[j] = storage[j + 1];
                }
                size--;
                System.out.println("Элемента с id " + uuid + " удалён");
                return;
            }
        }
        System.out.println("Элемента с id " + uuid + "- нет в массиве");
    }

    // Индексатор для вывода storage
    public Resume getStorageElement(int index) {
        if (storage[index] != null) {
            return storage[index];
        }
        return null;
    }
}
