package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4hg  reason: invalid class name and case insensitive filesystem */
public abstract class C90534hg extends AnonymousClass6HX implements C185018sv, C186028ud {
    public C108985dt A00;
    public Boolean A01;
    public final C111095hX A02;
    public final C56972sr A03;
    public final AnonymousClass5Y9 A04;
    public final C152967aS A05;
    public final AnonymousClass1VX A06;
    public final UserJid A07;
    public final List A08 = AnonymousClass001.A0s();

    public long A0K(C109015dw r7) {
        if (r7 == null) {
            return 0;
        }
        boolean A0X = this.A06.A0X(4983);
        List list = this.A08;
        if (A0X) {
            return AnonymousClass5A1.A00(r7, list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C152217Ya A0J = AnonymousClass4L0.A0J(it);
            if (A0J.A02.A0F.equals(r7.A0F)) {
                return A0J.A00;
            }
        }
        return 0;
    }

    public AnonymousClass6J5 A0L(ViewGroup viewGroup, int i) {
        if (i == 9) {
            return new C132476fO(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        throw AnonymousClass001.A0e("product-list-base-adapter/onCreateViewHolder/unknown view type");
    }

    public void A0M() {
        boolean z = this instanceof BusinessProductListAdapter;
        boolean A0O = A0O();
        if (z) {
            if (A0O) {
                List list = this.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    if (next instanceof C132386fC) {
                        A0s.add(next);
                    }
                }
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    int indexOf = list.indexOf(next2);
                    list.remove(next2);
                    A08(indexOf);
                }
            }
        } else if (A0O) {
            List list2 = this.A00;
            int size = list2.size() - 2;
            int i = (size - 3) + 1;
            if (i < 0) {
                Log.w("CollectionProductListBaseAdapter/hideLoadingView/hideLoadingView invalied end pos");
                i = 0;
            }
            while (size >= i) {
                Object obj = list2.get(size);
                if (obj instanceof C132386fC) {
                    list2.remove(obj);
                    A08(size);
                }
                size--;
            }
        }
    }

    public void A0N() {
        if (!(this instanceof BusinessProductListAdapter)) {
            List list = this.A00;
            if (list.size() != 0 && !A0O()) {
                int i = 0;
                do {
                    int A032 = AnonymousClass002.A03(list);
                    list.add(A032, new C132386fC());
                    A07(A032);
                    i++;
                } while (i < 3);
            }
        } else if (!A0O()) {
            int i2 = 0;
            do {
                List list2 = this.A00;
                int max = Math.max(0, AnonymousClass002.A03(list2));
                list2.add(max, new C132386fC());
                A07(max);
                i2++;
            } while (i2 < 3);
        }
    }

    public boolean A0O() {
        if (this instanceof BusinessProductListAdapter) {
            List list = this.A00;
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : list) {
                if (next instanceof C132386fC) {
                    A0s.add(next);
                }
            }
            return AnonymousClass0x7.A1S(A0s);
        }
        List list2 = this.A00;
        if (list2.size() < 2) {
            return false;
        }
        return list2.get(AnonymousClass002.A04(list2, 2)) instanceof C132386fC;
    }

    public C108985dt B4z() {
        return this.A00;
    }

    public boolean B5J() {
        Boolean bool = this.A01;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public int B85(int i) {
        while (i >= 0) {
            if (BHh(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public C109015dw BBi(int i) {
        return ((C132426fH) this.A00.get(i)).A01;
    }

    public boolean BHh(int i) {
        List list = this.A00;
        if (i >= list.size() || i < 0 || ((C147037Co) list.get(i)).A00 != 14) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r3, int i) {
        AnonymousClass6J5 r32 = (AnonymousClass6J5) r3;
        if (getItemViewType(i) == 2) {
            ((C90564hj) r32).A00 = ((C132406fE) this.A00.get(i)).A00;
        }
        r32.A07((C147037Co) this.A00.get(i));
    }

    public boolean BoH() {
        return true;
    }

    public C90534hg(C111095hX r2, C56972sr r3, AnonymousClass5Y9 r4, C152967aS r5, AnonymousClass1VX r6, UserJid userJid) {
        this.A06 = r6;
        this.A07 = userJid;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
    }
}
