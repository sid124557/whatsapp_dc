package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.spamreport.ReportSpamDialogFragment;
import com.whatsapp.spamreport.ReportSpamDialogFragmentOld;

/* renamed from: X.5XI  reason: invalid class name */
public final class AnonymousClass5XI {
    public int A00 = 1;
    public UserJid A01;
    public AnonymousClass2z0 A02;
    public AnonymousClass65Z A03;
    public boolean A04;
    public boolean A05 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public boolean A08 = true;
    public final AnonymousClass1VX A09;
    public final C95814uZ A0A;
    public final String A0B;
    public final boolean A0C;

    public AnonymousClass5XI(AnonymousClass1VX r2, C95814uZ r3, String str, boolean z) {
        C18260x0.A0Z(r2, r3, str, 1);
        this.A0A = r3;
        this.A0B = str;
        this.A09 = r2;
        this.A0C = z;
    }

    public final void A01(AnonymousClass1RL r3) {
        C162457s7.A0J(r3, 0);
        this.A08 = false;
        this.A06 = AnonymousClass000.A1Y(r3.A07, C372821q.SUBSCRIBED);
        this.A00 = 2;
    }

    public final DialogFragment A00() {
        if (this.A09.A0X(5734)) {
            C95814uZ r15 = this.A0A;
            UserJid userJid = this.A01;
            String str = this.A0B;
            boolean z = this.A0C;
            int i = this.A00;
            boolean z2 = this.A08;
            boolean z3 = this.A05;
            boolean z4 = this.A07;
            boolean z5 = this.A06;
            boolean z6 = this.A04;
            AnonymousClass2z0 r6 = this.A02;
            AnonymousClass65Z r5 = this.A03;
            ReportSpamDialogFragment reportSpamDialogFragment = new ReportSpamDialogFragment();
            Bundle A082 = AnonymousClass002.A08();
            AnonymousClass0x2.A0v(A082, r15, "jid");
            A082.putString("senderJid", C18290x4.A0n(userJid));
            A082.putString("flow", str);
            A082.putBoolean("hasLoggedInPairedDevices", z);
            A082.putInt("upsellAction", i);
            A082.putBoolean("upsellCheckboxActionDefault", z2);
            A082.putBoolean("shouldDeleteChatOnBlock", z3);
            A082.putBoolean("shouldOpenHomeScreenAction", z4);
            A082.putBoolean("shouldDisplayUpsellCheckbox", z5);
            A082.putBoolean("notifyObservableDialogHost", z6);
            if (r6 != null) {
                C107395bF.A07(A082, r6);
            }
            reportSpamDialogFragment.A0F = r5;
            reportSpamDialogFragment.A0u(A082);
            return reportSpamDialogFragment;
        }
        C95814uZ r1 = this.A0A;
        UserJid userJid2 = this.A01;
        String str2 = this.A0B;
        boolean z7 = this.A0C;
        return ReportSpamDialogFragmentOld.A00(r1, userJid2, this.A02, this.A03, str2, this.A00, z7, this.A08, this.A05, this.A07, this.A06, this.A04);
    }
}
