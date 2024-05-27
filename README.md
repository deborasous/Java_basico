# java-basico

## JAVADOC
https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html
https://glysns.gitbook.io/java-basico/sintaxe/documentacao

O comando javadoc analisa as declarações e comentários da documentação um conjunto de arquivos do tipo java e cria um conjunto correspondente de páginas HTML que descrevem as classes públicas e protegidas, classes aninnhadas, interfaces, cosntrutores, métodos e campos. Documenta as API dos dos programas em JAVA a partir do código fonte.

Criar a documentação a partir da linha de código abaixo;
```
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
```

### Execução recursiva de um ou mais pacotes: 
Executa a partir de qualquer diretório, ele percorre os subpacotes, excluindo pacotes com raiz em java.nete java.lang.
```
javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs -sourcepath src -subpackages com.yourpackage -exclude java.net:java.lang
```
ou sem requisitos específicos:
``` 
javadoc -sourcepath src -subpackages com.yourpackage -exclude java.net:java.lang
```

## Terminais
Iteração de entradas e saídas de dados através de consoles e terminais.

O JVM deve está instalada e configurada, assim, é possível criar um executável do programa Java e disponibilizar para qualquer sistema operacionl.

### Executando pela IDE VSCODE
* Instala a extensão **Extension Pack for Java8**, deve instalar várias extensões junto.

* Depois de instalado, pesquisa por **java** na pesquisa, encontra o **Debugger for Java**, vai no icone de engrenagem e **Extension Settings** e altera **Java › Debug › Settings: Console** para **InternalConsole**

*Se necessário, afechar e abrir novamente o VSCode*

Agora é possível executar o programa a partir do icone de play que será mostrado no lado direito superior, quando o arquivo .java (que deseja executar) estiver aberto.

### Executando por SMD
* Identificar onde se encontram as classes do projeto (caminho para o projeto no computador)
* Com o CMD aberto, usar o comando abaixo para localizar o diretório ou vai direto no projeto(deve entrar na pasta **bin**, que deve está no mesmo nível hierárquico do src ), na pasta de arquivos, clica na barra de pesquisa, copia o endereço e substitui no comando abaixo:
```
cd nome-do-arquivo/pasta 
```
Depois executa a classe
```
java MinhaClasse
```

*Caso ocorrar algum erro indicando que a classe não foi encontrada devido a classe principal estiver em outro arquivo ou algo do tipo...*
Executar o código abaixo dentro da pasta principal do projeto, este comando compila a classe Main.java e MinhaClasse.java, colocando os arquivos .class no diretório **bin**, pelo terminal, sempre que houver uma alteração, é necessário executar a linha de codigo para atualizar o bin:
```
javac -encoding UTF-8 -d bin src\Main.java src\MinhaClasse.java
```
Depois executa novamente
```
java MinhaClasse
```

## Argumentos (Entredas/saídas de dados)
Exemplo: **sobre-mim/**

Recebendo parametros externos via SMD, como se houvesse iteração do usuário com o programa.
O método main, permite passar um array de de argumentos do tipo string.
Assim, passa os argumentos após executar a classe no terminal
*java MinhaClasse agumentoUm argumentoDois*
```
java AboutMe Debora Sous 36 1.58
```

## Class Scanner (Entredas de dados) via IDE
Exemplo: **sobre-mim/**
Outra forma de receber dados do usuário de forma segura é usando a classe Scanner.