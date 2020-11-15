abstract class Conta (cliente: Cliente) {

    var saldo = 0.0

    abstract fun sacar(valor: Double)

    protected fun deposito(valor:Double) : Double {
        saldo += valor
        println("Depósito no valor de $valor. Saldo atual: $saldo")
        return saldo
    }

    protected fun saque(valor: Double) : Double {
        saldo -= valor
        println("Saque no valor de $valor. Salto atual: $saldo")
        return saldo
    }

    protected fun printSaldoInsuficiente(){
        println("Saldo insufuciente!")
    }

}