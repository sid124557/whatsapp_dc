package X;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0a9  reason: invalid class name and case insensitive filesystem */
public class C06990a9 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup A00;
    public C10560i8 A01;

    public static void A00(C06290Wz r3, C06290Wz r4, C10560i8 r5, Object obj, Object obj2) {
        View view = (View) obj;
        if (view != null && r5.A0W(view)) {
            Object obj3 = r3.get(obj2);
            Object obj4 = r4.get(view);
            if (obj3 != null && obj4 != null) {
                r5.A0F.add(obj3);
                r5.A0D.add(obj4);
                r3.remove(obj2);
                r4.remove(view);
            }
        }
    }

    public boolean onPreDraw() {
        AnonymousClass0MQ r8;
        AnonymousClass0U7 r2;
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (AnonymousClass0XC.A03.remove(viewGroup)) {
            AnonymousClass05C A002 = AnonymousClass0XC.A00();
            AbstractCollection abstractCollection = (AbstractCollection) A002.get(viewGroup);
            ArrayList arrayList = null;
            if (abstractCollection == null) {
                abstractCollection = AnonymousClass001.A0s();
                A002.put(viewGroup, abstractCollection);
            } else if (abstractCollection.size() > 0) {
                arrayList = AnonymousClass002.A0J(abstractCollection);
            }
            C10560i8 r13 = this.A01;
            abstractCollection.add(r13);
            r13.A0B(new C17670vx(A002, 1, this));
            r13.A0P(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C10560i8) it.next()).A0L(viewGroup);
                }
            }
            r13.A0F = AnonymousClass001.A0s();
            r13.A0D = AnonymousClass001.A0s();
            AnonymousClass0M8 r82 = r13.A09;
            AnonymousClass0M8 r6 = r13.A08;
            AnonymousClass05C r7 = new AnonymousClass05C((C06290Wz) r82.A02);
            AnonymousClass05C r5 = new AnonymousClass05C((C06290Wz) r6.A02);
            int i = 0;
            while (true) {
                int[] iArr = r13.A0K;
                if (i >= iArr.length) {
                    break;
                }
                int i2 = iArr[i];
                if (i2 == 1) {
                    int size = r7.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view = (View) r7.A02[size << 1];
                        if (view != null && r13.A0W(view) && (r2 = (AnonymousClass0U7) r5.remove(view)) != null && r13.A0W(r2.A00)) {
                            r13.A0F.add(r7.A07(size));
                            r13.A0D.add(r2);
                        }
                    }
                } else if (i2 == 2) {
                    AnonymousClass05C r11 = r82.A01;
                    AnonymousClass05C r10 = r6.A01;
                    int size2 = r11.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        View view2 = (View) C06290Wz.A00(r11, i3);
                        if (view2 != null && r13.A0W(view2)) {
                            A00(r7, r5, r13, r10.get(r11.A02[i3 << 1]), view2);
                        }
                    }
                } else if (i2 == 3) {
                    SparseArray sparseArray = r82.A00;
                    SparseArray sparseArray2 = r6.A00;
                    int size3 = sparseArray.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        View view3 = (View) sparseArray.valueAt(i4);
                        if (view3 != null && r13.A0W(view3)) {
                            A00(r7, r5, r13, sparseArray2.get(sparseArray.keyAt(i4)), view3);
                        }
                    }
                } else if (i2 == 4) {
                    C10550i7 r12 = r82.A03;
                    C10550i7 r112 = r6.A03;
                    int A012 = r12.A01();
                    for (int i5 = 0; i5 < A012; i5++) {
                        View view4 = (View) r12.A04(i5);
                        if (view4 != null && r13.A0W(view4)) {
                            A00(r7, r5, r13, C10550i7.A00(r112, r12.A02(i5)), view4);
                        }
                    }
                }
                i++;
            }
            for (int i6 = 0; i6 < r7.size(); i6++) {
                AnonymousClass0U7 r1 = (AnonymousClass0U7) C06290Wz.A00(r7, i6);
                if (r13.A0W(r1.A00)) {
                    r13.A0F.add(r1);
                    r13.A0D.add((Object) null);
                }
            }
            for (int i7 = 0; i7 < r5.size(); i7++) {
                AnonymousClass0U7 r14 = (AnonymousClass0U7) C06290Wz.A00(r5, i7);
                if (r13.A0W(r14.A00)) {
                    r13.A0D.add(r14);
                    r13.A0F.add((Object) null);
                }
            }
            AnonymousClass05C A03 = C10560i8.A03();
            int size4 = A03.size();
            C08780f3 r62 = new C08780f3(viewGroup);
            for (int i8 = size4 - 1; i8 >= 0; i8--) {
                Animator animator = (Animator) A03.A02[i8 << 1];
                if (!(animator == null || (r8 = (AnonymousClass0MQ) A03.get(animator)) == null || r8.A00 == null || !r62.equals(r8.A03))) {
                    AnonymousClass0U7 r4 = r8.A02;
                    View view5 = r8.A00;
                    AnonymousClass0U7 A0E = r13.A0E(view5, true);
                    AnonymousClass0U7 A0D = r13.A0D(view5, true);
                    if (!(A0E == null && A0D == null && (A0D = (AnonymousClass0U7) r13.A08.A02.get(view5)) == null) && r8.A01.A0X(r4, A0D)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            A03.remove(animator);
                        }
                    }
                }
            }
            r13.A0O(viewGroup, r13.A09, r13.A08, r13.A0F, r13.A0D);
            r13.A0I();
        }
        return true;
    }

    public void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AnonymousClass0XC.A03.remove(viewGroup);
        AbstractCollection abstractCollection = (AbstractCollection) AnonymousClass0XC.A00().get(viewGroup);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((C10560i8) it.next()).A0L(viewGroup);
            }
        }
        C10560i8 r1 = this.A01;
        r1.A09.A02.clear();
        r1.A09.A00.clear();
        r1.A09.A03.A06();
    }

    public C06990a9(ViewGroup viewGroup, C10560i8 r2) {
        this.A01 = r2;
        this.A00 = viewGroup;
    }

    public void onViewAttachedToWindow(View view) {
    }
}
