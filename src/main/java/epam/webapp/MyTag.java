package epam.webapp;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class MyTag extends TagSupport{
    private String rows;
    private String cols;

    public void setRows(String rows) {
        this.rows = rows;
    }

    public void setCols(String cols) {
        this.cols = cols;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter writer = pageContext.getOut();
        try {
            writer.write(generateOut());
        } catch (IOException e) {
            throw new JspException(e.getMessage());
        }
        return SKIP_BODY;
    }

    private String generateOut() {
        StringBuilder builder = new StringBuilder("");
        int counter = 0;
        for (int i = 0; i < Integer.valueOf(rows); i++) {
            builder.append("<tr>");
            for (int j = 0; j < Integer.valueOf(cols); j++) {
                builder.append("<td>").append(++counter).append("</td>");
            }
            builder.append("</tr>");
        }
        return builder.toString();
    }
}