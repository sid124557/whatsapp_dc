package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.7cE  reason: invalid class name and case insensitive filesystem */
public class C153907cE {
    public static Bundle A00(ContentResolver contentResolver, Uri uri, Bundle bundle, C150827Sj r5, String str) {
        int i;
        r5.A00(uri);
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                Bundle call = acquireUnstableContentProviderClient.call(str, (String) null, bundle);
                if (i >= 24) {
                    return call;
                }
                acquireUnstableContentProviderClient.release();
                return call;
            } finally {
                if (Build.VERSION.SDK_INT >= 24) {
                    acquireUnstableContentProviderClient.close();
                    throw th;
                }
                acquireUnstableContentProviderClient.release();
            }
        } else {
            throw AnonymousClass001.A0e("Failed to acquire client");
        }
    }

    public static void A01(Bundle bundle, AnonymousClass7R9 r4, String str) {
        String str2;
        bundle.getClass();
        Bundle bundle2 = bundle.getBundle("@exception@");
        if (bundle2 != null) {
            C156567gq A00 = r4.A00(bundle2);
            AnonymousClass8SB r2 = new AnonymousClass8SB(A00);
            Throwable th = A00.A03;
            if (th != null) {
                C156567gq.A00(th, r2);
            } else {
                String str3 = A00.A02;
                if (str3 != null) {
                    th = new AnonymousClass8SC(A00, str3);
                    C156567gq.A00(th, r2);
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Remote error code ");
                    th = new AnonymousClass8SC(A00, AnonymousClass000.A0h(A0o, A00.A00));
                    C156567gq.A00(th, r2);
                }
            }
            String message = th.getMessage();
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Exception in provider when invoking ");
            A0o2.append(str);
            A0o2.append("(): ");
            AnonymousClass000.A1A(th, A0o2);
            if (message != null) {
                str2 = AnonymousClass000.A0V(": ", message, AnonymousClass001.A0o());
            } else {
                str2 = "";
            }
            throw new C143146yP(AnonymousClass000.A0X(str2, A0o2), th);
        }
    }
}
