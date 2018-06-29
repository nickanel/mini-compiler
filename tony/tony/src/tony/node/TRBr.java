/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import tony.analysis.*;

public final class TRBr extends Token
{
    public TRBr()
    {
        super.setText("]");
    }

    public TRBr(int line, int pos)
    {
        super.setText("]");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TRBr(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRBr(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TRBr text.");
    }
}
