package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: X.07x  reason: invalid class name and case insensitive filesystem */
public class C009907x extends AnonymousClass0WL {
    public Object A03(Object obj) {
        if (obj != null) {
            return ((C10560i8) obj).clone();
        }
        return null;
    }

    public Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        AnonymousClass0A7 r0 = new AnonymousClass0A7();
        r0.A0c((C10560i8) obj);
        return r0;
    }

    public Object A05(Object obj, Object obj2, Object obj3) {
        C10560i8 r2 = (C10560i8) obj;
        C10560i8 r4 = (C10560i8) obj3;
        if (r2 == null) {
            r2 = null;
        }
        if (r4 == null) {
            return r2;
        }
        AnonymousClass0A7 r0 = new AnonymousClass0A7();
        if (r2 != null) {
            r0.A0c(r2);
        }
        r0.A0c(r4);
        return r0;
    }

    public Object A06(Object obj, Object obj2, Object obj3) {
        AnonymousClass0A7 r0 = new AnonymousClass0A7();
        if (obj != null) {
            r0.A0c((C10560i8) obj);
        }
        r0.A0c((C10560i8) obj2);
        return r0;
    }

    public void A07(Rect rect, Object obj) {
        ((C10560i8) obj).A0R(new C17660vw(rect, this, 1));
    }

    public void A08(View view, Object obj) {
        ((C10560i8) obj).A09(view);
    }

    public void A09(View view, Object obj) {
        if (view != null) {
            Rect A0N = AnonymousClass001.A0N();
            AnonymousClass0WL.A01(view, A0N);
            ((C10560i8) obj).A0R(new C17660vw(A0N, this, 0));
        }
    }

    public void A0A(View view, Object obj, ArrayList arrayList) {
        ((C10560i8) obj).A0B(new C08770f2(view, this, arrayList));
    }

    public void A0B(View view, Object obj, ArrayList arrayList) {
        C10560i8 r6 = (C10560i8) obj;
        ArrayList arrayList2 = r6.A0H;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0WL.A02(AnonymousClass001.A0S(arrayList, i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        A0F(r6, arrayList);
    }

    public void A0C(ViewGroup viewGroup, Object obj) {
        AnonymousClass0XC.A02(viewGroup, (C10560i8) obj);
    }

    public void A0D(AnonymousClass0QU r2, C08310eF r3, Object obj, Runnable runnable) {
        C10560i8 r4 = (C10560i8) obj;
        r2.A03(new C07930d3(this, r4));
        r4.A0B(new C08760f1(this, runnable));
    }

    public void A0E(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((C10560i8) obj).A0B(new AnonymousClass0AC(this, obj2, obj4, arrayList, arrayList3));
    }

    public void A0F(Object obj, ArrayList arrayList) {
        Object obj2;
        C10560i8 r5 = (C10560i8) obj;
        if (r5 != null) {
            int i = 0;
            if (r5 instanceof AnonymousClass0A7) {
                AnonymousClass0A7 r52 = (AnonymousClass0A7) r5;
                int size = r52.A02.size();
                while (i < size) {
                    if (i >= 0) {
                        ArrayList arrayList2 = r52.A02;
                        if (i < arrayList2.size()) {
                            obj2 = arrayList2.get(i);
                            A0F(obj2, arrayList);
                            i++;
                        }
                    }
                    obj2 = null;
                    A0F(obj2, arrayList);
                    i++;
                }
                return;
            }
            ArrayList arrayList3 = r5.A0G;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                ArrayList arrayList4 = r5.A0H;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        r5.A09(AnonymousClass001.A0S(arrayList, i));
                        i++;
                    }
                }
            }
        }
    }

    public void A0G(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C10560i8 r2 = (C10560i8) obj;
        if (r2 != null) {
            ArrayList arrayList3 = r2.A0H;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            A0I(r2, arrayList, arrayList2);
        }
    }

    public void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Object obj2;
        C10560i8 r5 = (C10560i8) obj;
        int i = 0;
        if (r5 instanceof AnonymousClass0A7) {
            AnonymousClass0A7 r52 = (AnonymousClass0A7) r5;
            int size = r52.A02.size();
            while (i < size) {
                if (i >= 0) {
                    ArrayList arrayList3 = r52.A02;
                    if (i < arrayList3.size()) {
                        obj2 = arrayList3.get(i);
                        A0I(obj2, arrayList, arrayList2);
                        i++;
                    }
                }
                obj2 = null;
                A0I(obj2, arrayList, arrayList2);
                i++;
            }
            return;
        }
        ArrayList arrayList4 = r5.A0G;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            ArrayList arrayList5 = r5.A0H;
            if (arrayList5.size() == arrayList.size() && arrayList5.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        r5.A09(AnonymousClass001.A0S(arrayList2, i));
                        i++;
                    }
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        r5.A0A(AnonymousClass001.A0S(arrayList, size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public boolean A0H(Object obj) {
        return obj instanceof C10560i8;
    }
}
