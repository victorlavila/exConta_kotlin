class ContaCorrente (var limite : Double, cliente: Cliente) : Conta(cliente) {

    override fun sacar(valor: Double) {
        when{
            valor <= saldo -> saque(valor)
            valor <= saldo + limite -> sacarChequeEspecial(valor)
            else -> printSaldoInsuficiente()
        }
    }

    fun depositarCheque(cheque: Cheque) : Double{
        deposito(cheque.valor)
        return saldo
    }

    private fun sacarChequeEspecial(valor : Double) {
        val excedente = valor - saldo
        saque(saldo)
        saqueChequeEspecial(excedente)
    }

    private fun saqueChequeEspecial(excedente : Double){
        limite -= excedente
        println("Saque de $excedente do cheque especial. Saldo do cheque especial: $limite")
    }
}