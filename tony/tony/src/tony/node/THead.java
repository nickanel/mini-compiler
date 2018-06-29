/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import tony.analysis.*;

public final class THead extends Token
{
    public THead()
    {
        super.setText("head");
    }

    public THead(int line, int pos)
    {
        super.setText("head");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new THead(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTHead(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change THead text.");
    }
}
