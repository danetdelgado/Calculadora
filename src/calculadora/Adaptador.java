package calculadora;

public class Adaptador implements Calculadora {
	 public int suma(
	   int valor1,
	   int valor2) {
	  return Procesador.operaciones(
	    valor1,
	    valor2,
	    Procesador.SUMA);
	 }
	 
	 public int resta(
	   int valor1,
	   int valor2) {
	  return Procesador.operaciones(
	    valor1,
	    valor2,
	    Procesador.RESTA);
	 }
	 
	 public int multiplicacion(
	   int valor1,
	   int valor2){
	   return Procesador.operaciones(
		valor1,
		valor2,
		Procesador.MULTIPLICACION);

		  }
	 
	 }