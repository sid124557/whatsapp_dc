package X;

import java.util.AbstractList;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.8Px  reason: invalid class name and case insensitive filesystem */
public class C173368Px implements C1227965t {
    public final /* synthetic */ GetCredential A00;

    public C173368Px(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x024a, code lost:
        if (X.AnonymousClass6C9.A0p(r2, r4).A00 != A00(r2, r4)) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012a, code lost:
        if (r4 == 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0151, code lost:
        if (X.AnonymousClass6C9.A0p(r2, r4).A00 != A00(r2, r4)) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016b, code lost:
        if (r0 == false) goto L_0x016d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Avu(android.view.View r16, int r17) {
        /*
            r15 = this;
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = r15.A00
            r8 = 0
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r2 = r17
            r0.<init>(r8, r2)
            r1.dispatchKeyEvent(r0)
            r0 = 66
            if (r2 != r0) goto L_0x03a8
            org.npci.upi.security.pinactivitycomponent.s r13 = r1.A0I
            if (r13 == 0) goto L_0x0458
            org.npci.upi.security.pinactivitycomponent.w r13 = (org.npci.upi.security.pinactivitycomponent.w) r13
            android.content.Context r0 = r13.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.7Ug r0 = r0.A0G
            boolean r0 = r0.A00()
            r3 = 1
            if (r0 == 0) goto L_0x0176
            java.util.ArrayList r2 = r13.A06
            int r0 = r2.size()
            java.lang.String r5 = "AADHAAR"
            if (r0 != r3) goto L_0x007e
            int r0 = r13.A03
            java.lang.Object r0 = r2.get(r0)
            X.66w r0 = (X.C1230466w) r0
            boolean r0 = r0.Avw()
            if (r0 == 0) goto L_0x0405
            int r0 = r13.A01     // Catch:{ Exception -> 0x0458 }
            if (r0 >= 0) goto L_0x0065
            int r0 = r13.A03     // Catch:{ Exception -> 0x0458 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x0458 }
            X.66w r2 = (X.C1230466w) r2     // Catch:{ Exception -> 0x0458 }
            r0 = r2
            X.6Fq r0 = (X.C125126Fq) r0     // Catch:{ Exception -> 0x0458 }
            java.lang.String r0 = r0.A0F     // Catch:{ Exception -> 0x0458 }
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0458 }
            r1 = 2131895685(0x7f122585, float:1.942621E38)
            if (r0 == 0) goto L_0x0059
            r1 = 2131895610(0x7f12253a, float:1.9426058E38)
        L_0x0059:
            android.content.res.Resources r0 = X.C08310eF.A09(r13)     // Catch:{ Exception -> 0x0458 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0458 }
            r2.Avv(r0)     // Catch:{ Exception -> 0x0458 }
            return
        L_0x0065:
            java.lang.Boolean r0 = r13.A0E     // Catch:{ Exception -> 0x0458 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0458 }
            if (r0 != 0) goto L_0x0458
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0458 }
            r13.A0D = r0     // Catch:{ Exception -> 0x0458 }
            android.view.View r1 = r13.A04     // Catch:{ Exception -> 0x0458 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0458 }
            r13.A1O(r1, r0)     // Catch:{ Exception -> 0x0458 }
            r13.A1M(r3)     // Catch:{ Exception -> 0x0458 }
            return
        L_0x007e:
            int r4 = r2.size()
            r0 = 4
            r6 = 3
            r1 = 2
            if (r4 != r0) goto L_0x00af
            int r4 = r13.A03
            if (r4 == r3) goto L_0x012c
            if (r4 != r1) goto L_0x011a
            java.lang.Boolean r0 = r13.A0F
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0458
        L_0x0095:
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 == r0) goto L_0x039c
            int r0 = r13.A03
            r2.get(r0)
            r2 = 2131895843(0x7f122623, float:1.942653E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r13.A02
            goto L_0x0258
        L_0x00af:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x0122
            int r4 = r13.A03
            if (r4 != 0) goto L_0x00f0
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 != r0) goto L_0x0159
            android.widget.ViewFlipper r1 = r13.A09
            int r0 = r13.A03
            int r0 = r0 + 1
            r1.setDisplayedChild(r0)
            int r0 = r13.A03
            int r0 = r0 + 1
            r13.A03 = r0
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x0458
            r13.A0B = r8
            android.content.Context r0 = r13.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.7Ug r0 = r0.A0G
            int r0 = r0.A00
            r13.A01 = r0
            int r0 = r13.A00
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r0)
            r13.A1L(r0)
            r0.A0I = r3
            return
        L_0x00f0:
            if (r4 != r3) goto L_0x011e
            java.lang.Boolean r0 = r13.A0F
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0095
            boolean r1 = r13.A0A
            java.lang.Object r0 = r2.get(r4)
            if (r1 == 0) goto L_0x0143
            X.6Fq r0 = (X.C125126Fq) r0
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 != r0) goto L_0x0159
            android.widget.ViewFlipper r0 = r13.A09
            r0.showNext()
            int r0 = r13.A03
            int r0 = r0 + 1
            r13.A03 = r0
            r13.A0A = r8
            return
        L_0x011a:
            if (r4 != r6) goto L_0x0458
            goto L_0x0266
        L_0x011e:
            if (r4 != r1) goto L_0x0458
            goto L_0x0266
        L_0x0122:
            int r0 = r2.size()
            if (r0 != r1) goto L_0x0176
            int r4 = r13.A03
            if (r4 != 0) goto L_0x0264
        L_0x012c:
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 != r0) goto L_0x0153
            android.widget.ViewFlipper r1 = r13.A09
            int r0 = r13.A03
            int r0 = r0 + 1
            r1.setDisplayedChild(r0)
            goto L_0x03a1
        L_0x0143:
            boolean r0 = r0 instanceof X.C125126Fq
            if (r0 == 0) goto L_0x039c
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 == r0) goto L_0x039c
        L_0x0153:
            int r0 = r13.A03
            r2.get(r0)
            goto L_0x016d
        L_0x0159:
            int r0 = r13.A03
            r2.get(r0)
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r0)
            java.lang.String r0 = r0.A0F
            boolean r0 = r0.equals(r5)
            r2 = 2131895842(0x7f122622, float:1.9426528E38)
            if (r0 != 0) goto L_0x0170
        L_0x016d:
            r2 = 2131895844(0x7f122624, float:1.9426532E38)
        L_0x0170:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r13.A01
            goto L_0x0258
        L_0x0176:
            java.util.ArrayList r2 = r13.A06
            int r0 = r2.size()
            boolean r4 = X.AnonymousClass000.A1U(r0, r3)
            X.7Ug r0 = r13.A0H
            org.json.JSONArray r0 = r0.A08
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r1.contains(r0)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x01c1
            int r4 = r13.A03
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 != r0) goto L_0x024c
            int r0 = r13.A03
            java.lang.Object r0 = r2.get(r0)
            X.66w r0 = (X.C1230466w) r0
            boolean r0 = r0.Avw()
            if (r0 == 0) goto L_0x0458
            android.content.Context r0 = r13.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.7bW r1 = r0.A0H
            java.lang.Object r0 = r2.get(r8)
            X.66w r0 = (X.C1230466w) r0
            java.lang.String r0 = r0.getInputValue()
            r1.A04(r0)
            return
        L_0x01c1:
            int r0 = r2.size()
            int r4 = r13.A03
            if (r0 != r3) goto L_0x023e
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 != r0) goto L_0x024c
            int r0 = r13.A03
            java.lang.Object r0 = r2.get(r0)
        L_0x01db:
            X.66w r0 = (X.C1230466w) r0
            boolean r0 = r0.Avw()
            if (r0 == 0) goto L_0x0458
            int r2 = r13.A00
            r0 = -1
            if (r2 == r0) goto L_0x0219
            java.util.ArrayList r1 = r13.A06
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x01f0
            int r2 = r2 + -1
        L_0x01f0:
            java.lang.Object r0 = r1.get(r2)
            boolean r0 = r0 instanceof X.C125126Fq
            if (r0 == 0) goto L_0x0219
            X.6Fq r2 = X.AnonymousClass6C9.A0p(r1, r2)
            java.lang.String r0 = r2.getInputValue()
            if (r0 == 0) goto L_0x020a
            int r1 = r0.length()
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0219
        L_0x020a:
            r1 = 2131895970(0x7f1226a2, float:1.9426788E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r13)
            java.lang.String r0 = r0.getString(r1)
        L_0x0215:
            r13.A1I(r0)
            return
        L_0x0219:
            r5 = 0
        L_0x021a:
            java.util.ArrayList r4 = r13.A06
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x026c
            java.lang.Object r0 = r4.get(r5)
            boolean r0 = r0 instanceof X.C125126Fq
            if (r0 == 0) goto L_0x023b
            X.6Fq r2 = X.AnonymousClass6C9.A0p(r4, r5)
            java.lang.String r0 = r2.getInputValue()
            int r1 = r0.length()
            int r0 = r2.A00
            if (r1 == r0) goto L_0x023b
            goto L_0x0251
        L_0x023b:
            int r5 = r5 + 1
            goto L_0x021a
        L_0x023e:
            if (r4 != 0) goto L_0x0264
            X.6Fq r0 = X.AnonymousClass6C9.A0p(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 == r0) goto L_0x039c
        L_0x024c:
            int r0 = r13.A03
            r2.get(r0)
        L_0x0251:
            r2 = 2131895848(0x7f122628, float:1.942654E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r13.A00
        L_0x0258:
            X.AnonymousClass000.A1P(r1, r0, r8)
            android.content.res.Resources r0 = X.C08310eF.A09(r13)
            java.lang.String r0 = r0.getString(r2, r1)
            goto L_0x0215
        L_0x0264:
            if (r4 != r3) goto L_0x0458
        L_0x0266:
            java.lang.Object r0 = r2.get(r4)
            goto L_0x01db
        L_0x026c:
            boolean r0 = r13.A0I
            if (r0 != 0) goto L_0x0458
            r13.A0I = r3
            r5 = 0
        L_0x0273:
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x0334
            java.lang.Object r0 = r4.get(r5)     // Catch:{ Exception -> 0x0330 }
            X.66w r0 = (X.C1230466w) r0     // Catch:{ Exception -> 0x0330 }
            java.lang.Object r1 = r0.getFormDataTag()     // Catch:{ Exception -> 0x0330 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x0330 }
            java.lang.String r0 = "type"
            java.lang.String r10 = r1.getString(r0)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r0 = "subtype"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ Exception -> 0x0330 }
            X.7Ug r0 = r13.A0H     // Catch:{ Exception -> 0x0330 }
            org.json.JSONObject r2 = r0.A0E     // Catch:{ Exception -> 0x0330 }
            java.lang.String r1 = "credential"
            java.lang.Object r0 = r4.get(r5)     // Catch:{ Exception -> 0x0330 }
            X.66w r0 = (X.C1230466w) r0     // Catch:{ Exception -> 0x0330 }
            java.lang.String r0 = r0.getInputValue()     // Catch:{ Exception -> 0x0330 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x0330 }
            X.7Ug r0 = r13.A0H     // Catch:{ Exception -> 0x0330 }
            org.json.JSONObject r12 = r0.A0E     // Catch:{ Exception -> 0x0330 }
            org.json.JSONArray r6 = X.AnonymousClass0x9.A1F()     // Catch:{ Exception -> 0x0330 }
            r2 = 0
        L_0x02ad:
            X.7Ug r0 = r13.A0H     // Catch:{ Exception -> 0x0330 }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ Exception -> 0x0330 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0330 }
            if (r2 >= r0) goto L_0x031f
            java.lang.String r1 = "txnId"
            X.7Ug r0 = r13.A0H     // Catch:{ Exception -> 0x0330 }
            org.json.JSONArray r0 = r0.A0B     // Catch:{ Exception -> 0x0330 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0330 }
            r12.put(r1, r0)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r1 = "credType"
            X.7Ug r0 = r13.A0H     // Catch:{ Exception -> 0x0330 }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ Exception -> 0x0330 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0330 }
            r12.put(r1, r0)     // Catch:{ Exception -> 0x0330 }
            android.content.Context r0 = r13.A02     // Catch:{ Exception -> 0x0330 }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x0330 }
            X.7Ug r0 = r0.A0G     // Catch:{ Exception -> 0x0330 }
            X.7XH r0 = r0.A0G     // Catch:{ Exception -> 0x0330 }
            X.7Sb r0 = r0.A0A     // Catch:{ Exception -> 0x0330 }
            java.lang.String r0 = r0.A00(r12)     // Catch:{ Exception -> 0x0330 }
            r6.put(r0)     // Catch:{ Exception -> 0x0330 }
            android.content.Context r0 = r13.A02     // Catch:{ Exception -> 0x0330 }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x0330 }
            X.7Ug r0 = r0.A0G     // Catch:{ Exception -> 0x0330 }
            X.7XH r0 = r0.A0G     // Catch:{ Exception -> 0x0330 }
            X.7WR r7 = r0.A01()     // Catch:{ Exception -> 0x0330 }
            java.lang.String r9 = r6.getString(r2)     // Catch:{ Exception -> 0x0330 }
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0330 }
            X.8Kt r0 = r7.A00(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0330 }
            r13.A0A = r0     // Catch:{ Exception -> 0x0330 }
            if (r0 == 0) goto L_0x031c
            android.content.Context r0 = r13.A02     // Catch:{ Exception -> 0x0330 }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x0330 }
            X.7Ug r8 = r0.A0G     // Catch:{ Exception -> 0x0330 }
            X.7Ug r0 = r13.A0H     // Catch:{ Exception -> 0x0330 }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ Exception -> 0x0330 }
            java.lang.String r7 = r0.getString(r2)     // Catch:{ Exception -> 0x0330 }
            X.8Kt r1 = r13.A0A     // Catch:{ Exception -> 0x0330 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0330 }
            X.C1454075o.A00(r1, r0)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0330 }
            org.json.JSONObject r0 = r8.A0F     // Catch:{ Exception -> 0x0330 }
            r0.put(r7, r1)     // Catch:{ Exception -> 0x0330 }
        L_0x031c:
            int r2 = r2 + 1
            goto L_0x02ad
        L_0x031f:
            android.content.Context r0 = r13.A02     // Catch:{ Exception -> 0x0330 }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x0330 }
            X.7Ug r2 = r0.A0G     // Catch:{ Exception -> 0x0330 }
            org.json.JSONObject r0 = r2.A0F     // Catch:{ Exception -> 0x0330 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0330 }
            java.util.HashMap r0 = r2.A07     // Catch:{ Exception -> 0x0330 }
            r0.put(r11, r1)     // Catch:{ Exception -> 0x0330 }
        L_0x0330:
            int r5 = r5 + 1
            goto L_0x0273
        L_0x0334:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.7Ug r0 = r13.A0H
            org.json.JSONObject r2 = r0.A0C
            if (r2 == 0) goto L_0x034c
            java.lang.String r1 = "getDeviceDetails"
            java.lang.String r0 = "false"
            java.lang.String r0 = r2.optString(r1, r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x034c:
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x037e
            android.content.Context r1 = r13.A02
            X.2eh r0 = new X.2eh
            r0.<init>(r1)
            java.lang.String r2 = r0.A00()
            X.7Ug r0 = r13.A0H
            org.json.JSONObject r1 = r0.A0E
            android.content.Context r0 = r13.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.7Ug r0 = r0.A0G
            X.7XH r0 = r0.A0G
            X.7WR r0 = r0.A01()
            java.lang.String r2 = r0.A01(r2, r1)
            android.content.Context r0 = r13.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.7Ug r0 = r0.A0G
            java.lang.String r1 = "det"
            java.util.HashMap r0 = r0.A07
            r0.put(r1, r2)
        L_0x037e:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            android.content.Context r0 = r13.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.7Ug r0 = r0.A0G
            java.util.HashMap r1 = r0.A07
            java.lang.String r0 = "credBlocks"
            r2.putSerializable(r0, r1)
            android.os.ResultReceiver r0 = X.AnonymousClass7Q1.A0B
            r0.send(r3, r2)
            X.03q r0 = r13.A0Q()
            r0.finish()
            return
        L_0x039c:
            android.widget.ViewFlipper r0 = r13.A09
            r0.showNext()
        L_0x03a1:
            int r0 = r13.A03
            int r0 = r0 + 1
            r13.A03 = r0
            return
        L_0x03a8:
            r0 = 67
            if (r2 != r0) goto L_0x0458
            org.npci.upi.security.pinactivitycomponent.s r3 = r1.A0I
            org.npci.upi.security.pinactivitycomponent.w r3 = (org.npci.upi.security.pinactivitycomponent.w) r3
            java.lang.Boolean r0 = r3.A0B
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0458
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.A0B = r0
            X.03q r2 = r3.A0Q()
            r1 = 12
            X.3bt r0 = new X.3bt
            r0.<init>(r3, r1)
            r2.runOnUiThread(r0)
            java.util.ArrayList r2 = r3.A06
            boolean r1 = r3.A0A
            int r0 = r3.A00
            if (r1 == 0) goto L_0x03d4
            int r0 = r0 + -1
        L_0x03d4:
            android.view.View r0 = X.AnonymousClass001.A0S(r2, r0)
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0402
            boolean r1 = r3.A0A
            int r0 = r3.A00
            if (r1 == 0) goto L_0x03e6
            int r0 = r0 + -1
        L_0x03e6:
            X.6Fq r2 = X.AnonymousClass6C9.A0p(r2, r0)
            X.03q r1 = r3.A0Q()
            r0 = 2131232788(0x7f080814, float:1.8081695E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0RP.A00(r1, r0)
            if (r1 == 0) goto L_0x03fc
            android.widget.ImageView r0 = r2.A05
            r0.setImageDrawable(r1)
        L_0x03fc:
            android.widget.ImageView r0 = r2.A05
            r2.A00(r0, r8)
            return
        L_0x0402:
            int r0 = r3.A00
            goto L_0x03e6
        L_0x0405:
            int r0 = r13.A03
            java.lang.Object r4 = r2.get(r0)
            X.66w r4 = (X.C1230466w) r4
            X.03q r1 = r13.A0Q()
            r0 = 2131232167(0x7f0805a7, float:1.8080436E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass0RP.A00(r1, r0)
            X.03q r1 = r13.A0Q()
            r0 = 2131231112(0x7f080188, float:1.8078296E38)
            android.graphics.drawable.Drawable r12 = X.AnonymousClass0RP.A00(r1, r0)
            X.03q r1 = r13.A0Q()
            r0 = 2131231113(0x7f080189, float:1.8078298E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass0RP.A00(r1, r0)
            X.03q r1 = r13.A0Q()
            android.content.Context r0 = r13.A02
            X.6Fq r2 = new X.6Fq
            r2.<init>(r1, r0)
            r14 = 13
            X.5ep r6 = new X.5ep
            r9 = r6
            r10 = r4
            r11 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            r1 = 2131895823(0x7f12260f, float:1.942649E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r13)
            java.lang.String r7 = r0.getString(r1)
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0459
            r5 = r3
        L_0x0453:
            r9 = 1
            r10 = r9
            r4.Avx(r5, r6, r7, r8, r9, r10)
        L_0x0458:
            return
        L_0x0459:
            boolean r0 = r4.getToggleCheckBox()
            if (r0 != 0) goto L_0x0453
            r5 = r12
            goto L_0x0453
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173368Px.Avu(android.view.View, int):void");
    }

    public static int A00(AbstractList abstractList, int i) {
        return ((C1230466w) abstractList.get(i)).getInputValue().length();
    }
}
