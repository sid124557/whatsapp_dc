package X;

import android.app.Application;

/* renamed from: X.0kE  reason: invalid class name and case insensitive filesystem */
public class C11800kE implements Runnable {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ C06690Yu A01;

    public C11800kE(Application application, C06690Yu r2) {
        this.A00 = application;
        this.A01 = r2;
    }

    public void run() {
        this.A00.unregisterActivityLifecycleCallbacks(this.A01);
    }
}
