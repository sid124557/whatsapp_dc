package X;

/* renamed from: X.3Nz  reason: invalid class name and case insensitive filesystem */
public final class C67103Nz implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public C59542x5 A00;
    public final AnonymousClass1VX A01;

    public C67103Nz(AnonymousClass1VX r2, C59542x5 r3) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.34x] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r0 > r7) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0115, code lost:
        if ((r0.bitField0_ & 8) != 0) goto L_0x0117;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x BgW(X.C55962rC r16) {
        /*
            r15 = this;
            r4 = r16
            X.1EU r2 = X.C55962rC.A01(r4)
            int r1 = r2.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r0 = X.C18270x1.A1T(r1, r0)
            r8 = 0
            if (r0 == 0) goto L_0x019f
            X.1VX r6 = r15.A01
            r0 = 5563(0x15bb, float:7.795E-42)
            X.2vE r5 = X.C58422vE.A02
            boolean r0 = r6.A0Y(r5, r0)
            if (r0 != 0) goto L_0x0024
            r0 = 83
            X.1mJ r0 = r4.A03(r0)
            return r0
        L_0x0024:
            X.1Db r2 = r2.eventMessage_
            if (r2 != 0) goto L_0x002a
            X.1Db r2 = X.C21761Db.DEFAULT_INSTANCE
        L_0x002a:
            r0 = 6207(0x183f, float:8.698E-42)
            int r7 = r6.A0O(r5, r0)
            java.lang.String r0 = r2.name_
            if (r0 == 0) goto L_0x0038
            java.lang.String r8 = X.AnonymousClass2AB.A00(r0)
        L_0x0038:
            r10 = r8
            int r0 = r2.bitField0_
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r3 = 1
            if (r0 == 0) goto L_0x004f
            if (r8 == 0) goto L_0x004f
            int r0 = r8.length()
            if (r0 == 0) goto L_0x004f
            r1 = 1
            if (r0 <= r7) goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            X.40b r0 = X.C815240b.A00
            X.AnonymousClass272.A00(r0, r1)
            int r0 = r2.bitField0_
            r0 = r0 & 2
            boolean r1 = X.AnonymousClass000.A1S(r0)
            X.40c r0 = X.C815340c.A00
            X.AnonymousClass272.A00(r0, r1)
            int r0 = r2.bitField0_
            r0 = r0 & 64
            boolean r1 = X.AnonymousClass000.A1S(r0)
            X.40d r0 = X.C815440d.A00
            X.AnonymousClass272.A00(r0, r1)
            X.2z0 r9 = r4.A0D
            long r11 = r4.A05
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.startTime_
            long r13 = r4.toMillis(r0)
            X.1mU r8 = new X.1mU
            r8.<init>(r9, r10, r11, r13)
            r0 = 6208(0x1840, float:8.699E-42)
            int r1 = r6.A0O(r5, r0)
            int r0 = r2.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = r2.description_
            X.C162457s7.A0D(r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r0)
            int r0 = r0.length()
            if (r0 <= r1) goto L_0x009c
            r3 = 0
        L_0x009c:
            X.40e r0 = X.C815540e.A00
            X.AnonymousClass272.A00(r0, r3)
            java.lang.String r0 = r2.description_
            X.C162457s7.A0D(r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r0)
            r8.A02 = r0
        L_0x00ac:
            int r0 = r2.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r2.joinLink_
            X.C162457s7.A0D(r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r0)
            r8.A03 = r0
        L_0x00bd:
            int r0 = r2.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x018c
            X.1Dy r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x00ca
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x00ca:
            int r0 = r0.bitField0_
            boolean r3 = X.AnonymousClass0x2.A1X(r0)
            if (r1 != 0) goto L_0x00d4
            X.1Dy r1 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x00d4:
            int r0 = r1.bitField0_
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r1 = 0
            if (r3 != r0) goto L_0x00e0
            r1 = 1
        L_0x00e0:
            X.40a r0 = X.C815140a.A00
            X.AnonymousClass272.A00(r0, r1)
            X.1Dy r0 = r2.location_
            r4 = r0
            if (r0 != 0) goto L_0x00ec
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x00ec:
            int r0 = r0.bitField0_
            boolean r0 = X.AnonymousClass0x2.A1X(r0)
            r5 = 0
            if (r0 != 0) goto L_0x0117
            r0 = r4
            if (r4 != 0) goto L_0x00fa
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x00fa:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 != 0) goto L_0x0117
            r0 = r4
            if (r4 != 0) goto L_0x0105
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x0105:
            int r0 = r0.bitField0_
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0117
            r0 = r4
            if (r4 != 0) goto L_0x0110
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x0110:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            r1 = r5
            if (r0 == 0) goto L_0x018a
        L_0x0117:
            r0 = r4
            if (r4 != 0) goto L_0x011c
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x011c:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x019d
            r0 = r4
            if (r4 != 0) goto L_0x0127
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x0127:
            double r0 = r0.degreesLatitude_
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
        L_0x012d:
            r0 = r4
            if (r4 != 0) goto L_0x0132
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x0132:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x019b
            if (r4 != 0) goto L_0x013c
            X.1Dy r4 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x013c:
            double r0 = r4.degreesLongitude_
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x0142:
            if (r3 == 0) goto L_0x0199
            if (r0 == 0) goto L_0x0199
            double r3 = r3.doubleValue()
            double r0 = r0.doubleValue()
            X.2k9 r6 = new X.2k9
            r6.<init>(r3, r0)
        L_0x0153:
            X.1Dy r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x015a
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x015a:
            int r0 = r0.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0197
            if (r1 != 0) goto L_0x0164
            X.1Dy r1 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x0164:
            java.lang.String r0 = r1.name_
            if (r0 == 0) goto L_0x0197
            java.lang.String r3 = X.AnonymousClass2AB.A00(r0)
        L_0x016c:
            X.1Dy r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x0173
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x0173:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0185
            if (r1 != 0) goto L_0x017d
            X.1Dy r1 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x017d:
            java.lang.String r0 = r1.address_
            if (r0 == 0) goto L_0x0185
            java.lang.String r5 = X.AnonymousClass2AB.A00(r0)
        L_0x0185:
            X.2lS r1 = new X.2lS
            r1.<init>(r6, r3, r5)
        L_0x018a:
            r8.A01 = r1
        L_0x018c:
            int r0 = r2.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x019f
            boolean r0 = r2.isCanceled_
            r8.A06 = r0
            return r8
        L_0x0197:
            r3 = r5
            goto L_0x016c
        L_0x0199:
            r6 = r5
            goto L_0x0153
        L_0x019b:
            r0 = r5
            goto L_0x0142
        L_0x019d:
            r3 = r5
            goto L_0x012d
        L_0x019f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67103Nz.BgW(X.2rC):X.34x");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r1 == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyD(X.C55032pg r11, X.C624134x r12) {
        /*
            r10 = this;
            X.C18260x0.A0O(r12, r11)
            boolean r1 = r12 instanceof X.C30461mU
            X.40X r0 = X.AnonymousClass40X.A00
            X.AnonymousClass275.A00(r0, r1)
            r3 = r12
            X.1mU r3 = (X.C30461mU) r3
            java.lang.String r0 = r3.A04
            java.lang.String r0 = X.AnonymousClass2AB.A00(r0)
            if (r0 == 0) goto L_0x001c
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r1 = r0 ^ 1
            X.40Y r0 = X.AnonymousClass40Y.A00
            X.AnonymousClass275.A00(r0, r1)
            long r1 = r3.A00
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1W(r0)
            X.40Z r0 = X.AnonymousClass40Z.A00
            X.AnonymousClass275.A00(r0, r1)
            X.1A4 r2 = r11.A00
            X.6cX r0 = r2.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1Db r0 = r0.eventMessage_
            if (r0 != 0) goto L_0x003f
            X.1Db r0 = X.C21761Db.DEFAULT_INSTANCE
        L_0x003f:
            X.6c9 r9 = r0.A0H()
            java.lang.String r0 = r3.A04
            java.lang.String r4 = X.AnonymousClass2AB.A00(r0)
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1Db r1 = (X.C21761Db) r1
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.name_ = r4
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x0078
            java.lang.String r4 = X.AnonymousClass2AB.A00(r0)
            if (r4 == 0) goto L_0x0078
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0078
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1Db r1 = (X.C21761Db) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.description_ = r4
        L_0x0078:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0096
            java.lang.String r4 = X.AnonymousClass2AB.A00(r0)
            if (r4 == 0) goto L_0x0096
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0096
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1Db r1 = (X.C21761Db) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.joinLink_ = r4
        L_0x0096:
            X.2lS r5 = r3.A01
            if (r5 == 0) goto L_0x0125
            X.6cX r0 = r2.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1Db r0 = r0.eventMessage_
            if (r0 != 0) goto L_0x00a4
            X.1Db r0 = X.C21761Db.DEFAULT_INSTANCE
        L_0x00a4:
            X.1Dy r0 = r0.location_
            if (r0 != 0) goto L_0x00aa
            X.1Dy r0 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x00aa:
            X.6c9 r8 = r0.A0H()
            X.2k9 r7 = r5.A00
            if (r7 == 0) goto L_0x00d2
            double r0 = r7.A00
            X.6cX r6 = X.C18320x8.A0C(r8)
            X.1Dy r6 = (X.C21991Dy) r6
            int r4 = r6.bitField0_
            r4 = r4 | 1
            r6.bitField0_ = r4
            r6.degreesLatitude_ = r0
            double r0 = r7.A01
            X.6cX r6 = X.C18320x8.A0C(r8)
            X.1Dy r6 = (X.C21991Dy) r6
            int r4 = r6.bitField0_
            r4 = r4 | 2
            r6.bitField0_ = r4
            r6.degreesLongitude_ = r0
        L_0x00d2:
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x00f0
            java.lang.String r4 = X.AnonymousClass2AB.A00(r0)
            if (r4 == 0) goto L_0x00f0
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00f0
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1Dy r1 = (X.C21991Dy) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.name_ = r4
        L_0x00f0:
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x010e
            java.lang.String r4 = X.AnonymousClass2AB.A00(r0)
            if (r4 == 0) goto L_0x010e
            int r0 = r4.length()
            if (r0 == 0) goto L_0x010e
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1Dy r1 = (X.C21991Dy) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.address_ = r4
        L_0x010e:
            X.6cX r0 = r8.A06()
            X.1Dy r0 = (X.C21991Dy) r0
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1Db r1 = (X.C21761Db) r1
            r0.getClass()
            r1.location_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
        L_0x0125:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r3.A00
            long r0 = r4.toSeconds(r0)
            X.6cX r5 = X.C18320x8.A0C(r9)
            X.1Db r5 = (X.C21761Db) r5
            int r4 = r5.bitField0_
            r4 = r4 | 64
            r5.bitField0_ = r4
            r5.startTime_ = r0
            boolean r3 = r3.A06
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1Db r1 = (X.C21761Db) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.isCanceled_ = r3
            X.3Z2 r3 = r11.A01
            byte[] r1 = r11.A09
            boolean r0 = X.C59542x5.A01(r3, r12, r1)
            if (r0 == 0) goto L_0x016c
            X.2x5 r0 = r10.A00
            X.1EF r0 = X.C55032pg.A00(r0, r11, r3, r12, r1)
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1Db r1 = (X.C21761Db) r1
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x016c:
            X.6cX r0 = r9.A06()
            X.1Db r0 = (X.C21761Db) r0
            X.1EU r2 = X.AnonymousClass0x2.A0L(r2, r0)
            r2.eventMessage_ = r0
            int r1 = r2.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 | r0
            r2.bitField1_ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67103Nz.AyD(X.2pg, X.34x):void");
    }
}
