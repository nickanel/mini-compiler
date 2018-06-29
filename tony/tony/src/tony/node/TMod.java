/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import tony.analysis.*;

public final class TMod extends Token
{
    public TMod()
    {
        super.setText("mod");
    }

    public TMod(int line, int pos)
    {
        super.setText("mod");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TMod(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMod(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TMod text.");
    }
}
