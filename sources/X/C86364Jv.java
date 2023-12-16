package X;

/* renamed from: X.4Jv  reason: invalid class name and case insensitive filesystem */
public class C86364Jv implements C834048g, AnonymousClass4GQ {
    public Object A00;
    public final int A01;

    public C86364Jv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r0.A0G(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011c, code lost:
        r3.A0A("participant-attribute-parser", false, r12.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a2, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0097;
                case 2: goto L_0x0149;
                case 3: goto L_0x0149;
                case 4: goto L_0x0005;
                case 5: goto L_0x0158;
                case 6: goto L_0x015b;
                case 7: goto L_0x0005;
                case 8: goto L_0x009f;
                case 9: goto L_0x0194;
                case 10: goto L_0x00e7;
                case 11: goto L_0x00f8;
                case 12: goto L_0x00ff;
                case 13: goto L_0x0114;
                case 14: goto L_0x0127;
                case 15: goto L_0x01a3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r11.A00
            X.11B r2 = (X.AnonymousClass11B) r2
            X.2so r1 = r2.A03
            r0 = 1
            r1.A06(r0)
            X.4UC r0 = r2.A0O
        L_0x0011:
            r0.A0G(r12)
        L_0x0014:
            r4 = 0
            return r4
        L_0x0016:
            java.lang.Object r5 = r11.A00
            com.whatsapp.community.CommunityHomeActivity r5 = (com.whatsapp.community.CommunityHomeActivity) r5
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            X.2cS r0 = r5.A0T
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0069
            X.2cS r10 = r5.A0T
            r3 = 0
            X.C162457s7.A0J(r12, r3)
            X.5ZU r4 = r10.A02
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            boolean r1 = r4.A0g(r12, r2)
            r0 = -1
            java.util.List r9 = r4.A0Z(r2, r0, r1)
            int r1 = r9.size()
            if (r1 == 0) goto L_0x0069
            r7 = 1
            if (r1 == r7) goto L_0x007f
            r8 = 2
            X.3Wi r6 = r10.A00
            X.2oU r0 = r10.A03
            android.content.res.Resources r4 = X.C54292oU.A00(r0)
            if (r1 == r8) goto L_0x0076
            r3 = 2131755050(0x7f10002a, float:1.9140968E38)
            int r2 = X.AnonymousClass002.A04(r9, r8)
            java.lang.Object[] r1 = X.AnonymousClass0x9.A1X()
            X.C18290x4.A1T(r9, r1)
            int r0 = X.AnonymousClass002.A04(r9, r8)
            X.AnonymousClass000.A1P(r1, r0, r8)
            java.lang.String r0 = r4.getQuantityString(r3, r2, r1)
        L_0x0066:
            r6.A0P(r0, r7)
        L_0x0069:
            X.4FS r2 = r5.A04
            r1 = 30
            X.3cS r0 = new X.3cS
            r0.<init>(r5, r1, r12)
            r2.BkM(r0)
            goto L_0x0014
        L_0x0076:
            r2 = 2131888011(0x7f12078b, float:1.9410645E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.C18290x4.A1T(r9, r1)
            goto L_0x0092
        L_0x007f:
            X.3Wi r6 = r10.A00
            X.2oU r0 = r10.A03
            android.content.res.Resources r4 = X.C54292oU.A00(r0)
            r2 = 2131887976(0x7f120768, float:1.9410574E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r9.get(r3)
            r1[r3] = r0
        L_0x0092:
            java.lang.String r0 = r4.getString(r2, r1)
            goto L_0x0066
        L_0x0097:
            java.lang.Object r0 = r11.A00
            X.11H r0 = (X.AnonymousClass11H) r0
            X.4UC r0 = r0.A13
            goto L_0x0011
        L_0x009f:
            java.lang.Object r5 = r11.A00
            X.4VQ r5 = (X.AnonymousClass4VQ) r5
            X.4uZ r12 = (X.C95814uZ) r12
            X.4uZ r0 = r5.A0x
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r12 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0014
            X.2uj r4 = X.C58112uj.A01
            r3 = 0
            X.C162457s7.A0J(r12, r3)
            java.util.Set r2 = X.C58112uj.A03
            boolean r0 = r2.contains(r12)
            if (r0 != 0) goto L_0x0014
            X.2rR r0 = r5.A0v
            X.1nq r1 = r0.A04(r12)
            if (r1 == 0) goto L_0x0014
            X.4UC r0 = r5.A1C
            X.AnonymousClass0x7.A18(r0)
            X.3Lv r0 = r5.A0m
            r0.A0V(r1)
            r2.add(r12)
            java.util.Set r0 = X.C58112uj.A04
            r0.remove(r12)
            X.4GQ r1 = r5.A1L
            X.C162457s7.A0J(r1, r3)
            monitor-enter(r4)
            java.util.List r0 = X.C58112uj.A02     // Catch:{ all -> 0x01e9 }
            r0.remove(r1)     // Catch:{ all -> 0x01e9 }
            monitor-exit(r4)
            goto L_0x0014
        L_0x00e7:
            java.lang.Object r1 = r11.A00
            com.whatsapp.group.newgroup.NewGroup r1 = (com.whatsapp.group.newgroup.NewGroup) r1
            java.util.List r0 = r1.A0e
            r0.remove(r12)
            r1.A77()
            r1.A76()
            goto L_0x0014
        L_0x00f8:
            java.lang.Object r3 = r11.A00
            X.2qk r3 = (X.C55682qk) r3
            X.2j2 r12 = (X.C50952j2) r12
            goto L_0x011c
        L_0x00ff:
            java.lang.Object r2 = r11.A00
            X.3TP r2 = (X.AnonymousClass3TP) r2
            X.2zA r12 = (X.C60792zA) r12
            boolean r0 = r12.A03
            if (r0 != 0) goto L_0x0014
            X.2ze r1 = r12.A00
            if (r1 == 0) goto L_0x0014
            X.3Lq r0 = r2.A03
            r0.A0J(r1)
            goto L_0x0014
        L_0x0114:
            java.lang.Object r0 = r11.A00
            X.3TP r0 = (X.AnonymousClass3TP) r0
            X.2j2 r12 = (X.C50952j2) r12
            X.2qk r3 = r0.A01
        L_0x011c:
            java.lang.String r2 = "participant-attribute-parser"
            java.lang.String r1 = r12.A00
            r0 = 0
            r3.A0A(r2, r0, r1)
            goto L_0x0014
        L_0x0127:
            java.lang.Object r2 = r11.A00
            X.3TV r2 = (X.AnonymousClass3TV) r2
            X.2sH r12 = (X.C56612sH) r12
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mexmigrationperftracker/requeststarted "
            r1.append(r0)
            boolean r0 = r2 instanceof X.C32161pf
            if (r0 == 0) goto L_0x0147
            r0 = 2
        L_0x013c:
            X.C18260x0.A1F(r1, r0)
            java.lang.Long r0 = X.C56612sH.A09(r12)
            r2.A00 = r0
            goto L_0x0014
        L_0x0147:
            r0 = 1
            goto L_0x013c
        L_0x0149:
            java.lang.Object r0 = r11.A00
            X.11H r0 = (X.AnonymousClass11H) r0
            X.2mC r12 = (X.C52882mC) r12
            X.2ss r1 = r0.A0a
            com.whatsapp.jid.GroupJid r0 = r12.A02
            boolean r0 = r1.A0N(r0)
            goto L_0x019e
        L_0x0158:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x015b:
            java.lang.Object r3 = r11.A00
            X.11B r3 = (X.AnonymousClass11B) r3
            X.34x r12 = (X.C624134x) r12
            r4 = 0
            if (r12 != 0) goto L_0x016b
            java.lang.String r1 = "CommunityTabViewModel/onActivityRowTapped from a null message"
        L_0x0166:
            r0 = 0
            X.C626936e.A0D(r0, r1)
            return r4
        L_0x016b:
            X.2z0 r0 = r12.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.GroupJid r2 = X.AnonymousClass32V.A00(r0)
            if (r2 != 0) goto L_0x0178
            java.lang.String r1 = "CommunityTabViewModel/null parent for activity row"
            goto L_0x0166
        L_0x0178:
            boolean r0 = X.C627636p.A0n(r12)
            if (r0 == 0) goto L_0x0188
            boolean r0 = r2 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x0188
            X.4UC r0 = r3.A0P
            r0.A0H(r2)
            return r4
        L_0x0188:
            X.2so r1 = r3.A03
            r0 = 1
            r1.A06(r0)
            X.4UC r0 = r3.A0O
            r0.A0G(r2)
            return r4
        L_0x0194:
            java.lang.Object r0 = r11.A00
            X.2sS r0 = (X.C56722sS) r0
            X.34x r12 = (X.C624134x) r12
            boolean r0 = r0.A06(r12)
        L_0x019e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x01a3:
            java.lang.Object r3 = r11.A00
            com.whatsapp.settings.Settings r3 = (com.whatsapp.settings.Settings) r3
            java.lang.String r12 = (java.lang.String) r12
            X.1Xh r1 = new X.1Xh
            r1.<init>()
            r1.A01 = r12
            X.5RU r0 = r3.A0n
            int r0 = r0.A00(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.4FV r0 = r3.A0f
            r0.BhA(r1)
            r3.A13 = r12
            java.lang.String r0 = "app_language"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01dc
            r1 = 1
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0t
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01d9
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0t
            r0.A02(r1)
        L_0x01d9:
            r3.A74()
        L_0x01dc:
            X.5RU r2 = r3.A0n
            android.view.View r1 = r3.A00
            java.lang.String r0 = ""
            r2.A02(r1, r0, r12)
            r4 = 0
            r3.A13 = r4
            return r4
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86364Jv.invoke(java.lang.Object):java.lang.Object");
    }
}
