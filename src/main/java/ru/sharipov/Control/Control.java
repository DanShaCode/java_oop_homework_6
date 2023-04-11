package ru.sharipov.Control;

import ru.sharipov.Model.Classes.*;
import ru.sharipov.View.View;

import java.util.Scanner;

public class Control {
    public Control() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите логин и пароль.");
        System.out.println();
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println();
        System.out.print("Введите пароль: ");
        Integer password = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        if (login.equals("1234") && password == 1234) {
            MarketWarehouse marketWarehouse = new MarketWarehouse(1000);
            Product milk = new Product("Milk", 100, 59.99);
            Product butter = new Product("Butter", 250, 19.99);
            Product vine = new Product("Vine", 250, 19.99);
            marketWarehouse.addProduct(milk);
            marketWarehouse.addProduct(butter);
            marketWarehouse.addProduct(vine);
            SelfDelivery selfDelivery = new SelfDelivery();
            HomeDelivery homeDelivery = new HomeDelivery();
            Order order = new Order();
            View view = new View();
            Integer userInput = 0;
            while (userInput != 9) {
                System.out.println("-=== Система управления складом ===-");
                System.out.println();
                System.out.println("1. Посмотреть товары на складе ");
                System.out.println();
                System.out.println("2. Добавить товар ");
                System.out.println();
                System.out.println("3. Отгрузить товар ");
                System.out.println();
                System.out.println("4. Посмотреть свободное место на складе ");
                System.out.println();
                System.out.println("9. Закрыть программу ");
                System.out.println();
                System.out.print("Введите цифру из меню: ");
                userInput = scanner.nextInt();
                scanner.nextLine();
                switch (userInput) {
                    case 1 -> view.getWarehouseInfo(marketWarehouse);
                    case 2 -> {
                        System.out.println();
                        System.out.print("Введите название продукта: ");
                        String productName = scanner.next();
                        scanner.nextLine();
                        System.out.print("Введите количество продукта в целых единицах: ");
                        Integer productQuantity = Integer.parseInt(scanner.nextLine());
                        System.out.print("Введите стоимость продукта: ");
                        Double productPrice = Double.parseDouble(scanner.nextLine());
                        marketWarehouse.addProduct(new Product(productName, productQuantity, productPrice));
                    }
                    case 3 -> {
                        System.out.println();
                        System.out.println("1. Отправить товар доставкой ");
                        System.out.println();
                        System.out.println("2. Отгрузить товар на складе ");
                        System.out.println();
                        System.out.print("Введите соответствующую цифру из меню: ");
                        Integer input = Integer.parseInt(scanner.nextLine());
                        switch (input) {
                            case 1 -> {
                                System.out.println();
                                System.out.print("Введите ID продукта: ");
                                Integer productId = Integer.parseInt(scanner.nextLine());
                                System.out.print("Введите количество: ");
                                Integer quantity = Integer.parseInt(scanner.nextLine());
                                System.out.print("Введите адрес доставки: ");
                                String adress = scanner.next();
                                scanner.nextLine();
                                order.processHomeOrderPush(productId, quantity, homeDelivery, marketWarehouse, adress, view);
                            }
                            case 2 -> {
                                System.out.println();
                                System.out.print("Введите ID продукта: ");
                                Integer productId = Integer.parseInt(scanner.nextLine());
                                System.out.print("Введите количество: ");
                                Integer quantity = Integer.parseInt(scanner.nextLine());
                                order.processOrderPull(productId,quantity,selfDelivery,marketWarehouse,view);
                            }
                        }
                    }
                    case 4 -> view.getWarehouseCurrentAmount(marketWarehouse);
                }
            }
            scanner.close();
        }
    }
}