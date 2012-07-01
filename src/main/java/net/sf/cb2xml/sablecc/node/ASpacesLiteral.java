/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ASpacesLiteral extends PLiteral
{
    private TSpaces _spaces_;

    public ASpacesLiteral ()
    {
    }

    public ASpacesLiteral (TSpaces _spaces_)
    {
        setSpaces (_spaces_);
    }

    public Object clone ()
    {
        return new ASpacesLiteral((TSpaces) cloneNode (_spaces_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseASpacesLiteral (this);
    }

    public TSpaces getSpaces ()
    {
        return _spaces_;
    }

    public void setSpaces (TSpaces node)
    {
        if (_spaces_ != null)
        {
            _spaces_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _spaces_ = node;
    }

    public String toString ()
    {
        return "" + toString (_spaces_);
    }

    void removeChild (Node child)
    {
        if (_spaces_ == child)
        {
            _spaces_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_spaces_ == oldChild)
        {
            setSpaces ((TSpaces) newChild);

            return;
        }
    }
}