package curso_java;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Programa {

	public static void main(String[] args) throws Exception {
		bomDia();

	}

	public static void lista() {
		List<String> lista = new ArrayList<>();

		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add("Gerleny");
		lista.add("Lucas");
		lista.add("Davi");
		lista.add("Esther");
		lista.add("Terezinha");

		System.out.println();
		System.out.println("########################################");
		System.out.println();

		System.out.println("Impressão de Lista");

		for (String x : lista) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("########################################");
		System.out.println();

		System.out.println("Inserir elemento");
		lista.add(2, "Diego");

		for (String x : lista) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("########################################");
		System.out.println();

		System.out.println("Tamanho da Lista");

		System.out.println(lista.size());

		System.out.println();
		System.out.println("########################################");
		System.out.println();

		System.out.println("Remover elemento da lista : Alex");

		lista.remove("Alex");

		for (String x : lista) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("########################################");
		System.out.println();

		System.out.println("Remover elemento da lista na posição do index: Diego(1)");

		lista.remove(1);

		for (String x : lista) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("########################################");
		System.out.println();

		System.out.println("Remover elemento da lista por predicado");

		System.out.println();

		System.out.println("Lista antes da remoção");
		System.out.println();

		for (String x : lista) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("Lista depois da remoção");
		System.out.println();

		lista.removeIf(x -> x.charAt(0) == 'M');

		for (String x : lista) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("########################################");
		System.out.println();

		System.out.println("IndexOf: Identificar index do elemento");

		System.out.println("---------------------");
		System.out.println("Index Of Gerleny: \n" + "(Posição de elemento): " + lista.indexOf("Gerleny"));
		System.out.println("Index Of Salomão: \n" + "(Não Consta na lista):  " + lista.indexOf("Salomão"));

		System.out.println();
		System.out.println("########################################");
		System.out.println();

		System.out.println("Filtrar todos que começa com a letra A");

		for (String x : lista) {
			System.out.println(x);
		}

	}// FIM METODO LISTA

	public static void data() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		
//		Date y1 = sdf.parse("25/06/2019");
//		Date y2 = sdf2.parse("25/06/2019 15:59:49");
//		
//		System.out.println(sdf2.format(y1));
//		System.out.println(sdf2.format(y2));

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
				
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DAY_OF_MONTH, 2);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));


//		int minutes = cal.get(Calendar.MINUTE);
//		int month = 1 + cal.get(Calendar.MONTH);
//		System.out.println("Minutes: " + minutes);
//		System.out.println("Month: " + month);
	}
	
	public static void bomDia() {
		System.out.println("Bom dia!");
		
		Date dt = new Date();
		System.out.println(dt);
		System.out.println("######################################################");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf2.format(dt));

	}
}
