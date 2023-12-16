package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5OT  reason: invalid class name */
public final class AnonymousClass5OT {
    public final C003203q A00;
    public final AnonymousClass4FU A01;
    public final C104905Su A02;
    public final C56512s6 A03;
    public final C61072zf A04;
    public final AnonymousClass3ZH A05;
    public final C95814uZ A06;

    public boolean A00() {
        if (this.A03.A06()) {
            Log.w("ExportChatAction/execute/need-sd-card");
            AnonymousClass4FU r2 = this.A01;
            boolean A012 = C61072zf.A01();
            int i = R.string.f11nameremoved;
            if (A012) {
                i = R.string.f11nameremoved;
            }
            r2.Bot(i);
            return true;
        }
        this.A02.A01(this.A00, this.A01, this.A05, this.A06);
        return true;
    }

    public AnonymousClass5OT(C003203q r1, AnonymousClass4FU r2, C104905Su r3, C56512s6 r4, C61072zf r5, AnonymousClass3ZH r6, C95814uZ r7) {
        C18260x0.A0f(r5, r4, r3, r7, r6);
        C18260x0.A0U(r2, r1);
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A01 = r2;
        this.A00 = r1;
    }
}
