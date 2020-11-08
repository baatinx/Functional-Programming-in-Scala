// Monomorphic function
def monomorphicFindFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
        if (n >= ss.length) -1
        else if (ss(n) == key) n
        else loop(n + 1)

    loop(0)   
}

// Polymorphic/Generic function.
def findFirst[A](as: Array[A], f: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
        if (n >= as.length) -1
        else if (f(as(n))) n
        else loop(n + 1)

    loop(0)   
}

// scala> findFirst(Array(1, 3, 5, 7, 9, 8), (x: Int) => x == 9)
// val res8: Int = 4

// scala> findFirst(Array("a", "c", "s", "i"), (s: String) => s == "i")
// val res12: Int = 3