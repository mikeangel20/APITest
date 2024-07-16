package com.example.service;

import com.example.model.Cliente;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    ArrayList<Cliente> getAllUser();

    Optional<Cliente> getUserById(int id);

    Cliente saveCliente(Cliente cl);

    boolean deleteCliente(int id);
}
