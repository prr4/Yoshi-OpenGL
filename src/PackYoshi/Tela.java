package PackYoshi;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.FPSAnimator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLJPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Tela extends JFrame {
    private Container container;
    private JPanel painelTela, painelTop, painelSub;
    private GLJPanel painelBody;
    private JLabel labelTop, labelRot1, labelRot2;
    private JSlider jSlider1, jSlider2;
    GLRenderer renderer;
    GLCapabilities caps;
    GLCanvas canvas;
    Animator animator;
    
    private void jSlider2StateChanged(ChangeEvent evt) {
        renderer.setBasicRotation(jSlider1.getValue(), jSlider2.getValue());
        painelBody.display();
    }
    private void jSlider1StateChanged(ChangeEvent evt) {
        renderer.setBasicRotation(jSlider1.getValue(), jSlider2.getValue());
        painelBody.display();
    } 
  
    public Tela() throws InterruptedException {
        super("Yoshi");        
        /***********************************************/
        // configurar rotacao
        jSlider1 = new JSlider();
        jSlider1.setMaximum(360);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider2 = new JSlider();
        jSlider2.setMaximum(360);
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        
        /***********************************************/
        // configurar painelTop
        // contem titulo
        painelTop = new JPanel();
        painelTop.setBackground(new Color(0, 146, 69));
        labelTop = new JLabel("Yoshi Lego");
        painelTop.add(labelTop);
        
        /***********************************************/
        // configurar painelBody
        // contem o desenho
        painelBody = new GLJPanel();
        renderer = new GLRenderer();
        painelBody.addGLEventListener(renderer);
                
        /***********************************************/
        // configurar painelSub
        // contem opcoes de rotacao
        labelRot1 = new JLabel("Rotacionar eixo X");
        labelRot2 = new JLabel("Rotacionar eixo Z");
        painelSub = new JPanel();
        painelSub.add(labelRot1);
        painelSub.add(jSlider1);
        painelSub.add(labelRot2);
        painelSub.add(jSlider2);
        
        /***********************************************/
        // configurar paineLayout
        // contem toda a tela
        painelTela = new JPanel();
        painelTela.setLayout(new BorderLayout(10,10));
        painelTela.add(painelTop, BorderLayout.NORTH);
        painelTela.add(painelBody, BorderLayout.CENTER);
        painelTela.add(painelSub, BorderLayout.SOUTH);
        
        /***********************************************/
        // configurar container
        container = getContentPane();
        container.setLayout(new BorderLayout(5,5));
        container.add(painelTela);
        
        caps = new GLCapabilities();
        caps.setDoubleBuffered(true);
        caps.setHardwareAccelerated(true);
        
        canvas = new GLCanvas(caps);
        canvas.addGLEventListener(renderer);
        
        setSize(800, 500);
        setResizable(false);
        setVisible(true);
        
        animator = new FPSAnimator(canvas, 60);
        animator.start();
        
    }
}
