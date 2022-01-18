<h1 align="left">Tutorial utilizando o Spring Cloud Feign e Kafka com Docker e Kafdrop</h1>
<p align="left">Este repositório possui dois projetos demonstrando o funcionamento do Spring Cloud Feign com o Kafka no Docker. Um microservice cliente para consumir a API de CEP usando o Feign e produzir mensagens para o kafka e um microservice consumidor que fará a leitura dessas mensagens</p>
<h1 align="center">
    <a href="https://kafka.apache.org/">🔗 Kakfa</a>
</h1>

<h2 align="center"> 
	Running 🚀
</h2>
<p align="left">1º É necessário que você tenha o docker instalado em seu ambiente de trabalho</p>
<p align="left">2º Para subir o Kafka com o Zookeeper, execute o arquivo docker-compose.yml com o seguinte comando: docker-compose up -d </p>
<p align="left">3º Execute os dois projetos</p>
<p align="left">5º Envie uma requisição POST para o projeto produtor na seguinte rota: http://localhost:8081/api/v1/address com um JSON no seguinte formato: {"cep":"String", "complemento": "String", "numero": "Numeric"}</p>
<p align="left">6º Confira no KAFDROP as mensagens que foram enviadas para o Kafka. </p>