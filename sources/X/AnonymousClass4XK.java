package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.4XK  reason: invalid class name */
public class AnonymousClass4XK extends AnonymousClass0R6 implements C181718nD {
    public C108985dt A00;
    public Date A01 = new Date();
    public final AnonymousClass7C8 A02;
    public final AnonymousClass5PC A03;
    public final CartFragment A04;
    public final CartFragment A05;
    public final CartFragment A06;
    public final C152967aS A07;
    public final UserJid A08;
    public final List A09 = AnonymousClass001.A0s();

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i == 0) {
            return new C90284h1(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved), this.A04);
        } else if (i2 == 1) {
            AnonymousClass7C8 r2 = this.A02;
            AnonymousClass5PC r5 = this.A03;
            C152967aS r9 = this.A07;
            CartFragment cartFragment = this.A04;
            CartFragment cartFragment2 = this.A06;
            UserJid userJid = this.A08;
            C108985dt r12 = this.A00;
            View A0R = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved);
            C64333Db r0 = r2.A00.A04;
            return new C90314h4(A0R, r5, this, cartFragment, cartFragment2, r9, r0.AhS(), new C1448773h(), r12, C64333Db.A2t(r0), userJid);
        } else if (i2 == 2) {
            return new C90294h2(C18310x6.A0I(C86604Kt.A0E(viewGroup2, 0), viewGroup2, R.layout.f8nameremoved, false), this.A05);
        } else if (i2 == 3) {
            return new C132196er(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup2), viewGroup2, R.layout.f8nameremoved));
        } else {
            throw AnonymousClass001.A0e("CartItemsAdapter/onCreateViewHolder/unhandled view type");
        }
    }

    public int A0G() {
        return this.A09.size();
    }

    public int A0K() {
        int i = 0;
        for (C146937Ce r1 : this.A09) {
            if (r1 instanceof C132146em) {
                i = (int) (((long) i) + ((C132146em) r1).A00.A00);
            }
        }
        return i;
    }

    public final C132176ep A0L(int i) {
        List list = this.A09;
        if (i >= list.size() || i < 0) {
            return null;
        }
        C146937Ce r1 = (C146937Ce) list.get(i);
        if (r1 instanceof C132176ep) {
            return (C132176ep) r1;
        }
        return null;
    }

    public C146937Ce B76(int i) {
        return (C146937Ce) this.A09.get(i);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        ((C125626It) r2).A07((C146937Ce) this.A09.get(i));
    }

    public int getItemViewType(int i) {
        return ((C146937Ce) this.A09.get(i)).A00;
    }

    public AnonymousClass4XK(AnonymousClass7C8 r2, AnonymousClass5PC r3, CartFragment cartFragment, CartFragment cartFragment2, CartFragment cartFragment3, C152967aS r7, UserJid userJid) {
        this.A07 = r7;
        this.A04 = cartFragment;
        this.A03 = r3;
        this.A06 = cartFragment2;
        this.A05 = cartFragment3;
        this.A02 = r2;
        this.A08 = userJid;
    }

    public List A0M() {
        ArrayList A0s = AnonymousClass001.A0s();
        for (C146937Ce r1 : this.A09) {
            if (r1 instanceof C132146em) {
                A0s.add(((C132146em) r1).A00);
            }
        }
        return A0s;
    }
}
