package X;

import android.net.Uri;
import android.os.Handler;
import android.util.LruCache;

/* renamed from: X.7hG  reason: invalid class name and case insensitive filesystem */
public class C156817hG {
    public final Handler A00 = AnonymousClass000.A0A();
    public final LruCache A01;
    public final LruCache A02;
    public final C146577Au A03;
    public final AnonymousClass8LG A04;
    public final C186628vg A05;

    public static String A00(C152777a6 r2, AnonymousClass8LG r3) {
        boolean z = r3.useVideoSourceAsWarmupKey;
        C166577yv r32 = r2.A0F;
        if (!z) {
            return r32.A0H;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        String str = r32.A0H;
        if (str != null) {
            A0o.append("\n\tId: ");
            A0o.append(str);
        }
        Uri uri = r32.A05;
        if (uri != null) {
            A0o.append("\n\tUri: ");
            A0o.append(uri);
        }
        return A0o.toString();
    }

    public C156817hG(C146577Au r4, AnonymousClass8LG r5, C186628vg r6) {
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = new C188708zM(this, r5.playerWarmUpPoolSize, 2);
        this.A02 = new C188708zM(this);
    }
}
