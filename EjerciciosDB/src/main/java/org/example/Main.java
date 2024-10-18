package org.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.configs.EntityManagerPostgres;
import org.example.models.curso.*;
import org.example.models.empleado.*;
import org.example.models.supermercado.*;
import org.example.repositories.curso.*;
import org.example.repositories.empleado.*;
import org.example.repositories.supermercado.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //Repositorios
//        ClienteRepository clienteRepository = new ClienteRepository();
//        MarcaRepository marcaRepository = new MarcaRepository();
//        ProductoRepository productoRepository = new ProductoRepository();
//        VentaRepository ventaRepository = new VentaRepository();
//        EmpleadoRepository empleadoRepository = new EmpleadoRepository();
//        DepartamentoRepository departamentoRepository = new DepartamentoRepository();
//        ProyectoRepository proyectoRepository = new ProyectoRepository();
        CursoRepository cursoRepository = new CursoRepository();
        EstudianteRepository estudianteRepository = new EstudianteRepository();
        NotaRepository notaRepository = new NotaRepository();
        ProfesorRepository profesorRepository = new ProfesorRepository();


        //Entidades
        Profesor profesor = Profesor.builder()
                .nombre("Pedro")
                .apellido("Pérez")
                .especialidad("Matemáticas")
                .build();
        profesorRepository.create(profesor);
        Nota nota = Nota.builder()
                .valor(5.0)
                .descripcion("Nota 1")
                .fecha(LocalDateTime.of(2021, 10, 10, 10, 10))
                .build();
        Curso curso = Curso.builder()
                .nombre("Matemáticas")
                .descripcion("Curso de Matemáticas")
                .fechaInicio(LocalDateTime.of(2021, 10, 10, 10, 10))
                .profesor(profesor)
                .notas(List.of(nota))
                .build();


        Estudiante estudiante = Estudiante.builder()
                .nombre("Juan")
                .apellido("Arango")
                .programa("Ingeniería")
                .cursos(List.of(curso))
                .build();
//        Cliente cliente = new Cliente();
//        Cliente cliente2 = new Cliente();
//        Departamento departamento = Departamento.builder()
//                .nombre("Contabilidad")
//                .ciudad("Quito")
//                .descripcion("Departamento de Contabilidad")
//                .build();
//        departamentoRepository.create(departamento);
//
//        Empleado empleado = Empleado.builder()
//                .nombre("Jacobo")
//                .salario(new BigDecimal("2500.75"))
//                .cuentaBancaria("1234567890")
//                .departamento(departamento)
//                .build();
//        Empleado empleado1 = Empleado.builder()
//                .nombre("Anabel")
//                .salario(new BigDecimal("3000.75"))
//                .cuentaBancaria("0987654321")
//                .departamento(departamento)
//                .build();
//
//        Proyecto proyecto = new Proyecto();


//        Marca marca = new Marca();
//        Producto producto = new Producto();
//
//        Venta venta = new Venta();



        //Guardar
        cursoRepository.create(curso);
        estudianteRepository.create(estudiante);
        notaRepository.create(nota);

//        clienteRepository.create(cliente);
//        clienteRepository.create(cliente2);
//        empleadoRepository.create(empleado);
//        empleadoRepository.create(empleado1);

//
//        marcaRepository.create(marca);
//        productoRepository.create(producto);
//
//        ventaRepository.create(venta);
//
//        venta.setProductos(List.of(producto));


        //Buscar
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        for (Estudiante e : estudiantes) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Apellido: " + e.getApellido());
            System.out.println("Profesor: " + e.getCursos().get(0).getProfesor().getNombre());
            System.out.println("Curso: " +e.getCursos().get(0).getNombre());
            System.out.println("Nota: " + e.getCursos().get(0).getNotas().get(0).getValor());
            System.out.println("Programa: " + e.getPrograma());

        }

//        List<Empleado> empleados = empleadoRepository.findAll();
//        for (Empleado e : empleados) {
//            System.out.println("Nombre: " + e.getNombre());
//            System.out.println("Salario: " + e.getSalario());
//            System.out.println("Cuenta Bancaria: " + e.getCuentaBancaria());
//            System.out.println("Departamento: " + e.getDepartamento().getNombre() );
//        }
//        clienteRepository.findAll().forEach(System.out::println);
//        List<Cliente> clientes = clienteRepository.findAll();
//
//        for (Cliente c : clientes) {
//            System.out.println(c.getNombre());
//            System.out.println(c.getCorreo());
//            System.out.println(c.getTelefono());
//        }
//        marcaRepository.findAll().forEach(System.out::println);
//        productoRepository.findAll().forEach(System.out::println);
//        ventaRepository.findAll().forEach(System.out::println);
//        empleadoRepository.findAll().forEach(System.out::println);
//        departamentoRepository.findAll().forEach(System.out::println);

        //Cerrar
//        empleadoRepository.close();
//        departamentoRepository.close();
//        clienteRepository.close();
//        marcaRepository.close();
//        productoRepository.close();
//        ventaRepository.close();
        cursoRepository.close();
        estudianteRepository.close();
        notaRepository.close();
        profesorRepository.close();


    }
}