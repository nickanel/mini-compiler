/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AAndAndexpression extends PAndexpression
{
    private PAndexpression _andexpression_;
    private TAnd _and_;
    private PNotexpression _notexpression_;

    public AAndAndexpression()
    {
    }

    public AAndAndexpression(
        PAndexpression _andexpression_,
        TAnd _and_,
        PNotexpression _notexpression_)
    {
        setAndexpression(_andexpression_);

        setAnd(_and_);

        setNotexpression(_notexpression_);

    }
    public Object clone()
    {
        return new AAndAndexpression(
            (PAndexpression) cloneNode(_andexpression_),
            (TAnd) cloneNode(_and_),
            (PNotexpression) cloneNode(_notexpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndAndexpression(this);
    }

    public PAndexpression getAndexpression()
    {
        return _andexpression_;
    }

    public void setAndexpression(PAndexpression node)
    {
        if(_andexpression_ != null)
        {
            _andexpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _andexpression_ = node;
    }

    public TAnd getAnd()
    {
        return _and_;
    }

    public void setAnd(TAnd node)
    {
        if(_and_ != null)
        {
            _and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _and_ = node;
    }

    public PNotexpression getNotexpression()
    {
        return _notexpression_;
    }

    public void setNotexpression(PNotexpression node)
    {
        if(_notexpression_ != null)
        {
            _notexpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _notexpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_andexpression_)
            + toString(_and_)
            + toString(_notexpression_);
    }

    void removeChild(Node child)
    {
        if(_andexpression_ == child)
        {
            _andexpression_ = null;
            return;
        }

        if(_and_ == child)
        {
            _and_ = null;
            return;
        }

        if(_notexpression_ == child)
        {
            _notexpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_andexpression_ == oldChild)
        {
            setAndexpression((PAndexpression) newChild);
            return;
        }

        if(_and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(_notexpression_ == oldChild)
        {
            setNotexpression((PNotexpression) newChild);
            return;
        }

    }
}
