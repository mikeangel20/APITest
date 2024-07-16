package com.example.controller;

import com.example.model.Cliente;
import com.example.service.ClienteService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ApiDemo {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/saludar")
    public String saludar() {
        return "Hola Mundo desde Spring";
    }

    @GetMapping("/allClients")
    public ArrayList<Cliente> getAllClientes() {
        return clienteService.getAllUser();
    }

    @GetMapping("/findOneClient{id}")
    public Optional<Cliente> getClienteById(@PathVariable("id") int id) {
        return clienteService.getUserById(id);
    }
    
    @PostMapping("/saveClient")
    public Cliente saveClient(@RequestBody Cliente cl) {
        return clienteService.saveCliente(cl);
    }
    
    @DeleteMapping("/deleteClient/{id}")
    public String deleteClienteById(int id) {
        if(clienteService.deleteCliente(id)){
            return "Cliente eliminado correctamente";
        }else{
            return "ERROR al eliminar CLIENTE";
        }
    }
}
