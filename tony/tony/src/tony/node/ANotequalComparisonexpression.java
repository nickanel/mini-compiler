/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class ANotequalComparisonexpression extends PComparisonexpression
{
    private PComparisonexpression _comparisonexpression_;
    private TNoteq _noteq_;
    private PHashexpression _hashexpression_;

    public ANotequalComparisonexpression()
    {
    }

    public ANotequalComparisonexpression(
        PComparisonexpression _comparisonexpression_,
        TNoteq _noteq_,
        PHashexpression _hashexpression_)
    {
        setComparisonexpression(_comparisonexpression_);

        setNoteq(_noteq_);

        setHashexpression(_hashexpression_);

    }
    public Object clone()
    {
        return new ANotequalComparisonexpression(
            (PComparisonexpression) cloneNode(_comparisonexpression_),
            (TNoteq) cloneNode(_noteq_),
            (PHashexpression) cloneNode(_hashexpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotequalComparisonexpression(this);
    }

    public PComparisonexpression getComparisonexpression()
    {
        return _comparisonexpression_;
    }

    public void setComparisonexpression(PComparisonexpression node)
    {
        if(_comparisonexpression_ != null)
        {
            _comparisonexpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comparisonexpression_ = node;
    }

    public TNoteq getNoteq()
    {
        return _noteq_;
    }

    public void setNoteq(TNoteq node)
    {
        if(_noteq_ != null)
        {
            _noteq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _noteq_ = node;
    }

    public PHashexpression getHashexpression()
    {
        return _hashexpression_;
    }

    public void setHashexpression(PHashexpression node)
    {
        if(_hashexpression_ != null)
        {
            _hashexpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _hashexpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_comparisonexpression_)
            + toString(_noteq_)
            + toString(_hashexpression_);
    }

    void removeChild(Node child)
    {
        if(_comparisonexpression_ == child)
        {
            _comparisonexpression_ = null;
            return;
        }

        if(_noteq_ == child)
        {
            _noteq_ = null;
            return;
        }

        if(_hashexpression_ == child)
        {
            _hashexpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_comparisonexpression_ == oldChild)
        {
            setComparisonexpression((PComparisonexpression) newChild);
            return;
        }

        if(_noteq_ == oldChild)
        {
            setNoteq((TNoteq) newChild);
            return;
        }

        if(_hashexpression_ == oldChild)
        {
            setHashexpression((PHashexpression) newChild);
            return;
        }

    }
}
