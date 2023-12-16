package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.VerifyPhoneNumber;
import java.lang.ref.WeakReference;

/* renamed from: X.4Mc  reason: invalid class name and case insensitive filesystem */
public final class C86854Mc extends Handler {
    public final C116985rC A00;
    public final C97684z4 A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;

    public void handleMessage(Message message) {
        C162457s7.A0J(message, 0);
        if (message.what == 1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("RetryHandler/handle-retry/");
            C18260x0.A0m(message.obj, A0o);
            VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A04.get();
            if (verifyPhoneNumber != null) {
                Object obj = message.obj;
                C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.String");
                String str = this.A02;
                String str2 = this.A03;
                C626936e.A06(str2);
                AnonymousClass5VK.A00(this.A00);
                verifyPhoneNumber.A7t(this.A01, (String) obj, str, str2, "sms", (String) null, 4);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86854Mc(Looper looper, C116985rC r3, VerifyPhoneNumber verifyPhoneNumber, C97684z4 r5, String str, String str2) {
        super(looper);
        C18260x0.A0f(str, str2, looper, r3, r5);
        C626936e.A06(looper);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r3;
        this.A01 = r5;
        this.A04 = AnonymousClass0x9.A14(verifyPhoneNumber);
    }
}
