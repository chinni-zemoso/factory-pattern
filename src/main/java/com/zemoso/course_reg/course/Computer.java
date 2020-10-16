package com.zemoso.course_reg.course;

public class Computer implements Courses {
    private final int courseFee;

    public Computer(int courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public int courseFee() {
        return courseFee;
    }
}
