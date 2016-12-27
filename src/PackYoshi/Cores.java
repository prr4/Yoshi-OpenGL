package PackYoshi;

import javax.media.opengl.GL;

public class Cores {
    public void verde(GL gl)
    {
        float amb[] = { 0.0f, 0.1f, 0.0f, 0.0f }; 
        float diff[] = { 0.0f, 0.7f, 0.0f, 0.0f }; 
        float spec[] = { 0.0f, 0.0f, 0.0f, 0.0f }; 
        float shine = 70.0f; 
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,amb,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,diff,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,spec,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
    }
    public void vermelho(GL gl)
    {
        float amb[] = { 0.1f, 0.0f, 0.0f, 0.0f }; 
        float diff[] = { 0.7f, 0.0f, 0.0f, 0.0f }; 
        float spec[] = { 0.0f, 0.0f, 0.0f, 0.0f }; 
        float shine = 70.0f; 
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,amb,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,diff,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,spec,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
    }
    public void branco(GL gl)
    {
        float amb[]={0.2f, 0.2f, 0.2f, 1.5f};
        float diff[]={1.0f, 1.0f, 1.0f, 1.0f};
        float spec[]={0.50f, 0.50f, 0.50f, 1.0f };
        float shine=32.0f;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,amb,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,diff,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,spec,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
    }
    public void preto(GL gl) {
        float amb[]={0.0f, 0.0f, 0.0f, 1.0f};
        float diff[]={0.0f, 0.0f, 0.0f, 1.0f};
        float spec[]={0.0f, 0.0f, 0.0f, 1.0f };
        float shine=32.0f;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,amb,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,diff,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,spec,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
    }
}
