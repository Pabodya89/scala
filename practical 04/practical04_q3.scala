def toUpper(str: String):String = {
    str.toUpperCase();
}

def toLower(low: String):String = {
    low.toLowerCase();
}

def formatename(fo:String)(b:String => String)={
    b(fo);
}

val names = List("Benny","Niroshan", "Saman", "Kumara")
