
	public class desmod005C {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
					double[] inf={0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9}; 
					String[]mes={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
					String mes_min="",mes_max="";
					int n;
					double total=0,maximo=inf[0], minimo=inf[0];
					
					for (n = 0; n < inf.length; n++){
					total = total + inf[n];
					
					
					if (inf[n] > maximo){ 
					maximo = inf[n];
					mes_max = mes[n];
					}
					if (inf[n] < minimo){ 
						minimo = inf[n];
						mes_min=mes[n];
						}
					}
					
					System.out.println("Promedio: " + total/12 + "%");
					System.out.println("Minima inflacion: " + minimo +"% mes: "+ mes_min);
					System.out.println("Maxima inflacion: " + maximo +"% mes: "+ mes_max);		
	}
}
