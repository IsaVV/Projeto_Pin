# Projeto_Pin
## Projeto direcionado para área de Laminação da metalurgica Gerdau.
====================================================================
Equipe:

Gustavo Lima de Vasconcelos Moura

Pedro Monteiro Azevedo de Moura Almeida

Isadora Vasconcelos Viana

2021.1

# Tecnologias
Para a criação do sistema, utilizamos tecnologias que permitam a criação de uma API e a execução das requisições, são elas o Spring Boot, pgAdmin e Postman.
O Spring Boot é uma ferramenta que visa facilitar o processo de configuração e publicação de aplicações que utilizem o ecossistema Spring, ele fornece a maioria dos componentes baseados no Spring necessários em aplicações em geral de maneira pré-configurada, tornando possível termos uma aplicação rodando em produção rapidamente.
O Spring Boot permite ainda selecionarmos os módulos que desejamos utilizar: com configurações rápidas, você consegue, por exemplo, disponibilizar uma aplicação baseada no Spring MVC, utilizando o Hibernate + JPA.
O pgAdmin nada mais é do que um administrador do banco de dados PostgreSQL, nele podemos visualizar detalhes como a criação das tabelas que utilizamos no código.
Por fim, o Postman é um API Client que facilita aos desenvolvedores criar, compartilhar, testar e documentar APIs. Isso é feito, permitindo aos usuários criar e salvar solicitações HTTP e HTTPs simples e complexas, bem como ler suas respostas.

# arquitetura
Para este projeto a equipe de CC decidiu utilizar a arquitetura MVC, que nada mais é do que um padrão de arquitetura de software, que separa sua aplicação em 3 camadas. A camada de interação do usuário(View) ela apenas faz a exibição dos dados, a camada de manipulação dos dados(Model) ela é responsável pela leitura, escrita e validação de dados, e por último a camada responsável por fazer a ligação dessas duas que é a camada de controle(Controller), ela recebe todas as requisições do usuário, faz a solicitação para o Model e em seguida retorna a resposta para a View
