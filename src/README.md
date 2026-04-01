sequenceDiagram
    participant JVM
    participant Main as main()
    participant Reader as leituraRaio()
    participant Scanner
    participant Calculator as calcularAreaCirculo()
    participant Output as saidaResultadoArea()

    JVM ->> Main: chama main(String[] args)
    Main ->> Main: print mensagem inicial

    Main ->> Reader: leituraRaio()
    Reader ->> Scanner: new Scanner(System.in)
    Scanner -->> Reader: nextDouble()
    Reader -->> Main: retorna raio

    Main ->> Calculator: calcularAreaCirculo(raio)
    Calculator -->> Main: retorna area

    Main ->> Output: saidaResultadoArea(area)
    Output ->> Main: imprime resultado formatado
