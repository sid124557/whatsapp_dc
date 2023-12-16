package X;

import android.os.Build;
import android.os.Environment;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.5Tg  reason: invalid class name and case insensitive filesystem */
public final class C105025Tg {
    public final C69263Wi A00;
    public final AnonymousClass5ZR A01;
    public final C620733j A02;
    public final C61072zf A03;
    public final AnonymousClass1VX A04;

    public final void A01(C89654ea r3) {
        C162457s7.A0J(r3, 0);
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            boolean A012 = C61072zf.A01();
            int i = R.string.f11nameremoved;
            if (A012) {
                i = R.string.f11nameremoved;
            }
            r3.Bot(i);
        }
        if (!A02(r3)) {
            boolean A013 = C61072zf.A01();
            int i2 = R.string.f11nameremoved;
            if (A013) {
                i2 = R.string.f11nameremoved;
            }
            r3.Bot(i2);
        }
    }

    public final void A00() {
        int A0N = this.A04.A0N(6728);
        C69263Wi r6 = this.A00;
        Object[] objArr = new Object[1];
        C18270x1.A1Q(objArr, A0N);
        r6.A0P(this.A02.A0L(objArr, R.plurals.f9nameremoved, (long) A0N), 1);
    }

    public final boolean A02(C89654ea r5) {
        if (Build.VERSION.SDK_INT < 23 || this.A01.A03(C107035aa.A04()) != -1) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f11nameremoved;
        if (i >= 30) {
            i2 = R.string.f11nameremoved;
            if (i < 33) {
                i2 = R.string.f11nameremoved;
            }
        }
        RequestPermissionActivity.A0b(r5, R.string.f11nameremoved, i2);
        return true;
    }

    public C105025Tg(C69263Wi r1, AnonymousClass5ZR r2, C620733j r3, C61072zf r4, AnonymousClass1VX r5) {
        C18260x0.A0f(r5, r1, r4, r3, r2);
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
