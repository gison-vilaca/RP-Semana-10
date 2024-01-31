public class Questao_4 {
    public void calcularTransformacaoGamaValoresDiferentes() {

        String fractured_spine = "src/imagens/Fig0309(a)(washed_out_aerial_image).png";
        int[][] img = ImagemDigital.carregarImagem(fractured_spine);
        ImagemDigital.plotarImagem(img, "fractured_spine");

        double gama1 = 3.0;
        double c1 = 255 / Math.pow(255,gama1); // valor de c referente ao gama 3
        double gama2 = 4.0;
        double c2 = 255 / Math.pow(255,gama2); // valor de c referente ao gama 4
        double gama3 = 5.0;
        double c3 = 255 / Math.pow(255,gama3); // valor de c referente ao gama 5



        // GAMA 3:
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                //     S  =                                   c *               r^gama
                img[x][y] = (int) Math.min(255, Math.max(0, (c1 * Math.pow(img[x][y], gama1))));
            }
        }
        ImagemDigital.plotarImagem(img, "gamma1 = 3");

        // GAMA 4:
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                //     S  =                                   c *               r^gama
                img[x][y] = (int) Math.min(255, Math.max(0, (c2 * Math.pow(img[x][y], gama2))));
            }
        }
        ImagemDigital.plotarImagem(img, "gamma1 = 4");


        // GAMA 5:
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                //     S  =                                   c *               r^gama
                img[x][y] = (int) Math.min(255, Math.max(0, (c3 * Math.pow(img[x][y], gama3))));
            }
        }
        ImagemDigital.plotarImagem(img, "gamma1 = 5");

    }
}
