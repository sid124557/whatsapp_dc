package X;

import android.net.Uri;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.80j  reason: invalid class name and case insensitive filesystem */
public final class C1672580j implements C177618gA {
    public static final C1672480i A0B;
    public static final Object A0C = AnonymousClass002.A0D();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C1672480i A07 = A0B;
    public Object A08 = A0C;
    public boolean A09;
    public boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C1672580j.class)) {
                return false;
            }
            C1672580j r7 = (C1672580j) obj;
            if (!(Util.A0D(this.A08, r7.A08) && Util.A0D(this.A07, r7.A07) && this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A0A == r7.A0A && this.A09 == r7.A09 && this.A02 == r7.A02 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass6C7.A03(AnonymousClass6C7.A03((((AnonymousClass6C7.A03(AnonymousClass6C7.A03(AnonymousClass6C7.A03(AnonymousClass000.A08(this.A07, (217 + this.A08.hashCode()) * 31) * 31 * 31, this.A05), this.A06), this.A04) + (this.A0A ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31 * 31, this.A02), this.A03) + this.A00) * 31) + this.A01) * 31) + ((int) (0 ^ (0 >>> 32)));
    }

    static {
        AnonymousClass7U8 r1 = new AnonymousClass7U8();
        r1.A04 = "com.facebook.android.exoplayer2.Timeline";
        r1.A00 = Uri.EMPTY;
        A0B = r1.A00();
    }
}
