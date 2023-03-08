package com.example.tiendamoraazul.controladres;

import com.example.tiendamoraazul.entidades.Producto;
import com.example.tiendamoraazul.servicios.ServicioProducto;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;

@RestController
@RequestMapping("tienda/api/")
public class ControladorProducto {
    // controlador es la intefaz entre el back y front y es el encargado de configurar elementos ENDPOINTS
    @Autowired
    ServicioProducto servicioProducto;

    @PostMapping
    public ResponseEntity<?> registrarProducto(@RequestBody Producto producto){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(servicioProducto.agregar(producto));
        }catch ( Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error al registrar el producto");
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodosProductos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioProducto.buscarTodos());
        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error buscando los productos");
        }
    }

    @GetMapping("/${id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Integer id){
        try{

            ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioProducto.buscarPorId(id));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error, buscando producto");
        }
    }

}
