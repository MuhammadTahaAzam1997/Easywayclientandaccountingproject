package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int select=0;

        while(select!=3 && select <=3){
            System.out.println("Enter 1- Expenses Record 2- Client Record ");
            select=sc.nextInt();
            switch(select){

                case 1:

                    EmployeeRecords obj=new EmployeeRecords();
                    obj.employee();
                    obj.otherexpense();
                    obj.showexpenses();

                    obj.EmployeeAttributes(obj.noofemp,obj.sal , obj.n, obj.rent, obj.electricitybill, obj.internetpayment, obj.stationarypayment, obj.otherexpenses,obj.month);


                    break;


                case 2:
                    ClientRecords obj1=new ClientRecords();

                   obj1.Client();
                    obj1.ClientRecord();
                    obj1.ClientAttributes(obj1.clientname, obj1.amount, obj1.Clientdate, obj1.ClientID);

                    break;

                default:
                    System.out.println("Kindly Press either 1 or 2");

            }
        }
    }}



