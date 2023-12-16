package X;

import android.database.Cursor;

/* renamed from: X.5od  reason: invalid class name and case insensitive filesystem */
public class C115415od implements AnonymousClass66C {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass5OW A01;

    public C115415od(AnonymousClass5OW r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public void B27(AnonymousClass30Y r9) {
        Cursor A0E;
        C55622qe r0 = this.A01.A04;
        long j = this.A00;
        AnonymousClass4GK A03 = r0.A0C.get();
        try {
            C56862sg r6 = ((AnonymousClass3H0) A03).A03;
            boolean z = true;
            String[] strArr = new String[1];
            C18260x0.A1Y(strArr, j);
            A0E = r6.A0E("SELECT starred FROM message_view WHERE _id = ?", "IS_MESSAGE_STARRED_SQL", strArr);
            if (A0E.moveToNext()) {
                if (AnonymousClass0x2.A04(A0E, "starred") != 1) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                A0E.close();
                A03.close();
                if (valueOf != null) {
                    r9.A00(1, "is_starred", valueOf);
                    return;
                }
                return;
            }
            A0E.close();
            A03.close();
            return;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public String B9C() {
        return "is_starred";
    }
}
