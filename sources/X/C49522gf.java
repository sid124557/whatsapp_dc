package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2gf  reason: invalid class name and case insensitive filesystem */
public class C49522gf {
    public final C56972sr A00;
    public final C56962sq A01;
    public final C55262q4 A02;
    public final C50282hv A03;

    public void A00(C89654ea r6, UserJid userJid, int i, int i2) {
        if (this.A03.A01(userJid)) {
            Intent A0R = C627736r.A0R(r6, userJid, i, i2);
            if (this.A01.A0P(userJid)) {
                int i3 = R.string.f11nameremoved;
                if (i > 0) {
                    i3 = R.string.f11nameremoved;
                }
                r6.Boo(UnblockDialogFragment.A00(new AnonymousClass3E6(r6, A0R, this, userJid), r6.getString(i3), R.string.f11nameremoved, false));
                return;
            }
            r6.startActivity(A0R);
        }
    }

    public boolean A01() {
        if (!this.A00.A0Y() || C18280x3.A1W(this.A02.A01(), "ddm_settings_feature_flag")) {
            return true;
        }
        return false;
    }

    public C49522gf(C56972sr r1, C56962sq r2, C55262q4 r3, C50282hv r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
