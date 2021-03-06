package com.example.awesomecurriculum.data.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Course implements Serializable {

    private String color;
    private String courseName;
    private String teacher;
    private String classRoom;
    private String courseNo;
    private int week;
    private int classStart;
    private int classEnd;
    private int id;

    public Course(String courseName, String teacher, String classRoom, int week, int classStart, int classEnd, String color, int id, String courseNo) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.classRoom = classRoom;
        this.week = week;
        this.classStart = classStart;
        this.classEnd = classEnd;
        this.color = color;
        this.id = id;
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getStart() {
        return classStart;
    }

    public void setStart(int classStart) {
        this.classEnd = classStart;
    }

    public int getEnd() {
        return classEnd;
    }

    public void setEnd(int classEnd) {
        this.classEnd = classEnd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setCourseNo(String value){
        this.courseNo = value;
    }

    public String getCourseNo(){
        return this.courseNo;
    }

    @NonNull
    @Override
    public String toString() {
        return this.getId() + "-"
                + this.getCourseNo() + "-"
                + this.getCourseName() + "-"
                + this.getClassRoom() + "-"
                + this.getTeacher() + "-"
                + this.getColor() + "-"
                + this.getWeek() + "-"
                + this.getStart() + "-"
                + this.getEnd();
    }
}
