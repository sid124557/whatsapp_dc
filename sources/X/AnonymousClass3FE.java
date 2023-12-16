package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.3FE  reason: invalid class name */
public class AnonymousClass3FE implements C85014Ep {
    public final Activity A00;
    public final C61072zf A01;

    public void BZP(String str) {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            C626936e.A06(activity);
            AnonymousClass4FU r3 = (AnonymousClass4FU) activity;
            boolean A012 = C61072zf.A01();
            int i = R.string.f11nameremoved;
            if (A012) {
                i = R.string.f11nameremoved;
            }
            r3.Box(new Object[0], R.string.f11nameremoved, i);
        }
    }

    public void BZQ() {
        Activity activity = this.A00;
        C626936e.A06(activity);
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

    public void Beo(String str) {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            C626936e.A06(activity);
            AnonymousClass4FU r3 = (AnonymousClass4FU) activity;
            boolean A012 = C61072zf.A01();
            int i = R.string.f11nameremoved;
            if (A012) {
                i = R.string.f11nameremoved;
            }
            r3.Box(new Object[0], R.string.f11nameremoved, i);
        }
    }

    public void Bep() {
        Activity activity = this.A00;
        C626936e.A06(activity);
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

    public AnonymousClass3FE(Activity activity, C61072zf r2) {
        this.A00 = activity;
        this.A01 = r2;
    }
}
