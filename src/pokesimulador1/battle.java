/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokesimulador1;

/**
 *
 * @author emers
 */
public class battle {
    // Atributos encapsulados

    private Pokemon myPokemon;
    private Pokemon anotherPokemon;

    public battle(Pokemon GO1, Pokemon GO2) {

        setMyPokemon(GO1);
        setanotherPokemon(GO2);
    }
    //Get

    public Pokemon getMyPokemon() {
        return this.myPokemon;
    }

    public Pokemon getanotherPokemon() {
        return this.anotherPokemon;

    }

    public void setMyPokemon(Pokemon p) {
        this.myPokemon = p;

    }

    public void setanotherPokemon(Pokemon p) {
        this.anotherPokemon = p;
    }
    public Pokemon batalhar(){
        if(myPokemon.getAtaque()>anotherPokemon.getDefesa()){
        return myPokemon;
        }
        else{
            return anotherPokemon;
        }
    }
}