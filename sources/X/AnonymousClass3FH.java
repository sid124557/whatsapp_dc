package X;

import com.whatsapp.util.Log;

/* renamed from: X.3FH  reason: invalid class name */
public class AnonymousClass3FH implements C182358oH {
    public final C56972sr A00;
    public final C65203Gp A01;
    public final C50962j3 A02;
    public final AnonymousClass4FS A03;

    public void A00() {
        AnonymousClass1Ok r1;
        C65203Gp r2 = this.A01;
        if (r2.A0Q() && (r1 = (AnonymousClass1Ok) this.A02.A00("status_privacy")) != null) {
            Log.d("SyncdUpdateHelperImpl/syncStatusPrivacy sync status privacy");
            r2.A0K(C18300x5.A0s(r1.A0D()));
            r2.A0F();
        }
    }

    public void A01() {
        C56822sc A002;
        if (!this.A00.A0Y() && (A002 = this.A02.A00("time_format")) != null) {
            C70193a6.A01(this.A03, this, A002, 35);
        }
    }

    public void BVk() {
        if (!this.A00.A0Y()) {
            A01();
            C22491Og r2 = (C22491Og) this.A02.A00("setting_locale");
            if (r2 != null) {
                this.A03.BkM(new C33241sg(this, r2));
            }
        }
    }

    public AnonymousClass3FH(C56972sr r1, C65203Gp r2, C50962j3 r3, AnonymousClass4FS r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
