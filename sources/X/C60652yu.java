package X;

import java.util.List;

/* renamed from: X.2yu  reason: invalid class name and case insensitive filesystem */
public final class C60652yu {
    public final List A00;
    public final List A01;
    public final AnonymousClass66R A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60652yu) {
                C60652yu r5 = (C60652yu) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C60652yu(List list, List list2) {
        C18260x0.A0Q(list, list2);
        this.A00 = list;
        this.A01 = list2;
        this.A02 = C154517dI.A00(AnonymousClass58H.NONE, new C77533tY(this));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LidContactDelta(lidContactsAdded=");
        A0o.append(this.A00);
        A0o.append(", lidContactsRemoved=");
        return C18260x0.A04(this.A01, A0o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60652yu() {
        /*
            r1 = this;
            X.3d3 r0 = X.C72023d3.A00
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60652yu.<init>():void");
    }
}
