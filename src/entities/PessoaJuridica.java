package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numerosFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numerosFuncionarios) {
		super(nome, rendaAnual);
		this.numerosFuncionarios = numerosFuncionarios;
	}

	public Integer getNumerosFuncionarios() {
		return numerosFuncionarios;
	}

	public void setNumerosFuncionarios(Integer numerosFuncionarios) {
		this.numerosFuncionarios = numerosFuncionarios;
	}

	@Override
	public Double imposto() {
		if (numerosFuncionarios < 10)
			return getRendaAnual() * 0.16;  
		else return getRendaAnual() * 0.14; 
	}

}
