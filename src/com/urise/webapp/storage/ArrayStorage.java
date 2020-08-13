package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;
import com.urise.webapp.storage.Storage;

import java.util.Arrays;

public class ArrayStorage extends AbstractArrayStorage {

    // Добавление элемента в массив
    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if (index == -1) {
            System.out.println("com.urise.webapp.model.Resume allready exist");
        } else if (storage.length == size) {
            System.out.println("com.urise.webapp.storage.Storage is overflow");
        } else {
            storage[size] = r;
            size++;
        }
    }

    // Удаление массива из памяти
    public void clear() {
        Arrays.fill(storage, 0, size, null);
    }

    // Запись всех резюме в отдельный массив
    public Resume[] getAll() {
        Arrays.copyOfRange(storage, 0, size);
        return storage;
    }


    // Удаление элемента из массива
    public void delete(String uuid) {
        int index = getIndex(uuid);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                storage[i] = storage[i + 1];
            }
            size--;
            return;
        }
        System.out.println("Элемента с id " + uuid + "- нет в массиве");
    }

    // Проверка на надичие резюме в массиве
    public void update(Resume r) {
        int index = getIndex(r.getUuid());
        if (index == -1) {
            System.out.println("com.urise.webapp.model.Resume doesn`t exist");
        } else {
            storage[index] = r;
        }
    }

    // Возврат индекса элемента с нужным uuid
    protected int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid()))
                return i;
        }
        return -1;
    }


}
