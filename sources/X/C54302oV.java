package X;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: X.2oV  reason: invalid class name and case insensitive filesystem */
public class C54302oV {
    public final C49492gc A00;

    public void A00(C27991fJ r22, long j) {
        C69833Yo Axl;
        C49492gc r13 = this.A00;
        C85284Fq A04 = r13.A01.A04();
        try {
            Axl = A04.Axl();
            ContentValues A06 = AnonymousClass0x9.A06();
            long j2 = j;
            C56862sg A02 = AnonymousClass3H0.A02(A06, A04, "announcement_version", j2);
            String[] strArr = new String[1];
            C27991fJ r14 = r22;
            C18260x0.A1X(strArr, r13.A00.A05(r14));
            if (A02.A05(A06, "group_notification_version", "group_jid_row_id = ?", "UPDATE_GROUP_NOTIFICATION_ANNOUNCEMENT_VERSION", strArr) != 1) {
                r13.A01(r14, 0, j2, 0);
            }
            Axl.A00();
            C70093Zw.A01(A04, r13, r14, 36);
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(C27991fJ r22, long j) {
        C69833Yo Axl;
        C49492gc r13 = this.A00;
        C85284Fq A04 = r13.A01.A04();
        try {
            Axl = A04.Axl();
            ContentValues A06 = AnonymousClass0x9.A06();
            long j2 = j;
            C56862sg A02 = AnonymousClass3H0.A02(A06, A04, "participant_version", j2);
            String[] strArr = new String[1];
            C27991fJ r14 = r22;
            C18260x0.A1X(strArr, r13.A00.A05(r14));
            if (A02.A05(A06, "group_notification_version", "group_jid_row_id = ?", "UPDATE_GROUP_NOTIFICATION_PARTICIPANT_VERSION", strArr) != 1) {
                r13.A01(r14, 0, 0, j2);
            }
            Axl.A00();
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(C27991fJ r3, long j) {
        Map map = this.A00.A03;
        synchronized (map) {
            AnonymousClass0x2.A1K(r3, map, j);
        }
    }

    public void A03(C27991fJ r20, long j) {
        C69833Yo Axl;
        C49492gc r11 = this.A00;
        C85284Fq A04 = r11.A01.A04();
        try {
            Axl = A04.Axl();
            ContentValues A06 = AnonymousClass0x9.A06();
            long j2 = j;
            C18270x1.A0c(A06, "subject_timestamp", j2);
            C27991fJ r12 = r20;
            long A05 = r11.A00.A05(r12);
            C56862sg r5 = ((AnonymousClass3H0) A04).A03;
            String[] strArr = new String[1];
            C18260x0.A1X(strArr, A05);
            if (r5.A05(A06, "group_notification_version", "group_jid_row_id = ?", "UPDATE_GROUP_NOTIFICATION_SUBJECT_TIMESTAMP", strArr) != 1) {
                r11.A01(r12, j2, 0, 0);
            }
            Axl.A00();
            C70093Zw.A01(A04, r11, r12, 37);
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C54302oV(C49492gc r1) {
        this.A00 = r1;
    }
}
