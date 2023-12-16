package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.5kc  reason: invalid class name and case insensitive filesystem */
public final class C112935kc implements AnonymousClass4E6 {
    public final C69263Wi A00;
    public final AnonymousClass5ZU A01;
    public final C54292oU A02;
    public final /* synthetic */ ReportSpamDialogFragment A03;

    public void BfA(AnonymousClass3ZH r6) {
        Resources A002 = C54292oU.A00(this.A02);
        Object[] A0L = AnonymousClass002.A0L();
        C18300x5.A1E(this.A01, r6, A0L, 0);
        String string = A002.getString(R.string.f11nameremoved, A0L);
        C162457s7.A0D(string);
        A00(string);
    }

    public C112935kc(C69263Wi r1, AnonymousClass5ZU r2, C54292oU r3, ReportSpamDialogFragment reportSpamDialogFragment) {
        this.A03 = reportSpamDialogFragment;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A00(String str) {
        if (!this.A03.A0J) {
            this.A00.A0S(new C71373c0(10, str, this));
        }
    }

    public void BUA(AnonymousClass3ZH r3, boolean z) {
        A00(C54292oU.A04(this.A02, R.string.f11nameremoved));
    }

    public void BX7(AnonymousClass3ZH r3) {
        A00(C54292oU.A04(this.A02, R.string.f11nameremoved));
    }
}
