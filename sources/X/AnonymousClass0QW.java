package X;

import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0QW  reason: invalid class name */
public class AnonymousClass0QW {
    public C02160Fc A00;
    public AnonymousClass0GJ A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final C08310eF A04;
    public final AnonymousClass0WE A05;
    public final HashSet A06 = AnonymousClass002.A0K();
    public final List A07 = AnonymousClass001.A0s();

    public AnonymousClass0QW(AnonymousClass0QU r3, AnonymousClass0WE r4, C02160Fc r5, AnonymousClass0GJ r6) {
        C08310eF r1 = r4.A02;
        this.A01 = r6;
        this.A00 = r5;
        this.A04 = r1;
        r3.A03(new C07920d2(this));
        this.A05 = r4;
    }

    public void A00() {
        if (!this.A03) {
            if (C08270df.A04()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("SpecialEffectsController: ");
                A0o.append(this);
                AnonymousClass000.A1I(A0o, " has called complete.");
            }
            this.A03 = true;
            for (Runnable run : this.A07) {
                run.run();
            }
        }
        this.A05.A04();
    }

    public void A01() {
        float f;
        C02160Fc r2 = this.A00;
        if (r2 == C02160Fc.ADDING) {
            AnonymousClass0WE r6 = this.A05;
            C08310eF r3 = r6.A02;
            View findFocus = r3.A0B.findFocus();
            if (findFocus != null) {
                r3.A0M().A06 = findFocus;
                if (C08270df.A05(2)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("requestFocus: Saved focused view ");
                    A0o.append(findFocus);
                    AnonymousClass000.A18(r3, " for Fragment ", "FragmentManager", A0o);
                }
            }
            View A0J = this.A04.A0J();
            if (A0J.getParent() == null) {
                r6.A02();
                A0J.setAlpha(0.0f);
            }
            if (A0J.getAlpha() == 0.0f && A0J.getVisibility() == 0) {
                A0J.setVisibility(4);
            }
            C04050Mp r0 = r3.A0D;
            if (r0 == null) {
                f = 1.0f;
            } else {
                f = r0.A00;
            }
            A0J.setAlpha(f);
        } else if (r2 == C02160Fc.REMOVING) {
            C08310eF r32 = this.A05.A02;
            View A0J2 = r32.A0J();
            if (C08270df.A05(2)) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Clearing focus ");
                A0o2.append(A0J2.findFocus());
                A0o2.append(" on view ");
                A0o2.append(A0J2);
                AnonymousClass000.A18(r32, " for Fragment ", "FragmentManager", A0o2);
            }
            A0J2.clearFocus();
        }
    }

    public final void A02() {
        if (!this.A02) {
            this.A02 = true;
            HashSet hashSet = this.A06;
            if (hashSet.isEmpty()) {
                A00();
                return;
            }
            Iterator it = AnonymousClass002.A0J(hashSet).iterator();
            while (it.hasNext()) {
                ((AnonymousClass0QU) it.next()).A01();
            }
        }
    }

    public final void A03(C02160Fc r7, AnonymousClass0GJ r8) {
        C02160Fc r0;
        int ordinal = r7.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (C08270df.A05(2)) {
                    StringBuilder A0l = AnonymousClass000.A0l("SpecialEffectsController: For fragment ");
                    A0l.append(this.A04);
                    A0l.append(" mFinalState = ");
                    A0l.append(this.A01);
                    A0l.append(" -> REMOVED. mLifecycleImpact  = ");
                    A0l.append(this.A00);
                    AnonymousClass000.A1E(" to REMOVING.", "FragmentManager", A0l);
                }
                this.A01 = AnonymousClass0GJ.REMOVED;
                r0 = C02160Fc.REMOVING;
            } else if (ordinal == 0 && this.A01 != AnonymousClass0GJ.REMOVED) {
                if (C08270df.A05(2)) {
                    StringBuilder A0l2 = AnonymousClass000.A0l("SpecialEffectsController: For fragment ");
                    A0l2.append(this.A04);
                    A0l2.append(" mFinalState = ");
                    A0l2.append(this.A01);
                    A0l2.append(" -> ");
                    A0l2.append(r8);
                    AnonymousClass000.A1E(". ", "FragmentManager", A0l2);
                }
                this.A01 = r8;
                return;
            } else {
                return;
            }
        } else if (this.A01 == AnonymousClass0GJ.REMOVED) {
            if (C08270df.A05(2)) {
                StringBuilder A0l3 = AnonymousClass000.A0l("SpecialEffectsController: For fragment ");
                A0l3.append(this.A04);
                A0l3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                A0l3.append(this.A00);
                AnonymousClass000.A1E(" to ADDING.", "FragmentManager", A0l3);
            }
            this.A01 = AnonymousClass0GJ.VISIBLE;
            r0 = C02160Fc.ADDING;
        } else {
            return;
        }
        this.A00 = r0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Operation ");
        AnonymousClass000.A1J(A0o, "{", this);
        A0o.append("} ");
        A0o.append("{");
        A0o.append("mFinalState = ");
        A0o.append(this.A01);
        A0o.append("} ");
        A0o.append("{");
        A0o.append("mLifecycleImpact = ");
        A0o.append(this.A00);
        A0o.append("} ");
        A0o.append("{");
        A0o.append("mFragment = ");
        A0o.append(this.A04);
        return AnonymousClass000.A0g(A0o);
    }
}
