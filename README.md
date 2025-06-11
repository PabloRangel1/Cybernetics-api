💼 Sistema de Cadastro de Colaboradores com Tarefas
 Projeto Full Stack com Spring Boot + Thymeleaf + JPA (Hibernate) + SQLite
🔗 Repositório: [https://github.com/PabloRangel1/CadastroDeColaboradores]

📌 Descrição Geral
Desenvolvi um sistema completo de cadastro e gerenciamento de colaboradores, integrando a interface web (com Thymeleaf) a uma API RESTful. O projeto permite cadastrar, visualizar, editar e excluir colaboradores, além de associá-los a tarefas específicas dentro da organização.

A aplicação foi projetada com boas práticas de arquitetura, separando responsabilidades entre controller, service, DTO, model e mapper, além de possuir duas camadas de acesso: interface de usuário (UI) e API REST.

🛠️ Tecnologias Utilizadas
Back-end:

Java 17

Spring Boot (Web, Data JPA)

Hibernate (ORM)

SQLite

Front-end:

Thymeleaf (template engine para Spring)

HTML5 / CSS3

Documentação:

Swagger (OpenAPI 3.0)

Lombok para reduzir boilerplate de código (getters, setters, construtores etc.)

📂 Funcionalidades Implementadas
🔗 API REST (/emp)
GET /emp/boasvindas – Rota de teste com mensagem de boas-vindas

POST /emp/criar – Cadastro de novo colaborador

GET /emp/listar – Listagem de todos os colaboradores

GET /emp/listar/{id} – Buscar colaborador por ID

PUT /emp/alterar/{id} – Atualização de dados de um colaborador

DELETE /emp/deletar/{id} – Exclusão por ID

🖥️ Interface Web (/emp/ui)
Página para cadastrar novo colaborador

Listagem com todos os colaboradores registrados

Visualização detalhada de um cybernetic

Formulário de edição e opção de exclusão

Feedback ao usuário com mensagens de sucesso ou erro

📋 Tarefas
Cada colaborador pode estar associado a uma única tarefa

Tarefa é um objeto separado e persistido no banco (TarefasModel)

Relação de @ManyToOne no lado do colaborador, e @OneToMany no lado da tarefa

🔄 Camadas da Aplicação
DTO (Data Transfer Object): abstração de dados entre a camada de persistência e a exibição

Model: representação das entidades do banco de dados (JPA)

Repository: abstração de queries usando Spring Data JPA

Service: camada responsável pela regra de negócio

Controller (UI + API): endpoints RESTful e rotas web para renderização com Thymeleaf

Mapper: conversão entre DTOs e Models

📈 Objetivos do Projeto
Praticar e consolidar conhecimentos em Spring Boot com MVC e JPA

Trabalhar com entidades relacionadas em banco de dados

Criar uma aplicação real com padrões profissionais

Integrar front-end e back-end em um único sistema

