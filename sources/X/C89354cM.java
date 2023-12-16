package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

/* renamed from: X.4cM  reason: invalid class name and case insensitive filesystem */
public final class C89354cM extends ListItemWithLeftIcon {
    public C621033m A00;
    public C1224764n A01;
    public C103935Oz A02;
    public AnonymousClass4FI A03;
    public C28891hw A04;
    public C95084sb A05;
    public C27991fJ A06;
    public C50452iC A07;
    public AnonymousClass4FS A08;
    public boolean A09;
    public final CompoundButton.OnCheckedChangeListener A0A = new AnonymousClass693(this, 3);
    public final C89654ea A0B;

    public C89354cM(Context context) {
        super(context, (AttributeSet) null);
        A03();
        this.A0B = C111095hX.A05(context);
        setIcon(R.drawable.ic_settings_notification);
        C89364cO.A01(context, this, R.string.f11nameremoved);
        C18310x6.A15(this);
    }

    public final void setConversationObservers$community_consumerBeta(C28891hw r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setMuteNotificationsInfoViewUpdateHelperFactory$community_consumerBeta(C1224764n r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setUserActions$community_consumerBeta(C621033m r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setUserMuteActions$community_consumerBeta(C50452iC r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setWaWorkers$community_consumerBeta(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final C89654ea getActivity() {
        return this.A0B;
    }

    public final C28891hw getConversationObservers$community_consumerBeta() {
        C28891hw r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("conversationObservers");
    }

    public final C1224764n getMuteNotificationsInfoViewUpdateHelperFactory$community_consumerBeta() {
        C1224764n r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("muteNotificationsInfoViewUpdateHelperFactory");
    }

    public final C621033m getUserActions$community_consumerBeta() {
        C621033m r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("userActions");
    }

    public final C50452iC getUserMuteActions$community_consumerBeta() {
        C50452iC r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("userMuteActions");
    }

    public final AnonymousClass4FS getWaWorkers$community_consumerBeta() {
        AnonymousClass4FS r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C28891hw conversationObservers$community_consumerBeta = getConversationObservers$community_consumerBeta();
        AnonymousClass4FI r0 = this.A03;
        if (r0 == null) {
            throw C18270x1.A0S("conversationObserver");
        }
        conversationObservers$community_consumerBeta.A07(r0);
    }
}
