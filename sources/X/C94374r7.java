package X;

import java.util.List;

/* renamed from: X.4r7  reason: invalid class name and case insensitive filesystem */
public final class C94374r7 extends C100445Ay {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94374r7) {
                C94374r7 r5 = (C94374r7) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)) + 1231;
    }

    public C94374r7(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiData(sections=");
        A0o.append(this.A01);
        A0o.append(", items=");
        A0o.append(this.A00);
        A0o.append(", isFinalData=");
        return C18260x0.A0A(A0o, true);
    }
}
