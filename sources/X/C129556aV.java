package X;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.6aV  reason: invalid class name and case insensitive filesystem */
public class C129556aV extends C129586aY<E> {
    public final transient int length;
    public final transient int offset;
    public final /* synthetic */ C129586aY this$0;

    public C129556aV(C129586aY r1, int i, int i2) {
        this.this$0 = r1;
        this.offset = i;
        this.length = i2;
    }

    public Object get(int i) {
        C162187rP.A01(i, this.length);
        return this.this$0.get(i + this.offset);
    }

    public Object[] internalArray() {
        return this.this$0.internalArray();
    }

    public int internalArrayEnd() {
        return this.this$0.internalArrayStart() + this.offset + this.length;
    }

    public int internalArrayStart() {
        return this.this$0.internalArrayStart() + this.offset;
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.length;
    }

    public C129586aY subList(int i, int i2) {
        C162187rP.A03(i, i2, this.length);
        C129586aY r1 = this.this$0;
        int i3 = this.offset;
        return r1.subList(i + i3, i2 + i3);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }
}
