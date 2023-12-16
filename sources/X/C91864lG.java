package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4lG  reason: invalid class name and case insensitive filesystem */
public class C91864lG extends C91834lD {
    public final /* synthetic */ AnonymousClass7KC A00;
    public final /* synthetic */ AnonymousClass54V A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91864lG(AnonymousClass7KC r1, AnonymousClass54V r2, AnonymousClass5ZU r3, C620733j r4) {
        super(r3, r4);
        this.A01 = r2;
        this.A00 = r1;
    }

    public int A00(AnonymousClass3ZH r5, AnonymousClass3ZH r6) {
        AnonymousClass7KC r3 = this.A00;
        Class<UserJid> cls = UserJid.class;
        boolean A1Y = C86644Kx.A1Y(r5, cls, r3.A02);
        if (A1Y == C86644Kx.A1Y(r6, cls, r3.A02)) {
            return super.A00(r5, r6);
        }
        if (A1Y) {
            return -1;
        }
        return 1;
    }
}
