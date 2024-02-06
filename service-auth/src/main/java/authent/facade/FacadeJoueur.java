package authent.facade;

import authentmodele.Joueur;
import authentmodele.JoueurInexistantException;
import authentmodele.PseudoDejaPrisException;

public interface FacadeJoueur {
    /**
     * Inscription d'un nouveau joueur à la POFOL
     *
     * @param email
     * @param mdp
     * @return
     * @throws PseudoDejaPrisException
     */
    Joueur inscription(String email,String pseudo, String mdp) throws PseudoDejaPrisException;

    Joueur getJoueurByPseudo(String idJoueur) throws JoueurInexistantException;


    /**
     * Permet de se désinscrire de la plate-forme
     *
     * @param pseudo
     * @throws JoueurInexistantException
     */
    void desincription(String pseudo) throws JoueurInexistantException;


}
