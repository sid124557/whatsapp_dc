package com.whatsapp.conversation;

import X.AnonymousClass0IT;
import X.AnonymousClass20D;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C154517dI;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C39642Ct;
import X.C616131n;
import X.C77653tk;
import X.C77663tl;
import X.C80313y2;
import X.C84814Du;
import X.C85494Gl;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class CustomStickerConfirmationDialog extends Hilt_CustomStickerConfirmationDialog {
    public View A00;
    public C39642Ct A01;
    public final AnonymousClass66R A02 = C154517dI.A00(AnonymousClass58H.NONE, new C80313y2(this));
    public final AnonymousClass66R A03 = C154517dI.A01(new C77653tk(this));
    public final AnonymousClass66R A04 = C154517dI.A01(new C77663tl(this));

    public void A0c() {
        this.A00 = null;
        super.A0c();
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        C616131n.A02((C85494Gl) null, new CustomStickerConfirmationDialog$onViewCreated$1(this, (C84814Du) null), AnonymousClass0IT.A00(A0V()), (AnonymousClass20D) null, 3);
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        View A0H = C18310x6.A0H(A0R().getLayoutInflater(), R.layout.f8nameremoved);
        this.A00 = A0H;
        A0K.A0a(A0H);
        C19340zH.A03(this, A0K, 75, R.string.f11nameremoved);
        C19340zH.A04(this, A0K, 76, R.string.f11nameremoved);
        return C18300x5.A0H(A0K);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.A00;
    }
}
