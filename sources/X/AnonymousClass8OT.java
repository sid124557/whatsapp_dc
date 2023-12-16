package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.8OT  reason: invalid class name */
public final class AnonymousClass8OT implements Callable {
    public final /* synthetic */ Context A00;

    public AnonymousClass8OT(Context context) {
        this.A00 = context;
    }

    public final /* synthetic */ Object call() {
        return this.A00.getSharedPreferences("google_sdk_flags", 0);
    }
}
