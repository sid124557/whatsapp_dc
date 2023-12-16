package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

/* renamed from: X.09I  reason: invalid class name */
public abstract class AnonymousClass09I extends AnonymousClass0R6 implements C15270r4 {
    public AnonymousClass0No A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final C10550i7 A03 = new C10550i7();
    public final C10550i7 A04 = new C10550i7();
    public final C10550i7 A05 = new C10550i7();
    public final C08270df A06;
    public final AnonymousClass0O9 A07;

    public abstract C08310eF A0K(int i);

    public final Long A0L(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            C10550i7 r1 = this.A04;
            if (i2 >= r1.A01()) {
                return l;
            }
            if (AnonymousClass001.A0K(r1.A04(i2)) == i) {
                if (l == null) {
                    l = Long.valueOf(r1.A02(i2));
                } else {
                    throw AnonymousClass001.A0e("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i2++;
        }
    }

    public void A0C(RecyclerView recyclerView) {
        if (this.A00 == null) {
            AnonymousClass0No r3 = new AnonymousClass0No(this);
            this.A00 = r3;
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                ViewPager2 viewPager2 = (ViewPager2) parent;
                r3.A04 = viewPager2;
                C17690vz r1 = new C17690vz(r3, 0);
                r3.A03 = r1;
                viewPager2.A09.A00.add(r1);
                AnonymousClass09L r12 = new AnonymousClass09L(r3);
                r3.A02 = r12;
                AnonymousClass09I r0 = r3.A05;
                r0.BiZ(r12);
                FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(r3);
                r3.A01 = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
                r0.A07.A00(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3);
                return;
            }
            throw AnonymousClass000.A0H(parent, "Expected ViewPager2 instance. Got: ", AnonymousClass001.A0o());
        }
        throw new IllegalArgumentException();
    }

    public void A0D(RecyclerView recyclerView) {
        AnonymousClass0No r3 = this.A00;
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            ((ViewPager2) parent).A09.A00.remove(r3.A03);
            AnonymousClass09I r2 = r3.A05;
            r2.A01.unregisterObserver(r3.A02);
            r2.A07.A01(r3.A01);
            r3.A04 = null;
            this.A00 = null;
            return;
        }
        throw AnonymousClass000.A0H(parent, "Expected ViewPager2 instance. Got: ", AnonymousClass001.A0o());
    }

    public final void A0E(boolean z) {
        throw AnonymousClass002.A0G("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public /* bridge */ /* synthetic */ void A0H(C05570Ua r1) {
        A0O((C011309h) r1);
        A0M();
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r4) {
        Long A0L = A0L(r4.A0H.getId());
        if (A0L != null) {
            long longValue = A0L.longValue();
            A0N(longValue);
            this.A04.A08(longValue);
        }
    }

    public void A0M() {
        C10550i7 r5;
        C08310eF r0;
        View view;
        if (this.A01 && !this.A06.A0t()) {
            C13570nO r4 = new C13570nO(0);
            int i = 0;
            while (true) {
                r5 = this.A03;
                if (i >= r5.A01()) {
                    break;
                }
                long A022 = r5.A02(i);
                if (!A0P(A022)) {
                    r4.add(Long.valueOf(A022));
                    this.A04.A08(A022);
                }
                i++;
            }
            if (!this.A02) {
                this.A01 = false;
                for (int i2 = 0; i2 < r5.A01(); i2++) {
                    long A023 = r5.A02(i2);
                    if (!this.A04.A0B(A023) && ((r0 = (C08310eF) C10550i7.A00(r5, A023)) == null || (view = r0.A0B) == null || view.getParent() == null)) {
                        r4.add(Long.valueOf(A023));
                    }
                }
            }
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                A0N(((Number) it.next()).longValue());
            }
        }
    }

