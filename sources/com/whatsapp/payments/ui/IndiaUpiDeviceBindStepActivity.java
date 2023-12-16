package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1ES;
import X.AnonymousClass1VX;
import X.AnonymousClass303;
import X.AnonymousClass31C;
import X.AnonymousClass344;
import X.AnonymousClass34V;
import X.AnonymousClass4FS;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZR;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9AF;
import X.AnonymousClass9AG;
import X.AnonymousClass9DA;
import X.AnonymousClass9EQ;
import X.AnonymousClass9ER;
import X.AnonymousClass9GJ;
import X.AnonymousClass9Qp;
import X.AnonymousClass9RH;
import X.AnonymousClass9TZ;
import X.AnonymousClass9U1;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.AnonymousClass9VD;
import X.AnonymousClass9VW;
import X.AnonymousClass9VY;
import X.AnonymousClass9bF;
import X.C005205m;
import X.C107695bk;
import X.C115115o9;
import X.C133686hm;
import X.C134246ig;
import X.C151007Tb;
import X.C153607bd;
import X.C157317i6;
import X.C160757oG;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C1899593h;
import X.C1899693i;
import X.C1900293o;
import X.C1906899l;
import X.C194259Se;
import X.C194309Sj;
import X.C196629bS;
import X.C196719bd;
import X.C197109ca;
import X.C199269gJ;
import X.C202629mK;
import X.C203039n1;
import X.C203309nU;
import X.C204019og;
import X.C204559pY;
import X.C204669pj;
import X.C385127z;
import X.C40602Ha;
import X.C54292oU;
import X.C617332a;
import X.C64333Db;
import X.C69263Wi;
import X.C86614Ku;
import X.C88834as;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class IndiaUpiDeviceBindStepActivity extends AnonymousClass9DA implements C203039n1, C202629mK {
    public static final C203309nU A0i = new AnonymousClass9bF();
    public int A00;
    public int A01;
    public int A02;
    public PendingIntent A03;
    public View A04;
    public View A05;
    public View A06;
    public WaImageView A07;
    public AnonymousClass5ZR A08;
    public C617332a A09;
    public C196719bd A0A;
    public AnonymousClass99H A0B;
    public AnonymousClass99H A0C;
    public AnonymousClass34V A0D;
    public C153607bd A0E;
    public C385127z A0F;
    public AnonymousClass9VD A0G;
    public AnonymousClass9AF A0H;
    public C194309Sj A0I;
    public AnonymousClass9RH A0J;
    public AnonymousClass9TZ A0K;
    public C115115o9 A0L;
    public AnonymousClass9GJ A0M;
    public C1900293o A0N;
    public C157317i6 A0O;
    public AnonymousClass9EQ A0P;
    public AnonymousClass9ER A0Q;
    public AnonymousClass9Qp A0R;
    public AnonymousClass9VY A0S;
    public C194259Se A0T;
    public Runnable A0U;
    public Runnable A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public ArrayList A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public final C134246ig A0g;
    public final C160757oG A0h;

    public final void A7h(String str) {
        AnonymousClass303 r3 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        r3.A03("device_binding_failure_reason", str);
        this.A0S.BKE(r3, 0, (Integer) null, "device_binding", "payments_device_binding_precheck");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a2 A[Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }, LOOP:1: B:61:0x019c->B:63:0x01a2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0C(com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r16) {
        /*
            java.lang.String r6 = "device-binding-sms"
            X.C626936e.A00()
            r3 = r16
            int r0 = r3.A00
            r2 = 1
            int r0 = r0 + 1
            r3.A00 = r0
            X.9U1 r1 = r3.A0L
            X.99H r7 = r3.A0C
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.9bS r4 = r1.A0A
            boolean r0 = r4.A0P()
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = r4.A07()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x002f
            r4.Brs(r7)
            if (r7 == 0) goto L_0x0067
            java.lang.String r1 = r7.A0A
        L_0x002f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0038
            r5.add(r1)
        L_0x0038:
            int r1 = r5.size()
            int r0 = r3.A00
            if (r1 < r0) goto L_0x004b
            int r0 = r0 - r2
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r3.A0X = r0
        L_0x0049:
            r5 = 0
            goto L_0x00a5
        L_0x004b:
            X.7oG r4 = r3.A0h
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IndiaUpiDeviceBindActivity : not enough psp available, pspSize: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", multipleSmsNumber : "
            r1.append(r0)
            int r0 = r3.A00
            X.C1899593h.A1K(r4, r1, r0)
            r3.finish()
            goto L_0x0049
        L_0x0067:
            java.lang.String r1 = r4.A07()
            goto L_0x002f
        L_0x006c:
            java.util.ArrayList r4 = r1.A07(r7)
            if (r4 == 0) goto L_0x009c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x009c
            int r1 = r1.A01
            int r0 = r4.size()
            int r0 = r1 % r0
            java.lang.Object r0 = r4.get(r0)
            r5.add(r0)
            int r0 = r4.size()
            if (r0 <= r2) goto L_0x009f
            int r1 = r1 + 1
            int r0 = r4.size()
            int r1 = r1 % r0
            java.lang.Object r0 = r4.get(r1)
            r5.add(r0)
            goto L_0x0038
        L_0x009c:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup psps list is null or empty"
            goto L_0x00a1
        L_0x009f:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup psps list has only one psp"
        L_0x00a1:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0038
        L_0x00a5:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r0 = 22
            r13 = 0
            if (r1 < r0) goto L_0x00f4
            int r4 = r3.A02     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r4 < 0) goto L_0x00f4
            X.7oG r8 = r3.A0h     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = "sending sms from sim subscription id: "
            r1.append(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.C1899593h.A1K(r8, r1, r4)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.9VY r1 = r3.A0S     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            int r0 = r3.A02     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            android.telephony.SmsManager r0 = r1.A02(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r7.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
        L_0x00cd:
            X.93o r0 = r3.A0N     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r0 != 0) goto L_0x0107
            java.lang.String r4 = "SMS_SENT"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r1.<init>(r4)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = "com.whatsapp"
            android.content.Intent r0 = r1.setPackage(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            android.app.PendingIntent r0 = X.C624735e.A01(r3, r5, r0, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r3.A03 = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.93o r1 = new X.93o     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r1.<init>(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r3.A0N = r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r0.<init>(r4)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.C154317cy.A01(r1, r3, r0, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            goto L_0x0107
        L_0x00f4:
            X.7oG r8 = r3.A0h     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = "sending sms from default sim"
            r8.A06(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            android.telephony.SmsManager r0 = android.telephony.SmsManager.getDefault()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r7.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            goto L_0x00cd
        L_0x0107:
            r4 = 0
        L_0x0108:
            int r0 = r7.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r4 >= r0) goto L_0x01ff
            java.lang.String r12 = ""
            java.lang.String r9 = r3.A7F(r12)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.9U1 r11 = r3.A0L     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = r3.A0X     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.99E r0 = r11.A01(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r0 == 0) goto L_0x01f7
            android.os.Bundle r1 = r0.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r1 == 0) goto L_0x01f7
            java.lang.String r0 = "smsGateways"
            java.util.ArrayList r10 = r1.getStringArrayList(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r10 == 0) goto L_0x01f7
            int r0 = r10.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r0 <= 0) goto L_0x01f7
            boolean r0 = r10.isEmpty()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r0 != 0) goto L_0x01f7
            X.C626936e.A09(r12, r10)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            int r1 = r10.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r11.A00 = r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            int r0 = r11.A02     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            int r0 = r0 % r1
            r11.A02 = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
        L_0x014a:
            r3.A0Y = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.9U1 r1 = r3.A0L     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = r3.A0X     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = r1.A05(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = r3.A7G(r0, r9)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r3.A0Z = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.9U1 r1 = r3.A0L     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = r3.A0X     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.99E r9 = r1.A01(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r9 == 0) goto L_0x01f4
            android.os.Bundle r1 = r9.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r1 == 0) goto L_0x01f1
            java.lang.String r0 = "smsPrefix"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
        L_0x016e:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r0 != 0) goto L_0x01f4
            android.os.Bundle r1 = r9.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r1 == 0) goto L_0x01ef
            java.lang.String r0 = "smsPrefix"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
        L_0x017e:
            java.lang.Object r11 = r7.get(r4)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            android.telephony.SmsManager r11 = (android.telephony.SmsManager) r11     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = r3.A0Z     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.util.ArrayList r14 = r11.divideMessage(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r1 = 0
        L_0x019c:
            int r0 = r14.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r1 >= r0) goto L_0x01aa
            android.app.PendingIntent r0 = r3.A03     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r15.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            int r1 = r1 + 1
            goto L_0x019c
        L_0x01aa:
            X.9ca r10 = r3.A0S     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r1 = "db_sms_sent"
            java.lang.String r0 = "device_binding"
            X.6ig r9 = r10.A05(r9, r13, r1, r0)     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r0 = r3.A0Y     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r9.A0N = r0     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r0 = r3.A00     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            long r0 = (long) r0     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r9.A0M = r0     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            X.AnonymousClass97T.A0t(r9, r3)     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r12 = r3.A0Y     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r16 = r13
            r11.sendMultipartTextMessage(r12, r13, r14, r15, r16)     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.A0e = r2     // Catch:{ NullPointerException -> 0x01d8, UnsupportedOperationException -> 0x01d6, SecurityException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            goto L_0x01eb
        L_0x01d2:
            r1 = move-exception
            goto L_0x01d9
        L_0x01d4:
            r1 = move-exception
            goto L_0x01d9
        L_0x01d6:
            r1 = move-exception
            goto L_0x01d9
        L_0x01d8:
            r1 = move-exception
        L_0x01d9:
            java.lang.String r0 = "IndiaUpiPaymentSetup sendDeviceBindingSms failed. Manual SMS no longer available. More details: "
            r8.A0A(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            java.lang.String r0 = "sms_not_supported"
            r3.A7j(r5, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.9ER r0 = r3.A0Q     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            X.AnonymousClass97T.A0z(r3, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r3.finish()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
        L_0x01eb:
            int r4 = r4 + 1
            goto L_0x0108
        L_0x01ef:
            r0 = 0
            goto L_0x017e
        L_0x01f1:
            r0 = 0
            goto L_0x016e
        L_0x01f4:
            java.lang.String r0 = "TRL WHA"
            goto L_0x017e
        L_0x01f7:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup smsGateways list is null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            r0 = 0
            goto L_0x014a
        L_0x01ff:
            X.7bd r0 = r3.A0E     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            if (r0 == 0) goto L_0x0227
            r0.A03(r6)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0207 }
            return
        L_0x0207:
            r4 = move-exception
            X.7oG r1 = r3.A0h
            java.lang.String r0 = "IndiaUpiDeviceBindActivity showSmsErrorAndFinish after sendDeviceBindingSms threw: "
            r1.A0A(r0, r4)
            X.7bd r1 = r3.A0E
            if (r1 == 0) goto L_0x0217
            r0 = -1
            r1.A05(r6, r0)
        L_0x0217:
            java.lang.String r0 = "illegal_state_exception"
            r3.A7j(r5, r0)
            r1 = 2131891937(0x7f1216e1, float:1.9418608E38)
            X.9VW r0 = new X.9VW
            r0.<init>(r1)
            r3.A7e(r0, r2)
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0C(com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity):void");
    }

    public void A5r() {
        if (!this.A0b) {
            this.A0b = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r3 = A0I2.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r2 = r3.A00;
            C1899593h.A0z(r3, r2, this, C1899593h.A0W(r3, r2, this));
            AnonymousClass97T.A0h(A0I2, r3, r2, this);
            AnonymousClass97T.A0i(A0I2, r3, r2, this, C1899693i.A0Y(r3));
            AnonymousClass97T.A0m(r3, r2, this);
            AnonymousClass97T.A0o(r3, r2, this);
            AnonymousClass97T.A0n(r3, r2, this);
            this.A0T = C1899593h.A0Q(r3);
            this.A0A = C1899693i.A0H(r2);
            this.A08 = C86614Ku.A0V(r3);
            this.A0L = (C115115o9) r2.A2P.get();
            this.A09 = C1899593h.A09(r3);
            this.A0K = C1899693i.A0P(r3);
            this.A0F = (C385127z) r3.AQE.get();
            this.A0S = r3.ApM();
            this.A0Q = AnonymousClass97T.A0Z(r2);
            this.A0P = (AnonymousClass9EQ) r2.A6M.get();
            this.A0I = C1899593h.A0J(r2);
            this.A0J = (AnonymousClass9RH) r2.A8s.get();
            this.A0O = A0I2.ACr();
        }
    }

    public final void A7V() {
        String str = this.A0W;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    this.A0W = "2";
                    markStepDone(this.A06);
                    markStepProcessing(this.A04);
                    markStepDisabled(this.A05);
                    C18290x4.A1A(this, this.A07, R.drawable.ic_verify_bank);
                    return;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    A7c(this.A0D);
                    return;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    A7d(this.A0D, this.A0a);
                    return;
                }
                break;
            case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                if (str.equals("4")) {
                    A7W();
                    return;
                }
                break;
        }
        this.A0W = "1";
        markStepProcessing(this.A06);
        markStepDisabled(this.A04);
        markStepDisabled(this.A05);
        C18290x4.A1A(this, this.A07, R.drawable.ic_send_sms);
    }

    public final void A7W() {
        this.A0h.A06("PAY: continueOnFinishDeviceBind called");
        C151007Tb A012 = this.A0I.A01("add_bank");
        C151007Tb A013 = this.A0I.A01("2fa");
        this.A0I.A08(A012);
        this.A0I.A08(A013);
        Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiAccountRecoveryFinishActivity.class);
        A7O(A082);
        C1899593h.A0k(A082, this, "extra_previous_screen", "device_binding");
    }

    public final void A7X() {
        if (this.A08.A02("android.permission.RECEIVE_SMS") != 0 && this.A08.A02("android.permission.SEND_SMS") == 0) {
            C005205m.A02(this, new String[]{"android.permission.RECEIVE_SMS"}, 100);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (r0.getSimState() != 5) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7Y() {
        /*
            r4 = this;
            X.9EQ r0 = r4.A0P
            java.lang.String r1 = "smsSend"
            X.316 r0 = r0.A00
            r0.A0A(r1)
            java.lang.String r0 = "1"
            r4.A0W = r0
            android.view.View r0 = r4.A06
            r4.markStepProcessing(r0)
            android.view.View r0 = r4.A04
            r4.markStepDisabled(r0)
            android.view.View r0 = r4.A05
            r4.markStepDisabled(r0)
            com.whatsapp.WaImageView r1 = r4.A07
            r0 = 2131232600(0x7f080758, float:1.8081314E38)
            X.C18290x4.A1A(r4, r1, r0)
            X.9ER r0 = r4.A0Q
            java.lang.String r1 = "deviceBindingStarted"
            X.316 r0 = r0.A00
            r0.A0B(r1)
            X.33i r0 = r4.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            r3 = 1
            if (r0 == 0) goto L_0x003e
            int r2 = r0.getSimState()
            r0 = 5
            r1 = 1
            if (r2 == r0) goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            boolean r0 = X.C29441ip.A02(r4)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "airplane_mode_on"
            r4.A7h(r0)
            r1 = 2131891938(0x7f1216e2, float:1.941861E38)
        L_0x004d:
            X.9VW r0 = new X.9VW
            r0.<init>(r1)
            r4.A7e(r0, r3)
            return
        L_0x0056:
            if (r1 != 0) goto L_0x0061
            java.lang.String r0 = "sim_state_issues"
            r4.A7h(r0)
            r1 = 2131891940(0x7f1216e4, float:1.9418614E38)
            goto L_0x004d
        L_0x0061:
            X.9GJ r1 = new X.9GJ
            r1.<init>(r4)
            r4.A0M = r1
            X.4FS r0 = r4.A04
            X.AnonymousClass0x7.A1B(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A7Y():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        markStepDisabled(r2.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        markStepDisabled(r2.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        markStepDone(r2.A06);
        markStepDone(r2.A04);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7Z() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0W
            int r0 = r1.hashCode()
            switch(r0) {
                case 49: goto L_0x002e;
                case 50: goto L_0x0020;
                case 51: goto L_0x000d;
                case 52: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.String r0 = "4"
            goto L_0x000f
        L_0x000d:
            java.lang.String r0 = "3"
        L_0x000f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A06
            r2.markStepDone(r0)
            android.view.View r0 = r2.A04
            r2.markStepDone(r0)
            goto L_0x0040
        L_0x0020:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A06
            r2.markStepDone(r0)
            goto L_0x003b
        L_0x002e:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A06
            r2.markStepDisabled(r0)
        L_0x003b:
            android.view.View r0 = r2.A04
            r2.markStepDisabled(r0)
        L_0x0040:
            android.view.View r0 = r2.A05
            r2.markStepDisabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A7Z():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        if (r2 == com.whatsapp.R.string.f11nameremoved) goto L_0x0119;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7c(X.AnonymousClass34V r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.A0X
            X.9ca r1 = r8.A0S
            r1.A0B(r0)
            r0 = 20
            X.6ig r3 = r1.A03(r9, r0)
            X.99H r0 = r8.A0C
            java.lang.String r0 = r0.A0C
            r3.A0O = r0
            X.9ER r0 = r8.A0Q
            if (r9 == 0) goto L_0x012e
            X.AnonymousClass97T.A0z(r8, r0)
        L_0x001a:
            int r0 = r8.A00
            long r0 = (long) r0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.A0K = r2
            r0 = 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0L = r0
            r3.A0M = r2
            java.lang.String r0 = r8.A0Y
            r3.A0N = r0
            java.lang.String r0 = "device_binding"
            X.AnonymousClass97T.A0u(r3, r8, r0)
            X.303 r2 = X.C1899593h.A0K()
            java.lang.String r1 = "is_multiple_sms_flow"
            r0 = 1
            r2.A04(r1, r0)
            java.lang.String r0 = r2.toString()
            r3.A0Z = r0
            X.7oG r4 = r8.A0h
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PaymentUserActionEvent devicebind event:"
            X.C1899593h.A1H(r4, r3, r0, r1)
            X.AnonymousClass97T.A0t(r3, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IndiaUpiDeviceBindActivity: onDeviceBinding: "
            r1.append(r0)
            r7 = 1
            r6 = 0
            boolean r0 = X.AnonymousClass000.A1X(r9)
            X.C1899593h.A1L(r4, r1, r0)
            X.9U1 r1 = r8.A0L
            X.99H r0 = r8.A0C
            java.util.ArrayList r1 = r1.A07(r0)
            if (r9 == 0) goto L_0x015e
            int r3 = r9.A00
            r0 = 11453(0x2cbd, float:1.6049E-41)
            if (r3 == r0) goto L_0x015e
            r2 = 2
            if (r1 == 0) goto L_0x0092
            int r1 = r1.size()
            int r0 = r8.A00
            if (r1 <= r0) goto L_0x0092
            if (r0 >= r2) goto L_0x0092
            r8.A0e = r7
            X.9GJ r1 = new X.9GJ
            r1.<init>(r8)
            r8.A0M = r1
            X.4FS r0 = r8.A04
            X.AnonymousClass0x7.A1B(r1, r0)
        L_0x0091:
            return
        L_0x0092:
            java.lang.String r5 = "upi-bind-device"
            boolean r0 = X.C196719bd.A02(r8, r5, r3, r7)
            if (r0 != 0) goto L_0x0091
            r8.A0e = r6
            X.9U1 r1 = r8.A0L
            java.util.ArrayList r0 = r1.A07
            if (r0 == 0) goto L_0x00ae
            int r0 = r0.size()
            if (r0 <= r7) goto L_0x00ae
            int r0 = r1.A01
            int r0 = r0 + 2
            r1.A01 = r0
        L_0x00ae:
            r1.A02 = r6
            int r3 = r9.A00
            r0 = 446(0x1be, float:6.25E-43)
            if (r3 == r0) goto L_0x0151
            r0 = 476(0x1dc, float:6.67E-43)
            if (r3 == r0) goto L_0x0140
            r0 = 11452(0x2cbc, float:1.6048E-41)
            if (r3 == r0) goto L_0x0125
            r0 = 11477(0x2cd5, float:1.6083E-41)
            if (r3 == r0) goto L_0x011e
            r0 = 11498(0x2cea, float:1.6112E-41)
            if (r3 == r0) goto L_0x0151
            r0 = 11544(0x2d18, float:1.6177E-41)
            if (r3 == r0) goto L_0x011e
            r0 = 4059001(0x3def79, float:5.687872E-39)
            if (r3 == r0) goto L_0x0151
            r0 = 11469(0x2ccd, float:1.6071E-41)
            if (r3 == r0) goto L_0x0125
            r0 = 11470(0x2cce, float:1.6073E-41)
            if (r3 == r0) goto L_0x011e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "onDeviceBinding failure. showErrorAndFinish at error: "
            r1.append(r0)
            X.7bd r0 = r8.A0E
            int r0 = r0.A00(r5)
            X.C1899593h.A1K(r4, r1, r0)
            r8.A01 = r2
        L_0x00eb:
            int r2 = r9.A00
            X.9bd r1 = r8.A0A
            X.7bd r0 = r8.A0E
            X.9VW r3 = r1.A04(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "onDeviceBinding failure. showErrorAndFinish: "
            r1.append(r0)
            X.7bd r0 = r8.A0E
            int r0 = r0.A00(r5)
            X.C1899593h.A1K(r4, r1, r0)
            int r2 = r3.A00
            r0 = 2131891887(0x7f1216af, float:1.9418507E38)
            if (r2 == r0) goto L_0x0119
            r0 = 2131891948(0x7f1216ec, float:1.941863E38)
            if (r2 == r0) goto L_0x0119
            r1 = 2131891206(0x7f121406, float:1.9417126E38)
            r0 = 1
            if (r2 != r1) goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            r8.A7e(r3, r0)
            return
        L_0x011e:
            X.9bS r0 = r8.A0M
            X.AnonymousClass97T.A0w(r1, r0, r8)
            r0 = 3
            goto L_0x012b
        L_0x0125:
            X.9bS r0 = r8.A0M
            X.AnonymousClass97T.A0w(r1, r0, r8)
            r0 = 4
        L_0x012b:
            r8.A01 = r0
            goto L_0x00eb
        L_0x012e:
            java.lang.String r1 = "deviceBindingEnded"
            X.316 r0 = r0.A00
            r0.A0B(r1)
            X.9EQ r0 = r8.A0P
            java.lang.String r1 = "deviceBind"
            X.316 r0 = r0.A00
            r0.A09(r1)
            goto L_0x001a
        L_0x0140:
            X.9bS r0 = r8.A0M
            X.AnonymousClass97T.A0w(r1, r0, r8)
            r1 = 2131894898(0x7f122272, float:1.9424614E38)
            X.9VW r0 = new X.9VW
            r0.<init>(r1)
            r8.A7e(r0, r6)
            return
        L_0x0151:
            X.9bS r0 = r8.A0M
            X.AnonymousClass97T.A0w(r1, r0, r8)
            int r1 = r9.A00
            X.99H r0 = r8.A0C
            r8.A7b(r0, r1)
            return
        L_0x015e:
            r8.A0e = r6
            X.9EQ r0 = r8.A0P
            java.lang.String r1 = "getAccounts"
            X.316 r0 = r0.A00
            r0.A0A(r1)
            X.9bS r0 = r8.A0M
            java.lang.String r2 = r0.A07()
            X.4FS r1 = r8.A04
            X.9GS r0 = new X.9GS
            r0.<init>(r8, r2)
            X.AnonymousClass0x7.A1B(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A7c(X.34V):void");
    }

    public final void A7d(AnonymousClass34V r9, ArrayList arrayList) {
        String A042;
        long j;
        short s;
        AnonymousClass9VW A043;
        int i;
        C160757oG r3 = this.A0h;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onBankAccountsList: ");
        A0o.append(arrayList);
        C1899593h.A1H(r3, r9, " error: ", A0o);
        if (!TextUtils.isEmpty(this.A0M.A07())) {
            A042 = this.A0M.A07();
        } else {
            A042 = this.A0L.A04(this.A0C);
        }
        C197109ca r1 = this.A0S;
        r1.A0B(A042);
        C134246ig A032 = r1.A03(r9, 18);
        AnonymousClass97T.A0u(A032, this, "device_binding");
        A032.A0O = this.A0C.A0C;
        if (arrayList != null) {
            A032.A01 = Boolean.valueOf(AnonymousClass001.A1W(arrayList.size()));
            j = (long) arrayList.size();
        } else {
            A032.A01 = Boolean.FALSE;
            j = 0;
        }
        A032.A0H = Long.valueOf(j);
        AnonymousClass97T.A0t(A032, this);
        r3.A04(AnonymousClass000.A0P(A032, "logGetAccounts: ", AnonymousClass001.A0o()));
        AnonymousClass9EQ r0 = this.A0P;
        if (r9 != null) {
            s = 3;
        } else {
            r0.A00.A09("getAccounts");
            r0 = this.A0P;
            s = 2;
        }
        r0.A00.A0E(s);
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList != null) {
                A7Z();
                this.A01 = 1;
                AnonymousClass34V r4 = new AnonymousClass34V(11473);
                i = R.string.f11nameremoved;
                if (A7U(this.A0C, r4, getString(R.string.f11nameremoved))) {
                    return;
                }
            } else if (r9 != null && !C196719bd.A02(this, "upi-get-accounts", r9.A00, true)) {
                String A002 = this.A0K.A00(r9.A00);
                int i2 = r9.A00;
                if (i2 == 11467 || i2 == 11543) {
                    A7Z();
                    AnonymousClass97T.A0w(this.A0L, this.A0M, this);
                    this.A01 = 3;
                    A7e(new AnonymousClass9VW(R.string.f11nameremoved), true);
                    this.A0L.A09();
                    return;
                } else if (A002 != null) {
                    A7Z();
                    if (!A7U(this.A0C, r9, A002)) {
                        A7e(new AnonymousClass9VW(r9.A00, A002), true);
                        return;
                    }
                    return;
                } else if (i2 == 11473) {
                    A7Z();
                    i = R.string.f11nameremoved;
                } else if (i2 == 11485) {
                    A7Z();
                    this.A01 = 5;
                    i = R.string.f11nameremoved;
                } else if (i2 == 11487) {
                    A7Z();
                    this.A01 = 6;
                    i = R.string.f11nameremoved;
                } else {
                    A043 = this.A0A.A04(this.A0E, i2);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("onBankAccountsList failure. showErrorAndFinish: ");
                    C1899593h.A1K(r3, A0o2, this.A0E.A00("upi-get-accounts"));
                    int i3 = A043.A00;
                    if (i3 == R.string.f11nameremoved || i3 == R.string.f11nameremoved || i3 == R.string.f11nameremoved) {
                        A7e(A043, false);
                        return;
                    }
                    this.A01 = 1;
                    A7e(A043, true);
                }
            } else {
                return;
            }
            A043 = new AnonymousClass9VW(i);
            A7e(A043, true);
        } else if (arrayList.size() != 1 || ((AnonymousClass99H) arrayList.get(0)).A0J) {
            A7i(arrayList);
        } else if (!this.A0d) {
            this.A0d = true;
            AnonymousClass99H r42 = (AnonymousClass99H) arrayList.get(0);
            this.A0B = r42;
            AnonymousClass9AF r32 = this.A0H;
            boolean z = this.A0k;
            r32.A00(r42, new C204669pj(this, 2), z, z);
        }
    }

    @Deprecated
    public final void A7e(AnonymousClass9VW r6, boolean z) {
        int i = r6.A00;
        C160757oG r3 = this.A0h;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiDeviceBindActivity showErrorAndFinish: ");
        C1899593h.A1K(r3, A0o, i);
        A7Z();
        if (i == 0) {
            i = R.string.f11nameremoved;
            String str = this.A0E.A04;
            if ("upi-bind-device".equalsIgnoreCase(str)) {
                i = R.string.device_binding_failure_reasons_bullet_list_title;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                this.A01 = 1;
                i = R.string.f11nameremoved;
            }
        }
        if (z) {
            C153607bd r0 = this.A0E;
            if (r0 != null) {
                r0.A07.add("done");
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("clearStates: ");
                C1899593h.A1I(r3, this.A0E, A0o2);
            }
            this.A0L.A04 = new C153607bd();
            Intent A0L2 = AnonymousClass97T.A0L(this, r6);
            A0L2.putExtra("error", i);
            A0L2.putExtra("error_type", this.A01);
            int i2 = this.A01;
            if (i2 >= 1 && i2 <= 6) {
                A0L2.putExtra("extra_bank_account", this.A0C);
            }
            if (!this.A0k) {
                A0L2.putExtra("try_again", 1);
            }
            A0L2.addFlags(335544320);
            A7O(A0L2);
            A0L2.putExtra("extra_previous_screen", "device_binding");
            A6T(A0L2, true);
        } else {
            AnonymousClass344.A00(AnonymousClass9VW.A00(this, r6), getSupportFragmentManager());
        }
        AnonymousClass97T.A0z(this, this.A0Q);
    }

    public final void A7f(Integer num, Integer num2) {
        C134246ig r1 = this.A0g;
        r1.A07 = num2;
        r1.A08 = num;
        AnonymousClass97T.A0u(r1, this, "device_binding");
        AnonymousClass97T.A0t(r1, this);
    }

    public final void A7g(String str) {
        if (this.A0c) {
            this.A0h.A06("PAY: getAccountsOrFinishAfterDeviceBinding called");
            this.A0W = "4";
            markStepDone(this.A06);
            markStepDone(this.A04);
            markStepProcessing(this.A05);
            C18290x4.A1A(this, this.A07, R.drawable.ic_account_search);
            A7W();
            return;
        }
        this.A0W = "3";
        markStepDone(this.A06);
        markStepDone(this.A04);
        markStepProcessing(this.A05);
        C18290x4.A1A(this, this.A07, R.drawable.ic_account_search);
        C160757oG r2 = this.A0h;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("getAccountsAfterDeviceBinding: bank picked and calling sendGetBankAccounts for: ");
        A0o.append(this.A0C.A01);
        A0o.append(" accountProvider:");
        A0o.append(this.A0C.A0A);
        A0o.append(" psp: ");
        C1899593h.A1J(r2, str, A0o);
        this.A0G.A00(this.A0C, AnonymousClass97T.A0b(this));
        this.A0S.Bq0();
    }

    public final void A7i(ArrayList arrayList) {
        this.A0h.A06("IndiaUpiDeviceBindActivity showBankAccounts called");
        Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiBankAccountPickerActivity.class);
        A082.putParcelableArrayListExtra("extra_accounts_list", arrayList);
        A082.putExtra("extra_selected_account_bank_logo", this.A0C.A03);
        A7O(A082);
        C1899593h.A0k(A082, this, "extra_previous_screen", "device_binding");
    }

    public final void A7j(boolean z, String str) {
        String A042;
        if (!TextUtils.isEmpty(this.A0M.A07())) {
            A042 = this.A0M.A07();
        } else {
            A042 = this.A0L.A04(this.A0C);
        }
        C197109ca r0 = this.A0S;
        r0.A0B(A042);
        C134246ig B0d = r0.B0d();
        B0d.A0O = this.A0C.A0C;
        AnonymousClass97T.A0u(B0d, this, "db_sms_sent");
        int i = 28;
        if (z) {
            i = 27;
        }
        B0d.A07 = Integer.valueOf(i);
        if (!z) {
            AnonymousClass303 A0K2 = C1899593h.A0K();
            A0K2.A03("device_binding_failure_reason", str);
            B0d.A0Z = A0K2.toString();
        }
        C1899593h.A1H(this.A0h, B0d, "PaymentUserActionEvent smsSent event: ", AnonymousClass001.A0o());
        AnonymousClass97T.A0t(B0d, this);
    }

    public void BNT(AnonymousClass34V r2, ArrayList arrayList) {
        this.A0a = arrayList;
        this.A0D = r2;
        if (!this.A0m) {
            A7d(r2, arrayList);
        }
    }

    public void BQy(AnonymousClass34V r2) {
        if (this.A0m) {
            this.A0D = r2;
        } else {
            A7c(r2);
        }
    }

    public void BZf(C133686hm r4, AnonymousClass34V r5) {
        if (r4 != null) {
            this.A0A = r4;
            A7S("device_binding");
            this.A0Q.A00.A0E(2);
            return;
        }
        if (r5 != null) {
            int i = r5.A00;
            if (i == 10756) {
                Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiDobPickerActivity.class);
                A082.putExtra("bank_account", this.A0B.A02);
                BpY(A082, 1023);
                return;
            } else if (i == 1383026) {
                A7b(this.A0C, i);
                return;
            }
        }
        A7i(this.A0a);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 154) {
            if (i != 1023) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                this.A0O.A00(intent, this, new C204559pY(this, 1));
            } else {
                finish();
            }
        } else if (i2 == -1) {
            A7X();
            A7Y();
        } else {
            Bot(R.string.f11nameremoved);
        }
    }

    public void onBackPressed() {
        C160757oG r2 = this.A0h;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this);
        C1899593h.A1J(r2, " onBackPressed", A0o);
        Integer A0f2 = AnonymousClass001.A0f();
        A7f(A0f2, A0f2);
        A7J();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0c = this.A0M.A0P();
        this.A0P.A00(getIntent());
        this.A0P.A00.A0A("onCreate");
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A0Y2 = AnonymousClass97T.A0Y(this);
        if (A0Y2 != null) {
            C1899593h.A0o(A0Y2, getString(R.string.f11nameremoved));
        }
        this.A06 = findViewById(R.id.bind_step_1);
        this.A04 = findViewById(R.id.bind_step_2);
        this.A05 = findViewById(R.id.bind_step_3);
        A7a(this.A06, getString(R.string.f11nameremoved), getString(R.string.f11nameremoved));
        A7a(this.A04, getString(R.string.f11nameremoved), getString(R.string.f11nameremoved));
        boolean z = this.A0c;
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        A7a(this.A05, getString(R.string.f11nameremoved), getString(i));
        this.A07 = (WaImageView) findViewById(R.id.ic_bind_top);
        this.A0E = this.A0L.A04;
        AnonymousClass99H r13 = (AnonymousClass99H) getIntent().getParcelableExtra("extra_selected_bank");
        this.A0C = r13;
        this.A0R = new AnonymousClass9Qp(this.A0I);
        C69263Wi r30 = this.A05;
        C54292oU r15 = this.A06;
        AnonymousClass4FS r14 = this.A04;
        AnonymousClass31C r12 = this.A0H;
        C194259Se r11 = this.A0T;
        AnonymousClass9U4 r10 = this.A0P;
        AnonymousClass9U1 r9 = this.A0L;
        C617332a r8 = this.A09;
        C40602Ha r7 = this.A0K;
        C196629bS r6 = this.A0M;
        AnonymousClass9VY r5 = this.A0S;
        C197109ca r4 = this.A0S;
        AnonymousClass4FS r29 = r14;
        C197109ca r25 = r4;
        C40602Ha r22 = r7;
        AnonymousClass9U4 r23 = r10;
        AnonymousClass9U1 r20 = r9;
        C196629bS r21 = r6;
        AnonymousClass31C r18 = r12;
        AnonymousClass99H r19 = r13;
        C617332a r16 = r8;
        C69263Wi r142 = r30;
        this.A0G = new AnonymousClass9VD(r142, r15, r16, this.A0D, r18, r19, r20, r21, r22, r23, this, r25, this.A0V, r5, r11, r29);
        AnonymousClass1VX r143 = this.A0D;
        C69263Wi r132 = this.A05;
        AnonymousClass31C r122 = this.A0H;
        C194259Se r112 = this.A0T;
        AnonymousClass9U4 r102 = this.A0P;
        C1906899l r92 = this.A0I;
        C617332a r82 = this.A09;
        AnonymousClass9U1 r72 = this.A0L;
        AnonymousClass9U5 r62 = this.A0M;
        C40602Ha r42 = this.A0K;
        C196629bS r52 = this.A0M;
        C69263Wi r17 = r132;
        this.A0H = new AnonymousClass9AF(this, r17, r82, r143, r122, r72, r52, r92, r42, r62, r102, this, this.A0S, this.A0V, r112);
        C160757oG r43 = this.A0h;
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1H(A0o, "IndiaUpiDeviceBindActivity onCreate: device binding status: ", r52);
        C1899593h.A1F(r43, A0o);
        String A072 = this.A0M.A07();
        if (this.A0M.A0R(this.A0C, this.A0S, A072)) {
            try {
                JSONObject A1G = AnonymousClass0x9.A1G();
                AnonymousClass97T.A0x(this, "DeviceBindingStep", A1G);
                A1G.put("pspForDeviceBinding", A072);
                A1G.put("isDeviceBindingDone", this.A0M.A0R(this.A0C, this.A0S, A072));
                AnonymousClass9AG r93 = new AnonymousClass9AG(this.A06, this.A0D, this.A0H, this.A0L, this.A0M);
                r93.A00 = A1G;
                r93.A00("SKIPPED_DEVICE_BINDING", (List) null);
            } catch (Exception unused) {
            }
            A7g(A072);
        } else {
            A7f(C18290x4.A0Z(), (Integer) null);
            this.A0E.A01("upi-educate-sms");
            this.A02 = this.A0M.A03();
            A7Y();
        }
        onConfigurationChanged(AnonymousClass001.A0M(this));
        this.A0P.A00.A09("onCreate");
    }

    public IndiaUpiDeviceBindStepActivity(int i) {
        this.A0b = false;
        C204019og.A00(this, 61);
    }

    public final void A7a(View view, String str, String str2) {
        TextView A092 = AnonymousClass002.A09(view, R.id.bind_step_number);
        if (A092 != null) {
            A092.setText(str);
        }
        TextView A093 = AnonymousClass002.A09(view, R.id.bind_step_desc);
        if (A093 != null) {
            A093.setText(str2);
        }
        markStepDisabled(view);
    }

    public final void A7b(AnonymousClass99H r4, int i) {
        A7Z();
        Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiOnboardingErrorEducationActivity.class);
        A7O(A082);
        A082.putExtra("error_code", i);
        A082.putExtra("extra_selected_bank", r4);
        A082.putExtra("extra_previous_screen", "device_binding");
        A082.addFlags(335544320);
        A6T(A082, true);
        AnonymousClass97T.A0z(this, this.A0Q);
    }

    public final void markStepDisabled(View view) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass0Y8.A04(this, R.color.f5nameremoved), PorterDuff.Mode.SRC_OVER);
            findViewById.setBackground(drawable);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        TextView A092 = AnonymousClass002.A09(view, R.id.bind_step_desc);
        if (A092 != null) {
            AnonymousClass0x2.A0q(this, A092, R.color.f5nameremoved);
        }
    }

    public final void markStepDone(View view) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        View findViewById3 = view.findViewById(R.id.bind_step_check);
        if (findViewById3 != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass0Y8.A04(this, R.color.f5nameremoved), PorterDuff.Mode.SRC_OVER);
            findViewById3.setBackground(drawable);
            findViewById3.setVisibility(0);
        }
        TextView A092 = AnonymousClass002.A09(view, R.id.bind_step_desc);
        if (A092 != null) {
            AnonymousClass0x2.A0q(this, A092, R.color.f5nameremoved);
        }
    }

    public final void markStepProcessing(View view) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            Drawable drawable = getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass0Y8.A04(this, R.color.f5nameremoved), PorterDuff.Mode.SRC_OVER);
            findViewById.setBackground(drawable);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        View findViewById3 = view.findViewById(R.id.bind_step_check);
        if (findViewById3 != null) {
            findViewById3.setVisibility(4);
        }
        TextView A092 = AnonymousClass002.A09(view, R.id.bind_step_desc);
        if (A092 != null) {
            AnonymousClass5Yj.A0B(this, A092, R.attr.f3nameremoved, R.color.f5nameremoved);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0H.A01 = null;
        AnonymousClass9VD r2 = this.A0G;
        r2.A01 = null;
        r2.A02.removeCallbacksAndMessages((Object) null);
        r2.A00.quit();
        C1900293o r0 = this.A0N;
        if (r0 != null) {
            unregisterReceiver(r0);
            this.A0N = null;
        }
        PendingIntent pendingIntent = this.A03;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.A03 = null;
        }
        AnonymousClass9GJ r1 = this.A0M;
        if (r1 != null) {
            r1.A0D(false);
        }
        Runnable runnable = this.A0U;
        if (runnable != null) {
            this.A04.BjN(runnable);
        }
        Runnable runnable2 = this.A0V;
        if (runnable2 != null) {
            this.A04.BjN(runnable2);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C160757oG r2 = this.A0h;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this);
        C1899593h.A1J(r2, " action bar home", A0o);
        A7f(1, 1);
        A7J();
        return true;
    }

    public void onStart() {
        super.onStart();
        if (this.A0f) {
            A7e(new AnonymousClass9VW(R.string.f11nameremoved), true);
        } else {
            Runnable runnable = this.A0U;
            if (runnable != null) {
                this.A04.BjN(runnable);
                this.A0U = null;
                A7V();
            }
        }
        Runnable runnable2 = this.A0V;
        if (runnable2 != null) {
            this.A04.BjN(runnable2);
            this.A0V = null;
        }
    }

    public void onStop() {
        super.onStop();
        if (this.A0e && this.A0U == null) {
            this.A0U = this.A04.Bkn(new C199269gJ(this), "IndiaUpiDeviceBindSetupActivity/onStop", ((long) this.A0D.A0N(924)) * 1000);
        }
    }

    public IndiaUpiDeviceBindStepActivity() {
        this(0);
        this.A02 = -1;
        this.A00 = 0;
        this.A0g = new C134246ig();
        this.A0d = false;
        this.A0h = C160757oG.A00("IndiaUpiDeviceBindActivity", "onboarding", "IN");
    }
}
