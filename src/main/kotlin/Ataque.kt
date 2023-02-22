import java.lang.Exception

class Ataque(nombre:String, Tipo:String, fuerza:Int): tipo(Tipo) {
    var nombre:String=nombre
    override var tipo:String=Tipo
    var fuerza:Int=fuerza
        set(value) {
            if(value<0){
                throw Exception("La fuerza no puede ser menor a 0")
                field=value
            }
        }
    init {
        this.nombre=nombre
        this.tipo=tipo
        this.fuerza=fuerza
    }
}