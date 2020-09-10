package arrays;

public class Usuario {

	String nome;
	String email;

	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
}// o hascode sera abordado em outra aula, nesta aula nao foi necessario pois foi
	// um objeto com outro
	// vai falar mais pro fim do capitulo
