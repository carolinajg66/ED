using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
	public void mostrar (){
	
		int cadena = textview2;


	}


	protected void OnAceptarActivated (object sender, EventArgs e)
	{

		int num;
		int resultado;
		int i;

		num = int.Parse(entry1.Text);


		for (i = 1; i <= 10; i++)
			resultado = i * num;

		mostrar = mostrar  + num.ToString + "x" + i.ToString + "=" + resultado.ToString;

	}
}