package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.55l  reason: invalid class name and case insensitive filesystem */
public class C993655l extends AnonymousClass5ZM {
    public static final List A08 = Arrays.asList(new String[]{"644728732639272", "369730359717478"});
    public C1225664w A00;
    public final int A01;
    public final AnonymousClass3DP A02;
    public final C620433g A03;
    public final C56962sq A04;
    public final C64773Ex A05;
    public final AnonymousClass30T A06;
    public final C56892sj A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C108985dt A022;
        int i = this.A01;
        ArrayList A0I = AnonymousClass002.A0I(i);
        if (!C18320x8.A1T(this)) {
            AnonymousClass30T r2 = this.A06;
            if (r2.A06()) {
                this.A02.A03();
            }
            Iterator it = r2.A01(new AnonymousClass5BB(0), false).iterator();
            while (it.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it);
                if (!(A0P instanceof C135166kE)) {
                    C64773Ex r5 = this.A05;
                    AnonymousClass3ZH A072 = r5.A07(A0P);
                    if (A072 != null && A072.A0R() && !C86604Kt.A1a(this.A04, A072)) {
                        C95814uZ r1 = A072.A0H;
                        if (!(r1 instanceof C135216kJ) && !(r1 instanceof AnonymousClass1fI) && C627336j.A0I(r1) && ((!A072.A0U() || this.A07.A0C((GroupJid) AnonymousClass3ZH.A05(A072, GroupJid.class))) && (A022 = this.A03.A02((UserJid) A072.A0H)) != null)) {
                            List list = A022.A0O;
                            if (!list.isEmpty() || !A072.A0V()) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (A08.contains(((C166447yh) it2.next()).A00)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            A0I.add(r5.A07(A0P));
                        }
                    }
                    if (A0I.size() >= i) {
                        break;
                    }
                }
            }
        }
        return new AnonymousClass5G4(A0I);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5G4 r2 = (AnonymousClass5G4) obj;
        if (C18320x8.A1T(this)) {
            this.A00 = null;
            return;
        }
        C1225664w r0 = this.A00;
        if (r0 != null) {
            r0.BPw(r2);
        }
    }

    public C993655l(AnonymousClass3DP r1, C620433g r2, C56962sq r3, C64773Ex r4, C1225664w r5, AnonymousClass30T r6, C56892sj r7, int i) {
        this.A01 = i;
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = r1;
        this.A06 = r6;
        this.A03 = r2;
        this.A07 = r7;
        this.A00 = r5;
    }
}
