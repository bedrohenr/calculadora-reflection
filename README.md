# Calculadora Reflection

Calculadora em MVC com Reflection. 

Com alguns padrões de projeto implementadas: 
- Factory
- Prototype
- Strategy
- Singleton.

## MVC

Divide a interface de interação do usuário em três papéis distintos: Model, View e Controller.

### Model

Contém as classes que efetuam o cálculo, todas usando o polimorfismo.

Cada operação (Somar, Dividir, ...) é uma classe, que implementa a função calc.

### View

Na View, a classe Menu, mostra as opções de operação que o usuário pode fazer, é colhida sua escolha e dois números através do Scanner input.
  Transforma o input (número inteiro) em uma string, esta sendo o nome da classe escolhida.

Cria uma Data Transfer Object Request, RequestDTO, com a string da classe de operação desejada e os dois valores como parâmetros.

### Controller 

Possui uma função calc, que recebe a RequestDTO, que contém opção de operação, primeiro valor e segundo valor. Utiliza a **Factory** para instanciar a classe (operação) escolhida pelo usuário.

Posteriormente chama a função [calculation](src/main/java/org/example/controller/ControllerCalc.java?#L21), da classe [Calc](./src/main/java/org/example/model/Calc.java), que faz o cálculo requerido pelo usuário.

## Reflection

O reflection é usado majoritariamente na classe [Menu](./src/main/java/org/example/view/Menu.java?#L11), que contém uma variável privada que armazena as classes na pasta [model/operation](./src/main/java/org/example/model/operation)

É utilizado para varrer o diretório operation, na função [showIOperationClasses()](./src/main/java/org/example/view/Menu.java?#L52) que contém as classes que implementam a interface IOperation.

Também é utilizado na hora de instanciar o tipo de operação (Somar, Multiplicar, ...), na classe [ControllerCalc](./src/main/java/org/example/controller/ControllerCalc.java), recebendo uma string com o nome da classe.


## Padrões de Projeto (DOO)

### Factory

Encapsula a lógica de criação de objetos em um método específico, permitindo que subclasses alterem o tipo de objetos que serão criados.

Implementada a classe [Factory](./src/main/java/org/example/factory/Factory.java), também com o padrão Singleton.

### Prototype

Especifica os tipos de objetos a serem criados usando uma instância protótipo e criar novos objetos copiando este protótipo.

Implementado nas classes de operação ([Somar](./src/main/java/org/example/model/operation/Somar.java?#L9), [Multiplicar](./src/main/java/org/example/model/operation/Multiplicar.java?#L9), ...). 

Facilmente implementado com o uso da interface nativa Cloneable.

### Strategy

Permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.

Implementado nas classes de operações: [Somar](./src/main/java/org/example/model/operation/Somar.java), [Subtrair](./src/main/java/org/example/model/operation/Subtrair.java), [Multiplicar](src/main/java/org/example/model/operation/Multiplicar.java)... 

Transformando os comportamentos do programa em classes.

### Singleton

Garantir que uma classe tenha apenas uma instância e fornecer um ponto global de acesso a ela.

Implementado na classe [Factory](./src/main/java/org/example/factory/Factory.java?#L10).

## Instalação

```bash
mvn clean install
```

## Execução
````bash
mvn exec:java
````
