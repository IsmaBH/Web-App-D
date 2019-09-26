public class Persona{
	private Integer id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Integer edad;
	//Constructor
	public Persona(Integer id, String nombre, String pa, String sa, Integer ed){
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = pa;
		this.segundoApellido = sa;
		this.edad = ed;
	}
	//Metodos get
	public Integer getId(){
		return this.id;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getPrimerApellido(){
		return this.primerApellido;
	}
	public String getSegundoApellido(){
		return this.segundoApellido;
	}
	public Integer getEdad(){
		return this.edad;
	}
	//Metodos set
	public void setId(Integer id){
		this.id = id;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setPrimerApellido(String pa){
		this.primerApellido = pa;
	}
	public void setSegundoApellido(String sa){
		this.segundoApellido = sa;
	}
	public void setEdad(Integer edad){
		this.edad = edad;
	}
	//Metodo para visualizar todos los datos de la persona
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", edad=" + edad + "]";
	}
}