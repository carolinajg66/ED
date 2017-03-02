using System;
using Gtk;
using System.Collections.Generic;
using System.Diagnostics;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
//		ButtonGoForward.Cliked += delegate{
//			Process.Start("speak","-v es"+ entryNumero.Text + "´");
//
		//	};

//		IList<int> list = new List<int> ();
//		list.Add (16);
//		list.Add (15);
//		list.Add (17);
//		list.Add (5);
//		list.Add (4);
//
//		foreach (int item in list)
//			Console.WriteLine ("item =" + item);
//	}

		Table table = new Table (9, 10, true);

		IList<int > bolas = new List<int> ();
		IList<Button> buttons = new List <Button> ();
		for (int numero =1; numero<90; numero++) {
			bolas.Add (numero);
			uint index = (uint)numero - 1;
			Button button = new Button ();
			button.Label = "" + numero;
			button.Visible = true;
			uint row = index / 10;
			uint colum = index % 10;
			table.Attach (button, colum, colum+1 , row, row+1);
			buttons.Add (button);
		}
		table.Visible = true;
		vboxMain.Add (table);

		Random random = new Random ();
		buttonGoForward.Clicked += delegate {
			int ramdomIndex = random.Next (bolas.Count);
			int bola = bolas [ramdomIndex];
			Console.WriteLine ("Bola= " + bola);
			bolas.RemoveAt (ramdomIndex);
			if (bolas.Count == 0)
				buttonGoForward.Sensitive = bolas.Count > 0;


			Process.Start ("espeak", "-v es " + toSpeak (bola));
			buttons [bola - 1].ModifyBg (StateType.Normal, new Gdk.Color (255, 0, 0));
			buttonGoForward.ModifyBg(StateType.Normal, new Gdk.Color(0,255,0));
		};
	
//		for (int vez = 0; vez<10; vez++) {
//			int numeroAleatorio = random.Next (1000);
//			if(numeroAleatorio <5 || numeroAleatorio >=995)
//			Console.WriteLine ("numeroAleatorio = " + numeroAleatorio);
//		}

	 }

	private String toSpeak ( int bola){
		String text = bola.ToString ();
		if (text.Length == 2)
			text = text + " " + text [0] + " " + text [1];
		return string.Format ( "'{0}'",bola);

	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}

