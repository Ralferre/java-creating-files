# Programação Orientada a Objetos

## Encapsulamento

Utilizamos o encapsulamento quando desejamos que os métodos que invocam nossa classe não alterem seus atributos. Ou seja, forçamos que seja obrigatoriamente utilizado a mesma estrutura, ou melhor, os atributos definidos na classe. Com isso, utilizamos os métodos GET e SET para tal.
Procedemos da seguinte forma:

    class Cliente {
        String nome;
        String telefone;

        String getNome() {
            return nome;
        }

        void setNome(nome) {
            this.nome = nome;
        }

        String getTelefone() {
            return telefone;
        }

        void setTelefone(telefone) {
            this.telefone = telefone
        }
    }
O objetivo de aplicar o encapsulamento é reduzirmos quantidade de revisões nas linhas de código do método MAIN Principal. Ou seja, nas classes e métodos tratamos possíveis inconsistências individuais que cada classe pode trazer, simplificando ao máximo as linhas de código no MAIN e, a organização do nosso código.

## Leitura e Escrita de Dados em Arquivos

Neste capítulo vamos estudar sobre a leitura e escrita de dados em arquivos. Até então, para obtermos dados de uma forma mais dinâmica, utilizamos o método Scanner. Agora, vamos estudar um outro método. Para exibirmos essas informações, utilizávamos o método System.out.println para exibir no console as informações aos usuários.
Então vamos aprender como escrever informações em arquivos de texto.

Para escrevermos em um arquivo, utilizamos o comando Files
Precisamos passar o caminho onde o arquivo será salvo.

## Lendo um Arquivo

Da mesma maneira que utilizamos um método para escrever, temos um método para leitura de um arquivo, passando o Path onde o mesmo está salvo.
Para leitura, utilizamos o comando abaixo:

    Path arquivo = Paths.get("caminho ou diretório onde está salvo o arquivo");

Salientamos que esse método retorna um ArrayList, o qual devemos considerar para armazenar o retorno em variável apropriada.

    List<String> linhasLidas = Files.readAllLines(arquivo);

## Bibliotecas x Frameworks

Podemos enviar e-mails utilizando o Java, basta utilizar a bib;ioteca do Java e Apache Commons, as quais possuem os métodos para tal. Com esses métodos, basta copiarmos as linhas de código e alterar os dados, como e-mail remetente, e-mail destinatário, assunto e conteúdo do e-mail. Podemos trabalhar neste como método, sendo ele invocado pelo Main.

Basicamente são códigos criados por terceiros que utilizamos para elaborar nosso código.
Poddmos criar nossas próprias bibliotecas, criando métodos para reduzir quantidade de linhas de código. Um exemplo feito foi a criação de métodos para substituir a necessidade de uso do Scanner. Ao invés de declararmos e chamarmos o método scanner, criado a biblioteca para uso passando o texto de informe ao usuário e já lendo o dado digitado.
Para utilizar a biblioteca, én necessário adicionar o path, foi mostrado isto utilizando a IDE Eclipse. Necessário estudar como inserir no VSCode.

## Projetos Avançados em Java - Criando uma Lista Dinâmica

Aqui foi utilizado métodos e manipulação de arrays, tanto para remoção quanto para ordenação de elementos dentro de um array.

## Primeira Aplicação Web Usando Java

Por onde começar a criar uma alicação Web? Para construirmos essa aplicação, utilizaremos um Freamework, que nada mais é que um projeto que foi criado para facilitar os desenvolvedores construir alguma aplicação.
A aplicação Web nada mais é do que àquela aplicação que roda a partir de um Browser. Neste caso, utilizaremos o Framework Spring Boot. Podemos acessar o site da Spring para obtermos mais informações não só do Spring Boot, mas de outras ferramentas e Frameworks.
No site spring.io/tools temos o link para fazermos download da Spring Tool Suite.

Alguns conceitos de HTML:
    - Apresentada a tag <header> e </header> que é como se fosse o cabeçalho do nosso documento;
    - Apresentada a tag <footer> e </footer> que é o rodapé do nosso documento;

## Criando um Projeto Spring Boot

Ao criarmos um projeto Spring Boot, devemos setar algumas informações solicitadas pela IDE, as quais são:
    - Nome: WebAppJava, onde as letras iniciais de cada palavra devem estar com letra maiúscula;
    - Group: pode ser qualquer nome, por convenção fica o domínio ao contrário, por exemplo com.hotmail;
    - Artifact: pode deixar tudo minúsculo;
    - Version: não precisa alterar, setado default 0.0.1-SNAPSHOT;
    - Package: podemos deixar o mesmo nome do que inserimos no campo Group;
    - Dependencies: no caso da aplicação Web, selecionamos a opção Web. Temos uma funcionalidade de processar arquivos HTML, o qual chama Thymeleaf. Outra opção a DevTools o qual provê algumas funcionalidades que o Framework disponibiliza durante o desenvolvimento do código.
    - Versão do Spring Boot: 1.5.2 podemos tentar manter essa versão. Uma versão superior que tenha SNAPSHOT à frente dela, quer dizer que a mesma não está 100% concluída;
    