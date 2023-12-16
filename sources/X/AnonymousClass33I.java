package X;

/* renamed from: X.33I  reason: invalid class name */
public class AnonymousClass33I {
    public AnonymousClass3U5 A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final C57012sv A04;
    public final C106175Xx A05;
    public final C48352el A06;
    public final C89654ea A07;
    public final C69263Wi A08;
    public final C85244Fm A09;
    public final C56972sr A0A;
    public final C56972sr A0B;
    public final C66663Mh A0C;
    public final C42662Pa A0D;
    public final C29441ip A0E;
    public final C64773Ex A0F;
    public final C47882dz A0G;
    public final C56422rx A0H;
    public final C56422rx A0I;
    public final AnonymousClass5ZU A0J;
    public final C66413Li A0K;
    public final AnonymousClass314 A0L;
    public final C620633i A0M;
    public final C56612sH A0N;
    public final C56612sH A0O;
    public final C57162tC A0P;
    public final C53412n3 A0Q;
    public final C42182Nc A0R;
    public final AnonymousClass1VX A0S;
    public final AnonymousClass4FV A0T;
    public final AnonymousClass31C A0U;
    public final C105355Up A0V;
    public final C1907099n A0W;
    public final AnonymousClass9U4 A0X;
    public final AnonymousClass9Th A0Y;
    public final AnonymousClass4FS A0Z;
    public final AnonymousClass4FS A0a;
    public final Integer A0b;
    public final boolean A0c;
    public final boolean A0d;
    public volatile boolean A0e;

    public AnonymousClass3U5 A00(String str, int i, int i2, boolean z) {
        C56612sH r15 = this.A0O;
        AnonymousClass1VX r13 = this.A0S;
        C69263Wi r12 = this.A08;
        AnonymousClass4FS r11 = this.A0a;
        AnonymousClass4FV r10 = this.A0T;
        AnonymousClass31C r9 = this.A0U;
        C64773Ex r8 = this.A0F;
        C48352el r7 = this.A06;
        C66413Li r6 = this.A0K;
        C106175Xx r5 = this.A05;
        C42182Nc r4 = this.A0R;
        C56422rx r3 = this.A0I;
        C29441ip r2 = this.A0E;
        AnonymousClass31C r30 = r9;
        AnonymousClass4FV r29 = r10;
        AnonymousClass1VX r28 = r13;
        C42182Nc r27 = r4;
        C53412n3 r26 = this.A0Q;
        return new AnonymousClass3U5(r5, r7, r12, r2, r8, r3, r6, r15, this.A0P, r26, r27, r28, r29, r30, this, r11, str, i, i2, z);
    }

