package X;

/* renamed from: X.2wu  reason: invalid class name and case insensitive filesystem */
public final class C59432wu {
    public final C56972sr A00;
    public final C58382vA A01;
    public final C40912If A02;

    public static final void A00(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw AnonymousClass001.A0c("expected media key of length 32 bytes.");
        } else if (bArr2.length != 12) {
            throw AnonymousClass001.A0c("expected iv of length 12 bytes.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v34 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C95814uZ r13, com.whatsapp.jid.Jid r14, com.whatsapp.jid.UserJid r15, X.C30471mV r16, java.lang.String r17, java.lang.String r18, int r19, boolean r20) {
        /*
            r12 = this;
            r0 = 2
            X.C162457s7.A0J(r14, r0)
            r0 = 3
            r2 = r17
            X.C162457s7.A0J(r2, r0)
            r6 = 1
            r11 = r19
            if (r11 == r6) goto L_0x002d
            X.2sr r1 = r12.A00
            boolean r0 = r14 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x001f
            r0 = r14
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
        L_0x0018:
            boolean r0 = r1.A0b(r0)
            if (r0 != 0) goto L_0x002d
            return
        L_0x001f:
            boolean r0 = r14 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x002b
            r0 = r14
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.whatsapp.jid.DeviceJid r0 = X.C618932r.A00(r0)
            goto L_0x0018
        L_0x002b:
            r0 = 0
            goto L_0x0018
        L_0x002d:
            r0 = 0
            r3 = r16
            if (r16 == 0) goto L_0x0130
            r1 = 12
            byte[] r10 = X.AnonymousClass29O.A01(r1)
            X.33C r1 = X.C30471mV.A00(r3)
            byte[] r5 = r1.A0W
            X.C626936e.A06(r5)
            X.2z0 r1 = r3.A1J
            java.lang.String r4 = r1.A01
            if (r11 != r6) goto L_0x0049
            r0 = r18
        L_0x0049:
            X.2v1 r3 = new X.2v1
            r3.<init>(r4, r0, r11)
            X.C162457s7.A0H(r5)
            X.C162457s7.A0C(r4)
            X.C162457s7.A0J(r5, r6)
            A00(r5, r10)
            r1 = 2
            com.facebook.simplejni.NativeHolder r0 = r3.A00
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r1, r4, r0, r5, r10)
            byte[] r0 = (byte[]) r0
        L_0x0063:
            X.2vA r3 = r12.A01
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "xmpp/writer/before/write/media-retry-notification; id="
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = "; jid="
            r4.append(r1)
            r4.append(r14)
            java.lang.String r1 = "; remoteJid="
            r4.append(r1)
            r4.append(r13)
            java.lang.String r1 = "; fromMe="
            r4.append(r1)
            r8 = r20
            r4.append(r8)
            java.lang.String r1 = "; participant="
            r4.append(r1)
            r4.append(r15)
            java.lang.String r1 = "; errorCode="
            X.C18260x0.A0w(r1, r4, r11)
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "id"
            X.AnonymousClass39V.A03(r1, r2, r6)
            java.lang.String r1 = "to"
            X.AnonymousClass39V.A01(r14, r1, r6)
            java.lang.String r2 = "type"
            java.lang.String r1 = "mediaretry"
            X.AnonymousClass39V.A03(r2, r1, r6)
            java.lang.String r7 = "participant"
            if (r15 == 0) goto L_0x00b8
            X.AnonymousClass39V.A01(r15, r7, r6)
        L_0x00b8:
            r1 = 2
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r1)
            r4 = 0
            r9 = 1
            if (r0 == 0) goto L_0x011c
            if (r10 == 0) goto L_0x011c
            X.36K[] r2 = new X.AnonymousClass36K[r1]
            java.lang.String r11 = "enc_p"
            r1 = 0
            X.AnonymousClass36K.A0T(r11, r0, r2, r4)
            java.lang.String r0 = "enc_iv"
            X.AnonymousClass36K.A0T(r0, r10, r2, r9)
            java.lang.String r0 = "encrypt"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r1, r2)
        L_0x00d6:
            r5.add(r0)
        L_0x00d9:
            if (r13 == 0) goto L_0x0101
            r0 = 3
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass39V.A01(r13, r0, r2)
            java.lang.String r1 = "from_me"
            java.lang.String r0 = java.lang.String.valueOf(r8)
            X.AnonymousClass39V.A03(r1, r0, r2)
            if (r15 == 0) goto L_0x00f3
            X.AnonymousClass39V.A01(r15, r7, r2)
        L_0x00f3:
            X.39V[] r0 = X.C58382vA.A01
            java.lang.Object[] r1 = r2.toArray(r0)
            X.39V[] r1 = (X.AnonymousClass39V[]) r1
            java.lang.String r0 = "rmr"
            X.AnonymousClass36K.A0R(r0, r5, r1)
        L_0x0101:
            X.39V[] r0 = X.C58382vA.A01
            java.lang.Object[] r2 = r6.toArray(r0)
            X.39V[] r2 = (X.AnonymousClass39V[]) r2
            X.36K[] r1 = X.C18280x3.A1a(r5, r4)
            java.lang.String r0 = "notification"
            X.36K r2 = X.AnonymousClass36K.A0J(r0, r2, r1)
            X.31C r1 = r3.A00
            r0 = 34
            r1.A0G(r2, r0)
            return
        L_0x011c:
            if (r11 == r9) goto L_0x00d9
            X.39V[] r2 = new X.AnonymousClass39V[r9]
            java.lang.String r1 = "code"
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r1, (int) r11)
            r2[r4] = r0
            java.lang.String r0 = "error"
            X.36K r0 = X.AnonymousClass36K.A0I(r0, r2)
            goto L_0x00d6
        L_0x0130:
            r10 = r0
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59432wu.A01(X.4uZ, com.whatsapp.jid.Jid, com.whatsapp.jid.UserJid, X.1mV, java.lang.String, java.lang.String, int, boolean):void");
    }

    public C59432wu(C56972sr r1, C58382vA r2, C40912If r3) {
        C18260x0.A0Q(r1, r3);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
