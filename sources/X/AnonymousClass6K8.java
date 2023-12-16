package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;

/* renamed from: X.6K8  reason: invalid class name */
public class AnonymousClass6K8 extends C152937aP implements C185248tK {
    public final AnonymousClass6KB A00;

    public AnonymousClass7Z3 BCd(long j) {
        long j2;
        AnonymousClass7TI r4;
        int i;
        long j3 = j;
        AnonymousClass6KB r42 = this.A00;
        if (r42 instanceof AnonymousClass6KA) {
            AnonymousClass6KA r43 = (AnonymousClass6KA) r42;
            List list = r43.A04;
            if (list != null) {
                AnonymousClass7FB r5 = r43.A00;
                j2 = 0;
                int i2 = (int) (j - r43.A03);
                if (!r43.A02(i2).A05 || r5 == null) {
                    j2 = r43.A02(i2).A04;
                    r4 = r43.A02;
                } else {
                    int i3 = r43.A00;
                    if (i3 == list.size()) {
                        i = ((i2 + r5.A00) - i3) + 1;
                    } else if (i2 >= i3) {
                        i = ((AnonymousClass7U0) C18300x5.A0c(list)).A00 + (i2 - i3) + 1;
                    } else {
                        i = r43.A02(i2).A00;
                    }
                    j3 = (long) i;
                    r4 = r5.A01;
                }
            } else {
                j2 = (j - r43.A03) * r43.A01;
                r4 = r43.A02;
            }
            C166637z1 r0 = this.A00;
            return new AnonymousClass7Z3(0, r4.A00(r0.A0Q, r0.A04, j3, j2), -1);
        }
        AnonymousClass6K9 r44 = (AnonymousClass6K9) r42;
        return (AnonymousClass7Z3) r44.A00.get((int) (j - r44.A03));
    }

    public long B7C(long j, long j2) {
        long j3;
        AnonymousClass6KB r6 = this.A00;
        if (r6.A04 != null) {
            j3 = r6.A02((int) (j - r6.A03)).A03;
        } else {
            int A002 = r6.A00(-9223372036854775807L);
            if (A002 != -1 && j == (r6.A03 + ((long) A002)) - 1) {
                return -9223372036854775807L - r6.A01(j);
            }
            j3 = r6.A01;
        }
        return (j3 * SearchActionVerificationClientService.MS_TO_NS) / r6.A01;
    }

    public long B7h() {
        return this.A00.A03;
    }

    public int BCc(long j) {
        return this.A00.A00(j);
    }

    public AnonymousClass6K8(C166637z1 r1, AnonymousClass6KB r2, String str, List list) {
        super(r1, r2, str, list);
        this.A00 = r2;
    }
}
