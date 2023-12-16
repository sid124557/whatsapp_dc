package X;

/* renamed from: X.1gL  reason: invalid class name */
public class AnonymousClass1gL extends C67743Qm {
    public final C69263Wi A00;
    public final C29021i9 A01;
    public final C49712gy A02;
    public final C621133n A03;
    public final C48972fm A04;
    public final C614730x A05;
    public final C621233o A06;
    public final C61222zu A07;
    public final AnonymousClass4FS A08;

    /* JADX WARNING: type inference failed for: r0v71, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r0v72, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r6v23, types: [X.3an] */
    /* JADX WARNING: type inference failed for: r6v24, types: [X.3an] */
    /* JADX WARNING: type inference failed for: r4v32, types: [X.3ao] */
    /* JADX WARNING: type inference failed for: r4v33, types: [X.3ao] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0426, code lost:
        r1.BkM(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0438, code lost:
        X.C48972fm.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0490, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04c2, code lost:
        r0 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05df, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        A03(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r27, int r28) {
        /*
            r26 = this;
            r0 = 240(0xf0, float:3.36E-43)
            r1 = r28
            if (r1 == r0) goto L_0x0007
            return
        L_0x0007:
            r4 = 0
            r1 = r27
            X.36K r8 = r1.A0k(r4)
            if (r8 == 0) goto L_0x064c
            java.lang.String r0 = "t"
            java.lang.String r1 = X.AnonymousClass36K.A0L(r1, r0)
            r3 = r26
            X.39T r2 = r3.A01()
            com.whatsapp.jid.UserJid r7 = r2.A00()
            java.lang.String r5 = r8.A00
            int r0 = r5.hashCode()
            java.lang.String r6 = "enc"
            r9 = -1
            switch(r0) {
                case -1607257499: goto L_0x0603;
                case 100570: goto L_0x05fa;
                case 1671308008: goto L_0x05ef;
                case 1901043637: goto L_0x05e4;
                default: goto L_0x002d;
            }
        L_0x002d:
            r14 = 4
            java.lang.String r13 = "registration"
            java.lang.String r15 = "retry"
            java.lang.String r5 = "count"
            java.lang.String r0 = "request"
            java.lang.String r12 = "; retryCount="
            java.lang.String r16 = "invalid registration node"
            switch(r9) {
                case 0: goto L_0x043d;
                case 1: goto L_0x03bd;
                case 2: goto L_0x02d8;
                case 3: goto L_0x0044;
                default: goto L_0x0040;
            }
        L_0x0040:
            r3.A03(r2)
            return
        L_0x0044:
            X.36K r11 = r8.A0l(r0)
            X.36K r9 = r8.A0l(r6)
            java.lang.String r6 = "final"
            r0 = 0
            java.lang.String r6 = r8.A0r(r6, r0)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x005d
            java.lang.String r0 = "connection/handleLocationNotifications/final attribute is empty"
            goto L_0x05df
        L_0x005d:
            java.lang.String r10 = "; msgId="
            java.lang.String r7 = "context"
            if (r11 == 0) goto L_0x01f3
            int r11 = r11.A0b(r15, r4)
            X.36K r0 = r8.A0l(r13)
            if (r0 == 0) goto L_0x0634
            byte[] r1 = r0.A01
            if (r1 == 0) goto L_0x062f
            int r0 = r1.length
            if (r0 != r14) goto L_0x062f
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            com.whatsapp.jid.Jid r9 = r8.A0g(r0, r7)
            X.4uZ r9 = (X.C95814uZ) r9
            if (r9 != 0) goto L_0x0084
            com.whatsapp.jid.Jid r0 = r2.A02
            X.4uZ r9 = X.C627336j.A02(r0)
        L_0x0084:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "connection/handleLocationNotifications/final live location retry notification; stanzaKey="
            X.AnonymousClass000.A17(r2, r0, r10, r4)
            r4.append(r6)
            X.C18260x0.A0y(r12, r4, r11)
            com.whatsapp.jid.Jid r7 = r2.A02
            X.4uZ r8 = X.C627336j.A02(r7)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; stanzaKey="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "; contextJid="
            X.AnonymousClass000.A17(r9, r0, r10, r4)
            r4.append(r6)
            X.C18260x0.A0y(r12, r4, r11)
            boolean r0 = X.C627336j.A0K(r8)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r8 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x01ef
            com.whatsapp.jid.DeviceJid r23 = com.whatsapp.jid.DeviceJid.of(r7)
            r4 = 0
            byte r0 = r1[r4]
            int r22 = X.C18290x4.A07(r1, r0, r4)
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl got final location retry request; retryCount="
            r7.append(r0)
            r7.append(r11)
            java.lang.String r21 = "; targetDeviceJid="
            r0 = r21
            r7.append(r0)
            r0 = r23
            r7.append(r0)
            java.lang.String r1 = "; targetRegistrationIdInt="
            r0 = r22
            X.C18260x0.A0y(r1, r7, r0)
            if (r11 <= r14) goto L_0x00f8
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r21 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl skipping retry; reached max retry; jid="
        L_0x00ec:
            r0 = r21
            r4.append(r0)
            r0 = r23
            r4.append(r0)
            goto L_0x04c2
        L_0x00f8:
            X.2z0 r8 = X.AnonymousClass2z0.A04(r9, r6)
            X.33o r1 = r3.A06
            X.C626936e.A06(r23)
            r0 = r23
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r25 = r0
            X.1n8 r13 = r1.A08(r8)
            if (r13 == 0) goto L_0x01d1
            java.lang.Object r7 = r1.A0R
            monitor-enter(r7)
            java.util.Map r12 = r1.A0C()     // Catch:{ all -> 0x062c }
            X.4uZ r0 = r8.A00     // Catch:{ all -> 0x062c }
            r16 = r0
            java.lang.Object r15 = r12.get(r0)     // Catch:{ all -> 0x062c }
            X.2QE r15 = (X.AnonymousClass2QE) r15     // Catch:{ all -> 0x062c }
            r19 = 1000(0x3e8, double:4.94E-321)
            if (r15 == 0) goto L_0x0158
            X.8qC r0 = r1.A0M     // Catch:{ all -> 0x062c }
            X.3Lv r0 = X.AnonymousClass0x9.A0M(r0)     // Catch:{ all -> 0x062c }
            boolean r0 = r0.A0x(r8)     // Catch:{ all -> 0x062c }
            if (r0 == 0) goto L_0x0139
            X.C626936e.A06(r16)     // Catch:{ all -> 0x062c }
            r0 = r16
            r1.A0Q(r0)     // Catch:{ all -> 0x062c }
        L_0x0136:
            monitor-exit(r7)     // Catch:{ all -> 0x062c }
            goto L_0x01d1
        L_0x0139:
            X.2pX r0 = r15.A00     // Catch:{ all -> 0x062c }
            if (r0 == 0) goto L_0x0158
            java.util.List r0 = r15.A03     // Catch:{ all -> 0x062c }
            r12 = r0
            r0 = r25
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x062c }
            if (r0 == 0) goto L_0x0158
            X.2pX r12 = r15.A00     // Catch:{ all -> 0x062c }
            long r0 = r12.A05     // Catch:{ all -> 0x062c }
            long r4 = r13.A0K     // Catch:{ all -> 0x062c }
            long r0 = r0 - r4
            long r0 = r0 / r19
            int r4 = (int) r0     // Catch:{ all -> 0x062c }
            android.util.Pair r5 = X.C18300x5.A0E(r12, r4)     // Catch:{ all -> 0x062c }
            monitor-exit(r7)     // Catch:{ all -> 0x062c }
            goto L_0x01b7
        L_0x0158:
            X.2pX r12 = r13.A02     // Catch:{ all -> 0x062c }
            if (r12 == 0) goto L_0x0136
            X.2s2 r1 = r1.A0J     // Catch:{ all -> 0x062c }
            X.C626936e.A06(r16)     // Catch:{ all -> 0x062c }
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x062c }
            r15 = r0
            X.1R9 r0 = r1.A00     // Catch:{ Exception -> 0x0624 }
            X.4GK r18 = r0.get()     // Catch:{ Exception -> 0x0624 }
            r0 = r18
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x061a }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x061a }
            r24 = r0
            java.lang.String r17 = "SELECT COUNT(*) AS count FROM location_sharer WHERE remote_jid = ? AND from_me = ? AND remote_resource = ? AND message_id = ?"
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ all -> 0x061a }
            java.lang.String r0 = r16.getRawString()     // Catch:{ all -> 0x061a }
            r16 = 0
            r14[r4] = r0     // Catch:{ all -> 0x061a }
            java.lang.String r0 = "1"
            r4 = 1
            r14[r4] = r0     // Catch:{ all -> 0x061a }
            java.lang.String r1 = r25.getRawString()     // Catch:{ all -> 0x061a }
            X.AnonymousClass001.A1H(r1, r15, r14)     // Catch:{ all -> 0x061a }
            java.lang.String r15 = "isLocationReceiver/QUERY_LOCATION_SHARER"
            r1 = r24
            r0 = r17
            android.database.Cursor r14 = r1.A0E(r0, r15, r14)     // Catch:{ all -> 0x061a }
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x01a2
            int r0 = X.AnonymousClass0x2.A04(r14, r5)     // Catch:{ all -> 0x060e }
            if (r0 != r4) goto L_0x01a2
            r16 = 1
        L_0x01a2:
            r14.close()     // Catch:{ all -> 0x061a }
            r18.close()     // Catch:{ Exception -> 0x0624 }
            if (r16 == 0) goto L_0x0136
            long r4 = r12.A05     // Catch:{ all -> 0x062c }
            long r0 = r13.A0K     // Catch:{ all -> 0x062c }
            long r4 = r4 - r0
            long r4 = r4 / r19
            int r0 = (int) r4     // Catch:{ all -> 0x062c }
            android.util.Pair r5 = X.C18300x5.A0E(r12, r0)     // Catch:{ all -> 0x062c }
            monitor-exit(r7)     // Catch:{ all -> 0x062c }
        L_0x01b7:
            if (r5 == 0) goto L_0x01d1
            X.33n r0 = r3.A03
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x01df
            X.4FS r1 = r3.A08
            X.3ao r0 = new X.3ao
            r4 = r0
            r6 = r23
            r7 = r3
            r9 = r11
            r10 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0426
        L_0x01d1:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl skipping retry; final location message not found; contextJid="
            X.AnonymousClass000.A17(r9, r0, r10, r4)
            r4.append(r6)
            goto L_0x00ec
        L_0x01df:
            X.2fm r1 = r3.A04
            X.3ao r0 = new X.3ao
            r4 = r0
            r6 = r23
            r7 = r3
            r9 = r11
            r10 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0438
        L_0x01ef:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl received location key retry notification sent to a group or broadcast"
            goto L_0x0490
        L_0x01f3:
            if (r9 == 0) goto L_0x02d4
            int r4 = r9.A0b(r5, r4)
            java.lang.String r5 = "source"
            java.lang.String r5 = r8.A0r(r5, r0)
            java.lang.String r0 = "cache"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x02a0
            int r0 = java.lang.Integer.parseInt(r1)
            long r0 = X.C18290x4.A0A(r0)
        L_0x0210:
            java.lang.Class<X.4uZ> r5 = X.C95814uZ.class
            com.whatsapp.jid.Jid r8 = r8.A0g(r5, r7)
            X.4uZ r8 = (X.C95814uZ) r8
            X.2a1 r7 = X.AnonymousClass28S.A00(r9)
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "connection/handleLocationNotifications/final live location notification; stanzaKey="
            r9.append(r5)
            r9.append(r2)
            java.lang.String r13 = "; contextJid="
            r9.append(r13)
            r9.append(r8)
            X.AnonymousClass001.A1K(r10, r6, r12, r9)
            r9.append(r4)
            java.lang.String r11 = "; cachedTime="
            X.C18260x0.A12(r11, r9, r0)
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "LocationNotificationHandler/onFinalLocationNotification/stanzaKey="
            X.AnonymousClass000.A17(r2, r5, r13, r9)
            r9.append(r8)
            X.AnonymousClass001.A1K(r10, r6, r12, r9)
            r9.append(r4)
            X.C18260x0.A12(r11, r9, r0)
            int r9 = r7.A01
            r5 = 2
            if (r9 == r5) goto L_0x0263
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version; ciphertextVersion="
        L_0x025b:
            r4.append(r0)
            r4.append(r9)
            goto L_0x04c2
        L_0x0263:
            com.whatsapp.jid.Jid r10 = r2.A02
            X.4uZ r11 = X.C627336j.A02(r10)
            boolean r5 = X.C627336j.A0K(r11)
            if (r5 == 0) goto L_0x028b
            com.whatsapp.jid.Jid r5 = r2.A01
            com.whatsapp.jid.DeviceJid r12 = com.whatsapp.jid.DeviceJid.of(r5)
        L_0x0275:
            X.3G3 r10 = new X.3G3
            r13 = r3
            r14 = r6
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            int r8 = r7.A00
            r5 = 3
            if (r8 != r5) goto L_0x0297
            if (r4 <= 0) goto L_0x02a4
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version for retry final location notification; ciphertextVersion="
            goto L_0x025b
        L_0x028b:
            boolean r5 = X.C627336j.A0K(r8)
            com.whatsapp.jid.DeviceJid r12 = com.whatsapp.jid.DeviceJid.of(r10)
            if (r5 == 0) goto L_0x0275
            r11 = r8
            goto L_0x0275
        L_0x0297:
            if (r4 != 0) goto L_0x02a4
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version for final location notification; ciphertextVersion="
            goto L_0x025b
        L_0x02a0:
            r0 = 0
            goto L_0x0210
        L_0x02a4:
            X.33n r5 = r3.A03
            boolean r5 = r5.A0X()
            if (r5 == 0) goto L_0x02c0
            X.4FS r5 = r3.A08
            X.3bO r9 = new X.3bO
            r14 = r7
            r15 = r2
            r16 = r6
            r17 = r4
            r18 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.BkM(r9)
            goto L_0x0040
        L_0x02c0:
            X.2fm r5 = r3.A04
            X.3bO r9 = new X.3bO
            r14 = r7
            r15 = r2
            r16 = r6
            r17 = r4
            r18 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.C48972fm.A02(r5, r9)
            goto L_0x0040
        L_0x02d4:
            java.lang.String r0 = "connection/handleLocationNotifications/none of request nor enc node exists"
            goto L_0x05df
        L_0x02d8:
            java.lang.String r4 = "id"
            r0 = -1
            long r0 = r8.A0e(r4, r0)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "LocationNotificationHandler/on-location-disabled-notification; stanzaKey="
            r5.append(r4)
            r5.append(r2)
            java.lang.String r9 = "; sequenceNumber="
            X.C18260x0.A12(r9, r5, r0)
            X.33o r5 = r3.A06
            com.whatsapp.jid.Jid r4 = r2.A02
            X.4uZ r4 = X.C627336j.A02(r4)
            com.whatsapp.jid.UserJid r6 = r2.A00()
            if (r6 != 0) goto L_0x0310
            r8 = 0
        L_0x0300:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "LocationSharingManager/onReceiveStopSharing; jid="
            X.AnonymousClass0x2.A1E(r4, r8, r6, r7)
            X.C18260x0.A12(r9, r7, r0)
            java.lang.Object r9 = r5.A0Q
            monitor-enter(r9)
            goto L_0x0315
        L_0x0310:
            com.whatsapp.jid.UserJid r8 = r2.A00()
            goto L_0x0300
        L_0x0315:
            java.util.Map r10 = r5.A0B()     // Catch:{ all -> 0x0639 }
            java.util.Map r11 = X.AnonymousClass0x9.A1B(r4, r10)     // Catch:{ all -> 0x0639 }
            if (r11 == 0) goto L_0x039a
            if (r8 != 0) goto L_0x0322
            goto L_0x0324
        L_0x0322:
            r13 = r8
            goto L_0x0328
        L_0x0324:
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass32Y.A03(r4)     // Catch:{ all -> 0x0639 }
        L_0x0328:
            java.lang.Object r6 = r11.get(r13)     // Catch:{ all -> 0x0639 }
            X.2OP r6 = (X.AnonymousClass2OP) r6     // Catch:{ all -> 0x0639 }
            if (r6 == 0) goto L_0x039a
            X.2z0 r6 = r6.A02     // Catch:{ all -> 0x0639 }
            X.1n8 r6 = r5.A08(r6)     // Catch:{ all -> 0x0639 }
            android.util.Pair r12 = android.util.Pair.create(r4, r13)     // Catch:{ all -> 0x0639 }
            r15 = 0
            if (r6 == 0) goto L_0x0349
            long r6 = r6.A01     // Catch:{ all -> 0x0639 }
            int r14 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x0349
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 <= 0) goto L_0x0349
            goto L_0x0390
        L_0x0349:
            java.util.Map r7 = r5.A0Z     // Catch:{ all -> 0x0639 }
            java.lang.Object r14 = r7.get(r12)     // Catch:{ all -> 0x0639 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0639 }
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 <= 0) goto L_0x0362
            if (r14 == 0) goto L_0x035f
            long r14 = r14.longValue()     // Catch:{ all -> 0x0639 }
            int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0362
        L_0x035f:
            X.AnonymousClass0x2.A1K(r12, r7, r0)     // Catch:{ all -> 0x0639 }
        L_0x0362:
            java.lang.Object r0 = r11.remove(r13)     // Catch:{ all -> 0x0639 }
            X.2OP r0 = (X.AnonymousClass2OP) r0     // Catch:{ all -> 0x0639 }
            if (r0 == 0) goto L_0x036f
            X.2z0 r0 = r0.A02     // Catch:{ all -> 0x0639 }
            X.C621233o.A01(r5, r0)     // Catch:{ all -> 0x0639 }
        L_0x036f:
            X.2s2 r6 = r5.A0J     // Catch:{ all -> 0x0639 }
            r1 = 0
            if (r8 == 0) goto L_0x0388
            java.util.List r0 = java.util.Collections.singletonList(r8)     // Catch:{ all -> 0x0639 }
            r6.A02(r4, r0, r1)     // Catch:{ all -> 0x0639 }
        L_0x037b:
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0639 }
            if (r0 == 0) goto L_0x0384
            r10.remove(r4)     // Catch:{ all -> 0x0639 }
        L_0x0384:
            r5.A0Z(r10)     // Catch:{ all -> 0x0639 }
            goto L_0x039a
        L_0x0388:
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x0639 }
            r6.A04(r0, r1)     // Catch:{ all -> 0x0639 }
            goto L_0x037b
        L_0x0390:
            java.lang.String r0 = "LocationSharingManager/onReceiveStopSharing; received old sequence number; skip stopping"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0639 }
            java.util.Map r0 = r5.A0Z     // Catch:{ all -> 0x0639 }
            r0.remove(r12)     // Catch:{ all -> 0x0639 }
        L_0x039a:
            monitor-exit(r9)     // Catch:{ all -> 0x0639 }
            java.util.List r0 = r5.A0W
            java.util.Iterator r1 = r0.iterator()
        L_0x03a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03b1
            java.lang.Object r0 = r1.next()
            X.4EU r0 = (X.AnonymousClass4EU) r0
            r0.BZa(r4, r8)
            goto L_0x03a1
        L_0x03b1:
            r5.A0N()
            android.os.Handler r1 = r5.A06
            r0 = 16
            X.C71353by.A00(r1, r5, r4, r0)
            goto L_0x0040
        L_0x03bd:
            int r4 = r8.A0b(r5, r4)
            X.2a1 r5 = X.AnonymousClass28S.A00(r8)
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/xmpp/recv/notification location key "
            r8.append(r0)
            r8.append(r7)
            r6 = 32
            r8.append(r6)
            r8.append(r1)
            r8.append(r6)
            long r0 = java.lang.System.currentTimeMillis()
            r8.append(r0)
            r8.append(r6)
            X.C18260x0.A1G(r8, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/on-location-key-notification; stanzaKey="
            r1.append(r0)
            r1.append(r2)
            X.C18260x0.A0y(r12, r1, r4)
            int r1 = r5.A01
            r0 = 2
            if (r1 == r0) goto L_0x040b
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/invalid ciphertext version; ciphertextVersion="
            r4.append(r0)
            r4.append(r1)
            goto L_0x04c2
        L_0x040b:
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r10 = X.C18320x8.A0O(r0)
            X.33n r0 = r3.A03
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x042b
            X.4FS r1 = r3.A08
            r12 = 5
            X.3an r0 = new X.3an
            r6 = r0
            r7 = r3
            r8 = r2
            r9 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0426:
            r1.BkM(r0)
            goto L_0x0040
        L_0x042b:
            X.2fm r1 = r3.A04
            r12 = 6
            X.3an r0 = new X.3an
            r6 = r0
            r7 = r3
            r8 = r2
            r9 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0438:
            X.C48972fm.A02(r1, r0)
            goto L_0x0040
        L_0x043d:
            X.36K r1 = r8.A0l(r0)
            java.lang.String r9 = "deny"
            X.36K r0 = r8.A0l(r9)
            if (r1 == 0) goto L_0x0533
            int r5 = r1.A0b(r15, r4)
            X.36K r0 = r8.A0l(r13)
            if (r0 == 0) goto L_0x0644
            byte[] r8 = r0.A01
            if (r8 == 0) goto L_0x063f
            int r0 = r8.length
            if (r0 != r14) goto L_0x063f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "connection/handleLocationNotifications/location key retry/participant="
            r1.append(r0)
            r1.append(r7)
            X.C18260x0.A0y(r12, r1, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/onLocationKeyRetryNotification; stanzaKey="
            r1.append(r0)
            r1.append(r2)
            X.C18260x0.A0y(r12, r1, r5)
            com.whatsapp.jid.Jid r6 = r2.A02
            X.4uZ r1 = X.C627336j.A02(r6)
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 != 0) goto L_0x052f
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x052f
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.of(r6)
            if (r7 != 0) goto L_0x0495
            java.lang.String r0 = "axolotl received location key retry notification for non-device jid"
        L_0x0490:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0040
        L_0x0495:
            byte r0 = r8[r4]
            int r6 = X.C18290x4.A07(r8, r0, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl got location retry request "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " with "
            X.C18260x0.A0y(r0, r1, r6)
            if (r5 <= r14) goto L_0x04c7
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl skipping retry; reached max retry; jid="
        L_0x04bc:
            r4.append(r0)
            r4.append(r7)
        L_0x04c2:
            java.lang.String r0 = r4.toString()
            goto L_0x0490
        L_0x04c7:
            X.33o r10 = r3.A06
            com.whatsapp.jid.UserJid r8 = r7.userJid
            java.lang.Object r1 = r10.A0R
            monitor-enter(r1)
            java.util.Set r0 = r10.A0D()     // Catch:{ all -> 0x063c }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x063c }
            monitor-exit(r1)     // Catch:{ all -> 0x063c }
            if (r0 != 0) goto L_0x0520
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl skipping retry; user should not get location key; jid="
            X.C18260x0.A1S(r1, r0, r7)
            X.2zu r0 = r3.A07
            com.whatsapp.jid.UserJid r7 = r7.userJid
            X.31C r5 = r0.A02
            java.lang.String r1 = r5.A03()
            r0 = 3
            X.39V[] r6 = new X.AnonymousClass39V[r0]
            java.lang.String r0 = "id"
            X.AnonymousClass39V.A0B(r0, r1, r6, r4)
            java.lang.String r0 = "to"
            X.39V r1 = new X.39V
            r1.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r0)
            r0 = 1
            r6[r0] = r1
            java.lang.String r1 = "type"
            java.lang.String r0 = "location"
            X.AnonymousClass39V.A06(r1, r0, r6)
            r4 = 0
            X.36K r1 = X.AnonymousClass36K.A0I(r9, r4)
            java.lang.String r0 = "encrypt"
            X.36K r1 = X.AnonymousClass36K.A0F(r1, r0, r4)
            java.lang.String r0 = "notification"
            X.36K r1 = X.AnonymousClass36K.A0F(r1, r0, r6)
            r0 = 126(0x7e, float:1.77E-43)
            r5.A0G(r1, r0)
            goto L_0x0040
        L_0x0520:
            com.whatsapp.jid.UserJid r0 = r7.userJid
            boolean r0 = r10.A0e(r0, r5)
            if (r0 != 0) goto L_0x0569
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl skipping retry; retry too soon; jid="
            goto L_0x04bc
        L_0x052f:
            java.lang.String r0 = "axolotl received location key retry notification sent to a group or broadcast"
            goto L_0x0490
        L_0x0533:
            if (r0 == 0) goto L_0x05dd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationNotificationHandler/onLocationKeyDenyNotification; stanzaKey="
            X.C18260x0.A1R(r1, r0, r2)
            com.whatsapp.jid.Jid r0 = r2.A02
            X.4uZ r1 = X.C627336j.A02(r0)
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 != 0) goto L_0x0565
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0565
            X.33o r7 = r3.A06
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass32Y.A03(r1)
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r6)
            java.lang.String r0 = "LocationSharingManager/onReceiveDenySharing; jid="
            X.C18260x0.A1R(r1, r0, r6)
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            java.lang.Object r8 = r7.A0Q
            monitor-enter(r8)
            goto L_0x0596
        L_0x0565:
            java.lang.String r0 = "axolotl received location key deny notification sent to a group or broadcast"
            goto L_0x0490
        L_0x0569:
            X.33n r0 = r3.A03
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0583
            X.4FS r1 = r3.A08
            r13 = 7
            X.3cL r0 = new X.3cL
            r8 = r0
            r9 = r3
            r10 = r5
            r11 = r7
            r12 = r6
            r8.<init>((java.lang.Object) r9, (int) r10, (java.lang.Object) r11, (int) r12, (int) r13)
            r1.BkM(r0)
            goto L_0x0040
        L_0x0583:
            X.2fm r1 = r3.A04
            r13 = 8
            X.3cL r0 = new X.3cL
            r8 = r0
            r9 = r3
            r10 = r5
            r11 = r7
            r12 = r6
            r8.<init>((java.lang.Object) r9, (int) r10, (java.lang.Object) r11, (int) r12, (int) r13)
            X.C48972fm.A02(r1, r0)
            goto L_0x0040
        L_0x0596:
            java.util.Map r0 = r7.A0B()     // Catch:{ all -> 0x0649 }
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x0649 }
        L_0x059e:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x05ca
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r5)     // Catch:{ all -> 0x0649 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x0649 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0649 }
            java.util.Iterator r1 = X.C18280x3.A0i(r0)     // Catch:{ all -> 0x0649 }
        L_0x05b2:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x059e
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r1)     // Catch:{ all -> 0x0649 }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x05b2
            X.4uZ r0 = X.C18320x8.A0N(r4)     // Catch:{ all -> 0x0649 }
            r9.add(r0)     // Catch:{ all -> 0x0649 }
            goto L_0x05b2
        L_0x05ca:
            monitor-exit(r8)     // Catch:{ all -> 0x0649 }
            java.util.Iterator r1 = r9.iterator()
        L_0x05cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0040
            X.4uZ r0 = X.C18300x5.A0P(r1)
            r7.A0R(r0, r6)
            goto L_0x05cf
        L_0x05dd:
            java.lang.String r0 = "connection/handleLocationNotifications/none of request nor deny node exists"
        L_0x05df:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0040
        L_0x05e4:
            java.lang.String r0 = "location"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002d
            r9 = 3
            goto L_0x002d
        L_0x05ef:
            java.lang.String r0 = "disable"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002d
            r9 = 2
            goto L_0x002d
        L_0x05fa:
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L_0x002d
            r9 = 1
            goto L_0x002d
        L_0x0603:
            java.lang.String r0 = "encrypt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002d
            r9 = 0
            goto L_0x002d
        L_0x060e:
            r1 = move-exception
            if (r14 == 0) goto L_0x0619
            r14.close()     // Catch:{ all -> 0x0615 }
            goto L_0x0619
        L_0x0615:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x061a }
        L_0x0619:
            throw r1     // Catch:{ all -> 0x061a }
        L_0x061a:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x061f }
            goto L_0x0623
        L_0x061f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0624 }
        L_0x0623:
            throw r1     // Catch:{ Exception -> 0x0624 }
        L_0x0624:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/isLocationReceiver/error checking location sharer"
            java.lang.RuntimeException r0 = X.C18310x6.A0i(r0, r1)     // Catch:{ all -> 0x062c }
            throw r0     // Catch:{ all -> 0x062c }
        L_0x062c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x062c }
            throw r0
        L_0x062f:
            X.24Y r0 = X.AnonymousClass24Y.A01(r16)
            throw r0
        L_0x0634:
            X.24Y r0 = X.AnonymousClass24Y.A01(r16)
            throw r0
        L_0x0639:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0639 }
            throw r0
        L_0x063c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x063c }
            throw r0
        L_0x063f:
            X.24Y r0 = X.AnonymousClass24Y.A01(r16)
            throw r0
        L_0x0644:
            X.24Y r0 = X.AnonymousClass24Y.A01(r16)
            throw r0
        L_0x0649:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0649 }
            throw r0
        L_0x064c:
            java.lang.String r0 = "invalid location notification"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gL.A05(X.36K, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1gL(X.C55682qk r9, X.C69263Wi r10, X.C29021i9 r11, X.C49712gy r12, X.C621133n r13, X.C48972fm r14, X.C614730x r15, X.C621233o r16, X.C61222zu r17, X.AnonymousClass31C r18, X.C55892r5 r19, X.AnonymousClass4FS r20) {
        /*
            r8 = this;
            int[] r6 = X.C18330xA.A0E()
            r7 = 0
            r0 = 240(0xf0, float:3.36E-43)
            r6[r7] = r0
            r1 = r8
            r2 = r9
            r3 = r18
            r4 = r19
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A00 = r10
            r8.A08 = r5
            r8.A05 = r15
            r8.A02 = r12
            r8.A04 = r14
            r8.A01 = r11
            r8.A03 = r13
            r0 = r17
            r8.A07 = r0
            r0 = r16
            r8.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gL.<init>(X.2qk, X.3Wi, X.1i9, X.2gy, X.33n, X.2fm, X.30x, X.33o, X.2zu, X.31C, X.2r5, X.4FS):void");
    }
}
