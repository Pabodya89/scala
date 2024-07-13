def reverse(str:String):String = {
        if(str.isEmpty()) ""
            else reverse(str.tail) + str.head
}

