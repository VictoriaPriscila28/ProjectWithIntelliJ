package one.digitalinnovation.collection

fun main(){
    val joao = Funcionario("Joao",2000.0, "CLT") //1000
    val pedro = Funcionario("pedro",1500.0,"PJ") // 2000
    val maria = Funcionario("maria",4000.0,"CLT")
    println("-----------LIST--------------")

    val funcionarios = mutableListOf(joao,maria) //you can add or delete items
    funcionarios.forEach { println(it) }

    println("-------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }
    println("-----------SET--------------")

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }
    println("----------------------------------")

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("-------------------------")
    funcionarios.remove(maria)
    funcionarioSet.forEach { println(it) }



}