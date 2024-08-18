def ChangetoUpperCase(name: String): String = {
    val output = name.toUpperCase()
    println(s"The $name changed to Upper case is: $output")
    output
}

def ChangetoLowerCase(name: String): String = {
    val output = name.toLowerCase()
    println(s"The $name changed to Lower case is: $output")
    output
}

def formatNames(names: String, formatFunc: String => String): String = {
    val output = formatFunc(names)
    output
}