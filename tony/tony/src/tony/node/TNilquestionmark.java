/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import tony.analysis.*;

public final class TNilquestionmark extends Token
{
    public TNilquestionmark()
    {
        super.setText("nil?");
    }

    public TNilquestionmark(int line, int pos)
    {
        super.setText("nil?");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TNilquestionmark(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNilquestionmark(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TNilquestionmark text.");
    }
}
