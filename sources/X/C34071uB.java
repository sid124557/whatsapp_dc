package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.1uB  reason: invalid class name and case insensitive filesystem */
public class C34071uB extends AnonymousClass5ZM implements LocationListener {
    public int A00 = 0;
    public int A01 = 15;
    public Location A02 = null;
    public Location A03 = null;
    public Location A04;
    public boolean A05;
    public final C55682qk A06;
    public final C159027ky A07;
    public final C56492s4 A08;
    public final C44382Vv A09;
    public final C56612sH A0A;
    public final AnonymousClass5ZR A0B;
    public final C66543Lv A0C;
    public final C29431io A0D;
    public final C55332qB A0E;
    public final AnonymousClass33K A0F;
    public final C621233o A0G;
    public final C30361mK A0H;

    public void A0A() {
        C159027ky r2 = this.A07;
        if (r2 != null) {
            try {
                r2.A05(this, "map-download", 0.0f, 3, 1000, 1000);
            } catch (IllegalArgumentException e) {
                Log.w("MapDownload/registerListener/GPS error ", e);
            }
        }
        C30361mK r22 = this.A0H;
        r22.A02 = 1;
        this.A0D.A0C(r22, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f4, code lost:
        if (r10 == null) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A00(X.C56492s4 r17, X.AnonymousClass33K r18, double r19, double r21, int r23) {
        /*
            r6 = 100
            java.lang.String r16 = "bad bitmap received"
            java.lang.String r5 = "MapDownload/downloadMapThumbnailBitmap/error "
            r3 = 170(0xaa, float:2.38E-43)
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://maps.googleapis.com/maps/api/staticmap?center="
            r9.append(r0)
            r7 = r19
            r9.append(r7)
            java.lang.String r11 = ","
            r9.append(r11)
            r0 = r21
            r9.append(r0)
            java.lang.String r2 = "&zoom="
            r9.append(r2)
            r2 = 1
            r4 = r23
            int r4 = java.lang.Math.max(r2, r4)
            r2 = 21
            int r12 = java.lang.Math.min(r2, r4)
            r9.append(r12)
            java.lang.String r2 = "&size="
            r9.append(r2)
            r9.append(r3)
            java.lang.String r2 = "x"
            r9.append(r2)
            r9.append(r3)
            java.lang.String r2 = "&sensor=true&format=png8&mobile=true&markers=color:red%7Csize:mid%7C"
            r9.append(r2)
            r9.append(r7)
            r9.append(r11)
            r9.append(r0)
            java.lang.String r2 = "&client=gme-whatsappinc"
            java.lang.String r4 = X.AnonymousClass000.A0X(r2, r9)
            java.net.URL r2 = X.C18330xA.A0B(r4)     // Catch:{ MalformedURLException -> 0x009c }
            java.lang.String r14 = r2.getFile()     // Catch:{ MalformedURLException -> 0x009c }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0l(r4)
            java.lang.String r2 = "&signature="
            r9.append(r2)
            java.lang.String r10 = X.C58172up.A0J
            r4 = 45
            r2 = 43
            java.lang.String r10 = r10.replace(r4, r2)
            r4 = 95
            r2 = 47
            java.lang.String r2 = r10.replace(r4, r2)
            r13 = 0
            byte[] r10 = android.util.Base64.decode(r2, r13)
            r2 = 1
            byte[][] r4 = new byte[r2][]
            byte[] r2 = r14.getBytes()
            r4[r13] = r2
            byte[] r2 = X.C627236i.A0M(r10, r4)
            java.lang.String r2 = X.C18290x4.A0t(r2)
            java.lang.String r2 = X.C107575bX.A0A(r2)
            java.lang.String r13 = X.AnonymousClass000.A0X(r2, r9)
            goto L_0x009d
        L_0x009c:
            r13 = 0
        L_0x009d:
            r2 = 24
            r10 = 0
            r15 = 0
            r9 = r17
            r4 = r18
            X.4GL r13 = r4.A03(r13)     // Catch:{ IOException -> 0x00ef, all -> 0x0196 }
            java.io.InputStream r14 = X.C18310x6.A0b(r9, r13, r10, r2)     // Catch:{ all -> 0x00e2 }
            android.graphics.BitmapFactory$Options r2 = X.C107655bf.A02     // Catch:{ all -> 0x00d8 }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r14, r10, r2)     // Catch:{ all -> 0x00d8 }
            if (r10 == 0) goto L_0x00d0
            int r2 = r10.getWidth()     // Catch:{ all -> 0x00d8 }
            if (r2 != r3) goto L_0x00d0
            int r2 = r10.getHeight()     // Catch:{ all -> 0x00d8 }
            if (r2 != r3) goto L_0x00d0
            r2 = 35
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r10, r2, r2, r6, r6)     // Catch:{ all -> 0x00d8 }
            r14.close()     // Catch:{ all -> 0x00ce }
            r13.close()     // Catch:{ IOException -> 0x00ed }
            goto L_0x00f6
        L_0x00ce:
            r14 = move-exception
            goto L_0x00e4
        L_0x00d0:
            java.io.IOException r2 = X.AnonymousClass002.A0C(r16)     // Catch:{ all -> 0x00d5 }
            throw r2     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r3 = move-exception
            r15 = 1
            goto L_0x00d9
        L_0x00d8:
            r3 = move-exception
        L_0x00d9:
            r14.close()     // Catch:{ all -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ all -> 0x00e2 }
        L_0x00e1:
            throw r3     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r14 = move-exception
            r3 = 0
        L_0x00e4:
            r13.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r2 = move-exception
            r14.addSuppressed(r2)     // Catch:{ IOException -> 0x00ed }
        L_0x00ec:
            throw r14     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            r2 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r2 = move-exception
            r3 = 0
        L_0x00f1:
            com.whatsapp.util.Log.w(r5, r2)     // Catch:{ all -> 0x0194 }
            if (r10 == 0) goto L_0x00fb
        L_0x00f6:
            if (r10 == r3) goto L_0x00fb
            r10.recycle()
        L_0x00fb:
            if (r3 != 0) goto L_0x0181
            if (r15 == 0) goto L_0x0181
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "https://dev.virtualearth.net/REST/v1/Imagery/Map/Road/"
            r10.append(r2)
            r10.append(r7)
            r10.append(r11)
            r10.append(r0)
            java.lang.String r2 = "/"
            r10.append(r2)
            r10.append(r12)
            java.lang.String r2 = "?mapSize="
            X.C18270x1.A19(r2, r11, r10, r6)
            r10.append(r6)
            java.lang.String r2 = "&pp="
            r10.append(r2)
            r10.append(r7)
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = ";54;&key="
            r10.append(r0)
            java.lang.String r0 = X.C58172up.A05
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r10)
            X.4GL r4 = r4.A03(r0)     // Catch:{ IOException -> 0x017d }
            r0 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0173 }
            r1 = 0
            java.io.InputStream r2 = r4.B47(r9, r1, r0)     // Catch:{ all -> 0x0173 }
            android.graphics.BitmapFactory$Options r0 = X.C107655bf.A02     // Catch:{ all -> 0x0169 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2, r1, r0)     // Catch:{ all -> 0x0169 }
            if (r3 == 0) goto L_0x0164
            int r0 = r3.getWidth()     // Catch:{ all -> 0x0169 }
            if (r0 != r6) goto L_0x0164
            int r0 = r3.getHeight()     // Catch:{ all -> 0x0169 }
            if (r0 != r6) goto L_0x0164
            r2.close()     // Catch:{ all -> 0x0173 }
            r4.close()     // Catch:{ IOException -> 0x017d }
            goto L_0x0181
        L_0x0164:
            java.io.IOException r0 = X.AnonymousClass002.A0C(r16)     // Catch:{ all -> 0x0169 }
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x016e }
            goto L_0x0172
        L_0x016e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0173 }
        L_0x0172:
            throw r1     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0178 }
            goto L_0x017c
        L_0x0178:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x017d }
        L_0x017c:
            throw r1     // Catch:{ IOException -> 0x017d }
        L_0x017d:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x0181:
            if (r3 == 0) goto L_0x0192
            java.io.ByteArrayOutputStream r1 = X.AnonymousClass0x9.A0e()
            byte[] r0 = X.C18320x8.A1Y(r3, r1)
            r1.close()     // Catch:{ IOException -> 0x018e }
        L_0x018e:
            r3.recycle()
            return r0
        L_0x0192:
            r0 = 0
            return r0
        L_0x0194:
            r0 = move-exception
            goto L_0x0198
        L_0x0196:
            r0 = move-exception
            r3 = 0
        L_0x0198:
            if (r10 == 0) goto L_0x019f
            if (r10 == r3) goto L_0x019f
            r10.recycle()
        L_0x019f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34071uB.A00(X.2s4, X.33K, double, double, int):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r8.A04 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r9) {
        /*
            r8 = this;
            android.location.Location r0 = r8.A04
            if (r0 != 0) goto L_0x0045
            X.7ky r0 = r8.A07
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x006d
            X.5ZR r0 = r8.A0B
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x006d
            r2 = 0
        L_0x0017:
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x0027
            r0 = 40
            if (r2 >= r0) goto L_0x002a
            r0 = 250(0xfa, double:1.235E-321)
            android.os.SystemClock.sleep(r0)
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0027:
            android.location.Location r0 = r8.A03
            goto L_0x0043
        L_0x002a:
            android.location.Location r2 = r8.A02
            if (r2 == 0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MapDownload/doInBackground/using coarseLocation "
            r1.append(r0)
            float r0 = r2.getAccuracy()
            r1.append(r0)
            X.C18280x3.A14(r1)
            android.location.Location r0 = r8.A02
        L_0x0043:
            r8.A04 = r0
        L_0x0045:
            X.33K r2 = r8.A0F
            X.2s4 r1 = r8.A08
            double r3 = r0.getLatitude()
            android.location.Location r0 = r8.A04
            double r5 = r0.getLongitude()
            int r7 = r8.A01
            byte[] r1 = A00(r1, r2, r3, r5, r7)
            X.1mK r0 = r8.A0H
            X.30w r0 = r0.A0y()
            X.C626936e.A06(r0)
            r0.A03(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0068:
            java.lang.String r0 = "MapDownload/doInBackground/failed to get location"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x006d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34071uB.A08(java.lang.Object[]):java.lang.Object");
    }

    public C34071uB(C55682qk r7, C159027ky r8, C56492s4 r9, C44382Vv r10, C56612sH r11, AnonymousClass5ZR r12, C66543Lv r13, C29431io r14, C55332qB r15, AnonymousClass33K r16, C621233o r17, C30361mK r18) {
        this.A0A = r11;
        this.A08 = r9;
        C30361mK r3 = r18;
        this.A0H = r3;
        this.A06 = r7;
        this.A0C = r13;
        this.A0D = r14;
        this.A0F = r16;
        this.A0B = r12;
        this.A0E = r15;
        this.A0G = r17;
        this.A09 = r10;
        if (r3.A00 == 0.0d || r3.A01 == 0.0d) {
            this.A07 = r8;
            return;
        }
        Location location = new Location("");
        this.A04 = location;
        location.setLatitude(r3.A00);
        this.A04.setLongitude(r3.A01);
        this.A04.setTime(r3.A0K);
        this.A05 = true;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r24) {
        /*
            r23 = this;
            boolean r11 = X.AnonymousClass001.A1Z(r24)
            r6 = 2
            r3 = r23
            X.1mK r7 = r3.A0H
            if (r11 == 0) goto L_0x0093
            r7.A02 = r6
            android.location.Location r0 = r3.A04
            double r0 = r0.getLatitude()
            r7.A00 = r0
            android.location.Location r0 = r3.A04
            double r0 = r0.getLongitude()
            r7.A01 = r0
        L_0x001d:
            boolean r0 = r7 instanceof X.C30801n8
            if (r0 == 0) goto L_0x0097
            X.2sH r0 = r3.A0A
            long r9 = r0.A0H()
            long r1 = r7.A0K
            r8 = r7
            X.1n8 r8 = (X.C30801n8) r8
            int r0 = r8.A00
            int r0 = r0 * 1000
            long r4 = (long) r0
            long r1 = r1 + r4
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0101
            if (r11 == 0) goto L_0x009a
            android.location.Location r0 = r3.A04
            r22 = r0
            X.2z0 r12 = r8.A1J
            X.4uZ r9 = r12.A00
            boolean r0 = r9 instanceof X.C28011fL
            if (r0 == 0) goto L_0x0091
            X.2qk r6 = r3.A06
            X.2qB r0 = r3.A0E
            java.util.Set r4 = r0.A01(r12)
            int r0 = r4.size()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r0)
            X.C627336j.A0F(r6, r4, r5)
        L_0x0058:
            X.33o r6 = r3.A0G
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingManager/setShareLocation; message.key="
            r4.append(r0)
            r4.append(r12)
            java.lang.String r11 = "; expiration="
            X.C18260x0.A12(r11, r4, r1)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            boolean r4 = X.C627336j.A0K(r9)
            if (r4 == 0) goto L_0x00ef
            if (r5 == 0) goto L_0x0116
            java.util.Iterator r10 = r5.iterator()
        L_0x007b:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0116
            X.4uZ r5 = X.C18300x5.A0P(r10)
            X.2sr r4 = r6.A07
            boolean r4 = r4.A0a(r5)
            if (r4 != 0) goto L_0x007b
            r0.add(r5)
            goto L_0x007b
        L_0x0091:
            r5 = 0
            goto L_0x0058
        L_0x0093:
            r0 = 0
            r7.A02 = r0
            goto L_0x001d
        L_0x0097:
            if (r11 == 0) goto L_0x009a
            goto L_0x0101
        L_0x009a:
            X.1io r0 = r3.A0D
            r5 = -1
            r0.A0C(r7, r5)
            X.7ky r1 = r3.A07
            if (r1 == 0) goto L_0x0107
            X.2Vv r0 = r3.A09
            X.2fl r2 = r0.A00()
            X.5ZR r4 = r3.A0B
            boolean r0 = r4.A05()
            if (r0 != 0) goto L_0x00cc
            X.2z0 r0 = r7.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0107
            X.4FC r2 = r2.A00()
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 2131892375(0x7f121897, float:1.9419497E38)
            r0 = 2131892374(0x7f121896, float:1.9419494E38)
            com.whatsapp.RequestPermissionActivity.A0n(r2, r4, r1, r0, r5)
            goto L_0x0107
        L_0x00cc:
            boolean r0 = r1.A07()
            if (r0 != 0) goto L_0x0107
            X.2z0 r0 = r7.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r2.A01(r1)
            if (r0 == 0) goto L_0x00e6
            X.4FC r0 = r2.A00()
            android.app.Activity r0 = (android.app.Activity) r0
            X.C621433s.A01(r0, r6)
            goto L_0x0107
        L_0x00e6:
            java.util.ArrayList r0 = X.AnonymousClass2C1.A01
            X.C626936e.A06(r1)
            r0.add(r1)
            goto L_0x0107
        L_0x00ef:
            boolean r4 = r9 instanceof X.AnonymousClass1fS
            if (r4 == 0) goto L_0x010f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingManager/setShareLocation/can't share location with broadcast remote_resource; messageKey="
            X.C18260x0.A1S(r1, r0, r12)
        L_0x00fc:
            r0 = r22
            r6.A0P(r0)
        L_0x0101:
            X.3Lv r1 = r3.A0C
            r0 = 4
            r1.A0b(r7, r0)
        L_0x0107:
            X.7ky r0 = r3.A07
            if (r0 == 0) goto L_0x010e
            r0.A04(r3)
        L_0x010e:
            return
        L_0x010f:
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A03(r9)
            r0.add(r4)
        L_0x0116:
            java.lang.Object r10 = r6.A0R
            monitor-enter(r10)
            java.util.Map r13 = r6.A0C()     // Catch:{ all -> 0x01db }
            java.lang.Object r14 = r13.get(r9)     // Catch:{ all -> 0x01db }
            X.2QE r14 = (X.AnonymousClass2QE) r14     // Catch:{ all -> 0x01db }
            if (r14 == 0) goto L_0x014b
            X.2z0 r5 = r14.A02     // Catch:{ all -> 0x01db }
            boolean r4 = r5.equals(r12)     // Catch:{ all -> 0x01db }
            if (r4 == 0) goto L_0x0138
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "LocationSharingManager/setShareLocation/already enabled for this message; messageKey="
            X.C18260x0.A1R(r1, r0, r12)     // Catch:{ all -> 0x01db }
            monitor-exit(r10)     // Catch:{ all -> 0x01db }
            goto L_0x00fc
        L_0x0138:
            r13.remove(r9)     // Catch:{ all -> 0x01db }
            X.C621233o.A01(r6, r5)     // Catch:{ all -> 0x01db }
            X.2s2 r15 = r6.A0J     // Catch:{ all -> 0x01db }
            java.util.List r14 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x01db }
            long r4 = X.C56612sH.A08(r6)     // Catch:{ all -> 0x01db }
            r15.A06(r14, r4)     // Catch:{ all -> 0x01db }
        L_0x014b:
            long r4 = r6.A03()     // Catch:{ all -> 0x01db }
            r8.A01 = r4     // Catch:{ all -> 0x01db }
            X.2QE r4 = new X.2QE     // Catch:{ all -> 0x01db }
            r4.<init>(r12, r0, r1)     // Catch:{ all -> 0x01db }
            r13.put(r9, r4)     // Catch:{ all -> 0x01db }
            X.2s2 r13 = r6.A0J     // Catch:{ all -> 0x01db }
            X.C626936e.A06(r9)     // Catch:{ all -> 0x01db }
            java.lang.String r5 = r12.A01     // Catch:{ all -> 0x01db }
            java.util.ArrayList r4 = X.C18290x4.A0y(r0)     // Catch:{ all -> 0x01db }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x01db }
        L_0x0168:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x018c
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x01db }
            X.C626936e.A06(r14)     // Catch:{ all -> 0x01db }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ all -> 0x01db }
            X.2z0 r19 = X.AnonymousClass2z0.A04(r9, r5)     // Catch:{ all -> 0x01db }
            X.2vh r0 = new X.2vh     // Catch:{ all -> 0x01db }
            r18 = r14
            r20 = r1
            r16 = r0
            r17 = r9
            r16.<init>(r17, r18, r19, r20)     // Catch:{ all -> 0x01db }
            r4.add(r0)     // Catch:{ all -> 0x01db }
            goto L_0x0168
        L_0x018c:
            r13.A07(r4)     // Catch:{ all -> 0x01db }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "LocationSharingManager/setShareLocation; saved sharing; message.key="
            X.AnonymousClass000.A17(r12, r0, r11, r4)     // Catch:{ all -> 0x01db }
            r4.append(r1)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "; sequenceNumber="
            r4.append(r0)     // Catch:{ all -> 0x01db }
            long r0 = r8.A01     // Catch:{ all -> 0x01db }
            X.C18260x0.A1I(r4, r0)     // Catch:{ all -> 0x01db }
            monitor-exit(r10)     // Catch:{ all -> 0x01db }
            X.8qC r0 = r6.A0M
            X.3Lv r0 = X.AnonymousClass0x9.A0M(r0)
            r0.A0Y(r8)
            r6.A0O()
            X.2oU r0 = r6.A0E
            android.content.Context r0 = r0.A00
            com.whatsapp.location.LocationSharingService.A04(r0, r6)
            java.util.List r0 = r6.A0V
            java.util.Iterator r1 = r0.iterator()
        L_0x01bf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r0 = r1.next()
            X.4D8 r0 = (X.AnonymousClass4D8) r0
            X.C626936e.A06(r9)
            r0.BcE(r9)
            goto L_0x01bf
        L_0x01d2:
            android.os.Handler r1 = r6.A06
            r0 = 15
            X.C71353by.A00(r1, r6, r8, r0)
            goto L_0x00fc
        L_0x01db:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01db }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34071uB.A0C(java.lang.Object):void");
    }

    public void onLocationChanged(Location location) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapDownload/onLocationChanged/time diff=");
        A0o.append(C18280x3.A08(System.currentTimeMillis(), location.getTime()));
        A0o.append("; accuracy=");
        A0o.append(location.getAccuracy());
        AnonymousClass0x2.A18(A0o);
        if (C622534h.A01(location, this.A02)) {
            this.A02 = location;
        }
        int i = this.A00 + 1;
        this.A00 = i;
        if (i >= 2 || location.getAccuracy() < 80.0f) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("MapDownload/onLocationChanged/locationReady; updateCount=");
            C18260x0.A1F(A0o2, this.A00);
            this.A03 = location;
            this.A05 = true;
        }
    }

    public void onProviderDisabled(String str) {
        C18260x0.A0q("MapDownload/onProviderDisabled/provider=", str, AnonymousClass001.A0o());
    }

    public void onProviderEnabled(String str) {
        C18260x0.A0q("MapDownload/onProviderEnabled/provider=", str, AnonymousClass001.A0o());
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapDownload/onStatusChanged/provider=");
        A0o.append(str);
        C18260x0.A0w("; status=", A0o, i);
    }
}
