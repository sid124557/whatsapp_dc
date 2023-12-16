package X;

import android.content.Context;

/* renamed from: X.9oV  reason: invalid class name and case insensitive filesystem */
public class C203909oV extends C197739dn {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203909oV(Context context, C40602Ha r2, C84104Ba r3, Object obj, Object obj2, Object obj3, int i) {
        super(context, r2, r3);
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public void A03(AnonymousClass34V r4) {
        switch (this.A03) {
            case 0:
                C1899593h.A1G(((AnonymousClass9U5) this.A00).A0H, r4, "Tos onRequestError: ", AnonymousClass001.A0o());
                break;
            case 1:
                ((AnonymousClass9R8) this.A01).A00(r4);
                return;
            case 2:
                A06(r4);
                return;
            case 3:
                ((AnonymousClass9RY) this.A01).A00(r4);
                return;
            case 4:
                ((C203399nd) this.A01).BJz(r4, (Integer) this.A02);
                return;
            case 5:
                break;
            default:
                ((AnonymousClass9RM) this.A01).A00(r4);
                return;
        }
        ((AnonymousClass4EY) this.A01).Ba4(r4);
    }

    public void A04(AnonymousClass34V r4) {
        switch (this.A03) {
            case 0:
                C1899593h.A1G(((AnonymousClass9U5) this.A00).A0H, r4, "Tos onResponseError: ", AnonymousClass001.A0o());
                break;
            case 1:
                ((AnonymousClass9R8) this.A01).A00(r4);
                return;
            case 2:
                A06(r4);
                return;
            case 3:
                ((AnonymousClass9RY) this.A01).A00(r4);
                return;
            case 4:
                ((C203399nd) this.A01).BJz(r4, (Integer) this.A02);
                return;
            case 5:
                break;
            default:
                A03(r4);
                return;
        }
        ((AnonymousClass4EY) this.A01).BaB(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0280, code lost:
        r2 = (X.AnonymousClass9VE) r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.A03
            r9 = r24
            switch(r1) {
                case 0: goto L_0x0355;
                case 1: goto L_0x0126;
                case 2: goto L_0x0326;
                case 3: goto L_0x0048;
                case 4: goto L_0x0233;
                case 5: goto L_0x009d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.36K r1 = X.C1899693i.A0T(r9)
            if (r1 == 0) goto L_0x0038
            X.34V r4 = X.AnonymousClass34V.A00(r1)
            if (r4 == 0) goto L_0x0039
            int r2 = r4.A00
            if (r2 == 0) goto L_0x0039
            r1 = 1448(0x5a8, float:2.029E-42)
            if (r2 != r1) goto L_0x0030
            java.lang.Object r1 = r0.A00
            X.9SB r1 = (X.AnonymousClass9SB) r1
            X.9VU r3 = r1.A06
            java.lang.Object r1 = r0.A02
            X.9Qh r1 = (X.C193849Qh) r1
            X.3Rl r1 = r1.A00
            java.lang.String r2 = r1.A05
            java.lang.String r1 = "PIN"
            r3.A02(r4, r2, r1)
        L_0x0030:
            java.lang.Object r0 = r0.A01
            X.9RM r0 = (X.AnonymousClass9RM) r0
            r0.A00(r4)
        L_0x0037:
            return
        L_0x0038:
            r4 = 0
        L_0x0039:
            java.lang.Object r1 = r0.A00
            X.9SB r1 = (X.AnonymousClass9SB) r1
            X.9TR r3 = r1.A07
            r3.A01()
            r1 = 0
            r3.A02(r1)
            goto L_0x0030
        L_0x0048:
            java.lang.Object r5 = r0.A01     // Catch:{ 24Y -> 0x0406 }
            X.9RY r5 = (X.AnonymousClass9RY) r5     // Catch:{ 24Y -> 0x0406 }
            java.lang.Object r1 = r0.A02     // Catch:{ 24Y -> 0x0406 }
            X.9IW r1 = (X.AnonymousClass9IW) r1     // Catch:{ 24Y -> 0x0406 }
            X.9Ix r4 = new X.9Ix     // Catch:{ 24Y -> 0x0406 }
            r4.<init>(r9, r1)     // Catch:{ 24Y -> 0x0406 }
            X.9Vi r8 = r5.A01     // Catch:{ 24Y -> 0x0406 }
            X.2xk r3 = r5.A02     // Catch:{ 24Y -> 0x0406 }
            java.lang.String r2 = r5.A03     // Catch:{ 24Y -> 0x0406 }
            X.9RJ r6 = r5.A00     // Catch:{ 24Y -> 0x0406 }
            X.32a r1 = r8.A08     // Catch:{ Exception -> 0x008e }
            X.9Uu r7 = new X.9Uu     // Catch:{ Exception -> 0x008e }
            r7.<init>(r1, r3, r4, r2)     // Catch:{ Exception -> 0x008e }
            X.9TT r5 = r8.A0E     // Catch:{ Exception -> 0x008e }
            X.2xk r1 = r7.A08     // Catch:{ Exception -> 0x008e }
            long r2 = r1.A01     // Catch:{ Exception -> 0x008e }
            java.util.concurrent.ConcurrentHashMap r4 = r5.A02     // Catch:{ Exception -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x008e }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x008e }
            X.9Uu r4 = (X.C194869Uu) r4     // Catch:{ Exception -> 0x008e }
            if (r4 == 0) goto L_0x0084
            boolean r1 = r4.A02     // Catch:{ Exception -> 0x008e }
            r7.A02 = r1     // Catch:{ Exception -> 0x008e }
            int r1 = r4.A00     // Catch:{ Exception -> 0x008e }
            r7.A00 = r1     // Catch:{ Exception -> 0x008e }
            int r1 = r4.A01     // Catch:{ Exception -> 0x008e }
            r7.A01 = r1     // Catch:{ Exception -> 0x008e }
        L_0x0084:
            r5.A03(r7, r2)     // Catch:{ Exception -> 0x008e }
            if (r6 == 0) goto L_0x0037
            r6.A00(r7)     // Catch:{ Exception -> 0x008e }
            goto L_0x03fa
        L_0x008e:
            r2 = move-exception
            java.lang.String r1 = "PAY: PaymentIncentiveManager/processSuccessfulGetOfferDetails : Error while parsing "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 24Y -> 0x0406 }
            X.9TT r1 = r8.A0E     // Catch:{ 24Y -> 0x0406 }
            r1.A00()     // Catch:{ 24Y -> 0x0406 }
            if (r6 == 0) goto L_0x0037
            goto L_0x03fb
        L_0x009d:
            java.lang.String r1 = "account"
            X.36K r2 = r9.A0m(r1)     // Catch:{ 24Y -> 0x011e }
            java.lang.String r1 = "pay"
            X.36K r2 = r2.A0m(r1)     // Catch:{ 24Y -> 0x011e }
            java.lang.String r1 = "currency"
            java.lang.String r10 = r2.A0q(r1)     // Catch:{ 24Y -> 0x011e }
            java.lang.String r1 = "amount"
            java.lang.String r4 = r2.A0q(r1)     // Catch:{ 24Y -> 0x011e }
            java.lang.Object r3 = r0.A00     // Catch:{ 24Y -> 0x011e }
            X.9b0 r3 = (X.AnonymousClass9b0) r3     // Catch:{ 24Y -> 0x011e }
            X.32a r5 = r3.A03     // Catch:{ 24Y -> 0x011e }
            X.4Fi r2 = r5.A01(r10)     // Catch:{ 24Y -> 0x011e }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 24Y -> 0x011e }
            if (r1 != 0) goto L_0x00d6
            X.39Q r7 = X.C1899693i.A0B(r2, r4)     // Catch:{ 24Y -> 0x011e }
        L_0x00c9:
            X.3Lv r3 = r3.A02     // Catch:{ 24Y -> 0x011e }
            java.lang.Object r2 = r0.A02     // Catch:{ 24Y -> 0x011e }
            X.2z0 r2 = (X.AnonymousClass2z0) r2     // Catch:{ 24Y -> 0x011e }
            X.2qz r1 = r3.A2D     // Catch:{ 24Y -> 0x011e }
            X.34x r4 = r1.A05(r2)     // Catch:{ 24Y -> 0x011e }
            goto L_0x00d8
        L_0x00d6:
            r7 = 0
            goto L_0x00c9
        L_0x00d8:
            if (r4 == 0) goto L_0x0116
            X.34w r1 = r4.A0P     // Catch:{ 24Y -> 0x011e }
            if (r1 == 0) goto L_0x0116
            com.whatsapp.jid.UserJid r8 = r1.A0E     // Catch:{ 24Y -> 0x011e }
            com.whatsapp.jid.UserJid r9 = r1.A0D     // Catch:{ 24Y -> 0x011e }
            X.4Fi r6 = r5.A01(r10)     // Catch:{ 24Y -> 0x011e }
            X.34w r5 = r4.A0P     // Catch:{ 24Y -> 0x011e }
            long r1 = r5.A05     // Catch:{ 24Y -> 0x011e }
            java.lang.String r12 = r5.A0G     // Catch:{ 24Y -> 0x011e }
            int r15 = r5.A04     // Catch:{ 24Y -> 0x011e }
            int r5 = r5.A01     // Catch:{ 24Y -> 0x011e }
            r13 = 3
            r14 = 0
            r11 = 0
            r17 = r14
            r18 = r1
            r16 = r5
            X.34w r2 = X.AnonymousClass36S.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 24Y -> 0x011e }
            X.34w r1 = r4.A0P     // Catch:{ 24Y -> 0x011e }
            java.lang.String r1 = r1.A0K     // Catch:{ 24Y -> 0x011e }
            r2.A0D(r1)     // Catch:{ 24Y -> 0x011e }
            X.2z0 r1 = r4.A1J     // Catch:{ 24Y -> 0x011e }
            r3.A0L(r2, r1)     // Catch:{ 24Y -> 0x011e }
            java.lang.Object r2 = r0.A01     // Catch:{ 24Y -> 0x011e }
            X.4EY r2 = (X.AnonymousClass4EY) r2     // Catch:{ 24Y -> 0x011e }
            X.2Oi r1 = new X.2Oi     // Catch:{ 24Y -> 0x011e }
            r1.<init>()     // Catch:{ 24Y -> 0x011e }
            r2.BaC(r1)     // Catch:{ 24Y -> 0x011e }
            return
        L_0x0116:
            X.34V r1 = X.C1899693i.A0M()     // Catch:{ 24Y -> 0x011e }
            r0.A04(r1)     // Catch:{ 24Y -> 0x011e }
            return
        L_0x011e:
            X.34V r1 = X.C1899693i.A0M()
            r0.A04(r1)
            return
        L_0x0126:
            java.lang.String r3 = "account"
            X.36K r6 = r9.A0m(r3)     // Catch:{ 24Y -> 0x021b }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ 24Y -> 0x021b }
            java.lang.Object r5 = r0.A00     // Catch:{ 24Y -> 0x021b }
            X.9QC r5 = (X.AnonymousClass9QC) r5     // Catch:{ 24Y -> 0x021b }
            X.99n r1 = r5.A04     // Catch:{ 24Y -> 0x021b }
            X.1VX r2 = r1.A02     // Catch:{ 24Y -> 0x021b }
            r1 = 2984(0xba8, float:4.181E-42)
            boolean r1 = r2.A0X(r1)     // Catch:{ 24Y -> 0x021b }
            r11 = 0
            if (r1 == 0) goto L_0x01ae
            X.9Tx r1 = r5.A0A     // Catch:{ 24Y -> 0x021b }
            java.util.ArrayList r4 = r1.A05(r6)     // Catch:{ 24Y -> 0x021b }
            if (r4 == 0) goto L_0x01ab
            boolean r1 = r4.isEmpty()     // Catch:{ 24Y -> 0x021b }
            if (r1 != 0) goto L_0x01ab
            int r7 = r4.size()     // Catch:{ 24Y -> 0x021b }
            r2 = 0
            boolean r1 = X.AnonymousClass8EA.A04(r4)     // Catch:{ 24Y -> 0x021b }
            if (r1 == 0) goto L_0x0166
            X.9U4 r1 = r5.A05     // Catch:{ 24Y -> 0x021b }
            X.9Tl r1 = X.AnonymousClass9U4.A00(r1)     // Catch:{ 24Y -> 0x021b }
            X.C626936e.A06(r1)     // Catch:{ 24Y -> 0x021b }
            r1.A05(r2, r4)     // Catch:{ 24Y -> 0x021b }
        L_0x0166:
            java.lang.Object r1 = r0.A02     // Catch:{ 24Y -> 0x021b }
            X.2Ir r1 = (X.C41032Ir) r1     // Catch:{ 24Y -> 0x021b }
            X.36K r4 = X.C41032Ir.A02(r9, r1)     // Catch:{ 24Y -> 0x021b }
            r1 = 2
            X.9qI r2 = new X.9qI     // Catch:{ 24Y -> 0x021b }
            r2.<init>(r4, r1)     // Catch:{ 24Y -> 0x021b }
            java.lang.String[] r1 = new java.lang.String[]{r3}     // Catch:{ 24Y -> 0x021b }
            java.lang.Object r3 = X.C626836d.A04(r9, r2, r1)     // Catch:{ 24Y -> 0x021b }
            X.9Hx r3 = (X.C192039Hx) r3     // Catch:{ 24Y -> 0x021b }
            r1 = 3
            X.9qI r2 = new X.9qI     // Catch:{ 24Y -> 0x021b }
            r2.<init>(r4, r1)     // Catch:{ 24Y -> 0x021b }
            java.lang.String[] r1 = new java.lang.String[r11]     // Catch:{ 24Y -> 0x021b }
            X.C626836d.A04(r9, r2, r1)     // Catch:{ 24Y -> 0x021b }
            java.util.List r1 = r3.A02     // Catch:{ 24Y -> 0x021b }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ 24Y -> 0x021b }
        L_0x018f:
            boolean r1 = r4.hasNext()     // Catch:{ 24Y -> 0x021b }
            if (r1 == 0) goto L_0x01ad
            java.lang.Object r1 = r4.next()     // Catch:{ 24Y -> 0x021b }
            X.2Iq r1 = (X.C41022Iq) r1     // Catch:{ 24Y -> 0x021b }
            X.99I r3 = new X.99I     // Catch:{ 24Y -> 0x021b }
            r3.<init>()     // Catch:{ 24Y -> 0x021b }
            X.32a r2 = r5.A01     // Catch:{ 24Y -> 0x021b }
            X.36K r1 = r1.A00     // Catch:{ 24Y -> 0x021b }
            r3.A04(r2, r1, r11)     // Catch:{ 24Y -> 0x021b }
            r10.add(r3)     // Catch:{ 24Y -> 0x021b }
            goto L_0x018f
        L_0x01ab:
            r7 = 0
            goto L_0x0166
        L_0x01ad:
            r11 = r7
        L_0x01ae:
            X.34V r2 = X.AnonymousClass34V.A00(r6)     // Catch:{ 24Y -> 0x021b }
            if (r2 == 0) goto L_0x01bc
            java.lang.Object r1 = r0.A01     // Catch:{ 24Y -> 0x021b }
            X.9R8 r1 = (X.AnonymousClass9R8) r1     // Catch:{ 24Y -> 0x021b }
            r1.A00(r2)     // Catch:{ 24Y -> 0x021b }
            return
        L_0x01bc:
            java.lang.Object r4 = r0.A01     // Catch:{ 24Y -> 0x021b }
            X.9R8 r4 = (X.AnonymousClass9R8) r4     // Catch:{ 24Y -> 0x021b }
            X.9cl r3 = r4.A00     // Catch:{ 24Y -> 0x021b }
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r1 = r3.A01     // Catch:{ 24Y -> 0x021b }
            if (r1 == 0) goto L_0x0206
            r1.A1a()     // Catch:{ 24Y -> 0x021b }
            r1.A1L()     // Catch:{ 24Y -> 0x021b }
        L_0x01cc:
            X.9W1 r8 = r3.A02     // Catch:{ 24Y -> 0x021b }
            X.99l r2 = r8.A07     // Catch:{ 24Y -> 0x021b }
            java.lang.String r1 = "tos_no_wallet"
            r2.A09(r1)     // Catch:{ 24Y -> 0x021b }
            X.9TR r1 = r8.A0K     // Catch:{ 24Y -> 0x021b }
            r5 = 1
            r1.A01()     // Catch:{ 24Y -> 0x021b }
            X.99l r2 = r8.A07     // Catch:{ 24Y -> 0x021b }
            java.lang.String r1 = "kyc"
            r2.A09(r1)     // Catch:{ 24Y -> 0x021b }
            X.33l r2 = r8.A09     // Catch:{ 24Y -> 0x021b }
            java.lang.String r1 = "pending"
            r2.A0L(r1)     // Catch:{ 24Y -> 0x021b }
            X.33l r1 = r8.A09     // Catch:{ 24Y -> 0x021b }
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)     // Catch:{ 24Y -> 0x021b }
            java.lang.String r1 = "payment_account_recovered"
            X.C18270x1.A0l(r2, r1, r5)     // Catch:{ 24Y -> 0x021b }
            X.4eZ r7 = r3.A00     // Catch:{ 24Y -> 0x021b }
            boolean r1 = r7 instanceof com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity     // Catch:{ 24Y -> 0x021b }
            if (r1 == 0) goto L_0x0211
            X.9Rg r3 = r8.A0G     // Catch:{ 24Y -> 0x021b }
            X.9cQ r2 = new X.9cQ     // Catch:{ 24Y -> 0x021b }
            r2.<init>(r4, r10, r11)     // Catch:{ 24Y -> 0x021b }
            r1 = 0
            r3.A00(r2, r1)     // Catch:{ 24Y -> 0x021b }
            goto L_0x0210
        L_0x0206:
            X.4eZ r2 = r3.A00     // Catch:{ 24Y -> 0x021b }
            boolean r1 = r2 instanceof com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity     // Catch:{ 24Y -> 0x021b }
            if (r1 == 0) goto L_0x01cc
            r2.BjL()     // Catch:{ 24Y -> 0x021b }
            goto L_0x01cc
        L_0x0210:
            return
        L_0x0211:
            boolean r12 = r3.A03     // Catch:{ 24Y -> 0x021b }
            boolean r13 = r3.A04     // Catch:{ 24Y -> 0x021b }
            java.lang.String r9 = r4.A01     // Catch:{ 24Y -> 0x021b }
            X.AnonymousClass9W1.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 24Y -> 0x021b }
            return
        L_0x021b:
            r3 = move-exception
            java.lang.Object r1 = r0.A00
            X.9QC r1 = (X.AnonymousClass9QC) r1
            X.7oG r2 = r1.A08
            java.lang.String r1 = "PAY: BrazilAccountRecoveryAction : invalid response"
            r2.A0A(r1, r3)
            java.lang.Object r1 = r0.A01
            X.9R8 r1 = (X.AnonymousClass9R8) r1
            X.34V r0 = X.C1899693i.A0M()
            r1.A00(r0)
            return
        L_0x0233:
            r5 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = "account"
            X.36K r2 = r9.A0m(r1)     // Catch:{ 24Y -> 0x0305 }
            X.34V r6 = X.AnonymousClass34V.A00(r2)     // Catch:{ 24Y -> 0x0305 }
            java.lang.String r1 = "offer_eligibility"
            X.36K r7 = r2.A0l(r1)     // Catch:{ 24Y -> 0x0305 }
            if (r6 == 0) goto L_0x029c
            int r2 = r6.A00     // Catch:{ 24Y -> 0x0305 }
            r1 = 1441(0x5a1, float:2.019E-42)
            if (r2 != r1) goto L_0x0259
            java.lang.Object r1 = r0.A00     // Catch:{ 24Y -> 0x0305 }
            X.9VE r1 = (X.AnonymousClass9VE) r1     // Catch:{ 24Y -> 0x0305 }
            X.9TR r3 = r1.A0N     // Catch:{ 24Y -> 0x0305 }
            long r1 = r6.A02     // Catch:{ 24Y -> 0x0305 }
            r3.A02(r1)     // Catch:{ 24Y -> 0x0305 }
            goto L_0x027e
        L_0x0259:
            r1 = 1448(0x5a8, float:2.029E-42)
            if (r2 != r1) goto L_0x026b
            java.lang.Object r1 = r0.A00     // Catch:{ 24Y -> 0x0305 }
            X.9VE r1 = (X.AnonymousClass9VE) r1     // Catch:{ 24Y -> 0x0305 }
            X.9VU r3 = r1.A0H     // Catch:{ 24Y -> 0x0305 }
            java.lang.String r2 = "FB"
            java.lang.String r1 = "PIN"
            r3.A02(r6, r2, r1)     // Catch:{ 24Y -> 0x0305 }
            goto L_0x027e
        L_0x026b:
            r1 = 2896004(0x2c3084, float:4.058166E-39)
            if (r2 != r1) goto L_0x027e
            java.lang.Object r1 = r0.A00     // Catch:{ 24Y -> 0x0305 }
            X.9VE r1 = (X.AnonymousClass9VE) r1     // Catch:{ 24Y -> 0x0305 }
            X.4FS r2 = r1.A0Q     // Catch:{ 24Y -> 0x0305 }
            X.9fn r1 = new X.9fn     // Catch:{ 24Y -> 0x0305 }
            r1.<init>(r0)     // Catch:{ 24Y -> 0x0305 }
            r2.BkM(r1)     // Catch:{ 24Y -> 0x0305 }
        L_0x027e:
            if (r7 == 0) goto L_0x0290
            java.lang.Object r2 = r0.A00     // Catch:{ 24Y -> 0x0305 }
            X.9VE r2 = (X.AnonymousClass9VE) r2     // Catch:{ 24Y -> 0x0305 }
            X.2xk r1 = r2.A0L     // Catch:{ 24Y -> 0x0305 }
            if (r1 == 0) goto L_0x0290
            X.9Vi r4 = r2.A0K     // Catch:{ 24Y -> 0x0305 }
            long r2 = r1.A01     // Catch:{ 24Y -> 0x0305 }
            r1 = 0
            r4.A08(r1, r7, r2)     // Catch:{ 24Y -> 0x0305 }
        L_0x0290:
            java.lang.Object r2 = r0.A01     // Catch:{ 24Y -> 0x0305 }
            X.9nd r2 = (X.C203399nd) r2     // Catch:{ 24Y -> 0x0305 }
            java.lang.Object r1 = r0.A02     // Catch:{ 24Y -> 0x0305 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 24Y -> 0x0305 }
            r2.BJz(r6, r1)     // Catch:{ 24Y -> 0x0305 }
            return
        L_0x029c:
            java.lang.String r1 = "transaction"
            X.36K r6 = r2.A0l(r1)     // Catch:{ 24Y -> 0x0305 }
            if (r6 == 0) goto L_0x02f4
            java.lang.Object r8 = r0.A00     // Catch:{ 24Y -> 0x0305 }
            X.9VE r8 = (X.AnonymousClass9VE) r8     // Catch:{ 24Y -> 0x0305 }
            java.lang.String r1 = "elo"
            X.36K r2 = r6.A0l(r1)     // Catch:{ 24Y -> 0x0305 }
            if (r2 == 0) goto L_0x02c9
            java.lang.String r1 = "challenge_id"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r2, r1)     // Catch:{ 24Y -> 0x0305 }
            X.9SD r1 = r8.A0J     // Catch:{ 24Y -> 0x0305 }
            r1.A00(r2)     // Catch:{ 24Y -> 0x0305 }
            java.lang.String r4 = r8.A0R     // Catch:{ 24Y -> 0x0305 }
            X.39L r3 = r8.A05     // Catch:{ 24Y -> 0x0305 }
            java.lang.String r2 = r8.A0V     // Catch:{ 24Y -> 0x0305 }
            X.9Q0 r1 = r1.A00     // Catch:{ 24Y -> 0x0305 }
            r1.A03 = r4     // Catch:{ 24Y -> 0x0305 }
            r1.A01 = r3     // Catch:{ 24Y -> 0x0305 }
            r1.A05 = r2     // Catch:{ 24Y -> 0x0305 }
        L_0x02c9:
            java.lang.String r1 = "id"
            java.lang.String r6 = r6.A0q(r1)     // Catch:{ 24Y -> 0x0305 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 24Y -> 0x0305 }
            if (r1 != 0) goto L_0x02f4
            if (r7 == 0) goto L_0x02e8
            X.2xk r1 = r8.A0L     // Catch:{ 24Y -> 0x0305 }
            if (r1 == 0) goto L_0x02e8
            X.9Vi r4 = r8.A0K     // Catch:{ 24Y -> 0x0305 }
            long r2 = r1.A01     // Catch:{ 24Y -> 0x0305 }
            X.9cf r1 = new X.9cf     // Catch:{ 24Y -> 0x0305 }
            r1.<init>(r0, r6)     // Catch:{ 24Y -> 0x0305 }
            r4.A08(r1, r7, r2)     // Catch:{ 24Y -> 0x0305 }
            return
        L_0x02e8:
            java.lang.Object r2 = r0.A01     // Catch:{ 24Y -> 0x0305 }
            X.9oD r2 = (X.C203729oD) r2     // Catch:{ 24Y -> 0x0305 }
            java.lang.Object r1 = r0.A02     // Catch:{ 24Y -> 0x0305 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 24Y -> 0x0305 }
            r2.BaQ(r6, r1)     // Catch:{ 24Y -> 0x0305 }
            return
        L_0x02f4:
            java.lang.Object r3 = r0.A01     // Catch:{ 24Y -> 0x0305 }
            X.9nd r3 = (X.C203399nd) r3     // Catch:{ 24Y -> 0x0305 }
            X.34V r2 = new X.34V     // Catch:{ 24Y -> 0x0305 }
            r2.<init>((int) r5)     // Catch:{ 24Y -> 0x0305 }
            java.lang.Object r1 = r0.A02     // Catch:{ 24Y -> 0x0305 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 24Y -> 0x0305 }
            r3.BJz(r2, r1)     // Catch:{ 24Y -> 0x0305 }
            return
        L_0x0305:
            r4 = move-exception
            java.lang.Object r1 = r0.A00
            X.9VE r1 = (X.AnonymousClass9VE) r1
            X.7oG r3 = r1.A0I
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "sendPrecheckWithSignature/onResponseSuccess/corrupt stream exception: "
            X.C1899593h.A1G(r3, r4, r1, r2)
            java.lang.Object r2 = r0.A01
            X.9nd r2 = (X.C203399nd) r2
            X.34V r1 = new X.34V
            r1.<init>((int) r5)
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.BJz(r1, r0)
            return
        L_0x0326:
            X.36K r2 = X.C1899693i.A0T(r9)
            if (r2 != 0) goto L_0x0333
            X.34V r1 = X.C1899693i.A0M()
            r0.A06(r1)
        L_0x0333:
            java.lang.String r1 = "transaction"
            X.36K r4 = r2.A0l(r1)
            if (r4 != 0) goto L_0x0342
            X.34V r1 = X.C1899693i.A0M()
            r0.A06(r1)
        L_0x0342:
            java.lang.Object r1 = r0.A00
            X.9A9 r1 = (X.AnonymousClass9A9) r1
            X.4FS r3 = r1.A06
            java.lang.Object r2 = r0.A01
            X.9R7 r2 = (X.AnonymousClass9R7) r2
            X.9jB r1 = new X.9jB
            r1.<init>(r0, r2, r4)
            r3.BkM(r1)
            return
        L_0x0355:
            r15 = 0
            X.9Ab r3 = new X.9Ab     // Catch:{ 24Y -> 0x03eb }
            r3.<init>()     // Catch:{ 24Y -> 0x03eb }
            java.lang.Object r1 = r0.A02     // Catch:{ 24Y -> 0x03eb }
            X.2Ir r1 = (X.C41032Ir) r1     // Catch:{ 24Y -> 0x03eb }
            X.36K r1 = X.C41032Ir.A02(r9, r1)     // Catch:{ 24Y -> 0x03eb }
            java.lang.String r2 = "outage"
            java.lang.String r7 = "accept_pay"
            java.lang.String[] r14 = new java.lang.String[]{r7, r2}     // Catch:{ 24Y -> 0x03eb }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.String r13 = "1"
            java.lang.Long r11 = X.AnonymousClass0x2.A0R()     // Catch:{ 24Y -> 0x03eb }
            java.lang.Long r12 = X.AnonymousClass0x2.A0S()     // Catch:{ 24Y -> 0x03eb }
            java.lang.Object r2 = X.C626836d.A05(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 24Y -> 0x03eb }
            java.lang.String r4 = "sandbox"
            java.lang.String[] r14 = new java.lang.String[]{r7, r4}     // Catch:{ 24Y -> 0x03eb }
            java.lang.Object r4 = X.C626836d.A05(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 24Y -> 0x03eb }
            java.util.ArrayList r6 = X.C192249It.A02     // Catch:{ 24Y -> 0x03eb }
            java.lang.String r5 = "service"
            java.lang.String[] r5 = new java.lang.String[]{r7, r5}     // Catch:{ 24Y -> 0x03eb }
            X.C626836d.A09(r9, r6, r5)     // Catch:{ 24Y -> 0x03eb }
            java.util.ArrayList r6 = X.C192249It.A00     // Catch:{ 24Y -> 0x03eb }
            java.lang.String r5 = "consumer"
            java.lang.String[] r5 = new java.lang.String[]{r7, r5}     // Catch:{ 24Y -> 0x03eb }
            java.lang.String r6 = X.C626836d.A0A(r9, r6, r5)     // Catch:{ 24Y -> 0x03eb }
            java.util.ArrayList r8 = X.C192249It.A01     // Catch:{ 24Y -> 0x03eb }
            java.lang.String r5 = "merchant"
            X.AnonymousClass6C8.A12(r9, r7, r5, r8)     // Catch:{ 24Y -> 0x03eb }
            X.9qI r5 = new X.9qI     // Catch:{ 24Y -> 0x03eb }
            r5.<init>(r1, r15)     // Catch:{ 24Y -> 0x03eb }
            java.lang.String[] r1 = new java.lang.String[r15]     // Catch:{ 24Y -> 0x03eb }
            X.C626836d.A04(r9, r5, r1)     // Catch:{ 24Y -> 0x03eb }
            java.lang.String[] r18 = new java.lang.String[]{r7}     // Catch:{ 24Y -> 0x03eb }
            X.9qJ r1 = new X.9qJ     // Catch:{ 24Y -> 0x03eb }
            r1.<init>(r15)     // Catch:{ 24Y -> 0x03eb }
            r19 = 1
            r16 = r9
            r17 = r1
            r21 = r19
            java.util.List r1 = X.C626836d.A0B(r16, r17, r18, r19, r21)     // Catch:{ 24Y -> 0x03eb }
            r1.get(r15)     // Catch:{ 24Y -> 0x03eb }
            boolean r1 = r13.equals(r6)     // Catch:{ 24Y -> 0x03eb }
            boolean r1 = X.AnonymousClass000.A1S(r1)
            r3.A02 = r1     // Catch:{ 24Y -> 0x03eb }
            boolean r1 = r13.equals(r2)     // Catch:{ 24Y -> 0x03eb }
            r3.A00 = r1     // Catch:{ 24Y -> 0x03eb }
            boolean r4 = r13.equals(r4)     // Catch:{ 24Y -> 0x03eb }
            r3.A01 = r4     // Catch:{ 24Y -> 0x03eb }
            java.lang.Object r1 = r0.A00     // Catch:{ 24Y -> 0x03eb }
            X.9U5 r1 = (X.AnonymousClass9U5) r1     // Catch:{ 24Y -> 0x03eb }
            X.33l r1 = r1.A0C     // Catch:{ 24Y -> 0x03eb }
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)     // Catch:{ 24Y -> 0x03eb }
            java.lang.String r1 = "payments_sandbox"
            X.C18270x1.A0l(r2, r1, r4)     // Catch:{ 24Y -> 0x03eb }
            goto L_0x03f2
        L_0x03eb:
            X.9Ab r3 = new X.9Ab
            r3.<init>()
            r3.A02 = r15
        L_0x03f2:
            java.lang.Object r0 = r0.A01
            X.4EY r0 = (X.AnonymousClass4EY) r0
            r0.BaC(r3)
            return
        L_0x03fa:
            return
        L_0x03fb:
            java.lang.String r1 = "PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 24Y -> 0x0406 }
            X.9mu r1 = r6.A00     // Catch:{ 24Y -> 0x0406 }
            r1.BRy()     // Catch:{ 24Y -> 0x0406 }
            return
        L_0x0406:
            r1 = move-exception
            java.lang.String r2 = "GetIncentiveOffer"
            java.lang.String r1 = r1.getMessage()
            X.C1899593h.A1Q(r2, r1)
            java.lang.Object r1 = r0.A01
            X.9RY r1 = (X.AnonymousClass9RY) r1
            X.34V r0 = X.C1899693i.A0M()
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203909oV.A05(X.36K):void");
    }

    public final void A06(AnonymousClass34V r3) {
        C203499no r1 = (C203499no) this.A02;
        if (r1 != null) {
            r1.BK0(r3, 18);
        }
        ((AnonymousClass9R7) this.A01).A00(r3);
    }
}
