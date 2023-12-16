package X;

/* renamed from: X.3Qi  reason: invalid class name and case insensitive filesystem */
public class C67703Qi implements AnonymousClass4DA {
    public final C65203Gp A00;
    public final C72303dV A01;
    public final C56652sL A02;
    public final C66493Lq A03;
    public final AnonymousClass33S A04;
    public final C56842se A05;
    public final C45382Zv A06;
    public final C50532iK A07;
    public final AnonymousClass4FS A08;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        r2.BkM(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ea, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        X.C18260x0.A0t("OnDirtyMessageHandler/onDirty received unknown dirty bit category: ", r2, X.AnonymousClass001.A0o());
        r6.A04.A03(r2, (java.lang.Long) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BFA(android.os.Message r7, int r8) {
        /*
            r6 = this;
            r0 = 8
            if (r0 == r8) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r1 = r7.obj
            X.2Or r1 = (X.C42572Or) r1
            java.lang.String r2 = r1.A01
            int r0 = r2.hashCode()
            r5 = 0
            r3 = 1
            switch(r0) {
                case -1237460524: goto L_0x0026;
                case -961419275: goto L_0x004f;
                case -741451427: goto L_0x0067;
                case 1091411309: goto L_0x0081;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "OnDirtyMessageHandler/onDirty received unknown dirty bit category: "
            X.C18260x0.A0t(r0, r2, r1)
            X.33S r1 = r6.A04
            r0 = 0
            r1.A03(r2, r0)
        L_0x0024:
            r0 = 1
            return r0
        L_0x0026:
            java.lang.String r0 = "groups"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.3dV r0 = r6.A01
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "DirtyBitHandler/onGroupsDirty call refetchGroups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Lq r2 = r6.A03
            X.2OF r1 = r2.A0l
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            r0.set(r3)
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0024
            r0 = 3
            r2.A0C(r0, r3)
            goto L_0x0024
        L_0x004b:
            java.lang.String r0 = "DirtyBitHandler/onGroupsDirty/no-db-access/skip"
            goto L_0x00ea
        L_0x004f:
            java.lang.String r0 = "newsletter_metadata"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "OnDirtyMessageHandler/onNewsletterMetadataDirty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r2 = r6.A08
            r0 = 17
            X.3bq r1 = new X.3bq
            r1.<init>((java.lang.Object) r6, (int) r0)
            goto L_0x007d
        L_0x0067:
            java.lang.String r0 = "syncd_app_state"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "OnDirtyMessageHandler/onSyncDDirty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r2 = r6.A08
            r0 = 18
            X.3a0 r1 = X.C70133a0.A00(r6, r1, r0)
        L_0x007d:
            r2.BkM(r1)
            goto L_0x0024
        L_0x0081:
            java.lang.String r0 = "account_sync"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.3dV r0 = r6.A01
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x00e8
            X.2iK r4 = r6.A07
            java.util.Set r2 = r1.A02
            X.2TQ r1 = new X.2TQ
            r1.<init>()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00b5
            r0 = 1
            r1.A06 = r3
            r1.A04 = r3
            r1.A05 = r3
            r1.A02 = r3
            r1.A01 = r3
        L_0x00a9:
            r1.A03 = r0
            X.2TR r0 = new X.2TR
            r0.<init>(r1)
            r4.A00(r0, r3, r5, r3)
            goto L_0x0024
        L_0x00b5:
            java.lang.String r0 = "device"
            boolean r0 = r2.contains(r0)
            r1.A02 = r0
            java.lang.String r0 = "status"
            boolean r0 = r2.contains(r0)
            r1.A06 = r0
            java.lang.String r0 = "picture"
            boolean r0 = r2.contains(r0)
            r1.A04 = r0
            java.lang.String r0 = "privacy"
            boolean r0 = r2.contains(r0)
            r1.A05 = r0
            java.lang.String r0 = "blocklist"
            boolean r0 = r2.contains(r0)
            r1.A01 = r0
            java.lang.String r0 = "notice"
            boolean r0 = r2.contains(r0)
            goto L_0x00a9
        L_0x00e8:
            java.lang.String r0 = "DirtyBitHandler/onAccountDirty/no-db-access/skip"
        L_0x00ea:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67703Qi.BFA(android.os.Message, int):boolean");
    }

    public C67703Qi(C65203Gp r1, C72303dV r2, C56652sL r3, C66493Lq r4, AnonymousClass33S r5, C56842se r6, C45382Zv r7, C50532iK r8, AnonymousClass4FS r9) {
        this.A08 = r9;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A01 = r2;
        this.A06 = r7;
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 8;
        return A0E;
    }
}
