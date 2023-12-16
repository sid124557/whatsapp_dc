package X;

/* renamed from: X.9Gr  reason: invalid class name and case insensitive filesystem */
public class C191849Gr extends AnonymousClass5ZM {
    public final int A00 = 15;
    public final int A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass9U4 A04;
    public final Runnable A05;
    public final String A06;

    public C191849Gr(AnonymousClass9U4 r2, Runnable runnable, String str, int i, long j, long j2) {
        this.A06 = str;
        this.A01 = i;
        this.A02 = j;
        this.A03 = j2;
        this.A04 = r2;
        this.A05 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass9U4.A01(this.A04).A0b(this.A06, this.A01, this.A00, this.A02, this.A03);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A05.run();
    }
}
