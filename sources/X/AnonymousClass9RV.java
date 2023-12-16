package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9RV  reason: invalid class name */
public class AnonymousClass9RV {
    public final C64393Dh A00;
    public final AnonymousClass33Q A01;
    public final AnonymousClass4FS A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public AnonymousClass9RV(C64393Dh r2, AnonymousClass33Q r3, AnonymousClass4FS r4) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A00(ImageView imageView, AnonymousClass39R r11, int i, int i2) {
        Drawable drawable;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentBackgroundMetadata{id='");
        AnonymousClass39R r4 = r11;
        A0o.append(r11.A0F);
        A0o.append("',fileSize=");
        A0o.append(r11.A0E);
        A0o.append(",width=");
        A0o.append(r11.A0D);
        A0o.append(",height=");
        A0o.append(r11.A09);
        A0o.append(",mimetype='");
        A0o.append(r11.A0G);
        A0o.append("'}_");
        int i3 = i;
        A0o.append(i);
        int i4 = i2;
        String A0Y = AnonymousClass000.A0Y("_", A0o, i2);
        ImageView imageView2 = imageView;
        imageView.setTag(A0Y);
        Drawable drawable2 = imageView.getDrawable();
        Reference reference = (Reference) this.A03.get(A0Y);
        if (reference != null) {
            drawable = (Drawable) reference.get();
        } else {
            drawable = null;
        }
        if (drawable2 != null && drawable2.equals(drawable)) {
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        C18270x1.A0w(new C191839Gq(imageView2, r4, this, A0Y, i3, i4), this.A02);
    }
}
