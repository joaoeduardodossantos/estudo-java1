class Funcionario {
    private String nome;
    private double salario;
    private String rg;
    private Data dataNascimento;

    public Funcionario(){    }

    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
            this.nome =  nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
            this.salario = salario;
    }

    public String getRg(){
        return this.rg;
    }

    public void setRg(String rg){
            this.rg=rg;
    }
 
    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(Data data){
        this.dataNascimento =  Data;
    }

    
    public double getGanhoAnual() {
        return this.salarioFunc * 12;
    }
    
    public void mostra() {
        System.out.println("Nome: " + this.nome + " \n Data Nascimento:     " + this.dataNascimento + "\n RG: " + this.rg + "\n Salario Atual: " + this.salario + " \n Ganho Anual: " + this.getGanhoAnual() +"\n");
        
    }
}
