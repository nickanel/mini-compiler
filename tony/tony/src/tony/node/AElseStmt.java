/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AElseStmt extends PElseStmt
{
    private TElse _else_;
    private TColon _colon_;
    private final LinkedList _stmt_ = new TypedLinkedList(new Stmt_Cast());

    public AElseStmt()
    {
    }

    public AElseStmt(
        TElse _else_,
        TColon _colon_,
        List _stmt_)
    {
        setElse(_else_);

        setColon(_colon_);

        {
            this._stmt_.clear();
            this._stmt_.addAll(_stmt_);
        }

    }
    public Object clone()
    {
        return new AElseStmt(
            (TElse) cloneNode(_else_),
            (TColon) cloneNode(_colon_),
            cloneList(_stmt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElseStmt(this);
    }

    public TElse getElse()
    {
        return _else_;
    }

    public void setElse(TElse node)
    {
        if(_else_ != null)
        {
            _else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _else_ = node;
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

    public String toString()
    {
        return ""
            + toString(_else_)
            + toString(_colon_)
            + toString(_stmt_);
    }

    void removeChild(Node child)
    {
        if(_else_ == child)
        {
            _else_ = null;
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

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_else_ == oldChild)
        {
            setElse((TElse) newChild);
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

    }

    private class Stmt_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PStmt node = (PStmt) o;

            if((node.parent() != null) &&
                (node.parent() != AElseStmt.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AElseStmt.this))
            {
                node.parent(AElseStmt.this);
            }

            return node;
        }
    }
}
