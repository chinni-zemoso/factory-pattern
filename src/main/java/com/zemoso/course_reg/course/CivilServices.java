package com.zemoso.course_reg.course;

public class CivilServices implements Courses {
    private final int courseFee;

    public CivilServices(int courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public int courseFee() {
        return courseFee;
    }
}
