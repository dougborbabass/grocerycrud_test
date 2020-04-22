# Prova técnica de automação de teste

Este repositório tem por objetivo entregar a prova técnica proposta para QA.

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
O projeto realizado faz uso do padrão Data Driven Testing, permitindo que os parâmetros de testes sejam inseridos via arquivo .csv, também conta com um diretório para test report com screenshot dos testes.
