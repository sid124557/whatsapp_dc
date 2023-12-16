package X;

import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.33b  reason: invalid class name and case insensitive filesystem */
public class C619933b {
    public long A00 = (System.currentTimeMillis() - 200);
    public Handler A01;
    public C71523cF A02;
    public boolean A03;
    public final C55682qk A04;
    public final AnonymousClass2VQ A05;
    public final AnonymousClass2VR A06;
    public final C59072wI A07;
    public final C56972sr A08;
    public final C66663Mh A09;
    public final C614930z A0A;
    public final C64773Ex A0B;
    public final AnonymousClass5ZU A0C;
    public final C620633i A0D;
    public final C56612sH A0E;
    public final C54292oU A0F;
    public final AnonymousClass33T A0G;
    public final AnonymousClass33p A0H;
    public final C620733j A0I;
    public final C56982ss A0J;
    public final C623334p A0K;
    public final C56152rV A0L;
    public final C53612nN A0M;
    public final C620333f A0N;
    public final C48042eF A0O;
    public final AnonymousClass1VX A0P;
    public final AnonymousClass2HQ A0Q = new AnonymousClass2HQ(this);
    public final C66553Lw A0R;
    public final AnonymousClass2HR A0S;
    public final C50332i0 A0T;
    public final AnonymousClass3Cj A0U;
    public final AnonymousClass1R1 A0V;
    public final C59962xm A0W;
    public final C55832qz A0X;
    public final AnonymousClass4FS A0Y;
    public final Map A0Z = AnonymousClass001.A0t();
    public volatile long A0a;

    public synchronized Handler A03() {
        Handler handler;
        handler = this.A01;
        if (handler == null) {
            handler = C18290x4.A0I("Notifications");
            this.A01 = handler;
        }
        return handler;
    }

    public void A07() {
        A0B((C624134x) null, true, true, false, false, false, false);
    }

    public void A0A(C624134x r9, boolean z, boolean z2) {
        A0B(r9, z, this.A03, false, false, false, z2);
    }

