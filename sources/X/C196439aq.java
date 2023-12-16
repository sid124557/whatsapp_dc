package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.9aq  reason: invalid class name and case insensitive filesystem */
public class C196439aq implements AnonymousClass65A {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final C66533Lu A05;
    public final C50012hU A06;
    public final C56152rV A07;
    public final C72303dV A08;
    public final C1906899l A09;
    public final C1907099n A0A;
    public final AnonymousClass9U4 A0B;
    public final C160757oG A0C = C160757oG.A00("PaymentStatusNotifier", "notification", "COMMON");
    public final C195219Wq A0D;
    public final AnonymousClass35J A0E;
    public final C183538qC A0F;

    public C31671of A00(C624034w r30, AnonymousClass2z0 r31, String str, int i, long j) {
        String str2;
        int intValue;
        Integer valueOf;
        C56152rV r0 = this.A07;
        AnonymousClass2z0 r7 = r31;
        C95814uZ r9 = r7.A00;
        C624134x A002 = r0.A00(r9);
        C626936e.A06(A002);
        if (A002.A1J.A01.equals(r7.A01)) {
            this.A0C.A04("Do not insert system message if last message is the transaction message.");
        } else {
            C195219Wq r12 = this.A0D;
            C624034w r8 = r30;
            String A0U = r12.A0U(r8);
            String A0X = r12.A0X(r8);
            String A0R = r12.A0R(r8);
            boolean z = r7.A02;
            int i2 = r8.A02;
            long j2 = r8.A06;
            if (r8.A08 == null) {
                str2 = this.A04.A00.getString(R.string.f11nameremoved);
            } else {
                str2 = A0R;
            }
            AnonymousClass39Q r13 = r8.A08;
            if (r13 == null) {
                intValue = 1;
            } else {
                intValue = r13.A00.intValue();
            }
            int i3 = i;
            long j3 = j;
            if (!TextUtils.isEmpty(r12.A0i(A0U, A0X, str2, i2, i3, intValue, j3, j2, z))) {
                C160757oG r6 = this.A0C;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("generatePaymentStatusChangeMessageIfNeeded receiverName:");
                A0o.append(A0U);
                A0o.append(" senderName:");
                A0o.append(A0X);
                A0o.append(" newStatus:");
                A0o.append(r8.A02);
                A0o.append(" oldStatus:");
                A0o.append(i3);
                A0o.append(" initTs:");
                A0o.append(j3);
                A0o.append(" updateTs:");
                A0o.append(r8.A06);
                C1899593h.A1F(r6, A0o);
                AnonymousClass35J r02 = this.A0E;
                C626936e.A06(r9);
                C31671of r62 = new C31671of(r02.A04(r9, true), this.A03.A0H());
                r62.A03 = r8.A0K;
                r62.A01 = TextUtils.join(";", Arrays.asList(new String[]{String.valueOf(i3), str, String.valueOf(r8.A02), A0U, A0X}));
                r62.A02 = String.valueOf(j3);
                r62.A04 = String.valueOf(r8.A06);
                r62.A02 = r7;
                String[] strArr = new String[2];
                AnonymousClass39Q r03 = r8.A08;
                if (r03 == null) {
                    valueOf = "";
                } else {
                    valueOf = Integer.valueOf(r03.A00.intValue());
                }
                strArr[0] = String.valueOf(valueOf);
                if (r8.A08 == null) {
                    A0R = "";
                }
                strArr[1] = A0R;
                r62.A00 = TextUtils.join(";", Arrays.asList(strArr));
                return r62;
            }
        }
        return null;
    }

    public String A01(C31351o9 r11) {
        String A0f;
        int i;
        Object[] objArr;
        AnonymousClass5ZU r1;
        AnonymousClass3ZH A0A2;
        UserJid userJid = r11.A01;
        UserJid userJid2 = r11.A00;
        if (userJid == null || userJid2 == null) {
            this.A0C.A05("failed to retrieve request sender jid or receiver jid");
            return "";
        }
        if (TextUtils.isEmpty(r11.A03)) {
            A0f = this.A04.A00.getString(R.string.f11nameremoved);
        } else {
            A0f = this.A0D.A0f(r11.A03);
        }
        boolean A0a = this.A00.A0a(userJid);
        Context context = this.A04.A00;
        if (A0a) {
            i = R.string.f11nameremoved;
            objArr = new Object[2];
            r1 = this.A02;
            A0A2 = this.A01.A0A(userJid2);
        } else {
            i = R.string.f11nameremoved;
            objArr = new Object[2];
            r1 = this.A02;
            A0A2 = this.A01.A0A(userJid);
        }
        objArr[0] = r1.A0H(A0A2);
        return AnonymousClass002.A0F(context, A0f, objArr, 1, i);
    }

