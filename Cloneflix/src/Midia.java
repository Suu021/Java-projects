abstract public class Midia {
    int duracao, IMdB, episodios, temporadas, classEtaria;
    String titulo, subtitulo, genero, descricao;

    public Midia(String titulo, String subtitulo, int duracao, int iMdB, String genero, String descricao, int episodios, int temporadas, int classEtaria) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.duracao = duracao;
        this.IMdB = iMdB;
        this.genero = genero;
        this.descricao = descricao;
        this.episodios = episodios;
        this.temporadas = temporadas;
        this.classEtaria = classEtaria;
    }

   

    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getSubtitulo() {
        return subtitulo;
    }



    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }



    public int getClassEtaria() {
        return classEtaria;
    }

    public void setClassEtaria(int classEtaria) {
        this.classEtaria = classEtaria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getIMdB() {
        return IMdB;
    }

    public void setIMdB(int iMdB) {
        IMdB = iMdB;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    
}
