
public class EBook extends Livro {

		
	private String MarcaDagua;
	
	
	public void aplicarDesconto() {
		
		valor = valor * 1.20 ;
	}

	public String getMarcaDagua() {
		return MarcaDagua;
	}

	public void setMarcaDagua(String marcaDagua) {
		MarcaDagua = marcaDagua;
	}
}

