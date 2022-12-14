public class Principal {

	public static void main(String[] args) {
		
		Desenvolvedor profissional = new Desenvolvedor();
		Orçamento orcamento = new Orçamento();
			        
		System.out.println("Nome: " + profissional.nome);
		System.out.println("Salário Mensal Pretendido: " + profissional.VMD);
		System.out.println("Horas Mês: " + profissional.horasUteisMes);
		System.out.println("Valor/Hora: " + profissional.CalculaValorHora());
		System.out.println();


		ItemSistema[] listaItenSistemas = new ItemSistema[3];

		ItemSistema tela1 = new ItemSistema();
		tela1.nomeItem = "Tela de Login";
		tela1.tipoItem = "Telas com entradas e saídas de dados";
		tela1.complexidadeA = 1;
		listaItenSistemas[0] = tela1;

		ItemSistema tela2 = new ItemSistema();
		tela2.nomeItem = "Tela de Login";
		tela2.tipoItem = "Telas com entradas e saídas de dados";
		tela2.complexidadeA = 2;
		listaItenSistemas[1] = tela2;

		ItemSistema tela3 = new ItemSistema();
		tela3.nomeItem = "Tela de Login";
		tela3.tipoItem = "Telas com entradas e saídas de dado";
		tela3.complexidadeA = 3;
		listaItenSistemas[2] = tela3;

		int totalHorasTelas = 0;
		int numeroTela = 1;


		for (ItemSistema itemSistema : listaItenSistemas) {
		totalHorasTelas = totalHorasTelas + itemSistema.CalcularQuantidadeHoras();

		System.out.println("Item " + numeroTela + " do orçamento: " + itemSistema.nomeItem);
		System.out.println("Tipo do Item: " + itemSistema.tipoItem);
		System.out.println("Complexidade do Item: " + itemSistema.complexidadeA);
		System.out.println("Quantidade de Horas Previstas: " + itemSistema.CalcularQuantidadeHoras());
		System.out.println("");
	
		numeroTela = numeroTela + 1;
	}

		ItemSistema[] listaItenSistemas2 = new ItemSistema[3];

		ItemSistema tela4 = new ItemSistema();
		tela4.nomeItem = "Tela Principal";
		tela4.tipoItem = "Telas de consultas com informação de dados";
		tela4.complexidadeB = 1;
		listaItenSistemas2[0] = tela4;
  
		ItemSistema tela5 = new ItemSistema();
		tela5.nomeItem = "Tela Principal";
		tela5.tipoItem = "Telas de consultas com informação de dados";
		tela5.complexidadeB = 2;
		listaItenSistemas2[1] = tela5;
  
		ItemSistema tela6 = new ItemSistema();
		tela6.nomeItem = "Tela Principal";
		tela6.tipoItem = "Telas de consultas com informação de dados";
		tela6.complexidadeB = 3;
		listaItenSistemas2[2] = tela6; 
  
		int totalHorasTelas2 = 0;
		int numeroTela2 = 1;

		for (ItemSistema itemSistema : listaItenSistemas2) {
		totalHorasTelas2 = totalHorasTelas2 + itemSistema.CalcularQuantidadeHoras2();

		System.out.println("Item " + numeroTela2 + " do orçamento: " + itemSistema.nomeItem);
		System.out.println("Tipo do Item: " + itemSistema.tipoItem);
		System.out.println("Complexidade do Item: " + itemSistema.complexidadeB);
		System.out.println("Quantidade de Horas Previstas: " + itemSistema.CalcularQuantidadeHoras2());
		System.out.println("");
	
		numeroTela2 = numeroTela2 + 1;
	}

		ItemSistema[] listaItenSistemas3 = new ItemSistema[3];

		ItemSistema tela7 = new ItemSistema();
		tela7.nomeItem = "Tela de Cadastro";
		tela7.tipoItem = "Gravação de dados";
		tela7.complexidadeC = 1;
		listaItenSistemas3[0] = tela7;

		ItemSistema tela8 = new ItemSistema();
		tela8.nomeItem = "Tela de Cadastro";
		tela8.tipoItem = "Gravação de dados";
		tela8.complexidadeC = 2;
		listaItenSistemas3[1] = tela8;

		ItemSistema tela9 = new ItemSistema();
		tela9.nomeItem = "Tela de Cadastro";
		tela9.tipoItem = "Gravação de dados";
		tela9.complexidadeC = 3;
		listaItenSistemas3[2] = tela9;

		int totalHorasTelas3 = 0;
		int numeroTela3 = 1;


		for (ItemSistema itemSistema : listaItenSistemas3) {
			totalHorasTelas3 = totalHorasTelas3 + itemSistema.CalcularQuantidadeHoras3();
	
			System.out.println("Item " + numeroTela3 + " do orçamento: " + itemSistema.nomeItem);
			System.out.println("Tipo do Item: " + itemSistema.tipoItem);
			System.out.println("Complexidade do Item: " + itemSistema.complexidadeC);
			System.out.println("Quantidade de Horas Previstas: " + itemSistema.CalcularQuantidadeHoras3());
			System.out.println("");
	
			numeroTela3 = numeroTela3 + 1;

		}
		double valorTotalSistema = profissional.CalculaValorHora() * 
		(totalHorasTelas + totalHorasTelas2 + totalHorasTelas3);
		System.out.println("Valor Total do orçamento: " + valorTotalSistema);
		System.out.println("Valor total do sistema: " + Math.ceil(valorTotalSistema + (valorTotalSistema * 0.3)));
		orcamento.orcamentoFinal();		
	}

}
