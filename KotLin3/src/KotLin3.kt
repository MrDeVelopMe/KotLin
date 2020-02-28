fun main(args: Array<String>) {
    val strings= arrayOfNulls<String>(9)
    for(n in 0..8){
        strings[n]=args[n];
    }
    strings.sort();
    for (i in 0..8){
        for (j in 8..i)
        {
            if (strings[i]==strings[j])
            {
                strings[j]="";
            }
        }
    }

    for(i in 0..8){
        if (strings[i]!="") {
            println(strings[i]);
        }
    }
}