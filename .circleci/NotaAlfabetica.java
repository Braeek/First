
public class NotaAlfabetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota =  (double) (Math.random() *10);	
		System.out.println("La nota del alumno es " + nota);
	
	
	if (nota<0) {
		System.out.println("nota inválida");
		}
	else if (nota<5) {
		System.out.println("Insuficiente");
		}
	else if (nota<6) {
		System.out.println("Suficiente");
		}
	else if (nota<7) {
		System.out.println("Bien");
		}
	else if (nota<9) {
		System.out.println("Notable");
		}
	else {
		System.out.println("Sobresaliente");
		
		}
	}
}
