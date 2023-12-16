package X;

import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import java.util.AbstractCollection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: X.3pT  reason: invalid class name and case insensitive filesystem */
public abstract class C75003pT extends C75013pU implements AnonymousClass4GV, C834248i {
    public final int arity;

    public static void A04(StickerExpressionsViewModel stickerExpressionsViewModel, AnonymousClass1U8 r6, List list, int i) {
        if (i != -1) {
            List subList = list.subList(i + 1, list.size());
            ((C832246p) stickerExpressionsViewModel.A0g).A04((Object) null, new AnonymousClass1U8((String) null, r6.A02, subList));
        }
    }

    public static boolean A06(Object obj, SortedSet sortedSet, AnonymousClass4GQ r4, C85524Gp r5) {
        C162457s7.A0J(sortedSet, 0);
        TreeSet treeSet = new TreeSet(sortedSet.comparator());
        treeSet.addAll(sortedSet);
        r4.invoke(treeSet);
        return r5.AzD(obj, treeSet);
    }

    public static void A05(AnonymousClass4GR r2, AnonymousClass4C6 r3, AnonymousClass4C8 r4) {
        C57742u8.A00(r3, new AnonymousClass4J6(r2, r4, 10));
    }

    public String toString() {
        if (this.completion != null) {
            return super.toString();
        }
        String A00 = C57712u5.A00(this);
        C162457s7.A0D(A00);
        return A00;
    }

    public C75003pT(C84814Du r1, int i) {
        super(r1);
        this.arity = i;
    }

    public static AnonymousClass4C8 A02(C08310eF r1, AnonymousClass4C8 r2) {
        AnonymousClass0O9 lifecycle = r1.A0V().getLifecycle();
        C162457s7.A0D(lifecycle);
        return AnonymousClass0IQ.A00(AnonymousClass0GC.STARTED, lifecycle, r2);
    }

    public static void A03(C60582yn r3, AnonymousClass2UW r4, C43952Uc r5, AbstractCollection abstractCollection) {
        abstractCollection.add(new C23491Tl(r4, (Integer) null, r3.A01(r5), 10));
    }

    public int getArity() {
        return this.arity;
    }
}
