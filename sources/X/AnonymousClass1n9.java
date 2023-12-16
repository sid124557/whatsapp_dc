package X;

import android.database.Cursor;

/* renamed from: X.1n9  reason: invalid class name */
public class AnonymousClass1n9 extends C30361mK implements AnonymousClass4B9, AnonymousClass4BA {
    public String A00;
    public String A01;
    public String A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.1n9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.1n9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.1nZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.1n9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.1n9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.C624134x Az2(X.AnonymousClass2z0 r14, long r15) {
        /*
            r13 = this;
            r2 = r13
            boolean r0 = r13 instanceof X.C30981nY
            r1 = r14
            r4 = r15
            if (r0 == 0) goto L_0x000f
            r6 = 0
        L_0x0008:
            r3 = 5
        L_0x0009:
            X.1n9 r0 = new X.1n9
            r0.<init>(r1, r2, r3, r4, r6)
            return r0
        L_0x000f:
            boolean r0 = r13 instanceof X.C30991nZ
            if (r0 == 0) goto L_0x002a
            X.1nZ r2 = (X.C30991nZ) r2
            r6 = 0
            X.C162457s7.A0J(r14, r6)
            boolean r0 = X.C18300x5.A1T(r2)
            if (r0 != 0) goto L_0x0008
            X.1nZ r0 = new X.1nZ
            r7 = r0
            r8 = r14
            r9 = r2
            r10 = r15
            r12 = r6
            r7.<init>(r8, r9, r10, r12)
            return r0
        L_0x002a:
            r6 = 0
            byte r3 = r13.A1I
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1n9.Az2(X.2z0, long):X.34x");
    }

    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r10) {
        AnonymousClass2z0 r3 = r10;
        if (this instanceof C30991nZ) {
            C30991nZ r4 = (C30991nZ) this;
            C162457s7.A0J(r10, 0);
            return new C30991nZ(r3, r4, r4.A0K, true);
        } else if (this instanceof C30981nY) {
            C30981nY r42 = (C30981nY) this;
            return new C30981nY(r10, r42, r42.A0K);
        } else {
            return new AnonymousClass1n9(r3, this, this.A1I, this.A0K, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1.startsWith(r2) != false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A1x() {
        /*
            r4 = this;
            java.lang.String r2 = r4.A01
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006b
            if (r1 == 0) goto L_0x005d
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001d
            X.C626936e.A06(r2)
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L_0x005d
        L_0x001d:
            java.lang.String r3 = r4.A00
        L_0x001f:
            X.C626936e.A06(r3)
        L_0x0022:
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = r3.length()
            if (r0 <= r1) goto L_0x002e
            java.lang.String r3 = X.AnonymousClass0x7.A0r(r3, r1)
        L_0x002e:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://maps.google.com/maps?q="
            r2.append(r0)
            java.lang.String r1 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r3.replaceAll(r1, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r2.append(r0)
            java.lang.String r0 = "&sll="
            r2.append(r0)
            double r0 = r4.A00
            r2.append(r0)
            X.C18320x8.A1K(r2)
            double r0 = r4.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x005d:
            java.lang.String r0 = r4.A1y()
            if (r0 == 0) goto L_0x0068
            java.lang.String r3 = r4.A1y()
            goto L_0x001f
        L_0x0068:
            java.lang.String r3 = ""
            goto L_0x0022
        L_0x006b:
            java.lang.String r0 = r4.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1n9.A1x():java.lang.String");
    }

    public String A1y() {
        String str = this.A01;
        String str2 = this.A00;
        if (str2 != null) {
            return AnonymousClass000.A0V("\n", str2, AnonymousClass000.A0l(str));
        }
        return str;
    }

    public void A1v(Cursor cursor) {
        super.A1v(cursor);
        this.A01 = AnonymousClass0x2.A0Z(cursor, "place_name");
        this.A00 = AnonymousClass0x2.A0Z(cursor, "place_address");
        this.A02 = AnonymousClass0x2.A0Z(cursor, "url");
    }

    public void A1w(Cursor cursor, C56972sr r3) {
        super.A1w(cursor, r3);
        this.A01 = AnonymousClass0x2.A0Z(cursor, "place_name");
        this.A00 = AnonymousClass0x2.A0Z(cursor, "place_address");
        this.A02 = AnonymousClass0x2.A0Z(cursor, "url");
    }

    public AnonymousClass1n9(AnonymousClass2z0 r1, byte b, long j) {
        super(r1, b, j);
    }

    public AnonymousClass1n9(AnonymousClass2z0 r2, AnonymousClass1n9 r3, byte b, long j, boolean z) {
        super(r2, r3, b, j, z);
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
    }

    public AnonymousClass1n9(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 5, j);
    }
}
