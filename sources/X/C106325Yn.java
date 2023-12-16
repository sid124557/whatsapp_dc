package X;

import java.util.regex.Pattern;

/* renamed from: X.5Yn  reason: invalid class name and case insensitive filesystem */
public class C106325Yn {
    public static final Pattern A00 = Pattern.compile("\r?\n");
    public static final Pattern A01 = Pattern.compile("(?<=\nEND:VCARD)\\s*\r?\n", 2);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (X.AnonymousClass001.A0n(r4, r4.size() - 1).isEmpty() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(java.lang.String r6) {
        /*
            r5 = 257(0x101, float:3.6E-43)
            java.util.regex.Pattern r1 = A01
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String[] r0 = r1.split(r6, r0)
            java.util.List r4 = java.util.Arrays.asList(r0)
            int r0 = r4.size()
            r3 = 0
            if (r0 <= 0) goto L_0x0039
            int r0 = r4.size()
            r2 = 1
            int r0 = r0 - r2
            java.lang.String r0 = X.AnonymousClass001.A0n(r4, r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0039
        L_0x0025:
            int r0 = r4.size()
            int r1 = java.lang.Math.min(r0, r5)
            int r1 = r1 - r2
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0038
            java.util.List r4 = r4.subList(r3, r1)
        L_0x0038:
            return r4
        L_0x0039:
            r2 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106325Yn.A00(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:132|(1:134)|138|139) */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f7, code lost:
        r10[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03e8, code lost:
        if (r1 != ',') goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03ee, code lost:
        if (r0 == null) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x044f, code lost:
        if (r0 != false) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0451, code lost:
        r2 = java.lang.System.currentTimeMillis();
        r4.A04.A02.add(r4.A03);
        r9.A00 += X.AnonymousClass0x9.A05(r2);
        r2 = java.lang.System.currentTimeMillis();
        r4.A03 = new X.AnonymousClass5T6();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04d8, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x056b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x072f, code lost:
        throw new X.C143696zK(X.AnonymousClass000.A0X("\" came)", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018e, code lost:
        r2 = r12.substring(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0196, code lost:
        if (r2.equalsIgnoreCase("END") != false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0198, code lost:
        r10[0] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019b, code lost:
        if (r14 >= (r13 - 1)) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019d, code lost:
        r10[1] = r12.substring(r14 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ce, code lost:
        r10[1] = "";
     */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0510 A[SYNTHETIC, Splitter:B:259:0x0510] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0524 A[Catch:{ OutOfMemoryError -> 0x056c }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0554 A[Catch:{ OutOfMemoryError -> 0x056c }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0586 A[LOOP:3: B:37:0x00e4->B:287:0x0586, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x044f A[EDGE_INSN: B:380:0x044f->B:223:0x044f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.util.List r26, X.AnonymousClass5QS r27) {
        /*
            r3 = r26
            int r1 = r3.size()
            r0 = 5
            int r5 = java.lang.Math.min(r0, r1)
            r4 = 0
        L_0x000c:
            java.lang.String r2 = "vcard2.1"
            if (r4 >= r5) goto L_0x06bb
            java.lang.String r1 = X.AnonymousClass001.A0n(r3, r4)
            java.lang.String r0 = "VERSION:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x06b7
            java.lang.String r0 = "2.1"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x06bb
            java.lang.String r0 = "3.0"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x06b7
            java.lang.String r0 = "vcard3.0"
        L_0x002e:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x06b0
            X.5ZP r9 = new X.5ZP
            r9.<init>()
        L_0x0039:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x05f4
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
        L_0x0043:
            X.8R7 r1 = new X.8R7
            r1.<init>(r6)
            X.8R6 r0 = new X.8R6
            r0.<init>(r1)
            r9.A0H = r0
            r0 = r27
            r9.A0G = r0
            long r16 = java.lang.System.currentTimeMillis()
        L_0x0057:
            r8 = 1
            r7 = 0
        L_0x0059:
            java.lang.String r2 = r9.A01()
            if (r2 != 0) goto L_0x0069
            long r2 = r9.A0B
            long r0 = X.AnonymousClass0x9.A05(r16)
            long r2 = r2 + r0
            r9.A0B = r2
            return
        L_0x0069:
            java.lang.String r0 = r2.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0059
            java.lang.String r6 = ":"
            r1 = 2
            java.lang.String[] r3 = r2.split(r6, r1)
            int r0 = r3.length
            if (r0 != r1) goto L_0x0718
            r0 = r3[r7]
            java.lang.String r1 = r0.trim()
            java.lang.String r22 = "BEGIN"
            r0 = r22
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0718
            r0 = r3[r8]
            java.lang.String r0 = r0.trim()
            java.lang.String r5 = "VCARD"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x0718
            X.5QS r4 = r9.A0G
            if (r4 == 0) goto L_0x00c8
            long r2 = java.lang.System.currentTimeMillis()
            X.7La r0 = new X.7La
            r0.<init>()
            r0.A00 = r8
            r0.A01 = r5
            java.util.List r1 = r4.A02
            r1.add(r0)
            int r0 = X.AnonymousClass002.A04(r1, r8)
            r4.A00 = r0
            java.lang.Object r0 = r1.get(r0)
            X.7La r0 = (X.C149097La) r0
            r4.A04 = r0
            long r0 = r9.A0A
            long r2 = X.AnonymousClass0x9.A05(r2)
            long r0 = r0 + r2
            r9.A0A = r0
        L_0x00c8:
            long r18 = java.lang.System.currentTimeMillis()
            X.5QS r1 = r9.A0G
            if (r1 == 0) goto L_0x00e4
            long r2 = java.lang.System.currentTimeMillis()
            X.5T6 r0 = new X.5T6
            r0.<init>()
            r1.A03 = r0
        L_0x00db:
            long r0 = r9.A09
            long r2 = X.AnonymousClass0x9.A05(r2)
            long r0 = r0 + r2
            r9.A09 = r0
        L_0x00e4:
            java.lang.String r27 = "8BIT"
            r0 = r27
            r9.A0C = r0
            java.lang.String r12 = r9.A02()
            long r20 = java.lang.System.currentTimeMillis()
            int r13 = r12.length()
            r11 = 2
            java.lang.String[] r10 = new java.lang.String[r11]
            java.lang.String r0 = "item"
            boolean r0 = r12.startsWith(r0)
            java.lang.String r26 = ""
            r25 = 0
            r24 = 0
            if (r0 == 0) goto L_0x0159
            java.lang.String[] r4 = r12.split(r6)
            int r3 = r4.length
            if (r3 < r11) goto L_0x0415
            r14 = r4[r7]
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "."
            int r0 = r14.indexOf(r0)
            int r1 = r0 + 1
            r23 = 64
        L_0x011e:
            int r0 = r14.length()
            if (r1 >= r0) goto L_0x01d1
            char r15 = r14.charAt(r1)
            r0 = 65
            if (r15 < r0) goto L_0x0142
            char r15 = r14.charAt(r1)
            r0 = 90
            if (r15 > r0) goto L_0x0142
            char r0 = r14.charAt(r1)
            r2.append(r0)
            char r23 = r14.charAt(r1)
        L_0x013f:
            int r1 = r1 + 1
            goto L_0x011e
        L_0x0142:
            char r15 = r14.charAt(r1)
            r0 = 45
            if (r15 != r0) goto L_0x01d1
            r0 = 88
            r15 = r0
            r0 = r23
            if (r0 != r15) goto L_0x01d1
            char r0 = r14.charAt(r1)
            r2.append(r0)
            goto L_0x013f
        L_0x0159:
            r14 = 0
            r11 = 0
            r4 = 0
        L_0x015c:
            if (r14 >= r13) goto L_0x0700
            char r3 = r12.charAt(r14)
            r2 = 59
            r15 = 58
            if (r11 == 0) goto L_0x018a
            r0 = 34
            if (r11 == r8) goto L_0x0172
            if (r3 != r0) goto L_0x016f
        L_0x016e:
            r11 = 1
        L_0x016f:
            int r14 = r14 + 1
            goto L_0x015c
        L_0x0172:
            if (r3 != r0) goto L_0x0176
            r11 = 2
            goto L_0x016f
        L_0x0176:
            if (r3 != r2) goto L_0x0180
            java.lang.String r0 = r12.substring(r4, r14)
            r9.A05(r0)
            goto L_0x01ba
        L_0x0180:
            if (r3 != r15) goto L_0x016f
            java.lang.String r0 = r12.substring(r4, r14)
            r9.A05(r0)
            goto L_0x019a
        L_0x018a:
            java.lang.String r1 = "END"
            if (r3 != r15) goto L_0x01a7
            java.lang.String r2 = r12.substring(r4, r14)
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0413
            r10[r7] = r2
        L_0x019a:
            int r13 = r13 - r8
            if (r14 >= r13) goto L_0x01ce
            int r0 = r14 + 1
            java.lang.String r0 = r12.substring(r0)
            r10[r8] = r0
            goto L_0x0242
        L_0x01a7:
            r0 = 46
            if (r3 != r0) goto L_0x01bd
            java.lang.String r1 = r12.substring(r4, r14)
            X.5QS r0 = r9.A0G
            if (r0 == 0) goto L_0x01ba
            X.5T6 r0 = r0.A03
            java.util.Set r0 = r0.A05
            r0.add(r1)
        L_0x01ba:
            int r4 = r14 + 1
            goto L_0x016f
        L_0x01bd:
            if (r3 != r2) goto L_0x016f
            java.lang.String r2 = r12.substring(r4, r14)
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0413
            r10[r7] = r2
            int r4 = r14 + 1
            goto L_0x016e
        L_0x01ce:
            r10[r8] = r26
            goto L_0x0242
        L_0x01d1:
            X.AnonymousClass0x7.A1E(r2, r10, r7)
            r2 = r4[r8]
            java.lang.String r1 = "(\r\n|\r|\n|\n\r)"
            r0 = r26
            java.lang.String r0 = r2.replaceAll(r1, r0)
            r10[r8] = r0
            r1 = r10[r7]
            java.lang.String r0 = "ADR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x028b
            java.lang.String r0 = "type"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x0287
            java.lang.String r0 = "="
            int r0 = r12.indexOf(r0)
            int r1 = r0 + 1
            int r0 = r12.indexOf(r6)
            java.lang.String r0 = r12.substring(r1, r0)
            r9.A06(r0)
        L_0x0205:
            java.lang.String r0 = "X-ABADR"
            java.lang.String r2 = r9.A04(r12, r0)
            if (r2 == 0) goto L_0x022b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r10[r8]
            r1.append(r0)
            java.lang.String r0 = ";"
            r1.append(r0)
            int r0 = r2.lastIndexOf(r6)
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r10[r8] = r0
        L_0x022b:
            if (r24 == 0) goto L_0x0242
            r0 = r25
        L_0x022f:
            java.lang.String r1 = r9.A04(r12, r0)
            if (r1 == 0) goto L_0x0242
            int r0 = r1.lastIndexOf(r6)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)
            r9.A06(r0)
        L_0x0242:
            r0 = r10[r7]
            java.lang.String r3 = X.C86664Kz.A1L(r0)
            r2 = r10[r8]
            long r0 = r9.A05
            long r10 = X.AnonymousClass0x9.A05(r20)
            long r0 = r0 + r10
            r9.A05 = r0
            X.5QS r0 = r9.A0G
            if (r0 == 0) goto L_0x025b
            X.5T6 r0 = r0.A03
            r0.A01 = r3
        L_0x025b:
            java.lang.String r0 = "ADR"
            boolean r20 = r3.equals(r0)
            if (r20 != 0) goto L_0x038c
            java.lang.String r0 = "ORG"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x038c
            java.lang.String r0 = "N"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x038c
            java.lang.String r0 = "AGENT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02ff
            boolean r0 = r9 instanceof X.C1222763t
            if (r0 == 0) goto L_0x06be
            java.lang.String r1 = "AGENT in vCard 3.0 is not supported yet."
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        L_0x0287:
            r24 = 1
            goto L_0x0205
        L_0x028b:
            if (r3 <= r11) goto L_0x02a6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            r1 = r10[r8]
            r0.append(r1)
        L_0x0297:
            r0.append(r6)
            r1 = r4[r11]
            r0.append(r1)
            int r11 = r11 + 1
            if (r11 < r3) goto L_0x0297
            X.AnonymousClass0x7.A1E(r0, r10, r8)
        L_0x02a6:
            java.lang.String r0 = "waid"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x02fb
            java.lang.String r0 = "type"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x02d5
            java.util.regex.Pattern r0 = X.AnonymousClass5ZP.A0N
            java.lang.String r0 = X.AnonymousClass5ZP.A00(r12, r0)
            if (r0 == 0) goto L_0x02c1
            r9.A06(r0)
        L_0x02c1:
            java.util.regex.Pattern r0 = X.AnonymousClass5ZP.A0O
            java.lang.String r2 = X.AnonymousClass5ZP.A00(r12, r0)
            if (r2 == 0) goto L_0x0242
            X.5QS r1 = r9.A0G
            if (r1 == 0) goto L_0x02eb
            java.lang.String r0 = "waId"
            r1.A01 = r0
            r1.A00(r2)
            goto L_0x02eb
        L_0x02d5:
            r0 = r25
            java.lang.String r1 = r9.A04(r12, r0)
            if (r1 == 0) goto L_0x02c1
            int r0 = r1.lastIndexOf(r6)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)
            r9.A06(r0)
            goto L_0x02c1
        L_0x02eb:
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass32X.A00(r2)     // Catch:{ 24P -> 0x02f7 }
            java.lang.String r0 = X.AnonymousClass36P.A06(r0)     // Catch:{ 24P -> 0x02f7 }
            r10[r8] = r0     // Catch:{ 24P -> 0x02f7 }
            goto L_0x0242
        L_0x02f7:
            r10[r8] = r25
            goto L_0x0242
        L_0x02fb:
            java.lang.String r0 = "X-ABLabel"
            goto L_0x022f
        L_0x02ff:
            boolean r1 = r9 instanceof X.C1222763t
            if (r1 == 0) goto L_0x0336
            java.util.HashSet r0 = X.C1222763t.A02
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0320
            java.util.HashSet r0 = X.C1222763t.A03
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0320
            java.lang.String r0 = "X-"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0320
            java.util.HashSet r0 = r9.A0F
            X.C86614Ku.A1T(r3, r0)
        L_0x0320:
            r0 = r22
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x035f
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x06c6
            java.lang.String r1 = "This vCard has nested vCard data in it."
            X.8g7 r0 = new X.8g7
            r0.<init>(r1)
            throw r0
        L_0x0336:
            java.util.HashSet r4 = X.AnonymousClass5ZP.A0K
            java.lang.String r0 = X.C86664Kz.A1L(r3)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0320
            java.lang.String r0 = "X-"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0320
            java.util.HashSet r4 = r9.A0F
            boolean r0 = r4.contains(r3)
            if (r0 != 0) goto L_0x0320
            r4.add(r3)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Property name unsupported by vCard 2.1: "
            X.C18260x0.A0t(r0, r3, r4)
            goto L_0x0320
        L_0x035f:
            java.lang.String r0 = "VERSION"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0417
            if (r1 == 0) goto L_0x0389
            java.lang.String r3 = "3.0"
        L_0x036b:
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x0417
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Incompatible version: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " != "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
            X.8g8 r0 = new X.8g8
            r0.<init>(r1)
            throw r0
        L_0x0389:
            java.lang.String r3 = "2.1"
            goto L_0x036b
        L_0x038c:
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = r9.A0C
            java.lang.String r0 = "QUOTED-PRINTABLE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x039e
            java.lang.String r2 = r9.A03(r2)
        L_0x039e:
            X.5QS r0 = r9.A0G
            if (r0 == 0) goto L_0x0409
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            int r11 = r2.length()
            r10 = 0
        L_0x03af:
            if (r10 >= r11) goto L_0x0401
            char r4 = r2.charAt(r10)
            r0 = 92
            if (r4 != r0) goto L_0x03f1
            int r0 = r11 + -1
            if (r10 >= r0) goto L_0x03fd
            if (r20 != 0) goto L_0x03fd
            int r3 = r10 + 1
            char r1 = r2.charAt(r3)
            boolean r0 = r9 instanceof X.C1222763t
            if (r0 == 0) goto L_0x03da
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x03d1
            r0 = 78
            if (r1 != r0) goto L_0x03ea
        L_0x03d1:
            java.lang.String r0 = "\r\n"
        L_0x03d3:
            r13.append(r0)
            r10 = r3
        L_0x03d7:
            int r10 = r10 + 1
            goto L_0x03af
        L_0x03da:
            r0 = 92
            if (r1 == r0) goto L_0x03ea
            r0 = 59
            if (r1 == r0) goto L_0x03ea
            r0 = 58
            if (r1 == r0) goto L_0x03ea
            r0 = 44
            if (r1 != r0) goto L_0x03fd
        L_0x03ea:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            if (r0 == 0) goto L_0x03fd
            goto L_0x03d3
        L_0x03f1:
            r0 = 59
            if (r4 != r0) goto L_0x03fd
            X.AnonymousClass0x7.A1D(r13, r12)
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            goto L_0x03d7
        L_0x03fd:
            r13.append(r4)
            goto L_0x03d7
        L_0x0401:
            X.AnonymousClass0x7.A1D(r13, r12)
            X.5QS r0 = r9.A0G
            r0.A01(r12)
        L_0x0409:
            long r0 = r9.A07
            long r2 = X.AnonymousClass0x9.A05(r14)
            long r0 = r0 + r2
            r9.A07 = r0
            goto L_0x044a
        L_0x0413:
            r9.A0E = r12
        L_0x0415:
            r0 = 1
            goto L_0x044b
        L_0x0417:
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = r9.A0C
            java.lang.String r0 = "QUOTED-PRINTABLE"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0474
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r9.A03(r2)
            X.5QS r1 = r9.A0G
            if (r1 == 0) goto L_0x0438
            java.util.ArrayList r0 = X.C18300x5.A0s(r0)
            r1.A01(r0)
        L_0x0438:
            long r0 = r9.A03
            long r2 = X.AnonymousClass0x9.A05(r3)
            long r0 = r0 + r2
            r9.A03 = r0
        L_0x0441:
            long r0 = r9.A06
            long r2 = X.AnonymousClass0x9.A05(r14)
            long r0 = r0 + r2
            r9.A06 = r0
        L_0x044a:
            r0 = 0
        L_0x044b:
            X.5QS r4 = r9.A0G
            if (r4 == 0) goto L_0x0586
            if (r0 != 0) goto L_0x058a
            long r2 = java.lang.System.currentTimeMillis()
            X.7La r0 = r4.A04
            java.util.ArrayList r1 = r0.A02
            X.5T6 r0 = r4.A03
            r1.add(r0)
            long r0 = r9.A00
            long r2 = X.AnonymousClass0x9.A05(r2)
            long r0 = r0 + r2
            r9.A00 = r0
            long r2 = java.lang.System.currentTimeMillis()
            X.5T6 r0 = new X.5T6
            r0.<init>()
            r4.A03 = r0
            goto L_0x00db
        L_0x0474:
            java.lang.String r0 = "BASE64"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0509
            java.lang.String r0 = "B"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0509
            java.lang.String r0 = "7BIT"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x04b1
            r0 = r27
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x04b1
            java.lang.String r3 = X.C86664Kz.A1L(r4)
            java.lang.String r0 = "X-"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x04b1
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "The encoding unsupported by vCard spec: \""
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = "\"."
            X.C18260x0.A1M(r3, r0)
        L_0x04b1:
            long r12 = java.lang.System.currentTimeMillis()
            X.5QS r0 = r9.A0G
            if (r0 == 0) goto L_0x04fe
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            if (r2 == 0) goto L_0x06f8
            if (r1 == 0) goto L_0x04f6
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            int r3 = r2.length()
            r1 = 0
        L_0x04ca:
            if (r1 >= r3) goto L_0x04f2
            char r11 = r2.charAt(r1)
            r0 = 92
            if (r11 != r0) goto L_0x04ee
            int r0 = r3 + -1
            if (r1 >= r0) goto L_0x04ee
            int r1 = r1 + 1
            char r11 = r2.charAt(r1)
            r0 = 110(0x6e, float:1.54E-43)
            if (r11 == r0) goto L_0x04e6
            r0 = 78
            if (r11 != r0) goto L_0x04ee
        L_0x04e6:
            java.lang.String r0 = "\r\n"
            r10.append(r0)
        L_0x04eb:
            int r1 = r1 + 1
            goto L_0x04ca
        L_0x04ee:
            r10.append(r11)
            goto L_0x04eb
        L_0x04f2:
            java.lang.String r2 = r10.toString()
        L_0x04f6:
            r4.add(r2)
            X.5QS r0 = r9.A0G
            r0.A01(r4)
        L_0x04fe:
            long r0 = r9.A02
            long r2 = X.AnonymousClass0x9.A05(r12)
            long r0 = r0 + r2
            r9.A02 = r0
            goto L_0x0441
        L_0x0509:
            long r10 = java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L_0x0510
            goto L_0x0524
        L_0x0510:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x056c }
        L_0x0514:
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x056c }
            java.lang.String r2 = r9.A01()     // Catch:{ OutOfMemoryError -> 0x056c }
            if (r2 == 0) goto L_0x055c
            int r0 = r2.length()     // Catch:{ OutOfMemoryError -> 0x056c }
            if (r0 != 0) goto L_0x0514
            goto L_0x054c
        L_0x0524:
            r3 = r9
            X.63t r3 = (X.C1222763t) r3     // Catch:{ OutOfMemoryError -> 0x056c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x056c }
        L_0x052b:
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x056c }
            java.lang.String r2 = r3.A01()     // Catch:{ OutOfMemoryError -> 0x056c }
            if (r2 == 0) goto L_0x0564
            int r0 = r2.length()     // Catch:{ OutOfMemoryError -> 0x056c }
            if (r0 == 0) goto L_0x054c
            java.lang.String r0 = " "
            boolean r0 = r2.startsWith(r0)     // Catch:{ OutOfMemoryError -> 0x056c }
            if (r0 != 0) goto L_0x052b
            java.lang.String r0 = "\t"
            boolean r0 = r2.startsWith(r0)     // Catch:{ OutOfMemoryError -> 0x056c }
            if (r0 != 0) goto L_0x052b
            r3.A00 = r2     // Catch:{ OutOfMemoryError -> 0x056c }
        L_0x054c:
            java.lang.String r0 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x056c }
            X.5QS r1 = r9.A0G     // Catch:{ OutOfMemoryError -> 0x056c }
            if (r1 == 0) goto L_0x057b
            java.util.ArrayList r0 = X.C18300x5.A0s(r0)     // Catch:{ OutOfMemoryError -> 0x056c }
            r1.A01(r0)     // Catch:{ OutOfMemoryError -> 0x056c }
            goto L_0x057b
        L_0x055c:
            java.lang.String r0 = "File ended during parsing BASE64 binary"
            X.6zK r1 = new X.6zK     // Catch:{ OutOfMemoryError -> 0x056c }
            r1.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x056c }
            goto L_0x056b
        L_0x0564:
            java.lang.String r0 = "File ended during parsing BASE64 binary"
            X.6zK r1 = new X.6zK     // Catch:{ OutOfMemoryError -> 0x056c }
            r1.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x056c }
        L_0x056b:
            throw r1     // Catch:{ OutOfMemoryError -> 0x056c }
        L_0x056c:
            r1 = move-exception
            java.lang.String r0 = "vcardparser/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)
            X.5QS r1 = r9.A0G
            if (r1 == 0) goto L_0x057b
            r0 = r25
            r1.A01(r0)
        L_0x057b:
            long r0 = r9.A04
            long r2 = X.AnonymousClass0x9.A05(r10)
            long r0 = r0 + r2
            r9.A04 = r0
            goto L_0x0441
        L_0x0586:
            if (r0 != 0) goto L_0x058a
            goto L_0x00e4
        L_0x058a:
            long r0 = r9.A08
            long r2 = X.AnonymousClass0x9.A05(r18)
            long r0 = r0 + r2
            r9.A08 = r0
            java.lang.String r0 = r9.A0E
            if (r0 == 0) goto L_0x06f0
            r1 = 2
            java.lang.String[] r2 = r0.split(r6, r1)
            int r0 = r2.length
            if (r0 != r1) goto L_0x06d6
            r0 = r2[r7]
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = "END"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x06d6
            r0 = r2[r8]
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x06d6
            X.5QS r2 = r9.A0G
            if (r2 == 0) goto L_0x0057
            long r4 = java.lang.System.currentTimeMillis()
            java.util.List r1 = r2.A02
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.7La r0 = (X.C149097La) r0
            r0.A00 = r7
        L_0x05cd:
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x05df
            int r0 = r0 + -1
            r2.A00 = r0
            java.lang.Object r0 = r1.get(r0)
            X.7La r0 = (X.C149097La) r0
            int r0 = r0.A00
            if (r0 != r8) goto L_0x05cd
        L_0x05df:
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.7La r0 = (X.C149097La) r0
            r2.A04 = r0
            long r2 = r9.A01
            long r0 = X.AnonymousClass0x9.A05(r4)
            long r2 = r2 + r0
            r9.A01 = r2
            goto L_0x0057
        L_0x05f4:
            java.lang.Object r5 = X.C18300x5.A0c(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r0 = X.AnonymousClass002.A03(r3)
            r4 = 0
            java.util.List r10 = r3.subList(r4, r0)
            r8 = 99
            r0 = 198(0xc6, float:2.77E-43)
            int r0 = X.C86654Ky.A06(r10, r0)
            java.util.ArrayList r6 = X.AnonymousClass002.A0I(r0)
            r7 = 0
            r3 = 0
        L_0x0611:
            int r0 = r10.size()
            if (r7 >= r0) goto L_0x0666
            int r11 = r10.size()
            java.lang.String r12 = X.AnonymousClass001.A0n(r10, r7)
            int r14 = r12.length()
            r13 = 0
            if (r14 <= 0) goto L_0x0637
            char r1 = r12.charAt(r4)
            r0 = 32
            if (r1 == r0) goto L_0x0636
            char r1 = r12.charAt(r4)
            r0 = 9
            if (r1 != r0) goto L_0x0637
        L_0x0636:
            r13 = 1
        L_0x0637:
            r2 = 1
            if (r13 != 0) goto L_0x0652
            r1 = 58
            int r0 = r12.indexOf(r1)
            if (r0 >= 0) goto L_0x0661
            if (r14 != 0) goto L_0x0652
            int r0 = r7 + 1
            if (r0 >= r11) goto L_0x0652
            java.lang.String r0 = X.AnonymousClass001.A0n(r10, r0)
            int r0 = r0.indexOf(r1)
            if (r0 > 0) goto L_0x0661
        L_0x0652:
            java.lang.String r1 = X.AnonymousClass001.A0n(r10, r7)
            X.7In r0 = new X.7In
            r0.<init>(r1, r2)
            r6.add(r0)
            int r7 = r7 + 1
            goto L_0x0611
        L_0x0661:
            r2 = 0
            int r3 = r3 + 1
            if (r3 <= r8) goto L_0x0652
        L_0x0666:
            int r7 = r6.size()
            r3 = 0
        L_0x066b:
            if (r3 >= r7) goto L_0x06a6
            java.lang.Object r8 = r6.get(r3)
            X.7In r8 = (X.C148477In) r8
            java.lang.String r2 = r8.A00
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x068e
            char r1 = r2.charAt(r4)
            r0 = 32
            if (r1 == r0) goto L_0x068b
            char r1 = r2.charAt(r4)
            r0 = 9
            if (r1 != r0) goto L_0x068e
        L_0x068b:
            int r3 = r3 + 1
            goto L_0x066b
        L_0x068e:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x068b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 32
            java.lang.String r2 = X.AnonymousClass0x2.A0e(r2, r1, r0)
            r1 = 1
            X.7In r0 = new X.7In
            r0.<init>(r2, r1)
            r6.set(r3, r0)
            goto L_0x068b
        L_0x06a6:
            X.7In r0 = new X.7In
            r0.<init>(r5, r4)
            r6.add(r0)
            goto L_0x0043
        L_0x06b0:
            X.63t r9 = new X.63t
            r9.<init>()
            goto L_0x0039
        L_0x06b7:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x06bb:
            r0 = r2
            goto L_0x002e
        L_0x06be:
            java.lang.String r1 = "AGENT Property is not supported."
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        L_0x06c6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown BEGIN type: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        L_0x06d6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "END:VCARD != \""
            r1.append(r0)
            java.lang.String r0 = r9.A0E
            r1.append(r0)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        L_0x06f0:
            java.lang.String r1 = "Attempted to split null line"
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        L_0x06f8:
            java.lang.String r1 = "null property value is not supported"
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        L_0x0700:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid line: \""
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        L_0x0718:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Expected String \"BEGIN:VCARD\" did not come (Instead, \""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\" came)"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.6zK r0 = new X.6zK
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106325Yn.A01(java.util.List, X.5QS):void");
    }
}
