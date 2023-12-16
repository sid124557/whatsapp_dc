package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass08M;
import X.AnonymousClass0XV;
import X.AnonymousClass2z0;
import X.AnonymousClass5QO;
import X.C05550Ty;
import X.C06270Wx;
import X.C107395bF;
import X.C110745gy;
import X.C1236269d;
import X.C18260x0;
import X.C18290x4;
import X.C18330xA;
import X.C29431io;
import X.C55832qz;
import X.C624134x;
import X.C69263Wi;
import X.C86654Ky;
import android.os.Bundle;
import java.util.List;

public final class MessageSelectionViewModel extends C05550Ty {
    public final AnonymousClass08M A00;
    public final AnonymousClass08M A01;
    public final C69263Wi A02;
    public final C29431io A03;
    public final C55832qz A04;

    public final void A0D() {
        C06270Wx.A03(this.A01, 0);
        AnonymousClass08M r1 = this.A00;
        AnonymousClass5QO r0 = (AnonymousClass5QO) r1.A07();
        if (r0 != null) {
            r0.A01();
            r1.A0H((Object) null);
        }
    }

    public final boolean A0E(int i) {
        AnonymousClass08M r1 = this.A01;
        Number A0i = C86654Ky.A0i(r1);
        if (A0i == null || A0i.intValue() != 0) {
            return false;
        }
        C06270Wx.A03(r1, i);
        return true;
    }

    public MessageSelectionViewModel(AnonymousClass0XV r8, C69263Wi r9, C29431io r10, C55832qz r11) {
        List<AnonymousClass2z0> A042;
        C18260x0.A0c(r8, r9, r11, r10);
        this.A02 = r9;
        this.A04 = r11;
        this.A03 = r10;
        this.A01 = r8.A02(C18290x4.A0Z(), "selectionUiLiveData");
        Bundle bundle = (Bundle) r8.A04("selectedMessagesLiveData");
        AnonymousClass5QO r4 = null;
        if (!(bundle == null || (A042 = C107395bF.A04(bundle)) == null)) {
            r4 = new AnonymousClass5QO(this.A02, new C1236269d(this, 0), (AnonymousClass5QO) null, this.A03);
            for (AnonymousClass2z0 A05 : A042) {
                C624134x A052 = this.A04.A05(A05);
                if (A052 != null) {
                    r4.A04.put(A052.A1J, A052);
                }
            }
        }
        this.A00 = C18330xA.A01(r4);
        r8.A04.put("selectedMessagesLiveData", new C110745gy(this));
    }
}
