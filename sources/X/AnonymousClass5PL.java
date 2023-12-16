package X;

import android.content.ContentValues;
import com.whatsapp.jid.Jid;
import java.util.Date;

/* renamed from: X.5PL  reason: invalid class name */
public final class AnonymousClass5PL {
    public final C49812h8 A00;

    public AnonymousClass5PL(C49812h8 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.whatsapp.jid.Jid r8) {
        /*
            r7 = this;
            r6 = 0
            X.2h8 r0 = r7.A00
            X.1RB r0 = r0.A00()
            X.4Fq r5 = r0.A0C()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0023 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "cart_applied_promotion"
            java.lang.String r2 = "business_id=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0023 }
            X.C18280x3.A0w(r8, r1, r6)     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = "cart_applied_promotion.DELETE_APPLIED_PROMOTION"
            r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x0023 }
            r5.close()
            return
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5PL.A01(com.whatsapp.jid.Jid):void");
    }

    public final ContentValues A00(AnonymousClass5TF r5, Jid jid) {
        Long l;
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("business_id", jid.getRawString());
        A06.put("promotion_id", r5.A06);
        A06.put("promotion_name", r5.A05);
        A06.put("promotion_discount", r5.A03);
        int i = 1;
        if (r5.A00 != 1) {
            i = 2;
        }
        A06.put("promotion_discount_type", Integer.valueOf(i));
        Date date = r5.A08;
        Long l2 = null;
        if (date != null) {
            l = Long.valueOf(date.getTime());
        } else {
            l = null;
        }
        A06.put("promotion_start_date", l);
        Date date2 = r5.A07;
        if (date2 != null) {
            l2 = Long.valueOf(date2.getTime());
        }
        A06.put("promotion_end_date", l2);
        A06.put("promotion_description", r5.A02);
        A06.put("promotion_more_info", r5.A04);
        return A06;
    }
}
