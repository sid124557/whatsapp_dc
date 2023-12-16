package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2nO  reason: invalid class name and case insensitive filesystem */
public final class C53622nO {
    public final C56972sr A00;
    public final C56612sH A01;
    public final C66533Lu A02;
    public final C50012hU A03;
    public final C194539Ti A04;
    public final AnonymousClass9U4 A05;
    public final C183538qC A06;

    public final synchronized void A00(C624134x r13) {
        String str;
        AnonymousClass39Q r0;
        C162457s7.A0J(r13, 0);
        C624034w r6 = r13.A0P;
        if (!(r6 == null || (str = r6.A0M) == null || str.length() == 0)) {
            AnonymousClass36F A0A = this.A05.A0A();
            C162457s7.A0D(A0A);
            C624034w A052 = AnonymousClass36F.A05(A0A, r6.A0M, (String) null);
            if (A052 != null) {
                C624134x A0E = AnonymousClass0x9.A0M(this.A06).A0E(A052);
                if (r6.A0G()) {
                    int i = A052.A02;
                    AnonymousClass39Q r1 = r6.A08;
                    if (!(i == 18 || (r0 = A052.A08) == null || !r0.equals(r1))) {
                        if (A0E != null) {
                            if (r6.A0M()) {
                                A052.A02 = 17;
                                A052.A06 = this.A01.A0H();
                                A0E.A0P = A052;
                            }
                            AnonymousClass2z0 r7 = A0E.A1J;
                            C624034w r62 = A0E.A0P;
                            C626936e.A06(r62);
                            if (A0A.A0g(r62, r7, i, 0, 0)) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("msgStore/markPaymentRequestMessageFulfilled request message id: ");
                                Log.i(C160757oG.A01("CoreMessageStore", AnonymousClass000.A0X(A052.A0L, A0o)));
                                this.A03.A00(A0E, 16);
                            }
                        } else {
                            if (r6.A0M()) {
                                A052.A02 = 17;
                                A052.A06 = this.A01.A0H();
                            }
                            if (A0A.A0d(A052)) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                                Log.i(C160757oG.A01("CoreMessageStore", AnonymousClass000.A0X(A052.A0L, A0o2)));
                                this.A04.A02(A052);
                            }
                        }
                    }
                } else if (A0E != null) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                    A0o3.append(A052.A0L);
                    A0o3.append(" status: ");
                    Log.i(C160757oG.A01("PaymentRequestMessageManager", AnonymousClass000.A0h(A0o3, r6.A02)));
                    this.A03.A00(A0E, 16);
                }
                this.A02.A0K(A0E);
            }
        }
    }

    public final boolean A01(C624034w r4, C624134x r5) {
        int i;
        PhoneUserJid A042 = C56972sr.A04(this.A00);
        if (A042 == null || (AnonymousClass2z0.A0D(r5) && !A042.equals(r4.A0E) && !A042.equals(r4.A0D))) {
            return false;
        }
        if (r5 instanceof C30831nH) {
            i = 15;
        } else if (r5 instanceof AnonymousClass1nG) {
            i = 18;
        } else {
            throw AnonymousClass001.A0e(C160757oG.A01("CoreMessageStore", "Handled message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled"));
        }
        r4.A02 = i;
        return true;
    }

    public C53622nO(C56972sr r1, C56612sH r2, C66533Lu r3, C50012hU r4, C194539Ti r5, AnonymousClass9U4 r6, C183538qC r7) {
        C18260x0.A0f(r2, r1, r4, r3, r6);
        C18260x0.A0U(r7, r5);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
    }
}
