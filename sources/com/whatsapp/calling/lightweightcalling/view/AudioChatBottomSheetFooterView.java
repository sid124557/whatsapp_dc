package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass5UY;
import X.AnonymousClass66R;
import X.C154517dI;
import X.C162457s7;
import X.C174688Vm;
import X.C174698Vn;
import X.C174708Vo;
import X.C174718Vp;
import X.C174728Vq;
import X.C175078Wz;
import X.C179158ih;
import X.C378924l;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

public final class AudioChatBottomSheetFooterView extends ConstraintLayout {
    public C179158ih A00;
    public final AnonymousClass66R A01;
    public final AnonymousClass66R A02;
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04;
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        this.A05 = C154517dI.A01(new C174718Vp(this));
        this.A04 = C154517dI.A01(new C174708Vo(this));
        this.A01 = C154517dI.A01(new C174688Vm(this));
        this.A03 = C154517dI.A01(new C175078Wz(context, this));
        this.A02 = C154517dI.A01(new C174698Vn(this));
        this.A06 = C154517dI.A01(new C174728Vq(this));
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    private final AnonymousClass5UY getBluetoothButtonStub() {
        return (AnonymousClass5UY) this.A01.getValue();
    }

    private final AnonymousClass5UY getJoinButtonStub() {
        return (AnonymousClass5UY) this.A02.getValue();
    }

    private final AnonymousClass5UY getLeaveButtonStub() {
        return (AnonymousClass5UY) this.A03.getValue();
    }

    private final AnonymousClass5UY getMuteButtonStub() {
        return (AnonymousClass5UY) this.A04.getValue();
    }

    private final AnonymousClass5UY getSpeakerButtonStub() {
        return (AnonymousClass5UY) this.A05.getValue();
    }

    private final AnonymousClass5UY getStartButtonStub() {
        return (AnonymousClass5UY) this.A06.getValue();
    }

    public final C179158ih getListener() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r0 != false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.util.Collection r11) {
        /*
            r10 = this;
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r11.iterator()
            r8 = 0
        L_0x0009:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r4 = r9.next()
            X.7Vt r4 = (X.C151657Vt) r4
            boolean r0 = r4 instanceof X.C91354jS
            r3 = 0
            if (r0 == 0) goto L_0x0077
            X.5UY r5 = r10.getLeaveButtonStub()
        L_0x001e:
            r7 = 0
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r0 = r4.A01
            r6 = 0
            if (r0 == 0) goto L_0x0071
            android.view.View r5 = X.AnonymousClass5UY.A00(r5, r3)
            boolean r0 = r4.A00
            r5.setSelected(r0)
            if (r1 == 0) goto L_0x003a
            boolean r0 = r5 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r0 == 0) goto L_0x003a
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
        L_0x003a:
            android.content.Context r1 = r10.getContext()
            int r0 = r4.A00()
            java.lang.String r1 = r1.getString(r0)
            java.lang.Integer r0 = r4.A01()
            if (r0 == 0) goto L_0x0054
            int r0 = r0.intValue()
            java.lang.String r6 = X.C86624Kv.A0b(r10, r0)
        L_0x0054:
            X.C86654Ky.A1A(r5, r1, r6, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r5, r0)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r8 != 0) goto L_0x006c
            r8 = 0
            if (r0 == 0) goto L_0x006d
        L_0x006c:
            r8 = 1
        L_0x006d:
            r2.add(r1)
            goto L_0x0009
        L_0x0071:
            r0 = 8
            r5.A06(r0)
            goto L_0x0009
        L_0x0077:
            boolean r0 = r4 instanceof X.C91384jV
            if (r0 == 0) goto L_0x0080
            X.5UY r5 = r10.getMuteButtonStub()
            goto L_0x001e
        L_0x0080:
            boolean r0 = r4 instanceof X.C91344jR
            if (r0 == 0) goto L_0x0089
            X.5UY r5 = r10.getSpeakerButtonStub()
            goto L_0x001e
        L_0x0089:
            boolean r0 = r4 instanceof X.C91374jU
            if (r0 == 0) goto L_0x0092
            X.5UY r5 = r10.getBluetoothButtonStub()
            goto L_0x001e
        L_0x0092:
            boolean r0 = r4 instanceof X.C91394jW
            r7 = 1
            if (r0 == 0) goto L_0x00a1
            X.5UY r5 = r10.getJoinButtonStub()
            r0 = r4
            X.4jW r0 = (X.C91394jW) r0
            int r1 = r0.A02
            goto L_0x0020
        L_0x00a1:
            boolean r0 = r4 instanceof X.C91364jT
            if (r0 == 0) goto L_0x00ab
            X.5UY r5 = r10.getStartButtonStub()
            goto L_0x001f
        L_0x00ab:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00b0:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131168280(0x7f070c18, float:1.7950857E38)
            if (r8 == 0) goto L_0x00bc
            r0 = 2131168275(0x7f070c13, float:1.7950847E38)
        L_0x00bc:
            int r0 = r1.getDimensionPixelSize(r0)
            int r5 = r0 / 2
            java.util.Iterator r4 = r2.iterator()
        L_0x00c6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e5
            android.view.View r3 = X.C86654Ky.A0H(r4)
            boolean r0 = r3 instanceof com.whatsapp.WaImageButton
            if (r0 == 0) goto L_0x00c6
            X.7k9 r0 = X.C106895aL.A00(r3)
            int r2 = r0.A03
            int r1 = r0.A00
            X.7k9 r0 = new X.7k9
            r0.<init>(r5, r2, r5, r1)
            X.C106895aL.A01(r3, r0)
            goto L_0x00c6
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView.A05(java.util.Collection):void");
    }

    public final void setListener(C179158ih r1) {
        this.A00 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
