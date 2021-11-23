package com.Facade.service;

public class CivilModels {
    private static String[] cars = {"Model X\nColor:gray, blue, red\nBattery:95kWh\nMotor power:242kW",
            "Model Y\nColor:blue, red\nBattery:74kWh\nMotor power:258kW"};

    public static void show() {
        for (String car: cars) {
            System.out.println("  Tesla " + car);
        }
    }

    public static int count() {
        return cars.length;
    }
}
