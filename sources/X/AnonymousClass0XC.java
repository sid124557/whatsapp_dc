package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0XC  reason: invalid class name */
public class AnonymousClass0XC {
    public static C10560i8 A02 = new AnonymousClass0AH();
    public static ArrayList A03 = AnonymousClass001.A0s();
    public static ThreadLocal sRunningTransitions = new ThreadLocal();
    public AnonymousClass05C A00 = new AnonymousClass05C();
    public AnonymousClass05C A01 = new AnonymousClass05C();

    public static AnonymousClass05C A00() {
        AnonymousClass05C r2;
        Reference reference = (Reference) sRunningTransitions.get();
        if (reference != null && (r2 = (AnonymousClass05C) reference.get()) != null) {
            return r2;
        }
        AnonymousClass05C r22 = new AnonymousClass05C();
        sRunningTransitions.set(new WeakReference(r22));
        return r22;
    }

    public static void A01(ViewGroup viewGroup) {
        A03.remove(viewGroup);
        AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
        if (abstractCollection != null && !abstractCollection.isEmpty()) {
            ArrayList A0J = AnonymousClass002.A0J(abstractCollection);
            int size = A0J.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C10560i8) A0J.get(size)).A0N(viewGroup);
                } else {
                    return;
                }
            }
        }
    }

    public static void A02(ViewGroup viewGroup, C10560i8 r4) {
        ArrayList arrayList = A03;
        if (!arrayList.contains(viewGroup) && C06360Xi.A05(viewGroup)) {
            arrayList.add(viewGroup);
            if (r4 == null) {
                r4 = A02;
            }
            C10560i8 A06 = r4.clone();
            AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
            if (abstractCollection != null && abstractCollection.size() > 0) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    ((C10560i8) it.next()).A0K(viewGroup);
                }
            }
            if (A06 != null) {
                A06.A0P(viewGroup, true);
            }
            viewGroup.getTag(R.id.transition_current_scene);
            viewGroup.setTag(R.id.transition_current_scene, (Object) null);
            if (A06 != null) {
                C06990a9 r1 = new C06990a9(viewGroup, A06);
                viewGroup.addOnAttachStateChangeListener(r1);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(r1);
            }
        }
    }
}
