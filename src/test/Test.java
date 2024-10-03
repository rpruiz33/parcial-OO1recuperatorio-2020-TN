package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema=new Sistema();
		try {
			System.out.println(sistema.agregarTrabajoPresencial(LocalDate.of(2020, 10, 15),"1578", LocalTime.of(9,0), LocalTime.of(17,0)));;
			System.out.println(sistema.agregarTrabajoPresencial(LocalDate.of(2020, 10, 15),"3781", LocalTime.of(9,0), LocalTime.of(18,0)));;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println(sistema.agregarTeletrabjo(LocalDate.of(2020, 10, 15),"3782","pandemia",9));
			System.out.println(sistema.agregarTeletrabjo(LocalDate.of(2020, 10, 16),"3742","pandemia",7));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
		System.out.println(sistema.traerAsistencia(LocalDate.of(2020,10,15)));
		
		System.out.println(sistema.traerAsistencia(false));
	}

}
