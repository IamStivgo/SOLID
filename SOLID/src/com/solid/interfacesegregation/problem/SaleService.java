package com.solid.interfacesegregation.problem;

import java.util.ArrayList;
import java.util.List;

public class SaleService implements ICrud<Sale>{
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

    @Override
    public void update(Sale entity) {
        throw new RuntimeException("Invalid operation");
    }

    @Override
    public void delete(Sale entity) {
        throw new RuntimeException("Invalid operation");
    }
}
