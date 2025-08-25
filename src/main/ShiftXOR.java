package main;

public class ShiftXOR {
    private int[] tabela;
    private int size;

    public ShiftXOR(int tamanho){
        this.tabela = new int[tamanho];
    }

    public int ShiftXORPuro(int key, int m){
        int h = 0;

        while (key > 0) {
             int digit = key % 10;
             int desloca = digit << 1;
             h ^= desloca;

             key /= 10;
        }

        return Math.abs(h);
    }

    private int ShiftXOR(int key){
        int h = 0;

        while (key > 0) {
             int digit = key % 10;
             int desloca = digit << 1;
             h ^= desloca;

             key /= 10;
        }

        return Math.abs(h) % this.tabela.length;
    }
}
