
package pokesimulador1;

public class Pokemon {
    
    // Atributos Encapsulados
    
    public String nome;// nome do pokmon ex: Chamader
    public String tipo; // o tipo do pokemon ex: fogo
    public int vida;
    public int level;
    public int ataque;
    public int defesa;
    
    public String getNome () {
        return nome;
        
    
                
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    // métodos
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void imprimiPokemons() {
        System.out.println("Nome" + nome + " | " +
                "tipo: " + tipo + " | " +
                        "ataque: " + ataque + " | " +
                                "defesa: " + defesa + " | "
                
        );
    }
    
  
       
       
   }
    

