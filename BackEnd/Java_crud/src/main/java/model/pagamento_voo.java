package model;

public class pagamento_voo {
	
	private int id;
	
	private int cartao;
	private String parcela;
	private int pix;
	private int preco_viagem;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCartao() {
		return cartao;
	}
	public void setCartao(int cartao) {
		this.cartao = cartao;
	}
	public String getParcela() {
		return parcela;
	}
	public void setParcela(String parcela) {
		this.parcela = parcela;
	}
	public int getPix() {
		return pix;
	}
	public void setPix(int pix) {
		this.pix = pix;
	}
	public int getPreco_viagem() {
		return preco_viagem;
	}
	public void setPreco_viagem(int preco_viagem) {
		this.preco_viagem = preco_viagem;
	}
	
	
	@Override
	public String toString() {
		return "pagamento_voo [id=" + id + ", cartao=" + cartao + ", parcela=" + parcela + ", pix=" + pix
				+ ", preco_viagem=" + preco_viagem + "]";
	}
	
	

}
