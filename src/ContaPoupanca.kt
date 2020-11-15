class ContaPoupanca (val txDeJuros : Double, cliente: Cliente) : Conta(cliente) {

    override fun sacar(valor: Double) {
        if(valor <= saldo){
            saldo -= valor
            println("Saque no valor de $valor. Saldo atual: $saldo")
        } else{
            println("Saldo insuficiente!")
        }
    }

    fun recolherJuros() {
        println("Juros no valor de ${saldo * txDeJuros / 100} recolhidos com sucesso! ")
    }
}