/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AAtomSimple extends PSimple
{
    private PAtom _atom_;
    private TAssign _assign_;
    private PExpr _expr_;

    public AAtomSimple()
    {
    }

    public AAtomSimple(
        PAtom _atom_,
        TAssign _assign_,
        PExpr _expr_)
    {
        setAtom(_atom_);

        setAssign(_assign_);

        setExpr(_expr_);

    }
    public Object clone()
    {
        return new AAtomSimple(
            (PAtom) cloneNode(_atom_),
            (TAssign) cloneNode(_assign_),
            (PExpr) cloneNode(_expr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtomSimple(this);
    }

    public PAtom getAtom()
    {
        return _atom_;
    }

    public void setAtom(PAtom node)
    {
        if(_atom_ != null)
        {
            _atom_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _atom_ = node;
    }

    public TAssign getAssign()
    {
        return _assign_;
    }

    public void setAssign(TAssign node)
    {
        if(_assign_ != null)
        {
            _assign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _assign_ = node;
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

    public String toString()
    {
        return ""
            + toString(_atom_)
            + toString(_assign_)
            + toString(_expr_);
    }

    void removeChild(Node child)
    {
        if(_atom_ == child)
        {
            _atom_ = null;
            return;
        }

        if(_assign_ == child)
        {
            _assign_ = null;
            return;
        }

        if(_expr_ == child)
        {
            _expr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_atom_ == oldChild)
        {
            setAtom((PAtom) newChild);
            return;
        }

        if(_assign_ == oldChild)
        {
            setAssign((TAssign) newChild);
            return;
        }

        if(_expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

    }
}