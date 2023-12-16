package X;

import com.whatsapp.R;
import com.whatsapp.identity.IdentityVerificationActivity;
import java.util.Set;

/* renamed from: X.3Pe  reason: invalid class name and case insensitive filesystem */
public abstract class C67413Pe implements AnonymousClass4D4 {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public C67413Pe(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    public void BTV(AnonymousClass2NZ r9, Set set, Set set2) {
        String A0H;
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (!AnonymousClass1Ha.A26(identityVerificationActivity)) {
            identityVerificationActivity.A04.setVisibility(8);
        }
        if (r9 != null) {
            AnonymousClass2NZ r0 = identityVerificationActivity.A0I;
            if (r0 == r9) {
                return;
            }
            if (r0 != null) {
                C48482ey r1 = r0.A01;
                C48482ey r02 = r9.A01;
                if (!(r1 == null || r02 == null || !r1.equals(r02))) {
                    return;
                }
            }
        }
        identityVerificationActivity.A0I = r9;
        identityVerificationActivity.A0P.A0A = r9;
        int i = 0;
        if (set != null) {
            set.size();
        }
        if (set2 != null) {
            i = set2.size() - 1;
        }
        identityVerificationActivity.A00 = i;
        if (!identityVerificationActivity.A0X) {
            AnonymousClass4HK r12 = (AnonymousClass4HK) this;
            if (r12.A01 != 0) {
                IdentityVerificationActivity identityVerificationActivity2 = (IdentityVerificationActivity) r12.A00;
                AnonymousClass3ZH r13 = identityVerificationActivity2.A0K;
                String str = null;
                if (!(r13 == null || (A0H = identityVerificationActivity2.A0E.A0H(r13)) == null)) {
                    str = identityVerificationActivity2.A00.A0H(A0H);
                }
                String A0b = C18320x8.A0b(identityVerificationActivity2.getResources(), str, new Object[1], 0, R.string.f11nameremoved);
                String A0b2 = C18320x8.A0b(identityVerificationActivity2.getResources(), str, new Object[1], 0, R.string.f11nameremoved);
                C50472iE r14 = new C50472iE();
                r14.A08 = A0b2;
                r14.A09 = A0b;
                r14.A00 = 101;
                identityVerificationActivity2.Bon(r14.A00(), (String) null);
                identityVerificationActivity2.A0X = true;
                return;
            }
            ((IdentityVerificationActivity) r12.A00).A78();
        }
    }

    public void BYc() {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (!AnonymousClass1Ha.A26(identityVerificationActivity)) {
            identityVerificationActivity.A04.setVisibility(0);
        }
    }
}
