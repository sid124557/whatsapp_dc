package X;

/* renamed from: X.85s  reason: invalid class name and case insensitive filesystem */
public class C1685185s implements C177988gm {
    public int A00;
    public boolean A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final AnonymousClass88T A07;

    public C1685185s(AnonymousClass88T r6, int i, int i2, int i3, int i4) {
        A00(i3, 0, "bufferForPlaybackMs", "0");
        A00(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        A00(i, i3, "minBufferMs", "bufferForPlaybackMs");
        A00(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        A00(i2, i, "maxBufferMs", "minBufferMs");
        A00(0, 0, "backBufferDurationMs", "0");
        this.A07 = r6;
        this.A06 = C161207pD.A00((long) i);
        this.A05 = C161207pD.A00((long) i2);
        this.A04 = C161207pD.A00((long) i3);
        this.A03 = C161207pD.A00((long) i4);
        this.A00 = 13107200;
        this.A02 = C161207pD.A00((long) 0);
    }

    public static void A00(int i, int i2, String str, String str2) {
        boolean A1U = C18280x3.A1U(i, i2);
        String A0V = AnonymousClass000.A0V(" cannot be less than ", str2, AnonymousClass000.A0l(str));
        if (!A1U) {
            throw AnonymousClass6C7.A0U(A0V);
        }
    }

    public C1685185s() {
        this(new AnonymousClass88T(65536), 50000, 50000, 2500, 5000);
    }
}
