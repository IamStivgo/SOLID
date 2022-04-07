package com.solid.interfacesegregation.solution;

import java.util.ArrayList;
import java.util.List;

public class UserService implements ICreateRead<User>, IDeleteUpdate<User> {
    @Override
    public User get(int id) {
        System.out.println("Obtener usuario");
        return new User();
    }

    @Override
    public List<User> getList() {
        System.out.println("Lista de usuarios");
        List<User> users = new ArrayList<>();
        return users;
    }

    @Override
    public void add(User entity) {
        System.out.println("Creamos el usuario");
    }

    @Override
    public void update(User entity) {
        System.out.println("Edigar el usuario");
    }

    @Override
    public void delete(User entity) {
        System.out.println("Eliminamos el usuario");
    }
}
