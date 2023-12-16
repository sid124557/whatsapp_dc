package com.whatsapp.calling.views;

import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass5UY;
import X.C06560Yg;
import X.C107215at;
import X.C116855qy;
import X.C18300x5;
import X.C187958y5;
import X.C56422rx;
import X.C620433g;
import X.C64333Db;
import X.C69263Wi;
import X.C86614Ku;
import X.C86624Kv;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

public class VoipCallFooter extends LinearLayout implements AnonymousClass4GJ {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View A02;
    public View A03;
    public ImageButton A04;
    public ImageButton A05;
    public ImageButton A06;
    public C69263Wi A07;
    public C620433g A08;
    public C56422rx A09;
    public AnonymousClass1VX A0A;
    public C187958y5 A0B;
    public AnonymousClass4FS A0C;
    public VoipCameraManager A0D;
    public C116855qy A0E;
    public boolean A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final ImageButton A0K;
    public final ImageButton A0L;
    public final ImageButton A0M;
    public final ImageButton A0N;
    public final ImageButton A0O;
    public final AnonymousClass5UY A0P;

    private void setMuteButtonEnabled(boolean z) {
        C107215at.A05(this.A0M, z);
    }

    public void A00() {
        this.A0N.setImageResource(R.drawable.ic_voip_speaker_control);
        ImageButton imageButton = this.A0O;
        imageButton.setImageResource(R.drawable.ic_voip_video_control);
        C18300x5.A13(getContext(), imageButton, R.string.f11nameremoved);
        A04(false);
    }

    public void A01() {
        this.A0N.setImageResource(R.drawable.ic_voip_switch_camera_control);
        ImageButton imageButton = this.A0O;
        imageButton.setImageResource(R.drawable.ic_voip_switch_to_voice_control);
        C18300x5.A13(getContext(), imageButton, R.string.f11nameremoved);
        A04(true);
    }

