fun main(args: Array<String>) {
    val strings= arrayOfNulls<String>(9)
    val quantity= IntArray(9)
    for(n in 0..8){
        strings[n]=args[n];
        quantity[n]++
    }
    strings.sort();
    for (i in 0..7){

            if (strings[i]==strings[strings.size-1])
            {
                strings[strings.size-1]="";
                quantity[i]++
            }
    }

    for(i in 0..8){
            if (strings[i]!="") {
                println(strings[i] + " " + quantity[i]);
            }
    }
}