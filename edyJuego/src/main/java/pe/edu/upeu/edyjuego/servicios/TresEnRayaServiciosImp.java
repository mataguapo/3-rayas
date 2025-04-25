package pe.edu.upeu.edyjuego.servicios;

import org.springframework.stereotype.Service;
import pe.edu.upeu.edyjuego.modelo.TresEnRayaTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class TresEnRayaServiciosImp implements TresEnRayaServiciosI{

    List<TresEnRayaTO> datos= new ArrayList<>();

    // creando
    @Override
    public void save(TresEnRayaTO to) {
        datos.add(to);
    }

    // R leer
    @Override
    public List<TresEnRayaTO> findAll() {
        return datos;
    }

    // R leer
    @Override
    public TresEnRayaTO findById(int index) {
        return datos.get(index);
    }
// actualizar
    @Override
    public void update(TresEnRayaTO to, int index) {
        datos.set(index, to);
        // actualizar el array datos ( el lugar que eliga)

    }
//delete= eliminaaar
    @Override
    public void delete(TresEnRayaTO to) {
        datos.remove(to);
        // elimar datos
    }
    //delete= eliminaaar-se remueve el index osea con el numero de index
    @Override
    public void deleteById(int index) {

    }
}
