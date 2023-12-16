package X;

import android.database.Cursor;
import java.util.Calendar;

/* renamed from: X.5rb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117235rb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C113245l7 A03;

    public final void run() {
        Cursor A0E;
        C113245l7 r5 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        Calendar instance = Calendar.getInstance(C620733j.A02(r5.A3L));
        instance.clear();
        instance.set(i, i2, i3);
        C66543Lv r6 = r5.A3g;
        String[] strArr = new String[1];
        AnonymousClass0x2.A1S(strArr, 0, instance.getTimeInMillis());
        AnonymousClass4GK A032 = r6.A18.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT * FROM available_message_view WHERE timestamp >= ?  ORDER BY timestamp LIMIT 1", "SELECT_FIRST_MESSAGE_AFTER_TIMESTAMP", strArr);
            if (!A0E.moveToFirst()) {
                A0E.close();
                A032.close();
                return;
            }
            C624134x A033 = r6.A2D.A03(A0E);
            A0E.close();
            A032.close();
            if (A033 != null) {
                r5.A1Z.A0S(new C71333bw(r5, 47, A033));
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public /* synthetic */ C117235rb(C113245l7 r1, int i, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
