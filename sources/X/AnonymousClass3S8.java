package X;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.3S8  reason: invalid class name */
public class AnonymousClass3S8 implements AnonymousClass66Y {
    public C72173dI A00;
    public final C111095hX A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final C52602lk A04;
    public final C51922kb A05;
    public final C55532qV A06;
    public final C56002rG A07;
    public final Object A08 = AnonymousClass002.A0D();
    public volatile boolean A09 = false;

    public boolean A03(C60222yC r15, boolean z) {
        C60222yC r10 = r15;
        int i = r15.A01;
        if ((Integer.valueOf(i) != null && 999 == i) || 170 == i || 150 == i) {
            return false;
        }
        long A0H = this.A02.A0H();
        long j = r15.A02;
        int i2 = r15.A04;
        if (j == -1) {
            if (!z) {
                this.A00.execute(new C70283aF(this, r10, 14, A0H));
                return true;
            }
            A02(r15, A0H);
            return true;
        } else if (C18290x4.A0B(A0H) <= j + (((long) i2) * 3600)) {
            return true;
        } else {
            if (!z) {
                this.A00.execute(new C70123Zz(this, 48, r15));
                return false;
            }
            A01(r15, 150);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r12 != 999) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C60222yC r11, int r12) {
        /*
            r10 = this;
            X.2kb r2 = r10.A05
            r1 = 0
            r0 = 1
            if (r12 == r0) goto L_0x0038
            r0 = 100
            if (r12 == r0) goto L_0x0038
            r0 = 110(0x6e, float:1.54E-43)
            if (r12 == r0) goto L_0x0038
            r0 = 120(0x78, float:1.68E-43)
            if (r12 == r0) goto L_0x0038
            r0 = 130(0x82, float:1.82E-43)
            if (r12 == r0) goto L_0x0038
            r0 = 150(0x96, float:2.1E-43)
            if (r12 == r0) goto L_0x0038
            r0 = 170(0xaa, float:2.38E-43)
            if (r12 == r0) goto L_0x0038
            r0 = 999(0x3e7, float:1.4E-42)
            if (r12 == r0) goto L_0x0038
        L_0x0022:
            X.7NA r0 = r11.A05
            int r4 = r0.A00
            int r5 = r1.intValue()
            long r7 = r11.A02
            int r6 = r11.A00
            r9 = 1
            X.34e r3 = new X.34e
            r3.<init>(r4, r5, r6, r7, r9)
            r2.A00(r3, r1)
            return
        L_0x0038:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3S8.A00(X.2yC, int):void");
    }

    public void A01(C60222yC r8, int i) {
        Integer valueOf;
        int i2 = r8.A05.A00;
        int i3 = r8.A01;
        if (999 != i) {
            if (!AnonymousClass34O.A08.containsKey(Integer.valueOf(i))) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("UserNoticeBadgeManager/transitionUserNoticeBadgeState encountered invalid stage value=");
                A0o.append(i);
                C18260x0.A0x(" when trying to update the stage for notice with id=", A0o, i2);
                return;
            }
        }
        A00(r8, i);
        Integer valueOf2 = Integer.valueOf(i3);
        if ((valueOf2 != null && 999 == valueOf2.intValue()) || ((valueOf = Integer.valueOf(i)) != null && 999 == valueOf.intValue())) {
            this.A06.A01(i2);
            this.A04.A00(i2, 999);
        } else if (AnonymousClass34O.A01(valueOf, valueOf2)) {
            if (valueOf2 != null) {
                int intValue = valueOf2.intValue();
                if (1 == intValue || 100 == intValue) {
                    if (valueOf == null || !AnonymousClass34O.A08.containsKey(valueOf)) {
                        return;
                    }
                    r8.A01 = i;
                    this.A06.A03(r8);
                    this.A04.A00(i2, i);
                } else if (110 == intValue || 120 == intValue || 130 == intValue) {
                    Object obj = AnonymousClass34O.A08.get(valueOf2);
                    if (obj == null) {
                        obj = C72023d3.A00;
                    }
                    List list = (List) obj;
                    if (!(i == 150 || !C18310x6.A1X(list) || AnonymousClass000.A09(list, 0) == i)) {
                        return;
                    }
                    r8.A01 = i;
                    this.A06.A03(r8);
                    this.A04.A00(i2, i);
                }
            }
            if (150 != i3) {
                if (170 != i3) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("UserNoticeBadgeManager/transitionUserNoticeBadgeStage notice with id:");
                    A0o2.append(i2);
                    C18260x0.A1K(A0o2, " has invalid stage TRIGGERED on client side. Removing this notice's content from client side.");
                    this.A06.A01(i2);
                    return;
                }
                return;
            }
            r8.A01 = i;
            this.A06.A03(r8);
            this.A04.A00(i2, i);
        }
    }

    public void A02(C60222yC r8, long j) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        if (r8.A02 == -1) {
            r8.A02 = seconds;
            this.A06.A03(r8);
        }
    }

    public AnonymousClass3S8(C111095hX r2, C56612sH r3, AnonymousClass1VX r4, C52602lk r5, C51922kb r6, C55532qV r7, C56002rG r8, AnonymousClass4FS r9) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A00 = C72173dI.A00(r9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r5 = X.AnonymousClass002.A0K();
        r1 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r1.hasNext() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r0 = (X.C622234e) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        X.C18270x1.A1K(r5, r0.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r4 = r13.A06;
        r2 = r4.A00().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r2.hasNext() == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r1 = ((X.C60222yC) r2.next()).A05.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r5.contains(java.lang.Integer.valueOf(r1)) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        r4.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r3 = r4.A07;
        r2 = X.AnonymousClass001.A0v(X.C73813g7.A0D(X.AnonymousClass0x7.A10(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r2.hasNext() == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r1 = ((X.C53722nY) r2.next()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r5.contains(java.lang.Integer.valueOf(r1)) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r4.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        r6 = X.AnonymousClass001.A0s();
        r11 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (r11.hasNext() == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        r2 = (X.C622234e) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b4, code lost:
        if (r2 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        com.whatsapp.util.Log.e("UserNoticeBadgeManager/getUpdatedUserNoticeList encountered null when parsing through list of notice metadata objects retrieved from the server.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        r1 = X.C73813g7.A0D(X.AnonymousClass0x7.A10(r3));
        r7 = java.lang.Integer.valueOf(r2.A01);
        r10 = (X.C53722nY) r1.get(r7);
        r5 = r4.A09;
        r9 = (X.C622234e) X.C73813g7.A0D(X.AnonymousClass0x7.A10(r5)).get(r7);
        r8 = X.AnonymousClass34O.A00(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e6, code lost:
        if (r8 == null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        if (999 != r8.intValue()) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        if (r10 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f2, code lost:
        r4.A02(r10.A00, r10.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        if (r10 == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        if (r2.A03 > r10.A01) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        if (r9 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        if (X.AnonymousClass34O.A01(r8, X.AnonymousClass34O.A00(r9.A00)) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0110, code lost:
        r1 = X.AnonymousClass34O.A00(r2.A00).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (1 == r1) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        if (r1 == 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0121, code lost:
        if (100 == r1) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0125, code lost:
        if (999 == r1) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0131, code lost:
        if (X.AnonymousClass34O.A08.containsKey(java.lang.Integer.valueOf(r1)) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0133, code lost:
        r1 = r2.A00;
        r0 = (X.C622234e) X.C18280x3.A0V(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013b, code lost:
        if (r0 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013d, code lost:
        r0.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013f, code lost:
        r2 = r4.A06;
        r0 = (X.C60222yC) X.C18280x3.A0V(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
        if (r0 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0149, code lost:
        r0.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        r1 = r4.A04;
        r1.A06(X.C18300x5.A0w(r5));
        r1.A04(X.C18300x5.A0w(r2));
        r1.A05(X.C18300x5.A0w(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0164, code lost:
        r6.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016d, code lost:
        if (r6.size() <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016f, code lost:
        r6.size();
        r4.A04.A06(r6);
        r5 = r4.A09;
        X.AnonymousClass0x7.A10(r5).clear();
        r3 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
        if (r3.hasNext() == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018a, code lost:
        r2 = (X.C622234e) r3.next();
        X.AnonymousClass0x7.A10(r5).put(java.lang.Integer.valueOf(r2.A01), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019e, code lost:
        r10 = X.C73783g4.A0c(r6);
        r1 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01aa, code lost:
        if (r1.hasNext() == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        X.C18270x1.A1K(r10, ((X.C622234e) r1.next()).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01be, code lost:
        X.C18260x0.A1R(X.AnonymousClass001.A0o(), "UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/notices id ", r10);
        r3 = new X.AnonymousClass0Q9();
        r3.A02("notices_id", X.C73723fy.A0V(r10));
        r5 = X.C56972sr.A00(r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01dc, code lost:
        if (r5 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01de, code lost:
        r8 = "";
        r5 = X.C620733j.A00(X.C18300x5.A0C().authority("whatsapp.com").appendPath("user-notice").appendPath("v2").appendQueryParameter("ids", X.C73723fy.A07(",", "", r8, "...", r10, (X.AnonymousClass4GQ) null, -1)), r5, r4.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021e, code lost:
        if (X.AnonymousClass000.A0B(r4.A02.A00).densityDpi > 240) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0220, code lost:
        r0 = "hdpi";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0222, code lost:
        r0 = X.C18290x4.A0H(r5, "img-size", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0226, code lost:
        if (r0 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0228, code lost:
        r3.A00.put("url", r0.toString());
        r3 = X.C18290x4.A0P(X.C18270x1.A07(), r3.A00(), new X.AnonymousClass0Aw(com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.class), "tag.whatsapp.usernotice.cms.content.fetch");
        r1 = X.AnonymousClass001.A0o();
        r1.append("tag.whatsapp.usernotice.cms.content.fetch.");
        X.C72333dY.A01(r4.A05).A03(X.C02320Fs.REPLACE, r3, X.AnonymousClass000.A0X(X.C73723fy.A07(",", "", r8, "...", r10, (X.AnonymousClass4GQ) null, -1), r1)).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x026d, code lost:
        r0 = "xxhdpi";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0271, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notices id ");
        X.C18260x0.A1K(r1, X.C73723fy.A09(",", r10));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BEx(java.util.List r14, boolean r15, boolean r16) {
        /*
            r13 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UserNoticeManager/handleDisclosures/metadata list size: "
            X.C18260x0.A1C(r0, r1, r14)
            X.1VX r2 = r13.A03
            X.2vE r1 = X.C58422vE.A01
            r0 = 1799(0x707, float:2.521E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x026b
            java.lang.Object r3 = r13.A08
            monitor-enter(r3)
            r2 = 0
        L_0x0019:
            boolean r1 = r13.A09     // Catch:{ all -> 0x01bb }
            r0 = 15
            if (r1 != 0) goto L_0x002f
            if (r2 >= r0) goto L_0x01b8
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x002c
        L_0x0027:
            java.lang.String r0 = "UserNoticeCmsManager/onUserNoticeListReceived wait interrupted"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01bb }
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x002f:
            if (r2 >= r0) goto L_0x01b8
            monitor-exit(r3)     // Catch:{ all -> 0x01bb }
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            java.util.Iterator r1 = r14.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r1.next()
            X.34e r0 = (X.C622234e) r0
            if (r0 == 0) goto L_0x003a
            int r0 = r0.A01
            X.C18270x1.A1K(r5, r0)
            goto L_0x003a
        L_0x004e:
            X.2qV r4 = r13.A06
            java.util.List r0 = r4.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x0058:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r2.next()
            X.2yC r0 = (X.C60222yC) r0
            X.7NA r0 = r0.A05
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0058
            r4.A01(r1)
            goto L_0x0058
        L_0x0076:
            X.66R r3 = r4.A07
            java.util.Map r0 = X.AnonymousClass0x7.A10(r3)
            java.util.Map r0 = X.C73813g7.A0D(r0)
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r0)
        L_0x0084:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r2.next()
            X.2nY r0 = (X.C53722nY) r0
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0084
            r4.A01(r1)
            goto L_0x0084
        L_0x00a0:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r11 = r14.iterator()
        L_0x00a8:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r2 = r11.next()
            X.34e r2 = (X.C622234e) r2
            if (r2 != 0) goto L_0x00bc
            java.lang.String r0 = "UserNoticeBadgeManager/getUpdatedUserNoticeList encountered null when parsing through list of notice metadata objects retrieved from the server."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00a8
        L_0x00bc:
            java.util.Map r0 = X.AnonymousClass0x7.A10(r3)
            java.util.Map r1 = X.C73813g7.A0D(r0)
            int r0 = r2.A01
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Object r10 = r1.get(r7)
            X.2nY r10 = (X.C53722nY) r10
            X.66R r5 = r4.A09
            java.util.Map r0 = X.AnonymousClass0x7.A10(r5)
            java.util.Map r0 = X.C73813g7.A0D(r0)
            java.lang.Object r9 = r0.get(r7)
            X.34e r9 = (X.C622234e) r9
            int r0 = r2.A00
            java.lang.Integer r8 = X.AnonymousClass34O.A00(r0)
            if (r8 == 0) goto L_0x00fa
            r1 = 999(0x3e7, float:1.4E-42)
            int r0 = r8.intValue()
            if (r1 != r0) goto L_0x00fa
            if (r10 == 0) goto L_0x00a8
            int r1 = r10.A00
            java.lang.String r0 = r10.A06
            r4.A02(r1, r0)
            goto L_0x00a8
        L_0x00fa:
            if (r10 == 0) goto L_0x0164
            int r1 = r2.A03
            int r0 = r10.A01
            if (r1 > r0) goto L_0x0164
            if (r9 == 0) goto L_0x00a8
            int r0 = r9.A00
            java.lang.Integer r0 = X.AnonymousClass34O.A00(r0)
            boolean r0 = X.AnonymousClass34O.A01(r8, r0)
            if (r0 == 0) goto L_0x00a8
            int r0 = r2.A00
            java.lang.Integer r0 = X.AnonymousClass34O.A00(r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r0 == r1) goto L_0x0133
            if (r1 == 0) goto L_0x0133
            r0 = 100
            if (r0 == r1) goto L_0x0133
            r0 = 999(0x3e7, float:1.4E-42)
            if (r0 == r1) goto L_0x0133
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Map r0 = X.AnonymousClass34O.A08
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00a8
        L_0x0133:
            int r1 = r2.A00
            java.lang.Object r0 = X.C18280x3.A0V(r7, r5)
            X.34e r0 = (X.C622234e) r0
            if (r0 == 0) goto L_0x013f
            r0.A00 = r1
        L_0x013f:
            X.66R r2 = r4.A06
            java.lang.Object r0 = X.C18280x3.A0V(r7, r2)
            X.2yC r0 = (X.C60222yC) r0
            if (r0 == 0) goto L_0x014b
            r0.A01 = r1
        L_0x014b:
            X.2rG r1 = r4.A04
            java.util.Collection r0 = X.C18300x5.A0w(r5)
            r1.A06(r0)
            java.util.Collection r0 = X.C18300x5.A0w(r2)
            r1.A04(r0)
            java.util.Collection r0 = X.C18300x5.A0w(r3)
            r1.A05(r0)
            goto L_0x00a8
        L_0x0164:
            r6.add(r2)
            goto L_0x00a8
        L_0x0169:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x026b
            r6.size()
            X.2rG r0 = r4.A04
            r0.A06(r6)
            X.66R r5 = r4.A09
            java.util.Map r0 = X.AnonymousClass0x7.A10(r5)
            r0.clear()
            java.util.Iterator r3 = r6.iterator()
        L_0x0184:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x019e
            java.lang.Object r2 = r3.next()
            X.34e r2 = (X.C622234e) r2
            java.util.Map r1 = X.AnonymousClass0x7.A10(r5)
            int r0 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r0, r2)
            goto L_0x0184
        L_0x019e:
            java.util.ArrayList r10 = X.C73783g4.A0c(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x01a6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01be
            java.lang.Object r0 = r1.next()
            X.34e r0 = (X.C622234e) r0
            int r0 = r0.A01
            X.C18270x1.A1K(r10, r0)
            goto L_0x01a6
        L_0x01b8:
            monitor-exit(r3)     // Catch:{ all -> 0x01bb }
            goto L_0x026b
        L_0x01bb:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01bb }
            throw r0
        L_0x01be:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/notices id "
            X.C18260x0.A1R(r1, r0, r10)
            X.0Q9 r3 = new X.0Q9
            r3.<init>()
            int[] r1 = X.C73723fy.A0V(r10)
            java.lang.String r0 = "notices_id"
            r3.A02(r0, r1)
            X.2sr r0 = r4.A00
            com.whatsapp.Me r5 = X.C56972sr.A00(r0)
            if (r5 == 0) goto L_0x0271
            android.net.Uri$Builder r1 = X.C18300x5.A0C()
            java.lang.String r0 = "whatsapp.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "user-notice"
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = "v2"
            android.net.Uri$Builder r2 = r1.appendPath(r0)
            java.lang.String r6 = ","
            r11 = 0
            java.lang.String r7 = ""
            r12 = -1
            java.lang.String r9 = "..."
            r8 = r7
            java.lang.String r1 = X.C73723fy.A07(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "ids"
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r0, r1)
            X.33j r0 = r4.A03
            android.net.Uri$Builder r5 = X.C620733j.A00(r1, r5, r0)
            java.lang.String r2 = "img-size"
            X.2oU r0 = r4.A02
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r1 = r0.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x026d
            java.lang.String r0 = "hdpi"
        L_0x0222:
            android.net.Uri r0 = X.C18290x4.A0H(r5, r2, r0)
            if (r0 == 0) goto L_0x0271
            java.lang.String r2 = "url"
            java.lang.String r1 = r0.toString()
            java.util.Map r0 = r3.A00
            r0.put(r2, r1)
            X.0Xq r3 = r3.A00()
            X.0XS r2 = X.C18270x1.A07()
            java.lang.Class<com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker> r0 = com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.class
            X.0Aw r1 = new X.0Aw
            r1.<init>(r0)
            java.lang.String r0 = "tag.whatsapp.usernotice.cms.content.fetch"
            X.0Ay r3 = X.C18290x4.A0P(r2, r3, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "tag.whatsapp.usernotice.cms.content.fetch."
            r1.append(r0)
            java.lang.String r0 = X.C73723fy.A07(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.1uL r0 = r4.A05
            X.0Xb r1 = X.C72333dY.A01(r0)
            X.0Fs r0 = X.C02320Fs.REPLACE
            X.0XO r0 = r1.A03(r0, r3, r2)
            r0.A02()
        L_0x026b:
            r0 = 1
            return r0
        L_0x026d:
            java.lang.String r0 = "xxhdpi"
            goto L_0x0222
        L_0x0271:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notices id "
            r1.append(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.C73723fy.A09(r0, r10)
            X.C18260x0.A1K(r1, r0)
            goto L_0x026b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3S8.BEx(java.util.List, boolean, boolean):boolean");
    }

    public void BEw(JSONObject jSONObject, int[] iArr) {
    }

    public void BRF(int[] iArr, int i) {
    }
}
