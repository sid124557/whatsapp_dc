package X;

import java.util.Iterator;

/* renamed from: X.2jt  reason: invalid class name and case insensitive filesystem */
public final class C51482jt {
    public final long A00;
    public final C95814uZ A01;

    public C51482jt(C95814uZ r2, long j) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51482jt) {
                C51482jt r8 = (C51482jt) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(C18300x5.A04(this.A01), this.A00);
    }

    public static C95814uZ A00(Iterator it) {
        return ((C51482jt) it.next()).A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConversationInfo(jid=");
        A0o.append(this.A01);
        A0o.append(", timestampMillis=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
