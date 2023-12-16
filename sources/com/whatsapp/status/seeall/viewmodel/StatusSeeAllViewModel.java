package com.whatsapp.status.seeall.viewmodel;

import X.AnonymousClass08J;
import X.AnonymousClass0GH;
import X.AnonymousClass0IV;
import X.AnonymousClass20D;
import X.AnonymousClass4L0;
import X.AnonymousClass590;
import X.AnonymousClass62P;
import X.AnonymousClass6C6;
import X.C05550Ty;
import X.C06270Wx;
import X.C101185Du;
import X.C101205Dw;
import X.C105765Wh;
import X.C15910sA;
import X.C17280vG;
import X.C18260x0;
import X.C616131n;
import X.C73853gB;
import X.C84814Du;
import X.C85474Gj;
import com.whatsapp.status.viewmodels.StatusesViewModel;

public final class StatusSeeAllViewModel extends C05550Ty implements C17280vG {
    public C06270Wx A00;
    public AnonymousClass08J A01;
    public AnonymousClass590 A02 = AnonymousClass590.ALL;
    public C85474Gj A03;
    public boolean A04;
    public final C101185Du A05;
    public final C101205Dw A06;
    public final StatusesViewModel A07;
    public final C73853gB A08;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[LOOP:0: B:11:0x0030->B:12:0x0032, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C104845So A0D(java.lang.String r12, java.util.List r13) {
        /*
            r11 = this;
            r6 = r12
            boolean r9 = r13.isEmpty()
            boolean r10 = r13.isEmpty()
            boolean r0 = r11.A04
            r3 = 0
            if (r0 == 0) goto L_0x003c
            r8 = 2131893369(0x7f121c79, float:1.9421513E38)
        L_0x0011:
            r10 = 0
        L_0x0012:
            X.8U9 r5 = new X.8U9
            r5.<init>()
            X.590 r1 = r11.A02
            X.590 r0 = X.AnonymousClass590.ALL
            if (r1 != r0) goto L_0x0023
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x006c
        L_0x0023:
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x006c
            X.590[] r4 = X.AnonymousClass590.values()
            int r1 = r4.length
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r1)
        L_0x0030:
            if (r3 >= r1) goto L_0x005e
            r0 = r4[r3]
            int r0 = r0.labelResource
            X.C18270x1.A1K(r2, r0)
            int r3 = r3 + 1
            goto L_0x0030
        L_0x003c:
            X.590 r0 = r11.A02
            int r1 = r0.ordinal()
            r6 = 0
            if (r1 == r3) goto L_0x005a
            r0 = 1
            if (r1 == r0) goto L_0x0056
            r0 = 2
            if (r1 == r0) goto L_0x0052
            r0 = 3
            if (r1 != r0) goto L_0x0079
            r8 = 2131893416(0x7f121ca8, float:1.9421608E38)
            goto L_0x0012
        L_0x0052:
            r8 = 2131893419(0x7f121cab, float:1.9421614E38)
            goto L_0x0012
        L_0x0056:
            r8 = 2131893417(0x7f121ca9, float:1.942161E38)
            goto L_0x0012
        L_0x005a:
            r8 = 2131893418(0x7f121caa, float:1.9421612E38)
            goto L_0x0011
        L_0x005e:
            X.590 r0 = r11.A02
            int r1 = r0.ordinal()
            X.533 r0 = new X.533
            r0.<init>(r2, r1)
            r5.add(r0)
        L_0x006c:
            r5.addAll(r13)
            java.util.List r7 = X.C159507lx.A0h(r5)
            X.5So r5 = new X.5So
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0079:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel.A0D(java.lang.String, java.util.List):X.5So");
    }

    public final void A0E(AnonymousClass590 r6) {
        this.A02 = r6;
        this.A04 = false;
        C105765Wh r0 = (C105765Wh) this.A07.A06.A07();
        if (r0 != null) {
            C616131n.A02(this.A08, new StatusSeeAllViewModel$fetchAndPostStatusesUiData$1(r0, this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
        }
    }

    public void BcK(AnonymousClass0GH r1, C15910sA r2) {
    }

    public StatusSeeAllViewModel(C101185Du r5, C101205Dw r6, StatusesViewModel statusesViewModel, C73853gB r8) {
        C18260x0.A0Q(r5, r6);
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = r8;
        this.A07 = statusesViewModel;
        AnonymousClass08J A0E = AnonymousClass4L0.A0E();
        this.A01 = A0E;
        this.A00 = A0E;
        AnonymousClass6C6.A03(statusesViewModel.A06, A0E, new AnonymousClass62P(this), 350);
    }
}
