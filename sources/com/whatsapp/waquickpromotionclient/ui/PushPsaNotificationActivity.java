package com.whatsapp.waquickpromotionclient.ui;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C46222bH;
import X.C46892cN;
import X.C64333Db;
import X.C89644eZ;

public final class PushPsaNotificationActivity extends C89644eZ {
    public C46892cN A00;
    public C46222bH A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (C46892cN) A002.ASf.get();
            this.A01 = (C46222bH) A002.ASg.get();
        }
    }

    public PushPsaNotificationActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 130);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r3 != null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d A[Catch:{ Exception -> 0x00b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            java.lang.String r0 = "pushPsaNotificationComposer/onCreate"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.Intent r0 = r14.getIntent()
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "PushPsaNotificationActivity/null intent"
        L_0x0011:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0015:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "is_dismiss_intent"
            boolean r3 = X.AnonymousClass0x9.A1N(r1, r0)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "campaign_id"
            java.lang.String r4 = r1.getStringExtra(r0)
            if (r4 != 0) goto L_0x002e
            java.lang.String r0 = "PushPsaNotificationActiity/null campaign ID"
            goto L_0x0011
        L_0x002e:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "eligibility_duration_after_impression_ms"
            r2 = -1
            int r7 = r1.getIntExtra(r0, r2)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "surface_id"
            int r5 = r1.getIntExtra(r0, r2)
            if (r3 == 0) goto L_0x0054
            X.2bH r2 = r14.A01
            if (r2 == 0) goto L_0x00c6
            r6 = 2
            X.21s r3 = X.C373021s.DISMISS_ACTION
            r2.A00(r3, r4, r5, r6, r7)
        L_0x0050:
            r14.finish()
            return
        L_0x0054:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "deep_link"
            java.lang.String r3 = r1.getStringExtra(r0)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "universal_link"
            java.lang.String r1 = r1.getStringExtra(r0)
            X.2bH r8 = r14.A01
            if (r8 == 0) goto L_0x00d6
            r12 = 1
            X.21s r9 = X.C373021s.PRIMARY_ACTION
            r10 = r4
            r11 = r5
            r13 = r7
            r8.A00(r9, r10, r11, r12, r13)
            X.2cN r2 = r14.A00
            if (r2 == 0) goto L_0x00ce
            if (r3 == 0) goto L_0x0082
            int r0 = r3.length()
            if (r0 != 0) goto L_0x008c
        L_0x0082:
            if (r1 == 0) goto L_0x0050
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0097
        L_0x008c:
            int r0 = r3.length()     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x0097
            android.net.Uri r1 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x009b
        L_0x0097:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00b4 }
        L_0x009b:
            if (r1 == 0) goto L_0x0050
            if (r3 != 0) goto L_0x00a7
            android.content.Intent r0 = X.C18310x6.A0D(r1)
        L_0x00a3:
            X.C162457s7.A0H(r0)
            goto L_0x00b0
        L_0x00a7:
            X.2oU r0 = r2.A02
            android.content.Context r0 = r0.A00
            android.content.Intent r0 = X.C627736r.A0G(r0, r1)
            goto L_0x00a3
        L_0x00b0:
            r14.startActivity(r0)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x0050
        L_0x00b4:
            java.lang.String r0 = "PushPsaNotificationComposer/Couldn't parse URI"
            goto L_0x00c2
        L_0x00b7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PushPsaNotificationComposer/couldn't start activity: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)
        L_0x00c2:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0050
        L_0x00c6:
            java.lang.String r0 = "pushPsaNotificationLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ce:
            java.lang.String r0 = "pushPsaNotificationComposer"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d6:
            java.lang.String r0 = "pushPsaNotificationLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationActivity.onCreate(android.os.Bundle):void");
    }

    public PushPsaNotificationActivity() {
        this(0);
    }
}
