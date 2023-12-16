package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: X.8A5  reason: invalid class name */
public final class AnonymousClass8A5 implements C178478hb {
    public static final Map A07 = new AnonymousClass05C();
    public static final String[] A08 = {"key", "value"};
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Uri A02;
    public final Object A03 = AnonymousClass002.A0D();
    public final Runnable A04;
    public final List A05 = AnonymousClass001.A0s();
    public volatile Map A06;

    public AnonymousClass8A5(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C124476Ck r1 = new C124476Ck(this);
        this.A01 = r1;
        contentResolver.getClass();
        this.A00 = contentResolver;
        this.A02 = uri;
        this.A04 = runnable;
        contentResolver.registerContentObserver(uri, false, r1);
    }
}
