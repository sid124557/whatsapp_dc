package X;

/* renamed from: X.6Bz  reason: invalid class name and case insensitive filesystem */
public class C124366Bz implements C834048g, AnonymousClass4GQ {
    public Object A00;
    public final int A01;

    public C124366Bz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cc, code lost:
        r0 = new X.C70143a1(r2, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        r2.runOnUiThread(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d3, code lost:
        return X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ea, code lost:
        X.C06270Wx.A03(r1, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x0170;
                case 2: goto L_0x00ed;
                case 3: goto L_0x013d;
                case 4: goto L_0x0130;
                case 5: goto L_0x011e;
                case 6: goto L_0x00d6;
                case 7: goto L_0x00c7;
                case 8: goto L_0x0080;
                case 9: goto L_0x007a;
                case 10: goto L_0x0073;
                case 11: goto L_0x0034;
                case 12: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.4XH r0 = (X.AnonymousClass4XH) r0
            X.5dh r7 = (X.C108875dh) r7
            com.whatsapp.search.SearchViewModel r3 = r0.A10
            X.5ZL r0 = r3.A03
            if (r0 == 0) goto L_0x0027
            X.5iD r2 = r0.A0A
            boolean r0 = X.C111515iD.A00(r2)
            if (r0 == 0) goto L_0x0027
            X.4sJ r1 = new X.4sJ
            r1.<init>()
            r0 = 2
            X.C94924sJ.A00(r2, r1, r0)
            X.4FV r0 = r2.A02
            r0.BhD(r1)
        L_0x0027:
            r3.A0Z(r7)
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            java.lang.Object r2 = r6.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 19
            goto L_0x00cc
        L_0x0034:
            java.lang.Object r2 = r6.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfileCheckpointRegisterName/maybeCreatePasskey/result: "
            java.lang.String r0 = X.C18300x5.A0k(r7, r0, r1)
            X.C18260x0.A1L(r1, r0)
            X.58h r0 = X.C998158h.PASSKEY_CREATED
            if (r7 != r0) goto L_0x0052
            r1 = 41
        L_0x004b:
            X.3cH r0 = new X.3cH
            r0.<init>((java.lang.Object) r2, (int) r1)
            goto L_0x00d1
        L_0x0052:
            X.58h r0 = X.C998158h.INELIGIBLE
            if (r7 == r0) goto L_0x002a
            X.58h r0 = X.C998158h.ALREADY_HAS_PASSKEY
            if (r7 == r0) goto L_0x002a
            X.58h r0 = X.C998158h.ERROR_BEFORE_USER_INTERACTION
            if (r7 == r0) goto L_0x002a
            X.58h r0 = X.C998158h.USER_CANCELED
            if (r7 == r0) goto L_0x002a
            X.58h r0 = X.C998158h.ERROR_AFTER_USER_INTERACTION
            if (r7 == r0) goto L_0x0070
            X.58h r0 = X.C998158h.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
            if (r7 == r0) goto L_0x0070
            java.lang.String r0 = "ProfileCheckpointRegisterName/maybeCreatePasskey/non exhaustive"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x002a
        L_0x0070:
            r1 = 42
            goto L_0x004b
        L_0x0073:
            java.lang.Object r2 = r6.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 20
            goto L_0x00cc
        L_0x007a:
            java.lang.Object r2 = r6.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 4
            goto L_0x00cc
        L_0x0080:
            java.lang.Object r2 = r6.A00
            com.whatsapp.registration.RegisterName r2 = (com.whatsapp.registration.RegisterName) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RegisterName//maybeCreatePasskey/result: "
            java.lang.String r0 = X.C18300x5.A0k(r7, r0, r1)
            X.C18260x0.A1L(r1, r0)
            X.58h r0 = X.C998158h.PASSKEY_CREATED
            if (r7 != r0) goto L_0x00a6
            r1 = 36
        L_0x0097:
            X.3Zp r0 = new X.3Zp
            r0.<init>(r2, r1)
            r2.runOnUiThread(r0)
        L_0x009f:
            com.whatsapp.WaEditText r1 = r2.A0L
            r0 = 0
            r1.A07(r0)
            goto L_0x002a
        L_0x00a6:
            X.58h r0 = X.C998158h.INELIGIBLE
            if (r7 == r0) goto L_0x009f
            X.58h r0 = X.C998158h.ALREADY_HAS_PASSKEY
            if (r7 == r0) goto L_0x009f
            X.58h r0 = X.C998158h.ERROR_BEFORE_USER_INTERACTION
            if (r7 == r0) goto L_0x009f
            X.58h r0 = X.C998158h.USER_CANCELED
            if (r7 == r0) goto L_0x009f
            X.58h r0 = X.C998158h.ERROR_AFTER_USER_INTERACTION
            if (r7 == r0) goto L_0x00c4
            X.58h r0 = X.C998158h.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
            if (r7 == r0) goto L_0x00c4
            java.lang.String r0 = "RegisterName//maybeCreatePasskey/non exhaustive"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x009f
        L_0x00c4:
            r1 = 37
            goto L_0x0097
        L_0x00c7:
            java.lang.Object r2 = r6.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 3
        L_0x00cc:
            X.3a1 r0 = new X.3a1
            r0.<init>(r2, r1, r7)
        L_0x00d1:
            r2.runOnUiThread(r0)
            goto L_0x002a
        L_0x00d6:
            java.lang.Object r2 = r6.A00
            com.whatsapp.mentions.MentionableEntry r2 = (com.whatsapp.mentions.MentionableEntry) r2
            X.3ZH r7 = (X.AnonymousClass3ZH) r7
            X.5Xz r1 = r2.A0H
            X.4uZ r0 = r2.A0B
            X.1fJ r0 = X.AnonymousClass34R.A01(r0)
            X.7HU r0 = r1.A01(r7, r0)
            r2.A0I(r0, r7)
            goto L_0x002a
        L_0x00ed:
            java.lang.Object r2 = r6.A00
            X.4ha r2 = (X.C90514ha) r2
            java.lang.String r7 = (java.lang.String) r7
            r2.A10 = r7
            X.5Uu r1 = r2.A0T
            com.whatsapp.jid.UserJid r0 = r2.A0r
            X.5dw r0 = r1.A08(r0, r7)
            r2.A0V = r0
            r0 = 0
            r2.A16 = r0
            r2.A76(r7)
            r2.A74()
            X.4V5 r3 = r2.A0k
            com.whatsapp.jid.UserJid r2 = r2.A0r
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0N
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x002a
            X.5MK r1 = r3.A0G
            r0 = 46
            r1.A00(r2, r0)
            goto L_0x002a
        L_0x011e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BweMLModelManager/fetchBweModels/Failed to fetch BWE ml model: "
            r1.append(r0)
            java.lang.String r0 = X.C18310x6.A0n(r7)
            X.C18260x0.A1K(r1, r0)
            goto L_0x01d1
        L_0x0130:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BweMLModelManager/fetchBweModels/Successfully fetch BWE ml Model: "
            X.C18260x0.A0s(r0, r7, r1)
            goto L_0x01d1
        L_0x013d:
            java.lang.Object r3 = r6.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r3 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r3
            X.4UC r0 = r3.A0h
            r0.A0G(r7)
            X.4UC r1 = r3.A0j
            r0 = 3
            X.C06270Wx.A04(r1, r0)
            java.util.List r2 = r3.A0H()
            r1 = 1
            X.6lv r0 = new X.6lv
            r0.<init>(r1)
            r2.add(r0)
            X.08J r0 = r3.A0F
            r0.A0G(r2)
            X.5iE r2 = r3.A0M
            java.lang.Integer r1 = X.C105085Tn.A00(r3)
            r0 = 70
            X.4sp r0 = X.C95224sp.A00(r0)
            r0.A09 = r1
            r2.A04(r0)
            goto L_0x01d1
        L_0x0170:
            java.lang.Object r5 = r6.A00
            X.4Tu r5 = (X.AnonymousClass4Tu) r5
            X.2lJ r7 = (X.C52332lJ) r7
            X.2zH r4 = r5.A05
            r4.A00 = r7
            X.1ip r0 = r5.A08
            boolean r0 = r0.A0F()
            X.5Qb r3 = r5.A04
            if (r0 == 0) goto L_0x01a3
            com.whatsapp.jid.UserJid r2 = r5.A09
            X.5Uu r1 = r3.A02
            r0 = 0
            r1.A0G(r2, r0)
            java.util.Map r0 = r3.A06
            r0.remove(r4)
            X.08M r2 = r5.A02
            r1 = 4
            X.3Dx r0 = new X.3Dx
            r0.<init>(r1)
            r2.A0G(r0)
            r3.A00(r2, r4)
            r3.A01(r4)
            goto L_0x01d1
        L_0x01a3:
            java.util.Map r0 = r3.A06
            java.lang.Object r0 = r0.get(r4)
            X.5iv r0 = (X.C111935iv) r0
            if (r0 == 0) goto L_0x01d1
            int r1 = r0.A00
            java.util.List r0 = r0.A07
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x01d1
            X.08J r1 = r5.A00
            goto L_0x01ea
        L_0x01ba:
            java.lang.Object r3 = r6.A00
            X.4Tu r3 = (X.AnonymousClass4Tu) r3
            X.2lJ r7 = (X.C52332lJ) r7
            X.2zH r2 = r3.A05
            r2.A00 = r7
            X.1ip r0 = r3.A08
            boolean r1 = r0.A0F()
            X.5Qb r0 = r3.A04
            if (r1 == 0) goto L_0x01d4
            r0.A01(r2)
        L_0x01d1:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x01d4:
            java.util.Map r0 = r0.A06
            java.lang.Object r0 = r0.get(r2)
            X.5iv r0 = (X.C111935iv) r0
            if (r0 == 0) goto L_0x01d1
            int r1 = r0.A00
            java.util.List r0 = r0.A07
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x01d1
            X.08J r1 = r3.A00
        L_0x01ea:
            r0 = 5
            X.C06270Wx.A03(r1, r0)
            goto L_0x01d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124366Bz.invoke(java.lang.Object):java.lang.Object");
    }
}
