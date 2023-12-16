package X;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.4Ke  reason: invalid class name and case insensitive filesystem */
public class C86454Ke implements C182538oa {
    public Object A00;
    public Object A01;
    public final int A02;

    public C86454Ke(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.1rn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: X.1rn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: X.1rn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: X.1rn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: X.1rn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: X.2sR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v16, resolved type: X.1rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: X.1rm} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1230 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:940:0x0f76 A[Catch:{ Exception -> 0x032b, all -> 0x1295 }] */
    public final X.C161997qy BkH(X.AnonymousClass7US r75) {
        /*
            r74 = this;
            r1 = r74
            int r0 = r1.A02
            r6 = r75
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x0110;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r1.A00
            X.5If r3 = (X.C102275If) r3
            java.lang.Object r0 = r1.A01
            X.1qP r0 = (X.C32441qP) r0
            X.5Hf r4 = new X.5Hf
            r4.<init>()
            android.net.Uri$Builder r2 = r0.A03(r6)
            java.lang.String r1 = "auth"
            java.lang.String r0 = r6.A01
            android.net.Uri r0 = X.C18290x4.A0H(r2, r1, r0)
            java.lang.String r0 = r0.toString()
            X.2pd r2 = r3.A02     // Catch:{ IOException -> 0x005c }
            java.net.URL r1 = X.C18330xA.A0B(r0)     // Catch:{ IOException -> 0x005c }
            java.lang.String r0 = r6.A06     // Catch:{ IOException -> 0x005c }
            X.4GL r3 = r2.A03(r0, r1)     // Catch:{ IOException -> 0x005c }
            r0 = r3
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x0052 }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x0052 }
            int r2 = r0.getResponseCode()     // Catch:{ all -> 0x0052 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "mediaupload/cancelstreamingupload/got responseCode="
            X.C18260x0.A0w(r0, r1, r2)     // Catch:{ all -> 0x0052 }
            r4.A00 = r2     // Catch:{ all -> 0x0052 }
            r0 = 200(0xc8, float:2.8E-43)
            boolean r0 = X.AnonymousClass000.A1U(r2, r0)
            r4.A01 = r0     // Catch:{ all -> 0x0052 }
            r3.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x0052:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x005c }
        L_0x005b:
            throw r1     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            r1 = move-exception
            java.lang.String r0 = "Error while cancelling upload"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0062:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x006b
            X.7qy r8 = X.C161997qy.A02(r4)
            return r8
        L_0x006b:
            int r0 = r4.A00
            X.7qy r8 = X.C161997qy.A03(r4, r0)
            return r8
        L_0x0072:
            java.lang.Object r4 = r1.A00
            com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r4 = (com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob) r4
            java.lang.Object r5 = r1.A01
            X.3UP r5 = (X.AnonymousClass3UP) r5
            java.lang.String r1 = r4.directPath
            java.lang.String r0 = "\\?"
            java.lang.String[] r1 = r1.split(r0)
            r0 = 0
            r3 = r1[r0]
            android.net.Uri$Builder r2 = r5.A01(r6)
            java.lang.String r1 = r5.A03
            X.C626936e.A06(r1)
            java.lang.String r0 = "token"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            byte[] r0 = r3.getBytes()
            java.lang.String r0 = X.C18320x8.A0i(r0)
            java.lang.String r1 = X.C107575bX.A0A(r0)
            java.lang.String r0 = "d_md"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = "auth"
            java.lang.String r0 = r6.A01
            android.net.Uri r0 = X.C18290x4.A0H(r2, r1, r0)
            java.lang.String r0 = r0.toString()
            X.2pd r2 = r4.A00     // Catch:{ IOException -> 0x0104 }
            java.net.URL r1 = X.C18330xA.A0B(r0)     // Catch:{ IOException -> 0x0104 }
            java.lang.String r0 = r6.A06     // Catch:{ IOException -> 0x0104 }
            X.4GL r3 = r2.A03(r0, r1)     // Catch:{ IOException -> 0x0104 }
            r0 = r3
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x00fa }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x00fa }
            int r2 = r0.getResponseCode()     // Catch:{ all -> 0x00fa }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x00e4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "SendDeleteHistorySyncMmsJob/failed to send DELETE request chunkId="
            r1.append(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r4.chunkId     // Catch:{ all -> 0x00fa }
            r1.append(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = " code="
            X.C18260x0.A0x(r0, r1, r2)     // Catch:{ all -> 0x00fa }
            X.7qy r8 = X.C161997qy.A03(r3, r2)     // Catch:{ all -> 0x00fa }
            goto L_0x00f6
        L_0x00e4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "SendDeleteHistorySyncMmsJob/success chunkId="
            r1.append(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r4.chunkId     // Catch:{ all -> 0x00fa }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x00fa }
            X.7qy r8 = X.C161997qy.A02(r3)     // Catch:{ all -> 0x00fa }
        L_0x00f6:
            r3.close()     // Catch:{ IOException -> 0x0104 }
            return r8
        L_0x00fa:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00ff }
            goto L_0x0103
        L_0x00ff:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0104 }
        L_0x0103:
            throw r1     // Catch:{ IOException -> 0x0104 }
        L_0x0104:
            r1 = move-exception
            java.lang.String r0 = "SendDeleteHistorySyncMmsJob/error while deleting blob"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            X.7qy r8 = X.C161997qy.A00(r0)
            return r8
        L_0x0110:
            java.lang.Object r8 = r1.A00
            X.1I7 r8 = (X.AnonymousClass1I7) r8
            java.lang.Object r0 = r1.A01
            r32 = r0
            r0 = r32
            java.io.File r0 = (java.io.File) r0
            r32 = r0
            X.4FS r14 = r8.A0t
            r0 = 28
            X.C71353by.A01(r14, r8, r6, r0)
            X.2dc r0 = r8.A0e
            r73 = r0
            X.38t r2 = r0.A0A
            java.lang.String r0 = r2.A02
            r72 = r0
            X.2sk r0 = r8.A0d
            r16 = r0
            monitor-enter(r16)
            java.lang.String r4 = r0.A0G     // Catch:{ all -> 0x129a }
            monitor-exit(r16)
            X.3XB r0 = r8.A0I
            r71 = r0
            java.lang.Object r1 = r71.A01()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7 = 1
            r3 = 0
            boolean r1 = X.AnonymousClass000.A1Y(r1, r0)
            r0 = r73
            boolean r0 = r0.A0U
            if (r0 != 0) goto L_0x0155
            r0 = r73
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x0155
            if (r1 == 0) goto L_0x0158
        L_0x0155:
            if (r4 != 0) goto L_0x0158
            r7 = 0
        L_0x0158:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/geturl/url type: "
            r1.append(r0)
            r0 = r73
            int r5 = r0.A03
            if (r5 == 0) goto L_0x0258
            r0 = 2
            if (r5 == r0) goto L_0x0253
            r0 = 3
            if (r5 == r0) goto L_0x024f
            java.lang.String r0 = "Unknown url type"
        L_0x016f:
            r1.append(r0)
            java.lang.String r0 = " filetype="
            r1.append(r0)
            r0 = r72
            r1.append(r0)
            java.lang.String r0 = " key="
            r1.append(r0)
            r0 = r73
            java.lang.String r0 = r0.A0H
            r70 = r0
            X.C18260x0.A1L(r1, r0)
            r1 = 0
            if (r5 == 0) goto L_0x020c
            r0 = 2
            if (r5 == r0) goto L_0x01fc
            r0 = r73
            java.lang.String r0 = r0.A0L
        L_0x0194:
            android.net.Uri r3 = android.net.Uri.parse(r0)
            java.lang.String r0 = r3.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r7 = " url="
            if (r0 == 0) goto L_0x01d3
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "MediaDownload/MMS url attached to message has no host; mediaHash="
            r0 = r70
            X.AnonymousClass001.A1K(r3, r0, r7, r4)
            r0 = r73
            java.lang.String r0 = r0.A0L
            X.C18260x0.A1M(r4, r0)
        L_0x01b6:
            X.57o r0 = X.C996757o.A01
        L_0x01b8:
            android.util.Pair r5 = X.AnonymousClass0x9.A0C(r0, r1)
        L_0x01bc:
            java.lang.Object r4 = r5.first
            X.57o r0 = X.C996757o.A02
            r3 = 8
            if (r4 != r0) goto L_0x025d
            java.lang.String r0 = "MediaDownload/call/got no direct path to download"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.35m r0 = new X.35m
            r0.<init>(r3)
            X.7qy r8 = X.C161997qy.A01(r0)
            return r8
        L_0x01d3:
            java.lang.String r0 = r3.toString()     // Catch:{ MalformedURLException -> 0x01e2 }
            java.net.URL r3 = X.C18330xA.A0B(r0)     // Catch:{ MalformedURLException -> 0x01e2 }
            X.57o r0 = X.C996757o.A03
            android.util.Pair r5 = X.AnonymousClass0x9.A0C(r0, r3)
            goto L_0x01bc
        L_0x01e2:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "MediaDownload/MMS url attached to message is malformed; mediaHash="
            r0 = r70
            X.AnonymousClass001.A1K(r3, r0, r7, r4)
            r0 = r73
            java.lang.String r0 = r0.A0L
            X.C18260x0.A14(r0, r4, r5)
            X.57o r0 = X.C996757o.A01
            android.util.Pair r5 = X.AnonymousClass0x9.A0C(r0, r1)
            goto L_0x01bc
        L_0x01fc:
            r0 = r73
            java.lang.String r4 = r0.A0L
            if (r4 == 0) goto L_0x01b6
            X.3UO r0 = new X.3UO
            r0.<init>(r4)
            java.lang.String r0 = r0.B3m(r6, r3)
            goto L_0x0194
        L_0x020c:
            if (r7 == 0) goto L_0x0216
            if (r4 != 0) goto L_0x0219
            r0 = r73
            java.lang.String r4 = r0.A0F
            if (r4 != 0) goto L_0x0219
        L_0x0216:
            X.57o r0 = X.C996757o.A02
            goto L_0x01b8
        L_0x0219:
            X.2iJ r5 = new X.2iJ
            r5.<init>()
            boolean r0 = X.AnonymousClass36O.A05(r2)
            if (r0 == 0) goto L_0x024a
            r0 = r70
        L_0x0226:
            X.C626936e.A06(r0)
            r5.A08 = r0
            r0 = r72
            r5.A07 = r0
            r5.A04 = r4
            X.1VX r0 = r8.A0T
            r5.A00 = r0
            int r0 = r8.A12
            if (r0 != 0) goto L_0x0247
            java.lang.String r0 = "manual"
        L_0x023b:
            r5.A05 = r0
            X.1qO r0 = r5.A00()
            java.lang.String r0 = r0.B3m(r6, r3)
            goto L_0x0194
        L_0x0247:
            java.lang.String r0 = "auto"
            goto L_0x023b
        L_0x024a:
            r0 = r73
            java.lang.String r0 = r0.A0G
            goto L_0x0226
        L_0x024f:
            java.lang.String r0 = "express_path_url"
            goto L_0x016f
        L_0x0253:
            java.lang.String r0 = "static_url"
            goto L_0x016f
        L_0x0258:
            java.lang.String r0 = "mms4_url"
            goto L_0x016f
        L_0x025d:
            X.57o r0 = X.C996757o.A01
            if (r4 != r0) goto L_0x0270
            java.lang.String r0 = "MediaDownload/call/got bad url"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.35m r0 = new X.35m
            r0.<init>(r3)
            X.7qy r8 = X.C161997qy.A00(r0)
            return r8
        L_0x0270:
            java.lang.Object r4 = r5.second
            java.net.URL r4 = (java.net.URL) r4
            r8.A05 = r4
            X.2sf r0 = r8.A0h
            r69 = r0
            r0.A0c = r4
            int r0 = r6.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = r69
            r0.A0P = r3
            java.lang.String r3 = r6.A04
            r0.A0X = r3
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x02ad
            java.lang.String r3 = r6.A06
        L_0x0290:
            r0 = r69
            r0.A0Z = r3
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/call/download with url = "
            X.C18260x0.A1R(r3, r0, r4)
            java.io.File r0 = r8.A03
            long r27 = r0.length()
            java.io.File r0 = r8.A03
            r20 = r0
            java.net.URL r0 = r8.A05
            r68 = r0
            r0 = 7
            goto L_0x02af
        L_0x02ad:
            r3 = 0
            goto L_0x0290
        L_0x02af:
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x1295 }
            r0 = r73
            boolean r0 = r0.A0S     // Catch:{ all -> 0x1295 }
            if (r0 != 0) goto L_0x030e
            boolean r0 = X.AnonymousClass36O.A05(r2)     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x02bf
            goto L_0x02c4
        L_0x02bf:
            r0 = r73
            java.lang.String r0 = r0.A0G     // Catch:{ all -> 0x1295 }
            goto L_0x02c6
        L_0x02c4:
            r0 = r70
        L_0x02c6:
            if (r0 != 0) goto L_0x02d1
            r0 = 28
            X.35m r9 = new X.35m     // Catch:{ all -> 0x1295 }
            r9.<init>(r0)     // Catch:{ all -> 0x1295 }
            goto L_0x1125
        L_0x02d1:
            int r0 = r8.A07     // Catch:{ all -> 0x1295 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1295 }
            r0 = r69
            r0.A0Q = r1     // Catch:{ all -> 0x1295 }
            r0 = r73
            int r0 = r0.A05     // Catch:{ all -> 0x1295 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1295 }
            r0 = r69
            r0.A0R = r1     // Catch:{ all -> 0x1295 }
            int r0 = r8.A12     // Catch:{ all -> 0x1295 }
            r3 = 0
            r2 = 2
            boolean r1 = X.AnonymousClass000.A1U(r0, r2)
            X.1g3 r0 = r8.A09(r1)     // Catch:{ all -> 0x1295 }
            X.7E5 r0 = r0.A02()     // Catch:{ all -> 0x1295 }
            X.35m r9 = r0.A00     // Catch:{ all -> 0x1295 }
            if (r1 == 0) goto L_0x1125
            r8.A0B()     // Catch:{ all -> 0x1295 }
            int r0 = r8.A12     // Catch:{ all -> 0x1295 }
            if (r0 == r2) goto L_0x1125
            X.1g3 r0 = r8.A09(r3)     // Catch:{ all -> 0x1295 }
            X.7E5 r0 = r0.A02()     // Catch:{ all -> 0x1295 }
            X.35m r9 = r0.A00     // Catch:{ all -> 0x1295 }
            goto L_0x1125
        L_0x030e:
            r0 = r73
            int r3 = r0.A02     // Catch:{ all -> 0x1295 }
            r0 = 3
            if (r3 == r0) goto L_0x0318
            r0 = 2
            if (r3 != r0) goto L_0x109d
        L_0x0318:
            monitor-enter(r16)     // Catch:{ all -> 0x1295 }
            r0 = r16
            boolean r0 = r0.A0J     // Catch:{ all -> 0x1292 }
            monitor-exit(r16)     // Catch:{ all -> 0x1295 }
            if (r0 != 0) goto L_0x109d
            r0 = r73
            java.util.concurrent.Callable r0 = r0.A0N     // Catch:{ Exception -> 0x032b }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x032b }
            X.2Lt r0 = (X.C41832Lt) r0     // Catch:{ Exception -> 0x032b }
            goto L_0x0331
        L_0x032b:
            java.lang.String r0 = "failed to get streaming sidecar"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1295 }
            r0 = 0
        L_0x0331:
            java.lang.String r37 = "; url="
            if (r0 == 0) goto L_0x0347
            byte[] r13 = r0.A00     // Catch:{ all -> 0x1295 }
            if (r13 == 0) goto L_0x0347
            boolean r3 = X.AnonymousClass36O.A07(r2)     // Catch:{ all -> 0x1295 }
            if (r3 != 0) goto L_0x0368
            X.38t r3 = X.C633138t.A0f     // Catch:{ all -> 0x1295 }
            if (r2 == r3) goto L_0x0368
            int[] r2 = r0.A01     // Catch:{ all -> 0x1295 }
            if (r2 != 0) goto L_0x0368
        L_0x0347:
            r4 = 1
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1295 }
            java.lang.String r0 = "MediaDownload/MMS download failed because sidecar not found; mediaHash="
            r3.append(r0)     // Catch:{ all -> 0x1295 }
            r0 = r70
            r3.append(r0)     // Catch:{ all -> 0x1295 }
            r2 = r37
            r0 = r68
            X.C18260x0.A1S(r3, r2, r0)     // Catch:{ all -> 0x1295 }
            r16.A06()     // Catch:{ all -> 0x1295 }
            r0 = 30
            X.35m r9 = X.C625435m.A00(r1, r0, r4)     // Catch:{ all -> 0x1295 }
            goto L_0x1125
        L_0x0368:
            r1 = r73
            java.io.File r1 = r1.A0D     // Catch:{ all -> 0x1295 }
            r38 = r1
            X.2sU r1 = r8.A0o     // Catch:{ all -> 0x1295 }
            r17 = r1
            java.io.File r29 = r17.A03()     // Catch:{ all -> 0x1295 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1295 }
            X.C626936e.A06(r70)     // Catch:{ all -> 0x1295 }
            r1 = r70
            X.AnonymousClass0x2.A1M(r2, r1)     // Catch:{ all -> 0x1295 }
            java.lang.String r1 = ".chk.tmp"
            java.lang.String r2 = X.AnonymousClass000.A0X(r1, r2)     // Catch:{ all -> 0x1295 }
            X.3Dh r1 = r8.A0B     // Catch:{ all -> 0x1295 }
            r67 = r1
            java.io.File r61 = X.C64393Dh.A00(r1, r2)     // Catch:{ all -> 0x1295 }
            if (r38 == 0) goto L_0x107a
            if (r29 == 0) goto L_0x107a
            r8.A08()     // Catch:{ all -> 0x1295 }
            X.2oU r1 = r8.A0O     // Catch:{ all -> 0x1295 }
            r18 = r1
            X.2sH r1 = r8.A0N     // Catch:{ all -> 0x1295 }
            r15 = r1
            com.whatsapp.Mp4Ops r14 = r8.A0D     // Catch:{ all -> 0x1295 }
            X.1VX r1 = r8.A0T     // Catch:{ all -> 0x1295 }
            r66 = r1
            X.2qk r12 = r8.A0A     // Catch:{ all -> 0x1295 }
            X.2s4 r11 = r8.A0E     // Catch:{ all -> 0x1295 }
            X.2zf r10 = r8.A0P     // Catch:{ all -> 0x1295 }
            X.2zJ r9 = r8.A0Q     // Catch:{ all -> 0x1295 }
            X.7bG r7 = r8.A0F     // Catch:{ all -> 0x1295 }
            X.36E r5 = r8.A0C     // Catch:{ all -> 0x1295 }
            X.2qZ r4 = r8.A0c     // Catch:{ all -> 0x1295 }
            X.2wP r3 = r8.A0r     // Catch:{ all -> 0x1295 }
            int[] r1 = r0.A01     // Catch:{ all -> 0x1295 }
            X.2pd r0 = r8.A0V     // Catch:{ all -> 0x1295 }
            X.2cG r2 = r8.A0A()     // Catch:{ all -> 0x1295 }
            java.lang.String r62 = r2.A00()     // Catch:{ all -> 0x1295 }
            X.2rE r2 = new X.2rE     // Catch:{ all -> 0x1295 }
            r39 = r2
            r40 = r12
            r41 = r67
            r42 = r5
            r43 = r14
            r44 = r11
            r45 = r7
            r46 = r15
            r47 = r18
            r48 = r10
            r49 = r9
            r50 = r66
            r51 = r0
            r52 = r4
            r53 = r8
            r54 = r16
            r55 = r73
            r56 = r6
            r57 = r17
            r58 = r3
            r59 = r38
            r60 = r29
            r63 = r68
            r64 = r13
            r65 = r1
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)     // Catch:{ all -> 0x1295 }
            X.3Un r1 = new X.3Un     // Catch:{ all -> 0x1295 }
            r1.<init>(r8)     // Catch:{ all -> 0x1295 }
            r0 = r17
            r0.A08(r1)     // Catch:{ all -> 0x1295 }
            java.lang.String r30 = "rw"
            java.io.File r0 = r2.A0R     // Catch:{ IOException -> 0x0f51 }
            r31 = r0
            boolean r0 = r31.exists()     // Catch:{ IOException -> 0x0f51 }
            if (r0 != 0) goto L_0x0411
            r31.createNewFile()     // Catch:{ IOException -> 0x0f51 }
        L_0x0411:
            java.io.File r0 = r2.A0Q     // Catch:{ IOException -> 0x0f51 }
            r65 = r0
            boolean r0 = r65.exists()     // Catch:{ IOException -> 0x0f51 }
            if (r0 != 0) goto L_0x041e
            r65.createNewFile()     // Catch:{ IOException -> 0x0f51 }
        L_0x041e:
            X.1I7 r0 = r2.A0J     // Catch:{ all -> 0x1295 }
            r64 = r0
            boolean r0 = r0.A06     // Catch:{ all -> 0x1295 }
            r20 = 1
            r21 = 2
            if (r0 == 0) goto L_0x04af
            r0 = r64
            int r1 = r0.A12     // Catch:{ all -> 0x1295 }
            r0 = r20
            if (r1 == r0) goto L_0x0439
            r0 = r64
            int r1 = r0.A12     // Catch:{ all -> 0x1295 }
            r0 = 3
            if (r1 != r0) goto L_0x0472
        L_0x0439:
            X.2qZ r9 = r2.A0I     // Catch:{ all -> 0x1295 }
            X.2dc r3 = r2.A0L     // Catch:{ all -> 0x1295 }
            X.38t r7 = r3.A0A     // Catch:{ all -> 0x1295 }
            long r0 = r3.A07     // Catch:{ all -> 0x1295 }
            boolean r4 = r3.A0R     // Catch:{ all -> 0x1295 }
            if (r4 != 0) goto L_0x044b
            int r4 = r3.A00     // Catch:{ all -> 0x1295 }
            r45 = 0
            if (r4 <= 0) goto L_0x044d
        L_0x044b:
            r45 = 1
        L_0x044d:
            int r6 = r3.A04     // Catch:{ all -> 0x1295 }
            boolean r5 = r3.A0Y     // Catch:{ all -> 0x1295 }
            boolean r4 = r3.A0X     // Catch:{ all -> 0x1295 }
            boolean r3 = r3.A0T     // Catch:{ all -> 0x1295 }
            r44 = 0
            r39 = r9
            r40 = r7
            r41 = r6
            r42 = r0
            r46 = r5
            r47 = r4
            r48 = r3
            boolean r0 = r39.A02(r40, r41, r42, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x1295 }
            if (r0 != 0) goto L_0x0472
            java.lang.String r0 = "StreamMediaDownloadHandler/cancel/not network safe"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1295 }
            goto L_0x0d9d
        L_0x0472:
            r0 = r64
            int r1 = r0.A12     // Catch:{ all -> 0x1295 }
            r0 = r21
            if (r1 != r0) goto L_0x04af
            X.2qZ r4 = r2.A0I     // Catch:{ all -> 0x1295 }
            X.2dc r0 = r2.A0L     // Catch:{ all -> 0x1295 }
            r3 = 0
            X.1ip r1 = r4.A02     // Catch:{ all -> 0x1295 }
            int r42 = r1.A08(r3)     // Catch:{ all -> 0x1295 }
            X.38t r3 = r0.A0A     // Catch:{ all -> 0x1295 }
            int r5 = r0.A02     // Catch:{ all -> 0x1295 }
            r1 = 3
            if (r5 == r1) goto L_0x0492
            r46 = 0
            r1 = r21
            if (r5 != r1) goto L_0x0494
        L_0x0492:
            r46 = 1
        L_0x0494:
            r44 = 0
            int r1 = r0.A00     // Catch:{ all -> 0x1295 }
            X.4uZ r0 = r0.A08     // Catch:{ all -> 0x1295 }
            r39 = r4
            r40 = r0
            r41 = r3
            r43 = r1
            boolean r0 = r39.A01(r40, r41, r42, r43, r44, r46)     // Catch:{ all -> 0x1295 }
            if (r0 != 0) goto L_0x04af
            java.lang.String r0 = "StreamMediaDownloadHandler/cancel/prefetching not network safe"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1295 }
            goto L_0x0d7c
        L_0x04af:
            X.2dc r0 = r2.A0L     // Catch:{ all -> 0x1295 }
            r63 = r0
            int r0 = r0.A02     // Catch:{ all -> 0x1295 }
            r62 = r0
            r1 = r0
            r0 = r21
            if (r1 != r0) goto L_0x04dd
            X.2oU r5 = r2.A0C     // Catch:{ all -> 0x1295 }
            com.whatsapp.Mp4Ops r4 = r2.A08     // Catch:{ all -> 0x1295 }
            X.2qk r3 = r2.A05     // Catch:{ all -> 0x1295 }
            X.7bG r1 = r2.A0A     // Catch:{ all -> 0x1295 }
            X.2sU r0 = r2.A0N     // Catch:{ all -> 0x1295 }
            long r45 = r0.A01()     // Catch:{ all -> 0x1295 }
            X.7jb r0 = new X.7jb     // Catch:{ all -> 0x1295 }
            r39 = r0
            r40 = r3
            r41 = r4
            r42 = r1
            r43 = r5
            r44 = r65
            r39.<init>(r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x1295 }
            r2.A01 = r0     // Catch:{ all -> 0x1295 }
        L_0x04dd:
            long r5 = r65.length()     // Catch:{ all -> 0x1295 }
            java.lang.String r36 = "StreamMediaDownloadHandler/prefetch/stopped, reached max bytes"
            r24 = 0
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0581
            java.io.File r11 = r2.A0P     // Catch:{ all -> 0x1295 }
            boolean r0 = r11.exists()     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x0581
            java.lang.String r0 = "StreamMediaDownloadHandler/attempt restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1295 }
            r1 = 3
            r0 = r62
            if (r0 != r1) goto L_0x04fe
            goto L_0x0563
        L_0x04fe:
            r1 = r0
            r0 = r21
            if (r1 != r0) goto L_0x0560
            java.io.BufferedInputStream r1 = X.AnonymousClass0x7.A0c(r11)     // Catch:{ IOException -> 0x0556 }
            java.io.DataInputStream r15 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0556 }
            r15.<init>(r1)     // Catch:{ IOException -> 0x0556 }
            long r13 = r15.readLong()     // Catch:{ all -> 0x054c }
            long r5 = r15.readLong()     // Catch:{ all -> 0x054c }
            int r7 = r15.readInt()     // Catch:{ all -> 0x054c }
            double r9 = (double) r13     // Catch:{ all -> 0x054c }
            double r0 = (double) r5     // Catch:{ all -> 0x054c }
            double r9 = r9 / r0
            double r0 = java.lang.Math.ceil(r9)     // Catch:{ all -> 0x054c }
            int r9 = (int) r0     // Catch:{ all -> 0x054c }
            if (r7 == r9) goto L_0x052b
            java.lang.String r0 = "ChunkStore/count didnt match, aborting"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x054c }
            r15.close()     // Catch:{ IOException -> 0x0556 }
            goto L_0x0560
        L_0x052b:
            int[] r1 = new int[r7]     // Catch:{ all -> 0x054c }
            r0 = 0
        L_0x052e:
            if (r0 >= r7) goto L_0x0539
            int r9 = r15.readInt()     // Catch:{ all -> 0x054c }
            r1[r0] = r9     // Catch:{ all -> 0x054c }
            int r0 = r0 + 1
            goto L_0x052e
        L_0x0539:
            X.1rm r12 = new X.1rm     // Catch:{ all -> 0x054c }
            r39 = r12
            r40 = r1
            r41 = r7
            r42 = r13
            r44 = r5
            r39.<init>(r40, r41, r42, r44)     // Catch:{ all -> 0x054c }
            r15.close()     // Catch:{ IOException -> 0x0556 }
            goto L_0x056c
        L_0x054c:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0551 }
            goto L_0x0555
        L_0x0551:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0556 }
        L_0x0555:
            throw r1     // Catch:{ IOException -> 0x0556 }
        L_0x0556:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1295 }
            java.lang.String r0 = "ChunkStore/chunk object not found: "
            X.C18260x0.A0k(r11, r0, r1, r5)     // Catch:{ all -> 0x1295 }
        L_0x0560:
            r12 = r24
            goto L_0x056c
        L_0x0563:
            int[] r0 = r2.A0V     // Catch:{ all -> 0x1295 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x1295 }
            X.2sR r12 = X.C32861rn.A00(r11, r0)     // Catch:{ all -> 0x1295 }
        L_0x056c:
            X.C626936e.A06(r12)     // Catch:{ all -> 0x1295 }
            long r0 = r12.A03()     // Catch:{ all -> 0x1295 }
            boolean r0 = r2.A02(r0)     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x0583
            r2.A01()     // Catch:{ all -> 0x1295 }
            com.whatsapp.util.Log.i((java.lang.String) r36)     // Catch:{ all -> 0x1295 }
            goto L_0x0d7c
        L_0x0581:
            r12 = r24
        L_0x0583:
            X.2sU r7 = r2.A0N     // Catch:{ all -> 0x1295 }
            r0 = 0
            r7.A05(r0)     // Catch:{ all -> 0x1295 }
            if (r12 == 0) goto L_0x0597
            long r9 = r31.length()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            long r5 = r12.A03()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x06c9
        L_0x0597:
            java.io.File r9 = r2.A0P     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            boolean r0 = r9.exists()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r0 == 0) goto L_0x06c7
            int[] r5 = r2.A0V     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r5 == 0) goto L_0x06c7
            r0 = r63
            boolean r0 = r0.A0P     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r0 == 0) goto L_0x06c7
            r1 = 3
            r0 = r62
            if (r0 != r1) goto L_0x06c7
            X.2wP r6 = r2.A0O     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            r0 = r63
            X.7YG r1 = r0.A09     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            boolean r0 = r0.A0Y     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r1 == 0) goto L_0x06c7
            X.2r1 r6 = r6.A00     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            boolean r0 = r6.A03(r1, r0)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r0 == 0) goto L_0x06c7
            X.1VX r6 = r2.A0G     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            r1 = 4169(0x1049, float:5.842E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            boolean r0 = r6.A0Y(r0, r1)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r0 == 0) goto L_0x06c7
            X.2sR r0 = X.C32861rn.A00(r9, r5)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r0 == 0) goto L_0x06c7
            long r0 = r0.A01     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            X.C626936e.A06(r5)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.util.List r11 = X.C100395At.A00(r6, r5)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            X.1rn r10 = new X.1rn     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            r6 = r24
            r10.<init>(r11, r6, r0)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            r12 = r10
            r0 = r63
            java.io.File r14 = r0.A0E     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            X.2qk r13 = r2.A05     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            X.2Na r11 = r2.A0F     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.lang.String r15 = "StreamMediaDownloadHandler/encryptSavedImage failed to write to encrypted file "
            r6 = 0
            r0 = 4
            X.C162457s7.A0J(r13, r0)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.lang.String r0 = "StreamMediaDownloadHandler/encryptSavedImage re-encrypt partially saved mid-scan image"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r14 == 0) goto L_0x06c9
            boolean r1 = r14.exists()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            r0 = r20
            if (r1 != r0) goto L_0x06c9
            long r18 = r31.length()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x06c9
            long r18 = r65.length()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x06c9
            r1 = r5[r6]     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            r0 = r5[r20]     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            int r1 = r1 + r0
            r0 = r5[r21]     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            int r1 = r1 + r0
            int r0 = r1 % 16
            int r1 = r1 - r0
            long r0 = (long) r1     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.io.FileInputStream r10 = X.C107655bf.A0T(r13, r14)     // Catch:{ IOException -> 0x0696 }
            X.6uL r6 = new X.6uL     // Catch:{ all -> 0x068f }
            r6.<init>(r10, r0)     // Catch:{ all -> 0x068f }
            r5 = r65
            X.C627536m.A0R(r5, r6)     // Catch:{ all -> 0x0688 }
            r6.close()     // Catch:{ all -> 0x068f }
            r10.close()     // Catch:{ IOException -> 0x0696 }
            java.io.FileInputStream r10 = X.C107655bf.A0T(r13, r14)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x06a5 }
            X.1zx r6 = new X.1zx     // Catch:{ all -> 0x0681 }
            r6.<init>(r11, r10)     // Catch:{ all -> 0x0681 }
            java.security.MessageDigest r5 = X.AnonymousClass0x7.A0t()     // Catch:{ all -> 0x067a }
            X.C162457s7.A0D(r5)     // Catch:{ all -> 0x067a }
            X.6tY r11 = new X.6tY     // Catch:{ all -> 0x067a }
            r11.<init>(r6, r5)     // Catch:{ all -> 0x067a }
            r5 = r31
            X.C627536m.A0R(r5, r11)     // Catch:{ all -> 0x0673 }
            A01(r5, r0)     // Catch:{ all -> 0x0673 }
            r11.close()     // Catch:{ all -> 0x067a }
            r6.close()     // Catch:{ all -> 0x0681 }
            r10.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x06a5 }
            long r42 = r31.length()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            r39 = r12
            r40 = r3
            r44 = r20
            java.util.List r0 = r39.A07(r40, r42, r44)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            boolean r0 = r0.isEmpty()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            if (r0 != 0) goto L_0x06c9
            r12.A08(r9)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            goto L_0x06c9
        L_0x0673:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0675 }
        L_0x0675:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r11, r0)     // Catch:{ all -> 0x067a }
            throw r1     // Catch:{ all -> 0x067a }
        L_0x067a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x067c }
        L_0x067c:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r6, r0)     // Catch:{ all -> 0x0681 }
            throw r1     // Catch:{ all -> 0x0681 }
        L_0x0681:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0683 }
        L_0x0683:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r10, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x06a5 }
            throw r1     // Catch:{ IOException | NoSuchAlgorithmException -> 0x06a5 }
        L_0x0688:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x068a }
        L_0x068a:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r6, r0)     // Catch:{ all -> 0x068f }
            throw r1     // Catch:{ all -> 0x068f }
        L_0x068f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0691 }
        L_0x0691:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r10, r0)     // Catch:{ IOException -> 0x0696 }
            throw r1     // Catch:{ IOException -> 0x0696 }
        L_0x0696:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.lang.String r0 = "StreamMediaDownloadHandler/encryptSavedImage failed to write decrypted file "
            r1.append(r0)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.lang.String r0 = r5.getMessage()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            goto L_0x06ae
        L_0x06a5:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.lang.String r0 = r0.getMessage()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
        L_0x06ae:
            X.C18260x0.A1M(r1, r0)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            r0 = r31
            A01(r0, r3)     // Catch:{ IOException -> 0x06bc }
            r0 = r65
            A01(r0, r3)     // Catch:{ IOException -> 0x06bc }
            goto L_0x06c9
        L_0x06bc:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            java.lang.String r0 = "StreamMediaDownloadHandler/reset failed to reset file"
            X.C18260x0.A17(r0, r1, r5)     // Catch:{ 59d -> 0x0eda, all -> 0x0ecb }
            goto L_0x06c9
        L_0x06c7:
            if (r12 == 0) goto L_0x0759
        L_0x06c9:
            long r9 = r31.length()     // Catch:{ 59d -> 0x0ebf, all -> 0x0ecb }
            long r5 = r12.A03()     // Catch:{ 59d -> 0x0ebf, all -> 0x0ecb }
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0759
            r46 = 0
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 59d -> 0x0756, all -> 0x0ecb }
            java.lang.String r0 = "StreamMediaDownloadHandler/restore succeeded, downloaded_bytes="
            r5.append(r0)     // Catch:{ 59d -> 0x0756, all -> 0x0ecb }
            long r0 = r12.A03()     // Catch:{ 59d -> 0x0756, all -> 0x0ecb }
            X.C18260x0.A1I(r5, r0)     // Catch:{ 59d -> 0x0756, all -> 0x0ecb }
            java.io.File r0 = r2.A0P     // Catch:{ 59d -> 0x0756, all -> 0x0ecb }
            r60 = r0
            monitor-enter(r7)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            r7.A08 = r0     // Catch:{ all -> 0x0750 }
            long r0 = r12.A01     // Catch:{ all -> 0x0750 }
            r22 = r0
            r7.A03 = r0     // Catch:{ all -> 0x0750 }
            r7.A07 = r12     // Catch:{ all -> 0x0750 }
            monitor-exit(r7)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            long r0 = r12.A06(r3)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            long r5 = r12.A03()     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            monitor-enter(r7)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            r7.A05 = r5     // Catch:{ all -> 0x074d }
            monitor-exit(r7)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            long r5 = r12.A03()     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            r7.A07(r5, r3)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x073e
            java.net.URL r3 = r2.A0T     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            r61 = r3
            int r3 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r3 >= 0) goto L_0x0730
            int r4 = r12.A02(r0)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
        L_0x071a:
            int r4 = r4 + 1
            int r3 = r12.A00     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            if (r4 >= r3) goto L_0x0729
            long r9 = r12.A05(r4)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            int r5 = (r9 > r46 ? 1 : (r9 == r46 ? 0 : -1))
            if (r5 != 0) goto L_0x0729
            goto L_0x071a
        L_0x0729:
            if (r4 == r3) goto L_0x0730
            long r43 = r12.A04(r4)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            goto L_0x0732
        L_0x0730:
            r43 = -1
        L_0x0732:
            r39 = r2
            r40 = r61
            r41 = r0
            X.4GL r14 = r39.A00(r40, r41, r43)     // Catch:{ 59d -> 0x0ec1, all -> 0x0ecb }
            goto L_0x07c5
        L_0x073e:
            java.net.URL r3 = r2.A0T     // Catch:{ 59d -> 0x0ec1, all -> 0x0ecb }
            r61 = r3
            r48 = -1
            r44 = r2
            r45 = r3
            X.4GL r14 = r44.A00(r45, r46, r48)     // Catch:{ 59d -> 0x0ec1, all -> 0x0ecb }
            goto L_0x07c5
        L_0x074d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            throw r0     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
        L_0x0750:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
            throw r0     // Catch:{ 59d -> 0x0753, all -> 0x0ecb }
        L_0x0753:
            r1 = move-exception
            goto L_0x0ec2
        L_0x0756:
            r1 = move-exception
            goto L_0x0ec2
        L_0x0759:
            java.net.URL r0 = r2.A0T     // Catch:{ 59d -> 0x0eaf, all -> 0x0ecb }
            r61 = r0
            r46 = 0
            r43 = -1
            r39 = r2
            r40 = r0
            r41 = r3
            X.4GL r14 = r39.A00(r40, r41, r43)     // Catch:{ 59d -> 0x0eb1, all -> 0x0ecb }
            r0 = r14
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            int r0 = r0.getContentLength()     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            long r0 = (long) r0     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            r22 = r0
            r1 = 3
            r0 = r62
            if (r0 != r1) goto L_0x0794
            int[] r1 = r2.A0V     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            X.C626936e.A06(r1)     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            java.util.List r4 = X.C100395At.A00(r0, r1)     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            X.1rn r3 = new X.1rn     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            r5 = r24
            r0 = r22
            r3.<init>(r4, r5, r0)     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            r12 = r3
            goto L_0x07b5
        L_0x0794:
            r1 = r0
            r0 = r21
            if (r1 != r0) goto L_0x07b5
            r5 = 65536(0x10000, double:3.2379E-319)
            r0 = r22
            double r3 = (double) r0     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            double r0 = (double) r5     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            double r3 = r3 / r0
            double r0 = java.lang.Math.ceil(r3)     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            int r3 = (int) r0     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            X.1rm r39 = new X.1rm     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            r40 = r24
            r41 = r3
            r42 = r22
            r44 = r5
            r39.<init>(r40, r41, r42, r44)     // Catch:{ 59d -> 0x0eb7, all -> 0x0ed1 }
            r12 = r39
        L_0x07b5:
            java.io.File r0 = r2.A0P     // Catch:{ 59d -> 0x0ee0, all -> 0x0ed1 }
            r60 = r0
            monitor-enter(r7)     // Catch:{ 59d -> 0x0ee0, all -> 0x0ed1 }
            r7.A08 = r0     // Catch:{ all -> 0x0eac }
            long r0 = r12.A01     // Catch:{ all -> 0x0eac }
            r7.A03 = r0     // Catch:{ all -> 0x0eac }
            r7.A07 = r12     // Catch:{ all -> 0x0eac }
            monitor-exit(r7)     // Catch:{ 59d -> 0x0ee0, all -> 0x0ed1 }
            r0 = 0
        L_0x07c5:
            r3 = r20
            r7.A05(r3)     // Catch:{ 59d -> 0x0eaa, all -> 0x0ed1 }
            java.lang.String r5 = "r"
            X.204 r35 = new X.204     // Catch:{ IOException -> 0x0e80, NoSuchAlgorithmException -> 0x0e82 }
            r4 = r35
            r3 = r31
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x0e80, NoSuchAlgorithmException -> 0x0e82 }
            X.204 r34 = new X.204     // Catch:{ IOException -> 0x0e7a, NoSuchAlgorithmException -> 0x0e7c, 59d -> 0x0e74, all -> 0x0e6d }
            r5 = r34
            r4 = r65
            r3 = r30
            r5.<init>(r4, r3)     // Catch:{ IOException -> 0x0e7a, NoSuchAlgorithmException -> 0x0e7c, 59d -> 0x0e74, all -> 0x0e6d }
            byte[] r3 = r2.A0U     // Catch:{ IOException -> 0x0e6b, NoSuchAlgorithmException -> 0x0e69 }
            r48 = r3
            X.2Na r3 = r2.A0F     // Catch:{ IOException -> 0x0e6b, NoSuchAlgorithmException -> 0x0e69 }
            r45 = r3
            r3 = 10
            long r50 = r22 - r3
            X.2zf r3 = r2.A0D     // Catch:{ 6yi -> 0x0e59 }
            long r20 = r3.A02()     // Catch:{ 6yi -> 0x0e59 }
            X.1VX r3 = r2.A0G     // Catch:{ 6yi -> 0x0e59 }
            long r18 = X.C56952sp.A03(r3)     // Catch:{ 6yi -> 0x0e59 }
            r9 = 2
            long r4 = r22 * r9
            long r4 = r4 + r18
            int r3 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0e4e
            X.C626936e.A06(r12)     // Catch:{ 59d -> 0x0e67, all -> 0x0e65 }
            long r25 = r12.A03()     // Catch:{ 59d -> 0x0e67, all -> 0x0e65 }
            java.io.RandomAccessFile r15 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0e45 }
            r4 = r31
            r3 = r30
            r15.<init>(r4, r3)     // Catch:{ FileNotFoundException -> 0x0e45 }
            java.lang.String r33 = "StreamMediaDownloadHandler/failed to open url connection input stream"
            int r3 = (r0 > r46 ? 1 : (r0 == r46 ? 0 : -1))
            if (r3 < 0) goto L_0x0879
            r15.seek(r0)     // Catch:{ IOException -> 0x086b }
            r3 = r14
            X.3PZ r3 = (X.AnonymousClass3PZ) r3     // Catch:{ IOException -> 0x0855 }
            java.net.HttpURLConnection r4 = r3.A01     // Catch:{ IOException -> 0x0855 }
            int r3 = r4.getResponseCode()     // Catch:{ IOException -> 0x0855 }
            java.lang.Long r3 = X.AnonymousClass0x9.A0m(r3)     // Catch:{ IOException -> 0x0855 }
            monitor-enter(r7)     // Catch:{ IOException -> 0x0855 }
            r7.A09 = r3     // Catch:{ all -> 0x0852 }
            monitor-exit(r7)     // Catch:{ IOException -> 0x0855 }
            java.lang.String r3 = "x-fb-application-protocol"
            java.lang.String r3 = r4.getHeaderField(r3)     // Catch:{ IOException -> 0x0855 }
            monitor-enter(r7)     // Catch:{ IOException -> 0x0855 }
            r7.A0A = r3     // Catch:{ all -> 0x084f }
            monitor-exit(r7)     // Catch:{ IOException -> 0x0855 }
            X.2s4 r5 = r2.A09     // Catch:{ IOException -> 0x0855 }
            r3 = r63
            boolean r3 = r3.A0Y     // Catch:{ IOException -> 0x0855 }
            int r3 = X.AnonymousClass0x9.A00(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0855 }
            java.lang.Integer r3 = X.C18290x4.A0Z()     // Catch:{ IOException -> 0x0855 }
            java.io.InputStream r24 = r14.B47(r5, r4, r3)     // Catch:{ IOException -> 0x0855 }
            goto L_0x0879
        L_0x084f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0855 }
            throw r0     // Catch:{ IOException -> 0x0855 }
        L_0x0852:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0855 }
            throw r0     // Catch:{ IOException -> 0x0855 }
        L_0x0855:
            r0 = move-exception
            r2.A02 = r0     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            com.whatsapp.util.Log.w((java.lang.String) r33)     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            X.C624535b.A03(r15)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r14)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r35)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r34)     // Catch:{ all -> 0x1295 }
            r3 = 18
            goto L_0x0f6b
        L_0x086b:
            r3 = move-exception
            r2.A02 = r3     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            java.lang.String r3 = "StreamMediaDownloadHandler/failed to seek to position="
            X.C18270x1.A1B(r3, r4, r0)     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            goto L_0x0e8f
        L_0x0879:
            long r30 = android.os.SystemClock.elapsedRealtime()     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            r58 = r3
            r20 = r25
            goto L_0x0887
        L_0x0886:
            r0 = r3
        L_0x0887:
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0c7a
            r5 = 0
            r6 = 8192(0x2000, float:1.14794E-41)
            r59 = r24
            r4 = r58
            r3 = r24
            int r4 = r3.read(r4, r5, r6)     // Catch:{ IOException -> 0x0db6 }
        L_0x089a:
            if (r4 < 0) goto L_0x0c62
            r3 = r58
            r15.write(r3, r5, r4)     // Catch:{ IOException -> 0x0e0b }
            java.io.FileDescriptor r3 = r15.getFD()     // Catch:{ IOException -> 0x0e0b }
            r3.sync()     // Catch:{ IOException -> 0x0e0b }
            long r3 = (long) r4     // Catch:{ IOException -> 0x0e0b }
            r18 = r3
            r39 = r12
            r40 = r0
            r42 = r3
            r44 = r5
            java.util.List r44 = r39.A07(r40, r42, r44)     // Catch:{ IOException -> 0x0e0b }
            boolean r3 = r44.isEmpty()     // Catch:{ IOException -> 0x0e0b }
            if (r3 != 0) goto L_0x0968
            java.util.Iterator r13 = r44.iterator()     // Catch:{ IOException -> 0x0e0b }
        L_0x08c1:
            boolean r3 = r13.hasNext()     // Catch:{ IOException -> 0x0e0b }
            if (r3 == 0) goto L_0x0968
            java.lang.Object r11 = r13.next()     // Catch:{ IOException -> 0x0e0b }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ IOException -> 0x0e0b }
            int r9 = r11.intValue()     // Catch:{ 6yf -> 0x0d3a, 6yj -> 0x0d1f }
            long r5 = r12.A04(r9)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            int r3 = r12.A01(r9)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            long r3 = (long) r3     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r41 = r3
            r3 = r34
            r3.seek(r5)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r3 = 0
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x08eb
            r39 = 16
            long r3 = r5 - r39
        L_0x08eb:
            r10 = r35
            r10.seek(r3)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            X.6uG r4 = new X.6uG     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r4.<init>(r2, r10)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            X.6uS r3 = new X.6uS     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r10 = r34
            r3.<init>(r2, r10)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            int r49 = r9 * 10
            r46 = r4
            r47 = r3
            r52 = r5
            r54 = r41
            X.C380925o.A00(r45, r46, r47, r48, r49, r50, r52, r54)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            java.io.FileDescriptor r3 = r34.getFD()     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r3.sync()     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r4 = 2
            r3 = r62
            if (r3 != r4) goto L_0x08c1
            X.7jb r3 = r2.A01     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            X.C626936e.A06(r3)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            int r3 = r3.A00     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            if (r3 != 0) goto L_0x08c1
            X.7jb r9 = r2.A01     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r3 = 0
            long r5 = r12.A01     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0945
            int r4 = r12.A02(r3)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
        L_0x092c:
            int r3 = r12.A00     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            if (r4 >= r3) goto L_0x0939
            boolean r10 = r12.A09(r4)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            if (r10 == 0) goto L_0x0939
            int r4 = r4 + 1
            goto L_0x092c
        L_0x0939:
            if (r4 == r3) goto L_0x0945
            long r3 = r12.A04(r4)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r39 = -1
            int r10 = (r3 > r39 ? 1 : (r3 == r39 ? 0 : -1))
            if (r10 != 0) goto L_0x0946
        L_0x0945:
            r3 = r5
        L_0x0946:
            boolean r3 = r9.A01(r3)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            if (r3 != 0) goto L_0x08c1
            X.7jb r3 = r2.A01     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            int r4 = r3.A00     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r3 = 1
            if (r4 != r3) goto L_0x0d19
            X.3Dh r4 = r2.A06     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            java.lang.StringBuilder r5 = X.C18320x8.A0l(r65)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            java.lang.String r3 = ".chck"
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r5)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            java.io.File r3 = X.C64393Dh.A00(r4, r3)     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r3.createNewFile()     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            goto L_0x08c1
        L_0x0968:
            r5 = 1
            r43 = 1
            r52 = r12
            r53 = r0
            r55 = r18
            r57 = r5
            r52.A07(r53, r55, r57)     // Catch:{  }
            boolean r3 = r44.isEmpty()     // Catch:{  }
            if (r3 != 0) goto L_0x09c8
            r3 = r60
            r12.A08(r3)     // Catch:{  }
            r4 = 3
            r3 = r62
            if (r3 != r4) goto L_0x09c8
            boolean r10 = r2.A01()     // Catch:{  }
            r3 = r63
            boolean r6 = r3.A0Y     // Catch:{  }
            X.2wP r4 = r2.A0O     // Catch:{  }
            X.7YG r3 = r3.A09     // Catch:{  }
            if (r3 == 0) goto L_0x09b0
            X.2r1 r4 = r4.A00     // Catch:{  }
            boolean r3 = r4.A03(r3, r6)     // Catch:{  }
            if (r3 == 0) goto L_0x09b0
            X.1VX r9 = r4.A02     // Catch:{  }
            r4 = 3116(0xc2c, float:4.366E-42)
            if (r6 == 0) goto L_0x09a4
            r4 = 6269(0x187d, float:8.785E-42)
        L_0x09a4:
            X.2vE r3 = X.C58422vE.A01     // Catch:{  }
            boolean r3 = r9.A0Y(r3, r4)     // Catch:{  }
            if (r3 == 0) goto L_0x09b0
            if (r10 != 0) goto L_0x09b0
            if (r6 == 0) goto L_0x09c8
        L_0x09b0:
            monitor-enter(r7)     // Catch:{  }
            java.util.List r3 = r7.A0G     // Catch:{ all -> 0x0d91 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0d91 }
        L_0x09b7:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0d91 }
            if (r3 == 0) goto L_0x09c7
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0d91 }
            X.8uU r3 = (X.C185938uU) r3     // Catch:{ all -> 0x0d91 }
            r3.Ba6()     // Catch:{ all -> 0x0d91 }
            goto L_0x09b7
        L_0x09c7:
            monitor-exit(r7)     // Catch:{  }
        L_0x09c8:
            long r20 = r20 + r18
            long r0 = r0 + r18
            r6 = 2
            r3 = r62
            if (r3 != r6) goto L_0x0a04
            X.7jb r3 = r2.A01     // Catch:{  }
            X.C626936e.A06(r3)     // Catch:{  }
            int r3 = r3.A00     // Catch:{  }
            if (r3 == 0) goto L_0x0a04
            X.7jb r4 = r2.A01     // Catch:{  }
            int r3 = r4.A00     // Catch:{  }
            if (r3 != r5) goto L_0x0a04
            long r3 = r4.A01     // Catch:{  }
            int r9 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r9 < 0) goto L_0x0a04
            monitor-enter(r7)     // Catch:{  }
            boolean r3 = r7.A0B     // Catch:{ all -> 0x0d91 }
            if (r3 != 0) goto L_0x0a03
            r7.A0B = r5     // Catch:{ all -> 0x0d91 }
            java.util.List r3 = r7.A0G     // Catch:{ all -> 0x0d91 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0d91 }
        L_0x09f3:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0d91 }
            if (r3 == 0) goto L_0x0a03
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0d91 }
            X.8uU r3 = (X.C185938uU) r3     // Catch:{ all -> 0x0d91 }
            r3.Ba6()     // Catch:{ all -> 0x0d91 }
            goto L_0x09f3
        L_0x0a03:
            monitor-exit(r7)     // Catch:{  }
        L_0x0a04:
            r7.A05(r6)     // Catch:{  }
            r3 = r64
            java.util.concurrent.FutureTask r3 = r3.A02     // Catch:{  }
            boolean r3 = r3.isCancelled()     // Catch:{  }
            if (r3 == 0) goto L_0x0a1d
            java.lang.String r0 = "StreamMediaDownloadHandler/download cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{  }
            r0 = r60
            r12.A08(r0)     // Catch:{  }
            goto L_0x0d62
        L_0x0a1d:
            X.7TB r9 = r7.A0F     // Catch:{  }
            monitor-enter(r9)     // Catch:{  }
            long r3 = r9.A00     // Catch:{ all -> 0x0db3 }
            r5 = -1
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1S(r10)
            monitor-exit(r9)     // Catch:{  }
            if (r3 == 0) goto L_0x0a6e
            r4 = 3
            r3 = r62
            if (r3 == r4) goto L_0x0a3b
            X.7jb r3 = r2.A01     // Catch:{  }
            X.C626936e.A06(r3)     // Catch:{  }
            int r3 = r3.A00     // Catch:{  }
            if (r3 == 0) goto L_0x0a6e
        L_0x0a3b:
            monitor-enter(r9)     // Catch:{  }
            long r3 = r9.A00     // Catch:{ all -> 0x0db3 }
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0d6c
            r9.A00 = r5     // Catch:{ all -> 0x0db3 }
            monitor-exit(r9)     // Catch:{  }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{  }
            java.lang.String r5 = "StreamMediaDownloadHandler/seek request="
            X.C18260x0.A10(r5, r6, r3)     // Catch:{  }
            long r5 = r12.A06(r3)     // Catch:{  }
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0a5c
            java.lang.String r3 = "StreamMediaDownloadHandler/seek ignored"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{  }
            goto L_0x0a6e
        L_0x0a5c:
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{  }
            java.lang.String r9 = "StreamMediaDownloadHandler/attempting seek old="
            r10.append(r9)     // Catch:{  }
            r10.append(r0)     // Catch:{  }
            java.lang.String r9 = ", new="
            X.C18260x0.A12(r9, r10, r5)     // Catch:{  }
            goto L_0x0a6f
        L_0x0a6e:
            r3 = r0
        L_0x0a6f:
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0a75
            goto L_0x0c64
        L_0x0a75:
            r5 = r20
            r3 = r18
            r7.A07(r5, r3)     // Catch:{  }
            int[] r9 = r2.A0V     // Catch:{  }
            if (r9 == 0) goto L_0x0b47
            X.2wP r4 = r2.A0O     // Catch:{  }
            X.2sk r3 = r2.A0K     // Catch:{  }
            r19 = r3
            r3 = r63
            boolean r5 = r3.A0Y     // Catch:{  }
            java.lang.String r3 = r3.A0M     // Catch:{  }
            long r41 = X.AnonymousClass0x7.A0E(r30)     // Catch:{  }
            long r39 = r20 - r25
            r10 = 0
            r6 = 2
            r18 = 3
            if (r3 == 0) goto L_0x0b47
            r3 = r44
            boolean r3 = X.AnonymousClass0x7.A1U(r3, r6)     // Catch:{  }
            if (r3 == 0) goto L_0x0b47
            r6 = r9[r10]     // Catch:{ IOException -> 0x0b3f }
            r3 = r65
            boolean r3 = r4.A01(r3, r6, r5)     // Catch:{ IOException -> 0x0b3f }
            if (r3 != 0) goto L_0x0ab4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)     // Catch:{ IOException -> 0x0b3f }
            r3 = r19
            r3.A08 = r4     // Catch:{ IOException -> 0x0b3f }
            goto L_0x0b47
        L_0x0ab4:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r43)     // Catch:{ IOException -> 0x0b3f }
            r3 = r19
            r3.A08 = r6     // Catch:{ IOException -> 0x0b3f }
            if (r5 == 0) goto L_0x0acd
            X.2r1 r3 = r4.A00     // Catch:{ IOException -> 0x0b3f }
            X.1VX r6 = r3.A02     // Catch:{ IOException -> 0x0b3f }
            r5 = 6269(0x187d, float:8.785E-42)
            X.2vE r3 = X.C58422vE.A01     // Catch:{ IOException -> 0x0b3f }
            boolean r3 = r6.A0Y(r3, r5)     // Catch:{ IOException -> 0x0b3f }
            if (r3 != 0) goto L_0x0acd
            goto L_0x0b47
        L_0x0acd:
            X.2r1 r13 = r4.A00     // Catch:{ IOException -> 0x0b3f }
            X.2y5 r4 = r13.A05     // Catch:{ IOException -> 0x0b3f }
            X.33i r3 = r13.A00     // Catch:{ IOException -> 0x0b3f }
            int r4 = X.AnonymousClass34G.A02(r3, r4)     // Catch:{ IOException -> 0x0b3f }
            r3 = 2013(0x7dd, float:2.821E-42)
            if (r4 < r3) goto L_0x0b32
            X.2y3 r4 = r13.A04     // Catch:{ IOException -> 0x0b3f }
            r3 = r43
            java.lang.Float r3 = r4.A01(r3)     // Catch:{ IOException -> 0x0b3f }
            if (r3 == 0) goto L_0x0aff
            float r6 = r3.floatValue()     // Catch:{ IOException -> 0x0b3f }
            r3 = 1101004800(0x41a00000, float:20.0)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0aff
            X.1VX r5 = r13.A02     // Catch:{ IOException -> 0x0b3f }
            r4 = 1579(0x62b, float:2.213E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ IOException -> 0x0b3f }
            int r3 = r5.A0O(r3, r4)     // Catch:{ IOException -> 0x0b3f }
            float r3 = (float) r3     // Catch:{ IOException -> 0x0b3f }
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0aff
            goto L_0x0b47
        L_0x0aff:
            r4 = 51200(0xc800, double:2.5296E-319)
            int r3 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0b32
            r4 = 50
            int r3 = (r41 > r4 ? 1 : (r41 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0b32
            r3 = r39
            double r10 = (double) r3     // Catch:{ IOException -> 0x0b3f }
            r5 = r41
            double r3 = (double) r5     // Catch:{ IOException -> 0x0b3f }
            double r10 = r10 / r3
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0b3f }
            java.lang.String r3 = "ImageQuality/realtimeBandwidthExceedsThreshold/currentBandwidth="
            r4.append(r3)     // Catch:{ IOException -> 0x0b3f }
            r4.append(r10)     // Catch:{ IOException -> 0x0b3f }
            X.AnonymousClass0x2.A18(r4)     // Catch:{ IOException -> 0x0b3f }
            X.1VX r5 = r13.A02     // Catch:{ IOException -> 0x0b3f }
            r4 = 1579(0x62b, float:2.213E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ IOException -> 0x0b3f }
            int r3 = r5.A0O(r3, r4)     // Catch:{ IOException -> 0x0b3f }
            double r3 = (double) r3     // Catch:{ IOException -> 0x0b3f }
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0b32
            goto L_0x0b47
        L_0x0b32:
            r4 = r44
            r3 = r18
            boolean r3 = X.AnonymousClass0x7.A1U(r4, r3)     // Catch:{ IOException -> 0x0b3f }
            r18 = 1
            if (r3 == 0) goto L_0x0b49
            goto L_0x0b47
        L_0x0b3f:
            java.lang.Integer r4 = X.C18290x4.A0c()     // Catch:{  }
            r3 = r19
            r3.A08 = r4     // Catch:{  }
        L_0x0b47:
            r18 = 0
        L_0x0b49:
            r3 = r20
            boolean r3 = r2.A02(r3)     // Catch:{  }
            if (r3 == 0) goto L_0x0b56
            com.whatsapp.util.Log.i((java.lang.String) r36)     // Catch:{  }
            goto L_0x0d73
        L_0x0b56:
            X.2wP r4 = r2.A0O     // Catch:{  }
            r3 = r63
            X.7YG r6 = r3.A09     // Catch:{  }
            boolean r10 = r3.A0Y     // Catch:{  }
            if (r6 == 0) goto L_0x0c38
            X.2r1 r5 = r4.A00     // Catch:{  }
            boolean r3 = r5.A03(r6, r10)     // Catch:{  }
            if (r3 == 0) goto L_0x0c38
            X.1VX r3 = r5.A02     // Catch:{  }
            r19 = r3
            r11 = 3116(0xc2c, float:4.366E-42)
            if (r10 == 0) goto L_0x0b72
            r11 = 6269(0x187d, float:8.785E-42)
        L_0x0b72:
            X.2vE r13 = X.C58422vE.A01     // Catch:{  }
            r4 = r3
            boolean r3 = r4.A0Y(r13, r11)     // Catch:{  }
            if (r3 == 0) goto L_0x0c38
            r4 = 3
            r3 = r62
            if (r3 != r4) goto L_0x0c55
            if (r9 == 0) goto L_0x0c55
            int r4 = r9.length     // Catch:{  }
            r3 = 4
            if (r4 != r3) goto L_0x0c55
            r3 = r63
            java.lang.String r11 = r3.A0M     // Catch:{  }
            boolean r3 = r3.A0P     // Catch:{  }
            r4 = 0
            if (r3 != 0) goto L_0x0c55
            if (r10 != 0) goto L_0x0c55
            if (r11 == 0) goto L_0x0c55
            java.lang.Integer r3 = X.C18280x3.A0S()     // Catch:{  }
            r10 = r44
            boolean r3 = r10.contains(r3)     // Catch:{  }
            if (r3 == 0) goto L_0x0c55
            boolean r3 = r5.A03(r6, r4)     // Catch:{  }
            if (r3 == 0) goto L_0x0c55
            r6 = 3116(0xc2c, float:4.366E-42)
            r5 = r19
            boolean r3 = r5.A0Y(r13, r6)     // Catch:{  }
            if (r3 == 0) goto L_0x0c55
            java.lang.Integer r5 = X.C18290x4.A0a()     // Catch:{  }
            boolean r3 = r10.contains(r5)     // Catch:{  }
            if (r3 != 0) goto L_0x0c55
            boolean r3 = r2.A04(r11)     // Catch:{  }
            if (r3 == 0) goto L_0x0c55
            r3 = r9[r4]     // Catch:{  }
            r4 = r9[r43]     // Catch:{  }
            int r3 = r3 + r4
            r4 = 2
            r4 = r9[r4]     // Catch:{  }
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch:{  }
            r10 = 0
            r5 = r65
            java.io.InputStream r9 = X.AnonymousClass75L.A00(r5, r3)     // Catch:{ IOException -> 0x0c0a }
            X.3Dh r4 = r2.A06     // Catch:{ all -> 0x0c00 }
            r3 = r63
            java.lang.String r6 = r3.A0G     // Catch:{ all -> 0x0c00 }
            java.lang.String r5 = X.C57392tZ.A01(r61)     // Catch:{ all -> 0x0c00 }
            java.io.File r4 = r4.A0D()     // Catch:{ all -> 0x0c00 }
            java.lang.String r3 = ".partial.tmp"
            java.io.File r4 = X.C64393Dh.A04(r4, r6, r5, r3)     // Catch:{ all -> 0x0c00 }
            if (r4 == 0) goto L_0x0bfb
            boolean r3 = X.C627536m.A0R(r4, r9)     // Catch:{ all -> 0x0c00 }
            if (r3 == 0) goto L_0x0bfb
            X.2sk r5 = r2.A0K     // Catch:{ all -> 0x0c00 }
            monitor-enter(r5)     // Catch:{ all -> 0x0c00 }
            r3 = r43
            r5.A0H = r3     // Catch:{ all -> 0x0bf8 }
            monitor-exit(r5)     // Catch:{ all -> 0x0c00 }
            r9.close()     // Catch:{ IOException -> 0x0c0a }
            goto L_0x0c0b
        L_0x0bf8:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0c00 }
            throw r3     // Catch:{ all -> 0x0c00 }
        L_0x0bfb:
            r9.close()     // Catch:{ IOException -> 0x0c0a }
            r4 = r10
            goto L_0x0c0b
        L_0x0c00:
            r3 = move-exception
            r9.close()     // Catch:{ all -> 0x0c05 }
            goto L_0x0c09
        L_0x0c05:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch:{ IOException -> 0x0c0a }
        L_0x0c09:
            throw r3     // Catch:{ IOException -> 0x0c0a }
        L_0x0c0a:
            r4 = r10
        L_0x0c0b:
            if (r18 == 0) goto L_0x0c15
            r3 = r64
            int r6 = r3.A12     // Catch:{  }
            r5 = 1
            if (r6 != r5) goto L_0x0c15
            goto L_0x0c16
        L_0x0c15:
            r5 = 0
        L_0x0c16:
            if (r4 == 0) goto L_0x0c34
            monitor-enter(r7)     // Catch:{  }
            java.util.List r3 = r7.A0G     // Catch:{ all -> 0x0d91 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x0d91 }
        L_0x0c1f:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x0d91 }
            if (r3 == 0) goto L_0x0c2f
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0d91 }
            X.8uU r3 = (X.C185938uU) r3     // Catch:{ all -> 0x0d91 }
            r3.BXg(r4, r5)     // Catch:{ all -> 0x0d91 }
            goto L_0x0c1f
        L_0x0c2f:
            monitor-exit(r7)     // Catch:{  }
            if (r5 == 0) goto L_0x0c55
            goto L_0x0d80
        L_0x0c34:
            if (r5 == 0) goto L_0x0c55
            goto L_0x0d94
        L_0x0c38:
            r4 = 3
            r3 = r62
            if (r3 != r4) goto L_0x0c55
            if (r9 == 0) goto L_0x0c55
            int r4 = r9.length     // Catch:{  }
            r3 = 4
            if (r4 != r3) goto L_0x0c55
            if (r18 == 0) goto L_0x0c55
            r3 = r63
            java.lang.String r3 = r3.A0M     // Catch:{  }
            boolean r3 = r2.A04(r3)     // Catch:{  }
            if (r3 == 0) goto L_0x0c55
            boolean r0 = r2.A05(r9)     // Catch:{  }
            goto L_0x0da1
        L_0x0c55:
            r5 = 0
            r6 = 8192(0x2000, float:1.14794E-41)
            r4 = r58
            r3 = r24
            int r4 = r3.read(r4, r5, r6)     // Catch:{ IOException -> 0x0db1 }
            goto L_0x089a
        L_0x0c62:
            r3 = r0
            goto L_0x0c69
        L_0x0c64:
            r0 = r60
            r12.A08(r0)     // Catch:{  }
        L_0x0c69:
            long r0 = r12.A06(r3)     // Catch:{  }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0c73
            goto L_0x0886
        L_0x0c73:
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0c97
            goto L_0x0c7d
        L_0x0c7a:
            r59 = r24
            goto L_0x0c85
        L_0x0c7d:
            long r0 = r12.A06(r3)     // Catch:{  }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0c97
        L_0x0c85:
            r0 = 3
            r7.A05(r0)     // Catch:{  }
            java.lang.String r0 = r35.A00()     // Catch:{  }
            r2.A04 = r0     // Catch:{  }
            java.lang.String r0 = r34.A00()     // Catch:{  }
            r2.A03 = r0     // Catch:{  }
            goto L_0x0dcd
        L_0x0c97:
            r18 = 16
            int r13 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r13 <= 0) goto L_0x0ca0
            long r41 = r0 - r18
            goto L_0x0ca2
        L_0x0ca0:
            r41 = r0
        L_0x0ca2:
            long r5 = r12.A01     // Catch:{  }
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0cbe
            int r6 = r12.A02(r0)     // Catch:{  }
        L_0x0cac:
            int r6 = r6 + 1
            int r5 = r12.A00     // Catch:{  }
            if (r6 >= r5) goto L_0x0cbb
            long r10 = r12.A05(r6)     // Catch:{  }
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0cbb
            goto L_0x0cac
        L_0x0cbb:
            if (r6 == r5) goto L_0x0cbe
            goto L_0x0cc1
        L_0x0cbe:
            r43 = -1
            goto L_0x0cc5
        L_0x0cc1:
            long r43 = r12.A04(r6)     // Catch:{  }
        L_0x0cc5:
            r3 = r14
            X.3PZ r3 = (X.AnonymousClass3PZ) r3     // Catch:{  }
            java.net.HttpURLConnection r3 = r3.A01     // Catch:{  }
            java.net.URL r40 = r3.getURL()     // Catch:{  }
            X.C624535b.A03(r14)     // Catch:{  }
            r39 = r2
            X.4GL r14 = r39.A00(r40, r41, r43)     // Catch:{  }
            X.2s4 r5 = r2.A09     // Catch:{ IOException -> 0x0df0 }
            r3 = r63
            boolean r3 = r3.A0Y     // Catch:{ IOException -> 0x0df0 }
            int r3 = X.AnonymousClass0x9.A00(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0df0 }
            java.lang.Integer r3 = X.C18290x4.A0Z()     // Catch:{ IOException -> 0x0df0 }
            java.io.InputStream r24 = r14.B47(r5, r4, r3)     // Catch:{ IOException -> 0x0df0 }
            if (r13 <= 0) goto L_0x0d14
            r6 = 16
            byte[] r5 = new byte[r6]     // Catch:{ IOException -> 0x0e0b }
            r9 = 0
        L_0x0cf4:
            int r4 = r6 - r9
            r3 = r24
            int r4 = r3.read(r5, r9, r4)     // Catch:{ IOException -> 0x0e0b }
            r3 = -1
            if (r4 == r3) goto L_0x0de9
            int r9 = r9 + r4
            if (r9 < r6) goto L_0x0cf4
            long r3 = r0 - r18
            r15.seek(r3)     // Catch:{ IOException -> 0x0e0b }
            r3 = 0
            r15.write(r5, r3, r6)     // Catch:{ IOException -> 0x0e0b }
            java.io.FileDescriptor r3 = r15.getFD()     // Catch:{ IOException -> 0x0e0b }
            r3.sync()     // Catch:{ IOException -> 0x0e0b }
            goto L_0x0887
        L_0x0d14:
            r15.seek(r0)     // Catch:{ IOException -> 0x0e0b }
            goto L_0x0887
        L_0x0d19:
            X.6yj r0 = new X.6yj     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            r0.<init>()     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
            throw r0     // Catch:{ 59d -> 0x0e40, all -> 0x0e37 }
        L_0x0d1f:
            r0 = move-exception
            r2.A02 = r0     // Catch:{  }
            java.lang.String r0 = "StreamMediaDownloadHandler/stream check failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{  }
            X.2sk r1 = r2.A0K     // Catch:{  }
            r0 = 1
            r1.A09(r0)     // Catch:{  }
            r3 = r24
            r1 = r35
            r0 = r34
            A00(r15, r3, r14, r1, r0)     // Catch:{ all -> 0x1295 }
            r3 = 21
            goto L_0x0f6b
        L_0x0d3a:
            r3 = move-exception
            X.36E r1 = r2.A07     // Catch:{  }
            r0 = r63
            int r0 = r0.A05     // Catch:{  }
            r45 = 1
            java.lang.Long r40 = X.C18280x3.A0U(r11)     // Catch:{  }
            int[] r4 = r2.A0V     // Catch:{  }
            r39 = r1
            r41 = r4
            r42 = r0
            r43 = r22
            r39.A0S(r40, r41, r42, r43, r45)     // Catch:{  }
            r2.A02 = r3     // Catch:{  }
            r3 = r24
            r1 = r35
            r0 = r34
            A00(r15, r3, r14, r1, r0)     // Catch:{ all -> 0x1295 }
            r3 = 7
            goto L_0x0f6b
        L_0x0d62:
            r3 = r24
            r1 = r35
            r0 = r34
            A00(r15, r3, r14, r1, r0)     // Catch:{ all -> 0x1295 }
            goto L_0x0de5
        L_0x0d6c:
            java.lang.String r0 = "error in getting request"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x0db3 }
            throw r0     // Catch:{ all -> 0x0db3 }
        L_0x0d73:
            r3 = r24
            r1 = r35
            r0 = r34
            A00(r15, r3, r14, r1, r0)     // Catch:{ all -> 0x1295 }
        L_0x0d7c:
            r3 = 14
            goto L_0x0f6b
        L_0x0d80:
            r0 = 3
            r7.A05(r0)     // Catch:{  }
            r3 = r24
            r1 = r35
            r0 = r34
            A00(r15, r3, r14, r1, r0)     // Catch:{ all -> 0x1295 }
            r3 = 23
            goto L_0x0f6b
        L_0x0d91:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{  }
            goto L_0x0dcc
        L_0x0d94:
            r3 = r24
            r1 = r35
            r0 = r34
            A00(r15, r3, r14, r1, r0)     // Catch:{ all -> 0x1295 }
        L_0x0d9d:
            r3 = 24
            goto L_0x0f6b
        L_0x0da1:
            X.C624535b.A03(r15)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r24)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r14)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r35)     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x0e98
            goto L_0x0ef9
        L_0x0db1:
            r4 = move-exception
            goto L_0x0dc2
        L_0x0db3:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{  }
            goto L_0x0dcc
        L_0x0db6:
            r4 = move-exception
            r3 = 0
            int r0 = X.C1451674l.A00(r4)     // Catch:{  }
            X.59d r1 = new X.59d     // Catch:{  }
            r1.<init>(r4, r3, r0)     // Catch:{  }
            goto L_0x0dcc
        L_0x0dc2:
            r3 = 0
            int r0 = X.C1451674l.A00(r4)     // Catch:{  }
            X.59d r1 = new X.59d     // Catch:{  }
            r1.<init>(r4, r3, r0)     // Catch:{  }
        L_0x0dcc:
            throw r1     // Catch:{  }
        L_0x0dcd:
            r3 = r24
            r1 = r35
            r0 = r34
            A00(r15, r3, r14, r1, r0)     // Catch:{ all -> 0x1295 }
            java.lang.String r0 = "StreamMediaDownloadHandler/download complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1295 }
            r0 = r64
            java.util.concurrent.FutureTask r0 = r0.A02     // Catch:{ all -> 0x1295 }
            boolean r0 = r0.isCancelled()     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x0efc
        L_0x0de5:
            r3 = 13
            goto L_0x0f6b
        L_0x0de9:
            java.lang.String r0 = "attempting to read end of file"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0e0b }
            throw r0     // Catch:{ IOException -> 0x0e0b }
        L_0x0df0:
            r0 = move-exception
            r2.A02 = r0     // Catch:{ 59d -> 0x0e06, all -> 0x0e01 }
            r1 = r33
            com.whatsapp.util.Log.w(r1, r0)     // Catch:{ 59d -> 0x0e06, all -> 0x0e01 }
            int r3 = X.C1451674l.A00(r0)     // Catch:{ 59d -> 0x0e06, all -> 0x0e01 }
            X.C624535b.A03(r15)     // Catch:{ all -> 0x1295 }
            goto L_0x0f5f
        L_0x0e01:
            r4 = move-exception
            r24 = r15
            goto L_0x1091
        L_0x0e06:
            r1 = move-exception
            r24 = r15
            goto L_0x0ee7
        L_0x0e0b:
            r3 = move-exception
            boolean r0 = r2.A03(r12)     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            if (r0 == 0) goto L_0x0e1a
            X.C624535b.A03(r15)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r24)     // Catch:{ all -> 0x1295 }
            goto L_0x0ef3
        L_0x0e1a:
            r2.A02 = r3     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            java.lang.String r0 = "StreamMediaDownloadHandler/download failed with IOException; url="
            r1.append(r0)     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            java.lang.String r0 = X.C57392tZ.A01(r61)     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            X.C18260x0.A14(r0, r1, r3)     // Catch:{ 59d -> 0x0e3c, all -> 0x0e33 }
            X.C624535b.A03(r15)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r24)     // Catch:{ all -> 0x1295 }
            goto L_0x0e92
        L_0x0e33:
            r4 = move-exception
            r59 = r24
            goto L_0x0e38
        L_0x0e37:
            r4 = move-exception
        L_0x0e38:
            r24 = r15
            goto L_0x1091
        L_0x0e3c:
            r1 = move-exception
            r59 = r24
            goto L_0x0e41
        L_0x0e40:
            r1 = move-exception
        L_0x0e41:
            r24 = r15
            goto L_0x0ee7
        L_0x0e45:
            r0 = move-exception
            r2.A02 = r0     // Catch:{ 59d -> 0x0ea6, all -> 0x0e9f }
            java.lang.String r0 = "StreamMediaDownloadHandler/failed to open outputstream"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 59d -> 0x0ea6, all -> 0x0e9f }
            goto L_0x0e92
        L_0x0e4e:
            java.lang.String r0 = "StreamMediaDownloadHandler/download failed due to insufficient space;"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 6yi -> 0x0e59 }
            X.6yi r0 = new X.6yi     // Catch:{ 6yi -> 0x0e59 }
            r0.<init>()     // Catch:{ 6yi -> 0x0e59 }
            throw r0     // Catch:{ 6yi -> 0x0e59 }
        L_0x0e59:
            X.C624535b.A03(r14)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r35)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r34)     // Catch:{ all -> 0x1295 }
            r3 = 4
            goto L_0x0f6b
        L_0x0e65:
            r4 = move-exception
            goto L_0x0ea0
        L_0x0e67:
            r1 = move-exception
            goto L_0x0ea7
        L_0x0e69:
            r0 = move-exception
            goto L_0x0e87
        L_0x0e6b:
            r0 = move-exception
            goto L_0x0e87
        L_0x0e6d:
            r4 = move-exception
            r34 = r24
            r59 = r24
            goto L_0x1091
        L_0x0e74:
            r1 = move-exception
            r34 = r24
            r59 = r24
            goto L_0x0ee7
        L_0x0e7a:
            r0 = move-exception
            goto L_0x0e7d
        L_0x0e7c:
            r0 = move-exception
        L_0x0e7d:
            r34 = r24
            goto L_0x0e87
        L_0x0e80:
            r0 = move-exception
            goto L_0x0e83
        L_0x0e82:
            r0 = move-exception
        L_0x0e83:
            r34 = r24
            r35 = r24
        L_0x0e87:
            r2.A02 = r0     // Catch:{ 59d -> 0x0ea4, all -> 0x0e9d }
            java.lang.String r0 = "StreamMediaDownloadHandler/failed to create decrypter"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 59d -> 0x0ea4, all -> 0x0e9d }
            goto L_0x0e92
        L_0x0e8f:
            X.C624535b.A03(r15)     // Catch:{ all -> 0x1295 }
        L_0x0e92:
            X.C624535b.A03(r14)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r35)     // Catch:{ all -> 0x1295 }
        L_0x0e98:
            X.C624535b.A03(r34)     // Catch:{ all -> 0x1295 }
            goto L_0x0f59
        L_0x0e9d:
            r4 = move-exception
            goto L_0x0ea0
        L_0x0e9f:
            r4 = move-exception
        L_0x0ea0:
            r59 = r24
            goto L_0x1091
        L_0x0ea4:
            r1 = move-exception
            goto L_0x0ea7
        L_0x0ea6:
            r1 = move-exception
        L_0x0ea7:
            r59 = r24
            goto L_0x0ee7
        L_0x0eaa:
            r1 = move-exception
            goto L_0x0ee1
        L_0x0eac:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ 59d -> 0x0ee0, all -> 0x0ed1 }
            throw r0     // Catch:{ 59d -> 0x0ee0, all -> 0x0ed1 }
        L_0x0eaf:
            r1 = move-exception
            goto L_0x0eb2
        L_0x0eb1:
            r1 = move-exception
        L_0x0eb2:
            r14 = r24
            r34 = r14
            goto L_0x0eba
        L_0x0eb7:
            r1 = move-exception
            r34 = r24
        L_0x0eba:
            r35 = r24
            r59 = r24
            goto L_0x0ee7
        L_0x0ebf:
            r1 = move-exception
            goto L_0x0ec2
        L_0x0ec1:
            r1 = move-exception
        L_0x0ec2:
            r14 = r24
            r34 = r14
            r35 = r14
            r59 = r14
            goto L_0x0ee7
        L_0x0ecb:
            r4 = move-exception
            r14 = r24
            r34 = r14
            goto L_0x0ed4
        L_0x0ed1:
            r4 = move-exception
            r34 = r24
        L_0x0ed4:
            r35 = r24
            r59 = r24
            goto L_0x1091
        L_0x0eda:
            r1 = move-exception
            r14 = r24
            r34 = r14
            goto L_0x0ee3
        L_0x0ee0:
            r1 = move-exception
        L_0x0ee1:
            r34 = r24
        L_0x0ee3:
            r35 = r24
            r59 = r24
        L_0x0ee7:
            boolean r0 = r2.A03(r12)     // Catch:{ all -> 0x0f4e }
            if (r0 == 0) goto L_0x0efe
            X.C624535b.A03(r24)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r59)     // Catch:{ all -> 0x1295 }
        L_0x0ef3:
            X.C624535b.A03(r14)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r35)     // Catch:{ all -> 0x1295 }
        L_0x0ef9:
            X.C624535b.A03(r34)     // Catch:{ all -> 0x1295 }
        L_0x0efc:
            r3 = 0
            goto L_0x0f6b
        L_0x0efe:
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0f4e }
            if (r0 != 0) goto L_0x0f05
            r0 = r1
        L_0x0f05:
            boolean r0 = X.C154457dC.A01(r0)     // Catch:{ all -> 0x0f4e }
            if (r0 != 0) goto L_0x0f24
            java.lang.Throwable r3 = r1.getCause()     // Catch:{ all -> 0x0f4e }
            if (r3 != 0) goto L_0x0f12
            r3 = r1
        L_0x0f12:
            boolean r0 = r3 instanceof org.chromium.net.CronetException     // Catch:{ all -> 0x0f4e }
            if (r0 == 0) goto L_0x0f24
            r0 = 0
            java.lang.String r4 = X.C60872zJ.A00(r3, r0)     // Catch:{ all -> 0x0f4e }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f4e }
            java.lang.String r0 = "CronetException"
            X.C18260x0.A0r(r0, r4, r3)     // Catch:{ all -> 0x0f4e }
        L_0x0f24:
            r2.A02 = r1     // Catch:{ all -> 0x0f4e }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f4e }
            java.lang.String r0 = "StreamMediaDownloadHandler/connection error: "
            r4.append(r0)     // Catch:{ all -> 0x0f4e }
            r4.append(r1)     // Catch:{ all -> 0x0f4e }
            java.lang.String r3 = "; mediaHash="
            r0 = r63
            X.C47662dc.A00(r0, r3, r4)     // Catch:{ all -> 0x0f4e }
            r0 = r37
            r4.append(r0)     // Catch:{ all -> 0x0f4e }
            java.net.URL r0 = r2.A0T     // Catch:{ all -> 0x0f4e }
            java.lang.String r0 = X.C57392tZ.A01(r0)     // Catch:{ all -> 0x0f4e }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r4)     // Catch:{ all -> 0x0f4e }
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0f4e }
            int r3 = r1.downloadStatus     // Catch:{ all -> 0x0f4e }
            goto L_0x0f5c
        L_0x0f4e:
            r4 = move-exception
            goto L_0x1091
        L_0x0f51:
            r1 = move-exception
            r2.A02 = r1     // Catch:{ all -> 0x1295 }
            java.lang.String r0 = "StreamMediaDownloadHandler/unable to create output file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x1295 }
        L_0x0f59:
            r3 = 9
            goto L_0x0f6b
        L_0x0f5c:
            X.C624535b.A03(r24)     // Catch:{ all -> 0x1295 }
        L_0x0f5f:
            X.C624535b.A03(r59)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r14)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r35)     // Catch:{ all -> 0x1295 }
            X.C624535b.A03(r34)     // Catch:{ all -> 0x1295 }
        L_0x0f6b:
            java.lang.Exception r1 = r2.A02     // Catch:{ all -> 0x1295 }
            r0 = r69
            r0.A0B(r1)     // Catch:{ all -> 0x1295 }
            X.7L0 r0 = r2.A00     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x0f7c
            java.lang.Boolean r1 = r0.A00     // Catch:{ all -> 0x1295 }
            r0 = r69
            r0.A0K = r1     // Catch:{ all -> 0x1295 }
        L_0x0f7c:
            r8.A08()     // Catch:{ all -> 0x1295 }
            monitor-enter(r17)     // Catch:{ all -> 0x1295 }
            r0 = r17
            long r0 = r0.A05     // Catch:{ all -> 0x1077 }
            monitor-exit(r17)     // Catch:{ all -> 0x1295 }
            r4 = r69
            r4.A09 = r0     // Catch:{ all -> 0x1295 }
            monitor-enter(r17)     // Catch:{ all -> 0x1295 }
            r0 = r17
            java.lang.Long r1 = r0.A09     // Catch:{ all -> 0x1077 }
            monitor-exit(r17)     // Catch:{ all -> 0x1295 }
            r4.A0U = r1     // Catch:{ all -> 0x1295 }
            monitor-enter(r17)     // Catch:{ all -> 0x1295 }
            r0 = r17
            java.lang.String r1 = r0.A0A     // Catch:{ all -> 0x1077 }
            monitor-exit(r17)     // Catch:{ all -> 0x1295 }
            r4.A0a = r1     // Catch:{ all -> 0x1295 }
            r5 = 7
            if (r3 == 0) goto L_0x0fdd
            java.lang.String r1 = X.C614230q.A00(r68)     // Catch:{ all -> 0x1295 }
            r4.A0b = r1     // Catch:{ all -> 0x1295 }
            if (r3 == r5) goto L_0x0fa8
            r0 = 32
            if (r3 != r0) goto L_0x0fab
        L_0x0fa8:
            r16.A06()     // Catch:{ all -> 0x1295 }
        L_0x0fab:
            monitor-enter(r16)     // Catch:{ all -> 0x1295 }
            r0 = r16
            boolean r0 = r0.A0H     // Catch:{ all -> 0x1074 }
            monitor-exit(r16)     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x0fd5
            r2 = 4169(0x1049, float:5.842E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ all -> 0x1295 }
            r0 = r66
            boolean r0 = r0.A0Y(r1, r2)     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x0fd5
            boolean r0 = r38.delete()     // Catch:{ all -> 0x1295 }
            if (r0 != 0) goto L_0x0fca
            java.lang.String r0 = "MediaDownloadUtils/deleteTempFilesDueToPartialDownload failed to delete encrypted file"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x1295 }
        L_0x0fca:
            boolean r0 = r29.delete()     // Catch:{ all -> 0x1295 }
            if (r0 != 0) goto L_0x0fd5
            java.lang.String r0 = "MediaDownloadUtils/deleteTempFilesDueToPartialDownload failed delete decryptedFile file"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x1295 }
        L_0x0fd5:
            r1 = 0
            r0 = 1
            X.35m r9 = X.C625435m.A00(r1, r3, r0)     // Catch:{ all -> 0x1295 }
            goto L_0x1125
        L_0x0fdd:
            r4 = 0
            r3 = 1
            monitor-enter(r16)     // Catch:{ all -> 0x1295 }
            r0 = r16
            boolean r0 = r0.A0I     // Catch:{ all -> 0x1074 }
            monitor-exit(r16)     // Catch:{ all -> 0x1295 }
            if (r0 == 0) goto L_0x100e
            r0 = r73
            java.lang.String r0 = r0.A0J     // Catch:{ all -> 0x1295 }
            java.lang.String r11 = "enc"
            if (r0 == 0) goto L_0x0ffa
            java.lang.String r1 = X.C106695a0.A02(r0)     // Catch:{ all -> 0x1295 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1295 }
            if (r0 != 0) goto L_0x0ffa
            r11 = r1
        L_0x0ffa:
            r12 = 0
            X.35m r9 = new X.35m     // Catch:{ all -> 0x1295 }
            r14 = r12
            r13 = r3
            r10 = r4
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x1295 }
            r2 = r67
            r1 = r38
            r0 = r29
            X.AnonymousClass36U.A08(r2, r9, r1, r0)     // Catch:{ all -> 0x1295 }
            goto L_0x1125
        L_0x100e:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x1295 }
            r6 = r69
            r6.A0D = r0     // Catch:{ all -> 0x1295 }
            r1 = 3
            r6.A03 = r1     // Catch:{ all -> 0x1295 }
            java.lang.String r9 = r2.A04     // Catch:{ all -> 0x106f }
            X.7L0 r7 = r2.A00     // Catch:{ all -> 0x106f }
            r6 = r29
            r1 = r68
            r0 = r73
            int r0 = X.AnonymousClass36U.A00(r7, r0, r6, r9, r1)     // Catch:{ all -> 0x106f }
            if (r0 == 0) goto L_0x1035
            X.35m r9 = X.C625435m.A00(r4, r0, r3)     // Catch:{ all -> 0x106f }
        L_0x102d:
            r2 = r67
            r1 = r38
            X.AnonymousClass36U.A08(r2, r9, r1, r6)     // Catch:{ all -> 0x106f }
            goto L_0x106a
        L_0x1035:
            java.lang.String r2 = r2.A03     // Catch:{ all -> 0x106f }
            r0 = r73
            int r0 = X.AnonymousClass36U.A01(r0, r2, r1)     // Catch:{ all -> 0x106f }
            if (r0 == 0) goto L_0x104d
            if (r0 == r3) goto L_0x1046
            X.35m r9 = X.C625435m.A00(r4, r5, r3)     // Catch:{ all -> 0x106f }
            goto L_0x102d
        L_0x1046:
            r0 = 31
            X.35m r9 = X.C625435m.A00(r4, r0, r3)     // Catch:{ all -> 0x106f }
            goto L_0x102d
        L_0x104d:
            r0 = r73
            java.lang.String r0 = r0.A0J     // Catch:{ all -> 0x106f }
            java.lang.String r11 = "enc"
            if (r0 == 0) goto L_0x1060
            java.lang.String r1 = X.C106695a0.A02(r0)     // Catch:{ all -> 0x106f }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x106f }
            if (r0 != 0) goto L_0x1060
            r11 = r1
        L_0x1060:
            r12 = 0
            X.35m r9 = new X.35m     // Catch:{ all -> 0x106f }
            r14 = r12
            r13 = r3
            r10 = r4
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x106f }
            goto L_0x102d
        L_0x106a:
            r69.A08()     // Catch:{ all -> 0x1295 }
            goto L_0x1125
        L_0x106f:
            r4 = move-exception
            r69.A08()     // Catch:{ all -> 0x1295 }
            goto L_0x109c
        L_0x1074:
            r4 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x1295 }
            goto L_0x109c
        L_0x1077:
            r4 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x1295 }
            goto L_0x109c
        L_0x107a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1295 }
            java.lang.String r0 = "MediaDownload/MMS download failed due to message allowed into download encrypted without sufficient information to compute a download file; mediaHash="
            r2.append(r0)     // Catch:{ all -> 0x1295 }
            r0 = r70
            r2.append(r0)     // Catch:{ all -> 0x1295 }
            r1 = r37
            r0 = r68
            java.lang.IllegalStateException r4 = X.AnonymousClass000.A0H(r0, r1, r2)     // Catch:{ all -> 0x1295 }
            goto L_0x109c
        L_0x1091:
            r3 = r59
            r2 = r24
            r1 = r35
            r0 = r34
            A00(r2, r3, r14, r1, r0)     // Catch:{ all -> 0x1295 }
        L_0x109c:
            throw r4     // Catch:{ all -> 0x1295 }
        L_0x109d:
            X.1VX r0 = r8.A0T     // Catch:{ all -> 0x1295 }
            r19 = r0
            X.2qk r0 = r8.A0A     // Catch:{ all -> 0x1295 }
            r18 = r0
            com.whatsapp.stickers.WebpUtils r0 = r8.A0m     // Catch:{ all -> 0x1295 }
            r17 = r0
            X.3Dh r0 = r8.A0B     // Catch:{ all -> 0x1295 }
            r15 = r0
            X.2zf r13 = r8.A0P     // Catch:{ all -> 0x1295 }
            X.1i8 r12 = r8.A0k     // Catch:{ all -> 0x1295 }
            X.5ah r11 = r8.A0p     // Catch:{ all -> 0x1295 }
            X.2Yt r10 = r8.A0n     // Catch:{ all -> 0x1295 }
            X.36E r9 = r8.A0C     // Catch:{ all -> 0x1295 }
            X.5af r7 = r8.A0s     // Catch:{ all -> 0x1295 }
            X.1uL r5 = r8.A0w     // Catch:{ all -> 0x1295 }
            X.2qZ r4 = r8.A0c     // Catch:{ all -> 0x1295 }
            X.2p6 r3 = r8.A0W     // Catch:{ all -> 0x1295 }
            X.2pd r2 = r8.A0V     // Catch:{ all -> 0x1295 }
            X.2s4 r1 = r8.A0E     // Catch:{ all -> 0x1295 }
            X.5LM r0 = r8.A01     // Catch:{ all -> 0x1295 }
            X.2yO r33 = new X.2yO     // Catch:{ all -> 0x1295 }
            r34 = r18
            r35 = r15
            r36 = r9
            r37 = r1
            r38 = r13
            r39 = r19
            r40 = r2
            r41 = r3
            r42 = r0
            r43 = r4
            r44 = r8
            r45 = r16
            r46 = r73
            r47 = r69
            r48 = r12
            r49 = r17
            r50 = r10
            r51 = r11
            r52 = r7
            r53 = r14
            r54 = r5
            r55 = r68
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x1295 }
            int r0 = r8.A12     // Catch:{ all -> 0x1295 }
            r1 = 2
            boolean r38 = X.AnonymousClass000.A1U(r0, r1)
            X.2cG r0 = r8.A0A()     // Catch:{ all -> 0x1295 }
            java.lang.String r36 = r0.A00()     // Catch:{ all -> 0x1295 }
            r34 = r6
            r35 = r20
            r37 = r68
            X.35m r9 = r33.A01(r34, r35, r36, r37, r38)     // Catch:{ all -> 0x1295 }
            if (r38 == 0) goto L_0x1125
            r8.A0B()     // Catch:{ all -> 0x1295 }
            int r0 = r8.A12     // Catch:{ all -> 0x1295 }
            if (r0 == r1) goto L_0x1125
            r38 = 0
            X.2cG r0 = r8.A0A()     // Catch:{ all -> 0x1295 }
            java.lang.String r36 = r0.A00()     // Catch:{ all -> 0x1295 }
            X.35m r9 = r33.A01(r34, r35, r36, r37, r38)     // Catch:{ all -> 0x1295 }
        L_0x1125:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r0 = r8.A03
            long r3 = r0.length()
            long r3 = r3 - r27
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r12 = X.AnonymousClass001.A1W(r0)
            int r3 = r9.A01
            r0 = 20
            if (r3 != r0) goto L_0x1162
            X.1i8 r3 = r8.A0k
            r0 = r73
            java.lang.String r2 = r0.A0G
            java.lang.String r1 = r0.A0F
            int r0 = r8.A12
            r7 = 1
            if (r0 != 0) goto L_0x114c
            r7 = 2
        L_0x114c:
            X.2YO r0 = r8.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r8 = r0.get()
            r4 = r72
            r5 = r2
            r6 = r1
            X.8to r0 = r3.A0A(r4, r5, r6, r7, r8)
            X.7qy r8 = new X.7qy
            r8.<init>(r0, r12)
            return r8
        L_0x1162:
            r0 = 6
            if (r3 == r0) goto L_0x11fb
            r0 = 7
            if (r3 == r0) goto L_0x11fb
            r0 = 32
            if (r3 == r0) goto L_0x11fb
            r0 = 5
            if (r3 != r0) goto L_0x11b0
            r0 = r73
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x11e4
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MediaDownload/call/failed due to expiration of media; mediaHash="
            r0 = r70
            X.C18260x0.A0s(r1, r0, r2)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = r71
            r0.A05(r1)
            java.util.concurrent.CountDownLatch r3 = r8.A0z     // Catch:{ InterruptedException -> 0x11a3 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x11a3 }
            r0 = 12
            boolean r0 = r3.await(r0, r2)     // Catch:{ InterruptedException -> 0x11a3 }
            if (r0 == 0) goto L_0x11a6
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MediaDownload/call/reupload successful, will retry; mediaHash="
            r0 = r70
            X.C18260x0.A0s(r1, r0, r2)
            X.7qy r8 = X.C161997qy.A00(r9)
            return r8
        L_0x11a3:
            X.C18300x5.A11()
        L_0x11a6:
            java.lang.String r0 = "MediaDownload/all/reupload failed, will not retry; media too old"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7qy r8 = X.C161997qy.A01(r9)
            return r8
        L_0x11b0:
            r0 = 22
            if (r3 != r0) goto L_0x11e4
            r0 = r69
            java.lang.Exception r2 = r0.A0M
            boolean r0 = r2 instanceof X.C1000359d
            if (r0 != 0) goto L_0x11da
            r1 = 0
        L_0x11bd:
            boolean r0 = r1 instanceof org.chromium.net.NetworkException
            if (r0 != 0) goto L_0x11d3
            r13 = 0
        L_0x11c2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/failed/cronet_error, should retry "
            X.C18260x0.A1E(r0, r1, r13)
            r11 = 0
            r10 = -1
            X.7qy r8 = new X.7qy
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x11d3:
            org.chromium.net.NetworkException r1 = (org.chromium.net.NetworkException) r1
            boolean r13 = r1.immediatelyRetryable()
            goto L_0x11c2
        L_0x11da:
            X.59d r2 = (X.C1000359d) r2
            java.lang.Throwable r1 = r2.getCause()
            if (r1 != 0) goto L_0x11bd
            r1 = r2
            goto L_0x11bd
        L_0x11e4:
            boolean r0 = X.AnonymousClass000.A1T(r3)
            if (r0 != 0) goto L_0x11f6
            boolean r13 = X.C625435m.A02(r3)
            r11 = 0
            r10 = -1
            X.7qy r8 = new X.7qy
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x11f6:
            X.7qy r8 = X.C161997qy.A02(r9)
            return r8
        L_0x11fb:
            r0 = r69
            r0.A09 = r1
            java.io.File r0 = r8.A03
            if (r0 == 0) goto L_0x123d
            X.1VX r2 = r8.A0T
            r1 = 6039(0x1797, float:8.462E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x123d
            java.io.File r2 = r8.A03
            monitor-enter(r2)
            X.3Dh r1 = r8.A0B     // Catch:{ all -> 0x123a }
            java.io.File r0 = r8.A03     // Catch:{ all -> 0x123a }
            boolean r0 = X.AnonymousClass1I7.A00(r1, r0)     // Catch:{ all -> 0x123a }
            if (r0 != 0) goto L_0x1238
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x123a }
            java.lang.String r0 = "MediaDownload/call/failed to delete download file after failure; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x123a }
            r0 = r70
            r1.append(r0)     // Catch:{ all -> 0x123a }
            java.lang.String r0 = " file="
            r1.append(r0)     // Catch:{ all -> 0x123a }
            java.io.File r0 = r8.A03     // Catch:{ all -> 0x123a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x123a }
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x123a }
        L_0x1238:
            monitor-exit(r2)     // Catch:{ all -> 0x123a }
            goto L_0x1263
        L_0x123a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x123a }
            throw r0
        L_0x123d:
            X.3Dh r1 = r8.A0B
            java.io.File r0 = r8.A03
            boolean r0 = X.AnonymousClass1I7.A00(r1, r0)
            if (r0 != 0) goto L_0x1263
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/call/failed to delete download file after failure; mediaHash="
            r1.append(r0)
            r0 = r70
            r1.append(r0)
            java.lang.String r0 = " file="
            r1.append(r0)
            java.io.File r0 = r8.A03
            java.lang.String r0 = r0.getAbsolutePath()
            X.C18260x0.A1M(r1, r0)
        L_0x1263:
            r0 = r73
            byte[] r0 = r0.A0d
            if (r0 == 0) goto L_0x128d
            if (r32 == 0) goto L_0x128d
            boolean r0 = r32.delete()
            if (r0 != 0) goto L_0x128d
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/call/failed to delete server file after failure; mediaHash="
            r2.append(r0)
            r0 = r70
            r2.append(r0)
            java.lang.String r1 = "; serverFile="
            r0 = r32
            X.C18260x0.A1S(r2, r1, r0)
            X.2sU r0 = r8.A0o
            if (r0 == 0) goto L_0x128d
            r0.A04()
        L_0x128d:
            X.7qy r8 = X.C161997qy.A00(r9)
            return r8
        L_0x1292:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x1295 }
            throw r0     // Catch:{ all -> 0x1295 }
        L_0x1295:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x129a:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86454Ke.BkH(X.7US):X.7qy");
    }

    public static void A00(Closeable closeable, Closeable closeable2, Closeable closeable3, Closeable closeable4, Closeable closeable5) {
        C624535b.A03(closeable);
        C624535b.A03(closeable2);
        C624535b.A03(closeable3);
        C624535b.A03(closeable4);
        C624535b.A03(closeable5);
    }

    public static void A01(File file, long j) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        randomAccessFile.setLength(j);
        randomAccessFile.getFD().sync();
        randomAccessFile.close();
    }
}
