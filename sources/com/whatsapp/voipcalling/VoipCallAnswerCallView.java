package com.whatsapp.voipcalling;

import X.AnonymousClass0x9;
import X.C06560Yg;
import X.C138486qS;
import X.C18300x5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class VoipCallAnswerCallView extends C138486qS {
    public View A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public boolean A09;

    public void A02(CallInfo callInfo, String str, boolean z) {
        Log.i("voip/VoipCallAnswerCallView/show");
        super.A02(callInfo, str, z);
        A03();
        setVisibility(0);
        setupCallAnswerBtns(z);
    }

    public final void A03() {
        this.A03.clearAnimation();
        this.A04.clearAnimation();
        this.A05.clearAnimation();
        this.A06.clearAnimation();
        this.A07.clearAnimation();
        this.A08.clearAnimation();
    }

    public VoipCallAnswerCallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A03 = AnonymousClass0x9.A0E(this, R.id.accept_incoming_call_view);
        this.A06 = C18300x5.A0G(this, R.id.accept_incoming_call_hint);
        this.A04 = AnonymousClass0x9.A0E(this, R.id.decline_incoming_call_view);
        this.A07 = C18300x5.A0G(this, R.id.decline_incoming_call_hint);
        this.A05 = AnonymousClass0x9.A0E(this, R.id.reply_incoming_call_view);
        this.A08 = C18300x5.A0G(this, R.id.decline_with_message_hint);
        this.A00 = C06560Yg.A02(this, R.id.accept_call_swipe_up_hint_view);
        this.A01 = C06560Yg.A02(this, R.id.decline_call_swipe_up_hint_view);
        this.A02 = C06560Yg.A02(this, R.id.reply_call_swipe_up_hint_view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupCallAnswerBtns(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.getVisibility()
            if (r0 != 0) goto L_0x0113
            r0 = 2131427364(0x7f0b0024, float:1.8476342E38)
            android.view.View r10 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r10 = (com.whatsapp.calling.views.CallResponseLayout) r10
            r6 = 0
            X.93H r0 = new X.93H
            r0.<init>(r11, r6)
            r10.A02 = r0
            r0 = 1
            r10.A06 = r0
            r0 = 2131429318(0x7f0b07c6, float:1.8480305E38)
            android.view.View r9 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r9 = (com.whatsapp.calling.views.CallResponseLayout) r9
            r2 = 1
            X.93H r0 = new X.93H
            r0.<init>(r11, r2)
            r9.A02 = r0
            r0 = 2131433000(0x7f0b1628, float:1.8487773E38)
            android.view.View r8 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r8 = (com.whatsapp.calling.views.CallResponseLayout) r8
            boolean r1 = r11.A05
            r0 = 0
            if (r1 == 0) goto L_0x003b
            r0 = 8
        L_0x003b:
            r8.setVisibility(r0)
            r1 = 2
            X.93H r0 = new X.93H
            r0.<init>(r11, r1)
            r8.A02 = r0
            r8.A07 = r2
            android.widget.ImageView r3 = r11.A03
            r10.A01 = r3
            android.widget.ImageView r7 = r11.A04
            r9.A01 = r7
            android.widget.ImageView r4 = r11.A05
            r8.A01 = r4
            android.view.View r5 = r11.A00
            r5.setVisibility(r6)
            r0 = r5
            com.whatsapp.components.AnimatingArrowsLayout r0 = (com.whatsapp.components.AnimatingArrowsLayout) r0
            android.animation.AnimatorSet r0 = r0.A03
            r0.start()
            android.view.View r2 = r11.A01
            r2.clearAnimation()
            r1 = 4
            r2.setVisibility(r1)
            android.view.View r0 = r11.A02
            r0.clearAnimation()
            r0.setVisibility(r1)
            r10.A00 = r5
            r9.A00 = r2
            r8.A00 = r0
            boolean r2 = r11.A04
            com.whatsapp.voipcalling.CallInfo r0 = r11.A02
            boolean r1 = r0.videoEnabled
            if (r2 == 0) goto L_0x012c
            r0 = 2131232504(0x7f0806f8, float:1.808112E38)
            if (r1 == 0) goto L_0x0088
            r0 = 2131232502(0x7f0806f6, float:1.8081115E38)
        L_0x0088:
            r3.setImageResource(r0)
        L_0x008b:
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0114
            r2 = 2131894190(0x7f121fae, float:1.9423178E38)
            r1 = 2131886107(0x7f12001b, float:1.9406784E38)
        L_0x0095:
            android.widget.TextView r5 = r11.A06
            r5.setText(r2)
            r5.setVisibility(r6)
            r3.setVisibility(r6)
            android.content.Context r0 = r11.getContext()
            X.C18300x5.A13(r0, r3, r1)
            r11.A03()
            android.view.animation.AnimationSet r0 = X.C107215at.A02(r3)
            r3.startAnimation(r0)
            boolean r1 = r11.A05
            r0 = 4
            if (r1 != 0) goto L_0x00b7
            r0 = 0
        L_0x00b7:
            r7.setVisibility(r6)
            android.widget.TextView r3 = r11.A07
            r3.setVisibility(r0)
            boolean r1 = r11.A05
            r0 = 2131232877(0x7f08086d, float:1.8081876E38)
            if (r1 == 0) goto L_0x00c9
            r0 = 2131232036(0x7f080524, float:1.808017E38)
        L_0x00c9:
            r7.setImageResource(r0)
            boolean r0 = r11.A05
            r2 = 2131895261(0x7f1223dd, float:1.942535E38)
            r1 = 2131888456(0x7f120948, float:1.9411548E38)
            if (r0 == 0) goto L_0x00dc
            r2 = 2131894191(0x7f121faf, float:1.942318E38)
            r1 = 2131888459(0x7f12094b, float:1.9411554E38)
        L_0x00dc:
            android.content.Context r0 = r11.getContext()
            X.C18300x5.A13(r0, r7, r1)
            r3.setText(r2)
            r0 = 13
            X.C86654Ky.A19(r7, r11, r0)
            boolean r1 = r11.A05
            r0 = 0
            if (r1 == 0) goto L_0x00f2
            r0 = 8
        L_0x00f2:
            r4.setVisibility(r6)
            android.widget.TextView r1 = r11.A08
            r1.setVisibility(r0)
            r0 = 14
            X.C86654Ky.A19(r4, r11, r0)
            if (r12 == 0) goto L_0x0113
            r0 = 2131886099(0x7f120013, float:1.9406767E38)
            r5.setText(r0)
            r0 = 2131888457(0x7f120949, float:1.941155E38)
            r3.setText(r0)
            r0 = 2131893056(0x7f121b40, float:1.9420878E38)
            r1.setText(r0)
        L_0x0113:
            return
        L_0x0114:
            java.lang.String r1 = "com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN"
            java.lang.String r0 = r11.A03
            boolean r0 = r1.equals(r0)
            r2 = 2131894189(0x7f121fad, float:1.9423176E38)
            r1 = 2131886098(0x7f120012, float:1.9406765E38)
            if (r0 == 0) goto L_0x0095
            r2 = 2131894192(0x7f121fb0, float:1.9423182E38)
            r1 = 2131889000(0x7f120b68, float:1.9412651E38)
            goto L_0x0095
        L_0x012c:
            if (r1 == 0) goto L_0x008b
            r0 = 2131232026(0x7f08051a, float:1.808015E38)
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallAnswerCallView.setupCallAnswerBtns(boolean):void");
    }

    public VoipCallAnswerCallView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoipCallAnswerCallView(Context context) {
        this(context, (AttributeSet) null);
    }
}