    public String A02(C31681og r12) {
        int A012;
        String A0f;
        String str = r12.A01;
        if (str == null) {
            A012 = 1;
        } else {
            A012 = C615531h.A01(str, 1);
        }
        if (TextUtils.isEmpty(r12.A03)) {
            A0f = this.A04.A00.getString(R.string.f11nameremoved);
        } else {
            A0f = this.A0D.A0f(r12.A03);
        }
        String str2 = r12.A03;
        C195219Wq r6 = this.A0D;
        long j = (long) r12.A00;
        int i = 2;
        if (j <= 86400000) {
            i = 1;
        }
        String A0M = r6.A0M(j, i);
        boolean isEmpty = TextUtils.isEmpty(str2);
        boolean isEmpty2 = TextUtils.isEmpty(A0M);
        if (!isEmpty) {
            Resources A002 = C54292oU.A00(this.A04);
            if (!isEmpty2) {
                return C18320x8.A0b(A002, A0M, AnonymousClass4L0.A0V(str2, A0f, 3), 2, R.string.f11nameremoved);
            }
            return A002.getQuantityString(R.plurals.f9nameremoved, A012, AnonymousClass4L0.A0V(str2, A0f, 2));
        }
        Resources A003 = C54292oU.A00(this.A04);
        if (!isEmpty2) {
            return A003.getString(R.string.f11nameremoved, AnonymousClass4L0.A0V(A0f, A0M, 2));
        }
        return A003.getQuantityString(R.plurals.f9nameremoved, A012, new Object[]{A0f});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0091, code lost:
        if (r5 != 0) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A03(X.C31671of r22) {
        /*
            r21 = this;
            r9 = r22
            X.2z0 r6 = r9.A02
            X.C626936e.A06(r6)
            java.lang.String r7 = r9.A02
            java.lang.String r2 = r9.A04
            r0 = 0
            long r18 = X.C615531h.A04(r2, r0)
            java.lang.String r2 = r9.A01
            X.C626936e.A06(r2)
            java.lang.String r5 = ";"
            java.lang.String[] r8 = r2.split(r5)
            int r4 = r8.length
            r2 = 5
            r3 = r21
            if (r4 < r2) goto L_0x0096
            java.lang.String r2 = r9.A00
            if (r2 == 0) goto L_0x0096
            java.lang.String[] r4 = r2.split(r5)
            X.9Wq r9 = r3.A0D
            boolean r2 = r6.A02
            r5 = 3
            r10 = r8[r5]
            r5 = 4
            r11 = r8[r5]
            r5 = 2
            r5 = r8[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r13 = r5.intValue()
            r6 = 0
            r5 = r8[r6]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r14 = r5.intValue()
            long r16 = X.C615531h.A04(r7, r0)
            int r5 = r4.length
            r1 = 1
            if (r5 == 0) goto L_0x0086
            r0 = r4[r6]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0086
            r12 = r4[r1]
        L_0x005c:
            r0 = r4[r6]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0094
            r0 = r4[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r15 = r0.intValue()
        L_0x006e:
            r20 = r2
            java.lang.String r1 = r9.A0i(r10, r11, r12, r13, r14, r15, r16, r18, r20)
        L_0x0074:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0085
            X.2oU r0 = r3.A04
            android.content.Context r1 = r0.A00
            r0 = 2131892217(0x7f1217f9, float:1.9419176E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x0085:
            return r1
        L_0x0086:
            X.2oU r0 = r3.A04
            android.content.Context r1 = r0.A00
            r0 = 2131894597(0x7f122145, float:1.9424003E38)
            java.lang.String r12 = r1.getString(r0)
            if (r5 == 0) goto L_0x0094
            goto L_0x005c
        L_0x0094:
            r15 = 1
            goto L_0x006e
        L_0x0096:
            r1 = 0
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196439aq.A03(X.1of):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0099 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0138 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A04() {
        /*
            r18 = this;
            r3 = r18
            monitor-enter(r3)
            X.8qC r5 = r3.A0F     // Catch:{ all -> 0x01c4 }
            java.lang.Object r4 = r5.get()     // Catch:{ all -> 0x01c4 }
            X.3Lv r4 = (X.C66543Lv) r4     // Catch:{ all -> 0x01c4 }
            X.9U4 r8 = r3.A0B     // Catch:{ all -> 0x01c4 }
            X.36F r6 = X.AnonymousClass9U4.A01(r8)     // Catch:{ all -> 0x01c4 }
            monitor-enter(r6)     // Catch:{ all -> 0x01c4 }
            X.2sH r2 = r6.A02     // Catch:{ all -> 0x01c1 }
            long r16 = r2.A0H()     // Catch:{ all -> 0x01c1 }
            java.util.List r1 = r6.A0L()     // Catch:{ all -> 0x01c1 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01c1 }
            X.3dV r0 = r6.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
            X.4Fq r9 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
            X.3Yo r15 = r9.Axl()     // Catch:{ all -> 0x008f }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x0085 }
        L_0x002e:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x007b
            X.34w r11 = X.C1899693i.A0E(r14)     // Catch:{ all -> 0x0085 }
            X.1S4 r0 = r11.A0A     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0044
            long r12 = r0.A0B()     // Catch:{ all -> 0x0085 }
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
        L_0x0044:
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0085 }
            r12.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = r11.A0L     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x0085 }
            X.AnonymousClass36F.A03(r1, r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = "status"
            r0 = 16
            X.C18270x1.A0b(r12, r1, r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = "timestamp"
            long r0 = X.C18290x4.A0B(r16)     // Catch:{ all -> 0x0085 }
            int r10 = (int) r0     // Catch:{ all -> 0x0085 }
            X.C18270x1.A0b(r12, r13, r10)     // Catch:{ all -> 0x0085 }
            X.7oG r10 = r6.A09     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "expireOldPendingRequests key id:"
            r1.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0085 }
            X.C1899593h.A1J(r10, r0, r1)     // Catch:{ all -> 0x0085 }
            int r0 = X.AnonymousClass36F.A00(r12, r9, r11)     // Catch:{ all -> 0x0085 }
            if (r0 <= 0) goto L_0x002e
            r7.add(r11)     // Catch:{ all -> 0x0085 }
            goto L_0x002e
        L_0x007b:
            r15.A00()     // Catch:{ all -> 0x0085 }
            r15.close()     // Catch:{ all -> 0x008f }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
            goto L_0x00a0
        L_0x0085:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x008f }
        L_0x008e:
            throw r1     // Catch:{ all -> 0x008f }
        L_0x008f:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
        L_0x0098:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
        L_0x0099:
            X.7oG r1 = r6.A09     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "expireOldPendingRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x01c1 }
        L_0x00a0:
            monitor-exit(r6)     // Catch:{ all -> 0x01c4 }
            r8.A0J()     // Catch:{ all -> 0x01c4 }
            monitor-enter(r6)     // Catch:{ all -> 0x01c4 }
            long r16 = r2.A0H()     // Catch:{ all -> 0x01c1 }
            r1 = 1
            java.lang.Integer[] r8 = new java.lang.Integer[r1]     // Catch:{ all -> 0x01c1 }
            r0 = 20
            boolean r2 = X.C18300x5.A1Y(r8, r0)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ all -> 0x01c1 }
            r0 = 40
            X.AnonymousClass000.A1P(r1, r0, r2)     // Catch:{ all -> 0x01c1 }
            r0 = -1
            java.util.List r1 = r6.A0V(r8, r1, r0)     // Catch:{ all -> 0x01c1 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01c1 }
            X.3dV r0 = r6.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0138 }
            X.4Fq r9 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0138 }
            X.3Yo r15 = r9.Axl()     // Catch:{ all -> 0x012e }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x0124 }
        L_0x00d0:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x011a
            X.34w r11 = X.C1899693i.A0E(r14)     // Catch:{ all -> 0x0124 }
            X.1S4 r0 = r11.A0A     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00e6
            long r12 = r0.A0B()     // Catch:{ all -> 0x0124 }
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d0
        L_0x00e6:
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0124 }
            r10.<init>()     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r11.A0L     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x0124 }
            X.AnonymousClass36F.A03(r1, r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = "status"
            r0 = 16
            X.C18270x1.A0b(r10, r1, r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r12 = "timestamp"
            long r0 = X.C18290x4.A0B(r16)     // Catch:{ all -> 0x0124 }
            int r8 = (int) r0     // Catch:{ all -> 0x0124 }
            X.C18270x1.A0b(r10, r12, r8)     // Catch:{ all -> 0x0124 }
            X.7oG r8 = r6.A09     // Catch:{ all -> 0x0124 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "expireOldPendingRequests key id:"
            r1.append(r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0124 }
            X.C1899593h.A1J(r8, r0, r1)     // Catch:{ all -> 0x0124 }
            X.AnonymousClass36F.A00(r10, r9, r11)     // Catch:{ all -> 0x0124 }
            r2.add(r11)     // Catch:{ all -> 0x0124 }
            goto L_0x00d0
        L_0x011a:
            r15.A00()     // Catch:{ all -> 0x0124 }
            r15.close()     // Catch:{ all -> 0x012e }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0138 }
            goto L_0x013f
        L_0x0124:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0129 }
            goto L_0x012d
        L_0x0129:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x012e }
        L_0x012d:
            throw r1     // Catch:{ all -> 0x012e }
        L_0x012e:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0133 }
            goto L_0x0137
        L_0x0133:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0138 }
        L_0x0137:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0138 }
        L_0x0138:
            X.7oG r1 = r6.A09     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "expirePendingMandateRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x01c1 }
        L_0x013f:
            monitor-exit(r6)     // Catch:{ all -> 0x01c4 }
            r7.addAll(r2)     // Catch:{ all -> 0x01c4 }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ all -> 0x01c4 }
        L_0x0147:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x01bf
            X.34w r6 = X.C1899693i.A0E(r9)     // Catch:{ all -> 0x01c4 }
            X.35J r1 = r3.A0E     // Catch:{ all -> 0x01c4 }
            X.4uZ r0 = r6.A0C     // Catch:{ all -> 0x01c4 }
            X.2z0 r8 = X.AnonymousClass35J.A01(r0, r1)     // Catch:{ all -> 0x01c4 }
            X.2sH r0 = r3.A03     // Catch:{ all -> 0x01c4 }
            long r0 = r0.A0H()     // Catch:{ all -> 0x01c4 }
            r2 = 44
            X.1o9 r7 = new X.1o9     // Catch:{ all -> 0x01c4 }
            r7.<init>(r8, r2, r0)     // Catch:{ all -> 0x01c4 }
            com.whatsapp.jid.UserJid r0 = r6.A0D     // Catch:{ all -> 0x01c4 }
            r7.A01 = r0     // Catch:{ all -> 0x01c4 }
            com.whatsapp.jid.UserJid r0 = r6.A0E     // Catch:{ all -> 0x01c4 }
            r7.A00 = r0     // Catch:{ all -> 0x01c4 }
            java.lang.String r2 = r6.A0I     // Catch:{ all -> 0x01c4 }
            X.39Q r0 = r6.A08     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = ""
        L_0x0176:
            r7.A03 = r0     // Catch:{ all -> 0x01c4 }
            X.2z0 r0 = X.C1899593h.A0R(r6)     // Catch:{ all -> 0x01c4 }
            r7.A02 = r0     // Catch:{ all -> 0x01c4 }
            X.2z0 r0 = r7.A1J     // Catch:{ all -> 0x01c4 }
            X.4uZ r0 = r0.A00     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0147
            r2 = 16
            r4.A09(r7, r2)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r5.get()     // Catch:{ all -> 0x01bd }
            X.3Lv r0 = (X.C66543Lv) r0     // Catch:{ all -> 0x01bd }
            X.34x r1 = r0.A0E(r6)     // Catch:{ all -> 0x01bd }
            if (r1 == 0) goto L_0x0147
            r6.A02 = r2     // Catch:{ all -> 0x01bd }
            r1.A0P = r6     // Catch:{ all -> 0x01bd }
            X.2hU r0 = r3.A06     // Catch:{ all -> 0x01bd }
            r0.A00(r1, r2)     // Catch:{ all -> 0x01bd }
            X.3Lu r0 = r3.A05     // Catch:{ all -> 0x01bd }
            r0.A0K(r1)     // Catch:{ all -> 0x01bd }
            goto L_0x0147
        L_0x01a4:
            long r0 = X.C1899693i.A02(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x01c4 }
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x01c4 }
            X.AnonymousClass000.A16(r2, r1, r0)     // Catch:{ all -> 0x01c4 }
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = ";"
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x01c4 }
            goto L_0x0176
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c3
        L_0x01bf:
            monitor-exit(r3)
            return
        L_0x01c1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01c4 }
        L_0x01c3:
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196439aq.A04():void");
    }

    public void A05(Context context, C31351o9 r6) {
        Intent A082 = AnonymousClass0x9.A08(context, this.A0B.A0G().BBC());
        AnonymousClass2z0 r2 = r6.A02;
        C626936e.A07(Boolean.valueOf(AnonymousClass000.A1W(r2)), "Remote request message key is not specified.");
        C107395bF.A00(A082, r2);
        context.startActivity(A082);
    }

    public void A06(AnonymousClass1A3 r5, C30291mD r6) {
        C160757oG r2;
        String str;
        AnonymousClass23Q r3;
        StringBuilder A0o;
        String str2;
        if (r6 instanceof C30831nH) {
            r3 = AnonymousClass23Q.A2R;
        } else if (r6 instanceof AnonymousClass1nG) {
            r3 = AnonymousClass23Q.A2Q;
        } else {
            r2 = this.A0C;
            str = "buildWebRequestSystemEvent: message type not supported";
            r2.A05(str);
        }
        String str3 = r6.A00;
        if (TextUtils.isEmpty(str3)) {
            r2 = this.A0C;
            A0o = AnonymousClass001.A0o();
            str2 = "buildWebRequestSystemEvent: failed to retrieve request message id for type: ";
        } else {
            C624034w A052 = AnonymousClass36F.A05(AnonymousClass9U4.A01(this.A0B), str3, (String) null);
            if (A052 == null || TextUtils.isEmpty(A052.A0I) || A052.A08 == null) {
                r2 = this.A0C;
                A0o = AnonymousClass001.A0o();
                str2 = "buildWebRequestSystemEvent: request transaction, currency, or amount is null for type: ";
            } else {
                r5.A0C(r3);
                String A072 = C627336j.A07(r6.A0o());
                if (A072 == null) {
                    A072 = "";
                }
                r5.A0D(A072);
                r5.A0D(A052.A0I);
                r5.A0D(String.valueOf(C1899693i.A02(A052.A08)));
                return;
            }
        }
        str = AnonymousClass000.A0P(r3, str2, A0o);
        r2.A05(str);
    }

    public void A07(AnonymousClass1A3 r7, C31351o9 r8) {
        C160757oG r1;
        String str;
        String A072 = C627336j.A07(r8.A01);
        String A073 = C627336j.A07(r8.A00);
        String str2 = r8.A03;
        if (TextUtils.isEmpty(A072) || TextUtils.isEmpty(A073) || TextUtils.isEmpty(str2)) {
            r1 = this.A0C;
            str = "buildWebRequestExpiration: failed to retrieve request sender jid or receiver jid or web stub string";
        } else {
            String[] split = str2.split(";");
            if (C615531h.A01(split[0], -1) != -1) {
                r1 = this.A0C;
                str = "buildWebRequestExpiration: outdated currency format";
            } else if (TextUtils.isEmpty(split[1])) {
                r1 = this.A0C;
                str = "buildWebRequestExpiration: missing amount";
            } else {
                r7.A0C(AnonymousClass23Q.A2S);
                r7.A0D(A072);
                r7.A0D(A073);
                r7.A0D(split[0]);
                r7.A0D(split[1]);
                return;
            }
        }
        r1.A05(str);
    }

    public void A08(AnonymousClass1A3 r5, C31681og r6) {
        C160757oG r1;
        String str;
        String str2 = r6.A02;
        if (TextUtils.isEmpty(str2)) {
            r1 = this.A0C;
            str = "buildWebTransactionReminder: failed to retrieve web stub string";
        } else {
            String[] split = str2.split(";");
            if (C615531h.A01(split[1], -1) != -1) {
                r1 = this.A0C;
                str = "buildWebTransactionReminder: outdated currency format";
            } else if (TextUtils.isEmpty(split[2])) {
                r1 = this.A0C;
                str = "buildWebTransactionReminder: missing amount";
            } else {
                r5.A0C(AnonymousClass23Q.A2a);
                r5.A0D(split[0]);
                r5.A0D(split[1]);
                r5.A0D(split[2]);
                return;
            }
        }
        r1.A05(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass1A3 r11, X.C31671of r12) {
        /*
            r10 = this;
            java.lang.String r3 = r12.A03
            X.2z0 r2 = r12.A02
            X.C626936e.A06(r2)
            X.9U4 r0 = r10.A0B
            X.36F r1 = X.AnonymousClass9U4.A01(r0)
            java.lang.String r0 = r2.A01
            X.34w r5 = X.AnonymousClass36F.A05(r1, r0, r3)
            if (r5 != 0) goto L_0x0027
            X.7oG r2 = r10.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "buildWebTransactionStatusUpdate: null transaction id="
            r1.append(r0)
            r1.append(r3)
        L_0x0023:
            X.C1899593h.A1F(r2, r1)
        L_0x0026:
            return
        L_0x0027:
            java.lang.String r1 = r12.A01
            X.C626936e.A06(r1)
            java.lang.String r0 = ";"
            java.lang.String[] r7 = r1.split(r0)
            java.lang.String r0 = r12.A02
            r3 = 0
            long r1 = X.C615531h.A04(r0, r3)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r8
            java.lang.String r0 = r12.A04
            long r3 = X.C615531h.A04(r0, r3)
            long r3 = r3 / r8
            int r6 = r7.length
            r0 = 5
            if (r6 < r0) goto L_0x007b
            r0 = 2
            r0 = r7[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r6 = r0.intValue()
        L_0x0053:
            r0 = 102(0x66, float:1.43E-43)
            if (r6 == r0) goto L_0x007e
            r0 = 106(0x6a, float:1.49E-43)
            if (r6 == r0) goto L_0x00c3
            r0 = 404(0x194, float:5.66E-43)
            if (r6 == r0) goto L_0x00aa
            r0 = 411(0x19b, float:5.76E-43)
            if (r6 == r0) goto L_0x00aa
            r0 = 412(0x19c, float:5.77E-43)
            if (r6 == r0) goto L_0x00ad
            switch(r6) {
                case 406: goto L_0x00ad;
                case 407: goto L_0x00ad;
                case 408: goto L_0x00aa;
                case 409: goto L_0x00a7;
                default: goto L_0x006a;
            }
        L_0x006a:
            X.7oG r2 = r10.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "buildWebTransactionStatusUpdate: unhandled transaction status "
            r1.append(r0)
            int r0 = r5.A02
            r1.append(r0)
            goto L_0x0023
        L_0x007b:
            int r6 = r5.A02
            goto L_0x0053
        L_0x007e:
            X.39Q r0 = r5.A08
            if (r0 == 0) goto L_0x0026
            X.23Q r0 = X.AnonymousClass23Q.A2a
            r11.A0C(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0E
            java.lang.String r0 = X.C627336j.A07(r0)
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = ""
        L_0x0091:
            r11.A0D(r0)
            java.lang.String r0 = r5.A0I
            r11.A0D(r0)
            X.39Q r0 = r5.A08
            long r0 = X.C1899693i.A02(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.A0D(r0)
            return
        L_0x00a7:
            X.23Q r0 = X.AnonymousClass23Q.A2e
            goto L_0x00af
        L_0x00aa:
            X.23Q r0 = X.AnonymousClass23Q.A2d
            goto L_0x00af
        L_0x00ad:
            X.23Q r0 = X.AnonymousClass23Q.A2c
        L_0x00af:
            r11.A0C(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0D
            java.lang.String r0 = X.C627336j.A07(r0)
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = ""
        L_0x00bc:
            r11.A0D(r0)
            r11.A0A(r3)
            return
        L_0x00c3:
            X.23Q r0 = X.AnonymousClass23Q.A2b
            r11.A0C(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0E
            java.lang.String r0 = X.C627336j.A07(r0)
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = ""
        L_0x00d2:
            r11.A0D(r0)
            r11.A0A(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196439aq.A09(X.1A3, X.1of):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void BUN() {
        /*
            r23 = this;
            r4 = r23
            X.2sr r0 = r4.A00
            r0.A0P()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0441
            X.99n r0 = r4.A0A
            boolean r0 = X.C1899693i.A0x(r0)
            if (r0 == 0) goto L_0x0441
            X.3dV r0 = r4.A08
            r0.A05()
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0441
            X.9U4 r7 = r4.A0B
            X.9oC r0 = r7.A0G()
            X.8u9 r1 = r0.B63()
            if (r1 == 0) goto L_0x002f
            r0 = 0
            boolean r0 = r1.Bo1(r0)
            if (r0 == 0) goto L_0x00c4
        L_0x002f:
            X.99l r0 = r4.A09
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x00c4
            X.9oC r0 = r7.A0G()
            X.9Px r3 = r0.BBB()
            if (r3 == 0) goto L_0x00c4
            X.8qC r0 = r4.A0F
            java.lang.Object r2 = r0.get()
            X.3Lv r2 = (X.C66543Lv) r2
            X.36F r0 = X.AnonymousClass9U4.A01(r7)
            monitor-enter(r0)
            r1 = 1
            java.lang.String[] r15 = new java.lang.String[r1]     // Catch:{ all -> 0x043d }
            r1 = 102(0x66, float:1.43E-43)
            java.lang.String r5 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x043d }
            r1 = 0
            r15[r1] = r5     // Catch:{ all -> 0x043d }
            java.lang.String r19 = "readUnacceptedTransactions/QUERY_PAY_TRANSACTION"
            X.3dV r1 = r0.A04     // Catch:{ IllegalStateException -> 0x00aa }
            X.4GK r10 = r1.get()     // Catch:{ IllegalStateException -> 0x00aa }
            r1 = r10
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x00a0 }
            X.2sg r11 = r1.A03     // Catch:{ all -> 0x00a0 }
            java.lang.String r12 = "pay_transaction"
            java.lang.String[] r13 = X.AnonymousClass36F.A0A     // Catch:{ all -> 0x00a0 }
            java.lang.String r14 = "status=? AND metadata LIKE '%expiryTs%'"
            r16 = 0
            java.lang.String r17 = "timestamp ASC"
            java.lang.String r18 = "100"
            android.database.Cursor r8 = r11.A0F(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = "readUnacceptedTransactions"
            java.util.List r9 = r0.A0O(r8, r1)     // Catch:{ all -> 0x0094 }
            X.7oG r6 = r0.A09     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "readUnacceptedTransactions returned: "
            X.AnonymousClass000.A1H(r1, r5, r9)     // Catch:{ all -> 0x0094 }
            X.C1899593h.A1F(r6, r5)     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x0090
            r8.close()     // Catch:{ all -> 0x00a0 }
        L_0x0090:
            r10.close()     // Catch:{ IllegalStateException -> 0x00aa }
            goto L_0x00b6
        L_0x0094:
            r5 = move-exception
            if (r8 == 0) goto L_0x009f
            r8.close()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch:{ all -> 0x00a0 }
        L_0x009f:
            throw r5     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r5 = move-exception
            r10.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch:{ IllegalStateException -> 0x00aa }
        L_0x00a9:
            throw r5     // Catch:{ IllegalStateException -> 0x00aa }
        L_0x00aa:
            r6 = move-exception
            X.7oG r5 = r0.A09     // Catch:{ all -> 0x043d }
            java.lang.String r1 = "readUnacceptedTransactions/IllegalStateException "
            r5.A0A(r1, r6)     // Catch:{ all -> 0x043d }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x043d }
        L_0x00b6:
            monitor-exit(r0)
            int r0 = r9.size()
            if (r0 != 0) goto L_0x00ce
            X.7oG r1 = r4.A0C
            java.lang.String r0 = "sendAcceptPaymentReminderNotificationsIfNeeded skipped. No pending transaction with expiry timestamp."
            r1.A07(r0)
        L_0x00c4:
            r4.A04()
            X.36F r0 = X.AnonymousClass9U4.A01(r7)
            monitor-enter(r0)
            goto L_0x02e7
        L_0x00ce:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r17 = r9.iterator()
        L_0x00d6:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x02d1
            X.34w r9 = X.C1899693i.A0E(r17)
            X.1S4 r0 = r9.A0A
            if (r0 == 0) goto L_0x02cd
            long r0 = r0.A0B()
            java.lang.String r6 = java.lang.String.valueOf(r0)
        L_0x00ec:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: BrazilPaymentStatusNotificationHelper/buildPaymentReminders - transaction transferred at: "
            r5.append(r0)
            long r0 = r9.A05
            r5.append(r0)
            java.lang.String r0 = ", expired at: "
            X.C18260x0.A0s(r0, r6, r5)
            X.9Wq r12 = r3.A05
            java.lang.Long r16 = r12.A0K(r9)
            if (r16 == 0) goto L_0x0155
            java.lang.String r6 = r9.A0L
            long r13 = r16.longValue()
            r10 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x02bd
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x02bd
            org.json.JSONObject r0 = r3.A00
            if (r0 != 0) goto L_0x0139
            X.33l r0 = r3.A04
            android.content.SharedPreferences r5 = r0.A03()
            java.lang.String r1 = "payments_nagged_transactions"
            java.lang.String r0 = ""
            java.lang.String r0 = r5.getString(r1, r0)
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x0133 }
            r3.A00 = r0     // Catch:{ Exception -> 0x0133 }
            goto L_0x0139
        L_0x0133:
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1G()
            r3.A00 = r0
        L_0x0139:
            boolean r0 = r0.optBoolean(r6)
            if (r0 != 0) goto L_0x02bd
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r0 = 11
            int r1 = r1.get(r0)
            r0 = 9
            if (r1 < r0) goto L_0x02bd
            r0 = 21
            if (r1 >= r0) goto L_0x02bd
        L_0x0155:
            com.whatsapp.jid.UserJid r5 = r9.A0E
            if (r5 == 0) goto L_0x00d6
            X.5ZU r1 = r3.A02
            X.3Ex r0 = r3.A01
            X.3ZH r0 = r0.A0A(r5)
            java.lang.String r11 = r1.A0H(r0)
            X.35J r1 = r3.A06
            X.4uZ r0 = r9.A0C
            X.2z0 r5 = X.AnonymousClass35J.A01(r0, r1)
            X.2sH r0 = r3.A03
            long r0 = r0.A0H()
            X.1og r10 = new X.1og
            r10.<init>(r5, r0)
            r1 = 3
            java.lang.Comparable[] r6 = new java.lang.Comparable[r1]
            r5 = 0
            com.whatsapp.jid.UserJid r0 = r9.A0E
            r6[r5] = r0
            r5 = 1
            java.lang.String r0 = r9.A0I
            r6[r5] = r0
            X.39Q r0 = r9.A08
            java.lang.String r5 = ""
            r13 = r5
            if (r0 != 0) goto L_0x0281
            r1 = r5
        L_0x018d:
            r0 = 2
            r6[r0] = r1
            java.util.List r0 = java.util.Arrays.asList(r6)
            java.lang.String r6 = ";"
            java.lang.String r0 = android.text.TextUtils.join(r6, r0)
            r10.A02 = r0
            java.lang.String r14 = r9.A0I
            X.39Q r0 = r9.A08
            if (r0 != 0) goto L_0x0269
            java.lang.String r0 = ""
        L_0x01a4:
            r10.A03 = r0
            X.39Q r0 = r9.A08
            if (r0 == 0) goto L_0x01b4
            java.math.BigDecimal r0 = r0.A00
            int r0 = r0.intValue()
            java.lang.String r5 = java.lang.String.valueOf(r0)
        L_0x01b4:
            r10.A01 = r5
            long r5 = r9.A05
            X.2sH r0 = r12.A04
            long r0 = r0.A0H()
            int r0 = X.C107175ap.A00(r0, r5)
            if (r0 != 0) goto L_0x01f7
            X.33j r1 = r12.A06
            r0 = 272(0x110, float:3.81E-43)
            java.lang.String r0 = r1.A0A(r0)
        L_0x01cc:
            r10.A04 = r0
            r10.A03 = r11
            X.4uZ r5 = r9.A0C
            boolean r1 = r9.A0Q
            java.lang.String r6 = r9.A0L
            X.2z0 r0 = new X.2z0
            r0.<init>(r5, r6, r1)
            r10.A02 = r0
            if (r16 == 0) goto L_0x02b8
            int r0 = r16.intValue()
            r10.A00 = r0
            org.json.JSONObject r5 = r3.A00
            if (r5 != 0) goto L_0x029e
            X.33l r0 = r3.A04
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payments_nagged_transactions"
            java.lang.String r0 = r1.getString(r0, r13)
            goto L_0x0291
        L_0x01f7:
            r1 = 1
            if (r0 != r1) goto L_0x0203
            X.33j r1 = r12.A06
            r0 = 298(0x12a, float:4.18E-43)
            java.lang.String r0 = r1.A0A(r0)
            goto L_0x01cc
        L_0x0203:
            r14 = 7
            if (r0 >= r14) goto L_0x0214
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r5)
            int r0 = r0.get(r14)
            switch(r0) {
                case 1: goto L_0x022c;
                case 2: goto L_0x0234;
                case 3: goto L_0x023c;
                case 4: goto L_0x0244;
                case 5: goto L_0x024c;
                case 6: goto L_0x0254;
                case 7: goto L_0x025c;
                default: goto L_0x0214;
            }
        L_0x0214:
            X.2oU r0 = r12.A05
            android.content.Context r15 = r0.A00
            r14 = 2131894473(0x7f1220c9, float:1.9423752E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.33j r0 = r12.A06
            java.text.DateFormat r0 = X.C107505bQ.A08(r0)
            java.lang.String r0 = X.C86624Kv.A0c(r0, r5)
            java.lang.String r0 = X.C86614Ku.A0s(r15, r0, r1, r14)
            goto L_0x01cc
        L_0x022c:
            X.2oU r0 = r12.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894477(0x7f1220cd, float:1.942376E38)
            goto L_0x0263
        L_0x0234:
            X.2oU r0 = r12.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894475(0x7f1220cb, float:1.9423756E38)
            goto L_0x0263
        L_0x023c:
            X.2oU r0 = r12.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894479(0x7f1220cf, float:1.9423764E38)
            goto L_0x0263
        L_0x0244:
            X.2oU r0 = r12.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894480(0x7f1220d0, float:1.9423766E38)
            goto L_0x0263
        L_0x024c:
            X.2oU r0 = r12.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894478(0x7f1220ce, float:1.9423762E38)
            goto L_0x0263
        L_0x0254:
            X.2oU r0 = r12.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894474(0x7f1220ca, float:1.9423754E38)
            goto L_0x0263
        L_0x025c:
            X.2oU r0 = r12.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894476(0x7f1220cc, float:1.9423758E38)
        L_0x0263:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x01cc
        L_0x0269:
            long r0 = X.C1899693i.A02(r0)
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            X.AnonymousClass000.A16(r14, r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r0 = android.text.TextUtils.join(r6, r0)
            goto L_0x01a4
        L_0x0281:
            java.math.BigDecimal r0 = r0.A00
            java.math.BigDecimal r0 = r0.scaleByPowerOfTen(r1)
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x018d
        L_0x0291:
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x0298 }
            r3.A00 = r5     // Catch:{ Exception -> 0x0298 }
            goto L_0x029e
        L_0x0298:
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1G()
            r3.A00 = r5
        L_0x029e:
            r0 = 1
            r5.put(r6, r0)     // Catch:{ Exception -> 0x02a3 }
            goto L_0x02a9
        L_0x02a3:
            r1 = move-exception
            java.lang.String r0 = "BrazilPaymentStatusNotificationHelper/setNaggedTransaction/error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02a9:
            X.33l r0 = r3.A04
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payments_nagged_transactions"
            X.C18270x1.A0j(r1, r0, r5)
        L_0x02b8:
            r8.add(r10)
            goto L_0x00d6
        L_0x02bd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: BrazilPaymentStatusNotificationHelper/buildPaymentReminders - transaction skipped: "
            r1.append(r0)
            java.lang.String r0 = r9.A0L
            X.C18260x0.A1L(r1, r0)
            goto L_0x00d6
        L_0x02cd:
            java.lang.String r6 = "EMPTY"
            goto L_0x00ec
        L_0x02d1:
            java.util.Iterator r3 = r8.iterator()
        L_0x02d5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r1 = r3.next()
            X.34x r1 = (X.C624134x) r1
            r0 = 16
            r2.A09(r1, r0)
            goto L_0x02d5
        L_0x02e7:
            X.2sH r1 = r0.A02     // Catch:{ all -> 0x043d }
            long r12 = r1.A0H()     // Catch:{ all -> 0x043d }
            monitor-enter(r0)     // Catch:{ all -> 0x043d }
            monitor-enter(r0)     // Catch:{ all -> 0x043a }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0437 }
            r1 = 8
            java.lang.String r6 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0437 }
            r1 = 0
            r3[r1] = r6     // Catch:{ all -> 0x0437 }
            r1 = 602(0x25a, float:8.44E-43)
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0437 }
            r1 = 1
            r3[r1] = r2     // Catch:{ all -> 0x0437 }
            java.lang.String r5 = "(type=? AND status=?)"
            android.util.Pair r4 = X.AnonymousClass0x9.A0C(r5, r3)     // Catch:{ all -> 0x0437 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0437 }
            r1 = 0
            r3[r1] = r6     // Catch:{ all -> 0x0437 }
            r1 = 608(0x260, float:8.52E-43)
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0437 }
            r1 = 1
            r3[r1] = r2     // Catch:{ all -> 0x0437 }
            android.util.Pair r2 = X.AnonymousClass0x9.A0C(r5, r3)     // Catch:{ all -> 0x0437 }
            java.lang.String r1 = "OR"
            android.util.Pair r3 = X.AnonymousClass36F.A02(r4, r2, r1)     // Catch:{ all -> 0x0437 }
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0437 }
            r1 = 0
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r2, r1)     // Catch:{ all -> 0x0437 }
            java.lang.Object r2 = r1.second     // Catch:{ all -> 0x0437 }
            java.lang.Object r1 = r1.first     // Catch:{ all -> 0x0437 }
            android.util.Pair r2 = X.AnonymousClass0x9.A0C(r2, r1)     // Catch:{ all -> 0x0437 }
            java.lang.String r1 = "AND"
            android.util.Pair r1 = X.AnonymousClass36F.A02(r3, r2, r1)     // Catch:{ all -> 0x0437 }
            java.lang.Object r3 = r1.first     // Catch:{ all -> 0x0437 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0437 }
            java.lang.Object r2 = r1.second     // Catch:{ all -> 0x0437 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0437 }
            java.lang.String r21 = ""
            java.lang.String r22 = "readPendingAndActiveWithdrawalsV2/QUERY_PAY_TRANSACTION"
            X.3dV r1 = r0.A04     // Catch:{ IllegalStateException -> 0x0397 }
            X.4GK r6 = r1.get()     // Catch:{ IllegalStateException -> 0x0397 }
            r1 = r6
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x038d }
            X.2sg r14 = r1.A03     // Catch:{ all -> 0x038d }
            java.lang.String r15 = "pay_transaction"
            java.lang.String[] r16 = X.AnonymousClass36F.A0A     // Catch:{ all -> 0x038d }
            r19 = 0
            java.lang.String r20 = "init_timestamp DESC"
            r17 = r3
            r18 = r2
            android.database.Cursor r5 = r14.A0F(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x038d }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2"
            java.util.List r3 = r0.A0O(r5, r1)     // Catch:{ all -> 0x0381 }
            X.7oG r4 = r0.A09     // Catch:{ all -> 0x0381 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0381 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2 returned: "
            X.AnonymousClass000.A1H(r1, r2, r3)     // Catch:{ all -> 0x0381 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0381 }
            r4.A07(r1)     // Catch:{ all -> 0x0381 }
            if (r5 == 0) goto L_0x037d
            r5.close()     // Catch:{ all -> 0x038d }
        L_0x037d:
            r6.close()     // Catch:{ IllegalStateException -> 0x0397 }
            goto L_0x03a3
        L_0x0381:
            r2 = move-exception
            if (r5 == 0) goto L_0x038c
            r5.close()     // Catch:{ all -> 0x0388 }
            goto L_0x038c
        L_0x0388:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x038d }
        L_0x038c:
            throw r2     // Catch:{ all -> 0x038d }
        L_0x038d:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0392 }
            goto L_0x0396
        L_0x0392:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IllegalStateException -> 0x0397 }
        L_0x0396:
            throw r2     // Catch:{ IllegalStateException -> 0x0397 }
        L_0x0397:
            r2 = move-exception
            X.7oG r4 = r0.A09     // Catch:{ all -> 0x0437 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2/IllegalStateException "
            r4.A0A(r1, r2)     // Catch:{ all -> 0x0437 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0437 }
        L_0x03a3:
            monitor-exit(r0)     // Catch:{ all -> 0x043a }
            monitor-exit(r0)     // Catch:{ all -> 0x043d }
            X.3dV r1 = r0.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0431 }
            X.4Fq r11 = r1.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0431 }
            X.3Yo r10 = r11.Axl()     // Catch:{ all -> 0x0427 }
            java.util.Iterator r9 = r3.iterator()     // Catch:{ all -> 0x041d }
        L_0x03b3:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x041d }
            if (r1 == 0) goto L_0x0413
            X.34w r6 = X.C1899693i.A0E(r9)     // Catch:{ all -> 0x041d }
            X.1S4 r1 = r6.A0A     // Catch:{ all -> 0x041d }
            if (r1 == 0) goto L_0x03cf
            long r7 = r1.A0B()     // Catch:{ all -> 0x041d }
            r2 = 0
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x03b3
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x03b3
        L_0x03cf:
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x041d }
            r15.<init>()     // Catch:{ all -> 0x041d }
            java.lang.String r2 = r6.A0L     // Catch:{ all -> 0x041d }
            java.lang.String r1 = r6.A0K     // Catch:{ all -> 0x041d }
            X.AnonymousClass36F.A03(r2, r1)     // Catch:{ all -> 0x041d }
            java.lang.String r2 = "status"
            r1 = 607(0x25f, float:8.5E-43)
            X.C18270x1.A0b(r15, r2, r1)     // Catch:{ all -> 0x041d }
            java.lang.String r5 = "timestamp"
            long r2 = X.C18290x4.A0B(r12)     // Catch:{ all -> 0x041d }
            int r1 = (int) r2     // Catch:{ all -> 0x041d }
            X.C18270x1.A0b(r15, r5, r1)     // Catch:{ all -> 0x041d }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x041d }
            java.lang.String r1 = "expireOldWithdrawals key id:"
            r2.append(r1)     // Catch:{ all -> 0x041d }
            java.lang.String r1 = r6.A0K     // Catch:{ all -> 0x041d }
            X.C1899593h.A1J(r4, r1, r2)     // Catch:{ all -> 0x041d }
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x041d }
            r2 = 0
            java.lang.String r1 = r6.A0K     // Catch:{ all -> 0x041d }
            r3[r2] = r1     // Catch:{ all -> 0x041d }
            r1 = r11
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x041d }
            X.2sg r14 = r1.A03     // Catch:{ all -> 0x041d }
            java.lang.String r16 = "pay_transaction"
            java.lang.String r17 = "id=?"
            java.lang.String r18 = "expireOldWithdrawalsV2/UPDATE_PAY_TRANSACTION"
            r19 = r3
            r14.A05(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x041d }
            goto L_0x03b3
        L_0x0413:
            r10.A00()     // Catch:{ all -> 0x041d }
            r10.close()     // Catch:{ all -> 0x0427 }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0431 }
            goto L_0x0440
        L_0x041d:
            r2 = move-exception
            r10.close()     // Catch:{ all -> 0x0422 }
            goto L_0x0426
        L_0x0422:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0427 }
        L_0x0426:
            throw r2     // Catch:{ all -> 0x0427 }
        L_0x0427:
            r2 = move-exception
            r11.close()     // Catch:{ all -> 0x042c }
            goto L_0x0430
        L_0x042c:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0431 }
        L_0x0430:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x0431 }
        L_0x0431:
            java.lang.String r1 = "expireOldWithdrawals failed."
            r4.A05(r1)     // Catch:{ all -> 0x043d }
            goto L_0x0440
        L_0x0437:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x043a }
            throw r1     // Catch:{ all -> 0x043a }
        L_0x043a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x043d }
            throw r1     // Catch:{ all -> 0x043d }
        L_0x043d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0440:
            monitor-exit(r0)
        L_0x0441:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196439aq.BUN():void");
    }

    public C196439aq(C56972sr r4, C64773Ex r5, AnonymousClass5ZU r6, C56612sH r7, C54292oU r8, C66533Lu r9, C50012hU r10, C56152rV r11, C72303dV r12, C1906899l r13, C1907099n r14, AnonymousClass9U4 r15, C195219Wq r16, AnonymousClass35J r17, C183538qC r18) {
        this.A04 = r8;
        this.A03 = r7;
        this.A00 = r4;
        this.A0D = r16;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = r10;
        this.A0B = r15;
        this.A05 = r9;
        this.A07 = r11;
        this.A0E = r17;
        this.A08 = r12;
        this.A09 = r13;
        this.A0A = r14;
        this.A0F = r18;
    }
}
