package ec.edu.ups.pweb.business;

import java.util.List;

import ec.edu.ups.pweb.dao.CarroDAO;
import ec.edu.ups.pweb.model.Carro;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionCarros implements GestionCarrosLocal, GestionCarrosRemoto{

	// Inyección del objeto DAO para acceder a la base de datos
	
	@Inject
	private CarroDAO daoCarro;

	@Override
	// Se busca el carro en la base de datos usando la placa
	public void guardarCarros(Carro carro) {
		// TODO Auto-generated method stub
		Carro car = daoCarro.read(carro.getPlaca());
		if (car != null){
			daoCarro.update(carro);
		}else {
			daoCarro.insert(carro);
		}
		
	}

	@Override
	// Se busca el carro en la base de datos por su placa
	public void actualizarCarro(Carro carro) throws Exception {
		// TODO Auto-generated method stub
		Carro car = daoCarro.read(carro.getPlaca());
		if (car != null){
			daoCarro.update(carro);
		}else {
			throw new Exception("Carro no existe");
		}
	}

	@Override
	// Se busca el carro en la base de datos por su placa
	public Carro getCarroPorPlaca(String placa) throws Exception {
		// TODO Auto-generated method stub
		Carro car = daoCarro.read(placa);
		if(car != null) {
			return daoCarro.getCarroPorPlaca(placa);
		}else {
			throw new Exception("Carro no existe");
		}
	}

	@Override
	// Elimina el carro de la base de datos usando la placa
	public void borrarCarro(String placa) {
		// TODO Auto-generated method stub
		daoCarro.delete(placa);
	}

	@Override
	// Obtiene y devuelve la lista de todos los carros
	public List<Carro> getCarros() {
		// TODO Auto-generated method stub
		return daoCarro.getList();
	}
	
}
