package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.2YK  reason: invalid class name */
public class AnonymousClass2YK {
    public final C54292oU A00;
    public final C34211uP A01;

    public void A00(String str) {
        int i = Build.VERSION.SDK_INT;
        Uri parse = Uri.parse("content://com.whatsapp.provider.instrumentation");
        Context context = this.A00.A00;
        if (i >= 26) {
            context.revokeUriPermission(str, parse, 3);
        } else {
            context.revokeUriPermission(parse, 3);
        }
    }

    public AnonymousClass2YK(C54292oU r1, C34211uP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
