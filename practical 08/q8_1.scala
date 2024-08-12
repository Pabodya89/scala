def encrypt(text : String, Shift:Int) : String = {
    text.map {
        char=>{
            if(char.isLetter){
                val base = if(char.isUpper) 'A' else 'a'
                ((char - base + Shift) % 26 + base ).toChar
            } else{
                char
            }
        }
    }
}

def decypt(textd:String ,shift:Int):String = {
    encrypt(textd, -shift)
}

def ciper(textc:String, shift:Int, operation:(String,Int) => String): String ={
    operation(textc, shift)
}

def checktext() :Unit = {

    val textc = "MyNameNotMatch"
    val shift = 3

    val encrypted = ciper(textc, shift, encrypt)
    println(s"Encrypted: $encrypted")

    val decrypted = ciper(encrypted, shift, decypt)
    println(s"Decrypted: $decrypted")
}