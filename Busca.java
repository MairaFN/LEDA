package atividade00;

public class Busca implements Busca_IF {

	@Override
	public Pessoa buscaLinearIterativa(Pessoa[] pessoas, int idade) throws IdadeNegativaException {
		if (idade < 0) {
			 throw new IdadeNegativaException("IDADE NEGATIVA INVALIDA");
		}
		for (int i = 0; i < pessoas.length; i++) {
			
			if (pessoas[i].getIdade() == idade) {
				return pessoas[i];
			}
		}
		return null;
	}

	@Override
	public Pessoa buscaLinearRecursiva(Pessoa[] pessoas, int idade) throws IdadeNegativaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa buscaBinariaIterativa(Pessoa[] pessoas, int idade) throws IdadeNegativaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa buscaBinariaRecursiva(Pessoa[] pessoas, int idade) throws IdadeNegativaException {
		// TODO Auto-generated method stub
		return null;
	}

}
