/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.managementEnum;

/**
 *
 * @author sc
 */
public enum Continents {
    AFRICA(53),
    EUROPE(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int CONTRIES;

    private Continents(int contries) {
        this.CONTRIES = contries;
    }

    public int getContries() {
        return this.CONTRIES;
    }
}
