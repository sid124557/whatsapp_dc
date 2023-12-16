package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7TS  reason: invalid class name */
public class AnonymousClass7TS {
    public final Application.ActivityLifecycleCallbacks A00;
    public final WeakReference A01;
    public final List A02 = AnonymousClass001.A0s();
    public volatile boolean A03;

    public void A00() {
        int i;
        Runnable[] runnableArr;
        List list = this.A02;
        synchronized (list) {
            this.A03 = true;
        }
        Context context = (Context) this.A01.get();
        if (context != null) {
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A00);
        }
        synchronized (list) {
            runnableArr = (Runnable[]) list.toArray(new Runnable[0]);
        }
        for (Runnable run : runnableArr) {
            run.run();
        }
        synchronized (list) {
            list.removeAll(Arrays.asList(runnableArr));
        }
    }

    public AnonymousClass7TS(Context context) {
        AnonymousClass92H r2 = new AnonymousClass92H(this, 0);
        this.A00 = r2;
        Context context2 = context;
        while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        this.A01 = AnonymousClass0x9.A14(context2);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(r2);
    }
}
