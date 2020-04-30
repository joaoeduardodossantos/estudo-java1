class Data{
    private int dia;
    private int mes;
    private int ano;

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String dataFormatada(){
        // ###fazendo validação da data (aula06 exerc 03)
        /* como a entrada ainda é manual, isto é,
           não é feita em tempo de execução do programa,
           optei por mostrar a data dizendo que é inválida
        */
        // teste mais amplo (dia de 1 a 31, mes de 1 a 12)
        if(dia <= 0 || dia >= 32 || mes <= 0 || mes >=13){
            return this.dia+"/"+this.mes+"/"+this.ano+" Data invalida";
        }
        // meses de 30 dias
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia == 31)){ 
            return this.dia+"/"+this.mes+"/"+this.ano+" eh mes de 30 dias";
        }
        // mes de fev
        if ((mes == 2) && (dia >= 30)) {
            return this.dia+"/"+this.mes+"/"+this.ano+" fev NAO tem mais que 29 dias";
        }
        if ((mes == 2) && (ano % 4 != 00) && (dia == 29)){ 
            return this.dia+"/"+this.mes+"/"+this.ano+" NAO eh ano bixesto";
        }
        // se tudo certo volte a data formatada
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
}
