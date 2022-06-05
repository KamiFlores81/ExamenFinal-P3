/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Clases.Grafo;

public class Main {
	static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		String[] municipios = { "Agua Blanca", "Asunci�n Mita", "Atescatempa", "Comapa", "Conguaco", "El Adelanto",
				"El Progreso", "Jalpatagua", "Jerez", "Jutiapa", "Moyuta", "Pasaco", "Quesada", "San Jos� Acatempa",
				"San Jos� Acatempa", "Yupiltepeque", "Zapotitl�n" };

		Grafo g = new Grafo(municipios);

		g.agregarRuta("Jutiapa", "Quesada", 3);
		g.agregarRuta("Zapotitl�n", "Jalpatagua", 4);
		g.agregarRuta("Pasaco", "Agua Blanca", 3);
		g.agregarRuta("Jutiapa", "Jerez", 3);
		g.agregarRuta("Zapotitl�n", "Jalpatagua", 4);
		g.agregarRuta("Atescatempa", "Conguaco", 3);
		g.agregarRuta("Asunci�n Mita", "Quesada", 3);
		g.agregarRuta("Zapotitl�n", "Jalpatagua", 4);
		g.agregarRuta("Atescatempa", "Agua Blanca", 3);
		g.agregarRuta("El Adelanto", "Asunci�n Mita", 3);
		g.agregarRuta("Zapotitl�n", "Jalpatagua", 4);
		g.agregarRuta("Atescatempa", "Agua Blanca", 3);
		g.agregarRuta("Jutiapa", "Asunci�n Mita", 3);
		g.agregarRuta("Zapotitl�n", "Jalpatagua", 4);
		g.agregarRuta("Atescatempa", "Agua Blanca", 3);

		String respuesta = g.encontrarRutaMinimaDijkstra("Jutiapa", "El Adelanto");
		System.out.println(respuesta);

	}
}
