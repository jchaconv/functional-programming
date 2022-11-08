package com.functional.programming.section03streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Lec11Comparator {

    public static void main(String[] args) {

        Student a = new Student("Adam", 80, 150);
        Student b = new Student("Bob", 55, 144);
        Student c = new Student("Alex", 130, 167);

        //Al parecer en vscode no salen las sugerencias para hacer el s.getScore()
        Optional<Student> op = Stream.of(a, b, c).min(Comparator.comparing(s -> s.getScore()));
        System.out.println(op.get()); //Student [name=Bob, score=55, height=144]

    }

}

class Student {

    private String name;
    private int score;
    private int height;

    public Student(String name, int score, int height) {
        this.name = name;
        this.score = score;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + ", height=" + height + "]";
    }

}
