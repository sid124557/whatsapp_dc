package X;

/* renamed from: X.0QG  reason: invalid class name */
public abstract class AnonymousClass0QG {
    public int A00 = -1;
    public boolean A01;
    public final C15930sC A02;
    public final /* synthetic */ C06270Wx A03;

    public abstract boolean A02();

    public AnonymousClass0QG(C06270Wx r2, C15930sC r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    public void A00() {
    }

    public void A01(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            C06270Wx r3 = this.A03;
            int i = -1;
            if (z) {
                i = 1;
            }
            int i2 = r3.A00;
            r3.A00 = i + i2;
            if (!r3.A03) {
                r3.A03 = true;
                while (true) {
                    try {
                        int i3 = r3.A00;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            if (i3 > 0) {
                                r3.A08();
                            }
                        } else if (i2 > 0 && i3 == 0) {
                            r3.A09();
                        }
                        i2 = i3;
                    } finally {
                        r3.A03 = false;
                    }
                }
            }
            if (this.A01) {
                r3.A0C(this);
            }
        }
    }

    public boolean A03(C15910sA r2) {
        return false;
    }
}
