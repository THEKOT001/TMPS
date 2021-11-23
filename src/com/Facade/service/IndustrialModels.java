package com.Facade.service;

public class IndustrialModels {
    private static String[] cars = {"Semi\nColor:gray, blue\nBattery:140kWh\nRange:400miles"};

    public static void show() {
        for (String car: cars) {
            System.out.println("  Tesla " + car);
        }
    }

    public static int count() {
        return cars.length;
    }
}
