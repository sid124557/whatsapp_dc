package X;

import android.os.SystemClock;
import java.util.TimeZone;

/* renamed from: X.7MH  reason: invalid class name */
public class AnonymousClass7MH {
    public C143026yD A00;
    public boolean A01 = false;
    public final AnonymousClass6WC A02;
    public final /* synthetic */ C156917hQ A03;

    public AnonymousClass7MH(C156917hQ r6, byte[] bArr) {
        this.A03 = r6;
        this.A00 = r6.A00;
        AnonymousClass6WC r4 = new AnonymousClass6WC();
        this.A02 = r4;
        r4.A08 = C161177p8.A00(r6.A02);
        long currentTimeMillis = System.currentTimeMillis();
        r4.A01 = currentTimeMillis;
        r4.A02 = SystemClock.elapsedRealtime();
        r4.A03 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
        r4.A0A = bArr;
    }
}
