package X;

import java.util.List;

/* renamed from: X.6Jp  reason: invalid class name and case insensitive filesystem */
public final class C125816Jp extends C160197nC {
    public final long A00;
    public final List A01 = AnonymousClass001.A0s();
    public final List A02 = AnonymousClass001.A0s();

    public C125816Jp A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C125816Jp r1 = (C125816Jp) list.get(i2);
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public C125806Jo A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C125806Jo r1 = (C125806Jo) list.get(i2);
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public C125816Jp(int i, long j) {
        super(i);
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C160197nC.A00(this.A00));
        A0o.append(" leaves: ");
        C18320x8.A1P(A0o, this.A02.toArray());
        A0o.append(" containers: ");
        C18320x8.A1P(A0o, this.A01.toArray());
        return A0o.toString();
    }
}
