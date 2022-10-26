package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {
    Maison maison = new Maison();

    @Test
    void ajouterPiece() {
        Piece salon = new Salon(0, 12);
        Piece cuisine = new Cuisine(0, 19);
        Piece wc = new WC(0, 44);
        Piece chambre = new Chambre(1, 12);
        Piece sdb = new SalleDeBain(1, 22);

        maison.ajouterPiece(salon);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(sdb);

        assertEquals(maison.getPieces().length, 5);
        assertEquals(maison.getPieces().length, maison.nbPieces());

    }

    @Test
    void nbPieces() {
        Piece salon = new Salon(0, 12);
        Piece cuisine = new Cuisine(0, 19);
        Piece wc = new WC(0, 44);
        Piece chambre = new Chambre(1, 12);
        Piece sdb = new SalleDeBain(1, 22);

        maison.ajouterPiece(salon);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(sdb);

        assertEquals(maison.getPieces().length, maison.nbPieces());
        assertEquals(maison.nbPieces(), 5);
    }

    @Test
    void superficieEtage() {
        Piece salon = new Salon(0, 12);
        Piece cuisine = new Cuisine(0, 19);
        Piece wc = new WC(0, 44);
        Piece chambre = new Chambre(1, 12);
        Piece sdb = new SalleDeBain(1, 22);

        maison.ajouterPiece(salon);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(sdb);

        assertEquals(maison.superficieEtage(0), 12+19+44);

        assertEquals(maison.superficieEtage(1), 12+22);
        assertNotEquals(maison.superficieEtage(1), 5);
    }

    @Test
    void superficieTypePiece() {
        Piece salon = new Salon(0, 12);
        Piece cuisine = new Cuisine(0, 19);
        Piece wc = new WC(0, 44);
        Piece chambre = new Chambre(1, 12);
        Piece sdb = new SalleDeBain(1, 22);

        maison.ajouterPiece(salon);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(sdb);
        maison.ajouterPiece(wc);

        assertEquals(maison.superficieTypePiece(Piece.TYPE_SALON), 12);
        assertEquals(maison.superficieTypePiece(Piece.TYPE_CUISINE), 19);
        assertEquals(maison.superficieTypePiece(Piece.TYPE_WC), 88);
        assertEquals(maison.superficieTypePiece(Piece.TYPE_CHAMBRE), 12);
        assertEquals(maison.superficieTypePiece(Piece.TYPE_SDB), 22);
        assertNotEquals(maison.superficieTypePiece(null), 22);
    }

    @Test
    void calculerSurface() {
        Piece salon = new Salon(0, 12);
        Piece cuisine = new Cuisine(0, 19);
        Piece wc = new WC(0, 44);
        Piece chambre = new Chambre(1, 12);
        Piece sdb = new SalleDeBain(1, 22);

        maison.ajouterPiece(salon);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(sdb);
        maison.ajouterPiece(wc);

        assertNotEquals(maison.calculerSurface(), 12);
        assertEquals(maison.calculerSurface(), 12+19+44+12+44+22);
    }

}