/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import tony.analysis.*;

public final class TOnelinecomment extends Token
{
    public TOnelinecomment(String text)
    {
        setText(text);
    }

    public TOnelinecomment(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TOnelinecomment(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOnelinecomment(this);
    }
}
