package com.example.voteeui;

public class Nominee
{
    private byte id;
    private String imageDirectory;

    private Position position;
    private Student student;
    private byte positionId;
    private int studentId;

    public Nominee(byte id, String imageDirectory, byte positionId, int studentId)
    {
        this.id = id;
        this.imageDirectory = imageDirectory;
        this.positionId = positionId;
        this.studentId = studentId;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getImageDirectory() {
        return imageDirectory;
    }

    public void setImageDirectory(String imageDirectory) {
        this.imageDirectory = imageDirectory;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public byte getPositionId() {
        return positionId;
    }

    public void setPositionId(byte positionId) {
        this.positionId = positionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
