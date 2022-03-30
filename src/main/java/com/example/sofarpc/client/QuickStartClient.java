package com.example.sofarpc.client;

import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.example.sofarpc.server.services.SubtractService;
import com.example.sofarpc.server.services.SumService;

import java.util.Scanner;

/**
 * Quick Start client
 */
public class QuickStartClient {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter Value For Function");
            System.out.println("1:Sum");
            System.out.println("2:Subtract");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    doSum();
                    break;
                case 2:
                    doSubtract();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }

            System.out.println("=============End=============");
        }



    }

    public static void doSum() {
        Scanner in = new Scanner(System.in);
        ConsumerConfig<SumService> consumerConfig = new ConsumerConfig<SumService>()
                .setInterfaceId(SumService.class.getName()) // Specify the interface
                .setProtocol("bolt") // Specify the protocol.setDirectUrl
                .setDirectUrl("bolt://127.0.0.1:12200"); // Specify the direct connection address
        // Generate the proxy class
        SumService sumService = consumerConfig.refer();



            System.out.println("Enter First Value");
            int firstValues = in.nextInt();

            System.out.println("Enter Second Value");
            int secondValue = in.nextInt();

            int total = sumService.sum(firstValues, secondValue);

            System.out.println("Total  Is " + total);



    }


    public static void doSubtract() {
        Scanner in = new Scanner(System.in);
        ConsumerConfig<SubtractService> consumerConfig = new ConsumerConfig<SubtractService>()
                .setInterfaceId(SubtractService.class.getName()) // Specify the interface
                .setProtocol("bolt") // Specify the protocol.setDirectUrl
                .setDirectUrl("bolt://127.0.0.1:12200"); // Specify the direct connection address
        // Generate the proxy class
        SubtractService sumService = consumerConfig.refer();



            System.out.println("Enter First Value");
            int firstValues = in.nextInt();

            System.out.println("Enter Second Value");
            int secondValue = in.nextInt();

            int total = sumService.subtract(firstValues, secondValue);

            System.out.println("Result  Is " + total);



    }
}