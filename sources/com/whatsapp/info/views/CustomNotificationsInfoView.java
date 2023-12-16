package com.whatsapp.info.views;

import X.AnonymousClass001;
import X.AnonymousClass1R1;
import X.AnonymousClass54H;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C27991fJ;
import X.C89304cF;
import X.C89364cO;
import X.C89654ea;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;

public class CustomNotificationsInfoView extends C89304cF {
    public AnonymousClass1R1 A00;
    public final C89654ea A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomNotificationsInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        this.A01 = C111095hX.A05(context);
        A04(R.drawable.vec_ic_music_note, false);
        C89364cO.A01(context, this, R.string.f11nameremoved);
        setDescription((int) R.string.f11nameremoved);
    }

    public final void A08(C27991fJ r2) {
        C162457s7.A0J(r2, 0);
        setDescriptionVisibility(AnonymousClass001.A08(AnonymousClass1R1.A00(r2, getChatSettingsStore$chat_consumerBeta()).A0K ? 1 : 0));
        setOnClickListener(new AnonymousClass54H(this, r2));
    }

    public final void setChatSettingsStore$chat_consumerBeta(AnonymousClass1R1 r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C89654ea getActivity() {
        return this.A01;
    }

    public final AnonymousClass1R1 getChatSettingsStore$chat_consumerBeta() {
        AnonymousClass1R1 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatSettingsStore");
    }
}
