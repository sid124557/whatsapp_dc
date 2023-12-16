package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3bM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70973bM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C113995mK A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        long j;
        Boolean bool;
        int intValue;
        int i = this.A00;
        C113995mK r7 = this.A02;
        String str = this.A04;
        UserJid userJid = this.A01;
        String str2 = this.A05;
        Long l = this.A03;
        String str3 = this.A06;
        boolean z = this.A07;
        C25651ar r2 = new C25651ar();
        r2.A02 = Integer.valueOf(i);
        AnonymousClass5R3 r11 = r7.A01;
        if (r11 != null) {
            r2.A03 = C18280x3.A0S();
            r2.A06 = Long.valueOf(r11.A02);
            r2.A07 = Long.valueOf(r11.A03);
            r2.A08 = str2;
            r2.A09 = r11.A07;
            if (str2 != null) {
                r2.A05 = l;
                r2.A04 = AnonymousClass0x9.A0m(C18310x6.A06(AnonymousClass0x9.A0q(str3, r7.A0G)));
            }
        } else {
            r2.A03 = 1;
            C102975Kz r0 = r7.A00;
            if (r0 != null) {
                j = r0.A05;
            } else {
                j = 0;
            }
            r2.A06 = Long.valueOf(j);
            r2.A09 = str;
        }
        AnonymousClass3ZH A072 = r7.A03.A07(userJid);
        if (A072 != null) {
            r2.A00 = Boolean.valueOf(A072.A0R());
            r2.A01 = Boolean.valueOf(A072.A0Q());
        }
        String str4 = r2.A09;
        if (str4 == null || str4.length() == 0) {
            r7.A08.BhB(r2);
        } else {
            r7.A08.Bh7(r2, C106595Zp.A00, true);
        }
        AnonymousClass5R3 r02 = r7.A01;
        if (r02 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Collection<C102965Ky> values = r02.A0D.values();
            if (values != null) {
                for (C102965Ky r03 : values) {
                    A0s.addAll(r03.A08.values());
                }
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C18280x3.A17(((C58982w8) next).A0M, str3, next, A0s2);
            }
            Iterator it2 = A0s2.iterator();
            while (it2.hasNext()) {
                C58982w8 r8 = (C58982w8) it2.next();
                C152427Yv r13 = r7.A0D;
                Long valueOf = Long.valueOf(r8.A09);
                Boolean valueOf2 = Boolean.valueOf(r8.A0K);
                String str5 = r8.A0M;
                UserJid userJid2 = r8.A0L;
                Integer num = r8.A0E;
                if (num == null || !((intValue = num.intValue()) == 4 || intValue == 3)) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.valueOf(AnonymousClass001.A1U((r8.A08 > r8.A06 ? 1 : (r8.A08 == r8.A06 ? 0 : -1))));
                }
                Integer valueOf3 = Integer.valueOf(C58982w8.A00(r8.A02));
                if (z || r13.A02((C624134x) null)) {
                    C134016iJ A002 = r13.A00(userJid2, bool, valueOf2, valueOf3, valueOf, str5);
                    A002.A05 = C18290x4.A0b();
                    C18280x3.A0t(A002, r13.A01, true);
                }
            }
        }
    }

    public /* synthetic */ C70973bM(UserJid userJid, C113995mK r2, Long l, String str, String str2, String str3, int i, boolean z) {
        this.A00 = i;
        this.A02 = r2;
        this.A04 = str;
        this.A01 = userJid;
        this.A05 = str2;
        this.A03 = l;
        this.A06 = str3;
        this.A07 = z;
    }
}
