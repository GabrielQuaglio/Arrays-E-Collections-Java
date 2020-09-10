package arrays;

public class EqualsHashcode {
//nome de classe começa com maiuscula
	public static void main(String[] args) {
		
		
	Usuario u1 = new Usuario();
	u1.nome = "pedro";
	u1.email = "pedro.silva@ezemail.com.br";
	
	Usuario u2 = new Usuario();
	u2.nome = "pedro";
	u2.email = "pedro.silva@ezemail.com.br";
	
	System.out.println(u1 == u2);
	System.out.println(u1.equals(u2));//sem definirmos o criterio de comparaçao
	System.out.println(u2.equals(u1));
	
	
	
	
	}
}
