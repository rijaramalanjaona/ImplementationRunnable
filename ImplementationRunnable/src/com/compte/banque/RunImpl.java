package com.compte.banque;

/**
 * http://fr.openclassrooms.com/informatique/cours/apprenez-a-programmer-en-java/utiliser-l-interface-runnable
 * @author rija
 *
 */
public class RunImpl implements Runnable {
    private CompteEnBanque cb;

    public RunImpl(CompteEnBanque cb) {
	this.cb = cb;
    }

    public void run() {
	for (int i = 0; i < 25; i++) {
	    if (cb.getSolde() > 0) {
		cb.retraitArgent(2);
		System.out.println("Retrait effectué");
	    }
	}
    }
}
