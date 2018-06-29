/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AFormal extends PFormal
{
    private TRef _ref_;
    private PType _type_;
    private TId _id_;
    private final LinkedList _commaId_ = new TypedLinkedList(new CommaId_Cast());

    public AFormal()
    {
    }

    public AFormal(
        TRef _ref_,
        PType _type_,
        TId _id_,
        List _commaId_)
    {
        setRef(_ref_);

        setType(_type_);

        setId(_id_);

        {
            this._commaId_.clear();
            this._commaId_.addAll(_commaId_);
        }

    }
    public Object clone()
    {
        return new AFormal(
            (TRef) cloneNode(_ref_),
            (PType) cloneNode(_type_),
            (TId) cloneNode(_id_),
            cloneList(_commaId_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFormal(this);
    }

    public TRef getRef()
    {
        return _ref_;
    }

    public void setRef(TRef node)
    {
        if(_ref_ != null)
        {
            _ref_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _ref_ = node;
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

    public TId getId()
    {
        return _id_;
    }

    public void setId(TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }

    public LinkedList getCommaId()
    {
        return _commaId_;
    }

    public void setCommaId(List list)
    {
        _commaId_.clear();
        _commaId_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_ref_)
            + toString(_type_)
            + toString(_id_)
            + toString(_commaId_);
    }

    void removeChild(Node child)
    {
        if(_ref_ == child)
        {
            _ref_ = null;
            return;
        }

        if(_type_ == child)
        {
            _type_ = null;
            return;
        }

        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_commaId_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_ref_ == oldChild)
        {
            setRef((TRef) newChild);
            return;
        }

        if(_type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator i = _commaId_.listIterator(); i.hasNext();)
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

    private class CommaId_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCommaId node = (PCommaId) o;

            if((node.parent() != null) &&
                (node.parent() != AFormal.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AFormal.this))
            {
                node.parent(AFormal.this);
            }

            return node;
        }
    }
}