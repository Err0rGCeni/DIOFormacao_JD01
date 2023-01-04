# Sintaxes em Java

## Classes

Se a classe é executável, precisa de um método principal (_main_): `public static void main (String [] args) {}`;

- A classe deve possuir o mesmo nome do arquivo.

## Tipos e Variáveis

São oitos tipos primitivos (não são considerados objetos, representam valores brutos):

- Inteiros:
  - _byte_: 1 byte, -128 ~ 127 ((2^8)/2);
  - _short_: 2 bytes, -32768 ~ 32767 ((2^16)/2);
  - _int_: 4 bytes (mais comum, JVM tenta converter para int);
  - _long_: 8 bytes;
    - Precisa terminar a declaração com um L.

- Decimais:
  - _float_: 4 bytes (-3.4028e38 ~ 3.4028e38);
    - Precisa terminar a declaração com um F.
  - _double_: 8 bytes (-1.7976e308 ~ -1.7976e308) (mais comum);

- Outros:
  - _boolean_: 1 bit;
  - _char_: 2 bytes;

Java é fortemente tipado, uma atribuição de um tipo menor para um tipo maior em espaço de memória (short -> int) é possível, mas o inverso não (int -> short).

A palavra reservada _final_ torna uma variável em uma constante.

## Operadores

- Atribuição: `=`;
- Aritméticos:
  - Soma: `+`;
    - Realiza concatenação em strings.
    - Quando o Java detecta um caractere, deixará de realizar soma e fará a concatenação: `1+'1'+1+1` -> `1111`
  - Subtração: `-`;
  - Multiplicação: `*`;
  - Divisão: `/`;
  - Módulo (resto): `%`;
- Unários: Aplicados juntamente com outro operador aritmético. Realiza trabalhos como incrementar, decrementar e inverter valores numéricos e booleanos.
  - Valor positivo: `+`;
  - Valor negativo: `-`;
  - Incremento de valor (1 unidade): `++`;
  - Decremento de valor (1 unidade): `--`;
  - Negação (booleano): `!`;
- Ternário: `<Expressão Condicional> ? <Caso true> : <Caso false>`;
- Relacionais: Avaliam a relação entre duas variáveis.
  - Igualdade: `==`;
  - Diferença: `!=`;
  - Maior que: `>`;
  - Maior igual: `>=`;
  - Menor que: `<`;
  - Menor igual: `<=`;
- Lógicos:
  - AND: `&&`;
  - OR: `||`;

## Métodos

Uma classe é definida por **atributos** (variáveis) e **métodos** (funções/sub-rotinas). É recomendável que um método possua uma única responsabilidade.

Em Java, não há o conceito de métodos globais.

## Escopo

É o ambiente onde uma variável pode ser acessada. Em Java, o escopo vai de acordo com o bloco onde ela foi declarada.

Os atributos são declarados no corpo principal da classe, sendo acessíveis por todos os métodos. Caso uma variável seja declarada dentro de um método, o seu escopo está limitado ao corpo desse método.

- Escopo de Classe
  - Escopo de Método
    - Escopo de Fluxo

## Palavras Reservadas

Todas as palavras reservadas estão escritas em minúsculas.

### Controles de Pacotes

- `import`: Importa pacotes ou classes para o código.
- `package`: Especifica a que pacote todas as classes de um arquivo pertencem.

### Modificadores de Acesso

- `public`: Acesso de qualquer classe.
- `private`: Acesso apenas dentro da classe.
- `protected`: Acesso por classes no mesmo pacote e subclasses.

### Tipos Primitivos

- `boolean`: bit (true/false).
- `char`: character unicode 16 bits (unsigned).
- `double`: 64 bits (signed).
- `float`: 32 bits (signed).
- `byte`: 8 bits (signed).
- `short`: 16 bits (signed).
- `int`: 32 bits (signed).
- `long`: 64 bits (signed).
- `void`: Indica que o método não tem retorno de valor.

### Modificadores (classe / variáveis / métodos)

