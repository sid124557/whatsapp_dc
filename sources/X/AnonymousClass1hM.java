package X;

import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.1hM  reason: invalid class name */
public class AnonymousClass1hM extends C56682sO implements C84034At {
    public C53422n4 A00;
    public final C53612nN A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1hM(X.C55682qk r16, X.C56972sr r17, X.C66663Mh r18, X.C64773Ex r19, X.AnonymousClass5ZU r20, X.C620633i r21, X.C54292oU r22, X.C620733j r23, X.C53422n4 r24, X.C53612nN r25, X.C48042eF r26, X.AnonymousClass1VX r27, X.C66553Lw r28, X.C59962xm r29) {
        /*
            r15 = this;
            r0 = r24
            X.34x r13 = r0.A03
            r11 = r27
            r10 = r26
            r14 = r29
            r2 = r16
            r12 = r28
            r1 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A00 = r0
            r0 = r25
            r15.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1hM.<init>(X.2qk, X.2sr, X.3Mh, X.3Ex, X.5ZU, X.33i, X.2oU, X.33j, X.2n4, X.2nN, X.2eF, X.1VX, X.3Lw, X.2xm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C05610Ue r9, androidx.core.app.NotificationCompat$MessagingStyle r10, X.AnonymousClass3ZH r11) {
        /*
            r8 = this;
            X.2n4 r5 = r8.A00
            java.lang.Integer r0 = r5.A01
            if (r0 != 0) goto L_0x00ae
            X.2nN r4 = r8.A01
            r6 = 0
            X.2z0 r0 = r5.A04
            X.4uZ r1 = r0.A00
            if (r1 == 0) goto L_0x00ae
            X.2ss r0 = r4.A01
            long r0 = r0.A08(r1)
            java.util.Set r7 = r5.A05
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x00a2
            int r2 = r7.size()
            r3 = 10
            if (r2 > r3) goto L_0x00a2
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()
            X.AnonymousClass0x2.A1S(r2, r6, r0)
            java.util.List r6 = X.AnonymousClass8UF.A0p(r2)
            java.util.ArrayList r2 = X.C73783g4.A0d(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0042
            X.C18270x1.A1M(r2, r1)
            goto L_0x0038
        L_0x0042:
            r6.addAll(r2)
            int r1 = r7.size()
            r0 = 1
            if (r1 < r0) goto L_0x00a5
            if (r1 > r3) goto L_0x00a5
            java.lang.String r2 = X.C57212tH.A00(r1)
            X.C162457s7.A0D(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "\n          SELECT \n            COUNT(DISTINCT sender_jid_row_id) as sender_count\n          FROM message_comment JOIN available_message_view \n          WHERE\n            message_row_id = available_message_view._id  \n            AND message_row_id > ?\n        AND parent_message_row_id in "
            java.lang.String r3 = X.AnonymousClass000.A0V(r0, r2, r1)
            if (r3 == 0) goto L_0x00a5
            X.3dV r0 = r4.A05
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x009b }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x009b }
            java.lang.String[] r1 = X.AnonymousClass0x7.A1b(r6)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "SELECT_UNSEEN_COMMENT_SENDER_COUNT_NOTIFICATION"
            android.database.Cursor r3 = r2.A0E(r3, r0, r1)     // Catch:{ all -> 0x009b }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0094 }
            r2 = 0
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "sender_count"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0094 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x008e
            java.lang.Integer r2 = X.C18300x5.A0a(r3, r1)     // Catch:{ all -> 0x0094 }
        L_0x008e:
            r5.A01 = r2     // Catch:{ all -> 0x0094 }
        L_0x0090:
            r3.close()     // Catch:{ all -> 0x009b }
            goto L_0x00ab
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x00a2:
            java.lang.String r0 = "MessageCommentParentStore/populateSenderDataForParents/too many parents to parse"
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r0 = "MessageCommentParentStore/populateSenderDataForParents/failed to make a query"
        L_0x00a7:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00ae
        L_0x00ab:
            r4.close()
        L_0x00ae:
            super.A06(r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1hM.A06(X.0Ue, androidx.core.app.NotificationCompat$MessagingStyle, X.3ZH):void");
    }

    public final CharSequence A09(String str) {
        Integer num = this.A00.A01;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue() - 1;
        if (intValue <= 0) {
            return str;
        }
        Resources A002 = C54292oU.A00(this.A07);
        Object[] A1a = C18310x6.A1a(str);
        AnonymousClass000.A1P(A1a, intValue, 1);
        return A002.getQuantityString(R.plurals.f9nameremoved, intValue, A1a);
    }

    public final String A0A() {
        C53422n4 r1 = this.A00;
        Integer num = r1.A01;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue() - 1;
        if (intValue <= 0) {
            return this.A07.A00.getString(R.string.f11nameremoved);
        }
        int i = R.plurals.f9nameremoved;
        if (r1.A05.size() > 1) {
            i = R.plurals.f9nameremoved;
        }
        Resources A002 = C54292oU.A00(this.A07);
        Object[] A0M = AnonymousClass002.A0M();
        C66553Lw r2 = this.A0B;
        C624134x r0 = this.A00;
        A0M[0] = r2.A0K(r0.A0n(), r0.A1J.A00);
        C18280x3.A1Q(A0M, intValue, 1);
        return A002.getQuantityString(i, intValue, A0M);
    }

    public AnonymousClass2z0 BAW() {
        return this.A00.A04;
    }
}
