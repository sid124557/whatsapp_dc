package X;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.7Jn  reason: invalid class name and case insensitive filesystem */
public final class C148737Jn {
    public final Executor A00;
    public volatile C151557Vg A01;
    public volatile Object A02;

    public C148737Jn(Looper looper, Object obj, String str) {
        this.A00 = new C173128Ok(looper);
        C162177rO.A03(obj, "Listener must not be null");
        this.A02 = obj;
        C162177rO.A05(str);
        this.A01 = new C151557Vg(obj, str);
    }
}
