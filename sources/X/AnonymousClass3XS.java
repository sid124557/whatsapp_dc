package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.3XS  reason: invalid class name */
public final class AnonymousClass3XS implements C84184Bj {
    public final C53822nj A00;

    public AnonymousClass3XS(C53822nj r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void Bgk(Activity activity, C41182Jg r9, Map map) {
        if (map != null) {
            String A0d = AnonymousClass0x2.A0d("screen_id", map);
            Object obj = map.get("screen_length");
            C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.Int");
            this.A00.A01(AnonymousClass0x9.A0m(AnonymousClass001.A0K(obj)), A0d, (String) null, (String) null, (String) null);
        }
    }
}
