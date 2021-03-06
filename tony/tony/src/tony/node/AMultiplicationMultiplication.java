/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AMultiplicationMultiplication extends PMultiplication
{
    private PMultiplication _multiplication_;
    private TMul _mul_;
    private PSignexpression _signexpression_;

    public AMultiplicationMultiplication()
    {
    }

    public AMultiplicationMultiplication(
        PMultiplication _multiplication_,
        TMul _mul_,
        PSignexpression _signexpression_)
    {
        setMultiplication(_multiplication_);

        setMul(_mul_);

        setSignexpression(_signexpression_);

    }
    public Object clone()
    {
        return new AMultiplicationMultiplication(
            (PMultiplication) cloneNode(_multiplication_),
            (TMul) cloneNode(_mul_),
            (PSignexpression) cloneNode(_signexpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplicationMultiplication(this);
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

    public TMul getMul()
    {
        return _mul_;
    }

    public void setMul(TMul node)
    {
        if(_mul_ != null)
        {
            _mul_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _mul_ = node;
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
            + toString(_multiplication_)
            + toString(_mul_)
            + toString(_signexpression_);
    }

    void removeChild(Node child)
    {
        if(_multiplication_ == child)
        {
            _multiplication_ = null;
            return;
        }

        if(_mul_ == child)
        {
            _mul_ = null;
            return;
        }

        if(_signexpression_ == child)
        {
            _signexpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_multiplication_ == oldChild)
        {
            setMultiplication((PMultiplication) newChild);
            return;
        }

        if(_mul_ == oldChild)
        {
            setMul((TMul) newChild);
            return;
        }

        if(_signexpression_ == oldChild)
        {
            setSignexpression((PSignexpression) newChild);
            return;
        }

    }
}
