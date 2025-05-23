# Exercício: Encapsulamento e Herança em Java

## Descrição

Você deve criar um sistema simples para gerenciar informações de veículos. No sistema, haverá uma classe `Veiculo`, que será a classe base, e duas subclasses: `Carro` e `Moto`. Cada uma dessas classes terá atributos específicos, mas algumas características serão comuns entre elas, que serão definidas na classe base `Veiculo`.

## Requisitos

1. **Classe Base: Veiculo**
   - Crie uma classe `Veiculo` com os seguintes atributos privados:
     - `marca` (String)
     - `modelo` (String)
     - `ano` (int)
   - Implemente os métodos `getters` e `setters` para esses atributos.
   - Crie um método `exibirDetalhes()` que imprime as informações do veículo.

2. **Subclasse: Carro**
   - Crie uma classe `Carro` que herda da classe `Veiculo`.
   - Adicione um atributo privado `numeroDePortas` (int).
   - Implemente os métodos `getters` e `setters` para `numeroDePortas`.
   - Sobrescreva o método `exibirDetalhes()` para incluir o número de portas.

3. **Subclasse: Moto**
   - Crie uma classe `Moto` que herda da classe `Veiculo`.
   - Adicione um atributo privado `tipoDeGuidao` (String).
   - Implemente os métodos `getters` e `setters` para `tipoDeGuidao`.
   - Sobrescreva o método `exibirDetalhes()` para incluir o tipo de guidão.

4. **Teste o Sistema**
   - Na classe principal (por exemplo, `Main`), crie instâncias de `Carro` e `Moto`.
   - Utilize os métodos `setters` para definir os valores dos atributos.
   - Chame o método `exibirDetalhes()` para imprimir as informações dos veículos.
