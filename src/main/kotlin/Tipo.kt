open class tipo(Tipo:String,Tipo2:String){
    var tipos = mutableListOf<String>("acero","agua","bicho","dragon","electrico","fantasma","fuego"
        ,"hada","hielo","lucha","normal","planta","psíquico","roca","siniestro","tierra","veneno","volador")

    open var tipo = ""
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
    var tipo2 = ""
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
        tipo2 = Tipo
    }
    fun efectividad():String {
        if (tipo == "acero") {
            if (tipo2 in arrayOf("lucha", "fuego", "tierra")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "agua") {
            if (tipo2 in arrayOf("planta", "electrico")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "bicho") {
            if (tipo2 in arrayOf("volador", "roca", "fuego")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "dragon") {
            if (tipo2 in arrayOf("hielo", "dragon", "hada")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "electrico") {
            if (tipo2 in arrayOf("tierra")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "fantasma") {
            if (tipo2 in arrayOf("fantasma", "siniestro")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "fuego") {
            if (tipo2 in arrayOf("tierra", "roca", "agua")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "hada") {
            if (tipo2 in arrayOf("veneno", "acero")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "hielo") {
            if (tipo2 in arrayOf("lucha", "roca", "acero", "fuego")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "lucha") {
            if (tipo2 in arrayOf("volador", "psiquico", "hada")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "normal") {
            if (tipo2 in arrayOf("lucha")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "planta") {
            if (tipo2 in arrayOf("volador", "veneno", "bicho", "fuego", "hielo")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "psiquico") {
            if (tipo2 in arrayOf("fantasma", "siniestro", "bicho", "fuego")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "roca") {
            if (tipo2 in arrayOf("lucha", "tierra", "acero", "agua","planta")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "siniestro") {
            if (tipo2 in arrayOf("lucha", "bicho", "hada")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "tierra") {
            if (tipo2 in arrayOf("agua", "planta", "hielo")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "veneno") {
            if (tipo2 in arrayOf("tierra", "psiquico")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }
        }
        if (tipo == "volador") {
            if (tipo2 in arrayOf("roca", "electrico","hielo")) {
                return "El tipo $tipo es efectivo con el tipo $tipo2"
            } else {
                return "El tipo $tipo no es efectivo con el tipo $tipo2"
            }

        }

        else{
            return " "
        }


    }
}
