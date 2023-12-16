package X;

/* renamed from: X.9Zx  reason: invalid class name and case insensitive filesystem */
public final class C195889Zx implements C835348u {
    public final C835348u A00;
    public final C202059lJ A01;
    public final AnonymousClass9NO A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r4.equals("ui_rendered") != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        if (r4.equals("shadow_bind") != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        return r6.A00.B2m(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        if (r3.equals("wa.action.CheckCardNumber") == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e9, code lost:
        if (r3.equals("wa.action.CheckCpfCnpj") == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        switch(r0) {
            case 3: goto L_0x00fd;
            case 4: goto L_0x0106;
            case 5: goto L_0x004f;
            default: goto L_0x00f9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        r7.A03(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fd, code lost:
        r0 = X.AnonymousClass9WD.A01(X.C157967jD.A01(r7, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        r0 = X.AnonymousClass9WD.A00(X.C157967jD.A01(r7, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0112, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2m(X.C157967jD r7, X.C146787Bp r8, X.C151147Tp r9) {
        /*
            r6 = this;
            r1 = 0
            X.C162457s7.A0J(r8, r1)
            r5 = 1
            X.C18270x1.A10(r7, r5, r9)
            java.lang.String r3 = r8.A00
            java.lang.String r0 = "wa.action.perf.TrackPerfBlock"
            boolean r0 = X.C162457s7.A0P(r3, r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "Whatsapp/PAY: WaExtensions evaluate: action="
            X.C18260x0.A0q(r0, r3, r2)
            java.util.List r0 = r7.A00
            java.lang.Object r4 = r0.get(r1)
            X.C162457s7.A0D(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.get(r5)
            X.C162457s7.A0D(r5)
            java.lang.String r5 = (java.lang.String) r5
            X.9NO r3 = r6.A02
            if (r4 == 0) goto L_0x004e
            int r2 = r4.hashCode()
            r0 = -1564272644(0xffffffffa2c317fc, float:-5.288025E-18)
            if (r2 == r0) goto L_0x007d
            r0 = 283926139(0x10ec5e7b, float:9.323116E-29)
            if (r2 == r0) goto L_0x0050
            r0 = 646679040(0x268b8a00, float:9.682468E-16)
            if (r2 != r0) goto L_0x004e
            java.lang.String r0 = "ui_rendered"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0085
        L_0x004e:
            r2 = 0
        L_0x004f:
            return r2
        L_0x0050:
            java.lang.String r0 = "tracking_success"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004e
            X.5Vu r4 = r3.A00
            X.C162457s7.A0J(r5, r1)
            java.lang.String r3 = "ending_surface_name"
            java.lang.String r2 = "no_surface"
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x006c
            X.316 r0 = r4.A01
            r0.A0C(r3, r1, r5)
        L_0x006c:
            java.lang.String r0 = X.C105635Vu.A00(r5)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004e
            r1 = 2
            X.316 r0 = r4.A01
            r0.A0E(r1)
            goto L_0x004e
        L_0x007d:
            java.lang.String r0 = "shadow_bind"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004e
        L_0x0085:
            X.5Vu r2 = r3.A00
            X.C162457s7.A0J(r5, r1)
            java.lang.String r1 = X.C105635Vu.A00(r5)
            java.lang.String r0 = "no_surface"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004e
            X.316 r0 = r2.A01
            r0.A0B(r1)
            goto L_0x004e
        L_0x009c:
            java.lang.String r0 = "PAY: WaExtensions evaluate: action="
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r3, r2)
            java.lang.String r0 = "Whatsapp"
            android.util.Log.d(r0, r2)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1560255199: goto L_0x00b5;
                case -1120004527: goto L_0x00c6;
                case -246975243: goto L_0x00d0;
                case 51260781: goto L_0x00da;
                case 268909162: goto L_0x00e3;
                case 1206046387: goto L_0x00ec;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            X.48u r0 = r6.A00
            java.lang.Object r2 = r0.B2m(r7, r8, r9)
            return r2
        L_0x00b5:
            java.lang.String r0 = "wa.action.CheckPin"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = X.C157967jD.A01(r7, r1)
            boolean r0 = X.AnonymousClass9WD.A02(r0)
            goto L_0x010e
        L_0x00c6:
            java.lang.String r0 = "wa.action.novi.EncryptLogEventV2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ae
            r0 = 1
            goto L_0x00f5
        L_0x00d0:
            java.lang.String r0 = "wa.action.novi.EncryptLogEvent"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ae
            r0 = 2
            goto L_0x00f5
        L_0x00da:
            java.lang.String r0 = "wa.action.CheckCardNumber"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00fd
            goto L_0x00ae
        L_0x00e3:
            java.lang.String r0 = "wa.action.CheckCpfCnpj"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0106
            goto L_0x00ae
        L_0x00ec:
            java.lang.String r0 = "wa.action.novi.GetDataEnv"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ae
            r0 = 5
        L_0x00f5:
            r2 = 0
            switch(r0) {
                case 3: goto L_0x00fd;
                case 4: goto L_0x0106;
                case 5: goto L_0x004f;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            r7.A03(r1)
            return r2
        L_0x00fd:
            java.lang.String r0 = X.C157967jD.A01(r7, r1)
            boolean r0 = X.AnonymousClass9WD.A01(r0)
            goto L_0x010e
        L_0x0106:
            java.lang.String r0 = X.C157967jD.A01(r7, r1)
            boolean r0 = X.AnonymousClass9WD.A00(r0)
        L_0x010e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195889Zx.B2m(X.7jD, X.7Bp, X.7Tp):java.lang.Object");
    }

    public C195889Zx(C835348u r1, C202059lJ r2, AnonymousClass9NO r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
