package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsUserProxyActivity;

/* renamed from: X.4Hv  reason: invalid class name and case insensitive filesystem */
public class C85844Hv implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public C85844Hv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onLongClick(View view) {
        if (this.A01 != 0) {
            AnonymousClass121 r1 = (AnonymousClass121) this.A00;
            return r1.A0P(r1.A01);
        }
        SettingsUserProxyActivity settingsUserProxyActivity = (SettingsUserProxyActivity) this.A00;
        if (C107575bX.A0F(settingsUserProxyActivity.A09.A02)) {
            return false;
        }
        C19340zH A002 = AnonymousClass5V0.A00(settingsUserProxyActivity);
        A002.A0U(R.string.f11nameremoved);
        A002.A0Y(new C1235268t(settingsUserProxyActivity, 122), R.string.f11nameremoved);
        A002.A0W(new AnonymousClass69A(15), R.string.f11nameremoved);
        C18280x3.A0q(A002);
        return true;
    }
}
