import javax.swing.JFrame;

public class ventana extends JFrame {
	public ventana() {
		this.setSize(500, 500);
                setTitle("Hola");
                iniciarComponentes();



  	}
        private void iniciarComponentes(){
            addWindowListener(new java.awt.event.WindowAdapter() {


                    @Override
                    public void windowClosing(java.awt.event.WindowEvent Evento){
                       System.exit(0);
                    }

});
        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventana x = new ventana();
		x.setVisible(true);

	}

}
