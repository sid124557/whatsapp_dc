package X;

/* renamed from: X.4KZ  reason: invalid class name */
public class AnonymousClass4KZ implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass4KZ(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    public void BQs(String str) {
        if (this.A03 != 0) {
            AnonymousClass0IR.A00((Object) null, this.A02, ((C64163Ck) this.A00).A06);
            return;
        }
        ((AnonymousClass4EZ) this.A01).BQs(str);
    }

    public void BSN(AnonymousClass36K r2, String str) {
        if (this.A03 == 0) {
            ((AnonymousClass4EZ) this.A01).BSN(r2, str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r9, java.lang.String r10) {
        /*
            r8 = this;
            int r0 = r8.A03
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r8.A01
            X.2Ir r0 = (X.C41032Ir) r0
            X.36K r2 = X.C41032Ir.A02(r9, r0)
            r0 = 14
            X.4Jo r1 = new X.4Jo
            r1.<init>(r2, r0)
            r2 = 0
            java.lang.String[] r0 = new java.lang.String[r2]
            X.C626836d.A04(r9, r1, r0)
            r0 = 113(0x71, float:1.58E-43)
            X.4Jp r1 = X.C86304Jp.A00(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object r0 = X.C626836d.A04(r9, r1, r0)     // Catch:{ 24Y -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            X.1vs r0 = (X.C34821vs) r0
            if (r0 == 0) goto L_0x0054
            java.lang.Object r3 = r8.A00
            X.3Ck r3 = (X.C64163Ck) r3
            X.33p r1 = r3.A03
            java.lang.Object r0 = r0.A00
            byte[] r0 = (byte[]) r0
            java.lang.String r2 = X.C18320x8.A0i(r0)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "pref_client_auth_token"
            X.C18270x1.A0j(r1, r0, r2)
            X.1VX r2 = r3.A04
            r1 = 1689(0x699, float:2.367E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0054
            X.2ZJ r0 = r3.A02
            r0.A00()
        L_0x0054:
            return
        L_0x0055:
            com.whatsapp.jid.Jid r2 = X.AnonymousClass36K.A07(r9)
            X.1fJ r2 = (X.C27991fJ) r2
            java.lang.String r0 = "addressing_mode"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r9, r0)
            java.lang.String r4 = X.C381125t.A00(r0)
            java.lang.Object r1 = r8.A00
            X.3Lr r1 = (X.C66503Lr) r1
            java.lang.String r7 = r8.A02
            int r0 = r7.hashCode()
            r6 = 3
            r5 = 2
            r3 = 1
            switch(r0) {
                case -1335418988: goto L_0x0091;
                case -934610812: goto L_0x009e;
                case -309211200: goto L_0x00ac;
                case 96417: goto L_0x00ba;
                default: goto L_0x0075;
            }
        L_0x0075:
            r3 = 0
        L_0x0076:
            X.2pW r0 = r1.A05
            r3.intValue()
            r3 = 5
            boolean r0 = r0.A01(r2, r4)
            if (r0 == 0) goto L_0x0089
            X.21x r0 = X.C373521x.LID_MIGRATION
            java.lang.String r0 = r0.contextString
            r1.A0E(r2, r0, r3)
        L_0x0089:
            java.lang.Object r0 = r8.A01
            X.4EZ r0 = (X.AnonymousClass4EZ) r0
            r0.BdM(r9, r10)
            return
        L_0x0091:
            java.lang.String r0 = "demote"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0075
            java.lang.Integer r3 = X.C18290x4.A0b()
            goto L_0x0076
        L_0x009e:
            java.lang.String r0 = "remove"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0075
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto L_0x0076
        L_0x00ac:
            java.lang.String r0 = "promote"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0075
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto L_0x0076
        L_0x00ba:
            java.lang.String r0 = "add"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0075
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KZ.BdM(X.36K, java.lang.String):void");
    }
}
