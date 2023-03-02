class Pokemon(id: Int, nombre: String, vida: Int, Tipo: String): tipo(Tipo, Tipo2) {
    var id:Int = 0
        set(value){
            if(id<=0){
                throw Exception("El ID no puede ser menor que 0")
            }
            field=value
        }
    var nombre:String = ""
    var vida:Int = 0

    override var tipo:String=""
    init{
        this.id = id;
        this.nombre=nombre;
        this.vida=vida;
        this.tipo = tipo

    }

    override fun toString(): String {
        return "Hola mi nombre es $nombre, y tengo $vida de vida y soy de tipo $tipo"
    }
}