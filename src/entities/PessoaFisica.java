package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastoSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastoSaude) {
		this.gastosSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		
		if (getRendaAnual() < 2000)
			return getRendaAnual() * 0.15 - gastosSaude * 0.5;  
		else return getRendaAnual() * 0.25 - gastosSaude * 0.5; 
	}

}
