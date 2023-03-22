package com.hb01.annotation;

import javax.persistence.*;

@Entity// !!! @Entity ile bu sinifi DB'de bir tabloya karsilik gelmesini sagliyoruz, student01
@Table(name="t_student01")// !!! DB'de tablo ismim "t_student01" olarak degismesini sagladim
//java kodu icinde bu class'a ulasirken Student01 ile, SQL ile ulasirken t_student01 ile yazmam lazim

public class Student01 {

    @Id// !!! primary-key olusmasini sagliyoruz
    //@Column(name="std_id")
    private int id;

    @Column(name="student_name", length = 100,nullable = false,unique = false)
    private String name;

    //@Transient//!!! DB'deki tablo'da "grade" adinda bir kolon olusmasini engeller
    private int grade;

//    @Lob //!!! large object ile buyuk boyutlu datalar tutulabiliyor
//    private byte[] image;

    //!!! GETTER-SETTER


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //!!! TO STRING


    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
