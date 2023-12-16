package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.chatinfo.EphemeralMessagesInfoView;

/* renamed from: X.4k3  reason: invalid class name and case insensitive filesystem */
public final class C91474k3 extends EphemeralMessagesInfoView {
    public C69263Wi A00;
    public C64773Ex A01;
    public AnonymousClass48D A02;
    public AnonymousClass10x A03;
    public AnonymousClass4FS A04;
    public boolean A05;
    public final C89654ea A06;

    public C91474k3(Context context) {
        super(context, (AttributeSet) null);
        A03();
        this.A06 = C111095hX.A05(context);
        C18310x6.A15(this);
    }

    public final void setContactManager$community_consumerBeta(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setGlobalUI$community_consumerBeta(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setParticipantsViewModelFactory$community_consumerBeta(AnonymousClass48D r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setWaWorkers$community_consumerBeta(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final C89654ea getActivity() {
        return this.A06;
    }

    public final C64773Ex getContactManager$community_consumerBeta() {
        C64773Ex r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final C69263Wi getGlobalUI$community_consumerBeta() {
        C69263Wi r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final AnonymousClass48D getParticipantsViewModelFactory$community_consumerBeta() {
        AnonymousClass48D r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("participantsViewModelFactory");
    }

    public final AnonymousClass4FS getWaWorkers$community_consumerBeta() {
        AnonymousClass4FS r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }
}
