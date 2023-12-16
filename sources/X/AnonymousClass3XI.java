package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallState;
import java.util.List;
import java.util.Objects;

/* renamed from: X.3XI  reason: invalid class name */
public class AnonymousClass3XI implements C185958uW {
    public List A00;
    public final C69263Wi A01;
    public final C50422i9 A02;
    public final C56962sq A03;
    public final AnonymousClass5TW A04;
    public final C64773Ex A05;
    public final AnonymousClass5ZU A06;
    public final C114015mM A07;
    public final C620633i A08;
    public final C54292oU A09;
    public final AnonymousClass33T A0A;
    public final AnonymousClass33p A0B;
    public final C620733j A0C;
    public final C56762sW A0D;
    public final C28891hw A0E;
    public final C72303dV A0F;
    public final AnonymousClass2WH A0G;
    public final AnonymousClass1VX A0H;
    public final C66493Lq A0I;
    public final AnonymousClass1R1 A0J;
    public final C56572sD A0K;
    public final C60312yL A0L;
    public final AnonymousClass4FS A0M;

    public void A03() {
        C18260x0.A1E("missedcallnotification/clearNotification updateHash=", AnonymousClass001.A0o(), true);
        this.A0A.A05(4, "MissedCallNotification1");
        AnonymousClass33p r3 = this.A0B;
        C18270x1.A0j(C18270x1.A03(r3), "dismissed_call_notification_hash", C18280x3.A0Z(AnonymousClass0x2.A0F(r3), "last_call_notification_hash"));
    }

