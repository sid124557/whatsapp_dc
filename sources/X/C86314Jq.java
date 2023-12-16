package X;

import com.whatsapp.account.delete.DeleteAccountActivity;
import com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;

/* renamed from: X.4Jq  reason: invalid class name and case insensitive filesystem */
public class C86314Jq implements AnonymousClass4DY {
    public Object A00;
    public final int A01;

    public C86314Jq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXE(int i) {
        C44572Wo r0;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            r0 = ((DeleteNewsletterActivity) obj).A0B;
        } else {
            r0 = ((DeleteAccountActivity) obj).A04;
        }
        if (r0 != null) {
            r0.A00.A02.sendEmptyMessage(3);
        }
    }

    public void BXF(String str) {
        C44572Wo r0;
        if (this.A01 != 0) {
            C162457s7.A0J(str, 0);
            r0 = ((DeleteNewsletterActivity) this.A00).A0B;
        } else {
            r0 = ((DeleteAccountActivity) this.A00).A04;
        }
        if (r0 != null) {
            MatchPhoneNumberFragment matchPhoneNumberFragment = r0.A00;
            String str2 = C56972sr.A05(matchPhoneNumberFragment.A00).user;
            C626936e.A06(str2);
            matchPhoneNumberFragment.A02.sendEmptyMessage(C18280x3.A01(str2.equals(str) ? 1 : 0));
        }
    }
}
