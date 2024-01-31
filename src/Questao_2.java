public class Questao_2 {
    public void calcularTransformacaoGama() {

        String fractured_spine = "src/imagens/Fig0308(a)(fractured_spine).png";
        int[][] img = ImagemDigital.carregarImagem(fractured_spine);
        ImagemDigital.plotarImagem(img, "fractured_spine");

        double gama1 = 0.6;
        double c1 = Math.pow(255, 1 - gama1); // valor de c referente ao gama  0.6
        double gama2 = 0.5;
        double c2 = Math.pow(255, 1 - gama2); // valor de c referente ao gama  0.5
        double gama3 = 0.4;
        double c3 = Math.pow(255, 1 - gama3); // valor de c referente ao gama  0.4



        // GAMA 0.6:
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                //     S  =                                   c *               r^gama
                img[x][y] = (int) Math.min(255, Math.max(0, (c1 * Math.pow(img[x][y], gama1))));
            }
        }
       ImagemDigital.plotarImagem(img, "gamma1 = 0.6");

        // GAMA 0.5:
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                //     S  =                                   c *               r^gama
                img[x][y] = (int) Math.min(255, Math.max(0, (c2 * Math.pow(img[x][y], gama2))));
            }
        }
        ImagemDigital.plotarImagem(img, "gamma1 = 0.5");


        // GAMA 0.4:
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                //     S  =                                   c *               r^gama
                img[x][y] = (int) Math.min(255, Math.max(0, (c3 * Math.pow(img[x][y], gama3))));
            }
        }
        ImagemDigital.plotarImagem(img, "gamma1 = 0.4");

    }
}
