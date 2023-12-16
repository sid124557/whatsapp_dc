package X;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: X.2Wi  reason: invalid class name and case insensitive filesystem */
public final class C44512Wi {
    public final WeakReference A00;

    public final boolean A00(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        Activity activity = (Activity) this.A00.get();
        if (activity == null) {
            return false;
        }
        activity.finish();
        return false;
    }

    public C44512Wi(C89644eZ r2) {
        this.A00 = AnonymousClass0x9.A14(r2);
    }
}
