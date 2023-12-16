package X;

import android.os.Handler;

/* renamed from: X.3Zk  reason: invalid class name and case insensitive filesystem */
public class C69983Zk implements Runnable {
    public Object A00;
    public final int A01;

    public C69983Zk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C69983Zk A00(Object obj, int i) {
        return new C69983Zk(obj, i);
    }

    public static void A01(Handler handler, Object obj, int i) {
        handler.post(new C69983Zk(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v8, types: [int] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x044d, code lost:
        r1.A0H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0450, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04cb, code lost:
        r4.setResult(r3, r2.putExtra(r1, r0));
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0509, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x050c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x09aa, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x09ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0a8d, code lost:
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0a90, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r1.onError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01cd, code lost:
        if (r4 != null) goto L_0x01a1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r1 = r26
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x01f2;
                case 2: goto L_0x0203;
                case 3: goto L_0x0477;
                case 4: goto L_0x048b;
                case 5: goto L_0x0493;
                case 6: goto L_0x04b0;
                case 7: goto L_0x0493;
                case 8: goto L_0x04d4;
                case 9: goto L_0x04dc;
                case 10: goto L_0x04e4;
                case 11: goto L_0x04f1;
                case 12: goto L_0x04fe;
                case 13: goto L_0x0219;
                case 14: goto L_0x025b;
                case 15: goto L_0x050d;
                case 16: goto L_0x0295;
                case 17: goto L_0x0515;
                case 18: goto L_0x0536;
                case 19: goto L_0x030f;
                case 20: goto L_0x0542;
                case 21: goto L_0x0320;
                case 22: goto L_0x054a;
                case 23: goto L_0x0338;
                case 24: goto L_0x0557;
                case 25: goto L_0x05a0;
                case 26: goto L_0x05ac;
                case 27: goto L_0x05b5;
                case 28: goto L_0x05c3;
                case 29: goto L_0x05c3;
                case 30: goto L_0x05cb;
                case 31: goto L_0x03ca;
                case 32: goto L_0x05eb;
                case 33: goto L_0x09a4;
                case 34: goto L_0x09ae;
                case 35: goto L_0x09b6;
                case 36: goto L_0x09be;
                case 37: goto L_0x03f2;
                case 38: goto L_0x0007;
                case 39: goto L_0x0007;
                case 40: goto L_0x09cc;
                case 41: goto L_0x0010;
                case 42: goto L_0x03fa;
                case 43: goto L_0x09d4;
                case 44: goto L_0x0a2e;
                case 45: goto L_0x0a43;
                case 46: goto L_0x0a6b;
                case 47: goto L_0x0451;
                case 48: goto L_0x0a91;
                case 49: goto L_0x0a9a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A00
            X.4A0 r1 = (X.AnonymousClass4A0) r1
            r0 = -1
        L_0x000c:
            r1.onError(r0)
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r3 = r1.A00
            X.2cW r3 = (X.C46982cW) r3
            X.3Wi r2 = r3.A01
            r1 = 2131889321(0x7f120ca9, float:1.9413302E38)
            r0 = 1
            r2.A0H(r1, r0)
            X.08M r1 = r3.A00
            X.2rR r0 = r3.A04
            java.lang.Integer r0 = r0.A05()
            goto L_0x044d
        L_0x0027:
            java.lang.Object r7 = r1.A00
            X.1Ep r7 = (X.C22121Ep) r7
            java.lang.String r0 = "crashlogs/uploadCachedLogs"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2oU r12 = r7.A07
            java.io.File r0 = X.C54292oU.A02(r12)
            java.lang.String r8 = "Crashes"
            java.io.File r0 = X.AnonymousClass0x7.A0e(r0, r8)
            java.io.File[] r6 = r0.listFiles()
            java.lang.String r9 = ".crash"
            r5 = 0
            if (r6 == 0) goto L_0x018b
            int r11 = r6.length
            r4 = 0
        L_0x0047:
            if (r4 >= r11) goto L_0x018b
            r10 = r6[r4]
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs found file: "
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r10, r0, r1)
            X.C18260x0.A1J(r1, r0)
            java.lang.String r0 = r10.getName()
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0120
            byte[] r1 = X.C382926u.A00(r10)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0171 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0171 }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r0 = "attachments"
            org.json.JSONObject r14 = r2.optJSONObject(r0)     // Catch:{ Exception -> 0x0171 }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x0171 }
            if (r14 != 0) goto L_0x00be
            java.lang.String r1 = "attachmentParam"
            java.lang.String r3 = r2.optString(r1)     // Catch:{ Exception -> 0x0171 }
            boolean r1 = r3.isEmpty()     // Catch:{ Exception -> 0x0171 }
            if (r1 != 0) goto L_0x0090
            java.lang.String r1 = "attachmentPath"
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x0171 }
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0171 }
        L_0x0090:
            java.lang.String r1 = "logFilePath"
            java.lang.String r16 = r2.getString(r1)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = "fromParam"
            java.lang.String r17 = r2.getString(r1)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = "forcedUpload"
            boolean r22 = r2.getBoolean(r1)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = "detailedException"
            boolean r23 = r2.getBoolean(r1)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = "tagsString"
            java.lang.String r18 = r2.getString(r1)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = "timeMillis"
            long r20 = r2.getLong(r1)     // Catch:{ Exception -> 0x0171 }
            X.2Sq r15 = new X.2Sq     // Catch:{ Exception -> 0x0171 }
            r19 = r0
            r15.<init>(r16, r17, r18, r19, r20, r22, r23)     // Catch:{ Exception -> 0x0171 }
            goto L_0x00d4
        L_0x00be:
            java.util.Iterator r13 = r14.keys()     // Catch:{ Exception -> 0x0171 }
        L_0x00c2:
            boolean r1 = r13.hasNext()     // Catch:{ Exception -> 0x0171 }
            if (r1 == 0) goto L_0x0090
            java.lang.String r3 = X.AnonymousClass001.A0m(r13)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = r14.getString(r3)     // Catch:{ Exception -> 0x0171 }
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0171 }
            goto L_0x00c2
        L_0x00d4:
            long r2 = r15.A00
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.HOURS
            r0 = 2
            long r0 = r13.toMillis(r0)
            long r2 = r2 + r0
            long r13 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0129
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs trying to upload, path="
            r1.append(r0)
            java.lang.String r14 = r15.A02
            r1.append(r14)
            java.lang.String r0 = " forced="
            r1.append(r0)
            boolean r13 = r15.A06
            X.C18260x0.A1U(r1, r13)
            java.lang.String r3 = r15.A01
            boolean r2 = r15.A05
            java.lang.String r1 = r15.A03
            java.util.Map r0 = r15.A04
            r16 = r7
            r17 = r14
            r18 = r3
            r19 = r1
            r20 = r0
            r21 = r13
            r22 = r2
            boolean r0 = r16.A0H(r17, r18, r19, r20, r21, r22)
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "crashlogs/uploadCachedLogs upload failed"
        L_0x011d:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0120:
            int r4 = r4 + 1
            goto L_0x0047
        L_0x0124:
            java.lang.String r0 = "crashlogs/uploadCachedLogs uploaded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0129:
            java.lang.String r0 = r15.A02
            java.io.File r0 = X.AnonymousClass002.A0B(r0)
            boolean r2 = r0.delete()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs/cleanup logfile deleted="
            X.C18260x0.A1D(r0, r1, r2)
            java.util.Map r0 = r15.A04
            java.util.Iterator r13 = X.AnonymousClass001.A0v(r0)
        L_0x0142:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x017c
            java.lang.String r0 = X.AnonymousClass001.A0m(r13)
            java.io.File r0 = X.AnonymousClass002.A0B(r0)
            java.io.File r3 = r0.getParentFile()
            boolean r2 = r0.delete()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs/cleanup attachment deleted="
            X.C18260x0.A1D(r0, r1, r2)
            if (r3 == 0) goto L_0x0142
            boolean r2 = r3.delete()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs/cleanup parentDir deleted="
            X.C18260x0.A1D(r0, r1, r2)
            goto L_0x0142
        L_0x0171:
            r1 = move-exception
            java.lang.String r0 = "app/CrashLogs/deserializeCrashData: could not deserialize stored crash data"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = "crashlogs/uploadCachedLogs no data"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x017c:
            boolean r2 = r10.delete()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs/cleanup file deleted="
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r2)
            goto L_0x011d
        L_0x018b:
            java.io.File r0 = X.C54292oU.A02(r12)
            java.io.File r0 = X.AnonymousClass0x7.A0e(r0, r8)
            java.io.File[] r4 = r0.listFiles()
            if (r4 == 0) goto L_0x01c2
            int r0 = r4.length
            if (r0 == 0) goto L_0x01c2
            java.lang.String r0 = "crashlogs/uploadCachedLogs/not-empty"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x01a1:
            int r3 = r4.length
            r1 = 0
        L_0x01a3:
            if (r5 >= r3) goto L_0x01d0
            r2 = r4[r5]
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x01bf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs/found-again path="
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r2, r0, r1)
            X.C18260x0.A1J(r1, r0)
            r1 = 1
        L_0x01bf:
            int r5 = r5 + 1
            goto L_0x01a3
        L_0x01c2:
            java.lang.String r0 = "crashlogs/uploadCachedLogs/unregister"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.os.Handler r1 = r7.A01
            r0 = 1
            A01(r1, r7, r0)
            if (r4 == 0) goto L_0x01d1
            goto L_0x01a1
        L_0x01d0:
            r5 = r1
        L_0x01d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs/crash-files-found yes="
            X.C18260x0.A1D(r0, r1, r5)
            if (r5 != 0) goto L_0x000f
            java.io.File r0 = X.C54292oU.A02(r12)
            java.io.File r0 = X.AnonymousClass0x7.A0e(r0, r8)
            boolean r2 = r0.delete()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crashlogs/uploadCachedLogs/crash-files-found deleted="
            X.C18260x0.A1D(r0, r1, r2)
            return
        L_0x01f2:
            java.lang.Object r2 = r1.A00
            X.1Ep r2 = (X.C22121Ep) r2
            X.49Y r1 = r2.A00
            if (r1 == 0) goto L_0x000f
            X.1ip r0 = r2.A05
            r0.A07(r1)
            r0 = 0
            r2.A00 = r0
            return
        L_0x0203:
            java.lang.Object r2 = r1.A00
            X.1Ep r2 = (X.C22121Ep) r2
            X.49Y r0 = r2.A00
            if (r0 != 0) goto L_0x000f
            r0 = 1
            X.4IF r1 = new X.4IF
            r1.<init>(r2, r0)
            r2.A00 = r1
            X.1ip r0 = r2.A05
            r0.A06(r1)
            return
        L_0x0219:
            java.lang.Object r2 = r1.A00
            X.5RH r2 = (X.AnonymousClass5RH) r2
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x000f
            int r1 = r2.A0H
            r0 = 2
            if (r1 != r0) goto L_0x000f
            r0 = 12
            X.3Zk r4 = A00(r2, r0)
            X.4ZC r3 = r2.A09
            X.C626936e.A04(r3)
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x000f
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x000f
            int r1 = r3.getHeight()
            if (r1 <= 0) goto L_0x0aa9
            r0 = 1
            r3.A0E = r0
            X.0yf r2 = new X.0yf
            r2.<init>(r3, r1)
            r1 = 1
            X.4H5 r0 = new X.4H5
            r0.<init>(r3, r1, r4)
            r2.setAnimationListener(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x025b:
            java.lang.Object r2 = r1.A00
            X.5RH r2 = (X.AnonymousClass5RH) r2
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x000f
            int r1 = r2.A0H
            r0 = 2
            if (r1 != r0) goto L_0x000f
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x000f
            r0 = 11
            X.3Zk r3 = A00(r2, r0)
            X.4ZC r2 = r2.A09
            X.C626936e.A04(r2)
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x000f
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x000f
            r0 = 1
            X.91a r1 = new X.91a
            r1.<init>(r3, r0, r2)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
            r0 = 0
            r2.setVisibility(r0)
            return
        L_0x0295:
            java.lang.Object r3 = r1.A00
            X.2hT r3 = (X.C50002hT) r3
            X.33p r2 = r3.A03
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r1 = "tos_2016_opt_out_state"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x02b0
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            X.C18280x3.A1W(r0, r1)
            return
        L_0x02b0:
            r7 = 1
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x000f
            X.1VX r2 = r3.A05
            r1 = 1624(0x658, float:2.276E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x000f
            r3.A00 = r7
            X.2Fo r4 = r3.A04
            X.08M r2 = X.AnonymousClass08M.A01()
            X.31C r8 = r4.A00
            java.lang.String r11 = r8.A03()
            java.lang.String r0 = "accept"
            X.36K r6 = X.AnonymousClass36K.A0H(r0)
            X.39V[] r5 = X.AnonymousClass0x9.A1W()
            X.39V r1 = X.AnonymousClass39V.A00()
            r0 = 0
            r5[r0] = r1
            java.lang.String r0 = "id"
            X.AnonymousClass39V.A0B(r0, r11, r5, r7)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.AnonymousClass39V.A06(r1, r0, r5)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.36K r10 = X.AnonymousClass36K.A0E(r6, r1, r0, r5)
            r12 = 322(0x142, float:4.51E-43)
            r0 = 0
            X.4KT r9 = new X.4KT
            r9.<init>(r2, r0, r4)
            r13 = 0
            r8.A0E(r9, r10, r11, r12, r13)
            r1 = 86
            X.4K2 r0 = new X.4K2
            r0.<init>(r3, r1)
            r2.A0E(r0)
            return
        L_0x030f:
            java.lang.Object r0 = r1.A00
            X.2r8 r0 = (X.C55922r8) r0
            X.5Xp r1 = r0.A07
            X.2pB r0 = r1.A01
            if (r0 == 0) goto L_0x000f
            r0.A00()
            r0 = 0
            r1.A01 = r0
            return
        L_0x0320:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0328:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r1.next()
            X.4FD r0 = (X.AnonymousClass4FD) r0
            r0.BLd()
            goto L_0x0328
        L_0x0338:
            java.lang.Object r5 = r1.A00
            X.35r r5 = (X.C625835r) r5
            X.2fA r0 = r5.A0V
            java.lang.String r1 = "message_fts"
            X.31D r10 = r0.A02(r1)
            if (r10 == 0) goto L_0x000f
            boolean r0 = r10.A0M()
            if (r0 != 0) goto L_0x03ae
            X.1XK r7 = new X.1XK
            r7.<init>()
            java.lang.String r0 = "MessageStoreBackup/ftsMigration"
            X.33M r9 = X.AnonymousClass33M.A01(r0)
            java.util.HashSet r6 = X.C18300x5.A0x(r1)
            r4 = 1
            X.4Cg[] r3 = new X.C84414Cg[r4]
            X.1il r2 = r5.A0A
            X.2sH r1 = r5.A0D
            X.3Ep r0 = new X.3Ep
            r0.<init>(r2, r1)
            r8 = 0
            r3[r8] = r0
            X.2Vr r2 = new X.2Vr
            r2.<init>(r3)
            X.30D r1 = r5.A0U
            r0 = 7
            boolean r0 = r1.A06(r2, r6, r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A00 = r0
            X.1vA r6 = r5.A0k
            java.lang.String r4 = "fts_migration_elapsed_time_in_ms"
            r0 = 0
            java.lang.String r2 = r6.A02(r4)
            long r2 = X.C615531h.A04(r2, r0)
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x03c0
            X.33p r0 = r5.A0G
            r0.A11(r8)
            long r0 = r9.A07()
            long r0 = r0 + r2
            long r0 = X.C18290x4.A0B(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A01 = r0
            X.4FV r0 = r5.A0a
            r0.BhD(r7)
            r0 = 0
        L_0x03ab:
            r6.A05(r4, r0)
        L_0x03ae:
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x000f
            X.33p r0 = r5.A0G
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "backup_restore_state"
            X.C18270x1.A0g(r1, r0)
            return
        L_0x03c0:
            long r0 = r9.A07()
            long r2 = r2 + r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            goto L_0x03ab
        L_0x03ca:
            java.lang.Object r2 = r1.A00
            X.2nP r2 = (X.C53632nP) r2
            java.lang.String r0 = "CriticalDataUploadManager/startCriticalDataBootstrap timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2yx r1 = r2.A00
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x000f
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x000f
            r0 = 1
            r1.A02 = r0
            X.2rF r0 = r1.A01
            r0.A02()
            X.2rF r0 = r1.A00
            r0.A02()
            r2.A00()
            return
        L_0x03f2:
            java.lang.Object r1 = r1.A00
            X.4A0 r1 = (X.AnonymousClass4A0) r1
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x000c
        L_0x03fa:
            java.lang.Object r6 = r1.A00
            X.3Sj r6 = (X.C68233Sj) r6
            X.1Yx r5 = new X.1Yx
            r5.<init>()
            int r3 = r6.A00
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r3)
            r5.A02 = r0
            X.2cW r4 = r6.A02
            X.2rR r2 = r4.A04
            java.lang.Integer r0 = r2.A05()
            java.lang.Long r0 = X.C18280x3.A0U(r0)
            r5.A03 = r0
            X.2YA r0 = r2.A05
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "disappearing_mode_timestamp"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A01 = r0
            int r0 = r6.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            X.4FV r0 = r4.A05
            r0.BhD(r5)
            int r0 = X.C56112rR.A00(r2)
            if (r3 == r0) goto L_0x000f
            X.2sH r0 = r4.A03
            long r0 = r0.A0H()
            r2.A06(r3, r0)
            X.08M r1 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x044d:
            r1.A0H(r0)
            return
        L_0x0451:
            java.lang.Object r2 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r2 = (com.whatsapp.email.VerifyEmailActivity) r2
            com.whatsapp.CodeInputField r0 = r2.A03
            if (r0 != 0) goto L_0x0460
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0460:
            java.lang.String r0 = r0.getCode()
            int r1 = r0.length()
            r0 = 6
            if (r1 != r0) goto L_0x000f
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0A
            if (r1 != 0) goto L_0x0aaf
            java.lang.String r0 = "verifyBtn"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0477:
            java.lang.Object r0 = r1.A00
            X.3DM r0 = (X.AnonymousClass3DM) r0
            X.2oU r0 = r0.A05
            java.io.File r1 = X.C54292oU.A03(r0)
            java.lang.String r0 = "crash_counter"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)
            X.C18270x1.A0x(r0)
            return
        L_0x048b:
            java.lang.Object r0 = r1.A00
            X.2gX r0 = (X.C49442gX) r0
            r0.A01()
            return
        L_0x0493:
            java.lang.Object r4 = r1.A00
            android.app.Activity r4 = (android.app.Activity) r4
            r3 = 0
            java.lang.String r0 = "profileinfo/activityres/fail/not-a-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "not-a-image"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889079(0x7f120bb7, float:1.9412811E38)
            goto L_0x04cb
        L_0x04b0:
            java.lang.Object r4 = r1.A00
            android.app.Activity r4 = (android.app.Activity) r4
            r3 = 0
            java.lang.String r0 = "profileinfo/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "error-oom"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889108(0x7f120bd4, float:1.941287E38)
        L_0x04cb:
            android.content.Intent r0 = r2.putExtra(r1, r0)
            r4.setResult(r3, r0)
            goto L_0x0a8d
        L_0x04d4:
            java.lang.Object r0 = r1.A00
            X.3Ff r0 = (X.C64843Ff) r0
            r0.A00()
            return
        L_0x04dc:
            java.lang.Object r0 = r1.A00
            X.33n r0 = (X.C621133n) r0
            r0.A0J()
            return
        L_0x04e4:
            java.lang.Object r1 = r1.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x04f1:
            java.lang.Object r0 = r1.A00
            X.5RH r0 = (X.AnonymousClass5RH) r0
            X.5KX r0 = r0.A06
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A05
            android.view.View r1 = r0.A01
            r0 = 8
            goto L_0x0509
        L_0x04fe:
            java.lang.Object r0 = r1.A00
            X.5RH r0 = (X.AnonymousClass5RH) r0
            X.5KX r0 = r0.A06
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A05
            android.view.View r1 = r0.A01
            r0 = 0
        L_0x0509:
            r1.setVisibility(r0)
            return
        L_0x050d:
            java.lang.Object r0 = r1.A00
            X.2hT r0 = (X.C50002hT) r0
            r0.A00()
            return
        L_0x0515:
            java.lang.Object r3 = r1.A00
            X.2ah r3 = (X.C45862ah) r3
            java.lang.String r0 = "WebPagePreviewViewModel/CTWAListener/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.4UA r2 = r3.A03
            X.3Ls r1 = r2.A01
            X.59D r0 = X.AnonymousClass59D.LOADING_FAILED
            r2.A0G(r1, r0)
            X.08M r4 = r3.A00
            X.7Ns r3 = r3.A02
            r2 = 0
            r1 = 0
            X.2NW r0 = new X.2NW
            r0.<init>(r1, r3, r2)
            r4.A0G(r0)
            return
        L_0x0536:
            java.lang.Object r0 = r1.A00
            X.3TZ r0 = (X.AnonymousClass3TZ) r0
            X.2ah r1 = r0.A05
            r0 = 422(0x1a6, float:5.91E-43)
            r1.A00(r0)
            return
        L_0x0542:
            java.lang.Object r0 = r1.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x054a:
            java.lang.Object r4 = r1.A00
            X.2pj r4 = (X.C55062pj) r4
            r3 = 0
            X.3bj r2 = r4.A07
            r0 = 0
            r4.A01(r2, r0, r3)
            return
        L_0x0557:
            java.lang.Object r0 = r1.A00
            X.2qK r0 = (X.C55422qK) r0
            X.3dV r0 = r0.A05
            X.4Fq r8 = r0.A04()
            java.lang.String r7 = "scheduled_timestamp < ? AND call_log_row_id IS NULL"
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0596 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0596 }
            java.lang.String r5 = "scheduled_calls"
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0596 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0596 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            X.C18260x0.A1Y(r4, r2)     // Catch:{ all -> 0x0596 }
            java.lang.String r0 = "ScheduledCallsStore/DELETE_EXPIRED_SCHEDULED_CALLS"
            int r2 = r6.A07(r5, r7, r0, r4)     // Catch:{ all -> 0x0596 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0596 }
            java.lang.String r0 = "ScheduledCallsStore/deleteExpiredScheduledCalls "
            r1.append(r0)     // Catch:{ all -> 0x0596 }
            r1.append(r2)     // Catch:{ all -> 0x0596 }
            java.lang.String r0 = " deleted"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0596 }
            r8.close()
            return
        L_0x0596:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x059b }
            throw r1
        L_0x059b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x05a0:
            java.lang.Object r0 = r1.A00
            X.2pt r0 = (X.C55152pt) r0
            X.1io r1 = r0.A0C
            X.6kE r0 = X.C135166kE.A00
            r1.A08(r0)
            return
        L_0x05ac:
            java.lang.Object r1 = r1.A00
            X.2pt r1 = (X.C55152pt) r1
            r0 = 1
            r1.A02(r0)
            return
        L_0x05b5:
            java.lang.Object r0 = r1.A00
            X.2pt r0 = (X.C55152pt) r0
            r1 = 0
            r0.A02(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0N
            r0.set(r1)
            return
        L_0x05c3:
            java.lang.Object r0 = r1.A00
            X.2p4 r0 = (X.C54652p4) r0
            java.util.Map r0 = r0.A03
            goto L_0x09aa
        L_0x05cb:
            java.lang.Object r4 = r1.A00
            X.1iB r4 = (X.C29041iB) r4
            X.2s7 r3 = r4.A0K
            X.2fq r1 = r3.A04
            X.8OQ r0 = r1.A00()
            X.6aS r2 = r0.keySet()
            X.8OQ r0 = r1.A00()
            X.6aS r1 = r0.keySet()
            r0 = 0
            r3.A06(r1, r0)
            r4.A0F(r2)
            return
        L_0x05eb:
            java.lang.Object r7 = r1.A00
            X.3Co r7 = (X.C64203Co) r7
            monitor-enter(r7)
            X.2sr r0 = r7.A00     // Catch:{ all -> 0x09a1 }
            r25 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r25)     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x099f
            X.318 r10 = r7.A0B     // Catch:{ all -> 0x09a1 }
            X.2sH r0 = r10.A02     // Catch:{ all -> 0x09a1 }
            long r16 = r0.A0F()     // Catch:{ all -> 0x09a1 }
            java.util.HashSet r6 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x09a1 }
            X.33p r0 = r7.A06     // Catch:{ all -> 0x09a1 }
            r24 = r0
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r24)     // Catch:{ all -> 0x09a1 }
            java.lang.String r22 = "adv_last_daily_check_ts"
            r0 = r22
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)     // Catch:{ all -> 0x09a1 }
            long r3 = r16 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0984
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo run daily check"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x09a1 }
            X.3dV r0 = r7.A08     // Catch:{ all -> 0x09a1 }
            boolean r0 = X.C72303dV.A00(r0)     // Catch:{ all -> 0x09a1 }
            if (r0 != 0) goto L_0x0633
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo msg store is not ready"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x09a1 }
            goto L_0x099f
        L_0x0633:
            X.2sH r0 = r7.A05     // Catch:{ all -> 0x09a1 }
            long r4 = X.C56612sH.A00(r0)     // Catch:{ all -> 0x09a1 }
            X.1VX r8 = r7.A0C     // Catch:{ all -> 0x09a1 }
            r0 = 730(0x2da, float:1.023E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ all -> 0x09a1 }
            int r1 = r8.A0O(r3, r0)     // Catch:{ all -> 0x09a1 }
            r0 = 1
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x09a1 }
            r0 = 35
            int r2 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x09a1 }
            r0 = 731(0x2db, float:1.024E-42)
            int r1 = r8.A0O(r3, r0)     // Catch:{ all -> 0x09a1 }
            r0 = 0
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x09a1 }
            r0 = 35
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x09a1 }
            int r2 = r2 - r0
            long r0 = (long) r2     // Catch:{ all -> 0x09a1 }
            r2 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 * r2
            long r18 = r4 - r0
            X.2s7 r13 = r10.A05     // Catch:{ all -> 0x09a1 }
            X.2p4 r12 = r13.A02     // Catch:{ all -> 0x09a1 }
            java.util.HashMap r9 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x09a1 }
            X.34p r11 = r12.A00     // Catch:{ all -> 0x09a1 }
            X.3dV r0 = r11.A01     // Catch:{ all -> 0x09a1 }
            boolean r0 = X.C72303dV.A00(r0)     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x06e7
            java.util.HashMap r8 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x09a1 }
            X.3dV r0 = r12.A01     // Catch:{ all -> 0x09a1 }
            X.4GK r21 = r0.get()     // Catch:{ all -> 0x09a1 }
            r0 = r21
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x08aa }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x08aa }
            java.lang.String r3 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type, user_jid_row_id FROM user_device_info WHERE timestamp < ? OR timestamp < expected_timestamp"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x08aa }
            r0 = r18
            X.C18260x0.A1Y(r2, r0)     // Catch:{ all -> 0x08aa }
            java.lang.String r0 = "GET_ALL_USER_ADV_TIMESTAMPS_EXPIRING"
            android.database.Cursor r3 = r14.A0E(r3, r0, r2)     // Catch:{ all -> 0x08aa }
            java.lang.String r0 = "user_jid_row_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x06df }
        L_0x06a1:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x06b3
            X.2yB r1 = r12.A00(r3)     // Catch:{ all -> 0x06df }
            java.lang.Long r0 = X.C18280x3.A0T(r3, r2)     // Catch:{ all -> 0x06df }
            r8.put(r0, r1)     // Catch:{ all -> 0x06df }
            goto L_0x06a1
        L_0x06b3:
            r3.close()     // Catch:{ all -> 0x08aa }
            r21.close()     // Catch:{ all -> 0x09a1 }
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.util.Set r0 = r8.keySet()     // Catch:{ all -> 0x09a1 }
            java.util.Map r2 = r11.A0D(r1, r0)     // Catch:{ all -> 0x09a1 }
            java.util.Iterator r3 = X.AnonymousClass001.A0u(r8)     // Catch:{ all -> 0x09a1 }
        L_0x06c7:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x06e7
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)     // Catch:{ all -> 0x09a1 }
            java.lang.Object r1 = X.AnonymousClass0x7.A0k(r0, r2)     // Catch:{ all -> 0x09a1 }
            if (r1 == 0) goto L_0x06c7
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x09a1 }
            r9.put(r1, r0)     // Catch:{ all -> 0x09a1 }
            goto L_0x06c7
        L_0x06df:
            r1 = move-exception
            if (r3 == 0) goto L_0x08a9
            r3.close()     // Catch:{ all -> 0x08a5 }
            goto L_0x08a9
        L_0x06e7:
            X.2sr r1 = r13.A00     // Catch:{ all -> 0x09a1 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r1)     // Catch:{ all -> 0x09a1 }
            r9.remove(r0)     // Catch:{ all -> 0x09a1 }
            X.1fH r0 = r1.A0H()     // Catch:{ all -> 0x09a1 }
            r9.remove(r0)     // Catch:{ all -> 0x09a1 }
            java.util.HashMap r12 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x09a1 }
            java.util.HashSet r11 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x09a1 }
            java.util.Iterator r13 = X.AnonymousClass001.A0u(r9)     // Catch:{ all -> 0x09a1 }
        L_0x0703:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x075f
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r13)     // Catch:{ all -> 0x09a1 }
            com.whatsapp.jid.UserJid r8 = X.C18320x8.A0P(r0)     // Catch:{ all -> 0x09a1 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x09a1 }
            X.2yB r3 = (X.C60212yB) r3     // Catch:{ all -> 0x09a1 }
            boolean r0 = X.C627336j.A0L(r8)     // Catch:{ all -> 0x09a1 }
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x075a
            X.2sM r0 = r7.A09     // Catch:{ all -> 0x09a1 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56662sM.A00(r0, r8)     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x075a
            java.util.Map r0 = r10.A09(r0)     // Catch:{ all -> 0x09a1 }
        L_0x072b:
            int r0 = r0.size()     // Catch:{ all -> 0x09a1 }
            if (r0 <= r1) goto L_0x0732
            r2 = 1
        L_0x0732:
            boolean r0 = r7.A00(r3, r4)     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x0751
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x09a1 }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo remove expired user="
            r1.append(r0)     // Catch:{ all -> 0x09a1 }
            r1.append(r8)     // Catch:{ all -> 0x09a1 }
            java.lang.String r0 = "; hasCompanion="
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r2)     // Catch:{ all -> 0x09a1 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09a1 }
            r0 = 0
            r12.put(r8, r0)     // Catch:{ all -> 0x09a1 }
        L_0x0751:
            r6.add(r8)     // Catch:{ all -> 0x09a1 }
            if (r2 != 0) goto L_0x0703
            r11.add(r8)     // Catch:{ all -> 0x09a1 }
            goto L_0x0703
        L_0x075a:
            java.util.Map r0 = r10.A09(r8)     // Catch:{ all -> 0x09a1 }
            goto L_0x072b
        L_0x075f:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x09a1 }
            if (r0 != 0) goto L_0x092d
            X.314 r0 = r7.A04     // Catch:{ all -> 0x09a1 }
            java.util.Set r3 = r0.A0B()     // Catch:{ all -> 0x09a1 }
            java.util.HashSet r8 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x09a1 }
            java.util.HashSet r14 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x09a1 }
            java.util.Iterator r20 = r6.iterator()     // Catch:{ all -> 0x09a1 }
        L_0x0777:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x07bd
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r20)     // Catch:{ all -> 0x09a1 }
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x09a1 }
            if (r0 != 0) goto L_0x0777
            X.2sM r0 = r7.A09     // Catch:{ all -> 0x09a1 }
            java.util.Set r2 = r0.A07(r1)     // Catch:{ all -> 0x09a1 }
            java.util.Iterator r15 = r2.iterator()     // Catch:{ all -> 0x09a1 }
        L_0x0791:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x07b9
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r15)     // Catch:{ all -> 0x09a1 }
            X.3Ex r0 = r7.A02     // Catch:{ all -> 0x09a1 }
            boolean r13 = r0.A0l(r1)     // Catch:{ all -> 0x09a1 }
            if (r13 != 0) goto L_0x07b5
            boolean r13 = r3.contains(r1)     // Catch:{ all -> 0x09a1 }
            if (r13 != 0) goto L_0x07b5
            X.3ZH r0 = r0.A07(r1)     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x0791
            boolean r0 = r0.A0R()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x0791
        L_0x07b5:
            r8.addAll(r2)     // Catch:{ all -> 0x09a1 }
            goto L_0x0777
        L_0x07b9:
            r14.addAll(r2)     // Catch:{ all -> 0x09a1 }
            goto L_0x0777
        L_0x07bd:
            X.2sj r13 = r7.A07     // Catch:{ all -> 0x09a1 }
            java.util.HashSet r3 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x09a1 }
            X.2ba r0 = r13.A06     // Catch:{ all -> 0x09a1 }
            java.util.Map r0 = r0.A04     // Catch:{ all -> 0x09a1 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x09a1 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x09a1 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x09a1 }
        L_0x07d3:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x07ea
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x09a1 }
            X.33k r0 = (X.C620833k) r0     // Catch:{ all -> 0x09a1 }
            X.6aS r0 = r0.A02()     // Catch:{ all -> 0x09a1 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x09a1 }
            X.C73743g0.A0W(r0, r1)     // Catch:{ all -> 0x09a1 }
            goto L_0x07d3
        L_0x07ea:
            java.util.Set r2 = X.C73723fy.A0P(r1)     // Catch:{ all -> 0x09a1 }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x09a1 }
            java.util.Iterator r15 = r14.iterator()     // Catch:{ all -> 0x09a1 }
        L_0x07f6:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x080e
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x09a1 }
            boolean r14 = r2.contains(r0)     // Catch:{ all -> 0x09a1 }
            if (r14 == 0) goto L_0x080a
            r3.add(r0)     // Catch:{ all -> 0x09a1 }
            goto L_0x07f6
        L_0x080a:
            r1.add(r0)     // Catch:{ all -> 0x09a1 }
            goto L_0x07f6
        L_0x080e:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x09a1 }
            if (r0 != 0) goto L_0x08ba
            X.33h r2 = r13.A09     // Catch:{ all -> 0x09a1 }
            java.lang.String r0 = ""
            X.C626936e.A09(r0, r1)     // Catch:{ all -> 0x09a1 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x09a1 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x09a1 }
        L_0x0823:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x0835
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r14)     // Catch:{ all -> 0x09a1 }
            long r0 = r2.A05(r0)     // Catch:{ all -> 0x09a1 }
            X.C18280x3.A1K(r13, r0)     // Catch:{ all -> 0x09a1 }
            goto L_0x0823
        L_0x0835:
            java.lang.String[] r0 = X.C58152un.A0N     // Catch:{ all -> 0x09a1 }
            java.lang.Object[] r14 = r13.toArray(r0)     // Catch:{ all -> 0x09a1 }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x09a1 }
            X.3dV r0 = r2.A0A     // Catch:{ all -> 0x09a1 }
            X.4GK r21 = r0.get()     // Catch:{ all -> 0x09a1 }
            r13 = 975(0x3cf, float:1.366E-42)
            X.3ct r20 = new X.3ct     // Catch:{ all -> 0x08aa }
            r0 = r20
            r0.<init>(r14, r13)     // Catch:{ all -> 0x08aa }
        L_0x084e:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x08aa }
            if (r0 == 0) goto L_0x08b4
            java.lang.String[] r14 = X.C71923ct.A01(r20)     // Catch:{ all -> 0x08aa }
            r0 = r21
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x08aa }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x08aa }
            r23 = r0
            int r15 = r14.length     // Catch:{ all -> 0x08aa }
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x08aa }
            java.lang.String r0 = "SELECT user_jid_row_id FROM group_participant_user WHERE user_jid_row_id IN "
            X.C57212tH.A02(r0, r13, r15)     // Catch:{ all -> 0x08aa }
            java.lang.String r15 = r13.toString()     // Catch:{ all -> 0x08aa }
            java.lang.String r13 = "GET_USERS_IN_ANY_GROUP_BY_USER_JIDS_SQL"
            r0 = r23
            android.database.Cursor r13 = r0.A0E(r15, r13, r14)     // Catch:{ all -> 0x08aa }
            java.lang.String r0 = "user_jid_row_id"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x089e }
            java.util.HashSet r15 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x089e }
        L_0x0881:
            boolean r14 = r13.moveToNext()     // Catch:{ all -> 0x089e }
            if (r14 == 0) goto L_0x088b
            X.C18260x0.A0H(r13, r15, r0)     // Catch:{ all -> 0x089e }
            goto L_0x0881
        L_0x088b:
            X.34p r14 = r2.A09     // Catch:{ all -> 0x089e }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.Map r0 = r14.A0D(r0, r15)     // Catch:{ all -> 0x089e }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x089e }
            r1.addAll(r0)     // Catch:{ all -> 0x089e }
            r13.close()     // Catch:{ all -> 0x08aa }
            goto L_0x084e
        L_0x089e:
            r1 = move-exception
            if (r13 == 0) goto L_0x08a9
            r13.close()     // Catch:{ all -> 0x08a5 }
            goto L_0x08a9
        L_0x08a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08aa }
        L_0x08a9:
            throw r1     // Catch:{ all -> 0x08aa }
        L_0x08aa:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x08af }
            goto L_0x08b3
        L_0x08af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09a1 }
        L_0x08b3:
            throw r1     // Catch:{ all -> 0x09a1 }
        L_0x08b4:
            r21.close()     // Catch:{ all -> 0x09a1 }
            r3.addAll(r1)     // Catch:{ all -> 0x09a1 }
        L_0x08ba:
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x09a1 }
        L_0x08be:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x08d2
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)     // Catch:{ all -> 0x09a1 }
            X.2sM r0 = r7.A09     // Catch:{ all -> 0x09a1 }
            java.util.Set r0 = r0.A07(r1)     // Catch:{ all -> 0x09a1 }
            r8.addAll(r0)     // Catch:{ all -> 0x09a1 }
            goto L_0x08be
        L_0x08d2:
            java.util.Iterator r15 = r6.iterator()     // Catch:{ all -> 0x09a1 }
        L_0x08d6:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x092d
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r15)     // Catch:{ all -> 0x09a1 }
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x09a1 }
            if (r0 != 0) goto L_0x08f8
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x09a1 }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo remove user="
            X.C18260x0.A1S(r2, r0, r1)     // Catch:{ all -> 0x09a1 }
            java.lang.String r0 = "device_not_in_contact_and_chat"
            r12.put(r1, r0)     // Catch:{ all -> 0x09a1 }
            r11.add(r1)     // Catch:{ all -> 0x09a1 }
            goto L_0x08d6
        L_0x08f8:
            boolean r0 = r12.containsKey(r1)     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x08d6
            boolean r0 = r11.contains(r1)     // Catch:{ all -> 0x09a1 }
            if (r0 != 0) goto L_0x08d6
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x09a1 }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo user has expired, jid="
            X.C18260x0.A1Q(r2, r0, r1)     // Catch:{ all -> 0x09a1 }
            X.2pv r14 = r7.A0A     // Catch:{ all -> 0x09a1 }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ all -> 0x09a1 }
            X.2yB r0 = (X.C60212yB) r0     // Catch:{ all -> 0x09a1 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x09a1 }
            long r2 = r0.A05     // Catch:{ all -> 0x09a1 }
            X.1Vx r13 = new X.1Vx     // Catch:{ all -> 0x09a1 }
            r13.<init>()     // Catch:{ all -> 0x09a1 }
            r0 = 3600(0xe10, double:1.7786E-320)
            java.lang.Long r0 = X.AnonymousClass0x9.A0o(r2, r0)     // Catch:{ all -> 0x09a1 }
            r13.A00 = r0     // Catch:{ all -> 0x09a1 }
            X.4FV r0 = r14.A00     // Catch:{ all -> 0x09a1 }
            r0.BhD(r13)     // Catch:{ all -> 0x09a1 }
            goto L_0x08d6
        L_0x092d:
            r6.removeAll(r11)     // Catch:{ all -> 0x09a1 }
            java.util.Iterator r2 = X.AnonymousClass001.A0u(r12)     // Catch:{ all -> 0x09a1 }
        L_0x0934:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x094a
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r2)     // Catch:{ all -> 0x09a1 }
            com.whatsapp.jid.UserJid r1 = X.C18320x8.A0P(r0)     // Catch:{ all -> 0x09a1 }
            java.lang.String r0 = X.AnonymousClass0x9.A12(r0)     // Catch:{ all -> 0x09a1 }
            r10.A0G(r1, r0)     // Catch:{ all -> 0x09a1 }
            goto L_0x0934
        L_0x094a:
            boolean r0 = r25.A0Y()     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x097b
            X.2yB r1 = r10.A05()     // Catch:{ all -> 0x09a1 }
            boolean r0 = r7.A00(r1, r4)     // Catch:{ all -> 0x09a1 }
            if (r0 == 0) goto L_0x0968
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo own device list expired, logging out"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x09a1 }
            X.2dy r2 = r7.A01     // Catch:{ all -> 0x09a1 }
            java.lang.String r1 = "invalid_adv_status"
            r0 = 1
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x09a1 }
            goto L_0x099f
        L_0x0968:
            long r3 = r1.A05     // Catch:{ all -> 0x09a1 }
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0974
            long r1 = r1.A02     // Catch:{ all -> 0x09a1 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x097b
        L_0x0974:
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r25)     // Catch:{ all -> 0x09a1 }
            r6.add(r0)     // Catch:{ all -> 0x09a1 }
        L_0x097b:
            r3 = r24
            r2 = r22
            r0 = r16
            X.C18260x0.A0M(r3, r2, r0)     // Catch:{ all -> 0x09a1 }
        L_0x0984:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x09a1 }
            if (r0 != 0) goto L_0x099f
            X.3Cp r0 = r7.A03     // Catch:{ all -> 0x09a1 }
            X.2gy r2 = r0.A00     // Catch:{ all -> 0x09a1 }
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]     // Catch:{ all -> 0x09a1 }
            java.lang.Object[] r1 = r6.toArray(r0)     // Catch:{ all -> 0x09a1 }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ all -> 0x09a1 }
            com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob r0 = new com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob     // Catch:{ all -> 0x09a1 }
            r0.<init>(r1)     // Catch:{ all -> 0x09a1 }
            r2.A02(r0)     // Catch:{ all -> 0x09a1 }
        L_0x099f:
            monitor-exit(r7)
            return
        L_0x09a1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x09a4:
            java.lang.Object r0 = r1.A00
            X.2G1 r0 = (X.AnonymousClass2G1) r0
            java.util.Map r0 = r0.A00
        L_0x09aa:
            r0.clear()
            return
        L_0x09ae:
            java.lang.Object r0 = r1.A00
            X.4Cp r0 = (X.C84504Cp) r0
            r0.BcX()
            return
        L_0x09b6:
            java.lang.Object r0 = r1.A00
            X.4Cp r0 = (X.C84504Cp) r0
            r0.BcU()
            return
        L_0x09be:
            java.lang.Object r1 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r1 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r1.A07
            r0.onScrollChanged()
            return
        L_0x09cc:
            java.lang.Object r0 = r1.A00
            com.whatsapp.deviceauth.DeviceCredentialsAuthPlugin r0 = (com.whatsapp.deviceauth.DeviceCredentialsAuthPlugin) r0
            r0.A03()
            return
        L_0x09d4:
            java.lang.Object r8 = r1.A00
            com.whatsapp.email.EmailVerificationActivity r8 = (com.whatsapp.email.EmailVerificationActivity) r8
            java.lang.String r0 = "EmailVerificationActivity/verify email"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2eI r3 = r8.A04
            if (r3 == 0) goto L_0x0a27
            java.lang.String r2 = r8.A05
            int r1 = r8.A00
            r0 = 17
            r3.A01(r2, r1, r0)
            X.5hX r7 = r8.A00
            X.33p r0 = r8.A09
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "settings_verification_email_address"
            java.lang.String r6 = X.C18280x3.A0Z(r1, r0)
            if (r6 == 0) goto L_0x0a22
            int r5 = r8.A00
            java.lang.String r4 = r8.A05
            r3 = 2
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.email.VerifyEmailActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "email"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "state"
            r2.putExtra(r0, r3)
            X.C18310x6.A10(r2, r4, r5)
            r7.A0A(r8, r2)
            r8.finish()
            return
        L_0x0a22:
            java.lang.IllegalStateException r1 = X.C18290x4.A0Y()
            throw r1
        L_0x0a27:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        L_0x0a2e:
            java.lang.Object r3 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r3 = (com.whatsapp.email.VerifyEmailActivity) r3
            X.5hX r2 = r3.A00
            int r1 = r3.A00
            java.lang.String r0 = r3.A0B
            android.content.Intent r0 = X.C627736r.A0v(r3, r0, r1)
            r2.A0A(r3, r0)
            r3.finish()
            return
        L_0x0a43:
            java.lang.Object r3 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r3 = (com.whatsapp.email.VerifyEmailActivity) r3
            com.whatsapp.WaTextView r2 = r3.A05
            java.lang.String r1 = "resendCodeText"
            if (r2 != 0) goto L_0x0a53
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0a53:
            r0 = 1
            r2.setClickable(r0)
            com.whatsapp.WaTextView r2 = r3.A05
            if (r2 != 0) goto L_0x0a60
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0a60:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131103043(0x7f060d43, float:1.7818541E38)
            X.C18320x8.A11(r1, r2, r0)
            return
        L_0x0a6b:
            java.lang.Object r4 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r4 = (com.whatsapp.email.VerifyEmailActivity) r4
            r2 = 0
            java.lang.String r0 = "VerifyEmailActivity/edit email"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5hX r3 = r4.A00
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "state"
            int r2 = r1.getIntExtra(r0, r2)
            int r1 = r4.A00
            java.lang.String r0 = r4.A0B
            android.content.Intent r0 = X.C627736r.A0x(r4, r0, r2, r1)
            r3.A0A(r4, r0)
        L_0x0a8d:
            r4.finish()
            return
        L_0x0a91:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            X.C621433s.A00(r1, r0)
            return
        L_0x0a9a:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.A03
            android.view.Window r1 = r0.getWindow()
            r0 = 1
            r1.setSoftInputMode(r0)
            return
        L_0x0aa9:
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x0aaf:
            r0 = 1
            r1.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69983Zk.run():void");
    }
}
