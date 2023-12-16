package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Hm  reason: invalid class name */
public class AnonymousClass6Hm extends AnonymousClass0R6 implements AnonymousClass4AX {
    public int A00 = 0;
    public int A01 = 0;
    public C48652fF A02;
    public LinkedHashMap A03 = C18320x8.A0r();
    public List A04 = AnonymousClass001.A0s();
    public final /* synthetic */ C158927km A05;

    public static void A00(Context context, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C160127n5(context.getString(i), 1));
    }

    public final void A0N() {
        this.A01 = 0;
        Iterator A10 = C18290x4.A10(this.A03);
        while (A10.hasNext()) {
            List list = (List) A10.next();
            if (list.size() > 1) {
                this.A01 += list.size();
            } else {
                return;
            }
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C125496Ig(C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false), this);
        }
        if (i == 1) {
            return new AnonymousClass6IY(C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false), this);
        }
        if (i == 2) {
            return new C125486If(C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false), this);
        }
        if (i == 3) {
            return new C188858zb(C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false), this, 0);
        }
        if (i == 4) {
            return new C188858zb(C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false), this, 1);
        }
        C18260x0.A0x("shapepicker/onCreateViewHolder/invalid state ", AnonymousClass001.A0o(), i);
        return null;
    }

    public AnonymousClass6Hm(C158927km r2) {
        this.A05 = r2;
    }

    public int A0G() {
        C158927km r1 = this.A05;
        boolean z = true;
        boolean A0D = r1.A0P.A0D(1);
        C125226Gy r3 = r1.A0O;
        int i = 0;
        if (r3 == null || !AnonymousClass000.A1T(AnonymousClass001.A0K(r3.A03.A07()))) {
            z = false;
        }
        int size = this.A04.size();
        if (z && ((String) r3.A02.A07()).isEmpty()) {
            i = this.A01 + (A0D ? 1 : 0);
        }
        return size + i;
    }

    public void A0J(C05570Ua r3) {
        ImageView imageView;
        if (r3 instanceof C125496Ig) {
            imageView = ((C125496Ig) r3).A01;
        } else if (r3 instanceof C125486If) {
            imageView = ((C125486If) r3).A00;
        } else {
            return;
        }
        imageView.setImageDrawable((Drawable) null);
    }

    public final C160127n5 A0K(int i) {
        Object obj;
        if (i < this.A04.size()) {
            obj = this.A04.get(i);
        } else if (this.A05.A0P.A0D(1) && i == A0G() - 1) {
            return new C160127n5(4);
        } else {
            int size = i - this.A04.size();
            Iterator A10 = C18290x4.A10(this.A03);
            while (A10.hasNext()) {
                List list = (List) A10.next();
                if (size < list.size()) {
                    obj = list.get(size);
                } else {
                    size -= list.size();
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Could not translate adapter position ");
            A0o.append(i);
            throw AnonymousClass000.A0F(" to a grid item.", A0o);
        }
        return (C160127n5) obj;
    }

    public final List A0L(C50612iT r6) {
        Collection<AnonymousClass3QV> collection = (Collection) this.A05.A0c.get(r6.A0G);
        C626936e.A06(collection);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new C160127n5(r6.A0I, 1));
        int i = 0;
        for (AnonymousClass3QV r1 : collection) {
            A0s.add(new C160127n5((C85164Fe) r1, i));
            i++;
        }
        return A0s;
    }

    public void A0M() {
        int size = this.A04.size();
        this.A04.clear();
        C158927km r10 = this.A05;
        int i = this.A00 * 2;
        boolean A1T = AnonymousClass000.A1T(AnonymousClass001.A0K(r10.A0O.A03.A07()));
        ArrayList A0s = AnonymousClass001.A0s();
        if (A1T) {
            C135726l9 r6 = r10.A0U;
            if (r6 != null && !r6.A01) {
                r6.A01 = true;
                C125326Hj r2 = r6.A09;
                C86634Kw.A1V(r2.A02, 0);
                Collections.sort(r2.A02);
                r2.A05();
                r2.A0K();
                r6.A00();
            }
            C27831ek r22 = r10.A0F;
            if (!AnonymousClass000.A1W(r22.A03)) {
                A00(r10.A05, A0s, R.string.f11nameremoved);
                A0s.add(new C160127n5(3));
            } else if (r22.A01() > 0) {
                A00(r10.A05, A0s, R.string.f11nameremoved);
                int i2 = 0;
                for (C85164Fe r1 : r22.A04(i)) {
                    A0s.add(new C160127n5(r1, i2));
                    i2++;
                }
            } else if (r6 != null && r6.A01) {
                r6.A01 = false;
                C125326Hj r12 = r6.A09;
                r12.A02.remove(0);
                Collections.sort(r12.A02);
                r12.A05();
                r12.A0K();
                r6.A00();
            }
            for (AnonymousClass20H r23 : AnonymousClass20H.values()) {
                A00(r10.A05, A0s, r23.sectionResId);
                int i3 = 0;
                for (C85164Fe r13 : r23.shapeData) {
                    A0s.add(new C160127n5(r13, i3));
                    i3++;
                }
            }
            AnonymousClass08M r14 = r10.A0P.A00;
            AnonymousClass2LM r0 = (AnonymousClass2LM) r14.A07();
            if (r0 != null && r0.A01) {
                Set<AnonymousClass3QV> set = r10.A0d;
                if (set.size() > 0) {
                    A00(r10.A05, A0s, R.string.f11nameremoved);
                    int i4 = 0;
                    for (AnonymousClass3QV r15 : set) {
                        A0s.add(new C160127n5((C85164Fe) r15, i4));
                        i4++;
                    }
                }
            }
            AnonymousClass2LM r02 = (AnonymousClass2LM) r14.A07();
            if (r02 == null || !r02.A01) {
                A00(r10.A05, A0s, R.string.f11nameremoved);
                A0s.add(new C160127n5(3));
            }
        } else {
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (C149467Mo r62 : C155677fI.A00(r10.A0D)) {
                C18270x1.A1K(A0s2, A0s.size());
                A0s.add(new C160127n5(r10.A05.getString(r62.A02), 1));
                Iterator A0q = C18320x8.A0q(r62.A03.get());
                int i5 = 0;
                while (A0q.hasNext()) {
                    AnonymousClass3QU r24 = new AnonymousClass3QU((C106655Zv) A0q.next(), r10.A0C);
                    A0s.add(new C160127n5((C85164Fe) r24, i5));
                    i5++;
                    r10.A0g.put(r24.BDW(), r24);
                }
            }
            C135736lA r25 = r10.A0T;
            C626936e.A0B(AnonymousClass000.A1U(A0s2.size(), C135736lA.A01.length));
            C125326Hj r03 = r25.A09;
            r03.A02 = A0s2;
            Collections.sort(A0s2);
            r03.A05();
            r03.A0K();
            r25.A00();
        }
        this.A04 = A0s;
        A09(0, Math.max(size, A0s.size()));
        if (size != this.A04.size()) {
            A0O();
        }
    }

    public final void A0O() {
        C158927km r6 = this.A05;
        C135726l9 r3 = r6.A0U;
        if (r3 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator A0u = AnonymousClass001.A0u(this.A03);
            int i = 0;
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                if (i >= this.A01 - 1) {
                    break;
                }
                A0s.add(AnonymousClass0x7.A0k(A0w, r6.A0b));
                C18270x1.A1K(A0s2, this.A04.size() + i);
                i += ((List) A0w.getValue()).size();
            }
            C626936e.A0B(AnonymousClass000.A1U(A0s.size(), A0s2.size()));
            List list = r3.A03;
            list.clear();
            list.addAll(A0s);
            ArrayList A0J = AnonymousClass002.A0J(A0s2);
            if (r3.A01) {
                C18270x1.A1K(A0J, 0);
            }
            C125326Hj r0 = r3.A09;
            r0.A02 = A0J;
            Collections.sort(A0J);
            r0.A05();
            r0.A0K();
            r3.A00();
        }
    }

    public void A0P(String str) {
        List list = (List) this.A03.get(str);
        if (list != null) {
            Iterator A0u = AnonymousClass001.A0u(this.A03);
            int i = 0;
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                if (str.equals(A0w.getKey())) {
                    int size = i + this.A04.size();
                    this.A03.remove(str);
                    A0N();
                    this.A01.A03(size, list.size());
                    A0O();
                    return;
                }
                i += ((List) A0w.getValue()).size();
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Sticker pack id ");
            A0o.append(str);
            throw AnonymousClass000.A0F(" is not contained in data set", A0o);
        }
    }

    public void BaW(C48652fF r6) {
        if (r6.equals(this.A02)) {
            this.A04 = AnonymousClass001.A0s();
            List list = r6.A01;
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    C85164Fe r2 = (C85164Fe) list.get(i);
                    this.A05.A0g.put(r2.BDW(), r2);
                    this.A04.add(new C160127n5((C85164Fe) list.get(i), i));
                }
            } else {
                this.A04.add(new C160127n5((String) this.A05.A0O.A02.A07(), 2));
            }
            A05();
        }
    }

    public void BNf(C05570Ua r10, int i) {
        String A0C;
        C148297Hv r1;
        C160127n5 A0K = A0K(i);
        int i2 = A0K.A02;
        if (i2 == 0) {
            C125496Ig r102 = (C125496Ig) r10;
            ShapeItemView shapeItemView = r102.A01;
            C85164Fe r5 = A0K.A03;
            C626936e.A06(r5);
            r102.A00 = r5;
            shapeItemView.A01 = r5.BDW();
            C85164Fe r4 = r102.A00;
            if (r4.Bjq()) {
                C158927km r2 = this.A05;
                Reference reference = (Reference) r2.A0e.get(r5.BDW());
                if (reference == null || (r1 = (C148297Hv) reference.get()) == null) {
                    shapeItemView.setImageDrawable(new AnonymousClass6Ct());
                    shapeItemView.setContentDescription((CharSequence) null);
                    C124766Du r42 = r2.A0L;
                    Message obtain = Message.obtain(r42, 0, 0, 0, shapeItemView);
                    String BDW = r5.BDW();
                    Bundle A08 = AnonymousClass002.A08();
                    A08.putString("tag_bundle_key", BDW);
                    obtain.setData(A08);
                    r42.sendMessageAtFrontOfQueue(obtain);
                    return;
                }
                shapeItemView.setImageDrawable(r1.A00);
                A0C = r1.A01;
            } else {
                Context context = shapeItemView.getContext();
                C158927km r22 = this.A05;
                C105425Uw B13 = r4.B13(context, r22.A0B, true);
                B13.A0J(r22.A01);
                if (B13.A0R()) {
                    B13.A0G(r22.A00);
                }
                shapeItemView.setImageDrawable(new C124516Cu(B13));
                A0C = B13.A0C(r22.A05);
            }
            shapeItemView.setContentDescription(A0C);
        } else if (i2 == 1) {
            ((AnonymousClass6IY) r10).A00.setText(A0K.A04);
        } else if (i2 == 2) {
            C158927km r0 = this.A05;
            AnonymousClass5Y0 r8 = r0.A0C;
            Activity activity = r0.A05;
            Drawable A052 = r8.A05(activity.getResources(), new C94274qr(new int[]{129335}), -1);
            C125486If r103 = (C125486If) r10;
            r103.A01.setText(AnonymousClass002.A0F(activity, A0K.A04, new Object[1], 0, R.string.f11nameremoved));
            r103.A00.setImageDrawable(A052);
        }
    }

    public int getItemViewType(int i) {
        return A0K(i).A02;
    }
}
