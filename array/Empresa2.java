
        public class Empresa {
            private Funcionario[] empregados;
            private String cnpj;
            private int livre = 0;

            public Empresa(String cnpj) {
                this.cnpj = cnpj;
                this.empregados = new Funcionario[10];
            }

            public String getCnpj() {
                return this.cnpj;
            }

            // outros métodos, quase todos public
            // note que o aumentaArray, se escrito deve ser private
        }