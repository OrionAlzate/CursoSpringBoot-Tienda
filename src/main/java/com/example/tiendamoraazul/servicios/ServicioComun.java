package com.example.tiendamoraazul.servicios;

import com.example.tiendamoraazul.entidades.Producto;

import java.util.List;

public interface ServicioComun<E> {

    public List<E> buscarTodos();

    public E buscarPorId(Integer id);

    public E agregar(E datos);

}
