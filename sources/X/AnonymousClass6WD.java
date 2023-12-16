package X;

/* renamed from: X.6WD  reason: invalid class name */
public class AnonymousClass6WD extends C160607nx {
    public AnonymousClass8LR A00;

    public int A02() {
        if (this.A00 != null) {
            int i = 0;
            while (true) {
                AnonymousClass8LR r1 = this.A00;
                if (i >= r1.A00) {
                    break;
                }
                r1.A02[i].A00();
                i++;
            }
        }
        return 0;
    }

    public void A04(C161777qQ r4) {
        if (this.A00 != null) {
            int i = 0;
            while (true) {
                AnonymousClass8LR r1 = this.A00;
                if (i < r1.A00) {
                    r1.A02[i].A01();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public AnonymousClass6WD A05() {
        AnonymousClass6WD r1 = (AnonymousClass6WD) super.A03();
        AnonymousClass8LR r0 = this.A00;
        if (r0 != null) {
            r1.A00 = (AnonymousClass8LR) r0.clone();
        }
        return r1;
    }
}
