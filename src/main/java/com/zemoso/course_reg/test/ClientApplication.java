package com.zemoso.course_reg.test;

import com.zemoso.course_reg.constant.Constant;
import com.zemoso.course_reg.course.Courses;
import com.zemoso.course_reg.factory.CourseRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientApplication {
    private static final Logger logger = LoggerFactory.getLogger(ClientApplication.class);

    public static void main(String[] args) {
        Courses course;
        //CUSTOMER TRYING TO ORDER LUXURY CAR
        course = CourseRegistration.joinCourse(Constant.COMPUTER);
        logger.info("Computer Course Fee = " + course.courseFee());

        course = CourseRegistration.joinCourse(Constant.BANKING);
        logger.info("Banking Course Fee = " + course.courseFee());

        course = CourseRegistration.joinCourse(Constant.CIVIL_SERVICES);
        logger.info("Civil Services Course Fee = " + course.courseFee());

    }
}
