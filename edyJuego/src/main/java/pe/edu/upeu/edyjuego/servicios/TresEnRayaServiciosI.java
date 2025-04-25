package pe.edu.upeu.edyjuego.servicios;

import pe.edu.upeu.edyjuego.modelo.TresEnRayaTO;

import java.util.List;

public interface TresEnRayaServiciosI {

    //C = create (crear)
    public void save(TresEnRayaTO to);
    //R = read ( leer)
    public List<TresEnRayaTO> findAll();
    public TresEnRayaTO findById(int index);
    //U = update (actualizar)
    public void update(TresEnRayaTO to , int index);
    //D = delete (eliminar)
    public void delete(TresEnRayaTO to);
    public void deleteById(int index);


}