    public final void A0N(long j) {
        ViewParent parent;
        C10550i7 r4 = this.A03;
        C08310eF r3 = (C08310eF) C10550i7.A00(r4, j);
        if (r3 != null) {
            View view = r3.A0B;
            if (!(view == null || (parent = view.getParent()) == null)) {
                ((ViewGroup) parent).removeAllViews();
            }
            if (!A0P(j)) {
                this.A05.A08(j);
            }
            if (r3.A16()) {
                C08270df r2 = this.A06;
                if (r2.A0t()) {
                    this.A01 = true;
                    return;
                }
                if (A0P(j)) {
                    this.A05.A0A(j, r2.A0A(r3));
                }
                C08240dc r0 = new C08240dc(r2);
                r0.A07(r3);
                r0.A03();
            }
            r4.A08(j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(X.C011309h r8) {
        /*
            r7 = this;
            X.0i7 r2 = r7.A03
            long r0 = r8.A08
            java.lang.Object r4 = X.C10550i7.A00(r2, r0)
            X.0eF r4 = (X.C08310eF) r4
            java.lang.String r2 = "Design assumption violated."
            if (r4 == 0) goto L_0x009c
            android.view.View r5 = r8.A0H
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            android.view.View r1 = r4.A0B
            boolean r0 = r4.A16()
            if (r0 != 0) goto L_0x0021
            if (r1 == 0) goto L_0x0048
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r2)
            throw r0
        L_0x0021:
            if (r1 != 0) goto L_0x0038
            X.0df r0 = r7.A06
            X.07v r3 = new X.07v
            r3.<init>(r5, r4, r7)
            r2 = 0
            X.0R3 r0 = r0.A0X
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A01
            X.0L9 r0 = new X.0L9
            r0.<init>(r3, r2)
            r1.add(r0)
            return
        L_0x0038:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x0048
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == r5) goto L_0x008c
        L_0x0044:
            A00(r1, r5)
            return
        L_0x0048:
            boolean r0 = r4.A16()
            if (r0 != 0) goto L_0x0044
            X.0df r6 = r7.A06
            boolean r0 = r6.A0t()
            if (r0 != 0) goto L_0x008d
            X.07v r2 = new X.07v
            r2.<init>(r5, r4, r7)
            r5 = 0
            X.0R3 r0 = r6.A0X
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A01
            X.0L9 r0 = new X.0L9
            r0.<init>(r2, r5)
            r1.add(r0)
            X.0dc r3 = new X.0dc
            r3.<init>(r6)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "f"
            r2.append(r0)
            long r0 = r8.A08
            java.lang.String r0 = X.AnonymousClass001.A0k(r2, r0)
            r3.A0C(r4, r0)
            X.0GC r0 = X.AnonymousClass0GC.STARTED
            r3.A0B(r4, r0)
            r3.A03()
            X.0No r0 = r7.A00
            r0.A00(r5)
        L_0x008c:
            return
        L_0x008d:
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x008c
            X.0O9 r1 = r7.A07
            androidx.viewpager2.adapter.FragmentStateAdapter$2 r0 = new androidx.viewpager2.adapter.FragmentStateAdapter$2
            r0.<init>(r7, r8)
            r1.A00(r0)
            return
        L_0x009c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09I.A0O(X.09h):void");
    }

    public boolean A0P(long j) {
        if (j < 0 || j >= ((long) A0G())) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        C011309h r82 = (C011309h) r8;
        long j = r82.A08;
        FrameLayout frameLayout = (FrameLayout) r82.A0H;
        int id = frameLayout.getId();
        Long A0L = A0L(id);
        if (A0L != null) {
            long longValue = A0L.longValue();
            if (longValue != j) {
                A0N(longValue);
                this.A04.A08(longValue);
            }
        }
        this.A04.A0A(j, Integer.valueOf(id));
        long j2 = (long) i;
        C10550i7 r5 = this.A03;
        if (!r5.A0B(j2)) {
            C08310eF A0K = A0K(i);
            A0K.A0z((AnonymousClass0ZZ) C10550i7.A00(this.A05, j2));
            r5.A0A(j2, A0K);
        }
        if (C06360Xi.A04(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new C07120aM(frameLayout, this, r82));
            } else {
                throw AnonymousClass001.A0e("Design assumption violated.");
            }
        }
        A0M();
    }

    public AnonymousClass09I(C003203q r4) {
        C08270df A012 = AnonymousClass00M.A01(r4);
        AnonymousClass08A r1 = r4.A06;
        this.A06 = A012;
        this.A07 = r1;
        super.A0E(true);
    }

    public static void A00(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw AnonymousClass001.A0e("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(AnonymousClass0YH.A00());
        frameLayout.setSaveEnabled(false);
        return new C011309h(frameLayout);
    }

    public long A0B(int i) {
        return (long) i;
    }

    public /* bridge */ /* synthetic */ boolean A0F(C05570Ua r2) {
        return true;
    }
}
