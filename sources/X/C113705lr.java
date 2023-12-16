package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.5lr  reason: invalid class name and case insensitive filesystem */
public final class C113705lr implements AnonymousClass664 {
    public final AnonymousClass33p A00;
    public final C66543Lv A01;
    public final AnonymousClass1VX A02;

    public String BDW() {
        return "PushToVideoMaybeUpdateSettingDefaultCron";
    }

    public void BQV() {
        Cursor A0E;
        long j;
        AnonymousClass1VX r1 = this.A02;
        AnonymousClass33p r4 = this.A00;
        if (C100375Ar.A00(r4, r1)) {
            int A0N = r1.A0N(5419);
            int A0N2 = r1.A0N(5483);
            C66543Lv r6 = this.A01;
            String[] strArr = new String[2];
            AnonymousClass0x2.A1S(strArr, 0, r6.A0K.A0H() - C18290x4.A0A(A0N2));
            strArr[1] = String.valueOf(A0N);
            AnonymousClass4GK A03 = r6.A18.get();
            try {
                A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT COUNT(*) as count FROM (SELECT * FROM available_message_view WHERE message_type = 81 AND from_me = 1  AND timestamp > ? LIMIT ?)", "SELECT_RECENTLY_SENT_PTV_COUNT", strArr);
                if (A0E.moveToFirst()) {
                    j = AnonymousClass0x2.A0C(A0E, "count");
                } else {
                    j = -1;
                }
                A0E.close();
                A03.close();
                if (j == -1) {
                    Log.e("PushToVideoGating/maybeUpdatePushToVideoSettingDefault unable to get recently sent PTV count");
                    return;
                }
                boolean A1U = AnonymousClass001.A1U((j > ((long) A0N) ? 1 : (j == ((long) A0N) ? 0 : -1)));
                Log.d("wa-shared-prefs/setPushToVideoSendingEnabledDefaultInfo");
                AnonymousClass5S8 r3 = new AnonymousClass5S8(A0N, A0N2, A1U);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(r3.A01);
                A0o.append(',');
                A0o.append(r3.A00);
                A0o.append(',');
                C18270x1.A0j(C18270x1.A03(r4), "push_to_video_sending_enabled_default_info", AnonymousClass000.A0h(A0o, r3.A02 ? 1 : 0));
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
        } else {
            return;
        }
        throw th;
    }

    public C113705lr(AnonymousClass33p r1, C66543Lv r2, AnonymousClass1VX r3) {
        C18260x0.A0V(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
