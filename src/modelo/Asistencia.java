package modelo;

import java.time.LocalDate;

public abstract class Asistencia {
protected int  idAsitencia;
protected LocalDate fecha;
protected String legajo;
public int getIdAsitencia() {
	return idAsitencia;
}
public void setIdAsitencia(int idAsitencia) {
	this.idAsitencia = idAsitencia;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public String getLegajo() {
	return legajo;
}
public void setLegajo(String legajo) {
	this.legajo = legajo;
}
public Asistencia(int idAsitencia, LocalDate fecha, String legajo) {
	super();
	this.idAsitencia = idAsitencia;
	this.fecha = fecha;
	this.legajo = legajo;
}

public abstract double calcularHorasTrabajdas() ;

}
