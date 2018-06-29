/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class ASkipSimple extends PSimple
{
    private TSkip _skip_;

    public ASkipSimple()
    {
    }

    public ASkipSimple(
        TSkip _skip_)
    {
        setSkip(_skip_);

    }
    public Object clone()
    {
        return new ASkipSimple(
            (TSkip) cloneNode(_skip_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASkipSimple(this);
    }

    public TSkip getSkip()
    {
        return _skip_;
    }

    public void setSkip(TSkip node)
    {
        if(_skip_ != null)
        {
            _skip_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _skip_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_skip_);
    }

    void removeChild(Node child)
    {
        if(_skip_ == child)
        {
            _skip_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_skip_ == oldChild)
        {
            setSkip((TSkip) newChild);
            return;
        }

    }
}
