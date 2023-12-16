package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1sq  reason: invalid class name and case insensitive filesystem */
public final class C33341sq extends AnonymousClass5ZM {
    public final C95814uZ A00;
    public final /* synthetic */ AnonymousClass3S3 A01;

    public C33341sq(C95814uZ r1, AnonymousClass3S3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        byte[] bArr;
        AnonymousClass2K8 A04;
        AnonymousClass3S3 r2 = this.A01;
        UserJid A03 = AnonymousClass32Y.A03(this.A00);
        if (A03 == null || (A04 = r2.A02.A04(A03)) == null) {
            bArr = null;
        } else {
            bArr = A04.A01;
        }
        return new C41662Lc(r2, bArr);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3S3 r1 = this.A01;
        AnonymousClass3S3.A00(this.A00, (C41662Lc) obj, r1);
    }
}
