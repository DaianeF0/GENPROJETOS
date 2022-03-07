package companionobject

data class Estudante (private val nome: String, private val ra: Int){

    private var nota = 0.0

    val curso = mutableListOf<String>()
    init {
        if (nome.isEmpty() || ra == 0) {
            throw Exception("Classe sendo instanciada de maneira incorreta")

            fun altNota(valor: Double) {

                if (valor < 0 || valor > 10) {
                    println("Nota inválida")
                } else {
                    nota = valor
                    println("Nota alterada com sucesso!")
                }
            }

            fun cadCurso(cursos: String) {

                if (cursos.isEmpty()) {
                    println("Curso inválido")
                } else {
                    curso.add(cursos)
                }
            }


            fun remCurso(cursos: String) {

                if (cursos.isEmpty()) {
                    println("Curso inválido")
                } else if (curso.contains(cursos)) {
                    curso.remove(cursos)
                    println("Curso removido com sucesso")
                } else {
                    println("Esse curso não exite na lista")
                }
            }

            fun listarCursoo() {
                curso.forEach {
                    println(it)
                }
            }
        }
    }
}