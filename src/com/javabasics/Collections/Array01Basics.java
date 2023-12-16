package com.javabasics.Collections;

import org.w3c.dom.ls.LSOutput;

class DateOfBirth{
    int day;
    int year;
    int month;

    public DateOfBirth(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    @Override
    public String toString() {
        return "DateOfBirth{" +
                "day=" + day +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}

class Address{
    int pin;
    String state;
    String city;
    String locality;

    public Address(int pin, String state, String city, String locality) {
        this.pin = pin;
        this.state = state;
        this.city = city;
        this.locality = locality;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pin=" + pin +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", locality='" + locality + '\'' +
                '}';
    }
}


class Student {
    int id;
    String name;
    String collegeName;
    String department;
    float percentage;

    Address address;

    DateOfBirth dob;


    public Student(int id, String name, String collegeName, String department, float percentage, Address add, DateOfBirth dob) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
        this.department = department;
        this.percentage = percentage;
        this.address = add;
        this.dob = dob;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", department='" + department + '\'' +
                ", percentage=" + percentage +
                ", address=" + address +
                ", dob=" + dob +
                '}';
    }
}

public class Array01Basics {





    public static void main(String[] args) {

        Address aod = new Address(80006,"Bihar","Patna","Pathar Ki Masjid");
        DateOfBirth dob = new DateOfBirth(5,1998,8);

        Student viraj = new Student(123,"Viraj","GL Bajaj","MCA",82.67f,aod,dob);

        System.out.println(viraj.toString());

        }
    }

