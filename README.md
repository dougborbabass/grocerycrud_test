# Prova técnica de automação de teste

Este repositório tem por objetivo entregar a prova técnica proposta para QA.

Pontos relevantes deste projeto:

- Utilização do padrão Data Driven Testing permitindo que os parâmetros de testes sejam inseridos via arquivo .csv
- Utilização do padrão PageObjects mantendo boas práticas
- Utilização do padrão Page Factory:
	- Facilitação na fluência de códgio
	- Facilitação de manutenção e portabilidade para outras plataformas exemplo (Android, iOS)
- Evidências de teste através de screenshots.

## Rodando os testes

O projeto pode ser executado via linha de comando:

```sh
$ mvn clean test -Dtest=tests.ResolveDesafioTest
```


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

<dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>3.8.1</version>
            <scope>test</scope>
</dependency>

<dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.6</version>
</dependency>
```

## Observações

1. Alterar o caminho para o diretório dos screenshots de evidências na Classe suporte.Screenshot.java
O Caminho atual pode ser visto no examplo abaixo:

 ```java
	 public static String PATH_OUTPUT = "C:\\Users\\douglas.borba\\Desktop\\prova_testes\\prova_sicredi\\Teste Reporte\\";
```
