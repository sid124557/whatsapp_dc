package X;

/* renamed from: X.3Zx  reason: invalid class name and case insensitive filesystem */
public class C70103Zx implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70103Zx(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0588, code lost:
        r3 = new X.C70103Zx(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x070a, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x070d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0774, code lost:
        r4.A0S(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0777, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x08b1, code lost:
        if (r4.length() == 0) goto L_0x08b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0947, code lost:
        if (r6 != null) goto L_0x0949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r0.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02ab, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02ae, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r33 = this;
            r4 = r33
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0488;
                case 2: goto L_0x0049;
                case 3: goto L_0x0054;
                case 4: goto L_0x04f6;
                case 5: goto L_0x0080;
                case 6: goto L_0x00be;
                case 7: goto L_0x0506;
                case 8: goto L_0x0514;
                case 9: goto L_0x00e5;
                case 10: goto L_0x0524;
                case 11: goto L_0x0532;
                case 12: goto L_0x0556;
                case 13: goto L_0x0566;
                case 14: goto L_0x0579;
                case 15: goto L_0x0103;
                case 16: goto L_0x0121;
                case 17: goto L_0x058f;
                case 18: goto L_0x0007;
                case 19: goto L_0x013f;
                case 20: goto L_0x015d;
                case 21: goto L_0x0007;
                case 22: goto L_0x059b;
                case 23: goto L_0x015d;
                case 24: goto L_0x0007;
                case 25: goto L_0x05ad;
                case 26: goto L_0x017a;
                case 27: goto L_0x05bb;
                case 28: goto L_0x05cd;
                case 29: goto L_0x05e3;
                case 30: goto L_0x0198;
                case 31: goto L_0x0664;
                case 32: goto L_0x01d4;
                case 33: goto L_0x0202;
                case 34: goto L_0x0677;
                case 35: goto L_0x0262;
                case 36: goto L_0x0284;
                case 37: goto L_0x06cd;
                case 38: goto L_0x02af;
                case 39: goto L_0x06e3;
                case 40: goto L_0x06fc;
                case 41: goto L_0x02cb;
                case 42: goto L_0x0302;
                case 43: goto L_0x070e;
                case 44: goto L_0x0861;
                case 45: goto L_0x08c4;
                case 46: goto L_0x0470;
                case 47: goto L_0x0923;
                case 48: goto L_0x092f;
                case 49: goto L_0x09ea;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r1 = r4.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.2j0 r0 = r0.A0o
        L_0x0011:
            r0.A02(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r3 = r4.A00
            X.6pr r3 = (X.C138156pr) r3
            int r1 = r3.A06()
            r0 = 2
            if (r1 == r0) goto L_0x0038
            X.8E7 r0 = r3.A01
            X.8rk r0 = r0.A04
            if (r0 == 0) goto L_0x0038
            android.os.Handler r2 = X.AnonymousClass000.A0A()
            r1 = 39
            X.3Zl r0 = new X.3Zl
            r0.<init>(r3, r1)
            r2.post(r0)
            r0 = 1
            r3.A0D(r0)
        L_0x0038:
            java.lang.Object r0 = r4.A01
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r4)
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x0014
            r0.quit()
            return
        L_0x0049:
            java.lang.Object r0 = r4.A00
            X.3Oz r0 = (X.C67363Oz) r0
            java.lang.Object r1 = r4.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.2j0 r0 = r0.A06
            goto L_0x0011
        L_0x0054:
            java.lang.Object r5 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            java.lang.Object r3 = r4.A01
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            X.1VX r2 = r5.A0D
            r1 = 1071(0x42f, float:1.501E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0014
            if (r3 == 0) goto L_0x0014
            boolean r0 = r3 instanceof X.C28011fL
            if (r0 == 0) goto L_0x0014
            X.2sj r0 = r5.A0O
            X.1fL r3 = (X.C28011fL) r3
            boolean r0 = r0.A0F(r3)
            if (r0 != 0) goto L_0x0014
            X.5WX r2 = r5.A1s
            r1 = 4
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0080:
            java.lang.Object r3 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            java.lang.Object r4 = r4.A01
            X.2so r1 = r3.A0m
            X.1fJ r0 = r3.A1h
            X.1fJ r1 = r1.A01(r0)
            r3.A1i = r1
            if (r1 == 0) goto L_0x0014
            X.3Ex r0 = r3.A0I
            X.3ZH r5 = r0.A0A(r1)
            X.2so r0 = r3.A0m
            X.1fJ r1 = r3.A1i
            X.2rM r0 = r0.A0H
            java.util.Set r0 = r0.A03(r1)
            int r6 = r0.size()
            X.49S r2 = r3.A0k
            X.1fJ r1 = r3.A1i
            r0 = 2
            X.2bx r0 = r2.Azz(r3, r1, r0)
            r3.A0l = r0
            X.3Wi r0 = r3.A05
            r7 = 20
            X.3c6 r2 = new X.3c6
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0S(r2)
            return
        L_0x00be:
            java.lang.Object r2 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            java.lang.Object r3 = r4.A01
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            X.1ib r1 = r2.A0e
            X.1fJ r0 = r2.A1h
            r1.A08(r0)
            X.1ie r0 = r2.A1Z
            X.1fJ r2 = r2.A1h
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x00d5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2rg r0 = (X.C56252rg) r0
            r0.A02(r3, r2)
            goto L_0x00d5
        L_0x00e5:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r2 = r4.A01
            X.1fJ r2 = (X.C27991fJ) r2
            X.1iV r0 = r0.A0s
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x00f3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2qm r0 = (X.C55702qm) r0
            r0.A01(r2)
            goto L_0x00f3
        L_0x0103:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r2 = r4.A01
            X.1fJ r2 = (X.C27991fJ) r2
            X.1iV r0 = r0.A0s
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0111:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2qm r0 = (X.C55702qm) r0
            r0.A04(r2)
            goto L_0x0111
        L_0x0121:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r2 = r4.A01
            X.1fJ r2 = (X.C27991fJ) r2
            X.1iV r0 = r0.A0s
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x012f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2qm r0 = (X.C55702qm) r0
            r0.A03(r2)
            goto L_0x012f
        L_0x013f:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r2 = r4.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.1ie r0 = r0.A0u
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x014d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2rg r0 = (X.C56252rg) r0
            r0.A00(r2)
            goto L_0x014d
        L_0x015d:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r4 = r4.A01
            java.util.Collection r4 = (java.util.Collection) r4
            X.3Cq r1 = r0.A0J
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0014
            r4.size()
            X.227 r3 = X.AnonymousClass227.A05
            X.2xW r2 = X.C59812xW.A0I
            r5 = 1
            r6 = 0
            r1.A02(r2, r3, r4, r5, r6)
            return
        L_0x017a:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r2 = r4.A01
            X.1fJ r2 = (X.C27991fJ) r2
            X.1iV r0 = r0.A0s
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0188:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2qm r0 = (X.C55702qm) r0
            r0.A02(r2)
            goto L_0x0188
        L_0x0198:
            java.lang.Object r5 = r4.A00
            X.3Lr r5 = (X.C66503Lr) r5
            java.lang.Object r6 = r4.A01
            X.1fJ r6 = (X.C27991fJ) r6
            X.8qC r0 = r5.A0D
            java.lang.Object r0 = r0.get()
            X.33h r0 = (X.C620533h) r0
            X.33k r4 = r0.A07(r6)
            java.util.Map r0 = r4.A09
            int r3 = r0.size()
            X.1VX r2 = r5.A04
            r1 = 3749(0xea5, float:5.253E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            if (r3 > r0) goto L_0x0014
            java.lang.String r0 = "GroupXmppMethods/sendGetGroupWhenComposing sync group list for small group"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r3 = r4.A0C()
            java.lang.String r2 = "prefetch"
            r1 = 3
            X.334 r0 = new X.334
            r0.<init>(r2, r1, r3)
            r5.A08(r0, r6)
            return
        L_0x01d4:
            java.lang.Object r0 = r4.A00
            X.2GY r0 = (X.AnonymousClass2GY) r0
            java.lang.Object r1 = r4.A01
            java.util.Set r1 = (java.util.Set) r1
            X.2zZ r3 = r0.A00
            X.4ea r0 = r3.A00
            r0.BjL()
            java.util.Iterator r2 = r1.iterator()
        L_0x01e7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r2)
            int r1 = X.C18290x4.A03(r0)
            r0 = -1
            if (r1 != r0) goto L_0x01fe
            java.lang.Runnable r0 = r3.A09
            r0.run()
            goto L_0x01e7
        L_0x01fe:
            X.C61022zZ.A00(r3, r1)
            goto L_0x01e7
        L_0x0202:
            java.lang.Object r0 = r4.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r3 = r4.A01
            X.5WJ r3 = (X.AnonymousClass5WJ) r3
            r6 = 1
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r0.iterator()
        L_0x0213:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x023e
            java.lang.Object r2 = r4.next()
            r1 = r2
            X.4uZ r1 = (X.C95814uZ) r1
            X.3Ex r0 = r3.A01
            X.3ZH r1 = r0.A09(r1)
            if (r1 == 0) goto L_0x0213
            boolean r0 = r1.A0U()
            if (r0 != r6) goto L_0x0213
            java.lang.String r0 = r1.A0J()
            if (r0 == 0) goto L_0x023a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0213
        L_0x023a:
            r5.add(r2)
            goto L_0x0213
        L_0x023e:
            java.util.Iterator r2 = r5.iterator()
        L_0x0242:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r9 = r2.next()
            X.1fL r9 = (X.C28011fL) r9
            X.2qJ r1 = r3.A06
            X.2oU r7 = r3.A05
            X.2sr r4 = r3.A00
            X.3Ex r5 = r3.A01
            X.5ZU r6 = r3.A04
            X.2sj r8 = r3.A07
            java.lang.String r0 = X.AnonymousClass33v.A00(r4, r5, r6, r7, r8, r9)
            r1.A01(r9, r0)
            goto L_0x0242
        L_0x0262:
            java.lang.Object r2 = r4.A00
            com.whatsapp.group.newgroup.NewGroup r2 = (com.whatsapp.group.newgroup.NewGroup) r2
            java.lang.Object r1 = r4.A01
            X.1fJ r1 = (X.C27991fJ) r1
            X.2ss r0 = r2.A0K
            boolean r0 = r0.A0L(r1)
            if (r0 == 0) goto L_0x0014
            r2.BjL()
            boolean r0 = r2.BHW()
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "checkIfJidCreatedAndFinishIfNecessary/finishing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A7A(r1)
            goto L_0x02ab
        L_0x0284:
            java.lang.Object r0 = r4.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r3 = r4.A01
            X.1fJ r3 = (X.C27991fJ) r3
            java.lang.Object r2 = r0.A00
            com.whatsapp.group.newgroup.NewGroup r2 = (com.whatsapp.group.newgroup.NewGroup) r2
            r2.BjL()
            boolean r0 = r2.BHW()
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "newgroup/onConversationChanged/ok/"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0q
            X.C18260x0.A0o(r0, r1)
            r2.A7A(r3)
        L_0x02ab:
            r2.finish()
            return
        L_0x02af:
            java.lang.Object r3 = r4.A00
            X.1NS r3 = (X.AnonymousClass1NS) r3
            java.lang.Object r2 = r4.A01
            java.lang.ref.WeakReference r0 = r3.A05
            java.lang.Object r1 = r0.get()
            X.1Nc r1 = (X.C22411Nc) r1
            if (r1 == 0) goto L_0x0014
            boolean r0 = X.C18320x8.A1T(r3)
            if (r0 != 0) goto L_0x0014
            X.08M r0 = r1.A03
            r0.A0G(r2)
            return
        L_0x02cb:
            java.lang.Object r2 = r4.A00
            com.whatsapp.identity.IdentityVerificationActivity r2 = (com.whatsapp.identity.IdentityVerificationActivity) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r1 = r0.userJid
            X.3ZH r0 = r2.A0K
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A03(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0014
            boolean r0 = X.AnonymousClass1Ha.A26(r2)
            if (r0 != 0) goto L_0x02f4
            android.widget.ProgressBar r1 = r2.A04
            r0 = 8
            r1.setVisibility(r0)
        L_0x02f4:
            r1 = 0
            r2.A0I = r1
            X.2oI r0 = r2.A0P
            r0.A0A = r1
            r0 = 0
            r2.A00 = r0
            r2.A78()
            return
        L_0x0302:
            java.lang.Object r5 = r4.A00
            com.whatsapp.identity.IdentityVerificationActivity r5 = (com.whatsapp.identity.IdentityVerificationActivity) r5
            java.lang.Object r3 = r4.A01
            X.20a r3 = (X.C368620a) r3
            boolean r0 = X.AnonymousClass1Ha.A26(r5)
            if (r0 == 0) goto L_0x03d6
            int r6 = r3.ordinal()
            r4 = 1
            if (r6 == r4) goto L_0x03ab
            r0 = 0
            if (r6 == r0) goto L_0x038f
            r0 = 2
            if (r6 == r0) goto L_0x0384
            java.lang.String r7 = ""
            r8 = r7
        L_0x0320:
            X.20a r0 = X.C368620a.SUCCESS
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0380
            X.2TZ r0 = r5.A0O
            com.airbnb.lottie.LottieAnimationView r2 = r0.A01
            r0 = 0
            X.4Gu r1 = new X.4Gu
            r1.<init>(r5, r7, r8, r0)
            X.01G r0 = r2.A0F
            X.00H r0 = r0.A0K
            r0.addListener(r1)
        L_0x0339:
            r1 = 0
            r2 = 8
            if (r6 == r4) goto L_0x0363
            if (r6 == r1) goto L_0x0a05
            r0 = 2
            if (r6 != r0) goto L_0x0014
            X.2TZ r0 = r5.A0O
            com.airbnb.lottie.LottieAnimationView r0 = r0.A00
            r0.setVisibility(r2)
            X.2TZ r0 = r5.A0O
            com.airbnb.lottie.LottieAnimationView r0 = r0.A01
            r0.setVisibility(r2)
            X.2TZ r0 = r5.A0O
            com.whatsapp.WaImageView r0 = r0.A06
            r0.setVisibility(r1)
            X.2TZ r0 = r5.A0O
            com.whatsapp.WaImageView r1 = r0.A06
            r0 = 2131234222(0x7f080dae, float:1.8084604E38)
        L_0x035f:
            r1.setImageResource(r0)
            return
        L_0x0363:
            X.2TZ r0 = r5.A0O
            com.airbnb.lottie.LottieAnimationView r0 = r0.A00
            r0.setVisibility(r2)
            X.2TZ r0 = r5.A0O
            com.airbnb.lottie.LottieAnimationView r0 = r0.A01
            r0.setVisibility(r2)
            X.2TZ r0 = r5.A0O
            com.whatsapp.WaImageView r0 = r0.A06
            r0.setVisibility(r1)
            X.2TZ r0 = r5.A0O
            com.whatsapp.WaImageView r1 = r0.A06
            r0 = 2131234102(0x7f080d36, float:1.808436E38)
            goto L_0x035f
        L_0x0380:
            r5.A7C(r7, r8)
            goto L_0x0339
        L_0x0384:
            r0 = 2131894970(0x7f1222ba, float:1.942476E38)
            java.lang.String r7 = r5.getString(r0)
            r0 = 2131894969(0x7f1222b9, float:1.9424758E38)
            goto L_0x03b5
        L_0x038f:
            r0 = 2131894975(0x7f1222bf, float:1.942477E38)
            java.lang.String r7 = r5.getString(r0)
            X.33j r2 = r5.A00
            X.2sH r0 = r5.A06
            long r0 = r0.A0H()
            java.lang.String r1 = X.C107145am.A00(r2, r0)
            r0 = 2131894974(0x7f1222be, float:1.9424768E38)
            java.lang.String r8 = X.AnonymousClass0x2.A0X(r5, r1, r4, r0)
            goto L_0x0320
        L_0x03ab:
            r0 = 2131894973(0x7f1222bd, float:1.9424766E38)
            java.lang.String r7 = r5.getString(r0)
            r0 = 2131894972(0x7f1222bc, float:1.9424764E38)
        L_0x03b5:
            java.lang.String r8 = r5.getString(r0)
            X.2TZ r0 = r5.A0O
            com.whatsapp.TextEmojiLabel r2 = r0.A05
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.height = r0
            r2.setLayoutParams(r1)
            r0 = 0
            r2.setMinHeight(r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r5)
            int r0 = r0.heightPixels
            r2.setMaxHeight(r0)
            goto L_0x0320
        L_0x03d6:
            int r2 = r5.A00
            r0 = 2131434645(0x7f0b1c95, float:1.849111E38)
            android.view.View r7 = r5.findViewById(r0)
            com.whatsapp.TextEmojiLabel r7 = (com.whatsapp.TextEmojiLabel) r7
            r8 = 0
            r7.setFocusable(r8)
            X.5ZU r1 = r5.A0E
            X.3ZH r0 = r5.A0K
            java.lang.String r0 = X.C18300x5.A0h(r1, r0)
            java.lang.String r9 = android.text.Html.escapeHtml(r0)
            X.3Mg r0 = r5.A0S
            boolean r0 = X.C66653Mg.A00(r0)
            if (r0 != 0) goto L_0x046b
            if (r2 > 0) goto L_0x046b
            X.3Lk r1 = r5.A0V
            java.lang.String r0 = "28030015"
        L_0x03ff:
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
            java.lang.String r10 = r0.toString()
            X.2NZ r0 = r5.A0I
            X.2ey r0 = r0.A01
            r6 = 1
            boolean r4 = X.AnonymousClass000.A1W(r0)
            X.2sr r1 = r5.A01
            X.3ZH r0 = r5.A0K
            boolean r0 = X.C56972sr.A08(r1, r0)
            if (r0 == 0) goto L_0x045c
            X.1VX r2 = r5.A0D
            r1 = 1967(0x7af, float:2.756E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x045c
            r1 = 2131890784(0x7f121260, float:1.941627E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r10
        L_0x042d:
            java.lang.String r0 = r5.getString(r1, r0)
            android.text.Spanned r0 = X.AnonymousClass0x9.A0B(r0)
            r5.A7A(r0, r7)
            r0 = 2131434646(0x7f0b1c96, float:1.8491112E38)
            android.view.View r2 = r5.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x0014
            r1 = 2131233798(0x7f080c06, float:1.8083744E38)
            X.20a r0 = X.C368620a.PENDING
            if (r3 != r0) goto L_0x0453
            r0 = 8
        L_0x044c:
            r2.setImageResource(r1)
            r2.setVisibility(r0)
            return
        L_0x0453:
            X.20a r0 = X.C368620a.FAIL
            if (r3 != r0) goto L_0x045a
            r1 = 2131233800(0x7f080c08, float:1.8083748E38)
        L_0x045a:
            r0 = 0
            goto L_0x044c
        L_0x045c:
            r1 = 2131894977(0x7f1222c1, float:1.9424774E38)
            if (r4 == 0) goto L_0x0464
            r1 = 2131894976(0x7f1222c0, float:1.9424772E38)
        L_0x0464:
            java.lang.Object[] r0 = X.C18310x6.A1b(r9, r8)
            r0[r6] = r10
            goto L_0x042d
        L_0x046b:
            X.3Lk r1 = r5.A0V
            java.lang.String r0 = "26000361"
            goto L_0x03ff
        L_0x0470:
            java.lang.Object r2 = r4.A00
            com.whatsapp.inappsupport.ui.ContactUsWithAiViewModel r2 = (com.whatsapp.inappsupport.ui.ContactUsWithAiViewModel) r2
            java.lang.Object r1 = r4.A01
            X.1hw r0 = r2.A07
            r0.A07(r1)
            r0 = 0
            boolean r0 = r2.A0D(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "ContactUsWithAiViewModel/conversationObserver, unexpectedly did not redirect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0488:
            java.lang.Object r6 = r4.A00
            X.2RJ r6 = (X.AnonymousClass2RJ) r6
            java.lang.Object r5 = r4.A01
            X.2dW r5 = (X.C47602dW) r5
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.Map r7 = r6.A03
            java.util.Iterator r4 = X.C18280x3.A0i(r7)
            r9 = 0
        L_0x049f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04c6
            com.whatsapp.jid.Jid r3 = X.AnonymousClass0x7.A0S(r4)
            java.lang.Object r2 = r7.get(r3)
            X.2L3 r2 = (X.AnonymousClass2L3) r2
            if (r2 == 0) goto L_0x049f
            if (r9 != 0) goto L_0x04b9
            long r0 = r2.A00
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x04b9:
            java.lang.String r0 = r3.getRawString()
            r10.add(r0)
            java.lang.String r0 = r2.A01
            r11.add(r0)
            goto L_0x049f
        L_0x04c6:
            X.4ea r0 = r5.A05
            X.0df r4 = r0.getSupportFragmentManager()
            java.util.Set r2 = r7.keySet()
            android.content.Context r7 = r5.A03
            java.util.ArrayList r12 = r6.A01
            X.1fJ r8 = r6.A00
            r13 = 2
            android.content.Intent r1 = X.C627736r.A0W(r7, r8, r9, r10, r11, r12, r13)
            int r3 = r5.A02
            boolean r0 = r5.A0K
            android.os.Bundle r2 = com.whatsapp.invites.PromptSendGroupInviteDialogFragment.A00(r1, r2, r0)
            com.whatsapp.invites.PromptSendGroupInviteDialogFragment r1 = new com.whatsapp.invites.PromptSendGroupInviteDialogFragment
            r1.<init>()
            java.lang.String r0 = "invite_intent_code"
            r2.putInt(r0, r3)
            r1.A0u(r2)
            java.lang.String r0 = "PromptSendGroupInvite"
            r1.A1S(r4, r0)
            return
        L_0x04f6:
            java.lang.Object r0 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r2 = r4.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.2n3 r1 = r0.A12
            java.lang.String r0 = "group_participant_list"
            X.C53412n3.A00(r1, r2, r0)
            return
        L_0x0506:
            java.lang.Object r0 = r4.A00
            X.10x r0 = (X.AnonymousClass10x) r0
            java.lang.Object r2 = r4.A01
            X.03q r2 = (X.C003203q) r2
            X.2nM r1 = r0.A05
            java.lang.String r0 = "how-to-exit-and-delete-groups"
            goto L_0x070a
        L_0x0514:
            java.lang.Object r2 = r4.A00
            X.3Lq r2 = (X.C66493Lq) r2
            java.lang.Object r1 = r4.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r2.A0M(r1)
            X.3Wi r4 = r2.A05
            r0 = 15
            goto L_0x0588
        L_0x0524:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r1 = r4.A01
            X.1fJ r1 = (X.C27991fJ) r1
            X.2oj r0 = r0.A0X
            r0.A01(r1)
            return
        L_0x0532:
            java.lang.Object r5 = r4.A00
            X.3Lq r5 = (X.C66493Lq) r5
            java.lang.Object r3 = r4.A01
            X.1fL r3 = (X.C28011fL) r3
            X.2sr r0 = r5.A06
            X.1fH r2 = r0.A0H()
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r0)
            r1.add(r0)
            if (r2 == 0) goto L_0x0550
            r1.add(r2)
        L_0x0550:
            X.2sj r0 = r5.A0b
            r0.A08(r3, r1)
            return
        L_0x0556:
            java.lang.Object r1 = r4.A00
            X.3Lq r1 = (X.C66493Lq) r1
            java.lang.Object r0 = r4.A01
            X.1iV r1 = r1.A0s
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A08(r0)
            return
        L_0x0566:
            java.lang.Object r2 = r4.A00
            X.3Lq r2 = (X.C66493Lq) r2
            java.lang.Object r1 = r4.A01
            X.1fJ r1 = (X.C27991fJ) r1
            X.2oj r0 = r2.A0X
            r0.A01(r1)
            X.2lN r0 = r2.A0g
            r0.A00(r1)
            return
        L_0x0579:
            java.lang.Object r2 = r4.A00
            X.3Lq r2 = (X.C66493Lq) r2
            java.lang.Object r1 = r4.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r2.A0M(r1)
            X.3Wi r4 = r2.A05
            r0 = 26
        L_0x0588:
            X.3Zx r3 = new X.3Zx
            r3.<init>(r2, r0, r1)
            goto L_0x0774
        L_0x058f:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r1 = r4.A01
            java.util.Set r0 = r0.A1G
            r0.remove(r1)
            return
        L_0x059b:
            java.lang.Object r1 = r4.A00
            X.3Lq r1 = (X.C66493Lq) r1
            java.lang.Object r0 = r4.A01
            X.34x r0 = (X.C624134x) r0
            X.2j0 r1 = r1.A0o
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            r1.A02(r0)
            return
        L_0x05ad:
            java.lang.Object r0 = r4.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r1 = r4.A01
            java.util.Set r1 = (java.util.Set) r1
            X.1iV r0 = r0.A0s
            r0.A08(r1)
            return
        L_0x05bb:
            java.lang.Object r1 = r4.A00
            X.4V4 r1 = (X.AnonymousClass4V4) r1
            java.lang.Object r0 = r4.A01
            X.2n0 r0 = (X.C53382n0) r0
            X.2oj r2 = r1.A0A
            X.1fJ r1 = r0.A01
            com.whatsapp.jid.UserJid r0 = r0.A04
            r2.A02(r1, r0)
            return
        L_0x05cd:
            java.lang.Object r0 = r4.A00
            X.3Lr r0 = (X.C66503Lr) r0
            java.lang.Object r2 = r4.A01
            X.1FE r2 = (X.AnonymousClass1FE) r2
            X.8qC r0 = r0.A0C
            java.lang.Object r1 = r0.get()
            X.2Zn r1 = (X.C45312Zn) r1
            X.1fJ r0 = r2.A03
            r1.A00(r0)
            return
        L_0x05e3:
            java.lang.Object r5 = r4.A00
            X.3Lr r5 = (X.C66503Lr) r5
            java.lang.Object r13 = r4.A01
            X.1FE r13 = (X.AnonymousClass1FE) r13
            X.2sM r3 = r5.A03
            java.util.List r10 = r13.A05
            r0 = 0
            X.C162457s7.A0J(r10, r0)
            int r0 = r10.size()
            X.8TE r6 = X.AnonymousClass8TE.create(r0)
            java.util.Iterator r2 = r10.iterator()
        L_0x05ff:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x062e
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x061a
            com.whatsapp.jid.PhoneUserJid r0 = X.C56662sM.A00(r3, r1)
            if (r0 == 0) goto L_0x05ff
            X.C162457s7.A0H(r6)
            r6.put(r0, r1)
            goto L_0x05ff
        L_0x061a:
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x05ff
            r0 = r1
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.1fH r0 = r3.A01(r0)
            if (r0 == 0) goto L_0x05ff
            X.C162457s7.A0H(r6)
            r6.put(r1, r0)
            goto L_0x05ff
        L_0x062e:
            X.C162457s7.A0H(r6)
            X.1fJ r7 = r13.A03
            r11 = 15
            java.lang.String r9 = "add"
            X.C626936e.A06(r10)
            boolean r0 = r13.A00
            if (r0 == 0) goto L_0x0655
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupIqResponseUtil/add-participants/timeout; groupId="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; participants="
            X.C18260x0.A1Q(r1, r0, r10)
            r8 = 0
        L_0x0650:
            r12 = 0
            r5.A07(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0655:
            r18 = 1
            X.4KO r8 = new X.4KO
            r16 = r13
            r17 = r13
            r12 = r8
            r14 = r5
            r15 = r13
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L_0x0650
        L_0x0664:
            java.lang.Object r0 = r4.A00
            X.2GX r0 = (X.AnonymousClass2GX) r0
            java.lang.Object r1 = r4.A01
            X.1to r0 = r0.A00
            X.3Wi r2 = r0.A00
            java.lang.String r1 = r1.toString()
            r0 = 0
            r2.A0W(r1, r0)
            return
        L_0x0677:
            java.lang.Object r0 = r4.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r6 = r4.A01
            X.5WJ r6 = (X.AnonymousClass5WJ) r6
            java.util.LinkedHashSet r5 = X.AnonymousClass0x9.A17()
            java.util.Iterator r4 = r0.iterator()
        L_0x0687:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x06c9
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r4)
            X.2sj r0 = r6.A07
            X.33h r0 = r0.A09
            java.util.Set r0 = r0.A0B(r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x06a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06b3
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x06a1
            r3.add(r1)
            goto L_0x06a1
        L_0x06b3:
            java.util.ArrayList r2 = X.C73783g4.A0c(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x06bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06c5
            X.C18310x6.A1R(r2, r1)
            goto L_0x06bb
        L_0x06c5:
            r5.addAll(r2)
            goto L_0x0687
        L_0x06c9:
            X.C86644Kx.A1S(r6.A0D, r5, r6, 33)
            return
        L_0x06cd:
            java.lang.Object r0 = r4.A00
            X.1eB r0 = (X.C27601eB) r0
            java.lang.Object r2 = r4.A01
            X.4uZ r2 = (X.C95814uZ) r2
            com.whatsapp.group.newgroup.NewGroup r0 = r0.A00
            X.1m3 r1 = r0.A0Z
            X.3Ex r0 = r0.A0D
            X.3ZH r0 = r0.A0A(r2)
            r1.A0G(r0)
            return
        L_0x06e3:
            java.lang.Object r3 = r4.A00
            com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog r3 = (com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog) r3
            java.lang.Object r2 = r4.A01
            X.03q r2 = (X.C003203q) r2
            X.2Zg r0 = r3.A00
            X.2nM r1 = r0.A01
            java.lang.String r0 = "group-no-longer-available"
            r1.A01(r2, r0)
            android.app.Dialog r0 = r3.A1I()
            r0.dismiss()
            return
        L_0x06fc:
            java.lang.Object r0 = r4.A00
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r0 = (com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet) r0
            java.lang.Object r2 = r4.A01
            X.03q r2 = (X.C003203q) r2
            X.2Zg r0 = r0.A03
            X.2nM r1 = r0.A01
            java.lang.String r0 = "group-no-longer-available"
        L_0x070a:
            r1.A01(r2, r0)
            return
        L_0x070e:
            java.lang.Object r3 = r4.A00
            X.2Ti r3 = (X.C43752Ti) r3
            java.lang.Object r15 = r4.A01
            r32 = 0
            r31 = 1
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C162457s7.A0D(r0)
            r3.A01 = r0
            X.2s6 r1 = r3.A05
            X.4Ep r0 = r3.A04
            boolean r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0733
            X.2zf r0 = r3.A06
            long r0 = r0.A02()
            r3.A00 = r0
        L_0x0733:
            X.2SK r11 = r3.A07
            X.39J r0 = r11.A01
            com.whatsapp.voipcalling.CallInfo r4 = r11.A00
            if (r0 != 0) goto L_0x0778
            if (r4 != 0) goto L_0x0778
            r2 = 0
        L_0x073e:
            X.2zf r0 = r3.A06
            long r29 = r0.A03()
            X.34j r6 = r3.A08
            android.content.Context r5 = r3.A02
            java.lang.String r20 = "InAppBugReporting"
            r18 = 0
            long r0 = r3.A00
            java.lang.String r4 = r3.A01
            r21 = r18
            r22 = r18
            r24 = r18
            r25 = r18
            r17 = r5
            r19 = r18
            r23 = r4
            r26 = r2
            r27 = r0
            r16 = r6
            java.lang.String r1 = r16.A04(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)
            X.C162457s7.A0D(r1)
            X.3Wi r4 = r3.A03
            r0 = 42
            X.3bv r3 = new X.3bv
            r3.<init>(r0, r1, r15)
        L_0x0774:
            r4.A0S(r3)
            return
        L_0x0778:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r14 = "Call Relay UUID"
            java.lang.String r7 = "Video"
            java.lang.String r16 = "Voice"
            java.lang.String r6 = "Media type"
            java.lang.String r9 = "Call start time"
            java.lang.String r5 = "Call not started"
            java.lang.String r12 = "callID"
            if (r0 == 0) goto L_0x082c
            X.2sW r13 = r11.A05
            com.whatsapp.jid.UserJid r8 = r0.A01
            boolean r4 = r0.A03
            java.lang.String r10 = r0.A02
            int r1 = r0.A00
            X.39J r0 = new X.39J
            r0.<init>(r1, r8, r10, r4)
            X.3ZF r8 = r13.A02(r0)
            if (r8 == 0) goto L_0x073e
            X.39J r0 = r8.A0E
            java.lang.String r0 = r0.A02
            r2.put(r12, r0)
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0829;
                case 1: goto L_0x0826;
                case 2: goto L_0x0823;
                case 3: goto L_0x0820;
                case 4: goto L_0x081d;
                case 5: goto L_0x081a;
                case 6: goto L_0x0817;
                default: goto L_0x07ad;
            }
        L_0x07ad:
            java.lang.String r1 = ""
        L_0x07af:
            java.lang.String r0 = "Call result"
            r2.put(r0, r1)
            int r4 = r8.A01
            if (r4 == 0) goto L_0x07c4
            long r0 = r8.A0B
            long r4 = (long) r4
            long r0 = r0 - r4
            java.lang.String r5 = "MMM-dd-yyyy HH:mm:ss z"
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = X.C18290x4.A0q(r5, r4, r0)
        L_0x07c4:
            r2.put(r9, r5)
            long r0 = r8.A0B
            java.lang.String r5 = "MMM-dd-yyyy HH:mm:ss z"
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r1 = X.C18290x4.A0q(r5, r4, r0)
            java.lang.String r0 = "Call end time"
            r2.put(r0, r1)
            boolean r0 = r8.A0L
            if (r0 != 0) goto L_0x07dc
            r7 = r16
        L_0x07dc:
            r2.put(r6, r7)
            X.5Xv r0 = r11.A03
            java.lang.String r7 = X.C627436k.A07(r10)
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "call_relay_uuid"
            java.lang.String r1 = X.C18280x3.A0Z(r1, r0)
            if (r1 == 0) goto L_0x073e
            java.lang.String r0 = ";"
            java.lang.String[] r6 = r1.split(r0)
            int r5 = r6.length
            r4 = 0
        L_0x07f9:
            if (r4 >= r5) goto L_0x073e
            r1 = r6[r4]
            java.lang.String r0 = "#"
            java.lang.String[] r1 = r1.split(r0)
            r0 = r1[r32]
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0814
            r0 = r1[r31]
        L_0x080d:
            if (r0 == 0) goto L_0x073e
            r2.put(r14, r0)
            goto L_0x073e
        L_0x0814:
            int r4 = r4 + 1
            goto L_0x07f9
        L_0x0817:
            java.lang.String r1 = "Accepted elsewhere"
            goto L_0x07af
        L_0x081a:
            java.lang.String r1 = "Connected"
            goto L_0x07af
        L_0x081d:
            java.lang.String r1 = "Rejected"
            goto L_0x07af
        L_0x0820:
            java.lang.String r1 = "Unavailable"
            goto L_0x07af
        L_0x0823:
            java.lang.String r1 = "Missed"
            goto L_0x07af
        L_0x0826:
            java.lang.String r1 = "Canceled"
            goto L_0x07af
        L_0x0829:
            java.lang.String r1 = "Invalid"
            goto L_0x07af
        L_0x082c:
            if (r4 == 0) goto L_0x073e
            java.lang.String r0 = r4.callId
            r2.put(r12, r0)
            com.whatsapp.voipcalling.CallState r0 = r4.callState
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "Call state"
            r2.put(r0, r1)
            long r0 = r4.callDuration
            r10 = 0
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0852
            long r0 = X.AnonymousClass0x9.A05(r0)
            java.lang.String r8 = "MMM-dd-yyyy HH:mm:ss z"
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r5 = X.C18290x4.A0q(r8, r5, r0)
        L_0x0852:
            r2.put(r9, r5)
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x085b
            r7 = r16
        L_0x085b:
            r2.put(r6, r7)
            java.lang.String r0 = r4.relayCallUuid
            goto L_0x080d
        L_0x0861:
            java.lang.Object r9 = r4.A00
            X.2QA r9 = (X.AnonymousClass2QA) r9
            java.lang.Object r10 = r4.A01
            X.2hM r11 = r9.A02
            monitor-enter(r11)
            X.34j r8 = r11.A04     // Catch:{ all -> 0x08c1 }
            r8.A07()     // Catch:{ all -> 0x08c1 }
            r7 = 0
            r0 = 3
            com.whatsapp.util.Log.rotate()     // Catch:{ all -> 0x08c1 }
            com.whatsapp.util.Log.compress()     // Catch:{ all -> 0x08c1 }
            r11.A00()     // Catch:{ all -> 0x08c1 }
            r6 = 1
            java.io.File r5 = r8.A03(r7, r0, r6, r6)     // Catch:{ all -> 0x08c1 }
            if (r5 == 0) goto L_0x0891
            long r3 = r5.length()     // Catch:{ all -> 0x08c1 }
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0891
            java.lang.String r4 = r8.A05(r5, r7, r6)     // Catch:{ all -> 0x08c1 }
            goto L_0x0895
        L_0x0891:
            java.lang.String r4 = r8.A06(r7)     // Catch:{ all -> 0x08c1 }
        L_0x0895:
            monitor-exit(r11)
            X.3Wi r2 = r9.A00
            r1 = 43
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r4, r10)
            r2.A0S(r0)
            X.2WS r3 = r9.A01
            X.1ZO r2 = new X.1ZO
            r2.<init>()
            if (r4 == 0) goto L_0x08b3
            int r1 = r4.length()
            r0 = 12
            if (r1 != 0) goto L_0x08b5
        L_0x08b3:
            r0 = 11
        L_0x08b5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.4FV r0 = r3.A00
            r0.BhA(r2)
            return
        L_0x08c1:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x08c4:
            java.lang.Object r0 = r4.A00
            com.whatsapp.inappsupport.ui.ContactUsWithAiViewModel r0 = (com.whatsapp.inappsupport.ui.ContactUsWithAiViewModel) r0
            java.lang.Object r2 = r4.A01
            X.38h r2 = (X.C631938h) r2
            r25 = 0
            X.2TL r3 = r0.A09
            java.lang.String r8 = "ContactUsWithAi"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            X.C162457s7.A0D(r1)
            r3.A01 = r1
            X.2s6 r4 = r3.A04
            X.4Ep r1 = r3.A03
            boolean r1 = r4.A07(r1)
            if (r1 == 0) goto L_0x08ed
            X.2zf r1 = r3.A05
            long r4 = r1.A02()
            r3.A00 = r4
        L_0x08ed:
            X.2zf r1 = r3.A05
            long r17 = r1.A03()
            X.34j r4 = r3.A07
            android.content.Context r5 = r3.A02
            r7 = 0
            r19 = 1
            long r15 = r3.A00
            java.lang.String r11 = r3.A01
            X.2oX r1 = r3.A06
            android.util.Pair r6 = r1.A00()
            java.util.List r13 = X.AnonymousClass27R.A00(r2)
            r10 = r7
            r12 = r7
            r14 = r7
            r9 = r7
            r20 = r19
            java.lang.String r23 = r4.A04(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            X.C162457s7.A0D(r23)
            X.2aw r1 = r0.A0A
            java.lang.String r22 = "#chatbot"
            r20 = r1
            r21 = r0
            r24 = r19
            r20.A00(r21, r22, r23, r24, r25)
            return
        L_0x0923:
            java.lang.Object r1 = r4.A00
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r1 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r1
            java.lang.Object r0 = r4.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView.setVideoThumbnail$lambda$4$lambda$3(r1, r0)
            return
        L_0x092f:
            java.lang.Object r3 = r4.A00
            X.37H r3 = (X.AnonymousClass37H) r3
            java.lang.Object r2 = r4.A01
            android.os.IBinder r2 = (android.os.IBinder) r2
            if (r2 == 0) goto L_0x09ab
            java.lang.String r7 = "com.whatsapp.instrumentation.CallbackInterface"
            android.os.IInterface r6 = r2.queryLocalInterface(r7)     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            if (r6 == 0) goto L_0x0956
            boolean r0 = r6 instanceof X.C628937d     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            if (r0 == 0) goto L_0x0956
            X.37d r6 = (X.C628937d) r6     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            if (r6 == 0) goto L_0x09ab
        L_0x0949:
            boolean r0 = r3.A01     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            if (r0 == 0) goto L_0x0986
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            goto L_0x095c
        L_0x0956:
            X.37d r6 = new X.37d     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            r6.<init>(r2)     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            goto L_0x0949
        L_0x095c:
            r5.writeInterfaceToken(r7)     // Catch:{ all -> 0x09a3 }
            android.os.IBinder r1 = r6.A00     // Catch:{ all -> 0x09a3 }
            r0 = 1
            X.AnonymousClass000.A0w(r1, r5, r4, r0)     // Catch:{ all -> 0x09a3 }
            java.lang.String r2 = r4.readString()     // Catch:{ all -> 0x09a3 }
            r4.recycle()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            r5.recycle()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            X.2c7 r0 = r3.A02     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            X.2eN r1 = r0.A03     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            java.lang.String r0 = "com.facebook.stella"
            boolean r0 = r1.A00(r0, r2)     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            if (r0 != 0) goto L_0x0986
            java.lang.String r0 = "CallbackServiceProxy/request invalid authorization token"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            X.24I r0 = new X.24I     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            r0.<init>()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            goto L_0x09b5
        L_0x0986:
            java.lang.String r0 = r3.A00     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            r5.writeInterfaceToken(r7)     // Catch:{ all -> 0x09a3 }
            r5.writeString(r0)     // Catch:{ all -> 0x09a3 }
            android.os.IBinder r1 = r6.A00     // Catch:{ all -> 0x09a3 }
            r0 = 2
            X.AnonymousClass000.A0w(r1, r5, r4, r0)     // Catch:{ all -> 0x09a3 }
            r4.recycle()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            r5.recycle()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            goto L_0x09d5
        L_0x09a3:
            r0 = move-exception
            r4.recycle()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            r5.recycle()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            goto L_0x09b5
        L_0x09ab:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
            java.lang.String r0 = "Cannot convert binder to interface: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r2, r0, r1)     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
        L_0x09b5:
            throw r0     // Catch:{ 24I -> 0x09bd, all -> 0x09b6 }
        L_0x09b6:
            r1 = move-exception
            java.lang.String r0 = "CallbackServiceProxy/failed to send request:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09df }
            goto L_0x09d5
        L_0x09bd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x09df }
            java.lang.String r0 = "CallbackServiceProxy/failed to send request: "
            r1.append(r0)     // Catch:{ all -> 0x09df }
            java.lang.String r0 = r2.message     // Catch:{ all -> 0x09df }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x09df }
            X.2c7 r0 = r3.A02     // Catch:{ all -> 0x09df }
            X.2ax r1 = r0.A01     // Catch:{ all -> 0x09df }
            java.lang.String r0 = "com.facebook.stella"
            r1.A00(r0)     // Catch:{ all -> 0x09df }
        L_0x09d5:
            X.2c7 r0 = r3.A02
            X.2oU r0 = r0.A00
            android.content.Context r0 = r0.A00
            r0.unbindService(r3)
            return
        L_0x09df:
            r1 = move-exception
            X.2c7 r0 = r3.A02
            X.2oU r0 = r0.A00
            android.content.Context r0 = r0.A00
            r0.unbindService(r3)
            throw r1
        L_0x09ea:
            java.lang.Object r3 = r4.A00
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r3 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r3
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r3.A0i
            r1 = 1
            if (r0 != 0) goto L_0x0a01
            boolean r0 = r3.A0Z
            if (r0 != 0) goto L_0x0a01
            r2.setEnabled(r1)
            r3.A1L()
        L_0x0a01:
            X.C18320x8.A1D(r3)
            return
        L_0x0a05:
            X.2TZ r0 = r5.A0O
            com.whatsapp.WaImageView r0 = r0.A06
            r0.setVisibility(r2)
            X.2TZ r0 = r5.A0O
            com.airbnb.lottie.LottieAnimationView r0 = r0.A00
            int r2 = r0.getVisibility()
            X.2TZ r0 = r5.A0O
            if (r2 != 0) goto L_0x0a27
            com.airbnb.lottie.LottieAnimationView r0 = r0.A00
            X.4Gv r1 = new X.4Gv
            r1.<init>(r5, r4)
            X.01G r0 = r0.A0F
            X.00H r0 = r0.A0K
            r0.addListener(r1)
            return
        L_0x0a27:
            com.airbnb.lottie.LottieAnimationView r0 = r0.A01
            r0.setVisibility(r1)
            X.2TZ r0 = r5.A0O
            com.airbnb.lottie.LottieAnimationView r0 = r0.A01
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70103Zx.run():void");
    }
}
