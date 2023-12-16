package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.views.VoipReturnToCallBanner;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4Rs  reason: invalid class name */
public abstract class AnonymousClass4Rs extends RelativeLayout implements C185668u3 {
    public AnonymousClass49P A00;
    public AnonymousClass5TW A01;
    public C1225264s A02;
    public C64773Ex A03;
    public C29421in A04;
    public AnonymousClass5ZU A05;
    public C620633i A06;
    public C620733j A07;
    public C56762sW A08;
    public C56322rn A09;
    public AnonymousClass1VX A0A;
    public C66493Lq A0B;
    public C95814uZ A0C;
    public C95814uZ A0D;
    public C56572sD A0E;
    public AnonymousClass4FS A0F;
    public C97094xc A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N = false;
    public final C56602sG A0O = new C189088zy(this, 3);
    public final C185958uW A0P = new C1237769s(this, 2);
    public final Runnable A0Q = C117695sL.A00(this, 43);

    public void A01() {
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        if (voipReturnToCallBanner.getContext() == null) {
            Log.w("voip/VoipReturnToCallBanner no context when call start");
            return;
        }
        WaImageView waImageView = voipReturnToCallBanner.A04;
        waImageView.setVisibility(0);
        boolean z = voipReturnToCallBanner.A0K;
        int i = R.drawable.ic_groupcall_voice;
        if (z) {
            i = R.drawable.ic_groupcall_video;
        }
        waImageView.setImageResource(i);
        Context context = voipReturnToCallBanner.getContext();
        boolean z2 = voipReturnToCallBanner.A0K;
        int i2 = R.string.f11nameremoved;
        if (z2) {
            i2 = R.string.f11nameremoved;
        }
        C18300x5.A13(context, waImageView, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r4 == null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r5 = this;
            r3 = r5
            com.whatsapp.calling.views.VoipReturnToCallBanner r3 = (com.whatsapp.calling.views.VoipReturnToCallBanner) r3
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "voip/VoipReturnToCallBanner no context when call start"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x000f:
            X.4uZ r1 = r3.A0C
            if (r1 == 0) goto L_0x0047
            X.4uZ r0 = r3.A0D
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
        L_0x001b:
            android.content.Context r1 = r3.getContext()
            r0 = 2131894309(0x7f122025, float:1.942342E38)
            java.lang.String r4 = r1.getString(r0)
            android.content.Context r2 = r3.getContext()
            boolean r1 = r3.A0K
            r0 = 2131886561(0x7f1201e1, float:1.9407704E38)
            if (r1 == 0) goto L_0x0034
            r0 = 2131886560(0x7f1201e0, float:1.9407702E38)
        L_0x0034:
            java.lang.String r2 = r2.getString(r0)
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 2
            X.AnonymousClass0YY.A06(r1, r0)
        L_0x003e:
            android.widget.TextView r0 = r3.A03
            r0.setText(r4)
            r0.setContentDescription(r2)
            return
        L_0x0047:
            X.4uZ r0 = r3.A0C
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x005f
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x001b
            java.lang.String r4 = r3.getTitleForContact()
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 1
        L_0x005a:
            X.AnonymousClass0YY.A06(r1, r0)
            r2 = r4
            goto L_0x003e
        L_0x005f:
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x0070
            java.lang.String r4 = r3.getTitleForGroup()
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 1
            X.AnonymousClass0YY.A06(r1, r0)
            r2 = r4
            if (r4 != 0) goto L_0x003e
        L_0x0070:
            android.content.Context r2 = r3.getContext()
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x0083
            r1 = 2131895368(0x7f122448, float:1.9425567E38)
        L_0x007b:
            java.lang.String r4 = r2.getString(r1)
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 2
            goto L_0x005a
        L_0x0083:
            boolean r0 = r3.A0K
            r1 = 2131887232(0x7f120480, float:1.9409065E38)
            if (r0 == 0) goto L_0x007b
            r1 = 2131887231(0x7f12047f, float:1.9409063E38)
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Rs.A02():void");
    }

    public void A03() {
        C95814uZ A0X;
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            if (callInfo.isAudioChat()) {
                voipReturnToCallBanner.setVisibility(8);
                return;
            }
            if (callInfo.isGroupCall) {
                A0X = callInfo.groupJid;
            } else {
                A0X = C86644Kx.A0X(callInfo);
            }
            voipReturnToCallBanner.A0C = A0X;
            voipReturnToCallBanner.A0K = callInfo.videoEnabled;
            voipReturnToCallBanner.A02();
            voipReturnToCallBanner.A01();
        }
        voipReturnToCallBanner.A02.setVisibility(8);
    }

