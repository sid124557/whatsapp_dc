package X;

import android.util.SparseArray;

/* renamed from: X.0Td  reason: invalid class name and case insensitive filesystem */
public final class C05390Td {
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final C16330sq A02;
    public final C15460rN A03;

    public C05390Td(C16330sq r2, C15460rN r3) {
        this.A03 = r3;
        this.A02 = r2;
    }

    public final AnonymousClass5Z2 A01(C153427bI r5, int i) {
        AnonymousClass7WH A002 = AnonymousClass5Z2.A00(String.valueOf(i));
        A002.A01(new C03840Lt(new AnonymousClass0LQ(this, i), this.A02.B0t(r5), r5));
        return A002.A00();
    }
}