- `abstract`: Classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata.
- `class`: Especifica uma classe.
- `extends`: Indica a supreclasse que a subclasse está estendendo.
- `final`: Impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada.
- `implements`: Indica as interfaces que uma classe irá implementar.
- `interface`: Especifica uma interface.
- `native`: Indica que um método está escrito em uma linguagem dependendo da plataforma.
- `new`: Instancia um novo objeto, chamando seu construtor.
- `static`: Faz um método ou variável pertencer à classe ao invés de às instâncias.
- `strictfp`: Definir regras de ponto flutuante.
- `synchronized`: Indica que um método só pode ser acessado por uma thread de cada vez.
- `transient`: Impede a serialização de campos (uma informação não ficará salva, sempre será reinicializada).
- `volatile`: Indica que uma variável pode ser alterada durante o usuo de threads.

### Controle de fluxo (bloco de código)

- `break`: Sai do bloco de código em que ele está.
- `case`: Executa um bloco de código dependendo do teste do _switch_.
- `continue`: Pula a execução do código e vai para a próxima iteração do loop
- `default`: Executa esse bloco caso nenhum dos testes de switch-case seja verdadeiro.
- `do`: Executa um bloco de código uma vez (do-while)
- `else`: Executa um bloco de código alternativo ao _if_.
- `if`: Realiza um teste lógico.
- `instaceof`: Determina se um objeto é uma instância de determinada classe/superclasse/interface.
- `return`: Retorna um método ou variável.
- `switch`: Indica a variável a ser comparada.
- `while`: Executa um bloco de código enquanto a condição for verdadeira.

### Tratamento de Erros

- `assert`: Testa uma expressão condicional.
- `catch`: Declara o bloco de código usado para tratar uma exceção.
- `finally`: Bloco de código executado após um try-catch.
- `throw`: Usado para passar uma exceção para o método que o chamou.
- `throws`: Indica que um método pode passar uma exceção para o método que o chamou.
- `try`: Bloco de código que tentará ser executado, mas que pode causar uma exceção.

### Referência

- `super`: Refere-se a supreclasse imediata.
- `this`: Refere-se a instância atual do objeto.

### Literais Reservados

São chamados de valores literais: `null`, `true`, `false`.

## Java Docs

São tipos de comentários:

- One Line: `// Comentário`;
- Multi Line: `/* Comentário */`;
- Documentation: `/** Comentário */`;
  - Utilizar `@` para identificar _author_, _params_, _return_, etc.

Javadoc é um gerador de documentação, tendo o resultado expresso em HTML: `javadoc -encoding UTF-8 ...`

## Terminal e Argumentos

Classes podem ser executadas utilizando seu /bin (MinhaClasse.class): `java MinhaClasse`

- É responsável por receber os parâmetros: `public static void main(String[] args)...`
- No terminal: `java MinhaClasse arg1 arg2 arg3 ...`

Classe _**Scanner**_ é utilizada para receber dados do usuário (_input_). Utilizar _.close()_ ao terminar de utilizar a classe.

## Convenção de Escrita

- Por padrão, criar arquivos de classes com primeiras letras em maiúsculo (_MeuApp.java_).
- A classe deve possuir o mesmo nome do arquivo.
- Toda variável deve ser escrita com letra minúscula, e se for composta, a primeira letra da segunda palavra deve ser Maíuscula.
  - Se a variável não deve ter seu valor alterado, utilizar o nome todo maiúsculo.
  - Utilizar a variável como `final`
- sada
- Declaração de variável: `Tipo nomeBemDefinido = atribuição`
- Declaração de método: `TipoRetorno nomeObjetivoInfinitivo Parametro(s)`
- Arquivos podem ser organizados através de pacotes (_packages_).
- _Java Beans_ é uma iniciativa conceitual da comunidade para estruturação de escrita de código.
  - Uma variável deve ser clara, sem abreviações ou definição sem sentido;
  - Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
  - Utilizar um único idioma.
  - Métodos deverão ser nomeados como verbos
