package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.components.InviteViaLinkView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.549  reason: invalid class name */
public class AnonymousClass549 extends C109665ez {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public void A07(View view) {
        AnonymousClass5R0 r2;
        C95814uZ r1;
        Object obj;
        switch (this.A04) {
            case 0:
                C95084sb r12 = (C95084sb) this.A03;
                if (r12 != null) {
                    r12.A0B = Boolean.TRUE;
                }
                r2 = ((InviteViaLinkView) this.A00).A00;
                r1 = (C95814uZ) this.A02;
                obj = this.A01;
                break;
            case 1:
                ((C93314oJ) this.A00).A25.BkM(new C71593cM((Object) this, this.A01, this.A02, this.A03, 35));
                return;
            case 2:
                ((C28071fd) this.A01).A07((Context) this.A00, AnonymousClass2z0.A00((C624134x) this.A02), (UserJid) this.A03);
                return;
            case 3:
                C95084sb r13 = (C95084sb) this.A02;
                if (r13 != null) {
                    r13.A0B = Boolean.TRUE;
                }
                r2 = ((C995456z) this.A03).getGroupInviteClickUtils();
                r1 = (C95814uZ) this.A01;
                obj = this.A00;
                break;
            case 4:
                ((C55862r2) this.A03).A03((Boolean) null, 13);
                ((AnonymousClass5ZD) this.A02).A04("avatar_sticker_picker", AnonymousClass0x9.A14(this.A01));
                return;
            default:
                AnonymousClass30E r5 = (AnonymousClass30E) this.A03;
                r5.A02.BkM(new C70363aN(this.A01, this.A00, r5, 36));
                ((C84764Dp) this.A02).Bes();
                return;
        }
        r2.A00((C89654ea) obj, r1);
    }

    public AnonymousClass549(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
    }
}
