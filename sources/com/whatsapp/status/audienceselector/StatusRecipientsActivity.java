package com.whatsapp.status.audienceselector;

import X.AnonymousClass3FH;
import X.AnonymousClass5VQ;
import X.C113995mK;
import X.C44132Uu;
import X.C49712gy;
import X.C58422vE;
import X.C620233e;
import X.C88954b5;
import java.util.Set;

public class StatusRecipientsActivity extends C88954b5 {
    public C44132Uu A00;
    public C49712gy A01;
    public AnonymousClass3FH A02;
    public C620233e A03;
    public C113995mK A04;

    public final boolean A7A() {
        if (!this.A0D.A0Y(C58422vE.A01, 2611) || !this.A0M || this.A0V.size() != this.A0L.size()) {
            return false;
        }
        this.A05.A0P("You cannot exclude everyone", 1);
        return true;
    }

    public void A78() {
        super.A78();
        if (!this.A0M) {
            Set set = this.A0V;
            if (set.size() == 0 && this.A02.getVisibility() == 0) {
                AnonymousClass5VQ.A01(this.A02, false, true);
            } else if (set.size() != 0 && this.A02.getVisibility() == 4) {
                AnonymousClass5VQ.A01(this.A02, true, true);
            }
        }
    }
}
