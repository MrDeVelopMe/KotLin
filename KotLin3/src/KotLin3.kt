fun main(args: Array<String>) {
    val strings= arrayOfNulls<String>(args.size)
    for(n in 0..args.size-1){
        strings[n]=args[n];
    }
    strings.sort();
    for (i in 0..args.size-1){
        for (j in 8 downTo i+1) {
            if (strings[i] == strings[j]) {
                strings[j] = "";
            }
        }
    }

    for(i in 0..args.size-1){
        if (strings[i]!="") {
            println(strings[i]);
        }
    }
}