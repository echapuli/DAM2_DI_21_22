/*
   proyecto para la práctica de los Layout
   se crea un horario en la ventana dividiéndola en diferentes zonas
 */
package horario.gui;

import com.seaglass.SeaGlassLookAndFeel;
import horario.dto.Hora;
import horario.logica.LogicaNegocio;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author eduardo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private HashMap componentMap;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
//        //Aplica Look_And_Feel estático
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            UIManager.setLookAndFeel(SeaGlassLookAndFeel.class.getCanonicalName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();

        //creamos un HashMap con para sacar los botones de la pantalla por su nombre
        createComponentMap();

        //ponemos un icono a la ventana principal
        try {
            File imagen = new File("src/horario/gui/img/icono.png");
            Image image = ImageIO.read(imagen);
            //image = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            this.setIconImage(image);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        centrarWindow(this);
        leerFichero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPContenedor = new javax.swing.JPanel();
        jPLunes = new javax.swing.JPanel();
        jPTituloL = new javax.swing.JPanel();
        jLTituloLunes = new javax.swing.JLabel();
        jPHorasLunes = new javax.swing.JPanel();
        jB11 = new javax.swing.JButton();
        jB12 = new javax.swing.JButton();
        jB13 = new javax.swing.JButton();
        jB14 = new javax.swing.JButton();
        jB15 = new javax.swing.JButton();
        jB16 = new javax.swing.JButton();
        jPMartes = new javax.swing.JPanel();
        jPTituloM = new javax.swing.JPanel();
        jLTituloMartes = new javax.swing.JLabel();
        jPHorasMartes = new javax.swing.JPanel();
        jB21 = new javax.swing.JButton();
        jB22 = new javax.swing.JButton();
        jB23 = new javax.swing.JButton();
        jB24 = new javax.swing.JButton();
        jB25 = new javax.swing.JButton();
        jB26 = new javax.swing.JButton();
        jPMiercoles = new javax.swing.JPanel();
        jPTituloX = new javax.swing.JPanel();
        jLTituloMiercoles = new javax.swing.JLabel();
        jPHorasMiercoles = new javax.swing.JPanel();
        jB31 = new javax.swing.JButton();
        jB32 = new javax.swing.JButton();
        jB33 = new javax.swing.JButton();
        jB34 = new javax.swing.JButton();
        jB35 = new javax.swing.JButton();
        jB36 = new javax.swing.JButton();
        jPJueves = new javax.swing.JPanel();
        jPTituloJ = new javax.swing.JPanel();
        jLTituloJueves = new javax.swing.JLabel();
        jPHorasJueves = new javax.swing.JPanel();
        jB41 = new javax.swing.JButton();
        jB42 = new javax.swing.JButton();
        jB43 = new javax.swing.JButton();
        jB44 = new javax.swing.JButton();
        jB45 = new javax.swing.JButton();
        jB46 = new javax.swing.JButton();
        jPViernes = new javax.swing.JPanel();
        jPTituloV = new javax.swing.JPanel();
        jLTituloViernes = new javax.swing.JLabel();
        jPHorasViernes = new javax.swing.JPanel();
        jB51 = new javax.swing.JButton();
        jB52 = new javax.swing.JButton();
        jB53 = new javax.swing.JButton();
        jB54 = new javax.swing.JButton();
        jB55 = new javax.swing.JButton();
        jB56 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlta = new javax.swing.JMenu();
        jMLog = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HORARIOS");
        setMinimumSize(new java.awt.Dimension(689, 426));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HORARIO 2º DAM");
        jPTitulo.add(jLabel1);

        getContentPane().add(jPTitulo, java.awt.BorderLayout.PAGE_START);

        jPContenedor.setLayout(new java.awt.GridLayout(1, 0));

        jPLunes.setLayout(new java.awt.BorderLayout());

        jPTituloL.setBackground(new java.awt.Color(255, 255, 0));
        jPTituloL.setLayout(new java.awt.BorderLayout());

        jLTituloLunes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTituloLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloLunes.setText("LUNES");
        jPTituloL.add(jLTituloLunes, java.awt.BorderLayout.CENTER);

        jPLunes.add(jPTituloL, java.awt.BorderLayout.PAGE_START);

        jPHorasLunes.setLayout(new java.awt.GridLayout(6, 1));

        jB11.setName("jB11"); // NOI18N
        jB11.setOpaque(false);
        jPHorasLunes.add(jB11);
        jB11.getAccessibleContext().setAccessibleName("jB11");

        jB12.setName("jB12"); // NOI18N
        jB12.setOpaque(false);
        jPHorasLunes.add(jB12);
        jB12.getAccessibleContext().setAccessibleName("jB12");

        jB13.setName("jB13"); // NOI18N
        jB13.setOpaque(false);
        jPHorasLunes.add(jB13);

        jB14.setName("jB14"); // NOI18N
        jB14.setOpaque(false);
        jPHorasLunes.add(jB14);

        jB15.setName("jB15"); // NOI18N
        jB15.setOpaque(false);
        jPHorasLunes.add(jB15);

        jB16.setName("jB16"); // NOI18N
        jB16.setOpaque(false);
        jPHorasLunes.add(jB16);

        jPLunes.add(jPHorasLunes, java.awt.BorderLayout.CENTER);

        jPContenedor.add(jPLunes);

        jPMartes.setLayout(new java.awt.BorderLayout());

        jPTituloM.setBackground(new java.awt.Color(255, 255, 0));
        jPTituloM.setLayout(new java.awt.BorderLayout());

        jLTituloMartes.setBackground(new java.awt.Color(255, 51, 51));
        jLTituloMartes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTituloMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloMartes.setText("MARTES");
        jPTituloM.add(jLTituloMartes, java.awt.BorderLayout.CENTER);

        jPMartes.add(jPTituloM, java.awt.BorderLayout.PAGE_START);

        jPHorasMartes.setLayout(new java.awt.GridLayout(6, 1));

        jB21.setName("jB21"); // NOI18N
        jPHorasMartes.add(jB21);

        jB22.setName("jB22"); // NOI18N
        jPHorasMartes.add(jB22);

        jB23.setName("jB23"); // NOI18N
        jPHorasMartes.add(jB23);

        jB24.setName("jB24"); // NOI18N
        jPHorasMartes.add(jB24);

        jB25.setName("jB25"); // NOI18N
        jPHorasMartes.add(jB25);

        jB26.setName("jB26"); // NOI18N
        jPHorasMartes.add(jB26);

        jPMartes.add(jPHorasMartes, java.awt.BorderLayout.CENTER);

        jPContenedor.add(jPMartes);

        jPMiercoles.setLayout(new java.awt.BorderLayout());

        jPTituloX.setBackground(new java.awt.Color(255, 255, 0));
        jPTituloX.setLayout(new java.awt.BorderLayout());

        jLTituloMiercoles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTituloMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloMiercoles.setText("MIERCOLES");
        jPTituloX.add(jLTituloMiercoles, java.awt.BorderLayout.CENTER);

        jPMiercoles.add(jPTituloX, java.awt.BorderLayout.PAGE_START);

        jPHorasMiercoles.setLayout(new java.awt.GridLayout(6, 1));

        jB31.setName("jB31"); // NOI18N
        jPHorasMiercoles.add(jB31);

        jB32.setName("jB32"); // NOI18N
        jPHorasMiercoles.add(jB32);

        jB33.setName("jB33"); // NOI18N
        jPHorasMiercoles.add(jB33);

        jB34.setName("jB34"); // NOI18N
        jPHorasMiercoles.add(jB34);

        jB35.setName("jB35"); // NOI18N
        jPHorasMiercoles.add(jB35);

        jB36.setName("jB36"); // NOI18N
        jB36.setOpaque(false);
        jPHorasMiercoles.add(jB36);

        jPMiercoles.add(jPHorasMiercoles, java.awt.BorderLayout.CENTER);

        jPContenedor.add(jPMiercoles);

        jPJueves.setLayout(new java.awt.BorderLayout());

        jPTituloJ.setBackground(new java.awt.Color(255, 255, 0));
        jPTituloJ.setLayout(new java.awt.BorderLayout());

        jLTituloJueves.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTituloJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloJueves.setText("JUEVES");
        jPTituloJ.add(jLTituloJueves, java.awt.BorderLayout.CENTER);

        jPJueves.add(jPTituloJ, java.awt.BorderLayout.PAGE_START);

        jPHorasJueves.setLayout(new java.awt.GridLayout(6, 1));

        jB41.setName("jB41"); // NOI18N
        jPHorasJueves.add(jB41);

        jB42.setName("jB42"); // NOI18N
        jPHorasJueves.add(jB42);

        jB43.setName("jB43"); // NOI18N
        jPHorasJueves.add(jB43);

        jB44.setName("jB44"); // NOI18N
        jPHorasJueves.add(jB44);

        jB45.setName("jB45"); // NOI18N
        jPHorasJueves.add(jB45);

        jB46.setName("jB46"); // NOI18N
        jPHorasJueves.add(jB46);

        jPJueves.add(jPHorasJueves, java.awt.BorderLayout.CENTER);

        jPContenedor.add(jPJueves);

        jPViernes.setLayout(new java.awt.BorderLayout());

        jPTituloV.setBackground(new java.awt.Color(255, 255, 0));
        jPTituloV.setLayout(new java.awt.BorderLayout());

        jLTituloViernes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTituloViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloViernes.setText("VIERNES");
        jPTituloV.add(jLTituloViernes, java.awt.BorderLayout.CENTER);

        jPViernes.add(jPTituloV, java.awt.BorderLayout.PAGE_START);

        jPHorasViernes.setLayout(new java.awt.GridLayout(6, 1));

        jB51.setName("jB51"); // NOI18N
        jPHorasViernes.add(jB51);

        jB52.setName("jB52"); // NOI18N
        jPHorasViernes.add(jB52);

        jB53.setName("jB53"); // NOI18N
        jPHorasViernes.add(jB53);

        jB54.setName("jB54"); // NOI18N
        jPHorasViernes.add(jB54);

        jB55.setName("jB55"); // NOI18N
        jPHorasViernes.add(jB55);

        jB56.setName("jB56"); // NOI18N
        jPHorasViernes.add(jB56);

        jPViernes.add(jPHorasViernes, java.awt.BorderLayout.CENTER);

        jPContenedor.add(jPViernes);

        getContentPane().add(jPContenedor, java.awt.BorderLayout.CENTER);

        jMAlta.setText("Alta");
        jMAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirMenu(evt);
            }
        });
        jMenuBar1.add(jMAlta);

        jMLog.setText("Log");
        jMLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirMenu(evt);
            }
        });
        jMenuBar1.add(jMLog);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirMenu
        //utilizo un mismo método para todas las opciones del menú
        //identifico que opción del menú es la que recibió el evento
        if (((JMenu) evt.getSource()).getActionCommand() == "Alta") {
            //abrimos la ventana de alta (modal)
            VentanaAlta ventanaAlta = new VentanaAlta(this, true);
            centrarWindow(ventanaAlta);
            ventanaAlta.setVisible(true);
            grabarFichero();
        } else if (((JMenu) evt.getSource()).getActionCommand() == "Log") {
            //abrimos la ventana de lista de log (modal)
            VentanaLog ventanaLog = new VentanaLog(this, false);
            centrarWindow(ventanaLog);
            ventanaLog.setVisible(true);
            grabarFichero();
        }
    }//GEN-LAST:event_abrirMenu

    private void borrarHorario() {
        for (int d = 1; d <= 5; d++) {
            for (int h = 1; h <= 6; h++) {
                (getComponentByName("jB" + Integer.toString(d) + Integer.toString(h))).setText("");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private void createComponentMap() {
        //crea un hashMap con los componentes de la ventana (recorre recursivamente todos los paneles de la ventana)
        componentMap = new HashMap<String, Component>();
        recorrerPanel(this.getContentPane().getComponents());
    }

    private void recorrerPanel(Component[] components) {
        //recorre todos los componentes de la ventana
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JPanel) { //si es un panel vuelve a llamar al método recursivamente con este panel
                recorrerPanel(((JPanel) components[i]).getComponents());
            } else if (components[i] instanceof JButton) { //si no es un panel y es un botón lo guarado en el hashMap
                componentMap.put(components[i].getName(), components[i]);
            }

        }
    }

    public JButton getComponentByName(String name) {
        //Metodo que devuelve el objeto a partir de un string con su nombre
        if (componentMap.containsKey(name)) {
            return (JButton) componentMap.get(name);
        } else {
            return null;
        }
    }

    //Método que refresca el horario
    public void refrescarHorario() {
        List<Hora> listaHoras = LogicaNegocio.getListaHoras();
        //primero borramos el contenido del horario
        borrarHorario();
        for (Hora hora : listaHoras) {
            //pasando el número del día y la hora sacamos el componente con el métdo getComponentByName y le ponemos como
            //texto el módulo
            (getComponentByName("jB" + hora.getDia() + hora.getHora())).setText(hora.getModulo());
        }
    }
    

    //Método que graba fichero
    private void grabarFichero() {
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("src/horario/ficheros/datos.txt");   //se crea el fichero

            for (Hora hora : LogicaNegocio.getListaHoras()) {
                salida.println(hora.lineaFichero());
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            salida.close();
        }
    }

    //Método que lee fichero
    private void leerFichero() {
        FileReader fr = null;
        String[] valores = new String[5];
        try {
            fr = new FileReader("src/horario/ficheros/datos.txt"); //fichero a leer
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();    //se lee la primera línea del fichero
            while (cadena != null) {               //mientras no se llegue al final del fichero   
                valores = cadena.split(";");
                (getComponentByName("jB" + valores[0] + valores[1])).setText(valores[2]);    //pongo el módulo en el horario         
                Hora ohora = new Hora(valores[0], valores[1], valores[2], valores[3], valores[4]);
                LogicaNegocio.anadirHora(ohora); //Cargamos la estructura interna del programa con el contenido del fichero              
                cadena = entrada.readLine();       //se lee la siguiente línea del fichero                        
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void centrarWindow(Window frame) { //método que centra un frame que se le pasa como parámetro
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize(); //utilizaremos un método del Toolikt para conocer la resolución de la pantalla. En concreto utilizaremos el método .getScreenSize(). Este método devolverá una clase Dimensions
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB13;
    private javax.swing.JButton jB14;
    private javax.swing.JButton jB15;
    private javax.swing.JButton jB16;
    private javax.swing.JButton jB21;
    private javax.swing.JButton jB22;
    private javax.swing.JButton jB23;
    private javax.swing.JButton jB24;
    private javax.swing.JButton jB25;
    private javax.swing.JButton jB26;
    private javax.swing.JButton jB31;
    private javax.swing.JButton jB32;
    private javax.swing.JButton jB33;
    private javax.swing.JButton jB34;
    private javax.swing.JButton jB35;
    private javax.swing.JButton jB36;
    private javax.swing.JButton jB41;
    private javax.swing.JButton jB42;
    private javax.swing.JButton jB43;
    private javax.swing.JButton jB44;
    private javax.swing.JButton jB45;
    private javax.swing.JButton jB46;
    private javax.swing.JButton jB51;
    private javax.swing.JButton jB52;
    private javax.swing.JButton jB53;
    private javax.swing.JButton jB54;
    private javax.swing.JButton jB55;
    private javax.swing.JButton jB56;
    private javax.swing.JLabel jLTituloJueves;
    private javax.swing.JLabel jLTituloLunes;
    private javax.swing.JLabel jLTituloMartes;
    private javax.swing.JLabel jLTituloMiercoles;
    private javax.swing.JLabel jLTituloViernes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMAlta;
    private javax.swing.JMenu jMLog;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPContenedor;
    private javax.swing.JPanel jPHorasJueves;
    private javax.swing.JPanel jPHorasLunes;
    private javax.swing.JPanel jPHorasMartes;
    private javax.swing.JPanel jPHorasMiercoles;
    private javax.swing.JPanel jPHorasViernes;
    private javax.swing.JPanel jPJueves;
    private javax.swing.JPanel jPLunes;
    private javax.swing.JPanel jPMartes;
    private javax.swing.JPanel jPMiercoles;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPTituloJ;
    private javax.swing.JPanel jPTituloL;
    private javax.swing.JPanel jPTituloM;
    private javax.swing.JPanel jPTituloV;
    private javax.swing.JPanel jPTituloX;
    private javax.swing.JPanel jPViernes;
    // End of variables declaration//GEN-END:variables
}