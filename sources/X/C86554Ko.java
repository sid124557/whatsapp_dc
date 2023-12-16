package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.4Ko  reason: invalid class name and case insensitive filesystem */
public class C86554Ko implements C85014Ep {
    public Object A00;
    public Object A01;
    public final int A02;

    public C86554Ko(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BZP(String str) {
        if (this.A02 != 0) {
            throw AnonymousClass001.A0e("must not be called");
        }
        AnonymousClass3FF.A00((C003203q) this.A01);
    }

    public void BZQ() {
        if (this.A02 != 0) {
            throw AnonymousClass001.A0e("must not be called");
        }
        Activity activity = (Activity) this.A01;
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
        if (this.A02 != 0) {
            ((long[]) this.A01)[0] = -2;
        } else {
            AnonymousClass3FF.A00((C003203q) this.A01);
        }
    }

    public void Bep() {
        if (this.A02 != 0) {
            ((long[]) this.A01)[0] = -2;
            return;
        }
        Activity activity = (Activity) this.A01;
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
