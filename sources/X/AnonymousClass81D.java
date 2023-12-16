package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.81D  reason: invalid class name */
public class AnonymousClass81D implements C180188kd {
    public final AnonymousClass7F7 A00;

    public C186508vT B0N(String str, boolean z) {
        AnonymousClass7F7 r3 = this.A00;
        if (z && str.equals("meta.dav1d.av1.decoder")) {
            try {
                C186508vT r0 = (C186508vT) AnonymousClass6C8.A0d(Class.forName("exoplayer2.av1.src.Dav1dMediaCodecAdapter"));
                if (r0 != null) {
                    return r0;
                }
            } catch (Exception e) {
                Object[] A1b = C18310x6.A1b("exoplayer2.av1.src.Dav1dMediaCodecAdapter", 0);
                AnonymousClass6C9.A1C(e, A1b, 1);
                Log.w("CodecSuppierImpl", String.format("Exception when trying to instantiate %s: %s", A1b));
            }
        }
        if (!r3.A00 || !z || Util.A00 < 23) {
            return new AnonymousClass81F(str);
        }
        return new AnonymousClass81E(r3.A01).A02(str);
    }

    public AnonymousClass81D(boolean z, boolean z2) {
        this.A00 = new AnonymousClass7F7(z, z2);
    }
}
