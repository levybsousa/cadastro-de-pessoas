# Cadastro de Pessoa

* Este é um sistema destinado ao cadastro de pessoas.

* Os usuários que acessam o sistema têm a capacidade de salvar, alterar, deletar e buscar 
outros usuários dentro do banco de dados local do sistema.
* Como regra de negócio, foi estabelecido que um usuário não pode
ser salvo se já existir no banco com o mesmo nome.
Essa regra é implementada nos métodos save e update do sistema.
* No método save, uma variável recebe o retorno de um método,
um método que acessa o banco de dados da API, retornando um 
Optional<Pessoa>. Se a pessoa já estiver cadastrada no sistema,
uma exceção será lançada; caso contrário, o objeto fornecido 
na requisição será salvo no banco de dados.
No método update, inicialmente, é realizada a verificação do 
identificador fornecido na requisição. Se o identificador 
for encontrado, uma variável recebe o retorno de  um método 
que se conecta ao banco de dados da API, retornando 
um Optional<Pessoa>. Em seguida, é feita a comparação do
identificador fornecido pelo usuário com o identificador 
armazenado no banco de dados. Se os identificadores forem 
diferentes, uma exceção será lançada; caso contrário,
um novo objeto será armazenado no sistema.


