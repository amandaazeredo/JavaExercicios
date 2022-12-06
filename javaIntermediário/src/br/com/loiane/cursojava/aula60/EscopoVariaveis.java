package br.com.loiane.cursojava.aula60;

public class EscopoVariaveis {

	// o escopo de uma variavel s� pode ser feito dentro do bloco onde ela for criada
	// ela poder� ser chamada em diversos lugares se for uma variavel global(que n�o foi criada dentro de um bloco, seja for/if..., espec�fico)
	private int valor;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calculaValor(int valor) {
		valor = valor + 10;
		
		//this.valor = valor;
		
		return valor;
	}
	
	public int teste() {
		int valor = 5;
		
		if(true) {
			valor--;
		}
		
		//this.valor = valor; referencial valor global/atributo da classe
		
		return valor;
	}
	
	public void outroTeste() {
		for(int i =0; i<10; i++) {
			System.out.println(i);
		}

		//i++; //erro de compila��o
		
		int j;
		for(j=0; j<10; j++) {
			System.out.println(j); //j tem valor 10
		}
	}
		public void maisUmTeste() {
			boolean flag = true;
			
			if(flag) {
				int umaVariavel = 10;
				
				umaVariavel++;
				
				System.out.println(umaVariavel);
			}
			//System.out.println(umaVariavel);//erro de compila��o, pois a variavel s� pode ser referenciada dentro do bloco onde ela foi criada
		}
		
		public void maisUmOutroTeste(int num) {
			int total = 0;
			
			try {
				int outroNum = 0;
				
				total = num/outroNum;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				total++;
				//outroNum++; //erro de compila��o
				//e.printStrackTrace(); //erro de compila��o
			}
			num++;
			//outroNum++ //erro de compila��o
			//e.printStrachTrace(); //erro de compila��o
		}
}
