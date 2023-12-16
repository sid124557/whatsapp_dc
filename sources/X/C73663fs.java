package X;

import java.util.RandomAccess;

/* renamed from: X.3fs  reason: invalid class name and case insensitive filesystem */
public final class C73663fs<E> extends C73683fu<E> implements RandomAccess {
    public int A00;
    public final int A01;
    public final C73683fu A02;

    public C73663fs(C73683fu r2, int i, int i2) {
        this.A02 = r2;
        this.A01 = i;
        AnonymousClass347.A03(i, i2, r2.size());
        this.A00 = i2 - i;
    }
}
