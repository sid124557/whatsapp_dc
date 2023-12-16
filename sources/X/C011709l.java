package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.09l  reason: invalid class name and case insensitive filesystem */
public class C011709l extends AnonymousClass09N {
    public static TimeInterpolator A0B;
    public ArrayList A00 = AnonymousClass001.A0s();
    public ArrayList A01 = AnonymousClass001.A0s();
    public ArrayList A02 = AnonymousClass001.A0s();
    public ArrayList A03 = AnonymousClass001.A0s();
    public ArrayList A04 = AnonymousClass001.A0s();
    public ArrayList A05 = AnonymousClass001.A0s();
    public ArrayList A06 = AnonymousClass001.A0s();
    public ArrayList A07 = AnonymousClass001.A0s();
    public ArrayList A08 = AnonymousClass001.A0s();
    public ArrayList A09 = AnonymousClass001.A0s();
    public ArrayList A0A = AnonymousClass001.A0s();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r1 != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.C05570Ua r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r3 = r9
            android.view.View r2 = r9.A0H
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r4 = r10 + r0
            float r0 = r2.getTranslationY()
            int r0 = (int) r0
            int r5 = r11 + r0
            r8.A0G(r9)
            r6 = r12
            int r0 = r12 - r4
            r7 = r13
            int r1 = r13 - r5
            if (r0 != 0) goto L_0x0023
            if (r1 != 0) goto L_0x002a
            r8.A02(r9)
            r0 = 0
            return r0
        L_0x0023:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x002f:
            java.util.ArrayList r0 = r8.A08
            X.0MM r2 = new X.0MM
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C011709l.A0E(X.0Ua, int, int, int, int):boolean");
    }

    public boolean A0F(C05570Ua r14, C05570Ua r15, int i, int i2, int i3, int i4) {
        C05570Ua r7 = r14;
        C05570Ua r8 = r15;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (r14 == r15) {
            return A0E(r14, i5, i6, i7, i8);
        }
        View view = r14.A0H;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        A0G(r14);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A0G(r15);
        View view2 = r15.A0H;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i4 - i2)) - translationY))));
        view2.setAlpha(0.0f);
        this.A07.add(new AnonymousClass0Nn(r7, r8, i5, i6, i7, i8));
        return true;
    }

    public void A07() {
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C05570Ua r1 = ((AnonymousClass0MM) arrayList.get(size)).A04;
            View view = r1.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A02(r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A09;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A02(AnonymousClass001.A0Z(arrayList2, size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A06;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C05570Ua A0Z = AnonymousClass001.A0Z(arrayList3, size3);
            A0Z.A0H.setAlpha(1.0f);
            A02(A0Z);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A07;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            AnonymousClass0Nn r12 = (AnonymousClass0Nn) arrayList4.get(size4);
            C05570Ua r0 = r12.A05;
            if (r0 != null) {
                A0I(r12, r0);
            }
            C05570Ua r02 = r12.A04;
            if (r02 != null) {
                A0I(r12, r02);
            }
        }
        arrayList4.clear();
        if (A0A()) {
            ArrayList arrayList5 = this.A05;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                AbstractList abstractList = (AbstractList) arrayList5.get(size5);
                int size6 = abstractList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C05570Ua r13 = ((AnonymousClass0MM) abstractList.get(size6)).A04;
                        View view2 = r13.A0H;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        A02(r13);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A01;
            int size7 = arrayList6.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                AbstractList abstractList2 = (AbstractList) arrayList6.get(size7);
                int size8 = abstractList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C05570Ua A0Z2 = AnonymousClass001.A0Z(abstractList2, size8);
                        A0Z2.A0H.setAlpha(1.0f);
                        A02(A0Z2);
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A03;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            AnonymousClass0Nn r14 = (AnonymousClass0Nn) abstractList3.get(size10);
                            C05570Ua r03 = r14.A05;
                            if (r03 != null) {
                                A0I(r14, r03);
                            }
                            C05570Ua r04 = r14.A04;
                            if (r04 != null) {
                                A0I(r14, r04);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A00(this.A0A);
                    A00(this.A04);
                    A00(this.A00);
                    A00(this.A02);
                    A01();
                    return;
                }
            }
        }
    }

    public void A08() {
        long j;
        long j2;
        ArrayList arrayList = this.A09;
        boolean z = !arrayList.isEmpty();
        ArrayList arrayList2 = this.A08;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.A07;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.A06;
        boolean z4 = !arrayList4.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C05570Ua r7 = (C05570Ua) it.next();
                View view = r7.A0H;
                ViewPropertyAnimator animate = view.animate();
                this.A0A.add(r7);
                animate.setDuration(A06()).alpha(0.0f).setListener(new C17470vd(view, animate, this, r7, 0)).start();
            }
            arrayList.clear();
            if (z2) {
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.addAll(arrayList2);
                this.A05.add(A0s);
                arrayList2.clear();
                C11910kf r3 = new C11910kf(this, A0s);
                if (z) {
                    AnonymousClass0YY.A08(((AnonymousClass0MM) A0s.get(0)).A04.A0H, r3, A06());
                } else {
                    r3.run();
                }
            }
            if (z3) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                A0s2.addAll(arrayList3);
                this.A03.add(A0s2);
                arrayList3.clear();
                C11920kg r32 = new C11920kg(this, A0s2);
                if (z) {
                    AnonymousClass0YY.A08(((AnonymousClass0Nn) A0s2.get(0)).A05.A0H, r32, A06());
                } else {
                    r32.run();
                }
            }
            if (z4) {
                ArrayList A0s3 = AnonymousClass001.A0s();
                A0s3.addAll(arrayList4);
                this.A01.add(A0s3);
                arrayList4.clear();
                C11930kh r6 = new C11930kh(this, A0s3);
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = A06();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = A05();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = A04();
                    }
                    AnonymousClass0YY.A08(AnonymousClass001.A0Z(A0s3, 0).A0H, r6, j + Math.max(j2, j3));
                    return;
                }
                r6.run();
            }
        }
    }

    public void A09(C05570Ua r9) {
        View view = r9.A0H;
        view.animate().cancel();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((AnonymousClass0MM) arrayList.get(size)).A04 == r9) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A02(r9);
                arrayList.remove(size);
            }
        }
        A0H(r9, this.A07);
        if (this.A09.remove(r9)) {
            view.setAlpha(1.0f);
            A02(r9);
        }
        if (this.A06.remove(r9)) {
            view.setAlpha(1.0f);
            A02(r9);
        }
        ArrayList arrayList2 = this.A03;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A0H(r9, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A05;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractList abstractList = (AbstractList) arrayList4.get(size3);
            int size4 = abstractList.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((AnonymousClass0MM) abstractList.get(size4)).A04 == r9) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A02(r9);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A01;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
            if (abstractCollection.remove(r9)) {
                view.setAlpha(1.0f);
                A02(r9);
                if (abstractCollection.isEmpty()) {
                    arrayList5.remove(size5);
                }
            }
        }
        this.A0A.remove(r9);
        this.A00.remove(r9);
        this.A02.remove(r9);
        this.A04.remove(r9);
        if (!A0A()) {
            A01();
        }
    }

    public boolean A0A() {
        if (!this.A06.isEmpty() || !this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A04.isEmpty() || !this.A0A.isEmpty() || !this.A00.isEmpty() || !this.A02.isEmpty() || !this.A05.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void A0G(C05570Ua r3) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0B);
        A09(r3);
    }

    public final boolean A0I(AnonymousClass0Nn r5, C05570Ua r6) {
        if (r5.A04 == r6) {
            r5.A04 = null;
        } else if (r5.A05 != r6) {
            return false;
        } else {
            r5.A05 = null;
        }
        View view = r6.A0H;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        A02(r6);
        return true;
    }

    public static void A00(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C05570Ua) list.get(size)).A0H.animate().cancel();
            } else {
                return;
            }
        }
    }

    public boolean A0B(C05570Ua r3, List list) {
        if (!list.isEmpty() || super.A0B(r3, list)) {
            return true;
        }
        return false;
    }

    public boolean A0C(C05570Ua r3) {
        A0G(r3);
        r3.A0H.setAlpha(0.0f);
        this.A06.add(r3);
        return true;
    }

    public boolean A0D(C05570Ua r2) {
        A0G(r2);
        this.A09.add(r2);
        return true;
    }

    public final void A0H(C05570Ua r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass0Nn r1 = (AnonymousClass0Nn) list.get(size);
                if (A0I(r1, r4) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }
}
