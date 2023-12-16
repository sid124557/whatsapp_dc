package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass9U4;
import X.AnonymousClass9VG;
import X.C05550Ty;
import X.C133676hl;
import X.C1899693i;
import X.C194659Tz;
import X.C194839Ur;
import X.C194869Uu;
import X.C194969Vi;
import X.C56612sH;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

public class PaymentIncentiveViewModel extends C05550Ty {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C56612sH A03;
    public final C194659Tz A04;
    public final AnonymousClass9U4 A05;
    public final C194969Vi A06;
    public final AnonymousClass4FS A07;

    public final boolean A0E(C194659Tz r8, AnonymousClass9VG r9) {
        if (r8 == null) {
            return false;
        }
        int A002 = r9.A00(TimeUnit.MILLISECONDS.toSeconds(this.A03.A0H()));
        AnonymousClass1VX r2 = r8.A07;
        if (!C1899693i.A0w(r2) || A002 != 1) {
            return false;
        }
        C194869Uu r1 = r9.A01;
        C194839Ur r5 = r9.A02;
        return r1 != null && r5 != null && C1899693i.A0w(r2) && r1.A05 > ((long) (r5.A01 + r5.A00)) && r5.A04;
    }

    public final int A0D(UserJid userJid) {
        if (userJid == null) {
            return 6;
        }
        AnonymousClass9U4 r3 = this.A05;
        C133676hl A052 = AnonymousClass9U4.A03(r3).A05(userJid);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A03.A0H());
        AnonymousClass9VG A002 = this.A06.A00();
        C194659Tz A053 = AnonymousClass9U4.A05(r3);
        if (A053 == null) {
            return 6;
        }
        int A003 = A002.A00(seconds);
        C194869Uu r7 = A002.A01;
        C194839Ur r10 = A002.A02;
        int i = 6;
        if (r7 != null) {
            char c = 3;
            if (C1899693i.A0w(A053.A07) && r10 != null) {
                if (r7.A05 <= ((long) (r10.A01 + r10.A00))) {
                    c = 2;
                } else if (r10.A04) {
                    c = 1;
                }
            }
            int A004 = A053.A00(A052, userJid, r7);
            if (!(c == 3 || A004 == 3)) {
                if (c == 2) {
                    i = 4;
                } else if (A004 != 0) {
                    i = 5;
                    if (A004 != 2) {
                        i = 0;
                    }
                } else {
                    i = 3;
                }
            }
        }
        if (A003 == 0) {
            return 6;
        }
        if (A003 == 4) {
            return 1;
        }
        if (A003 == 3) {
            return 6;
        }
        return i;
    }

    public PaymentIncentiveViewModel(C56612sH r2, AnonymousClass9U4 r3, C194969Vi r4, AnonymousClass4FS r5) {
        this.A03 = r2;
        this.A07 = r5;
        this.A05 = r3;
        this.A04 = AnonymousClass9U4.A05(r3);
        this.A06 = r4;
    }
}
