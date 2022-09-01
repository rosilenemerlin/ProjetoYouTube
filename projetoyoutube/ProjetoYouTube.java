package projetoyoutube;

public class ProjetoYouTube {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 HTML5");

		Usuario u[] = new Usuario[2];
		u[0] = new Usuario("Jubileu", 22, "M", "Juba");
		u[1] = new Usuario("Maria", 25, "F", "Mah");

		Visualizacao vi[] = new Visualizacao[5];
		vi[0] = new Visualizacao(u[0], v[2]);
		vi[0].avaliar();
		System.out.println(vi[0].toString());

		vi[1] = new Visualizacao(u[0], v[1]);
		vi[0].avaliar(87.0f);
		System.out.println(vi[1].toString());

	}

}
