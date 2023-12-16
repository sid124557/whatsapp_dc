package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.fragment.app.DialogFragment;
import java.lang.ref.Reference;

/* renamed from: X.4Hh  reason: invalid class name and case insensitive filesystem */
public class C85704Hh implements AnonymousClass49C {
    public Object A00;
    public Object A01;
    public final int A02;

    public C85704Hh(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BaR(boolean z) {
        Context context;
        if (this.A02 != 0) {
            Reference reference = (Reference) this.A00;
            Intent intent = (Intent) this.A01;
            if (z && (context = (Context) reference.get()) != null) {
                context.startActivity(intent);
            }
        } else if (z) {
            Looper.getMainLooper();
            Activity activity = (Activity) this.A00;
            AnonymousClass0x9.A1L(activity);
            ((C89654ea) activity).Bon((DialogFragment) this.A01, "SharePhoneNumberBottomSheet");
        }
    }
}
