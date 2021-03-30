public class Q4_RecurrenceAnalysis {

    // Assume n = 4

    // TOP -> DOWN
    // n = 4 : recur2(2) -> sout(4) -> recur(3) <=> 2 1 4 1 3 2 1
        // recur2(2) : recur2(0) -- X -> sout(2) -> recur2(1) <=> 2 1
            // recur2(1) : recur2(-1) -- X -> sout(1) -> recur2(0) -- x <=> 1
        // recur2(3) : recur2(1) -> sout(3) -> recur2(2) <= > 1 3 2 1

    // DOWN -> TOP
    // n = -1, 0 : Do nothing
    // n = 1 : 1
    // n = 2 : recur2(0) -> 2 -> recur2(1) : 2 1
    // n = 3 : recur2(1) -> 3 -> recur2(2) : 1 3 2 1
    // n = 4 : recur2(2) -> 4 -> recur2(3) : 2 1 4 1 3 2 1


}
