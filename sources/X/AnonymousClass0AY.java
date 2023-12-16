package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* renamed from: X.0AY  reason: invalid class name */
public abstract class AnonymousClass0AY extends AnonymousClass0R4 {
    public C08240dc A00 = null;
    public C08310eF A01 = null;
    public ArrayList A02 = AnonymousClass001.A0s();
    public ArrayList A03 = AnonymousClass001.A0s();
    public boolean A04;
    public final int A05;
    public final C08270df A06;

    public abstract C08310eF A0G(int i);

    public Parcelable A03() {
        Bundle bundle;
        ArrayList arrayList = this.A03;
        if (arrayList.size() > 0) {
            bundle = AnonymousClass002.A08();
            AnonymousClass0ZZ[] r1 = new AnonymousClass0ZZ[arrayList.size()];
            arrayList.toArray(r1);
            bundle.putParcelableArray("states", r1);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.A02;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            C08310eF r2 = (C08310eF) arrayList2.get(i);
            if (r2 != null && r2.A16()) {
                if (bundle == null) {
                    bundle = AnonymousClass002.A08();
                }
                this.A06.A0U(bundle, r2, AnonymousClass000.A0Y("f", AnonymousClass001.A0o(), i));
            }
            i++;
        }
    }

    public void A08(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.A03;
            arrayList.clear();
            ArrayList arrayList2 = this.A02;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable add : parcelableArray) {
                    arrayList.add(add);
                }
            }
            Iterator<T> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                if (A0m.startsWith("f")) {
                    int parseInt = Integer.parseInt(A0m.substring(1));
                    C08310eF A0C = this.A06.A0C(bundle, A0m);
                    if (A0C == null) {
                        Log.w("FragmentStatePagerAdapt", AnonymousClass000.A0V("Bad fragment at key ", A0m, AnonymousClass001.A0o()));
                    } else {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add((Object) null);
                        }
                        A0C.A14(false);
                        arrayList2.set(parseInt, A0C);
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void A09(ViewGroup viewGroup) {
        C08240dc r2 = this.A00;
        if (r2 != null) {
            if (!this.A04) {
                try {
                    this.A04 = true;
                    r2.A04();
                    this.A04 = false;
                } catch (Throwable th) {
                    this.A04 = false;
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
                if (this.A05 == 1) {
                    C08240dc r2 = this.A00;
                    if (r2 == null) {
                        r2 = new C08240dc(this.A06);
                        this.A00 = r2;
                    }
                    r2.A0B(this.A01, AnonymousClass0GC.STARTED);
                } else {
                    this.A01.A15(false);
                }
            }
            r6.A14(true);
            if (this.A05 == 1) {
                C08240dc r1 = this.A00;
                if (r1 == null) {
                    r1 = new C08240dc(this.A06);
                    this.A00 = r1;
                }
                r1.A0B(r6, AnonymousClass0GC.RESUMED);
            } else {
                r6.A15(true);
            }
            this.A01 = r6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r3 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0D(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A02
            int r0 = r4.size()
            if (r0 <= r7) goto L_0x000f
            java.lang.Object r3 = r4.get(r7)
            if (r3 == 0) goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            X.0dc r0 = r5.A00
            if (r0 != 0) goto L_0x001c
            X.0df r1 = r5.A06
            X.0dc r0 = new X.0dc
            r0.<init>(r1)
            r5.A00 = r0
        L_0x001c:
            X.0eF r3 = r5.A0G(r7)
            java.util.ArrayList r1 = r5.A03
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x0033
            java.lang.Object r0 = r1.get(r7)
            X.0ZZ r0 = (X.AnonymousClass0ZZ) r0
            if (r0 == 0) goto L_0x0033
            r3.A0z(r0)
        L_0x0033:
            int r0 = r4.size()
            if (r0 > r7) goto L_0x003e
            r0 = 0
            r4.add(r0)
            goto L_0x0033
        L_0x003e:
            r0 = 0
            r3.A14(r0)
            int r2 = r5.A05
            if (r2 != 0) goto L_0x0049
            r3.A15(r0)
        L_0x0049:
            r4.set(r7, r3)
            X.0dc r1 = r5.A00
            int r0 = r6.getId()
            r1.A09(r3, r0)
            r0 = 1
            if (r2 != r0) goto L_0x000e
            X.0dc r1 = r5.A00
            X.0GC r0 = X.AnonymousClass0GC.STARTED
            r1.A0B(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AY.A0D(android.view.ViewGroup, int):java.lang.Object");
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        ArrayList arrayList;
        AnonymousClass0ZZ r0;
        C08310eF r5 = (C08310eF) obj;
        if (this.A00 == null) {
            this.A00 = new C08240dc(this.A06);
        }
        while (true) {
            arrayList = this.A03;
            if (arrayList.size() > i) {
                break;
            }
            arrayList.add((Object) null);
        }
        if (r5.A16()) {
            r0 = this.A06.A0A(r5);
        } else {
            r0 = null;
        }
        arrayList.set(i, r0);
        this.A02.set(i, (Object) null);
        this.A00.A07(r5);
        if (r5.equals(this.A01)) {
            this.A01 = null;
        }
    }

    public boolean A0F(View view, Object obj) {
        return AnonymousClass000.A1Y(((C08310eF) obj).A0B, view);
    }

    public AnonymousClass0AY(C08270df r3, int i) {
        this.A06 = r3;
        this.A05 = i;
    }

    public void A0A(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ViewPager with adapter ");
            A0o.append(this);
            throw AnonymousClass000.A0I(" requires a view id", A0o);
        }
    }
}
