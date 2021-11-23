package com.Facade;

import com.Facade.service.IndustrialModels;
import com.Facade.service.CivilModels;

public class CatalogService {
    private final static CivilModels standard = new CivilModels();
    private final static IndustrialModels configurable = new IndustrialModels();

    public static void showCivilModels() {
        System.out.println(" - Civil models: " + String.valueOf(CivilModels.count()) + " -");
        CivilModels.show();
        System.out.println("");
    }

    public static void showIndustrialModels() {
        System.out.println(" - Industrial models: " + String.valueOf(IndustrialModels.count()) + " -");
        IndustrialModels.show();
        System.out.println("");
    }

    public static void showAllModels() {
        System.out.println(" - All models: " + String.valueOf(CivilModels.count() + IndustrialModels.count()) + " -");
        CivilModels.show();
        IndustrialModels.show();
    }
}
