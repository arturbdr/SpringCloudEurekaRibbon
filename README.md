# SpringCloudEurekaRibbon
Nesse repositório estão contidos 4 projetos do tipo SpringCloud:

- SpringCloudEurekaServer
- SpringCloudEurekaClient-Adjetivo
- SpringCloudEurekaClient-Pronome
- SpringCloudEurekaRibbonClientSentenca
 
--

- SpringCloudEurekaServer

Mesmo comportamento do projeto disponibilizado em https://github.com/arturbdr/SpringCloudEureka/tree/master/SpringCloudEurekaServer

- SpringCloudEurekaClientAdjetivo

Mesmo comportamento do projeto disponibilizado em https://github.com/arturbdr/SpringCloudEureka/tree/master/SpringCloudEurekaClient-Adjetivo A diferença nesse caso é a configuração foi feita no arquivo src\main\resources\bootstrap.properites
para que o Eureka Server permita subir mais de uma instância desse projeto no mesmo host (máquina). Como sugestão para rodar esse projeto, utilizar o cmd/shell e rodar o comando mvn spring-boot:run em mais de 1 instância para fazer
o teste do Ribbon.

- SpringCloudEurekaClientPronome

Mesmo comportamento do projeto disponibilizado em https://github.com/arturbdr/SpringCloudEureka/tree/master/SpringCloudEurekaClient-Pronome A diferença nesse caso é a configuração foi feita no arquivo src\main\resources\bootstrap.properites
para que o Eureka Server permita subir mais de uma instância desse projeto no mesmo host (máquina). Como sugestão para rodar esse projeto, utilizar o cmd/shell e rodar o comando mvn spring-boot:run em mais de 1 instância para fazer
o teste do Ribbon.

- SpringCloudEurekaRibbonClientSentenca
 
Esse é o projeto que fará uso do LoadBalance de aplicação (Ribbon) assim como http client binder Feign. A diferença desse projeto para o anterior (que chamava diretamente o servidor Eureka) é adicionar duas novas dependência no pom para fazer uso do
LoadBalancerClient (Ribbon) e o HttpClient Binder Feign. 

Abaixo segue o macro diagrama dos projetos:

![Modelo de Dados](https://github.com/arturbdr/SpringCloudEurekaRibbon/blob/master/documentacao/img/descricaoProjetos.png "")
