package com.whatsapp.chatinfo;

import X.AnonymousClass352;
import X.AnonymousClass3ZH;
import X.C111095hX;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C27991fJ;
import X.C49882hF;
import X.C52472lX;
import X.C56892sj;
import X.C56982ss;
import X.C635139n;
import X.C66493Lq;
import X.C89294cE;
import X.C89364cO;
import X.C89654ea;
import X.C95084sb;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;

public class EphemeralMessagesInfoView extends C89294cE {
    public C56982ss A00;
    public C56892sj A01;
    public C66493Lq A02;
    public C49882hF A03;
    public C52472lX A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EphemeralMessagesInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A04(R.drawable.ic_group_ephemeral, false);
        C89364cO.A01(context, this, R.string.f11nameremoved);
    }

    public final void A08(AnonymousClass3ZH r9, C95084sb r10, C27991fJ r11, boolean z) {
        AnonymousClass3ZH r5 = r9;
        C162457s7.A0J(r9, 0);
        C95084sb r2 = r10;
        C27991fJ r4 = r11;
        C18260x0.A0Q(r11, r10);
        Activity A032 = C111095hX.A03(getContext(), C89654ea.class);
        if (getGroupInfoUtils$ui_consumerBeta().A01(r9, r11, z)) {
            setVisibility(0);
            A04(R.drawable.ic_group_ephemeral_v2, false);
            String A012 = AnonymousClass352.A01(getContext(), r9.A02, false, false);
            C162457s7.A0D(A012);
            setDescription((CharSequence) A012);
            setOnClickListener(new C635139n(r2, this, r4, r5, A032, 0));
            return;
        }
        setVisibility(8);
    }

    public final void setChatsCache$ui_consumerBeta(C56982ss r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setGroupChatManager$ui_consumerBeta(C66493Lq r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setGroupInfoUtils$ui_consumerBeta(C49882hF r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setGroupParticipantsManager$ui_consumerBeta(C56892sj r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setSuspensionManager$ui_consumerBeta(C52472lX r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final C56982ss getChatsCache$ui_consumerBeta() {
        C56982ss r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public final C66493Lq getGroupChatManager$ui_consumerBeta() {
        C66493Lq r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupChatManager");
    }

    public final C49882hF getGroupInfoUtils$ui_consumerBeta() {
        C49882hF r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupInfoUtils");
    }

    public final C56892sj getGroupParticipantsManager$ui_consumerBeta() {
        C56892sj r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupParticipantsManager");
    }

    public final C52472lX getSuspensionManager$ui_consumerBeta() {
        C52472lX r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("suspensionManager");
    }
}
