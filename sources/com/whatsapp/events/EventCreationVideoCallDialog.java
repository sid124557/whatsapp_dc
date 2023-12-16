package com.whatsapp.events;

import X.AnonymousClass11J;
import X.AnonymousClass340;
import X.AnonymousClass66R;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C45942ap;
import X.C56952sp;
import X.C60552yk;
import X.C633839a;
import X.C77873u6;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

public final class EventCreationVideoCallDialog extends Hilt_EventCreationVideoCallDialog {
    public C45942ap A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C77873u6(this));
    public final AnonymousClass66R A02 = AnonymousClass340.A01(this, "EVENT_DATE");

    public Dialog A1J(Bundle bundle) {
        C19340zH A0M = C18300x5.A0M(this);
        View A0I = C18310x6.A0I(A0R().getLayoutInflater(), (ViewGroup) null, R.layout.f8nameremoved, false);
        CompoundButton compoundButton = (CompoundButton) C18280x3.A0E(A0I, R.id.none_button);
        CompoundButton compoundButton2 = (CompoundButton) C18280x3.A0E(A0I, R.id.whatsapp_video_call_button);
        CompoundButton compoundButton3 = (CompoundButton) C18280x3.A0E(A0I, R.id.link_button);
        int ordinal = ((C60552yk) ((AnonymousClass11J) this.A01.getValue()).A0C.getValue()).A00.ordinal();
        if (ordinal == 3) {
            compoundButton2.setChecked(true);
        } else if (ordinal != 1) {
            compoundButton.setChecked(true);
        } else {
            compoundButton3.setChecked(true);
        }
        C633839a.A00(compoundButton, this, 31);
        long A0D = C18290x4.A0D(this.A02);
        C45942ap r1 = this.A00;
        if (r1 != null) {
            if (A0D > r1.A02.A0H() + TimeUnit.DAYS.toMillis(C56952sp.A06(r1.A03, 6265))) {
                compoundButton2.setEnabled(false);
            }
            C633839a.A00(compoundButton2, this, 32);
            C633839a.A00(compoundButton3, this, 33);
            compoundButton.setText(R.string.f11nameremoved);
            compoundButton2.setText(R.string.f11nameremoved);
            compoundButton3.setText(R.string.f11nameremoved);
            A0M.setView(A0I);
            return C18300x5.A0H(A0M);
        }
        throw C18270x1.A0S("eventUtils");
    }
}
