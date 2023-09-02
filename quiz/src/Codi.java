import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Codi extends JFrame implements ActionListener {
    private JLabel labelTitulo, labelMediano, labelPequeño, labelGrande, labelHorasServicio, labelTotal;
    private JTextField textFieldMediano, textFieldPequeño, textFieldGrande, textFieldHorasServicio, textFieldTotal;
    private JButton b1;

    public Codi() {
        setTitle("Paseador de Perros");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        getContentPane().setBackground(new Color(173, 216, 230)); // Color de fondo azul claro

        labelTitulo = new JLabel("Paseador de Perros");
        labelTitulo.setFont(labelTitulo.getFont().deriveFont(16.0f)); // Cambia el tamaño del título
        add(labelTitulo);

        JPanel panelLinea = new JPanel(); // Panel para la línea de separación
        panelLinea.setBorder(new LineBorder(Color.BLACK)); // Línea negra
        panelLinea.setPreferredSize(new java.awt.Dimension(380, 2)); // Tamaño de la línea
        add(panelLinea);

        labelMediano = new JLabel("Cantidad de Perros Medianos:");
        add(labelMediano);
        textFieldMediano = new JTextField(10);
        add(textFieldMediano);

        labelPequeño = new JLabel("Cantidad de Perros Pequeños:");
        add(labelPequeño);
        textFieldPequeño = new JTextField(10);
        add(textFieldPequeño);

        labelGrande = new JLabel("Cantidad de Perros Grandes:");
        add(labelGrande);
        textFieldGrande = new JTextField(10);
        add(textFieldGrande);

        labelHorasServicio = new JLabel("Total de Horas de Servicio:");
        add(labelHorasServicio);
        textFieldHorasServicio = new JTextField(10);
        add(textFieldHorasServicio);

        b1 = new JButton("Calcular Total"); // Cambio de nombre del botón
        b1.addActionListener(this);
        add(b1);

        labelTotal = new JLabel("Total a Pagar:");
        add(labelTotal);

        textFieldTotal = new JTextField(10);
        textFieldTotal.setEditable(false);
        add(textFieldTotal);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int cantidadMediano = Integer.parseInt(textFieldMediano.getText());
            int cantidadPequeño = Integer.parseInt(textFieldPequeño.getText());
            int cantidadGrande = Integer.parseInt(textFieldGrande.getText());
            int horasServicio = Integer.parseInt(textFieldHorasServicio.getText());

            int costoMediano = 5000;
            int costoPequeño = 3000;
            int costoGrande = 10000;

            int total = (costoMediano * cantidadMediano + costoPequeño * cantidadPequeño + costoGrande * cantidadGrande) * horasServicio;
            textFieldTotal.setText(String.valueOf(total));
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new Codi());
    }
}