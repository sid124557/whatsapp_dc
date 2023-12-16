package X;

import android.media.AudioAttributes;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.79w  reason: invalid class name and case insensitive filesystem */
public final class C1463379w {
    public final AudioAttributes A00;

    public C1463379w(AnonymousClass80g r4) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(r4.A01);
        int i = Util.A00;
        if (i >= 29) {
            C1442870t.A00(usage, 1);
            if (i >= 32) {
                C1442970u.A00(usage, 0);
            }
        }
        this.A00 = usage.build();
    }
}
