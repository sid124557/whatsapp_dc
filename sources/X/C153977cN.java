package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7cN  reason: invalid class name and case insensitive filesystem */
public class C153977cN {
    public static long A00(Context context, C180608lL r9, C142366x5 r10, AnonymousClass7QR r11) {
        C153537bV r0 = r11.A05;
        if (r0 != null) {
            return C160887oa.A00(r9, r10, r0);
        }
        File file = r11.A0A;
        if (file != null) {
            long j = r11.A02;
            if (j < 0) {
                j = 0;
            }
            long j2 = r11.A00;
            if (j2 < 0) {
                Uri fromFile = Uri.fromFile(file);
                C162457s7.A0J(fromFile, 0);
                C151307Uf A00 = C159277lY.A00(context, fromFile, false);
                if (A00 == null) {
                    return -1;
                }
                j2 = A00.A07;
            }
            return TimeUnit.MILLISECONDS.toMicros(j2 - j);
        }
        throw new C143926zh("No input data source provided");
    }

    public static void A01(C160727oD r6, AnonymousClass7QR r7) {
        C153247av r0;
        C153537bV r1 = r7.A05;
        if (r1 != null) {
            C153007aW A00 = r1.A00(C142366x5.AUDIO, 0);
            C159297la.A02(AnonymousClass000.A1W(A00), "get null audio track when setting data source from MediaComposition");
            List list = A00.A02;
            r6.A0B = AnonymousClass6C9.A0T(list).A02;
            AnonymousClass002.A0J(list).get(0);
            r0 = AnonymousClass6C9.A0T(list).A01;
        } else {
            File file = r7.A0A;
            if (file != null) {
                r6.A0B = file;
                r0 = new C153247av(TimeUnit.MILLISECONDS, r7.A02, r7.A00);
            } else {
                throw new AnonymousClass6O2("No valid data source provided");
            }
        }
        r6.A07 = r0;
    }
}
