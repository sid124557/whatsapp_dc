package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Sd  reason: invalid class name and case insensitive filesystem */
public class C68173Sd implements AnonymousClass4EZ {
    public AnonymousClass2WO A00;
    public final AnonymousClass31C A01;

    public void BQs(String str) {
        Log.e("delivery failure when setting member add mode");
        AnonymousClass2WO r0 = this.A00;
        if (r0 != null) {
            AnonymousClass11N r1 = r0.A00;
            AnonymousClass3ZH r02 = r1.A02;
            if (r02 != null) {
                C06270Wx.A05(r1.A0C, AnonymousClass001.A1T(r02.A04));
            }
            C18290x4.A1C(C66493Lq.A1H, (Object) null, 3012);
        }
    }

    public void BSN(AnonymousClass36K r5, String str) {
        String str2;
        int i;
        AnonymousClass36K A0l = r5.A0l("error");
        if (A0l != null && this.A00 != null) {
            int A012 = AnonymousClass36K.A01(A0l, "code");
            AnonymousClass11N r1 = this.A00.A00;
            AnonymousClass3ZH r0 = r1.A02;
            if (r0 != null) {
                C06270Wx.A05(r1.A0C, AnonymousClass001.A1T(r0.A04));
            }
            if (A012 != 0) {
                if (A012 == 403) {
                    i = 3024;
                } else if (A012 == 423) {
                    i = 3025;
                } else if (A012 == 429 || A012 == 500) {
                    i = 3012;
                } else if (A012 == 400) {
                    str2 = "bad request when setting member add mode";
                } else if (A012 == 401) {
                    i = 3023;
                } else {
                    return;
                }
                C18290x4.A1C(C66493Lq.A1H, (Object) null, i);
                return;
            }
            str2 = "unknown error when setting member add mode";
            Log.e(str2);
        }
    }

    public C68173Sd(AnonymousClass31C r1) {
        this.A01 = r1;
    }

    public void BdM(AnonymousClass36K r2, String str) {
        Log.i("successfully set member add mode");
    }
}
