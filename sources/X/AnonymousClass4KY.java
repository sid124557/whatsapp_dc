package X;

/* renamed from: X.4KY  reason: invalid class name */
public class AnonymousClass4KY implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass4KY(AnonymousClass1FE r1, C66503Lr r2, AnonymousClass4B6 r3, Runnable runnable, int i) {
        this.A04 = i;
        this.A00 = r2;
        if (1 - i != 0) {
            this.A01 = r1;
            this.A02 = r3;
            this.A03 = runnable;
        } else {
            this.A01 = r3;
            this.A02 = runnable;
            this.A03 = r1;
        }
    }

    public void BQs(String str) {
        int i = this.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        switch (i) {
            case 0:
                C18260x0.A0s("GroupXmppMethods/sendRevokeGroupInvites/onDeliveryFailure; iq=", str, A0o);
                C18260x0.A0I((C130076bL) this.A01, "sendRevokeGroupInvites IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            case 1:
                A0o.append("GroupIqResponseUtil/remove-participants/delivery fail; groupId=");
                C18260x0.A0o(((AnonymousClass1FE) this.A03).A03, A0o);
                return;
            case 2:
                A0o.append("GroupIqResponseUtil/add-admin/delivery fail; groupId=");
                C18260x0.A0o(((AnonymousClass1FE) this.A01).A03, A0o);
                return;
            case 3:
                C18260x0.A0s("GroupXmppMethods/sendJoinGroupByCode/onDeliveryFailure; iq=", str, A0o);
                C18260x0.A0I((C130076bL) this.A01, "joinGroupByCode IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            default:
                C18260x0.A0s("GdprXmppMethods/sendDeleteGdprReport/onDeliveryFailure; iq=", str, A0o);
                C18260x0.A0I((C130076bL) this.A02, "XMPP IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        ((X.AnonymousClass4B6) r1).BkI(X.C57492tj.A01(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        X.C18310x6.A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r0 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSN(X.AnonymousClass36K r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0044;
                case 2: goto L_0x0047;
                case 3: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = X.C57492tj.A01(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GdprXmppMethods/sendDeleteGdprReport/onError; iq="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", error="
            X.C18260x0.A0y(r0, r1, r2)
            java.lang.Object r0 = r3.A01
            X.4B6 r0 = (X.AnonymousClass4B6) r0
            r0.BkI(r2)
            java.lang.Object r0 = r3.A02
        L_0x0023:
            X.C18310x6.A1H(r0)
            return
        L_0x0027:
            java.lang.Object r0 = r3.A03
            X.2Gy r0 = (X.C40582Gy) r0
            if (r0 == 0) goto L_0x0041
            int r1 = X.C57492tj.A01(r4)
            X.1u1 r0 = r0.A00
            r0.A00 = r1
            goto L_0x0041
        L_0x0036:
            java.lang.Object r1 = r3.A02
            X.4B6 r1 = (X.AnonymousClass4B6) r1
            int r0 = X.C57492tj.A01(r4)
            r1.BkI(r0)
        L_0x0041:
            java.lang.Object r0 = r3.A01
            goto L_0x0023
        L_0x0044:
            java.lang.Object r1 = r3.A01
            goto L_0x0049
        L_0x0047:
            java.lang.Object r1 = r3.A02
        L_0x0049:
            X.4B6 r1 = (X.AnonymousClass4B6) r1
            int r0 = X.C57492tj.A01(r4)
            r1.BkI(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KY.BSN(X.36K, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0114, code lost:
        ((X.AnonymousClass4B6) r1).BkI(800);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        X.C18310x6.A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015b, code lost:
        X.AnonymousClass0x9.A1K(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r9, java.lang.String r10) {
        /*
            r8 = this;
            int r0 = r8.A04
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x00b3;
                case 2: goto L_0x00f4;
                case 3: goto L_0x0163;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GdprXmppMethods/sendDeleteGdprReport/onSuccess; iq="
            X.C18260x0.A0s(r0, r10, r1)
            java.lang.Object r0 = r8.A03
            X.AnonymousClass0x9.A1K(r0)
            java.lang.Object r0 = r8.A02
        L_0x0015:
            X.C18310x6.A1H(r0)
            return
        L_0x0019:
            X.6aP r4 = new X.6aP
            r4.<init>()
            X.7o6 r3 = new X.7o6
            r3.<init>()
            java.lang.String r0 = "revoke"
            X.36K r1 = r9.A0m(r0)
            java.lang.String r0 = "participant"
            java.util.List r0 = r1.A0s(r0)
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.Iterator r7 = r0.iterator()
        L_0x0039:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0071
            X.36K r6 = X.C18310x6.A0Y(r7)
            com.whatsapp.jid.Jid r2 = X.AnonymousClass36K.A06(r6)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "phone_number"
            com.whatsapp.jid.Jid r1 = r6.A0g(r1, r0)
            boolean r0 = X.C627336j.A0L(r2)
            if (r0 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            r5.put(r2, r1)
        L_0x005b:
            java.lang.String r0 = "error"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r6, r0)
            if (r2 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x006d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0039 }
            X.AnonymousClass0x2.A11(r3, r2, r0)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0039
        L_0x006d:
            r4.add((java.lang.Object) r2)
            goto L_0x0039
        L_0x0071:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0086
            java.lang.Object r0 = r8.A00
            X.3Lr r0 = (X.C66503Lr) r0
            X.8qC r0 = r0.A0E
            java.lang.Object r0 = r0.get()
            X.2mQ r0 = (X.C53022mQ) r0
            r0.A01(r5)
        L_0x0086:
            X.6aS r4 = r4.build()
            X.8OQ r5 = r3.build()
            java.lang.Object r0 = r8.A00
            X.3Lr r0 = (X.C66503Lr) r0
            X.3Lq r2 = X.C66503Lr.A00(r0)
            java.lang.Object r3 = r8.A02
            X.4FS r0 = r2.A1C
            r6 = 2
            X.3ac r1 = new X.3ac
            r1.<init>(r2, r3, r4, r5, r6)
            r0.BkM(r1)
            java.lang.Object r0 = r8.A03
            X.2Gy r0 = (X.C40582Gy) r0
            if (r0 == 0) goto L_0x00af
            X.1u1 r0 = r0.A00
            r0.A02 = r4
            r0.A01 = r5
        L_0x00af:
            java.lang.Object r0 = r8.A01
            goto L_0x0015
        L_0x00b3:
            com.whatsapp.jid.Jid r4 = X.AnonymousClass36K.A07(r9)
            if (r4 != 0) goto L_0x00bc
            java.lang.Object r1 = r8.A01
            goto L_0x0114
        L_0x00bc:
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.lang.Object r1 = r8.A00
            X.3Lr r1 = (X.C66503Lr) r1
            java.lang.String r0 = "remove"
            X.AnonymousClass31X.A02(r9, r0, r3, r2)
            X.C66503Lr.A00(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onRemoveGroupParticipants/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.AnonymousClass0x2.A0g(r1, r3, r2)
            X.C18260x0.A1L(r1, r0)
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00f1
            r1 = 3002(0xbba, float:4.207E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
        L_0x00f1:
            java.lang.Object r0 = r8.A02
            goto L_0x015b
        L_0x00f4:
            java.lang.Object r2 = r8.A00
            X.3Lr r2 = (X.C66503Lr) r2
            X.8qC r0 = r2.A0A
            java.lang.Object r1 = r0.get()
            X.2rN r1 = (X.C56072rN) r1
            java.lang.Object r0 = r8.A01
            X.1FE r0 = (X.AnonymousClass1FE) r0
            X.1fJ r0 = r0.A03
            boolean r0 = r1.A06(r0)
            com.whatsapp.jid.Jid r5 = X.AnonymousClass36K.A07(r9)
            X.1fJ r5 = (X.C27991fJ) r5
            if (r5 != 0) goto L_0x011c
            java.lang.Object r1 = r8.A02
        L_0x0114:
            X.4B6 r1 = (X.AnonymousClass4B6) r1
            r0 = 800(0x320, float:1.121E-42)
            r1.BkI(r0)
            return
        L_0x011c:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = "admin"
        L_0x0128:
            X.AnonymousClass31X.A02(r9, r0, r4, r3)
            X.3Lq r2 = X.C66503Lr.A00(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onPromoteGroupParticipants/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.AnonymousClass0x2.A0g(r1, r4, r3)
            X.C18260x0.A1L(r1, r0)
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0159
            X.2rN r0 = r2.A1B
            boolean r0 = r0.A06(r5)
            r1 = 3003(0xbbb, float:4.208E-42)
            if (r0 == 0) goto L_0x0154
            r1 = 3019(0xbcb, float:4.23E-42)
        L_0x0154:
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r3, r1)
        L_0x0159:
            java.lang.Object r0 = r8.A03
        L_0x015b:
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x015f:
            java.lang.String r0 = "promote"
            goto L_0x0128
        L_0x0163:
            X.36K r4 = r9.A0j()
            java.lang.String r2 = r4.A00
            java.lang.String r0 = "group"
            boolean r0 = r0.equals(r2)
            r3 = 0
            java.lang.String r1 = "jid"
            if (r0 == 0) goto L_0x018a
            java.lang.Object r2 = r8.A03
            X.4Ad r2 = (X.C83874Ad) r2
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            com.whatsapp.jid.Jid r1 = r4.A0g(r0, r1)
            r0 = 0
        L_0x017f:
            r2.BkK(r1, r0)
            java.lang.Object r0 = r8.A01
            X.6bL r0 = (X.C130076bL) r0
            r0.A05(r3)
            return
        L_0x018a:
            java.lang.String r0 = "membership_approval_request"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x019e
            java.lang.Object r2 = r8.A03
            X.4Ad r2 = (X.C83874Ad) r2
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            com.whatsapp.jid.Jid r1 = r4.A0g(r0, r1)
            r0 = 1
            goto L_0x017f
        L_0x019e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Connection/sendJoinGroupByCode unrecognized node:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " tag:"
            X.24Y r1 = X.AnonymousClass24Y.A02(r0, r2, r1)
            java.lang.Object r0 = r8.A01
            X.6bL r0 = (X.C130076bL) r0
            r0.A05(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KY.BdM(X.36K, java.lang.String):void");
    }

    public AnonymousClass4KY(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A01 = obj;
    }
}
