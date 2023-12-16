package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.7Wk  reason: invalid class name and case insensitive filesystem */
public final class C151817Wk {
    public int A00;
    public long A01;
    public long A02;
    public C156497gj A03 = C156497gj.A03;
    public Object A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C151817Wk.class)) {
                return false;
            }
            C151817Wk r7 = (C151817Wk) obj;
            if (!(Util.A0D(this.A04, r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02 && Util.A0D(this.A03, r7.A03))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, AnonymousClass6C7.A03(AnonymousClass6C7.A03((((6727 + C18310x6.A07(this.A04)) * 31) + this.A00) * 31, this.A01), this.A02) * 31);
    }
}
