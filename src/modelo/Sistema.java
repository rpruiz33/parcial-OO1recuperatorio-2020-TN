package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List<Asistencia> asistencias;

public List<Asistencia> getAsistencias() {
	return asistencias;
}

public void setAsistencias(List<Asistencia> asistencias) {
	this.asistencias = asistencias;
}

public Sistema() {
	super();
	this.asistencias = new ArrayList<Asistencia>();
}
public boolean agregarTrabajoPresencial(LocalDate fecha, String legajo,LocalTime horaDesde, LocalTime horaHasta)throws Exception {
	boolean aux=false;
	int i=0;
	int id=1;

	while (i<asistencias.size()&& aux==false) {
		if(asistencias.get(i).getLegajo().equals(legajo)&& asistencias.get(i).getFecha().equals(fecha)) {
			throw new Exception("misma fecha y legajo");
		}
		else {
			
		
		if(asistencias.size()>0) {
			id=asistencias.get(asistencias.size()-1).getIdAsitencia()+1;

		
		}
		
		}
		
		i++;
	}
	
	aux=	asistencias.add(new TrabjoPresencial(id, fecha, legajo, horaDesde,  horaHasta));		
	return aux;
}
public boolean agregarTeletrabjo(LocalDate fecha, String legajo,String motivo, int tareasRealizadas)throws Exception {
	boolean aux=false;
	int i=0;
	int id=1;
	while (i<asistencias.size()&& aux==false) {
	
			

		if(asistencias.size()>0) {
		id=asistencias.get(asistencias.size()-1).getIdAsitencia()+1;
		}
		i++;
	
		}
	aux=asistencias.add(new Teletrabajo(id, fecha, legajo, motivo,  tareasRealizadas));
		
	return aux;	
	
}
			

public List<Asistencia> traerAsistencia(LocalDate fecha) {
	
	List <Asistencia> aux=new ArrayList<Asistencia>();
	int i=0;


	while (i<asistencias.size()&& aux!=null) {
		if( asistencias.get(i).getFecha().equals(fecha)) {
			aux.add(asistencias.get(i));
		}
		i++;
	
}
return aux;
}

public List<Teletrabajo> traerAsistencia(boolean esPresencial){
List <Teletrabajo> aux=new ArrayList<Teletrabajo>();
		int i=0;
	while (i<asistencias.size()&&aux!=null) {
		if(esPresencial==false && asistencias.get(i) instanceof Teletrabajo) {
			aux.add((Teletrabajo) asistencias.get(i));
		}	
		i++;	
}
return aux;
}
}
