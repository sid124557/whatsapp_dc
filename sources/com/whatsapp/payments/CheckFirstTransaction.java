package com.whatsapp.payments;

import X.AnonymousClass0GH;
import X.AnonymousClass3XA;
import X.AnonymousClass4FS;
import X.AnonymousClass9U4;
import X.C15910sA;
import X.C17280vG;
import X.C18280x3;
import X.C1906899l;
import X.C198809fW;
import X.C204989qF;
import X.C620933l;
import java.util.Objects;

public class CheckFirstTransaction implements C17280vG {
    public final AnonymousClass3XA A00 = new AnonymousClass3XA();
    public final C1906899l A01;
    public final C620933l A02;
    public final AnonymousClass9U4 A03;
    public final AnonymousClass4FS A04;

    public CheckFirstTransaction(C1906899l r2, C620933l r3, AnonymousClass9U4 r4, AnonymousClass4FS r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BcK(AnonymousClass0GH r5, C15910sA r6) {
        AnonymousClass3XA r1;
        Boolean bool;
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            if (!this.A01.A0C()) {
                r1 = this.A00;
                bool = Boolean.TRUE;
            } else {
                C620933l r2 = this.A02;
                if (r2.A03().contains("payment_is_first_send")) {
                    boolean A1W = C18280x3.A1W(r2.A03(), "payment_is_first_send");
                    if (Boolean.valueOf(A1W) != null && !A1W) {
                        r1 = this.A00;
                        bool = Boolean.FALSE;
                    }
                }
                this.A04.BkM(new C198809fW(this));
                AnonymousClass3XA r3 = this.A00;
                C620933l r22 = this.A02;
                Objects.requireNonNull(r22);
                r3.A03(new C204989qF(r22, 1));
            }
            r1.A05(bool);
            AnonymousClass3XA r32 = this.A00;
            C620933l r222 = this.A02;
            Objects.requireNonNull(r222);
            r32.A03(new C204989qF(r222, 1));
        } else if (ordinal == 5) {
            this.A00.A02();
        }
    }
}
