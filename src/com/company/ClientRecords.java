package com.company;
import java.util.Scanner;
import java.util.Date;

public class ClientRecords {
Scanner obj=new Scanner(System.in);
Date obj1=new Date();
    String clientName[]=new String [150];
    String clientid[]=new String [150];
    String clientdate[]=new String[150];
    double clientamount[]=new  double[150];


    String clientname;double amount; String Clientdate;String ClientID;

    public void ClientAttributes(String Clientname,double amount,String Clientdate,String ClientID){
        this.ClientID=ClientID;
        this.amount=amount;
        this.clientname=clientname;
        this.Clientdate=Clientdate;

    }


int noofclient; double total;String space="                   ";
    public void Client(){


        System.out.println("For How Many Clients You want to maintain the record ? ");
        noofclient=obj.nextInt();


       switch(noofclient)

    {
        case 1:

            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            ClientID = obj.nextLine();
            ClientID = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientname = obj.nextLine();
            System.out.println("Enter the Date");
            Clientdate = obj.nextLine();
            System.out.println("Enter Amount of" + ClientID);
            amount = obj.nextDouble();

            total = amount;
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tDated: "+obj1.toString());
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");

            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(ClientID + "\t\t\t\t " + Clientdate + "\t\t\t\t" + clientname + "\t\t\t\t" + total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   " + total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

            break;

        case 2:


            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();


            total = clientamount[0] + clientamount[1];

            break;

        case 3:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[2] = obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2];
            break;

        case 4:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3];

            break;

        case 5:


            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4];
            break;

