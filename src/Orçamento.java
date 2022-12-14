public class Orçamento extends Desenvolvedor {
	
	public void orcamentoFinal() {
		Desenvolvedor profissional = new Desenvolvedor();

		System.out.println("Nome: " + profissional.nome);
		System.out.println("Quantidade de horas disponiveis: " + profissional.QHD);
		System.out.println("Valor mensal desejado: " + profissional.VMD);
		System.out.println("Horas uteis: " + profissional.horasUteisMes);
		System.out.println("Valor hora: " + profissional.CalculaValorHora());
		return;
	}
}
