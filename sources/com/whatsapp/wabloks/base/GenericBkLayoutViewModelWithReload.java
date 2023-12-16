package com.whatsapp.wabloks.base;

import X.AnonymousClass10r;
import X.AnonymousClass39C;
import X.AnonymousClass3XZ;
import X.AnonymousClass4UC;
import X.AnonymousClass9HD;
import X.AnonymousClass9HE;
import X.AnonymousClass9PZ;
import X.C162457s7;
import X.C183538qC;
import X.C46202bF;
import X.C47382dA;
import X.C55552qX;

public final class GenericBkLayoutViewModelWithReload extends AnonymousClass10r {
    public AnonymousClass9PZ A00 = null;
    public final AnonymousClass4UC A01;
    public final C183538qC A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenericBkLayoutViewModelWithReload(C183538qC r2) {
        super(r2);
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
        this.A01 = new AnonymousClass4UC();
    }

    public void A0E(C47382dA r14, AnonymousClass39C r15, String str, String str2, String str3) {
        if (!this.A02) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            super.A0E(r14, r15, str4, str5, str6);
            this.A00 = new AnonymousClass9PZ(r14, r15, str4, str5, str6);
        }
    }

    public boolean A0F(C46202bF r5) {
        this.A01.A0G(new AnonymousClass9HD(r5.A00));
        return false;
    }

    public void A0G() {
        this.A01.A0G(AnonymousClass9HE.A00);
        if (this.A02 && this.A00 != null && this.A01 != null) {
            AnonymousClass9PZ r0 = this.A00;
            String str = r0.A03;
            String str2 = r0.A02;
            ((C55552qX) this.A02.get()).A03(r0.A01, new AnonymousClass3XZ(this.A01, r0.A00), (Boolean) null, str, str2, r0.A04);
        }
    }
}
