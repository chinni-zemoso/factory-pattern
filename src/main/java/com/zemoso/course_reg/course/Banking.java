package com.zemoso.course_reg.course;

public class Banking implements Courses {
    private final int courseFee;

    public Banking(int courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public int courseFee() {
        return courseFee;
    }
}