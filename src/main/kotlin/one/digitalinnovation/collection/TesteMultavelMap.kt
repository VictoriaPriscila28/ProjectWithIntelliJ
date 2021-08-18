package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao",2000.0, "CLT") //1000
    val pedro = Funcionario("pedro",1500.0,"PJ") // 2000
    val maria = Funcionario("maria",4000.0,"CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome,joao)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome,maria)

    repositorio.findById(maria.nome)

    println("------------------------")
    repositorio.findAll().forEach{ println(it)}

    println("------------------------")
    repositorio.remove(maria.nome)

    repositorio.findAll().forEach{ println(it)}

}