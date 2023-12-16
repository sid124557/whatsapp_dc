package X;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: X.2it  reason: invalid class name and case insensitive filesystem */
public final class C50862it {
    public final C620633i A00;

    public C50862it(C620633i r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final boolean A01(PendingIntent pendingIntent, int i, long j) {
        AlarmManager A07;
        if (pendingIntent == null || (A07 = this.A00.A07()) == null) {
            return false;
        }
        if (!C107385bE.A09() || A00()) {
            A07.setExact(i, j, pendingIntent);
            return true;
        }
        A07.set(i, j, pendingIntent);
        return true;
    }

    public final boolean A02(PendingIntent pendingIntent, int i, long j) {
        AlarmManager A07;
        if (pendingIntent == null || (A07 = this.A00.A07()) == null) {
            return false;
        }
        if (C107385bE.A09()) {
            if (!A00()) {
                A07.setAndAllowWhileIdle(i, j, pendingIntent);
                return true;
            }
        } else if (!C107385bE.A02()) {
            A07.setExact(i, j, pendingIntent);
            return true;
        }
        A07.setExactAndAllowWhileIdle(i, j, pendingIntent);
        return true;
    }

    public final boolean A00() {
        AlarmManager A07 = this.A00.A07();
        if (A07 != null) {
            return A07.canScheduleExactAlarms();
        }
        return false;
    }
}
