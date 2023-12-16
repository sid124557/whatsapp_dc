package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.9q7  reason: invalid class name and case insensitive filesystem */
public class C204909q7 implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public C204909q7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            Activity activity = (Activity) obj;
            if (i != 4) {
                return false;
            }
            dialogInterface.dismiss();
            activity.finish();
            return true;
        }
        C52792m3 r1 = (C52792m3) obj;
        if (i != 4) {
            return true;
        }
        r1.A00("on_press_back");
        dialogInterface.dismiss();
        return true;
    }
}
