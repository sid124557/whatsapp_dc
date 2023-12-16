package X;

import java.io.File;

/* renamed from: X.0Dy  reason: invalid class name */
public class AnonymousClass0Dy extends AnonymousClass0E0 {
    public int A00 = 0;
    public final /* synthetic */ C16400tD A01;
    public final /* synthetic */ C04710Qi A02;
    public final /* synthetic */ AnonymousClass0Y7 A03;
    public final /* synthetic */ AnonymousClass0UI A04;
    public final /* synthetic */ File A05;

    public /* bridge */ /* synthetic */ Object A01(int i) {
        try {
            AnonymousClass0Y7 r4 = this.A03;
            File file = this.A05;
            if (r4.A0J(this.A01, this.A02, this.A04, file)) {
                return Boolean.TRUE;
            }
        } catch (AnonymousClass0ER | AnonymousClass0ES e) {
            int i2 = this.A00;
            if (i2 <= 5) {
                this.A00 = i2 + 1;
            } else {
                throw new AnonymousClass0EY("Having problems with local storage", e);
            }
        }
        return null;
    }

    public AnonymousClass0Dy(C16400tD r2, C04710Qi r3, AnonymousClass0Y7 r4, AnonymousClass0UI r5, File file) {
        this.A03 = r4;
        this.A05 = file;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }
}
