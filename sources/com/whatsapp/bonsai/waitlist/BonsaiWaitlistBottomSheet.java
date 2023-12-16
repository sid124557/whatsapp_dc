package com.whatsapp.bonsai.waitlist;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1ZN;
import X.AnonymousClass2ZP;
import X.AnonymousClass31C;
import X.AnonymousClass3ES;
import X.AnonymousClass4FV;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C35351wj;
import X.C35571x5;
import X.C35721xK;
import X.C40172Eu;
import X.C40182Ev;
import X.C41032Ir;
import X.C59702xL;
import X.C64963Fr;
import X.C69263Wi;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public class BonsaiWaitlistBottomSheet extends Hilt_BonsaiWaitlistBottomSheet {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        AnonymousClass0x9.A0F(view, R.id.image).setImageResource(this.A01);
        AnonymousClass002.A09(view, R.id.title).setText(this.A03);
        TextView A09 = AnonymousClass002.A09(view, R.id.description);
        int i = this.A00;
        if (i == 0) {
            A09.setVisibility(8);
        } else {
            A09.setText(i);
        }
        TextView A092 = AnonymousClass002.A09(view, R.id.positive_button);
        A092.setText(this.A02);
        C18290x4.A1H(A092, this, 14);
        View findViewById = view.findViewById(R.id.negative_button);
        C162457s7.A0H(findViewById);
        findViewById.setVisibility(8);
    }

    public void A1Y() {
        if (this instanceof BonsaiWaitlistJoinBottomSheet) {
            BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet = (BonsaiWaitlistJoinBottomSheet) this;
            C69263Wi r2 = bonsaiWaitlistJoinBottomSheet.A00;
            if (r2 != null) {
                r2.A0G(0, R.string.f11nameremoved);
                C64963Fr r0 = bonsaiWaitlistJoinBottomSheet.A01;
                if (r0 != null) {
                    Integer num = bonsaiWaitlistJoinBottomSheet.A03;
                    AnonymousClass4FV r22 = r0.A03;
                    AnonymousClass1ZN r1 = new AnonymousClass1ZN();
                    r1.A00 = 44;
                    r1.A01 = num;
                    r22.BhD(r1);
                    C59702xL r23 = bonsaiWaitlistJoinBottomSheet.A02;
                    if (r23 != null) {
                        AnonymousClass3ES r12 = new AnonymousClass3ES(bonsaiWaitlistJoinBottomSheet);
                        C40182Ev r02 = r23.A01;
                        AnonymousClass2ZP r3 = new AnonymousClass2ZP(bonsaiWaitlistJoinBottomSheet, r12, r23);
                        AnonymousClass31C r4 = r02.A00;
                        String A032 = r4.A03();
                        C35721xK r24 = new C35721xK(new C35351wj(new C35351wj(A032, 9), 7), 5);
                        r4.A0D(new C35571x5(r24, new C40172Eu(r3), 1), C41032Ir.A05(r24), A032, 425, 32000);
                        return;
                    }
                    throw C18270x1.A0S("bonsaiWaitlistSyncManager");
                }
                throw C18270x1.A0S("bonsaiWaitlistLogger");
            }
            throw C18270x1.A0S("globalUI");
        }
        A1L();
    }

    public BonsaiWaitlistBottomSheet(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
