/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AForStmt extends PStmt
{
    private TFor _for_;
    private PSimpleList _left_;
    private TSemicolon _l_;
    private PExpr _expr_;
    private TSemicolon _r_;
    private PSimpleList _right_;
    private TColon _colon_;
    private final LinkedList _stmt_ = new TypedLinkedList(new Stmt_Cast());
    private TEnd _end_;

    public AForStmt()
    {
    }

    public AForStmt(
        TFor _for_,
        PSimpleList _left_,
        TSemicolon _l_,
        PExpr _expr_,
        TSemicolon _r_,
        PSimpleList _right_,
        TColon _colon_,
        List _stmt_,
        TEnd _end_)
    {
        setFor(_for_);

        setLeft(_left_);

        setL(_l_);

        setExpr(_expr_);

        setR(_r_);

        setRight(_right_);

        setColon(_colon_);

        {
            this._stmt_.clear();
            this._stmt_.addAll(_stmt_);
        }

        setEnd(_end_);

    }
    public Object clone()
    {
        return new AForStmt(
            (TFor) cloneNode(_for_),
            (PSimpleList) cloneNode(_left_),
            (TSemicolon) cloneNode(_l_),
            (PExpr) cloneNode(_expr_),
            (TSemicolon) cloneNode(_r_),
            (PSimpleList) cloneNode(_right_),
            (TColon) cloneNode(_colon_),
            cloneList(_stmt_),
            (TEnd) cloneNode(_end_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAForStmt(this);
    }

    public TFor getFor()
    {
        return _for_;
    }

    public void setFor(TFor node)
    {
        if(_for_ != null)
        {
            _for_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _for_ = node;
    }

    public PSimpleList getLeft()
    {
        return _left_;
    }

    public void setLeft(PSimpleList node)
    {
        if(_left_ != null)
        {
            _left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _left_ = node;
    }

    public TSemicolon getL()
    {
        return _l_;
    }

    public void setL(TSemicolon node)
    {
        if(_l_ != null)
        {
            _l_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _l_ = node;
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

    public TSemicolon getR()
    {
        return _r_;
    }

    public void setR(TSemicolon node)
    {
        if(_r_ != null)
        {
            _r_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _r_ = node;
    }

    public PSimpleList getRight()
    {
        return _right_;
    }

    public void setRight(PSimpleList node)
    {
        if(_right_ != null)
        {
            _right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _right_ = node;
    }

    public TColon getColon()
    {
        return _colon_;
    }

    public void setColon(TColon node)
    {
        if(_colon_ != null)
        {
            _colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _colon_ = node;
    }

    public LinkedList getStmt()
    {
        return _stmt_;
    }

    public void setStmt(List list)
    {
        _stmt_.clear();
        _stmt_.addAll(list);
    }

    public TEnd getEnd()
    {
        return _end_;
    }

    public void setEnd(TEnd node)
    {
        if(_end_ != null)
        {
            _end_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _end_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_for_)
            + toString(_left_)
            + toString(_l_)
            + toString(_expr_)
            + toString(_r_)
            + toString(_right_)
            + toString(_colon_)
            + toString(_stmt_)
            + toString(_end_);
    }

    void removeChild(Node child)
    {
        if(_for_ == child)
        {
            _for_ = null;
            return;
        }

        if(_left_ == child)
        {
            _left_ = null;
            return;
        }

        if(_l_ == child)
        {
            _l_ = null;
            return;
        }

        if(_expr_ == child)
        {
            _expr_ = null;
            return;
        }

        if(_r_ == child)
        {
            _r_ = null;
            return;
        }

        if(_right_ == child)
        {
            _right_ = null;
            return;
        }

        if(_colon_ == child)
        {
            _colon_ = null;
            return;
        }

        if(_stmt_.remove(child))
        {
            return;
        }

        if(_end_ == child)
        {
            _end_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_for_ == oldChild)
        {
            setFor((TFor) newChild);
            return;
        }

        if(_left_ == oldChild)
        {
            setLeft((PSimpleList) newChild);
            return;
        }

        if(_l_ == oldChild)
        {
            setL((TSemicolon) newChild);
            return;
        }

        if(_expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(_r_ == oldChild)
        {
            setR((TSemicolon) newChild);
            return;
        }

        if(_right_ == oldChild)
        {
            setRight((PSimpleList) newChild);
            return;
        }

        if(_colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        for(ListIterator i = _stmt_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(_end_ == oldChild)
        {
            setEnd((TEnd) newChild);
            return;
        }

    }

    private class Stmt_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PStmt node = (PStmt) o;

            if((node.parent() != null) &&
                (node.parent() != AForStmt.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AForStmt.this))
            {
                node.parent(AForStmt.this);
            }

            return node;
        }
    }
}
