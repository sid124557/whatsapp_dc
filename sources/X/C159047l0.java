package X;

import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7l0  reason: invalid class name and case insensitive filesystem */
public class C159047l0 {
    public int A00 = 3;
    public long A01 = 0;
    public long A02 = 0;
    public C151667Vu A03;
    public final C55682qk A04;
    public final C56492s4 A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final C57162tC A08;
    public final AnonymousClass33p A09;
    public final C620733j A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4FV A0C;
    public final AnonymousClass33K A0D;
    public final C49912hI A0E;
    public final C55132pq A0F;
    public final AnonymousClass4FS A0G;
    public final HashMap A0H = AnonymousClass001.A0t();

    public final synchronized int A01() {
        return this.A00;
    }

    public final synchronized int A02(int i) {
        int i2 = this.A00;
        if (i2 == 0 && i == 0) {
            Log.e("ManifestManager/setState/State change ERROR - loading to loading!");
            i = this.A00;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ManifestManager/setState/State change - ");
            A0o.append(A00(i2));
            A0o.append(" to ");
            C18260x0.A1J(A0o, A00(i));
            this.A00 = i;
        }
        return i;
    }

    public final synchronized long A03() {
        long j;
        j = this.A01;
        if (j == 0) {
            j = AnonymousClass0x2.A0F(this.A09).getLong("downloadable_manifest_last_fetched_time_millis", 0);
            this.A01 = j;
        }
        return j;
    }

    public final synchronized void A04(long j) {
        this.A01 = j;
        C18270x1.A0i(C18270x1.A03(this.A09), "downloadable_manifest_last_fetched_time_millis", j);
    }

