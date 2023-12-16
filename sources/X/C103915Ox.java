package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5Ox  reason: invalid class name and case insensitive filesystem */
public final class C103915Ox {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final C620433g A02;
    public final AnonymousClass5PL A03;
    public final C105405Uu A04;
    public final AnonymousClass5Y9 A05;
    public final C104975Tb A06;
    public final UserJid A07;
    public final AnonymousClass4UC A08 = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A09;
    public final AtomicBoolean A0A = new AtomicBoolean();

    public C103915Ox(C620433g r2, AnonymousClass5PL r3, C105405Uu r4, AnonymousClass5Y9 r5, C104975Tb r6, UserJid userJid, AnonymousClass4FS r8) {
        C162457s7.A0J(userJid, 1);
        C18260x0.A0b(r2, r5, r4, 3);
        C18260x0.A0U(r8, r3);
        this.A07 = userJid;
        this.A06 = r6;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A09 = r8;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        if (r0.before(r1) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        if (r0.after(r1) == false) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r17 = this;
            r4 = r17
            X.5PL r0 = r4.A03
            com.whatsapp.jid.UserJid r7 = r4.A07
            r6 = 0
            r8 = 0
            X.2h8 r0 = r0.A00     // Catch:{ Exception -> 0x00c3 }
            X.1RB r0 = r0.A00()     // Catch:{ Exception -> 0x00c3 }
            X.4GK r5 = r0.get()     // Catch:{ Exception -> 0x00c3 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00bc }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = "SELECT promotion_id, promotion_name, promotion_discount, promotion_discount_type, promotion_start_date, promotion_end_date, promotion_description, promotion_more_info FROM cart_applied_promotion WHERE business_id=? LIMIT 1"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00bc }
            X.C18280x3.A0w(r7, r1, r6)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "cart_applied_promotion.SELECT_APPLIED_PROMOTIONS"
            android.database.Cursor r3 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x00bc }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "promotion_id"
            java.lang.String r9 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x00b5 }
            X.C162457s7.A0D(r9)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "promotion_name"
            java.lang.String r10 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x00b5 }
            X.C162457s7.A0D(r10)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "promotion_discount"
            java.lang.String r11 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x00b5 }
            X.C162457s7.A0D(r11)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "promotion_discount_type"
            int r6 = X.AnonymousClass0x2.A04(r3, r0)     // Catch:{ all -> 0x00b5 }
            r2 = 1
            if (r6 == r2) goto L_0x0065
            r2 = 2
            if (r6 == r2) goto L_0x0065
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "Unknown discount type "
            r1.append(r0)     // Catch:{ all -> 0x00b5 }
            r1.append(r6)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = " is retrieved from db"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)     // Catch:{ all -> 0x00b5 }
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x0065:
            java.lang.String r0 = "promotion_start_date"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b5 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0073
            r14 = 0
            goto L_0x007c
        L_0x0073:
            long r0 = r3.getLong(r1)     // Catch:{ all -> 0x00b5 }
            java.util.Date r14 = new java.util.Date     // Catch:{ all -> 0x00b5 }
            r14.<init>(r0)     // Catch:{ all -> 0x00b5 }
        L_0x007c:
            java.lang.String r0 = "promotion_end_date"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b5 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x008a
            r15 = 0
            goto L_0x0093
        L_0x008a:
            long r0 = r3.getLong(r1)     // Catch:{ all -> 0x00b5 }
            java.util.Date r15 = new java.util.Date     // Catch:{ all -> 0x00b5 }
            r15.<init>(r0)     // Catch:{ all -> 0x00b5 }
        L_0x0093:
            java.lang.String r0 = "promotion_description"
            java.lang.String r12 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x00b5 }
            X.C162457s7.A0D(r12)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "promotion_more_info"
            java.lang.String r13 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x00b5 }
            X.C162457s7.A0D(r13)     // Catch:{ all -> 0x00b5 }
            X.5TF r7 = new X.5TF     // Catch:{ all -> 0x00b5 }
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00b5 }
            goto L_0x00ae
        L_0x00ad:
            r7 = r8
        L_0x00ae:
            r3.close()     // Catch:{ all -> 0x00bc }
            r5.close()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00ca
        L_0x00b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x00bc }
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ Exception -> 0x00c3 }
            throw r0     // Catch:{ Exception -> 0x00c3 }
        L_0x00c3:
            r1 = move-exception
            java.lang.String r0 = "Failure while searching for applied promotion"
            com.whatsapp.util.Log.d(r0, r1)
            goto L_0x00cb
        L_0x00ca:
            r8 = r7
        L_0x00cb:
            r2 = 0
            if (r8 == 0) goto L_0x00dd
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r0 = r8.A08
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x00ea
        L_0x00dd:
            r8 = r2
        L_0x00de:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0A
            r0 = 0
            r1.set(r0)
            X.08M r0 = r4.A00
            r0.A0G(r8)
            return
        L_0x00ea:
            java.util.Date r0 = r8.A07
            if (r0 == 0) goto L_0x00de
            boolean r0 = r0.after(r1)
            if (r0 != 0) goto L_0x00de
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103915Ox.A00():void");
    }
}
