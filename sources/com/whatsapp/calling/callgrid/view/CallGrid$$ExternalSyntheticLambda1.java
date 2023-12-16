package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.AnonymousClass30B;
import X.AnonymousClass4XD;
import X.AnonymousClass5MO;
import X.AnonymousClass7D2;
import X.C105365Uq;
import X.C114015mM;
import X.C15910sA;
import X.C17280vG;
import X.C29421in;
import X.C86614Ku;
import X.C91174j2;
import java.util.Iterator;
import java.util.Map;

public final /* synthetic */ class CallGrid$$ExternalSyntheticLambda1 implements C17280vG {
    public final /* synthetic */ CallGrid A00;

    public final void BcK(AnonymousClass0GH r7, C15910sA r8) {
        CallGrid callGrid = this.A00;
        if (r7 == AnonymousClass0GH.ON_START) {
            int i = C86614Ku.A0E(callGrid).widthPixels;
            AnonymousClass7D2 r5 = callGrid.A0h;
            C114015mM r3 = callGrid.A0I;
            C105365Uq A07 = r3.A07("call-grid", 0.0f, i / 2);
            Map map = r5.A00;
            map.put(0, A07);
            map.put(AnonymousClass001.A0f(), r3.A06(callGrid.getContext(), "voip-call-control-bottom-sheet"));
            AnonymousClass4XD r32 = callGrid.A07;
            r32.A02 = r5;
            C91174j2 r2 = callGrid.A08;
            r2.A02 = r5;
            AnonymousClass5MO r0 = callGrid.A0i;
            r32.A03 = r0;
            r2.A03 = r0;
            C29421in r1 = callGrid.A0G;
            r1.A06(r32.A0F);
            r1.A06(r2.A0F);
            r1.A06(callGrid.A0o);
            callGrid.A0g.A0q(callGrid.A0e);
            callGrid.A0f.A0q(callGrid.A0d);
        } else if (r7 == AnonymousClass0GH.ON_STOP) {
            if (callGrid.A0R) {
                callGrid.A0D(AnonymousClass001.A0s(), false);
                callGrid.A0D(AnonymousClass001.A0s(), true);
            }
            AnonymousClass7D2 r02 = callGrid.A0h;
            if (r02 != null) {
                Map map2 = r02.A00;
                Iterator A0v = AnonymousClass001.A0v(map2);
                while (A0v.hasNext()) {
                    ((C105365Uq) A0v.next()).A00();
                }
                map2.clear();
            }
            AnonymousClass30B r12 = callGrid.A04;
            synchronized (r12.A01) {
                if (r12.A07 != null) {
                    r12.A07.A05(0);
                }
            }
            C29421in r13 = callGrid.A0G;
            AnonymousClass4XD r33 = callGrid.A07;
            r13.A07(r33.A0F);
            C91174j2 r22 = callGrid.A08;
            r13.A07(r22.A0F);
            r13.A07(callGrid.A0o);
            callGrid.A0g.A0r(callGrid.A0e);
            callGrid.A0f.A0r(callGrid.A0d);
            r33.A03 = null;
            r22.A03 = null;
            callGrid.A0E.A01();
            C105365Uq r03 = callGrid.A0H;
            if (r03 != null) {
                r03.A00();
            }
        }
    }

    public /* synthetic */ CallGrid$$ExternalSyntheticLambda1(CallGrid callGrid) {
        this.A00 = callGrid;
    }
}
