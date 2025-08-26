package main;

public class ShiftXOR implements FuncaoHash {
   
    public int hash(int key, int m){
        int h = 0;
        while (key > 0) {
             int digit = key % 10;
             int desloca = digit << 1;
             h ^= desloca;

             key /= 10;
        }

        return Math.abs(h) % m;
    }
}
