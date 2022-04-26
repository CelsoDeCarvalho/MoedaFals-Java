package model;

import java.util.Random;

public class Moedas {

    // Criando o array com 12 posicoes para as moedas 
    private int moedas[] = new int[12];
    
    //A moeda falsa sera nula inicialmente e depois sera passado um valor aleiatorio diferente do todos
    Integer moedaFalsa = null;

    /*
    *Metodo que recebe dois valores, low e hig
    *Este metodo retorna um valor aleiatorio num intervalo fechado de low e high
    */
    public final int randomizer(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low) + low;
    }
    
    
    //Metodo construtor que preenhce o array com 12 iteiros
    public Moedas() {

        //Aqui um valor aleiatorio e pego
        int randomValue = randomizer(1, 9);

        //For que preenche o array em todas as posicoes com o valor aleiatorio pego acima
        for (int i = 0; i < moedas.length; i++) {
            moedas[i] = randomValue;
        }

        //Este do while procura um valor aleiatorio diferentes dos que estao no array e passa 
        // para uma posicao aleiatoria no array e este sera a moeda falsa
        do {
            moedaFalsa = randomizer(1, 9);
            if(moedaFalsa!=moedas[0] && moedaFalsa!=null){
                moedas[randomizer(0,11)] = moedaFalsa;
                break;
            }
        } while (moedaFalsa == moedas[0]);
    }

    public int[] getMoedas() {
        return moedas;
    }

    public Integer getMoedaFalsa() {
        return moedaFalsa;
    }

    public void setMoedaFalsa(Integer moedaFalsa) {
        this.moedaFalsa = moedaFalsa;
    }

    public void setMoedas(int[] moedas) {
        this.moedas = moedas;
    }
}
