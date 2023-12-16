package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4XL  reason: invalid class name */
public class AnonymousClass4XL extends AnonymousClass0R6 implements C185018sv {
    public AnonymousClass80S A00;
    public C108985dt A01;
    public AnonymousClass1VX A02;
    public Boolean A03;
    public final C56972sr A04;
    public final C152967aS A05;
    public final C104975Tb A06;
    public final C184108rG A07;
    public final C620733j A08;
    public final UserJid A09;
    public final List A0A = AnonymousClass001.A0s();
    public final List A0B = AnonymousClass001.A0s();

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (i == 1) {
            return new C132446fL(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        if (i == 0) {
            UserJid userJid = this.A09;
            C56972sr r3 = this.A04;
            C620733j r11 = this.A08;
            C152967aS r5 = this.A05;
            C184108rG r10 = this.A07;
            return AnonymousClass5A3.A00(viewGroup.getContext(), viewGroup2, r3, new C146957Cg(897460699), r5, this, (C181828nP) null, this.A06, (C181878nU) null, r10, r11, userJid);
        } else if (i == 2) {
            return new C132476fO(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        } else {
            if (i == 3) {
                return new C132436fJ(AnonymousClass001.A0R(LayoutInflater.from(viewGroup.getContext()), viewGroup, R.layout.f8nameremoved));
            }
            throw C86604Kt.A0h("Unsupported view type - ", AnonymousClass001.A0o(), i);
        }
    }

    public void A0C(RecyclerView recyclerView) {
        this.A00 = new AnonymousClass80S(recyclerView, this);
    }

    public int A0G() {
        return this.A0B.size();
    }

    public void A0J(C05570Ua r2) {
        if (r2 instanceof C132476fO) {
            AnonymousClass6J5 r22 = (AnonymousClass6J5) r2;
            if (r22 instanceof C132476fO) {
                r22.A0H.clearAnimation();
            }
        }
    }

    public boolean A0K() {
        List list = this.A0B;
        if (list.size() <= 0 || !(list.get(0) instanceof AnonymousClass8EW)) {
            return false;
        }
        return true;
    }

    public C108985dt B4z() {
        return this.A01;
    }

    public boolean B5J() {
        Boolean bool = this.A03;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public C109015dw BBi(int i) {
        return ((AnonymousClass8EZ) this.A0B.get(i)).A00;
    }

    public int getItemViewType(int i) {
        return ((C181748nG) this.A0B.get(i)).getType();
    }

    public AnonymousClass4XL(C56972sr r2, C152967aS r3, C104975Tb r4, C184108rG r5, C620733j r6, AnonymousClass1VX r7, UserJid userJid) {
        this.A02 = r7;
        this.A09 = userJid;
        this.A04 = r2;
        this.A08 = r6;
        this.A05 = r3;
        this.A07 = r5;
        this.A06 = r4;
    }

    public void BNf(C05570Ua r7, int i) {
        long j;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            String str = ((AnonymousClass8EY) this.A0B.get(i)).A00;
            WaTextView waTextView = ((C132446fL) r7).A00;
            waTextView.setText(str);
            waTextView.setContentDescription(C86614Ku.A0s(waTextView.getContext(), str, new Object[1], R.string.f11nameremoved));
        } else if (itemViewType == 0) {
            C109015dw BBi = BBi(i);
            C90574hk r72 = (C90574hk) r7;
            boolean A0X = this.A02.A0X(4983);
            List list = this.A0A;
            if (!A0X) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 0;
                        break;
                    }
                    C152217Ya A0J = AnonymousClass4L0.A0J(it);
                    if (A0J.A02.A0F.equals(BBi.A0F)) {
                        j = A0J.A00;
                        break;
                    }
                }
            } else {
                j = AnonymousClass5A1.A00(BBi, list);
            }
            r72.A08(new C132426fH(BBi, j));
        } else if (itemViewType == 2) {
            new C132386fC();
            ((C132476fO) r7).A08();
        } else if (itemViewType != 3) {
            throw C86604Kt.A0h("Unsupported view type - ", AnonymousClass001.A0o(), itemViewType);
        }
    }
}
