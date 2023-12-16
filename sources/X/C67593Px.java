package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity;
import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.3Px  reason: invalid class name and case insensitive filesystem */
public final class C67593Px implements C188028yC {
    public AnonymousClass48U A00;
    public final C49552gi A01;

    public void Ba9(C27871eo r6) {
        C162457s7.A0J(r6, 0);
        Log.i("CheckAutoConfConsentManager/onResponse");
        JSONArray jSONArray = r6.A01;
        if (jSONArray.length() > 0) {
            Log.e("CheckAutoConfConsentManager/onResponse/error");
            if (jSONArray.length() > 1) {
                C52002kj A002 = C386428m.A00(AnonymousClass0x7.A13(jSONArray, 1));
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CheckAutoConfConsentManager/onResponse/errorCode=");
                A0o.append(A002.A00);
                A0o.append("/errorDescription=");
                C18260x0.A1K(A0o, A002.A01);
            }
            if (this.A00 != null) {
                Log.e("ShareAutoConfVerifierActivity/onCheckConsentFailure");
                return;
            }
            throw C18270x1.A0S("callback");
        }
        AnonymousClass48U r4 = this.A00;
        if (r4 != null) {
            String A0l = C18300x5.A0l("xwa2_autoconf_consent", r6.A00.A00);
            ShareAutoConfVerifierActivity shareAutoConfVerifierActivity = (ShareAutoConfVerifierActivity) r4;
            C18260x0.A0s("ShareAutoConfVerifierActivity/onCheckConsentSuccess/consentType=", A0l, AnonymousClass001.A0o());
            SwitchCompat switchCompat = shareAutoConfVerifierActivity.A00;
            if (switchCompat == null) {
                throw C18270x1.A0S("consentSwitch");
            }
            switchCompat.setChecked(A0l.equals("foa"));
            AnonymousClass33p r1 = shareAutoConfVerifierActivity.A09;
            SwitchCompat switchCompat2 = shareAutoConfVerifierActivity.A00;
            if (switchCompat2 == null) {
                throw C18270x1.A0S("consentSwitch");
            }
            C18270x1.A0l(C18270x1.A03(r1), "autoconf_consent_given", switchCompat2.isChecked());
            return;
        }
        throw C18270x1.A0S("callback");
    }

    public C67593Px(C49552gi r1) {
        this.A01 = r1;
    }

    public void BSt(Throwable th) {
        C18260x0.A1Q(C18270x1.A0X(th), "CheckAutoConfConsentManager/onFailure/MEX error: ", th);
    }
}
