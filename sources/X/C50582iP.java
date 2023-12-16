package X;

import android.content.pm.Signature;

/* renamed from: X.2iP  reason: invalid class name and case insensitive filesystem */
public class C50582iP {
    public Signature A00;
    public String A01;
    public final C56972sr A02;
    public final C54552ou A03;
    public final C29441ip A04;
    public final C44872Xu A05;
    public final C620633i A06;
    public final C54292oU A07;
    public final AnonymousClass33p A08;
    public final C620733j A09;
    public final C45202Zb A0A;
    public final AnonymousClass1VX A0B;
    public final C59222wY A0C;
    public final AnonymousClass2RQ A0D;
    public final C52992mN A0E;
    public final C66653Mg A0F;
    public final AnonymousClass3Au A0G;
    public final C60152y5 A0H;

    public final int[] A03() {
        String[] split = "2.23.26.14".split("\\.", 4);
        int length = split.length;
        if (length >= 3) {
            int[] iArr = new int[length];
            int i = 0;
            while (i < length) {
                try {
                    iArr[i] = Integer.parseInt(split[i]);
                    i++;
                } catch (NumberFormatException e) {
                    AssertionError A0i = AnonymousClass0x9.A0i(AnonymousClass000.A0V("non numeric portion of version name; VERSION_NAME=", "2.23.26.14", AnonymousClass001.A0o()));
                    A0i.initCause(e);
                    throw A0i;
                }
            }
            return iArr;
        }
        throw AnonymousClass0x9.A0i(AnonymousClass000.A0V("expected at least three parts in version name; VERSION_NAME=", "2.23.26.14", AnonymousClass001.A0o()));
    }

    public C50582iP(C56972sr r2, C54552ou r3, C29441ip r4, C44872Xu r5, C620633i r6, C54292oU r7, AnonymousClass33p r8, C620733j r9, C45202Zb r10, AnonymousClass1VX r11, C59222wY r12, AnonymousClass2RQ r13, C52992mN r14, C66653Mg r15, AnonymousClass3Au r16, C60152y5 r17) {
        this.A07 = r7;
        this.A0B = r11;
        this.A02 = r2;
        this.A0D = r13;
        this.A0G = r16;
        this.A06 = r6;
        this.A09 = r9;
        this.A0F = r15;
        this.A0E = r14;
        this.A08 = r8;
        this.A05 = r5;
        this.A0A = r10;
        this.A0H = r17;
        this.A04 = r4;
        this.A03 = r3;
        this.A0C = r12;
    }

    public static AnonymousClass1E7 A00(C130546c9 r0, Object obj) {
        r0.A07();
        AnonymousClass1E7 r02 = (AnonymousClass1E7) r0.A00;
        obj.getClass();
        return r02;
    }

