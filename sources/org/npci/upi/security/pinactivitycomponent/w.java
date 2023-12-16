package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0RP;
import X.AnonymousClass6C9;
import X.C08310eF;
import X.C109595es;
import X.C1230466w;
import X.C125126Fq;
import X.C151317Ug;
import X.C172378Kt;
import X.C180068kR;
import X.C48812fW;
import X.C71303bt;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import com.whatsapp.R;
import java.util.ArrayList;

public class w extends s implements C180068kR {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public View A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public ViewFlipper A09;
    public C172378Kt A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public String A0G;
    public C151317Ug A0H;
    public boolean A0I;
    public boolean A0J;

    public final void A1N(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(A0Q());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setDividerDrawable(C08310eF.A09(this).getDrawable(R.drawable.fragment_transparent_divider));
        linearLayout.setPadding(16, 0, 16, 0);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setId(i);
        this.A09.addView(linearLayout, i2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:7|8|9|10|11|12|13|14|(2:17|15)|34|18|19|20|(1:22)(1:23)|24|25|26|27|(2:28|29)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:7|8|9|10|11|12|13|14|(2:17|15)|34|18|19|20|(1:22)(1:23)|24|25|26|27|28|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0132 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d A[Catch:{  }, LOOP:0: B:15:0x0093->B:17:0x009d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c2 A[Catch:{ Exception -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c4 A[Catch:{ Exception -> 0x0132 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r18, android.view.View r19) {
        /*
            r17 = this;
            r5 = r17
            r0 = r19
            r5.A04 = r0
            r1 = r18
            super.A0w(r1, r0)
            android.content.Context r1 = r5.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.7Ug r1 = r1.A0G
            r5.A0H = r1
            r1 = 2131431153(0x7f0b0ef1, float:1.8484027E38)
            android.widget.LinearLayout r1 = X.C86664Kz.A0v(r0, r1)
            r5.A06 = r1
            r1 = 2131431154(0x7f0b0ef2, float:1.848403E38)
            android.widget.LinearLayout r1 = X.C86664Kz.A0v(r0, r1)
            r5.A05 = r1
            r1 = 2131432738(0x7f0b1522, float:1.8487242E38)
            android.widget.LinearLayout r1 = X.C86664Kz.A0v(r0, r1)
            r5.A07 = r1
            r1 = 2131432740(0x7f0b1524, float:1.8487246E38)
            android.widget.LinearLayout r1 = X.C86664Kz.A0v(r0, r1)
            r5.A08 = r1
            android.content.Context r1 = r5.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.7Ug r1 = r1.A0G
            java.lang.Boolean r1 = r1.A02
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0049
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.A0C = r1
        L_0x0049:
            r1 = 2131434723(0x7f0b1ce3, float:1.8491268E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ViewFlipper r1 = (android.widget.ViewFlipper) r1
            r5.A09 = r1
            X.7Ug r1 = r5.A0H
            boolean r1 = r1.A00()
            r10 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            if (r1 == 0) goto L_0x016c
            android.content.Context r1 = r5.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.7Ug r1 = r1.A0G
            boolean r1 = r1.A0J
            if (r1 == 0) goto L_0x016c
            org.json.JSONArray r4 = X.AnonymousClass0x9.A1F()
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{  }
            java.lang.String r2 = "type"
            java.lang.String r1 = "CARD"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "subtype"
            java.lang.String r1 = "CARDDETAILS"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "dType"
            java.lang.String r1 = "NUM"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "dLength"
            java.lang.String r1 = "6"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            r4.put(r10, r3)     // Catch:{  }
            r3 = 0
        L_0x0093:
            X.7Ug r1 = r5.A0H     // Catch:{  }
            org.json.JSONArray r1 = r1.A08     // Catch:{  }
            int r1 = r1.length()     // Catch:{  }
            if (r3 >= r1) goto L_0x00ac
            int r2 = r3 + 1
            X.7Ug r1 = r5.A0H     // Catch:{  }
            org.json.JSONArray r1 = r1.A08     // Catch:{  }
            java.lang.Object r1 = r1.get(r3)     // Catch:{  }
            r4.put(r2, r1)     // Catch:{  }
            r3 = r2
            goto L_0x0093
        L_0x00ac:
            X.7Ug r1 = r5.A0H     // Catch:{  }
            r1.A08 = r4     // Catch:{  }
            java.lang.String r2 = "dLength"
            org.json.JSONObject r4 = r4.getJSONObject(r10)     // Catch:{ Exception -> 0x0132 }
            java.lang.String r1 = "subtype"
            java.lang.String r9 = r4.getString(r1)     // Catch:{ Exception -> 0x0132 }
            int r1 = r4.optInt(r2)     // Catch:{ Exception -> 0x0132 }
            if (r1 != 0) goto L_0x00c4
            r11 = 6
            goto L_0x00c8
        L_0x00c4:
            int r11 = r4.optInt(r2)     // Catch:{ Exception -> 0x0132 }
        L_0x00c8:
            java.lang.Object[] r3 = X.AnonymousClass002.A0M()     // Catch:{ Exception -> 0x0132 }
            X.7Ug r2 = r5.A0H     // Catch:{ Exception -> 0x0132 }
            java.lang.String r1 = r2.A06     // Catch:{ Exception -> 0x0132 }
            r3[r10] = r1     // Catch:{ Exception -> 0x0132 }
            java.lang.String r2 = r2.A05     // Catch:{ Exception -> 0x0132 }
            r1 = 1
            r3[r1] = r2     // Catch:{ Exception -> 0x0132 }
            r2 = 2131895734(0x7f1225b6, float:1.942631E38)
            android.content.res.Resources r1 = X.C08310eF.A09(r5)     // Catch:{ Exception -> 0x0132 }
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ Exception -> 0x0132 }
            r5.A0G = r1     // Catch:{ Exception -> 0x0132 }
            r2 = 2131895735(0x7f1225b7, float:1.9426311E38)
            android.content.res.Resources r1 = X.C08310eF.A09(r5)     // Catch:{ Exception -> 0x0132 }
            java.lang.String r7 = r1.getString(r2)     // Catch:{ Exception -> 0x0132 }
            java.lang.String r8 = r5.A0G     // Catch:{ Exception -> 0x0132 }
            java.lang.Boolean r6 = r5.A0C     // Catch:{ Exception -> 0x0132 }
            X.6Fq r3 = r5.A1H(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0132 }
            r2 = 2131895733(0x7f1225b5, float:1.9426307E38)
            android.content.res.Resources r1 = X.C08310eF.A09(r5)     // Catch:{ Exception -> 0x0132 }
            java.lang.String r7 = r1.getString(r2)     // Catch:{ Exception -> 0x0132 }
            r11 = 4
            java.lang.String r8 = r5.A0G     // Catch:{ Exception -> 0x0132 }
            java.lang.Boolean r6 = r5.A0C     // Catch:{ Exception -> 0x0132 }
            X.6Fq r1 = r5.A1H(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0132 }
            java.util.ArrayList r3 = X.C18300x5.A0s(r3)     // Catch:{ Exception -> 0x0132 }
            r3.add(r1)     // Catch:{ Exception -> 0x0132 }
            X.03q r1 = r5.A0Q()     // Catch:{ Exception -> 0x0132 }
            X.6FX r2 = new X.6FX     // Catch:{ Exception -> 0x0132 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0132 }
            r2.A01(r3, r5)     // Catch:{ Exception -> 0x0132 }
            r2.A02 = r4     // Catch:{ Exception -> 0x0132 }
            java.util.ArrayList r1 = r5.A06     // Catch:{ Exception -> 0x0132 }
            r1.add(r2)     // Catch:{ Exception -> 0x0132 }
            r1 = 2131429303(0x7f0b07b7, float:1.8480275E38)
            r5.A1N(r1, r10)     // Catch:{ Exception -> 0x0132 }
            android.widget.LinearLayout r1 = X.C86664Kz.A0v(r0, r1)     // Catch:{ Exception -> 0x0132 }
            r1.addView(r2)     // Catch:{ Exception -> 0x0132 }
        L_0x0132:
            java.util.ArrayList r1 = r5.A06     // Catch:{  }
            java.lang.Object r6 = r1.get(r10)     // Catch:{  }
            X.66w r6 = (X.C1230466w) r6     // Catch:{  }
            X.03q r2 = r5.A0Q()     // Catch:{  }
            r1 = 2131231112(0x7f080188, float:1.8078296E38)
            android.graphics.drawable.Drawable r7 = X.AnonymousClass0RP.A00(r2, r1)     // Catch:{  }
            X.03q r2 = r5.A0Q()     // Catch:{  }
            r1 = 2131231113(0x7f080189, float:1.8078298E38)
            android.graphics.drawable.Drawable r13 = X.AnonymousClass0RP.A00(r2, r1)     // Catch:{  }
            r16 = 14
            X.5ep r8 = new X.5ep     // Catch:{  }
            r11 = r8
            r12 = r6
            r14 = r7
            r15 = r5
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{  }
            r2 = 2131895823(0x7f12260f, float:1.942649E38)
            android.content.res.Resources r1 = X.C08310eF.A09(r5)     // Catch:{ JSONException -> 0x0172 }
            java.lang.String r9 = r1.getString(r2)     // Catch:{ JSONException -> 0x0172 }
            r11 = 1
            r12 = r11
            r6.Avx(r7, r8, r9, r10, r11, r12)     // Catch:{ JSONException -> 0x0172 }
            goto L_0x0172
        L_0x016c:
            r5.A1O(r0, r2)
            r5.A1M(r10)
        L_0x0172:
            r1 = 2
            java.util.ArrayList r0 = r0.getFocusables(r1)
            android.view.View r0 = X.AnonymousClass001.A0S(r0, r10)
            r0.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.w.A0w(android.os.Bundle, android.view.View):void");
    }

    public final void A1M(int i) {
        String str;
        int i2 = this.A00;
        if (i2 != -1) {
            ArrayList arrayList = this.A06;
            if (this.A0A) {
                i2--;
            }
            if (arrayList.get(i2) instanceof C125126Fq) {
                C125126Fq A0p = AnonymousClass6C9.A0p(arrayList, i2);
                A1L(A0p);
                A0p.A0I = true;
                try {
                    str = new C48812fW(this.A02).A01.getString("otp_type_bank", "");
                } catch (Exception unused) {
                    str = null;
                }
                if (!str.isEmpty()) {
                    AnonymousClass000.A0A().postDelayed(new C71303bt(this, 13), 1500);
                }
            }
        }
        ArrayList arrayList2 = this.A06;
        int size = arrayList2.size();
        for (int i3 = i; i3 < size; i3++) {
            boolean z = this.A0A;
            int i4 = this.A00;
            int i5 = i4;
            if (z) {
                i4--;
            }
            if (i3 != i4) {
                if (i5 != -1 && (arrayList2.get(i3) instanceof C125126Fq)) {
                    C1230466w r1 = (C1230466w) arrayList2.get(i3);
                    if (!(r1 instanceof C125126Fq) || !((C125126Fq) r1).A0F.equals("SMS") || !this.A0A) {
                        C1230466w r12 = (C1230466w) arrayList2.get(i3);
                        if ((r12 instanceof C125126Fq) && ((C125126Fq) r12).A0F.equals("AADHAAR")) {
                        }
                    }
                }
                C1230466w r7 = (C1230466w) arrayList2.get(i3);
                Drawable A002 = AnonymousClass0RP.A00(A0Q(), R.drawable.ic_visibility_on);
                Drawable A003 = AnonymousClass0RP.A00(A0Q(), R.drawable.ic_visibility_blue_24px);
                Drawable A004 = AnonymousClass0RP.A00(A0Q(), R.drawable.ic_visibility_off);
                String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
                String string2 = C08310eF.A09(this).getString(R.string.f11nameremoved);
                r7.Avx(A003, new C109595es(r7, A004, A002, this, string, string2, 1), string2, 0, false, false);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.6FX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.6Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v149, resolved type: X.6FX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v150, resolved type: X.6FX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v151, resolved type: X.6FX} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0288, code lost:
        r8 = r5.optString("value", r8);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x042f A[Catch:{ Exception -> 0x0523 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0515 A[Catch:{ Exception -> 0x0523 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0216 A[Catch:{ Exception -> 0x0523 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1O(android.view.View r28, java.lang.Integer r29) {
        /*
            r27 = this;
            java.lang.String r19 = "mobileNumber"
            java.lang.String r18 = "dLength"
            java.lang.String r17 = "subtype"
            java.lang.String r16 = "MPIN"
            r3 = r27
            X.7Ug r0 = r3.A0H
            org.json.JSONArray r0 = r0.A08
            if (r0 == 0) goto L_0x0542
            int r2 = r29.intValue()
        L_0x0014:
            X.7Ug r0 = r3.A0H
            org.json.JSONArray r0 = r0.A08
            int r0 = r0.length()
            r7 = 1
            if (r2 >= r0) goto L_0x0527
            X.7Ug r0 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r0 = r0.A08     // Catch:{ Exception -> 0x0523 }
            org.json.JSONObject r4 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x0523 }
            r0 = r17
            java.lang.String r1 = r4.getString(r0)     // Catch:{ Exception -> 0x0523 }
            r0 = r18
            int r5 = r4.optInt(r0)     // Catch:{ Exception -> 0x0523 }
            r0 = 6
            if (r5 == 0) goto L_0x003c
            r0 = r18
            int r0 = r4.optInt(r0)     // Catch:{ Exception -> 0x0523 }
        L_0x003c:
            java.lang.String r5 = "securePinUrl"
            boolean r6 = r4.has(r5)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r14 = "ATMPIN"
            r5 = 0
            if (r6 != 0) goto L_0x0091
            boolean r6 = r14.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r6 == 0) goto L_0x0091
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0523 }
            r3.A0F = r6     // Catch:{ Exception -> 0x0523 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0523 }
            X.AnonymousClass000.A1P(r7, r0, r5)     // Catch:{ Exception -> 0x0523 }
            r6 = 2131896189(0x7f12277d, float:1.9427232E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r8 = r5.getString(r6, r7)     // Catch:{ Exception -> 0x0523 }
            r6 = 2131895825(0x7f122611, float:1.9426494E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r9 = r5.getString(r6)     // Catch:{ Exception -> 0x0523 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x0523 }
            r6 = r3
            r7 = r5
            r10 = r1
            r11 = r2
            r12 = r0
            X.6Fq r5 = r6.A1H(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0523 }
            r5.A0C = r4     // Catch:{ Exception -> 0x0523 }
            java.util.ArrayList r1 = r3.A06     // Catch:{ Exception -> 0x0523 }
            r1.add(r5)     // Catch:{ Exception -> 0x0523 }
            r4 = 2131434131(0x7f0b1a93, float:1.8490067E38)
            r3.A1N(r4, r2)     // Catch:{ Exception -> 0x0523 }
            r1 = r28
            android.widget.LinearLayout r1 = X.C86664Kz.A0v(r1, r4)     // Catch:{ Exception -> 0x0523 }
            r1.addView(r5)     // Catch:{ Exception -> 0x0523 }
            r3.A02 = r0     // Catch:{ Exception -> 0x0523 }
            goto L_0x0523
        L_0x0091:
            r6 = r16
            boolean r21 = r1.equals(r6)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r20 = "SIGNATURE"
            java.lang.String r13 = "TOTP"
            java.lang.String r12 = "HOTP"
            java.lang.String r11 = "EMAIL"
            java.lang.String r10 = "SMS"
            java.lang.String r9 = "OTP"
            java.lang.String r6 = "AADHAAR"
            java.lang.String r7 = "NMPIN"
            if (r21 != 0) goto L_0x00e9
            boolean r8 = r1.equals(r7)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            boolean r8 = r14.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            boolean r8 = r9.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            boolean r8 = r10.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            boolean r8 = r11.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            boolean r8 = r12.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            boolean r8 = r13.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            boolean r8 = r6.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            java.lang.String r8 = "CARDDETAILS"
            boolean r8 = r8.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00e9
            r8 = r20
            boolean r8 = r8.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r8 == 0) goto L_0x0523
        L_0x00e9:
            boolean r8 = r1.equals(r7)     // Catch:{ Exception -> 0x0523 }
            if (r8 != 0) goto L_0x00f9
            if (r21 == 0) goto L_0x01c6
            X.7Ug r8 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            boolean r8 = r8.A00()     // Catch:{ Exception -> 0x0523 }
            if (r8 == 0) goto L_0x01c6
        L_0x00f9:
            r7 = 2131895828(0x7f122614, float:1.94265E38)
            android.content.res.Resources r6 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r6 = r6.getString(r7)     // Catch:{ Exception -> 0x0523 }
            r3.A0G = r6     // Catch:{ Exception -> 0x0523 }
            boolean r6 = r3.A0J     // Catch:{ Exception -> 0x0523 }
            if (r6 == 0) goto L_0x017d
            java.lang.Object[] r8 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x0523 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r8[r5] = r10     // Catch:{ Exception -> 0x0523 }
            r7 = 2131896194(0x7f122782, float:1.9427242E38)
            android.content.res.Resources r6 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r22 = r6.getString(r7, r8)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x0523 }
            java.lang.Boolean r6 = r3.A0C     // Catch:{ Exception -> 0x0523 }
            r20 = r3
            r21 = r6
            r23 = r7
            r24 = r1
            r25 = r2
            r26 = r0
            X.6Fq r9 = r20.A1H(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0523 }
            java.lang.Object[] r8 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x0523 }
            r8[r5] = r10     // Catch:{ Exception -> 0x0523 }
            r7 = 2131896192(0x7f122780, float:1.9427238E38)
            android.content.res.Resources r6 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r22 = r6.getString(r7, r8)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x0523 }
            java.lang.Boolean r6 = r3.A0C     // Catch:{ Exception -> 0x0523 }
            r21 = r6
            r23 = r7
            X.6Fq r0 = r20.A1H(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0523 }
            r3.A0J = r5     // Catch:{ Exception -> 0x0523 }
        L_0x0152:
            java.util.ArrayList r1 = X.C18300x5.A0s(r9)     // Catch:{ Exception -> 0x0523 }
            r1.add(r0)     // Catch:{ Exception -> 0x0523 }
            X.03q r0 = r3.A0Q()     // Catch:{ Exception -> 0x0523 }
            X.6FX r5 = new X.6FX     // Catch:{ Exception -> 0x0523 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0523 }
            r5.A01(r1, r3)     // Catch:{ Exception -> 0x0523 }
            r5.A02 = r4     // Catch:{ Exception -> 0x0523 }
            java.util.ArrayList r0 = r3.A06     // Catch:{ Exception -> 0x0523 }
            r0.add(r5)     // Catch:{ Exception -> 0x0523 }
            r1 = 2131434130(0x7f0b1a92, float:1.8490065E38)
            r3.A1N(r1, r2)     // Catch:{ Exception -> 0x0523 }
            r0 = r28
            android.widget.LinearLayout r0 = X.C86664Kz.A0v(r0, r1)     // Catch:{ Exception -> 0x0523 }
        L_0x0178:
            r0.addView(r5)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0523
        L_0x017d:
            java.lang.Object[] r9 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x0523 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r9[r5] = r8     // Catch:{ Exception -> 0x0523 }
            r7 = 2131896197(0x7f122785, float:1.9427248E38)
            android.content.res.Resources r6 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r11 = r6.getString(r7, r9)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x0523 }
            java.lang.Boolean r6 = r3.A0C     // Catch:{ Exception -> 0x0523 }
            r9 = r3
            r10 = r6
            r12 = r7
            r13 = r1
            r14 = r2
            r15 = r0
            X.6Fq r9 = r9.A1H(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0523 }
            java.lang.Object[] r7 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x0523 }
            r7[r5] = r8     // Catch:{ Exception -> 0x0523 }
            r6 = 2131896191(0x7f12277f, float:1.9427236E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r22 = r5.getString(r6, r7)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r6 = r3.A0G     // Catch:{ Exception -> 0x0523 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x0523 }
            r20 = r3
            r21 = r5
            r23 = r6
            r24 = r1
            r25 = r2
            r26 = r0
            X.6Fq r0 = r20.A1H(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0152
        L_0x01c6:
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x0523 }
            int r15 = r5.length()     // Catch:{ Exception -> 0x0523 }
            java.lang.String r8 = ""
            r5 = 1
            if (r15 <= r5) goto L_0x01d6
            if (r21 == 0) goto L_0x01d6
            goto L_0x01d8
        L_0x01d6:
            r7 = r8
            goto L_0x0210
        L_0x01d8:
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r15 = r5.A08     // Catch:{ Exception -> 0x0523 }
            int r5 = r2 + 1
            org.json.JSONObject r15 = r15.getJSONObject(r5)     // Catch:{ Exception -> 0x0523 }
            r5 = r17
            java.lang.String r5 = r15.getString(r5)     // Catch:{ Exception -> 0x0523 }
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x01d6
            r5 = 1
            r3.A0J = r5     // Catch:{ Exception -> 0x0523 }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0523 }
            X.AnonymousClass000.A1L(r15, r0)     // Catch:{ Exception -> 0x0523 }
            r7 = 2131896195(0x7f122783, float:1.9427244E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = r5.getString(r7, r15)     // Catch:{ Exception -> 0x0523 }
            r15 = 2131895828(0x7f122614, float:1.94265E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r15)     // Catch:{ Exception -> 0x0523 }
            r3.A0G = r5     // Catch:{ Exception -> 0x0523 }
            r3.A00 = r0     // Catch:{ Exception -> 0x0523 }
        L_0x0210:
            boolean r5 = r7.equals(r8)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0413
            if (r21 == 0) goto L_0x03db
            java.lang.Object[] r9 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x0523 }
            X.AnonymousClass000.A1L(r9, r0)     // Catch:{ Exception -> 0x0523 }
            r7 = 2131896193(0x7f122781, float:1.942724E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = r5.getString(r7, r9)     // Catch:{ Exception -> 0x0523 }
            X.7Ug r10 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONObject r9 = r10.A0E     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = "credType"
            org.json.JSONArray r5 = r9.getJSONArray(r5)     // Catch:{ Exception -> 0x0523 }
            r10.A0A = r5     // Catch:{ Exception -> 0x0523 }
            java.lang.String r11 = "mandate"
            r10 = r11
            r9 = 0
        L_0x023a:
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0523 }
            java.lang.String r14 = "value"
            java.lang.String r13 = "name"
            if (r9 >= r5) goto L_0x0263
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            java.lang.String r12 = X.AnonymousClass6C7.A0m(r13, r5, r9)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = "mandateSubType"
            boolean r5 = r12.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0260
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            java.lang.String r10 = X.AnonymousClass6C7.A0m(r14, r5, r9)     // Catch:{ Exception -> 0x0523 }
        L_0x0260:
            int r9 = r9 + 1
            goto L_0x023a
        L_0x0263:
            r9 = 0
        L_0x0264:
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0523 }
            if (r9 >= r5) goto L_0x02c6
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            java.lang.String r12 = X.AnonymousClass6C7.A0m(r13, r5, r9)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = "payeeName"
            boolean r5 = r12.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x028d
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x0523 }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x0523 }
        L_0x0288:
            java.lang.String r8 = r5.optString(r14, r8)     // Catch:{ Exception -> 0x0523 }
            goto L_0x02c6
        L_0x028d:
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            java.lang.String r12 = X.AnonymousClass6C7.A0m(r13, r5, r9)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = "account"
            boolean r5 = r12.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x02a8
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x0523 }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x0523 }
            goto L_0x0288
        L_0x02a8:
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x0523 }
            java.lang.String r12 = X.AnonymousClass6C7.A0m(r13, r5, r9)     // Catch:{ Exception -> 0x0523 }
            r5 = r19
            boolean r5 = r12.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x02c3
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r8 = r5.A09     // Catch:{ Exception -> 0x0523 }
            r5 = r19
            java.lang.String r8 = X.AnonymousClass6C7.A0m(r5, r8, r9)     // Catch:{ Exception -> 0x0523 }
            goto L_0x02c6
        L_0x02c3:
            int r9 = r9 + 1
            goto L_0x0264
        L_0x02c6:
            r13 = 0
        L_0x02c7:
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x0523 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0523 }
            if (r13 >= r5) goto L_0x03d8
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x0523 }
            java.lang.String r9 = r5.getString(r13)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = "pay"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x03c7
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x0523 }
            java.lang.String r9 = r5.getString(r13)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = "collect"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x03c7
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r13)     // Catch:{ Exception -> 0x0523 }
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x03c7
            X.7Ug r5 = r3.A0H     // Catch:{ Exception -> 0x0523 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r13)     // Catch:{ Exception -> 0x0523 }
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x03ba
            int r5 = r10.hashCode()     // Catch:{ Exception -> 0x0523 }
            switch(r5) {
                case -1352294148: goto L_0x03a1;
                case -1068795718: goto L_0x0389;
                case -934343034: goto L_0x0359;
                case -690213213: goto L_0x0341;
                case -280604931: goto L_0x0371;
                case 106440182: goto L_0x0329;
                default: goto L_0x0314;
            }     // Catch:{ Exception -> 0x0523 }
        L_0x0314:
            r5 = 1
            java.lang.Object[] r12 = X.AnonymousClass6C9.A1Z(r8, r5)     // Catch:{ Exception -> 0x0523 }
            r9 = 2131895831(0x7f122617, float:1.9426506E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r9, r12)     // Catch:{ Exception -> 0x0523 }
        L_0x0324:
            r3.A0G = r5     // Catch:{ Exception -> 0x0523 }
            int r13 = r13 + 1
            goto L_0x02c7
        L_0x0329:
            java.lang.String r5 = "pause"
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0314
            java.lang.Object[] r12 = X.AnonymousClass000.A1b(r8)     // Catch:{ Exception -> 0x0523 }
            r9 = 2131895834(0x7f12261a, float:1.9426512E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r9, r12)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0324
        L_0x0341:
            java.lang.String r5 = "register"
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0314
            java.lang.Object[] r12 = X.AnonymousClass000.A1b(r8)     // Catch:{ Exception -> 0x0523 }
            r9 = 2131895835(0x7f12261b, float:1.9426514E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r9, r12)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0324
        L_0x0359:
            java.lang.String r5 = "revoke"
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0314
            java.lang.Object[] r12 = X.AnonymousClass000.A1b(r8)     // Catch:{ Exception -> 0x0523 }
            r9 = 2131895836(0x7f12261c, float:1.9426516E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r9, r12)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0324
        L_0x0371:
            java.lang.String r5 = "unpause"
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0314
            java.lang.Object[] r12 = X.AnonymousClass000.A1b(r8)     // Catch:{ Exception -> 0x0523 }
            r9 = 2131895837(0x7f12261d, float:1.9426518E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r9, r12)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0324
        L_0x0389:
            java.lang.String r5 = "modify"
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0314
            java.lang.Object[] r12 = X.AnonymousClass000.A1b(r8)     // Catch:{ Exception -> 0x0523 }
            r9 = 2131895833(0x7f122619, float:1.942651E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r9, r12)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0324
        L_0x03a1:
            java.lang.String r5 = "create"
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0314
            java.lang.Object[] r12 = X.AnonymousClass000.A1b(r8)     // Catch:{ Exception -> 0x0523 }
            r9 = 2131895832(0x7f122618, float:1.9426508E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r9, r12)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0324
        L_0x03ba:
            r9 = 2131895828(0x7f122614, float:1.94265E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r9)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0324
        L_0x03c7:
            java.lang.Object[] r9 = X.AnonymousClass000.A1b(r8)     // Catch:{ Exception -> 0x0523 }
            r8 = 2131895830(0x7f122616, float:1.9426504E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r8, r9)     // Catch:{ Exception -> 0x0523 }
            r3.A0G = r5     // Catch:{ Exception -> 0x0523 }
        L_0x03d8:
            r3.A00 = r0     // Catch:{ Exception -> 0x0523 }
            goto L_0x0413
        L_0x03db:
            boolean r5 = r9.equals(r1)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r9 = " "
            if (r5 != 0) goto L_0x043d
            boolean r5 = r10.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x043d
            boolean r5 = r11.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x043d
            boolean r5 = r12.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x043d
            boolean r5 = r13.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x043d
            boolean r5 = r14.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x048e
            java.lang.Object[] r8 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x0523 }
            X.AnonymousClass000.A1L(r8, r0)     // Catch:{ Exception -> 0x0523 }
            r7 = 2131896189(0x7f12277d, float:1.9427232E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = r5.getString(r7, r8)     // Catch:{ Exception -> 0x0523 }
        L_0x0413:
            java.lang.String r8 = r3.A0G     // Catch:{ Exception -> 0x0523 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x0523 }
            r9 = r3
            r10 = r5
            r11 = r7
            r12 = r8
            r13 = r1
            r14 = r2
            r15 = r0
            X.6Fq r5 = r9.A1H(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0523 }
            r5.A0C = r4     // Catch:{ Exception -> 0x0523 }
            java.util.ArrayList r0 = r3.A06     // Catch:{ Exception -> 0x0523 }
            r0.add(r5)     // Catch:{ Exception -> 0x0523 }
            boolean r0 = r6.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x0515
            r1 = 2131434131(0x7f0b1a93, float:1.8490067E38)
            r3.A1N(r1, r2)     // Catch:{ Exception -> 0x0523 }
            r0 = r28
            android.widget.LinearLayout r0 = X.C86664Kz.A0v(r0, r1)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0178
        L_0x043d:
            java.lang.Object[] r8 = X.AnonymousClass002.A0L()     // Catch:{ Exception -> 0x0523 }
            X.AnonymousClass000.A1L(r8, r0)     // Catch:{ Exception -> 0x0523 }
            r7 = 2131896190(0x7f12277e, float:1.9427234E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = r5.getString(r7, r8)     // Catch:{ Exception -> 0x0523 }
            r8 = 2131895826(0x7f122612, float:1.9426496E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r10 = r5.getString(r8)     // Catch:{ Exception -> 0x0523 }
            r3.A0G = r10     // Catch:{ Exception -> 0x0523 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0l(r9)     // Catch:{ Exception -> 0x0523 }
            r8 = 2131895684(0x7f122584, float:1.9426208E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r8)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = X.AnonymousClass000.A0X(r5, r9)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r10.concat(r5)     // Catch:{ Exception -> 0x0523 }
            r3.A0G = r5     // Catch:{ Exception -> 0x0523 }
            r3.A00 = r2     // Catch:{ Exception -> 0x0523 }
            r3.A01 = r0     // Catch:{ Exception -> 0x0523 }
            X.03q r8 = r3.A0Q()     // Catch:{ Exception -> 0x0523 }
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0413
            org.npci.upi.security.pinactivitycomponent.GetCredential r8 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r8     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = "android.permission.READ_SMS"
            int r5 = r8.checkCallingOrSelfPermission(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x0413
            int r9 = r3.A01     // Catch:{ Exception -> 0x0523 }
            goto L_0x04e3
        L_0x048e:
            boolean r5 = r6.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x050c
            r5 = 1
            r3.A0A = r5     // Catch:{ Exception -> 0x0523 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0523 }
            X.AnonymousClass000.A1L(r8, r0)     // Catch:{ Exception -> 0x0523 }
            r7 = 2131896188(0x7f12277c, float:1.942723E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = r5.getString(r7, r8)     // Catch:{ Exception -> 0x0523 }
            r8 = 2131895824(0x7f122610, float:1.9426492E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r10 = r5.getString(r8)     // Catch:{ Exception -> 0x0523 }
            r3.A0G = r10     // Catch:{ Exception -> 0x0523 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0l(r9)     // Catch:{ Exception -> 0x0523 }
            r8 = 2131895609(0x7f122539, float:1.9426056E38)
            android.content.res.Resources r5 = X.C08310eF.A09(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r5.getString(r8)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = X.AnonymousClass000.A0X(r5, r9)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r10.concat(r5)     // Catch:{ Exception -> 0x0523 }
            r3.A0G = r5     // Catch:{ Exception -> 0x0523 }
            r3.A01 = r0     // Catch:{ Exception -> 0x0523 }
            X.03q r8 = r3.A0Q()     // Catch:{ Exception -> 0x0523 }
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0413
            org.npci.upi.security.pinactivitycomponent.GetCredential r8 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r8     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = "android.permission.READ_SMS"
            int r5 = r8.checkCallingOrSelfPermission(r5)     // Catch:{ Exception -> 0x0523 }
            if (r5 != 0) goto L_0x0413
            int r9 = r3.A01     // Catch:{ Exception -> 0x0523 }
        L_0x04e3:
            X.03q r8 = r3.A0Q()     // Catch:{ Exception -> 0x0523 }
            if (r8 == 0) goto L_0x04f2
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x04f2
            r5 = r8
            org.npci.upi.security.pinactivitycomponent.GetCredential r5 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r5     // Catch:{ Exception -> 0x0523 }
            r5.A01 = r9     // Catch:{ Exception -> 0x0523 }
        L_0x04f2:
            org.npci.upi.security.pinactivitycomponent.u r5 = new org.npci.upi.security.pinactivitycomponent.u     // Catch:{ Exception -> 0x0523 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0523 }
            java.util.Timer r10 = new java.util.Timer     // Catch:{ Exception -> 0x0523 }
            r10.<init>()     // Catch:{ Exception -> 0x0523 }
            r3.A07 = r10     // Catch:{ Exception -> 0x0523 }
            X.8Tw r11 = new X.8Tw     // Catch:{ Exception -> 0x0523 }
            r11.<init>(r3, r5, r9)     // Catch:{ Exception -> 0x0523 }
            r12 = 100
            r14 = 2000(0x7d0, double:9.88E-321)
            r10.scheduleAtFixedRate(r11, r12, r14)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0413
        L_0x050c:
            r5 = r20
            boolean r5 = r5.equals(r1)     // Catch:{ Exception -> 0x0523 }
            if (r5 == 0) goto L_0x0413
            goto L_0x0527
        L_0x0515:
            r1 = 2131434129(0x7f0b1a91, float:1.8490063E38)
            r3.A1N(r1, r2)     // Catch:{ Exception -> 0x0523 }
            r0 = r28
            android.widget.LinearLayout r0 = X.C86664Kz.A0v(r0, r1)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0178
        L_0x0523:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0527:
            java.lang.Boolean r0 = r3.A0D
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0542
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A0E = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.A0D = r0
            android.widget.ViewFlipper r0 = r3.A09
            r0.showNext()
            int r0 = r3.A03
            int r0 = r0 + 1
            r3.A03 = r0
        L_0x0542:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.w.A1O(android.view.View, java.lang.Integer):void");
    }

    public w() {
        Boolean bool = Boolean.FALSE;
        this.A0F = bool;
        this.A09 = null;
        this.A08 = null;
        this.A04 = null;
        this.A0I = false;
        this.A0B = bool;
        this.A0G = "";
        this.A0C = bool;
        this.A0J = false;
        this.A0D = bool;
        this.A0E = bool;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }
}