    public abstract void setCallNotificationTimer(long j);

    public void setTimerAccessibility(View view) {
        C86614Ku.A1H(view, this, 3);
    }

    public static /* synthetic */ void A00(AnonymousClass4Rs r3, Collection collection) {
        C95814uZ r0 = r3.A0C;
        if (r0 != null && (r0 instanceof GroupJid)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C95814uZ A0b = C86604Kt.A0b(it);
                if (A0b != null && A0b.equals(r3.A0C)) {
                    r3.A02();
                }
            }
        }
    }

    public void A04(AnonymousClass3ZF r5, boolean z) {
        if (r5.A0H == 2) {
            setVisibility(8);
            return;
        }
        boolean z2 = true;
        this.A0J = AnonymousClass000.A1T(r5.A08().size());
        if (r5.A08().size() <= 2) {
            z2 = false;
        }
        this.A0I = z2;
        A03();
        if (z) {
            setVisibility(8);
            postDelayed(this.A0Q, 2000);
            return;
        }
        this.A0Q.run();
    }

    public String getTitleForContact() {
        AnonymousClass3ZH A072;
        C95814uZ r1 = this.A0C;
        if (r1 == null || (A072 = this.A03.A07(r1)) == null) {
            return null;
        }
        return this.A05.A0H(A072);
    }

    public String getTitleForGroup() {
        GroupJid groupJid;
        C95814uZ r5 = this.A0C;
        if (r5 != null) {
            groupJid = (GroupJid) r5;
        } else {
            groupJid = null;
        }
        C64773Ex r4 = this.A03;
        AnonymousClass5ZU r3 = this.A05;
        AnonymousClass3ZH A012 = AnonymousClass36T.A01(r4, this.A0B, groupJid, this.A0E, false);
        if (A012 != null) {
            return C18300x5.A0h(r3, A012);
        }
        return null;
    }

    public void setBannerClickListener(Context context, View view) {
        C18320x8.A16(view, context, this, 28);
    }

    public void setShouldHideBanner(boolean z) {
        this.A0L = z;
        setVisibility(AnonymousClass001.A08(this.A01.A01() ? 1 : 0));
    }

    public void setShouldHideCallDuration(boolean z) {
        this.A0M = z;
        setVisibility(AnonymousClass001.A08(this.A01.A01() ? 1 : 0));
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
        this.A0N = z;
        A02();
    }

    public void setVisibility(int i) {
        C1225264s r1;
        removeCallbacks(this.A0Q);
        int visibility = getVisibility();
        if (this.A0L) {
            i = 8;
        }
        super.setVisibility(i);
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        int i2 = 8;
        voipReturnToCallBanner.A04.setVisibility(C86614Ku.A01(voipReturnToCallBanner.A0M ? 1 : 0));
        TextView textView = voipReturnToCallBanner.A02;
        if (!voipReturnToCallBanner.A0M && voipReturnToCallBanner.A0H) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (visibility != getVisibility() && (r1 = this.A02) != null) {
            r1.Bfa(getVisibility());
        }
    }

    public AnonymousClass4Rs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getBackgroundColorRes() {
        return AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public CallInfo getCallInfo() {
        return Voip.getCallInfo();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0G.A06(this.A0P);
        this.A04.A06(this.A0O);
        C1225264s r1 = this.A02;
        if (r1 != null) {
            r1.Bfa(getVisibility());
        }
        if (this.A0A.A0X(6989)) {
            this.A0F.BkP(C117695sL.A00(this, 42));
        }
        A03();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0H = false;
        this.A0G.A07(this.A0P);
        this.A04.A07(this.A0O);
    }

    public void setContainerChatJid(C95814uZ r1) {
        this.A0D = r1;
    }

    public void setVisibilityChangeListener(C1225264s r1) {
        this.A02 = r1;
    }
}
