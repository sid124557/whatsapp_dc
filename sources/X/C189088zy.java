package X;

import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.8zy  reason: invalid class name and case insensitive filesystem */
public class C189088zy extends C56602sG {
    public Object A00;
    public final int A01;

    public C189088zy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A03(C95814uZ r4) {
        switch (this.A01) {
            case 0:
                C131766e9.A0C(this.A00, r4);
                return;
            case 1:
                CallGrid callGrid = (CallGrid) this.A00;
                if (callGrid.A09 != null) {
                    callGrid.A0M.BkP(new C70183a5(this, 6, r4));
                    return;
                }
                return;
            case 2:
                ((AnonymousClass4XD) this.A00).A0Q(AnonymousClass32Y.A05(r4));
                return;
            case 4:
                ((AnonymousClass7XG) this.A00).A04.A0L(r4);
                return;
            case 5:
                ((C111445i6) this.A00).A0h.A05();
                return;
            default:
                super.A03(r4);
                return;
        }
    }

    public void A05(UserJid userJid) {
        if (4 - this.A01 != 0) {
            super.A05(userJid);
        } else {
            ((AnonymousClass7XG) this.A00).A04.A0L(userJid);
        }
    }

    public void A06(UserJid userJid) {
        switch (this.A01) {
            case 0:
                C131766e9.A0C(this.A00, userJid);
                return;
            case 3:
                AnonymousClass4Rs r1 = (AnonymousClass4Rs) this.A00;
                if (userJid.equals(r1.A0C)) {
                    r1.A02();
                    return;
                }
                return;
            case 4:
                ((AnonymousClass7XG) this.A00).A04.A0L(userJid);
                return;
            case 5:
                ((C111445i6) this.A00).A0h.A05();
                return;
            default:
                super.A06(userJid);
                return;
        }
    }

    public void A09(Collection collection) {
        if (3 - this.A01 != 0) {
            super.A09(collection);
        } else {
            AnonymousClass4Rs.A00((AnonymousClass4Rs) this.A00, collection);
        }
    }

    public void A0A(Collection collection) {
        switch (this.A01) {
            case 4:
                AnonymousClass7XG r0 = (AnonymousClass7XG) this.A00;
                if (collection == null) {
                    r0.A04.A0K();
                    return;
                } else {
                    r0.A04.A0M(AnonymousClass002.A0J(collection));
                    return;
                }
            case 5:
                ((C111445i6) this.A00).A0h.A05();
                return;
            default:
                super.A0A(collection);
                return;
        }
    }

    public void A0B(Collection collection) {
        if (3 - this.A01 != 0) {
            super.A0B(collection);
        } else {
            AnonymousClass4Rs.A00((AnonymousClass4Rs) this.A00, collection);
        }
    }
}
