package com.urise.webapp.model;

public class Resume implements Comparable<Resume> {
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass() || obj == null) {
            return false;
        }
        Resume r = (Resume) obj;
        return r.uuid.equals(this.uuid);


    }

    @Override
    public int compareTo(Resume o) {
       return uuid.compareTo(o.getUuid());
    }
}
