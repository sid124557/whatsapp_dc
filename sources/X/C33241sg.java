package X;

import java.util.Map;

/* renamed from: X.1sg  reason: invalid class name and case insensitive filesystem */
public class C33241sg extends AnonymousClass3ZZ {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33241sg(C65203Gp r2, Map map) {
        super("SyncManager/prepareAndSendRequest");
        this.A02 = 3;
        this.A00 = r2;
        this.A01 = map;
    }

    /* JADX WARNING: type inference failed for: r0v88, types: [java.util.AbstractCollection] */
    /* JADX WARNING: type inference failed for: r0v117, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0860, code lost:
        r6 = r7.A0F;
        r5 = X.C58422vE.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x08d4, code lost:
        if ((r3 instanceof X.AnonymousClass1fS) != false) goto L_0x08d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x08fa, code lost:
        if (r33 > 0) goto L_0x086c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x090e, code lost:
        if (r2.size() >= r1) goto L_0x0912;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x09bd, code lost:
        if (r10 == -2) goto L_0x09bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x09f3, code lost:
        if (r27 < r32) goto L_0x09f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0a24, code lost:
        if (r25 == false) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0a6b, code lost:
        if (X.C627336j.A0K(r13) != false) goto L_0x0a6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0b55, code lost:
        if (r12 == false) goto L_0x0b57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0b59, code lost:
        if (r3 != null) goto L_0x0b5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0b5d, code lost:
        if ((r3 instanceof X.AnonymousClass4DU) == false) goto L_0x0b6a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0b61, code lost:
        if ((r3 instanceof X.C30471mV) == false) goto L_0x0b6a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0b63, code lost:
        ((X.C30471mV) r3).A07 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0b70, code lost:
        if (r7.A02(r38) == false) goto L_0x0ba9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0b74, code lost:
        if (r3.A05 > 0) goto L_0x0b7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b7c, code lost:
        if (X.C627636p.A0J(r3.A1I) == false) goto L_0x0ba9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0bab, code lost:
        if ((r3 instanceof X.C30401mO) != false) goto L_0x0b7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0bad, code lost:
        r9.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0dce, code lost:
        if (r0 == false) goto L_0x0d7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0de6, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0dea, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:452:0x0d30, B:474:0x0dd2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r41 = this;
            r4 = r41
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0d37;
                case 1: goto L_0x078b;
                case 2: goto L_0x077b;
                case 3: goto L_0x0077;
                case 4: goto L_0x0013;
                case 5: goto L_0x0048;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r4.A00
            X.3dI r1 = (X.C72173dI) r1
            java.lang.Object r0 = r4.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.execute(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r4.A00
            X.3FH r0 = (X.AnonymousClass3FH) r0
            X.3Gp r2 = r0.A01
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r4.A01
            X.1Og r1 = (X.C22491Og) r1
            X.2sr r0 = r1.A00
            X.C56972sr.A07(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r6 = r0.toLanguageTag()
            X.2sH r0 = r1.A01
            long r7 = r0.A0H()
            r4 = 0
            X.1SE r3 = new X.1SE
            r5 = r4
            r3.<init>(r4, r5, r6, r7)
            java.util.Set r0 = java.util.Collections.singleton(r3)
            r2.A0K(r0)
            r2.A0F()
            return
        L_0x0048:
            java.lang.Object r2 = r4.A00     // Catch:{ all -> 0x006a }
            X.3dI r2 = (X.C72173dI) r2     // Catch:{ all -> 0x006a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006a }
            long r0 = r0.getId()     // Catch:{ all -> 0x006a }
            r2.A05 = r0     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r2.A02     // Catch:{ all -> 0x006a }
            monitor-enter(r1)     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r4.A01     // Catch:{ all -> 0x0067 }
            X.AnonymousClass0x9.A1K(r0)     // Catch:{ all -> 0x0067 }
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            r0 = -1
            r2.A05 = r0
            r2.A03()
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r3 = move-exception
            java.lang.Object r2 = r4.A00
            X.3dI r2 = (X.C72173dI) r2
            r0 = -1
            r2.A05 = r0
            r2.A03()
            throw r3
        L_0x0077:
            java.lang.Object r8 = r4.A00
            X.3Gp r8 = (X.C65203Gp) r8
            monitor-enter(r8)
            X.3TQ r0 = r8.A00     // Catch:{ all -> 0x0778 }
            r16 = r0
            if (r0 != 0) goto L_0x00ab
            X.2sr r7 = r8.A06     // Catch:{ all -> 0x0778 }
            X.4FS r6 = r8.A0h     // Catch:{ all -> 0x0778 }
            X.31C r5 = r8.A0d     // Catch:{ all -> 0x0778 }
            X.3Ek r3 = r8.A0H     // Catch:{ all -> 0x0778 }
            X.3El r2 = r8.A0I     // Catch:{ all -> 0x0778 }
            X.2ri r1 = r8.A0Y     // Catch:{ all -> 0x0778 }
            X.2Pl r0 = r8.A0G     // Catch:{ all -> 0x0778 }
            X.30i r18 = r8.A03()     // Catch:{ all -> 0x0778 }
            X.3TQ r16 = new X.3TQ     // Catch:{ all -> 0x0778 }
            r17 = r7
            r19 = r0
            r20 = r3
            r21 = r2
            r22 = r1
            r23 = r5
            r24 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0778 }
            r0 = r16
            r8.A00 = r0     // Catch:{ all -> 0x0778 }
        L_0x00ab:
            monitor-exit(r8)
            java.lang.Object r2 = r4.A01
            java.util.Map r2 = (java.util.Map) r2
            boolean r0 = r2.isEmpty()
            r1 = r0 ^ 1
            java.lang.String r0 = "sync-request-handler/sendRequest: mutation map is empty"
            X.C626936e.A0E(r1, r0)
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()
            java.util.Iterator r17 = X.AnonymousClass000.A0q(r2)
        L_0x00c4:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x075e
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r17)
            r0 = r16
            X.2Pl r0 = r0.A03
            r37 = r0
            java.lang.String r4 = X.C18310x6.A0q(r1)
            java.lang.Object r5 = r1.getValue()
            java.util.List r5 = (java.util.List) r5
            X.3XA r19 = new X.3XA
            r19.<init>()
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0104
            java.util.List r2 = java.util.Collections.emptyList()
            r1 = 0
            X.2dR r0 = new X.2dR
            r0.<init>(r4, r2, r1)
            X.2Pm r1 = r0.A00()
            r0 = r19
            r0.A05(r1)
        L_0x00fc:
            r1 = r18
            r0 = r19
            r1.add(r0)
            goto L_0x00c4
        L_0x0104:
            r0 = r37
            X.339 r3 = r0.A02     // Catch:{ 24V -> 0x0756 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations for collectionName: "
            r1.append(r0)     // Catch:{ 24V -> 0x0756 }
            r1.append(r4)     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "; size="
            X.C18260x0.A1C(r0, r1, r5)     // Catch:{ 24V -> 0x0756 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ 24V -> 0x0756 }
            X.2sZ r0 = r3.A06     // Catch:{ 24V -> 0x0756 }
            r26 = r0
            X.2yj r2 = r26.A01()     // Catch:{ 24V -> 0x0756 }
            if (r2 != 0) goto L_0x012b
            X.2yj r2 = r26.A00()     // Catch:{ 24V -> 0x0756 }
        L_0x012b:
            r6 = 0
            if (r2 == 0) goto L_0x0749
            java.util.HashSet r7 = X.AnonymousClass002.A0K()     // Catch:{ 24V -> 0x0756 }
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ 24V -> 0x0756 }
            X.33J r1 = r2.A01     // Catch:{ 24V -> 0x0756 }
            r7.add(r1)     // Catch:{ 24V -> 0x0756 }
            java.util.Iterator r13 = r5.iterator()     // Catch:{ 24V -> 0x0756 }
        L_0x013f:
            boolean r0 = r13.hasNext()     // Catch:{ 24V -> 0x0756 }
            if (r0 == 0) goto L_0x01cd
            X.33W r12 = X.C18320x8.A0K(r13)     // Catch:{ 24V -> 0x0756 }
            X.33J r10 = r12.A00     // Catch:{ 24V -> 0x0756 }
            if (r10 != 0) goto L_0x01c3
            r12.A00 = r1     // Catch:{ 24V -> 0x0756 }
        L_0x014f:
            X.34v r5 = r3.A0A     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = r12.A08()     // Catch:{ 24V -> 0x0756 }
            X.33W r0 = r5.A07(r0)     // Catch:{ 24V -> 0x0756 }
            if (r0 == 0) goto L_0x01a9
            X.33J r10 = r0.A00     // Catch:{ 24V -> 0x0756 }
            X.C626936e.A06(r10)     // Catch:{ 24V -> 0x0756 }
            X.33J r5 = r12.A00     // Catch:{ 24V -> 0x0756 }
            boolean r5 = r10.equals(r5)     // Catch:{ 24V -> 0x0756 }
            if (r5 != 0) goto L_0x01a9
            X.2yt r10 = r12.A05     // Catch:{ 24V -> 0x0756 }
            X.2yt r5 = X.C60642yt.A03     // Catch:{ 24V -> 0x0756 }
            if (r10 != r5) goto L_0x01b7
            java.lang.String[] r24 = r0.A0C()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r22 = r0.A08()     // Catch:{ 24V -> 0x0756 }
            int r11 = r0.A03     // Catch:{ 24V -> 0x0756 }
            X.33J r10 = r0.A00     // Catch:{ 24V -> 0x0756 }
            java.lang.String r5 = r0.A06     // Catch:{ 24V -> 0x0756 }
            X.1SL r0 = new X.1SL     // Catch:{ 24V -> 0x0756 }
            r20 = r0
            r21 = r10
            r23 = r5
            r25 = r11
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ 24V -> 0x0756 }
            java.lang.String r5 = r0.A00     // Catch:{ 24V -> 0x0756 }
            r9.add(r5)     // Catch:{ 24V -> 0x0756 }
            X.35M r5 = new X.35M     // Catch:{ 24V -> 0x0756 }
            r5.<init>(r0)     // Catch:{ 24V -> 0x0756 }
            X.AnonymousClass0x2.A1G(r0, r5, r8)     // Catch:{ 24V -> 0x0756 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r5 = "SyncEncryptionHelper/encryptMutations removeMutationWithExpiredKey="
            r10.append(r5)     // Catch:{ 24V -> 0x0756 }
            X.33J r5 = r0.A00     // Catch:{ 24V -> 0x0756 }
            X.C18260x0.A0m(r5, r10)     // Catch:{ 24V -> 0x0756 }
            X.33J r0 = r0.A00     // Catch:{ 24V -> 0x0756 }
            r7.add(r0)     // Catch:{ 24V -> 0x0756 }
        L_0x01a9:
            X.35M r0 = new X.35M     // Catch:{ 24V -> 0x0756 }
            r0.<init>(r12)     // Catch:{ 24V -> 0x0756 }
            X.AnonymousClass0x2.A1G(r12, r0, r8)     // Catch:{ 24V -> 0x0756 }
            X.33J r0 = r0.A02     // Catch:{ 24V -> 0x0756 }
            r7.add(r0)     // Catch:{ 24V -> 0x0756 }
            goto L_0x013f
        L_0x01b7:
            java.lang.String r5 = r12.A08()     // Catch:{ 24V -> 0x0756 }
            r9.add(r5)     // Catch:{ 24V -> 0x0756 }
            X.33J r0 = r0.A00     // Catch:{ 24V -> 0x0756 }
            r12.A00 = r0     // Catch:{ 24V -> 0x0756 }
            goto L_0x01a9
        L_0x01c3:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations use existing key="
            X.C18260x0.A1P(r5, r0, r10)     // Catch:{ 24V -> 0x0756 }
            goto L_0x014f
        L_0x01cd:
            X.1VX r0 = r3.A0B     // Catch:{ 24V -> 0x0756 }
            r31 = r0
            r10 = 2777(0xad9, float:3.891E-42)
            X.2vE r29 = X.C58422vE.A02     // Catch:{ 24V -> 0x0756 }
            r5 = r0
            r0 = r29
            int r12 = r5.A0O(r0, r10)     // Catch:{ 24V -> 0x0756 }
            java.util.ArrayList r21 = X.AnonymousClass001.A0s()     // Catch:{ 24V -> 0x0756 }
            r11 = 0
        L_0x01e1:
            int r0 = r21.size()     // Catch:{ 24V -> 0x0756 }
            if (r0 >= r12) goto L_0x026e
            X.34v r13 = r3.A0A     // Catch:{ 24V -> 0x0756 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ 24V -> 0x0756 }
            java.util.ArrayList r5 = X.C18300x5.A0s(r4)     // Catch:{ 24V -> 0x0756 }
            X.AnonymousClass0x7.A1I(r5, r11)     // Catch:{ 24V -> 0x0756 }
            X.AnonymousClass0x7.A1I(r5, r12)     // Catch:{ 24V -> 0x0756 }
            X.4GK r20 = X.C18630y0.A01(r13)     // Catch:{ 24V -> 0x0756 }
            r0 = r20
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0265 }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x0265 }
            java.lang.String r14 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE collection_name = ?  ORDER BY epoch ASC, device_id DESC  LIMIT ?, ? "
            java.lang.String[] r0 = X.C58152un.A0N     // Catch:{ all -> 0x0265 }
            java.lang.Object[] r5 = r5.toArray(r0)     // Catch:{ all -> 0x0265 }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x0265 }
            java.lang.String r0 = "SyncdMutationsStore.SELECT_MUTATIONS_WITH_OLDEST_KEY"
            android.database.Cursor r5 = r15.A0E(r14, r0, r5)     // Catch:{ all -> 0x0265 }
            int r0 = r5.getCount()     // Catch:{ all -> 0x0259 }
            if (r0 != 0) goto L_0x0218
            goto L_0x0255
        L_0x0218:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x0228
            X.33W r0 = r13.A04(r5)     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x0218
            r10.add(r0)     // Catch:{ all -> 0x0259 }
            goto L_0x0218
        L_0x0228:
            r5.close()     // Catch:{ all -> 0x0265 }
            r20.close()     // Catch:{ 24V -> 0x0756 }
            int r11 = r11 + r12
            java.util.Iterator r10 = r10.iterator()     // Catch:{ 24V -> 0x0756 }
        L_0x0233:
            boolean r0 = r10.hasNext()     // Catch:{ 24V -> 0x0756 }
            if (r0 == 0) goto L_0x01e1
            X.33W r5 = X.C18320x8.A0K(r10)     // Catch:{ 24V -> 0x0756 }
            X.33J r0 = r5.A00     // Catch:{ 24V -> 0x0756 }
            boolean r0 = r1.equals(r0)     // Catch:{ 24V -> 0x0756 }
            if (r0 != 0) goto L_0x026e
            java.lang.String r0 = r5.A08()     // Catch:{ 24V -> 0x0756 }
            boolean r0 = r9.contains(r0)     // Catch:{ 24V -> 0x0756 }
            if (r0 != 0) goto L_0x0233
            r0 = r21
            r0.add(r5)     // Catch:{ 24V -> 0x0756 }
            goto L_0x0233
        L_0x0255:
            r5.close()     // Catch:{ all -> 0x0265 }
            goto L_0x026b
        L_0x0259:
            r1 = move-exception
            if (r5 == 0) goto L_0x0264
            r5.close()     // Catch:{ all -> 0x0260 }
            goto L_0x0264
        L_0x0260:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0265 }
        L_0x0264:
            throw r1     // Catch:{ all -> 0x0265 }
        L_0x0265:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0751 }
            goto L_0x0755
        L_0x026b:
            r20.close()     // Catch:{ 24V -> 0x0756 }
        L_0x026e:
            java.util.Iterator r12 = r21.iterator()     // Catch:{ 24V -> 0x0756 }
        L_0x0272:
            boolean r0 = r12.hasNext()     // Catch:{ 24V -> 0x0756 }
            if (r0 == 0) goto L_0x02bb
            X.33W r11 = X.C18320x8.A0K(r12)     // Catch:{ 24V -> 0x0756 }
            java.lang.String[] r24 = r11.A0C()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r22 = r11.A08()     // Catch:{ 24V -> 0x0756 }
            int r10 = r11.A03     // Catch:{ 24V -> 0x0756 }
            X.33J r9 = r11.A00     // Catch:{ 24V -> 0x0756 }
            java.lang.String r5 = r11.A06     // Catch:{ 24V -> 0x0756 }
            X.1SL r0 = new X.1SL     // Catch:{ 24V -> 0x0756 }
            r20 = r0
            r21 = r9
            r23 = r5
            r25 = r10
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ 24V -> 0x0756 }
            X.35M r9 = new X.35M     // Catch:{ 24V -> 0x0756 }
            r9.<init>(r0)     // Catch:{ 24V -> 0x0756 }
            X.AnonymousClass0x2.A1G(r0, r9, r8)     // Catch:{ 24V -> 0x0756 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations removeKeyCatchUpKey="
            r5.append(r0)     // Catch:{ 24V -> 0x0756 }
            X.33J r0 = r9.A02     // Catch:{ 24V -> 0x0756 }
            X.C18260x0.A0m(r0, r5)     // Catch:{ 24V -> 0x0756 }
            r7.add(r0)     // Catch:{ 24V -> 0x0756 }
            r11.A00 = r1     // Catch:{ 24V -> 0x0756 }
            X.35M r0 = new X.35M     // Catch:{ 24V -> 0x0756 }
            r0.<init>(r11)     // Catch:{ 24V -> 0x0756 }
            X.AnonymousClass0x2.A1G(r11, r0, r8)     // Catch:{ 24V -> 0x0756 }
            goto L_0x0272
        L_0x02bb:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations keyIds size="
            X.C18260x0.A19(r0, r5, r7)     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "; activeKeyId="
            X.C18260x0.A1P(r5, r0, r1)     // Catch:{ 24V -> 0x0756 }
            r0 = r26
            java.util.HashMap r28 = r0.A02(r4, r7)     // Catch:{ 24V -> 0x0756 }
            r0 = r28
            boolean r0 = r0.containsValue(r6)     // Catch:{ 24V -> 0x0756 }
            if (r0 != 0) goto L_0x0741
            java.util.ArrayList r27 = X.AnonymousClass001.A0s()     // Catch:{ 24V -> 0x0756 }
            java.util.ArrayList r26 = X.AnonymousClass001.A0s()     // Catch:{ 24V -> 0x0756 }
            java.util.ArrayList r25 = X.AnonymousClass001.A0s()     // Catch:{ 24V -> 0x0756 }
            java.util.ArrayList r24 = X.AnonymousClass001.A0s()     // Catch:{ 24V -> 0x0756 }
            java.util.HashMap r23 = X.AnonymousClass001.A0t()     // Catch:{ 24V -> 0x0756 }
            r12 = 0
        L_0x02ec:
            int r0 = r8.size()     // Catch:{ 24V -> 0x0756 }
            if (r12 >= r0) goto L_0x04d8
            java.lang.Object r0 = r8.get(r12)     // Catch:{ 24V -> 0x0756 }
            X.0PJ r0 = (X.AnonymousClass0PJ) r0     // Catch:{ 24V -> 0x0756 }
            java.lang.Object r11 = r0.A00     // Catch:{ 24V -> 0x0756 }
            X.C626936e.A06(r11)     // Catch:{ 24V -> 0x0756 }
            X.33W r11 = (X.AnonymousClass33W) r11     // Catch:{ 24V -> 0x0756 }
            r0 = r26
            r0.add(r11)     // Catch:{ 24V -> 0x0756 }
            java.lang.Object r0 = r8.get(r12)     // Catch:{ 24V -> 0x0756 }
            X.0PJ r0 = (X.AnonymousClass0PJ) r0     // Catch:{ 24V -> 0x0756 }
            java.lang.Object r10 = r0.A01     // Catch:{ 24V -> 0x0756 }
            X.C626936e.A06(r10)     // Catch:{ 24V -> 0x0756 }
            X.35M r10 = (X.AnonymousClass35M) r10     // Catch:{ 24V -> 0x0756 }
            X.33J r5 = r10.A02     // Catch:{ 24V -> 0x0756 }
            r0 = r28
            java.lang.Object r6 = X.C18290x4.A0i(r5, r0)     // Catch:{ 24V -> 0x0756 }
            X.2yj r6 = (X.C60542yj) r6     // Catch:{ 24V -> 0x0756 }
            X.34c r0 = r3.A08     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r30 = r0
            X.2Vw r5 = r0.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.2lQ r0 = r6.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.2vs r9 = r5.A00(r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            java.lang.String r5 = r10.A04     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            java.nio.charset.Charset r0 = X.C58152un.A0D     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r22 = r5.getBytes(r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1EO r13 = r10.A03     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            if (r13 == 0) goto L_0x038f
            byte[] r7 = r13.A0F()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
        L_0x0337:
            r0 = 16
            byte[] r21 = X.AnonymousClass29O.A01(r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r22
            int r0 = r0.length     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r14 = r7.length     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r7 = 0
            int r0 = -r0
            int r0 = r0 - r14
            int r0 = java.lang.Math.max(r7, r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r7 = X.AnonymousClass29O.A01(r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Cs r0 = X.C21671Cs.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6c9 r14 = r0.A0G()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            java.nio.charset.Charset r0 = X.C155647fF.A04     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r0 = r5.getBytes(r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6bf r15 = new X.6bf     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r15.<init>(r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r5 = X.C18320x8.A0C(r14)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Cs r5 = (X.C21671Cs) r5     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r5.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 1
            r5.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r5.index_ = r15     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r7.length     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r20 = 0
            X.8Lq r7 = X.C18300x5.A0J(r14, r7, r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r5 = r14.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Cs r5 = (X.C21671Cs) r5     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r5.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 4
            r5.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r5.padding_ = r7     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r7 = r10.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r5 = X.C18320x8.A0C(r14)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Cs r5 = (X.C21671Cs) r5     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r5.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 8
            r5.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r5.version_ = r7     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            goto L_0x0392
        L_0x038f:
            byte[] r7 = X.AnonymousClass34c.A01     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            goto L_0x0337
        L_0x0392:
            if (r13 == 0) goto L_0x03a2
            X.6cX r0 = X.C18320x8.A0C(r14)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Cs r0 = (X.C21671Cs) r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0.value_ = r13     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r5 = r0.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r5 = r5 | 2
            r0.bitField0_ = r5     // Catch:{ 1Sb | 1Sh -> 0x04cb }
        L_0x03a2:
            byte[] r13 = X.C18290x4.A1Z(r14)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r5 = r9.A03     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r7 = 1
            r0 = r21
            byte[] r14 = X.AnonymousClass34c.A01(r0, r13, r5, r7)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = 2
            byte[][] r13 = new byte[r0][]     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r5 = r21
            r0 = r20
            byte[] r13 = X.AnonymousClass36A.A03(r5, r14, r13, r0, r7)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.33J r6 = r6.A01     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.2yt r5 = r10.A01     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r0 = r5.A01     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r14 = r0
            byte[] r0 = r9.A04     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r15 = r30
            byte[] r15 = r15.A03(r6, r14, r0, r13)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = 2
            byte[][] r14 = new byte[r0][]     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r20
            byte[] r14 = X.AnonymousClass36A.A03(r13, r15, r14, r0, r7)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            java.lang.String r13 = "HmacSHA256"
            byte[] r7 = r9.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r22
            byte[] r0 = X.AnonymousClass34c.A00(r13, r0, r7)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.2RA r7 = new X.2RA     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r7.<init>(r5, r6, r0, r14)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1AZ r0 = X.AnonymousClass1AZ.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6c9 r15 = r0.A0G()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r5 = r7.A03     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.8Lq r9 = X.C18280x3.A0H(r15, r5)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r6 = r15.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1AZ r6 = (X.AnonymousClass1AZ) r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r6.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 1
            r6.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r6.blob_ = r9     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Aa r0 = X.C20971Aa.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6c9 r14 = r0.A0G()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r0 = r7.A02     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.8Lq r9 = X.C18280x3.A0H(r14, r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r6 = r14.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Aa r6 = (X.C20971Aa) r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r6.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 1
            r6.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r6.blob_ = r9     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1AY r0 = X.AnonymousClass1AY.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6c9 r9 = r0.A0G()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.33J r0 = r7.A01     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r0 = r0.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.8Lq r13 = X.C18280x3.A0H(r9, r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r6 = r9.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1AY r6 = (X.AnonymousClass1AY) r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r6.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 1
            r6.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r6.id_ = r13     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1CK r0 = X.AnonymousClass1CK.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6c9 r13 = X.C18300x5.A0K(r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r6 = r13.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1CK r6 = (X.AnonymousClass1CK) r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r0 = r15.A06()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1AZ r0 = (X.AnonymousClass1AZ) r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0.getClass()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r6.index_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r6.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 1
            r6.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r6 = X.C18320x8.A0C(r13)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1CK r6 = (X.AnonymousClass1CK) r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r0 = r14.A06()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Aa r0 = (X.C20971Aa) r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0.getClass()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r6.value_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r6.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 2
            r6.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r6 = X.C18320x8.A0C(r13)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1CK r6 = (X.AnonymousClass1CK) r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r0 = r9.A06()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1AY r0 = (X.AnonymousClass1AY) r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0.getClass()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r6.keyId_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r6.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 4
            r6.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Bb r0 = X.C21241Bb.DEFAULT_INSTANCE     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6c9 r9 = r0.A0G()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.2yt r0 = r7.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.22c r0 = r0.A00     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r6 = X.C18320x8.A0C(r9)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Bb r6 = (X.C21241Bb) r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r0.value     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r6.operation_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r6.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 1
            r6.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r6 = X.C18320x8.A0C(r9)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1Bb r6 = (X.C21241Bb) r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.6cX r0 = r13.A06()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.1CK r0 = (X.AnonymousClass1CK) r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0.getClass()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r6.record_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r0 = r6.bitField0_     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r0 | 2
            r6.bitField0_ = r0     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r27
            X.C18320x8.A1B(r9, r0)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            byte[] r6 = r7.A04     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r11.A02 = r6     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.2yt r7 = r10.A01     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            X.2yt r0 = X.C60642yt.A03     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            if (r7 != r0) goto L_0x04be
            r0 = r25
            r0.add(r6)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r24
            r0.add(r5)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
        L_0x04be:
            java.lang.String r6 = r11.A08()     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            r0 = r23
            r0.put(r6, r5)     // Catch:{ 1Sb | 1Sh -> 0x04cb }
            int r12 = r12 + 1
            goto L_0x02ec
        L_0x04cb:
            r1 = move-exception
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 24V -> 0x0756 }
            r0 = 10
            X.1Sf r0 = X.C23341Sf.A00(r4, r0)     // Catch:{ 24V -> 0x0756 }
            throw r0     // Catch:{ 24V -> 0x0756 }
        L_0x04d8:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ 24V -> 0x0756 }
            boolean r0 = r25.isEmpty()     // Catch:{ 24V -> 0x0756 }
            if (r0 != 0) goto L_0x0521
            java.util.HashSet r7 = X.AnonymousClass002.A0K()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations/antiTampering:\nindexMac: valueMac\nmacsToAdd:\n"
            r9.append(r0)     // Catch:{ 24V -> 0x0756 }
            r5 = 0
        L_0x04ec:
            int r0 = r25.size()     // Catch:{ 24V -> 0x0756 }
            if (r5 >= r0) goto L_0x0522
            r0 = r24
            java.lang.Object r0 = r0.get(r5)     // Catch:{ 24V -> 0x0756 }
            byte[] r0 = (byte[]) r0     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = r3.A01(r0)     // Catch:{ 24V -> 0x0756 }
            r7.add(r0)     // Catch:{ 24V -> 0x0756 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0l(r0)     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = ": "
            r6.append(r0)     // Catch:{ 24V -> 0x0756 }
            r0 = r25
            java.lang.Object r0 = r0.get(r5)     // Catch:{ 24V -> 0x0756 }
            byte[] r0 = (byte[]) r0     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = r3.A01(r0)     // Catch:{ 24V -> 0x0756 }
            r6.append(r0)     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "\n"
            X.C18270x1.A1C(r0, r6, r9)     // Catch:{ 24V -> 0x0756 }
            int r5 = r5 + 1
            goto L_0x04ec
        L_0x0521:
            r7 = 0
        L_0x0522:
            X.2ri r6 = r3.A09     // Catch:{ 24V -> 0x0756 }
            byte[] r35 = r6.A07(r4)     // Catch:{ 24V -> 0x0756 }
            r8 = 6614(0x19d6, float:9.268E-42)
            r5 = r31
            r0 = r29
            boolean r0 = r5.A0Y(r0, r8)     // Catch:{ 24V -> 0x0756 }
            if (r0 == 0) goto L_0x059d
            X.2S5 r8 = new X.2S5     // Catch:{ 24V -> 0x0756 }
            r8.<init>(r3)     // Catch:{ 24V -> 0x0756 }
        L_0x0539:
            java.lang.String[] r36 = X.AnonymousClass34E.A02(r26)     // Catch:{ 24V -> 0x0756 }
            r28 = r3
            r29 = r8
            r30 = r4
            r31 = r9
            r32 = r25
            r33 = r23
            r34 = r7
            byte[] r10 = r28.A03(r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ 24V -> 0x0756 }
            boolean r0 = r27.isEmpty()     // Catch:{ 24V -> 0x0756 }
            if (r0 == 0) goto L_0x0569
            X.2qk r9 = r3.A00     // Catch:{ 24V -> 0x0756 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "name="
            java.lang.String r7 = X.AnonymousClass000.A0V(r0, r4, r5)     // Catch:{ 24V -> 0x0756 }
            java.lang.String r5 = "syncd_empty_patch"
            r0 = 0
            r9.A0A(r5, r0, r7)     // Catch:{ 24V -> 0x0756 }
        L_0x0569:
            java.lang.Long r0 = r6.A00(r4)     // Catch:{ 24V -> 0x0756 }
            r24 = 1
            if (r0 == 0) goto L_0x0577
            long r5 = r0.longValue()     // Catch:{ 24V -> 0x0756 }
            long r24 = r24 + r5
        L_0x0577:
            X.34c r9 = r3.A08     // Catch:{ 24V -> 0x0756 }
            r20 = r9
            r21 = r2
            r22 = r4
            r23 = r10
            byte[] r7 = r20.A02(r21, r22, r23, r24)     // Catch:{ 24V -> 0x0756 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ 24V -> 0x0756 }
            java.util.Iterator r6 = r26.iterator()     // Catch:{ 24V -> 0x0756 }
        L_0x058d:
            boolean r0 = r6.hasNext()     // Catch:{ 24V -> 0x0756 }
            if (r0 == 0) goto L_0x059f
            X.33W r0 = X.C18320x8.A0K(r6)     // Catch:{ 24V -> 0x0756 }
            byte[] r0 = r0.A02     // Catch:{ 24V -> 0x0756 }
            r5.add(r0)     // Catch:{ 24V -> 0x0756 }
            goto L_0x058d
        L_0x059d:
            r8 = 0
            goto L_0x0539
        L_0x059f:
            byte[] r0 = X.AnonymousClass36A.A05(r5)     // Catch:{ 24V -> 0x0756 }
            r5 = 4
            byte[][] r6 = new byte[r5][]     // Catch:{ 24V -> 0x0756 }
            X.AnonymousClass000.A16(r7, r0, r6)     // Catch:{ 24V -> 0x0756 }
            r5 = 2
            byte[] r0 = X.C18320x8.A1X(r24)     // Catch:{ 24V -> 0x0756 }
            r6[r5] = r0     // Catch:{ 24V -> 0x0756 }
            java.nio.charset.Charset r0 = X.C58152un.A0D     // Catch:{ 24V -> 0x0756 }
            byte[] r5 = r4.getBytes(r0)     // Catch:{ 24V -> 0x0756 }
            r0 = 3
            byte[] r5 = X.AnonymousClass36A.A04(r5, r6, r0)     // Catch:{ 24V -> 0x0756 }
            X.2Vw r6 = r9.A00     // Catch:{ 24V -> 0x0756 }
            X.2lQ r0 = r2.A00     // Catch:{ 24V -> 0x0756 }
            X.2vs r0 = r6.A00(r0)     // Catch:{ 24V -> 0x0756 }
            byte[] r2 = r0.A01     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "HmacSHA256"
            byte[] r5 = X.AnonymousClass34c.A00(r0, r5, r2)     // Catch:{ 24V -> 0x0756 }
            r6 = 1
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ 24V -> 0x0756 }
            r0 = 0
            r2[r0] = r4     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = X.C627236i.A06(r10)     // Catch:{ 24V -> 0x0756 }
            r2[r6] = r0     // Catch:{ 24V -> 0x0756 }
            r6 = 2
            java.lang.String r0 = X.C627236i.A06(r7)     // Catch:{ 24V -> 0x0756 }
            r2[r6] = r0     // Catch:{ 24V -> 0x0756 }
            r6 = 3
            java.lang.String r0 = X.C627236i.A06(r5)     // Catch:{ 24V -> 0x0756 }
            r2[r6] = r0     // Catch:{ 24V -> 0x0756 }
            r0 = 4
            r2[r0] = r1     // Catch:{ 24V -> 0x0756 }
            java.lang.String r0 = "SyncEncryptionHelper/createSyncdPrepareRequestResult: collectionName = %s; newLtHash = %s; snapshotMac = %s; patchMac = %s; syncKeyId = %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ 24V -> 0x0756 }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ 24V -> 0x0756 }
            X.2dR r2 = new X.2dR     // Catch:{ 24V -> 0x0756 }
            r0 = r26
            r2.<init>(r4, r0, r10)     // Catch:{ 24V -> 0x0756 }
            r0 = r27
            r2.A07 = r0     // Catch:{ 24V -> 0x0756 }
            r0 = 0
            r2.A04 = r0     // Catch:{ 24V -> 0x0756 }
            r2.A0C = r7     // Catch:{ 24V -> 0x0756 }
            r2.A0B = r5     // Catch:{ 24V -> 0x0756 }
            r2.A03 = r1     // Catch:{ 24V -> 0x0756 }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ 24V -> 0x0756 }
            r2.A06 = r0     // Catch:{ 24V -> 0x0756 }
            X.3Mh r1 = r3.A02     // Catch:{ 24V -> 0x0756 }
            X.1Ei r0 = X.C66663Mh.A0W     // Catch:{ 24V -> 0x0756 }
            boolean r0 = r1.A08(r0)     // Catch:{ 24V -> 0x0756 }
            if (r0 == 0) goto L_0x062d
            X.2sr r0 = r3.A01     // Catch:{ 24V -> 0x0756 }
            int r0 = r0.A0D()     // Catch:{ 24V -> 0x0756 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 24V -> 0x0756 }
        L_0x0620:
            r2.A05 = r0     // Catch:{ 24V -> 0x0756 }
            X.2sr r0 = r3.A01     // Catch:{ 24V -> 0x0756 }
            boolean r0 = r0.A0Y()     // Catch:{ 24V -> 0x0756 }
            r0 = r0 ^ 1
            r2.A08 = r0     // Catch:{ 24V -> 0x0756 }
            goto L_0x062f
        L_0x062d:
            r0 = 0
            goto L_0x0620
        L_0x062f:
            if (r8 == 0) goto L_0x0645
            byte[] r0 = r8.A03     // Catch:{ 24V -> 0x0756 }
            r2.A09 = r0     // Catch:{ 24V -> 0x0756 }
            byte[] r0 = r8.A04     // Catch:{ 24V -> 0x0756 }
            r2.A0A = r0     // Catch:{ 24V -> 0x0756 }
            int r0 = r8.A00     // Catch:{ 24V -> 0x0756 }
            r2.A00 = r0     // Catch:{ 24V -> 0x0756 }
            int r0 = r8.A02     // Catch:{ 24V -> 0x0756 }
            r2.A02 = r0     // Catch:{ 24V -> 0x0756 }
            int r0 = r8.A01     // Catch:{ 24V -> 0x0756 }
            r2.A01 = r0     // Catch:{ 24V -> 0x0756 }
        L_0x0645:
            X.2Pm r8 = r2.A00()
            r0 = r37
            X.3Mh r3 = r0.A00
            X.1Ek r0 = X.C66663Mh.A1P
            int r1 = r3.A03(r0)
            X.1Ek r0 = X.C66663Mh.A1T
            int r0 = r3.A03(r0)
            long r3 = (long) r0
            r10 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r10
            X.1Do r7 = r8.A00
            X.C626936e.A06(r7)
            r0 = 0
            int r6 = r7.A0D(r0)
            java.util.List r0 = r8.A02
            int r0 = r0.size()
            r9 = 1
            if (r0 > r1) goto L_0x0687
            long r0 = (long) r6
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0687
        L_0x0675:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PrepareSyncdMutationsHelper/startPrepareJob inlinePayload="
            X.C18260x0.A1D(r0, r1, r9)
            if (r9 == 0) goto L_0x0699
            r0 = r19
            r0.A05(r8)
            goto L_0x00fc
        L_0x0687:
            long r5 = (long) r6
            r0 = r37
            X.1VX r1 = r0.A03
            r0 = 5097(0x13e9, float:7.142E-42)
            long r3 = X.C56952sp.A06(r1, r0)
            long r3 = r3 * r10
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0675
            r9 = 0
            goto L_0x0675
        L_0x0699:
            X.1AA r0 = X.AnonymousClass1AA.DEFAULT_INSTANCE
            X.6c9 r5 = r0.A0G()
            X.8ya r4 = r7.mutations_
            X.6cX r3 = X.C18320x8.A0C(r5)
            X.1AA r3 = (X.AnonymousClass1AA) r3
            X.8ya r1 = r3.mutations_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x06b6
            X.8ya r1 = X.C130786cX.A07(r1)
            r3.mutations_ = r1
        L_0x06b6:
            X.C170208Ch.A05(r4, r1)
            X.2NS r13 = new X.2NS
            r1 = r19
            r0 = r37
            r13.<init>(r1, r0, r2)
            X.2Pk r12 = r0.A01
            X.6cX r2 = r5.A06()
            X.1AA r2 = (X.AnonymousClass1AA) r2
            r3 = 0
            X.2eK r0 = r12.A02     // Catch:{ IOException -> 0x0732 }
            X.2gw r1 = r0.A00     // Catch:{ IOException -> 0x0732 }
            java.lang.String r0 = ""
            java.io.File r14 = r1.A00(r0)     // Catch:{ IOException -> 0x0732 }
            byte[] r0 = r2.A0F()     // Catch:{ IOException -> 0x0732 }
            X.C627536m.A0H(r14, r0)     // Catch:{ IOException -> 0x0732 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0732 }
            java.lang.String r0 = "external-mutations-uploader: Prepared upload data file: "
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r14, r0, r1)     // Catch:{ IOException -> 0x0732 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ IOException -> 0x0732 }
            X.8ya r0 = r2.mutations_     // Catch:{ IOException -> 0x0732 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0732 }
            r9 = 0
            if (r0 != 0) goto L_0x06ff
            java.lang.String r0 = "external-mutations-uploader: empty external patch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0732 }
            X.2qk r1 = r12.A00     // Catch:{ IOException -> 0x0732 }
            java.lang.String r0 = "syncd_empty_external_patch"
            r1.A0A(r0, r9, r3)     // Catch:{ IOException -> 0x0732 }
        L_0x06ff:
            r11 = 1
            X.7iO r4 = new X.7iO     // Catch:{ IOException -> 0x0732 }
            r4.<init>(r9, r9, r11)     // Catch:{ IOException -> 0x0732 }
            X.38t r5 = X.C633138t.A0K     // Catch:{ IOException -> 0x0732 }
            android.net.Uri r1 = android.net.Uri.fromFile(r14)     // Catch:{ IOException -> 0x0732 }
            r15 = 1
            r6 = r3
            r7 = r3
            r10 = r9
            r2 = r3
            r8 = r9
            X.32J r0 = X.AnonymousClass32J.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0732 }
            X.33c r1 = r12.A03     // Catch:{ IOException -> 0x0732 }
            X.3QO r11 = r1.A03(r0, r9)     // Catch:{ IOException -> 0x0732 }
            java.lang.String r0 = "mms"
            r11.A0W = r0     // Catch:{ IOException -> 0x0732 }
            X.4Jg r10 = new X.4Jg     // Catch:{ IOException -> 0x0732 }
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0732 }
            r11.A04(r10, r3)     // Catch:{ IOException -> 0x0732 }
            r1.A0E(r11, r3)     // Catch:{ IOException -> 0x0732 }
            java.lang.String r0 = "external-mutations-uploader start media upload"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0732 }
            goto L_0x00fc
        L_0x0732:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-uploader"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "prepare-syncd-mutations-helper/startPrepareJob/onError: IOException"
            X.1Sd r1 = new X.1Sd
            r1.<init>(r0, r3)
            goto L_0x0757
        L_0x0741:
            java.lang.String r0 = "Missing keys exception"
            X.1Sd r1 = new X.1Sd     // Catch:{ 24V -> 0x0756 }
            r1.<init>(r0, r6)     // Catch:{ 24V -> 0x0756 }
            goto L_0x0755
        L_0x0749:
            java.lang.String r0 = "Missing active key exception"
            X.1Sd r1 = new X.1Sd     // Catch:{ 24V -> 0x0756 }
            r1.<init>(r0, r6)     // Catch:{ 24V -> 0x0756 }
            goto L_0x0755
        L_0x0751:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 24V -> 0x0756 }
        L_0x0755:
            throw r1     // Catch:{ 24V -> 0x0756 }
        L_0x0756:
            r1 = move-exception
        L_0x0757:
            r0 = r19
            r0.A06(r1)
            goto L_0x00fc
        L_0x075e:
            X.1I2 r3 = new X.1I2
            r0 = r18
            r3.<init>(r0)
            r1 = 4
            r0 = r16
            X.AnonymousClass3XA.A01(r3, r0, r1)
            r1 = 5
            X.4Ji r2 = new X.4Ji
            r2.<init>(r0, r1)
            X.3XB r1 = r3.A00
            r0 = 0
            r1.A04(r2, r0)
            return
        L_0x0778:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x077b:
            java.lang.String r0 = "sync-manager/doPreCompanionLogoutTask timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r4.A01
            X.3XA r1 = (X.AnonymousClass3XA) r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A05(r0)
            return
        L_0x078b:
            java.lang.Object r0 = r4.A00
            r26 = r0
            r0 = r26
            X.3Gp r0 = (X.C65203Gp) r0
            r26 = r0
            X.3El r8 = r0.A0I
            java.lang.Object r3 = r4.A01
            X.2fi r3 = (X.C48932fi) r3
            X.3Ek r0 = r8.A04
            r40 = r0
            X.2S3 r0 = r3.A00
            java.lang.String r2 = r0.A03
            X.2e4 r1 = r3.A01
            r0 = r40
            X.2jp r29 = r0.A06(r1, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncdBootstrapManager/prepareCriticalDataUpload bootstrapId: "
            r0 = r29
            X.C18260x0.A1R(r2, r1, r0)
            X.2Sm r4 = r8.A03
            X.33G r0 = r3.A02
            r39 = r0
            com.whatsapp.jid.DeviceJid r0 = r0.A07
            r38 = r0
            X.4FS r3 = r4.A06
            r2 = 32
            X.3a6 r1 = new X.3a6
            r1.<init>(r4, r2, r0)
            r3.BkP(r1)
            X.3Et r7 = r8.A02
            java.util.LinkedHashMap r2 = X.C18320x8.A0r()
            java.util.LinkedHashMap r36 = X.C18320x8.A0r()
            X.314 r3 = r7.A06
            X.1R1 r1 = r7.A0J
            X.2ss r0 = r3.A02
            r0.A0G()
            X.3ZV r3 = r3.A01
            java.util.ArrayList r0 = r3.A01
            java.util.ArrayList r10 = X.C18290x4.A0y(r0)
            java.util.Set r5 = r1.A0R()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            monitor-enter(r3)
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0d34 }
        L_0x07f4:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0d34 }
            if (r0 == 0) goto L_0x0802
            X.4uZ r0 = X.C51482jt.A00(r1)     // Catch:{ all -> 0x0d34 }
            r4.add(r0)     // Catch:{ all -> 0x0d34 }
            goto L_0x07f4
        L_0x0802:
            monitor-exit(r3)     // Catch:{ all -> 0x0d34 }
            java.util.Iterator r3 = r4.iterator()
        L_0x0807:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x081b
            java.lang.Object r1 = r3.next()
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x0807
            r10.add(r1)
            goto L_0x0807
        L_0x081b:
            r5.retainAll(r4)
            r0 = 0
            r10.addAll(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data start: conversation list size is "
            X.C18260x0.A1B(r0, r1, r10)
            X.30l r0 = r7.A05
            android.content.SharedPreferences r1 = r0.A02()
            java.lang.String r0 = "syncd_bootstrap_fail_time"
            r3 = 0
            long r0 = r1.getLong(r0, r3)
            r35 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x085c
            X.1VX r5 = r7.A0F
            r4 = 1324(0x52c, float:1.855E-42)
            X.2vE r3 = X.C58422vE.A02
            int r4 = r5.A0O(r3, r4)
            if (r4 <= 0) goto L_0x085c
            X.2sH r3 = r7.A07
            long r5 = X.C56612sH.A03(r3, r0)
            long r3 = X.AnonymousClass0x7.A0D(r4)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x085c
            r35 = 1
        L_0x085c:
            r34 = 0
            if (r35 == 0) goto L_0x08ee
            X.1VX r6 = r7.A0F
            r0 = 1317(0x525, float:1.846E-42)
            X.2vE r5 = X.C58422vE.A02
            int r33 = r6.A0O(r5, r0)
            if (r33 <= 0) goto L_0x08ee
        L_0x086c:
            r32 = r33
        L_0x086e:
            r0 = 1420(0x58c, float:1.99E-42)
            int r9 = r6.A0O(r5, r0)
            if (r9 > 0) goto L_0x0879
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x0879:
            r0 = r38
            boolean r13 = r7.A02(r0)
            java.util.Iterator r12 = r10.iterator()
            r10 = 0
            r4 = 0
        L_0x0885:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x08fe
            X.4uZ r3 = X.C18300x5.A0P(r12)
            if (r10 >= r9) goto L_0x08fe
            boolean r0 = r3 instanceof X.C28001fK
            if (r0 != 0) goto L_0x0885
            if (r13 == 0) goto L_0x08a0
            boolean r0 = r3 instanceof X.C27991fJ
            if (r0 != 0) goto L_0x0885
            boolean r0 = r3 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x08a0
            goto L_0x0885
        L_0x08a0:
            r0 = r39
            X.2xO r0 = r0.A06
            if (r0 == 0) goto L_0x08aa
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x08c5
        L_0x08aa:
            X.5rC r1 = r7.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x08c5
            r1.A04()
            boolean r0 = X.C155477ey.A00(r3)
            if (r0 == 0) goto L_0x08c5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "history-sync-send-methods/skipChatWithBot chatJid="
            X.C18260x0.A1P(r1, r0, r3)
            goto L_0x0885
        L_0x08c5:
            X.2rV r1 = r7.A08
            r0 = r34
            X.34x r11 = r1.A02(r3, r0)
            r0 = r32
            if (r4 < r0) goto L_0x08d6
            boolean r1 = r3 instanceof X.AnonymousClass1fS
            r0 = 0
            if (r1 == 0) goto L_0x08d9
        L_0x08d6:
            int r4 = r4 + 1
            r0 = r11
        L_0x08d9:
            r2.put(r3, r0)
            if (r11 != 0) goto L_0x08e7
            r1 = 0
        L_0x08df:
            r0 = r36
            r0.put(r3, r1)
            int r10 = r10 + 1
            goto L_0x0885
        L_0x08e7:
            long r0 = r11.A0K
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x08df
        L_0x08ee:
            X.1VX r6 = r7.A0F
            r0 = 1170(0x492, float:1.64E-42)
            X.2vE r5 = X.C58422vE.A02
            int r33 = r6.A0O(r5, r0)
            r32 = 1000(0x3e8, float:1.401E-42)
            if (r33 <= 0) goto L_0x086e
            goto L_0x086c
        L_0x08fe:
            if (r35 == 0) goto L_0x0917
            r0 = 1318(0x526, float:1.847E-42)
            int r1 = r6.A0O(r5, r0)
            if (r1 <= 0) goto L_0x0917
        L_0x0908:
            int r0 = r2.size()
            r31 = 1
            if (r0 >= r1) goto L_0x0912
        L_0x0910:
            r31 = 0
        L_0x0912:
            java.util.ArrayList r30 = X.AnonymousClass001.A0s()
            goto L_0x0920
        L_0x0917:
            r0 = 1119(0x45f, float:1.568E-42)
            int r1 = r6.A0O(r5, r0)
            if (r1 <= 0) goto L_0x0910
            goto L_0x0908
        L_0x0920:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0bdd }
            java.util.Iterator r28 = X.AnonymousClass001.A0u(r2)     // Catch:{ Exception -> 0x0bdd }
            r27 = 0
        L_0x092a:
            boolean r0 = r28.hasNext()     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x0be8
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r28)     // Catch:{ Exception -> 0x0bdd }
            X.4uZ r4 = X.C18320x8.A0N(r0)     // Catch:{ Exception -> 0x0bdd }
            java.lang.Object r3 = r0.getValue()     // Catch:{ Exception -> 0x0bdd }
            X.34x r3 = (X.C624134x) r3     // Catch:{ Exception -> 0x0bdd }
            X.2TO r10 = r7.A0H     // Catch:{ Exception -> 0x0bdd }
            X.2qk r0 = r10.A00     // Catch:{ Exception -> 0x0bdd }
            X.1mq r2 = new X.1mq     // Catch:{ Exception -> 0x0bdd }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0bdd }
            X.2ss r9 = r10.A02     // Catch:{ Exception -> 0x0bdd }
            long r0 = r9.A09(r4)     // Catch:{ Exception -> 0x0bdd }
            r2.A04 = r0     // Catch:{ Exception -> 0x0bdd }
            r2.A06 = r4     // Catch:{ Exception -> 0x0bdd }
            X.1R1 r13 = r10.A06     // Catch:{ Exception -> 0x0bdd }
            X.2sa r0 = X.AnonymousClass1R1.A00(r4, r13)     // Catch:{ Exception -> 0x0bdd }
            r0.A00()     // Catch:{ Exception -> 0x0bdd }
            int r0 = r9.A03(r4)     // Catch:{ Exception -> 0x0bdd }
            r2.A00 = r0     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = r9.A0M(r4)     // Catch:{ Exception -> 0x0bdd }
            r2.A0E = r0     // Catch:{ Exception -> 0x0bdd }
            X.3Lo r0 = r10.A03     // Catch:{ Exception -> 0x0bdd }
            X.3ZH r12 = r0.A01(r4)     // Catch:{ Exception -> 0x0bdd }
            boolean r1 = X.AnonymousClass3ZH.A0E(r12)     // Catch:{ Exception -> 0x0bdd }
            r0 = 0
            if (r1 != 0) goto L_0x0977
            java.lang.String r0 = r12.A0J()     // Catch:{ Exception -> 0x0bdd }
        L_0x0977:
            r2.A0B = r0     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = r12.A0U()     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x098c
            X.2sj r1 = r10.A04     // Catch:{ Exception -> 0x0bdd }
            r0 = r4
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = r1.A0C(r0)     // Catch:{ Exception -> 0x0bdd }
            r0 = r0 ^ 1
            r2.A0G = r0     // Catch:{ Exception -> 0x0bdd }
        L_0x098c:
            com.whatsapp.jid.UserJid r11 = X.AnonymousClass32Y.A03(r4)     // Catch:{ Exception -> 0x0bdd }
            if (r11 == 0) goto L_0x09a6
            X.2h6 r0 = r10.A01     // Catch:{ Exception -> 0x0bdd }
            X.1o8 r1 = r0.A00(r11)     // Catch:{ Exception -> 0x0bdd }
            if (r1 == 0) goto L_0x09a6
            com.whatsapp.jid.UserJid r0 = r1.A00     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x0bb9
            com.whatsapp.jid.UserJid r0 = r1.A01     // Catch:{ Exception -> 0x0bdd }
            r2.A08 = r0     // Catch:{ Exception -> 0x0bdd }
        L_0x09a6:
            X.2sa r1 = X.AnonymousClass1R1.A00(r4, r13)     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = r1.A0H     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x0bb5
            long r0 = r1.A05     // Catch:{ Exception -> 0x0bdd }
        L_0x09b0:
            r2.A03 = r0     // Catch:{ Exception -> 0x0bdd }
            X.2sD r0 = r10.A07     // Catch:{ Exception -> 0x0bdd }
            int r10 = r0.A00(r4)     // Catch:{ Exception -> 0x0bdd }
            r0 = -1
            if (r10 == r0) goto L_0x09bf
            r1 = -2
            r0 = 0
            if (r10 != r1) goto L_0x09c0
        L_0x09bf:
            r0 = 1
        L_0x09c0:
            r0 = r0 ^ 1
            r2.A0F = r0     // Catch:{ Exception -> 0x0bdd }
            if (r11 == 0) goto L_0x09dd
            X.31A r0 = X.C56982ss.A01(r9, r11)     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x09e1
            X.3Z2 r1 = r0.A0b     // Catch:{ Exception -> 0x0bdd }
            if (r1 == 0) goto L_0x09e1
            int r0 = r1.expiration     // Catch:{ Exception -> 0x0bdd }
            r2.A01 = r0     // Catch:{ Exception -> 0x0bdd }
            long r0 = r1.ephemeralSettingTimestamp     // Catch:{ Exception -> 0x0bdd }
            long r0 = X.C18290x4.A0B(r0)     // Catch:{ Exception -> 0x0bdd }
            r2.A02 = r0     // Catch:{ Exception -> 0x0bdd }
            goto L_0x09e1
        L_0x09dd:
            int r0 = r12.A02     // Catch:{ Exception -> 0x0bdd }
            r2.A01 = r0     // Catch:{ Exception -> 0x0bdd }
        L_0x09e1:
            int r0 = r9.A02(r4)     // Catch:{ Exception -> 0x0bdd }
            r2.A00 = r0     // Catch:{ Exception -> 0x0bdd }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0bdd }
            if (r33 <= 0) goto L_0x09f5
            r25 = 1
            r1 = r27
            r0 = r32
            if (r1 >= r0) goto L_0x09f7
        L_0x09f5:
            r25 = 0
        L_0x09f7:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r16 - r0
            long r0 = r2.A04     // Catch:{ Exception -> 0x0bdd }
            r23 = 1
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0a0c
            long r0 = r2.A03     // Catch:{ Exception -> 0x0bdd }
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0b57
        L_0x0a0c:
            if (r3 == 0) goto L_0x0b57
            if (r25 != 0) goto L_0x0a23
            r0 = 1375(0x55f, float:1.927E-42)
            int r1 = r6.A0O(r5, r0)     // Catch:{ Exception -> 0x0bdd }
            r0 = r34
            if (r0 >= r1) goto L_0x0a23
            r0 = 1376(0x560, float:1.928E-42)
            int r10 = r6.A0O(r5, r0)     // Catch:{ Exception -> 0x0bdd }
            r0 = 1
            int r10 = r10 - r0
            goto L_0x0a26
        L_0x0a23:
            r10 = 0
            if (r25 != 0) goto L_0x0a36
        L_0x0a26:
            if (r31 != 0) goto L_0x0a36
            int r1 = r2.A00     // Catch:{ Exception -> 0x0bdd }
            r0 = 50
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x0bdd }
            r0 = 30
            int r10 = java.lang.Math.max(r1, r0)     // Catch:{ Exception -> 0x0bdd }
        L_0x0a36:
            X.2Nq r12 = r7.A0C     // Catch:{ Exception -> 0x0bdd }
            X.2z0 r11 = r3.A1J     // Catch:{ Exception -> 0x0bdd }
            int r22 = r10 + 1
            r0 = r38
            boolean r21 = r7.A02(r0)     // Catch:{ Exception -> 0x0bdd }
            X.2qz r0 = r12.A02     // Catch:{ Exception -> 0x0bdd }
            r37 = r0
            X.34x r13 = r0.A05(r11)     // Catch:{ Exception -> 0x0bdd }
            if (r13 == 0) goto L_0x0b4a
            long r0 = r13.A1L     // Catch:{ Exception -> 0x0bdd }
            r18 = 0
            int r14 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r14 == 0) goto L_0x0b4a
            long r0 = r13.A1L     // Catch:{ Exception -> 0x0bdd }
            r19 = r0
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x0b4a
            X.C626936e.A06(r11)     // Catch:{ Exception -> 0x0bdd }
            X.4uZ r13 = r11.A00     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = r13 instanceof X.AnonymousClass1fS     // Catch:{ Exception -> 0x0bdd }
            r11 = 0
            if (r0 != 0) goto L_0x0a6d
            boolean r0 = X.C627336j.A0K(r13)     // Catch:{ Exception -> 0x0bdd }
            r15 = 1
            if (r0 == 0) goto L_0x0a6e
        L_0x0a6d:
            r15 = 0
        L_0x0a6e:
            X.3dV r0 = r12.A01     // Catch:{ Exception -> 0x0bdd }
            X.4GK r18 = r0.get()     // Catch:{ Exception -> 0x0bdd }
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0bd3 }
            java.lang.String r0 = X.C58162uo.A0K     // Catch:{ all -> 0x0bd3 }
            r14.append(r0)     // Catch:{ all -> 0x0bd3 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0bd3 }
            if (r15 == 0) goto L_0x0a88
            r0 = 8
            X.AnonymousClass001.A1O(r1, r0)     // Catch:{ all -> 0x0bd3 }
        L_0x0a88:
            X.AnonymousClass34U.A01(r14, r1)     // Catch:{ all -> 0x0bd3 }
            if (r21 == 0) goto L_0x0ab7
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0bd3 }
            r0 = 42
            X.AnonymousClass001.A1O(r1, r0)     // Catch:{ all -> 0x0bd3 }
            r0 = 43
            X.AnonymousClass001.A1O(r1, r0)     // Catch:{ all -> 0x0bd3 }
            r0 = 78
            X.AnonymousClass001.A1O(r1, r0)     // Catch:{ all -> 0x0bd3 }
            r0 = 82
            X.AnonymousClass001.A1O(r1, r0)     // Catch:{ all -> 0x0bd3 }
            X.AnonymousClass34U.A01(r14, r1)     // Catch:{ all -> 0x0bd3 }
            java.lang.String r0 = " AND ( "
            r14.append(r0)     // Catch:{ all -> 0x0bd3 }
            java.lang.String r0 = "expire_timestamp IS NULL"
            r14.append(r0)     // Catch:{ all -> 0x0bd3 }
            java.lang.String r0 = ") "
            r14.append(r0)     // Catch:{ all -> 0x0bd3 }
        L_0x0ab7:
            java.lang.String r0 = " AND (view_mode IS NULL OR view_mode = 0) "
            X.AnonymousClass0x2.A1N(r14, r0)     // Catch:{ all -> 0x0bd3 }
            java.lang.String r0 = " AND _id < ? "
            r14.append(r0)     // Catch:{ all -> 0x0bd3 }
            java.lang.String r0 = " ORDER BY _id DESC"
            r14.append(r0)     // Catch:{ all -> 0x0bd3 }
            java.lang.String r1 = " LIMIT "
            r0 = r22
            java.lang.String r15 = X.AnonymousClass000.A0Y(r1, r14, r0)     // Catch:{ all -> 0x0bd3 }
            java.lang.String[] r14 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0bd3 }
            X.2sm r0 = r12.A00     // Catch:{ all -> 0x0bd3 }
            X.C626936e.A06(r13)     // Catch:{ all -> 0x0bd3 }
            X.C56922sm.A02(r0, r13, r14, r11)     // Catch:{ all -> 0x0bd3 }
            r12 = 1
            r0 = r19
            X.AnonymousClass0x2.A1S(r14, r12, r0)     // Catch:{ all -> 0x0bd3 }
            r0 = r18
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0bd3 }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x0bd3 }
            java.lang.String r1 = "GET_PREVIOUS_MESSAGES_AT_FOR_TYPE"
            android.database.Cursor r15 = r12.A0E(r15, r1, r14)     // Catch:{ all -> 0x0bd3 }
            java.util.LinkedList r14 = X.AnonymousClass0x9.A18()     // Catch:{ all -> 0x0bc7 }
        L_0x0af0:
            boolean r0 = r15.moveToNext()     // Catch:{ all -> 0x0bc7 }
            if (r0 == 0) goto L_0x0b12
            r0 = r37
            X.34x r12 = r0.A04(r15, r13)     // Catch:{ all -> 0x0bc7 }
            if (r12 == 0) goto L_0x0af0
            boolean r0 = r12 instanceof X.AnonymousClass4DU     // Catch:{ all -> 0x0bc7 }
            if (r0 == 0) goto L_0x0b0e
            boolean r0 = r12 instanceof X.C30471mV     // Catch:{ all -> 0x0bc7 }
            if (r0 == 0) goto L_0x0b0e
            r0 = r12
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x0bc7 }
            r1 = r0
            java.lang.String r0 = ""
            r1.A07 = r0     // Catch:{ all -> 0x0bc7 }
        L_0x0b0e:
            r14.addFirst(r12)     // Catch:{ all -> 0x0bc7 }
            goto L_0x0af0
        L_0x0b12:
            r15.close()     // Catch:{ all -> 0x0bd3 }
            r18.close()     // Catch:{ Exception -> 0x0bdd }
            int r0 = r14.size()     // Catch:{ Exception -> 0x0bdd }
            if (r0 <= r10) goto L_0x0b24
            r14.get(r11)     // Catch:{ Exception -> 0x0bdd }
            r14.remove(r11)     // Catch:{ Exception -> 0x0bdd }
        L_0x0b24:
            boolean r0 = r14.isEmpty()     // Catch:{ Exception -> 0x0bdd }
            boolean r12 = X.AnonymousClass000.A1T(r0)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0bdd }
            java.util.Iterator r10 = r14.iterator()     // Catch:{ Exception -> 0x0bdd }
        L_0x0b34:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x0b46
            java.lang.Object r1 = r10.next()     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = r1 instanceof X.C30401mO     // Catch:{ Exception -> 0x0bdd }
            if (r0 != 0) goto L_0x0b34
            r11.add(r1)     // Catch:{ Exception -> 0x0bdd }
            goto L_0x0b34
        L_0x0b46:
            r9.addAll(r11)     // Catch:{ Exception -> 0x0bdd }
            goto L_0x0b55
        L_0x0b4a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0bdd }
            java.lang.String r0 = "msgstore/get/previous no id for "
            X.C18260x0.A1R(r1, r0, r11)     // Catch:{ Exception -> 0x0bdd }
            goto L_0x0b57
        L_0x0b55:
            if (r12 != 0) goto L_0x0b5b
        L_0x0b57:
            if (r25 != 0) goto L_0x0b7e
            if (r3 == 0) goto L_0x0b7e
        L_0x0b5b:
            boolean r0 = r3 instanceof X.AnonymousClass4DU     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x0b6a
            boolean r0 = r3 instanceof X.C30471mV     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x0b6a
            r1 = r3
            X.1mV r1 = (X.C30471mV) r1     // Catch:{ Exception -> 0x0bdd }
            java.lang.String r0 = ""
            r1.A07 = r0     // Catch:{ Exception -> 0x0bdd }
        L_0x0b6a:
            r0 = r38
            boolean r0 = r7.A02(r0)     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x0ba9
            int r0 = r3.A05     // Catch:{ Exception -> 0x0bdd }
            if (r0 > 0) goto L_0x0b7e
            byte r0 = r3.A1I     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = X.C627636p.A0J(r0)     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x0ba9
        L_0x0b7e:
            int r0 = r9.size()     // Catch:{ Exception -> 0x0bdd }
            int r27 = r27 + r0
            java.util.Collections.reverse(r9)     // Catch:{ Exception -> 0x0bdd }
            r0 = 6049(0x17a1, float:8.476E-42)
            int r1 = r6.A0O(r5, r0)     // Catch:{ Exception -> 0x0bdd }
            X.2zm r0 = r7.A09     // Catch:{ Exception -> 0x0bdd }
            java.util.List r0 = r0.A01(r9, r1)     // Catch:{ Exception -> 0x0bdd }
            r9.addAll(r0)     // Catch:{ Exception -> 0x0bdd }
            r0 = r36
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0bdd }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0bdd }
            X.2NQ r1 = new X.2NQ     // Catch:{ Exception -> 0x0bdd }
            r1.<init>(r2, r0, r9)     // Catch:{ Exception -> 0x0bdd }
            r0 = r30
            r0.add(r1)     // Catch:{ Exception -> 0x0bdd }
            goto L_0x0bb1
        L_0x0ba9:
            boolean r0 = r3 instanceof X.C30401mO     // Catch:{ Exception -> 0x0bdd }
            if (r0 != 0) goto L_0x0b7e
            r9.add(r3)     // Catch:{ Exception -> 0x0bdd }
            goto L_0x0b7e
        L_0x0bb1:
            int r34 = r34 + 1
            goto L_0x092a
        L_0x0bb5:
            r0 = 0
            goto L_0x09b0
        L_0x0bb9:
            com.whatsapp.jid.UserJid r0 = r1.A01     // Catch:{ Exception -> 0x0bdd }
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x0bdd }
            if (r0 == 0) goto L_0x09a6
            com.whatsapp.jid.UserJid r0 = r1.A00     // Catch:{ Exception -> 0x0bdd }
            r2.A07 = r0     // Catch:{ Exception -> 0x0bdd }
            goto L_0x09a6
        L_0x0bc7:
            r1 = move-exception
            if (r15 == 0) goto L_0x0bd2
            r15.close()     // Catch:{ all -> 0x0bce }
            goto L_0x0bd2
        L_0x0bce:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0bd3 }
        L_0x0bd2:
            throw r1     // Catch:{ all -> 0x0bd3 }
        L_0x0bd3:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0bd8 }
            goto L_0x0bdc
        L_0x0bd8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0bdd }
        L_0x0bdc:
            throw r1     // Catch:{ Exception -> 0x0bdd }
        L_0x0bdd:
            r1 = move-exception
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data: aborting data creation"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.List r30 = java.util.Collections.emptyList()
            goto L_0x0c04
        L_0x0be8:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data end, msgCount="
            r2.append(r0)
            r0 = r27
            r2.append(r0)
            java.lang.String r1 = "; chatCount="
            r0 = r30
            X.C18260x0.A19(r1, r2, r0)
            java.lang.String r1 = "; optimizationEnabled="
            r0 = r35
            X.C18260x0.A1E(r1, r2, r0)
        L_0x0c04:
            X.4FS r1 = r7.A0K
            r14 = 29
            X.3cM r0 = new X.3cM
            r9 = r0
            r10 = r7
            r11 = r39
            r12 = r29
            r13 = r30
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (int) r14)
            r1.BkP(r0)
            X.2sZ r4 = r8.A06
            java.lang.String r0 = "SyncdKeyManager/shareAllKeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2oW r6 = r4.A09
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            X.1RE r0 = r6.A00
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0d2f }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0d2f }
            java.lang.String r1 = "SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info"
            java.lang.String r0 = "SyncdCryptoInfoTable.SELECT_KEYS"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0d2f }
        L_0x0c38:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0d23 }
            if (r0 == 0) goto L_0x0c46
            X.2yj r0 = r6.A02(r2)     // Catch:{ all -> 0x0d23 }
            r5.add(r0)     // Catch:{ all -> 0x0d23 }
            goto L_0x0c38
        L_0x0c46:
            r2.close()     // Catch:{ all -> 0x0d2f }
            r3.close()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0c87
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.util.Iterator r2 = r5.iterator()
        L_0x0c5a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c6c
            java.lang.Object r1 = r2.next()
            X.2yj r1 = (X.C60542yj) r1
            X.33J r0 = r1.A01
            r3.put(r0, r1)
            goto L_0x0c5a
        L_0x0c6c:
            r1 = 0
            r0 = r38
            r4.A08(r0, r3, r1)
            X.3Ek r4 = r4.A03
            int r0 = r3.size()
            long r2 = (long) r0
            X.1WS r1 = new X.1WS
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.C64663Ek.A05(r4, r1)
        L_0x0c87:
            X.30l r3 = r8.A05
            android.content.SharedPreferences r0 = r3.A02()
            java.lang.String r2 = "syncd_bootstrap_state"
            int r0 = X.C18280x3.A02(r0, r2)
            if (r0 != 0) goto L_0x0d19
            if (r29 == 0) goto L_0x0ca6
            X.2ZT r1 = new X.2ZT
            r1.<init>(r12)
            r8.A02(r1)
            r4 = 1
            r1 = r40
            r1.A09(r12, r4)
        L_0x0ca6:
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap triggered for release"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.2j3 r7 = r8.A0B
            java.util.Set r0 = r7.A02()
            java.util.Iterator r10 = r0.iterator()
        L_0x0cbd:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0d08
            java.lang.String r4 = X.AnonymousClass001.A0m(r10)
            X.2sc r9 = r7.A00(r4)
            if (r9 != 0) goto L_0x0cd3
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap handler not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0cbd
        L_0x0cd3:
            java.util.Set r1 = X.AnonymousClass33W.A09
            java.lang.String r0 = r9.A03()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0cbd
            boolean r0 = r9 instanceof X.C22621Ox
            if (r0 == 0) goto L_0x0d02
            r1 = r9
            X.1Ox r1 = (X.C22621Ox) r1
            java.util.List r0 = r1.A0E(r13)
        L_0x0cea:
            r5.addAll(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap adding mutations for "
            java.lang.Class r0 = X.C18310x6.A0c(r9, r0, r1)
            java.lang.String r0 = r0.getCanonicalName()
            X.C18260x0.A1L(r1, r0)
            r6.add(r4)
            goto L_0x0cbd
        L_0x0d02:
            r0 = 0
            java.util.List r0 = r9.A05(r0)
            goto L_0x0cea
        L_0x0d08:
            X.2qH r0 = r8.A07
            r0.A04(r5)
            r3.A07(r6)
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C613730l.A00(r3)
            X.C18270x1.A0h(r0, r2, r1)
            goto L_0x0d1f
        L_0x0d19:
            X.2nP r1 = r8.A09
            r0 = 1
            r1.A02(r0)
        L_0x0d1f:
            r26.A0G()
            return
        L_0x0d23:
            r1 = move-exception
            if (r2 == 0) goto L_0x0d2e
            r2.close()     // Catch:{ all -> 0x0d2a }
            goto L_0x0d2e
        L_0x0d2a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0d2f }
        L_0x0d2e:
            throw r1     // Catch:{ all -> 0x0d2f }
        L_0x0d2f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0deb }
            throw r1
        L_0x0d34:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0d34 }
            throw r0
        L_0x0d37:
            java.lang.Object r5 = r4.A00
            X.3Gp r5 = (X.C65203Gp) r5
            X.3Et r6 = r5.A0E
            java.lang.Object r0 = r4.A01
            X.8Sy r0 = (X.C174098Sy) r0
            X.8Nf r3 = r0.iterator()
        L_0x0d45:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0d67
            com.whatsapp.jid.DeviceJid r2 = X.AnonymousClass0x7.A0R(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "history-sync-manager/stopMessageHistorySync for "
            java.lang.String r0 = X.C18300x5.A0k(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            X.2qw r1 = r6.A0D
            r0 = 2
            r1.A04(r2, r0)
            r0 = 3
            r1.A04(r2, r0)
            goto L_0x0d45
        L_0x0d67:
            X.3Mh r1 = r5.A07
            X.1Ek r0 = X.C66663Mh.A1Q
            int r1 = r1.A03(r0)
            X.1iB r0 = r5.A0X
            boolean r0 = X.C29041iB.A00(r0)
            if (r1 != 0) goto L_0x0dce
            if (r0 != 0) goto L_0x0da8
            r0 = 3
            r5.A0H(r0)
        L_0x0d7d:
            X.3Ek r4 = r5.A0H
            X.2sH r0 = r4.A02
            long r6 = r0.A0H()
            X.30l r10 = r4.A01
            android.content.SharedPreferences$Editor r1 = X.C613730l.A00(r10)
            java.lang.String r0 = "syncd_last_companion_dereg_logging_time"
            X.C18270x1.A0i(r1, r0, r6)
            android.content.SharedPreferences r0 = r10.A02()
            java.lang.String r1 = "syncd_first_companion_reg_logging_time"
            r8 = 0
            long r2 = r0.getLong(r1, r8)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0db8
            java.lang.String r0 = "syncStatsManager/onLastCompanionDeregistration, first registerTs is 0L"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0da8:
            X.2sZ r1 = r5.A0M
            java.lang.String r0 = "SyncdKeyManager/unblockAllCollections"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2WC r0 = r1.A0A
            X.1RE r0 = r0.A00
            X.4Fq r4 = r0.A0C()
            goto L_0x0dd1
        L_0x0db8:
            android.content.SharedPreferences r0 = r10.A02()
            X.C18270x1.A0n(r0, r1)
            X.1WU r1 = new X.1WU
            r1.<init>()
            java.lang.Long r0 = X.C18310x6.A0f(r6, r2)
            r1.A00 = r0
            X.C64663Ek.A05(r4, r1)
            goto L_0x0da8
        L_0x0dce:
            if (r0 != 0) goto L_0x0da8
            goto L_0x0d7d
        L_0x0dd1:
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0de6 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0de6 }
            java.lang.String r2 = "missing_keys"
            java.lang.String r1 = "SyncdMissingKeysTable.deleteAllRows"
            r0 = 0
            r3.A07(r2, r0, r1, r0)     // Catch:{ all -> 0x0de6 }
            r4.close()
            r5.A0F()
            return
        L_0x0de6:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0deb }
            throw r1
        L_0x0deb:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33241sg.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33241sg(C48932fi r2, C65203Gp r3) {
        super("SyncManager/CriticalDataUploadManager/startObserver");
        this.A02 = 1;
        this.A00 = r3;
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33241sg(AnonymousClass3FH r2, C22491Og r3) {
        super("SyncdUpdateHelper/onLocaleChanged");
        this.A02 = 4;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33241sg(C72173dI r1, Runnable runnable, String str, int i) {
        super(str);
        this.A02 = i;
        this.A00 = r1;
        this.A01 = runnable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33241sg(AnonymousClass3XA r2, C65203Gp r3) {
        super("SyncManager/doPreCompanionLogoutTask");
        this.A02 = 2;
        this.A00 = r3;
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33241sg(C129526aS r2, C65203Gp r3) {
        super("SyncManager/onDeviceRemoved");
        this.A02 = 0;
        this.A00 = r3;
        this.A01 = r2;
    }
}
