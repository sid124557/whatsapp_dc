package X;

import android.net.Uri;

/* renamed from: X.7kK  reason: invalid class name and case insensitive filesystem */
public final class C158647kK {
    public static final C151877Wq A0E;
    public static final Object A0F = AnonymousClass002.A0D();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C151387Uo A06;
    public C151877Wq A07 = A0E;
    @Deprecated
    public Object A08;
    public Object A09 = A0F;
    public boolean A0A;
    @Deprecated
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C158647kK.class)) {
                return false;
            }
            C158647kK r7 = (C158647kK) obj;
            if (!(C162387ry.A0D(this.A09, r7.A09) && C162387ry.A0D(this.A07, r7.A07) && C162387ry.A0D(this.A06, r7.A06) && this.A04 == r7.A04 && this.A05 == r7.A05 && this.A03 == r7.A03 && this.A0D == r7.A0D && this.A0A == r7.A0A && this.A0C == r7.A0C && this.A02 == r7.A02 && this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (int) (0 ^ (0 >>> 32));
        return ((((AnonymousClass6C7.A03((((((((AnonymousClass6C7.A03(AnonymousClass6C7.A03(AnonymousClass6C7.A03(((AnonymousClass000.A08(this.A07, (217 + this.A09.hashCode()) * 31) * 31) + C18310x6.A07(this.A06)) * 31, this.A04), this.A05), this.A03) + (this.A0D ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + i) * 31, this.A02) + this.A00) * 31) + this.A01) * 31) + i;
    }

    static {
        AnonymousClass7UC r1 = new AnonymousClass7UC();
        r1.A02 = "com.google.android.exoplayer2.Timeline";
        r1.A00 = Uri.EMPTY;
        A0E = r1.A00();
    }

    public void A00(C151387Uo r5, C151877Wq r6, Object obj, long j, boolean z, boolean z2) {
        C151877Wq r2;
        Object obj2;
        AnonymousClass7WW r22;
        this.A09 = obj;
        if (r6 != null) {
            r2 = r6;
        } else {
            r2 = A0E;
        }
        this.A07 = r2;
        if (r6 == null || (r22 = r6.A02) == null) {
            obj2 = null;
        } else {
            obj2 = r22.A01;
        }
        this.A08 = obj2;
        this.A04 = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A0D = z;
        this.A0A = z2;
        this.A0B = AnonymousClass000.A1W(r5);
        this.A06 = r5;
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0;
        this.A0C = false;
    }
}
