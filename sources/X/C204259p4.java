package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.9p4  reason: invalid class name and case insensitive filesystem */
public class C204259p4 implements DialogInterface.OnCancelListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204259p4(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ((Activity) this.A01).onBackPressed();
    }
}
