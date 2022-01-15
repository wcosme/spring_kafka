<h1 align="center">Tutorial utilizando o Spring Cloud Feign e Kafka com Docker</h1>
<p align="center">Este repositório possui três projetos demonstrando o funcionamento do Spring Cloud Feign com o Kafka no Docker. Um microservice cliente para consumir a API de CEP usando o Feign, um microservice consumidor e um microservice produtor</p>
<h1 align="center">
    <a href="https://kafka.apache.org/">🔗 Kakfa</a>
</h1>
<h1 align="center">
    <a href="https://spring.io/">🔗 Spring</a>
</h1>
<h2 align="center"> 
	Running 🚀
</h2>
<p align="center">1º É necessário que você tenha o docker instalado em seu ambiente de trabalho</p>
<p align="center">2º Para subir o Kafka com o Zookeeper, execute o arquivo docker-compose.yml com o seguinte comando: docker-compose up -d </p>
<p align="center">3º Execute os dois projetos</p>
<p align="center">5º Envie uma requisição post para o projeto produtor na seguinte rota: http://localhost:8080/orders/save com um JSON no seguinte formato: {"code":"String", "nameProduct": "String" "value": "Numeric";}</p>
<p align="center">6º Confira no Zookeeper as mensagens que foram enviadas para o Kafka, essa parte eu deixarei com você. Abraços 😊
}</p>