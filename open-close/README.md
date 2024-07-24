# Princípio Open-Closed (Aberto-Fechado)

O princípio **Open-Closed** é um dos princípios SOLID da programação orientada a objetos. Ele afirma que:

- **Aberto para extensão**: O comportamento de uma classe pode ser estendido ou modificado sem alterar seu código-fonte existente.
- **Fechado para modificação**: Uma vez que uma classe está escrita e testada, seu código-fonte não deve ser alterado.

## Resumo

Você deve ser capaz de adicionar novas funcionalidades ou comportamentos a uma classe, geralmente através da herança ou composição, sem modificar o código existente. Isso ajuda a evitar a introdução de novos bugs e facilita a manutenção do sistema.

## Exemplo

### Antes de aplicar o princípio Open-Closed

```java
public class Shape {
    public enum Type { CIRCLE, SQUARE }

    private Type type;

    public Shape(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        switch (shape.getType()) {
            case CIRCLE:
                // Lógica para calcular a área de um círculo
                break;
            case SQUARE:
                // Lógica para calcular a área de um quadrado
                break;
        }
        return 0;
    }
}
