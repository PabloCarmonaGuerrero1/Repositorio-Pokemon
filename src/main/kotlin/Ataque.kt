import java.lang.Exception

class Ataque(nombre:String, tipo:String, fuerza:Int) {
    var nombre:String=nombre
    var tipo:String=tipo
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