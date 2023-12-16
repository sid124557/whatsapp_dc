package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* renamed from: X.0TI  reason: invalid class name */
public class AnonymousClass0TI {
    public static final Object A04 = AnonymousClass002.A0D();
    public C15430rK A00;
    public final Context A01;
    public final String A02;
    public final Map A03;

    public AnonymousClass0TI(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = AnonymousClass001.A0j(AnonymousClass000.A0l(str), '/');
        }
        this.A02 = str;
        if (!(callback instanceof View)) {
            AnonymousClass0S3.A00("LottieDrawable must be inside of a view for images to work.");
            this.A03 = AnonymousClass001.A0t();
            return;
        }
        this.A01 = ((View) callback).getContext();
        this.A03 = map;
        this.A00 = null;
    }
}