    public void A02(int i) {
        float f = (float) i;
        this.A0K.setRotation(f);
        this.A0N.setRotation(f);
        this.A0M.setRotation(f);
        this.A0O.setRotation(f);
        this.A0L.setRotation(f);
        ImageButton imageButton = this.A05;
        if (imageButton != null) {
            imageButton.setRotation(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r13 != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if (r15 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f2, code lost:
        if (r15 != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0139, code lost:
        if (r10.self.A06 == 1) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r10.videoEnabled != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(com.whatsapp.voipcalling.CallInfo r10, java.lang.String r11, int r12, boolean r13, boolean r14, boolean r15) {
        /*
            r9 = this;
            com.whatsapp.voipcalling.CallState r5 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r5 == r0) goto L_0x008d
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r5)
            if (r0 != 0) goto L_0x008d
            boolean r0 = r10.isGroupCall
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = r10.callLinkToken
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 == 0) goto L_0x001d
        L_0x0018:
            boolean r1 = r10.videoEnabled
            r0 = 1
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "capi"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0032
            X.2rx r0 = r9.A09
            boolean r0 = X.AnonymousClass36T.A08(r0, r10)
            if (r0 == 0) goto L_0x01c6
        L_0x0032:
            X.1VX r0 = r9.A0A
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x01c6
        L_0x003a:
            r6 = 1
        L_0x003b:
            android.view.View r1 = r9.A0J
            r2 = 8
            r0 = 0
            if (r6 == 0) goto L_0x0044
            r0 = 8
        L_0x0044:
            r1.setVisibility(r0)
            java.lang.String r0 = "capi"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01a3
            X.1VX r1 = r9.A0A
            r0 = 4067(0xfe3, float:5.699E-42)
            int r1 = r1.A0N(r0)
            r0 = 2
            if (r1 < r0) goto L_0x01a3
            android.view.View r0 = r9.A02
            r0.setVisibility(r3)
            r0 = 2131429456(0x7f0b0850, float:1.8480585E38)
            android.widget.ImageButton r0 = X.C86664Kz.A0t(r9, r0)
            r9.A04 = r0
            X.C107215at.A05(r0, r4)
            android.widget.ImageButton r1 = r9.A04
            android.view.View$OnClickListener r0 = r9.A00
            r1.setOnClickListener(r0)
        L_0x0072:
            if (r6 == 0) goto L_0x0078
            r0 = 1082130432(0x40800000, float:4.0)
            if (r13 == 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r9.setWeightSum(r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r5 != r0) goto L_0x008e
            android.widget.ImageButton r0 = r9.A0N
            X.C107215at.A05(r0, r3)
            android.widget.ImageButton r0 = r9.A0O
            X.C107215at.A05(r0, r3)
            r9.setMuteButtonEnabled(r3)
        L_0x008d:
            return
        L_0x008e:
            X.5Lb r6 = r10.self
            boolean r0 = r10.videoEnabled
            r7 = 3
            android.widget.ImageButton r1 = r9.A0N
            if (r0 == 0) goto L_0x017e
            if (r14 != 0) goto L_0x00ad
            int r8 = r6.A06
            r0 = 6
            if (r8 == r0) goto L_0x00ad
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r9.A0D
            int r0 = r0.getCameraCount(r3)
            if (r0 <= r4) goto L_0x00ad
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x00ad
            r0 = 1
            if (r15 == 0) goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            X.C107215at.A05(r1, r0)
            r1.setSelected(r3)
            android.widget.ImageButton r1 = r9.A0K
            boolean r0 = X.AnonymousClass000.A1U(r12, r7)
            r1.setSelected(r0)
            boolean r0 = r6.A0C
            r0 = r0 ^ 1
            X.C107215at.A05(r1, r0)
            android.widget.ImageButton r1 = r9.A0O
            int r7 = r6.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1U(r7, r0)
            r1.setSelected(r0)
        L_0x00d0:
            android.view.View r7 = r9.A0G
            int r0 = X.AnonymousClass001.A08(r13)
            r7.setVisibility(r0)
            if (r14 != 0) goto L_0x00f4
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r5 == r0) goto L_0x00e3
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 != r0) goto L_0x00f4
        L_0x00e3:
            boolean r0 = r10.isGroupCall
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x00f4
        L_0x00eb:
            boolean r0 = r10.isCallOnHold()
            if (r0 != 0) goto L_0x00f4
            r0 = 1
            if (r15 == 0) goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            X.C107215at.A05(r1, r0)
            r9.setMuteButtonEnabled(r4)
            android.widget.ImageButton r1 = r9.A0M
            boolean r0 = r6.A0F
            r1.setSelected(r0)
            boolean r0 = r10.videoEnabled
            r9.A04(r0)
            X.1VX r1 = r9.A0A
            X.8y5 r0 = r9.A0B
            boolean r1 = X.C107215at.A06(r1, r0, r10)
            X.5UY r0 = r9.A0P
            if (r1 == 0) goto L_0x017a
            r0.A06(r3)
            android.widget.ImageButton r0 = r9.A05
            if (r0 != 0) goto L_0x0123
            r0 = 2131433244(0x7f0b171c, float:1.8488268E38)
            android.widget.ImageButton r0 = X.C86664Kz.A0t(r9, r0)
            r9.A05 = r0
        L_0x0123:
            r0.setSelected(r15)
            android.widget.ImageButton r2 = r9.A05
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0178
            boolean r0 = r10.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x0178
            X.5Lb r0 = r10.self
            int r1 = r0.A06
            r0 = 1
            if (r1 != r4) goto L_0x0178
        L_0x013b:
            X.C107215at.A05(r2, r0)
            android.widget.ImageButton r1 = r9.A05
            android.view.View$OnClickListener r0 = r9.A01
            r1.setOnClickListener(r0)
        L_0x0145:
            android.widget.ImageButton r0 = r9.A05
            if (r0 == 0) goto L_0x008d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x008d
            android.content.Context r4 = r9.getContext()
            android.widget.ImageButton r0 = r9.A05
            boolean r1 = r0.isSelected()
            android.widget.ImageButton r3 = r9.A05
            r0 = 2131893336(0x7f121c58, float:1.9421446E38)
            if (r1 == 0) goto L_0x0163
            r0 = 2131893338(0x7f121c5a, float:1.942145E38)
        L_0x0163:
            java.lang.String r2 = r4.getString(r0)
            r0 = 2131893335(0x7f121c57, float:1.9421444E38)
            if (r1 == 0) goto L_0x016f
            r0 = 2131893337(0x7f121c59, float:1.9421448E38)
        L_0x016f:
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            X.C86654Ky.A1A(r3, r2, r1, r0)
            return
        L_0x0178:
            r0 = 0
            goto L_0x013b
        L_0x017a:
            r0.A06(r2)
            goto L_0x0145
        L_0x017e:
            boolean r0 = r6.A0C
            r0 = r0 ^ 1
            X.C107215at.A05(r1, r0)
            boolean r0 = X.AnonymousClass000.A1U(r12, r4)
            r1.setSelected(r0)
            android.widget.ImageButton r1 = r9.A0K
            boolean r0 = X.AnonymousClass000.A1U(r12, r7)
            r1.setSelected(r0)
            boolean r0 = r6.A0C
            r0 = r0 ^ 1
            X.C107215at.A05(r1, r0)
            android.widget.ImageButton r1 = r9.A0O
            r1.setSelected(r3)
            goto L_0x00d0
        L_0x01a3:
            X.2rx r0 = r9.A09
            boolean r0 = X.AnonymousClass36T.A08(r0, r10)
            if (r0 == 0) goto L_0x01bf
            X.1VX r1 = r9.A0A
            r0 = 4067(0xfe3, float:5.699E-42)
            int r1 = r1.A0N(r0)
            r0 = 2
            if (r1 < r0) goto L_0x01bf
            X.4FS r1 = r9.A0C
            r0 = 45
            X.C86644Kx.A1R(r1, r9, r10, r0)
            goto L_0x0072
        L_0x01bf:
            android.view.View r0 = r9.A02
            r0.setVisibility(r2)
            goto L_0x0072
        L_0x01c6:
            r6 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.VoipCallFooter.A03(com.whatsapp.voipcalling.CallInfo, java.lang.String, int, boolean, boolean, boolean):void");
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0E;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0E = r0;
        }
        return r0.generatedComponent();
    }

    public void setBluetoothButtonClickListener(View.OnClickListener onClickListener) {
        this.A0K.setOnClickListener(onClickListener);
    }

    public void setDialpadBtnSelected(boolean z) {
        this.A04.setSelected(z);
    }

    public void setEndCallButtonClickListener(View.OnClickListener onClickListener) {
        this.A0L.setOnClickListener(onClickListener);
    }

    public void setMuteButtonClickListener(View.OnClickListener onClickListener) {
        this.A0M.setOnClickListener(onClickListener);
    }

    public void setSpeakerButtonClickListener(View.OnClickListener onClickListener) {
        this.A0N.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonClickListener(View.OnClickListener onClickListener) {
        this.A0O.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonSelected(boolean z) {
        this.A0O.setSelected(z);
    }

    public void setViewPeopleBtnOnClickListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.A06;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public VoipCallFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0F) {
            this.A0F = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A0A = C64333Db.A4B(A002);
            this.A07 = C64333Db.A04(A002);
            this.A0C = C64333Db.A8y(A002);
            this.A0B = C86614Ku.A0o(A002);
            this.A08 = C86624Kv.A0K(A002);
            this.A09 = C86614Ku.A0T(A002);
            this.A0D = (VoipCameraManager) A002.Aa0.get();
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A0N = (ImageButton) findViewById(R.id.speaker_btn);
        this.A0I = findViewById(R.id.speaker_btn_layout);
        this.A0K = (ImageButton) findViewById(R.id.bluetooth_btn);
        this.A0G = findViewById(R.id.bluetooth_btn_layout);
        this.A0O = (ImageButton) findViewById(R.id.toggle_video_btn);
        this.A0J = findViewById(R.id.toggle_video_btn_layout);
        this.A0M = (ImageButton) findViewById(R.id.mute_btn);
        this.A0L = C86664Kz.A0t(this, R.id.footer_end_call_btn);
        this.A0H = C06560Yg.A02(this, R.id.end_call_btn_layout);
        this.A0P = AnonymousClass0x2.A0M(this, R.id.screen_share_btn_stub);
        this.A02 = findViewById(R.id.dialpad_btn_stub);
        this.A04 = (ImageButton) findViewById(R.id.dialpad_btn);
        this.A03 = findViewById(R.id.view_people_btn_layout);
        this.A06 = (ImageButton) findViewById(R.id.view_people_btn);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r6.A0O.isSelected() != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(boolean r7) {
        /*
            r6 = this;
            android.content.Context r5 = r6.getContext()
            android.widget.ImageButton r2 = r6.A0N
            if (r7 != 0) goto L_0x0091
            boolean r1 = r2.isSelected()
            r0 = 2131895358(0x7f12243e, float:1.9425547E38)
            if (r1 == 0) goto L_0x0014
            r0 = 2131895357(0x7f12243d, float:1.9425545E38)
        L_0x0014:
            java.lang.String r1 = r5.getString(r0)
            r0 = 0
            if (r7 == 0) goto L_0x0022
            r0 = 2131895352(0x7f122438, float:1.9425535E38)
            java.lang.String r0 = r5.getString(r0)
        L_0x0022:
            r4 = 0
            X.C86654Ky.A1A(r2, r1, r0, r4)
            android.widget.ImageButton r2 = r6.A0K
            boolean r1 = r2.isSelected()
            r0 = 2131895303(0x7f122407, float:1.9425435E38)
            if (r1 == 0) goto L_0x0034
            r0 = 2131895302(0x7f122406, float:1.9425433E38)
        L_0x0034:
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131895318(0x7f122416, float:1.9425466E38)
            java.lang.String r0 = r5.getString(r0)
            X.C86654Ky.A1A(r2, r1, r0, r4)
            if (r7 == 0) goto L_0x004d
            android.widget.ImageButton r0 = r6.A0O
            boolean r0 = r0.isSelected()
            r3 = 1
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            android.widget.ImageButton r2 = r6.A0O
            r0 = 2131895356(0x7f12243c, float:1.9425543E38)
            if (r3 == 0) goto L_0x0058
            r0 = 2131895354(0x7f12243a, float:1.9425539E38)
        L_0x0058:
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131895355(0x7f12243b, float:1.942554E38)
            if (r3 == 0) goto L_0x0064
            r0 = 2131895353(0x7f122439, float:1.9425537E38)
        L_0x0064:
            java.lang.String r0 = r5.getString(r0)
            X.C86654Ky.A1A(r2, r1, r0, r4)
            android.widget.ImageButton r3 = r6.A0M
            boolean r1 = r3.isSelected()
            r0 = 2131895342(0x7f12242e, float:1.9425514E38)
            if (r1 == 0) goto L_0x0079
            r0 = 2131895361(0x7f122441, float:1.9425553E38)
        L_0x0079:
            java.lang.String r2 = r5.getString(r0)
            boolean r1 = r3.isSelected()
            r0 = 2131895341(0x7f12242d, float:1.9425512E38)
            if (r1 == 0) goto L_0x0089
            r0 = 2131895360(0x7f122440, float:1.942555E38)
        L_0x0089:
            java.lang.String r0 = r5.getString(r0)
            X.C86654Ky.A1A(r3, r2, r0, r4)
            return
        L_0x0091:
            r0 = 2131895352(0x7f122438, float:1.9425535E38)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.VoipCallFooter.A04(boolean):void");
    }

    public void setDialpadBtnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public void setScreenShareBtnClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public VoipCallFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoipCallFooter(Context context) {
        this(context, (AttributeSet) null);
    }
}
