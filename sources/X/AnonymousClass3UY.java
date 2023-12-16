package X;

import android.database.Cursor;
import android.os.SystemClock;

/* renamed from: X.3UY  reason: invalid class name */
public class AnonymousClass3UY implements AnonymousClass65Y {
    public final C56612sH A00;
    public final C56922sm A01;
    public final C49472ga A02;
    public final C66533Lu A03;
    public final C72303dV A04;

    public Cursor B9f(AnonymousClass0QU r11, C95814uZ r12, C56532s8 r13) {
        AnonymousClass4GK A032;
        Cursor cursor;
        if (r12 == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            A032 = this.A04.get();
            if (C56532s8.A00(r13)) {
                String A0A = this.A03.A0A(r11, r13, (Integer) null);
                cursor = ((AnonymousClass3H0) A032).A03.A0D(r11, AnonymousClass2CD.A08, "SEARCH_KEPT_MESSAGES_FOR_JID_FTS_SQL", new String[]{A0A});
            } else {
                C56862sg r6 = ((AnonymousClass3H0) A032).A03;
                String str = C58162uo.A01;
                String[] strArr = new String[1];
                C56922sm.A02(this.A01, r12, strArr, 0);
                cursor = r6.A0D(r11, str, "GET_ALL_KEPT_MESSAGES_FOR_JID_START_SQL", strArr);
            }
            A032.close();
            C49472ga.A00(this.A02, "KeptMessageStore/getKeptMessagesForJid", uptimeMillis);
            return cursor;
        } catch (Throwable th) {
            C49472ga.A00(this.A02, "KeptMessageStore/getKeptMessagesForJid", uptimeMillis);
            throw th;
        }
        throw th;
    }

    public AnonymousClass3UY(C56612sH r1, C56922sm r2, C49472ga r3, C66533Lu r4, C72303dV r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
