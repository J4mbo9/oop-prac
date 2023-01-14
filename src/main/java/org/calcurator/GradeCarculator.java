package org.calcurator;

import java.util.List;

public class GradeCarculator {

    private final Courses courses;
    public GradeCarculator(List<Course> courses){
        this.courses = new Courses(courses);
    }
    public double calculateGrade(){

     //학점수 * 교과목 평점 의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        //수강신청 총학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade/totalCompletedCredit;
    }
}
