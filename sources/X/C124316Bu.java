package X;

import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.registration.VerifyEmail;
import com.whatsapp.util.Log;

/* renamed from: X.6Bu  reason: invalid class name and case insensitive filesystem */
public class C124316Bu implements C184338rd {
    public Object A00;
    public final int A01;

    public C124316Bu(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSr(Integer num, Long l) {
        C69253Wh A75;
        Runnable r2;
        int i = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i != 0) {
            A0o.append("VerifyEmail/executeSendEmailOtpRequest/onFailure/code: ");
            A0o.append(num);
            C18260x0.A1Q(A0o, "; waitTime: ", l);
            VerifyEmail verifyEmail = (VerifyEmail) this.A00;
            A75 = verifyEmail.A75();
            r2 = new C70363aN(verifyEmail, l, num, 4);
        } else {
            A0o.append("VerifyEmailActivity/executeSendEmailOtpRequest/onFailure/code: ");
            A0o.append(num);
            C18260x0.A1Q(A0o, "; waitTime: ", l);
            VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A00;
            A75 = verifyEmailActivity.A75();
            r2 = new C70343aL(verifyEmailActivity, l, num, 19);
        }
        A75.BkS(r2);
    }

    public void Bcy(long j) {
        C69253Wh A75;
        Runnable r2;
        if (this.A01 != 0) {
            Log.i("VerifyEmail/executeSendEmailOtpRequest/onSuccess");
            VerifyEmail verifyEmail = (VerifyEmail) this.A00;
            A75 = verifyEmail.A75();
            r2 = new C71543cH((Object) verifyEmail, 10);
        } else {
            Log.i("VerifyEmailActivity/executeSendEmailOtpRequest/onSuccess/");
            VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A00;
            A75 = verifyEmailActivity.A75();
            r2 = new C69983Zk(verifyEmailActivity, 48);
        }
        A75.BkS(r2);
    }
}