    public static AnonymousClass1EN A01(C130546c9 r0) {
        r0.A07();
        return (AnonymousClass1EN) r0.A00;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.AnonymousClass1EN A02(X.C41512Kn r15, com.whatsapp.jid.UserJid r16, X.AnonymousClass2OU r17, int r18, int r19, long r20, boolean r22) {
        /*
            r14 = this;
            r10 = 1
            r5 = r16
            boolean r13 = X.AnonymousClass000.A1X(r5)
            X.1EN r0 = X.AnonymousClass1EN.DEFAULT_INSTANCE
            X.6c9 r4 = r0.A0G()
            if (r13 != 0) goto L_0x003f
            java.lang.String r0 = X.AnonymousClass36P.A05(r5)     // Catch:{ NumberFormatException -> 0x0027 }
            X.C626936e.A06(r0)     // Catch:{ NumberFormatException -> 0x0027 }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0027 }
            X.1EN r3 = A01(r4)     // Catch:{ NumberFormatException -> 0x0027 }
            int r0 = r3.bitField0_     // Catch:{ NumberFormatException -> 0x0027 }
            r0 = r0 | 1
            r3.bitField0_ = r0     // Catch:{ NumberFormatException -> 0x0027 }
            r3.username_ = r1     // Catch:{ NumberFormatException -> 0x0027 }
            goto L_0x003f
        L_0x0027:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "jid prefix not numeric; prefix="
            r1.append(r0)
            java.lang.String r0 = r5.user
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            r0.initCause(r2)
            throw r0
        L_0x003f:
            X.1EN r1 = A01(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r0 = r22
            r1.passive_ = r0
            X.2sr r5 = r14.A02
            X.2og r0 = r5.A0D
            java.lang.String r2 = r0.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x006a
            X.1EN r1 = A01(r4)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.pushName_ = r2
        L_0x006a:
            X.1EN r1 = A01(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r0 = r18
            r1.sessionId_ = r0
            X.2mN r1 = r14.A0E
            boolean r3 = r1.A02()
            X.1EN r2 = A01(r4)
            int r0 = r2.bitField0_
            r0 = r0 | 64
            r2.bitField0_ = r0
            r2.shortConnect_ = r3
            boolean r0 = r5.A0Y()
            if (r0 == 0) goto L_0x00a9
            X.2Xu r0 = r14.A05
            X.2og r0 = r0.A01
            android.content.SharedPreferences r2 = r0.A01
            java.lang.String r0 = "registration_device_id"
            int r3 = X.C18280x3.A02(r2, r0)
            X.1EN r2 = A01(r4)
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.device_ = r3
        L_0x00a9:
            X.6cX r0 = r4.A00
            X.1EN r0 = (X.AnonymousClass1EN) r0
            X.1E7 r0 = r0.userAgent_
            if (r0 != 0) goto L_0x00b3
            X.1E7 r0 = X.AnonymousClass1E7.DEFAULT_INSTANCE
        L_0x00b3:
            X.6c9 r8 = r0.A0H()
            X.238 r0 = X.AnonymousClass238.A01
            X.6cX r2 = X.C18320x8.A0C(r8)
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            int r0 = r0.value
            r2.platform_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            int[] r5 = r14.A03()
            X.6cX r0 = r8.A00
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1DM r0 = r0.appVersion_
            if (r0 != 0) goto L_0x00d7
            X.1DM r0 = X.AnonymousClass1DM.DEFAULT_INSTANCE
        L_0x00d7:
            X.6c9 r7 = r0.A0H()
            r0 = 0
            r3 = r5[r0]
            X.6cX r2 = X.C18320x8.A0C(r7)
            X.1DM r2 = (X.AnonymousClass1DM) r2
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            r2.primary_ = r3
            r3 = r5[r10]
            X.6cX r2 = X.C18320x8.A0C(r7)
            X.1DM r2 = (X.AnonymousClass1DM) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.secondary_ = r3
            r0 = 2
            r3 = r5[r0]
            X.6cX r2 = X.C18320x8.A0C(r7)
            X.1DM r2 = (X.AnonymousClass1DM) r2
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.tertiary_ = r3
            int r2 = r5.length
            r0 = 4
            if (r2 != r0) goto L_0x0122
            r0 = 3
            r3 = r5[r0]
            X.6cX r2 = X.C18320x8.A0C(r7)
            X.1DM r2 = (X.AnonymousClass1DM) r2
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.quaternary_ = r3
        L_0x0122:
            X.6cX r2 = X.C18320x8.A0C(r8)
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            X.6cX r0 = r7.A06()
            X.1DM r0 = (X.AnonymousClass1DM) r0
            r0.getClass()
            r2.appVersion_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            X.33i r5 = r14.A06
            android.telephony.TelephonyManager r0 = r5.A0N()
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = r0.getNetworkOperator()
            X.34d r7 = X.AnonymousClass34d.A00(r0)
            java.lang.String r3 = r7.A00
            X.1E7 r2 = A00(r8, r3)
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.mcc_ = r3
            java.lang.String r3 = r7.A01
            X.1E7 r2 = A00(r8, r3)
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.mnc_ = r3
        L_0x0165:
            X.2RQ r9 = r14.A0D
            java.lang.String r3 = r9.A04
            X.1E7 r2 = A00(r8, r3)
            int r0 = r2.bitField0_
            r0 = r0 | 16
            r2.bitField0_ = r0
            r2.osVersion_ = r3
            java.lang.String r7 = r9.A03
            X.1E7 r2 = A00(r8, r7)
            int r0 = r2.bitField0_
            r0 = r0 | 32
            r2.bitField0_ = r0
            r2.manufacturer_ = r7
            java.lang.String r7 = r9.A00
            X.1E7 r2 = A00(r8, r7)
            int r0 = r2.bitField0_
            r0 = r0 | 64
            r2.bitField0_ = r0
            r2.device_ = r7
            java.lang.String r7 = r9.A02
            X.1E7 r2 = A00(r8, r7)
            int r0 = r2.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r0
            r2.osBuildNumber_ = r7
            java.lang.String r7 = r9.A01
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x01b3
            X.1E7 r2 = A00(r8, r7)
            int r0 = r2.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r2.bitField0_ = r0
            r2.deviceBoard_ = r7
        L_0x01b3:
            X.3Au r0 = r14.A0G
            X.2XL r0 = r0.BBI()
            java.lang.String r7 = r0.A01
            X.1E7 r2 = A00(r8, r7)
            int r0 = r2.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r2.bitField0_ = r0
            r2.phoneId_ = r7
            X.33p r7 = r14.A08
            java.lang.String r0 = r7.A0Y()
            byte[] r0 = X.AnonymousClass36l.A0T(r0)
            java.lang.String r9 = X.AnonymousClass0x7.A0s(r0)
            X.1E7 r2 = A00(r8, r9)
            int r0 = r2.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r2.bitField0_ = r0
            r2.deviceExpId_ = r9
            X.2Zb r0 = r14.A0A
            X.21O r0 = r0.A00()
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0357;
                case 2: goto L_0x035b;
                case 3: goto L_0x035f;
                default: goto L_0x01ee;
            }
        L_0x01ee:
            X.233 r0 = X.AnonymousClass233.PHONE
        L_0x01f0:
            X.6cX r2 = X.C18320x8.A0C(r8)
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            int r0 = r0.value
            r2.deviceType_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r2.bitField0_ = r0
            X.33j r11 = r14.A09
            java.lang.String r9 = r11.A07()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0221
            java.lang.String r0 = "zz"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0221
            X.1E7 r2 = A00(r8, r9)
            int r0 = r2.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r2.bitField0_ = r0
            r2.localeLanguageIso6391_ = r9
        L_0x0221:
            java.lang.String r9 = r11.A06()
            java.lang.String r0 = "ZZ"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0239
            X.1E7 r2 = A00(r8, r9)
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.localeCountryIso31661Alpha2_ = r9
        L_0x0239:
            X.22t r0 = X.C374722t.BETA
            X.6cX r2 = X.C18320x8.A0C(r8)
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            int r0 = r0.value
            r2.releaseChannel_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r2.bitField0_ = r0
            X.1EN r2 = A01(r4)
            X.6cX r0 = r8.A06()
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            r0.getClass()
            r2.userAgent_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            X.1ip r0 = r14.A04
            X.2hc r2 = r0.A0A()
            if (r2 == 0) goto L_0x031f
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0316
            X.237 r0 = X.AnonymousClass237.WIFI_UNKNOWN
        L_0x026e:
            X.1EN r2 = A01(r4)
            int r0 = r0.value
            r2.connectType_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r0
            X.2oU r0 = r14.A07
            android.content.Context r2 = r0.A00
            long r11 = X.AnonymousClass2BN.A00(r2)
            r8 = 1
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x028b
            r10 = 0
        L_0x028b:
            X.1EN r9 = A01(r4)
            int r8 = r9.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r0
            r9.bitField0_ = r8
            r9.oc_ = r10
            int r8 = r15.A00
            if (r8 != 0) goto L_0x02fe
            X.232 r9 = X.AnonymousClass232.SYSTEM
        L_0x029e:
            X.1Bi r0 = X.C21311Bi.DEFAULT_INSTANCE
            X.6c9 r10 = X.C18300x5.A0K(r0)
            X.6cX r8 = r10.A00
            X.1Bi r8 = (X.C21311Bi) r8
            int r0 = r9.value
            r8.dnsMethod_ = r0
            int r0 = r8.bitField0_
            r0 = r0 | 1
            r8.bitField0_ = r0
            boolean r9 = r15.A01
            X.6cX r8 = X.C18320x8.A0C(r10)
            X.1Bi r8 = (X.C21311Bi) r8
            int r0 = r8.bitField0_
            r0 = r0 | 2
            r8.bitField0_ = r0
            r8.appCached_ = r9
            X.6cX r0 = r10.A06()
            X.1Bi r0 = (X.C21311Bi) r0
            X.1EN r8 = A01(r4)
            r0.getClass()
            r8.dnsSource_ = r0
            int r0 = r8.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r8.bitField0_ = r0
        L_0x02d7:
            X.1EN r8 = A01(r4)
            int r0 = r8.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r8.bitField0_ = r0
            r0 = r19
            r8.connectAttemptCount_ = r0
            android.content.SharedPreferences r7 = X.AnonymousClass0x2.A0F(r7)
            java.lang.String r0 = "connection_lc"
            int r9 = X.C18280x3.A02(r7, r0)
            X.1EN r8 = A01(r4)
            int r7 = r8.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 | r0
            r8.bitField0_ = r7
            r8.lc_ = r9
            monitor-enter(r1)
            goto L_0x0363
        L_0x02fe:
            r0 = 1
            if (r8 != r0) goto L_0x0304
            X.232 r9 = X.AnonymousClass232.GOOGLE
            goto L_0x029e
        L_0x0304:
            r0 = 2
            if (r8 != r0) goto L_0x030a
            X.232 r9 = X.AnonymousClass232.HARDCODED
            goto L_0x029e
        L_0x030a:
            r0 = 3
            if (r8 != r0) goto L_0x0310
            X.232 r9 = X.AnonymousClass232.OVERRIDE
            goto L_0x029e
        L_0x0310:
            r0 = 4
            if (r8 != r0) goto L_0x02d7
            X.232 r9 = X.AnonymousClass232.FALLBACK
            goto L_0x029e
        L_0x0316:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x031f
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x0353;
                case 2: goto L_0x034f;
                case 3: goto L_0x034b;
                case 4: goto L_0x0347;
                case 5: goto L_0x0343;
                case 6: goto L_0x0343;
                case 7: goto L_0x033f;
                case 8: goto L_0x033b;
                case 9: goto L_0x0337;
                case 10: goto L_0x0333;
                case 11: goto L_0x032f;
                case 12: goto L_0x0343;
                case 13: goto L_0x032b;
                case 14: goto L_0x0327;
                case 15: goto L_0x0323;
                default: goto L_0x031f;
            }
        L_0x031f:
            X.237 r0 = X.AnonymousClass237.CELLULAR_UNKNOWN
            goto L_0x026e
        L_0x0323:
            X.237 r0 = X.AnonymousClass237.CELLULAR_HSPAP
            goto L_0x026e
        L_0x0327:
            X.237 r0 = X.AnonymousClass237.CELLULAR_EHRPD
            goto L_0x026e
        L_0x032b:
            X.237 r0 = X.AnonymousClass237.CELLULAR_LTE
            goto L_0x026e
        L_0x032f:
            X.237 r0 = X.AnonymousClass237.CELLULAR_IDEN
            goto L_0x026e
        L_0x0333:
            X.237 r0 = X.AnonymousClass237.CELLULAR_HSPA
            goto L_0x026e
        L_0x0337:
            X.237 r0 = X.AnonymousClass237.CELLULAR_HSUPA
            goto L_0x026e
        L_0x033b:
            X.237 r0 = X.AnonymousClass237.CELLULAR_HSDPA
            goto L_0x026e
        L_0x033f:
            X.237 r0 = X.AnonymousClass237.CELLULAR_1XRTT
            goto L_0x026e
        L_0x0343:
            X.237 r0 = X.AnonymousClass237.CELLULAR_EVDO
            goto L_0x026e
        L_0x0347:
            X.237 r0 = X.AnonymousClass237.CELLULAR_CDMA
            goto L_0x026e
        L_0x034b:
            X.237 r0 = X.AnonymousClass237.CELLULAR_UMTS
            goto L_0x026e
        L_0x034f:
            X.237 r0 = X.AnonymousClass237.CELLULAR_EDGE
            goto L_0x026e
        L_0x0353:
            X.237 r0 = X.AnonymousClass237.CELLULAR_GPRS
            goto L_0x026e
        L_0x0357:
            X.233 r0 = X.AnonymousClass233.TABLET
            goto L_0x01f0
        L_0x035b:
            X.233 r0 = X.AnonymousClass233.VR
            goto L_0x01f0
        L_0x035f:
            X.233 r0 = X.AnonymousClass233.DESKTOP
            goto L_0x01f0
        L_0x0363:
            X.32E r0 = r1.A03     // Catch:{ all -> 0x0619 }
            X.32E r9 = new X.32E     // Catch:{ all -> 0x0619 }
            r9.<init>(r0)     // Catch:{ all -> 0x0619 }
            monitor-exit(r1)
            X.235 r0 = X.AnonymousClass235.UNKNOWN
            X.1EN r1 = A01(r4)
            int r0 = r0.value
            r1.connectReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            int r0 = r9.A00
            if (r0 == 0) goto L_0x03b5
            long r0 = r9.A02
            r10 = 0
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x03b5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C18320x8.A04(r0)
            long r20 = r20 - r0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 10
            long r7 = r7.toMillis(r0)
            int r0 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b5
            int r1 = r9.A00
            r0 = 1
            if (r1 == r0) goto L_0x0590
            r0 = 2
            if (r1 != r0) goto L_0x03b5
            X.235 r0 = X.AnonymousClass235.PUSH
        L_0x03a7:
            X.1EN r1 = A01(r4)
            int r0 = r0.value
            r1.connectReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
        L_0x03b5:
            if (r13 == 0) goto L_0x057f
            r12 = r17
            X.C626936e.A06(r12)
            X.2Ov r9 = r12.A00
            byte[] r13 = r12.A01
            X.6cX r0 = r4.A00
            X.1EN r0 = (X.AnonymousClass1EN) r0
            X.1Dl r0 = r0.devicePairingData_
            if (r0 != 0) goto L_0x03ca
            X.1Dl r0 = X.C21861Dl.DEFAULT_INSTANCE
        L_0x03ca:
            X.6c9 r7 = r0.A0H()
            r11 = 1
            byte[] r1 = new byte[r11]
            r0 = 5
            r10 = 0
            r1[r10] = r0
            X.8Lq r8 = X.C18300x5.A0J(r7, r1, r11)
            X.6cX r1 = r7.A00
            X.1Dl r1 = (X.C21861Dl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.eKeytype_ = r8
            X.8Lq r8 = X.C18280x3.A0H(r7, r13)
            X.6cX r1 = r7.A00
            X.1Dl r1 = (X.C21861Dl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.eIdent_ = r8
            byte[] r0 = r12.A02
            X.8Lq r8 = X.C18280x3.A0H(r7, r0)
            X.6cX r1 = r7.A00
            X.1Dl r1 = (X.C21861Dl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.eRegid_ = r8
            byte[] r0 = r9.A01
            X.8Lq r8 = X.C18280x3.A0H(r7, r0)
            X.6cX r1 = r7.A00
            X.1Dl r1 = (X.C21861Dl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.eSkeyId_ = r8
            byte[] r0 = r9.A00
            X.8Lq r8 = X.C18280x3.A0H(r7, r0)
            X.6cX r1 = r7.A00
            X.1Dl r1 = (X.C21861Dl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.eSkeyVal_ = r8
            byte[] r0 = r9.A02
            X.8Lq r8 = X.C18280x3.A0H(r7, r0)
            X.6cX r1 = r7.A00
            X.1Dl r1 = (X.C21861Dl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.eSkeySig_ = r8
            java.lang.String r0 = "2.23.26.14"
            java.lang.String r0 = X.C627236i.A04(r0)
            X.8Lq r8 = X.C18270x1.A08(r7, r0)
            X.6cX r1 = r7.A00
            X.1Dl r1 = (X.C21861Dl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.buildHash_ = r8
            X.1D6 r0 = X.AnonymousClass1D6.DEFAULT_INSTANCE
            X.6c9 r8 = r0.A0G()
            int[] r9 = r14.A03()
            X.6cX r0 = r8.A00
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            X.1D5 r0 = r0.version_
            if (r0 != 0) goto L_0x0467
            X.1D5 r0 = X.AnonymousClass1D5.DEFAULT_INSTANCE
        L_0x0467:
            X.6c9 r13 = r0.A0H()
            r12 = r9[r10]
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1D5 r1 = (X.AnonymousClass1D5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.primary_ = r12
            r12 = r9[r11]
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1D5 r1 = (X.AnonymousClass1D5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.secondary_ = r12
            r0 = 2
            r12 = r9[r0]
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1D5 r1 = (X.AnonymousClass1D5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.tertiary_ = r12
            int r1 = r9.length
            r0 = 4
            if (r1 != r0) goto L_0x04b1
            r0 = 3
            r9 = r9[r0]
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1D5 r1 = (X.AnonymousClass1D5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.quaternary_ = r9
        L_0x04b1:
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            X.6cX r0 = r13.A06()
            X.1D5 r0 = (X.AnonymousClass1D5) r0
            r0.getClass()
            r1.version_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.os_ = r3
            X.2ou r0 = r14.A03
            X.20s r0 = r0.A00()
            int r1 = r0.ordinal()
            if (r1 == r10) goto L_0x058c
            r0 = 2
            if (r1 == r0) goto L_0x0588
            X.23P r0 = X.AnonymousClass23P.ANDROID_TABLET
        L_0x04e7:
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            int r0 = r0.value
            r1.platformType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.requireFullSync_ = r11
            X.1Dg r0 = X.C21811Dg.DEFAULT_INSTANCE
            X.6c9 r9 = X.C18300x5.A0K(r0)
            X.6cX r1 = r9.A00
            X.1Dg r1 = (X.C21811Dg) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.supportCagReactionsAndPolls_ = r11
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1Dg r1 = (X.C21811Dg) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.inlineInitialPayloadInE2EeMsg_ = r10
            X.1VX r3 = r14.A0B
            r1 = 6103(0x17d7, float:8.552E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r3 = r3.A0Y(r0, r1)
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1Dg r1 = (X.C21811Dg) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.supportCallLogHistory_ = r3
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            X.6cX r0 = r9.A06()
            X.1Dg r0 = (X.C21811Dg) r0
            r0.getClass()
            r1.historySyncConfig_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            X.6cX r0 = r8.A06()
            X.8Lq r3 = r0.Bql()
            X.6cX r1 = X.C18320x8.A0C(r7)
            X.1Dl r1 = (X.C21861Dl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.deviceProps_ = r3
            X.1EN r1 = A01(r4)
            X.6cX r0 = r7.A06()
            X.1Dl r0 = (X.C21861Dl) r0
            r0.getClass()
            r1.devicePairingData_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
        L_0x057f:
            X.6cX r0 = r4.A00
            X.1EN r0 = (X.AnonymousClass1EN) r0
            boolean r0 = r0.oc_
            if (r0 == 0) goto L_0x05cc
            goto L_0x0594
        L_0x0588:
            X.23P r0 = X.AnonymousClass23P.ANDROID_AMBIGUOUS
            goto L_0x04e7
        L_0x058c:
            X.23P r0 = X.AnonymousClass23P.ANDROID_PHONE
            goto L_0x04e7
        L_0x0590:
            X.235 r0 = X.AnonymousClass235.USER_ACTIVATED
            goto L_0x03a7
        L_0x0594:
            android.content.pm.Signature r0 = r14.A00     // Catch:{ Exception -> 0x05c8 }
            if (r0 != 0) goto L_0x05aa
            java.lang.String r0 = r2.getPackageName()     // Catch:{ Exception -> 0x05c8 }
            r14.A01 = r0     // Catch:{ Exception -> 0x05c8 }
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r0 = r14.A01     // Catch:{ Exception -> 0x05c8 }
            android.content.pm.Signature r0 = X.AnonymousClass35C.A00(r1, r0)     // Catch:{ Exception -> 0x05c8 }
            r14.A00 = r0     // Catch:{ Exception -> 0x05c8 }
        L_0x05aa:
            X.2wY r2 = r14.A0C     // Catch:{ Exception -> 0x05c8 }
            byte[] r1 = r0.toByteArray()     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r0 = r14.A01     // Catch:{ Exception -> 0x05c8 }
            boolean r0 = r2.A00(r0, r1)     // Catch:{ Exception -> 0x05c8 }
            boolean r3 = X.AnonymousClass000.A1T(r0)
            X.1EN r2 = A01(r4)     // Catch:{ Exception -> 0x05c8 }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x05c8 }
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x05c8 }
            r2.oc_ = r3     // Catch:{ Exception -> 0x05c8 }
            goto L_0x05cc
        L_0x05c8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x05cc:
            X.1VX r2 = r14.A0B
            r1 = 1722(0x6ba, float:2.413E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r2.A0O(r0, r1)
            r0 = -1
            if (r1 == r0) goto L_0x05ee
            byte[] r0 = X.AnonymousClass29O.A01(r1)
            X.8Lq r3 = X.C18300x5.A0J(r4, r0, r1)
            X.6cX r2 = r4.A00
            X.1EN r2 = (X.AnonymousClass1EN) r2
            int r1 = r2.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.paddingBytes_ = r3
        L_0x05ee:
            X.2y5 r0 = r14.A0H
            int r3 = X.AnonymousClass34G.A02(r5, r0)
            X.1EN r2 = A01(r4)
            int r1 = r2.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.yearClass_ = r3
            int r3 = X.AnonymousClass34L.A00(r5)
            X.1EN r2 = A01(r4)
            int r1 = r2.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.memClass_ = r3
            X.6cX r0 = r4.A06()
            X.1EN r0 = (X.AnonymousClass1EN) r0
            return r0
        L_0x0619:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50582iP.A02(X.2Kn, com.whatsapp.jid.UserJid, X.2OU, int, int, long, boolean):X.1EN");
    }
}
