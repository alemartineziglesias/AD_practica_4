package practica;

public class Habitacion
{
	private String nombreHabitacion;
	private int pisoHabitacion;
	private boolean tieneVentana;
	private Persona persona;
	
	public Habitacion()
	{
		nombreHabitacion = "";
		pisoHabitacion = 0;
		tieneVentana = false;
		persona = new Persona();
	}

	public Habitacion(String nombreHabitacion, int pisoHabitacion, boolean tieneVentana, Persona persona)
	{
		this.nombreHabitacion = nombreHabitacion;
		this.pisoHabitacion = pisoHabitacion;
		this.tieneVentana = tieneVentana;
		this.persona = persona;
	}

	public String getNombreHabitacion()
	{
		return nombreHabitacion;
	}

	public void setNombreHabitacion(String nombreHabitacion)
	{
		this.nombreHabitacion = nombreHabitacion;
	}

	public int getPisoHabitacion()
	{
		return pisoHabitacion;
	}

	public void setPisoHabitacion(int pisoHabitacion)
	{
		this.pisoHabitacion = pisoHabitacion;
	}

	public boolean isTieneVentana()
	{
		return tieneVentana;
	}

	public void setTieneVentana(boolean tieneVentana)
	{
		this.tieneVentana = tieneVentana;
	}

	public Persona getPersona()
	{
		return persona;
	}

	public void setPersona(Persona persona)
	{
		this.persona = persona;
	}
	
	@Override
	public String toString()
	{
		return "Habitación [nombre = " + nombreHabitacion + ", piso = " + pisoHabitacion + ", ventana = " + tieneVentana + ", persona = " + persona + "]";
	}
}
