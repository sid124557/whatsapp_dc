package X;

import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: X.0AZ  reason: invalid class name */
public abstract class AnonymousClass0AZ extends AnonymousClass0R4 {
    public C08240dc A00 = null;
    public C08310eF A01 = null;
    public boolean A02;
    public final int A03;
    public final C08270df A04;

    public abstract C08310eF A0H(int i);

    /* JADX INFO: finally extract failed */
    public void A09(ViewGroup viewGroup) {
        C08240dc r2 = this.A00;
        if (r2 != null) {
            if (!this.A02) {
                try {
                    this.A02 = true;
                    r2.A04();
                    this.A02 = false;
                } catch (Throwable th) {
                    this.A02 = false;
                    throw th;
                }
            }
            this.A00 = null;
        }
    }

    public void A0B(ViewGroup viewGroup, Object obj, int i) {
        C08310eF r6 = (C08310eF) obj;
        C08310eF r0 = this.A01;
        if (r6 != r0) {
            if (r0 != null) {
                r0.A14(false);
                if (this.A03 == 1) {
                    C08240dc r2 = this.A00;
                    if (r2 == null) {
                        r2 = new C08240dc(this.A04);
                        this.A00 = r2;
                    }
                    r2.A0B(this.A01, AnonymousClass0GC.STARTED);
                } else {
                    this.A01.A15(false);
                }
            }
            r6.A14(true);
            if (this.A03 == 1) {
                C08240dc r1 = this.A00;
                if (r1 == null) {
                    r1 = new C08240dc(this.A04);
                    this.A00 = r1;
                }
                r1.A0B(r6, AnonymousClass0GC.RESUMED);
            } else {
                r6.A15(true);
            }
            this.A01 = r6;
        }
    }

    public Object A0D(ViewGroup viewGroup, int i) {
        if (this.A00 == null) {
            this.A00 = new C08240dc(this.A04);
        }
        long A0G = A0G(i);
        int id = viewGroup.getId();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("android:switcher:");
        A0o.append(id);
        C08310eF A0D = this.A04.A0D(AnonymousClass000.A0Z(":", A0o, A0G));
        if (A0D != null) {
            this.A00.A0G(new C06170Wn(A0D, 7));
        } else {
            A0D = A0H(i);
            C08240dc r5 = this.A00;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder A0l = AnonymousClass000.A0l("android:switcher:");
            A0l.append(id3);
            r5.A0D(A0D, AnonymousClass000.A0Z(":", A0l, A0G), id2);
        }
        if (A0D != this.A01) {
            A0D.A14(false);
            if (this.A03 == 1) {
                this.A00.A0B(A0D, AnonymousClass0GC.STARTED);
            } else {
                A0D.A15(false);
                return A0D;
            }
        }
        return A0D;
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        C08310eF r5 = (C08310eF) obj;
        C08240dc r2 = this.A00;
        if (r2 == null) {
            r2 = new C08240dc(this.A04);
            this.A00 = r2;
        }
        C08270df r1 = r5.A0I;
        if (r1 == null || r1 == r2.A0J) {
            r2.A0G(new C06170Wn(r5, 6));
            if (r5.equals(this.A01)) {
                this.A01 = null;
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        AnonymousClass000.A1B(r5, A0o);
        throw AnonymousClass000.A0I(" is already attached to a FragmentManager.", A0o);
    }

    public boolean A0F(View view, Object obj) {
        return AnonymousClass000.A1Y(((C08310eF) obj).A0B, view);
    }

    public AnonymousClass0AZ(C08270df r2, int i) {
        this.A04 = r2;
        this.A03 = i;
    }

    public void A0A(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ViewPager with adapter ");
            A0o.append(this);
            throw AnonymousClass000.A0I(" requires a view id", A0o);
        }
    }

    public long A0G(int i) {
        return (long) i;
    }
}
