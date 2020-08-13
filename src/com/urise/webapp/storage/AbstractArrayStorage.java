package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

public abstract class AbstractArrayStorage implements Storage {

    protected Resume[] storage = new Resume[10000];
    protected int size;   //Количестов резюме в массиве

    public int size() {
        return size;
    }

    // Возвращает резюме по id
    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if (index != -1) {
            return storage[index];
        }
        return null;
    }

    protected abstract int getIndex(String uuid);


}
