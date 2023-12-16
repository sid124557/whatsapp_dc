package X;

import java.util.List;

/* renamed from: X.0g3  reason: invalid class name and case insensitive filesystem */
public final class C09350g3 implements C17000uO {
    public float A00 = -1.0f;
    public C06230Wt A01 = null;
    public C06230Wt A02;
    public final List A03;

    public final C06230Wt A00(float f) {
        List list = this.A03;
        C06230Wt A0b = AnonymousClass001.A0b(list, list.size() - 1);
        if (f < A0b.A02()) {
            int size = list.size() - 2;
            while (size >= 1) {
                A0b = AnonymousClass001.A0b(list, size);
                if (this.A02 == A0b || f < A0b.A02() || f >= A0b.A01()) {
                    size--;
                }
            }
            return AnonymousClass001.A0b(list, 0);
        }
        return A0b;
    }

    public C06230Wt B6R() {
        return this.A02;
    }

    public float B7M() {
        List list = this.A03;
        return AnonymousClass001.A0b(list, AnonymousClass002.A03(list)).A01();
    }

    public float BDF() {
        return AnonymousClass001.A0b(this.A03, 0).A02();
    }

    public boolean BHA(float f) {
        C06230Wt r0 = this.A01;
        C06230Wt r1 = this.A02;
        if (r0 == r1 && this.A00 == f) {
            return true;
        }
        this.A01 = r1;
        this.A00 = f;
        return false;
    }

    public boolean BJK(float f) {
        C06230Wt r1 = this.A02;
        if (f >= r1.A02() && f < r1.A01()) {
            return !r1.A03();
        }
        this.A02 = A00(f);
        return true;
    }

    public boolean isEmpty() {
        return false;
    }

    public C09350g3(List list) {
        this.A03 = list;
        this.A02 = A00(0.0f);
    }
}
