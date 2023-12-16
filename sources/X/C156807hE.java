package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.7hE  reason: invalid class name and case insensitive filesystem */
public abstract class C156807hE {
    public static final Uri A05 = Uri.parse("https://www.facebook.com/maps/report/?");
    public final Context A00;
    public final AnonymousClass7AB A01;
    public final AnonymousClass7AC A02;
    public final CharSequence A03 = "";
    public final CharSequence A04 = "";

    public C156807hE(Context context) {
        this.A00 = context;
        this.A01 = new AnonymousClass7AB(context);
        this.A02 = new AnonymousClass7AC(this);
    }
}
