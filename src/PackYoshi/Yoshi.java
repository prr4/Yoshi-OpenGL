package PackYoshi;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Yoshi {
   
    public Yoshi() {}
    
    public void desenhar(GL gl) {
        Cores cores = new Cores();
        Pecas pecas = new Pecas();
        
        GLU glu = new GLU();
        GLUquadric gluq = glu.gluNewQuadric();    

        glu.gluQuadricDrawStyle(gluq, GLU.GLU_FILL);       
        glu.gluQuadricOrientation(gluq, GLU.GLU_OUTSIDE);
        glu.gluQuadricNormals(gluq, GLU.GLU_SMOOTH);
        
        //andar 1
        //peca 1
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 3.0f, 0.0f);
        cores.branco(gl);
        pecas.peca2x6 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 2
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, 0.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 3 
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 0.0f, 0.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 4
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 4.0f, 0.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 5
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 4.0f, 0.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 2
        //peca 6
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 7
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 8
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 9
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 4.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 10
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 4.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 11
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 2.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x8 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 3
        //peca 12
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, 2.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 13
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 0.0f, 2.0f);
        cores.branco(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 14
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 0.0f, 2.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 15
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 4.0f, 2.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 16
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 5.0f, 2.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 17
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 6.0f, 2.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 18
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 8.0f, 2.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();

        //peca 19
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 9.0f, 2.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 4
        //peca 20
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 0.0f, 3.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 21
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 1.0f, 3.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 22
        gl.glPushMatrix();
        gl.glTranslatef(6.0f, 1.0f, 3.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 23
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, 1.0f, 2.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 24
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 1.0f, 2.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 25
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 3.0f, 3.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 26
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 4.0f, 3.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.vermelho(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 27
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 6.0f, 3.0f);
        cores.vermelho(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 5
        //peca 28
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 0.0f, 4.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 29
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, 1.0f, 4.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 29
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 1.0f, 4.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 30
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 2.0f, 4.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 31
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 4.0f, 4.0f);
        cores.vermelho(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 32
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 10.0f, 3.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 6
        //peca 33
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 0.0f, 5.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 34
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 1.0f, 5.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x8 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 35
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 3.0f, 5.0f);
        cores.verde(gl);
        pecas.peca1x1 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 36
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 3.0f, 5.0f);
        cores.verde(gl);
        pecas.peca1x1 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 36
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 3.0f, 5.0f);
        cores.vermelho(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 7
        //peca 37
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 0.0f, 6.0f);
        cores.branco(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 38
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 1.0f, 6.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 39
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 1.0f, 6.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 40
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 2.0f, 6.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 8
        //peca 41
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 1.0f, 7.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 42
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 3.0f, 7.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //pes esquerdo
        //peca 43
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, -1.0f, -3.0f);
        cores.vermelho(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 44
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, -1.0f, -2.0f);
        cores.vermelho(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 45
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 1.0f, -1.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //pes direito
        //peca 46
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -1.0f, -3.0f);
        cores.vermelho(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 47
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -1.0f, -2.0f);
        cores.vermelho(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 48
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 1.0f, -1.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 8
        //peca 49
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -4.0f, 8.0f);
        cores.branco(gl);
        pecas.peca2x6 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 50
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, 8.0f);
        cores.branco(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 51
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 0.0f, 8.0f);
        cores.branco(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 52
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 2.0f, 8.0f);
        cores.vermelho(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 53
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 2.0f, 8.0f);
        cores.verde(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 54
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 2.0f, 8.0f);
        cores.verde(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 55
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -5.0f, 8.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 56
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -4.0f, 7.0f);
        cores.vermelho(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 9
        //peca 57
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 0.0f, 9.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca2x8 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 58
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -1.0f, 9.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 59
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, -3.0f, 9.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x6 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 60
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -5.0f, 9.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 61
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 2.0f, 9.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 62
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 2.0f, 9.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 63
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 3.0f, 9.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x6 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 64
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 5.0f, 9.0f);
        cores.vermelho(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 10
        //peca 65
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 4.0f, 10.0f);
        cores.vermelho(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 66
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 3.0f, 10.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 67
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 3.0f, 10.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 68
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 2.0f, 10.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 69
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 2.0f, 10.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 70
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, 1.0f, 10.0f);
        cores.branco(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 71
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 1.0f, 10.0f);
        cores.branco(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 72
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 0.0f, 10.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 73
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 0.0f, 10.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 74
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, -4.0f, 10.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 75
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -4.0f, 10.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 76
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, -5.0f, 10.0f);
        cores.verde(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 77
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -5.0f, 10.0f);
        cores.verde(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 78
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -6.0f, 10.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 11
        //peca 79
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -6.0f, 11.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 80
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -5.0f, 11.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 81
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, -4.0f, 11.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 82
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -4.0f, 11.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 83
        gl.glPushMatrix();
        gl.glTranslatef(-3.0f, 0.0f, 11.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 84
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 0.0f, 11.0f);
        cores.verde(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 85
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, 0.0f, 11.0f);
        cores.branco(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 86
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 0.0f, 11.0f);
        cores.branco(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 87
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 3.0f, 11.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 88
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 4.0f, 11.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 12 
        //peca 89
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -6.0f, 12.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 90
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, -5.0f, 12.0f);
        cores.verde(gl);
        pecas.peca1x1 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 91
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -5.0f, 12.0f);
        cores.verde(gl);
        pecas.peca1x1 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 92
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -4.0f, 12.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 93
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, -3.0f, 12.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x6 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 94
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -1.0f, 12.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 95
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 0.0f, 12.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x8 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 96
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 2.0f, 12.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x8 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 97
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 4.0f, 12.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.vermelho(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 98
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, 1.0f, 12.0f);
        cores.branco(gl);
        pecas.peca1x1 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 99
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 1.0f, 12.0f);
        cores.branco(gl);
        pecas.peca1x1 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 13 
        //peca 100
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -5.0f, 13.0f);
        cores.verde(gl);
        pecas.peca2x6 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 101
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, -4.0f, 13.0f);
        cores.verde(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 102
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -4.0f, 13.0f);
        cores.verde(gl);
        pecas.peca1x3 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 103
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, 13.0f);
        cores.branco(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 104
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 0.0f, 13.0f);
        cores.branco(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 105
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 2.0f, 13.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 106
        gl.glPushMatrix();
        gl.glTranslatef(5.0f, 2.0f, 13.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 107
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 3.0f, 13.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 108
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 3.0f, 13.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 109
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 2.0f, 13.0f);
        cores.vermelho(gl);
        pecas.peca2x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 14
        //peca 110
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 3.0f, 14.0f);
        cores.vermelho(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 111
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 2.0f, 14.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 112
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 2.0f, 14.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 113
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, 14.0f);
        cores.branco(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 114
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 0.0f, 14.0f);
        cores.branco(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 115
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 0.0f, 14.0f);
        cores.preto(gl);
        pecas.peca1x1 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 116
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 0.0f, 14.0f);
        cores.preto(gl);
        pecas.peca1x1 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 117
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 0.0f, 14.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 118
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -4.0f, 14.0f);
        cores.verde(gl);
        pecas.peca2x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 15
        //peca 119
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 0.0f, 15.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.branco(gl);
        pecas.peca2x6 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 120
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, 2.0f, 15.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 121
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 2.0f, 15.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 122
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 3.0f, 15.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 16
        //peca 123
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 0.0f, 16.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca2x6 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 124
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, 2.0f, 16.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x4 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 125
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 3.0f, 16.0f);
        gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //andar 17
        //peca 126
        gl.glPushMatrix();
        gl.glTranslatef(-1.0f, 0.0f, 17.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        //peca 127
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 0.0f, 17.0f);
        cores.verde(gl);
        pecas.peca1x2 (gl, glu, gluq);
        gl.glPopMatrix();
        
        glu.gluDeleteQuadric(gluq);
    }
    
}
