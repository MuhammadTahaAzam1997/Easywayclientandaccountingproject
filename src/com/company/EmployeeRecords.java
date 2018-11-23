package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class EmployeeRecords {
    Scanner obj = new Scanner(System.in);

    Date obj1 = new Date();
    int empArray[] = new int[16];


    String month;
    int noofemp;
    int sal;
    String name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15;
    int n;
    double rent;
    double electricitybill;
    double internetpayment;
    double stationarypayment;
    double otherexpenses;
    int noofclient;

    public void EmployeeAttributes(int noofemp, int sal, int n, double rent,
                                   double electricitybill, double internetpayement, double stationarypayement, double otherexpenses, String month) {
        this.noofemp = noofemp;
        this.sal = sal;
        this.month = month;
//    this.name=name;
        this.n = n;
        this.electricitybill = electricitybill;
        // this.gasbill=
        this.internetpayment = internetpayement;
        this.stationarypayment = stationarypayement;
        this.otherexpenses = otherexpenses;
    }

    int i;
    double total;


    public void employee() {
        System.out.println("Enter Number of Employee");
        noofemp = obj.nextInt();

        System.out.println("Enter their names");
        if (noofemp == 1) {

            System.out.print("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();
            System.out.println("Enter the total Salary of " + name1);
            sal = obj.nextInt();

            total = sal;
        } else if (noofemp == 2) {

            System.out.print("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();

            total = empArray[0] + empArray[1];

        } else if (noofemp == 3) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            total = empArray[0] + empArray[1] + empArray[2];


        } else if (noofemp == 4) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            total = empArray[0] + empArray[1] + empArray[2] + empArray[3];


        } else if (noofemp == 5) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();


            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4];

        } else if (noofemp == 6) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5];

        } else if (noofemp == 7) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6];

        } else if (noofemp == 8) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (8) + " : ");
            name8 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();

            System.out.println("Enter the total salary of " + name8);
            empArray[7] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6] + empArray[7];

        } else if (noofemp == 9) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (8) + " : ");
            name8 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (9) + " : ");
            name8 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();

            System.out.println("Enter the total salary of " + name8);
            empArray[7] = obj.nextInt();

            System.out.println("Enter the total salary of " + name9);
            empArray[8] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6] + empArray[7] + empArray[8];

        } else if (noofemp == 10) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();

            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (8) + " : ");
            name8 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (9) + " : ");
            name9 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (10) + " : ");
            name10 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();

            System.out.println("Enter the total salary of " + name8);
            empArray[7] = obj.nextInt();

            System.out.println("Enter the total salary of " + name9);
            empArray[8] = obj.nextInt();

            System.out.println("Enter the total salary of " + name10);
            empArray[9] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6] + empArray[7] + empArray[8] + empArray[9];

        } else if (noofemp == 11) {
            System.out.println("NAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (8) + " : ");
            name8 = obj.nextLine();
            System.out.print("NAME of Employee#0" + (9) + " : ");
            name9 = obj.nextLine();
            System.out.print("NAME of Employee#" + (10) + " : ");
            name10 = obj.nextLine();
            System.out.print("NAME of Employee#" + (11) + " : ");
            name11 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();

            System.out.println("Enter the total salary of " + name8);
            empArray[7] = obj.nextInt();

            System.out.println("Enter the total salary of " + name9);
            empArray[8] = obj.nextInt();

            System.out.println("Enter the total salary of " + name10);
            empArray[9] = obj.nextInt();


            System.out.println("Enter the total salary of " + name11);
            empArray[10] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6] + empArray[7] + empArray[8] + empArray[9] + empArray[10];

        } else if (noofemp == 12) {
            System.out.print("\nNAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (8) + " : ");
            name8 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (9) + " : ");
            name9 = obj.nextLine();
            System.out.print("\nNAME of Employee#" + (10) + " : ");
            name10 = obj.nextLine();
            System.out.print("\nNAME of Employee#" + (11) + " : ");
            name11 = obj.nextLine();
            System.out.print("\nNAME of Employee#" + (12) + " : ");
            name12 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();

            System.out.println("Enter the total salary of " + name8);
            empArray[7] = obj.nextInt();

            System.out.println("Enter the total salary of " + name9);
            empArray[8] = obj.nextInt();

            System.out.println("Enter the total salary of " + name10);
            empArray[9] = obj.nextInt();


            System.out.println("Enter the total salary of " + name11);
            empArray[10] = obj.nextInt();

            System.out.println("Enter the total salary of " + name12);
            empArray[11] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6] + empArray[7] + empArray[8] + empArray[9] + empArray[10] + empArray[11];

        } else if (noofemp == 13) {
            System.out.print("\nNAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (8) + " : ");
            name8 = obj.nextLine();
            System.out.print("\nNAME of Employee#0" + (9) + " : ");
            name9 = obj.nextLine();
            System.out.print("\nNAME of Employee#" + (10) + " : ");
            name10 = obj.nextLine();
            System.out.print("\nNAME of Employee#" + (11) + " : ");
            name11 = obj.nextLine();
            System.out.print("\nNAME of Employee#" + (12) + " : ");
            name12 = obj.nextLine();
            System.out.print("\nNAME of Employee#" + (13) + " : ");
            name13 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();

            System.out.println("Enter the total salary of " + name8);
            empArray[7] = obj.nextInt();

            System.out.println("Enter the total salary of " + name9);
            empArray[8] = obj.nextInt();

            System.out.println("Enter the total salary of " + name10);
            empArray[9] = obj.nextInt();


            System.out.println("Enter the total salary of " + name11);
            empArray[10] = obj.nextInt();

            System.out.println("Enter the total salary of " + name12);
            empArray[11] = obj.nextInt();
            System.out.println("Enter the total salary of " + name13);
            empArray[12] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6] + empArray[7] + empArray[8] + empArray[9] + empArray[10] + empArray[11] + empArray[12];

        } else if (noofemp == 14) {
            System.out.println("\nNAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (8) + " : ");
            name8 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (9) + " : ");
            name9 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (10) + " : ");
            name10 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (11) + " : ");
            name11 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (12) + " : ");
            name12 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (13) + " : ");
            name13 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (14) + " : ");
            name14 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();

            System.out.println("Enter the total salary of " + name8);
            empArray[7] = obj.nextInt();

            System.out.println("Enter the total salary of " + name9);
            empArray[8] = obj.nextInt();

            System.out.println("Enter the total salary of " + name10);
            empArray[9] = obj.nextInt();


            System.out.println("Enter the total salary of " + name11);
            empArray[10] = obj.nextInt();

            System.out.println("Enter the total salary of " + name12);
            empArray[11] = obj.nextInt();
            System.out.println("Enter the total salary of " + name13);
            empArray[12] = obj.nextInt();

            System.out.println("Enter the total salary of " + name14);
            empArray[13] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6] + empArray[7] + empArray[8] + empArray[9] + empArray[10] + empArray[11] + empArray[12] + empArray[13];

        } else if (noofemp == 15) {
            System.out.println("\nNAME of Employee#0" + (1) + " : ");
            name1 = obj.nextLine();
            name1 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (2) + " : ");
            name2 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (3) + " : ");
            name3 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (4) + " : ");
            name4 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (5) + " : ");
            name5 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (6) + " : ");
            name6 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (7) + " : ");
            name7 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (8) + " : ");
            name8 = obj.nextLine();
            System.out.println("\nNAME of Employee#0" + (9) + " : ");
            name9 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (10) + " : ");
            name10 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (11) + " : ");
            name11 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (12) + " : ");
            name12 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (13) + " : ");
            name13 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (14) + " : ");
            name14 = obj.nextLine();
            System.out.println("\nNAME of Employee#" + (15) + " : ");
            name15 = obj.nextLine();

            System.out.println("Enter the total salary of " + name1);
            empArray[0] = obj.nextInt();

            System.out.println("Enter the total salary of " + name2);
            empArray[1] = obj.nextInt();


            System.out.println("Enter the total salary of " + name3);
            empArray[2] = obj.nextInt();

            System.out.println("Enter the total salary of " + name4);
            empArray[3] = obj.nextInt();

            System.out.println("Enter the total salary of " + name5);
            empArray[4] = obj.nextInt();

            System.out.println("Enter the total salary of " + name6);
            empArray[5] = obj.nextInt();

            System.out.println("Enter the total salary of " + name7);
            empArray[6] = obj.nextInt();

            System.out.println("Enter the total salary of " + name8);
            empArray[7] = obj.nextInt();

            System.out.println("Enter the total salary of " + name9);
            empArray[8] = obj.nextInt();

            System.out.println("Enter the total salary of " + name10);
            empArray[9] = obj.nextInt();


            System.out.println("Enter the total salary of " + name11);
            empArray[10] = obj.nextInt();

            System.out.println("Enter the total salary of " + name12);
            empArray[11] = obj.nextInt();
            System.out.println("Enter the total salary of " + name13);
            empArray[12] = obj.nextInt();

            System.out.println("Enter the total salary of " + name14);
            empArray[13] = obj.nextInt();

            System.out.println("Enter the total salary of " + name15);
            empArray[14] = obj.nextInt();


            total = empArray[0] + empArray[1] + empArray[2] + empArray[3] + empArray[4] + empArray[5] + empArray[6] + empArray[7] + empArray[8] + empArray[9] + empArray[10] + empArray[11] + empArray[12] + empArray[13] + empArray[14];

        }
    }

    public void otherexpense() {
        System.out.println("Enter the name of Month: ");
        month = obj.nextLine();
        month = obj.nextLine();
        System.out.print("\nEnter Amount of Rent: ");
        rent = obj.nextDouble();
        System.out.print("\nEnter Electricity Bill: ");
        electricitybill = obj.nextDouble();

        System.out.print("\nEnter Internet Payment: ");
        internetpayment = obj.nextDouble();
        System.out.print("\nEnter Stationary Expenses: ");
        stationarypayment = obj.nextDouble();
        System.out.print("\nEnter Other Expenses: ");
        otherexpenses = obj.nextDouble();


    }


    String answer; double Months[]=new double[12] ;
    public void showexpenses(){
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("EASY WAYS AGENCIES");
//        System.out.println(obj.toString());
//        SimpleDateFormat obj1=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz ");
//        System.out.println("\t\t\t\t\t\t\t\t\t Date: "+ (obj1.format(obj)));
        System.out.println("\t\t\t\t\t\t\t\t\tDate "+ obj1.toString());
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("SNO# \t\t\t\t Description \t\t\t\t\t\t  Expenses");
        System.out.println();

        System.out.println(" "+ 1 +"\t\t\t\t"+" Employees "+"\t\t\t\t\t\t\t\t "+" "+total);
        System.out.println(" "+ 2 +"\t\t\t\t"+" Rent "+"\t\t\t\t\t\t\t\t\t "+" "+rent);
        System.out.println(" "+ 3 +"\t\t\t\t"+" Electricity Bill "+"\t\t\t\t\t\t "+" "+electricitybill);

        System.out.println(" "+ 5 +"\t\t\t\t"+" Internet Payment "+"\t\t\t\t\t\t "+" "+internetpayment);
        System.out.println(" "+ 6 +"\t\t\t\t"+" Stationary Expenses "+"\t\t\t\t\t "+" "+stationarypayment);
        System.out.println(" "+ 7 +"\t\t\t\t"+" Other Expenses "+"\t\t\t\t\t\t "+" "+otherexpenses);
        double totalamount=(total+rent+electricitybill+internetpayment+stationarypayment+otherexpenses);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tTotal Expenses:   "+totalamount);
        System.out.println("----------------------------------------------------------------------------------------------");



    }

}