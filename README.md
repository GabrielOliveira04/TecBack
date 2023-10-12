# TecBack
## Projeto techback para disciplinas tecnologias  back end
### Projeto de API RESTful - Desenvolvimento Back-End

### Os seguintes alunos participaram desse projeto:
 - Gabriel de Oliveira Pontes
 - Matheus L S Maul de Andrade

Este é um projeto de API RESTful que foi desenvolvido como parte de um projeto acadêmico na faculdade.
A API é construída usando o framework Java Spring e oferece funcionalidades para gerenciar filmes, séries, temporadas e assinaturas de usuários.
## Funcionalidades Principais

### Gerenciamento de Filmes

- Cadastre e gerencie informações sobre filmes, como título, sinopse, gênero, duração, ano de lançamento e elenco.
- Controle o número de visualizações de cada filme.

### Gerenciamento de Séries

- Crie e gerencie séries, incluindo detalhes como título, descrição, elenco, classificação e ano de lançamento.
- Associe temporadas às séries e defina o número total de episódios para cada temporada.
- Registre as visualizações de séries.

### Controle de Assinaturas

- Defina diferentes tipos de planos de assinatura: Básico, Padrão e Premium.
- Associe assinaturas aos usuários e controle o status de ativação.
- Valide informações de pagamento, incluindo números de cartão de crédito.

### Controle de Acesso
  - Implemente lógica de controle de acesso com base nos tipos de plano de assinatura dos usuários.
  - Restrinja o número de visualizações de filmes e séries com base no plano de assinatura.
## Recursos Principais

- Criação e gerenciamento de filmes e séries.
- Associação de temporadas às séries.
- Controle de assinaturas de usuários.
- Limitação de acesso com base em tipos de plano de assinatura.

## Tecnologias Utilizadas

- Java Spring
- JPA/Hibernate para persistência de dados
- Banco de dados H2 (para fins de demonstração)
- Jakarta Persistence (JPA) para mapeamento objeto-relacional
- Validação de entrada com anotações Java
- Logback para registro de atividades
- Documentação da API com o Swagger

## Executando o Projeto

1. Clone o repositório.
2. Importe o projeto em sua IDE Java Spring.
3. Configure o banco de dados de acordo com suas necessidades.
4. Execute o aplicativo.

## Documentação da API

A API é documentada usando o Swagger, o que facilita a compreensão dos endpoints e dos recursos disponíveis. Você pode acessar a documentação em http://localhost:8080/swagger-ui.html após a execução do aplicativo.

## Contribuindo

Este é um projeto de demonstração para fins acadêmicos, e não estamos aceitando contribuições externas no momento.

## Licença

Este projeto é licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

