package com.whatsapp.info.views;

import X.AnonymousClass547;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C183538qC;
import X.C27991fJ;
import X.C56892sj;
import X.C86624Kv;
import X.C89364cO;
import X.C89654ea;
import X.C95084sb;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

public final class EncryptionInfoView extends ListItemWithLeftIcon {
    public C56892sj A00;
    public C183538qC A01;
    public boolean A02;
    public final C89654ea A03;

    public final void A08(C95084sb r5, C27991fJ r6, boolean z) {
        C162457s7.A0J(r6, 2);
        int i = R.string.f11nameremoved;
        int i2 = R.string.f11nameremoved;
        int i3 = 20;
        if (z) {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
            i3 = 21;
        }
        setOnClickListener(new AnonymousClass547(this, r6, r5, i3));
        C89364cO.A01(getContext(), this, i);
        setDescription((CharSequence) C86624Kv.A0b(this, i2));
        setVisibility(0);
    }

    public final void setDependencyBridgeRegistryLazy$chat_consumerBeta(C183538qC r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setGroupParticipantsManager$chat_consumerBeta(C56892sj r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C89654ea getActivity() {
        return this.A03;
    }

    public final C183538qC getDependencyBridgeRegistryLazy$chat_consumerBeta() {
        C183538qC r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("dependencyBridgeRegistryLazy");
    }

    public final C56892sj getGroupParticipantsManager$chat_consumerBeta() {
        C56892sj r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupParticipantsManager");
    }

    public EncryptionInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A03();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EncryptionInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A03();
        this.A03 = C111095hX.A05(context);
        setIcon(R.drawable.ic_ee_indicator_yes);
        C89364cO.A01(context, this, R.string.f11nameremoved);
        C18310x6.A15(this);
    }
}