    public final synchronized void A05(AnonymousClass7WL r5, String str) {
        int i = this.A00;
        if (i == 0) {
            HashMap hashMap = this.A0H;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList == null || arrayList.isEmpty()) {
                C18260x0.A0q("ManifestManager/registerCallback/Registering first callback for category : ", str, AnonymousClass001.A0o());
                hashMap.put(str, AnonymousClass002.A0J(Collections.singletonList(r5)));
            } else {
                C18260x0.A0q("ManifestManager/registerCallback/Registering another callback for category : ", str, AnonymousClass001.A0o());
                arrayList.add(r5);
                hashMap.put(str, arrayList);
            }
        } else if (i == 5) {
            C18260x0.A0q("ManifestManager/registerCallback/Registering converted to servicing successful callback for category : ", str, AnonymousClass001.A0o());
            C151667Vu r0 = this.A03;
            C626936e.A06(r0);
            r5.A01((C160627o1) r0.A01.get(str));
        } else if (i == 1) {
            C18260x0.A0q("ManifestManager/registerCallback/Registering converted to servicing error callback for category : ", str, AnonymousClass001.A0o());
            r5.A00();
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ManifestManager/registerCallback/Invalid state encountered when trying to register category : ");
            A0o.append(str);
            A0o.append(" state : ");
            C18260x0.A1K(A0o, A00(i));
        }
    }

    public static String A00(int i) {
        if (i == 0) {
            return "LOADING";
        }
        if (i == 1) {
            return "LOADING_FAILED";
        }
        if (i == 2) {
            return "MANIFEST_STALE";
        }
        if (i == 3) {
            return "NO_MANIFEST";
        }
        if (i != 4) {
            return "UP_TO_DATE";
        }
        return "READ_NEEDED";
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03e2  */
    public final void A06(X.C160627o1 r25, X.C54832pM r26, boolean r27) {
        /*
            r24 = this;
            r2 = r24
            X.C626936e.A00()
            int r0 = r2.A01()
            r3 = 0
            r4 = 1
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0C(r0)
            r23 = r27
            r0 = r27 ^ 1
            r13 = 0
            r20 = r25
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "ManifestManager/fetchWithBackoff/local is out of date. Starting fetch for manifest..."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            if (r25 != 0) goto L_0x0050
            r12 = r13
        L_0x0023:
            X.C626936e.A00()
            int r0 = r2.A01()
            r7 = 1
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0C(r0)
            X.33j r0 = r2.A0A
            java.util.Locale r0 = X.C620733j.A02(r0)
            java.lang.String r11 = X.C162307rf.A04(r0)
            X.1VX r8 = r2.A0B
            X.2hI r9 = r2.A0E
            java.lang.String r10 = "manifest"
            java.lang.String r5 = X.AnonymousClass351.A02(r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ManifestManager/fetch/Creating connection to download MANIFEST. Endpoint = "
            X.C18260x0.A0q(r0, r5, r1)
            goto L_0x0055
        L_0x0050:
            java.lang.String r12 = r20.A01()
            goto L_0x0023
        L_0x0055:
            X.33K r1 = r2.A0D     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
            X.2pq r0 = r2.A0F     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
            X.4GL r5 = r1.A01(r0, r5, r13)     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
            r0 = r5
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x01cc }
            java.net.HttpURLConnection r6 = r0.A01     // Catch:{ all -> 0x01cc }
            int r1 = r6.getResponseCode()     // Catch:{ all -> 0x01cc }
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L_0x0089
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "ManifestManager/fetch/Error, code="
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            int r0 = r6.getResponseCode()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x01cc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01cc }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01cc }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r13)     // Catch:{ all -> 0x01cc }
            r5.close()     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
            goto L_0x01fc
        L_0x0089:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "ManifestManager/fetch/Response code from server="
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            int r0 = r6.getResponseCode()     // Catch:{ all -> 0x01cc }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "idhash"
            java.lang.String r9 = r6.getHeaderField(r0)     // Catch:{ all -> 0x01cc }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "ManifestManager/fetch/Server's idhash is "
            X.C18260x0.A0q(r0, r9, r1)     // Catch:{ all -> 0x01cc }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x01cc }
            if (r0 != 0) goto L_0x01bb
            boolean r0 = X.AnonymousClass351.A04(r9)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x01bb
            int r1 = r6.getResponseCode()     // Catch:{ all -> 0x01cc }
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L_0x00dc
            boolean r0 = r9.equals(r12)     // Catch:{ all -> 0x01cc }
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "ManifestManager/fetch/Manifest is already locally up-to-date. Nothing to do."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01cc }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01cc }
            X.7o1 r7 = new X.7o1     // Catch:{ all -> 0x01cc }
            r12 = r13
            r8 = r10
            r10 = r11
            r11 = r13
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01cc }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r7)     // Catch:{ all -> 0x01cc }
            r5.close()     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
            goto L_0x01fc
        L_0x00dc:
            boolean r0 = r9.equals(r12)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x00e3
            r7 = 0
        L_0x00e3:
            X.C626936e.A0C(r7)     // Catch:{ all -> 0x01cc }
            X.C626936e.A00()     // Catch:{ all -> 0x01cc }
            int r0 = r2.A01()     // Catch:{ all -> 0x01cc }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "ManifestManager/store/Storing MANIFEST..."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01cc }
            X.2s4 r6 = r2.A05     // Catch:{ IOException -> 0x01a6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x01a6 }
            r0 = 22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01a6 }
            java.io.InputStream r6 = r5.B47(r6, r1, r0)     // Catch:{ IOException -> 0x01a6 }
            X.2oU r0 = r2.A07     // Catch:{ all -> 0x019c }
            android.content.Context r7 = r0.A00     // Catch:{ all -> 0x019c }
            java.io.File r1 = r7.getFilesDir()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "downloadable"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x019c }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x0129
            boolean r0 = r1.mkdirs()     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = "ManifestManager/store/Could not make file subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x019c }
            goto L_0x0144
        L_0x0129:
            java.io.File r1 = r7.getFilesDir()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "downloadable/manifest.json"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x019c }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x0148
            boolean r0 = r1.delete()     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x0148
            java.lang.String r0 = "ManifestManager/store/Could not delete existing manifest!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x019c }
        L_0x0144:
            r6.close()     // Catch:{ IOException -> 0x01a6 }
            goto L_0x01ac
        L_0x0148:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r0]     // Catch:{ all -> 0x019c }
            java.io.FileOutputStream r7 = X.AnonymousClass0x9.A0h(r1)     // Catch:{ all -> 0x019c }
        L_0x0150:
            int r1 = r6.read(r8)     // Catch:{ all -> 0x0192 }
            r0 = -1
            if (r1 == r0) goto L_0x015b
            r7.write(r8, r3, r1)     // Catch:{ all -> 0x0192 }
            goto L_0x0150
        L_0x015b:
            r7.close()     // Catch:{ all -> 0x019c }
            r6.close()     // Catch:{ IOException -> 0x01a6 }
            X.33p r1 = r2.A09     // Catch:{ all -> 0x01cc }
            X.7o1 r14 = new X.7o1     // Catch:{ all -> 0x01cc }
            r19 = r13
            r15 = r10
            r17 = r11
            r18 = r13
            r16 = r9
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = r14.A02()     // Catch:{ all -> 0x01cc }
            r1.A1i(r10, r0)     // Catch:{ all -> 0x01cc }
            monitor-enter(r2)     // Catch:{ all -> 0x01cc }
            r2.A03 = r13     // Catch:{ all -> 0x018f }
            monitor-exit(r2)     // Catch:{ all -> 0x01cc }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01cc }
            X.7o1 r7 = new X.7o1     // Catch:{ all -> 0x01cc }
            r12 = r13
            r8 = r10
            r10 = r11
            r11 = r13
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01cc }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r7)     // Catch:{ all -> 0x01cc }
            r5.close()     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
            goto L_0x01fc
        L_0x018f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x0192:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0197 }
            goto L_0x019b
        L_0x0197:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x019c }
        L_0x019b:
            throw r1     // Catch:{ all -> 0x019c }
        L_0x019c:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x01a1 }
            goto L_0x01a5
        L_0x01a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01a6 }
        L_0x01a5:
            throw r1     // Catch:{ IOException -> 0x01a6 }
        L_0x01a6:
            r1 = move-exception
            java.lang.String r0 = "ManifestManager/store/Failed : "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01cc }
        L_0x01ac:
            java.lang.String r0 = "ManifestManager/fetch/Store failed for MANIFEST"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01cc }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01cc }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r13)     // Catch:{ all -> 0x01cc }
            r5.close()     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
            goto L_0x01fc
        L_0x01bb:
            X.2qk r1 = r2.A04     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "ManifestManager/fetch/Improper manifest hash from server!"
            X.AnonymousClass351.A03(r1, r0)     // Catch:{ all -> 0x01cc }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01cc }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r13)     // Catch:{ all -> 0x01cc }
            r5.close()     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
            goto L_0x01fc
        L_0x01cc:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
        L_0x01d5:
            throw r1     // Catch:{ IOException -> 0x01d6, JSONException -> 0x01e6 }
        L_0x01d6:
            r1 = move-exception
            java.lang.String r0 = "ManifestManager/fetch/Failed! "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r13)
            goto L_0x01fc
        L_0x01e3:
            r6 = r20
            goto L_0x0216
        L_0x01e6:
            r6 = move-exception
            X.2qk r5 = r2.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ManifestManager/fetch/json exception while fetching manifest."
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r6)
            X.AnonymousClass351.A03(r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r13)
        L_0x01fc:
            java.lang.Object r0 = r1.first
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            java.lang.Object r6 = r1.second
            X.7o1 r6 = (X.C160627o1) r6
            if (r0 == 0) goto L_0x03e2
            java.lang.String r0 = "ManifestManager/fetchWithBackoff/Fetch succeeded."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sH r0 = r2.A06
            long r0 = r0.A0H()
            r2.A04(r0)
        L_0x0216:
            java.lang.String r0 = "ManifestManager/fetchWithBackoff/local needs read. Starting read for manifest..."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.C626936e.A06(r6)
            java.lang.String r0 = r6.A00
            X.C626936e.A06(r0)
            X.2oU r0 = r2.A07
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "downloadable/manifest.json"
            java.io.File r5 = X.AnonymousClass002.A0A(r1, r0)
            X.C626936e.A00()
            int r0 = r2.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0C(r0)
            X.7Vu r0 = r2.A03
            if (r0 == 0) goto L_0x0285
            java.lang.String r0 = "ManifestManager/read/Manifest already up to date!"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0248:
            java.lang.String r0 = "ManifestManager/fetchWithBackoff/Read succeeded."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7Vu r6 = r2.A03
            X.C626936e.A06(r6)
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            java.util.HashMap r1 = r6.A01
            java.util.Iterator r5 = X.AnonymousClass001.A0u(r1)
        L_0x025c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x03c2
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r5)
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            X.7o1 r1 = (X.C160627o1) r1
            java.lang.String r8 = r1.A01
            java.lang.String r9 = r1.A01()
            java.lang.String r10 = r1.A00
            java.lang.String r11 = r1.A02
            java.util.Map r12 = r1.A03
            X.7o1 r7 = new X.7o1
            r7.<init>(r8, r9, r10, r11, r12)
            r0.put(r3, r7)
            goto L_0x025c
        L_0x0285:
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x0297
            java.lang.String r0 = "ManifestManager/read/Manifest file doesn't exist, but read called!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0290:
            java.lang.String r0 = "ManifestManager/fetchWithBackoff/Read failed."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x03e7
        L_0x0297:
            java.util.HashMap r1 = X.AnonymousClass001.A0t()
            java.io.FileInputStream r5 = X.AnonymousClass0x9.A0g(r5)     // Catch:{ IOException -> 0x03ba }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x03ba }
            r0.<init>(r5)     // Catch:{ IOException -> 0x03ba }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException -> 0x03ba }
            r5.<init>(r0)     // Catch:{ IOException -> 0x03ba }
            r5.beginObject()     // Catch:{ all -> 0x03b0 }
        L_0x02ac:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x039c
            java.lang.String r8 = r5.nextName()     // Catch:{ all -> 0x03b0 }
            int r7 = r8.hashCode()     // Catch:{ all -> 0x03b0 }
            r0 = 1296516636(0x4d47461c, float:2.08953792E8)
            if (r7 != r0) goto L_0x02c8
            java.lang.String r0 = "categories"
            boolean r7 = r8.equals(r0)     // Catch:{ all -> 0x03b0 }
            r0 = 0
            if (r7 != 0) goto L_0x02c9
        L_0x02c8:
            r0 = -1
        L_0x02c9:
            java.lang.String r7 = "ManifestManager/read/Skipping unknown field "
            if (r0 == 0) goto L_0x02da
            r5.skipValue()     // Catch:{ all -> 0x03b0 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0m(r7, r8)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = " in MANIFEST"
            X.C18260x0.A1K(r7, r0)     // Catch:{ all -> 0x03b0 }
            goto L_0x02ac
        L_0x02da:
            r5.beginObject()     // Catch:{ all -> 0x03b0 }
        L_0x02dd:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x0379
            java.lang.String r11 = r5.nextName()     // Catch:{ all -> 0x03b0 }
            r5.beginObject()     // Catch:{ all -> 0x03b0 }
            r12 = 0
            r14 = r13
            r15 = r13
        L_0x02ed:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x0364
            java.lang.String r8 = r5.nextName()     // Catch:{ all -> 0x03b0 }
            int r0 = r8.hashCode()     // Catch:{ all -> 0x03b0 }
            switch(r0) {
                case 116079: goto L_0x030b;
                case 235331633: goto L_0x0318;
                case 1652450738: goto L_0x034b;
                case 1950472728: goto L_0x0358;
                default: goto L_0x02fe;
            }     // Catch:{ all -> 0x03b0 }
        L_0x02fe:
            r5.skipValue()     // Catch:{ all -> 0x03b0 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0m(r7, r8)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = " while reading category "
            X.C18260x0.A0r(r0, r11, r8)     // Catch:{ all -> 0x03b0 }
            goto L_0x02ed
        L_0x030b:
            java.lang.String r0 = "url"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x02fe
            java.lang.String r14 = r5.nextString()     // Catch:{ all -> 0x03b0 }
            goto L_0x02ed
        L_0x0318:
            java.lang.String r0 = "bundles"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x02fe
            java.util.HashMap r15 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x03b0 }
            r5.beginArray()     // Catch:{ all -> 0x03b0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03b0 }
        L_0x032b:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x0347
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = r5.nextString()     // Catch:{ all -> 0x03b0 }
            r15.put(r8, r0)     // Catch:{ all -> 0x03b0 }
            int r0 = r9.intValue()     // Catch:{ all -> 0x03b0 }
            int r0 = r0 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03b0 }
            goto L_0x032b
        L_0x0347:
            r5.endArray()     // Catch:{ all -> 0x03b0 }
            goto L_0x02ed
        L_0x034b:
            java.lang.String r0 = "id_hash"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x02fe
            java.lang.String r12 = r5.nextString()     // Catch:{ all -> 0x03b0 }
            goto L_0x02ed
        L_0x0358:
            java.lang.String r0 = "default_locale"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x02fe
            r5.nextString()     // Catch:{ all -> 0x03b0 }
            goto L_0x02ed
        L_0x0364:
            r5.endObject()     // Catch:{ all -> 0x03b0 }
            if (r12 == 0) goto L_0x037e
            boolean r0 = X.AnonymousClass351.A04(r12)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x037e
            X.7o1 r10 = new X.7o1     // Catch:{ all -> 0x03b0 }
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03b0 }
            r1.put(r11, r10)     // Catch:{ all -> 0x03b0 }
            goto L_0x02dd
        L_0x0379:
            r5.endObject()     // Catch:{ all -> 0x03b0 }
            goto L_0x02ac
        L_0x037e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = "ManifestManager/read/Category "
            r1.append(r0)     // Catch:{ all -> 0x03b0 }
            r1.append(r11)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = " does not have proper hash : "
            r1.append(r0)     // Catch:{ all -> 0x03b0 }
            r1.append(r12)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = " Quitting!"
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x03b0 }
            r5.close()     // Catch:{ IOException -> 0x03ba }
            goto L_0x0290
        L_0x039c:
            r5.endObject()     // Catch:{ all -> 0x03b0 }
            X.7Vu r0 = new X.7Vu     // Catch:{ all -> 0x03b0 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x03b0 }
            monitor-enter(r2)     // Catch:{ all -> 0x03b0 }
            r2.A03 = r0     // Catch:{ all -> 0x03ad }
            monitor-exit(r2)     // Catch:{ all -> 0x03b0 }
            r5.close()     // Catch:{ IOException -> 0x03ba }
            goto L_0x0248
        L_0x03ad:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03b0 }
            throw r0     // Catch:{ all -> 0x03b0 }
        L_0x03b0:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x03b5 }
            goto L_0x03b9
        L_0x03b5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x03ba }
        L_0x03b9:
            throw r1     // Catch:{ IOException -> 0x03ba }
        L_0x03ba:
            r1 = move-exception
            java.lang.String r0 = "ManifestManager/read/Failed!"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0290
        L_0x03c2:
            X.7o1 r1 = r6.A00
            java.lang.String r6 = r1.A01
            java.lang.String r7 = r1.A01()
            java.lang.String r8 = r1.A00
            java.lang.String r9 = r1.A02
            java.util.Map r10 = r1.A03
            X.7o1 r5 = new X.7o1
            r5.<init>(r6, r7, r8, r9, r10)
            X.7Vu r1 = new X.7Vu
            r1.<init>(r5, r0)
            r0 = 5
            r2.A02(r0)
            r2.A07(r1, r4)
            return
        L_0x03e2:
            java.lang.String r0 = "ManifestManager/fetchWithBackoff/Fetch failed."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x03e7:
            r21 = r26
            long r0 = r21.A01()
            long r8 = r21.A00()
            r6 = 17
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0412
            java.lang.String r0 = "ManifestManager/fetchWithBackoff/Load failed on all retries!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2sH r0 = r2.A06
            long r0 = r0.A0H()
            r2.A02 = r0
            X.33p r1 = r2.A09
            java.lang.String r0 = "manifest"
            r1.A1i(r0, r13)
            r2.A02(r4)
            r2.A07(r13, r3)
            return
        L_0x0412:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "ManifestManager/fetchWithBackoff/Load failed, will retry after "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = " seconds for the "
            r5.append(r3)
            long r3 = r21.A00()
            r5.append(r3)
            java.lang.String r3 = "th time"
            X.C18260x0.A1M(r5, r3)
            X.4FS r5 = r2.A0G
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
            r22 = 20
            X.3cR r3 = new X.3cR
            r18 = r3
            r19 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            java.lang.String r2 = "ManifestManager/fetch"
            r5.Bkn(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159047l0.A06(X.7o1, X.2pM, boolean):void");
    }

    public C159047l0(C55682qk r3, C56492s4 r4, C56612sH r5, C54292oU r6, C57162tC r7, AnonymousClass33p r8, C620733j r9, AnonymousClass1VX r10, AnonymousClass4FV r11, AnonymousClass33K r12, C49912hI r13, C55132pq r14, AnonymousClass4FS r15) {
        this.A07 = r6;
        this.A06 = r5;
        this.A0B = r10;
        this.A04 = r3;
        this.A0G = r15;
        this.A05 = r4;
        this.A0C = r11;
        this.A0A = r9;
        this.A0F = r14;
        this.A0D = r12;
        this.A09 = r8;
        this.A0E = r13;
        this.A08 = r7;
    }

    public final void A07(C151667Vu r7, boolean z) {
        ArrayList A0J;
        C626936e.A00();
        if (z) {
            C626936e.A06(r7);
        }
        synchronized (this) {
            HashMap hashMap = this.A0H;
            A0J = AnonymousClass002.A0J(hashMap.entrySet());
            hashMap.clear();
        }
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ManifestManager/serviceCallbacks/Servicing the callback for category : ");
            C18260x0.A1J(A0o, C18310x6.A0q(A0w));
            Iterator it2 = ((AbstractCollection) A0w.getValue()).iterator();
            while (it2.hasNext()) {
                AnonymousClass7WL r2 = (AnonymousClass7WL) it2.next();
                if (z) {
                    r2.A01((C160627o1) r7.A01.get(A0w.getKey()));
                } else {
                    r2.A00();
                }
            }
        }
    }
}
