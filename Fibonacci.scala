def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def go(x: Int, y: Int, counter: Int): Int =
        if(counter <= 1) y
        else go(y, x + y, counter - 1)
    
    if(n <= 1) n
    else go(0, 1, n)
}