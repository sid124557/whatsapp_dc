package X;

import java.util.Objects;

/* renamed from: X.6aT  reason: invalid class name and case insensitive filesystem */
public final class C129536aT extends C129586aY<Object> {
    public final transient Object[] alternatingKeysAndValues;
    public final transient int offset;
    public final transient int size;

    public Object get(int i) {
        C162187rP.A01(i, this.size);
        Object obj = this.alternatingKeysAndValues[(i * 2) + this.offset];
        Objects.requireNonNull(obj);
        return obj;
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.size;
    }

    public C129536aT(Object[] objArr, int i, int i2) {
        this.alternatingKeysAndValues = objArr;
        this.offset = i;
        this.size = i2;
    }
}
