open class personas{
    open fun recorrer()
    {
        println("Soy HUMANOIDE")
    }
}
class victor:personas(){
    override fun recorrer(){
        println("Victor")
    }
}
class manuel:personas(){
    override fun recorrer(){
        println("Manuel")
    }
}
class zeledon:personas(){
    override fun recorrer(){
        println("zeledon")
    }
}
fun main(){
    var lista_personas= ArrayList<personas>()
    var Victor= victor()
    var Manuel= manuel()
    var Zeledon = zeledon()
    lista_personas.add(Victor)
    lista_personas.add(Manuel)
    lista_personas.add(Zeledon)
    for(per in lista_personas)
    {
            per.recorrer()
    }
} 