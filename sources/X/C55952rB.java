package X;

import java.util.List;

/* renamed from: X.2rB  reason: invalid class name and case insensitive filesystem */
public class C55952rB {
    public Object A00 = AnonymousClass002.A0D();
    public Object A01 = AnonymousClass002.A0D();
    public final C29171iO A02;
    public final AnonymousClass1VX A03;
    public final C40712Hl A04;
    public final C44582Wp A05;
    public final C56372rs A06;
    public final C59562x7 A07;
    public final C52602lk A08;
    public final AnonymousClass4FS A09;
    public volatile int A0A = 0;
    public volatile int A0B = 0;
    public volatile boolean A0C = false;
    public volatile boolean A0D = false;
    public volatile boolean A0E = false;

    public final void A01() {
        if (!this.A0C) {
            this.A0C = true;
            this.A06.A01 = this;
        }
    }

    public void A04(C622234e[] r20) {
        C56372rs r5 = this.A06;
        for (int i = 0; i < r20.length; i++) {
            C622234e r3 = r20[i];
            if (r3.A02 != 2) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("PrivacyDisclosureStore/registerClientDrivenDisclosures skip registration notice Id: ");
                A0o.append(r20[i].A01);
                C18260x0.A1J(A0o, " because it's not PDFN disclosure");
            } else {
                AnonymousClass7PW r32 = (AnonymousClass7PW) C18290x4.A0j(r5.A05, r3.A01);
                C622234e r1 = r20[i];
                if (r32 == null) {
                    r5.A05(r1.A01, 0, 2, r1.A03, 1);
                } else if (r1.A03 > r32.A03 && r32.A00 == 1) {
                    C622234e r12 = r20[i];
                    r5.A06(Integer.valueOf(r12.A03), (String) null, (String) null, r12.A01, 0, -1, false);
                } else if (r32.A00 == 0) {
                    C56372rs r11 = r5;
                    r11.A06(Integer.valueOf(r32.A03), r32.A07, r32.A06, r20[i].A01, r32.A01, 1, false);
                }
            }
        }
    }

    public boolean A05(int i) {
        C56372rs r0 = this.A06;
        r0.A04();
        AnonymousClass7PW r02 = (AnonymousClass7PW) C18290x4.A0j(r0.A05, i);
        if (r02 != null) {
            return AnonymousClass000.A1U(r02.A01, 5);
        }
        throw AnonymousClass001.A0c("Disclosure is not eligible for current user");
    }

    public C55952rB(C29171iO r3, AnonymousClass1VX r4, C40712Hl r5, C44582Wp r6, C56372rs r7, C59562x7 r8, C52602lk r9, AnonymousClass4FS r10) {
        this.A03 = r4;
        this.A09 = r10;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007b, code lost:
        if (r7.get(r5) == null) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(int r10) {
        /*
            r9 = this;
            r9.A01()
            X.2rs r6 = r9.A06
            java.lang.String r8 = r6.A03(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x00dd
            if (r8 != 0) goto L_0x008b
            java.util.concurrent.ConcurrentHashMap r7 = r6.A05
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r7.get(r5)
            r0 = 1
            if (r1 != 0) goto L_0x001f
            r0 = 0
        L_0x001f:
            r2 = 1
            if (r0 != 0) goto L_0x0075
            java.lang.Object r4 = r9.A01
            monitor-enter(r4)
            boolean r0 = r9.A0E     // Catch:{ all -> 0x0072 }
            r3 = 0
            if (r0 == 0) goto L_0x002c
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            goto L_0x007d
        L_0x002c:
            r9.A0E = r2     // Catch:{ all -> 0x0072 }
            r9.A0B = r10     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            r9.A01()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0048
            X.1iO r0 = r9.A02
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0048
        L_0x0040:
            X.2lk r0 = r9.A08
            r0.A01(r2, r10)
            monitor-enter(r4)
            r2 = 0
            goto L_0x004a
        L_0x0048:
            r2 = 0
            goto L_0x0040
        L_0x004a:
            boolean r1 = r9.A0E     // Catch:{ all -> 0x006f }
            r0 = 12
            if (r1 == 0) goto L_0x0060
            if (r2 >= r0) goto L_0x0064
            r0 = 3000(0xbb8, double:1.482E-320)
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x005d
        L_0x0058:
            java.lang.String r0 = "PrivacyDisclosureDataManager/isEligibleForDisclosure wait interrupted"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x006f }
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x0060:
            if (r2 >= r0) goto L_0x0064
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            goto L_0x0077
        L_0x0064:
            r9.A0E = r3     // Catch:{ all -> 0x006f }
            r9.A0B = r3     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "PrivacyDisclosureDataManager/isEligibleForDisclosure timed out"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            goto L_0x007d
        L_0x006f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            r0 = 1
            goto L_0x007e
        L_0x0077:
            java.lang.Object r0 = r7.get(r5)
            if (r0 != 0) goto L_0x0075
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 != 0) goto L_0x008b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PrivacyDisclosureDataManager/getDisclosureById not eligible "
            X.C18260x0.A0z(r0, r1, r10)
            r0 = 0
            return r0
        L_0x008b:
            java.lang.Object r4 = r9.A00
            monitor-enter(r4)
            boolean r0 = r9.A0D     // Catch:{ all -> 0x00da }
            r7 = 0
            if (r0 == 0) goto L_0x0095
            monitor-exit(r4)     // Catch:{ all -> 0x00da }
            goto L_0x00d4
        L_0x0095:
            r5 = 1
            r9.A0D = r5     // Catch:{ all -> 0x00da }
            r9.A0A = r10     // Catch:{ all -> 0x00da }
            monitor-exit(r4)     // Catch:{ all -> 0x00da }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.C18270x1.A1K(r3, r10)
            X.2x7 r2 = r9.A07
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.A01(r3, r0, r5)
            monitor-enter(r4)
            r3 = 0
            r2 = 0
        L_0x00ac:
            boolean r1 = r9.A0D     // Catch:{ all -> 0x00d7 }
            r0 = 20
            if (r1 == 0) goto L_0x00c2
            if (r2 >= r0) goto L_0x00c2
            r0 = 3000(0xbb8, double:1.482E-320)
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x00ba }
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r0 = "PrivacyDisclosureDataManager/downloadDisclosureById wait interrupted"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00d7 }
        L_0x00bf:
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00c2:
            if (r2 < r0) goto L_0x00cf
            r9.A0D = r3     // Catch:{ all -> 0x00d7 }
            r9.A0A = r3     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "PrivacyDisclosureDataManager/downloadDisclosureById timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
            goto L_0x00d4
        L_0x00cf:
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
            java.lang.String r7 = r6.A03(r10)
        L_0x00d4:
            if (r7 == 0) goto L_0x00dd
            return r7
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
            throw r0
        L_0x00da:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00da }
            throw r0
        L_0x00dd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55952rB.A00(int):java.lang.String");
    }

    public void A02(int i, int i2) {
        A01();
        C56372rs r5 = this.A06;
        r5.A04();
        int i3 = i;
        AnonymousClass7PW r2 = (AnonymousClass7PW) C18290x4.A0j(r5.A05, i);
        if (r2 == null) {
            C18260x0.A0x("PrivacyDisclosureDataManager/savedisclosureresult disclosure does not exist id = ", AnonymousClass001.A0o(), i);
            return;
        }
        int i4 = r2.A01;
        int i5 = i2;
        if (i4 != i2 && i2 <= 1000) {
            List list = C39392Bu.A01;
            Integer valueOf = Integer.valueOf(i4);
            if (!list.contains(valueOf)) {
                if (i4 < 400 ? i4 != 145 : i4 > 499) {
                    if ((!(!list.contains(valueOf)) || !AnonymousClass0x7.A1U(list, i2)) && i4 >= i2) {
                        return;
                    }
                }
                r5.A06((Integer) null, (String) null, (String) null, i3, i5, -1, false);
                this.A08.A00(i, r2.A01);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r4.A00 == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.util.List r7, boolean r8) {
        /*
            r6 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r7.iterator()
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r3 = r4.next()
            X.2rs r0 = r6.A06
            java.util.concurrent.ConcurrentHashMap r0 = r0.A05
            java.lang.Object r2 = r0.get(r3)
            X.7PW r2 = (X.AnonymousClass7PW) r2
            if (r2 == 0) goto L_0x0008
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x0008
            int r1 = r2.A01
            if (r1 < r0) goto L_0x002c
            r0 = 400(0x190, float:5.6E-43)
            if (r1 >= r0) goto L_0x002c
            goto L_0x0008
        L_0x002c:
            r5.add(r3)
            goto L_0x0008
        L_0x0030:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0051
            X.1iO r4 = r6.A02
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0052
            r2 = 10000(0x2710, double:4.9407E-320)
        L_0x003e:
            if (r8 == 0) goto L_0x004b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x004b
            boolean r0 = r4.A00
            r1 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            X.2x7 r0 = r6.A07
            r0.A01(r5, r2, r1)
        L_0x0051:
            return
        L_0x0052:
            r2 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55952rB.A03(java.util.List, boolean):void");
    }
}
