package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9aG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C196079aG implements C181888nV {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C95814uZ A01;
    public final /* synthetic */ C196249aX A02;
    public final /* synthetic */ String A03;

    public final void BZz(String str) {
        C196249aX r4 = this.A02;
        String str2 = this.A03;
        C95814uZ r2 = this.A01;
        Activity activity = this.A00;
        C105145Tt r1 = (C105145Tt) r4.A0H.get();
        r1.A01(3);
        String str3 = r1.A02;
        UserJid A032 = AnonymousClass32Y.A03(r2);
        C626936e.A06(A032);
        String str4 = str;
        C149847Od r5 = new C149847Od(A032, str2, str4, str3, r1.A0C.get(), (long) r1.A0D.getAndIncrement());
        AnonymousClass5Y9 r22 = (AnonymousClass5Y9) r4.A0I.get();
        r22.A0Q.add(new C196069aF(activity, r22, r4));
        if (r22.A08(r5)) {
            ((AnonymousClass4FU) activity).BpA(0, R.string.f11nameremoved);
        } else {
            r22.A04(r5, false);
        }
    }

    public /* synthetic */ C196079aG(Activity activity, C95814uZ r2, C196249aX r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A01 = r2;
        this.A00 = activity;
    }
}
