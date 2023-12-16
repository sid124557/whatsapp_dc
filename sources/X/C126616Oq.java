package X;

import java.util.List;

/* renamed from: X.6Oq  reason: invalid class name and case insensitive filesystem */
public final class C126616Oq extends C157147ho {
    public final long A00;
    public final List A01 = AnonymousClass001.A0s();
    public final List A02 = AnonymousClass001.A0s();

    public C126616Oq A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C126616Oq r1 = (C126616Oq) list.get(i2);
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public C126606Op A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C126606Op r1 = (C126606Op) list.get(i2);
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public C126616Oq(int i, long j) {
        super(i);
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C157147ho.A00(this.A00));
        A0o.append(" leaves: ");
        C18320x8.A1P(A0o, this.A02.toArray());
        A0o.append(" containers: ");
        C18320x8.A1P(A0o, this.A01.toArray());
        return A0o.toString();
    }
}
