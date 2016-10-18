package com.domain;


import java.util.UUID;

public class Student {

    private UUID id;
    private String name;
    private int age;
    private String gender;
    private String address;


    public Student(StudentBuilder studentBuilder) {
        this.id = UUID.randomUUID();
        this.name    = studentBuilder.name;
        this.age     = studentBuilder.age;
        this.gender  = studentBuilder.gender;
        this.address = studentBuilder.address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Name: " + name + " age: " + age + " Gender: " + gender + " Address: " + address;
    }

    public UUID getId() {
        return id;
    }

    // Builder Pattern
    public static class StudentBuilder{
        private String name;
        private int age;
        private String gender;
        private String address;

        public StudentBuilder withName(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder withAge(int age){
            this.age = age;
            return this;
        }
        public StudentBuilder withGender(String gender){
            this.gender = gender;
            return this;
        }
        public StudentBuilder withAddress(String address){
            this.address = address;
            return this;
        }

        public Student toStudent(){
            return new Student(this);
        }

    }


}

