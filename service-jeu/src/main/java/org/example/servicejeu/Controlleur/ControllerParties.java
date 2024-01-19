package org.example.servicejeu.Controlleur;

import org.example.servicejeu.Facade.FacadeParties;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pileouface.modele.MauvaisIdentifiantConnexionException;
import pileouface.modele.Partie;

@RestController
@RequestMapping("/parties")
public class ControllerParties {

    private final FacadeParties facadeParties;

    public ControllerParties(FacadeParties facadeParties) {
        this.facadeParties = facadeParties;
    }
    @PostMapping("/")
    public ResponseEntity<Partie> jouer(Authentication authentication, @RequestBody String choix) {
        String id =  authentication.getName();
        Partie partie;
        try {
            partie = facadeParties.jouer(id, choix);
        } catch (MauvaisIdentifiantConnexionException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(partie);
    }
}
