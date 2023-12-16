package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.infra.graphql.generated.autoconf.UpdateAutoConfConsentMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.autoconf.UpdateAutoConfConsentResponseImpl;
import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.3Q0  reason: invalid class name */
public final class AnonymousClass3Q0 implements C188028yC {
    public C84614Da A00;
    public final C49552gi A01;

    public void Ba9(C27871eo r4) {
        C162457s7.A0J(r4, 0);
        Log.i("UpdateAutoConfConsentManager/onResponse");
        JSONArray jSONArray = r4.A01;
        if (jSONArray.length() > 0) {
            Log.e("UpdateAutoConfConsentManager/onResponse/error");
            if (jSONArray.length() > 1) {
                C52002kj A002 = C386428m.A00(AnonymousClass0x7.A13(jSONArray, 1));
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("UpdateAutoConfConsentManager/onResponse/errorCode=");
                A0o.append(A002.A00);
                A0o.append("/errorDescription=");
                C18260x0.A1K(A0o, A002.A01);
            }
        } else if (r4.A00.A00.optBoolean("xwa2_autoconf_consent_update")) {
            Log.i("UpdateAutoConfConsentManager/onResponse/consent updated on server");
            C84614Da r0 = this.A00;
            if (r0 != null) {
                r0.Bey();
                return;
            }
            throw C18270x1.A0S("callback");
        } else {
            Log.i("UpdateAutoConfConsentManager/onResponse/consent failed to be updated on server");
        }
        C84614Da r02 = this.A00;
        if (r02 != null) {
            r02.Bex();
            return;
        }
        throw C18270x1.A0S("callback");
    }

    public AnonymousClass3Q0(C49552gi r1) {
        this.A01 = r1;
    }

    public final void A00(C84614Da r5, boolean z) {
        String str;
        C18260x0.A1E("UpdateAutoConfConsentManager/updateAutoConfConsent/switch to ", AnonymousClass001.A0o(), z);
        this.A00 = r5;
        if (z) {
            str = "foa";
        } else {
            str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
        }
        C50712ie r3 = new UpdateAutoConfConsentMutationImpl$Builder().A00;
        r3.A02("autoconfConsent", str);
        this.A01.A00(new AnonymousClass7J9(r3, UpdateAutoConfConsentResponseImpl.class, "UpdateAutoConfConsent"), this).A00();
    }

    public void BSt(Throwable th) {
        C18260x0.A1Q(C18270x1.A0X(th), "UpdateAutoConfConsentManager/onFailure/MEX error: ", th);
    }
}
