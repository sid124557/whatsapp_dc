package X;

import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.registration.VerifyEmail;

/* renamed from: X.6Bv  reason: invalid class name and case insensitive filesystem */
public class C124326Bv implements C184358rf {
    public Object A00;
    public final int A01;

    public C124326Bv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSr(Integer num, Long l) {
        C69253Wh A75;
        Runnable r2;
        int i = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i != 0) {
            A0o.append("VerifyEmail/executeVerifyEmailOtpRequest/onFailure/code: ");
            A0o.append(num);
            C18260x0.A1Q(A0o, "; waitTime: ", l);
            VerifyEmail verifyEmail = (VerifyEmail) this.A00;
            A75 = verifyEmail.A75();
            r2 = new C70363aN(verifyEmail, l, num, 5);
        } else {
            A0o.append("VerifyEmailActivity/executeVerifyEmailOtpRequest/onFailure/code: ");
            A0o.append(num);
            C18260x0.A1Q(A0o, "; waitTime: ", l);
            VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A00;
            A75 = verifyEmailActivity.A75();
            r2 = new C70343aL(verifyEmailActivity, l, num, 20);
        }
        A75.BkS(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.registration.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdQ(long r8, boolean r10) {
        /*
            r7 = this;
            int r0 = r7.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r4 = r8
            r6 = r10
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "VerifyEmail/executeVerifyEmailOtpRequest/onSuccess/verified : "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", waitTime : "
            X.C18260x0.A12(r0, r1, r8)
            java.lang.Object r2 = r7.A00
            com.whatsapp.registration.VerifyEmail r2 = (com.whatsapp.registration.VerifyEmail) r2
            X.3Wh r0 = r2.A75()
            r3 = 2
        L_0x0020:
            X.3c1 r1 = new X.3c1
            r1.<init>(r2, r3, r4, r6)
            r0.BkS(r1)
            return
        L_0x0029:
            java.lang.String r0 = "VerifyEmailActivity/executeVerifyEmailOtpRequest/onSuccess/verified : "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", waitTime : "
            X.C18260x0.A12(r0, r1, r8)
            java.lang.Object r2 = r7.A00
            com.whatsapp.email.VerifyEmailActivity r2 = (com.whatsapp.email.VerifyEmailActivity) r2
            X.3Wh r0 = r2.A75()
            r3 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124326Bv.BdQ(long, boolean):void");
    }
}
