package com.solid.interfacesegregation.solution;

import java.util.ArrayList;
import java.util.List;

public class SaleService implements ICreateRead<Sale> {
    @Override
    public Sale get(int id) {
        System.out.println("Obtener venta");
        return new Sale();
    }

    @Override
    public List<Sale> getList() {
        System.out.println("Lista de ventas");
        List<Sale> sales = new ArrayList<>();
        return sales;
    }

    @Override
    public void add(Sale entity) {
        System.out.println("Crear venta");
    }

}
