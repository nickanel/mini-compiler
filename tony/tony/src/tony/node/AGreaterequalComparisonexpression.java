/* This file was generated by SableCC (http://www.sablecc.org/). */

package tony.node;

import java.util.*;
import tony.analysis.*;

public final class AGreaterequalComparisonexpression extends PComparisonexpression
{
    private PComparisonexpression _comparisonexpression_;
    private TGreatereq _greatereq_;
    private PHashexpression _hashexpression_;

    public AGreaterequalComparisonexpression()
    {
    }

    public AGreaterequalComparisonexpression(
        PComparisonexpression _comparisonexpression_,
        TGreatereq _greatereq_,
        PHashexpression _hashexpression_)
    {
        setComparisonexpression(_comparisonexpression_);

        setGreatereq(_greatereq_);

        setHashexpression(_hashexpression_);

    }
    public Object clone()
    {
        return new AGreaterequalComparisonexpression(
            (PComparisonexpression) cloneNode(_comparisonexpression_),
            (TGreatereq) cloneNode(_greatereq_),
            (PHashexpression) cloneNode(_hashexpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreaterequalComparisonexpression(this);
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

    public TGreatereq getGreatereq()
    {
        return _greatereq_;
    }

    public void setGreatereq(TGreatereq node)
    {
        if(_greatereq_ != null)
        {
            _greatereq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _greatereq_ = node;
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
            + toString(_greatereq_)
            + toString(_hashexpression_);
    }

    void removeChild(Node child)
    {
        if(_comparisonexpression_ == child)
        {
            _comparisonexpression_ = null;
            return;
        }

        if(_greatereq_ == child)
        {
            _greatereq_ = null;
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

        if(_greatereq_ == oldChild)
        {
            setGreatereq((TGreatereq) newChild);
            return;
        }

        if(_hashexpression_ == oldChild)
        {
            setHashexpression((PHashexpression) newChild);
            return;
        }

    }
}
