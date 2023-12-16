package X;

import com.whatsapp.util.Log;

/* renamed from: X.3M4  reason: invalid class name */
public final class AnonymousClass3M4 implements C184328rc {
    public final /* synthetic */ C49842hB A00;
    public final /* synthetic */ AnonymousClass4GQ A01;

    public AnonymousClass3M4(C49842hB r1, AnonymousClass4GQ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BSq(Integer num) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "EmailVerificationManager/maybeCallGetEmailRequestAndUpdateEmailSharedPrefsAfterReg/onFailure/error code: ", num);
        AnonymousClass33p r1 = this.A00.A01;
        r1.A1W((String) null);
        r1.A1y(false);
        this.A01.invoke(0);
    }

    public void BdF(String str, boolean z) {
        C18260x0.A1E("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/onSuccess/emailVerified: ", AnonymousClass001.A0o(), z);
        AnonymousClass33p r0 = this.A00.A01;
        r0.A1W(str);
        r0.A1y(z);
        AnonymousClass4GQ r2 = this.A01;
        int i = 1;
        if (str == null || str.length() == 0) {
            Log.i("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/email does not exist");
            i = 2;
        } else {
            Log.i("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/email exists");
        }
        r2.invoke(Integer.valueOf(i));
    }
}
