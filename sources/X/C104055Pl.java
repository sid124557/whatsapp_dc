package X;

import com.whatsapp.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Pl  reason: invalid class name and case insensitive filesystem */
public final class C104055Pl {
    public final C56612sH A00;
    public final C620733j A01;

    public final CharSequence A00(long j) {
        String A012;
        C56612sH r0 = this.A00;
        C620733j r6 = this.A01;
        long A0I = r0.A0I(j);
        long currentTimeMillis = System.currentTimeMillis();
        int A002 = C107175ap.A00(currentTimeMillis, A0I);
        if (A002 == 0) {
            int i = (int) ((currentTimeMillis - A0I) / 60000);
            if (i < 1) {
                A012 = r6.A0B(R.string.f11nameremoved);
            } else {
                long j2 = (long) i;
                if (j2 < TimeUnit.HOURS.toMinutes(1)) {
                    Object[] objArr = new Object[1];
                    Object[] objArr2 = new Object[1];
                    objArr[C18300x5.A1Y(objArr2, i)] = C86654Ky.A0n(C620733j.A02(r6), "%d", Arrays.copyOf(objArr2, 1));
                    A012 = r6.A0K(objArr, 270, j2);
                } else {
                    A012 = C107145am.A00(r6, A0I);
                }
            }
        } else if (A002 == 1) {
            A012 = C107505bQ.A00(r6);
        } else if (A002 < 7) {
            Calendar instance = Calendar.getInstance(C620733j.A02(r6));
            instance.setTimeInMillis(A0I);
            A012 = C107505bQ.A01(r6, instance.get(7));
        } else {
            String A06 = C107505bQ.A06(r6, A0I);
            C162457s7.A0D(A06);
            return A06;
        }
        C162457s7.A0H(A012);
        return A012;
    }

    public C104055Pl(C56612sH r1, C620733j r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
