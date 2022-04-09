import java.util.ArrayList;
import java.util.List;


public class Catalogo {
    ArrayList filmes = new ArrayList<>();
    ArrayList series = new ArrayList<>();
    ArrayList Animes = new ArrayList<>();
    ArrayList documentarios = new ArrayList<>();

    public void addFilme(String titulo, String subtitulo, int duracao, int iMdB, String genero, String descricao, int classEtaria){
        filmes.add(new Filme(titulo, subtitulo, duracao, iMdB, genero, descricao, classEtaria));
    }

    public void addSerie(String titulo, String subtitulo, int duracao, int iMdB, String genero, String descricao, int classEtaria, int episodios, int temporadas){
        series.add(new Serie(titulo, subtitulo, duracao, iMdB, genero, descricao, classEtaria, episodios, temporadas));
    }

    public void addAnimes(String titulo, String subtitulo, int duracao, int iMdB, String genero, String descricao, int classEtaria, int episodios, int temporadas){
        animes.add(new Anime(titulo, subtitulo, duracao, iMdB, genero, descricao, classEtaria, episodios, temporadas));
    }

    public void addDocumentarios(String titulo, String subtitulo, int duracao, int iMdB, String genero, String descricao, int classEtaria){
        documentarios.add(new Documentario(titulo, subtitulo, duracao, iMdB, genero, descricao, classEtaria));
    }

    public void removeMidia(List<E> lista, String tipoMidia, String titulo, String subtitulo, int temporada, String episodio){
        if(tipoMidia == "filme" || tipoMidia == "documentario"){
            for(Midia item: lista){

            }

        }
        else{
            for(Midia item: lista){

            }
        }
    }
}
