package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import com.whatsapp.R;

/* renamed from: X.9p9  reason: invalid class name and case insensitive filesystem */
public class C204309p9 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204309p9(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Runnable runnable;
        Activity activity;
        switch (this.A03) {
            case 0:
                activity = (Activity) this.A01;
                int i2 = this.A00;
                runnable = (Runnable) this.A02;
                C621433s.A00(activity, i2);
                if (runnable == null) {
                    return;
                }
                break;
            case 1:
                activity = (Activity) this.A01;
                int i3 = this.A00;
                runnable = (Runnable) this.A02;
                C621433s.A00(activity, i3);
                break;
            default:
                C194399Ss r3 = (C194399Ss) this.A01;
                C89654ea r2 = (C89654ea) this.A02;
                C621433s.A00(r2, this.A00);
                r2.Bp9(R.string.f11nameremoved);
                r3.A0E.A00(new C204519pU(r2, 6, r3));
                return;
        }
        new Handler(activity.getMainLooper()).post(runnable);
    }
}
