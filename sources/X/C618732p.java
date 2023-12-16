package X;

import android.content.ContentValues;
import android.util.Base64;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.32p  reason: invalid class name and case insensitive filesystem */
public class C618732p {
    public final C102475Iz A00;
    public final AnonymousClass5PA A01;
    public final C56612sH A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final C52542le A06;
    public final C60232yD A07;
    public final C42642Oy A08;
    public final C53542nG A09;
    public final C44662Wz A0A;
    public final C64163Ck A0B;
    public final C67823Qu A0C;
    public final Set A0D;
    public final Set A0E;

    public static ContentValues A00(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_lid", str);
        contentValues.put("notification_type", str2);
        contentValues.put("sender_jid", str3);
        return contentValues;
    }

    public static final byte[] A01(String str, String str2) {
        try {
            return Base64.decode(str, 11);
        } catch (IllegalArgumentException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PushEncryptionHelper/base64 exception decoding:");
            A0o.append(str2);
            A0o.append(" value:'");
            C18320x8.A1M(A0o, str);
            C18280x3.A13(A0o);
            return null;
        }
    }

    public static final byte[] A02(StringBuilder sb, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putLong(j);
            byte[] A022 = AnonymousClass31Q.A02(bArr, allocate.array(), (byte[]) null, 32);
            C162457s7.A0D(A022);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A022, "AES/GCM/NoPadding");
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, secretKeySpec, new GCMParameterSpec(128, bArr3));
            instance.updateAAD(C18320x8.A1a("WA_PUSH_NOTIFICATION", AnonymousClass79X.A01));
            ByteBuffer allocate2 = ByteBuffer.allocate(bArr2.length + bArr4.length);
            allocate2.put(bArr2);
            allocate2.put(bArr4);
            return instance.doFinal(allocate2.array());
        } catch (Exception e) {
            boolean z6 = true;
            if (e instanceof BadPaddingException) {
                z = true;
            } else {
                z = e instanceof IllegalBlockSizeException;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = e instanceof InvalidAlgorithmParameterException;
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = e instanceof InvalidKeyException;
            }
            if (z3) {
                z4 = true;
            } else {
                z4 = e instanceof InvalidKeySpecException;
            }
            if (z4) {
                z5 = true;
            } else {
                z5 = e instanceof NoSuchAlgorithmException;
            }
            if (!z5) {
                z6 = e instanceof NoSuchPaddingException;
            }
            if (z6) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("PushEncryptionHelper/decryptData/issue decrypting ");
                A0o.append(Log.getStackTraceString(e));
                A0o.append(10);
                AnonymousClass000.A1B(A0o, sb);
                return null;
            }
            throw e;
        }
    }

    public C618732p(C102475Iz r1, AnonymousClass5PA r2, C56612sH r3, AnonymousClass33p r4, AnonymousClass1VX r5, AnonymousClass4FV r6, C52542le r7, C60232yD r8, C42642Oy r9, C53542nG r10, C44662Wz r11, C64163Ck r12, C67823Qu r13, Set set, Set set2) {
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A08 = r9;
        this.A07 = r8;
        this.A0A = r11;
        this.A03 = r4;
        this.A09 = r10;
        this.A0C = r13;
        this.A0E = set;
        this.A0B = r12;
        this.A0D = set2;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: X.0Tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: X.0Tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: X.0Tm} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r0v178, types: [X.2dk] */
    /* JADX WARNING: type inference failed for: r0v282 */
    /* JADX WARNING: type inference failed for: r25v6, types: [X.1pm] */
    /* JADX WARNING: type inference failed for: r25v7, types: [X.1pm] */
    /* JADX WARNING: type inference failed for: r0v283 */
    /* JADX WARNING: type inference failed for: r25v8, types: [X.1pl] */
    /* JADX WARNING: type inference failed for: r25v9, types: [X.1pl] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        X.C18280x3.A13(r7);
        com.whatsapp.util.Log.e("PushEncryptionHelper/decryptPushPayloadToJSON bad JSON");
        r1 = new android.util.Pair((java.lang.Object) null, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0454, code lost:
        if (r1.equals(r5) == false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        r31 = r0.getString("call_id");
        r5 = com.whatsapp.jid.DeviceJid.Companion;
        r26 = r5.A02(r0.getString("from_device_jid"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x046c, code lost:
        if (r0.has("group_jid") == false) goto L_0x04bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x046e, code lost:
        r28 = X.AnonymousClass32V.A02(r0.getString("group_jid"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0476, code lost:
        r36 = "1".equals(r0.getString("video_call"));
        r32 = java.lang.Long.parseLong(X.C18290x4.A0r("offer_ts_sec", r0));
        r34 = java.lang.Long.parseLong(X.C18290x4.A0r("offer_push_timeout_sec", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x049f, code lost:
        if (r0.has("from_pn") == false) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04a1, code lost:
        r27 = r5.A02(r0.getString("from_pn"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04a9, code lost:
        X.C162457s7.A0H(r31);
        r25 = new X.C32231pm(r26, r27, r28, r1, r3, r31, r32, r34, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04b8, code lost:
        r27 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04bb, code lost:
        r28 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04c5, code lost:
        if (r1.equals(r0) == false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04c7, code lost:
        r0 = new X.C32201pj(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04cc, code lost:
        r2 = X.AnonymousClass001.A0o();
        r2.append("IncomingPushHandler/received payload nt:");
        r1 = X.AnonymousClass000.A0X(r0.A00(), r2);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x07a2, code lost:
        if (r10.equals("group_message") != false) goto L_0x07a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x07a4, code lost:
        r4 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07a6, code lost:
        if (r7 != null) goto L_0x07ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07a8, code lost:
        r16 = r2.A03.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07ae, code lost:
        com.whatsapp.util.Log.i("InactiveAccountNotificationManager/processMessageNotification");
        r1 = r4.A01;
        r34 = r1;
        r9 = r1.A03(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07bb, code lost:
        if (r9 == null) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07bf, code lost:
        if ((r0 instanceof X.C32221pl) == false) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07c1, code lost:
        r0 = (X.C32221pl) r0;
        r33 = r4.A03;
        r32 = r0.A00;
        r13 = r32.getRawString();
        X.C162457s7.A0J(r13, 1);
        r18 = true;
        r1 = new java.lang.String[1];
        r3 = r9.A07;
        r1[r5] = r3;
        r2 = X.C73713fx.A06(r1, new java.lang.String[]{"message", "group_message"});
        r1 = new java.lang.String[1];
        r1[r5] = r13;
        r13 = X.C73713fx.A06(r2, r1);
        r12 = new java.lang.String[1];
        X.AnonymousClass0x2.A1S(r12, r5, r9.A04);
        r14 = (java.lang.String[]) X.C73713fx.A06(r13, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:?, code lost:
        r13 = X.C18630y0.A00(r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        r2 = X.AnonymousClass001.A0o();
        X.C57212tH.A02("SELECT sender_jid FROM notifications WHERE account_lid = ? AND notification_type IN ", r2, 2);
        r1 = ((X.AnonymousClass3H0) r13).A03.A0E(X.AnonymousClass000.A0X(" AND sender_jid = ? AND timestamp >= ?", r2), "GET_SENDERS_FOR_NOT_LID_AND_NOTIFICATION_TYPE", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0823, code lost:
        if (r1.getCount() > 0) goto L_0x0827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0825, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x082d, code lost:
        if (r18 == false) goto L_0x0873;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        r18 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r4.A08.A0H() - r9.A05);
        r2 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0844, code lost:
        if (X.C162457s7.A0P(r2, "message") == false) goto L_0x0849;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0846, code lost:
        r12 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x084d, code lost:
        if (X.C162457s7.A0P(r2, "group_message") == false) goto L_0x0856;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x084f, code lost:
        r12 = 120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0853, code lost:
        if (r18 <= r12) goto L_0x0856;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0856, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x085b, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        X.AnonymousClass2A8.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x085f, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0862, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        X.AnonymousClass2A8.A00(r13, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0866, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0867, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        r2 = X.AnonymousClass3Z0.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x086c, code lost:
        if (r2 != null) goto L_0x086e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x086e, code lost:
        com.whatsapp.util.Log.e("InactiveNotificationsStore/doesMessageSenderExist/failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0873, code lost:
        r14 = r4.A08.A0H();
        r2 = X.AnonymousClass001.A0o();
        X.C57072t2.A03("AccountSwitchingDataRepo/updateLastBuzzedTime/", r3, r2);
        X.C18260x0.A12("/lastBuzzedTimeMs:", r2, r14);
        r1 = X.AnonymousClass001.A0s();
        r13 = r34.A02();
        r1.addAll(r13.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0898, code lost:
        if (X.C613630k.A01(r3, r1) == false) goto L_0x089a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x089a, code lost:
        com.whatsapp.util.Log.e("AccountSwitchingDataRepo/updateLastBuzzedTime/Account doesn't exist");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08a0, code lost:
        r12 = X.C73783g4.A0c(r1);
        r18 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08ac, code lost:
        if (r18.hasNext() != false) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08ae, code lost:
        r2 = (X.C53892nq) r18.next();
        r1 = r2.A07;
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08bc, code lost:
        if (X.C162457s7.A0P(r1, r3) != false) goto L_0x08be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08be, code lost:
        r19 = new X.C53892nq(r20, r2.A06, r2.A08, r2.A00, r2.A01, r2.A04, r14, r2.A03, r2.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08e5, code lost:
        r12.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08e9, code lost:
        r34.A09(X.C18310x6.A0P(r13, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08f2, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x08f3, code lost:
        r1 = r32.getRawString();
        r2 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x08f9, code lost:
        if (r2 != null) goto L_0x08fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08fb, code lost:
        r12 = r2.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x08ff, code lost:
        r14 = r0.A04;
        X.C162457s7.A0J(r1, 3);
        com.whatsapp.util.Log.i("InactiveNotificationsStore/insertNotification");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x090f, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0911, code lost:
        if (r10.equals("group_message") != false) goto L_0x091c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0924, code lost:
        com.whatsapp.util.Log.e("InactiveNotificationsStore/insertNotification/invalidNotificationData");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0929, code lost:
        r4.A03(r9, r5, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x092c, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("AccountSwitchingDataRepo/incrementInactivePushMessageCount/");
        r2 = r6.A07;
        X.C18260x0.A1L(r1, X.C57072t2.A01(r2));
        r11 = X.AnonymousClass001.A0s();
        r10 = r38.A02();
        r11.addAll(r10.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x094f, code lost:
        if (X.C613630k.A01(r2, r11) == false) goto L_0x0951;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0951, code lost:
        r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/Account doesn't exists";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:?, code lost:
        r3 = X.C18630y0.A05(r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:?, code lost:
        r15 = r3.Axl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:?, code lost:
        r7 = ((X.AnonymousClass3H0) r3).A03;
        r10 = A00(r11, r10, r1);
        X.C18290x4.A19(r10, r16);
        r10.put("call_status", java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0977, code lost:
        if (r12 != null) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0979, code lost:
        r10.put("group_jid", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x097e, code lost:
        if (r14 != null) goto L_0x0980;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0980, code lost:
        r10.put("display_name", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0985, code lost:
        r7.A0C("notifications", "INSERT_INACTIVE_NOTIFICATION", r10, 5);
        r15.A00();
        r0 = X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0999, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        X.AnonymousClass2A8.A00(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x099d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x09a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x09a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x09a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:?, code lost:
        r0 = X.AnonymousClass3Z0.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x09aa, code lost:
        r1 = X.AnonymousClass3Z9.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x09ae, code lost:
        if (r1 != null) goto L_0x09b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x09b0, code lost:
        com.whatsapp.util.Log.e("InactiveNotificationsStore/insertNotification/failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x09b7, code lost:
        r3 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x09bb, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x09c0, code lost:
        if (r3.hasNext() != false) goto L_0x09c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x09c2, code lost:
        r1 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x09ca, code lost:
        if (X.C53892nq.A00(r1, r2) != false) goto L_0x09cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x09cc, code lost:
        r1 = (X.C53892nq) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x09ce, code lost:
        if (r1 != null) goto L_0x09d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x09d0, code lost:
        r7 = java.lang.Integer.valueOf(r1.A01 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x09d8, code lost:
        r3 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x09e0, code lost:
        if (r3.hasNext() != false) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x09e2, code lost:
        r1 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x09ea, code lost:
        if (X.C53892nq.A00(r1, r2) != false) goto L_0x09ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x09ed, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x09ef, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x09f1, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x09f2, code lost:
        r9 = (X.C53892nq) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x09f4, code lost:
        if (r9 != null) goto L_0x09f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x09f6, code lost:
        if (r7 != null) goto L_0x09f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x09f9, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x09fb, code lost:
        r0 = r7.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x09ff, code lost:
        r9.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a0b, code lost:
        if (r38.A09(X.C18310x6.A0P(r10, r11)) == false) goto L_0x0a0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0a0d, code lost:
        com.whatsapp.util.Log.w("AccountSwitchingDataRepo/incrementInactivePushMessageCount/Failed to update inactiveAccounts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0a1e, code lost:
        r36 = false;
        com.whatsapp.util.Log.i("InactiveAccountNotificationManager/showOfflineMessagesCountWarning");
        r3 = r4.A05;
        r32 = X.AnonymousClass30A.A00(X.C373421w.UNREAD_MSG_LIMIT, r2);
        r33 = r4.A01(r6);
        r1 = r4.A09;
        r34 = X.C54292oU.A04(r1, com.whatsapp.R.string.f11nameremoved);
        r0 = r1.A00;
        r1 = 11;
        r30 = X.C627736r.A0z(r0, r2, 11, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0aa1, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0b03, code lost:
        r3.A03(r30, r31, r32, r33, r34, r1, r36, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0bae, code lost:
        if (r0.A04 == null) goto L_0x0bb0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0c80, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:?, code lost:
        X.AnonymousClass2A8.A00(r16, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0c86, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0c89, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:?, code lost:
        X.AnonymousClass2A8.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0c8d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0e07, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:?, code lost:
        X.AnonymousClass2A8.A00(r16, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0e0d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0e10, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0e14, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x0337 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0354 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x050b A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0552 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0553 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0580 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x062d A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0643 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0658 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0659 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0715 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0732 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0738 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0768 A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0132 A[SYNTHETIC, Splitter:B:40:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013c A[SYNTHETIC, Splitter:B:42:0x013c] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01fe A[Catch:{ IOException | SAXException -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0211 A[SYNTHETIC, Splitter:B:65:0x0211] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(java.lang.Integer r48, java.lang.Integer r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, int r65, boolean r66) {
        /*
            r47 = this;
            r21 = r48
            r8 = r47
            monitor-enter(r8)
            X.2sH r0 = r8.A02     // Catch:{ all -> 0x0eac }
            long r18 = r0.A0H()     // Catch:{ all -> 0x0eac }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            r13 = r65
            if (r65 == 0) goto L_0x00a8
            java.lang.String r0 = "FBNS"
        L_0x0015:
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = " push received; id="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r45 = r50
            r0 = r45
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; ip="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r44 = r51
            r0 = r44
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; sessionId = "
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r43 = r52
            r0 = r43
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; mmsOverride="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r15 = r53
            r1.append(r15)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; fbips="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r24 = r54
            r0 = r24
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; notifyOnFailure="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r40 = r66
            r0 = r40
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; routingInfo="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r42 = r55
            r0 = r42
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; pushTs="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r41 = r58
            r0 = r41
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; pushTransport="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r1.append(r13)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; originalPriority="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r0 = r21
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; deliveredPriority="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r46 = r49
            r0 = r46
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; pushNonce is empty="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r20 = r59
            boolean r0 = android.text.TextUtils.isEmpty(r20)     // Catch:{ all -> 0x0eac }
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "; has encPayload="
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            goto L_0x00ac
        L_0x00a8:
            java.lang.String r0 = "GCM"
            goto L_0x0015
        L_0x00ac:
            r3 = 1
            r4 = r61
            boolean r0 = X.AnonymousClass000.A1W(r4)
            X.C18260x0.A1V(r1, r0)     // Catch:{ all -> 0x0eac }
            r0 = -1
            r2 = r41
            long r16 = X.C615531h.A04(r2, r0)     // Catch:{ all -> 0x0eac }
            if (r13 != r3) goto L_0x00ce
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0eaa
            X.2yD r0 = r8.A07     // Catch:{ all -> 0x0eac }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x00ce
            goto L_0x0eaa
        L_0x00ce:
            if (r61 == 0) goto L_0x04fc
            X.2nG r14 = r8.A09     // Catch:{ all -> 0x0eac }
            r5 = 0
            r0 = r62
            if (r62 == 0) goto L_0x0308
            r2 = r63
            if (r63 == 0) goto L_0x0308
            r3 = r64
            if (r64 == 0) goto L_0x0308
            java.lang.String r1 = "payload"
            byte[] r28 = A01(r4, r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "IV"
            byte[] r29 = A01(r0, r1)     // Catch:{ all -> 0x0eac }
            r0 = -1
            long r31 = X.C615531h.A04(r2, r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r2 = "tag"
            byte[] r30 = A01(r3, r2)     // Catch:{ all -> 0x0eac }
            if (r28 == 0) goto L_0x0305
            if (r29 == 0) goto L_0x0305
            int r2 = (r31 > r0 ? 1 : (r31 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0305
            if (r30 == 0) goto L_0x0305
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            byte[] r27 = r14.A02()     // Catch:{ all -> 0x0eac }
            if (r27 != 0) goto L_0x0113
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal failed to get pKey"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            goto L_0x0125
        L_0x0113:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal attempting decrypt\n"
            r7.append(r0)     // Catch:{ all -> 0x0eac }
            r26 = r7
            byte[] r2 = A02(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0eac }
            if (r2 != 0) goto L_0x0127
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal failed to decrypt\n"
            r7.append(r0)     // Catch:{ all -> 0x0eac }
        L_0x0125:
            r1 = r5
            goto L_0x012e
        L_0x0127:
            java.nio.charset.Charset r0 = X.AnonymousClass79X.A05     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0eac }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0eac }
        L_0x012e:
            java.lang.String r27 = "PushEncryptionHelper/decryptPushPayloadToJSON bad JSON"
            if (r1 == 0) goto L_0x013c
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0343 }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r5, r0)     // Catch:{ JSONException -> 0x0343 }
            goto L_0x034e
        L_0x013c:
            X.5HD r10 = r14.A00     // Catch:{ all -> 0x0eac }
            java.util.HashMap r26 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0eac }
            X.8qC r0 = r10.A01     // Catch:{ all -> 0x0eac }
            java.util.List r0 = X.C613630k.A00(r0)     // Catch:{ all -> 0x0eac }
            java.util.Iterator r25 = r0.iterator()     // Catch:{ all -> 0x0eac }
        L_0x014c:
            boolean r0 = r25.hasNext()     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x027a
            java.lang.Object r0 = r25.next()     // Catch:{ all -> 0x0eac }
            X.2nq r0 = (X.C53892nq) r0     // Catch:{ all -> 0x0eac }
            java.lang.String r9 = r0.A07     // Catch:{ all -> 0x0eac }
            X.8qC r0 = r10.A00     // Catch:{ all -> 0x0eac }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0eac }
            X.30z r0 = (X.C614930z) r0     // Catch:{ all -> 0x0eac }
            java.lang.String r23 = ": "
            r6 = 0
            java.lang.String r1 = "AccountSwitcher/getPKeyFromSharedPrefForInactiveAccount"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            X.8qC r0 = r0.A0H     // Catch:{ all -> 0x0eac }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0eac }
            X.35Q r3 = (X.AnonymousClass35Q) r3     // Catch:{ all -> 0x0eac }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = X.AnonymousClass33p.A05     // Catch:{ all -> 0x0eac }
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = ".xml"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0eac }
            r0 = 1
            X.C162457s7.A0J(r2, r0)     // Catch:{ all -> 0x0eac }
            X.66R r0 = r3.A0A     // Catch:{ all -> 0x0eac }
            boolean r1 = X.C18290x4.A1Y(r0)     // Catch:{ all -> 0x0eac }
            r4 = 0
            if (r1 != 0) goto L_0x0194
            java.lang.String r0 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/Staging Directory don't exist"
        L_0x0190:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            goto L_0x01d2
        L_0x0194:
            java.io.File r1 = X.C18270x1.A0B(r9, r0)     // Catch:{ all -> 0x0eac }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0eac }
            java.lang.String r12 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/stagingDirLogString/"
            java.lang.String r11 = " does not exist"
            if (r0 != 0) goto L_0x01ba
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/Account "
        L_0x01a8:
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = X.C57072t2.A01(r9)     // Catch:{ all -> 0x0eac }
            X.C18260x0.A0r(r0, r11, r1)     // Catch:{ all -> 0x0eac }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            X.C57072t2.A02(r3, r12, r0)     // Catch:{ all -> 0x0eac }
            goto L_0x01d2
        L_0x01ba:
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "shared_prefs"
            java.io.File r1 = X.C18330xA.A04(r1, r0)     // Catch:{ all -> 0x0eac }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x01d4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/shared prefs for "
            goto L_0x01a8
        L_0x01d2:
            r0 = r5
            goto L_0x01fa
        L_0x01d4:
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x0eac }
            java.io.File r0 = X.C18330xA.A04(r0, r2)     // Catch:{ all -> 0x0eac }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x01fa
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/"
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r1.append(r2)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = " file for "
            X.C57072t2.A03(r0, r9, r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = " doesn't exist"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0eac }
            goto L_0x0190
        L_0x01fa:
            java.lang.String r3 = "AccountSwitcher/getPKeyFromSharedPrefForInactiveAccount/"
            if (r0 != 0) goto L_0x0211
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            X.C57072t2.A03(r3, r9, r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = ": file does not exists"
            X.C18260x0.A1K(r0, r1)     // Catch:{ all -> 0x0eac }
        L_0x020a:
            r0 = r26
            r0.put(r9, r4)     // Catch:{ all -> 0x0eac }
            goto L_0x014c
        L_0x0211:
            javax.xml.parsers.DocumentBuilderFactory r1 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ IOException | SAXException -> 0x026c }
            javax.xml.parsers.DocumentBuilder r1 = r1.newDocumentBuilder()     // Catch:{ IOException | SAXException -> 0x026c }
            org.w3c.dom.Document r1 = r1.parse(r0)     // Catch:{ IOException | SAXException -> 0x026c }
            java.lang.String r0 = "string"
            org.w3c.dom.NodeList r12 = r1.getElementsByTagName(r0)     // Catch:{ IOException | SAXException -> 0x026c }
            int r2 = r12.getLength()     // Catch:{ IOException | SAXException -> 0x026c }
            if (r2 < 0) goto L_0x020a
            r1 = 0
        L_0x022b:
            org.w3c.dom.Node r22 = r12.item(r1)     // Catch:{ IOException | SAXException -> 0x026c }
            if (r22 == 0) goto L_0x0267
            org.w3c.dom.NamedNodeMap r0 = r22.getAttributes()     // Catch:{ IOException | SAXException -> 0x026c }
            int r0 = r0.getLength()     // Catch:{ IOException | SAXException -> 0x026c }
            if (r0 <= 0) goto L_0x0267
            org.w3c.dom.NamedNodeMap r0 = r22.getAttributes()     // Catch:{ IOException | SAXException -> 0x026c }
            org.w3c.dom.Node r0 = r0.item(r6)     // Catch:{ IOException | SAXException -> 0x026c }
            java.lang.String r11 = r0.getNodeValue()     // Catch:{ IOException | SAXException -> 0x026c }
            java.lang.String r0 = "push:push_pkey_data"
            boolean r0 = X.C162457s7.A0P(r11, r0)     // Catch:{ IOException | SAXException -> 0x026c }
            if (r0 == 0) goto L_0x0267
            org.w3c.dom.NodeList r0 = r22.getChildNodes()     // Catch:{ IOException | SAXException -> 0x026c }
            int r0 = r0.getLength()     // Catch:{ IOException | SAXException -> 0x026c }
            if (r0 <= 0) goto L_0x0267
            org.w3c.dom.NodeList r0 = r22.getChildNodes()     // Catch:{ IOException | SAXException -> 0x026c }
            org.w3c.dom.Node r0 = r0.item(r6)     // Catch:{ IOException | SAXException -> 0x026c }
            java.lang.String r4 = r0.getNodeValue()     // Catch:{ IOException | SAXException -> 0x026c }
            goto L_0x020a
        L_0x0267:
            if (r1 == r2) goto L_0x020a
            int r1 = r1 + 1
            goto L_0x022b
        L_0x026c:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            X.C57072t2.A03(r3, r9, r0)     // Catch:{ all -> 0x0eac }
            r2 = r23
            X.C18260x0.A1Q(r0, r2, r1)     // Catch:{ all -> 0x0eac }
            goto L_0x020a
        L_0x027a:
            java.util.Iterator r6 = X.AnonymousClass001.A0u(r26)     // Catch:{ all -> 0x0eac }
        L_0x027e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x030b
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r6)     // Catch:{ all -> 0x0eac }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x0eac }
            r3 = 125(0x7d, float:1.75E-43)
            if (r0 != 0) goto L_0x02a7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts pKey not found for {"
        L_0x0296:
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = X.C18310x6.A0q(r4)     // Catch:{ all -> 0x0eac }
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            r1.append(r3)     // Catch:{ all -> 0x0eac }
            X.C18280x3.A13(r1)     // Catch:{ all -> 0x0eac }
            goto L_0x027e
        L_0x02a7:
            java.lang.Object r1 = r4.getValue()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0eac }
            X.2bZ r2 = X.C57182tE.A00(r1)     // Catch:{ all -> 0x0eac }
            if (r2 == 0) goto L_0x02c8
            X.2iY r1 = r14.A04     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = X.C58172up.A0T     // Catch:{ all -> 0x0eac }
            byte[] r34 = r1.A01(r2, r0)     // Catch:{ all -> 0x0eac }
            if (r34 != 0) goto L_0x02cf
            java.lang.String r0 = "PushEncryptionHelper/getSavedPKey failed to parse"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
        L_0x02c8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts failed to get pKey for {"
            goto L_0x0296
        L_0x02cf:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts attempting decrypt for {"
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = X.C18310x6.A0q(r4)     // Catch:{ all -> 0x0eac }
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "}\n"
            X.C18270x1.A1C(r0, r1, r7)     // Catch:{ all -> 0x0eac }
            r33 = r7
            r35 = r28
            r36 = r29
            r37 = r30
            r38 = r31
            byte[] r0 = A02(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x027e
            java.lang.Object r3 = r4.getKey()     // Catch:{ all -> 0x0eac }
            java.nio.charset.Charset r2 = X.AnonymousClass79X.A05     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0eac }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0eac }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r3, r1)     // Catch:{ all -> 0x0eac }
            goto L_0x0315
        L_0x0305:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadToJSON bad payload attributes"
            goto L_0x031d
        L_0x0308:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadToJSON missing payload attributes"
            goto L_0x031d
        L_0x030b:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts failed to decrypt"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0eac }
            r1.<init>(r5, r5)     // Catch:{ all -> 0x0eac }
        L_0x0315:
            java.lang.Object r0 = r1.second     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x0326
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0eac }
        L_0x031d:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0eac }
            r1.<init>(r5, r5)     // Catch:{ all -> 0x0eac }
            goto L_0x034e
        L_0x0326:
            java.lang.Object r1 = r1.first     // Catch:{ JSONException -> 0x0337 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0337 }
            if (r0 == 0) goto L_0x0335
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x0337 }
        L_0x0330:
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r1, r0)     // Catch:{ JSONException -> 0x0337 }
            goto L_0x034e
        L_0x0335:
            r0 = r5
            goto L_0x0330
        L_0x0337:
            X.C18280x3.A13(r7)     // Catch:{ all -> 0x0eac }
            com.whatsapp.util.Log.e((java.lang.String) r27)     // Catch:{ all -> 0x0eac }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0eac }
            r1.<init>(r5, r5)     // Catch:{ all -> 0x0eac }
            goto L_0x034e
        L_0x0343:
            X.C18280x3.A13(r7)     // Catch:{ all -> 0x0eac }
            com.whatsapp.util.Log.e((java.lang.String) r27)     // Catch:{ all -> 0x0eac }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0eac }
            r1.<init>(r5, r5)     // Catch:{ all -> 0x0eac }
        L_0x034e:
            java.lang.Object r0 = r1.second     // Catch:{ all -> 0x0eac }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x04f3
            java.lang.Object r3 = r1.first     // Catch:{ all -> 0x0eac }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "nt"
            r5 = 0
            java.lang.String r1 = X.C57282tO.A00(r1, r0, r5)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x036f
            int r7 = r1.hashCode()     // Catch:{ all -> 0x0eac }
            java.lang.String r4 = "PushPayloadParser/fromJSON missing "
            java.lang.String r6 = "from_jid"
            java.lang.String r2 = "call_id"
            switch(r7) {
                case -1127809222: goto L_0x044d;
                case -395094592: goto L_0x0425;
                case -318861064: goto L_0x04be;
                case 143478273: goto L_0x03f8;
                case 239102022: goto L_0x03f4;
                case 757346421: goto L_0x0380;
                case 954925063: goto L_0x03bf;
                case 1006153287: goto L_0x0385;
                default: goto L_0x036f;
            }     // Catch:{ all -> 0x0eac }
        L_0x036f:
            r0 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r2 = "PushPayloadParser/fromJSON unknown nt: "
            X.C18260x0.A0r(r2, r1, r3)     // Catch:{ all -> 0x0eac }
        L_0x0379:
            java.lang.String r1 = "IncomingPushHandler/payload failed to extract"
        L_0x037b:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            goto L_0x04f6
        L_0x0380:
            java.lang.String r0 = "post_reg"
            goto L_0x04c1
        L_0x0385:
            java.lang.String r2 = "group_message"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0eac }
            if (r2 == 0) goto L_0x036f
            java.lang.String r2 = "participant_jid"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x03af }
            X.4uZ r26 = X.C106405Yw.A04(r2)     // Catch:{ Exception -> 0x03af }
            java.lang.String r0 = r0.getString(r6)     // Catch:{ Exception -> 0x03af }
            com.whatsapp.jid.GroupJid r27 = X.AnonymousClass32V.A02(r0)     // Catch:{ Exception -> 0x03af }
            r30 = 0
            X.1pl r0 = new X.1pl     // Catch:{ Exception -> 0x03af }
            r25 = r0
            r28 = r1
            r29 = r3
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x03af }
            goto L_0x04cc
        L_0x03af:
            r1 = move-exception
            boolean r0 = r1 instanceof X.AnonymousClass24P     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x03bc
            boolean r0 = r1 instanceof org.json.JSONException     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x03bc
            boolean r0 = r1 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x04fb
        L_0x03bc:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_GROUP_MESSAGE"
            goto L_0x0420
        L_0x03bf:
            java.lang.String r2 = "message"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0eac }
            if (r2 == 0) goto L_0x036f
            java.lang.String r2 = r0.getString(r6)     // Catch:{ Exception -> 0x03e4 }
            X.4uZ r26 = X.C106405Yw.A04(r2)     // Catch:{ Exception -> 0x03e4 }
            java.lang.String r2 = "display_name"
            java.lang.String r30 = r0.optString(r2)     // Catch:{ Exception -> 0x03e4 }
            r27 = 0
            X.1pl r0 = new X.1pl     // Catch:{ Exception -> 0x03e4 }
            r25 = r0
            r28 = r1
            r29 = r3
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x03e4 }
            goto L_0x04cc
        L_0x03e4:
            r1 = move-exception
            boolean r0 = r1 instanceof X.AnonymousClass24P     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x03f1
            boolean r0 = r1 instanceof org.json.JSONException     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x03f1
            boolean r0 = r1 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x04fb
        L_0x03f1:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_MESSAGE"
            goto L_0x0420
        L_0x03f4:
            java.lang.String r5 = "voip_call_offer_1on1"
            goto L_0x0450
        L_0x03f8:
            java.lang.String r2 = "wfac_ban"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0eac }
            if (r2 == 0) goto L_0x036f
            java.lang.String r2 = "decision"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x0411 }
            X.C162457s7.A0H(r2)     // Catch:{ Exception -> 0x0411 }
            X.1pk r0 = new X.1pk     // Catch:{ Exception -> 0x0411 }
            r0.<init>(r1, r3, r2)     // Catch:{ Exception -> 0x0411 }
            goto L_0x04cc
        L_0x0411:
            r1 = move-exception
            boolean r0 = r1 instanceof X.AnonymousClass24P     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x041e
            boolean r0 = r1 instanceof org.json.JSONException     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x041e
            boolean r0 = r1 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x04fb
        L_0x041e:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_WFAC_BAN missing decision"
        L_0x0420:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0eac }
            goto L_0x04f3
        L_0x0425:
            java.lang.String r6 = "call_terminate"
            boolean r6 = r1.equals(r6)     // Catch:{ all -> 0x0eac }
            if (r6 == 0) goto L_0x036f
            java.lang.String r31 = r0.getString(r2)     // Catch:{ Exception -> 0x04df }
            X.C162457s7.A0H(r31)     // Catch:{ Exception -> 0x04df }
            r26 = 0
            r32 = 0
            X.1pm r0 = new X.1pm     // Catch:{ Exception -> 0x04df }
            r28 = r26
            r25 = r0
            r27 = r26
            r29 = r1
            r30 = r3
            r34 = r32
            r36 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r34, r36)     // Catch:{ Exception -> 0x04df }
            goto L_0x04cc
        L_0x044d:
            java.lang.String r5 = "voip_call_offer_group"
        L_0x0450:
            boolean r5 = r1.equals(r5)     // Catch:{ all -> 0x0eac }
            if (r5 == 0) goto L_0x036f
            java.lang.String r31 = r0.getString(r2)     // Catch:{ Exception -> 0x04df }
            java.lang.String r2 = "from_device_jid"
            X.32r r5 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ Exception -> 0x04df }
            java.lang.String r6 = r0.getString(r2)     // Catch:{ Exception -> 0x04df }
            com.whatsapp.jid.DeviceJid r26 = r5.A02(r6)     // Catch:{ Exception -> 0x04df }
            java.lang.String r2 = "group_jid"
            boolean r6 = r0.has(r2)     // Catch:{ Exception -> 0x04df }
            if (r6 == 0) goto L_0x04bb
            java.lang.String r6 = r0.getString(r2)     // Catch:{ Exception -> 0x04df }
            com.whatsapp.jid.GroupJid r28 = X.AnonymousClass32V.A02(r6)     // Catch:{ Exception -> 0x04df }
        L_0x0476:
            java.lang.String r2 = "video_call"
            java.lang.String r7 = "1"
            java.lang.String r6 = r0.getString(r2)     // Catch:{ Exception -> 0x04df }
            boolean r36 = r7.equals(r6)     // Catch:{ Exception -> 0x04df }
            java.lang.String r2 = "offer_ts_sec"
            java.lang.String r6 = X.C18290x4.A0r(r2, r0)     // Catch:{ Exception -> 0x04df }
            long r32 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x04df }
            java.lang.String r2 = "offer_push_timeout_sec"
            java.lang.String r6 = X.C18290x4.A0r(r2, r0)     // Catch:{ Exception -> 0x04df }
            long r34 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x04df }
            java.lang.String r2 = "from_pn"
            boolean r6 = r0.has(r2)     // Catch:{ Exception -> 0x04df }
            if (r6 == 0) goto L_0x04b8
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x04df }
            com.whatsapp.jid.DeviceJid r27 = r5.A02(r0)     // Catch:{ Exception -> 0x04df }
        L_0x04a9:
            X.C162457s7.A0H(r31)     // Catch:{ Exception -> 0x04df }
            X.1pm r0 = new X.1pm     // Catch:{ Exception -> 0x04df }
            r25 = r0
            r29 = r1
            r30 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r34, r36)     // Catch:{ Exception -> 0x04df }
            goto L_0x04cc
        L_0x04b8:
            r27 = 0
            goto L_0x04a9
        L_0x04bb:
            r28 = 0
            goto L_0x0476
        L_0x04be:
            java.lang.String r0 = "pre_reg"
        L_0x04c1:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x036f
            X.1pj r0 = new X.1pj     // Catch:{ all -> 0x0eac }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0eac }
        L_0x04cc:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "IncomingPushHandler/received payload nt:"
            r2.append(r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = r0.A00()     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = X.AnonymousClass000.A0X(r1, r2)     // Catch:{ all -> 0x0eac }
            goto L_0x037b
        L_0x04df:
            r1 = move-exception
            boolean r0 = r1 instanceof X.AnonymousClass24P     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x04ec
            boolean r0 = r1 instanceof org.json.JSONException     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x04ec
            boolean r0 = r1 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x04fb
        L_0x04ec:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            X.C18260x0.A0r(r4, r2, r0)     // Catch:{ all -> 0x0eac }
        L_0x04f3:
            r0 = 0
            goto L_0x0379
        L_0x04f6:
            boolean r1 = X.AnonymousClass000.A1W(r0)
            goto L_0x04ff
        L_0x04fb:
            throw r1     // Catch:{ all -> 0x0eac }
        L_0x04fc:
            r0 = 0
            r9 = 0
            goto L_0x0503
        L_0x04ff:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0eac }
        L_0x0503:
            r4 = r56
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x054c
            r3 = r57
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x054c
            r6 = -1
            r5 = 0
            X.1Zt r2 = new X.1Zt     // Catch:{ all -> 0x0eac }
            r2.<init>()     // Catch:{ all -> 0x0eac }
            r1 = r41
            long r10 = X.C615531h.A04(r1, r6)     // Catch:{ all -> 0x0eac }
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0540
            r2.A05 = r4     // Catch:{ all -> 0x0eac }
            r2.A04 = r3     // Catch:{ all -> 0x0eac }
            r2.A00 = r9     // Catch:{ all -> 0x0eac }
            java.lang.Long r1 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0eac }
            r2.A03 = r1     // Catch:{ all -> 0x0eac }
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0eac }
            r2.A02 = r1     // Catch:{ all -> 0x0eac }
            r1 = r46
            r2.A01 = r1     // Catch:{ all -> 0x0eac }
            X.4FV r1 = r8.A05     // Catch:{ all -> 0x0eac }
            r1.BhD(r2)     // Catch:{ all -> 0x0eac }
        L_0x0540:
            X.5PA r1 = r8.A01     // Catch:{ all -> 0x0eac }
            java.util.concurrent.atomic.AtomicInteger r1 = r1.A06     // Catch:{ all -> 0x0eac }
            r1.getAndIncrement()     // Catch:{ all -> 0x0eac }
            boolean r14 = X.C18320x8.A1U(r43)     // Catch:{ all -> 0x0eac }
            goto L_0x0550
        L_0x054c:
            r5 = 0
            r6 = -1
            goto L_0x0540
        L_0x0550:
            if (r14 == 0) goto L_0x0553
            goto L_0x0555
        L_0x0553:
            r12 = 0
            goto L_0x0572
        L_0x0555:
            X.33p r1 = r8.A03     // Catch:{ all -> 0x0eac }
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "network:last_blocked_session_ids"
            java.lang.String r2 = X.AnonymousClass0x9.A0v(r2, r1)     // Catch:{ all -> 0x0eac }
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x05f8
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0eac }
        L_0x056c:
            r1 = r43
            boolean r12 = r2.contains(r1)     // Catch:{ all -> 0x0eac }
        L_0x0572:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0eac }
            r1 = r41
            long r3 = X.C615531h.A04(r1, r6)     // Catch:{ all -> 0x0eac }
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x05d6
            X.1ai r10 = new X.1ai     // Catch:{ all -> 0x0eac }
            r10.<init>()     // Catch:{ all -> 0x0eac }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0eac }
            r10.A08 = r1     // Catch:{ all -> 0x0eac }
            r1 = r21
            r10.A05 = r1     // Catch:{ all -> 0x0eac }
            r1 = r46
            r10.A04 = r1     // Catch:{ all -> 0x0eac }
            r1 = r18
            java.lang.Long r1 = X.C18310x6.A0f(r1, r3)     // Catch:{ all -> 0x0eac }
            r10.A07 = r1     // Catch:{ all -> 0x0eac }
            r10.A06 = r11     // Catch:{ all -> 0x0eac }
            X.33p r1 = r8.A03     // Catch:{ all -> 0x0eac }
            X.8qC r3 = r1.A01     // Catch:{ all -> 0x0eac }
            android.content.SharedPreferences r2 = X.C18300x5.A0B(r3)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "c2dm_reg_id"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0eac }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0eac }
            r10.A01 = r1     // Catch:{ all -> 0x0eac }
            android.content.SharedPreferences r2 = X.C18300x5.A0B(r3)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "fbns_token"
            java.lang.String r1 = X.C18280x3.A0Z(r2, r1)     // Catch:{ all -> 0x0eac }
            boolean r1 = X.C18320x8.A1U(r1)     // Catch:{ all -> 0x0eac }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0eac }
            r10.A00 = r1     // Catch:{ all -> 0x0eac }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x0eac }
            r10.A02 = r1     // Catch:{ all -> 0x0eac }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0eac }
            r10.A03 = r1     // Catch:{ all -> 0x0eac }
            X.4FV r1 = r8.A05     // Catch:{ all -> 0x0eac }
            r1.BhD(r10)     // Catch:{ all -> 0x0eac }
        L_0x05d6:
            X.33p r3 = r8.A03     // Catch:{ all -> 0x0eac }
            r2 = -1
            X.8qC r14 = r3.A01     // Catch:{ all -> 0x0eac }
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r14)     // Catch:{ all -> 0x0eac }
            java.lang.String r12 = "push:recent_push_transport"
            int r11 = r1.getInt(r12, r2)     // Catch:{ all -> 0x0eac }
            r1 = 0
            android.content.SharedPreferences r10 = X.C18300x5.A0B(r14)     // Catch:{ all -> 0x0eac }
            java.lang.String r4 = "push:recent_push_ts"
            long r22 = r10.getLong(r4, r1)     // Catch:{ all -> 0x0eac }
            int r18 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r18 == 0) goto L_0x0615
            goto L_0x0604
        L_0x05f8:
            java.lang.String r1 = ","
            java.lang.String[] r1 = r2.split(r1, r5)     // Catch:{ all -> 0x0eac }
            java.util.List r2 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x0eac }
            goto L_0x056c
        L_0x0604:
            int r6 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0615
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 < 0) goto L_0x0615
            if (r11 == r13) goto L_0x0615
            java.lang.String r0 = "IncomingPushHandler/handleGcmPush ignoring duplicate"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0615:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r14)     // Catch:{ all -> 0x0eac }
            X.C18270x1.A0h(r1, r12, r13)     // Catch:{ all -> 0x0eac }
            if (r18 == 0) goto L_0x062b
            int r1 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r1 <= 0) goto L_0x062b
            android.content.SharedPreferences r6 = X.C18300x5.A0B(r14)     // Catch:{ all -> 0x0eac }
            r1 = r16
            X.C18270x1.A0o(r6, r4, r1)     // Catch:{ all -> 0x0eac }
        L_0x062b:
            if (r65 != 0) goto L_0x063b
            r3.A19(r5)     // Catch:{ all -> 0x0eac }
            X.2Oy r4 = r8.A08     // Catch:{ all -> 0x0eac }
            r1 = 1
            r4.A01 = r1     // Catch:{ all -> 0x0eac }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0eac }
            r4.A00 = r1     // Catch:{ all -> 0x0eac }
        L_0x063b:
            java.lang.String r1 = "CLEAR"
            boolean r1 = r1.equalsIgnoreCase(r15)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0659
            r31 = 0
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r3)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "mms_authority_override"
            r2.remove(r1)     // Catch:{ all -> 0x0eac }
            r2.apply()     // Catch:{ all -> 0x0eac }
        L_0x0652:
            boolean r1 = android.text.TextUtils.isEmpty(r42)     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x0713
            goto L_0x06b3
        L_0x0659:
            r31 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x0652
            java.lang.String r1 = "\\|"
            r2 = 3
            java.lang.String[] r4 = r15.split(r1, r2)     // Catch:{ all -> 0x0eac }
            int r1 = r4.length     // Catch:{ all -> 0x0eac }
            if (r1 != r2) goto L_0x06a9
            r1 = 1
            r1 = r4[r1]     // Catch:{ NumberFormatException -> 0x069e }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x069e }
            r6 = 2
            r6 = r4[r6]     // Catch:{ NumberFormatException -> 0x069e }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x069e }
            long r1 = r1 + r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r6
            r4 = r4[r5]     // Catch:{ NumberFormatException -> 0x069e }
            android.content.SharedPreferences$Editor r7 = X.C18270x1.A03(r3)     // Catch:{ NumberFormatException -> 0x069e }
            java.lang.String r6 = "mms_authority_override"
            if (r4 == 0) goto L_0x069a
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r4)     // Catch:{ NumberFormatException -> 0x069e }
            java.lang.String r3 = "|"
            java.lang.String r1 = X.AnonymousClass000.A0Z(r3, r4, r1)     // Catch:{ NumberFormatException -> 0x069e }
            r7.putString(r6, r1)     // Catch:{ NumberFormatException -> 0x069e }
        L_0x0696:
            r7.apply()     // Catch:{ NumberFormatException -> 0x069e }
            goto L_0x0652
        L_0x069a:
            r7.remove(r6)     // Catch:{ NumberFormatException -> 0x069e }
            goto L_0x0696
        L_0x069e:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "c2dm/mms_override/invalid_numbers:"
            X.C18260x0.A0v(r1, r15, r2, r3)     // Catch:{ all -> 0x0eac }
            goto L_0x0652
        L_0x06a9:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "c2dm/mms_override/invalid_override:"
            X.C18260x0.A0t(r1, r15, r2)     // Catch:{ all -> 0x0eac }
            goto L_0x0652
        L_0x06b3:
            X.2Wz r6 = r8.A0A     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            char[] r7 = r42.toCharArray()     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            int r4 = r7.length     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            r1 = r4 & 1
            if (r1 != 0) goto L_0x06ff
            int r3 = r4 >> 1
            byte[] r2 = new byte[r3]     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            r11 = 0
            r13 = 0
        L_0x06c4:
            if (r11 >= r4) goto L_0x06e3
            char r1 = r7[r11]     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            r12 = 16
            int r1 = java.lang.Character.digit(r1, r12)     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            int r10 = r1 << 4
            int r11 = r11 + 1
            char r1 = r7[r11]     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            int r1 = java.lang.Character.digit(r1, r12)     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            r10 = r10 | r1
            int r11 = r11 + 1
            r1 = r10 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            r2[r13] = r1     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            int r13 = r13 + 1
            goto L_0x06c4
        L_0x06e3:
            r1 = 256(0x100, float:3.59E-43)
            if (r3 > r1) goto L_0x06f8
            X.33p r1 = r6.A00     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            java.lang.String r3 = X.C18320x8.A0i(r2)     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r1)     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            java.lang.String r1 = "routing_info"
            X.C18270x1.A0j(r2, r1, r3)     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            goto L_0x0713
        L_0x06f8:
            java.lang.String r1 = "The routing info should be smaller than 256 bytes."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r1)     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            throw r1     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
        L_0x06ff:
            java.lang.String r1 = "Odd number of characters."
            java.io.IOException r1 = X.AnonymousClass002.A0C(r1)     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
            throw r1     // Catch:{ IOException -> 0x070d, IllegalArgumentException -> 0x0706 }
        L_0x0706:
            r2 = move-exception
            java.lang.String r1 = "GcmListenerService/handleGcmPush/routingInfo/failed to save edgeRoutingRoutingInfo, routing info is too big"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ all -> 0x0eac }
            goto L_0x0713
        L_0x070d:
            r2 = move-exception
            java.lang.String r1 = "GcmListenerService/handleGcmPush/routingInfo/failed to parse edgeRoutingRoutingInfo"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ all -> 0x0eac }
        L_0x0713:
            if (r54 == 0) goto L_0x071e
            X.2le r2 = r8.A06     // Catch:{ all -> 0x0eac }
            java.lang.String[] r1 = X.C18320x8.A1b(r24)     // Catch:{ all -> 0x0eac }
            r2.A02(r1)     // Catch:{ all -> 0x0eac }
        L_0x071e:
            X.5Iz r2 = r8.A00     // Catch:{ all -> 0x0eac }
            java.lang.Long r7 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0eac }
            X.30z r1 = r2.A00     // Catch:{ all -> 0x0eac }
            boolean r1 = r1.A06()     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0e27
            if (r0 == 0) goto L_0x0e27
            boolean r1 = r0 instanceof X.C32211pk     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0738
            r1 = r0
            X.1pk r1 = (X.C32211pk) r1     // Catch:{ all -> 0x0eac }
            java.lang.String r11 = r1.A01     // Catch:{ all -> 0x0eac }
            goto L_0x0751
        L_0x0738:
            boolean r1 = r0 instanceof X.C32221pl     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0742
            r1 = r0
            X.1pl r1 = (X.C32221pl) r1     // Catch:{ all -> 0x0eac }
            java.lang.String r11 = r1.A03     // Catch:{ all -> 0x0eac }
            goto L_0x0751
        L_0x0742:
            boolean r1 = r0 instanceof X.C32201pj     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x074c
            r1 = r0
            X.1pj r1 = (X.C32201pj) r1     // Catch:{ all -> 0x0eac }
            java.lang.String r11 = r1.A01     // Catch:{ all -> 0x0eac }
            goto L_0x0751
        L_0x074c:
            r1 = r0
            X.1pm r1 = (X.C32231pm) r1     // Catch:{ all -> 0x0eac }
            java.lang.String r11 = r1.A07     // Catch:{ all -> 0x0eac }
        L_0x0751:
            if (r11 == 0) goto L_0x0e27
            int r1 = r11.length()     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0e27
            java.lang.String r1 = "IncomingInactiveAccountPushObserverImpl/handleIncomingPushMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            X.30k r1 = r2.A01     // Catch:{ all -> 0x0eac }
            r38 = r1
            X.2nq r6 = r1.A03(r11)     // Catch:{ all -> 0x0eac }
            if (r6 == 0) goto L_0x0eaa
            boolean r1 = r6.A03     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x0785
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "IncomingInactiveAccountPushObserverImpl/handleIncomingPushMessage/"
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = r6.A07     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = X.C57072t2.A01(r0)     // Catch:{ all -> 0x0eac }
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = " account logged out, ignoring notification"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0785:
            java.lang.String r10 = r0.A00()     // Catch:{ all -> 0x0eac }
            int r1 = r10.hashCode()     // Catch:{ all -> 0x0eac }
            switch(r1) {
                case -1127809222: goto L_0x0b6b;
                case -395094592: goto L_0x0b0e;
                case -318861064: goto L_0x0ad2;
                case 239102022: goto L_0x0acd;
                case 757346421: goto L_0x0a44;
                case 954925063: goto L_0x0792;
                case 1006153287: goto L_0x079c;
                default: goto L_0x0790;
            }     // Catch:{ all -> 0x0eac }
        L_0x0790:
            goto L_0x0eaa
        L_0x0792:
            java.lang.String r1 = "message"
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x07a4
            goto L_0x0eaa
        L_0x079c:
            java.lang.String r1 = "group_message"
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0eaa
        L_0x07a4:
            X.30A r4 = r2.A02     // Catch:{ all -> 0x0eac }
            if (r7 != 0) goto L_0x07ae
            X.2sH r1 = r2.A03     // Catch:{ all -> 0x0eac }
            long r16 = r1.A0H()     // Catch:{ all -> 0x0eac }
        L_0x07ae:
            java.lang.String r1 = "InactiveAccountNotificationManager/processMessageNotification"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            X.30k r1 = r4.A01     // Catch:{ all -> 0x0eac }
            r34 = r1
            X.2nq r9 = r1.A03(r11)     // Catch:{ all -> 0x0eac }
            if (r9 == 0) goto L_0x092c
            boolean r1 = r0 instanceof X.C32221pl     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x092c
            X.1pl r0 = (X.C32221pl) r0     // Catch:{ all -> 0x0eac }
            X.2ds r1 = r4.A03     // Catch:{ all -> 0x0eac }
            r33 = r1
            X.4uZ r1 = r0.A00     // Catch:{ all -> 0x0eac }
            r32 = r1
            java.lang.String r13 = r32.getRawString()     // Catch:{ all -> 0x0eac }
            r12 = 1
            X.C162457s7.A0J(r13, r12)     // Catch:{ all -> 0x0eac }
            java.lang.String r15 = "message"
            java.lang.String r7 = "group_message"
            java.lang.String[] r2 = new java.lang.String[]{r15, r7}     // Catch:{ all -> 0x0eac }
            r18 = 1
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x0eac }
            java.lang.String r3 = r9.A07     // Catch:{ all -> 0x0eac }
            r1[r5] = r3     // Catch:{ all -> 0x0eac }
            java.lang.Object[] r2 = X.C73713fx.A06(r1, r2)     // Catch:{ all -> 0x0eac }
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x0eac }
            r1[r5] = r13     // Catch:{ all -> 0x0eac }
            java.lang.Object[] r13 = X.C73713fx.A06(r2, r1)     // Catch:{ all -> 0x0eac }
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ all -> 0x0eac }
            long r1 = r9.A04     // Catch:{ all -> 0x0eac }
            X.AnonymousClass0x2.A1S(r12, r5, r1)     // Catch:{ all -> 0x0eac }
            java.lang.Object[] r14 = X.C73713fx.A06(r13, r12)     // Catch:{ all -> 0x0eac }
            java.lang.String[] r14 = (java.lang.String[]) r14     // Catch:{ all -> 0x0eac }
            X.4GK r13 = X.C18630y0.A00(r33)     // Catch:{ all -> 0x0867 }
            r1 = r13
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0860 }
            X.2sg r1 = r1.A03     // Catch:{ all -> 0x0860 }
            r19 = r1
            r12 = 2
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0860 }
            java.lang.String r1 = "SELECT sender_jid FROM notifications WHERE account_lid = ? AND notification_type IN "
            X.C57212tH.A02(r1, r2, r12)     // Catch:{ all -> 0x0860 }
            java.lang.String r1 = " AND sender_jid = ? AND timestamp >= ?"
            java.lang.String r12 = X.AnonymousClass000.A0X(r1, r2)     // Catch:{ all -> 0x0860 }
            java.lang.String r2 = "GET_SENDERS_FOR_NOT_LID_AND_NOTIFICATION_TYPE"
            r1 = r19
            android.database.Cursor r1 = r1.A0E(r12, r2, r14)     // Catch:{ all -> 0x0860 }
            int r2 = r1.getCount()     // Catch:{ all -> 0x0859 }
            if (r2 > 0) goto L_0x0827
            r18 = 0
        L_0x0827:
            r1.close()     // Catch:{ all -> 0x0860 }
            r13.close()     // Catch:{ all -> 0x0867 }
            if (r18 == 0) goto L_0x0873
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0eac }
            X.2sH r1 = r4.A08     // Catch:{ all -> 0x0eac }
            long r1 = r1.A0H()     // Catch:{ all -> 0x0eac }
            long r12 = r9.A05     // Catch:{ all -> 0x0eac }
            long r1 = r1 - r12
            long r18 = r14.toSeconds(r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r2 = r0.A02     // Catch:{ all -> 0x0eac }
            boolean r1 = X.C162457s7.A0P(r2, r15)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0849
            r12 = 30
            goto L_0x0851
        L_0x0849:
            boolean r1 = X.C162457s7.A0P(r2, r7)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0856
            r12 = 120(0x78, double:5.93E-322)
        L_0x0851:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0856
            goto L_0x0873
        L_0x0856:
            r13 = 0
            goto L_0x08f3
        L_0x0859:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x085b }
        L_0x085b:
            r12 = move-exception
            X.AnonymousClass2A8.A00(r1, r2)     // Catch:{ all -> 0x0860 }
            throw r12     // Catch:{ all -> 0x0860 }
        L_0x0860:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0862 }
        L_0x0862:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r13, r2)     // Catch:{ all -> 0x0867 }
            throw r1     // Catch:{ all -> 0x0867 }
        L_0x0867:
            r1 = move-exception
            java.lang.Throwable r2 = X.AnonymousClass3Z0.A00(r1)     // Catch:{ all -> 0x0eac }
            if (r2 == 0) goto L_0x0873
            java.lang.String r1 = "InactiveNotificationsStore/doesMessageSenderExist/failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0eac }
        L_0x0873:
            X.2sH r1 = r4.A08     // Catch:{ all -> 0x0eac }
            long r14 = r1.A0H()     // Catch:{ all -> 0x0eac }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "AccountSwitchingDataRepo/updateLastBuzzedTime/"
            X.C57072t2.A03(r1, r3, r2)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "/lastBuzzedTimeMs:"
            X.C18260x0.A12(r1, r2, r14)     // Catch:{ all -> 0x0eac }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0eac }
            X.5SO r13 = r34.A02()     // Catch:{ all -> 0x0eac }
            java.util.List r2 = r13.A01     // Catch:{ all -> 0x0eac }
            r1.addAll(r2)     // Catch:{ all -> 0x0eac }
            boolean r2 = X.C613630k.A01(r3, r1)     // Catch:{ all -> 0x0eac }
            if (r2 != 0) goto L_0x08a0
            java.lang.String r1 = "AccountSwitchingDataRepo/updateLastBuzzedTime/Account doesn't exist"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            goto L_0x08f2
        L_0x08a0:
            java.util.ArrayList r12 = X.C73783g4.A0c(r1)     // Catch:{ all -> 0x0eac }
            java.util.Iterator r18 = r1.iterator()     // Catch:{ all -> 0x0eac }
        L_0x08a8:
            boolean r1 = r18.hasNext()     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x08e9
            java.lang.Object r2 = r18.next()     // Catch:{ all -> 0x0eac }
            X.2nq r2 = (X.C53892nq) r2     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = r2.A07     // Catch:{ all -> 0x0eac }
            r20 = r1
            boolean r1 = X.C162457s7.A0P(r1, r3)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x08e5
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x0eac }
            r21 = r1
            java.lang.String r1 = r2.A08     // Catch:{ all -> 0x0eac }
            r22 = r1
            int r1 = r2.A00     // Catch:{ all -> 0x0eac }
            r23 = r1
            boolean r1 = r2.A03     // Catch:{ all -> 0x0eac }
            r29 = r1
            boolean r1 = r2.A02     // Catch:{ all -> 0x0eac }
            r30 = r1
            int r1 = r2.A01     // Catch:{ all -> 0x0eac }
            r24 = r1
            long r1 = r2.A04     // Catch:{ all -> 0x0eac }
            r27 = r1
            X.2nq r2 = new X.2nq     // Catch:{ all -> 0x0eac }
            r19 = r2
            r25 = r27
            r27 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29, r30)     // Catch:{ all -> 0x0eac }
        L_0x08e5:
            r12.add(r2)     // Catch:{ all -> 0x0eac }
            goto L_0x08a8
        L_0x08e9:
            X.5SO r2 = X.C18310x6.A0P(r13, r12)     // Catch:{ all -> 0x0eac }
            r1 = r34
            r1.A09(r2)     // Catch:{ all -> 0x0eac }
        L_0x08f2:
            r13 = 1
        L_0x08f3:
            java.lang.String r1 = r32.getRawString()     // Catch:{ all -> 0x0eac }
            com.whatsapp.jid.GroupJid r2 = r0.A01     // Catch:{ all -> 0x0eac }
            if (r2 == 0) goto L_0x090f
            java.lang.String r12 = r2.getRawString()     // Catch:{ all -> 0x0eac }
        L_0x08ff:
            java.lang.String r14 = r0.A04     // Catch:{ all -> 0x0eac }
            r0 = 3
            X.C162457s7.A0J(r1, r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            boolean r0 = r10.equals(r7)     // Catch:{ all -> 0x0eac }
            goto L_0x0911
        L_0x090f:
            r12 = 0
            goto L_0x08ff
        L_0x0911:
            if (r0 != 0) goto L_0x091c
            java.lang.String r0 = "voip_call_offer_group"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x0955
        L_0x091c:
            if (r12 == 0) goto L_0x0924
            int r0 = r12.length()     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x0955
        L_0x0924:
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification/invalidNotificationData"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
        L_0x0929:
            r4.A03(r9, r5, r13)     // Catch:{ all -> 0x0eac }
        L_0x092c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/"
            r1.append(r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r2 = r6.A07     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = X.C57072t2.A01(r2)     // Catch:{ all -> 0x0eac }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0eac }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0eac }
            X.5SO r10 = r38.A02()     // Catch:{ all -> 0x0eac }
            java.util.List r0 = r10.A01     // Catch:{ all -> 0x0eac }
            r11.addAll(r0)     // Catch:{ all -> 0x0eac }
            boolean r0 = X.C613630k.A01(r2, r11)     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x09b7
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/Account doesn't exists"
            goto L_0x0aa1
        L_0x0955:
            X.4Fq r3 = X.C18630y0.A05(r33)     // Catch:{ all -> 0x09a5 }
            X.3Yo r15 = r3.Axl()     // Catch:{ all -> 0x099e }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0997 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x0997 }
            java.lang.String r2 = "notifications"
            android.content.ContentValues r10 = A00(r11, r10, r1)     // Catch:{ all -> 0x0997 }
            r0 = r16
            X.C18290x4.A19(r10, r0)     // Catch:{ all -> 0x0997 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0997 }
            java.lang.String r0 = "call_status"
            r10.put(r0, r1)     // Catch:{ all -> 0x0997 }
            if (r12 == 0) goto L_0x097e
            java.lang.String r0 = "group_jid"
            r10.put(r0, r12)     // Catch:{ all -> 0x0997 }
        L_0x097e:
            if (r14 == 0) goto L_0x0985
            java.lang.String r0 = "display_name"
            r10.put(r0, r14)     // Catch:{ all -> 0x0997 }
        L_0x0985:
            r1 = 5
            java.lang.String r0 = "INSERT_INACTIVE_NOTIFICATION"
            r7.A0C(r2, r0, r10, r1)     // Catch:{ all -> 0x0997 }
            r15.A00()     // Catch:{ all -> 0x0997 }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0997 }
            r15.close()     // Catch:{ all -> 0x099e }
            r3.close()     // Catch:{ all -> 0x09a5 }
            goto L_0x09aa
        L_0x0997:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0999 }
        L_0x0999:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r15, r1)     // Catch:{ all -> 0x099e }
            throw r0     // Catch:{ all -> 0x099e }
        L_0x099e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x09a0 }
        L_0x09a0:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x09a5 }
            throw r0     // Catch:{ all -> 0x09a5 }
        L_0x09a5:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x0eac }
        L_0x09aa:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0929
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0eac }
            goto L_0x0929
        L_0x09b7:
            java.util.Iterator r3 = r11.iterator()     // Catch:{ all -> 0x0eac }
        L_0x09bb:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0eac }
            r9 = 0
            if (r0 == 0) goto L_0x09ef
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0eac }
            boolean r0 = X.C53892nq.A00(r1, r2)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x09bb
        L_0x09cc:
            X.2nq r1 = (X.C53892nq) r1     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x09ed
            int r0 = r1.A01     // Catch:{ all -> 0x0eac }
            int r0 = r0 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0eac }
        L_0x09d8:
            java.util.Iterator r3 = r11.iterator()     // Catch:{ all -> 0x0eac }
        L_0x09dc:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x09f2
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0eac }
            boolean r0 = X.C53892nq.A00(r1, r2)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x09dc
            goto L_0x09f1
        L_0x09ed:
            r7 = r9
            goto L_0x09d8
        L_0x09ef:
            r1 = r9
            goto L_0x09cc
        L_0x09f1:
            r9 = r1
        L_0x09f2:
            X.2nq r9 = (X.C53892nq) r9     // Catch:{ all -> 0x0eac }
            if (r9 == 0) goto L_0x0a01
            if (r7 == 0) goto L_0x09f9
            goto L_0x09fb
        L_0x09f9:
            r0 = 0
            goto L_0x09ff
        L_0x09fb:
            int r0 = r7.intValue()     // Catch:{ all -> 0x0eac }
        L_0x09ff:
            r9.A01 = r0     // Catch:{ all -> 0x0eac }
        L_0x0a01:
            X.5SO r1 = X.C18310x6.A0P(r10, r11)     // Catch:{ all -> 0x0eac }
            r0 = r38
            boolean r0 = r0.A09(r1)     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x0a14
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/Failed to update inactiveAccounts"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0a14:
            if (r7 == 0) goto L_0x0eaa
            int r1 = r7.intValue()     // Catch:{ all -> 0x0eac }
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0eaa
            r36 = 0
            java.lang.String r0 = "InactiveAccountNotificationManager/showOfflineMessagesCountWarning"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            X.2zr r3 = r4.A05     // Catch:{ all -> 0x0eac }
            X.21w r0 = X.C373421w.UNREAD_MSG_LIMIT     // Catch:{ all -> 0x0eac }
            java.lang.String r32 = X.AnonymousClass30A.A00(r0, r2)     // Catch:{ all -> 0x0eac }
            java.lang.String r33 = r4.A01(r6)     // Catch:{ all -> 0x0eac }
            X.2oU r1 = r4.A09     // Catch:{ all -> 0x0eac }
            r0 = 2131886268(0x7f1200bc, float:1.940711E38)
            java.lang.String r34 = X.C54292oU.A04(r1, r0)     // Catch:{ all -> 0x0eac }
            android.content.Context r0 = r1.A00     // Catch:{ all -> 0x0eac }
            r1 = 11
            android.content.Intent r30 = X.C627736r.A0z(r0, r2, r1, r5)     // Catch:{ all -> 0x0eac }
            goto L_0x0b03
        L_0x0a44:
            java.lang.String r0 = "post_reg"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x0eaa
            X.30A r1 = r2.A02     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "InactiveAccountNotificationManager/showPostRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            X.2zr r2 = r1.A05     // Catch:{ all -> 0x0eac }
            java.lang.String r3 = r6.A07     // Catch:{ all -> 0x0eac }
            X.21w r0 = X.C373421w.REGISTRATION     // Catch:{ all -> 0x0eac }
            java.lang.String r32 = X.AnonymousClass30A.A00(r0, r3)     // Catch:{ all -> 0x0eac }
            java.lang.String r33 = r1.A01(r6)     // Catch:{ all -> 0x0eac }
            X.2oU r1 = r1.A09     // Catch:{ all -> 0x0eac }
            r0 = 2131891320(0x7f121478, float:1.9417357E38)
            java.lang.String r34 = X.C54292oU.A04(r1, r0)     // Catch:{ all -> 0x0eac }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x0eac }
            r0 = 10
            android.content.Intent r30 = X.C627736r.A0z(r1, r3, r0, r5)     // Catch:{ all -> 0x0eac }
            r36 = 1
            r29 = r2
            r35 = r0
            r37 = r36
            r29.A03(r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0eac }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "AccountSwitchingDataRepo/updateAccountLoginFlag/"
            X.C57072t2.A03(r0, r3, r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "/isLoggedIn/"
            X.C18260x0.A1E(r0, r1, r5)     // Catch:{ all -> 0x0eac }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0eac }
            X.5SO r4 = r38.A02()     // Catch:{ all -> 0x0eac }
            java.util.List r0 = r4.A01     // Catch:{ all -> 0x0eac }
            r6.addAll(r0)     // Catch:{ all -> 0x0eac }
            boolean r0 = X.C613630k.A01(r3, r6)     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x0aa6
            java.lang.String r0 = "AccountSwitchingDataRepo/updateAccountLoginFlag/Account doesn't exists"
        L_0x0aa1:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0aa6:
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x0eac }
        L_0x0aaa:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x0acb
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0eac }
            boolean r0 = X.C53892nq.A00(r1, r3)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x0aaa
        L_0x0aba:
            X.2nq r1 = (X.C53892nq) r1     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0ac0
            r1.A03 = r5     // Catch:{ all -> 0x0eac }
        L_0x0ac0:
            X.5SO r1 = X.C18310x6.A0P(r4, r6)     // Catch:{ all -> 0x0eac }
            r0 = r38
            r0.A09(r1)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0acb:
            r1 = 0
            goto L_0x0aba
        L_0x0acd:
            java.lang.String r1 = "voip_call_offer_1on1"
            goto L_0x0b6e
        L_0x0ad2:
            java.lang.String r0 = "pre_reg"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x0eaa
            X.30A r1 = r2.A02     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "InactiveAccountNotificationManager/showPreRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            X.2zr r3 = r1.A05     // Catch:{ all -> 0x0eac }
            java.lang.String r2 = r6.A07     // Catch:{ all -> 0x0eac }
            X.21w r0 = X.C373421w.REGISTRATION     // Catch:{ all -> 0x0eac }
            java.lang.String r32 = X.AnonymousClass30A.A00(r0, r2)     // Catch:{ all -> 0x0eac }
            java.lang.String r33 = r1.A01(r6)     // Catch:{ all -> 0x0eac }
            X.2oU r1 = r1.A09     // Catch:{ all -> 0x0eac }
            r0 = 2131891324(0x7f12147c, float:1.9417365E38)
            java.lang.String r34 = X.C54292oU.A04(r1, r0)     // Catch:{ all -> 0x0eac }
            android.content.Context r0 = r1.A00     // Catch:{ all -> 0x0eac }
            r1 = 9
            android.content.Intent r30 = X.C627736r.A0z(r0, r2, r1, r5)     // Catch:{ all -> 0x0eac }
            r36 = 1
        L_0x0b03:
            r29 = r3
            r35 = r1
            r37 = r36
            r29.A03(r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0b0e:
            java.lang.String r1 = "call_terminate"
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0eaa
            X.30A r3 = r2.A02     // Catch:{ all -> 0x0eac }
            X.1pm r0 = (X.C32231pm) r0     // Catch:{ all -> 0x0eac }
            X.C162457s7.A0J(r0, r5)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "InactiveAccountNotificationManager/terminateCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r4 = r0.A07     // Catch:{ all -> 0x0eac }
            X.C162457s7.A0H(r4)     // Catch:{ all -> 0x0eac }
            java.lang.String r6 = r0.A05     // Catch:{ all -> 0x0eac }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)     // Catch:{ all -> 0x0eac }
            X.21w r0 = X.C373421w.RINGING_CALL     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = X.AnonymousClass30A.A00(r0, r4)     // Catch:{ all -> 0x0eac }
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0eac }
            X.33i r0 = r3.A07     // Catch:{ all -> 0x0eac }
            android.app.NotificationManager r1 = r0.A0A()     // Catch:{ all -> 0x0eac }
            X.C626936e.A06(r1)     // Catch:{ all -> 0x0eac }
            r0 = 64
            r1.cancel(r2, r0)     // Catch:{ all -> 0x0eac }
            X.1uL r0 = r3.A0A     // Catch:{ all -> 0x0eac }
            X.0Xb r0 = X.C72333dY.A01(r0)     // Catch:{ all -> 0x0eac }
            r0.A0A(r2)     // Catch:{ all -> 0x0eac }
            if (r4 == 0) goto L_0x0eaa
            X.2ds r0 = r3.A03     // Catch:{ all -> 0x0eac }
            r0.A01(r4, r6)     // Catch:{ all -> 0x0eac }
            java.lang.String r2 = "InactiveAccountNotificationManager/showCallNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0eac }
            X.30k r0 = r3.A01     // Catch:{ all -> 0x0eac }
            X.2nq r1 = r0.A03(r4)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0eaa
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0eac }
            r0 = 1
            r3.A03(r1, r0, r5)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0b6b:
            java.lang.String r1 = "voip_call_offer_group"
        L_0x0b6e:
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0eaa
            X.30A r10 = r2.A02     // Catch:{ all -> 0x0eac }
            X.1pm r0 = (X.C32231pm) r0     // Catch:{ all -> 0x0eac }
            r9 = 1
            X.C162457s7.A0J(r0, r9)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "InactiveAccountNotificationManager/showRingingCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r12 = r6.A07     // Catch:{ all -> 0x0eac }
            java.lang.String r15 = r0.A05     // Catch:{ all -> 0x0eac }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r15)     // Catch:{ all -> 0x0eac }
            X.21w r1 = X.C373421w.RINGING_CALL     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = X.AnonymousClass30A.A00(r1, r12)     // Catch:{ all -> 0x0eac }
            java.lang.String r11 = X.AnonymousClass000.A0X(r1, r2)     // Catch:{ all -> 0x0eac }
            com.whatsapp.jid.DeviceJid r1 = r0.A02     // Catch:{ all -> 0x0eac }
            X.C162457s7.A0H(r1)     // Catch:{ all -> 0x0eac }
            com.whatsapp.jid.UserJid r1 = r1.userJid     // Catch:{ all -> 0x0eac }
            java.lang.String r14 = r1.getRawString()     // Catch:{ all -> 0x0eac }
            boolean r3 = r0.A08     // Catch:{ all -> 0x0eac }
            java.lang.String r13 = r0.A06     // Catch:{ all -> 0x0eac }
            java.lang.String r7 = "voip_call_offer_group"
            boolean r1 = X.C162457s7.A0P(r13, r7)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0bb0
            com.whatsapp.jid.GroupJid r1 = r0.A04     // Catch:{ all -> 0x0eac }
            r2 = 1
            if (r1 != 0) goto L_0x0bb1
        L_0x0bb0:
            r2 = 0
        L_0x0bb1:
            X.2oU r1 = r10.A09     // Catch:{ all -> 0x0eac }
            r23 = r1
            if (r2 == 0) goto L_0x0bc0
            r4 = 2131890127(0x7f120fcf, float:1.9414937E38)
            if (r3 == 0) goto L_0x0bc8
            r4 = 2131890126(0x7f120fce, float:1.9414935E38)
            goto L_0x0bc8
        L_0x0bc0:
            r4 = 2131890129(0x7f120fd1, float:1.9414941E38)
            if (r3 == 0) goto L_0x0bc8
            r4 = 2131890128(0x7f120fd0, float:1.941494E38)
        L_0x0bc8:
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x0eac }
            java.lang.String r2 = r10.A02(r6, r14)     // Catch:{ all -> 0x0eac }
            java.lang.String r20 = X.C54292oU.A05(r1, r2, r3, r5, r4)     // Catch:{ all -> 0x0eac }
            X.C162457s7.A0D(r20)     // Catch:{ all -> 0x0eac }
            java.lang.String r19 = r10.A01(r6)     // Catch:{ all -> 0x0eac }
            java.util.concurrent.TimeUnit r16 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0eac }
            long r1 = r0.A00     // Catch:{ all -> 0x0eac }
            long r3 = r0.A01     // Catch:{ all -> 0x0eac }
            long r1 = r1 + r3
            r3 = r16
            long r2 = r3.toMillis(r1)     // Catch:{ all -> 0x0eac }
            X.2sH r1 = r10.A08     // Catch:{ all -> 0x0eac }
            r22 = r1
            long r16 = r22.A0H()     // Catch:{ all -> 0x0eac }
            long r2 = r2 - r16
            r17 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r16 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            X.2ds r1 = r10.A03     // Catch:{ all -> 0x0eac }
            r21 = r1
            long r17 = r22.A0H()     // Catch:{ all -> 0x0eac }
            com.whatsapp.jid.GroupJid r1 = r0.A04     // Catch:{ all -> 0x0eac }
            if (r16 > 0) goto L_0x0c9f
            if (r1 == 0) goto L_0x0c07
            java.lang.String r4 = r1.getRawString()     // Catch:{ all -> 0x0eac }
        L_0x0c07:
            r1 = 3
            X.C162457s7.A0J(r14, r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "InactiveNotificationsStore/insertNotification"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "group_message"
            boolean r1 = X.C162457s7.A0P(r13, r1)     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x0c1e
            boolean r1 = X.C162457s7.A0P(r13, r7)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0c3e
        L_0x0c1e:
            if (r4 == 0) goto L_0x0c26
            int r1 = r4.length()     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x0c3e
        L_0x0c26:
            java.lang.String r1 = "InactiveNotificationsStore/insertNotification/invalidNotificationData"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
        L_0x0c2b:
            java.lang.String r1 = "InactiveAccountNotificationManager/Inactive Account call expiry <= current time"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = r0.A07     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x0eaa
            java.lang.String r0 = "InactiveAccountNotificationManager/showCallNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            r10.A03(r6, r9, r5)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0c3e:
            X.4Fq r3 = X.C18630y0.A05(r21)     // Catch:{ all -> 0x0c8e }
            X.3Yo r16 = r3.Axl()     // Catch:{ all -> 0x0c87 }
            r1 = r3
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0c7e }
            X.2sg r11 = r1.A03     // Catch:{ all -> 0x0c7e }
            java.lang.String r7 = "notifications"
            android.content.ContentValues r12 = A00(r12, r13, r14)     // Catch:{ all -> 0x0c7e }
            r1 = r17
            X.C18290x4.A19(r12, r1)     // Catch:{ all -> 0x0c7e }
            java.lang.String r1 = "call_id"
            r12.put(r1, r15)     // Catch:{ all -> 0x0c7e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0c7e }
            java.lang.String r1 = "call_status"
            r12.put(r1, r2)     // Catch:{ all -> 0x0c7e }
            if (r4 == 0) goto L_0x0c6c
            java.lang.String r1 = "group_jid"
            r12.put(r1, r4)     // Catch:{ all -> 0x0c7e }
        L_0x0c6c:
            r2 = 5
            java.lang.String r1 = "INSERT_INACTIVE_NOTIFICATION"
            r11.A0C(r7, r1, r12, r2)     // Catch:{ all -> 0x0c7e }
            r16.A00()     // Catch:{ all -> 0x0c7e }
            X.2wD r1 = X.C59022wD.A00     // Catch:{ all -> 0x0c7e }
            r16.close()     // Catch:{ all -> 0x0c87 }
            r3.close()     // Catch:{ all -> 0x0c8e }
            goto L_0x0c93
        L_0x0c7e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0c80 }
        L_0x0c80:
            r2 = move-exception
            r1 = r16
            X.AnonymousClass2A8.A00(r1, r4)     // Catch:{ all -> 0x0c87 }
            throw r2     // Catch:{ all -> 0x0c87 }
        L_0x0c87:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0c89 }
        L_0x0c89:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r3, r2)     // Catch:{ all -> 0x0c8e }
            throw r1     // Catch:{ all -> 0x0c8e }
        L_0x0c8e:
            r1 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r1)     // Catch:{ all -> 0x0eac }
        L_0x0c93:
            java.lang.Throwable r2 = X.AnonymousClass3Z9.A00(r1)     // Catch:{ all -> 0x0eac }
            if (r2 == 0) goto L_0x0c2b
            java.lang.String r1 = "InactiveNotificationsStore/insertNotification/failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0eac }
            goto L_0x0c2b
        L_0x0c9f:
            if (r1 == 0) goto L_0x0ca5
            java.lang.String r4 = r1.getRawString()     // Catch:{ all -> 0x0eac }
        L_0x0ca5:
            r0 = 3
            X.C162457s7.A0J(r14, r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "group_message"
            boolean r0 = X.C162457s7.A0P(r13, r0)     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x0cbc
            boolean r0 = X.C162457s7.A0P(r13, r7)     // Catch:{ all -> 0x0eac }
            if (r0 == 0) goto L_0x0dc1
        L_0x0cbc:
            if (r4 == 0) goto L_0x0cc4
            int r0 = r4.length()     // Catch:{ all -> 0x0eac }
            if (r0 != 0) goto L_0x0dc1
        L_0x0cc4:
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification/invalidNotificationData"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0eac }
        L_0x0cc9:
            r0 = 64
            X.0Q9 r7 = new X.0Q9     // Catch:{ all -> 0x0eac }
            r7.<init>()     // Catch:{ all -> 0x0eac }
            java.lang.String r4 = "inactiveAccountNotificationId"
            r7.A01(r4, r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "inactiveAccountNotificationLid"
            java.util.Map r6 = r7.A00     // Catch:{ all -> 0x0eac }
            r6.put(r0, r12)     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "inactiveAccountNotificationTag"
            r6.put(r1, r11)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "inactiveAccountNotificationCallId"
            r6.put(r0, r15)     // Catch:{ all -> 0x0eac }
            X.0Xq r7 = r7.A00()     // Catch:{ all -> 0x0eac }
            java.lang.Class<com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker> r0 = com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker.class
            X.0Aw r6 = new X.0Aw     // Catch:{ all -> 0x0eac }
            r6.<init>(r0)     // Catch:{ all -> 0x0eac }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0eac }
            r6.A02(r2, r0)     // Catch:{ all -> 0x0eac }
            X.0Wv r0 = r6.A00     // Catch:{ all -> 0x0eac }
            r0.A0B = r7     // Catch:{ all -> 0x0eac }
            r6.A06(r11)     // Catch:{ all -> 0x0eac }
            X.0NS r2 = r6.A00()     // Catch:{ all -> 0x0eac }
            X.1uL r0 = r10.A0A     // Catch:{ all -> 0x0eac }
            X.0Xb r0 = X.C72333dY.A01(r0)     // Catch:{ all -> 0x0eac }
            r0.A08(r2)     // Catch:{ all -> 0x0eac }
            r0 = r23
            android.content.Context r13 = r0.A00     // Catch:{ all -> 0x0eac }
            java.lang.Class<com.whatsapp.accountswitching.notifications.InactiveAccountNotificationReceiver> r0 = com.whatsapp.accountswitching.notifications.InactiveAccountNotificationReceiver.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r13, r0)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "com.whatsapp.accountswitching.inactiveaccount.IgnoreCall"
            r2.setAction(r0)     // Catch:{ all -> 0x0eac }
            r0 = 64
            r2.putExtra(r4, r0)     // Catch:{ all -> 0x0eac }
            r2.putExtra(r1, r11)     // Catch:{ all -> 0x0eac }
            android.app.PendingIntent r6 = X.C624735e.A03(r13, r2, r5)     // Catch:{ all -> 0x0eac }
            X.C162457s7.A0D(r6)     // Catch:{ all -> 0x0eac }
            r3 = 2131231738(0x7f0803fa, float:1.8079565E38)
            r2 = 2131895328(0x7f122420, float:1.9425486E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r23)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x0eac }
            X.0Tm r7 = new X.0Tm     // Catch:{ all -> 0x0eac }
            r7.<init>(r3, r0, r6)     // Catch:{ all -> 0x0eac }
            r0 = 4
            android.content.Intent r2 = X.C627736r.A0z(r13, r12, r0, r5)     // Catch:{ all -> 0x0eac }
            r0 = 64
            r2.putExtra(r4, r0)     // Catch:{ all -> 0x0eac }
            r2.putExtra(r1, r11)     // Catch:{ all -> 0x0eac }
            android.app.PendingIntent r14 = X.C624735e.A04(r13, r2, r5)     // Catch:{ all -> 0x0eac }
            X.C162457s7.A0D(r14)     // Catch:{ all -> 0x0eac }
            r3 = 2131231718(0x7f0803e6, float:1.8079525E38)
            r2 = 2131886280(0x7f1200c8, float:1.9407134E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r23)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x0eac }
            X.0Tm r6 = new X.0Tm     // Catch:{ all -> 0x0eac }
            r6.<init>(r3, r0, r14)     // Catch:{ all -> 0x0eac }
            r0 = 4
            android.content.Intent r12 = X.C627736r.A0z(r13, r12, r0, r5)     // Catch:{ all -> 0x0eac }
            r0 = 64
            r12.putExtra(r4, r0)     // Catch:{ all -> 0x0eac }
            r12.putExtra(r1, r11)     // Catch:{ all -> 0x0eac }
            X.2zr r4 = r10.A05     // Catch:{ all -> 0x0eac }
            r2 = 64
            X.C162457s7.A0J(r11, r9)     // Catch:{ all -> 0x0eac }
            r10 = 3
            X.2oU r0 = r4.A02     // Catch:{ all -> 0x0eac }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0eac }
            X.0Ue r3 = X.C66553Lw.A01(r1)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "call"
            r3.A0J = r0     // Catch:{ all -> 0x0eac }
            r3.A03 = r9     // Catch:{ all -> 0x0eac }
            r3.A02(r10)     // Catch:{ all -> 0x0eac }
            r3.A0E(r9)     // Catch:{ all -> 0x0eac }
            r0 = r20
            r3.A0A(r0)     // Catch:{ all -> 0x0eac }
            r0 = r19
            r3.A0B(r0)     // Catch:{ all -> 0x0eac }
            java.util.ArrayList r0 = r3.A0O     // Catch:{ all -> 0x0eac }
            r0.add(r7)     // Catch:{ all -> 0x0eac }
            r0.add(r6)     // Catch:{ all -> 0x0eac }
            android.app.PendingIntent r0 = X.C624735e.A04(r1, r12, r5)     // Catch:{ all -> 0x0eac }
            r3.A09 = r0     // Catch:{ all -> 0x0eac }
            r1 = 2131233341(0x7f080a3d, float:1.8082817E38)
            android.app.Notification r0 = r3.A07     // Catch:{ all -> 0x0eac }
            r0.icon = r1     // Catch:{ all -> 0x0eac }
            r3.A0F(r9)     // Catch:{ all -> 0x0eac }
            java.lang.String r0 = "critical_app_alerts@1"
            r3.A0K = r0     // Catch:{ all -> 0x0eac }
            r0 = r20
            r3.A0C(r0)     // Catch:{ all -> 0x0eac }
            X.33T r1 = r4.A03     // Catch:{ all -> 0x0eac }
            android.app.Notification r0 = r3.A01()     // Catch:{ all -> 0x0eac }
            r1.A0A(r11, r2, r0)     // Catch:{ all -> 0x0eac }
            goto L_0x0eaa
        L_0x0dc1:
            X.4Fq r6 = X.C18630y0.A05(r21)     // Catch:{ all -> 0x0e15 }
            X.3Yo r16 = r6.Axl()     // Catch:{ all -> 0x0e0e }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0e05 }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x0e05 }
            r21 = r0
            java.lang.String r7 = "notifications"
            android.content.ContentValues r13 = A00(r12, r13, r14)     // Catch:{ all -> 0x0e05 }
            r0 = r17
            X.C18290x4.A19(r13, r0)     // Catch:{ all -> 0x0e05 }
            java.lang.String r0 = "call_id"
            r13.put(r0, r15)     // Catch:{ all -> 0x0e05 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0e05 }
            java.lang.String r0 = "call_status"
            r13.put(r0, r1)     // Catch:{ all -> 0x0e05 }
            if (r4 == 0) goto L_0x0df1
            java.lang.String r0 = "group_jid"
            r13.put(r0, r4)     // Catch:{ all -> 0x0e05 }
        L_0x0df1:
            r4 = 5
            java.lang.String r1 = "INSERT_INACTIVE_NOTIFICATION"
            r0 = r21
            r0.A0C(r7, r1, r13, r4)     // Catch:{ all -> 0x0e05 }
            r16.A00()     // Catch:{ all -> 0x0e05 }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0e05 }
            r16.close()     // Catch:{ all -> 0x0e0e }
            r6.close()     // Catch:{ all -> 0x0e15 }
            goto L_0x0e1a
        L_0x0e05:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0e07 }
        L_0x0e07:
            r1 = move-exception
            r0 = r16
            X.AnonymousClass2A8.A00(r0, r4)     // Catch:{ all -> 0x0e0e }
            throw r1     // Catch:{ all -> 0x0e0e }
        L_0x0e0e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0e10 }
        L_0x0e10:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x0e15 }
            throw r0     // Catch:{ all -> 0x0e15 }
        L_0x0e15:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x0eac }
        L_0x0e1a:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0cc9
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0eac }
            goto L_0x0cc9
        L_0x0e27:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0eac }
            r2 = r60
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0eac }
            if (r1 != 0) goto L_0x0e39
            java.lang.String r1 = "registration_code"
            r4.put(r1, r2)     // Catch:{ all -> 0x0eac }
        L_0x0e39:
            if (r0 == 0) goto L_0x0e41
            java.lang.String r1 = "push_payload"
            r4.put(r1, r0)     // Catch:{ all -> 0x0eac }
        L_0x0e41:
            java.util.Set r1 = r8.A0D     // Catch:{ all -> 0x0eac }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x0eac }
        L_0x0e47:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0e5d
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0eac }
            X.2b0 r5 = (X.C46052b0) r5     // Catch:{ all -> 0x0eac }
            r3 = r44
            r2 = r40
            r1 = r43
            r5.A00(r3, r2, r1)     // Catch:{ all -> 0x0eac }
            goto L_0x0e47
        L_0x0e5d:
            X.3Qu r2 = r8.A0C     // Catch:{ all -> 0x0eac }
            if (r48 != 0) goto L_0x0e63
            r21 = r46
        L_0x0e63:
            r1 = r21
            r2.A06(r1)     // Catch:{ all -> 0x0eac }
            if (r9 == 0) goto L_0x0e70
            boolean r1 = r9.booleanValue()     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0ea1
        L_0x0e70:
            java.util.Set r1 = r8.A0E     // Catch:{ all -> 0x0eac }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0eac }
        L_0x0e76:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0ea1
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0eac }
            X.672 r3 = (X.AnonymousClass672) r3     // Catch:{ all -> 0x0eac }
            r2 = r31
            if (r18 == 0) goto L_0x0e87
            r2 = r7
        L_0x0e87:
            r1 = r45
            boolean r1 = r3.BoG(r0, r2, r1)     // Catch:{ all -> 0x0eac }
            if (r1 == 0) goto L_0x0e76
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0eac }
            java.lang.String r1 = "handling:"
            X.C18260x0.A1T(r2, r1, r3)     // Catch:{ all -> 0x0eac }
            X.AnonymousClass0x2.A18(r2)     // Catch:{ all -> 0x0eac }
            r1 = r45
            r3.BF0(r1, r4)     // Catch:{ all -> 0x0eac }
            goto L_0x0e76
        L_0x0ea1:
            if (r59 == 0) goto L_0x0eaa
            X.3Ck r1 = r8.A0B     // Catch:{ all -> 0x0eac }
            r0 = r20
            r1.A01(r0)     // Catch:{ all -> 0x0eac }
        L_0x0eaa:
            monitor-exit(r8)
            return
        L_0x0eac:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618732p.A03(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }
}
