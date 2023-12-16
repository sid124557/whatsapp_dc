package X;

import android.view.View;

/* renamed from: X.5f8  reason: invalid class name and case insensitive filesystem */
public class C109755f8 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C109755f8(AnonymousClass223 r2, AnonymousClass5X4 r3) {
        this.A03 = 2;
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = "status_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0121, code lost:
        r2.A00(r3, r4, java.lang.Integer.valueOf(r0), r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0128, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        X.C626936e.A0D(false, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A03
            switch(r0) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00a7;
                case 2: goto L_0x0063;
                case 3: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r8.A00
            X.5Qr r2 = (X.C104365Qr) r2
            java.lang.String r6 = "status_fragment"
            java.lang.Object r4 = r8.A01
            X.66Q r4 = (X.AnonymousClass66Q) r4
            X.57S r1 = r2.A04
            java.lang.String r0 = "TAP_BANNER_SETUP_SHARE"
            r1.A05(r0)
            X.8qC r1 = r2.A07
            java.util.ArrayList r0 = X.C113925mD.A00(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = "CrosspostContextualUpsellViewController/contextualUpsellOnClickListener recent statuses empty"
        L_0x0024:
            r0 = 0
            X.C626936e.A0D(r0, r1)
            return
        L_0x0029:
            java.util.ArrayList r0 = X.C113925mD.A00(r1)
            boolean r0 = X.AnonymousClass36X.A08(r0)
            if (r0 != 0) goto L_0x0095
            java.lang.String r1 = "CrosspostContextualUpsellViewController/contextualUpsellOnClickListener some sent messages are not delivered"
            goto L_0x0024
        L_0x0036:
            java.lang.Object r2 = r8.A00
            X.5Kp r2 = (X.C102875Kp) r2
            java.lang.String r6 = "status_fragment"
            java.lang.Object r4 = r8.A01
            X.66Q r4 = (X.AnonymousClass66Q) r4
            X.57R r1 = r2.A04
            java.lang.String r0 = "TAP_F_ICON"
            r1.A05(r0)
            X.8qC r1 = r2.A07
            java.util.ArrayList r0 = X.C113925mD.A00(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = "CrosspostContextualShareViewController/fbIconOnClickListener recent statuses empty"
            goto L_0x0024
        L_0x0056:
            java.util.ArrayList r0 = X.C113925mD.A00(r1)
            boolean r0 = X.AnonymousClass36X.A08(r0)
            if (r0 != 0) goto L_0x0110
            java.lang.String r1 = "CrosspostContextualShareViewController/fbIconOnClickListener some sent messages are not delivered"
            goto L_0x0024
        L_0x0063:
            java.lang.Object r1 = r8.A00
            X.5X4 r1 = (X.AnonymousClass5X4) r1
            java.lang.Object r2 = r8.A01
            X.223 r2 = (X.AnonymousClass223) r2
            java.lang.String r3 = "status_fragment"
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            X.8qC r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.5mC r0 = (X.C113915mC) r0
            java.util.LinkedHashMap r0 = r0.A02
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = "CrosspostShareViewController/fbIconOnClickListener recent statuses empty"
            goto L_0x0024
        L_0x008c:
            boolean r0 = X.C626736a.A08(r4)
            if (r0 != 0) goto L_0x0129
            java.lang.String r1 = "CrosspostShareViewController/fbIconOnClickListener some sent messages are not delivered"
            goto L_0x0024
        L_0x0095:
            X.8qC r0 = r2.A05
            java.lang.Object r2 = r0.get()
            X.5aR r2 = (X.C106955aR) r2
            android.content.Context r3 = X.C18290x4.A0F(r9)
            java.util.ArrayList r7 = X.C113925mD.A00(r1)
            r0 = 4
            goto L_0x0121
        L_0x00a7:
            java.lang.Object r5 = r8.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r5 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r5
            java.lang.Object r0 = r8.A01
            X.34x r0 = (X.C624134x) r0
            java.lang.String r4 = r8.A02
            X.5mK r3 = r5.A0b
            X.2z0 r0 = r0.A1J
            java.lang.String r2 = r0.A01
            r1 = 1
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.util.Map r0 = r3.A0H
            r0.put(r2, r1)
            X.4Fm r1 = r5.A02
            android.content.Context r0 = r5.A1D()
            X.C86604Kt.A12(r0, r1, r4)
            return
        L_0x00cf:
            java.lang.Object r6 = r8.A00
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r6 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity) r6
            java.lang.String r5 = r8.A02
            java.lang.Object r0 = r8.A01
            X.33G r0 = (X.AnonymousClass33G) r0
            com.whatsapp.jid.DeviceJid r4 = r6.A05
            if (r4 != 0) goto L_0x00e4
            java.lang.String r0 = "deviceJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00e4:
            java.lang.String r3 = X.AnonymousClass33G.A00(r6, r0)
            X.C162457s7.A0D(r3)
            com.whatsapp.companiondevice.SetDeviceNicknameFragment r2 = new com.whatsapp.companiondevice.SetDeviceNicknameFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "device_jid_raw_string"
            X.AnonymousClass0x2.A0v(r1, r4, r0)
            java.lang.String r0 = "existing_display_name"
            r1.putString(r0, r5)
            java.lang.String r0 = "device_string"
            r1.putString(r0, r3)
            r2.A0u(r1)
            X.0df r1 = r6.getSupportFragmentManager()
            java.lang.String r0 = "LinkedDeviceEditDeviceActivity"
            r2.A1O(r1, r0)
            return
        L_0x0110:
            X.8qC r0 = r2.A05
            java.lang.Object r2 = r0.get()
            X.5aR r2 = (X.C106955aR) r2
            android.content.Context r3 = X.C18290x4.A0F(r9)
            java.util.ArrayList r7 = X.C113925mD.A00(r1)
            r0 = 3
        L_0x0121:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r2.A00(r3, r4, r5, r6, r7)
            return
        L_0x0129:
            X.8qC r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.30E r0 = (X.AnonymousClass30E) r0
            android.content.Context r1 = X.C18290x4.A0F(r9)
            r5 = 3
            r0.A03(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109755f8.onClick(android.view.View):void");
    }

    public C109755f8(C102875Kp r2, AnonymousClass66Q r3) {
        this.A03 = 3;
        this.A00 = r2;
        this.A02 = "status_fragment";
        this.A01 = r3;
    }

    public C109755f8(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    public C109755f8(C104365Qr r2, AnonymousClass66Q r3) {
        this.A03 = 4;
        this.A00 = r2;
        this.A02 = "status_fragment";
        this.A01 = r3;
    }
}
