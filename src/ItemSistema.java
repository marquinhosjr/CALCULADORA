public class ItemSistema {
    public String nomeItem;
    public String tipoItem;
    public int complexidadeA = 1;
    public int complexidadeB = 1;
    public int complexidadeC = 1;


    public int CalcularQuantidadeHoras() {
        int qtdHoras = 0;

        switch (complexidadeA) {
            case 1:
                qtdHoras = 8;
                break;
            case 2:
                qtdHoras = 12;
                break;
            default:
                qtdHoras = 16;      
    }
        return qtdHoras;
}

    public int CalcularQuantidadeHoras2() {
        int qtdHoras2 = 0;

        switch (complexidadeB) {
            case 1:
                qtdHoras2 = 4;
                break;
            case 2:
                qtdHoras2 = 6;
                break;
            default:
                qtdHoras2 = 8;      
}
    return qtdHoras2;

    }

    public int CalcularQuantidadeHoras3() {
        int qtdHoras3 = 0;

        switch (complexidadeC) {
            case 1:
                qtdHoras3 = 16;
                break;
            case 2:
                qtdHoras3 = 24;
                break;
            default:
                qtdHoras3 = 36;      
}
    return qtdHoras3;

    }
}
