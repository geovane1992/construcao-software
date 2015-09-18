
package numeroharmonico;

/**
 * Método criado para calcular números-harmônicos
 */


public class NumeroHarmonico {
    
    /**
     * Obtém o Número_harmônico
     *
     * @param i váriável de incremento.
     * @param s váriável principal do cálculo.
     * @param n váriável que define a quantidade de vezes que o loop irá rodar.
     *
     * @return O valor resultante do calculo será retornado a função pela variável s.
     *
     * @throws IllegalArgumentException Caso a variável n receba um valor menor que 1 entrará no Exception .
     */
    
    
    public static double numHarmonico(double i, double s, double n){
        
        if(n < 1){
            throw new IllegalArgumentException("O valor de n é inválido");
        }
   
        while(i <= n){
            s = s + (1/i);
            i = i + 1;
        }

        return s;
        
    }

    
}
