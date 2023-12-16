package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.09v  reason: invalid class name */
public final class AnonymousClass09v extends AnonymousClass0NF {
    public final Context A00;

    public void A00(C17430vW r15) {
        C162457s7.A0J(r15, 0);
        r15.B2q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.A00;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            SQLiteDatabase sQLiteDatabase = ((C08630en) r15).A00;
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                Object[] objArr = new Object[2];
                objArr[0] = "reschedule_needed";
                AnonymousClass000.A1Q(objArr, 1, j);
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
                sharedPreferences.edit().clear().apply();
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            SQLiteDatabase sQLiteDatabase2 = ((C08630en) r15).A00;
            sQLiteDatabase2.beginTransaction();
            try {
                Object[] objArr2 = new Object[2];
                objArr2[0] = "next_job_scheduler_id";
                AnonymousClass000.A1P(objArr2, i, 1);
                sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr2);
                Object[] objArr3 = new Object[2];
                objArr3[0] = "next_alarm_manager_id";
                AnonymousClass000.A1P(objArr3, i2, 1);
                sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr3);
                sharedPreferences2.edit().clear().apply();
                sQLiteDatabase2.setTransactionSuccessful();
            } finally {
                sQLiteDatabase2.endTransaction();
            }
        }
    }

    public AnonymousClass09v(Context context) {
        super(9, 10);
        this.A00 = context;
    }
}
