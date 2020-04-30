class Empresa{
    String cnpj;
    String empresa;
    Funcionario[] empregados;
    int livre = 0;

    void adiciona(Funcionario f){
            this.empregados[this.livre] = f;
            this.livre++;
    }

    public void mostraEmpregados(){
        for (int i=0; i<this.livre;i++){
            System.out.print("Funcionario na pos.: " + i);
            System.out.println(" Nome: " + this.empregados[i].getNomeFunc());
            System.out.print("Salario: R$ " + this.empregados[i].getSalarioFunc() + " Ganho Anual: R$ " + this.empregados[i].getGanhoAnual() +"\n");
            System.out.println("Data de Admissao:    " + this.empregados[i].getDataAdmissao());
            System.out.println("============================================");
        }
    }

    public void mostraTodasAsInformacoes(){
        for (int x=0; x < this.livre; x++){
            System.out.println("Funcionario na pos.: " + x);
            this.empregados[x].mostra();
        }
    }

    boolean contem(Funcionario f){
        for (int i = 0; i<this.livre; i++){
            if (f.getNomeFunc() == this.empregados[i].getNomeFunc()){
                return true;
            }
        }
        return false;
    }
}
