package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.1rJ  reason: invalid class name and case insensitive filesystem */
public class C32601rJ extends C152657Zu {
    public final ImageView A00;
    public final C55782qu A01;
    public final C183108pV A02;

    public C32601rJ(ImageView imageView, C55782qu r11, AnonymousClass39M r12, C183108pV r13, Integer num, String str, int i, int i2, int i3, boolean z, boolean z2) {
        super(r12, num, str, i, i2, i3, z, z2);
        this.A00 = imageView;
        this.A02 = r13;
        this.A01 = r11;
    }

    public Context A00() {
        return this.A00.getContext();
    }

    public boolean A02() {
        return this.A05.equals(this.A00.getTag());
    }

    public void A01(Drawable drawable, C69263Wi r4) {
        C626936e.A06(r4);
        r4.A0S(new C71573cK(this, 12, drawable));
    }
}
