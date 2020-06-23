
Nesta aula explicamos e detalhamos como funciona o uso do recurso de Profiles. Com este recurso, é possível fazer a separaçõ das propriedades de execução referentes a cada tipo de ambiente: local, teste, produção, etc.

Durante a aula, são abordados os seguintes tópicos:

    Configuração de ambientes com o arquivos em formato .properties e uso das configurações com @Profile.


Criação do projeto com spring.initialzr e importação na IDE.   
Criação de arquivos application.properties para dev e prod.
    - Em Main/java/resources vc cria outros application properties com as configurações dos ambientes diferentes (Staging, prod, dev)
        * application-dev.properties
        * application-prod.properties


- Desenvolvimento de classe de configuração de BD e anotação com @Configuration.
foi criado dentro do package springbootconfig/config a classe DBConfiguration.


Mapeamento de propriedades com @ConfigurationProperties na classe de configuração acima.
Métodos para instanciação de Beans de banco de dados para cada ambiente.
Desenvolvimento de classe para execução no Browser anotada com @RestController.
Injeção da propriedade app.message na variável appMesagge do Controller com a anotação @Value.
Criação de método para retornar a mensagem injetada acima.
Execução do projeto no browser.



Para executar o projeto com o profile prod como padrão, altere a seguinte propriedade no arquivo application.properties:

spring.profiles.active=prod



    Configuração de ambientes com o arquiv os em formato .yml e uso das configuraçõees com @Profile.
Sobrescrita de configurações através de argumentos durante a execução do projeto no terminal.
Sobrescrita de configurações através de variáveis de ambiente e injeção destes valores diretamente no projeto.
Os exercícios dentro deste projeto contemplam cada um dos tópicos acima, respectivamente.

Dentro de cada uma das pastas, constam as instruções de como executar cada um dos projetos.

São necessários os seguintes pré-requisitos para a execução dos projetos da aula:

Java 8 ou versões superiores.
Maven 3.5.2 ou versões superiores.
Intellj IDEA Community Edition ou sua IDE favorita.
Muita vontade de aprender e compartilhar conhecimento :)



