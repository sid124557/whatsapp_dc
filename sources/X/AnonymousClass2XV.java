package X;

import android.util.Log;
import java.util.Queue;

/* renamed from: X.2XV  reason: invalid class name */
public class AnonymousClass2XV {
    public boolean A00 = true;
    public final Queue A01 = AnonymousClass0x9.A18();

    public void A00(Runnable runnable) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BloksCallbackQueue/run/active=");
        Log.d("Whatsapp", C18300x5.A0m(A0o, this.A00));
        if (this.A00) {
            runnable.run();
        } else {
            this.A01.add(runnable);
        }
    }
}
