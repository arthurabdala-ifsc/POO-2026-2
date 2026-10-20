# 1
```mermaid
classDiagram
    class Pessoa{
        - nome : String
        - dataNasc : LocalDate
        - nacionalidade : String
        - idade : int        
    }
    
    class Aluno{
        
    }
```

# 2
```mermaid
classDiagram
    class ObjetoLeitura{
        - titulo : String
        - editora : String
        - dataPublicao : LocalDate
        - numPaginas : int
        - preco : double
        - faixaEtaria : int
        - digital : boolean
    }
    class Periodico{
        - issn : String
    }
    class Livro{
        - genero : String
        - autor : String
        - isbn : String
    }
    class Revista {
        - segmento : String
    }
    class Jornal{
        - editor : String
    }
    class Gibi{
        - ilustrador : String
    }
    
    ObjetoLeitura <|-- Periodico
    ObjetoLeitura <|-- Livro
    Periodico <|-- Jornal
    Periodico <|-- Revista
    Periodico <|-- Gibi
```

# 3 
````mermaid
classDiagram
    class Veiculo{
        - nome : String
        - marca : String
        - anoFabricacao: LocalDate
        - velocidadeMaxima : double
        - motor : Motor
    }
    class Carro{
        - 
    }
    class Caminhao{
        
    }
    class Barco{
        
    }
    class Aviao{
        
    }
    class Motor{
        
    }
    
````