package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ti  reason: invalid class name and case insensitive filesystem */
public class C194539Ti {
    public final C54292oU A00;
    public final AnonymousClass33T A01;
    public final C620733j A02;
    public final C72303dV A03;
    public final AnonymousClass36F A04;
    public final C56082rO A05;
    public final C1907099n A06;
    public final AnonymousClass9U4 A07;
    public final C160757oG A08 = C160757oG.A00("MessagelessPaymentNotification", "notification", "COMMON");
    public final C195219Wq A09;
    public final AnonymousClass1R1 A0A;
    public final AnonymousClass4FS A0B;

    public final synchronized void A03(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A08.A05("removeUnreadMessagelessPaymentTransaction empty transaction id");
        } else {
            C56082rO r6 = this.A05;
            String A012 = r6.A01("unread_messageless_transaction_ids");
            if (A012 == null) {
                A012 = "";
            }
            HashSet A0h = C18280x3.A0h(TextUtils.split(A012, ";"));
            if (A0h.remove(str)) {
                C160757oG r2 = this.A08;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("removeUnreadMessagelessPaymentTransaction/removed id:");
                C1899593h.A1J(r2, str, A0o);
            }
            r6.A05("unread_messageless_transaction_ids", TextUtils.join(";", A0h));
        }
    }

    public synchronized void A04(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A03(AnonymousClass001.A0m(it));
        }
        if (TextUtils.isEmpty(this.A05.A01("unread_messageless_transaction_ids"))) {
            this.A01.A05(17, "MessagelessPaymentNotification4");
        }
    }

    public void A00() {
        C56082rO r2 = this.A05;
        if (!TextUtils.isEmpty(r2.A01("unread_messageless_transaction_ids"))) {
            r2.A05("unread_messageless_transaction_ids", "");
            this.A01.A05(17, "MessagelessPaymentNotification3");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r17 = this;
            r5 = r17
            X.99n r0 = r5.A06
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x001a
            X.3dV r0 = r5.A03
            r0.A05()
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x001b
            X.7oG r1 = r5.A08
            java.lang.String r0 = "message store not yet ready"
            r1.A06(r0)
        L_0x001a:
            return
        L_0x001b:
            monitor-enter(r5)
            X.2rO r1 = r5.A05     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "unread_messageless_transaction_ids"
            java.lang.String r2 = r1.A01(r0)     // Catch:{ all -> 0x0218 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x003b
            X.36F r1 = r5.A04     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = ";"
            java.lang.String[] r0 = r2.split(r0)     // Catch:{ all -> 0x0218 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0218 }
            java.util.List r7 = r1.A0T(r0)     // Catch:{ all -> 0x0218 }
            goto L_0x003f
        L_0x003b:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0218 }
        L_0x003f:
            monitor-exit(r5)
            X.2oU r0 = r5.A00
            android.content.Context r6 = r0.A00
            boolean r0 = r7.isEmpty()
            r4 = 17
            if (r0 == 0) goto L_0x005b
            X.33T r1 = r5.A01
            java.lang.String r0 = "MessagelessPaymentNotification1"
            r1.A05(r4, r0)
            X.7oG r1 = r5.A08
            java.lang.String r0 = "no unread payment notifications"
            r1.A04(r0)
            return
        L_0x005b:
            X.0Ue r2 = X.C66553Lw.A01(r6)
            java.lang.String r11 = "status"
            r2.A0J = r11
            r8 = 1
            r2.A03 = r8
            r2.A0E(r8)
            r0 = 4
            r2.A02(r0)
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r2, r0)
            int r0 = r7.size()
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r9 = 335544320(0x14000000, float:6.4623485E-27)
            r3 = 0
            if (r0 != r8) goto L_0x0190
            java.lang.Object r12 = r7.get(r3)
            X.34w r12 = (X.C624034w) r12
            X.1S4 r0 = r12.A0A
            if (r0 == 0) goto L_0x016d
            X.39O r13 = r0.A00
            if (r13 == 0) goto L_0x016d
            int r1 = r12.A03
            r0 = 9
            if (r1 != r0) goto L_0x016d
            X.36F r1 = r5.A04
            java.lang.String r0 = r13.A03
            X.34w r15 = r1.A0G(r0)
            X.9U4 r0 = r5.A07
            r16 = r0
            X.9Tz r1 = X.AnonymousClass9U4.A05(r16)
            if (r1 == 0) goto L_0x016d
            if (r15 == 0) goto L_0x016d
            X.9Wq r0 = r5.A09
            java.lang.String r14 = r0.A0Q(r12)
            X.5ZU r13 = r1.A04
            X.3Ex r0 = r1.A03
            com.whatsapp.jid.UserJid r15 = r15.A0D
            X.3ZH r0 = r0.A0A(r15)
            java.lang.String r15 = r13.A0H(r0)
            android.content.res.Resources r13 = r6.getResources()
            boolean r0 = r1 instanceof X.C1907499r
            if (r0 == 0) goto L_0x0168
            r1 = 2131890143(0x7f120fdf, float:1.941497E38)
        L_0x00c5:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r0 = X.C18320x8.A0b(r13, r15, r0, r3, r1)
            X.2LY r13 = new X.2LY
            r13.<init>(r14, r0)
        L_0x00d0:
            java.lang.CharSequence r1 = r13.A00
            if (r1 == 0) goto L_0x020b
            java.lang.String r0 = r13.A01
            r2.A0B(r0)
            r2.A0C(r1)
            r2.A0A(r1)
            X.C18270x1.A0r(r2, r1)
            X.9oC r0 = r16.A0G()
            java.lang.Class r0 = r0.BBC()
            android.content.Intent r13 = X.AnonymousClass0x9.A08(r6, r0)
            java.lang.String r1 = r12.A0K
            java.lang.String r0 = "extra_transaction_id"
            android.content.Intent r1 = r13.putExtra(r0, r1)
            X.2z0 r0 = X.C1899593h.A0R(r12)
            X.C107395bF.A00(r1, r0)
            r1.addFlags(r9)
            android.app.PendingIntent r0 = X.C624735e.A00(r6, r3, r1, r10)
        L_0x0104:
            r2.A09 = r0
            X.0Ue r10 = X.C66553Lw.A01(r6)
            r10.A0J = r11
            r10.A03 = r8
            r0 = 2131891688(0x7f1215e8, float:1.9418103E38)
            java.lang.String r0 = r6.getString(r0)
            r10.A0B(r0)
            X.33j r11 = r5.A02
            r9 = 2131755233(0x7f1000e1, float:1.914134E38)
            int r0 = r7.size()
            long r0 = (long) r0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r7 = r7.size()
            X.AnonymousClass000.A1P(r8, r7, r3)
            java.lang.String r0 = r11.A0L(r8, r9, r0)
            r10.A0A(r0)
            android.app.Notification r0 = r10.A01()
            r10.A08 = r0
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r10, r0)
            java.lang.Class<X.93m> r0 = X.C1900093m.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r6, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C624735e.A01(r6, r4, r1, r0)
            android.app.Notification r0 = r2.A07
            r0.deleteIntent = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0162
            X.1R1 r0 = r5.A0A
            X.2sa r0 = r0.A0I()
            X.1qy r0 = (X.C32501qy) r0
            java.lang.String r0 = r0.A0C()
            r2.A0K = r0
        L_0x0162:
            android.app.Notification r2 = r2.A01()
            goto L_0x01ea
        L_0x0168:
            r1 = 2131890142(0x7f120fde, float:1.9414967E38)
            goto L_0x00c5
        L_0x016d:
            X.9U4 r0 = r5.A07
            r16 = r0
            X.9oC r0 = r16.A0G()
            X.9SM r13 = r0.B6f()
            if (r13 == 0) goto L_0x020b
            java.lang.String r1 = r13.A01(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = r13.A00(r12)
            X.2LY r13 = new X.2LY
            r13.<init>(r0, r1)
            goto L_0x00d0
        L_0x0190:
            r0 = 2131891688(0x7f1215e8, float:1.9418103E38)
            java.lang.String r0 = r6.getString(r0)
            r2.A0B(r0)
            X.33j r15 = r5.A02
            r14 = 2131755233(0x7f1000e1, float:1.914134E38)
            int r0 = r7.size()
            long r0 = (long) r0
            java.lang.Object[] r13 = new java.lang.Object[r8]
            int r12 = r7.size()
            X.AnonymousClass000.A1P(r13, r12, r3)
            java.lang.String r0 = r15.A0L(r13, r14, r0)
            r2.A0A(r0)
            java.util.Iterator r1 = r7.iterator()
        L_0x01b8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01df
            X.34w r0 = X.C1899693i.A0E(r1)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x01b8
            X.9U4 r0 = r5.A07
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BBA()
        L_0x01d2:
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r6, r0)
            r0.addFlags(r9)
            android.app.PendingIntent r0 = X.C624735e.A00(r6, r3, r0, r10)
            goto L_0x0104
        L_0x01df:
            X.9U4 r0 = r5.A07
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BAt()
            goto L_0x01d2
        L_0x01ea:
            X.7oG r1 = r5.A08     // Catch:{ SecurityException -> 0x01f7 }
            java.lang.String r0 = "NotificationManager/notify"
            r1.A06(r0)     // Catch:{ SecurityException -> 0x01f7 }
            X.33T r0 = r5.A01     // Catch:{ SecurityException -> 0x01f7 }
            r0.A04(r4, r2)     // Catch:{ SecurityException -> 0x01f7 }
            goto L_0x020a
        L_0x01f7:
            r2 = move-exception
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C626936e.A0D(r3, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x001a
            throw r2
        L_0x020a:
            return
        L_0x020b:
            X.7oG r1 = r5.A08
            java.lang.String r0 = "no available payment notification text"
            r1.A06(r0)
            java.lang.String r0 = r12.A0K
            r5.A03(r0)
            return
        L_0x0218:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194539Ti.A01():void");
    }

    public void A02(C624034w r3) {
        this.A0B.BkM(new C199939hW(r3, this));
    }

    public C194539Ti(C54292oU r4, AnonymousClass33T r5, C620733j r6, C72303dV r7, AnonymousClass36F r8, C56082rO r9, C1907099n r10, AnonymousClass9U4 r11, C195219Wq r12, AnonymousClass1R1 r13, AnonymousClass4FS r14) {
        this.A00 = r4;
        this.A0B = r14;
        this.A09 = r12;
        this.A02 = r6;
        this.A07 = r11;
        this.A0A = r13;
        this.A05 = r9;
        this.A03 = r7;
        this.A06 = r10;
        this.A01 = r5;
        this.A04 = r8;
    }
}
