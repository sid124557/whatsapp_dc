package X;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* renamed from: X.0HG  reason: invalid class name */
public class AnonymousClass0HG {
    public static View A00(Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) AnonymousClass0HF.A00(dialog, i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass001.A0c("ID does not reference a View inside this Dialog");
    }
}
