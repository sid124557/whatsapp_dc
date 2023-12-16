package X;

import android.os.Bundle;
import com.whatsapp.R;

/* renamed from: X.9iT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200529iT implements Runnable {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ AnonymousClass7YE A01;

    public final void run() {
        String string;
        AnonymousClass7YE r5 = this.A01;
        C89644eZ r4 = this.A00;
        if (r5 == null || r5.A00 == null) {
            string = r4.getString(R.string.f11nameremoved);
        } else {
            string = AnonymousClass002.A0F(r4, r5.A02(), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        }
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("message", string);
        A08.putString("title", r4.getString(R.string.f11nameremoved));
        C621433s.A02(r4, A08, 101);
    }

    public /* synthetic */ C200529iT(C89644eZ r1, AnonymousClass7YE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