        case 6:


            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5] = obj.nextLine();
            clientid[5] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[5]);
            clientamount[5] = obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+ clientamount[5];
            break;

        case 7:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5] = obj.nextLine();
            clientid[5] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[5]);
            clientamount[5] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7] = obj.nextLine();
            clientid[7] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[7]);
            clientamount[7] = obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+ clientamount[5]+ clientamount[6];

                break;
        case 8:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5] = obj.nextLine();
            clientid[5] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[5]);
            clientamount[5] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7] = obj.nextLine();
            clientid[7] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[7]);
            clientamount[7] = obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7];
            break;
        case 9:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5] = obj.nextLine();
            clientid[5] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[5]);
            clientamount[5] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6] = obj.nextLine();
            clientid[6] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[6]);
            clientamount[6] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7] = obj.nextLine();
            clientid[7] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[7]);
            clientamount[7] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8] = obj.nextLine();
            clientid[8] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[8]);
            clientamount[8] = obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8];
                break;

        case 10:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5] = obj.nextLine();
            clientid[5] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[5]);
            clientamount[5] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6] = obj.nextLine();
            clientid[7] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[6]);
            clientamount[6] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7] = obj.nextLine();
            clientid[7] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[7]);
            clientamount[7] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8] = obj.nextLine();
            clientid[8] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[8]);
            clientamount[8] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9] = obj.nextLine();
            clientid[9] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[9]);
            clientamount[9] = obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9];
            break;

        case 11:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5] = obj.nextLine();
            clientid[5] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[5]);
            clientamount[5] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6] = obj.nextLine();
            clientid[6] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[6]);
            clientamount[6] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7] = obj.nextLine();
            clientid[7] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[7]);
            clientamount[7] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8] = obj.nextLine();
            clientid[8] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[8]);
            clientamount[8] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9] = obj.nextLine();
            clientid[9] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[9]);
            clientamount[9] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10] = obj.nextLine();
            clientid[9] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[10]);
            clientamount[10] = obj.nextDouble();


            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10];

            break;

        case 12:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5] = obj.nextLine();
            clientid[5] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[5]);
            clientamount[5] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6] = obj.nextLine();
            clientid[6] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[6]);
            clientamount[6] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7] = obj.nextLine();
            clientid[7] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[7]);
            clientamount[7] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8] = obj.nextLine();
            clientid[8] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[8]);
            clientamount[8] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9] = obj.nextLine();
            clientid[9] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[9]);
            clientamount[9] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10] = obj.nextLine();
            clientid[9] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[10]);
            clientamount[10] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
            + clientamount[11];


            break;
        case 13:


            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0] = obj.nextLine();
            clientid[0] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[0]);
            clientamount[0] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1] = obj.nextLine();
            clientid[1] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[1]);
            clientamount[1] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2] = obj.nextLine();
            clientid[2] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[2]);
            clientamount[2] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3] = obj.nextLine();
            clientid[3] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[3]);
            clientamount[3] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4] = obj.nextLine();
            clientid[4] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[4]);
            clientamount[4] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5] = obj.nextLine();
            clientid[5] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[5]);
            clientamount[5] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6] = obj.nextLine();
            clientid[6] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[6]);
            clientamount[6] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7] = obj.nextLine();
            clientid[7] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[7]);
            clientamount[7] = obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8] = obj.nextLine();
            clientid[8] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[8]);
            clientamount[8] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9] = obj.nextLine();
            clientid[9] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[9]);
            clientamount[9] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10] = obj.nextLine();
            clientid[9] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[10]);
            clientamount[10] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12] = obj.nextLine();
            clientid[12] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[12]);
            clientamount[12] = obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12];
            break;


        case 14:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13];

            break;

        case 15:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14];

            break;

        case 16:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[15]);
            clientamount[15]=obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15];

            break;

        case 17:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16];

            break;

        case 18:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17];

            break;
        case 19:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18];

            break;
        case 20:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #20");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[19]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[19]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[19]);
            clientamount[19]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19];

            break;

        case 21:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #21");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[20]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[20]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[20]);
            clientamount[20]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20];

            break;

        case 22:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #22");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[21]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[21]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[21]);
            clientamount[21]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20]+clientamount[21];

            break;

        case 23:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #23");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[22]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[22]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[22]);
            clientamount[22]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20]+clientamount[21]+clientamount[22];

            break;

        case 24:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #24");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[23]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[23]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[23]);
            clientamount[23]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20]+clientamount[21]+clientamount[22]
                    +clientamount[23];

            break;


        case 25:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #26");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[25]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[25]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[25]);
            clientamount[25]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20]+clientamount[21]+clientamount[22]
                    +clientamount[23]+clientamount[24]+clientamount[25];

            break;

        case 26:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #26");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[25]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[25]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[25]);
            clientamount[25]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20]+clientamount[21]+clientamount[22]
                    +clientamount[23]+clientamount[24]+clientamount[25];

            break;



        case 27:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #27");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[26]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[26]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[26]);
            clientamount[26]=obj.nextDouble();
            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20]+clientamount[21]+clientamount[22]
                    +clientamount[23]+clientamount[24]+clientamount[25]+clientamount[26];

            break;


        case 28:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #20");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[19]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[19]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[19]);
            clientamount[19]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #21");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[20]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[20]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[20]);
            clientamount[20]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #22");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[21]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[21]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[21]);
            clientamount[21]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #23");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[22]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[22]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[22]);
            clientamount[22]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #24");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[23]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[23]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[23]);
            clientamount[23]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #25");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[24]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[24]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[24]);
            clientamount[24]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #26");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[25]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[25]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[25]);
            clientamount[25]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #27");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[26]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[26]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[26]);
            clientamount[26]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #28");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[27]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[27]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[26]);
            clientamount[27]=obj.nextDouble();


            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20]+clientamount[21]+clientamount[22]
                    +clientamount[23]+clientamount[24]+clientamount[25]+clientamount[26]+clientamount[27];
            break;


        case 29:

            System.out.println("Enter the data of CLIENT #01");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[0]=obj.nextLine(); clientid[0]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[0]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[0]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[0]);
            clientamount[0]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #02");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[1]=obj.nextLine(); clientid[1]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[1]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[1]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[1]);
            clientamount[1]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #03");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[2]=obj.nextLine(); clientid[2]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[2]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[2]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[2]);
            clientamount[2]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #04");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[3]=obj.nextLine(); clientid[3]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[3]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[3]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[3]);
            clientamount[3]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #05");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[4]=obj.nextLine(); clientid[4]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[4]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[4]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[4]);
            clientamount[4]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #06");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[5]=obj.nextLine(); clientid[5]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[5]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[5]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[5]);
            clientamount[5]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #07");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[6]=obj.nextLine(); clientid[6]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[6]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[6]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[6]);
            clientamount[6]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #08");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[7]=obj.nextLine(); clientid[7]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[7]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[7]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[7]);
            clientamount[7]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #09");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[8]=obj.nextLine(); clientid[8]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[8]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[8]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[8]);
            clientamount[8]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #10");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[9]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[9]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[9]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[9]);
            clientamount[9]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #11");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[10]=obj.nextLine(); clientid[9]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[10]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[10]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[10]);
            clientamount[10]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #12");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[11] = obj.nextLine();
            clientid[11] = obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[11] = obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[11] = obj.nextLine();
            System.out.println("Enter Amount of" + clientid[11]);
            clientamount[11] = obj.nextDouble();

            System.out.println("Enter the data of CLIENT #13");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[12]=obj.nextLine(); clientid[12]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[12]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[12]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[12]);
            clientamount[12]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #14");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[13]=obj.nextLine(); clientid[13]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[13]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[13]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[13]);
            clientamount[13]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #15");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[14]=obj.nextLine(); clientid[14]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[14]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[14]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[14]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #16");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[15]=obj.nextLine(); clientid[15]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[15]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[15]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[14]);
            clientamount[15]=obj.nextDouble();



            System.out.println("Enter the data of CLIENT #17");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[16]=obj.nextLine(); clientid[16]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[16]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[16]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[16]);
            clientamount[16]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #18");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[17]=obj.nextLine(); clientid[17]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[17]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[17]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[17]);
            clientamount[17]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #19");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[18]=obj.nextLine(); clientid[18]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[18]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[18]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[18]);
            clientamount[18]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #20");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[19]=obj.nextLine(); clientid[19]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[19]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[19]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[19]);
            clientamount[19]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #21");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[20]=obj.nextLine(); clientid[20]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[20]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[20]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[20]);
            clientamount[20]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #22");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[21]=obj.nextLine(); clientid[21]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[21]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[21]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[21]);
            clientamount[21]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #23");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[22]=obj.nextLine(); clientid[22]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[22]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[22]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[22]);
            clientamount[22]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #24");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[23]=obj.nextLine(); clientid[23]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[23]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[23]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[23]);
            clientamount[23]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #25");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[24]=obj.nextLine(); clientid[24]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[24]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[24]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[24]);
            clientamount[24]=obj.nextDouble();


            System.out.println("Enter the data of CLIENT #26");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[25]=obj.nextLine(); clientid[25]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[25]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[25]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[25]);
            clientamount[25]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #27");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[26]=obj.nextLine(); clientid[26]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[26]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[26]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[26]);
            clientamount[26]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #28");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[27]=obj.nextLine(); clientid[27]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[27]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[27]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[26]);
            clientamount[27]=obj.nextDouble();

            System.out.println("Enter the data of CLIENT #29");
            System.out.println("Enter the Client ID:  (FORMAT: EW-FL-007)");
            clientid[28]=obj.nextLine(); clientid[28]=obj.nextLine();
            System.out.println("Enter the Client Name");
            clientName[28]=obj.nextLine();
            System.out.println("Enter the Date");
            clientdate[28]=obj.nextLine();
            System.out.println("Enter Amount of"+clientid[28]);
            clientamount[28]=obj.nextDouble();

            total = clientamount[0] + clientamount[1]+ clientamount[2]+ clientamount[3]+ clientamount[4]+
                    clientamount[5]+ clientamount[6]+ clientamount[7]+ clientamount[8]+ clientamount[9]+ clientamount[10]
                    + clientamount[11] + clientamount[12]+clientamount[13]+clientamount[14]+clientamount[15]+clientamount[16]
                    +clientamount[17]+clientamount[18]+clientamount[19]+clientamount[20]+clientamount[21]+clientamount[22]
                    +clientamount[23]+clientamount[24]+clientamount[25]+clientamount[26]+clientamount[27]+clientamount[28];


            break;

    }


    }



        public void ClientRecord(){
        if(noofclient==01){
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Dated:"+obj1.toString());

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# "++"DATE "+space+" Client Name"+space+" Amount");

            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(ClientID+""+space+""+Clientdate+""+space+clientname+""+space+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
        }

        else if(noofclient==02){
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");

            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
        else if(noofclient==3){
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");

            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }

        else if (noofclient==04){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
        else if(noofclient==05){
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }

        else if(noofclient == 6){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }

        else if(noofclient == 7){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t\t"+clientName[0]+"\t\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t\t"+clientName[1]+"\t\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t\t"+clientName[2]+"\t\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t\t"+clientName[3]+"\t\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t\t"+clientName[4]+"\t\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t\t"+clientName[5]+"\t\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t\t"+clientName[6]+"\t\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");


            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }

        else if(noofclient == 8){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t\t"+clientName[0]+"\t\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t\t"+clientName[1]+"\t\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t\t"+clientName[2]+"\t\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t\t"+clientName[3]+"\t\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t\t"+clientName[4]+"\t\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t\t"+clientName[5]+"\t\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t\t"+clientName[6]+"\t\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t\t"+clientName[7]+"\t\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }

        else if(noofclient == 9){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
        else if(noofclient == 10){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }

        else if(noofclient == 11){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[10]+"\t\t\t\t "+clientdate[10]+"\t\t\t"+clientName[10]+"\t\t\t"+clientamount[10]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
        else if(noofclient == 12){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[10]+"\t\t\t\t "+clientdate[10]+"\t\t\t"+clientName[10]+"\t\t\t"+clientamount[10]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[11]+"\t\t\t\t "+clientdate[11]+"\t\t\t"+clientName[11]+"\t\t\t"+clientamount[11]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
        else if(noofclient == 13){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[10]+"\t\t\t\t "+clientdate[10]+"\t\t\t"+clientName[10]+"\t\t\t"+clientamount[10]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[11]+"\t\t\t\t "+clientdate[11]+"\t\t\t"+clientName[11]+"\t\t\t"+clientamount[11]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[12]+"\t\t\t\t "+clientdate[12]+"\t\t\t"+clientName[12]+"\t\t\t"+clientamount[12]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
        else if(noofclient == 14){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[10]+"\t\t\t\t "+clientdate[10]+"\t\t\t"+clientName[10]+"\t\t\t"+clientamount[10]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[11]+"\t\t\t\t "+clientdate[11]+"\t\t\t"+clientName[11]+"\t\t\t"+clientamount[11]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[12]+"\t\t\t\t "+clientdate[12]+"\t\t\t"+clientName[12]+"\t\t\t"+clientamount[12]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[13]+"\t\t\t\t "+clientdate[13]+"\t\t\t"+clientName[13]+"\t\t\t"+clientamount[13]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
        else if(noofclient == 15){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[10]+"\t\t\t\t "+clientdate[10]+"\t\t\t"+clientName[10]+"\t\t\t"+clientamount[10]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[11]+"\t\t\t\t "+clientdate[11]+"\t\t\t"+clientName[11]+"\t\t\t"+clientamount[11]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[12]+"\t\t\t\t "+clientdate[12]+"\t\t\t"+clientName[12]+"\t\t\t"+clientamount[12]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[13]+"\t\t\t\t "+clientdate[13]+"\t\t\t"+clientName[13]+"\t\t\t"+clientamount[13]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[14]+"\t\t\t\t "+clientdate[14]+"\t\t\t"+clientName[14]+"\t\t\t"+clientamount[14]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }

        else if(noofclient == 16){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[10]+"\t\t\t\t "+clientdate[10]+"\t\t\t"+clientName[10]+"\t\t\t"+clientamount[10]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[11]+"\t\t\t\t "+clientdate[11]+"\t\t\t"+clientName[11]+"\t\t\t"+clientamount[11]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[12]+"\t\t\t\t "+clientdate[12]+"\t\t\t"+clientName[12]+"\t\t\t"+clientamount[12]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[13]+"\t\t\t\t "+clientdate[13]+"\t\t\t"+clientName[13]+"\t\t\t"+clientamount[13]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[14]+"\t\t\t\t "+clientdate[14]+"\t\t\t"+clientName[14]+"\t\t\t"+clientamount[14]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[15]+"\t\t\t\t "+clientdate[15]+"\t\t\t"+clientName[15]+"\t\t\t"+clientamount[15]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }

        else if(noofclient == 17){

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("EASY WAYS AGENCIES");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Client ID# \t\t\t\t DATE \t\t\t\t  Client Name \t\t\t\t Amount");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[0]+"\t\t\t\t "+clientdate[0]+"\t\t\t"+clientName[0]+"\t\t\t"+clientamount[0]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[1]+"\t\t\t\t "+clientdate[1]+"\t\t\t"+clientName[1]+"\t\t\t"+clientamount[1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[2]+"\t\t\t\t "+clientdate[2]+"\t\t\t"+clientName[2]+"\t\t\t"+clientamount[2]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[3]+"\t\t\t\t "+clientdate[3]+"\t\t\t"+clientName[3]+"\t\t\t"+clientamount[3]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[4]+"\t\t\t\t "+clientdate[4]+"\t\t\t"+clientName[4]+"\t\t\t"+clientamount[4]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[5]+"\t\t\t\t "+clientdate[5]+"\t\t\t"+clientName[5]+"\t\t\t"+clientamount[5]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[6]+"\t\t\t\t "+clientdate[6]+"\t\t\t"+clientName[6]+"\t\t\t"+clientamount[6]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[7]+"\t\t\t\t "+clientdate[7]+"\t\t\t"+clientName[7]+"\t\t\t"+clientamount[7]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[8]+"\t\t\t\t "+clientdate[8]+"\t\t\t"+clientName[8]+"\t\t\t"+clientamount[8]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[9]+"\t\t\t\t "+clientdate[9]+"\t\t\t"+clientName[9]+"\t\t\t"+clientamount[9]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[10]+"\t\t\t\t "+clientdate[10]+"\t\t\t"+clientName[10]+"\t\t\t"+clientamount[10]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[11]+"\t\t\t\t "+clientdate[11]+"\t\t\t"+clientName[11]+"\t\t\t"+clientamount[11]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[12]+"\t\t\t\t "+clientdate[12]+"\t\t\t"+clientName[12]+"\t\t\t"+clientamount[12]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[13]+"\t\t\t\t "+clientdate[13]+"\t\t\t"+clientName[13]+"\t\t\t"+clientamount[13]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[14]+"\t\t\t\t "+clientdate[14]+"\t\t\t"+clientName[14]+"\t\t\t"+clientamount[14]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[15]+"\t\t\t\t "+clientdate[15]+"\t\t\t"+clientName[15]+"\t\t\t"+clientamount[15]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println(clientid[16]+"\t\t\t\t "+clientdate[16]+"\t\t\t"+clientName[16]+"\t\t\t"+clientamount[16]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");



            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Total Amount:   "+total);
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
    }
}
