fun main(args: Array<String>) {
    val strings= arrayOfNulls<String>(args.size)
    val quantity= IntArray(args.size)
    var start=0;
    var finish=0;
    for(n in 0..args.size-1){
        strings[n]=args[n];
        quantity[n]++
    }
    for (i in 0..args.size-1){
        for (j in args.size-1 downTo i+1) {
            if (strings[i] == strings[j]) {
                strings[j] = "";
                quantity[i]++
            }
        }
    }
    for (i in 0..args.size-1)
    {
        for (j in args.size-1 downTo i+1) {
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
    for (i in 0..args.size-2)
    {
        for (j in i+1..args.size-1) {
            if (quantity[i] == quantity[j]) {
                start = i
                finish = j
            }
            else {
                break
            }
        }
        strings.sort(start,finish)
    }
    for(i in 0..args.size-1){
        if (strings[i]!="") {
            println(strings[i] + " " + quantity[i]);
        }
    }
}