/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import tony.analysis.*;

public final class TList extends Token
{
    public TList()
    {
        super.setText("list");
    }

    public TList(int line, int pos)
    {
        super.setText("list");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TList(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTList(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TList text.");
    }
}