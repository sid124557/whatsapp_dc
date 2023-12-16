package X;

import android.util.Log;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.7W4  reason: invalid class name */
public class AnonymousClass7W4 {
    public boolean A00 = false;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();
    public final /* synthetic */ C158787kY A02;

    public AnonymousClass7W4(C158787kY r2) {
        this.A02 = r2;
    }

    public final C186508vT A00(String str, boolean z) {
        if (z && str.equals("meta.dav1d.av1.decoder")) {
            try {
                return (C186508vT) AnonymousClass6C8.A0d(Class.forName("exoplayer2.av1.src.Dav1dMediaCodecAdapter"));
            } catch (Exception e) {
                Object[] A1b = C18310x6.A1b("exoplayer2.av1.src.Dav1dMediaCodecAdapter", 0);
                AnonymousClass6C9.A1C(e, A1b, 1);
                Log.w("MediaCodecPoolOptimized", String.format("Exception when trying to instantiate %s: %s", A1b));
            }
        }
        return new AnonymousClass81F(str);
    }

    public final void A01(C186508vT r5, String str) {
        Set set;
        C158787kY r3 = this.A02;
        synchronized (r3.A03) {
            set = (Set) r3.A03.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(r5)) {
                    r3.A00--;
                }
            }
        }
    }
}
