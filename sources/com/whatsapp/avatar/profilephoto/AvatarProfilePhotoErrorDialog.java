package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass0x9;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C154517dI;
import X.C18280x3;
import X.C18300x5;
import X.C18330xA;
import X.C19340zH;
import X.C76763sJ;
import X.C76773sK;
import X.C76783sL;
import X.C79913xO;
import X.C79923xP;
import X.C85824Ht;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class AvatarProfilePhotoErrorDialog extends Hilt_AvatarProfilePhotoErrorDialog {
    public final AnonymousClass66R A00;

    public AvatarProfilePhotoErrorDialog() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C76773sK(new C76763sJ(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(AvatarProfilePhotoViewModel.class);
        this.A00 = C18330xA.A02(new C76783sL(A002), new C79923xP(this, A002), new C79913xO(A002), A1E);
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0T(R.string.f11nameremoved);
        C19340zH.A08(A0K, this, 23, R.string.f11nameremoved);
        A0K.A0V(new C85824Ht(this, 2));
        return C18300x5.A0H(A0K);
    }
}
