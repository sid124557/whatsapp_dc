package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob;
import java.util.Set;

/* renamed from: X.2pK  reason: invalid class name and case insensitive filesystem */
public class C54812pK {
    public Set A00;
    public final C49712gy A01;
    public final C56642sK A02;
    public final C56612sH A03;
    public final AnonymousClass1VX A04;

    public void A01(UserJid userJid) {
        Set set;
        synchronized (this) {
            set = this.A00;
            if (set == null) {
                set = C18320x8.A0u();
                this.A00 = set;
            }
        }
        synchronized (set) {
            set.remove(userJid);
        }
    }

    public boolean A03(UserJid userJid) {
        Set set;
        synchronized (this) {
            set = this.A00;
            if (set == null) {
                set = C18320x8.A0u();
                this.A00 = set;
            }
        }
        synchronized (set) {
            if (set.contains(userJid)) {
                return false;
            }
            set.add(userJid);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        if (r6 < 0) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.whatsapp.jid.UserJid r19) {
        /*
            r18 = this;
            r10 = r18
            X.2sK r3 = r10.A02
            r11 = r19
            X.2K9 r8 = r3.A05(r11)
            if (r8 == 0) goto L_0x003c
            long r4 = r8.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            if (r0 == 0) goto L_0x003c
            X.1VX r1 = r10.A04
            r0 = 996(0x3e4, float:1.396E-42)
            long r0 = X.C56952sp.A06(r1, r0)
            r6 = 0
            r12 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x004d
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Bad bucket configuration, bucketLengthSec = "
            X.C18260x0.A11(r2, r6, r0)
            X.2sH r0 = r10.A03
            long r6 = r0.A0D()
            long r6 = r6 / r12
            r0 = 15724800(0xeff100, double:7.7690835E-317)
            long r6 = r6 - r0
        L_0x0038:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0147
        L_0x003c:
            X.2sH r0 = r10.A03
            long r4 = r0.A0D()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r16
            X.1vB r0 = r3.A03
            X.4Fq r15 = X.C18630y0.A07(r0)
            goto L_0x0057
        L_0x004d:
            X.2sH r2 = r10.A03
            long r6 = r2.A0D()
            long r6 = r6 / r12
            long r6 = r6 / r0
            long r4 = r4 / r0
            goto L_0x0038
        L_0x0057:
            X.3Yo r14 = r15.Axl()     // Catch:{ all -> 0x00dc }
            r0 = r15
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00d2 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "SELECT sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send WHERE jid= ?"
            java.lang.String[] r1 = X.C18270x1.A1a(r11)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "GET_SENT_TOKEN_BY_JID"
            android.database.Cursor r13 = r9.A0E(r2, r0, r1)     // Catch:{ all -> 0x00d2 }
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x00c6 }
            r12 = 0
            if (r0 == 0) goto L_0x0077
            X.2K9 r12 = X.C34451vB.A00(r13)     // Catch:{ all -> 0x00c6 }
        L_0x0077:
            r1 = 0
            if (r12 == 0) goto L_0x009a
            long r6 = r12.A00     // Catch:{ all -> 0x00c6 }
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x008e
            r14.A00()     // Catch:{ all -> 0x00c6 }
            r13.close()     // Catch:{ all -> 0x00d2 }
            r14.close()     // Catch:{ all -> 0x00dc }
            r15.close()
            goto L_0x00f0
        L_0x008e:
            java.lang.Long r0 = r12.A01     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00bb
            long r6 = r0.longValue()     // Catch:{ all -> 0x00c6 }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
        L_0x009a:
            android.content.ContentValues r6 = X.C18290x4.A0E()     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0n(r6, r11, r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "sent_tc_token_timestamp"
            X.C18270x1.A0c(r6, r0, r4)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "real_issue_timestamp"
            X.C18270x1.A0c(r6, r0, r1)     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "wa_trusted_contacts_send"
            java.lang.String r0 = "UPDATE_SCHEDULED_TIMESTAMP"
            r9.A0A(r1, r0, r6)     // Catch:{ all -> 0x00c6 }
            r14.A00()     // Catch:{ all -> 0x00c6 }
            goto L_0x00bf
        L_0x00bb:
            r6 = 0
        L_0x00bd:
            r1 = r6
            goto L_0x009a
        L_0x00bf:
            r13.close()     // Catch:{ all -> 0x00d2 }
            r14.close()     // Catch:{ all -> 0x00dc }
            goto L_0x00e6
        L_0x00c6:
            r1 = move-exception
            if (r13 == 0) goto L_0x00d1
            r13.close()     // Catch:{ all -> 0x00cd }
            goto L_0x00d1
        L_0x00cd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d2 }
        L_0x00d1:
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x00d7 }
            goto L_0x00db
        L_0x00d7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00dc }
        L_0x00db:
            throw r1     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x00e1 }
            throw r1
        L_0x00e1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00e6:
            r15.close()
            java.util.Map r0 = r3.A09()
            r0.remove(r11)
        L_0x00f0:
            if (r8 == 0) goto L_0x0148
            java.lang.Long r13 = r8.A01
            if (r13 == 0) goto L_0x0148
            X.1VX r2 = r3.A06
            r1 = 4063(0xfdf, float:5.693E-42)
            X.2vE r0 = X.C58422vE.A02
            int r12 = r2.A0O(r0, r1)
            if (r12 <= 0) goto L_0x0148
            r0 = 996(0x3e4, float:1.396E-42)
            long r8 = X.C56952sp.A06(r2, r0)
            X.33p r0 = r3.A05
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "privacy_token_last_batch_time_sec"
            long r6 = X.AnonymousClass0x2.A0A(r1, r0)
            long r6 = r6 / r8
            X.2sH r0 = r3.A04
            long r4 = r0.A0D()
            long r4 = r4 / r16
            long r4 = r4 / r8
            r2 = 4693442413123862528(0x4122750200000000, double:604801.0)
            double r0 = (double) r8
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            int r2 = (int) r0
            long r0 = (long) r2
            long r2 = r4 - r0
            long r0 = java.lang.Math.min(r6, r4)
            long r3 = java.lang.Math.max(r2, r0)
            long r0 = (long) r12
            long r3 = r3 - r0
            long r3 = r3 * r8
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x0148
            long r1 = r13.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0148
        L_0x0147:
            return
        L_0x0148:
            boolean r0 = r10.A03(r11)
            if (r0 == 0) goto L_0x0147
            X.2gy r1 = r10.A01
            com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob r0 = new com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob
            r0.<init>(r11)
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54812pK.A02(com.whatsapp.jid.UserJid):void");
    }

    public C54812pK(C49712gy r1, C56642sK r2, C56612sH r3, AnonymousClass1VX r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
    }

    public void A00(UserJid userJid) {
        if (A03(userJid)) {
            C56642sK r1 = this.A02;
            AnonymousClass2K9 A05 = r1.A05(userJid);
            if (A05 != null) {
                long j = A05.A00;
                if (Long.valueOf(j) != null && j >= r1.A02()) {
                    this.A01.A02(new GeneratePrivacyTokenJob(userJid));
                    return;
                }
            }
            A01(userJid);
        }
    }
}
