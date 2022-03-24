package com.credential.main;
import com.credential.model.*;

public class DriverClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AdminDepartment ad=new AdminDepartment();
        System.out.println("Welcome to  "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        System.out.println();
        
        HrDepartment hr1=new HrDepartment();
        System.out.println("Welcome to  "+hr1.departmentName());
        System.out.println(hr1.getTodaysWork());
        System.out.println(hr1.getWorkDeadline());
        System.out.println(hr1.isTodayAHoliday());
        System.out.println();
        
        TechDepartment t1=new TechDepartment();
        System.out.println("Welcome to  "+t1.departmentName());
        System.out.println(t1.getTodaysWork());
        System.out.println(t1.getWorkDeadline());
        System.out.println(t1.getTechStackInformation());
        System.out.println(t1.isTodayAHoliday());
	}
}
