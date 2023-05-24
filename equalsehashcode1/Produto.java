package equalsehashcode1;

import java.util.Objects;

public class Produto {

		private int id;
		private String descricao;
		
		public Produto(String id, String descricao) {
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(descricao, id);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Produto other = (Produto) obj;
			return Objects.equals(descricao, other.descricao) && id == other.id;
		}
		

	}
