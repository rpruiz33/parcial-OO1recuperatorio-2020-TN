package modelo;

import java.time.LocalDate;

public class Teletrabajo extends Asistencia {
private String motivo;
private int tareasReaalizadas;
public String getMotivo() {
	return motivo;
}
public void setMotivo(String motivo) {
	this.motivo = motivo;
}
public int getTareasReaalizadas() {
	return tareasReaalizadas;
}
public void setTareasReaalizadas(int tareasReaalizadas) {
	this.tareasReaalizadas = tareasReaalizadas;
}
public Teletrabajo(int idAsitencia, LocalDate fecha, String legajo, String motivo, int tareasReaalizadas) {
	super(idAsitencia, fecha, legajo);
	this.motivo = motivo;
	this.tareasReaalizadas = tareasReaalizadas;
}

public double calcularHorasTrabajdas() {
	double horasTrabajadas= tareasReaalizadas*1.5;
	return horasTrabajadas/60;
}
@Override
public String toString() {
	return "\nTeletrabajo [motivo=" + motivo + ", tareasReaalizadas=" + tareasReaalizadas + "]";
}

}
