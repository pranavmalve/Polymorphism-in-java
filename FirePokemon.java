package Pokemons;

public class FirePokemon {
	
		public static void main(String[] args) {
			Pokemon allPokemon[]=new Pokemon[3];
			allPokemon[0]=new Charlizard();
			allPokemon[1]=new Infernape();
		    allPokemon[2]=new Blaziken();
		    
		    for(int i=0;i < allPokemon.length;i++ ) {
		    	allPokemon[i].Specialmove();
		    }
		}

	}



