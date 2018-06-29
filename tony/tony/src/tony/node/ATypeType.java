/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class ATypeType extends PType
{
    private PType _type_;
    private TLBr _lBr_;
    private TRBr _rBr_;

    public ATypeType()
    {
    }

    public ATypeType(
        PType _type_,
        TLBr _lBr_,
        TRBr _rBr_)
    {
        setType(_type_);

        setLBr(_lBr_);

        setRBr(_rBr_);

    }
    public Object clone()
    {
        return new ATypeType(
            (PType) cloneNode(_type_),
            (TLBr) cloneNode(_lBr_),
            (TRBr) cloneNode(_rBr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypeType(this);
    }

    public PType getType()
    {
        return _type_;
    }

    public void setType(PType node)
    {
        if(_type_ != null)
        {
            _type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _type_ = node;
    }

    public TLBr getLBr()
    {
        return _lBr_;
    }

    public void setLBr(TLBr node)
    {
        if(_lBr_ != null)
        {
            _lBr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBr_ = node;
    }

    public TRBr getRBr()
    {
        return _rBr_;
    }

    public void setRBr(TRBr node)
    {
        if(_rBr_ != null)
        {
            _rBr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_type_)
            + toString(_lBr_)
            + toString(_rBr_);
    }

    void removeChild(Node child)
    {
        if(_type_ == child)
        {
            _type_ = null;
            return;
        }

        if(_lBr_ == child)
        {
            _lBr_ = null;
            return;
        }

        if(_rBr_ == child)
        {
            _rBr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(_lBr_ == oldChild)
        {
            setLBr((TLBr) newChild);
            return;
        }

        if(_rBr_ == oldChild)
        {
            setRBr((TRBr) newChild);
            return;
        }

    }
}
