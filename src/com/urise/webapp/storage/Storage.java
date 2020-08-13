package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

public interface Storage {
    public int size();

    // Добавление элемента в массив
    public void save(Resume r);

    // Удаление массива из памяти
    public void clear();

    // Запись всех резюме в отдельный массив
    public Resume[] getAll();

    // Возвращает резюме по id
    public Resume get(String uuid);

    // Удаление элемента из массива
    public void delete(String uuid);

    // Проверка на надичие резюме в массиве
    void update(Resume r);


}
