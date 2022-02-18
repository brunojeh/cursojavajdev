package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
Aluno aluno1 = new Aluno();
		
		aluno1.setNome("João");
		aluno1.setIdade(33);
		aluno1.setDataNascimento("04/06/1988");
		aluno1.setRegistroGeral("54135465456");
		aluno1.setNumeroCpf("6621563265");
		aluno1.setNomeMae("Jubiscleusa");
		aluno1.setNomePai("Ariosvaldo");
		aluno1.setDataMatricula("25/02/2015");
		aluno1.setSerieMatriculado("5 ano");
		aluno1.setNomeEscola("Jdev treinamento");
		aluno1.setNota1(90);
		aluno1.setNota2(75);
		aluno1.setNota3(63);
		aluno1.setNota4(98);
		
		System.out.println("O nome do aluno é " + aluno1.getNome());
		System.out.println("Idade é " + aluno1.getIdade());
		System.out.println("Data de nascimento é " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		
		System.out.println("---------------------------------------------------------------");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(33);
		aluno2.setDataNascimento("04/06/1988");
		aluno2.setRegistroGeral("54135465456");
		aluno2.setNumeroCpf("6621563265");
		aluno2.setNomeMae("Jubiscleusa");
		aluno2.setNomePai("Ariosvaldo");
		aluno2.setDataMatricula("25/02/2015");
		aluno2.setSerieMatriculado("5 ano");
		aluno2.setNomeEscola("Jdev treinamento");
		
		System.out.println("O nome do aluno é " + aluno2.getNome());
		System.out.println("Idade é " + aluno2.getIdade());
		System.out.println("Data de nascimento é " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Bruno", 33);

	}

}
