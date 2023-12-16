package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.7gs  reason: invalid class name and case insensitive filesystem */
public class C156587gs {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ AnonymousClass6N7 A03;

    public C156587gs(AnonymousClass6N7 r1) {
        this.A03 = r1;
    }

    public static /* synthetic */ void A00(C156587gs r6) {
        int i;
        int i2;
        if (r6.A02 != null) {
            int i3 = r6.A00;
            AnonymousClass6N7 r4 = r6.A03;
            AnonymousClass7NY[] r0 = r4.A07;
            if (r0 == null) {
                i = 0;
            } else {
                i = r0.length;
            }
            while (true) {
                if (i3 >= i) {
                    i2 = r6.A01;
                    break;
                }
                AnonymousClass7NY r2 = r4.A07[i3];
                if (r2 != null) {
                    if (r2.A01.A07.A04 == C141236vF.VIEW) {
                        i2 = i3 + 1;
                        break;
                    } else if (r2.A03) {
                        ((Drawable) r2.A02).draw(r6.A02);
                    }
                }
                i3++;
            }
            r6.A00 = i2;
        }
    }
}
