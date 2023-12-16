package X;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7eN  reason: invalid class name and case insensitive filesystem */
public final class C155157eN {
    public static final AtomicInteger A00 = new AtomicInteger(1);

    public static final C152777a6 A00(Uri uri, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C162457s7.A0J(uri, 0);
        C151277Uc r0 = new C151277Uc(C141266vI.IN_PLAY, C166577yv.A00(uri, String.valueOf(A00.addAndGet(1)), "WA_Player_Origin", "WA_Player_SubOrigin", AnonymousClass001.A0t()), "WA_MEDIA", C141076uz.AUDIO_VIDEO.mValue);
        r0.A0C = true;
        r0.A0D = true;
        r0.A0B = z;
        r0.A00 = i;
        r0.A0A = z2;
        r0.A0E = z3;
        r0.A0F = z4;
        return r0.A00();
    }
}
