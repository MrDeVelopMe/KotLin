fun main(args: Array<String>) {
    val strings= arrayOfNulls<String>(9)
    val quantity= IntArray(9)
    val start=0;
    val finish=0;
    for(n in 0..8){
        strings[n]=args[n];
        quantity[n]++
    }
    for (i in 0..8){
        for (j in 8 downTo i+1) {
            if (strings[i] == strings[j]) {
                strings[j] = "";
                quantity[i]++
            }
        }
    }
    for (i in 0..8)
    {
        for (j in 8 downTo i+1) {
            if (quantity[i]<quantity[j]){
                val trade =quantity[i]
                quantity[i]=quantity[j]
                quantity[j]=trade
                val tradeInt =strings[i]
                strings[i]=strings[j]
                strings[j]=tradeInt
            }
        }
    }
    for (i in 0..7)
    {
        for (j in i+1..8) {
            if (quantity[i] == quantity[j]) {
                start == i
                finish == j
            }
            else {
                break
            }
        }
        strings.sort(start,finish)
    }
    for(i in 0..8){
        if (strings[i]!="") {
            println(strings[i] + " " + quantity[i]);
        }
    }
}