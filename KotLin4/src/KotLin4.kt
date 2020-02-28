fun main(args: Array<String>) {
    val strings= arrayOfNulls<String>(9)
    val quantity= IntArray(9)
    for(n in 0..8){
        strings[n]=args[n];
        quantity[n]++
    }
    strings.sort();
    for (i in 0..8){
        for (j in 8 downTo i+1) {
            if (strings[i] == strings[j]) {
                strings[j] = "";
                quantity[i]++
            }
        }
    }

    for(i in 0..8){
            if (strings[i]!="") {
                println(strings[i] + " " + quantity[i]);
            }
    }
}