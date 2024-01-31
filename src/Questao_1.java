public class Questao_1 {
    public void calcularNegativoImagem() {

        String breast_digital_Xray = "src/imagens/Fig0304(a)(breast_digital_Xray).png";
        int[][] img = ImagemDigital.carregarImagem(breast_digital_Xray);
        ImagemDigital.plotarImagem(img, "breast_digital_Xray");

        for(int x = 0; x < img.length; x++){
            for(int y = 0; y < img[0].length; y++){
                //     S  =(L-1)- r
                img[x][y] = 255 - img[x][y];
            }
        }
        ImagemDigital.plotarImagem(img, "Versão Negativa");


    }
}
