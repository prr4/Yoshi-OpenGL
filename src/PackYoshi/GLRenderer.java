package PackYoshi;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class GLRenderer implements GLEventListener {
    float rotZ = 0.0f;
    float rotX = 0.0f;
    
    Yoshi yoshi;
    GLAutoDrawable autoDrawable = null;
        
    @Override
    public void init(GLAutoDrawable drawable) {
        autoDrawable = drawable;
        GL gl = drawable.getGL();
        // Enable VSync
        gl.setSwapInterval(1);
        
        //iluminacao
        float ambient[] = {1.0f,1.0f,1.0f,1.0f };
        float diffuse[] = {1.0f,1.0f,1.0f,1.0f };
        float position[] = {1.0f,1.0f,1.0f,0.0f };

        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambient,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, diffuse,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position,0);

        gl.glEnable(GL.GL_LIGHT0);
        gl.glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_DEPTH_TEST);

        //area de desenho
        gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        gl.glShadeModel(GL.GL_SMOOTH);
        
        //desenho
        yoshi = new Yoshi();
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        //limpar area de desenho
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        //carregear matriz identidade
        gl.glLoadIdentity();

        //mover o cenario
        gl.glTranslatef(0.0f, -4.0f, -16.0f);
        gl.glRotatef(-90.0f,1.0f,0.0f,0.0f);
        gl.glRotatef(360.0f,0.0f,0.0f,1.0f);
        
        //escalonar
        gl.glScalef(0.5f, 0.5f, 0.5f);
        
        //rotacionar
        gl.glRotatef(rotZ, 0.0f, 0.0f, 1.0f);
        gl.glRotatef(rotX, 1.0f, 0.0f, 0.0f);

        yoshi.desenhar(gl);
        
        gl.glFlush();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) {  height = 1;}
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    @Override
    public void displayChanged(GLAutoDrawable drawable, boolean bln, boolean bln1) {
        
    } 
    
    public void setBasicRotation(float z,float x) {       
        rotZ = z;
        rotX = x;
    }
}
