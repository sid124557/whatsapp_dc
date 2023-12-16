package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass107;
import X.AnonymousClass4L0;
import X.AnonymousClass4VK;
import X.AnonymousClass5XK;
import X.AnonymousClass745;
import X.C158507k5;
import X.C187958y5;
import X.C620633i;
import X.C97174xk;

public class BottomSheetViewModel extends AnonymousClass4VK {
    public C158507k5 A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final AnonymousClass08M A05 = AnonymousClass08M.A01();
    public final AnonymousClass08M A06 = AnonymousClass08M.A01();
    public final C97174xk A07;
    public final C620633i A08;
    public final AnonymousClass107 A09;
    public final AnonymousClass107 A0A;
    public final AnonymousClass107 A0B;
    public final C187958y5 A0C;

    public void A0C() {
        this.A07.A07(this);
    }

    public final boolean A0G(AnonymousClass5XK r4) {
        C158507k5 r0 = this.A00;
        if (r0 == null || r0.A00 != 2) {
            if (AnonymousClass745.A00(r4) && r4.A0G) {
                return true;
            }
            if (r4.A0F || this.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public BottomSheetViewModel(C97174xk r3, C620633i r4, C187958y5 r5) {
        Boolean bool = Boolean.FALSE;
        this.A0A = AnonymousClass4L0.A0O(bool);
        this.A0B = AnonymousClass4L0.A0O(bool);
        this.A09 = AnonymousClass4L0.A0O(bool);
        this.A07 = r3;
        this.A0C = r5;
        this.A08 = r4;
        r3.A06(this);
        AnonymousClass4VK.A02(r3, this);
    }
}
