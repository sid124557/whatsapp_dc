package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2sB  reason: invalid class name and case insensitive filesystem */
public class C56552sB {
    public AnonymousClass4ET A00;
    public final int A01;
    public final Comparator A02 = new AnonymousClass4IU(23);
    public volatile List A03;

    public void A06() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = Collections.synchronizedList(this.A00.BFm());
                }
            }
        }
    }

    public C56552sB(AnonymousClass4ET r3, int i) {
        this.A00 = r3;
        this.A01 = i;
    }

    public int A01() {
        int min;
        A06();
        synchronized (this) {
            min = Math.min(this.A01, this.A03.size());
        }
        return min;
    }

    public Object A02(int i) {
        Object B7y;
        A06();
        synchronized (this) {
            B7y = ((AnonymousClass4F8) this.A03.get(i)).B7y();
        }
        return B7y;
    }

    public List A03() {
        List A04;
        A06();
        synchronized (this) {
            A04 = A04(Math.min(this.A01, this.A03.size()));
        }
        return A04;
    }

    public List A04(int i) {
        A06();
        ArrayList A0s = AnonymousClass001.A0s();
        synchronized (this) {
            for (int i2 = 0; i2 < Math.min(i, this.A03.size()); i2++) {
                A0s.add(((AnonymousClass4F8) this.A03.get(i2)).B7y());
            }
        }
        return A0s;
    }

    public Map A05() {
        HashMap A0t;
        A06();
        synchronized (this) {
            A0t = AnonymousClass001.A0t();
            for (AnonymousClass4F8 r0 : this.A03) {
                A0t.put(r0.B7y(), Float.valueOf(r0.BEU()));
            }
        }
        return A0t;
    }

    public void A07(Object obj) {
        A06();
        synchronized (this) {
            int size = this.A03.size();
            while (true) {
                size--;
                if (size < 0) {
                    this.A00.Bgs(this.A03);
                } else if (((AnonymousClass4F8) this.A03.get(size)).AzC(obj)) {
                    A09(size);
                }
            }
        }
    }

    public boolean A08(Object obj) {
        boolean z;
        A06();
        synchronized (this) {
            z = false;
            for (AnonymousClass4F8 r3 : this.A03) {
                float BEU = r3.BEU();
                if (!r3.AzC(obj)) {
                    r3.Bnr(((float) Math.round((BEU * 0.9f) * 100.0f)) / 100.0f);
                } else {
                    r3.Bnr(((float) Math.round((BEU + 1.0f) * 100.0f)) / 100.0f);
                    z = true;
                }
            }
            if (!z) {
                A0A(this.A00.B0c(obj, 1.0f));
            }
            Collections.sort(this.A03, this.A02);
            C626936e.A06(this.A03);
            int size = this.A03.size();
            while (true) {
                size--;
                if (size >= this.A01) {
                    A09(size);
                } else {
                    this.A00.Bgs(this.A03);
                }
            }
        }
        return z;
    }

    public void A09(int i) {
        A06();
        synchronized (this) {
            this.A03.remove(i);
        }
    }

    public void A0A(AnonymousClass4F8 r2) {
        A06();
        synchronized (this) {
            this.A03.add(r2);
        }
    }
}
