package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4XJ  reason: invalid class name */
public final class AnonymousClass4XJ extends AnonymousClass0R6 implements C181718nD {
    public final C146847Bv A00;
    public final C152967aS A01;
    public final OrderDetailFragment A02;
    public final AnonymousClass1VX A03;
    public final UserJid A04;
    public final List A05 = AnonymousClass001.A0s();

    public AnonymousClass4XJ(C146847Bv r2, C152967aS r3, OrderDetailFragment orderDetailFragment, AnonymousClass1VX r5, UserJid userJid) {
        C18260x0.A0b(r3, r2, r5, 1);
        this.A01 = r3;
        this.A02 = orderDetailFragment;
        this.A04 = userJid;
        this.A00 = r2;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            return new C90284h1(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), (CartFragment) null);
        }
        if (i == 1) {
            C146847Bv r2 = this.A00;
            C152967aS r7 = this.A01;
            OrderDetailFragment orderDetailFragment = this.A02;
            UserJid userJid = this.A04;
            View A0R = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
            C64333Db r0 = r2.A00.A04;
            C620733j A2t = C64333Db.A2t(r0);
            C104975Tb AhS = r0.AhS();
            return new C90304h3(A0R, C86624Kv.A0K(r0), this, r7, AhS, orderDetailFragment, A2t, userJid);
        } else if (i == 3) {
            return new C132186eq(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        } else {
            throw AnonymousClass001.A0e("CartItemsAdapter/onCreateViewHolder/unhandled view type");
        }
    }

    public int A0G() {
        return this.A05.size();
    }

    public C146937Ce B76(int i) {
        return (C146937Ce) this.A05.get(i);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        C125626It r22 = (C125626It) r2;
        C162457s7.A0J(r22, 0);
        r22.A07((C146937Ce) this.A05.get(i));
    }

    public int getItemViewType(int i) {
        return ((C146937Ce) this.A05.get(i)).A00;
    }
}
