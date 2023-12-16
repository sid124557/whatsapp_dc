package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5qp  reason: invalid class name and case insensitive filesystem */
public final class C116765qp implements C84334By {
    public static final long A03 = TimeUnit.DAYS.toMillis(90);
    public final C56612sH A00;
    public final C60152y5 A01;
    public final AnonymousClass66R A02 = C154517dI.A01(new C120645yv(this));

    public void Beu() {
        SharedPreferences A0F = C18310x6.A0F(this.A02);
        C162457s7.A0D(A0F);
        SharedPreferences.Editor edit = A0F.edit();
        C162457s7.A0D(edit);
        edit.clear();
        edit.apply();
    }

    public C116765qp(C56612sH r2, C60152y5 r3) {
        C18260x0.A0Q(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean A00() {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass66R r6 = this.A02;
        SharedPreferences A0F = C18310x6.A0F(r6);
        long j = A03;
        int i = ((currentTimeMillis - A0F.getLong("ts", -j)) > j ? 1 : ((currentTimeMillis - A0F.getLong("ts", -j)) == j ? 0 : -1));
        SharedPreferences A0F2 = C18310x6.A0F(r6);
        if (i < 0) {
            if (A0F2.getInt("shown", 3) < 3) {
                return true;
            }
            return false;
        } else if (A0F2.getInt("left", 3) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
