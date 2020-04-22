# Prova técnica de automação de teste

Este repositório tem por objetivo entregar a prova técnica proposta para QA.

O projeto realizado faz uso do padrão Data Driven Testing, permitindo que os parâmetros de testes sejam inseridos via arquivo .csv, também conta com um diretório para test report com screenshot dos testes.

## Dependências

Dependências usadas para realização do projeto.

```bash
<dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
</dependency>

<dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
</dependency>

<dependency>
            <groupId>org.easetech</groupId>
            <artifactId>easytest-core</artifactId>
            <version>1.4.0</version>
</dependency>
```

## Observações

Ambas alterações seram feitas no pacote "suporte"

1. Alterar o caminho para o diretório do chrome driver na Classe WebSetup.java.
O Caminho atual pode ser visto no examplo abaixo:

 ```java
	 System.setProperty("webdriver.chrome.driver",
                "C:\\Selenium\\drivers\\chrome\\x32_80.0.3987.106\\chromedriver.exe");
```

2. Alterar o caminho para o diretório dos screenshots de evidências na Classe Screenshot.java
O Caminho atual pode ser visto no examplo abaixo:

 ```java
	 public static String PATH_OUTPUT = "C:\\Users\\douglas.borba\\Desktop\\prova_testes\\prova_sicredi\\Teste Reporte\\";
```
