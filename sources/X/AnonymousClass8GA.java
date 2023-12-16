package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.8GA  reason: invalid class name */
public final class AnonymousClass8GA implements C85014Ep {
    public final C182918pC A00;
    public final C105025Tg A01;
    public final WeakReference A02;

    public AnonymousClass8GA(C89654ea r2, C182918pC r3, C105025Tg r4) {
        C162457s7.A0J(r4, 2);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = AnonymousClass0x9.A14(r2);
    }

    public void BZP(String str) {
        C89654ea r1 = (C89654ea) this.A02.get();
        if (r1 != null) {
            this.A01.A01(r1);
        }
    }

    public void BZQ() {
        Activity activity = (Activity) this.A02.get();
        if (activity != null) {
            RequestPermissionActivity.A0b(activity, R.string.f11nameremoved, this.A00.BBv());
        }
    }

    public void Beo(String str) {
        C89654ea r1 = (C89654ea) this.A02.get();
        if (r1 != null) {
            this.A01.A01(r1);
        }
    }

    public void Bep() {
        Activity activity = (Activity) this.A02.get();
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.f11nameremoved;
            if (i >= 30) {
                i2 = R.string.f11nameremoved;
                if (i < 33) {
                    i2 = R.string.f11nameremoved;
                }
            }
            RequestPermissionActivity.A0b(activity, R.string.f11nameremoved, i2);
        }
    }
}
