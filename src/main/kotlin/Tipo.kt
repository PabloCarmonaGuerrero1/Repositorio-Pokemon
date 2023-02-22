class tipo(Tipo:String){
    var tipos = mutableListOf<String>("acero","agua","bicho","dragon","electrico","fantasma","fuego"
        ,"hada","hielo","lucha","normal","planta","psíquico","roca","siniestro","tierra","veneno","volador")

    var tipo = ""
        get(){
            return field
        }
        set(value){
            if (value !in tipos){
                IllegalArgumentException("Este tipo no es válido")
            }
            else{
                field=value
            }
        }

    init{
        tipo = Tipo
    }
}
