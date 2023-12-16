package X;

import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.89m  reason: invalid class name and case insensitive filesystem */
public final class C1694889m implements C180898lo, C180888ln {
    public IAccountAccessor A00 = null;
    public Set A01 = null;
    public boolean A02 = false;
    public final C187688xe A03;
    public final C151727Wb A04;
    public final /* synthetic */ C163007t7 A05;

    public C1694889m(C187688xe r2, C151727Wb r3, C163007t7 r4) {
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
    }

    public final void Ba1(C127866Tp r3) {
        AnonymousClass8MF.A00(this.A05.A06, r3, this, 35);
    }

    public final void Bt1(C127866Tp r7) {
        AnonymousClass89A r5 = (AnonymousClass89A) this.A05.A09.get(this.A04);
        if (r5 != null) {
            C162177rO.A01(r5.A0C.A06);
            C187688xe r4 = r5.A04;
            String A0O = AnonymousClass000.A0O(r4);
            String valueOf = String.valueOf(r7);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("onSignInFailed for ");
            A0o.append(A0O);
            r4.B1m(AnonymousClass000.A0V(" with ", valueOf, A0o));
            r5.A07(r7, (Exception) null);
        }
    }
}
