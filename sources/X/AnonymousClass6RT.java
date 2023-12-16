package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.6RT  reason: invalid class name */
public final class AnonymousClass6RT extends C127196Ra {
    public final Bundle A00;

    public AnonymousClass6RT(Context context, Looper looper, AnonymousClass893 r12, C183908qr r13, C180868ll r14, AnonymousClass7P4 r15) {
        super(context, looper, r13, r14, r15, 16);
        Bundle bundle;
        if (r12 == null) {
            bundle = AnonymousClass002.A08();
        } else {
            bundle = new Bundle(r12.A00);
        }
        this.A00 = bundle;
    }

    public final boolean Bjs() {
        AnonymousClass7P4 r2 = this.A00;
        if (!TextUtils.isEmpty((CharSequence) null)) {
            r2.A04.get(AnonymousClass79E.A03);
            if (r2.A05.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int B9m() {
        return 12451000;
    }
}
