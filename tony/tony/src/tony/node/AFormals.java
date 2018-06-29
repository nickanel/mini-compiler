/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AFormals extends PFormals
{
    private PFormal _formal_;
    private final LinkedList _semicolonFormal_ = new TypedLinkedList(new SemicolonFormal_Cast());

    public AFormals()
    {
    }

    public AFormals(
        PFormal _formal_,
        List _semicolonFormal_)
    {
        setFormal(_formal_);

        {
            this._semicolonFormal_.clear();
            this._semicolonFormal_.addAll(_semicolonFormal_);
        }

    }
    public Object clone()
    {
        return new AFormals(
            (PFormal) cloneNode(_formal_),
            cloneList(_semicolonFormal_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFormals(this);
    }

    public PFormal getFormal()
    {
        return _formal_;
    }

    public void setFormal(PFormal node)
    {
        if(_formal_ != null)
        {
            _formal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _formal_ = node;
    }

    public LinkedList getSemicolonFormal()
    {
        return _semicolonFormal_;
    }

    public void setSemicolonFormal(List list)
    {
        _semicolonFormal_.clear();
        _semicolonFormal_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_formal_)
            + toString(_semicolonFormal_);
    }

    void removeChild(Node child)
    {
        if(_formal_ == child)
        {
            _formal_ = null;
            return;
        }

        if(_semicolonFormal_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_formal_ == oldChild)
        {
            setFormal((PFormal) newChild);
            return;
        }

        for(ListIterator i = _semicolonFormal_.listIterator(); i.hasNext();)
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

    private class SemicolonFormal_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PSemicolonFormal node = (PSemicolonFormal) o;

            if((node.parent() != null) &&
                (node.parent() != AFormals.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AFormals.this))
            {
                node.parent(AFormals.this);
            }

            return node;
        }
    }
}