    public static final String A00(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass2z0.A0A(((C56682sO) it.next()).A00.A1J, A0o);
            A0o.append(' ');
        }
        return A0o.toString();
    }

    public C56682sO A04(C624134x r15) {
        AnonymousClass1VX r10 = this.A0P;
        C55682qk r1 = this.A04;
        C56972sr r2 = this.A08;
        C54292oU r7 = this.A0F;
        C66663Mh r3 = this.A09;
        C59962xm r13 = this.A0W;
        C64773Ex r4 = this.A0B;
        C620633i r6 = this.A0D;
        return new C56682sO(r1, r2, r3, r4, this.A0C, r6, r7, this.A0I, this.A0O, r10, this.A0R, r15, r13);
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        X.AnonymousClass2A8.A00(r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f4, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f7, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017e A[Catch:{ all -> 0x01ec }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A05(X.C95814uZ r23, int r24) {
        /*
            r22 = this;
            r9 = r22
            X.2ss r0 = r9.A0J
            r4 = r23
            int r2 = r0.A03(r4)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r0 = r24
            if (r2 <= r0) goto L_0x0020
            X.2rV r1 = r9.A0L
            r0 = 7
            int r0 = java.lang.Math.min(r2, r0)
            java.util.ArrayList r0 = r1.A03(r4, r0)
            r5.addAll(r0)
        L_0x0020:
            r2 = 0
            r3 = 0
        L_0x0022:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0037
            java.lang.Object r0 = r5.get(r3)
            X.34x r0 = (X.C624134x) r0
            int r1 = r0.A0D
            r0 = 13
            if (r1 > r0) goto L_0x0037
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0037:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0041
            java.util.List r5 = r5.subList(r2, r3)
        L_0x0041:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r5.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005b
            X.34x r0 = X.C18300x5.A0T(r1)
            X.2sO r0 = r9.A04(r0)
            r8.add(r0)
            goto L_0x0049
        L_0x005b:
            java.util.List r1 = java.util.Collections.emptyList()
            X.1R1 r0 = r9.A0V
            X.2sa r0 = X.AnonymousClass1R1.A00(r4, r0)
            X.2sa r0 = r0.A02()
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x0075
            X.33f r1 = r9.A0N
            r0 = 56
            java.util.List r1 = r1.A0A(r4, r0)
        L_0x0075:
            java.util.Iterator r1 = r1.iterator()
        L_0x0079:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            A01(r9, r8, r1)
            goto L_0x0079
        L_0x0083:
            X.33f r5 = r9.A0N
            java.util.List r0 = r5.A09(r4)
            java.util.Iterator r3 = r0.iterator()
        L_0x008d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r3.next()
            X.2Ow r1 = (X.C42622Ow) r1
            X.2VR r0 = r9.A06
            X.1hK r0 = r0.A00(r1)
            r8.add(r0)
            goto L_0x008d
        L_0x00a3:
            X.1VX r3 = r9.A0P
            r1 = 3158(0xc56, float:4.425E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 67
            java.util.List r0 = r5.A0A(r4, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c3
            A01(r9, r8, r1)
            goto L_0x00b9
        L_0x00c3:
            r0 = 93
            java.util.List r0 = r5.A0A(r4, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00cd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d7
            A01(r9, r8, r1)
            goto L_0x00cd
        L_0x00d7:
            X.2nN r7 = r9.A0M
            r12 = 10
            r11 = 0
            X.C162457s7.A0J(r4, r2)
            X.2sm r0 = r7.A00
            long r2 = r0.A07(r4)
            X.2ss r0 = r7.A01
            long r0 = r0.A08(r4)
            X.3dV r4 = r7.A05
            X.4GK r6 = r4.get()
            r4 = r6
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x01f1 }
            X.2sg r10 = r4.A03     // Catch:{ all -> 0x01f1 }
            java.lang.String r5 = "\n          SELECT \n            message_row_id,\n            last_comment_ts,\n            last_comment_message_row_id\n          FROM message_comment_parent JOIN available_message_view \n          WHERE \n            message_row_id = _id\n            AND message_comment_parent.chat_row_id = ? \n            AND last_comment_message_row_id > ?\n            AND from_me = 1\n          ORDER BY last_comment_message_row_id\n          LIMIT ?\n        "
            java.lang.String[] r4 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x01f1 }
            X.AnonymousClass0x2.A1S(r4, r11, r2)     // Catch:{ all -> 0x01f1 }
            X.C18270x1.A1R(r4, r0)     // Catch:{ all -> 0x01f1 }
            X.C18280x3.A1O(r4, r12)     // Catch:{ all -> 0x01f1 }
            java.lang.String r0 = "SELECT_PARENT_MESSAGES_FOR_COMMENTS_NOTIFICATION"
            android.database.Cursor r13 = r10.A0E(r5, r0, r4)     // Catch:{ all -> 0x01f1 }
            java.lang.String r0 = "message_row_id"
            int r12 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = "last_comment_ts"
            int r11 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01ea }
            java.lang.String r0 = "last_comment_message_row_id"
            int r10 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01ea }
            boolean r0 = r13.moveToFirst()     // Catch:{ all -> 0x01ea }
            r5 = 0
            if (r0 == 0) goto L_0x0188
            java.util.ArrayList r4 = X.AnonymousClass000.A0o(r13)     // Catch:{ all -> 0x01ea }
        L_0x0129:
            long r2 = r13.getLong(r12)     // Catch:{ all -> 0x01ea }
            boolean r0 = r13.isNull(r11)     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x0135
            r14 = r5
            goto L_0x0139
        L_0x0135:
            java.lang.Long r14 = X.C18280x3.A0T(r13, r11)     // Catch:{ all -> 0x01ea }
        L_0x0139:
            boolean r0 = r13.isNull(r10)     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x0140
            goto L_0x0145
        L_0x0140:
            java.lang.Long r1 = X.C18280x3.A0T(r13, r10)     // Catch:{ all -> 0x01ea }
            goto L_0x0146
        L_0x0145:
            r1 = r5
        L_0x0146:
            if (r1 == 0) goto L_0x017b
            if (r14 == 0) goto L_0x017b
            X.2qz r0 = r7.A06     // Catch:{ all -> 0x01ea }
            X.2pp r15 = r0.A02     // Catch:{ all -> 0x01ea }
            X.34x r14 = r15.A01(r2)     // Catch:{ all -> 0x01ea }
            long r0 = r1.longValue()     // Catch:{ all -> 0x01ea }
            X.34x r1 = r15.A01(r0)     // Catch:{ all -> 0x01ea }
            if (r14 == 0) goto L_0x017b
            if (r1 == 0) goto L_0x017b
            boolean r0 = r1 instanceof X.C30441mS     // Catch:{ all -> 0x01ea }
            if (r0 != 0) goto L_0x017b
            X.2z0 r0 = r14.A1J     // Catch:{ all -> 0x01ea }
            r16 = r0
            X.C162457s7.A0C(r16)     // Catch:{ all -> 0x01ea }
            long r14 = r14.A1M     // Catch:{ all -> 0x01ea }
            java.util.LinkedHashSet r17 = X.AnonymousClass0x9.A17()     // Catch:{ all -> 0x01ea }
            X.2n4 r0 = new X.2n4     // Catch:{ all -> 0x01ea }
            r18 = r2
            r20 = r14
            r15 = r1
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x01ea }
            goto L_0x017c
        L_0x017b:
            r0 = r5
        L_0x017c:
            if (r0 == 0) goto L_0x0181
            r4.add(r0)     // Catch:{ all -> 0x01ea }
        L_0x0181:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x01ea }
            if (r0 != 0) goto L_0x0129
            goto L_0x018a
        L_0x0188:
            X.3d3 r4 = X.C72023d3.A00     // Catch:{ all -> 0x01ea }
        L_0x018a:
            r13.close()     // Catch:{ all -> 0x01f1 }
            r6.close()
            java.util.LinkedHashSet r7 = X.AnonymousClass0x9.A17()
            java.util.Iterator r11 = r4.iterator()
            r10 = r5
        L_0x0199:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r6 = r11.next()
            X.2n4 r6 = (X.C53422n4) r6
            java.util.Set r0 = r6.A05
            r7.addAll(r0)
            if (r10 == 0) goto L_0x01b8
            X.34x r0 = r10.A03
            long r2 = r0.A1L
            X.34x r0 = r6.A03
            long r0 = r0.A1L
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0199
        L_0x01b8:
            r10 = r6
            goto L_0x0199
        L_0x01ba:
            if (r10 == 0) goto L_0x01d5
            java.util.Set r0 = r10.A05
            r0.addAll(r7)
            long r3 = r10.A02
            X.2z0 r6 = r10.A04
            long r1 = r10.A00
            X.34x r0 = r10.A03
            X.2n4 r5 = new X.2n4
            r10 = r5
            r11 = r0
            r12 = r6
            r13 = r7
            r14 = r3
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r16)
        L_0x01d5:
            if (r5 == 0) goto L_0x01e0
            X.2VQ r0 = r9.A05
            X.1hM r0 = r0.A00(r5)
            r8.add(r0)
        L_0x01e0:
            r1 = 1
            X.3cn r0 = new X.3cn
            r0.<init>(r1)
            java.util.Collections.sort(r8, r0)
            return r8
        L_0x01ea:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ec }
        L_0x01ec:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r13, r1)     // Catch:{ all -> 0x01f1 }
            throw r0     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01f3 }
        L_0x01f3:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619933b.A05(X.4uZ, int):java.util.List");
    }

    public void A06() {
        AnonymousClass3Cj r1 = this.A0U;
        synchronized (r1) {
            r1.A01 = null;
            r1.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r1 == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (X.C56612sH.A03(r4.A08, r1.longValue()) < java.util.concurrent.TimeUnit.SECONDS.toMillis(5)) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010a, code lost:
        if (X.AnonymousClass2z0.A0C(r13) == false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C624134x r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r20 = this;
            r13 = r21
            if (r21 == 0) goto L_0x000b
            boolean r0 = X.AnonymousClass2z0.A0B(r13)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            r0 = r20
            r3 = r22
            r9 = r23
            r10 = r24
            if (r22 != 0) goto L_0x005c
            if (r21 == 0) goto L_0x003a
            X.3Cj r5 = r0.A0U
            X.2HQ r2 = r0.A0Q
            monitor-enter(r5)
            boolean r1 = r5.A03     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0031
            X.2z0 r6 = r13.A1J     // Catch:{ all -> 0x0034 }
            X.2sH r1 = r5.A05     // Catch:{ all -> 0x0034 }
            long r7 = r1.A0H()     // Catch:{ all -> 0x0034 }
            X.2RX r4 = new X.2RX     // Catch:{ all -> 0x0034 }
            r4.<init>(r5, r6, r7, r9, r10)     // Catch:{ all -> 0x0034 }
            r5.A01 = r4     // Catch:{ all -> 0x0034 }
            r5.A00 = r2     // Catch:{ all -> 0x0034 }
        L_0x0031:
            boolean r1 = r5.A03     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0037:
            monitor-exit(r5)
            if (r1 != 0) goto L_0x005c
        L_0x003a:
            X.30z r4 = r0.A0A
            boolean r1 = r4.A07()
            if (r1 == 0) goto L_0x0118
            java.lang.Long r1 = r4.A02
            if (r1 == 0) goto L_0x0118
            long r1 = r1.longValue()
            X.2sH r4 = r4.A08
            long r6 = X.C56612sH.A03(r4, r1)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 5
            long r4 = r4.toMillis(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0118
        L_0x005c:
            r15 = 1
        L_0x005d:
            if (r21 == 0) goto L_0x0081
            X.2i0 r1 = r0.A0T
            X.30o r4 = r1.A06
            boolean r2 = r4.A06(r13)
            if (r2 == 0) goto L_0x0081
            X.2w3 r2 = X.C614030o.A00(r13)
            if (r2 == 0) goto L_0x011b
            boolean r2 = r4.A09(r2)
            if (r2 == 0) goto L_0x011b
            X.1VX r5 = r1.A04
            r4 = 4980(0x1374, float:6.978E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r5.A0Y(r2, r4)
            if (r2 == 0) goto L_0x011b
        L_0x0081:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "messagenotification/refreshstatusbar newmsg="
            r2.append(r1)
            if (r21 != 0) goto L_0x0112
            java.lang.String r1 = "null"
        L_0x0090:
            r2.append(r1)
            java.lang.String r1 = " quiet="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = " noPopup="
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = " isAndroidWearRefresh="
            X.C18260x0.A1D(r1, r2, r10)
            if (r21 != 0) goto L_0x0101
            if (r26 == 0) goto L_0x0101
            r12 = 0
            r14 = 0
            r19 = 1
            X.2wI r11 = r0.A07
        L_0x00b2:
            r18 = r27
            r16 = r9
            r17 = r10
            X.3cF r3 = r11.A01(r12, r13, r14, r15, r16, r17, r18, r19)
            X.3cF r1 = r0.A02
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00cf
            android.os.Handler r2 = r0.A03()
            X.3cF r1 = r0.A02
            r2.removeCallbacks(r1)
        L_0x00cf:
            r0.A02 = r3
            if (r25 == 0) goto L_0x00f7
            long r5 = android.os.SystemClock.uptimeMillis()
            long r1 = r0.A0a
            long r5 = r5 - r1
            r3 = 4000(0xfa0, double:1.9763E-320)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f7
            java.lang.String r1 = "messagenotification/posting delayed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.Handler r2 = r0.A03()
            X.3cF r1 = r0.A02
            long r3 = r3 - r5
            r2.postDelayed(r1, r3)
        L_0x00f0:
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.A0a = r1
            return
        L_0x00f7:
            android.os.Handler r2 = r0.A03()
            X.3cF r1 = r0.A02
            r2.post(r1)
            goto L_0x00f0
        L_0x0101:
            r12 = 0
            if (r21 == 0) goto L_0x010c
            boolean r1 = X.AnonymousClass2z0.A0C(r13)
            r19 = 1
            if (r1 != 0) goto L_0x010e
        L_0x010c:
            r19 = 0
        L_0x010e:
            X.2wI r11 = r0.A07
            r14 = 0
            goto L_0x00b2
        L_0x0112:
            java.lang.String r1 = X.C627636p.A0E(r13)
            goto L_0x0090
        L_0x0118:
            r15 = 0
            goto L_0x005d
        L_0x011b:
            r8 = 0
            X.2oU r0 = r1.A02
            android.content.Context r7 = r0.A00
            X.C162457s7.A0D(r7)
            X.4uZ r5 = X.AnonymousClass2z0.A00(r13)
            X.3Ex r4 = r1.A00
            X.3ZH r6 = r4.A0A(r5)
            android.net.Uri r0 = X.AnonymousClass326.A00(r6)
            r3 = 2
            android.content.Intent r2 = X.C627736r.A0H(r7, r0, r3)
            java.lang.String r0 = "fromNotification"
            r12 = 1
            android.content.Intent r0 = r2.putExtra(r0, r12)
            X.C162457s7.A0D(r0)
            android.app.PendingIntent r11 = X.C624735e.A00(r7, r3, r0, r8)
            X.8qC r0 = r1.A08
            java.lang.Object r2 = r0.get()
            X.3Lw r2 = (X.C66553Lw) r2
            java.lang.String r10 = r2.A0J(r6, r13)
            java.lang.CharSequence r9 = r2.A0F(r7, r13)
            X.33i r0 = r1.A01
            X.5UR r0 = r0.A0R()
            r3 = 0
            if (r0 == 0) goto L_0x0167
            android.net.Uri r0 = r4.A03(r6, r0)
            if (r0 == 0) goto L_0x0167
            java.lang.String r3 = r0.toString()
        L_0x0167:
            android.graphics.Bitmap r0 = r2.A0D(r6)
            if (r0 == 0) goto L_0x01d3
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.A03(r0)
        L_0x0171:
            X.0Ma r0 = new X.0Ma
            r0.<init>()
            r0.A01 = r10
            r0.A00 = r2
            r0.A03 = r3
            X.0Of r8 = new X.0Of
            r8.<init>(r0)
            r0 = 0
            X.0Ue r4 = new X.0Ue
            r4.<init>(r7, r0)
            r0 = 2131102223(0x7f060a0f, float:1.7816878E38)
            int r0 = X.AnonymousClass0Y8.A04(r7, r0)
            r4.A00 = r0
            java.lang.String r0 = "otp_notification_group"
            r4.A0L = r0
            long r2 = r13.A0K
            r4.A05(r2)
            r0 = 3
            r4.A02(r0)
            r4.A03 = r12
            r4.A0B(r10)
            r4.A0A(r9)
            r4.A09 = r11
            java.util.ArrayList r0 = r4.A0R
            r0.add(r8)
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r4, r0)
            X.8qC r0 = r1.A07
            java.lang.Object r0 = r0.get()
            X.3Lb r0 = (X.C66363Lb) r0
            X.C162457s7.A0H(r5)
            java.lang.String r0 = r0.A00(r5, r15)
            if (r0 == 0) goto L_0x01c6
            r4.A0K = r0
        L_0x01c6:
            r1.A01(r7, r4, r6, r13)
            X.33T r1 = r1.A03
            android.app.Notification r0 = r4.A01()
            r1.A07(r0, r5)
            return
        L_0x01d3:
            r2 = 0
            goto L_0x0171
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619933b.A0B(X.34x, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0C(AnonymousClass2z0 r11, boolean z, boolean z2) {
        if (r11 != null) {
            C624134x A052 = this.A0X.A05(r11);
            if (A052 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("messagenotification/refreshStatusBarNotificationIfMessageExists ");
                A0o.append(C627636p.A0E(A052));
                A0o.append(' ');
                A0o.append(z);
                A0o.append(' ');
                C18260x0.A1U(A0o, z2);
                A0B(A052, false, z, z2, false, false, true);
                return;
            }
            Log.i("messagenotification/refreshStatusBarNotificationIfMessageExists/no-message");
            return;
        }
        Log.e("messagenotification/refreshStatusBarNotificationIfMessageExists/no-messag-key");
    }

    public C619933b(C55682qk r5, AnonymousClass2VQ r6, AnonymousClass2VR r7, C59072wI r8, C56972sr r9, C66663Mh r10, C614930z r11, C64773Ex r12, AnonymousClass5ZU r13, C620633i r14, C56612sH r15, C54292oU r16, AnonymousClass33T r17, AnonymousClass33p r18, C620733j r19, C56982ss r20, C623334p r21, C56152rV r22, C53612nN r23, C620333f r24, C48042eF r25, AnonymousClass1VX r26, C66553Lw r27, AnonymousClass2HR r28, C50332i0 r29, AnonymousClass3Cj r30, AnonymousClass1R1 r31, C59962xm r32, C55832qz r33, AnonymousClass4FS r34) {
        this.A0F = r16;
        this.A0E = r15;
        this.A0P = r26;
        this.A0K = r21;
        this.A04 = r5;
        this.A08 = r9;
        this.A0Y = r34;
        this.A0J = r20;
        this.A09 = r10;
        this.A0W = r32;
        this.A0B = r12;
        this.A0D = r14;
        this.A0C = r13;
        this.A0I = r19;
        this.A0A = r11;
        this.A0X = r33;
        this.A0L = r22;
        this.A0V = r31;
        this.A0R = r27;
        this.A0U = r30;
        C620333f r1 = r24;
        this.A0N = r1;
        this.A0O = r25;
        this.A0H = r18;
        this.A0S = r28;
        this.A0G = r17;
        this.A0T = r29;
        this.A0M = r23;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        r1.A0a = new AnonymousClass2HP(this);
    }

    public static void A01(C619933b r14, AbstractCollection abstractCollection, Iterator it) {
        AnonymousClass1VX r10 = r14.A0P;
        C54292oU r7 = r14.A0F;
        C55682qk r1 = r14.A04;
        C56972sr r2 = r14.A08;
        C66663Mh r3 = r14.A09;
        C59962xm r13 = r14.A0W;
        C64773Ex r4 = r14.A0B;
        C620633i r6 = r14.A0D;
        AnonymousClass5ZU r5 = r14.A0C;
        C620733j r8 = r14.A0I;
        C66553Lw r11 = r14.A0R;
        abstractCollection.add(new AnonymousClass1hL(r1, r2, r3, r4, r5, r6, r7, r8, r14.A0O, r10, r11, (AnonymousClass2QS) it.next(), r13));
    }

    public static final boolean A02(C624134x r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C56682sO r2 = (C56682sO) it.next();
            if (r2.A00.A1J.equals(r4.A1J) && r2.A00.A1I == r4.A1I) {
                return true;
            }
        }
        return false;
    }

    public void A08(C95814uZ r4) {
        A03().post(new C70123Zz(this, 29, r4));
        A06();
    }

    public void A09(C95814uZ r4, C624134x r5) {
        A03().post(new C70353aM(this, r5, r4, 27));
    }

    public void A0D(boolean z) {
        A03().post(new C71703cX(this, 48, z));
        A06();
    }
}
