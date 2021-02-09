public class Jogador {
    int forca;
    int nivel;
    int pontosAtuais;

    Jogador(int forca, int nivel, int pontosAtuais){
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

    int pontosAtaque(int forca, int nivel) {
        int ptsAtaque = this.forca * this.nivel;
        return ptsAtaque;
    }

    void atacar(Jogador player){
        player.pontosAtuais = player.pontosAtuais - this.pontosAtaque(this.forca, this.nivel);
    }
}
