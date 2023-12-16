package X;

import java.util.List;

/* renamed from: X.0g2  reason: invalid class name and case insensitive filesystem */
public final class C09340g2 implements C17000uO {
    public float A00 = -1.0f;
    public final C06230Wt A01;

    public C06230Wt B6R() {
        return this.A01;
    }

    public float B7M() {
        return this.A01.A01();
    }

    public float BDF() {
        return this.A01.A02();
    }

    public boolean BHA(float f) {
        if (this.A00 == f) {
            return true;
        }
        this.A00 = f;
        return false;
    }

    public boolean BJK(float f) {
        return !this.A01.A03();
    }

    public boolean isEmpty() {
        return false;
    }

    public C09340g2(List list) {
        this.A01 = AnonymousClass001.A0b(list, 0);
    }
}
