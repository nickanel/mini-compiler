/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class ASignexpressionMultiplication extends PMultiplication
{
    private PSignexpression _signexpression_;

    public ASignexpressionMultiplication()
    {
    }

    public ASignexpressionMultiplication(
        PSignexpression _signexpression_)
    {
        setSignexpression(_signexpression_);

    }
    public Object clone()
    {
        return new ASignexpressionMultiplication(
            (PSignexpression) cloneNode(_signexpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASignexpressionMultiplication(this);
    }

    public PSignexpression getSignexpression()
    {
        return _signexpression_;
    }

    public void setSignexpression(PSignexpression node)
    {
        if(_signexpression_ != null)
        {
            _signexpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _signexpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_signexpression_);
    }

    void removeChild(Node child)
    {
        if(_signexpression_ == child)
        {
            _signexpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_signexpression_ == oldChild)
        {
            setSignexpression((PSignexpression) newChild);
            return;
        }

    }
}
