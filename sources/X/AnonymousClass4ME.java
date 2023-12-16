package X;

import android.os.CountDownTimer;
import com.whatsapp.R;
import com.whatsapp.registration.VerifyPhoneNumber;
import java.util.HashMap;

/* renamed from: X.4ME  reason: invalid class name */
public class AnonymousClass4ME extends CountDownTimer {
    public final /* synthetic */ VerifyPhoneNumber A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4ME(VerifyPhoneNumber verifyPhoneNumber, String str, long j) {
        super(j, 1000);
        this.A00 = verifyPhoneNumber;
        this.A01 = str;
    }

    public void onFinish() {
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        HashMap hashMap = verifyPhoneNumber.A1Z;
        String str = this.A01;
        hashMap.put(str, AnonymousClass0x2.A0T());
        verifyPhoneNumber.A1a.put(str, (Object) null);
        if (str.equals("sms") && AnonymousClass4SG.A4D(verifyPhoneNumber)) {
            verifyPhoneNumber.A7T(1);
        }
        if (verifyPhoneNumber.A1T) {
            verifyPhoneNumber.A0Z.setClickable(true);
            C18320x8.A11(verifyPhoneNumber.getResources(), verifyPhoneNumber.A0Z, AnonymousClass5Yj.A02(verifyPhoneNumber.A0Z.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            verifyPhoneNumber.A19.A06(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTick(long r17) {
        /*
            r16 = this;
            r0 = r16
            com.whatsapp.registration.VerifyPhoneNumber r9 = r0.A00
            java.util.HashMap r1 = r9.A1Z
            java.lang.String r0 = r0.A01
            r2 = r17
            X.AnonymousClass0x2.A1J(r0, r1, r2)
            boolean r0 = r9.A1T
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "sms"
            long r3 = r9.A76(r0)
            java.lang.String r0 = "voice"
            long r1 = r9.A76(r0)
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x0029:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x0030:
            long r13 = java.lang.Math.min(r3, r1)
            boolean r0 = r9.A8E()
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "wa_old"
        L_0x003c:
            long r1 = r9.A76(r0)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x0047:
            long r13 = java.lang.Math.min(r13, r1)
        L_0x004b:
            r2 = 8
            r15 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
            com.whatsapp.WaTextView r0 = r9.A0Z
            r0.setClickable(r15)
        L_0x0057:
            X.5UY r0 = r9.A19
            r0.A06(r2)
        L_0x005c:
            return
        L_0x005d:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0093
            com.whatsapp.WaTextView r2 = r9.A0Z
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131099873(0x7f0600e1, float:1.7812111E38)
            X.C18320x8.A11(r1, r2, r0)
            com.whatsapp.WaTextView r0 = r9.A0Z
            r0.setClickable(r15)
            X.5UY r0 = r9.A19
            r0.A06(r15)
            X.5UY r0 = r9.A19
            android.view.View r1 = r0.A04()
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.33j r10 = r9.A00
            r12 = 2131755298(0x7f100122, float:1.9141471E38)
            r0 = 2131893150(0x7f121b9e, float:1.9421068E38)
            java.lang.String r11 = r9.getString(r0)
            java.lang.CharSequence r0 = X.AnonymousClass36l.A09(r9, r10, r11, r12, r13, r15)
            r1.setText(r0)
            return
        L_0x0093:
            com.whatsapp.WaTextView r1 = r9.A0Z
            r0 = 1
            r1.setClickable(r0)
            goto L_0x0057
        L_0x009a:
            boolean r0 = r9.A8C()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "email_otp"
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ME.onTick(long):void");
    }
}
