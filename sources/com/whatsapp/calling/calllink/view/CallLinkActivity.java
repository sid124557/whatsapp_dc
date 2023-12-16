package com.whatsapp.calling.calllink.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0XV;
import X.AnonymousClass0x9;
import X.AnonymousClass30V;
import X.AnonymousClass4SG;
import X.AnonymousClass5TW;
import X.AnonymousClass5Z0;
import X.AnonymousClass64I;
import X.AnonymousClass69O;
import X.AnonymousClass6C6;
import X.C005205m;
import X.C106645Zu;
import X.C107305b5;
import X.C107695bk;
import X.C112515jr;
import X.C1230066r;
import X.C131696e2;
import X.C131706e3;
import X.C131716e4;
import X.C131726e5;
import X.C166307yT;
import X.C166317yU;
import X.C626936e;
import X.C64333Db;
import X.C86604Kt;
import X.C86644Kx;
import X.C86664Kz;
import X.C89144bm;
import X.C95814uZ;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.calling.views.VoipReturnToCallBanner;

public class CallLinkActivity extends C89144bm implements AnonymousClass64I {
    public ViewGroup A00;
    public C131696e2 A01;
    public C131726e5 A02;
    public C131716e4 A03;
    public C131706e3 A04;
    public WaImageView A05;
    public CallLinkViewModel A06;
    public C1230066r A07;
    public C112515jr A08;
    public AnonymousClass5Z0 A09;
    public VoipReturnToCallBanner A0A;
    public AnonymousClass5TW A0B;
    public AnonymousClass30V A0C;
    public boolean A0D;

    public void Bbh(int i, int i2) {
        if (i == 1) {
            CallLinkViewModel callLinkViewModel = this.A06;
            if (i2 != (!callLinkViewModel.A0E())) {
                callLinkViewModel.A0D(AnonymousClass000.A1T(i2));
            }
        }
    }

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A07 = C86644Kx.A0Q(A2Y);
            this.A0B = (AnonymousClass5TW) A2Y.ASQ.get();
            this.A08 = A2Y.Ai5();
            this.A09 = r1.AJu();
            this.A0C = C86604Kt.A0f(A2Y);
        }
    }

    public void A66() {
        this.A0C.A03((C95814uZ) null, 15);
        super.A66();
    }

    public final void A7D(C166317yU r5) {
        boolean z = false;
        C626936e.A0D(AnonymousClass000.A1W(this.A03.A02), "Share text cannot be null");
        if (this.A03.A01 != null) {
            z = true;
        }
        C626936e.A0D(z, "Email subject cannot be null");
        if (Build.VERSION.SDK_INT < 22) {
            this.A09.A01.BhD(C107305b5.A02((String) null, 2, 1, r5.A06));
        }
        boolean z2 = r5.A06;
        C131716e4 r0 = this.A03;
        startActivity(C107305b5.A00(this, r0.A02, r0.A01, 1, z2));
    }

    public CallLinkActivity(int i) {
        this.A0D = false;
        C86604Kt.A1K(this, 28);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        this.A00 = C86664Kz.A0k(this, R.id.link_btn);
        this.A05 = (WaImageView) C005205m.A00(this, R.id.link_icon);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A06 = (CallLinkViewModel) AnonymousClass0x9.A0H(this).A01(CallLinkViewModel.class);
        C131726e5 r1 = new C131726e5();
        this.A02 = r1;
        r1.A00 = A75();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(this.A02.A00);
        A0U.setMargins(A0U.leftMargin, A0U.topMargin, A0U.rightMargin, dimensionPixelSize2);
        this.A02.A00.setLayoutParams(A0U);
        this.A02 = this.A02;
        A79();
        this.A04 = A78();
        this.A01 = A76();
        this.A03 = A77();
        AnonymousClass6C6.A01(this, this.A06.A02.A03("saved_state_link"), 63);
        C86604Kt.A1M(this, this.A06.A00, 147);
        CallLinkViewModel callLinkViewModel = this.A06;
        AnonymousClass0XV r5 = callLinkViewModel.A02;
        boolean A0E = callLinkViewModel.A0E();
        int i = R.drawable.ic_btn_call_audio;
        int i2 = R.string.f11nameremoved;
        if (A0E) {
            i = R.drawable.ic_btn_call_video;
            i2 = R.string.f11nameremoved;
        }
        AnonymousClass6C6.A01(this, r5.A02(new C166307yT(i, i2, callLinkViewModel.A0E() ^ true ? 1 : 0), "saved_state_link_type"), 64);
        C86604Kt.A1M(this, this.A06.A01, 146);
        VoipReturnToCallBanner voipReturnToCallBanner = new VoipReturnToCallBanner(this, (AttributeSet) null);
        voipReturnToCallBanner.A0D = null;
        this.A0A = voipReturnToCallBanner;
        ViewGroup A0m = C86664Kz.A0m(this, R.id.call_notification_holder);
        if (A0m != null) {
            A0m.addView(this.A0A);
        }
        this.A0A.A02 = new AnonymousClass69O(this, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01.setOnClickListener((View.OnClickListener) null);
        this.A01.setOnLongClickListener((View.OnLongClickListener) null);
    }

    public void onResume() {
        super.onResume();
        if (this.A0B.A01() || this.A0B.A02()) {
            C106645Zu.A00(this.A08, "show_voip_activity");
        }
    }

    public CallLinkActivity() {
        this(0);
    }
}
