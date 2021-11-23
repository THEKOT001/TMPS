package com.Facade;

public class CarCatalog {
    public static void main(String[] args)
    {
        //the case when client wants to look at standard models
        CatalogService.showCivilModels();

        //the case when client wants to look at models with configurable additional options
        CatalogService.showIndustrialModels();

        //the case when client wants to look at all models
        CatalogService.showAllModels();
    }
}
