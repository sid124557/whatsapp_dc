package X;

import android.content.Context;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.559  reason: invalid class name */
public class AnonymousClass559 extends AnonymousClass5ZM {
    public final C54292oU A00;
    public final AnonymousClass33p A01;
    public final C56912sl A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public AnonymousClass559(C54292oU r2, AnonymousClass33p r3, C56912sl r4, VerifyTwoFactorAuth verifyTwoFactorAuth, String str, String str2) {
        super(verifyTwoFactorAuth, true);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = AnonymousClass0x9.A14(verifyTwoFactorAuth);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            AnonymousClass33p r3 = this.A01;
            int A08 = C86664Kz.A08(AnonymousClass0x2.A0F(r3), "reg_attempts_check_exist", 0);
            C18260x0.A0L(r3, "reg_attempts_check_exist", A08);
            C150607Rl r1 = new C150607Rl(A08);
            Context context = this.A00.A00;
            String str = this.A04;
            return this.A02.A01(r1, this.A03, str, C57922uQ.A00(context, str), "-1", (JSONObject) null, (byte[]) null, true);
        } catch (Exception e) {
            Log.e("VerifyTwoFactorAuth/checkifexists/error", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0063, code lost:
        if (((r8.A02 * 1000) + (r8.A03 - (r8.A04 * 1000))) >= r8.A06.A0H()) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r15) {
        /*
            r14 = this;
            X.5WM r15 = (X.AnonymousClass5WM) r15
            java.lang.ref.WeakReference r0 = r14.A05
            java.lang.Object r8 = r0.get()
            com.whatsapp.registration.VerifyTwoFactorAuth r8 = (com.whatsapp.registration.VerifyTwoFactorAuth) r8
            if (r8 == 0) goto L_0x0049
            r3 = 0
            r8.A0Q = r3
            r4 = 5000(0x1388, double:2.4703E-320)
            r9 = 1
            if (r15 == 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyTwoFactorAuth/checkifexists result="
            X.C18260x0.A1P(r1, r0, r15)
            int r0 = r15.A0R
            if (r0 != r9) goto L_0x0066
            java.lang.String r0 = "VerifyTwoFactorAuth/checkifexists ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A7B(r9)
            X.33p r1 = r8.A09
            boolean r0 = r15.A0W
            r1.A1t(r0)
            X.33p r1 = r8.A09
            boolean r0 = r15.A0V
            r1.A1s(r0)
            X.33p r0 = r8.A09
            boolean r2 = r15.A0U
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "first_party_migration_initiated"
            X.C18270x1.A0l(r1, r0, r2)
            java.lang.String r0 = r15.A0T
            r8.A79(r3, r0)
        L_0x0049:
            return
        L_0x004a:
            java.lang.String r0 = "VerifyTwoFactorAuth/checkifexists could not connect to server"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sH r0 = r8.A06
            long r12 = r0.A0H()
            long r6 = r8.A03
            long r2 = r8.A04
            long r0 = r8.A02
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r10
            long r0 = r0 * r10
            long r6 = r6 - r2
            long r0 = r0 + r6
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x0085
            goto L_0x0078
        L_0x0066:
            long r2 = r15.A09
            long r0 = r15.A08
            long r2 = r2 + r0
            long r6 = r8.A02
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0085
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r4 = java.lang.Math.max(r0, r4)
        L_0x0078:
            java.lang.String r0 = "VerifyTwoFactorAuth/do-check-if-exists"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.os.Handler r1 = r8.A0f
            java.lang.Runnable r0 = r8.A0h
            r1.postDelayed(r0, r4)
            return
        L_0x0085:
            r8.A7B(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass559.A0C(java.lang.Object):void");
    }
}
