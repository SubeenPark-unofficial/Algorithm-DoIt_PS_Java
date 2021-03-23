public class DualStack {
    int ptrA, ptrB;
    int max;
    int[] stk;

    public static class EmptyDualStackException extends RuntimeException {
        public EmptyDualStackException() {
        }
    }

    // 실행할 때 예외：스택이 가득 참
    public static class OverflowDualStackException extends RuntimeException {
        public OverflowDualStackException() {
        }
    }

    public DualStack(int capacity) {
        ptrA = 0;
        ptrB = capacity-1;
        max = capacity;
        try {
            stk = new int[max]; // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없습니다.
            max = 0;
        }

    }

    public int pushA(int x) throws OverflowDualStackException {
        if (ptrA >= ptrB) // 스택이 가득 참
            throw new OverflowDualStackException();
        return stk[ptrA++] = x;
    }

    public int pushB(int x) throws OverflowDualStackException {
        if (ptrA >= ptrB)
            throw new OverflowDualStackException();
        return stk[ptrB--] = x;

    }

    public int popA() throws EmptyDualStackException {
        if (ptrA <= 0)
            throw new EmptyDualStackException();
        return stk[--ptrA];
    }

    public int popB() throws EmptyDualStackException {
        if (ptrB >= max-1)
            throw new EmptyDualStackException();
        return  stk[++ptrB];
    }

    public int peekA() throws EmptyDualStackException {
        if (ptrA <= 0)
            throw new EmptyDualStackException();
        return stk[ptrA-1];
    }

    public int peekB() throws EmptyDualStackException {
        if (ptrB >= max-1)
            throw new EmptyDualStackException();
        return  stk[ptrB+1];
    }

    public int indexOfA(int x) {
        for (int i = ptrA -1; i>= 0; i--) {
            if (stk[i] == x)
                return i;
        }
        return -1;
    }

    public int indexOfB(int x) {
        for (int i = ptrB + 1; i <= max - 1; i++){
            if (stk[i] == x)
                return i;
        }
        return -1;
    }

    // 스택을 비움
    public void clearA() {
        ptrA = 0;
    }

    public void clearB() {
        ptrB = max-1;
    }

    // 스택의 용량을 반환
    public int capacity() {
        return max;
    }

    // 스택에 쌓여있는 데이터 수를 반환
    public int sizeA() {
        return ptrA;
    }

    public int sizeB() {
        return max - ptrB - 1;
    }

    // 스택이 비어 있는가?
    public boolean isEmptyA() {
        return ptrA <= 0;
    }

    public boolean isEmptyB() {
        return ptrB >= max - 1;
    }

    public boolean isFull() {
        return ptrA >= ptrB;
    }

    public void dumpA() {
        if (ptrA <= 0)
            System.out.println("스택이 비었습니다.");
        else {
            for (int i = 0; i < ptrA; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }

    public void dumpB() {
        if (ptrB >= max -1)
            System.out.println("스택이 비었습니다.");
        else {
            for (int i = max - 1; i > ptrB; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}