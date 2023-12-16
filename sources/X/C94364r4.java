package X;

import java.util.List;

/* renamed from: X.4r4  reason: invalid class name and case insensitive filesystem */
public final class C94364r4 extends C100435Ax {
    public final Integer A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94364r4) {
                C94364r4 r5 = (C94364r4) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, C18300x5.A04(this.A02)) + AnonymousClass000.A07(this.A00);
    }

    public C94364r4(Integer num, List list, List list2) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiGrid(sections=");
        A0o.append(this.A02);
        A0o.append(", items=");
        A0o.append(this.A01);
        A0o.append(", qplInstanceKey=");
        return C18260x0.A04(this.A00, A0o);
    }
}
