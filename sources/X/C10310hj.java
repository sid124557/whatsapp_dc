package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.0hj  reason: invalid class name and case insensitive filesystem */
public class C10310hj implements AnonymousClass4EB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass4FU A01;
    public final /* synthetic */ AnonymousClass0XM A02;
    public final /* synthetic */ AnonymousClass5ZR A03;
    public final /* synthetic */ C620733j A04;
    public final /* synthetic */ C61072zf A05;
    public final /* synthetic */ AnonymousClass3DW A06;
    public final /* synthetic */ C183068pR A07;

    public C10310hj(Activity activity, AnonymousClass4FU r2, AnonymousClass0XM r3, AnonymousClass5ZR r4, C620733j r5, C61072zf r6, AnonymousClass3DW r7, C183068pR r8) {
        this.A00 = activity;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
    }

    public void BMF(int i) {
        int i2;
        this.A06.A01(this);
        Activity activity = this.A00;
        C621433s.A00(activity, 600);
        C06390Xm.A00 = null;
        this.A07.BVj(i);
        if (i == 3) {
            C06550Ye.A0C(activity.getApplicationContext());
            byte[] A0P = C06550Ye.A0P();
            byte[] A0T = C06550Ye.A0T(A0P);
            if (A0T != null) {
                this.A02.A05((Runnable) null, A0T, A0P, 1);
                this.A01.Bot(R.string.f11nameremoved);
                Log.w("settings/backup/failed/missing-or-mismatch");
                return;
            }
        } else if (i == 2) {
            AnonymousClass4FU r3 = this.A01;
            boolean A012 = C61072zf.A01();
            StringBuilder A0o = AnonymousClass001.A0o();
            if (A012) {
                A0o.append(activity.getString(R.string.f11nameremoved));
                A0o.append(" ");
                i2 = R.string.f11nameremoved;
            } else {
                A0o.append(activity.getString(R.string.f11nameremoved));
                A0o.append(" ");
                i2 = R.string.f11nameremoved;
            }
            r3.Bou(AnonymousClass000.A0X(activity.getString(i2), A0o));
            return;
        } else if (i != 1) {
            if (!this.A03.A0E()) {
                Log.i("settings/backup/failed/missing-permissions");
                this.A01.Bot(R.string.f11nameremoved);
                return;
            }
            return;
        }
        this.A01.Bot(R.string.f11nameremoved);
        Log.w("settings/backup/failed/null");
    }

    public void BNX() {
        C621433s.A01(this.A00, 600);
    }

    public void BZ2(int i) {
        C18390xG A022 = C06390Xm.A00;
        if (A022 != null) {
            A022.setMessage(AnonymousClass002.A0F(this.A00, AnonymousClass001.A0l(this.A04.A0N(), i), new Object[1], 0, R.string.f11nameremoved));
        }
        int i2 = i % 10;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, i, 0);
        if (i2 == 0) {
            Log.i(String.format(locale, "settings/backup/msgstore/progress/%d%%", objArr));
        } else {
            String.format(locale, "settings/backup/msgstore/progress/%d%%", objArr);
        }
    }
}
