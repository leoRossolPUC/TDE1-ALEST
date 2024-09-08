import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Leitor {

    //cada caso de teste apresenta dois numeros representando linhas e colunas
    //usando esses, podemos imaginar que a arvore esta num grid, como batalha naval
    //devemos ler todas as linhas e colunas
    //  \|/ representam para onde estao os filhos
    //  v w representam bifurcacoes
    //  numeros = nodo
    //  # = folha = fim
    //

    int linhas;
    int colunas;
    char [][] grid;


    public Leitor (String pathTESTE){
        try (BufferedReader br = new BufferedReader(new FileReader(pathTESTE))){

            //le os parametros iniciais
            String[] param = br.readLine().split(" ");
            linhas = Integer.parseInt(param[0]);
            colunas = Integer.parseInt(param[1]);

            //incializa o grid com os numeros de linhas e colunas
            grid = new char [linhas] [colunas];

            //leitor de cada linha
            for (int i=0; i<linhas; i++) {
                String linha = br.readLine();
                if (linha != null && linha.length() >= colunas) {
                    for (int j = 0; j < colunas; j++) {
                        grid[i][j] = linha.charAt(j);
                    }
                }

            }
        //excecoes etc...
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void imprimir(){
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                System.out.println(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

}
