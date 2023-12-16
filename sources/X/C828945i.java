package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.45i  reason: invalid class name and case insensitive filesystem */
public final class C828945i extends C829045j implements AnonymousClass4GU {
    public final /* synthetic */ C53192mh $params;
    public final /* synthetic */ C53482nA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C828945i(C53192mh r2, C53482nA r3) {
        super(5);
        this.this$0 = r3;
        this.$params = r2;
    }

    public /* bridge */ /* synthetic */ Object BGl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AnonymousClass4AI r1;
        Object r2;
        AnonymousClass2z0 r12 = (AnonymousClass2z0) obj;
        byte[] bArr = (byte[]) obj2;
        UserJid userJid = (UserJid) obj3;
        UserJid userJid2 = (UserJid) obj4;
        byte[] bArr2 = (byte[]) obj5;
        C162457s7.A0J(r12, 0);
        C18260x0.A0c(bArr, userJid, userJid2, bArr2);
        if (C162457s7.A0P(this.$params.A02, "Poll Vote")) {
            r1 = new AnonymousClass3OT(userJid2, r12);
        } else {
            r1 = new AnonymousClass3OS();
        }
        JniBridge jniBridge = this.this$0.A05;
        String str = r12.A01;
        C162457s7.A0C(str);
        C41852Lv A00 = C57512tl.A00(userJid, userJid2, jniBridge, str, this.$params.A02, bArr, r1.B40(), bArr2);
        AnonymousClass1A1 A0Q = C18320x8.A0Q();
        C33051sM.A02(userJid, A0Q, r12, false);
        C130786cX A06 = A0Q.A06();
        if (A00 == null) {
            r2 = AnonymousClass3Z0.A01(AnonymousClass001.A0e("Encryption using iJniBridge failed"));
        } else {
            r2 = new AnonymousClass3Z1(A00.A00, A00.A01, A06);
        }
        return new AnonymousClass3Z9(r2);
    }
}
