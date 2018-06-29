/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AAdditionAdditionexpression extends PAdditionexpression
{
    private PAdditionexpression _additionexpression_;
    private TPlus _plus_;
    private PMultiplication _multiplication_;

    public AAdditionAdditionexpression()
    {
    }

    public AAdditionAdditionexpression(
        PAdditionexpression _additionexpression_,
        TPlus _plus_,
        PMultiplication _multiplication_)
    {
        setAdditionexpression(_additionexpression_);

        setPlus(_plus_);

        setMultiplication(_multiplication_);

    }
    public Object clone()
    {
        return new AAdditionAdditionexpression(
            (PAdditionexpression) cloneNode(_additionexpression_),
            (TPlus) cloneNode(_plus_),
            (PMultiplication) cloneNode(_multiplication_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdditionAdditionexpression(this);
    }

    public PAdditionexpression getAdditionexpression()
    {
        return _additionexpression_;
    }

    public void setAdditionexpression(PAdditionexpression node)
    {
        if(_additionexpression_ != null)
        {
            _additionexpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _additionexpression_ = node;
    }

    public TPlus getPlus()
    {
        return _plus_;
    }

    public void setPlus(TPlus node)
    {
        if(_plus_ != null)
        {
            _plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _plus_ = node;
    }

    public PMultiplication getMultiplication()
    {
        return _multiplication_;
    }

    public void setMultiplication(PMultiplication node)
    {
        if(_multiplication_ != null)
        {
            _multiplication_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _multiplication_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_additionexpression_)
            + toString(_plus_)
            + toString(_multiplication_);
    }

    void removeChild(Node child)
    {
        if(_additionexpression_ == child)
        {
            _additionexpression_ = null;
            return;
        }

        if(_plus_ == child)
        {
            _plus_ = null;
            return;
        }

        if(_multiplication_ == child)
        {
            _multiplication_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_additionexpression_ == oldChild)
        {
            setAdditionexpression((PAdditionexpression) newChild);
            return;
        }

        if(_plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(_multiplication_ == oldChild)
        {
            setMultiplication((PMultiplication) newChild);
            return;
        }

    }
}