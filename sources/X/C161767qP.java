package X;

/* renamed from: X.7qP  reason: invalid class name and case insensitive filesystem */
public class C161767qP {
    public static final byte[] A01 = {2};
    public static final byte[] A02 = {1};
    public final AnonymousClass31C A00;

    public void A05(C02000Dg r14, byte[] bArr, byte[] bArr2) {
        AnonymousClass31C r6 = this.A00;
        String A03 = r6.A03();
        C35691xH r3 = new C35691xH(A00(A03), bArr);
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/sendBeginLoginIq id=", A03, AnonymousClass001.A0o());
        r6.A0D(new AnonymousClass93A(r14, this, r3, bArr2, 1), r3.A00, A03, 255, 32000);
    }

    public void A08(C02010Dh r14, byte[] bArr, byte[] bArr2) {
        AnonymousClass31C r6 = this.A00;
        String A03 = r6.A03();
        C35711xJ r3 = new C35711xJ(A01(A03), bArr, 17);
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/sendBeginRegIq id=", A03, AnonymousClass001.A0o());
        r6.A0D(new AnonymousClass8JH(r14, this, r3, bArr, bArr2), r3.A00, A03, 255, 32000);
    }

    public void A0A(C188068yG r12) {
        AnonymousClass31C r4 = this.A00;
        String A03 = r4.A03();
        C35711xJ r2 = new C35711xJ(A01(A03), AnonymousClass0x9.A0m(1), 23);
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/sendUpdateMigrationIq id=", A03, AnonymousClass001.A0o());
        r4.A0D(new AnonymousClass939(r2, this, r12, 7), r2.A00, A03, 255, 32000);
    }

    public static C35371wl A00(String str) {
        return new C35371wl(new C35371wl(str, 24), new C35371wl(new C35261wa()));
    }

    public static C35371wl A01(String str) {
        return new C35371wl(new C35371wl(str, 25), new C35371wl(new C35261wa()));
    }

    public static final void A02(AnonymousClass36K r10, C182928pD r11, String str) {
        String str2;
        AnonymousClass36K A0l = r10.A0l("error");
        int i = -1;
        if (A0l == null) {
            C18260x0.A0r("encb/EncryptedBackupProtocolHelper/processError error node is empty, id=", str, AnonymousClass001.A0o());
            str2 = "error node is empty";
        } else {
            String A0r = A0l.A0r("text", (String) null);
            if (A0r == null) {
                C18260x0.A0r("encb/EncryptedBackupProtocolHelper/processError error text is empty, id=", str, AnonymousClass001.A0o());
                str2 = "error text is empty";
            } else {
                String A0r2 = A0l.A0r("code", (String) null);
                if (A0r2 == null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("encb/EncryptedBackupProtocolHelper/processError error code is empty, id=");
                    A0o.append(str);
                    C18260x0.A0r(", text=", A0r, A0o);
                    str2 = "error code is empty";
                } else {
                    try {
                        int parseInt = Integer.parseInt(A0r2);
                        if (parseInt == 408) {
                            String A0r3 = A0l.A0r("backoff", (String) null);
                            if (A0r3 == null) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                AnonymousClass001.A1K("encb/EncryptedBackupProtocolHelper/processError code=408 (request timeout) but backoff value is empty, id=", str, ", code=", A0o2);
                                A0o2.append(parseInt);
                                C18260x0.A0r(", text=", A0r, A0o2);
                                str2 = "timeout is empty";
                            } else {
                                try {
                                    i = Integer.parseInt(A0r3);
                                } catch (NumberFormatException unused) {
                                    StringBuilder A0o3 = AnonymousClass001.A0o();
                                    AnonymousClass001.A1K("encb/EncryptedBackupProtocolHelper/processError timeout is not numerical, id=", str, ", code=", A0o3);
                                    A0o3.append(parseInt);
                                    A0o3.append(", text=");
                                    A0o3.append(A0r);
                                    C18260x0.A0r(", timeout=", A0r3, A0o3);
                                    str2 = "timeout is not numerical";
                                }
                            }
                        }
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        AnonymousClass001.A1K("encb/EncryptedBackupProtocolHelper/processError id=", str, ", code=", A0o4);
                        A0o4.append(parseInt);
                        A0o4.append(", text=");
                        A0o4.append(A0r);
                        C18260x0.A0x(", timeout=", A0o4, i);
                        r11.BSG(A0r, parseInt, i);
                        return;
                    } catch (NumberFormatException unused2) {
                        StringBuilder A0o5 = AnonymousClass001.A0o();
                        C18260x0.A0p("encb/EncryptedBackupProtocolHelper/processError error code is not numerical, id=", str, ", text=", A0r, A0o5);
                        C18260x0.A0r(", errorCodeString=", A0r2, A0o5);
                        str2 = "error code is not numerical";
                    }
                }
            }
        }
        r11.BSG(str2, 1, i);
    }

    public void A03(C02000Dg r12) {
        AnonymousClass31C r4 = this.A00;
        String A03 = r4.A03();
        C35711xJ r2 = new C35711xJ(A00(A03), (Long) null, 21);
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/sendInitLoginIq id=", A03, AnonymousClass001.A0o());
        r4.A0D(new AnonymousClass939(r2, this, r12, 4), r2.A00, A03, 255, 32000);
    }

    public void A04(C02000Dg r11, byte[] bArr) {
        AnonymousClass31C r3 = this.A00;
        String A03 = r3.A03();
        C35711xJ r2 = new C35711xJ(A00(A03), bArr, 19);
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess id=", A03, AnonymousClass001.A0o());
        r3.A0D(new AnonymousClass939(r2, this, r11, 5), r2.A00, A03, 255, 32000);
    }

    public void A06(C02010Dh r12) {
        AnonymousClass31C r4 = this.A00;
        String A03 = r4.A03();
        C35711xJ r2 = new C35711xJ(A00(A03), (Long) null, 22);
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/sendInitRegIq id=", A03, AnonymousClass001.A0o());
        r4.A0D(new AnonymousClass939(r2, this, r12, 2), r2.A00, A03, 255, 32000);
    }

    public void A07(C02010Dh r11, byte[] bArr) {
        AnonymousClass31C r3 = this.A00;
        String A03 = r3.A03();
        C35711xJ r2 = new C35711xJ(A01(A03), bArr, 20);
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/sendFinishRegIq id=", A03, AnonymousClass001.A0o());
        r3.A0D(new AnonymousClass939(r2, this, r11, 3), r2.A00, A03, 255, 32000);
    }

    public void A09(C188058yF r11) {
        AnonymousClass31C r3 = this.A00;
        String A03 = r3.A03();
        C35711xJ r2 = new C35711xJ(A01(A03), 18);
        C18260x0.A0s("encb/EncryptedBackupProtocolHelper/sendDeleteAccountIq id=", A03, AnonymousClass001.A0o());
        r3.A0D(new AnonymousClass939(r2, this, r11, 6), r2.A00, A03, 255, 32000);
    }

    public C161767qP(AnonymousClass31C r1) {
        this.A00 = r1;
    }
}
