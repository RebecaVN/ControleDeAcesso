
public class ControleDeAcesso {
	public static  void main (String []args){ 
		
		int idadeDoConvidado1 = 17;
		int idadeDoConvidado2 = 18;
		int idadeDoConvidado3 = 19;
		int acessoDoConvidado = idadeDoConvidado1;
		
		
		System.out.println("			Controle de Acesso");
		System.out.println(" ");
		
		
		
		if (acessoDoConvidado >= 18){
			System.out.println("O convidado pode entrar no recinto.");
		}else{
			System.out.println("O convidado n�o pode entrar no recinto, idade n�o permitida.");
		}
		
		
		
		if (idadeDoConvidado1 >= 18){
			System.out.println("O convidado pode entrar no recinto.");
		}else{
			System.out.println("O convidado n�o pode entrar no recinto, idade n�o permitida.");
		}
		
		
		if (idadeDoConvidado2 >= 18){
			System.out.println("O convidado pode entrar no recinto.");
		}else{
			System.out.println("O convidado n�o pode entrar no recinto, idade n�o permitida.");
		}
		
		
		if (idadeDoConvidado3 >= 18){
			System.out.println("O convidado pode entrar no recinto.");
		}else{
			System.out.println("O convidado n�o pode entrar no recinto, idade n�o permitida.");
		}
	}
}
