class TestaEmpresa{
    public static void main (String[] args){
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];

        for (int i=0; i<5; i++){
            Funcionario f = new Funcionario();
            f.setSalarioFunc(1000 + i * 100);
            // os 5 funcionarios com mesma data de admissão
            f.setDataAdmissao(1, 8, 2015);
            switch(i) { 
            // preenchi apenas alguns nomes
                case 0:
                    // aula6 exec 3 - teste de data errada - dia >31
                    f.setDataNascimento(32,9,1970);
                    break;
                case 1: 
                    f.setNomeFunc("Ana Maria"); 
                    // aula6 exec 3 - teste de data errada - mes >12
                    f.setDataNascimento(12,13,1970);
                    break;
                case 2: 
                    // aula6 exec 3 teste de data errada - ano bixesto inválido
                    f.setDataNascimento(29,2,2015);
                    break;
                case 3: 
                    f.setNomeFunc("Antonio");
                    // aula6 exec 3 teste de data errada - mes de 30 dias
                    f.setDataNascimento(31,4,2000);
                    break;
                case 4: 
                    f.setNomeFunc("Raul");
                    // aula6 exec 3 teste de data ano bixesto valido
                    f.setDataNascimento(29,2,2000);
                    break;

                default:f.setNomeFunc("INDETERMINADO");
            }

            empresa.adiciona(f);
        }
        empresa.mostraTodasAsInformacoes(); // utiliza o metodo mostra();

        Funcionario busca = new Funcionario();
        // teste com nome não existente
        busca.setNomeFunc("Joao");
            if (empresa.contem(busca))
                System.out.println(busca.getNomeFunc() + " Faz parte da base cadastrada!");
            else
                System.out.println(busca.getNomeFunc() + " NAO faz parte da base cadastrada!");

        // teste com nome existente
        busca.setNomeFunc("Eduardo");
            if (empresa.contem(busca))
                System.out.println(busca.getNomeFunc()+ " Faz parte da base cadastrada!");
            else
                System.out.println(busca.getNomeFunc() + " NAO faz parte da base cadastrada!");
    }
}
