package X;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.6aX  reason: invalid class name and case insensitive filesystem */
public class C129576aX<E> extends C129586aY<E> {
    public final transient C129586aY forwardList;

    public boolean contains(Object obj) {
        return this.forwardList.contains(obj);
    }

    public int indexOf(Object obj) {
        int lastIndexOf = this.forwardList.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return reverseIndex(lastIndexOf);
        }
        return -1;
    }

    public boolean isPartialView() {
        return this.forwardList.isPartialView();
    }

    public int lastIndexOf(Object obj) {
        int indexOf = this.forwardList.indexOf(obj);
        if (indexOf >= 0) {
            return reverseIndex(indexOf);
        }
        return -1;
    }

    public C129586aY reverse() {
        return this.forwardList;
    }

    public int size() {
        return this.forwardList.size();
    }

    public C129576aX(C129586aY r1) {
        this.forwardList = r1;
    }

    private int reverseIndex(int i) {
        return C86664Kz.A0M(this) - i;
    }

    private int reversePosition(int i) {
        return size() - i;
    }

    public Object get(int i) {
        C162187rP.A01(i, size());
        return this.forwardList.get(reverseIndex(i));
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    public C129586aY subList(int i, int i2) {
        C162187rP.A03(i, i2, size());
        return this.forwardList.subList(reversePosition(i2), reversePosition(i)).reverse();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }
}
