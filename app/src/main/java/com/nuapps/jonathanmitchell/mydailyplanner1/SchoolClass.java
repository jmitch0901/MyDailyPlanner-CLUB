package com.nuapps.jonathanmitchell.mydailyplanner1;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jonathanmitchell on 10/12/15.
 */
public class SchoolClass {
    private String className;
    private String teacherName;
    private Date dateAdded;

    public SchoolClass(String className, String teacherName){
        this.className=className;
        this.teacherName=teacherName;
        dateAdded= Calendar.getInstance().getTime();
    }

    public String getClassName() {
        return className;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public String getTeacherName() {
        return teacherName;
    }

    @Override
    public String toString() {
        return "Class Name: "+className+", Teacher Name: "+teacherName;
    }
}
