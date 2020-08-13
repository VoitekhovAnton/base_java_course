package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.sql.Array;
import java.util.Arrays;

public class SortedArrayStorage extends AbstractArrayStorage {
    @Override
    public void save(Resume r) {

    }

    @Override
    public void  clear() {

    }

    @Override
    public Resume[] getAll() {
        return new Resume[0];
    }


    @Override
    protected int getIndex(String uuid) {
        Arrays.sort(storage);
        Resume searchKey = new Resume();
        searchKey.setUuid(uuid);
        return Arrays.binarySearch(storage, 0, size, searchKey);
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public void update(Resume r) {

    }
}
