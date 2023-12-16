package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.12s  reason: invalid class name and case insensitive filesystem */
public final class C198012s extends AnonymousClass09N {
    public static final TimeInterpolator A0B = new ValueAnimator().getInterpolator();
    public List A00 = AnonymousClass001.A0s();
    public List A01 = AnonymousClass001.A0s();
    public List A02 = AnonymousClass001.A0s();
    public List A03 = AnonymousClass001.A0s();
    public List A04 = AnonymousClass001.A0s();
    public List A05 = AnonymousClass001.A0s();
    public List A06 = AnonymousClass001.A0s();
    public List A07 = AnonymousClass001.A0s();
    public List A08 = AnonymousClass001.A0s();
    public List A09 = AnonymousClass001.A0s();
    public List A0A = AnonymousClass001.A0s();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r1 != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.C05570Ua r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r3 = r9
            android.view.View r2 = r9.A0H
            float r1 = (float) r10
            float r0 = r2.getTranslationX()
            float r1 = r1 + r0
            int r4 = (int) r1
            float r1 = (float) r11
            float r0 = r2.getTranslationY()
            float r1 = r1 + r0
            int r5 = (int) r1
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
            java.util.List r0 = r8.A08
            X.2Qx r2 = new X.2Qx
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198012s.A0E(X.0Ua, int, int, int, int):boolean");
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
        this.A07.add(new C46652bz(r7, r8, i5, i6, i7, i8));
        return true;
    }

    public void A07() {
        List list = this.A08;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C05570Ua r1 = ((C43132Qx) list.get(size)).A04;
            C18300x5.A17(r1.A0H, this, r1);
            list.remove(size);
        }
        List list2 = this.A09;
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A02((C05570Ua) list2.get(size2));
            list2.remove(size2);
        }
        List list3 = this.A06;
        int size3 = list3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C05570Ua r12 = (C05570Ua) list3.get(size3);
            C18310x6.A16(r12.A0H, this, r12);
            list3.remove(size3);
        }
        List list4 = this.A07;
        int size4 = list4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C46652bz r13 = (C46652bz) list4.get(size4);
            C05570Ua r0 = r13.A05;
            if (r0 != null) {
                A0I(r0, r13);
            }
            C05570Ua r02 = r13.A04;
            if (r02 != null) {
                A0I(r02, r13);
            }
        }
        list4.clear();
        if (A0A()) {
            List list5 = this.A05;
            int size5 = list5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                List list6 = (List) list5.get(size5);
                int size6 = list6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C05570Ua r14 = ((C43132Qx) list6.get(size6)).A04;
                        C18300x5.A17(r14.A0H, this, r14);
                        list6.remove(size6);
                        if (list6.isEmpty()) {
                            list5.remove(list6);
                        }
                    }
                }
            }
            List list7 = this.A01;
            int size7 = list7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                List list8 = (List) list7.get(size7);
                int size8 = list8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C05570Ua r15 = (C05570Ua) list8.get(size8);
                        C18310x6.A16(r15.A0H, this, r15);
                        list8.remove(size8);
                        if (list8.isEmpty()) {
                            list7.remove(list8);
                        }
                    }
                }
            }
            List list9 = this.A03;
            int size9 = list9.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    List list10 = (List) list9.get(size9);
                    int size10 = list10.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C46652bz r16 = (C46652bz) list10.get(size10);
                            C05570Ua r03 = r16.A05;
                            if (r03 != null) {
                                A0I(r03, r16);
                            }
                            C05570Ua r04 = r16.A04;
                            if (r04 != null) {
                                A0I(r04, r16);
                            }
                            if (list10.isEmpty()) {
                                list9.remove(list10);
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
        List<C05570Ua> list = this.A09;
        boolean z = !list.isEmpty();
        List list2 = this.A08;
        boolean z2 = !list2.isEmpty();
        List list3 = this.A07;
        boolean z3 = !list3.isEmpty();
        List list4 = this.A06;
        boolean z4 = !list4.isEmpty();
        if (z || z2 || z4 || z3) {
            for (C05570Ua r3 : list) {
                C04830Qv A052 = C06560Yg.A05(r3.A0H);
                this.A0A.add(r3);
                A052.A08(A06());
                A052.A04(0.0f);
                A052.A05(0.0f);
                A052.A0A(new AnonymousClass4HA(A052, r3, this, 0));
                A052.A02();
            }
            list.clear();
            if (z2) {
                ArrayList A0o = C18320x8.A0o(list2);
                this.A05.add(A0o);
                list2.clear();
                C70203a7 r32 = new C70203a7(this, 29, A0o);
                if (z) {
                    AnonymousClass0YY.A08(((C43132Qx) A0o.get(0)).A04.A0H, r32, A06());
                } else {
                    r32.run();
                }
            }
            if (z3) {
                ArrayList A0o2 = C18320x8.A0o(list3);
                this.A03.add(A0o2);
                list3.clear();
                C70203a7 r33 = new C70203a7(this, 30, A0o2);
                if (z) {
                    AnonymousClass0YY.A08(((C46652bz) A0o2.get(0)).A05.A0H, r33, A06());
                } else {
                    r33.run();
                }
            }
            if (z4) {
                ArrayList A0o3 = C18320x8.A0o(list4);
                this.A01.add(A0o3);
                list4.clear();
                C70203a7 r6 = new C70203a7(this, 31, A0o3);
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
                    AnonymousClass0YY.A08(((C05570Ua) A0o3.get(0)).A0H, r6, j + Math.max(j2, j3));
                    return;
                }
                r6.run();
            }
        }
    }

    public void A09(C05570Ua r7) {
        View view = r7.A0H;
        C06560Yg.A05(view).A01();
        List list = this.A08;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C43132Qx) list.get(size)).A04 == r7) {
                C18300x5.A17(view, this, r7);
                list.remove(size);
            }
        }
        A0H(r7, this.A07);
        if (this.A09.remove(r7)) {
            C18310x6.A16(view, this, r7);
        }
        if (this.A06.remove(r7)) {
            C18310x6.A16(view, this, r7);
        }
        List list2 = this.A03;
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            List list3 = (List) list2.get(size2);
            A0H(r7, list3);
            if (list3.isEmpty()) {
                list2.remove(size2);
            }
        }
        List list4 = this.A05;
        int size3 = list4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            List list5 = (List) list4.get(size3);
            int size4 = list5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C43132Qx) list5.get(size4)).A04 == r7) {
                    C18300x5.A17(view, this, r7);
                    list5.remove(size4);
                    if (list5.isEmpty()) {
                        list4.remove(size3);
                    }
                }
            }
        }
        List list6 = this.A01;
        int size5 = list6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                List list7 = (List) list6.get(size5);
                if (list7.remove(r7)) {
                    C18310x6.A16(view, this, r7);
                    if (list7.isEmpty()) {
                        list6.remove(size5);
                    }
                }
            } else {
                this.A0A.remove(r7);
                this.A00.remove(r7);
                this.A02.remove(r7);
                C18310x6.A1B(this, r7, this.A04);
                return;
            }
        }
    }

    public boolean A0A() {
        if (!this.A06.isEmpty() || !this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A04.isEmpty() || !this.A0A.isEmpty() || !this.A00.isEmpty() || !this.A02.isEmpty() || !this.A05.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void A0G(C05570Ua r3) {
        r3.A0H.animate().setInterpolator(A0B);
        A09(r3);
    }

    public final boolean A0I(C05570Ua r5, C46652bz r6) {
        if (r6.A04 == r5) {
            r6.A04 = null;
        } else if (r6.A05 != r5) {
            return false;
        } else {
            r6.A05 = null;
        }
        AnonymousClass0x2.A0w(r5.A0H);
        A02(r5);
        return true;
    }

    public C198012s() {
        this.A00 = 240;
        this.A01 = 240;
        this.A02 = 240;
        this.A03 = 240;
        this.A00 = false;
    }

    public static final void A00(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C06560Yg.A05(((C05570Ua) list.get(size)).A0H).A01();
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
        View view = r3.A0H;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
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
                C46652bz r1 = (C46652bz) list.get(size);
                if (A0I(r4, r1) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }
}
