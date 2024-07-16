package com.example.service;

import com.example.model.Cliente;
import com.example.repository.ClienteRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ArrayList<Cliente> getAllUser() {
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> getUserById(int id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente saveCliente(Cliente cl) {
        return clienteRepository.save(cl);
    }

    @Override
    public boolean deleteCliente(int id) {
        try {
            Optional<Cliente> cl = getUserById(id);
            clienteRepository.delete(cl.get());
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
