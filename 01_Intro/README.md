# Introdução Java

1. **Orientada a Objeto**: "Tudo é objeto", exceto os tipos primitivos.
    - Classe e Objeto;
    - Encapsulamento;
    - Abstração;
    - Herança;
    - Polimorfismo

2. **Plataforma Independente**: Funcionar em qualquer plataforma.
    - **Plataforma** é o ambiente de hardware ou software no qual um programa é executado.
    - Código-fonte compilado para _bytecode_, que não está vinculado a nenhuma plataforma.

3. **Portátil**: Mesmo código reproduzivel para várias plataformas, por conta do JVM e bytecode.
    - _WORA_ (_Write Once Run Anywhere_)

4. **Robusta**: É capaz de lidar com o encerramento inesperado de um programa.
    - Gerenciamento de memória forte.
    - Coleta de lixo automática.
    - Tratamento de exceção e mecanismo de verificação de tipo.

5. **Segura**: Fornece recursos de segurança.

6. **Interpretada**: Usa compilador e interpretador.
    - Programas são compilados para gerar arquivos de bytecode.
    - O JVM interpreta o arquivo durante a execução.

7. **Multi-thread**: Vários _threads_ sendo executados simultaneamente.
    - Thread é um subprocesso leve e independente de um programa em execução (processo) que compartilha recursos.

- Passou da Sun Microsystems para a Oracle Inc.

## Ambiente de Desenvolvimento

1. Instalar JDK
    - Algumas interfaces como VSCode conseguem baixar e configurar facilmente.
    - JDK para desenvolvimento, JRE para disponibilizar.

2. No **VSCode**, Ctrl+Shift+P e escolher Create Java Project...
    - Para integrar com repositório, também escolher Git:Clonar.

## Sintaxe

### Classes

Se a classe é executável, precisa de um método principal (_main_): `public static void main (String [] args) {}`;

- A classe deve possuir o mesmo nome do arquivo.

## Infos

- **JVM**: Papel de converter o bytecode gerado em um algoritmo interpretado pelo sistema operacional.
- **JRE**: Componente para utilizar uma aplicação compilada.
- **Java SE / EE / FX / ME**: Plataformas de desenvolvimento.
- Após compilação do código fonte na linguagem, a extensão do conteúdo gerado é _.class_.
- Um arquivo de código fonte tem a extensão _.java_.
- **NetBeans**, **IntelliJ**, **Eclipse** e **BlueJ** são algumas das IDEs para desenvolver aplicações Java.
