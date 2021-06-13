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
public class Pokesimulador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Instanciando um objeto
        Pokemon mypokemon= new Pokemon();
        Pokemon anotherpokemon= new Pokemon();
        
                
        mypokemon.setNome ("Pikachu");
        mypokemon.setTipo ("Raio");
        mypokemon.setAtaque (100);
        mypokemon.setDefesa (85);
        
        anotherpokemon.setNome ("Cubchoo");
        anotherpokemon.setTipo ("Gelo");
        anotherpokemon.setAtaque (80);
        anotherpokemon.setDefesa (72);
        
        mypokemon.imprimiPokemons();
        
        anotherpokemon.imprimiPokemons();
        
       battle b = new battle (mypokemon,anotherpokemon); 
       
       System.out.println(b.getMyPokemon().getNome());
       System.out.println(b.getanotherPokemon().getNome());
       
       System.out.println(b.batalhar().getNome()+"Você acabou com ELE");
      
       
        
    }
    
}
