package utn.estudiantes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiantes2024;
import utn.estudiantes.repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio implements IEstudianteServicio {
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;


    @Override
    public List<Estudiantes2024> listarEstudiantes() {
        List<Estudiantes2024> estudiantes2024s = estudianteRepositorio.findAll();
        return estudiantes2024s;
    }

    @Override
    public Estudiantes2024 buscarEstudiantePorId(Integer idEstudiante) {
        Estudiantes2024 estudiantes2024 = estudianteRepositorio.findById(idEstudiante).orElse(null);
        return estudiantes2024;
    }

    @Override
    public void guardarEstudiante(Estudiantes2024 estudiantes2024) {
        estudianteRepositorio.save(estudiantes2024);
    }

    @Override
    public void eliminarEstudiante(Estudiantes2024 estudiantes2024) {
        estudianteRepositorio.delete(estudiantes2024);
    }
}
