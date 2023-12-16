package X;

/* renamed from: X.3DQ  reason: invalid class name */
public final class AnonymousClass3DQ implements AnonymousClass66U, AnonymousClass4E8 {
    public final C55372qF A00;
    public final C54542ot A01;
    public final C55182pw A02;
    public final C72303dV A03;
    public final C54652p4 A04;
    public final AnonymousClass1RJ A05;
    public final C55432qL A06;
    public final C34441vA A07;

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0133, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0136, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r12 = this;
            java.lang.String r2 = "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron/alreadyCleanedUpV4"
            monitor-enter(r2)
            X.1vA r7 = r12.A07     // Catch:{ all -> 0x013b }
            java.lang.String r1 = r7.A02(r2)     // Catch:{ all -> 0x013b }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x013b }
            if (r0 != 0) goto L_0x001c
            boolean r0 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron already cleaned up"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x013b }
            goto L_0x0117
        L_0x001c:
            java.lang.String r0 = "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron/cleanUp/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x013b }
            X.3dV r0 = r12.A03     // Catch:{ all -> 0x013b }
            X.4Fq r3 = r0.A04()     // Catch:{ all -> 0x013b }
            X.3Yo r6 = r3.Axl()     // Catch:{ all -> 0x0134 }
            X.2qL r5 = r12.A06     // Catch:{ all -> 0x012d }
            X.3dV r0 = r5.A02     // Catch:{ all -> 0x012d }
            X.4Fq r8 = r0.A04()     // Catch:{ all -> 0x012d }
            X.3Yo r9 = r8.Axl()     // Catch:{ all -> 0x0123 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0119 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = "DELETE from user_device WHERE _id in (SELECT user_device._id from user_device LEFT JOIN jid ON jid._id = user_device.device_jid_row_id WHERE jid.type = 19) "
            java.lang.String r0 = "CLEAR_ALL_LID_DEVICES_TO_RECOVER_FROM_S344119_USER_DEVICE_TABLE"
            r4.A0H(r1, r0)     // Catch:{ all -> 0x0119 }
            r9.A00()     // Catch:{ all -> 0x0119 }
            X.2G1 r1 = r5.A04     // Catch:{ all -> 0x0119 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0119 }
            r0 = 33
            X.3Zk r0 = X.C69983Zk.A00(r1, r0)     // Catch:{ all -> 0x0119 }
            r8.B25(r0)     // Catch:{ all -> 0x0119 }
            r9.close()     // Catch:{ all -> 0x0123 }
            r8.close()     // Catch:{ all -> 0x012d }
            X.2p4 r5 = r12.A04     // Catch:{ all -> 0x012d }
            X.3dV r0 = r5.A01     // Catch:{ all -> 0x012d }
            X.4Fq r8 = r0.A04()     // Catch:{ all -> 0x012d }
            X.3Yo r9 = r8.Axl()     // Catch:{ all -> 0x0123 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0119 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = "DELETE from user_device_info WHERE user_jid_row_id in (SELECT user_device_info.user_jid_row_id from user_device_info LEFT JOIN jid ON jid._id = user_device_info.user_jid_row_id WHERE jid.type = 18) "
            java.lang.String r0 = "CLEAR_ALL_LID_DEVICES_INFO_TO_RECOVER_FROM_S344119_USER_DEVICE_INFO_TABLE"
            r4.A0H(r1, r0)     // Catch:{ all -> 0x0119 }
            r9.A00()     // Catch:{ all -> 0x0119 }
            r0 = 28
            X.3Zk r0 = X.C69983Zk.A00(r5, r0)     // Catch:{ all -> 0x0119 }
            r8.B25(r0)     // Catch:{ all -> 0x0119 }
            r9.close()     // Catch:{ all -> 0x0123 }
            r8.close()     // Catch:{ all -> 0x012d }
            r6.A00()     // Catch:{ all -> 0x012d }
            r6.close()     // Catch:{ all -> 0x0134 }
            r3.close()     // Catch:{ all -> 0x013b }
            X.1RJ r0 = r12.A05     // Catch:{ all -> 0x013b }
            X.4Fq r3 = r0.A0C()     // Catch:{ all -> 0x013b }
            X.3Yo r6 = r3.Axl()     // Catch:{ all -> 0x0134 }
            X.2qF r0 = r12.A00     // Catch:{ all -> 0x012d }
            X.1RJ r0 = r0.A04     // Catch:{ all -> 0x012d }
            X.4Fq r8 = r0.A0C()     // Catch:{ all -> 0x012d }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0123 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "identities"
            java.lang.String r10 = "recipient_type = ? "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0123 }
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0123 }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "SignalIdentityKeyStore/removeAllLidIdentitiesToRecoverFromS344119"
            int r0 = r5.A07(r4, r10, r0, r1)     // Catch:{ all -> 0x0123 }
            long r0 = (long) r0     // Catch:{ all -> 0x0123 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0123 }
            java.lang.String r9 = "axolotl deleted "
            r4.append(r9)     // Catch:{ all -> 0x0123 }
            r4.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = " identities for all LID devices"
            X.C18260x0.A1L(r4, r0)     // Catch:{ all -> 0x0123 }
            r8.close()     // Catch:{ all -> 0x012d }
            X.2ot r0 = r12.A01     // Catch:{ all -> 0x012d }
            X.1RJ r0 = r0.A02     // Catch:{ all -> 0x012d }
            X.4Fq r8 = r0.A0C()     // Catch:{ all -> 0x012d }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0123 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "sessions"
            java.lang.String[] r1 = X.C18270x1.A1b(r11)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "SignalSessionStore/removeAllLidSessionsToRecoverFromS344119"
            int r0 = r5.A07(r4, r10, r0, r1)     // Catch:{ all -> 0x0123 }
            long r4 = (long) r0     // Catch:{ all -> 0x0123 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r9)     // Catch:{ all -> 0x0123 }
            r1.append(r4)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = " sessions for all LID devices"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0123 }
            r8.close()     // Catch:{ all -> 0x012d }
            r0 = 29
            X.3bp r0 = X.C71263bp.A00(r12, r0)     // Catch:{ all -> 0x012d }
            r3.B25(r0)     // Catch:{ all -> 0x012d }
            r6.A00()     // Catch:{ all -> 0x012d }
            r6.close()     // Catch:{ all -> 0x0134 }
            r3.close()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron/cleanUp/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x013b }
            r0 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x013b }
            r7.A05(r2, r0)     // Catch:{ all -> 0x013b }
        L_0x0117:
            monitor-exit(r2)
            return
        L_0x0119:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x011e }
            goto L_0x0122
        L_0x011e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0123 }
        L_0x0122:
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0128 }
            goto L_0x012c
        L_0x0128:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x012d }
        L_0x012c:
            throw r1     // Catch:{ all -> 0x012d }
        L_0x012d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DQ.A00():void");
    }

    public AnonymousClass3DQ(C55372qF r1, C54542ot r2, C55182pw r3, C72303dV r4, C54652p4 r5, AnonymousClass1RJ r6, C55432qL r7, C34441vA r8) {
        C18260x0.A0c(r7, r3, r8, r6);
        C18260x0.A0W(r4, r5, r1);
        this.A06 = r7;
        this.A02 = r3;
        this.A07 = r8;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
    }

    public String BDW() {
        return "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron";
    }

    public /* synthetic */ void BMd() {
    }

    public void BMe() {
        A00();
    }

    public /* synthetic */ void BQW() {
    }

    public void BQX() {
        A00();
    }
}
