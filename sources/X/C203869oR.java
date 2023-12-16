package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9oR  reason: invalid class name and case insensitive filesystem */
public class C203869oR extends AnonymousClass9GI {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203869oR(C194569Tl r2, C133676hl r3) {
        super((Runnable) null);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean A0h;
        C133676hl A05;
        if (this.A02 != 0) {
            C133676hl r2 = (C133676hl) this.A01;
            UserJid userJid = r2.A05;
            if (!(userJid == null || (A05 = ((C194569Tl) this.A00).A01.A05(userJid)) == null)) {
                r2.A03 = A05.A03;
                r2.A04 = A05.A04;
            }
            A0h = ((C194569Tl) this.A00).A01.A0K(r2);
        } else {
            A0h = ((C194569Tl) this.A00).A00.A0h((List) this.A01);
        }
        return Boolean.valueOf(A0h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203869oR(C194569Tl r2, Runnable runnable, List list) {
        super(runnable);
        this.A00 = r2;
        this.A01 = list;
    }
}
