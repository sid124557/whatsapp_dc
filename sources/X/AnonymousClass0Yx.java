package X;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: X.0Yx  reason: invalid class name */
public class AnonymousClass0Yx implements DialogInterface.OnClickListener {
    public final WeakReference A00;

    public void onClick(DialogInterface dialogInterface, int i) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass08S) weakReference.get()).A0G(true);
        }
    }

    public AnonymousClass0Yx(AnonymousClass08S r2) {
        this.A00 = new WeakReference(r2);
    }
}
