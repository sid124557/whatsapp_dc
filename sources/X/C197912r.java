package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.12r  reason: invalid class name and case insensitive filesystem */
public class C197912r extends AnonymousClass09N {
    public static AccelerateDecelerateInterpolator A0E;
    public AnonymousClass2FA A00;
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
    public ArrayList A0B = AnonymousClass001.A0s();
    public boolean A0C = false;
    public boolean A0D = false;

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
            r8.A0I(r9)
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
            java.util.ArrayList r0 = r8.A09
            X.2Qt r2 = new X.2Qt
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197912r.A0E(X.0Ua, int, int, int, int):boolean");
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
        A0I(r14);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A0I(r15);
        View view2 = r15.A0H;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i4 - i2)) - translationY))));
        view2.setAlpha(0.0f);
        this.A08.add(new C46612bv(r7, r8, i5, i6, i7, i8));
        return true;
    }

    public void A07() {
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C05570Ua r1 = ((C43092Qt) arrayList.get(size)).A04;
            C18300x5.A17(r1.A0H, this, r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A0A;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A02((C05570Ua) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A07;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            A0H((C05570Ua) arrayList3.get(size3));
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A08;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C46612bv r12 = (C46612bv) arrayList4.get(size4);
            C05570Ua r0 = r12.A05;
            if (r0 != null) {
                A0K(r0, r12);
            }
            C05570Ua r02 = r12.A04;
            if (r02 != null) {
                A0K(r02, r12);
            }
        }
        arrayList4.clear();
        if (A0A()) {
            ArrayList arrayList5 = this.A06;
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
                        C05570Ua r13 = ((C43092Qt) abstractList.get(size6)).A04;
                        C18300x5.A17(r13.A0H, this, r13);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A02;
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
                        A0H((C05570Ua) abstractList2.get(size8));
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A04;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C46612bv r14 = (C46612bv) abstractList3.get(size10);
                            C05570Ua r03 = r14.A05;
                            if (r03 != null) {
                                A0K(r03, r14);
                            }
                            C05570Ua r04 = r14.A04;
                            if (r04 != null) {
                                A0K(r04, r14);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A00(this.A0B);
                    A00(this.A05);
                    A00(this.A01);
                    A00(this.A03);
                    A01();
                    return;
                }
            }
        }
    }

    public void A08() {
        long j;
        long j2;
        ArrayList arrayList = this.A0A;
        boolean A1S = AnonymousClass0x7.A1S(arrayList);
        ArrayList arrayList2 = this.A09;
        boolean A1S2 = AnonymousClass0x7.A1S(arrayList2);
        ArrayList arrayList3 = this.A08;
        boolean A1S3 = AnonymousClass0x7.A1S(arrayList3);
        ArrayList arrayList4 = this.A07;
        boolean A1S4 = AnonymousClass0x7.A1S(arrayList4);
        if (A1S || A1S2 || A1S4 || A1S3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C05570Ua r7 = (C05570Ua) it.next();
                if (this.A0D) {
                    A02(r7);
                    A0G();
                } else {
                    View view = r7.A0H;
                    ViewPropertyAnimator animate = view.animate();
                    this.A0B.add(r7);
                    animate.setDuration(300).scaleX(0.0f).scaleY(0.0f).setListener(new C85594Gw(view, animate, r7, this, 0)).start();
                }
            }
            arrayList.clear();
            if (A1S2) {
                ArrayList A0o = C18320x8.A0o(arrayList2);
                this.A06.add(A0o);
                arrayList2.clear();
                C70183a5 r6 = new C70183a5(this, 7, A0o);
                if (A1S) {
                    AnonymousClass0YY.A08(((C43092Qt) A0o.get(0)).A04.A0H, r6, 300);
                } else {
                    r6.run();
                }
            }
            if (A1S3) {
                ArrayList A0o2 = C18320x8.A0o(arrayList3);
                this.A04.add(A0o2);
                arrayList3.clear();
                C70183a5 r3 = new C70183a5(this, 8, A0o2);
                if (A1S) {
                    AnonymousClass0YY.A08(((C46612bv) A0o2.get(0)).A05.A0H, r3, 300);
                } else {
                    r3.run();
                }
            }
            if (A1S4) {
                ArrayList A0o3 = C18320x8.A0o(arrayList4);
                this.A02.add(A0o3);
                arrayList4.clear();
                C70183a5 r62 = new C70183a5(this, 9, A0o3);
                if (A1S || A1S2 || A1S3) {
                    long j3 = 0;
                    if (A1S) {
                        j = 300;
                    } else {
                        j = 0;
                    }
                    if (A1S2) {
                        j2 = 200;
                    } else {
                        j2 = 0;
                    }
                    if (A1S3) {
                        j3 = 200;
                    }
                    AnonymousClass0YY.A08(((C05570Ua) A0o3.get(0)).A0H, r62, j + Math.max(j2, j3));
                    return;
                }
                r62.run();
            }
        }
    }

    public void A09(C05570Ua r7) {
        View view = r7.A0H;
        view.animate().cancel();
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C43092Qt) arrayList.get(size)).A04 == r7) {
                C18300x5.A17(view, this, r7);
                arrayList.remove(size);
            }
        }
        A0J(r7, this.A08);
        if (this.A0A.remove(r7)) {
            C18310x6.A16(view, this, r7);
        }
        if (this.A07.remove(r7)) {
            A0H(r7);
        }
        ArrayList arrayList2 = this.A04;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A0J(r7, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A06;
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
                } else if (((C43092Qt) abstractList.get(size4)).A04 == r7) {
                    C18300x5.A17(view, this, r7);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A02;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
                if (abstractCollection.remove(r7)) {
                    A0H(r7);
                    if (abstractCollection.isEmpty()) {
                        arrayList5.remove(size5);
                    }
                }
            } else {
                this.A0B.remove(r7);
                this.A01.remove(r7);
                this.A03.remove(r7);
                this.A05.remove(r7);
                A0G();
                return;
            }
        }
    }

    public boolean A0A() {
        if (!this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A0A.isEmpty() || !this.A05.isEmpty() || !this.A0B.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty() || !this.A06.isEmpty() || !this.A02.isEmpty() || !this.A04.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void A0H(C05570Ua r3) {
        if (r3 instanceof AnonymousClass4Z7) {
            ((AnonymousClass4Z7) r3).A09(0);
        }
        C18310x6.A16(r3.A0H, this, r3);
    }

    public final void A0I(C05570Ua r3) {
        if (A0E == null) {
            A0E = new AccelerateDecelerateInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0E);
        A09(r3);
    }

    public final boolean A0K(C05570Ua r5, C46612bv r6) {
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

    public long A03() {
        return 300;
    }

    public long A04() {
        return 200;
    }

    public long A05() {
        return 200;
    }

    public long A06() {
        return 300;
    }

    public boolean A0B(C05570Ua r3, List list) {
        if (!list.isEmpty() || super.A0B(r3, list)) {
            return true;
        }
        return false;
    }

    public boolean A0C(C05570Ua r3) {
        A0I(r3);
        if (!this.A0D) {
            View view = r3.A0H;
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        } else if (r3 instanceof AnonymousClass4Z7) {
            ((AnonymousClass4Z7) r3).A09(4);
        }
        this.A07.add(r3);
        return true;
    }

    public boolean A0D(C05570Ua r2) {
        A0I(r2);
        this.A0A.add(r2);
        return true;
    }

    public void A0G() {
        AnonymousClass2FA r0;
        if (!A0A()) {
            A01();
            if (this.A0C && (r0 = this.A00) != null) {
                CallGrid callGrid = r0.A00;
                if (callGrid.A0k.A03) {
                    Log.i("CallGrid/resizeGridView, callGridAdapter.notifyDataSetChanged()");
                    RecyclerView recyclerView = callGrid.A0g;
                    if (recyclerView.A09 > 0 || recyclerView.getScrollState() != 0) {
                        recyclerView.post(new C117695sL((Object) callGrid, 0));
                    } else {
                        callGrid.A07.A05();
                    }
                }
            }
            this.A0C = false;
        }
    }

    public final void A0J(C05570Ua r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C46612bv r1 = (C46612bv) list.get(size);
                if (A0K(r4, r1) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }
}
