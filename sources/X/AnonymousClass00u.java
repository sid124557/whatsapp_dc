package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: X.00u  reason: invalid class name */
public class AnonymousClass00u extends Paint {
    public AnonymousClass00u(int i, PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public AnonymousClass00u(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public AnonymousClass00u(int i) {
        super(i);
    }

    public AnonymousClass00u() {
    }
}
