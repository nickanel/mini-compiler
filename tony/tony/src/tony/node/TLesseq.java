/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import tony.analysis.*;

public final class TLesseq extends Token
{
    public TLesseq()
    {
        super.setText("<=");
    }

    public TLesseq(int line, int pos)
    {
        super.setText("<=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TLesseq(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLesseq(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TLesseq text.");
    }
}
