package com.zemoso.course_reg.factory;

import com.zemoso.course_reg.constant.Constant;
import com.zemoso.course_reg.course.Banking;
import com.zemoso.course_reg.course.CivilServices;
import com.zemoso.course_reg.course.Computer;
import com.zemoso.course_reg.course.Courses;

public class CourseRegistration {
    public static Courses joinCourse(String type) {
        if (type.equals(Constant.COMPUTER)) {
            return new Computer(5000);
        } else if (type.equals(Constant.BANKING)) {
            return new Banking(10000);
        } else if (type.equals(Constant.CIVIL_SERVICES)) {
            return new CivilServices(15000);
        } else {
            throw new IllegalArgumentException("invalid choice");
        }
    }//method
}
