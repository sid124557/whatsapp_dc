package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Q5  reason: invalid class name */
public abstract class AnonymousClass0Q5 {
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public abstract Typeface A01(Context context, Resources resources, AnonymousClass0KK r3, int i);

    public abstract Typeface A03(Context context, CancellationSignal cancellationSignal, AnonymousClass0MK[] r3, int i);

    public AnonymousClass0MK A04(AnonymousClass0MK[] r11, int i) {
        int i2 = 700;
        if ((i & 1) == 0) {
            i2 = 400;
        }
        boolean A1S = AnonymousClass000.A1S(i & 2);
        AnonymousClass0MK r6 = null;
        int i3 = Integer.MAX_VALUE;
        for (AnonymousClass0MK r3 : r11) {
            int A0A = AnonymousClass001.A0A(r3.A02, i2) * 2;
            int i4 = 1;
            if (r3.A04 == A1S) {
                i4 = 0;
            }
            int i5 = A0A + i4;
            if (r6 == null || i3 > i5) {
                r6 = r3;
                i3 = i5;
            }
        }
        return r6;
    }

    public Typeface A02(Context context, Resources resources, String str, int i, int i2) {
        File A002 = AnonymousClass0WX.A00(context);
        if (A002 == null) {
            return null;
        }
        try {
            if (!AnonymousClass0WX.A02(resources, A002, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(A002.getPath());
            A002.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A002.delete();
        }
    }
}