    public void BO8(AnonymousClass3ZF r6, boolean z) {
        A04();
        if (this.A00.isEmpty()) {
            AnonymousClass33p r0 = this.A0B;
            C18270x1.A0i(C18270x1.A03(r0), "first_missed_call", r6.A0B);
        }
        synchronized (this) {
            this.A00.add(r6);
        }
        A05(z);
        this.A0E.A08();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04db, code lost:
        r0 = new long[]{0, 300, 200, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04df, code lost:
        if (r4 == 1) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04e1, code lost:
        r0 = {0, 750, 250, 750, 250} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04e4, code lost:
        r12.vibrate = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04e7, code lost:
        r0 = {0, 300, 200, 300, 200} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r11.A0L == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        if (r11.A0L != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        if (r11.A0L() == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (r11.A0H != 2) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (r11.A0L() != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        if (r11.A0N() == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011e, code lost:
        if (r13 != false) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x041a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.AnonymousClass3XI r32, boolean r33) {
        /*
            r5 = r32
            X.3dV r0 = r5.A0F
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 == 0) goto L_0x0030
            r5.A04()
            monitor-enter(r5)
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x0016 }
            java.util.ArrayList r7 = X.AnonymousClass002.A0J(r0)     // Catch:{ all -> 0x0016 }
            monitor-exit(r5)     // Catch:{ all -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0016 }
            throw r0
        L_0x0019:
            boolean r0 = r7.isEmpty()
            r19 = r33
            if (r0 == 0) goto L_0x0031
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "missedcallnotification/update cancel "
            r0 = r19
            X.C18260x0.A1E(r1, r2, r0)
            r5.A03()
        L_0x0030:
            return
        L_0x0031:
            r4 = r19
            X.2oU r0 = r5.A09
            android.content.Context r3 = r0.A00
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.util.HashSet r10 = X.AnonymousClass002.A0K()
            X.1VX r9 = r5.A0H
            r2 = 1972(0x7b4, float:2.763E-42)
            X.2vE r25 = X.C58422vE.A02
            r0 = r25
            boolean r24 = r9.A0Y(r0, r2)
            java.util.Iterator r17 = r7.iterator()
            r15 = -9223372036854775808
            r14 = 0
            r23 = 1
            r22 = 0
            r21 = 1
            r13 = 1
            r20 = 1
            r12 = 1
        L_0x005c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r11 = r17.next()
            X.3ZF r11 = (X.AnonymousClass3ZF) r11
            com.whatsapp.jid.GroupJid r0 = r11.A05
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r5.A01(r11)
            if (r0 == 0) goto L_0x00e1
            com.whatsapp.jid.GroupJid r0 = r11.A05
            r10.add(r0)
            r1 = 1
        L_0x0078:
            if (r22 != 0) goto L_0x0084
            boolean r0 = r11.A0L()
            if (r0 == 0) goto L_0x0084
            if (r1 != 0) goto L_0x0084
            r22 = 1
        L_0x0084:
            if (r21 == 0) goto L_0x008c
            boolean r0 = r11.A0L
            r21 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008c:
            r21 = 0
        L_0x008e:
            if (r13 == 0) goto L_0x0095
            boolean r0 = r11.A0L
            r13 = 1
            if (r0 == 0) goto L_0x0096
        L_0x0095:
            r13 = 0
        L_0x0096:
            if (r20 == 0) goto L_0x00a0
            boolean r0 = r11.A0L()
            r20 = 1
            if (r0 != 0) goto L_0x00a2
        L_0x00a0:
            r20 = 0
        L_0x00a2:
            if (r23 == 0) goto L_0x00ab
            int r1 = r11.A0H
            r0 = 2
            r23 = 1
            if (r1 == r0) goto L_0x00ad
        L_0x00ab:
            r23 = 0
        L_0x00ad:
            if (r12 == 0) goto L_0x00b6
            boolean r0 = r11.A0L()
            r12 = 1
            if (r0 == 0) goto L_0x00b7
        L_0x00b6:
            r12 = 0
        L_0x00b7:
            if (r24 == 0) goto L_0x00c1
            boolean r0 = r11.A0N()
            r24 = 1
            if (r0 != 0) goto L_0x00c3
        L_0x00c1:
            r24 = 0
        L_0x00c3:
            X.39J r1 = r11.A0E
            java.lang.String r0 = r1.A02
            r8.append(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            X.C18280x3.A0u(r0, r8)
            int r0 = r1.A00
            r8.append(r0)
            long r0 = r11.A0B
            int r6 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x005c
            boolean r14 = r11.A0N()
            r15 = r0
            goto L_0x005c
        L_0x00e1:
            X.39J r0 = r11.A0E
            com.whatsapp.jid.UserJid r0 = r0.A01
            r10.add(r0)
            r1 = 0
            goto L_0x0078
        L_0x00ea:
            java.lang.String r0 = r8.toString()
            java.lang.String r6 = X.C627236i.A04(r0)
            X.33p r0 = r5.A0B
            r33 = r0
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r33)
            java.lang.String r0 = "dismissed_call_notification_hash"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            r8 = 0
            if (r6 == 0) goto L_0x0114
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0114
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "missedcallnotification/same "
            X.C18260x0.A0s(r0, r6, r1)
            return
        L_0x0114:
            if (r14 == 0) goto L_0x011a
            boolean r4 = X.C56952sp.A0K(r9, r2, r4)
        L_0x011a:
            if (r21 != 0) goto L_0x0120
            r18 = 1
            if (r13 == 0) goto L_0x0122
        L_0x0120:
            r18 = 0
        L_0x0122:
            java.lang.Class<com.whatsapp.notification.MissedCallNotificationDismissedReceiver> r0 = com.whatsapp.notification.MissedCallNotificationDismissedReceiver.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r3, r0)
            r0 = 4
            android.app.PendingIntent r13 = X.C624735e.A03(r3, r1, r0)
            android.content.Intent r1 = X.C18300x5.A07(r3)
            java.lang.String r0 = "com.whatsapp.intent.action.CALLS"
            android.content.Intent r12 = r1.setAction(r0)
            int r0 = r7.size()
            int r0 = r0 + -1
            java.lang.Object r11 = r7.get(r0)
            X.3ZF r11 = (X.AnonymousClass3ZF) r11
            X.39J r0 = r11.A0E
            com.whatsapp.jid.UserJid r2 = r0.A01
            java.lang.String r1 = r2.getRawString()
            java.lang.String r0 = "attributed_call_jid"
            r12.putExtra(r0, r1)
            r0 = 3
            android.app.PendingIntent r1 = X.C624735e.A04(r3, r12, r0)
            X.1R1 r0 = r5.A0J
            r32 = r0
            X.2sa r17 = X.AnonymousClass1R1.A00(r2, r0)
            X.0Ue r2 = X.C66553Lw.A01(r3)
            java.lang.String r16 = "call"
            r0 = r16
            r2.A0J = r0
            r0 = 1
            r2.A03 = r0
            android.app.Notification r12 = r2.A07
            r12.deleteIntent = r13
            r2.A09 = r1
            r2.A0E(r0)
            long r0 = r11.A0B
            r2.A05(r0)
            r0 = 2131233329(0x7f080a31, float:1.8082792E38)
            X.AnonymousClass33T.A02(r2, r0)
            X.33i r11 = r5.A08
            X.5UR r13 = r11.A0R()
            if (r13 != 0) goto L_0x018c
            java.lang.String r0 = "missedcallnotification/update cr == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x018c:
            java.util.Iterator r15 = r10.iterator()
        L_0x0190:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01bb
            X.4uZ r14 = X.C18300x5.A0P(r15)
            boolean r0 = r14 instanceof com.whatsapp.jid.UserJid
            X.3Ex r1 = r5.A05
            if (r0 == 0) goto L_0x01b6
            X.3ZH r0 = r1.A0A(r14)
        L_0x01a4:
            if (r13 == 0) goto L_0x0190
            if (r0 == 0) goto L_0x0190
            android.net.Uri r0 = r1.A03(r0, r13)
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r0.toString()
            r2.A0D(r0)
            goto L_0x0190
        L_0x01b6:
            X.3ZH r0 = r1.A09(r14)
            goto L_0x01a4
        L_0x01bb:
            if (r4 != 0) goto L_0x04eb
            X.5TW r0 = r5.A04
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x04ad
            java.lang.String r1 = r17.A07()
        L_0x01c9:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x04aa
            android.net.Uri r27 = android.net.Uri.parse(r1)
            if (r27 == 0) goto L_0x04aa
            X.2yL r1 = r5.A0L
            X.2WH r0 = r5.A0G
            r4 = 0
            r26 = r3
            r28 = r2
            r29 = r11
            r30 = r0
            r31 = r1
            X.C66553Lw.A09(r26, r27, r28, r29, r30, r31)
        L_0x01e7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "missedcallnotification/update count:"
            X.C18260x0.A19(r0, r1, r7)
            java.lang.String r0 = " contacts:"
            X.C18260x0.A19(r0, r1, r10)
            java.lang.String r0 = " quiet:"
            X.C18260x0.A1E(r0, r1, r4)
            int r1 = r10.size()
            r0 = 1
            if (r1 != r0) goto L_0x03ee
            if (r22 != 0) goto L_0x03ee
            if (r24 != 0) goto L_0x0492
            java.util.Iterator r0 = r10.iterator()
            X.4uZ r12 = X.C18300x5.A0P(r0)
            boolean r13 = r12 instanceof com.whatsapp.jid.UserJid
            X.3Ex r15 = r5.A05
            if (r13 == 0) goto L_0x03e8
            X.3ZH r11 = r15.A0A(r12)
        L_0x0218:
            int r1 = r7.size()
            r0 = 1
            if (r1 != r0) goto L_0x03b5
            if (r20 == 0) goto L_0x03a7
            if (r21 == 0) goto L_0x039d
            r14 = 2131895033(0x7f1222f9, float:1.9424888E38)
        L_0x0226:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            X.5ZU r1 = r5.A06
            r0 = 0
            java.lang.Object r0 = r7.get(r0)
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            X.39J r0 = r0.A0E
            com.whatsapp.jid.UserJid r0 = r0.A01
            X.C64773Ex.A01(r15, r1, r0, r10)
            java.lang.String r0 = r3.getString(r14, r10)
        L_0x023c:
            r2.A0A(r0)
        L_0x023f:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            int r10 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 17104902(0x1050006, float:2.442826E-38)
            int r1 = r1.getDimensionPixelSize(r0)
            if (r11 == 0) goto L_0x027b
            X.5mM r0 = r5.A07
            android.graphics.Bitmap r0 = r0.A03(r3, r11, r10, r1)
            if (r0 == 0) goto L_0x0262
            r2.A06(r0)
        L_0x0262:
            X.5ZU r0 = r5.A06
            java.lang.String r10 = r0.A0H(r11)
            if (r21 == 0) goto L_0x0393
            r1 = 2131895033(0x7f1222f9, float:1.9424888E38)
        L_0x026d:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r10)
            java.lang.String r0 = r3.getString(r1, r0)
            r2.A0C(r0)
            r2.A0B(r10)
        L_0x027b:
            if (r13 == 0) goto L_0x0390
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r21)
            java.lang.Boolean r29 = java.lang.Boolean.TRUE
            java.util.ArrayList r31 = X.C18300x5.A0s(r12)
            r30 = r8
            r26 = r3
            r27 = r8
            android.content.Intent r12 = X.C627736r.A0o(r26, r27, r28, r29, r30, r31)
            java.lang.String r0 = "com.whatsapp.intent.action.CALL_BACK"
            r12.setAction(r0)
            java.lang.String r1 = "fromCallNotification"
            r0 = 1
            r12.putExtra(r1, r0)
        L_0x029c:
            r14 = 3
            r10 = 134217728(0x8000000, float:3.85186E-34)
            if (r12 == 0) goto L_0x02a5
            android.app.PendingIntent r8 = X.C624735e.A00(r3, r14, r12, r10)
        L_0x02a5:
            android.content.Intent r1 = X.C627736r.A0N(r3, r11)
            java.lang.String r0 = "MissedCallNotification"
            X.AnonymousClass5VI.A01(r1, r0)
            java.lang.String r0 = "fromCallNotification"
            r13 = 1
            android.content.Intent r1 = r1.putExtra(r0, r13)
            java.lang.String r0 = "show_keyboard"
            android.content.Intent r0 = r1.putExtra(r0, r13)
            android.app.PendingIntent r10 = X.C624735e.A00(r3, r14, r0, r10)
            if (r8 == 0) goto L_0x0309
            r1 = 2131231718(0x7f0803e6, float:1.8079525E38)
            if (r21 == 0) goto L_0x02ca
            r1 = 2131231803(0x7f08043b, float:1.8079697E38)
        L_0x02ca:
            r0 = 2131890803(0x7f121273, float:1.9416308E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A04(r1, r0, r8)
            boolean r0 = com.whatsapp.notification.DirectReplyService.A03()
            if (r0 == 0) goto L_0x0381
            java.lang.String r1 = "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL"
            r0 = 0
            X.0Tm r1 = com.whatsapp.notification.DirectReplyService.A00(r3, r11, r1, r0, r13)
            java.util.ArrayList r0 = r2.A0O
            r0.add(r1)
        L_0x02e6:
            r1 = 4346(0x10fa, float:6.09E-42)
            r0 = r25
            boolean r0 = r9.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0309
            X.2sq r9 = r5.A03
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A03(r11)
            if (r1 == 0) goto L_0x0309
            X.2k5 r0 = r11.A0F
            if (r0 != 0) goto L_0x0309
            java.util.Set r0 = r9.A0d
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0309
            r0 = 23
            X.C66553Lw.A0A(r3, r2, r11, r0)
        L_0x0309:
            X.5mM r1 = r5.A07
            r0 = 400(0x190, float:5.6E-43)
            android.graphics.Bitmap r11 = r1.A03(r3, r11, r0, r0)
            if (r11 == 0) goto L_0x034d
            X.0Ol r9 = new X.0Ol
            r9.<init>()
            r1 = 2
            int r0 = r9.A05
            r1 = r1 | r0
            r9.A05 = r1
            r9.A09 = r11
            if (r12 == 0) goto L_0x034a
            r11 = 2131232252(0x7f0805fc, float:1.8080608E38)
            r0 = 2131890803(0x7f121273, float:1.9416308E38)
            java.lang.String r0 = r3.getString(r0)
            X.0Tm r1 = new X.0Tm
            r1.<init>(r11, r0, r8)
            java.util.ArrayList r0 = r9.A0C
            r0.add(r1)
            r8 = 2131232254(0x7f0805fe, float:1.8080612E38)
            r0 = 2131890805(0x7f121275, float:1.9416312E38)
            java.lang.String r0 = r3.getString(r0)
            X.0Tm r1 = new X.0Tm
            r1.<init>(r8, r0, r10)
            java.util.ArrayList r0 = r9.A0C
            r0.add(r1)
        L_0x034a:
            r9.A00(r2)
        L_0x034d:
            X.0Ue r9 = X.C66553Lw.A01(r3)
            r0 = r16
            r9.A0J = r0
            r8 = 1
            r9.A03 = r8
            r0 = 2131895665(0x7f122571, float:1.942617E38)
            X.C18300x5.A14(r3, r9, r0)
            X.33j r11 = r5.A0C
            r10 = 2131755194(0x7f1000ba, float:1.914126E38)
            int r0 = r7.size()
            long r0 = (long) r0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r3 = r7.size()
            boolean r3 = X.C18300x5.A1Y(r8, r3)
            java.lang.String r0 = r11.A0L(r8, r10, r0)
            r9.A0A(r0)
            r0 = 2131233329(0x7f080a31, float:1.8082792E38)
            X.AnonymousClass33T.A02(r9, r0)
            goto L_0x04f1
        L_0x0381:
            r1 = 2131233957(0x7f080ca5, float:1.8084066E38)
            r0 = 2131890805(0x7f121275, float:1.9416312E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A04(r1, r0, r10)
            goto L_0x02e6
        L_0x0390:
            r12 = r8
            goto L_0x029c
        L_0x0393:
            r1 = 2131890804(0x7f121274, float:1.941631E38)
            if (r23 == 0) goto L_0x026d
            r1 = 2131890808(0x7f121278, float:1.9416318E38)
            goto L_0x026d
        L_0x039d:
            r14 = 2131890804(0x7f121274, float:1.941631E38)
            if (r23 == 0) goto L_0x0226
            r14 = 2131890808(0x7f121278, float:1.9416318E38)
            goto L_0x0226
        L_0x03a7:
            r0 = 2131895217(0x7f1223b1, float:1.942526E38)
            if (r21 == 0) goto L_0x03af
            r0 = 2131895031(0x7f1222f7, float:1.9424884E38)
        L_0x03af:
            java.lang.String r0 = r3.getString(r0)
            goto L_0x023c
        L_0x03b5:
            if (r18 == 0) goto L_0x03d9
            r14 = 2131755194(0x7f1000ba, float:1.914126E38)
        L_0x03ba:
            X.33j r0 = r5.A0C
            r18 = r0
            int r0 = r7.size()
            long r0 = (long) r0
            java.lang.Object[] r15 = X.AnonymousClass002.A0L()
            int r10 = r7.size()
            X.AnonymousClass000.A1L(r15, r10)
            r10 = r18
            java.lang.String r0 = r10.A0L(r15, r14, r0)
            r2.A0A(r0)
            goto L_0x023f
        L_0x03d9:
            if (r21 == 0) goto L_0x03df
            r14 = 2131755392(0x7f100180, float:1.9141662E38)
            goto L_0x03ba
        L_0x03df:
            r14 = 2131755195(0x7f1000bb, float:1.9141262E38)
            if (r23 == 0) goto L_0x03ba
            r14 = 2131755196(0x7f1000bc, float:1.9141264E38)
            goto L_0x03ba
        L_0x03e8:
            X.3ZH r11 = r15.A09(r12)
            goto L_0x0218
        L_0x03ee:
            if (r24 != 0) goto L_0x0492
            if (r18 == 0) goto L_0x0481
            r11 = 2131755194(0x7f1000ba, float:1.914126E38)
        L_0x03f5:
            X.33j r10 = r5.A0C
            int r0 = r7.size()
            long r0 = (long) r0
            java.lang.Object[] r9 = X.AnonymousClass002.A0L()
            int r8 = r7.size()
            X.AnonymousClass000.A1L(r9, r8)
            java.lang.String r0 = r10.A0L(r9, r11, r0)
        L_0x040b:
            r2.A0B(r0)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            int r10 = r7.size()
            r0 = 1
            int r10 = r10 - r0
        L_0x0418:
            if (r10 < 0) goto L_0x049b
            java.lang.Object r11 = r7.get(r10)
            X.3ZF r11 = (X.AnonymousClass3ZF) r11
            java.lang.String r1 = r5.A01(r11)
            if (r1 != 0) goto L_0x0464
            boolean r0 = r11.A0L()
            if (r0 == 0) goto L_0x0470
            X.33j r0 = r5.A0C
            r18 = r0
            r13 = 2131755253(0x7f1000f5, float:1.914138E38)
            java.util.List r0 = r11.A08()
            int r1 = r0.size()
            r0 = 1
            int r1 = r1 - r0
            long r0 = (long) r1
            java.lang.Object[] r12 = X.AnonymousClass002.A0M()
            X.5ZU r14 = r5.A06
            X.3Ex r15 = r5.A05
            X.39J r8 = r11.A0E
            com.whatsapp.jid.UserJid r8 = r8.A01
            X.3ZH r8 = r15.A0A(r8)
            X.C18290x4.A1K(r14, r8, r12)
            java.util.List r8 = r11.A08()
            int r11 = r8.size()
            r8 = 1
            int r11 = r11 - r8
            X.AnonymousClass000.A1P(r12, r11, r8)
            r8 = r18
            java.lang.String r1 = r8.A0L(r12, r13, r0)
        L_0x0464:
            boolean r0 = r9.contains(r1)
            if (r0 != 0) goto L_0x046d
            r9.add(r1)
        L_0x046d:
            int r10 = r10 + -1
            goto L_0x0418
        L_0x0470:
            X.5ZU r8 = r5.A06
            X.3Ex r1 = r5.A05
            X.39J r0 = r11.A0E
            com.whatsapp.jid.UserJid r0 = r0.A01
            X.3ZH r0 = r1.A0A(r0)
            java.lang.String r1 = r8.A0H(r0)
            goto L_0x0464
        L_0x0481:
            if (r21 == 0) goto L_0x0488
            r11 = 2131755392(0x7f100180, float:1.9141662E38)
            goto L_0x03f5
        L_0x0488:
            r11 = 2131755195(0x7f1000bb, float:1.9141262E38)
            if (r23 == 0) goto L_0x03f5
            r11 = 2131755196(0x7f1000bc, float:1.9141264E38)
            goto L_0x03f5
        L_0x0492:
            r0 = 2131891268(0x7f121444, float:1.9417251E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x040b
        L_0x049b:
            X.33j r1 = r5.A0C
            r0 = 0
            java.lang.String r0 = X.AnonymousClass5VS.A00(r1, r9, r0)
            r2.A0A(r0)
            X.C18270x1.A0r(r2, r0)
            goto L_0x034d
        L_0x04aa:
            r4 = 0
            goto L_0x01e7
        L_0x04ad:
            java.lang.String r1 = r17.A04()
            int r0 = r1.hashCode()
            switch(r0) {
                case 49: goto L_0x04bb;
                case 50: goto L_0x04c8;
                case 51: goto L_0x04d2;
                default: goto L_0x04b8;
            }
        L_0x04b8:
            r1 = r8
            goto L_0x01c9
        L_0x04bb:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04b8
            r0 = 2
            r2.A02(r0)
            goto L_0x04b8
        L_0x04c8:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04b8
            r4 = 1
            goto L_0x04db
        L_0x04d2:
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04b8
            r4 = 2
        L_0x04db:
            r0 = 5
            r1 = 1
            long[] r0 = new long[r0]
            if (r4 == r1) goto L_0x04e7
            r0 = {0, 750, 250, 750, 250} // fill-array
        L_0x04e4:
            r12.vibrate = r0
            goto L_0x04b8
        L_0x04e7:
            r0 = {0, 300, 200, 300, 200} // fill-array
            goto L_0x04e4
        L_0x04eb:
            r0 = 4
            r2.A02(r0)
            goto L_0x01e7
        L_0x04f1:
            android.app.Notification r0 = r9.A01()     // Catch:{ SecurityException -> 0x04f8 }
            r2.A08 = r0     // Catch:{ SecurityException -> 0x04f8 }
            goto L_0x0500
        L_0x04f8:
            r1 = move-exception
            boolean r0 = X.C107535bT.A0B()
            if (r0 != 0) goto L_0x0500
            throw r1
        L_0x0500:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0514
            r0 = r17
            X.1qy r0 = (X.C32501qy) r0
            r17 = r0
            if (r4 == 0) goto L_0x0524
            java.lang.String r0 = r17.A0D()
        L_0x0512:
            r2.A0K = r0
        L_0x0514:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r33)
            java.lang.String r0 = "last_call_notification_hash"
            X.C18270x1.A0j(r1, r0, r6)
            android.app.Notification r4 = r2.A01()
            if (r4 == 0) goto L_0x0030
            goto L_0x0529
        L_0x0524:
            java.lang.String r0 = r17.A0C()
            goto L_0x0512
        L_0x0529:
            X.33T r1 = r5.A0A     // Catch:{ SecurityException -> 0x0530 }
            r0 = 4
            r1.A04(r0, r4)     // Catch:{ SecurityException -> 0x0530 }
            goto L_0x0574
        L_0x0530:
            r2 = move-exception
            if (r19 != 0) goto L_0x055b
            boolean r0 = X.C107535bT.A05()
            if (r0 == 0) goto L_0x055b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x055b
            java.lang.String r0 = X.AnonymousClass0HH.A00(r4)
            if (r0 == 0) goto L_0x055b
            android.util.Pair r0 = X.C386728r.A00(r0)
            if (r0 == 0) goto L_0x055b
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x055b
            r0 = r32
            X.2sa r1 = r0.A0M(r1)
            r0.A0Z(r1)
            return
        L_0x055b:
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C626936e.A0D(r3, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0574
            boolean r0 = X.C107535bT.A0B()
            if (r0 != 0) goto L_0x0574
            throw r2
        L_0x0574:
            X.2i9 r0 = r5.A02
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XI.A00(X.3XI, boolean):void");
    }

    public final String A01(AnonymousClass3ZF r7) {
        if (r7.A05 == null) {
            return null;
        }
        boolean A1U = AnonymousClass000.A1U(r7.A0H, 2);
        GroupJid groupJid = r7.A05;
        C64773Ex r3 = this.A05;
        AnonymousClass5ZU r2 = this.A06;
        AnonymousClass3ZH A012 = AnonymousClass36T.A01(r3, this.A0I, groupJid, this.A0K, A1U);
        if (A012 != null) {
            return C18300x5.A0h(r2, A012);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r0 == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A04() {
        /*
            r19 = this;
            r4 = r19
            monitor-enter(r4)
            java.util.List r0 = r4.A00     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x0114
            X.33p r0 = r4.A0B     // Catch:{ all -> 0x0116 }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "first_missed_call"
            r5 = 0
            long r2 = r1.getLong(r0, r5)     // Catch:{ all -> 0x0116 }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f2
            X.2sW r1 = r4.A0D     // Catch:{ all -> 0x0116 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0116 }
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = r1.A0P     // Catch:{ all -> 0x0116 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.readLock()     // Catch:{ all -> 0x0116 }
            r0.lock()     // Catch:{ all -> 0x0116 }
            X.2rS r13 = r1.A08     // Catch:{ all -> 0x00ed }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00ed }
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00ed }
            X.3dV r0 = r13.A05     // Catch:{ all -> 0x00ed }
            X.4GK r16 = r0.get()     // Catch:{ all -> 0x00ed }
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00e3 }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x00e3 }
            X.1VX r5 = r13.A07     // Catch:{ all -> 0x00e3 }
            r0 = 6103(0x17d7, float:8.552E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ all -> 0x00e3 }
            boolean r0 = r5.A0Y(r1, r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x0053
            r0 = 6136(0x17f8, float:8.598E-42)
            boolean r0 = r5.A0Y(r1, r0)     // Catch:{ all -> 0x00e3 }
            r5 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id FROM call_log WHERE call_result = 2 AND from_me = 0 AND timestamp >= ?"
            r1.append(r0)     // Catch:{ all -> 0x00e3 }
            if (r5 == 0) goto L_0x0062
            java.lang.String r0 = " ORDER BY timestamp DESC"
            goto L_0x0064
        L_0x0062:
            java.lang.String r0 = " ORDER BY call_log._id DESC"
        L_0x0064:
            r1.append(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = " LIMIT 100"
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00e3 }
            r11 = 1
            java.lang.String[] r1 = new java.lang.String[r11]     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x00e3 }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "GET_MISSED_CALL_LOG_SQL"
            android.database.Cursor r6 = r12.A0E(r5, r0, r1)     // Catch:{ all -> 0x00e3 }
            int r5 = X.AnonymousClass0x7.A02(r6)     // Catch:{ all -> 0x00d7 }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00b9
        L_0x0087:
            long r0 = r6.getLong(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r15 = "SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id"
            java.lang.String[] r14 = new java.lang.String[r11]     // Catch:{ all -> 0x00d7 }
            X.C18280x3.A1R(r14, r10, r0)     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_MISSED_CALLS"
            android.database.Cursor r14 = r12.A0E(r15, r0, r14)     // Catch:{ all -> 0x00d7 }
            X.3ZF r0 = r13.A02(r6, r14)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a1
            r9.add(r0)     // Catch:{ all -> 0x00ad }
        L_0x00a1:
            if (r14 == 0) goto L_0x00a6
            r14.close()     // Catch:{ all -> 0x00d7 }
        L_0x00a6:
            boolean r0 = r6.moveToPrevious()     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x0087
            goto L_0x00b9
        L_0x00ad:
            r1 = move-exception
            if (r14 == 0) goto L_0x00b8
            r14.close()     // Catch:{ all -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d7 }
        L_0x00b8:
            throw r1     // Catch:{ all -> 0x00d7 }
        L_0x00b9:
            r6.close()     // Catch:{ all -> 0x00e3 }
            r16.close()     // Catch:{ all -> 0x00ed }
            X.2ga r1 = r13.A02     // Catch:{ all -> 0x00ed }
            long r5 = X.C18310x6.A0A(r17)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "CallLogStore/getMissedCalls"
            r1.A02(r0, r5)     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "CallLogStore/getMissedCalls/size:"
            X.C18260x0.A1B(r0, r1, r9)     // Catch:{ all -> 0x00ed }
            r8.addAll(r9)     // Catch:{ all -> 0x00ed }
            goto L_0x00f7
        L_0x00d7:
            r1 = move-exception
            if (r6 == 0) goto L_0x00e2
            r6.close()     // Catch:{ all -> 0x00de }
            goto L_0x00e2
        L_0x00de:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00e3 }
        L_0x00e2:
            throw r1     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ed }
        L_0x00ec:
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            X.C18310x6.A1S(r7)     // Catch:{ all -> 0x0116 }
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x00f2:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0116 }
            goto L_0x0103
        L_0x00f7:
            X.C18310x6.A1S(r7)     // Catch:{ all -> 0x0116 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "CallsMessageStore/getMissedCalls/size:"
            X.C18260x0.A1B(r0, r1, r8)     // Catch:{ all -> 0x0116 }
        L_0x0103:
            r4.A00 = r8     // Catch:{ all -> 0x0116 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "missedcallnotification/init count:"
            X.C18260x0.A19(r0, r1, r8)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = " timestamp:"
            X.C18260x0.A12(r0, r1, r2)     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r4)
            return
        L_0x0116:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XI.A04():void");
    }

    public void A05(boolean z) {
        this.A0M.BkM(new C71703cX(49, (Object) this, z));
    }

    public /* synthetic */ void BO1(AnonymousClass3ZF r1) {
    }

    public /* synthetic */ void BOB(AnonymousClass3ZF r1) {
    }

    public AnonymousClass3XI(C69263Wi r2, C50422i9 r3, C56962sq r4, AnonymousClass5TW r5, C64773Ex r6, AnonymousClass5ZU r7, C114015mM r8, C620633i r9, C54292oU r10, AnonymousClass33T r11, AnonymousClass33p r12, C620733j r13, C56762sW r14, C28891hw r15, C72303dV r16, AnonymousClass2WH r17, AnonymousClass1VX r18, C66493Lq r19, AnonymousClass1R1 r20, C56572sD r21, C60312yL r22, AnonymousClass4FS r23) {
        this.A0H = r18;
        this.A09 = r10;
        this.A01 = r2;
        this.A0M = r23;
        this.A0K = r21;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r7;
        this.A0C = r13;
        this.A0L = r22;
        this.A03 = r4;
        this.A0I = r19;
        this.A0D = r14;
        this.A0J = r20;
        this.A0G = r17;
        this.A0F = r16;
        this.A0B = r12;
        this.A0E = r15;
        this.A0A = r11;
    }

    public void A02() {
        A04();
        if (!this.A00.isEmpty()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("missedcallnotification/clear ");
            C18260x0.A1G(A0o, this.A00.size());
            C18270x1.A0g(C18270x1.A03(this.A0B), "first_missed_call");
            this.A00.clear();
            A03();
            C69263Wi r2 = this.A01;
            C28891hw r1 = this.A0E;
            Objects.requireNonNull(r1);
            C69263Wi.A02(r2, r1, 44);
            this.A02.A01();
        }
    }

    public /* synthetic */ void Bbe() {
    }

    public /* synthetic */ void BOC(C95814uZ r1, CallState callState, String str) {
    }

    public /* synthetic */ void BO9(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
