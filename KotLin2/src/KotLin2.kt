fun main(args: Array<String>) {
    val strings= arrayOfNulls<String>(9)
    for(n in 0..8){
        strings[n]=args[n];
    }
    strings.sort();
    for(i in 0..8){
        println(strings[i]);
    }
}