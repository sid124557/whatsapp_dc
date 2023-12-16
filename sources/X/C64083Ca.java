package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ca  reason: invalid class name and case insensitive filesystem */
public class C64083Ca implements C84994En {
    public final C56972sr A00;
    public final AnonymousClass36E A01;
    public final C49712gy A02;
    public final C64773Ex A03;
    public final C56422rx A04;
    public final AnonymousClass314 A05;
    public final C56612sH A06;
    public final AnonymousClass33p A07;
    public final C621133n A08;
    public final C66543Lv A09;
    public final C56892sj A0A;
    public final C55332qB A0B;
    public final C54012o2 A0C;
    public final C47482dK A0D;
    public final C52382lO A0E;
    public final AnonymousClass318 A0F;
    public final AnonymousClass1VX A0G;
    public final C621233o A0H;
    public final C54812pK A0I;
    public final C56832sd A0J;

    public void BUP(DeviceJid deviceJid) {
        A00(deviceJid, false);
    }

    public void BUQ(DeviceJid deviceJid) {
        A00(deviceJid, true);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c6, code lost:
        if (r19 == false) goto L_0x02c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:364:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0165 A[Catch:{ all -> 0x0274, all -> 0x03e5 }, LOOP:2: B:49:0x015f->B:51:0x0165, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019c A[Catch:{ all -> 0x01e3, all -> 0x01ea, all -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0216 A[Catch:{ all -> 0x0260, all -> 0x0265, all -> 0x026a }, LOOP:5: B:80:0x0210->B:82:0x0216, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.whatsapp.jid.DeviceJid r18, boolean r19) {
        /*
            r17 = this;
            java.lang.String r0 = "IdentityChangeManager/handleIdentityChangeSecurityNotification"
            X.33M r13 = X.AnonymousClass33M.A01(r0)
            r10 = r18
            int r0 = r10.getDevice()     // Catch:{ all -> 0x05de }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x05de }
            r9 = r17
            if (r0 != 0) goto L_0x003f
            if (r19 != 0) goto L_0x010c
            X.2sr r0 = r9.A00     // Catch:{ all -> 0x05de }
            boolean r0 = X.C56972sr.A09(r0, r10)     // Catch:{ all -> 0x05de }
            if (r0 != 0) goto L_0x003f
            X.2dK r2 = r9.A0D     // Catch:{ all -> 0x05de }
            com.whatsapp.jid.UserJid r1 = r10.userJid     // Catch:{ all -> 0x05de }
            X.318 r0 = r9.A0F     // Catch:{ all -> 0x05de }
            java.util.Set r0 = r0.A0D(r1)     // Catch:{ all -> 0x05de }
            X.C129526aS.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x05de }
            X.C129526aS.of(r10)     // Catch:{ all -> 0x05de }
            X.C129526aS.of(r10)     // Catch:{ all -> 0x05de }
            X.33p r0 = r2.A05     // Catch:{ all -> 0x05de }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x05de }
            java.lang.String r0 = "security_notifications"
            X.C18280x3.A1W(r1, r0)     // Catch:{ all -> 0x05de }
            goto L_0x010c
        L_0x003f:
            X.33p r0 = r9.A07     // Catch:{ all -> 0x05de }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x05de }
            java.lang.String r0 = "security_notifications"
            boolean r12 = X.C18280x3.A1W(r1, r0)     // Catch:{ all -> 0x05de }
            com.whatsapp.jid.UserJid r8 = r10.userJid     // Catch:{ all -> 0x05de }
            if (r12 == 0) goto L_0x007f
            X.2rx r0 = r9.A04     // Catch:{ all -> 0x05de }
            X.2qS r0 = r0.A01(r8)     // Catch:{ all -> 0x05de }
            r2 = 1
            if (r0 == 0) goto L_0x0063
            int r1 = r0.A01     // Catch:{ all -> 0x05de }
            int r0 = r0.A00     // Catch:{ all -> 0x05de }
            int r0 = X.AnonymousClass28B.A00(r1, r0)     // Catch:{ all -> 0x05de }
            if (r0 != r2) goto L_0x007f
        L_0x0063:
            X.3Lv r6 = r9.A09     // Catch:{ all -> 0x05de }
            X.2sd r2 = r9.A0J     // Catch:{ all -> 0x05de }
            X.2sH r0 = r9.A06     // Catch:{ all -> 0x05de }
            long r0 = r0.A0H()     // Catch:{ all -> 0x05de }
            r5 = 0
            X.2z0 r4 = X.C56832sd.A00(r8, r2)     // Catch:{ all -> 0x05de }
            r3 = 18
            X.1mI r2 = new X.1mI     // Catch:{ all -> 0x05de }
            r2.<init>(r4, r3, r0)     // Catch:{ all -> 0x05de }
            r2.A1J(r5)     // Catch:{ all -> 0x05de }
            r6.A0V(r2)     // Catch:{ all -> 0x05de }
        L_0x007f:
            X.314 r0 = r9.A05     // Catch:{ all -> 0x05de }
            java.util.List r0 = r0.A07()     // Catch:{ all -> 0x05de }
            java.util.HashSet r7 = X.AnonymousClass0x9.A15(r0)     // Catch:{ all -> 0x05de }
            X.2sj r0 = r9.A0A     // Catch:{ all -> 0x05de }
            X.33h r6 = r0.A09     // Catch:{ all -> 0x05de }
            java.util.Set r0 = r6.A0B(r8)     // Catch:{ all -> 0x05de }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x05de }
        L_0x0095:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x010c
            java.lang.Object r4 = r11.next()     // Catch:{ all -> 0x05de }
            X.1fL r4 = (X.C28011fL) r4     // Catch:{ all -> 0x05de }
            if (r12 == 0) goto L_0x0095
            X.33k r1 = r6.A07(r4)     // Catch:{ all -> 0x05de }
            boolean r0 = r4 instanceof com.whatsapp.jid.GroupJid     // Catch:{ all -> 0x05de }
            if (r0 != 0) goto L_0x00af
            boolean r0 = r4 instanceof X.AnonymousClass1fI     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x0095
        L_0x00af:
            boolean r0 = r7.contains(r4)     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x0095
            X.6aS r0 = r1.A02()     // Catch:{ all -> 0x05de }
            X.6aP r3 = new X.6aP     // Catch:{ all -> 0x05de }
            r3.<init>()     // Catch:{ all -> 0x05de }
            X.8Nf r2 = r0.iterator()     // Catch:{ all -> 0x05de }
        L_0x00c2:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x00d6
            com.whatsapp.jid.Jid r1 = X.AnonymousClass0x7.A0S(r2)     // Catch:{ all -> 0x05de }
            boolean r0 = X.C627336j.A0L(r1)     // Catch:{ all -> 0x05de }
            if (r0 != 0) goto L_0x00c2
            r3.add((java.lang.Object) r1)     // Catch:{ all -> 0x05de }
            goto L_0x00c2
        L_0x00d6:
            X.6aS r1 = r3.build()     // Catch:{ all -> 0x05de }
            boolean r0 = r1.contains(r8)     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x0095
            X.2sr r0 = r9.A00     // Catch:{ all -> 0x05de }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x05de }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x05de }
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r4 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x0095
        L_0x00f0:
            X.3Lv r5 = r9.A09     // Catch:{ all -> 0x05de }
            X.2sd r3 = r9.A0J     // Catch:{ all -> 0x05de }
            X.2sH r0 = r9.A06     // Catch:{ all -> 0x05de }
            long r1 = r0.A0H()     // Catch:{ all -> 0x05de }
            X.2z0 r4 = X.C56832sd.A00(r4, r3)     // Catch:{ all -> 0x05de }
            r3 = 18
            X.1mI r0 = new X.1mI     // Catch:{ all -> 0x05de }
            r0.<init>(r4, r3, r1)     // Catch:{ all -> 0x05de }
            r0.A1J(r8)     // Catch:{ all -> 0x05de }
            r5.A0V(r0)     // Catch:{ all -> 0x05de }
            goto L_0x0095
        L_0x010c:
            r13.A07()
            com.whatsapp.jid.UserJid r8 = r10.userJid
            int r0 = r10.getDevice()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x0286
            X.2sr r0 = r9.A00
            boolean r0 = r0.A0a(r8)
            if (r0 != 0) goto L_0x0286
            X.318 r1 = r9.A0F
            java.lang.String r0 = "identity_changed"
            r1.A0G(r8, r0)
            X.2o2 r4 = r9.A0C
            X.2qB r0 = r4.A07
            com.whatsapp.jid.DeviceJid r1 = r8.getPrimaryDevice()
            X.1R3 r7 = r0.A01
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            X.3dV r15 = r7.A04
            X.4GK r13 = r15.get()
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x03ea }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x03ea }
            java.lang.String r5 = "SELECT message_row_id FROM receipt_device WHERE receipt_device_jid_row_id = ? AND receipt_device_timestamp is NULL"
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x03ea }
            X.34p r6 = r7.A02     // Catch:{ all -> 0x03ea }
            long r0 = r6.A05(r1)     // Catch:{ all -> 0x03ea }
            X.C18260x0.A1X(r3, r0)     // Catch:{ all -> 0x03ea }
            java.lang.String r0 = "MessageReceiptDeviceStore/getUndeliveredMessageRowIds"
            android.database.Cursor r5 = r11.A0E(r5, r0, r3)     // Catch:{ all -> 0x03ea }
            java.lang.String r12 = "message_row_id"
            int r3 = r5.getColumnIndex(r12)     // Catch:{ all -> 0x0274 }
        L_0x015f:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0274 }
            if (r0 == 0) goto L_0x016d
            long r0 = r5.getLong(r3)     // Catch:{ all -> 0x0274 }
            X.C18280x3.A1K(r2, r0)     // Catch:{ all -> 0x0274 }
            goto L_0x015f
        L_0x016d:
            r5.close()     // Catch:{ all -> 0x03ea }
            r13.close()
            X.2ge r3 = r4.A08
            java.util.HashSet r14 = X.AnonymousClass002.A0K()
            X.34p r0 = r3.A01
            java.lang.String r13 = X.C623334p.A04(r0, r8)
            java.lang.String[] r11 = X.C58152un.A0N
            java.lang.Object[] r1 = r2.toArray(r11)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.3dV r0 = r3.A02
            X.4GK r16 = r0.get()
            r0 = 975(0x3cf, float:1.366E-42)
            X.3ct r4 = new X.3ct     // Catch:{ all -> 0x026f }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x026f }
        L_0x0196:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x01ef
            java.lang.String[] r1 = X.C71923ct.A01(r4)     // Catch:{ all -> 0x026f }
            r5.clear()     // Catch:{ all -> 0x026f }
            r5.add(r13)     // Catch:{ all -> 0x026f }
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x026f }
            r5.addAll(r0)     // Catch:{ all -> 0x026f }
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x026f }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x026f }
            int r2 = r1.length     // Catch:{ all -> 0x026f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x026f }
            java.lang.String r0 = "SELECT message_row_id FROM receipt_user WHERE receipt_user_jid_row_id =? AND message_row_id IN "
            X.C57212tH.A02(r0, r1, r2)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x026f }
            java.lang.Object[] r1 = r5.toArray(r11)     // Catch:{ all -> 0x026f }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x026f }
            java.lang.String r0 = "getDeliveredMessageIds"
            android.database.Cursor r3 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x026f }
            int r2 = r3.getColumnIndex(r12)     // Catch:{ all -> 0x01e3 }
        L_0x01d1:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x01e3 }
            if (r0 == 0) goto L_0x01df
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x01e3 }
            X.C18280x3.A1K(r14, r0)     // Catch:{ all -> 0x01e3 }
            goto L_0x01d1
        L_0x01df:
            r3.close()     // Catch:{ all -> 0x026f }
            goto L_0x0196
        L_0x01e3:
            r1 = move-exception
            if (r3 == 0) goto L_0x01ee
            r3.close()     // Catch:{ all -> 0x01ea }
            goto L_0x01ee
        L_0x01ea:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x026f }
        L_0x01ee:
            throw r1     // Catch:{ all -> 0x026f }
        L_0x01ef:
            r16.close()
            com.whatsapp.jid.DeviceJid r0 = r8.getPrimaryDevice()
            X.4Fq r3 = r15.A04()
            X.3Yo r15 = r3.Axl()     // Catch:{ all -> 0x026a }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0260 }
            java.lang.String r6 = X.C623334p.A04(r6, r0)     // Catch:{ all -> 0x0260 }
            java.lang.Object[] r0 = r14.toArray(r11)     // Catch:{ all -> 0x0260 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0260 }
            X.3ct r13 = X.C71923ct.A00(r0)     // Catch:{ all -> 0x0260 }
        L_0x0210:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0260 }
            if (r0 == 0) goto L_0x0254
            java.lang.String[] r2 = X.C71923ct.A01(r13)     // Catch:{ all -> 0x0260 }
            r12.clear()     // Catch:{ all -> 0x0260 }
            r12.add(r6)     // Catch:{ all -> 0x0260 }
            java.util.List r0 = java.util.Arrays.asList(r2)     // Catch:{ all -> 0x0260 }
            r12.addAll(r0)     // Catch:{ all -> 0x0260 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0260 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0260 }
            java.lang.String r4 = "receipt_device"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "receipt_device_jid_row_id = ? AND "
            r1.append(r0)     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0260 }
            int r0 = r2.length     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = X.C57212tH.A00(r0)     // Catch:{ all -> 0x0260 }
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0260 }
            java.lang.Object[] r1 = r12.toArray(r11)     // Catch:{ all -> 0x0260 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "MessageReceiptDeviceStore/deleteMessageReceipts/DELETE_MESSAGE_RECEIPTS"
            r5.A07(r4, r2, r0, r1)     // Catch:{ all -> 0x0260 }
            goto L_0x0210
        L_0x0254:
            r15.A00()     // Catch:{ all -> 0x0260 }
            r0 = 42
            X.C70093Zw.A01(r3, r7, r14, r0)     // Catch:{ all -> 0x0260 }
            r15.close()     // Catch:{ all -> 0x026a }
            goto L_0x027c
        L_0x0260:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0265 }
            goto L_0x0269
        L_0x0265:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x026a }
        L_0x0269:
            throw r1     // Catch:{ all -> 0x026a }
        L_0x026a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x05d9 }
            throw r1
        L_0x026f:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x05d9 }
            throw r1
        L_0x0274:
            r1 = move-exception
            if (r5 == 0) goto L_0x03e9
            r5.close()     // Catch:{ all -> 0x03e5 }
            goto L_0x03e9
        L_0x027c:
            r3.close()
            if (r19 != 0) goto L_0x0286
            X.2pK r0 = r9.A0I
            r0.A00(r8)
        L_0x0286:
            int r0 = r10.getDevice()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x0295
            X.2lO r0 = r9.A0E
            r0.A02(r8)
        L_0x0295:
            X.2qB r1 = r9.A0B
            java.util.Set r0 = java.util.Collections.singleton(r10)
            r1.A05(r0)
            boolean r0 = X.AnonymousClass0x9.A1P(r10)
            if (r0 == 0) goto L_0x0400
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "identitychangemanager/onIdentityChangedOrDeleted/rotating sender key deviceJid="
            X.C18260x0.A1R(r1, r0, r10)
            boolean r0 = X.AnonymousClass0x9.A1P(r10)
            X.2sj r3 = r9.A0A
            if (r0 == 0) goto L_0x031e
            java.util.Set r0 = java.util.Collections.singleton(r10)
            X.33h r5 = r3.A09
            java.util.Set r2 = r5.A0C(r0)
        L_0x02bf:
            boolean r0 = X.AnonymousClass0x9.A1P(r10)
            if (r0 == 0) goto L_0x02c8
            r13 = 1
            if (r19 != 0) goto L_0x02c9
        L_0x02c8:
            r13 = 0
        L_0x02c9:
            java.util.Iterator r12 = r2.iterator()
            r11 = 0
        L_0x02ce:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x037c
            java.lang.Object r6 = r12.next()
            X.1fL r6 = (X.C28011fL) r6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "identitychangemanager/rotateSenderKey/ gid="
            X.C18260x0.A1R(r1, r0, r6)
            java.lang.String r7 = r6.getRawString()
            boolean r1 = r3.A0B(r6)
            X.2sr r0 = r9.A00
            if (r1 == 0) goto L_0x0319
            X.6kB r0 = r0.A0G()
        L_0x02f3:
            X.C626936e.A06(r0)
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.2ov r0 = X.AnonymousClass36G.A02(r0)
            X.2oh r4 = new X.2oh
            r4.<init>(r0, r7)
            X.33n r1 = r9.A08
            r0 = 0
            boolean r0 = r1.A0c(r4, r0)
            if (r0 == 0) goto L_0x02ce
            X.36E r1 = r9.A01
            r0 = 3
            if (r13 == 0) goto L_0x0310
            r0 = 2
        L_0x0310:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0I(r6, r0)
            r11 = 1
            goto L_0x02ce
        L_0x0319:
            X.6kH r0 = X.C56972sr.A03(r0)
            goto L_0x02f3
        L_0x031e:
            X.33h r5 = r3.A09
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            X.3dV r0 = r5.A0A
            X.4GK r11 = r0.get()
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x03fb }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x03fb }
            java.lang.String r6 = "SELECT DISTINCT(group_jid_row_id) FROM group_participant_user AS user JOIN group_participant_device AS device ON  user._id =  device.group_participant_row_id WHERE user_jid_row_id = ? AND sent_sender_key = 1"
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x03fb }
            long r0 = r5.A05(r8)     // Catch:{ all -> 0x03fb }
            X.C18260x0.A1X(r4, r0)     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = "GET_PARTICIPANT_GROUPS_WITH_SENDER_KEY_SENT_BY_USER_JID_SQL"
            android.database.Cursor r4 = r7.A0E(r6, r0, r4)     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = "group_jid_row_id"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03ef }
            java.util.HashSet r6 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x03ef }
        L_0x034c:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x03ef }
            if (r0 == 0) goto L_0x0356
            X.C18260x0.A0H(r4, r6, r1)     // Catch:{ all -> 0x03ef }
            goto L_0x034c
        L_0x0356:
            X.34p r1 = r5.A09     // Catch:{ all -> 0x03ef }
            java.lang.Class<X.1fL> r0 = X.C28011fL.class
            java.util.Map r0 = r1.A0D(r0, r6)     // Catch:{ all -> 0x03ef }
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x03ef }
        L_0x0362:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03ef }
            if (r0 == 0) goto L_0x0374
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x03ef }
            X.1fL r0 = (X.C28011fL) r0     // Catch:{ all -> 0x03ef }
            if (r0 == 0) goto L_0x0362
            r2.add(r0)     // Catch:{ all -> 0x03ef }
            goto L_0x0362
        L_0x0374:
            r4.close()     // Catch:{ all -> 0x03fb }
            r11.close()
            goto L_0x02bf
        L_0x037c:
            if (r11 == 0) goto L_0x04c2
            X.3dV r0 = r3.A07
            X.4Fq r13 = r0.A04()
            X.3Yo r6 = r13.Axl()     // Catch:{ all -> 0x03ea }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = "participant-user-store/resetSentSenderKeyForAllParticipants/"
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x03e0 }
            X.4Fq r4 = X.C620533h.A02(r5)     // Catch:{ all -> 0x03e0 }
            X.3Yo r3 = r4.Axl()     // Catch:{ all -> 0x03d6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x03cc }
        L_0x039e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03cc }
            if (r0 == 0) goto L_0x03bb
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x03cc }
            X.1fL r1 = (X.C28011fL) r1     // Catch:{ all -> 0x03cc }
            X.2pG r0 = r5.A0B     // Catch:{ all -> 0x03cc }
            r0.A02(r1)     // Catch:{ all -> 0x03cc }
            X.2ba r0 = r5.A08     // Catch:{ all -> 0x03cc }
            X.33k r0 = r0.A00(r1)     // Catch:{ all -> 0x03cc }
            if (r0 == 0) goto L_0x039e
            r5.A0G(r0)     // Catch:{ all -> 0x03cc }
            goto L_0x039e
        L_0x03bb:
            r3.A00()     // Catch:{ all -> 0x03cc }
            r3.close()     // Catch:{ all -> 0x03d6 }
            r4.close()     // Catch:{ all -> 0x03e0 }
            r6.A00()     // Catch:{ all -> 0x03e0 }
            r6.close()     // Catch:{ all -> 0x03ea }
            goto L_0x04bf
        L_0x03cc:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x03d1 }
            goto L_0x03d5
        L_0x03d1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03d6 }
        L_0x03d5:
            throw r1     // Catch:{ all -> 0x03d6 }
        L_0x03d6:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x03db }
            goto L_0x03df
        L_0x03db:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03e0 }
        L_0x03df:
            throw r1     // Catch:{ all -> 0x03e0 }
        L_0x03e0:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x03e5 }
            goto L_0x03e9
        L_0x03e5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03ea }
        L_0x03e9:
            throw r1     // Catch:{ all -> 0x03ea }
        L_0x03ea:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x05d9 }
            throw r1
        L_0x03ef:
            r1 = move-exception
            if (r4 == 0) goto L_0x03fa
            r4.close()     // Catch:{ all -> 0x03f6 }
            goto L_0x03fa
        L_0x03f6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03fb }
        L_0x03fa:
            throw r1     // Catch:{ all -> 0x03fb }
        L_0x03fb:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x05d9 }
            throw r1
        L_0x0400:
            X.2sj r1 = r9.A0A
            X.3dV r0 = r1.A07
            X.4Fq r14 = r0.A04()
            X.3Yo r13 = r14.Axl()     // Catch:{ all -> 0x05d4 }
            X.33h r7 = r1.A09     // Catch:{ all -> 0x05ca }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05ca }
            java.lang.String r0 = "participant-user-store/resetSentSenderKeyFor/"
            X.C18260x0.A1R(r1, r0, r8)     // Catch:{ all -> 0x05ca }
            X.4Fq r12 = X.C620533h.A02(r7)     // Catch:{ all -> 0x05ca }
            X.3Yo r11 = r12.Axl()     // Catch:{ all -> 0x05c0 }
            X.2pG r3 = r7.A0B     // Catch:{ all -> 0x05b6 }
            r2 = r8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05b6 }
            java.lang.String r0 = "participant-device-store/resetSentSenderKey/"
            X.C18260x0.A1R(r1, r0, r8)     // Catch:{ all -> 0x05b6 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x05b6 }
            boolean r1 = X.C18320x8.A1U(r0)     // Catch:{ all -> 0x05b6 }
            java.lang.String r0 = "participant-user-store/invalid-jid"
            X.C626936e.A0E(r1, r0)     // Catch:{ all -> 0x05b6 }
            X.34p r1 = r3.A02     // Catch:{ all -> 0x05b6 }
            X.2sr r0 = r3.A01     // Catch:{ all -> 0x05b6 }
            boolean r0 = r0.A0a(r8)     // Catch:{ all -> 0x05b6 }
            if (r0 == 0) goto L_0x0447
            X.1fY r2 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x05b6 }
        L_0x0447:
            long r1 = r1.A05(r2)     // Catch:{ all -> 0x05b6 }
            X.3dV r0 = r3.A03     // Catch:{ all -> 0x05b6 }
            X.4Fq r6 = r0.A04()     // Catch:{ all -> 0x05b6 }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x05ac }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x05ac }
            java.lang.String r3 = "UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE user_jid_row_id = ?)"
            java.lang.String r0 = "resetSentSenderKey/UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_USER_SQL"
            X.2sQ r5 = r4.A0G(r3, r0)     // Catch:{ all -> 0x05ac }
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x05ac }
            java.lang.String r3 = "0"
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x05ac }
            X.C18270x1.A1R(r4, r1)     // Catch:{ all -> 0x05ac }
            r5.A09(r4)     // Catch:{ all -> 0x05ac }
            r5.A00()     // Catch:{ all -> 0x05ac }
            r6.close()     // Catch:{ all -> 0x05b6 }
            X.2ba r4 = r7.A08     // Catch:{ all -> 0x05b6 }
            java.util.Map r0 = r4.A04     // Catch:{ all -> 0x05b6 }
            java.util.HashSet r0 = X.C18310x6.A0s(r0)     // Catch:{ all -> 0x05b6 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0480:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r0 == 0) goto L_0x04ac
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x05b6 }
            X.1fL r0 = (X.C28011fL) r0     // Catch:{ all -> 0x05b6 }
            X.33k r0 = r4.A00(r0)     // Catch:{ all -> 0x05b6 }
            if (r0 == 0) goto L_0x0480
            X.2zG r0 = r0.A05(r8)     // Catch:{ all -> 0x05b6 }
            if (r0 == 0) goto L_0x0480
            X.8Nf r2 = X.C60842zG.A00(r0)     // Catch:{ all -> 0x05b6 }
        L_0x049c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r0 == 0) goto L_0x0480
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x05b6 }
            X.2kz r1 = (X.C52162kz) r1     // Catch:{ all -> 0x05b6 }
            r0 = 0
            r1.A01 = r0     // Catch:{ all -> 0x05b6 }
            goto L_0x049c
        L_0x04ac:
            r11.A00()     // Catch:{ all -> 0x05b6 }
            r11.close()     // Catch:{ all -> 0x05c0 }
            r12.close()     // Catch:{ all -> 0x05ca }
            r13.A00()     // Catch:{ all -> 0x05ca }
            r13.close()     // Catch:{ all -> 0x05d4 }
            r14.close()
            goto L_0x04c2
        L_0x04bf:
            r13.close()
        L_0x04c2:
            int r0 = r10.getDevice()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x058f
            X.33o r4 = r9.A0H
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingManager/onUserIdentityChange; jid="
            X.C18260x0.A1R(r1, r0, r8)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.lang.Object r6 = r4.A0R
            monitor-enter(r6)
            java.util.Map r10 = r4.A0C()     // Catch:{ all -> 0x054a }
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r10)     // Catch:{ all -> 0x054a }
        L_0x04e6:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x054a }
            if (r0 == 0) goto L_0x0527
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r11)     // Catch:{ all -> 0x054a }
            X.4uZ r5 = X.C18320x8.A0N(r0)     // Catch:{ all -> 0x054a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x054a }
            X.2QE r0 = (X.AnonymousClass2QE) r0     // Catch:{ all -> 0x054a }
            java.util.List r3 = r0.A03     // Catch:{ all -> 0x054a }
            boolean r0 = r3.contains(r8)     // Catch:{ all -> 0x054a }
            if (r0 == 0) goto L_0x04e6
            r3.remove(r8)     // Catch:{ all -> 0x054a }
            X.2s2 r2 = r4.A0J     // Catch:{ all -> 0x054a }
            java.util.List r1 = java.util.Collections.singletonList(r8)     // Catch:{ all -> 0x054a }
            r0 = 1
            r2.A02(r5, r1, r0)     // Catch:{ all -> 0x054a }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x054a }
            if (r0 == 0) goto L_0x0523
            java.lang.Object r0 = r10.remove(r5)     // Catch:{ all -> 0x054a }
            X.2QE r0 = (X.AnonymousClass2QE) r0     // Catch:{ all -> 0x054a }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x054a }
            X.2z0 r0 = r0.A02     // Catch:{ all -> 0x054a }
            X.C621233o.A01(r4, r0)     // Catch:{ all -> 0x054a }
        L_0x0523:
            r7.add(r5)     // Catch:{ all -> 0x054a }
            goto L_0x04e6
        L_0x0527:
            r4.A0M()     // Catch:{ all -> 0x054a }
            monitor-exit(r6)     // Catch:{ all -> 0x054a }
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x054d
            r4.A0O()
            java.util.Iterator r3 = r7.iterator()
        L_0x0538:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x054d
            java.lang.Object r2 = r3.next()
            android.os.Handler r1 = r4.A06
            r0 = 17
            X.C71353by.A00(r1, r4, r2, r0)
            goto L_0x0538
        L_0x054a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x054a }
            throw r0
        L_0x054d:
            X.1VX r2 = r9.A0G
            r1 = 5001(0x1389, float:7.008E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x058f
            X.3Ex r0 = r9.A03
            X.3ZH r0 = r0.A07(r8)
            if (r0 == 0) goto L_0x058f
            X.2qS r4 = r0.A0E
            if (r4 == 0) goto L_0x058f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "identitychangemanager/onIdentityChangedOrDeleted/attempting to confirm vname cert; jid="
            X.C18260x0.A1R(r1, r0, r8)
            X.2rx r3 = r9.A04
            byte[] r2 = r3.A07(r8)
            if (r2 == 0) goto L_0x0590
            int r1 = r4.A03
            X.3ZC r0 = r4.A01()
            boolean r0 = r3.A05(r8, r0, r2, r1)
            if (r0 == 0) goto L_0x0590
            X.3Lv r1 = r9.A09
            X.35K r0 = X.AnonymousClass35K.A00(r4)
            X.2i3 r0 = r0.A02()
            r1.A0P(r8, r0)
        L_0x058f:
            return
        L_0x0590:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "identitychangemanager/onIdentityChangedOrDeleted/refreshing verified name due to identity change; jid="
            X.C18260x0.A1R(r1, r0, r8)
            java.util.Map r0 = r3.A0A
            r0.remove(r8)
            r3.A02(r8)
            X.2gy r1 = r9.A02
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.whatsapp.jobqueue.job.GetVNameCertificateJob
            r0.<init>(r8)
            r1.A02(r0)
            return
        L_0x05ac:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x05b1 }
            goto L_0x05b5
        L_0x05b1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05b6 }
        L_0x05b5:
            throw r1     // Catch:{ all -> 0x05b6 }
        L_0x05b6:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x05bb }
            goto L_0x05bf
        L_0x05bb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05c0 }
        L_0x05bf:
            throw r1     // Catch:{ all -> 0x05c0 }
        L_0x05c0:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x05c5 }
            goto L_0x05c9
        L_0x05c5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05ca }
        L_0x05c9:
            throw r1     // Catch:{ all -> 0x05ca }
        L_0x05ca:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x05cf }
            goto L_0x05d3
        L_0x05cf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05d4 }
        L_0x05d3:
            throw r1     // Catch:{ all -> 0x05d4 }
        L_0x05d4:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x05d9 }
            throw r1
        L_0x05d9:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x05de:
            r0 = move-exception
            r13.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64083Ca.A00(com.whatsapp.jid.DeviceJid, boolean):void");
    }

    public void BUO(DeviceJid deviceJid) {
        C55502qS r7;
        AnonymousClass35K A002;
        UserJid userJid = deviceJid.userJid;
        AnonymousClass3ZH A072 = this.A03.A07(userJid);
        if (!(A072 == null || (r7 = A072.A0E) == null)) {
            C18260x0.A1R(AnonymousClass001.A0o(), "confirming unconfirmed vname cert; jid=", userJid);
            C56422rx r6 = this.A04;
            C55502qS A0A2 = r6.A04.A0A(userJid);
            if (A0A2 != null) {
                A002 = new AnonymousClass35K();
                C55502qS.A00(A0A2, A002);
                A002.A02 = C623134n.A00(A0A2);
                A002.A01 = r7.A03;
                A002.A06 = r7.A08;
                A002.A04 = r7.A01();
                A002.A00 = C623134n.A00(r7);
            } else {
                A002 = AnonymousClass35K.A00(r7);
            }
            C50362i3 A022 = A002.A02();
            byte[] A073 = r6.A07(userJid);
            if (A073 != null && !r7.equals(A0A2)) {
                r6.A05(userJid, r7.A01(), A073, r7.A03);
            }
            this.A09.A0P(userJid, A022);
        }
        if (AnonymousClass000.A1T(deviceJid.getDevice())) {
            this.A0E.A02(userJid);
        }
    }

    public C64083Ca(C56972sr r2, AnonymousClass36E r3, C49712gy r4, C64773Ex r5, C56422rx r6, AnonymousClass314 r7, C56612sH r8, AnonymousClass33p r9, C621133n r10, C66543Lv r11, C56892sj r12, C55332qB r13, C54012o2 r14, C47482dK r15, C52382lO r16, AnonymousClass318 r17, AnonymousClass1VX r18, C621233o r19, C54812pK r20, C56832sd r21) {
        this.A06 = r8;
        this.A0G = r18;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A0C = r14;
        this.A03 = r5;
        this.A09 = r11;
        this.A0F = r17;
        this.A08 = r10;
        this.A0D = r15;
        this.A04 = r6;
        this.A07 = r9;
        this.A05 = r7;
        this.A0B = r13;
        this.A0J = r21;
        this.A0H = r19;
        this.A0I = r20;
        this.A0A = r12;
        this.A0E = r16;
    }

    public void BTz(DeviceJid deviceJid, int i) {
    }
}
