package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.9p6  reason: invalid class name and case insensitive filesystem */
public class C204279p6 implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public C204279p6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Activity activity;
        int i;
        switch (this.A01) {
            case 0:
                C202949ms r0 = (C202949ms) this.A00;
                if (r0 != null) {
                    r0.Bal();
                    return;
                }
                return;
            case 1:
                ((AnonymousClass5ZM) this.A00).A0D(true);
                return;
            case 2:
                activity = (Activity) this.A00;
                i = 100;
                break;
            case 3:
                activity = (Activity) this.A00;
                i = 13;
                break;
            case 4:
                activity = (Activity) this.A00;
                i = 15;
                break;
            case 5:
                activity = (Activity) this.A00;
                i = 10;
                break;
            case 6:
                activity = (Activity) this.A00;
                i = 11;
                break;
            case 7:
                activity = (Activity) this.A00;
                i = 12;
                break;
            case 8:
                activity = (Activity) this.A00;
                i = 19;
                break;
            default:
                C86624Kv.A0f((Activity) this.A00);
                return;
        }
        C621433s.A00(activity, i);
    }
}
