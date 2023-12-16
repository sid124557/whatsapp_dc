package X;

/* renamed from: X.2aD  reason: invalid class name and case insensitive filesystem */
public class C45562aD {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass66R A02;

    /* JADX WARNING: Removed duplicated region for block: B:391:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0411  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30341mI A00(X.AnonymousClass2z0 r8, int r9, long r10) {
        /*
            r7 = this;
            r2 = 0
            X.1VX r3 = r7.A01
            r1 = 5524(0x1594, float:7.741E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x009f
            X.66R r4 = r7.A02
            java.lang.Object r5 = r4.getValue()
            X.2Su r5 = (X.C43612Su) r5
            monitor-enter(r5)
            if (r9 < 0) goto L_0x0050
            int r0 = r5.A00     // Catch:{ all -> 0x009c }
            if (r9 > r0) goto L_0x0050
            X.4G0[] r3 = r5.A05     // Catch:{ all -> 0x009c }
            r1 = r3[r9]     // Catch:{ all -> 0x009c }
            if (r1 != 0) goto L_0x003c
            X.2hD r1 = r5.A01     // Catch:{ all -> 0x009c }
            X.4Ge r0 = r5.A04     // Catch:{ all -> 0x009c }
            X.4C1 r2 = r1.A00(r0, r9)     // Catch:{ all -> 0x009c }
            if (r2 != 0) goto L_0x0043
            java.lang.Boolean[] r1 = r5.A06     // Catch:{ all -> 0x009c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            r1[r9] = r0     // Catch:{ all -> 0x009c }
            X.66R r0 = r5.A03     // Catch:{ all -> 0x009c }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x009c }
            X.4G0 r1 = (X.AnonymousClass4G0) r1     // Catch:{ all -> 0x009c }
        L_0x003a:
            r3[r9] = r1     // Catch:{ all -> 0x009c }
        L_0x003c:
            java.lang.String r0 = "null cannot be cast to non-null type IP of com.whatsapp.fmessage.systemmessage.platform.core.SystemMessageSubsystemApi.getIntegrationPoint$lambda$0"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x009c }
            goto L_0x005b
        L_0x0043:
            java.lang.Boolean[] r1 = r5.A06     // Catch:{ all -> 0x009c }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            r1[r9] = r0     // Catch:{ all -> 0x009c }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x009c }
            X.4G0 r1 = (X.AnonymousClass4G0) r1     // Catch:{ all -> 0x009c }
            goto L_0x003a
        L_0x0050:
            X.66R r0 = r5.A03     // Catch:{ all -> 0x009c }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x009c }
            X.4G0 r1 = (X.AnonymousClass4G0) r1     // Catch:{ all -> 0x009c }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x009c }
        L_0x005b:
            monitor-exit(r5)
            X.4G7 r1 = (X.AnonymousClass4G7) r1
            X.1mI r1 = r1.B0l(r8, r9, r10)     // Catch:{ 23p -> 0x0063 }
            return r1
        L_0x0063:
            r3 = move-exception
            java.lang.String r2 = java.lang.Integer.toString(r9)
            X.C162457s7.A0D(r2)
            java.lang.Object r5 = r4.getValue()
            X.2Su r5 = (X.C43612Su) r5
            monitor-enter(r5)
            r6 = 1
            if (r9 < 0) goto L_0x03eb
            int r0 = r5.A00     // Catch:{ all -> 0x009c }
            if (r9 > r0) goto L_0x03eb
            java.lang.Boolean[] r4 = r5.A06     // Catch:{ all -> 0x009c }
            r0 = r4[r9]     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0084
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0084:
            X.2hD r1 = r5.A01     // Catch:{ all -> 0x009c }
            X.4Ge r0 = r5.A04     // Catch:{ all -> 0x009c }
            X.4C1 r0 = r1.A00(r0, r9)     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x008f
            r6 = 0
        L_0x008f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x009c }
            r4[r9] = r0     // Catch:{ all -> 0x009c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x009c }
        L_0x0099:
            monitor-exit(r5)
            goto L_0x03ed
        L_0x009c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x009f:
            r0 = 6
            if (r9 != r0) goto L_0x00a8
            X.1o7 r1 = new X.1o7
            r1.<init>(r8, r10)
            return r1
        L_0x00a8:
            r0 = 28
            if (r9 == r0) goto L_0x0468
            r0 = 10
            if (r9 == r0) goto L_0x0468
            r0 = 37
            if (r9 == r0) goto L_0x0462
            r0 = 39
            if (r9 == r0) goto L_0x045c
            r0 = 40
            if (r9 == r0) goto L_0x0456
            r0 = 41
            if (r9 == r0) goto L_0x0456
            r0 = 42
            if (r9 == r0) goto L_0x0456
            r0 = 43
            if (r9 == r0) goto L_0x0456
            r0 = 44
            if (r9 == r0) goto L_0x0456
            r0 = 45
            if (r9 == r0) goto L_0x0456
            r0 = 64
            if (r9 == r0) goto L_0x0450
            r0 = 65
            if (r9 == r0) goto L_0x044a
            r0 = 66
            if (r9 != r0) goto L_0x00e2
            X.1oi r1 = new X.1oi
            r1.<init>(r8, r10)
            return r1
        L_0x00e2:
            boolean r0 = X.AnonymousClass34J.A00(r9)
            r1 = 142(0x8e, float:1.99E-43)
            if (r0 == 0) goto L_0x01eb
            r0 = 1
            if (r9 != r0) goto L_0x00f3
            X.1oZ r1 = new X.1oZ
            r1.<init>(r8, r10)
            return r1
        L_0x00f3:
            r0 = 100
            if (r9 == r0) goto L_0x0432
            r0 = 107(0x6b, float:1.5E-43)
            if (r9 != r0) goto L_0x0101
            X.1ou r1 = new X.1ou
            r1.<init>(r8, r10)
            return r1
        L_0x0101:
            r0 = 56
            if (r9 != r0) goto L_0x010b
            X.1oX r1 = new X.1oX
            r1.<init>(r8, r10)
            return r1
        L_0x010b:
            r0 = 3
            if (r9 != r0) goto L_0x0114
            X.1oQ r1 = new X.1oQ
            r1.<init>(r8, r10)
            return r1
        L_0x0114:
            r0 = 84
            if (r9 == r0) goto L_0x01e5
            r0 = 85
            if (r9 == r0) goto L_0x01e5
            r0 = 120(0x78, float:1.68E-43)
            if (r9 != r0) goto L_0x0126
            X.1oR r1 = new X.1oR
            r1.<init>(r8, r10)
            return r1
        L_0x0126:
            r0 = 83
            if (r9 != r0) goto L_0x0130
            X.1oY r1 = new X.1oY
            r1.<init>(r8, r10)
            return r1
        L_0x0130:
            r0 = 90
            if (r9 == r0) goto L_0x0438
            r0 = 106(0x6a, float:1.49E-43)
            if (r9 != r0) goto L_0x013e
            X.1os r1 = new X.1os
            r1.<init>(r8, r10)
            return r1
        L_0x013e:
            r0 = 99
            if (r9 != r0) goto L_0x0148
            X.1oP r1 = new X.1oP
            r1.<init>(r8, r10)
            return r1
        L_0x0148:
            r0 = 101(0x65, float:1.42E-43)
            if (r9 != r0) goto L_0x0152
            X.1ox r1 = new X.1ox
            r1.<init>(r8, r10)
            return r1
        L_0x0152:
            r0 = 122(0x7a, float:1.71E-43)
            if (r9 != r0) goto L_0x015c
            X.1oE r1 = new X.1oE
            r1.<init>((X.AnonymousClass2z0) r8, (long) r10)
            return r1
        L_0x015c:
            r0 = 139(0x8b, float:1.95E-43)
            if (r9 != r0) goto L_0x0166
            X.1oD r1 = new X.1oD
            r1.<init>(r8, r10)
            return r1
        L_0x0166:
            r0 = 123(0x7b, float:1.72E-43)
            if (r9 != r0) goto L_0x0170
            X.1oG r1 = new X.1oG
            r1.<init>((X.AnonymousClass2z0) r8, (long) r10)
            return r1
        L_0x0170:
            r0 = 124(0x7c, float:1.74E-43)
            if (r9 != r0) goto L_0x017a
            X.1oI r1 = new X.1oI
            r1.<init>((X.AnonymousClass2z0) r8, (long) r10)
            return r1
        L_0x017a:
            r0 = 144(0x90, float:2.02E-43)
            if (r9 != r0) goto L_0x0184
            X.1oF r1 = new X.1oF
            r1.<init>((X.AnonymousClass2z0) r8, (long) r10)
            return r1
        L_0x0184:
            r0 = 125(0x7d, float:1.75E-43)
            if (r9 != r0) goto L_0x018e
            X.1oH r1 = new X.1oH
            r1.<init>((X.AnonymousClass2z0) r8, (long) r10)
            return r1
        L_0x018e:
            r0 = 126(0x7e, float:1.77E-43)
            if (r9 != r0) goto L_0x0198
            X.1oB r1 = new X.1oB
            r1.<init>(r8, r10)
            return r1
        L_0x0198:
            r0 = 127(0x7f, float:1.78E-43)
            if (r9 != r0) goto L_0x01a2
            X.1oC r1 = new X.1oC
            r1.<init>(r8, r10)
            return r1
        L_0x01a2:
            if (r9 == r1) goto L_0x042c
            r0 = 143(0x8f, float:2.0E-43)
            if (r9 != r0) goto L_0x01ae
            X.1oL r1 = new X.1oL
            r1.<init>((X.AnonymousClass2z0) r8, (long) r10)
            return r1
        L_0x01ae:
            r0 = 148(0x94, float:2.07E-43)
            if (r9 != r0) goto L_0x01b8
            X.1oK r1 = new X.1oK
            r1.<init>((X.AnonymousClass2z0) r8, (long) r10)
            return r1
        L_0x01b8:
            r0 = 149(0x95, float:2.09E-43)
            if (r9 != r0) goto L_0x01c2
            X.1oJ r1 = new X.1oJ
            r1.<init>((X.AnonymousClass2z0) r8, (long) r10)
            return r1
        L_0x01c2:
            r0 = 159(0x9f, float:2.23E-43)
            if (r9 != r0) goto L_0x01cc
            X.1oN r1 = new X.1oN
            r1.<init>(r8, r10)
            return r1
        L_0x01cc:
            r0 = 160(0xa0, float:2.24E-43)
            if (r9 != r0) goto L_0x01d6
            X.1oM r1 = new X.1oM
            r1.<init>(r8, r10)
            return r1
        L_0x01d6:
            r0 = 161(0xa1, float:2.26E-43)
            if (r9 != r0) goto L_0x01e0
            X.1oO r1 = new X.1oO
            r1.<init>(r8, r10)
            return r1
        L_0x01e0:
            X.1p1 r1 = X.C31891p1.A02(r8, r9, r10)
            return r1
        L_0x01e5:
            X.1oT r1 = new X.1oT
            r1.<init>(r8, r0, r10)
            return r1
        L_0x01eb:
            boolean r0 = X.AnonymousClass34J.A01(r9)
            if (r0 == 0) goto L_0x01f7
            X.1nu r1 = new X.1nu
            r1.<init>(r8, r9, r10)
            return r1
        L_0x01f7:
            r0 = 57
            if (r9 != r0) goto L_0x0201
            X.1o3 r1 = new X.1o3
            r1.<init>(r8, r10)
            return r1
        L_0x0201:
            r0 = 71
            if (r9 != r0) goto L_0x020b
            X.1ng r1 = new X.1ng
            r1.<init>(r8, r10)
            return r1
        L_0x020b:
            r0 = 58
            if (r9 != r0) goto L_0x0215
            X.1ny r1 = new X.1ny
            r1.<init>(r8, r10)
            return r1
        L_0x0215:
            r0 = 153(0x99, float:2.14E-43)
            if (r9 != r0) goto L_0x021f
            X.1o0 r1 = new X.1o0
            r1.<init>(r8, r10)
            return r1
        L_0x021f:
            r0 = 59
            if (r9 != r0) goto L_0x0229
            X.1nr r1 = new X.1nr
            r1.<init>(r8, r10)
            return r1
        L_0x0229:
            r0 = 60
            if (r9 != r0) goto L_0x0233
            X.1nz r1 = new X.1nz
            r1.<init>(r8, r10)
            return r1
        L_0x0233:
            r0 = 19
            if (r9 == r0) goto L_0x0444
            r0 = 67
            if (r9 == r0) goto L_0x0444
            r0 = 96
            if (r9 != r0) goto L_0x0245
            X.1nj r1 = new X.1nj
            r1.<init>(r8, r10)
            return r1
        L_0x0245:
            r0 = 68
            if (r9 != r0) goto L_0x024f
            X.1nq r1 = new X.1nq
            r1.<init>(r8, r10)
            return r1
        L_0x024f:
            r0 = 76
            if (r9 != r0) goto L_0x0259
            X.1nb r1 = new X.1nb
            r1.<init>(r8, r10)
            return r1
        L_0x0259:
            r0 = 61
            if (r9 == r0) goto L_0x043e
            r0 = 69
            if (r9 == r0) goto L_0x043e
            r0 = 70
            if (r9 != r0) goto L_0x026b
            X.1o6 r1 = new X.1o6
            r1.<init>(r8, r10)
            return r1
        L_0x026b:
            r0 = 75
            if (r9 != r0) goto L_0x0275
            X.1oV r1 = new X.1oV
            r1.<init>(r8, r0, r10)
            return r1
        L_0x0275:
            r0 = 95
            if (r9 != r0) goto L_0x0282
            X.1oV r1 = new X.1oV
            r1.<init>(r8, r0, r10)
            r0 = 2
        L_0x027f:
            r1.A00 = r0
            return r1
        L_0x0282:
            r0 = 102(0x66, float:1.43E-43)
            if (r9 != r0) goto L_0x028c
            X.1oq r1 = new X.1oq
            r1.<init>(r8, r10)
            return r1
        L_0x028c:
            r0 = 103(0x67, float:1.44E-43)
            if (r9 != r0) goto L_0x0296
            X.1op r1 = new X.1op
            r1.<init>(r8, r10)
            return r1
        L_0x0296:
            r0 = 104(0x68, float:1.46E-43)
            if (r9 != r0) goto L_0x02a0
            X.1oo r1 = new X.1oo
            r1.<init>(r8, r10)
            return r1
        L_0x02a0:
            r0 = 98
            if (r9 != r0) goto L_0x02ab
            X.1oV r1 = new X.1oV
            r1.<init>(r8, r0, r10)
            r0 = 0
            goto L_0x027f
        L_0x02ab:
            r0 = 105(0x69, float:1.47E-43)
            if (r9 != r0) goto L_0x02b5
            X.1or r1 = new X.1or
            r1.<init>(r8, r10)
            return r1
        L_0x02b5:
            r0 = 87
            if (r9 == r0) goto L_0x0438
            r0 = 77
            if (r9 == r0) goto L_0x0432
            r0 = 78
            if (r9 == r0) goto L_0x0432
            r0 = 88
            if (r9 == r0) goto L_0x0432
            r0 = 89
            if (r9 == r0) goto L_0x0432
            r0 = 108(0x6c, float:1.51E-43)
            if (r9 != r0) goto L_0x02d3
            X.1ok r1 = new X.1ok
            r1.<init>(r8, r10)
            return r1
        L_0x02d3:
            r0 = 109(0x6d, float:1.53E-43)
            if (r9 != r0) goto L_0x02dd
            X.1ol r1 = new X.1ol
            r1.<init>(r8, r10)
            return r1
        L_0x02dd:
            r0 = 110(0x6e, float:1.54E-43)
            if (r9 != r0) goto L_0x02e7
            X.1om r1 = new X.1om
            r1.<init>(r8, r10)
            return r1
        L_0x02e7:
            r0 = 111(0x6f, float:1.56E-43)
            if (r9 != r0) goto L_0x02f1
            X.1on r1 = new X.1on
            r1.<init>(r8, r10)
            return r1
        L_0x02f1:
            r0 = 80
            if (r9 != r0) goto L_0x02fb
            X.1ni r1 = new X.1ni
            r1.<init>(r8, r10)
            return r1
        L_0x02fb:
            r0 = 97
            if (r9 != r0) goto L_0x0305
            X.1o2 r1 = new X.1o2
            r1.<init>(r8, r10)
            return r1
        L_0x0305:
            r0 = 112(0x70, float:1.57E-43)
            if (r9 != r0) goto L_0x030f
            X.1oa r1 = new X.1oa
            r1.<init>(r8, r10)
            return r1
        L_0x030f:
            r0 = 128(0x80, float:1.794E-43)
            if (r9 != r0) goto L_0x0319
            X.1oA r1 = new X.1oA
            r1.<init>(r8, r10)
            return r1
        L_0x0319:
            r0 = 113(0x71, float:1.58E-43)
            if (r9 != r0) goto L_0x0323
            X.1oe r1 = new X.1oe
            r1.<init>(r8, r10)
            return r1
        L_0x0323:
            r0 = 114(0x72, float:1.6E-43)
            if (r9 != r0) goto L_0x032d
            X.1ob r1 = new X.1ob
            r1.<init>(r8, r10)
            return r1
        L_0x032d:
            r0 = 115(0x73, float:1.61E-43)
            if (r9 != r0) goto L_0x0337
            X.1oc r1 = new X.1oc
            r1.<init>(r8, r10)
            return r1
        L_0x0337:
            r0 = 116(0x74, float:1.63E-43)
            if (r9 != r0) goto L_0x0341
            X.1od r1 = new X.1od
            r1.<init>(r8, r10)
            return r1
        L_0x0341:
            r0 = 117(0x75, float:1.64E-43)
            if (r9 != r0) goto L_0x034b
            X.1o5 r1 = new X.1o5
            r1.<init>(r8, r10)
            return r1
        L_0x034b:
            r0 = 118(0x76, float:1.65E-43)
            if (r9 != r0) goto L_0x0355
            X.1nn r1 = new X.1nn
            r1.<init>(r8, r10)
            return r1
        L_0x0355:
            r0 = 121(0x79, float:1.7E-43)
            if (r9 != r0) goto L_0x035f
            X.1nt r1 = new X.1nt
            r1.<init>(r8, r10)
            return r1
        L_0x035f:
            r0 = 129(0x81, float:1.81E-43)
            if (r9 != r0) goto L_0x0369
            X.1nc r1 = new X.1nc
            r1.<init>(r8, r10)
            return r1
        L_0x0369:
            r0 = 135(0x87, float:1.89E-43)
            if (r9 != r0) goto L_0x0373
            X.1ne r1 = new X.1ne
            r1.<init>(r8, r10)
            return r1
        L_0x0373:
            r0 = 136(0x88, float:1.9E-43)
            if (r9 != r0) goto L_0x037d
            X.1nf r1 = new X.1nf
            r1.<init>(r8, r10)
            return r1
        L_0x037d:
            if (r9 == r1) goto L_0x042c
            r0 = 146(0x92, float:2.05E-43)
            if (r9 != r0) goto L_0x0389
            X.1nm r1 = new X.1nm
            r1.<init>(r8, r10)
            return r1
        L_0x0389:
            r0 = 154(0x9a, float:2.16E-43)
            if (r9 != r0) goto L_0x0393
            X.1nl r1 = new X.1nl
            r1.<init>(r8, r10)
            return r1
        L_0x0393:
            r0 = 156(0x9c, float:2.19E-43)
            if (r9 != r0) goto L_0x039d
            X.1na r1 = new X.1na
            r1.<init>(r8, r10)
            return r1
        L_0x039d:
            r0 = 147(0x93, float:2.06E-43)
            if (r9 == r0) goto L_0x0426
            r0 = 155(0x9b, float:2.17E-43)
            if (r9 == r0) goto L_0x0426
            r0 = 162(0xa2, float:2.27E-43)
            if (r9 != r0) goto L_0x03af
            X.1nx r1 = new X.1nx
            r1.<init>(r8, r10)
            return r1
        L_0x03af:
            r0 = 163(0xa3, float:2.28E-43)
            if (r9 != r0) goto L_0x03b9
            X.1no r1 = new X.1no
            r1.<init>(r8, r10)
            return r1
        L_0x03b9:
            r0 = 164(0xa4, float:2.3E-43)
            if (r9 != r0) goto L_0x03c3
            X.1nw r1 = new X.1nw
            r1.<init>(r8, r10)
            return r1
        L_0x03c3:
            r0 = 157(0x9d, float:2.2E-43)
            if (r9 != r0) goto L_0x03cd
            X.1nk r1 = new X.1nk
            r1.<init>(r8, r10)
            return r1
        L_0x03cd:
            r0 = 158(0x9e, float:2.21E-43)
            if (r9 != r0) goto L_0x03d7
            X.1nd r1 = new X.1nd
            r1.<init>(r8, r10)
            return r1
        L_0x03d7:
            r0 = 165(0xa5, float:2.31E-43)
            if (r9 != r0) goto L_0x03e1
            X.1ns r1 = new X.1ns
            r1.<init>(r8, r10)
            return r1
        L_0x03e1:
            r0 = 166(0xa6, float:2.33E-43)
            if (r9 != r0) goto L_0x040b
            X.1nh r1 = new X.1nh
            r1.<init>(r8, r10)
            return r1
        L_0x03eb:
            monitor-exit(r5)
            r0 = 0
        L_0x03ed:
            X.2qk r1 = r7.A00
            if (r0 == 0) goto L_0x0411
            java.lang.String r0 = "system-message-factory-action-not-supported"
            r1.A09(r0, r2, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemMessageFactorySubsystem; cannot create "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " (not supported)"
        L_0x0405:
            r1.append(r0)
            X.C18270x1.A0z(r1)
        L_0x040b:
            X.1mI r1 = new X.1mI
            r1.<init>(r8, r9, r10)
            return r1
        L_0x0411:
            java.lang.String r0 = "system-message-factory-action-not-registered"
            r1.A09(r0, r2, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SystemMessageFactorySubsystem; cannot crete "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " (not registered)"
            goto L_0x0405
        L_0x0426:
            X.1np r1 = new X.1np
            r1.<init>(r8, r0, r10)
            return r1
        L_0x042c:
            X.1oS r1 = new X.1oS
            r1.<init>(r8, r2, r10)
            return r1
        L_0x0432:
            X.1oW r1 = new X.1oW
            r1.<init>(r8, r9, r10)
            return r1
        L_0x0438:
            X.1oU r1 = new X.1oU
            r1.<init>(r8, r9, r10)
            return r1
        L_0x043e:
            X.1o1 r1 = new X.1o1
            r1.<init>(r8, r9, r10)
            return r1
        L_0x0444:
            X.1nv r1 = new X.1nv
            r1.<init>(r8, r9, r10)
            return r1
        L_0x044a:
            X.1oh r1 = new X.1oh
            r1.<init>(r8, r10)
            return r1
        L_0x0450:
            X.1oj r1 = new X.1oj
            r1.<init>(r8, r10)
            return r1
        L_0x0456:
            X.1o9 r1 = new X.1o9
            r1.<init>(r8, r9, r10)
            return r1
        L_0x045c:
            X.1og r1 = new X.1og
            r1.<init>(r8, r10)
            return r1
        L_0x0462:
            X.1of r1 = new X.1of
            r1.<init>(r8, r10)
            return r1
        L_0x0468:
            X.1o8 r1 = new X.1o8
            r1.<init>(r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45562aD.A00(X.2z0, int, long):X.1mI");
    }

    public C45562aD(C55682qk r2, AnonymousClass1VX r3, AnonymousClass2RF r4) {
        C18260x0.A0V(r4, r3, r2);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = C154517dI.A01(new C79653wy(r4));
    }
}
