package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.7Zu  reason: invalid class name and case insensitive filesystem */
public abstract class C152657Zu {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass39M A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public Context A00() {
        return ((C137796pH) this).A00;
    }

    public void A01(Drawable drawable, C69263Wi r6) {
        C137796pH r3 = (C137796pH) this;
        if (drawable != null) {
            drawable.setBounds(0, 0, r3.A02, r3.A00);
            r3.A01.Bca(drawable);
        }
    }

    public boolean A02() {
        return true;
    }

    public C152657Zu(AnonymousClass39M r1, Integer num, String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = r1;
        this.A05 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A06 = z;
        this.A01 = i3;
        this.A07 = z2;
        this.A04 = num;
    }
}
