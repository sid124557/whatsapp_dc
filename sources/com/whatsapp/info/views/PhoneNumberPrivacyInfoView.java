package com.whatsapp.info.views;

import X.AnonymousClass2W8;
import X.AnonymousClass4FS;
import X.AnonymousClass547;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C183538qC;
import X.C27991fJ;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C89314cG;
import X.C89364cO;
import X.C89654ea;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;

public class PhoneNumberPrivacyInfoView extends C89314cG {
    public C56972sr A00;
    public C56982ss A01;
    public C56892sj A02;
    public AnonymousClass2W8 A03;
    public AnonymousClass4FS A04;
    public C183538qC A05;
    public final C89654ea A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneNumberPrivacyInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        this.A06 = C111095hX.A05(context);
        C89364cO.A01(context, this, R.string.f11nameremoved);
        setIcon(R.drawable.ic_pn_sharing_on_24);
        C18310x6.A15(this);
    }

    public final void A08(C27991fJ r4, C27991fJ r5) {
        C162457s7.A0J(r4, 0);
        if (getChatsCache$chat_consumerBeta().A0N(r4)) {
            setVisibility(0);
            boolean A0D = getGroupParticipantsManager$chat_consumerBeta().A0D(r4);
            Context context = getContext();
            int i = R.string.f11nameremoved;
            if (A0D) {
                i = R.string.f11nameremoved;
            }
            String string = context.getString(i);
            C162457s7.A0H(string);
            setDescription((CharSequence) string);
            int i2 = 22;
            if (getGroupParticipantsManager$chat_consumerBeta().A0D(r4)) {
                i2 = 23;
            }
            setOnClickListener(new AnonymousClass547(this, r4, r5, i2));
        }
    }

    public final void setChatsCache$chat_consumerBeta(C56982ss r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setDependencyBridgeRegistryLazy$chat_consumerBeta(C183538qC r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setGroupParticipantsManager$chat_consumerBeta(C56892sj r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setMeManager$chat_consumerBeta(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setPnhDailyActionLoggingStore$chat_consumerBeta(AnonymousClass2W8 r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers$chat_consumerBeta(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final C89654ea getActivity() {
        return this.A06;
    }

    public final C56982ss getChatsCache$chat_consumerBeta() {
        C56982ss r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public final C183538qC getDependencyBridgeRegistryLazy$chat_consumerBeta() {
        C183538qC r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("dependencyBridgeRegistryLazy");
    }

    public final C56892sj getGroupParticipantsManager$chat_consumerBeta() {
        C56892sj r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupParticipantsManager");
    }

    public final C56972sr getMeManager$chat_consumerBeta() {
        C56972sr r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final AnonymousClass2W8 getPnhDailyActionLoggingStore$chat_consumerBeta() {
        AnonymousClass2W8 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("pnhDailyActionLoggingStore");
    }

    public final AnonymousClass4FS getWaWorkers$chat_consumerBeta() {
        AnonymousClass4FS r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }
}
