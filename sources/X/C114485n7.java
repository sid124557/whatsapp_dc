package X;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.5n7  reason: invalid class name and case insensitive filesystem */
public final class C114485n7 implements AnonymousClass4EN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C202269lf A01;
    public final /* synthetic */ C110915hF A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ Map A04;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (r35.containsKey(r10) == false) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        r32 = r5.A00;
        r1 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
        if (r1 == null) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        r9 = X.AnonymousClass001.A0s();
        r8 = (X.AnonymousClass8OQ) ((X.AnonymousClass8OQ) X.C18300x5.A0d(X.C100845Cm.A01)).get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        if (r8 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        r20 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ea, code lost:
        if (r20.hasNext() == false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        r7 = (X.C108585dE) r20.next();
        r14 = r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        if (r14 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f6, code lost:
        r0 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r0 == null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        r0 = r0.A01;
        r19 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fe, code lost:
        if (r0 == null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r0 = r7.A0A;
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        if (r0 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r0 = r7.A06;
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010a, code lost:
        if (r0 == null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010c, code lost:
        r23 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.fromString(r7.A01.toString());
        X.C162457s7.A0D(r23);
        r16 = X.C999058q.valueOf(r14);
        X.C162457s7.A0J(r16, 0);
        r5 = X.C192479Jx.values();
        r24 = r5.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        if (r4 >= r24) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        r3 = r5[r4];
        r2 = r3.name();
        r0 = X.C175738Zn.A0U(r16.toString(), "_", "", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0144, code lost:
        if (r2 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        if (r2.equalsIgnoreCase(r0) == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
        r4 = (java.lang.String) r8.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0152, code lost:
        if (r4 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
        r9.add(X.C195349Xk.A00(r23, X.AnonymousClass9JU.A02, r3, r10, r17, r19, r18, r4, r7.A09, r32, (long) r7.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017b, code lost:
        r11.put(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0180, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Invalid model metadata. No id set. Model asset name: ");
        r1.append(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018d, code lost:
        r2 = "Asset file name is not set";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0190, code lost:
        r2 = "Asset name is not set";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0193, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Unrecognized capability ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019a, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "Asset list is null for model ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a1, code lost:
        r1 = X.AnonymousClass001.A0o();
        r0 = "client does not request a capability that server sends. received: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a7, code lost:
        r2 = X.AnonymousClass000.A0P(r10, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b2, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Unrecognized model asset type ");
        r1.append(r14);
        r0 = " for capability ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c0, code lost:
        r1.append(r0);
        r1.append(r10.toServerValue());
        r1.append(" is received by model metadata downloader");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cf, code lost:
        r2 = r1.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyP(X.AnonymousClass2SI r37) {
        /*
            r36 = this;
            r0 = 0
            r3 = r37
            X.C162457s7.A0J(r3, r0)
            X.2fE r2 = r3.A04
            X.C162457s7.A0D(r2)
            X.2WN r1 = r3.A03
            X.C162457s7.A0D(r1)
            int r0 = r3.A00
            r13 = 0
            r12 = r36
            if (r0 == 0) goto L_0x0062
            java.util.Map r0 = r2.A00
            if (r0 != 0) goto L_0x0036
            X.9lf r4 = r12.A01
            java.util.List r3 = r12.A03
            java.lang.String r2 = "Model metadata request failed without errors set. Possibly caused by data processor"
        L_0x0021:
            X.9Tm r1 = new X.9Tm
            r1.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.MODEL_METADATA_DOWNLOAD_FAILURE
            r1.A01(r0)
            r1.A02(r2)
            X.9KQ r0 = r1.A00()
            r4.BPV(r0, r3, r13)
            return
        L_0x0036:
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r0)
            java.lang.String r2 = ""
        L_0x003c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0053
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r2 = X.AnonymousClass000.A0R(r0, r1)
            goto L_0x003c
        L_0x0053:
            X.9lf r4 = r12.A01
            java.util.List r3 = r12.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WA model metadata fetcher failed to query because: "
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r2, r1)
            goto L_0x0021
        L_0x0062:
            java.lang.Object r0 = r1.A00
            X.5dA r0 = (X.C108545dA) r0
            if (r0 != 0) goto L_0x006f
            X.9lf r4 = r12.A01
            java.util.List r3 = r12.A03
            java.lang.String r2 = "WA model metadata fetcher received empty metadata"
            goto L_0x0021
        L_0x006f:
            java.util.ArrayList r2 = r0.A05
            if (r2 != 0) goto L_0x007a
            X.9lf r4 = r12.A01
            java.util.List r3 = r12.A03
            java.lang.String r2 = "WA model metadata fetcher received empty models list"
            goto L_0x0021
        L_0x007a:
            int r0 = r2.size()
            int r1 = r12.A00
            if (r0 == r1) goto L_0x0089
            X.9lf r4 = r12.A01
            java.util.List r3 = r12.A03
            java.lang.String r2 = "# of capabilities requested and received are different."
            goto L_0x0021
        L_0x0089:
            java.util.Map r0 = r12.A04     // Catch:{ 9KQ -> 0x01ed }
            r35 = r0
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ 9KQ -> 0x01ed }
            r11.<init>(r1)     // Catch:{ 9KQ -> 0x01ed }
            java.util.Iterator r22 = r2.iterator()     // Catch:{ 9KQ -> 0x01ed }
        L_0x0096:
            boolean r0 = r22.hasNext()     // Catch:{ 9KQ -> 0x01ed }
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r5 = r22.next()     // Catch:{ 9KQ -> 0x01ed }
            X.5d9 r5 = (X.C108535d9) r5     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r4 = r5.A01     // Catch:{ 9KQ -> 0x01ed }
            if (r4 == 0) goto L_0x01af
            com.facebook.cameracore.ardelivery.model.VersionedCapability[] r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.values()     // Catch:{ 9KQ -> 0x01ed }
            int r2 = r3.length     // Catch:{ 9KQ -> 0x01ed }
            r1 = 0
        L_0x00ac:
            if (r1 >= r2) goto L_0x01ac
            r10 = r3[r1]     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = r10.name()     // Catch:{ 9KQ -> 0x01ed }
            if (r0 == 0) goto L_0x0177
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ 9KQ -> 0x01ed }
            if (r0 == 0) goto L_0x0177
            r0 = r35
            boolean r0 = r0.containsKey(r10)     // Catch:{ 9KQ -> 0x01ed }
            if (r0 == 0) goto L_0x01a1
            int r0 = r5.A00     // Catch:{ 9KQ -> 0x01ed }
            r32 = r0
            java.util.ArrayList r1 = r5.A02     // Catch:{ 9KQ -> 0x01ed }
            if (r1 == 0) goto L_0x019a
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ 9KQ -> 0x01ed }
            X.66R r0 = X.C100845Cm.A01     // Catch:{ 9KQ -> 0x01ed }
            java.lang.Object r0 = X.C18300x5.A0d(r0)     // Catch:{ 9KQ -> 0x01ed }
            X.8OQ r0 = (X.AnonymousClass8OQ) r0     // Catch:{ 9KQ -> 0x01ed }
            java.lang.Object r8 = r0.get(r10)     // Catch:{ 9KQ -> 0x01ed }
            X.8OQ r8 = (X.AnonymousClass8OQ) r8     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r21 = " is received by model metadata downloader"
            if (r8 == 0) goto L_0x0193
            java.util.Iterator r20 = r1.iterator()     // Catch:{ 9KQ -> 0x01ed }
        L_0x00e6:
            boolean r0 = r20.hasNext()     // Catch:{ 9KQ -> 0x01ed }
            if (r0 == 0) goto L_0x017b
            java.lang.Object r7 = r20.next()     // Catch:{ 9KQ -> 0x01ed }
            X.5dE r7 = (X.C108585dE) r7     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r14 = r7.A08     // Catch:{ 9KQ -> 0x01ed }
            if (r14 == 0) goto L_0x0190
            X.5dG r0 = r7.A02     // Catch:{ 9KQ -> 0x01ed }
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = r0.A01     // Catch:{ 9KQ -> 0x01ed }
            r19 = r0
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = r7.A0A     // Catch:{ 9KQ -> 0x01ed }
            r18 = r0
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r7.A06     // Catch:{ 9KQ -> 0x01ed }
            r17 = r0
            if (r0 == 0) goto L_0x0180
            X.57v r0 = r7.A01     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = r0.toString()     // Catch:{ 9KQ -> 0x01ed }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r23 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.fromString(r0)     // Catch:{ 9KQ -> 0x01ed }
            X.C162457s7.A0D(r23)     // Catch:{ 9KQ -> 0x01ed }
            X.58q r16 = X.C999058q.valueOf(r14)     // Catch:{ 9KQ -> 0x01ed }
            r6 = 0
            r0 = r16
            X.C162457s7.A0J(r0, r6)     // Catch:{ 9KQ -> 0x01ed }
            X.9Jx[] r5 = X.C192479Jx.values()     // Catch:{ 9KQ -> 0x01ed }
            int r0 = r5.length     // Catch:{ 9KQ -> 0x01ed }
            r24 = r0
            r4 = 0
        L_0x012b:
            r0 = r24
            if (r4 >= r0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r3 = 0
            goto L_0x014c
        L_0x0132:
            r3 = r5[r4]     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r2 = r3.name()     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r15 = r16.toString()     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r1 = "_"
            java.lang.String r0 = ""
            java.lang.String r0 = X.C175738Zn.A0U(r15, r1, r0, r6)     // Catch:{ 9KQ -> 0x01ed }
            if (r2 == 0) goto L_0x0174
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ 9KQ -> 0x01ed }
            if (r0 == 0) goto L_0x0174
        L_0x014c:
            java.lang.Object r4 = r8.get(r3)     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 9KQ -> 0x01ed }
            if (r4 == 0) goto L_0x01b2
            X.9JU r24 = X.AnonymousClass9JU.SHA256     // Catch:{ 9KQ -> 0x01ed }
            int r0 = r7.A00     // Catch:{ 9KQ -> 0x01ed }
            long r0 = (long) r0     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r2 = r7.A09     // Catch:{ 9KQ -> 0x01ed }
            r25 = r3
            r26 = r10
            r27 = r17
            r28 = r19
            r29 = r18
            r30 = r4
            r31 = r2
            r33 = r0
            X.9Xk r0 = X.C195349Xk.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 9KQ -> 0x01ed }
            r9.add(r0)     // Catch:{ 9KQ -> 0x01ed }
            goto L_0x00e6
        L_0x0174:
            int r4 = r4 + 1
            goto L_0x012b
        L_0x0177:
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x017b:
            r11.put(r10, r9)     // Catch:{ 9KQ -> 0x01ed }
            goto L_0x0096
        L_0x0180:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = "Invalid model metadata. No id set. Model asset name: "
            r1.append(r0)     // Catch:{ 9KQ -> 0x01ed }
            r1.append(r14)     // Catch:{ 9KQ -> 0x01ed }
            goto L_0x01cf
        L_0x018d:
            java.lang.String r2 = "Asset file name is not set"
            goto L_0x01d3
        L_0x0190:
            java.lang.String r2 = "Asset name is not set"
            goto L_0x01d3
        L_0x0193:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = "Unrecognized capability "
            goto L_0x01c0
        L_0x019a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = "Asset list is null for model "
            goto L_0x01a7
        L_0x01a1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = "client does not request a capability that server sends. received: "
        L_0x01a7:
            java.lang.String r2 = X.AnonymousClass000.A0P(r10, r0, r1)     // Catch:{ 9KQ -> 0x01ed }
            goto L_0x01d3
        L_0x01ac:
            java.lang.String r2 = "NMLML model name does not match VersionedCapability enum."
            goto L_0x01d3
        L_0x01af:
            java.lang.String r2 = "NMLML model name is null."
            goto L_0x01d3
        L_0x01b2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = "Unrecognized model asset type "
            r1.append(r0)     // Catch:{ 9KQ -> 0x01ed }
            r1.append(r14)     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = " for capability "
        L_0x01c0:
            r1.append(r0)     // Catch:{ 9KQ -> 0x01ed }
            java.lang.String r0 = r10.toServerValue()     // Catch:{ 9KQ -> 0x01ed }
            r1.append(r0)     // Catch:{ 9KQ -> 0x01ed }
            r0 = r21
            r1.append(r0)     // Catch:{ 9KQ -> 0x01ed }
        L_0x01cf:
            java.lang.String r2 = r1.toString()     // Catch:{ 9KQ -> 0x01ed }
        L_0x01d3:
            X.9Tm r1 = new X.9Tm     // Catch:{ 9KQ -> 0x01ed }
            r1.<init>()     // Catch:{ 9KQ -> 0x01ed }
            X.9K2 r0 = X.AnonymousClass9K2.MODEL_METADATA_DOWNLOAD_FAILURE     // Catch:{ 9KQ -> 0x01ed }
            r1.A01(r0)     // Catch:{ 9KQ -> 0x01ed }
            r1.A02(r2)     // Catch:{ 9KQ -> 0x01ed }
            X.9KQ r0 = r1.A00()     // Catch:{ 9KQ -> 0x01ed }
            throw r0     // Catch:{ 9KQ -> 0x01ed }
        L_0x01e5:
            X.9lf r1 = r12.A01
            java.util.List r0 = r12.A03
            r1.BPV(r13, r0, r11)
            return
        L_0x01ed:
            r2 = move-exception
            X.9lf r1 = r12.A01
            java.util.List r0 = r12.A03
            r1.BPV(r2, r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114485n7.AyP(X.2SI):void");
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        this.A01.BPV(iOException, this.A03, (Map) null);
    }

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        this.A01.BPV(exc, this.A03, (Map) null);
    }

    public C114485n7(C202269lf r1, C110915hF r2, List list, Map map, int i) {
        this.A01 = r1;
        this.A03 = list;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = map;
    }
}