    public final void A01(int i, int i2) {
        AnonymousClass4FV r5 = this.A0T;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Boolean bool = Boolean.TRUE;
        C25281aG r0 = new C25281aG();
        r0.A03 = valueOf;
        r0.A04 = null;
        r0.A05 = valueOf2;
        r0.A01 = bool;
        r0.A00 = null;
        r0.A02 = null;
        r5.BhB(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r4.length() <= 17) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01fe, code lost:
        if (r4.length() <= 22) goto L_0x0200;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.AnonymousClass2z0 r21, java.lang.String r22, int r23, boolean r24, boolean r25) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.A0e
            r15 = 0
            if (r1 != 0) goto L_0x001c
            X.4ea r12 = r0.A07
            X.0df r2 = r12.getSupportFragmentManager()
            java.lang.String r1 = "qr_code_scanning_dialog_fragment_tag"
            X.0eF r2 = r2.A0D(r1)
            if (r2 == 0) goto L_0x001d
            boolean r2 = r2.A19()
            if (r2 == 0) goto L_0x001d
        L_0x001c:
            return r15
        L_0x001d:
            X.3U5 r3 = r0.A00
            if (r3 == 0) goto L_0x003d
            r2 = 1
            r3.A03 = r2
            X.1tQ r2 = r3.A01
            if (r2 == 0) goto L_0x002e
            r2.A0D(r15)
            r2 = 0
            r3.A01 = r2
        L_0x002e:
            java.lang.ref.WeakReference r2 = r3.A0M
            java.lang.Object r2 = r2.get()
            X.33I r2 = (X.AnonymousClass33I) r2
            if (r2 == 0) goto L_0x003a
            r2.A0e = r15
        L_0x003a:
            r2 = 0
            r0.A00 = r2
        L_0x003d:
            java.lang.String r2 = "https://wa.me/qr/"
            r4 = r22
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L_0x0050
            int r5 = r4.length()
            r2 = 17
            r3 = 1
            if (r5 > r2) goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            r5 = 1
            r2 = r23
            r9 = r25
            if (r3 == 0) goto L_0x01ef
            r0.A0e = r5
            X.3U5 r11 = r0.A00(r4, r15, r2, r9)
        L_0x005e:
            r0.A00 = r11
            java.lang.ref.WeakReference r2 = r11.A0M
            java.lang.Object r4 = r2.get()
            X.33I r4 = (X.AnonymousClass33I) r4
            if (r4 == 0) goto L_0x00f9
            X.1ip r2 = r11.A09
            boolean r2 = r2.A0F()
            if (r2 == 0) goto L_0x01cc
            boolean r1 = r11.A0O
            if (r1 == 0) goto L_0x007e
            X.4ea r2 = r4.A07
            r1 = 2131888206(0x7f12084e, float:1.941104E38)
            r2.Bp9(r1)
        L_0x007e:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r11.A00 = r1
            X.1VX r6 = r11.A0H
            java.lang.String r3 = r11.A0L
            boolean r1 = X.AnonymousClass36Y.A08(r6, r3)
            if (r1 == 0) goto L_0x0102
            X.2Nc r1 = r11.A0G
            java.lang.String r2 = "fetch_biz_info"
            java.util.Map r1 = r1.A02
            java.lang.Object r2 = r1.get(r2)
            X.316 r2 = (X.AnonymousClass316) r2
            if (r2 == 0) goto L_0x00a1
            java.lang.String r1 = "datasource"
            r2.A0A(r1)
        L_0x00a1:
            X.31C r4 = r11.A0J
            X.2tC r2 = r11.A0E
            X.3U4 r1 = new X.3U4
            r1.<init>(r11)
            X.3TM r7 = new X.3TM
            r7.<init>(r2, r6, r4, r1)
            int r1 = r11.A05
            java.lang.String r3 = X.AnonymousClass35W.A02(r3, r1)
            X.31C r6 = r7.A02
            java.lang.String r9 = r6.A03()
            r10 = 315(0x13b, float:4.41E-43)
            java.lang.String r1 = "path"
            r4 = 0
            X.36K r2 = new X.36K
            r2.<init>((java.lang.String) r1, (java.lang.String) r3, (X.AnonymousClass39V[]) r4)
            java.lang.String r1 = "custom_url"
            X.36K r5 = X.AnonymousClass36K.A0F(r2, r1, r4)
            r1 = 5
            X.39V[] r4 = new X.AnonymousClass39V[r1]
            X.AnonymousClass39V.A0E(r4, r15)
            java.lang.String r1 = "id"
            X.AnonymousClass39V.A09(r1, r9, r4)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "fb:thrift_iq"
            X.AnonymousClass39V.A07(r2, r1, r4)
            java.lang.String r2 = "smax_id"
            java.lang.String r1 = "79"
            X.AnonymousClass39V.A08(r2, r1, r4)
            X.36K r8 = X.AnonymousClass36K.A0G(r5, r4)
            r11 = 32000(0x7d00, double:1.581E-319)
            r6.A0E(r7, r8, r9, r10, r11)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GetUserByCustomUrlProtocol/sendRequest/businessName="
            X.C18260x0.A0s(r1, r3, r2)
        L_0x00f9:
            r15 = 1
            if (r24 == 0) goto L_0x001c
            X.33i r0 = r0.A0M
            X.C106755a7.A03(r0)
            return r15
        L_0x0102:
            android.net.Uri r1 = android.net.Uri.parse(r3)
            boolean r1 = X.AnonymousClass36Y.A07(r1, r6)
            if (r1 == 0) goto L_0x018b
            android.net.Uri r1 = android.net.Uri.parse(r3)
            java.lang.String r1 = X.AnonymousClass36Y.A02(r1)
            r10 = 0
            if (r1 == 0) goto L_0x012d
            X.5Xx r8 = r11.A06
            java.lang.String r9 = "\\D"
            java.lang.String r3 = ""
            java.lang.String r4 = r1.replaceAll(r9, r3)
            int r2 = r4.length()
            r1 = 5
            if (r2 >= r1) goto L_0x0131
            java.lang.String r1 = "contactpicker/converttointlformat/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x012d:
            r11.A00(r10, r10)
            goto L_0x00f9
        L_0x0131:
            java.lang.String r1 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r2 = r1.matcher(r4)
            boolean r1 = r2.find()
            if (r1 == 0) goto L_0x012d
            java.lang.String r7 = r2.group(r5)
            java.lang.String r6 = X.C18320x8.A0f(r7, r4)
            int r1 = X.C107195ar.A01(r8, r7, r6)
            if (r1 != r5) goto L_0x012d
            int r4 = java.lang.Integer.parseInt(r7)
            java.lang.String r1 = r6.replaceAll(r9, r3)     // Catch:{ Exception -> 0x015c }
            java.lang.String r6 = r8.A02(r4, r1)     // Catch:{ Exception -> 0x015c }
            goto L_0x016a
        L_0x015c:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "contactpicker/converttointlformat/trim/error "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r1, r2, r4)
            com.whatsapp.util.Log.w(r1, r3)
        L_0x016a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "+"
            java.lang.String r13 = X.AnonymousClass000.A0U(r1, r7, r6, r2)
            if (r13 == 0) goto L_0x012d
            X.3Ex r8 = r11.A0A
            X.2el r7 = r11.A07
            X.3Li r9 = r11.A0C
            X.1tQ r6 = new X.1tQ
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r11.A01 = r6
            X.4FS r1 = r11.A0K
            X.AnonymousClass0x7.A1B(r6, r1)
            goto L_0x00f9
        L_0x018b:
            X.3Wi r2 = r11.A08
            X.31C r1 = r11.A0J
            X.3TL r7 = new X.3TL
            r7.<init>(r2, r1, r11)
            int r1 = r11.A05
            java.lang.String r3 = X.AnonymousClass35W.A02(r3, r1)
            X.31C r6 = r7.A01
            java.lang.String r9 = r6.A03()
            r10 = 216(0xd8, float:3.03E-43)
            X.39V[] r2 = new X.AnonymousClass39V[r5]
            java.lang.String r1 = "code"
            X.AnonymousClass39V.A0B(r1, r3, r2, r15)
            java.lang.String r1 = "qr"
            X.36K r4 = X.AnonymousClass36K.A0I(r1, r2)
            r1 = 3
            X.39V[] r3 = new X.AnonymousClass39V[r1]
            java.lang.String r1 = "id"
            X.AnonymousClass39V.A0B(r1, r9, r3, r15)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:qr"
            X.AnonymousClass39V.A09(r2, r1, r3)
            X.36K r8 = X.AnonymousClass36K.A0G(r4, r3)
            r11 = 32000(0x7d00, double:1.581E-319)
            r6.A0E(r7, r8, r9, r10, r11)
            goto L_0x00f9
        L_0x01cc:
            X.4FV r9 = r11.A0I
            int r13 = r11.A04
            r3 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r7 = 0
            java.lang.String r2 = r11.A0L
            boolean r14 = X.AnonymousClass35W.A04(r2)
            r10 = r7
            r11 = r7
            r8 = r7
            X.AnonymousClass35W.A03(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.A0e = r15
            com.whatsapp.qrcode.contactqr.ErrorDialogFragment r3 = X.C18300x5.A0U(r3)
            X.4ea r2 = r4.A07
            r2.Bon(r3, r1)
            goto L_0x00f9
        L_0x01ef:
            java.lang.String r3 = "https://wa.me/message/"
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L_0x0200
            int r7 = r4.length()
            r6 = 22
            r3 = 1
            if (r7 > r6) goto L_0x0201
        L_0x0200:
            r3 = 0
        L_0x0201:
            r7 = 2
            if (r3 == 0) goto L_0x020c
            r0.A0e = r5
        L_0x0206:
            X.3U5 r11 = r0.A00(r4, r7, r2, r9)
            goto L_0x005e
        L_0x020c:
            java.lang.String r3 = "https://wa.me"
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L_0x0241
            android.net.Uri r3 = android.net.Uri.parse(r4)
            java.lang.String r8 = X.AnonymousClass36Y.A02(r3)
            if (r8 == 0) goto L_0x0241
            r3 = 5
            int r6 = r8.length()
            if (r3 > r6) goto L_0x0241
            r3 = 20
            if (r6 > r3) goto L_0x0241
            java.lang.String r3 = "[0-9]+"
            boolean r3 = r8.matches(r3)
            if (r3 == 0) goto L_0x0241
            X.4Fm r11 = r0.A09
            android.net.Uri r13 = android.net.Uri.parse(r4)
            r14 = 0
            r16 = 4
            r17 = r2
            r11.BkZ(r12, r13, r14, r15, r16, r17)
            goto L_0x00f9
        L_0x0241:
            X.1VX r8 = r0.A0S
            boolean r3 = X.AnonymousClass36Y.A08(r8, r4)
            if (r3 != 0) goto L_0x028a
            android.net.Uri r3 = android.net.Uri.parse(r4)
            boolean r3 = X.AnonymousClass36Y.A07(r3, r8)
            if (r3 != 0) goto L_0x028a
            boolean r3 = r0.A0c
            if (r3 == 0) goto L_0x02be
            X.3Mh r5 = r0.A0C
            X.1Ei r3 = X.C66663Mh.A0p
            boolean r3 = r5.A08(r3)
            if (r3 == 0) goto L_0x02be
            android.net.Uri r3 = android.net.Uri.parse(r4)
            java.lang.String r5 = X.AnonymousClass27O.A00(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L_0x02be
            r1 = 6
            r0.A01(r2, r1)
            r2 = 982(0x3d6, float:1.376E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r8.A0Y(r1, r2)
            if (r1 == 0) goto L_0x0299
            X.0df r2 = r12.getSupportFragmentManager()
            com.whatsapp.community.JoinGroupBottomSheetFragment r1 = com.whatsapp.community.JoinGroupBottomSheetFragment.A02(r5, r15, r15)
            X.AnonymousClass344.A01(r1, r2)
            goto L_0x00f9
        L_0x028a:
            r0.A0e = r5
            r6 = 1849(0x739, float:2.591E-42)
            X.2vE r3 = X.C58422vE.A02
            boolean r3 = r8.A0Y(r3, r6)
            if (r3 == 0) goto L_0x0206
            r7 = 3
            goto L_0x0206
        L_0x0299:
            java.lang.Integer r4 = r0.A0b
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r2 = r12.getPackageName()
            java.lang.String r1 = "com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity"
            android.content.Intent r2 = r3.setClassName(r2, r1)
            java.lang.String r1 = "code"
            r2.putExtra(r1, r5)
            if (r4 == 0) goto L_0x02b9
            int r1 = r4.intValue()
            r12.startActivityForResult(r2, r1)
            goto L_0x00f9
        L_0x02b9:
            r12.startActivity(r2)
            goto L_0x00f9
        L_0x02be:
            X.99n r3 = r0.A0W
            boolean r3 = r3.A02()
            if (r3 == 0) goto L_0x030d
            X.9U4 r3 = r0.A0X
            X.9oC r10 = r3.A0G()
            X.4FF r6 = r10.BB6()
            android.content.Intent r7 = r12.getIntent()
            java.lang.String r5 = "origin"
            r3 = 32
            int r5 = r7.getIntExtra(r5, r3)
            r11 = 1
            if (r6 == 0) goto L_0x02eb
            boolean r3 = r6.BJH(r4, r2, r5)
            if (r3 == 0) goto L_0x02eb
            r6.BF6(r12, r4, r2, r5)
            goto L_0x00f9
        L_0x02eb:
            r3 = 611(0x263, float:8.56E-43)
            X.2vE r7 = X.C58422vE.A02
            boolean r3 = r8.A0Y(r7, r3)
            r9 = 4
            if (r3 == 0) goto L_0x0426
            if (r6 == 0) goto L_0x0426
            boolean r3 = r6.BJG(r4)
            if (r3 == 0) goto L_0x0426
            boolean r3 = r0.A0d
            if (r3 == 0) goto L_0x041c
            r0.A01(r2, r9)
            if (r2 == r11) goto L_0x03b6
            r3 = 3
            if (r2 == r3) goto L_0x03a2
            r3 = 5
            if (r2 == r3) goto L_0x03b6
        L_0x030d:
            X.3Mh r5 = r0.A0C
            X.1Ei r3 = X.C66663Mh.A0p
            boolean r3 = r5.A08(r3)
            if (r3 == 0) goto L_0x033b
            X.2sr r3 = r0.A0A
            boolean r3 = r3.A0Y()
            if (r3 != 0) goto L_0x033b
            java.lang.String[] r3 = X.C18320x8.A1b(r4)
            int r5 = r3.length
            r3 = 4
            if (r5 < r3) goto L_0x033b
            X.32P r3 = X.AnonymousClass32P.A00(r4)
            if (r3 == 0) goto L_0x033b
            java.lang.String r3 = r3.A03
            if (r3 != 0) goto L_0x033b
            com.whatsapp.qrcode.contactqr.WebCodeDialogFragment r2 = new com.whatsapp.qrcode.contactqr.WebCodeDialogFragment
            r2.<init>()
        L_0x0336:
            r12.Bon(r2, r1)
            goto L_0x00f9
        L_0x033b:
            X.5Up r1 = r0.A0V
            boolean r1 = r1.A04()
            if (r1 == 0) goto L_0x0442
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.util.List r1 = r4.getPathSegments()
            int r3 = r1.size()
            r1 = 1
            if (r3 != r1) goto L_0x0442
            java.io.File r1 = X.C18310x6.A0a(r4)
            java.lang.String r1 = r1.getName()
            java.util.List r3 = X.C57882uM.A00
            java.lang.String r1 = X.AnonymousClass0x9.A0z(r1)
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0442
            X.2Pa r6 = r0.A0D
            r1 = 7
            X.1YI r5 = new X.1YI
            r5.<init>()
            r6.A00 = r1
            java.util.Random r1 = r6.A01
            if (r1 != 0) goto L_0x037a
            java.util.Random r1 = X.AnonymousClass0x9.A1C()
            r6.A01 = r1
        L_0x037a:
            long r3 = r1.nextLong()
            java.lang.String r3 = java.lang.Long.toHexString(r3)
            int r1 = r6.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.A00 = r1
            r5.A02 = r3
            java.lang.Long r1 = X.AnonymousClass0x2.A0T()
            r5.A01 = r1
            X.4FV r1 = r6.A02
            r1.BhD(r5)
            r1 = 9
            r0.A01(r2, r1)
            android.content.Intent r3 = X.C57012sv.A00(r12)
            goto L_0x043d
        L_0x03a2:
            r3 = 1811(0x713, float:2.538E-42)
            boolean r3 = r8.A0Y(r7, r3)
            if (r3 == 0) goto L_0x03b6
            if (r5 == r11) goto L_0x030d
            r3 = 13
            if (r5 == r3) goto L_0x030d
            r3 = 21
            if (r5 != r3) goto L_0x03b6
            goto L_0x030d
        L_0x03b6:
            java.lang.String r5 = X.C195219Wq.A07(r2, r5)
            r15 = r21
            if (r21 == 0) goto L_0x03d0
            X.4uZ r3 = r15.A00
        L_0x03c0:
            r9 = 3
            if (r2 == r9) goto L_0x03d2
            r9 = 1354(0x54a, float:1.897E-42)
            boolean r9 = r8.A0Y(r7, r9)
            if (r9 == 0) goto L_0x03d2
            r6.BpE(r12, r3, r4, r5)
            goto L_0x00f9
        L_0x03d0:
            r3 = 0
            goto L_0x03c0
        L_0x03d2:
            if (r21 == 0) goto L_0x0416
            X.2sH r9 = r0.A0N
            long r18 = r9.A0H()
            X.2rx r10 = r0.A0H
            X.4uZ r9 = r15.A00
            com.whatsapp.jid.UserJid r9 = X.AnonymousClass32Y.A03(r9)
            X.2qS r14 = r10.A00(r9)
            r9 = 4288(0x10c0, float:6.009E-42)
            boolean r7 = r8.A0Y(r7, r9)
            java.lang.String r17 = r6.BAr(r4)
            if (r7 == 0) goto L_0x0416
            boolean r7 = r15.A02
            if (r7 != 0) goto L_0x0416
            if (r14 == 0) goto L_0x0416
            boolean r7 = r14.A02()
            if (r7 != 0) goto L_0x0404
            boolean r7 = r14.A03()
            if (r7 == 0) goto L_0x0416
        L_0x0404:
            boolean r7 = android.text.TextUtils.isEmpty(r17)
            if (r7 != 0) goto L_0x0416
            X.4FS r7 = r0.A0Z
            X.3aj r13 = new X.3aj
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r7.BkM(r13)
        L_0x0416:
            androidx.fragment.app.DialogFragment r2 = r6.BBn(r3, r4, r5, r2)
            goto L_0x0336
        L_0x041c:
            r0.A01(r2, r9)
            r2 = 5
            com.whatsapp.qrcode.contactqr.ErrorDialogFragment r2 = X.C18300x5.A0U(r2)
            goto L_0x0336
        L_0x0426:
            r3 = 848(0x350, float:1.188E-42)
            boolean r3 = r8.A0Y(r7, r3)
            if (r3 == 0) goto L_0x030d
            java.lang.String r3 = r10.BDT(r4)
            if (r3 == 0) goto L_0x030d
            android.content.Intent r3 = r10.BDq(r12, r3)
            if (r3 == 0) goto L_0x030d
            r0.A01(r2, r9)
        L_0x043d:
            r12.startActivity(r3)
            goto L_0x00f9
        L_0x0442:
            r1 = 7
            r0.A01(r2, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33I.A02(X.2z0, java.lang.String, int, boolean, boolean):boolean");
    }

    public AnonymousClass33I(C57012sv r5, C106175Xx r6, C48352el r7, C89654ea r8, C69263Wi r9, C85244Fm r10, C56972sr r11, C66663Mh r12, C42662Pa r13, C29441ip r14, C64773Ex r15, C47882dz r16, C56422rx r17, AnonymousClass5ZU r18, C66413Li r19, AnonymousClass314 r20, C620633i r21, C56612sH r22, C57162tC r23, C53412n3 r24, C42182Nc r25, AnonymousClass1VX r26, AnonymousClass4FV r27, AnonymousClass31C r28, C105355Up r29, C1907099n r30, AnonymousClass9U4 r31, AnonymousClass9Th r32, AnonymousClass4FS r33, Integer num, boolean z, boolean z2) {
        C56612sH r1 = r22;
        this.A0N = r1;
        this.A07 = r8;
        this.A0S = r26;
        this.A0A = r11;
        AnonymousClass4FS r2 = r33;
        this.A0Z = r2;
        this.A0T = r27;
        this.A04 = r5;
        this.A0b = num;
        this.A0C = r12;
        this.A09 = r10;
        this.A0M = r21;
        C56422rx r3 = r17;
        this.A0H = r3;
        this.A0X = r31;
        this.A0d = z;
        this.A0c = z2;
        this.A0Y = r32;
        this.A0W = r30;
        this.A0V = r29;
        this.A0D = r13;
        this.A0O = r1;
        this.A08 = r9;
        this.A0B = r11;
        this.A0a = r2;
        this.A0U = r28;
        this.A0F = r15;
        this.A0J = r18;
        this.A06 = r7;
        this.A0K = r19;
        this.A05 = r6;
        this.A0R = r25;
        this.A0I = r3;
        this.A0L = r20;
        this.A0E = r14;
        this.A0G = r16;
        this.A0Q = r24;
        this.A0P = r23;
    }
}
