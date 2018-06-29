/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class ANewSomething extends PSomething
{
    private TNew _new_;
    private PType _type_;
    private TLBr _lBr_;
    private PExpr _expr_;
    private TRBr _rBr_;

    public ANewSomething()
    {
    }

    public ANewSomething(
        TNew _new_,
        PType _type_,
        TLBr _lBr_,
        PExpr _expr_,
        TRBr _rBr_)
    {
        setNew(_new_);

        setType(_type_);

        setLBr(_lBr_);

        setExpr(_expr_);

        setRBr(_rBr_);

    }
    public Object clone()
    {
        return new ANewSomething(
            (TNew) cloneNode(_new_),
            (PType) cloneNode(_type_),
            (TLBr) cloneNode(_lBr_),
            (PExpr) cloneNode(_expr_),
            (TRBr) cloneNode(_rBr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANewSomething(this);
    }

    public TNew getNew()
    {
        return _new_;
    }

    public void setNew(TNew node)
    {
        if(_new_ != null)
        {
            _new_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _new_ = node;
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

    public PExpr getExpr()
    {
        return _expr_;
    }

    public void setExpr(PExpr node)
    {
        if(_expr_ != null)
        {
            _expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr_ = node;
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
            + toString(_new_)
            + toString(_type_)
            + toString(_lBr_)
            + toString(_expr_)
            + toString(_rBr_);
    }

    void removeChild(Node child)
    {
        if(_new_ == child)
        {
            _new_ = null;
            return;
        }

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

        if(_expr_ == child)
        {
            _expr_ = null;
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
        if(_new_ == oldChild)
        {
            setNew((TNew) newChild);
            return;
        }

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

        if(_expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(_rBr_ == oldChild)
        {
            setRBr((TRBr) newChild);
            return;
        }

    }
}
