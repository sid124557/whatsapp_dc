package com.whatsapp.companiondevice;

import X.AnonymousClass2QC;
import X.AnonymousClass33G;
import X.C111095hX;
import X.C18300x5;
import X.C19340zH;
import X.C29041iB;
import X.C55802qw;
import X.C56612sH;
import X.C620633i;
import X.C66433Lk;
import X.C69263Wi;
import X.C70343aL;
import X.C84134Bd;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class LinkedDevicesDetailDialogFragment extends Hilt_LinkedDevicesDetailDialogFragment implements C84134Bd {
    public DialogInterface.OnDismissListener A00;
    public View A01;
    public C111095hX A02;
    public C69263Wi A03;
    public LinkedDevicesSharedViewModel A04;
    public C620633i A05;
    public C56612sH A06;
    public AnonymousClass33G A07;
    public C29041iB A08;
    public C55802qw A09;
    public AnonymousClass2QC A0A;
    public C66433Lk A0B;
    public Boolean A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        if (r13 <= 3600000) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0111, code lost:
        if (r6 == false) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1U() {
        /*
            r26 = this;
            r5 = r26
            X.33G r1 = r5.A07
            if (r1 == 0) goto L_0x01b3
            X.1iB r0 = r5.A08
            com.whatsapp.jid.DeviceJid r1 = r1.A07
            java.util.Set r0 = r0.A0R
            boolean r21 = r0.contains(r1)
            X.33G r1 = r5.A07
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x019e
            r1 = 2131890440(0x7f121108, float:1.9415572E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r7 = r0.getString(r1)
        L_0x0023:
            X.33G r2 = r5.A07
            X.03q r1 = r5.A0Q()
            X.1VX r0 = r5.A02
            java.lang.String r10 = X.AnonymousClass33G.A01(r1, r2, r0)
            X.33G r1 = r5.A07
            int r9 = X.C57112t6.A00(r1)
            java.lang.String r6 = r1.A03
            r0 = 8
            X.5eS r2 = new X.5eS
            r2.<init>(r5, r0)
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0191
            r4 = 0
        L_0x0045:
            X.33G r3 = r5.A07
            X.2sH r0 = r5.A06
            long r13 = r0.A0H()
            long r0 = r3.A01
            long r13 = r13 - r0
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x005f
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            r20 = 1
            if (r0 > 0) goto L_0x0061
        L_0x005f:
            r20 = 0
        L_0x0061:
            android.view.View r0 = r5.A01
            X.C626936e.A04(r0)
            android.view.View r1 = r5.A01
            r0 = 2131429435(0x7f0b083b, float:1.8480543E38)
            android.widget.ImageView r15 = X.AnonymousClass0x9.A0E(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131429440(0x7f0b0840, float:1.8480553E38)
            android.widget.TextView r14 = X.C18300x5.A0G(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131433889(0x7f0b19a1, float:1.8489576E38)
            android.view.View r13 = X.C06560Yg.A02(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131433906(0x7f0b19b2, float:1.848961E38)
            android.view.View r19 = X.C06560Yg.A02(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131433943(0x7f0b19d7, float:1.8489686E38)
            android.widget.TextView r18 = X.C18300x5.A0G(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131431098(0x7f0b0eba, float:1.8483916E38)
            android.view.View r12 = X.C06560Yg.A02(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131431101(0x7f0b0ebd, float:1.8483922E38)
            android.view.View r17 = X.C06560Yg.A02(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131431110(0x7f0b0ec6, float:1.848394E38)
            android.widget.TextView r11 = X.C18300x5.A0G(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131434133(0x7f0b1a95, float:1.8490071E38)
            android.view.View r1 = X.C06560Yg.A02(r1, r0)
            android.view.View r3 = r5.A01
            r0 = 2131431128(0x7f0b0ed8, float:1.8483976E38)
            android.widget.TextView r8 = X.C18300x5.A0G(r3, r0)
            android.view.View r3 = r5.A01
            r0 = 2131428801(0x7f0b05c1, float:1.8479257E38)
            android.view.View r16 = X.C06560Yg.A02(r3, r0)
            android.view.View r3 = r5.A01
            r0 = 2131431122(0x7f0b0ed2, float:1.8483964E38)
            com.whatsapp.TextEmojiLabel r3 = X.AnonymousClass0x7.A0K(r3, r0)
            r14.setText(r10)
            r15.setImageResource(r9)
            java.lang.Boolean r0 = r5.A0C
            r10 = 8
            r9 = 0
            if (r0 == 0) goto L_0x017a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x017a
            r13.setVisibility(r10)
        L_0x00e8:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0176
            r12.setVisibility(r9)
            r0 = 2131890438(0x7f121106, float:1.9415568E38)
            java.lang.String r0 = X.C18310x6.A0m(r5, r6, r0)
            r11.setText(r0)
            r6 = 2131233035(0x7f08090b, float:1.8082196E38)
            if (r21 == 0) goto L_0x0103
            r6 = 2131233034(0x7f08090a, float:1.8082194E38)
        L_0x0103:
            r0 = r17
            r0.setBackgroundResource(r6)
        L_0x0108:
            java.lang.Boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0113
            boolean r6 = r0.booleanValue()
            r0 = 0
            if (r6 != 0) goto L_0x0115
        L_0x0113:
            r0 = 8
        L_0x0115:
            r1.setVisibility(r0)
            r0 = 8
            if (r20 == 0) goto L_0x011d
            r0 = 0
        L_0x011d:
            r3.setVisibility(r0)
            if (r20 == 0) goto L_0x015f
            X.33G r0 = r5.A07
            if (r0 == 0) goto L_0x015f
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x015f
            android.content.Context r13 = r5.A0G()
            X.1VX r12 = r5.A02
            X.3Wi r11 = r5.A03
            X.5hX r7 = r5.A02
            X.33i r6 = r5.A05
            r14 = 2131890441(0x7f121109, float:1.9415574E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            java.lang.String r1 = "learn-more"
            java.lang.String r24 = X.AnonymousClass002.A0F(r13, r1, r0, r9, r14)
            X.3Lk r14 = r5.A0B
            java.lang.String r0 = "seeing-logout-is-pending"
            android.net.Uri r18 = X.C66433Lk.A00(r14, r0)
            r22 = r6
            r23 = r12
            r25 = r1
            r17 = r13
            r19 = r7
            r20 = r11
            r21 = r3
            X.C107635bd.A0E(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x015f:
            if (r4 == 0) goto L_0x0172
            r8.setVisibility(r9)
            r8.setText(r4)
            r8.setOnClickListener(r2)
        L_0x016a:
            r1 = 10
            r0 = r16
            X.C18310x6.A17(r0, r5, r1)
        L_0x0171:
            return
        L_0x0172:
            r8.setVisibility(r10)
            goto L_0x016a
        L_0x0176:
            r12.setVisibility(r10)
            goto L_0x0108
        L_0x017a:
            r13.setVisibility(r9)
            r0 = r18
            r0.setText(r7)
            r7 = 2131233035(0x7f08090b, float:1.8082196E38)
            if (r21 == 0) goto L_0x018a
            r7 = 2131233034(0x7f08090a, float:1.8082194E38)
        L_0x018a:
            r0 = r19
            r0.setBackgroundResource(r7)
            goto L_0x00e8
        L_0x0191:
            r1 = 2131890556(0x7f12117c, float:1.9415807E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r4 = r0.getString(r1)
            goto L_0x0045
        L_0x019e:
            X.33j r2 = r5.A01
            long r0 = r1.A00
            if (r21 == 0) goto L_0x01ad
            r0 = 2131890428(0x7f1210fc, float:1.9415548E38)
            java.lang.String r7 = r2.A0B(r0)
            goto L_0x0023
        L_0x01ad:
            java.lang.CharSequence r7 = X.C107565bW.A02(r2, r0)
            goto L_0x0023
        L_0x01b3:
            X.2QC r0 = r5.A0A
            if (r0 == 0) goto L_0x0171
            android.content.Context r0 = r5.A1D()
            X.C626936e.A06(r0)
            X.2QC r0 = r5.A0A
            int r1 = r0.A01
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r10 = r0.getString(r1)
            X.2QC r0 = r5.A0A
            int r9 = r0.A00
            X.33j r8 = r5.A01
            long r6 = r0.A02
            long r3 = X.AnonymousClass0x9.A05(r6)
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01fa
            r0 = 2131890428(0x7f1210fc, float:1.9415548E38)
            java.lang.String r7 = r8.A0B(r0)
        L_0x01e3:
            r21 = 1
            r6 = 0
            r0 = 9
            X.5eS r2 = new X.5eS
            r2.<init>(r5, r0)
            r1 = 2131894601(0x7f122149, float:1.9424011E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r4 = r0.getString(r1)
            goto L_0x005f
        L_0x01fa:
            java.lang.CharSequence r7 = X.C107565bW.A02(r8, r6)
            goto L_0x01e3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment.A1U():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void AwB(java.lang.Object r3) {
        /*
            r2 = this;
            java.util.Map r3 = (java.util.Map) r3
            X.33G r1 = r2.A07
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0027
            com.whatsapp.jid.DeviceJid r0 = r1.A07
            java.lang.Object r0 = r3.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0C = r0
            r2.A1U()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment.AwB(java.lang.Object):void");
    }

    public Dialog A1J(Bundle bundle) {
        this.A01 = LayoutInflater.from(A1D()).inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        this.A0C = null;
        C55802qw r4 = this.A09;
        r4.A03.execute(new C70343aL(r4, this, this.A03.A08, 16));
        A1U();
        C19340zH A0L = C18300x5.A0L(this);
        A0L.A0a(this.A01);
        return A0L.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.A09.A00.A03(this);
    }
}
