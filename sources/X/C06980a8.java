package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.0a8  reason: invalid class name and case insensitive filesystem */
public final class C06980a8 implements View.OnAttachStateChangeListener {
    public final C08870fF A00;
    public final WeakReference A01;

    public void onViewAttachedToWindow(View view) {
        C162457s7.A0J(view, 0);
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.A01.get();
        IBinder A002 = C03060Ir.A00(activity);
        if (activity != null && A002 != null) {
            this.A00.A02(activity, A002);
        }
    }

    public C06980a8(Activity activity, C08870fF r3) {
        this.A00 = r3;
        this.A01 = new WeakReference(activity);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
