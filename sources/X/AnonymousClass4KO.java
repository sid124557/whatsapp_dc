package X;

import com.whatsapp.util.Log;

/* renamed from: X.4KO  reason: invalid class name */
public class AnonymousClass4KO implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public AnonymousClass4KO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A01 = obj;
        this.A03 = obj5;
    }

    public void BQs(String str) {
        switch (this.A05) {
            case 0:
                C18260x0.A0I((C130076bL) this.A01, "sendRevokeGroupInvites IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            case 1:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("GroupIqResponseUtil/add-participants/delivery fail; groupId=");
                C18260x0.A0o(((AnonymousClass1FE) this.A04).A03, A0o);
                return;
            default:
                ((C45462a3) this.A00).A00((C833748d) null);
                Log.e("OnDemandFetch/delivery fail");
                return;
        }
    }

    public void BSN(AnonymousClass36K r4, String str) {
        switch (this.A05) {
            case 0:
                ((AnonymousClass4B6) this.A03).BkI(C57492tj.A01(r4));
                C18310x6.A1H(this.A01);
                return;
            case 1:
                ((AnonymousClass4B6) this.A01).BkI(C57492tj.A01(r4));
                return;
            default:
                int A002 = C57492tj.A00(r4);
                ((C45462a3) this.A00).A00((C833748d) null);
                C18260x0.A0x("OnDemandFetch/Error/", AnonymousClass001.A0o(), A002);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0177, code lost:
        if (r7.size() != r10.size()) goto L_0x0179;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r12, java.lang.String r13) {
        /*
            r11 = this;
            int r0 = r11.A05
            switch(r0) {
                case 0: goto L_0x01d3;
                case 1: goto L_0x0059;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.C162457s7.A0J(r12, r0)
            java.lang.Object r0 = r11.A04
            X.2Ir r0 = (X.C41032Ir) r0
            X.36K r3 = X.C41032Ir.A02(r12, r0)
            r0 = 94
            X.4Jp r1 = X.C86304Jp.A00(r0)
            java.lang.String r0 = "surfaces"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r2 = X.C626836d.A04(r12, r1, r0)
            X.1vs r2 = (X.C34821vs) r2
            r0 = 13
            X.C626836d.A0E(r3, r12, r0)
            X.2do r1 = new X.2do
            r1.<init>()
            java.lang.Object r0 = r2.A00
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = r1.A01(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01af
            java.util.Iterator r2 = r1.iterator()
        L_0x0040:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01af
            java.lang.Object r1 = r2.next()
            X.2Md r1 = (X.C41932Md) r1
            java.lang.Object r0 = r11.A01
            X.2x0 r0 = (X.C59492x0) r0
            X.32t r0 = r0.A02
            X.C162457s7.A0H(r1)
            r0.A03(r1)
            goto L_0x0040
        L_0x0059:
            java.lang.Object r0 = r11.A04
            X.1FE r0 = (X.AnonymousClass1FE) r0
            X.1fJ r0 = r0.A03
            X.2RJ r8 = new X.2RJ
            r8.<init>(r0)
            com.whatsapp.jid.Jid r3 = X.AnonymousClass36K.A07(r12)
            if (r3 != 0) goto L_0x0074
            java.lang.Object r1 = r11.A01
            X.4B6 r1 = (X.AnonymousClass4B6) r1
            r0 = 800(0x320, float:1.121E-42)
            r1.BkI(r0)
            return
        L_0x0074:
            java.lang.Object r2 = r11.A00
            X.3Lr r2 = (X.C66503Lr) r2
            X.1VX r1 = r2.A04
            java.lang.String r0 = "add"
            X.AnonymousClass31X.A00(r1, r8, r12, r0)
            X.C66503Lr.A00(r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onAddGroupParticipants/"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.util.Map r9 = r8.A04
            java.util.Set r0 = r9.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            r2.append(r0)
            r2.append(r1)
            java.util.Map r7 = r8.A02
            java.util.Set r0 = r7.keySet()
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            X.C18260x0.A1L(r2, r0)
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x00c5
            r1 = 3001(0xbb9, float:4.205E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r7, r1)
        L_0x00c5:
            java.lang.Object r0 = r11.A03
            X.AnonymousClass0x9.A1K(r0)
            java.lang.Object r5 = r11.A02
            X.1dt r5 = (X.C27481dt) r5
            boolean r0 = r5 instanceof X.C27361dh
            if (r0 == 0) goto L_0x0184
            X.1dh r5 = (X.C27361dh) r5
            java.util.Map r0 = r8.A03
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0146
            X.2dW r2 = r5.A00
            X.3Wi r1 = r2.A06
            r0 = 1
            X.C69263Wi.A04(r1, r8, r2, r0)
        L_0x00e6:
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r7)
        L_0x00ea:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = X.AnonymousClass0x2.A0W(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00ea
            int r1 = r0.intValue()
            r0 = 421(0x1a5, float:5.9E-43)
            if (r1 != r0) goto L_0x00ea
            X.2dW r3 = r5.A00
            X.3Wi r2 = r3.A06
            r1 = 42
            X.3Zl r0 = new X.3Zl
            r0.<init>(r3, r1)
            r2.A0S(r0)
        L_0x010e:
            X.2dW r4 = r5.A00
            android.content.Context r0 = r4.A03
            java.lang.String r3 = X.AnonymousClass27F.A00(r0, r8)
            if (r3 == 0) goto L_0x012a
            int r0 = r3.length()
            if (r0 == 0) goto L_0x012a
            X.3Wi r2 = r4.A06
            r1 = 39
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r3, r4)
            r2.A0S(r0)
        L_0x012a:
            java.util.Set r0 = r9.keySet()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01d2
            X.4GQ r1 = r4.A0J
            java.util.Set r0 = r9.keySet()
            java.util.List r0 = X.C73723fy.A0F(r0)
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            r1.invoke(r0)
            return
        L_0x0146:
            java.util.ArrayList r10 = r8.A01
            boolean r0 = X.AnonymousClass0x7.A1S(r10)
            if (r0 == 0) goto L_0x00e6
            X.2dW r3 = r5.A00
            X.1VX r2 = r3.A0C
            r1 = 4136(0x1028, float:5.796E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00e6
            X.4ea r6 = r3.A05
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x00e6
            android.content.Context r4 = r3.A03
            X.1fJ r3 = r8.A00
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0179
            int r2 = r7.size()
            int r0 = r10.size()
            r1 = 1
            if (r2 == r0) goto L_0x017a
        L_0x0179:
            r1 = 0
        L_0x017a:
            r0 = 2
            android.content.Intent r0 = X.C627736r.A0X(r4, r3, r10, r0, r1)
            r6.startActivity(r0)
            goto L_0x00e6
        L_0x0184:
            X.1di r5 = (X.C27371di) r5
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x019a
            java.util.Iterator r0 = X.C18280x3.A0i(r9)
            java.lang.Object r1 = r0.next()
            X.4UC r0 = r5.A03
        L_0x0196:
            r0.A0G(r1)
            return
        L_0x019a:
            java.util.Map r1 = r8.A03
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x01a5
            X.4UC r0 = r5.A02
            goto L_0x0196
        L_0x01a5:
            r1 = r7
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x01d2
            X.4UC r0 = r5.A01
            goto L_0x0196
        L_0x01af:
            java.lang.Object r4 = r11.A01
            X.2x0 r4 = (X.C59492x0) r4
            X.32t r2 = r4.A02
            r1 = 11231(0x2bdf, float:1.5738E-41)
            java.lang.String r0 = "whatsapp_push_notification_event"
            java.util.List r3 = r2.A02(r0, r1)
            java.lang.Object r2 = r11.A03
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r1 = r11.A00
            X.2a3 r1 = (X.C45462a3) r1
            java.lang.Object r0 = r11.A02
            X.48c r0 = (X.C833648c) r0
            r4.A00(r1, r0, r3, r2)
            java.lang.String r0 = "OnDemandFetch/fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01d2:
            return
        L_0x01d3:
            java.lang.String r0 = "membership_approval_request"
            X.36K r3 = r12.A0l(r0)
            java.lang.Object r2 = r11.A04
            X.4Ad r2 = (X.C83874Ad) r2
            java.lang.Object r1 = r11.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r0 = 1
            if (r3 != 0) goto L_0x01e5
            r0 = 0
        L_0x01e5:
            r2.BkK(r1, r0)
            java.lang.Object r0 = r11.A01
            X.C18310x6.A1H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KO.BdM(X.36K, java.lang.String):void");
    }
}
