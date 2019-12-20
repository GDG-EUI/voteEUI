package com.example.voteeui;

public class Faculty
{
    private byte id;
    private String Name;

    public Faculty(byte id, String name)
    {
        this.id = id;
        Name = name;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
