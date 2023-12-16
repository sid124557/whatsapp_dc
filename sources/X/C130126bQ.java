package X;

import android.os.Bundle;

/* renamed from: X.6bQ  reason: invalid class name and case insensitive filesystem */
public final class C130126bQ extends C153277ay {
    public C130126bQ(int i, Bundle bundle) {
        super(bundle, i, 2);
    }

    public final void A00(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            A02((Object) null);
        } else {
            A01(new C143496yy(4, "Invalid response to one way request"));
        }
    }
}
