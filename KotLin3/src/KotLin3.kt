fun main(args: Array<String>) {
    val strings= arrayOfNulls<String>(9)
    for(n in 0..8){
        strings[n]=args[n];
    }
    strings.sort();
    for (i in 0..7){
            if (strings[i]==strings[strings.size-1])
            {
                strings[strings.size-1]="";
            }

    }

    for(i in 0..8){
        if (strings[i]!="") {
            println(strings[i]);
        }
    }
}