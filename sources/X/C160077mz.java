package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.7mz  reason: invalid class name and case insensitive filesystem */
public class C160077mz {
    public static final Map A02 = Collections.unmodifiableMap(new AnonymousClass8TR());
    public final C59362wn A00;
    public final C147577Ev A01;

    public static final Cursor A00(ContentProviderClient contentProviderClient, C151917Wu r6, C186398vF r7) {
        AnonymousClass7WQ r0 = r6.A03;
        try {
            return contentProviderClient.query(r6.A00, r0.A02, r0.A01, (String[]) null, (String) null);
        } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
            r7.Bbw(e, r6);
            return null;
        }
    }

    public C160077mz(Context context) {
        C59362wn r1 = new C59362wn(context.getPackageName());
        this.A00 = r1;
        this.A01 = new C147577Ev(r1);
    }
}
