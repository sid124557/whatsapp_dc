package X;

import java.util.AbstractCollection;

/* renamed from: X.4w9  reason: invalid class name and case insensitive filesystem */
public class C96304w9 extends C136186lz {
    public final int A00;
    public final C185878uO A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.A00 == ((C96304w9) obj).A00;
        }
        return true;
    }

    public C96304w9(C185878uO r2, int i) {
        super(16);
        this.A00 = i;
        this.A01 = r2;
    }

    public static void A00(C185878uO r1, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C96304w9(r1, i));
    }
}
