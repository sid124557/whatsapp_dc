package X;

import android.content.SharedPreferences;

/* renamed from: X.3WT  reason: invalid class name */
public class AnonymousClass3WT implements C1226865i {
    public final C54412og A00;

    public void BMW() {
        SharedPreferences sharedPreferences = this.A00.A01;
        C18270x1.A0l(sharedPreferences.edit(), "force_db_check", true);
        C18270x1.A0l(sharedPreferences.edit(), "force_wadb_check", true);
    }

    public AnonymousClass3WT(C54412og r1) {
        this.A00 = r1;
    }
}
