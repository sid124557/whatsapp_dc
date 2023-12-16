package X;

/* renamed from: X.2nx  reason: invalid class name and case insensitive filesystem */
public class C53962nx {
    public final C56972sr A00;
    public final C56962sq A01;
    public final C54292oU A02;
    public final C49792h6 A03;
    public final C66543Lv A04;
    public final C56662sM A05;
    public final AnonymousClass311 A06;
    public final AnonymousClass31C A07;
    public final C56832sd A08;
    public final AnonymousClass4FS A09;

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:27:0x007f, B:41:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r10 = this;
            java.lang.String r0 = "changenumbermanager/sendchangenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sr r0 = r10.A00
            com.whatsapp.Me r5 = r0.A0E()
            X.C626936e.A06(r5)
            java.lang.String r4 = r5.jabber_id
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2oU r0 = r10.A02
            java.io.File r1 = X.C54292oU.A03(r0)
            java.lang.String r0 = "change_number_contacts.json"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r1.exists()
            r2 = 0
            if (r0 == 0) goto L_0x00c8
            java.io.FileInputStream r6 = X.AnonymousClass0x9.A0g(r1)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x00aa }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x009f }
            r7.<init>(r6)     // Catch:{ all -> 0x009f }
            android.util.JsonReader r8 = new android.util.JsonReader     // Catch:{ all -> 0x0092 }
            r8.<init>(r7)     // Catch:{ all -> 0x0092 }
            r8.beginObject()     // Catch:{ all -> 0x0088 }
            r9 = r2
            r1 = r2
        L_0x003b:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0071
            java.lang.String r3 = r8.nextName()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "notify_jids"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "old_jid"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r9 = r8.nextString()     // Catch:{ all -> 0x0088 }
            goto L_0x003b
        L_0x005c:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0088 }
            r8.beginArray()     // Catch:{ all -> 0x0088 }
        L_0x0063:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r8.nextString()     // Catch:{ all -> 0x0088 }
            r1.add(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x0063
        L_0x0071:
            if (r9 == 0) goto L_0x007b
            if (r1 == 0) goto L_0x007b
            X.2Lz r3 = new X.2Lz     // Catch:{ all -> 0x0088 }
            r3.<init>(r9, r1)     // Catch:{ all -> 0x0088 }
            goto L_0x007c
        L_0x007b:
            r3 = r2
        L_0x007c:
            r8.close()     // Catch:{ all -> 0x0086 }
            r7.close()     // Catch:{ all -> 0x009d }
            r6.close()     // Catch:{ FileNotFoundException -> 0x00b0, IOException -> 0x00b7 }
            goto L_0x00bd
        L_0x0086:
            r1 = move-exception
            goto L_0x0094
        L_0x0088:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x008d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0092 }
        L_0x0091:
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            r3 = r2
        L_0x0094:
            r7.close()     // Catch:{ all -> 0x0098 }
            goto L_0x009c
        L_0x0098:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x009d }
        L_0x009c:
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r1 = move-exception
            goto L_0x00a1
        L_0x009f:
            r1 = move-exception
            r3 = r2
        L_0x00a1:
            r6.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x00b0, IOException -> 0x00b7 }
        L_0x00a9:
            throw r1     // Catch:{ FileNotFoundException -> 0x00b0, IOException -> 0x00b7 }
        L_0x00aa:
            r1 = move-exception
            r3 = r2
            goto L_0x00b8
        L_0x00ad:
            r1 = move-exception
            r3 = r2
            goto L_0x00b1
        L_0x00b0:
            r1 = move-exception
        L_0x00b1:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/notFoundJson "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x00bd
        L_0x00b7:
            r1 = move-exception
        L_0x00b8:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/ioErrorJson "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00bd:
            if (r3 == 0) goto L_0x00c8
            java.lang.String r0 = r3.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00c8
            r2 = r3
        L_0x00c8:
            X.2sq r0 = r10.A01
            java.util.Set r3 = r0.A05()
            if (r2 == 0) goto L_0x00f0
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.util.ArrayList r0 = r2.A01
            java.util.List r2 = X.C627336j.A0B(r1, r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x00dc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00dc
            r1.remove()
            goto L_0x00dc
        L_0x00f0:
            r2 = 0
        L_0x00f1:
            X.31C r4 = r10.A07
            java.lang.String r0 = r5.jabber_id
            X.2LP r3 = new X.2LP
            r3.<init>(r0, r2)
            r1 = 0
            r0 = 61
            r2 = 0
            android.os.Message r1 = android.os.Message.obtain(r2, r1, r0, r1, r3)
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r4.A0A(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53962nx.A00():void");
    }

    public boolean A01() {
        return AnonymousClass000.A1W(this.A00.A0E());
    }

    public C53962nx(C56972sr r1, C56962sq r2, C54292oU r3, C49792h6 r4, C66543Lv r5, C56662sM r6, AnonymousClass311 r7, AnonymousClass31C r8, C56832sd r9, AnonymousClass4FS r10) {
        this.A02 = r3;
        this.A09 = r10;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = r9;
        this.A06 = r7;
        this.A03 = r4;
    }
}
