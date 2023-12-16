package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2xJ  reason: invalid class name and case insensitive filesystem */
public class C59682xJ {
    public static final byte[] A06 = AnonymousClass0x7.A1X("UtfZhxytgNVaD5/UqJ8DNtx9FNSWzywusKGQuB+BmLY=");
    public final C56612sH A00;
    public final AnonymousClass1VX A01;
    public final C102015Hd A02;
    public final AnonymousClass2H0 A03;
    public final AnonymousClass5GQ A04;
    public final AnonymousClass4FS A05;

    public C59682xJ(C56612sH r1, AnonymousClass1VX r2, C102015Hd r3, AnonymousClass2H0 r4, AnonymousClass5GQ r5, AnonymousClass4FS r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public boolean A00(UserJid userJid) {
        if (!C627336j.A0L(userJid)) {
            AnonymousClass1VX r2 = this.A01;
            C58422vE r1 = C58422vE.A02;
            if (!r2.A0Y(r1, 2966) || !r2.A0Y(r1, 3336)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
