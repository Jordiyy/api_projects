package com.todolist.todolist.models.entity;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "No puede estar vacio")
    private int edad;

    @NotEmpty(message = "No puede estar vacio")
    private String nombre;
    
    private Timestamp fecha;

    @JsonIgnore
    @OneToMany(mappedBy = "userId")
    private List<Task> listTasks = new ArrayList<>();

    public int getId() {
        return id;
    }

    public List<Task> getListTasks() {
        return listTasks;
    }

    public void setListTasks(List<Task> listTasks) {
        this.listTasks = listTasks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
}
