package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.5aN  reason: invalid class name and case insensitive filesystem */
public final class C106915aN {
    public static float A00 = 1.0f;
    public static long A01;
    public static Context A02;
    public static final float A03 = (((float) Math.sqrt(3.0d)) / 2.0f);
    public static final HashMap A04 = new HashMap(16);

    public static AnonymousClass7AD A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("hue_");
        A0o.append(240.0f);
        return A02(new C110905hE(), A0o.toString());
    }

    public static AnonymousClass7AD A02(C180318kq r9, String str) {
        AnonymousClass7AD r7;
        HashMap hashMap = A04;
        Reference reference = (Reference) hashMap.get(str);
        if (reference == null || (r7 = (AnonymousClass7AD) reference.get()) == null) {
            Bitmap B0P = r9.B0P();
            if (B0P == null) {
                return null;
            }
            r7 = new AnonymousClass7AD(B0P);
            hashMap.put(str, AnonymousClass0x9.A14(r7));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = A01;
        if (j >= 600000 || j == 0) {
            A01 = uptimeMillis;
            Iterator A0u = AnonymousClass001.A0u(hashMap);
            while (A0u.hasNext()) {
                if (((Reference) AnonymousClass0x2.A0W(A0u)).get() == null) {
                    A0u.remove();
                }
            }
        }
        return r7;
    }

    public static AnonymousClass7AD A01(Bitmap bitmap) {
        return new AnonymousClass7AD(bitmap.copy(bitmap.getConfig(), false));
    }

    public static void A03(Canvas canvas, Paint paint, float f, float f2, float f3) {
        Path A06 = AnonymousClass002.A06();
        float f4 = 2.0f * f3;
        float f5 = f2 - f4;
        A06.moveTo(f, f5);
        A06.arcTo(AnonymousClass4L0.A09(f - f3, f5 - f3, f + f3, f5 + f3), 30.0f, -240.0f, true);
        A06.lineTo(f, f4 + f5);
        C86654Ky.A0z(canvas, paint, A06, f + (A03 * f3), f5 + (f3 * 0.5f));
    }
}
