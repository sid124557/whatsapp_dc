package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.80i  reason: invalid class name and case insensitive filesystem */
public final class C1672480i implements C177618gA {
    public static final C1672480i A07 = new AnonymousClass7U8().A00();
    public final AnonymousClass80d A00;
    @Deprecated
    public final AnonymousClass6JS A01;
    public final AnonymousClass80c A02;
    public final AnonymousClass7WS A03;
    @Deprecated
    public final AnonymousClass6JT A04;
    public final AnonymousClass80e A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672480i)) {
            return false;
        }
        C1672480i r4 = (C1672480i) obj;
        return Util.A0D(this.A06, r4.A06) && this.A00.equals(r4.A00) && Util.A0D(this.A03, r4.A03) && Util.A0D(this.A02, r4.A02) && Util.A0D(this.A05, r4.A05);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A05, AnonymousClass000.A08(this.A00, AnonymousClass000.A08(this.A02, (C18310x6.A09(this.A06) + C18280x3.A04(this.A03)) * 31)));
    }

    public C1672480i(AnonymousClass6JS r1, AnonymousClass80c r2, AnonymousClass6JT r3, AnonymousClass80e r4, String str) {
        this.A06 = str;
        this.A03 = r3;
        this.A04 = r3;
        this.A02 = r2;
        this.A05 = r4;
        this.A00 = r1;
        this.A01 = r1;
    }
}
