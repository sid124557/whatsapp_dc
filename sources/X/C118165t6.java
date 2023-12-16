package X;

import android.content.Intent;
import com.whatsapp.registration.RegisterPhone;

/* renamed from: X.5t6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118165t6 implements AnonymousClass4GR {
    public final /* synthetic */ RegisterPhone A00;

    public final Object invoke(Object obj, Object obj2) {
        RegisterPhone registerPhone = this.A00;
        String str = (String) obj2;
        if (obj == C997558b.SUCCESS) {
            registerPhone.A0M.A0B(20, true);
            int i = C97674z3.A0c;
            long j = registerPhone.A04;
            long j2 = registerPhone.A05;
            long j3 = registerPhone.A06;
            long j4 = registerPhone.A02;
            int i2 = C97674z3.A0e;
            boolean A1U = AnonymousClass000.A1U(registerPhone.A00, 3);
            int i3 = C97674z3.A0d;
            Intent A0A = C18280x3.A0A(registerPhone);
            A0A.putExtra("flash_type", i);
            A0A.putExtra("sms_retry_time", j);
            A0A.putExtra("voice_retry_time", j2);
            A0A.putExtra("wa_old_retry_time", j3);
            A0A.putExtra("email_otp_retry_time", j4);
            A0A.putExtra("wa_old_eligible", i2);
            A0A.putExtra("fraud_eligible", A1U);
            A0A.putExtra("passkey_solved_challenge", str);
            A0A.putExtra("silent_auth_eligible", i3);
            A0A.putExtra("code_verification_mode", 0);
            registerPhone.startActivity(A0A);
            registerPhone.finish();
            return null;
        }
        registerPhone.A7K(true);
        return null;
    }

    public /* synthetic */ C118165t6(RegisterPhone registerPhone) {
        this.A00 = registerPhone;
    }
}
