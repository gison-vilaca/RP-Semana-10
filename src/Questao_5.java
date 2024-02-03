public class Questao_5 {
    public void testarVariaveisGamaImagemColorida() {

        String imagem = "src/imagens/a4d88a27b6e6f33558a8e675b742-1458995.jpg";
        int[][][] img = ImagemDigital.carregarImagemCor(imagem);
        ImagemDigital.plotarImagemCor(img, "IMAGEM ORIGINAL");

        double gama_maior = 2.75;
        double gama_medio = 2.25;
        double gama_menor = 1.75;

        // 1 - MAIOR: RED / MÉDIO: GREEN / MENOR: BLUE
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                img[x][y][0] = (int) Math.min(img[x][y][0] * gama_maior, 255); // RED
                img[x][y][1] = (int) Math.min(img[x][y][1] * gama_medio, 255); // GREEN
                img[x][y][2] = (int) Math.min(img[x][y][2] * gama_menor, 255); // BLUE
            }
        }
        ImagemDigital.plotarImagemCor(img, "1 - MAIOR: RED / MÉDIO: GREEN / MENOR: BLUE");


        // 2 - MAIOR: RED / MÉDIO: BLUE / MENOR: GREEN
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                img[x][y][0] = (int) Math.min(img[x][y][0] * gama_maior, 255); // RED
                img[x][y][1] = (int) Math.min(img[x][y][1] * gama_menor, 255); // GREEN
                img[x][y][2] = (int) Math.min(img[x][y][2] * gama_medio, 255); // BLUE
            }
        }
        ImagemDigital.plotarImagemCor(img, "2 - MAIOR: RED / MÉDIO: BLUE / MENOR: GREEN");


        // 3 - MAIOR: GREEN / MÉDIO: RED / MENOR: BLUE
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                img[x][y][0] = (int) Math.min(img[x][y][0] * gama_medio, 255); // RED
                img[x][y][1] = (int) Math.min(img[x][y][1] * gama_maior, 255); // GREEN
                img[x][y][2] = (int) Math.min(img[x][y][2] * gama_menor, 255); // BLUE
            }
        }
        ImagemDigital.plotarImagemCor(img, "3 - MAIOR: GREEN / MÉDIO: RED / MENOR: BLUE");


        // 4 - MAIOR: GREEN / MÉDIO: BLUE / MENOR: RED
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                img[x][y][0] = (int) Math.min(img[x][y][0] * gama_menor, 255); // RED
                img[x][y][1] = (int) Math.min(img[x][y][1] * gama_maior, 255); // GREEN
                img[x][y][2] = (int) Math.min(img[x][y][2] * gama_medio, 255); // BLUE
            }
        }
        ImagemDigital.plotarImagemCor(img, "4 - MAIOR: GREEN / MÉDIO: BLUE / MENOR: RED");


        // 5 - MAIOR: BLUE / MÉDIO: RED / MENOR: GREEN
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                img[x][y][0] = (int) Math.min(img[x][y][0] * gama_medio, 255); // RED
                img[x][y][1] = (int) Math.min(img[x][y][1] * gama_menor, 255); // GREEN
                img[x][y][2] = (int) Math.min(img[x][y][2] * gama_maior, 255); // BLUE
            }
        }
        ImagemDigital.plotarImagemCor(img, " 5 - MAIOR: BLUE / MÉDIO: RED / MENOR: GREEN");


        // 6 - MAIOR: BLUE / MÉDIO: GREEN / MENOR: RED
        for(int x=0; x<img.length; x++){
            for(int y=0; y< img[0].length; y++){
                img[x][y][0] = (int) Math.min(img[x][y][0] * gama_menor, 255); // RED
                img[x][y][1] = (int) Math.min(img[x][y][1] * gama_medio, 255); // GREEN
                img[x][y][2] = (int) Math.min(img[x][y][2] * gama_maior, 255); // BLUE
            }
        }
        ImagemDigital.plotarImagemCor(img, "6 - MAIOR: BLUE / MÉDIO: GREEN / MENOR: RED");






    }
}
