package com.example.voteeui;

public class Rate
{
    //Declaring Fields
    private int id ;
    private int star;
    private String comment;

    private Student student;
    private Place place;

    public Rate(int id, int star, String comment)
    {
        this.id = id;
        this.star = star;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id=" + id +
                ", star=" + star +
                ", comment='" + comment + '\'' +
                '}';
    }
}
