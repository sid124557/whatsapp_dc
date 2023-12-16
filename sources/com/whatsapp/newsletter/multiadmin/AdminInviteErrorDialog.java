package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass0x9;
import X.AnonymousClass21J;
import X.AnonymousClass340;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C003203q;
import X.C154517dI;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C80583yT;
import X.C80813yq;
import X.C81453zu;
import X.C84004Aq;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.Collection;
import org.wawebrtc.MediaCodecVideoEncoder;

public final class AdminInviteErrorDialog extends WaDialogFragment {
    public C84004Aq A00;
    public final AnonymousClass66R A01;
    public final AnonymousClass66R A02;
    public final AnonymousClass66R A03 = AnonymousClass340.A02(this, "arg_dialog_message");
    public final AnonymousClass66R A04;

    public void A1G(Context context) {
        C84004Aq r1;
        C162457s7.A0J(context, 0);
        super.A1G(context);
        if (this.A00 == null) {
            C003203q A0Q = A0Q();
            if (A0Q instanceof C84004Aq) {
                r1 = (C84004Aq) A0Q;
            } else {
                r1 = null;
            }
            this.A00 = r1;
        }
    }

    public AdminInviteErrorDialog() {
        AnonymousClass58H r2 = AnonymousClass58H.NONE;
        this.A04 = C154517dI.A00(r2, new C80813yq(this));
        this.A01 = C154517dI.A00(r2, new C81453zu(this, AnonymousClass21J.NOT_SUPPORTED));
        this.A02 = C154517dI.A00(r2, new C80583yT(this, "arg_caption"));
    }

    public void A0d() {
        super.A0d();
        this.A00 = null;
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0g(AnonymousClass0x9.A13(this.A03));
        if (C18310x6.A1X((Collection) this.A04.getValue())) {
            C19340zH.A04(this, A0K, 143, R.string.f11nameremoved);
            C19340zH.A03(this, A0K, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, R.string.f11nameremoved);
        } else {
            C19340zH.A04(this, A0K, 145, R.string.f11nameremoved);
        }
        return C18300x5.A0H(A0K);
    }
}
