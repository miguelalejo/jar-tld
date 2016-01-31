package ec.taglib.tld;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Miguel on 14/1/2016.
 */
public class TagSetAlumno extends TagSupport implements IterationTag {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int doStartTag(){
        return IterationTag.EVAL_BODY_INCLUDE;
    }

    @Override
    public int doAfterBody(){
        Writer writer=pageContext.getOut();
        try {
            writer.write("<br/>"+nombre);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return IterationTag.EVAL_BODY_INCLUDE;
    }
}
