package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrabjoPresencial extends Asistencia {
private LocalTime horaDesde;
private LocalTime horaHasta;
public LocalTime getHoraDesde() {
	return horaDesde;
}
public void setHoraDesde(LocalTime horaDesde) {
	this.horaDesde = horaDesde;
}
public LocalTime getHoraHasta() {
	return horaHasta;
}
public void setHoraHasta(LocalTime horaHasta) {
	this.horaHasta = horaHasta;
}
public TrabjoPresencial(int idAsitencia, LocalDate fecha, String legajo, LocalTime horaDesde, LocalTime horaHasta) {
	super(idAsitencia, fecha, legajo);
	this.horaDesde = horaDesde;
	this.horaHasta = horaHasta;
}
@Override
public String toString() {
	return "\nTrabjoPresencial [horaDesde=" + horaDesde + ", horaHasta=" + horaHasta + "]";
}
public double calcularHorasTrabajdas() {
	double horasTrabajadas= ((horaHasta.getHour()-horaDesde.getHour())*60)+((horaHasta.getMinute())-horaDesde.getMinute());
	return (horasTrabajadas/60);
}


}
