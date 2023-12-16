package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.2iH  reason: invalid class name and case insensitive filesystem */
public final class C50502iH {
    public final AnonymousClass36E A00;
    public final C49712gy A01;
    public final C56612sH A02;
    public final C56982ss A03;
    public final C52552lf A04;
    public final AnonymousClass5UP A05;
    public final C56182rZ A06;
    public final C55632qf A07;
    public final AnonymousClass2YX A08;
    public final C45402Zx A09;
    public final C55832qz A0A;
    public final AnonymousClass4FS A0B;

    public final void A00(C624134x r18) {
        C624134x r2 = r18;
        AnonymousClass2z0 r0 = r2.A1J;
        C95804uY r10 = (C95804uY) r0.A00;
        if (r10 != null) {
            String str = r0.A01;
            if (AnonymousClass47o.A0C.containsKey(new C51862kV(r10.getRawString(), str))) {
                Log.d("NewsletterMessageManager/skip because the job is already scheduled");
                return;
            }
            this.A04.A01((DeviceJid) null, r2);
            long A0H = this.A02.A0H() + 86400000;
            try {
                AnonymousClass2YX r1 = this.A08;
                AnonymousClass1EU r11 = null;
                if (!(r2 instanceof C30441mS) && !(r2 instanceof C30331mH)) {
                    AnonymousClass1A4 A0R = C18300x5.A0R();
                    boolean A1U = AnonymousClass000.A1U(r2.A0A & AnonymousClass35S.A0F, AnonymousClass35S.A0F);
                    C42602Ou A11 = r2.A11();
                    int i = r2.A01;
                    if (A1U) {
                        r2.A1V((C42602Ou) null);
                        r2.A1C(AnonymousClass35S.A0F);
                        r2.A01 = 0;
                    }
                    C66383Le r12 = r1.A00;
                    C162457s7.A0H(A0R);
                    C162457s7.A0J(A0R, 0);
                    r12.A01(new C47222cu(A0R).A01(), r2);
                    if (A1U) {
                        r2.A1V(A11);
                        r2.A1B(AnonymousClass35S.A0F);
                        r2.A01 = i;
                    }
                    r11 = AnonymousClass0x9.A0W(A0R);
                }
                C49712gy r02 = this.A01;
                C162457s7.A0C(str);
                r02.A02(new AnonymousClass47o(r10, r11, str, r2.A1I, A0H, C624134x.A0d(r2)));
            } catch (AnonymousClass24A e) {
                Log.e("NewsletterMessageManager/sendMessage/failed", e);
                this.A00.A0L(r2, 13, 1, 1, 1, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C624134x r21) {
        /*
            r20 = this;
            r12 = r21
            X.2z0 r2 = r12.A1J
            boolean r0 = r2.A02
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x00a2
            X.4uZ r8 = r2.A00
            boolean r0 = r8 instanceof X.C95804uY
            if (r0 == 0) goto L_0x009d
            r10 = r20
            X.2ss r2 = r10.A03
            X.5UP r1 = r10.A05
            r0 = r8
            X.4uY r0 = (X.C95804uY) r0
            boolean r0 = X.C106855aH.A04(r2, r0, r1)
            r7 = 0
            if (r0 == 0) goto L_0x009c
            X.2Zx r2 = r10.A09
            X.3Wh r1 = r2.A02
            r0 = 15
            X.C69253Wh.A00(r1, r2, r12, r0)
            X.2rZ r6 = r10.A06
            r4 = 9223372036854675807(0x7ffffffffffe795f, double:NaN)
            if (r8 == 0) goto L_0x007a
            X.3dV r0 = r6.A05
            X.4GK r9 = r0.get()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0068 }
            X.2sm r0 = r6.A01     // Catch:{ all -> 0x0068 }
            X.C56922sm.A02(r0, r8, r3, r7)     // Catch:{ all -> 0x0068 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0068 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "SELECT server_message_id FROM newsletter_message  WHERE chat_row_id = ?  ORDER BY server_message_id DESC LIMIT 1 "
            java.lang.String r0 = "GET_LAST_SERVER_ID"
            android.database.Cursor r8 = X.C56862sg.A02(r2, r1, r0, r3)     // Catch:{ all -> 0x0068 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0056
            r2 = -1
            goto L_0x005d
        L_0x0056:
            java.lang.String r0 = "server_message_id"
            long r2 = X.AnonymousClass0x2.A0C(r8, r0)     // Catch:{ all -> 0x0061 }
        L_0x005d:
            r8.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006f
        L_0x0061:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)
            throw r0
        L_0x006f:
            r9.close()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x007a
            r0 = 1
            long r4 = r2 + r0
        L_0x007a:
            r12.A1M = r4
            X.2qf r11 = r10.A07
            X.2sH r0 = r10.A02
            long r16 = r0.A0H()
            r13 = 0
            r15 = r13
            r18 = r7
            r14 = r13
            r19 = r7
            r11.A02(r12, r13, r14, r15, r16, r18, r19)
            boolean r0 = r6.A05(r12)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "NewsletterMessageManager/failed to insert a message"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x009a:
            r0 = 1
            return r0
        L_0x009c:
            return r7
        L_0x009d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r1)
            throw r0
        L_0x00a2:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50502iH.A01(X.34x):boolean");
    }

    public C50502iH(AnonymousClass36E r2, C49712gy r3, C56612sH r4, C56982ss r5, C52552lf r6, AnonymousClass5UP r7, C56182rZ r8, C55632qf r9, AnonymousClass2YX r10, C45402Zx r11, C55832qz r12, AnonymousClass4FS r13) {
        C18260x0.A0f(r4, r13, r5, r3, r12);
        C18260x0.A0W(r6, r7, r2);
        C162457s7.A0J(r8, 9);
        C18270x1.A13(r9, r10);
        this.A02 = r4;
        this.A0B = r13;
        this.A03 = r5;
        this.A01 = r3;
        this.A0A = r12;
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = r2;
        this.A06 = r8;
        this.A09 = r11;
        this.A07 = r9;
        this.A08 = r10;
    }
}
