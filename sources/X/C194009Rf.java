package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9Rf  reason: invalid class name and case insensitive filesystem */
public class C194009Rf {
    public final Context A00;
    public final C69263Wi A01;
    public final C40602Ha A02;
    public final AnonymousClass9U5 A03;
    public final C160757oG A04 = C160757oG.A00("PaymentStepUpWebviewAction", "network", "COMMON");

    public void A00(C203079n5 r14, C165897xo r15, AnonymousClass36K r16, String str) {
        AnonymousClass36K[] r3;
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        char A0F = AnonymousClass39V.A0F("step_up_id", r15.A02, r2);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("step_up", r2);
        AnonymousClass39V[] r22 = new AnonymousClass39V[1];
        AnonymousClass39V.A0B("challenge_id", r15.A00.A01, r22, A0F);
        AnonymousClass36K A0I2 = AnonymousClass36K.A0I("step_up_challenge", r22);
        if (r16 != null) {
            r3 = new AnonymousClass36K[3];
            r3[A0F] = A0I;
            r3[1] = A0I2;
            r3[2] = r16;
        } else {
            r3 = new AnonymousClass36K[2];
            r3[A0F] = A0I;
            r3[1] = A0I2;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "get-step-up-webview-url", A0s);
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass39V.A03("provider_type", str2, A0s);
        }
        AnonymousClass36K r9 = new AnonymousClass36K("account", C18300x5.A1Z(A0s, A0F), r3);
        AnonymousClass9U5 r7 = this.A03;
        Context context = this.A00;
        C69263Wi r32 = this.A01;
        r7.A0G(new C203899oU(context, this.A02, r32, this, r14, 22), r9, "get", 0);
    }

    public C194009Rf(Context context, C69263Wi r5, C40602Ha r6, AnonymousClass9U5 r7) {
        this.A00 = context;
        this.A01 = r5;
        this.A03 = r7;
        this.A02 = r6;
    }
}
