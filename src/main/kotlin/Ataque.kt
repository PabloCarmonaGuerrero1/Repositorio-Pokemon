import java.lang.Exception

class Ataque(nombre:String, Tipo:String, fuerza:Int, Tipo2: String): tipo(Tipo, Tipo2) {
    var nombre:String=nombre
    override var tipo:String=Tipo
    var fuerza:Int=fuerza
        set(value) {
            if(value<0){
                throw Exception("La fuerza no puede ser menor a 0")
                field=value
            }
        }
    var ataques = mutableListOf<String>("","","","")
    init {
        this.nombre=nombre
        this.tipo=tipo
        this.fuerza=fuerza
    }
}