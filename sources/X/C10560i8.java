package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0i8  reason: invalid class name and case insensitive filesystem */
public abstract class C10560i8 implements Cloneable {
    public static ThreadLocal A0L = new ThreadLocal();
    public static final C02990Ik A0M = new C02990Ik();
    public static final int[] A0N = {2, 1, 3, 4};
    public int A00 = 0;
    public long A01 = -1;
    public long A02 = -1;
    public TimeInterpolator A03 = null;
    public C02990Ik A04 = A0M;
    public C04140My A05;
    public C03000Il A06;
    public AnonymousClass0A7 A07 = null;
    public AnonymousClass0M8 A08 = new AnonymousClass0M8();
    public AnonymousClass0M8 A09 = new AnonymousClass0M8();
    public String A0A = AnonymousClass000.A0O(this);
    public ArrayList A0B = AnonymousClass001.A0s();
    public ArrayList A0C = AnonymousClass001.A0s();
    public ArrayList A0D;
    public ArrayList A0E = null;
    public ArrayList A0F;
    public ArrayList A0G = AnonymousClass001.A0s();
    public ArrayList A0H = AnonymousClass001.A0s();
    public boolean A0I = false;
    public boolean A0J = false;
    public int[] A0K = A0N;

    /* renamed from: A06 */
    public C10560i8 clone() {
        try {
            C10560i8 r1 = (C10560i8) super.clone();
            r1.A0B = AnonymousClass001.A0s();
            r1.A09 = new AnonymousClass0M8();
            r1.A08 = new AnonymousClass0M8();
            r1.A0F = null;
            r1.A0D = null;
            return r1;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract void A0U(AnonymousClass0U7 r1);

    public abstract void A0V(AnonymousClass0U7 r1);

    public boolean A0X(AnonymousClass0U7 r8, AnonymousClass0U7 r9) {
        if (r8 == null || r9 == null) {
            return false;
        }
        String[] A0Y = A0Y();
        if (A0Y != null) {
            for (String str : A0Y) {
                Object obj = r8.A02.get(str);
                Object obj2 = r9.A02.get(str);
                if (obj == null) {
                    if (obj2 == null) {
                    }
                } else if (obj2 != null && !(!obj.equals(obj2))) {
                }
            }
            return false;
        }
        Map map = r8.A02;
        for (Object next : map.keySet()) {
            Object obj3 = map.get(next);
            Object obj4 = r9.A02.get(next);
            if (obj3 == null) {
                if (obj4 == null) {
                }
            } else if (obj4 != null && !(!obj3.equals(obj4))) {
            }
        }
        return false;
        return true;
    }

    public static AnonymousClass05C A03() {
        ThreadLocal threadLocal = A0L;
        AnonymousClass05C r0 = (AnonymousClass05C) threadLocal.get();
        if (r0 != null) {
            return r0;
        }
        AnonymousClass05C r02 = new AnonymousClass05C();
        threadLocal.set(r02);
        return r02;
    }

    public static void A04(View view, AnonymousClass0U7 r7, AnonymousClass0M8 r8) {
        r8.A02.put(view, r7);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = r8.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String A062 = AnonymousClass0YZ.A06(view);
        if (A062 != null) {
            AnonymousClass05C r1 = r8.A01;
            if (r1.containsKey(A062)) {
                r1.put(A062, (Object) null);
            } else {
                r1.put(A062, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C10550i7 r4 = r8.A03;
                if (r4.A01) {
                    r4.A07();
                }
                if (AnonymousClass0VY.A01(r4.A02, r4.A00, itemIdAtPosition) >= 0) {
                    View view2 = (View) r4.A05(itemIdAtPosition, (Object) null);
                    if (view2 != null) {
                        AnonymousClass0YY.A09(view2, false);
                        r4.A0A(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                AnonymousClass0YY.A09(view, true);
                r4.A0A(itemIdAtPosition, view);
            }
        }
    }

    public C10560i8 A09(View view) {
        this.A0H.add(view);
        return this;
    }

    public C10560i8 A0A(View view) {
        this.A0H.remove(view);
        return this;
    }

    public C10560i8 A0B(C16980uL r2) {
        ArrayList arrayList = this.A0E;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            this.A0E = arrayList;
        }
        arrayList.add(r2);
        return this;
    }

    public C10560i8 A0C(C16980uL r2) {
        ArrayList arrayList = this.A0E;
        if (arrayList != null) {
            arrayList.remove(r2);
            if (this.A0E.size() == 0) {
                this.A0E = null;
            }
        }
        return this;
    }

    public AnonymousClass0U7 A0D(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        AnonymousClass0A7 r0 = this.A07;
        if (r0 != null) {
            return r0.A0D(view, z);
        }
        if (z) {
            arrayList = this.A0F;
        } else {
            arrayList = this.A0D;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AnonymousClass0U7 r1 = (AnonymousClass0U7) arrayList.get(i);
            if (r1 == null) {
                return null;
            }
            if (r1.A00 != view) {
                i++;
            } else if (i < 0) {
                return null;
            } else {
                if (z) {
                    arrayList2 = this.A0D;
                } else {
                    arrayList2 = this.A0F;
                }
                return (AnonymousClass0U7) arrayList2.get(i);
            }
        }
        return null;
    }

    public AnonymousClass0U7 A0E(View view, boolean z) {
        AnonymousClass0M8 r0;
        AnonymousClass0A7 r02 = this.A07;
        if (r02 != null) {
            return r02.A0E(view, z);
        }
        if (z) {
            r0 = this.A09;
        } else {
            r0 = this.A08;
        }
        return (AnonymousClass0U7) r0.A02.get(view);
    }

    public void A0G() {
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.A0E;
        if (arrayList2 != null && arrayList2.size() > 0) {
            AbstractList abstractList = (AbstractList) arrayList2.clone();
            int size2 = abstractList.size();
            for (int i = 0; i < size2; i++) {
                ((C16980uL) abstractList.get(i)).Bee(this);
            }
        }
    }

    public void A0H() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            ArrayList arrayList = this.A0E;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C16980uL) abstractList.get(i2)).Bef(this);
                }
            }
            int i3 = 0;
            while (true) {
                C10550i7 r1 = this.A09.A03;
                if (i3 >= r1.A01()) {
                    break;
                }
                View view = (View) r1.A04(i3);
                if (view != null) {
                    AnonymousClass0YY.A09(view, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                C10550i7 r12 = this.A08.A03;
                if (i4 < r12.A01()) {
                    View view2 = (View) r12.A04(i4);
                    if (view2 != null) {
                        AnonymousClass0YY.A09(view2, false);
                    }
                    i4++;
                } else {
                    this.A0I = true;
                    return;
                }
            }
        }
    }

    public void A0J() {
        if (this.A00 == 0) {
            ArrayList arrayList = this.A0E;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    ((C16980uL) abstractList.get(i)).Bei(this);
                }
            }
            this.A0I = false;
        }
        this.A00++;
    }

    public void A0K(View view) {
        if (!this.A0I) {
            ArrayList arrayList = this.A0C;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Animator) arrayList.get(size)).pause();
            }
            ArrayList arrayList2 = this.A0E;
            if (arrayList2 != null && arrayList2.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList2.clone();
                int size2 = abstractList.size();
                for (int i = 0; i < size2; i++) {
                    ((C16980uL) abstractList.get(i)).Beg(this);
                }
            }
            this.A0J = true;
        }
    }

    public void A0L(View view) {
        if (this.A0J) {
            if (!this.A0I) {
                ArrayList arrayList = this.A0C;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.A0E;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    AbstractList abstractList = (AbstractList) arrayList2.clone();
                    int size2 = abstractList.size();
                    for (int i = 0; i < size2; i++) {
                        ((C16980uL) abstractList.get(i)).Beh(this);
                    }
                }
            }
            this.A0J = false;
        }
    }

    public final void A0M(View view, boolean z) {
        AnonymousClass0M8 r0;
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                AnonymousClass0U7 r1 = new AnonymousClass0U7(view);
                if (z) {
                    A0V(r1);
                } else {
                    A0U(r1);
                }
                r1.A01.add(this);
                A0T(r1);
                if (z) {
                    r0 = this.A09;
                } else {
                    r0 = this.A08;
                }
                A04(view, r1, r0);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    A0M(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public void A0P(ViewGroup viewGroup, boolean z) {
        AnonymousClass0M8 r0;
        AnonymousClass0M8 r02;
        AnonymousClass0M8 r03;
        if (z) {
            this.A09.A02.clear();
            this.A09.A00.clear();
            r0 = this.A09;
        } else {
            this.A08.A02.clear();
            this.A08.A00.clear();
            r0 = this.A08;
        }
        r0.A03.A06();
        ArrayList arrayList = this.A0G;
        if (arrayList.size() > 0 || this.A0H.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = viewGroup.findViewById(AnonymousClass001.A0K(arrayList.get(i)));
                if (findViewById != null) {
                    AnonymousClass0U7 r1 = new AnonymousClass0U7(findViewById);
                    if (z) {
                        A0V(r1);
                    } else {
                        A0U(r1);
                    }
                    r1.A01.add(this);
                    A0T(r1);
                    if (z) {
                        r03 = this.A09;
                    } else {
                        r03 = this.A08;
                    }
                    A04(findViewById, r1, r03);
                }
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0H;
                if (i2 < arrayList2.size()) {
                    View A0S = AnonymousClass001.A0S(arrayList2, i2);
                    AnonymousClass0U7 r12 = new AnonymousClass0U7(A0S);
                    if (z) {
                        A0V(r12);
                    } else {
                        A0U(r12);
                    }
                    r12.A01.add(this);
                    A0T(r12);
                    if (z) {
                        r02 = this.A09;
                    } else {
                        r02 = this.A08;
                    }
                    A04(A0S, r12, r02);
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            A0M(viewGroup, z);
        }
    }

    public void A0Q(C02990Ik r1) {
        if (r1 == null) {
            r1 = A0M;
        }
        this.A04 = r1;
    }

    public void A0T(AnonymousClass0U7 r8) {
        if (this.A06 != null) {
            Map map = r8.A02;
            if (!map.isEmpty()) {
                String[] strArr = AnonymousClass0AG.A02;
                for (String containsKey : strArr) {
                    if (!map.containsKey(containsKey)) {
                        View view = r8.A00;
                        Object obj = map.get("android:visibility:visibility");
                        if (obj == null) {
                            obj = Integer.valueOf(view.getVisibility());
                        }
                        map.put("android:visibilityPropagation:visibility", obj);
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int round = iArr[0] + Math.round(view.getTranslationX());
                        iArr[0] = round;
                        iArr[0] = round + (view.getWidth() / 2);
                        int round2 = iArr[1] + Math.round(view.getTranslationY());
                        iArr[1] = round2;
                        iArr[1] = round2 + (view.getHeight() / 2);
                        map.put("android:visibilityPropagation:center", iArr);
                        return;
                    }
                }
            }
        }
    }

    public String[] A0Y() {
        return null;
    }

    public String toString() {
        return A0F("");
    }

    public String A0F(String str) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        AnonymousClass000.A1A(this, A0l);
        A0l.append("@");
        AnonymousClass001.A1N(A0l, hashCode());
        String A0X = AnonymousClass000.A0X(": ", A0l);
        long j = this.A01;
        if (j != -1) {
            StringBuilder A0l2 = AnonymousClass000.A0l(A0X);
            A0l2.append("dur(");
            A0l2.append(j);
            A0X = AnonymousClass000.A0X(") ", A0l2);
        }
        long j2 = this.A02;
        if (j2 != -1) {
            StringBuilder A0l3 = AnonymousClass000.A0l(A0X);
            A0l3.append("dly(");
            A0l3.append(j2);
            A0X = AnonymousClass000.A0X(") ", A0l3);
        }
        TimeInterpolator timeInterpolator = this.A03;
        if (timeInterpolator != null) {
            StringBuilder A0l4 = AnonymousClass000.A0l(A0X);
            AnonymousClass000.A17(timeInterpolator, "interp(", ") ", A0l4);
            A0X = A0l4.toString();
        }
        ArrayList arrayList = this.A0G;
        if (arrayList.size() <= 0 && this.A0H.size() <= 0) {
            return A0X;
        }
        String A0X2 = AnonymousClass000.A0X("tgts(", AnonymousClass000.A0l(A0X));
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    A0X2 = AnonymousClass000.A0T(A0X2, ", ");
                }
                A0X2 = AnonymousClass000.A0R(arrayList.get(i), AnonymousClass000.A0l(A0X2));
            }
        }
        ArrayList arrayList2 = this.A0H;
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    A0X2 = AnonymousClass000.A0T(A0X2, ", ");
                }
                A0X2 = AnonymousClass000.A0R(arrayList2.get(i2), AnonymousClass000.A0l(A0X2));
            }
        }
        return AnonymousClass000.A0e(AnonymousClass000.A0l(A0X2));
    }

    public void A0I() {
        A0J();
        AnonymousClass05C A032 = A03();
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (A032.containsKey(animator)) {
                A0J();
                if (animator != null) {
                    animator.addListener(new C17450vb(A032, 1, this));
                    long j = this.A01;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.A02;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.A03;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C17440va(this, 1));
                    animator.start();
                }
            }
        }
        this.A0B.clear();
        A0H();
    }

    public void A0N(ViewGroup viewGroup) {
        AnonymousClass05C A032 = A03();
        int size = A032.size();
        if (viewGroup != null && size != 0) {
            C08780f3 r4 = new C08780f3(viewGroup);
            AnonymousClass05C r3 = new AnonymousClass05C((C06290Wz) A032);
            A032.clear();
            while (true) {
                size--;
                if (size >= 0) {
                    int i = size << 1;
                    AnonymousClass0MQ r1 = (AnonymousClass0MQ) r3.A02[i + 1];
                    if (r1.A00 != null && r4.equals(r1.A03)) {
                        ((Animator) r3.A02[i]).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e9, code lost:
        if (r3 == null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0115, code lost:
        if (r5.isEmpty() != false) goto L_0x0117;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0045 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(android.view.ViewGroup r27, X.AnonymousClass0M8 r28, X.AnonymousClass0M8 r29, java.util.ArrayList r30, java.util.ArrayList r31) {
        /*
            r26 = this;
            X.05C r24 = A03()
            android.util.SparseIntArray r23 = new android.util.SparseIntArray
            r23.<init>()
            r25 = r30
            int r22 = r25.size()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
        L_0x0015:
            r9 = r26
            r0 = r22
            if (r11 >= r0) goto L_0x01f2
            r0 = r25
            java.lang.Object r3 = r0.get(r11)
            X.0U7 r3 = (X.AnonymousClass0U7) r3
            r0 = r31
            java.lang.Object r4 = r0.get(r11)
            X.0U7 r4 = (X.AnonymousClass0U7) r4
            if (r3 == 0) goto L_0x0036
            java.util.ArrayList r0 = r3.A01
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0036
            r3 = 0
        L_0x0036:
            if (r4 == 0) goto L_0x0041
            java.util.ArrayList r0 = r4.A01
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0041
            r4 = 0
        L_0x0041:
            if (r3 != 0) goto L_0x0048
            if (r4 != 0) goto L_0x0050
        L_0x0045:
            int r11 = r11 + 1
            goto L_0x0015
        L_0x0048:
            if (r4 == 0) goto L_0x0050
            boolean r0 = r9.A0X(r3, r4)
            if (r0 == 0) goto L_0x0045
        L_0x0050:
            r0 = r27
            android.animation.Animator r10 = r9.A05(r0, r3, r4)
            if (r10 == 0) goto L_0x0045
            if (r4 == 0) goto L_0x00c0
            android.view.View r8 = r4.A00
            java.lang.String[] r14 = r9.A0Y()
            if (r14 == 0) goto L_0x00c2
            int r13 = r14.length
            if (r13 <= 0) goto L_0x00c2
            X.0U7 r7 = new X.0U7
            r7.<init>(r8)
            r0 = r29
            X.05C r0 = r0.A02
            java.lang.Object r12 = r0.get(r8)
            X.0U7 r12 = (X.AnonymousClass0U7) r12
            if (r12 == 0) goto L_0x008d
            r6 = 0
        L_0x0077:
            java.util.Map r0 = r7.A02
            r16 = r0
            r15 = r14[r6]
            java.util.Map r0 = r12.A02
            java.lang.Object r5 = r0.get(r15)
            r0 = r16
            r0.put(r15, r5)
            int r6 = r6 + 1
            if (r6 >= r13) goto L_0x008d
            goto L_0x0077
        L_0x008d:
            int r6 = r24.size()
            r5 = 0
        L_0x0092:
            if (r5 >= r6) goto L_0x00c3
            r0 = r24
            java.lang.Object[] r12 = r0.A02
            int r0 = r5 << 1
            r12 = r12[r0]
            r0 = r24
            java.lang.Object r12 = r0.get(r12)
            X.0MQ r12 = (X.AnonymousClass0MQ) r12
            X.0U7 r13 = r12.A02
            if (r13 == 0) goto L_0x00bd
            android.view.View r0 = r12.A00
            if (r0 != r8) goto L_0x00bd
            java.lang.String r12 = r12.A04
            java.lang.String r0 = r9.A0A
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r13.equals(r7)
            if (r0 == 0) goto L_0x00bd
            goto L_0x0045
        L_0x00bd:
            int r5 = r5 + 1
            goto L_0x0092
        L_0x00c0:
            android.view.View r8 = r3.A00
        L_0x00c2:
            r7 = 0
        L_0x00c3:
            X.0Il r12 = r9.A06
            if (r12 == 0) goto L_0x00e1
            X.0AG r12 = (X.AnonymousClass0AG) r12
            r20 = 0
            if (r3 != 0) goto L_0x0103
            if (r4 != 0) goto L_0x0103
            r3 = 0
        L_0x00d1:
            java.util.ArrayList r0 = r9.A0B
            int r6 = r0.size()
            int r5 = (int) r3
            r0 = r23
            r0.put(r6, r5)
            long r1 = java.lang.Math.min(r3, r1)
        L_0x00e1:
            java.lang.String r5 = r9.A0A
            X.0f3 r4 = new X.0f3
            r0 = r27
            r4.<init>(r0)
            X.0MQ r3 = new X.0MQ
            r12 = r3
            r13 = r8
            r14 = r9
            r15 = r7
            r16 = r4
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            r0 = r24
            r0.put(r10, r3)
            java.util.ArrayList r0 = r9.A0B
            r0.add(r10)
            goto L_0x0045
        L_0x0103:
            X.0My r5 = r9.A05
            if (r5 == 0) goto L_0x0117
            X.0vw r5 = (X.C17660vw) r5
            int r0 = r5.A02
            java.lang.Object r5 = r5.A01
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            if (r0 == 0) goto L_0x0118
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0118
        L_0x0117:
            r5 = 0
        L_0x0118:
            r16 = 1
            if (r4 == 0) goto L_0x0130
            if (r3 == 0) goto L_0x01ee
            java.util.Map r6 = r3.A02
            java.lang.String r0 = "android:visibilityPropagation:visibility"
            java.lang.Object r0 = r6.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01ee
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x01ee
        L_0x0130:
            r13 = -1
        L_0x0131:
            r6 = 0
            if (r3 == 0) goto L_0x01e8
            java.util.Map r4 = r3.A02
            java.lang.String r0 = "android:visibilityPropagation:center"
            java.lang.Object r0 = r4.get(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x01e8
            r15 = r0[r6]
        L_0x0142:
            java.util.Map r3 = r3.A02
            java.lang.String r0 = "android:visibilityPropagation:center"
            java.lang.Object r0 = r3.get(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x01eb
            r14 = r0[r16]
        L_0x0150:
            r0 = 2
            int[] r4 = new int[r0]
            r3 = r27
            r3.getLocationOnScreen(r4)
            r19 = r4[r6]
            float r3 = r27.getTranslationX()
            int r3 = java.lang.Math.round(r3)
            int r19 = r19 + r3
            r18 = r4[r16]
            float r3 = r27.getTranslationY()
            int r3 = java.lang.Math.round(r3)
            int r18 = r18 + r3
            int r3 = r27.getWidth()
            int r17 = r19 + r3
            int r3 = r27.getHeight()
            int r16 = r18 + r3
            if (r5 == 0) goto L_0x01e1
            int r4 = r5.centerX()
            int r3 = r5.centerY()
        L_0x0186:
            int r6 = r12.A01
            r5 = 0
            r0 = 3
            if (r6 == r0) goto L_0x01d8
            r0 = 5
            if (r6 == r0) goto L_0x01cf
            r0 = 48
            if (r6 == r0) goto L_0x01c6
            r0 = 80
            if (r6 != r0) goto L_0x019f
            int r14 = r14 - r18
            int r0 = X.AnonymousClass001.A0A(r4, r15)
            int r5 = r14 + r0
        L_0x019f:
            float r14 = (float) r5
            r0 = 3
            if (r6 == r0) goto L_0x01c1
            r0 = 5
            if (r6 == r0) goto L_0x01c1
            int r0 = r27.getHeight()
        L_0x01aa:
            float r0 = (float) r0
            float r14 = r14 / r0
            long r5 = r9.A01
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b4
            r5 = 300(0x12c, double:1.48E-321)
        L_0x01b4:
            long r3 = (long) r13
            long r5 = r5 * r3
            float r3 = (float) r5
            float r0 = r12.A00
            float r3 = r3 / r0
            int r0 = X.AnonymousClass001.A07(r3, r14)
            long r3 = (long) r0
            goto L_0x00d1
        L_0x01c1:
            int r0 = r27.getWidth()
            goto L_0x01aa
        L_0x01c6:
            int r16 = r16 - r14
            int r0 = X.AnonymousClass001.A0A(r4, r15)
            int r5 = r16 + r0
            goto L_0x019f
        L_0x01cf:
            int r15 = r15 - r19
            int r0 = X.AnonymousClass001.A0A(r3, r14)
            int r5 = r15 + r0
            goto L_0x019f
        L_0x01d8:
            int r17 = r17 - r15
            int r0 = X.AnonymousClass001.A0A(r3, r14)
            int r5 = r17 + r0
            goto L_0x019f
        L_0x01e1:
            int r4 = r19 + r17
            int r4 = r4 / r0
            int r3 = r18 + r16
            int r3 = r3 / r0
            goto L_0x0186
        L_0x01e8:
            r15 = -1
            if (r3 != 0) goto L_0x0142
        L_0x01eb:
            r14 = -1
            goto L_0x0150
        L_0x01ee:
            r3 = r4
            r13 = 1
            goto L_0x0131
        L_0x01f2:
            int r0 = r23.size()
            if (r0 == 0) goto L_0x0220
            r8 = 0
        L_0x01f9:
            int r0 = r23.size()
            if (r8 >= r0) goto L_0x0220
            r0 = r23
            int r3 = r0.keyAt(r8)
            java.util.ArrayList r0 = r9.A0B
            java.lang.Object r7 = r0.get(r3)
            android.animation.Animator r7 = (android.animation.Animator) r7
            r0 = r23
            int r0 = r0.valueAt(r8)
            long r5 = (long) r0
            long r5 = r5 - r1
            long r3 = r7.getStartDelay()
            long r5 = r5 + r3
            r7.setStartDelay(r5)
            int r8 = r8 + 1
            goto L_0x01f9
        L_0x0220:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10560i8.A0O(android.view.ViewGroup, X.0M8, X.0M8, java.util.ArrayList, java.util.ArrayList):void");
    }

    public boolean A0W(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A0G;
        if ((arrayList.size() != 0 || this.A0H.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !this.A0H.contains(view)) {
            return false;
        }
        return true;
    }

    public C10560i8 A07(long j) {
        this.A01 = j;
        return this;
    }

    public C10560i8 A08(TimeInterpolator timeInterpolator) {
        this.A03 = timeInterpolator;
        return this;
    }

    public void A0R(C04140My r1) {
        this.A05 = r1;
    }

    public void A0S(C03000Il r1) {
        this.A06 = r1;
    }

    public Animator A05(ViewGroup viewGroup, AnonymousClass0U7 r3, AnonymousClass0U7 r4) {
        return null;
    }
}
