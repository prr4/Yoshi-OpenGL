package PackYoshi;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Pecas {
    public void c1(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 0.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c2(GL gl, GLU glu, GLUquadric gluq) {        
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 1.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c3(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 0.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c4(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 1.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c5(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 2.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c6(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 3.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c7(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 2.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c8(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 3.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c9(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 4.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c10(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 5.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c11(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 4.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c12(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 5.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c13(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 6.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c14(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 7.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c15(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 6.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void c16(GL gl, GLU glu, GLUquadric gluq) {
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 7.5f, 0.25f);
        glu.gluCylinder(gluq, 0.25f, 0.25f, 1.25f, 30, 30);
        gl.glTranslatef(0.0f, 0.0f, 1.25f);
        glu.gluDisk(gluq, 0.0f, 0.25f, 30, 30);
        gl.glPopMatrix();
    }
    
    public void peca1x1(GL gl, GLU glu, GLUquadric gluq) {
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
          gl.glNormal3f(-1.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:back */
          gl.glNormal3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(1.0f,1.0f,0.0f);
          gl.glVertex3f(1.0f,1.0f,1.0f);
          gl.glVertex3f(0.0f,1.0f,1.0f);
          gl.glVertex3f(0.0f,1.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: top */
          gl.glNormal3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,1.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,1.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: left */
          gl.glNormal3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,1.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: right */
          gl.glNormal3f(0.0f,-1.0f,0.0f);
          gl.glVertex3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,1.0f,1.0f);
          gl.glVertex3f(1.0f,1.0f,0.0f);
        gl.glEnd();
        
        c1(gl, glu, gluq);
    }
    
    public void peca1x2(GL gl, GLU glu, GLUquadric gluq) {
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
          gl.glNormal3f(-1.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:back */
          gl.glNormal3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(1.0f,2.0f,0.0f);
          gl.glVertex3f(1.0f,2.0f,1.0f);
          gl.glVertex3f(0.0f,2.0f,1.0f);
          gl.glVertex3f(0.0f,2.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: top */
          gl.glNormal3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,2.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,2.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: left */
          gl.glNormal3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,2.0f,0.0f);
          gl.glVertex3f(0.0f,2.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: right */
          gl.glNormal3f(0.0f,-1.0f,0.0f);
          gl.glVertex3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,2.0f,1.0f);
          gl.glVertex3f(1.0f,2.0f,0.0f);
        gl.glEnd();
        
        c1(gl, glu, gluq);
        c2(gl, glu, gluq);
    }
    
    public void peca1x3(GL gl, GLU glu, GLUquadric gluq) {
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
          gl.glNormal3f(-1.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:back */
          gl.glNormal3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(1.0f,3.0f,0.0f);
          gl.glVertex3f(1.0f,3.0f,1.0f);
          gl.glVertex3f(0.0f,3.0f,1.0f);
          gl.glVertex3f(0.0f,3.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: top */
          gl.glNormal3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,3.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,3.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: left */
          gl.glNormal3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,3.0f,0.0f);
          gl.glVertex3f(0.0f,3.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: right */
          gl.glNormal3f(0.0f,-1.0f,0.0f);
          gl.glVertex3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,3.0f,1.0f);
          gl.glVertex3f(1.0f,3.0f,0.0f);
        gl.glEnd();
        
        c1(gl, glu, gluq);
        c2(gl, glu, gluq);
        c5(gl, glu, gluq);
    }
    
    public void peca1x4(GL gl, GLU glu, GLUquadric gluq) {
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
          gl.glNormal3f(-1.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:back */
          gl.glNormal3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(1.0f,4.0f,0.0f);
          gl.glVertex3f(1.0f,4.0f,1.0f);
          gl.glVertex3f(0.0f,4.0f,1.0f);
          gl.glVertex3f(0.0f,4.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: top */
          gl.glNormal3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,4.0f,1.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,4.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: left */
          gl.glNormal3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,4.0f,0.0f);
          gl.glVertex3f(0.0f,4.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: right */
          gl.glNormal3f(0.0f,-1.0f,0.0f);
          gl.glVertex3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(1.0f,0.0f,1.0f);
          gl.glVertex3f(1.0f,4.0f,1.0f);
          gl.glVertex3f(1.0f,4.0f,0.0f);
        gl.glEnd();
        
        c1(gl, glu, gluq);
        c2(gl, glu, gluq);
        c5(gl, glu, gluq);
        c6(gl, glu, gluq);
    }
    
    public void peca2x2(GL gl, GLU glu, GLUquadric gluq) {
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
          gl.glNormal3f(-1.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:back */
          gl.glNormal3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(2.0f,2.0f,0.0f);
          gl.glVertex3f(2.0f,2.0f,1.0f);
          gl.glVertex3f(0.0f,2.0f,1.0f);
          gl.glVertex3f(0.0f,2.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: top */
          gl.glNormal3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,2.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,2.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: left */
          gl.glNormal3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,2.0f,0.0f);
          gl.glVertex3f(0.0f,2.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: right */
          gl.glNormal3f(0.0f,-1.0f,0.0f);
          gl.glVertex3f(2.0f,0.0f,0.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,2.0f,1.0f);
          gl.glVertex3f(2.0f,2.0f,0.0f);
        gl.glEnd();
        
        c1(gl, glu, gluq);
        c2(gl, glu, gluq);
        c3(gl, glu, gluq);
        c4(gl, glu, gluq);
    }
    
    public void peca2x4(GL gl, GLU glu, GLUquadric gluq) {
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
          gl.glNormal3f(-1.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:back */
          gl.glNormal3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(2.0f,4.0f,0.0f);
          gl.glVertex3f(2.0f,4.0f,1.0f);
          gl.glVertex3f(0.0f,4.0f,1.0f);
          gl.glVertex3f(0.0f,4.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: top */
          gl.glNormal3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,4.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,4.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: left */
          gl.glNormal3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,4.0f,0.0f);
          gl.glVertex3f(0.0f,4.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: right */
          gl.glNormal3f(0.0f,-1.0f,0.0f);
          gl.glVertex3f(2.0f,0.0f,0.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,4.0f,1.0f);
          gl.glVertex3f(2.0f,4.0f,0.0f);
        gl.glEnd();
        
        c1(gl, glu, gluq);
        c2(gl, glu, gluq);
        c3(gl, glu, gluq);
        c4(gl, glu, gluq);
        c5(gl, glu, gluq);
        c6(gl, glu, gluq);
        c7(gl, glu, gluq);
        c8(gl, glu, gluq);
    }
    
    public void peca2x6(GL gl, GLU glu, GLUquadric gluq) {
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
          gl.glNormal3f(-1.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:back */
          gl.glNormal3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(2.0f,6.0f,0.0f);
          gl.glVertex3f(2.0f,6.0f,1.0f);
          gl.glVertex3f(0.0f,6.0f,1.0f);
          gl.glVertex3f(0.0f,6.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: top */
          gl.glNormal3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,6.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,6.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: left */
          gl.glNormal3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,6.0f,0.0f);
          gl.glVertex3f(0.0f,6.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: right */
          gl.glNormal3f(0.0f,-1.0f,0.0f);
          gl.glVertex3f(2.0f,0.0f,0.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,6.0f,1.0f);
          gl.glVertex3f(2.0f,6.0f,0.0f);
        gl.glEnd();
        
        c1(gl, glu, gluq);
        c2(gl, glu, gluq);
        c3(gl, glu, gluq);
        c4(gl, glu, gluq);
        c5(gl, glu, gluq);
        c6(gl, glu, gluq);
        c7(gl, glu, gluq);
        c8(gl, glu, gluq);
        c9(gl, glu, gluq);
        c10(gl, glu, gluq);
        c11(gl, glu, gluq);
        c12(gl, glu, gluq);
    }
    
    public void peca2x8(GL gl, GLU glu, GLUquadric gluq) {
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
          gl.glNormal3f(-1.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:back */
          gl.glNormal3f(1.0f,0.0f,0.0f);
          gl.glVertex3f(2.0f,8.0f,0.0f);
          gl.glVertex3f(2.0f,8.0f,1.0f);
          gl.glVertex3f(0.0f,8.0f,1.0f);
          gl.glVertex3f(0.0f,8.0f,0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: top */
          gl.glNormal3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,8.0f,1.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glVertex3f(0.0f,8.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: left */
          gl.glNormal3f(0.0f,1.0f,0.0f);
          gl.glVertex3f(0.0f,0.0f,0.0f);
          gl.glVertex3f(0.0f,8.0f,0.0f);
          gl.glVertex3f(0.0f,8.0f,1.0f);
          gl.glVertex3f(0.0f,0.0f,1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: right */
          gl.glNormal3f(0.0f,-1.0f,0.0f);
          gl.glVertex3f(2.0f,0.0f,0.0f);
          gl.glVertex3f(2.0f,0.0f,1.0f);
          gl.glVertex3f(2.0f,8.0f,1.0f);
          gl.glVertex3f(2.0f,8.0f,0.0f);
        gl.glEnd();
        
        c1(gl, glu, gluq);
        c2(gl, glu, gluq);
        c3(gl, glu, gluq);
        c4(gl, glu, gluq);
        c5(gl, glu, gluq);
        c6(gl, glu, gluq);
        c7(gl, glu, gluq);
        c8(gl, glu, gluq);
        c9(gl, glu, gluq);
        c10(gl, glu, gluq);
        c11(gl, glu, gluq);
        c12(gl, glu, gluq);
        c13(gl, glu, gluq);
        c14(gl, glu, gluq);
        c15(gl, glu, gluq);
        c16(gl, glu, gluq);
    }   
}