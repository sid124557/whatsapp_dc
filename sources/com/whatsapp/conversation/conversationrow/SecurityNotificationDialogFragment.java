package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.C107345b9;
import X.C111095hX;
import X.C56972sr;
import X.C620733j;
import X.C64773Ex;
import X.C66433Lk;

public abstract class SecurityNotificationDialogFragment extends Hilt_SecurityNotificationDialogFragment {
    public C111095hX A00;
    public C56972sr A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public AnonymousClass5Y0 A04;
    public C66433Lk A05;
    public AnonymousClass4FS A06;

    public CharSequence A1V(AnonymousClass3ZH r4, int i) {
        String A0H;
        Object[] A0L = AnonymousClass002.A0L();
        C620733j r1 = this.A01;
        String A0H2 = this.A03.A0H(r4);
        if (A0H2 == null) {
            A0H = null;
        } else {
            A0H = r1.A0H(A0H2);
        }
        return C107345b9.A05(A1D(), this.A04, AnonymousClass0x7.A0m(this, A0H, A0L, i));
    }
}
