package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.1tS  reason: invalid class name and case insensitive filesystem */
public class C33641tS extends AnonymousClass5ZM {
    public final C45742aV A00;
    public final AnonymousClass5ZU A01;
    public final C61072zf A02;
    public final C47542dQ A03;
    public final AnonymousClass3ZH A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public final boolean A07;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01cf, code lost:
        if (r32.A0d(r1) == false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05ed, code lost:
        if (r0 != null) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x071d, code lost:
        if (r29 == null) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x077d, code lost:
        if (r0 == false) goto L_0x077f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ac A[Catch:{ IOException -> 0x01e0, all -> 0x0243 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01d9 A[Catch:{ IOException -> 0x01e0, all -> 0x0243 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0262 A[SYNTHETIC, Splitter:B:181:0x0262] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x05b8 A[Catch:{ IOException -> 0x06e3, all -> 0x0711 }] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x062d A[Catch:{ IOException -> 0x06e3, all -> 0x0711 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x06d5 A[SYNTHETIC, Splitter:B:376:0x06d5] */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x07df  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x07e9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x07ea  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0803  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r36) {
        /*
            r35 = this;
            r34 = r35
            r0 = r34
            java.lang.ref.WeakReference r0 = r0.A05
            java.lang.Object r8 = r0.get()
            android.content.Context r8 = (android.content.Context) r8
            r7 = 0
            if (r8 == 0) goto L_0x089b
            r0 = r34
            X.3ZH r0 = r0.A04
            r33 = r0
            java.lang.Class<X.4uZ> r1 = X.C95814uZ.class
            X.4uZ r6 = X.AnonymousClass3ZH.A02(r0, r1)
            java.lang.String r23 = X.C18280x3.A0Y()
            r0 = r34
            X.2dQ r5 = r0.A03
            boolean r0 = r0.A07
            r21 = r0
            r11 = 0
            X.33M r22 = new X.33M
            r0 = r22
            r0.<init>((boolean) r11)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail/"
            java.lang.String r1 = X.AnonymousClass000.A0P(r6, r0, r1)
            r0 = r22
            r0.A0A(r1)
            X.3Dh r0 = r5.A00
            r32 = r0
            java.io.File r2 = r32.A0B()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r23)
            java.lang.String r0 = ".txt"
            java.io.File r20 = X.C64393Dh.A05(r2, r0, r1)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r13 = 0
            r12 = 40000(0x9c40, float:5.6052E-41)
            if (r21 == 0) goto L_0x005c
            r12 = 10000(0x2710, float:1.4013E-41)
        L_0x005c:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.3dV r0 = r5.A09     // Catch:{ SQLiteException -> 0x0259 }
            X.4GK r31 = r0.get()     // Catch:{ SQLiteException -> 0x0259 }
            r0 = r31
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x024f }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x024f }
            java.lang.String r9 = X.C58162uo.A0A     // Catch:{ all -> 0x024f }
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x024f }
            X.2sm r0 = r5.A08     // Catch:{ all -> 0x024f }
            X.C56922sm.A02(r0, r6, r1, r11)     // Catch:{ all -> 0x024f }
            X.C18270x1.A1P(r1, r12)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = "GET_MESSAGES_EMAIL_SAMPLE_SQL"
            android.database.Cursor r11 = r10.A0E(r9, r0, r1)     // Catch:{ all -> 0x024f }
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x023c
            java.util.HashSet r30 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0243 }
            r16 = 0
            r10 = 0
        L_0x008e:
            X.2qz r0 = r5.A0D     // Catch:{ all -> 0x0243 }
            X.34x r9 = r0.A04(r11, r6)     // Catch:{ all -> 0x0243 }
            if (r9 == 0) goto L_0x0234
            byte r1 = r9.A1I     // Catch:{ all -> 0x0243 }
            r0 = 88
            if (r1 == r0) goto L_0x0234
            r0 = 87
            if (r1 == r0) goto L_0x0234
            int r10 = r10 + 1
            r14 = 128(0x80, double:6.32E-322)
            long r16 = r16 + r14
            r0 = 1
            r29 = 0
            r27 = 0
            if (r1 == r0) goto L_0x01b4
            r0 = 2
            if (r1 == r0) goto L_0x01b4
            r0 = 3
            if (r1 == r0) goto L_0x01b4
            r0 = 4
            if (r1 == r0) goto L_0x00f0
            r0 = 9
            if (r1 == r0) goto L_0x01b4
            r0 = 20
            if (r1 == r0) goto L_0x01b4
            r0 = 23
            if (r1 == r0) goto L_0x01b4
            r0 = 37
            if (r1 == r0) goto L_0x01b4
            r0 = 81
            if (r1 == r0) goto L_0x01e6
            r0 = 13
            if (r1 == r0) goto L_0x01b4
            r0 = 14
            if (r1 == r0) goto L_0x00f0
            r0 = 25
            if (r1 == r0) goto L_0x01b4
            r0 = 26
            if (r1 == r0) goto L_0x01b4
            r0 = 28
            if (r1 == r0) goto L_0x01b4
            r0 = 29
            if (r1 == r0) goto L_0x01b4
            boolean r0 = r9.A1l()     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x01e6
            byte[] r0 = r9.A1u()     // Catch:{ all -> 0x0243 }
            int r0 = r0.length     // Catch:{ all -> 0x0243 }
            long r0 = (long) r0     // Catch:{ all -> 0x0243 }
            goto L_0x01dd
        L_0x00f0:
            boolean r0 = r9 instanceof X.C30421mQ     // Catch:{ all -> 0x0243 }
            r26 = r0
            if (r0 == 0) goto L_0x0139
            r0 = r9
            X.1mQ r0 = (X.C30421mQ) r0     // Catch:{ all -> 0x0243 }
            java.lang.String r15 = r0.A00     // Catch:{ all -> 0x0243 }
        L_0x00fb:
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0243 }
            java.lang.String r1 = ""
            if (r15 == 0) goto L_0x0109
            java.lang.String r0 = "[?:\\/*\"<>|\\x00-\\x1F]"
            java.lang.String r1 = r15.replaceAll(r0, r1)     // Catch:{ all -> 0x0243 }
        L_0x0109:
            r14.append(r1)     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = ".vcf"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r14)     // Catch:{ all -> 0x0243 }
            r0 = r32
            java.io.File r1 = X.C64393Dh.A00(r0, r1)     // Catch:{ all -> 0x0243 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0132
            long r24 = r1.lastModified()     // Catch:{ all -> 0x0243 }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0243 }
            r14 = 60000(0xea60, double:2.9644E-319)
            long r18 = r18 - r14
            int r0 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x0132
            X.C627536m.A0O(r1)     // Catch:{ all -> 0x0243 }
        L_0x0132:
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x01ad
            goto L_0x0145
        L_0x0139:
            boolean r0 = r9 instanceof X.C30411mP     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0143
            r0 = r9
            X.1mP r0 = (X.C30411mP) r0     // Catch:{ all -> 0x0243 }
            java.lang.String r15 = r0.A00     // Catch:{ all -> 0x0243 }
            goto L_0x00fb
        L_0x0143:
            r15 = r7
            goto L_0x00fb
        L_0x0145:
            java.io.FileOutputStream r18 = X.AnonymousClass0x9.A0h(r1)     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r14 = X.C58152un.A0B     // Catch:{ all -> 0x0196 }
            java.io.OutputStreamWriter r15 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0196 }
            r0 = r18
            r15.<init>(r0, r14)     // Catch:{ all -> 0x0196 }
            if (r26 == 0) goto L_0x0155
            goto L_0x0172
        L_0x0155:
            boolean r0 = r9 instanceof X.C30411mP     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0182
            r0 = r9
            X.1mP r0 = (X.C30411mP) r0     // Catch:{ all -> 0x018c }
            java.util.List r0 = r0.A1v()     // Catch:{ all -> 0x018c }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x018c }
        L_0x0164:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = X.AnonymousClass001.A0m(r14)     // Catch:{ all -> 0x018c }
            r15.write(r0)     // Catch:{ all -> 0x018c }
            goto L_0x0164
        L_0x0172:
            r0 = r9
            X.1mQ r0 = (X.C30421mQ) r0     // Catch:{ all -> 0x018c }
            java.lang.String r14 = r0.A1v()     // Catch:{ all -> 0x018c }
            if (r14 == 0) goto L_0x0155
            java.lang.String r0 = r0.A1v()     // Catch:{ all -> 0x018c }
            r15.write(r0)     // Catch:{ all -> 0x018c }
        L_0x0182:
            r15.flush()     // Catch:{ all -> 0x018c }
            r15.close()     // Catch:{ all -> 0x0196 }
            r18.close()     // Catch:{ IOException -> 0x01a0 }
            goto L_0x01a6
        L_0x018c:
            r14 = move-exception
            r15.close()     // Catch:{ all -> 0x0191 }
            goto L_0x0195
        L_0x0191:
            r0 = move-exception
            r14.addSuppressed(r0)     // Catch:{ all -> 0x0196 }
        L_0x0195:
            throw r14     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r14 = move-exception
            r18.close()     // Catch:{ all -> 0x019b }
            goto L_0x019f
        L_0x019b:
            r0 = move-exception
            r14.addSuppressed(r0)     // Catch:{ IOException -> 0x01a0 }
        L_0x019f:
            throw r14     // Catch:{ IOException -> 0x01a0 }
        L_0x01a0:
            r14 = move-exception
            java.lang.String r0 = "EmailMessageStore/getExportChatMessagesFile/vcard-msgs/write-failed"
            com.whatsapp.util.Log.e(r0, r14)     // Catch:{ all -> 0x0243 }
        L_0x01a6:
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x01e6
            goto L_0x01d1
        L_0x01ad:
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x01e6
            goto L_0x01d1
        L_0x01b4:
            if (r21 == 0) goto L_0x01e6
            boolean r0 = r9 instanceof X.C30471mV     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x01e6
            r0 = r9
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x0243 }
            X.33C r0 = r0.A01     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x01e6
            java.io.File r1 = r0.A0F     // Catch:{ all -> 0x0243 }
            if (r1 == 0) goto L_0x01e6
            boolean r0 = r0.A0R     // Catch:{ IOException -> 0x01e0 }
            if (r0 != 0) goto L_0x01d1
            r0 = r32
            boolean r0 = r0.A0d(r1)     // Catch:{ IOException -> 0x01e0 }
            if (r0 == 0) goto L_0x01e6
        L_0x01d1:
            r29 = r1
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x01e6
            long r0 = r1.length()     // Catch:{ all -> 0x0243 }
        L_0x01dd:
            long r27 = r27 + r0
            goto L_0x01e6
        L_0x01e0:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getExportChatMessagesFile/unexpected exception"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0243 }
        L_0x01e6:
            java.lang.Long r1 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x0243 }
            r0 = r29
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r0, r1)     // Catch:{ all -> 0x0243 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x0243 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0243 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0243 }
            long r14 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0243 }
            long r16 = r16 + r14
            if (r10 >= r12) goto L_0x023c
            r14 = 15000000(0xe4e1c0, double:7.4109847E-317)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x023c
            int r0 = X.AnonymousClass0x7.A02(r11)     // Catch:{ all -> 0x0243 }
            long r2 = r11.getLong(r0)     // Catch:{ all -> 0x0243 }
            if (r1 == 0) goto L_0x0234
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0234
            r0 = r30
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x0234
            r4.add(r13, r1)     // Catch:{ all -> 0x0243 }
            r0 = r30
            r0.add(r1)     // Catch:{ all -> 0x0243 }
            boolean r0 = r9 instanceof X.C30471mV     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0234
            X.1mV r9 = (X.C30471mV) r9     // Catch:{ all -> 0x0243 }
            X.33C r0 = r9.A01     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0234
            boolean r0 = r0.A0c     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0234
            goto L_0x023b
        L_0x0234:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x008e
            goto L_0x023c
        L_0x023b:
            r13 = 2
        L_0x023c:
            r11.close()     // Catch:{ all -> 0x024f }
            r31.close()     // Catch:{ SQLiteException -> 0x0259 }
            goto L_0x025f
        L_0x0243:
            r1 = move-exception
            if (r11 == 0) goto L_0x024e
            r11.close()     // Catch:{ all -> 0x024a }
            goto L_0x024e
        L_0x024a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x024f }
        L_0x024e:
            throw r1     // Catch:{ all -> 0x024f }
        L_0x024f:
            r1 = move-exception
            r31.close()     // Catch:{ all -> 0x0254 }
            goto L_0x0258
        L_0x0254:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x0259 }
        L_0x0258:
            throw r1     // Catch:{ SQLiteException -> 0x0259 }
        L_0x0259:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getStartIdAndCollectFiles/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x025f:
            r1 = 2
            if (r13 == r1) goto L_0x0780
            java.io.FileOutputStream r24 = X.AnonymousClass0x9.A0h(r20)     // Catch:{ FileNotFoundException -> 0x0762, IOException -> 0x076f }
            java.lang.String r9 = X.C58152un.A0B     // Catch:{ all -> 0x0758 }
            java.io.OutputStreamWriter r25 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0758 }
            r1 = r25
            r0 = r24
            r1.<init>(r0, r9)     // Catch:{ all -> 0x0758 }
            r18 = 0
            r9 = 0
            X.3dV r0 = r5.A09     // Catch:{ SQLiteException -> 0x0732 }
            X.4GK r26 = r0.get()     // Catch:{ SQLiteException -> 0x0732 }
            r0 = r26
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0728 }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x0728 }
            java.lang.String r10 = X.C58162uo.A0B     // Catch:{ all -> 0x0728 }
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0728 }
            X.2sm r0 = r5.A08     // Catch:{ all -> 0x0728 }
            X.C56922sm.A02(r0, r6, r1, r9)     // Catch:{ all -> 0x0728 }
            X.C18280x3.A1T(r1, r2)     // Catch:{ all -> 0x0728 }
            java.lang.String r0 = "GET_MESSAGES_EMAIL_SQL"
            android.database.Cursor r29 = r11.A0E(r10, r0, r1)     // Catch:{ all -> 0x0728 }
            boolean r0 = r29.moveToFirst()     // Catch:{ all -> 0x071c }
            if (r0 == 0) goto L_0x0715
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x071c }
            r28 = 0
        L_0x02a0:
            X.2qz r1 = r5.A0D     // Catch:{ all -> 0x0711 }
            r0 = r29
            X.34x r3 = r1.A04(r0, r6)     // Catch:{ all -> 0x0711 }
            if (r3 == 0) goto L_0x0708
            byte r2 = r3.A1I     // Catch:{ all -> 0x0711 }
            r0 = 88
            if (r2 == r0) goto L_0x0708
            r0 = 87
            if (r2 == r0) goto L_0x0708
            int r28 = r28 + 1
            boolean r14 = X.C627336j.A0K(r6)     // Catch:{ all -> 0x0711 }
            X.33j r11 = r5.A07     // Catch:{ all -> 0x0711 }
            X.2sH r12 = r5.A05     // Catch:{ all -> 0x0711 }
            long r0 = r3.A0K     // Catch:{ all -> 0x0711 }
            long r0 = r12.A0I(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r12 = X.C107505bQ.A06(r11, r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = X.C107145am.A00(r11, r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = X.C107175ap.A04(r11, r12, r0)     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = " - "
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            boolean r0 = X.C627636p.A0o(r3)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x02f4
            X.2z0 r13 = r3.A1J     // Catch:{ all -> 0x0711 }
            boolean r0 = r13.A02     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x02fc
            X.2sr r0 = r5.A01     // Catch:{ all -> 0x0711 }
            X.2og r0 = r0.A0D     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r0.A03()     // Catch:{ all -> 0x0711 }
        L_0x02ec:
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = ": "
            r10.append(r0)     // Catch:{ all -> 0x0711 }
        L_0x02f4:
            java.lang.String r13 = "\n"
            r0 = 1
            r16 = 0
            if (r2 == r0) goto L_0x0578
            goto L_0x0339
        L_0x02fc:
            if (r14 == 0) goto L_0x02ff
            goto L_0x030a
        L_0x02ff:
            X.5ZU r12 = r5.A04     // Catch:{ all -> 0x0711 }
            X.3Ex r1 = r5.A03     // Catch:{ all -> 0x0711 }
            X.4uZ r0 = r13.A00     // Catch:{ all -> 0x0711 }
            X.3ZH r0 = r1.A0A(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x0318
        L_0x030a:
            X.4uZ r1 = r3.A0n()     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x031d
            X.5ZU r12 = r5.A04     // Catch:{ all -> 0x0711 }
            X.3Ex r0 = r5.A03     // Catch:{ all -> 0x0711 }
            X.3ZH r0 = r0.A0A(r1)     // Catch:{ all -> 0x0711 }
        L_0x0318:
            java.lang.String r0 = r12.A0H(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x02ec
        L_0x031d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "EmailMessageStore/appendDateTimeAndName/missing_rmt_src:"
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = X.C627636p.A0E(r3)     // Catch:{ all -> 0x0711 }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0711 }
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131894596(0x7f122144, float:1.9424001E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x02ec
        L_0x0339:
            r1 = 2
            if (r2 == r1) goto L_0x0578
            r1 = 3
            if (r2 == r1) goto L_0x0578
            r1 = 4
            if (r2 == r1) goto L_0x053c
            r1 = 5
            if (r2 == r1) goto L_0x04ec
            r1 = 20
            if (r2 == r1) goto L_0x0578
            r1 = 21
            if (r2 == r1) goto L_0x04ce
            r1 = 25
            if (r2 == r1) goto L_0x0578
            r1 = 26
            if (r2 == r1) goto L_0x0578
            r1 = 36
            if (r2 == r1) goto L_0x04af
            r1 = 37
            if (r2 == r1) goto L_0x0578
            r1 = 44
            if (r2 == r1) goto L_0x048e
            r1 = 45
            if (r2 == r1) goto L_0x047a
            r1 = 54
            if (r2 == r1) goto L_0x047a
            r1 = 55
            if (r2 == r1) goto L_0x047a
            r1 = 62
            if (r2 == r1) goto L_0x047a
            r1 = 63
            if (r2 == r1) goto L_0x047a
            r1 = 81
            if (r2 == r1) goto L_0x046e
            r1 = 82
            if (r2 == r1) goto L_0x0462
            switch(r2) {
                case 9: goto L_0x0578;
                case 10: goto L_0x043d;
                case 11: goto L_0x0431;
                case 12: goto L_0x0425;
                case 13: goto L_0x0578;
                case 14: goto L_0x053c;
                case 15: goto L_0x039b;
                case 16: goto L_0x05de;
                case 23: goto L_0x0578;
                case 52: goto L_0x047a;
                case 57: goto L_0x047a;
                case 66: goto L_0x03cb;
                case 78: goto L_0x03bf;
                case 85: goto L_0x047a;
                default: goto L_0x0380;
            }     // Catch:{ all -> 0x0711 }
        L_0x0380:
            switch(r2) {
                case 28: goto L_0x0578;
                case 29: goto L_0x0578;
                case 30: goto L_0x04ec;
                case 31: goto L_0x038f;
                default: goto L_0x0383;
            }     // Catch:{ all -> 0x0711 }
        L_0x0383:
            if (r2 == 0) goto L_0x05ff
            r1 = 27
            if (r2 == r1) goto L_0x05ff
            r1 = 32
            if (r2 == r1) goto L_0x05ff
            goto L_0x05f6
        L_0x038f:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131888460(0x7f12094c, float:1.9411556E38)
            X.AnonymousClass0x2.A0s(r1, r10, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x039b:
            X.2z0 r1 = r3.A1J     // Catch:{ all -> 0x0711 }
            X.4uZ r0 = r1.A00     // Catch:{ all -> 0x0711 }
            boolean r0 = r0 instanceof X.C95804uY     // Catch:{ all -> 0x0711 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x03ae
            r1 = 2131893220(0x7f121be4, float:1.942121E38)
            if (r0 == 0) goto L_0x03b6
            r1 = 2131893221(0x7f121be5, float:1.9421212E38)
            goto L_0x03b6
        L_0x03ae:
            r1 = 2131893218(0x7f121be2, float:1.9421206E38)
            if (r0 == 0) goto L_0x03b6
            r1 = 2131893219(0x7f121be3, float:1.9421208E38)
        L_0x03b6:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0711 }
            X.AnonymousClass0x2.A0s(r0, r10, r1)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x03bf:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131895115(0x7f12234b, float:1.9425054E38)
            X.AnonymousClass0x2.A0s(r1, r10, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x03cb:
            r11 = r3
            X.1mT r11 = (X.C30451mT) r11     // Catch:{ all -> 0x0711 }
            X.2oU r12 = r5.A06     // Catch:{ all -> 0x0711 }
            r14 = 2131892681(0x7f1219c9, float:1.9420117E38)
            android.content.res.Resources r1 = X.C54292oU.A00(r12)     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = r1.getString(r14)     // Catch:{ all -> 0x0711 }
            r10.append(r1)     // Catch:{ all -> 0x0711 }
            r10.append(r13)     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = r11.A03     // Catch:{ all -> 0x0711 }
            r10.append(r1)     // Catch:{ all -> 0x0711 }
            r10.append(r13)     // Catch:{ all -> 0x0711 }
            java.util.List r1 = r11.A05     // Catch:{ all -> 0x0711 }
            java.util.Iterator r27 = r1.iterator()     // Catch:{ all -> 0x0711 }
        L_0x03ef:
            boolean r1 = r27.hasNext()     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x061f
            X.2y4 r15 = X.AnonymousClass0x9.A0Z(r27)     // Catch:{ all -> 0x0711 }
            r14 = 2131891411(0x7f1214d3, float:1.9417541E38)
            java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = r15.A03     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = X.C54292oU.A05(r12, r1, r11, r9, r14)     // Catch:{ all -> 0x0711 }
            X.AnonymousClass0x2.A1N(r10, r1)     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = "("
            r10.append(r1)     // Catch:{ all -> 0x0711 }
            android.content.res.Resources r14 = X.C54292oU.A00(r12)     // Catch:{ all -> 0x0711 }
            r11 = 2131755219(0x7f1000d3, float:1.9141311E38)
            int r1 = r15.A00     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = X.AnonymousClass0x2.A0Y(r14, r1, r9, r11)     // Catch:{ all -> 0x0711 }
            r10.append(r1)     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = ")"
            r10.append(r1)     // Catch:{ all -> 0x0711 }
            r10.append(r13)     // Catch:{ all -> 0x0711 }
            goto L_0x03ef
        L_0x0425:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131888320(0x7f1208c0, float:1.9411272E38)
            X.AnonymousClass0x2.A0s(r1, r10, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x0431:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131888460(0x7f12094c, float:1.9411556E38)
            X.AnonymousClass0x2.A0s(r1, r10, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x043d:
            r1 = r3
            X.1mr r1 = (X.C30691mr) r1     // Catch:{ all -> 0x0711 }
            int r11 = r1.A1y()     // Catch:{ all -> 0x0711 }
            if (r11 == 0) goto L_0x0456
            if (r11 == r0) goto L_0x0452
            r1 = 2
            r0 = 2131895219(0x7f1223b3, float:1.9425265E38)
            if (r11 == r1) goto L_0x0459
            r0 = 2131895034(0x7f1222fa, float:1.942489E38)
            goto L_0x0459
        L_0x0452:
            r0 = 2131895031(0x7f1222f7, float:1.9424884E38)
            goto L_0x0459
        L_0x0456:
            r0 = 2131895217(0x7f1223b1, float:1.942526E38)
        L_0x0459:
            X.2oU r1 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x0711 }
            X.AnonymousClass0x2.A0s(r1, r10, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x0462:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131895082(0x7f12232a, float:1.9424987E38)
            X.AnonymousClass0x2.A0s(r1, r10, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x046e:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131889260(0x7f120c6c, float:1.9413179E38)
            X.AnonymousClass0x2.A0s(r1, r10, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x047a:
            r1 = r3
            X.4DV r1 = (X.AnonymousClass4DV) r1     // Catch:{ all -> 0x0711 }
            X.2hp r0 = r5.A0C     // Catch:{ all -> 0x0711 }
            X.315 r0 = r0.A01(r1)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x061f
            java.lang.String r0 = r0.A07()     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x048e:
            r1 = r3
            X.1nD r1 = (X.C30821nD) r1     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.A08     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = X.C107315b6.A03(r11, r1)     // Catch:{ all -> 0x0711 }
            X.C18310x6.A1M(r0, r13, r10)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x0711 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x061f
            r10.append(r13)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x04af:
            r14 = r3
            X.1mF r14 = (X.C30311mF) r14     // Catch:{ all -> 0x0711 }
            X.35q r12 = r5.A02     // Catch:{ all -> 0x0711 }
            X.2z0 r11 = r3.A1J     // Catch:{ all -> 0x0711 }
            boolean r1 = r11.A02     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x04cb
            X.2sr r1 = r5.A01     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.PhoneUserJid r11 = X.C56972sr.A04(r1)     // Catch:{ all -> 0x0711 }
        L_0x04c0:
            int r1 = r14.A00     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r12.A0E(r11, r1, r0)     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x04cb:
            X.4uZ r11 = r11.A00     // Catch:{ all -> 0x0711 }
            goto L_0x04c0
        L_0x04ce:
            r0 = r3
            X.1mD r0 = (X.C30291mD) r0     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0711 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x061f
            X.36F r0 = r5.A0A     // Catch:{ all -> 0x0711 }
            X.34w r1 = X.AnonymousClass36F.A05(r0, r1, r7)     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x061f
            X.9Wq r0 = r5.A0B     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r0.A0Y(r1, r3)     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x04ec:
            r1 = r3
            X.1n9 r1 = (X.AnonymousClass1n9) r1     // Catch:{ all -> 0x0711 }
            r27 = r1
            java.lang.String r1 = r27.A1y()     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x0501
            java.lang.String r1 = r27.A1y()     // Catch:{ all -> 0x0711 }
            r10.append(r1)     // Catch:{ all -> 0x0711 }
            r10.append(r13)     // Catch:{ all -> 0x0711 }
        L_0x0501:
            r1 = r27
            java.lang.String r1 = r1.A02     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x050c
            r10.append(r1)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x050c:
            X.2oU r1 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r15 = r1.A00     // Catch:{ all -> 0x0711 }
            r14 = 2131888822(0x7f120ab6, float:1.941229E38)
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x0711 }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "https://maps.google.com/?q="
            r11.append(r0)     // Catch:{ all -> 0x0711 }
            r0 = r27
            double r0 = r0.A00     // Catch:{ all -> 0x0711 }
            r11.append(r0)     // Catch:{ all -> 0x0711 }
            X.C18320x8.A1K(r11)     // Catch:{ all -> 0x0711 }
            r0 = r27
            double r0 = r0.A01     // Catch:{ all -> 0x0711 }
            r11.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = X.AnonymousClass002.A0F(r15, r0, r12, r9, r14)     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x053c:
            boolean r1 = r3 instanceof X.C30421mQ     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x056c
            r1 = r3
            X.1mQ r1 = (X.C30421mQ) r1     // Catch:{ all -> 0x0711 }
            java.lang.String r14 = r1.A00     // Catch:{ all -> 0x0711 }
        L_0x0545:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0711 }
            java.lang.String r11 = ""
            if (r14 == 0) goto L_0x0553
            java.lang.String r1 = "[?:\\/*\"<>|\\x00-\\x1F]"
            java.lang.String r11 = r14.replaceAll(r1, r11)     // Catch:{ all -> 0x0711 }
        L_0x0553:
            r12.append(r11)     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = ".vcf"
            java.lang.String r12 = X.AnonymousClass000.A0X(r1, r12)     // Catch:{ all -> 0x0711 }
            X.2oU r1 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r11 = r1.A00     // Catch:{ all -> 0x0711 }
            r1 = 2131888820(0x7f120ab4, float:1.9412286E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r11, r12, r0, r1)     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x056c:
            boolean r1 = r3 instanceof X.C30411mP     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x0576
            r1 = r3
            X.1mP r1 = (X.C30411mP) r1     // Catch:{ all -> 0x0711 }
            java.lang.String r14 = r1.A00     // Catch:{ all -> 0x0711 }
            goto L_0x0545
        L_0x0576:
            r14 = r7
            goto L_0x0545
        L_0x0578:
            r12 = r3
            X.1mV r12 = (X.C30471mV) r12     // Catch:{ all -> 0x0711 }
            if (r21 == 0) goto L_0x05d2
            boolean r1 = r12.A21()     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x05c6
            java.io.File r15 = X.C30471mV.A01(r12)     // Catch:{ all -> 0x0711 }
            X.C626936e.A06(r15)     // Catch:{ all -> 0x0711 }
            long r16 = r15.length()     // Catch:{ all -> 0x0711 }
            X.2oU r1 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r14 = r1.A00     // Catch:{ all -> 0x0711 }
            r11 = 2131888820(0x7f120ab4, float:1.9412286E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r15.getName()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = X.AnonymousClass002.A0F(r14, r0, r1, r9, r11)     // Catch:{ all -> 0x0711 }
        L_0x059f:
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r12.A1w()     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x05b4
            boolean r1 = X.AnonymousClass353.A04(r12)     // Catch:{ all -> 0x0711 }
            if (r1 != 0) goto L_0x05b4
            r10.append(r13)     // Catch:{ all -> 0x0711 }
        L_0x05b1:
            r10.append(r0)     // Catch:{ all -> 0x0711 }
        L_0x05b4:
            boolean r0 = r3 instanceof X.C30771mz     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x061f
            r0 = r3
            X.1mz r0 = (X.C30771mz) r0     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r0.A23()     // Catch:{ all -> 0x0711 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0711 }
            if (r1 != 0) goto L_0x061f
            goto L_0x05ef
        L_0x05c6:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131889250(0x7f120c62, float:1.9413158E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x059f
        L_0x05d2:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131889250(0x7f120c62, float:1.9413158E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x05b1
        L_0x05de:
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0711 }
            r0 = 2131888821(0x7f120ab5, float:1.9412288E38)
            X.AnonymousClass0x2.A0s(r1, r10, r0)     // Catch:{ all -> 0x0711 }
            r0 = r3
            X.1n8 r0 = (X.C30801n8) r0     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x061f
        L_0x05ef:
            r10.append(r13)     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x05f6:
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = "EmailMessageStore/processmessage/type/unknown: "
            X.C18260x0.A0z(r1, r11, r2)     // Catch:{ all -> 0x0711 }
        L_0x05ff:
            X.34w r1 = r3.A0P     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x060f
            X.9Wq r1 = r5.A0B     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = r1.A0e(r3, r0)     // Catch:{ all -> 0x0711 }
            r10.append(r1)     // Catch:{ all -> 0x0711 }
            r10.append(r13)     // Catch:{ all -> 0x0711 }
        L_0x060f:
            boolean r1 = r3 instanceof X.C30341mI     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x064c
            X.35q r1 = r5.A02     // Catch:{ all -> 0x0711 }
            r0 = r3
            X.1mI r0 = (X.C30341mI) r0     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.A0O(r0, r9)     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
        L_0x061f:
            X.2Ot r0 = X.C40802Hu.A01(r3)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = X.AnonymousClass353.A02(r0, r7)     // Catch:{ all -> 0x0711 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0711 }
            if (r1 != 0) goto L_0x06a6
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x0711 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0711 }
            if (r1 != 0) goto L_0x063a
            r10.append(r13)     // Catch:{ all -> 0x0711 }
        L_0x063a:
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            X.2Ot r0 = X.C40802Hu.A01(r3)     // Catch:{ all -> 0x0711 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0711 }
            java.util.List r0 = r0.A02     // Catch:{ all -> 0x0711 }
            r30 = r0
            r10.append(r13)     // Catch:{ all -> 0x0711 }
            goto L_0x0669
        L_0x064c:
            boolean r1 = r3 instanceof X.AnonymousClass1p5     // Catch:{ all -> 0x0711 }
            if (r1 == 0) goto L_0x065b
            r0 = r3
            X.1p5 r0 = (X.AnonymousClass1p5) r0     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r0.A20()     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x065b:
            int r1 = r3.A0i()     // Catch:{ all -> 0x0711 }
            if (r1 == r0) goto L_0x061f
            java.lang.String r0 = r3.A13()     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x061f
        L_0x0669:
            r27 = 0
        L_0x066b:
            int r1 = r30.size()     // Catch:{ all -> 0x0711 }
            r0 = r27
            if (r0 >= r1) goto L_0x06a6
            int r11 = r27 + 1
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            android.content.Context r14 = r0.A00     // Catch:{ all -> 0x0711 }
            r12 = 2131887192(0x7f120458, float:1.9408984E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()     // Catch:{ all -> 0x0711 }
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r15, r11)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = X.AnonymousClass002.A0F(r14, r0, r1, r9, r12)     // Catch:{ all -> 0x0711 }
            X.AnonymousClass0x2.A1N(r10, r0)     // Catch:{ all -> 0x0711 }
            r1 = r30
            r0 = r27
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0711 }
            X.2bn r0 = (X.C46532bn) r0     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0711 }
            r10.append(r0)     // Catch:{ all -> 0x0711 }
            r10.append(r13)     // Catch:{ all -> 0x0711 }
            r27 = r11
            goto L_0x066b
        L_0x06a6:
            if (r2 != 0) goto L_0x06cd
            boolean r0 = X.C624134x.A0d(r3)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x06cd
            X.8qC r0 = r5.A0E     // Catch:{ all -> 0x0711 }
            boolean r0 = X.C624134x.A0h(r3, r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x06cd
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0711 }
            X.AnonymousClass001.A1L(r2)     // Catch:{ all -> 0x0711 }
            X.2oU r0 = r5.A06     // Catch:{ all -> 0x0711 }
            r1 = 2131889251(0x7f120c63, float:1.941316E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x0711 }
            X.C18270x1.A1C(r0, r2, r10)     // Catch:{ all -> 0x0711 }
        L_0x06cd:
            long r18 = r18 + r16
            int r0 = r10.length()     // Catch:{ all -> 0x0711 }
            if (r0 <= 0) goto L_0x0708
            java.lang.StringBuilder r0 = X.C18290x4.A0v(r10)     // Catch:{ IOException -> 0x06e3 }
            java.lang.String r1 = X.AnonymousClass000.A0X(r13, r0)     // Catch:{ IOException -> 0x06e3 }
            r0 = r25
            r0.write(r1)     // Catch:{ IOException -> 0x06e3 }
            goto L_0x0701
        L_0x06e3:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x06fc
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "No space"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x06fc
            java.lang.String r0 = "loadforemail/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            throw r1     // Catch:{ all -> 0x0711 }
        L_0x06fc:
            java.lang.String r0 = "EmailMessageStore/collectMessages/txt-msgs/write-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0711 }
        L_0x0701:
            int r0 = r10.length()     // Catch:{ all -> 0x0711 }
            r10.delete(r9, r0)     // Catch:{ all -> 0x0711 }
        L_0x0708:
            boolean r0 = r29.moveToNext()     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x02a0
            r9 = r28
            goto L_0x0715
        L_0x0711:
            r1 = move-exception
            r9 = r28
            goto L_0x071f
        L_0x0715:
            r29.close()     // Catch:{ all -> 0x0728 }
            r26.close()     // Catch:{ SQLiteException -> 0x0732 }
            goto L_0x0738
        L_0x071c:
            r1 = move-exception
            if (r29 == 0) goto L_0x0727
        L_0x071f:
            r29.close()     // Catch:{ all -> 0x0723 }
            goto L_0x0727
        L_0x0723:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0728 }
        L_0x0727:
            throw r1     // Catch:{ all -> 0x0728 }
        L_0x0728:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x072d }
            goto L_0x0731
        L_0x072d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x0732 }
        L_0x0731:
            throw r1     // Catch:{ SQLiteException -> 0x0732 }
        L_0x0732:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/collectMessages/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x074e }
        L_0x0738:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x074e }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x074e }
            X.0PJ r3 = X.AnonymousClass0x9.A0G(r1, r0)     // Catch:{ all -> 0x074e }
            r25.flush()     // Catch:{ all -> 0x074e }
            r25.close()     // Catch:{ all -> 0x0758 }
            r24.close()     // Catch:{ FileNotFoundException -> 0x0762, IOException -> 0x076f }
            goto L_0x0786
        L_0x074e:
            r1 = move-exception
            r25.close()     // Catch:{ all -> 0x0753 }
            goto L_0x0757
        L_0x0753:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0758 }
        L_0x0757:
            throw r1     // Catch:{ all -> 0x0758 }
        L_0x0758:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x075d }
            goto L_0x0761
        L_0x075d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0762, IOException -> 0x076f }
        L_0x0761:
            throw r1     // Catch:{ FileNotFoundException -> 0x0762, IOException -> 0x076f }
        L_0x0762:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail cannot create attachment file"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            X.2vH r5 = new X.2vH
            r5.<init>((int) r0)
            goto L_0x07d9
        L_0x076f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x077f
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            r1 = 3
            if (r0 != 0) goto L_0x0780
        L_0x077f:
            r1 = 4
        L_0x0780:
            X.2vH r5 = new X.2vH
            r5.<init>((int) r1)
            goto L_0x07d9
        L_0x0786:
            X.2sH r0 = r5.A05
            long r0 = r0.A0H()
            r2 = r20
            boolean r0 = r2.setLastModified(r0)
            if (r0 != 0) goto L_0x079f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "EmailMessageStore/loadMessagesForEmail failed to set timestamp for "
            r0 = r20
            X.C18260x0.A1Q(r2, r1, r0)
        L_0x079f:
            java.lang.Object r0 = r3.A00
            int r5 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r0 = r3.A01
            long r0 = X.C18310x6.A0B(r0)
            long r2 = r20.length()
            long r0 = r0 + r2
            r3 = 0
            r2 = r20
            r4.add(r3, r2)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "EmailMessageStore/loadMessagesForEmail/total count:"
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = "/total attach file:"
            X.C18260x0.A19(r2, r3, r4)
            java.lang.String r2 = "/total size:"
            X.C18260x0.A12(r2, r3, r0)
            r22.A07()
            if (r5 != 0) goto L_0x07d4
            r4.clear()
        L_0x07d4:
            X.2vH r5 = new X.2vH
            r5.<init>((java.util.List) r4)
        L_0x07d9:
            int r4 = r5.A00
            r3 = 4
            r2 = 2
            if (r4 != r2) goto L_0x07ea
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x07e3:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r7, r0)
        L_0x07e7:
            if (r0 == 0) goto L_0x0803
            return r0
        L_0x07ea:
            r1 = 1
            r0 = 3
            if (r4 != r0) goto L_0x07f3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x07e3
        L_0x07f3:
            if (r4 != r3) goto L_0x07fa
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x07e3
        L_0x07fa:
            if (r4 != r1) goto L_0x0801
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x07e3
        L_0x0801:
            r0 = r7
            goto L_0x07e7
        L_0x0803:
            java.util.List r1 = r5.A01
            r0 = r34
            X.5ZU r2 = r0.A01
            r0 = r33
            java.lang.String r11 = r2.A0H(r0)
            r2 = 2131888816(0x7f120ab0, float:1.9412278E38)
            r10 = 2131888816(0x7f120ab0, float:1.9412278E38)
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r3 = 0
            java.lang.String r4 = X.AnonymousClass002.A0F(r8, r11, r0, r3, r2)
            java.lang.String r2 = "[?:\\\\/*\"<>|\n\t\r]"
            java.lang.String r0 = ""
            java.lang.String r5 = r4.replaceAll(r2, r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A0p(r1)
            android.net.Uri$Builder r2 = X.C18530xp.A00()
            java.lang.String r0 = "export_chat"
            android.net.Uri$Builder r2 = r2.appendPath(r0)
            java.lang.String r0 = r6.getRawString()
            android.net.Uri$Builder r2 = r2.appendEncodedPath(r0)
            r0 = r23
            android.net.Uri$Builder r0 = r2.appendEncodedPath(r0)
            android.net.Uri r0 = r0.build()
            r4.add(r0)
            r2 = 1
        L_0x0849:
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0869
            java.lang.Object r0 = r1.get(r2)     // Catch:{ IllegalArgumentException -> 0x085f }
            java.io.File r0 = (java.io.File) r0     // Catch:{ IllegalArgumentException -> 0x085f }
            android.net.Uri r0 = X.C627536m.A01(r8, r0)     // Catch:{ IllegalArgumentException -> 0x085f }
            r4.add(r0)     // Catch:{ IllegalArgumentException -> 0x085f }
            int r2 = r2 + 1
            goto L_0x0849
        L_0x085f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 3
            android.util.Pair r7 = X.C18290x4.A0K(r7, r0)
            return r7
        L_0x0869:
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)
            android.content.Intent r1 = r0.setFlags(r9)
            java.lang.String r0 = "text/*"
            android.content.Intent r2 = r1.setType(r0)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r8, r11, r9, r10)
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            android.content.Intent r2 = r2.putExtra(r0, r1)
            r0 = 2131888815(0x7f120aaf, float:1.9412276E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r8, r5, r9, r0)
            java.lang.String r0 = "android.intent.extra.TEXT"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.STREAM"
            android.content.Intent r0 = r1.putParcelableArrayListExtra(r0, r4)
            android.util.Pair r7 = X.C18290x4.A0K(r0, r3)
        L_0x089b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33641tS.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        if (r0 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r2 != 4) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r8) {
        /*
            r7 = this;
            android.util.Pair r8 = (android.util.Pair) r8
            if (r8 == 0) goto L_0x002d
            java.lang.Object r3 = r8.first
            android.content.Intent r3 = (android.content.Intent) r3
            int r2 = X.C18290x4.A03(r8)
            if (r2 == 0) goto L_0x0075
            r0 = 1
            if (r2 == r0) goto L_0x002e
            r0 = 3
            if (r2 == r0) goto L_0x009c
            r0 = 4
            r1 = 2131889246(0x7f120c5e, float:1.941315E38)
            if (r2 == r0) goto L_0x001d
        L_0x001a:
            r1 = 2131889245(0x7f120c5d, float:1.9413148E38)
        L_0x001d:
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r0 = r0.get()
            X.4FU r0 = (X.AnonymousClass4FU) r0
            if (r0 == 0) goto L_0x002d
            r0.BjL()
            r0.Bot(r1)
        L_0x002d:
            return
        L_0x002e:
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.4FU r4 = (X.AnonymousClass4FU) r4
            if (r4 == 0) goto L_0x002d
            java.lang.ref.WeakReference r0 = r7.A05
            java.lang.Object r3 = r0.get()
            android.content.Context r3 = (android.content.Context) r3
            r4.BjL()
            if (r3 == 0) goto L_0x002d
            boolean r0 = X.C61072zf.A01()
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x0068
            r0 = 2131889247(0x7f120c5f, float:1.9413152E38)
            X.AnonymousClass0x2.A0s(r3, r1, r0)
            r1.append(r2)
            r0 = 2131893028(0x7f121b24, float:1.942082E38)
        L_0x005d:
            X.AnonymousClass0x2.A0s(r3, r1, r0)
            java.lang.String r0 = r1.toString()
            r4.Bou(r0)
            return
        L_0x0068:
            r0 = 2131889248(0x7f120c60, float:1.9413154E38)
            X.AnonymousClass0x2.A0s(r3, r1, r0)
            r1.append(r2)
            r0 = 2131893029(0x7f121b25, float:1.9420823E38)
            goto L_0x005d
        L_0x0075:
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.4FU r4 = (X.AnonymousClass4FU) r4
            java.lang.ref.WeakReference r0 = r7.A05
            java.lang.Object r2 = r0.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r3 == 0) goto L_0x009c
            if (r4 == 0) goto L_0x009c
            if (r2 == 0) goto L_0x009c
            r4.BjL()
            X.2aV r1 = r7.A00
            r0 = 2131893483(0x7f121ceb, float:1.9421744E38)
            java.lang.String r5 = r2.getString(r0)
            r6 = 0
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x009c:
            boolean r0 = r7.A07
            r1 = 2131889249(0x7f120c61, float:1.9413156E38)
            if (r0 != 0) goto L_0x001d
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33641tS.A0C(java.lang.Object):void");
    }

    public C33641tS(Context context, AnonymousClass4FU r3, C45742aV r4, AnonymousClass5ZU r5, C61072zf r6, C47542dQ r7, AnonymousClass3ZH r8, boolean z) {
        this.A05 = AnonymousClass0x9.A14(context);
        this.A02 = r6;
        this.A06 = AnonymousClass0x9.A14(r3);
        this.A07 = z;
        this.A03 = r7;
        this.A01 = r5;
        this.A04 = r8;
        this.A00 = r4;
    }
}
