package X;

import android.text.TextUtils;

/* renamed from: X.7nc  reason: invalid class name and case insensitive filesystem */
public class C160427nc {
    public final C160387nY A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public static int A00(int[] iArr, int i) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 : iArr) {
            if (i3 >= 0) {
                i2 = Math.min(i2, i3);
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d8, code lost:
        if (r21 >= (r10.length() - 1)) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Fragment contains illegal character ");
        X.AnonymousClass6C7.A1L(r1, r3);
        r1 = X.AnonymousClass000.A0G(" at string index ", r1, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0358  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C160427nc A01(java.lang.String r25, java.lang.String r26, java.text.BreakIterator r27, int r28, int r29) {
        /*
            r7 = r28
            java.lang.String r0 = "//"
            r5 = r25
            int r0 = r5.indexOf(r0, r7)
            r6 = 1
            r8 = 0
            r25 = 2
            r2 = 0
            r4 = r27
            r27 = r29
            if (r0 != r7) goto L_0x0345
            int r1 = r0 + 2
            r0 = 3
            int[] r3 = new int[r0]
            r0 = 47
            int r0 = r5.indexOf(r0, r1)
            r3[r8] = r0
            r0 = 63
            int r0 = r5.indexOf(r0, r1)
            r3[r6] = r0
            r0 = 35
            int r0 = r5.indexOf(r0, r1)
            r3[r25] = r0
            r0 = r27
            int r7 = A00(r3, r0)
            if (r1 >= r0) goto L_0x0345
            int r0 = r7 - r1
            if (r0 <= 0) goto L_0x0345
            java.lang.String r3 = r5.substring(r1, r7)     // Catch:{ 6zS -> 0x032b }
            r0 = 64
            int r0 = r3.indexOf(r0)     // Catch:{ 6zS -> 0x032b }
            r24 = 0
            if (r0 <= 0) goto L_0x0092
            java.lang.String r23 = r3.substring(r8, r0)     // Catch:{ 6zS -> 0x032b }
            int r1 = r0 + 1
        L_0x0052:
            int r0 = r3.length()     // Catch:{ 6zS -> 0x032b }
            if (r1 >= r0) goto L_0x031c
            java.lang.String r10 = r3.substring(r1)     // Catch:{ 6zS -> 0x032b }
            r0 = 58
            int r22 = r10.lastIndexOf(r0)     // Catch:{ 6zS -> 0x032b }
            if (r22 == 0) goto L_0x030d
            java.lang.String r0 = "["
            boolean r0 = r10.startsWith(r0)     // Catch:{ 6zS -> 0x032b }
            if (r0 == 0) goto L_0x0247
            r0 = 93
            int r0 = r10.lastIndexOf(r0)     // Catch:{ 6zS -> 0x032b }
            if (r0 < 0) goto L_0x0238
            int r21 = r0 + 1
            r0 = r21
            java.lang.String r3 = r10.substring(r8, r0)     // Catch:{ 6zS -> 0x032b }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 6zS -> 0x032b }
            if (r0 != 0) goto L_0x0231
            r4.setText(r3)     // Catch:{ 6zS -> 0x032b }
            int r20 = r3.length()     // Catch:{ 6zS -> 0x032b }
            int r1 = r4.current()     // Catch:{ 6zS -> 0x032b }
            r0 = r20
            if (r1 >= r0) goto L_0x022a
            goto L_0x0096
        L_0x0092:
            r23 = r2
            r1 = 0
            goto L_0x0052
        L_0x0096:
            r0 = -1
            if (r1 == r0) goto L_0x022a
            int r9 = r3.codePointAt(r1)     // Catch:{ 6zS -> 0x032b }
            r0 = 91
            if (r9 != r0) goto L_0x0213
            int r13 = r4.next()     // Catch:{ 6zS -> 0x032b }
            r0 = r20
            if (r13 >= r0) goto L_0x020c
            r0 = -1
            if (r13 == r0) goto L_0x020c
            int r1 = r3.codePointAt(r13)     // Catch:{ 6zS -> 0x032b }
            r0 = 86
            if (r1 == r0) goto L_0x0205
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L_0x0205
            r19 = 4
            java.nio.CharBuffer r14 = java.nio.CharBuffer.allocate(r19)     // Catch:{ 6zS -> 0x032b }
            java.nio.Buffer r0 = r14.position(r8)     // Catch:{ 6zS -> 0x032b }
            if (r0 == 0) goto L_0x00cb
            java.nio.Buffer r0 = r14.position(r8)     // Catch:{ 6zS -> 0x032b }
            r0.limit(r8)     // Catch:{ 6zS -> 0x032b }
        L_0x00cb:
            r12 = 0
            r11 = 0
            r9 = 0
            r1 = 0
            r18 = 0
            r17 = 1
        L_0x00d3:
            r0 = r20
            if (r13 >= r0) goto L_0x01bf
            r0 = -1
            if (r13 == r0) goto L_0x01bf
            int r16 = r3.codePointAt(r13)     // Catch:{ 6zS -> 0x032b }
            boolean r0 = X.C160867oX.A01(r16)     // Catch:{ 6zS -> 0x032b }
            if (r0 == 0) goto L_0x00fb
            if (r12 != 0) goto L_0x00e8
            int r1 = r1 + 1
        L_0x00e8:
            int r12 = r12 + 1
            r0 = r19
            if (r12 > r0) goto L_0x0150
            r14.limit(r12)     // Catch:{ 6zS -> 0x032b }
            int r11 = r12 + -1
            r0 = r16
            char r0 = (char) r0     // Catch:{ 6zS -> 0x032b }
            r14.put(r11, r0)     // Catch:{ 6zS -> 0x032b }
            r11 = 0
            goto L_0x013e
        L_0x00fb:
            r0 = 46
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x0127
            r0 = 58
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x0113
            r0 = 93
            r15 = r0
            r0 = r16
            if (r0 != r15) goto L_0x0162
            if (r9 <= 0) goto L_0x01bf
            goto L_0x015e
        L_0x0113:
            int r11 = r11 + 1
            r0 = r25
            if (r11 != r0) goto L_0x0120
            if (r18 != 0) goto L_0x017e
            r18 = 1
        L_0x011d:
            if (r9 <= 0) goto L_0x013d
            goto L_0x0177
        L_0x0120:
            if (r11 > r0) goto L_0x0197
            if (r17 != 0) goto L_0x011d
            if (r12 != 0) goto L_0x011d
            goto L_0x018c
        L_0x0127:
            X.C160387nY.A00(r14)     // Catch:{ 6zS -> 0x032b }
            java.nio.Buffer r0 = r14.position(r8)     // Catch:{ 6zS -> 0x032b }
            if (r0 == 0) goto L_0x0137
            java.nio.Buffer r0 = r14.position(r8)     // Catch:{ 6zS -> 0x032b }
            r0.limit(r8)     // Catch:{ 6zS -> 0x032b }
        L_0x0137:
            if (r12 <= 0) goto L_0x013b
            int r1 = r1 + -1
        L_0x013b:
            int r9 = r9 + 1
        L_0x013d:
            r12 = 0
        L_0x013e:
            r0 = 8
            if (r18 == 0) goto L_0x0143
            r0 = 7
        L_0x0143:
            if (r1 > r0) goto L_0x01ac
            r0 = r19
            if (r9 > r0) goto L_0x01a5
            int r13 = r4.next()     // Catch:{ 6zS -> 0x032b }
            r17 = 0
            goto L_0x00d3
        L_0x0150:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = "Illegal length hex run >4 characters starting at string index "
            X.AnonymousClass6C8.A1D(r0, r1, r13, r12)     // Catch:{ 6zS -> 0x032b }
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x015e:
            X.C160387nY.A00(r14)     // Catch:{ 6zS -> 0x032b }
            goto L_0x01b3
        L_0x0162:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = "Illegal character "
            r1.append(r0)     // Catch:{ 6zS -> 0x032b }
            r0 = r16
            X.AnonymousClass6C7.A1L(r1, r0)     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r13)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x0177:
            java.lang.String r0 = "IPV4 address is only valid at the end of an IPV6 address string"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x017e:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 6zS -> 0x032b }
            java.lang.String r1 = "Second double colon run detected at string index "
            X.AnonymousClass6C8.A1D(r1, r3, r13, r0)     // Catch:{ 6zS -> 0x032b }
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r3)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x018c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = "Missing hex digit before colon at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r13)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x0197:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = "Illegal length colon run starting at string index "
            X.AnonymousClass6C8.A1D(r0, r1, r13, r11)     // Catch:{ 6zS -> 0x032b }
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x01a5:
            java.lang.String r0 = "IPV4 address at the end of IPV6 address must have at most 4 octets"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x01ac:
            java.lang.String r0 = "IPV6 must have 8 or fewer pieces"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x01b3:
            if (r12 <= 0) goto L_0x01b7
            int r1 = r1 + -1
        L_0x01b7:
            int r9 = r9 + 1
            r0 = r19
            if (r9 != r0) goto L_0x01bf
            int r1 = r1 + 2
        L_0x01bf:
            if (r18 == 0) goto L_0x01ce
            r0 = r25
            if (r11 == r0) goto L_0x02d0
            if (r1 > 0) goto L_0x02d0
            java.lang.String r0 = "IPV6 address with zero elision must have at least one non-zero piece"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x01ce:
            r0 = 8
            if (r1 == r0) goto L_0x02d0
            if (r11 == r6) goto L_0x01fe
            r0 = r19
            if (r9 == r0) goto L_0x01eb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = "IPV6 address with IPV4 ending must specify exactly 4 IPV4 octets, found "
            r1.append(r0)     // Catch:{ 6zS -> 0x032b }
            r1.append(r9)     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = " octets"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x01eb:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = "IPV6 without zero elision must have have exactly 8 pieces, found "
            r3.append(r0)     // Catch:{ 6zS -> 0x032b }
            r3.append(r1)     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = " pieces"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r3)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x01fe:
            java.lang.String r0 = "IPV6 must not end with a single colon"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x0205:
            java.lang.String r0 = "IPFuture address types not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x020c:
            java.lang.String r0 = "No characters after opening bracket '['"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x0213:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = "Illegal character at start of literal "
            r3.append(r0)     // Catch:{ 6zS -> 0x032b }
            int[] r1 = new int[r6]     // Catch:{ 6zS -> 0x032b }
            r1[r8] = r9     // Catch:{ 6zS -> 0x032b }
            java.lang.String r0 = new java.lang.String     // Catch:{ 6zS -> 0x032b }
            r0.<init>(r1, r8, r6)     // Catch:{ 6zS -> 0x032b }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r3)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x022a:
            java.lang.String r0 = "BreakIterator#current is past the end of string"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x0231:
            java.lang.String r0 = "IP literal cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x0238:
            X.7nY r3 = new X.7nY     // Catch:{ 6zS -> 0x032b }
            r0 = r23
            r3.<init>(r0, r2, r2)     // Catch:{ 6zS -> 0x032b }
            java.lang.String r1 = "IPFutureV6 / IPFutureAddress missing closing bracket"
            X.6zS r0 = new X.6zS     // Catch:{ 6zS -> 0x032b }
            r0.<init>(r3, r1)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x0247:
            if (r22 >= 0) goto L_0x024b
            r3 = r10
            goto L_0x0251
        L_0x024b:
            r0 = r22
            java.lang.String r3 = r10.substring(r8, r0)     // Catch:{ 6zS -> 0x032b }
        L_0x0251:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalArgumentException -> 0x02fd }
            if (r0 != 0) goto L_0x02f6
            r4.setText(r3)     // Catch:{ IllegalArgumentException -> 0x02fd }
            int r1 = r3.length()     // Catch:{ IllegalArgumentException -> 0x02fd }
            int r9 = r4.current()     // Catch:{ IllegalArgumentException -> 0x02fd }
        L_0x0262:
            r0 = -1
            if (r9 == r0) goto L_0x02aa
            if (r9 >= r1) goto L_0x02aa
            int r11 = r3.codePointAt(r9)     // Catch:{ IllegalArgumentException -> 0x02fd }
            boolean r0 = X.C160867oX.A03(r11)     // Catch:{ IllegalArgumentException -> 0x02fd }
            if (r0 != 0) goto L_0x0281
            boolean r0 = X.C160867oX.A02(r11)     // Catch:{ IllegalArgumentException -> 0x02fd }
            if (r0 != 0) goto L_0x0281
            r0 = 37
            if (r11 != r0) goto L_0x0297
            r4.next()     // Catch:{ IllegalArgumentException -> 0x0286 }
            X.C160867oX.A00(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0286 }
        L_0x0281:
            int r9 = r4.next()     // Catch:{ IllegalArgumentException -> 0x02fd }
            goto L_0x0262
        L_0x0286:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x02fd }
            java.lang.String r0 = "Host contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r9)     // Catch:{ IllegalArgumentException -> 0x02fd }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02fd }
            r0.<init>(r1, r4)     // Catch:{ IllegalArgumentException -> 0x02fd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fd }
        L_0x0297:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x02fd }
            java.lang.String r0 = "Host contains illegal character "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x02fd }
            X.AnonymousClass6C7.A1L(r1, r11)     // Catch:{ IllegalArgumentException -> 0x02fd }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r9)     // Catch:{ IllegalArgumentException -> 0x02fd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fd }
        L_0x02aa:
            if (r22 <= 0) goto L_0x02da
            r0 = r22
            java.lang.String r24 = X.AnonymousClass6C9.A0c(r0, r10)     // Catch:{ 6zS -> 0x032b }
            r1 = 10
            r0 = r24
            long r0 = java.lang.Long.parseLong(r0, r1)     // Catch:{ IllegalArgumentException -> 0x02e4 }
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x02da
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x02e4 }
            java.lang.String r4 = "Port cannot be negative "
            java.lang.String r1 = X.AnonymousClass000.A0Z(r4, r5, r0)     // Catch:{ IllegalArgumentException -> 0x02e4 }
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ IllegalArgumentException -> 0x02e4 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x02e4 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02e4 }
        L_0x02d0:
            int r0 = r10.length()     // Catch:{ 6zS -> 0x032b }
            int r1 = r0 + -1
            r0 = r21
            if (r0 < r1) goto L_0x02aa
        L_0x02da:
            X.7nY r9 = new X.7nY     // Catch:{ 6zS -> 0x032b }
            r1 = r24
            r0 = r23
            r9.<init>(r0, r3, r1)     // Catch:{ 6zS -> 0x032b }
            goto L_0x0346
        L_0x02e4:
            r5 = move-exception
            X.7nY r4 = new X.7nY     // Catch:{ 6zS -> 0x032b }
            r1 = r24
            r0 = r23
            r4.<init>(r0, r3, r1)     // Catch:{ 6zS -> 0x032b }
            java.lang.String r1 = "Invalid port number"
            X.6zS r0 = new X.6zS     // Catch:{ 6zS -> 0x032b }
            r0.<init>(r4, r1, r5)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x02f6:
            java.lang.String r0 = "Host cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x02fd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fd }
        L_0x02fd:
            r5 = move-exception
            X.7nY r4 = new X.7nY     // Catch:{ 6zS -> 0x032b }
            r0 = r23
            r4.<init>(r0, r3, r2)     // Catch:{ 6zS -> 0x032b }
            java.lang.String r1 = "Invalid host name"
            X.6zS r0 = new X.6zS     // Catch:{ 6zS -> 0x032b }
            r0.<init>(r4, r1, r5)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x030d:
            X.7nY r3 = new X.7nY     // Catch:{ 6zS -> 0x032b }
            r0 = r23
            r3.<init>(r0, r2, r2)     // Catch:{ 6zS -> 0x032b }
            java.lang.String r1 = "Host string started with colon (':')"
            X.6zS r0 = new X.6zS     // Catch:{ 6zS -> 0x032b }
            r0.<init>(r3, r1)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x031c:
            X.7nY r3 = new X.7nY     // Catch:{ 6zS -> 0x032b }
            r0 = r23
            r3.<init>(r0, r2, r2)     // Catch:{ 6zS -> 0x032b }
            java.lang.String r1 = "No host string was present"
            X.6zS r0 = new X.6zS     // Catch:{ 6zS -> 0x032b }
            r0.<init>(r3, r1)     // Catch:{ 6zS -> 0x032b }
            throw r0     // Catch:{ 6zS -> 0x032b }
        L_0x032b:
            r3 = move-exception
            X.7nY r0 = r3.mAuthority
            X.7nc r1 = new X.7nc
            r28 = r2
            r29 = r2
            r24 = r1
            r25 = r0
            r27 = r2
            r24.<init>(r25, r26, r27, r28, r29)
            java.lang.String r0 = "Unable to parse authority"
            X.6zT r2 = new X.6zT
            r2.<init>(r1, r0, r3)
            throw r2
        L_0x0345:
            r9 = r2
        L_0x0346:
            r0 = r27
            if (r7 < r0) goto L_0x0358
            X.7nc r24 = new X.7nc
            r28 = r2
            r29 = r2
            r25 = r9
            r27 = r2
            r24.<init>(r25, r26, r27, r28, r29)
            return r24
        L_0x0358:
            r0 = r25
            int[] r1 = new int[r0]
            r0 = 63
            int r0 = r5.indexOf(r0, r7)
            r1[r8] = r0
            r0 = 35
            int r0 = r5.indexOf(r0, r7)
            r1[r6] = r0
            r0 = r27
            int r8 = A00(r1, r0)
            java.lang.String r7 = r5.substring(r7, r8)
            if (r9 != 0) goto L_0x0379
            r6 = 0
        L_0x0379:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalArgumentException -> 0x055e }
            if (r0 != 0) goto L_0x03fc
            r4.setText(r7)     // Catch:{ IllegalArgumentException -> 0x055e }
            int r12 = r7.length()     // Catch:{ IllegalArgumentException -> 0x055e }
            int r10 = r4.current()     // Catch:{ IllegalArgumentException -> 0x055e }
            int r0 = r7.codePointAt(r10)     // Catch:{ IllegalArgumentException -> 0x055e }
            r11 = -1
            r1 = 47
            if (r6 != 0) goto L_0x03aa
            if (r0 != r1) goto L_0x03aa
            int r10 = r4.next()     // Catch:{ IllegalArgumentException -> 0x055e }
            if (r10 >= r12) goto L_0x03fc
            if (r10 == r11) goto L_0x03fc
            int r0 = r7.codePointAt(r10)     // Catch:{ IllegalArgumentException -> 0x055e }
            if (r0 != r1) goto L_0x03aa
            java.lang.String r0 = "Path cannot start with two slashes '//' when Uri contains an authority"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x055e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x055e }
        L_0x03aa:
            if (r10 >= r12) goto L_0x03fc
            if (r10 == r11) goto L_0x03fc
            int r3 = r7.codePointAt(r10)     // Catch:{ IllegalArgumentException -> 0x055e }
            boolean r0 = X.C160867oX.A03(r3)     // Catch:{ IllegalArgumentException -> 0x055e }
            if (r0 != 0) goto L_0x03d3
            boolean r0 = X.C160867oX.A02(r3)     // Catch:{ IllegalArgumentException -> 0x055e }
            if (r0 != 0) goto L_0x03d3
            r0 = 37
            if (r3 == r0) goto L_0x03cd
            if (r3 == r1) goto L_0x03d3
            r0 = 58
            if (r3 == r0) goto L_0x03d3
            r0 = 64
            if (r3 == r0) goto L_0x03d3
            goto L_0x03d8
        L_0x03cd:
            r4.next()     // Catch:{ IllegalArgumentException -> 0x03eb }
            X.C160867oX.A00(r7, r4)     // Catch:{ IllegalArgumentException -> 0x03eb }
        L_0x03d3:
            int r10 = r4.next()     // Catch:{ IllegalArgumentException -> 0x055e }
            goto L_0x03aa
        L_0x03d8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x055e }
            java.lang.String r0 = "Path contains illegal character "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x055e }
            X.AnonymousClass6C7.A1L(r1, r3)     // Catch:{ IllegalArgumentException -> 0x055e }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r10)     // Catch:{ IllegalArgumentException -> 0x055e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x055e }
        L_0x03eb:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x055e }
            java.lang.String r0 = "Path contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r10)     // Catch:{ IllegalArgumentException -> 0x055e }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x055e }
            r0.<init>(r1, r3)     // Catch:{ IllegalArgumentException -> 0x055e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x055e }
        L_0x03fc:
            r0 = r27
            if (r8 < r0) goto L_0x040e
            X.7nc r24 = new X.7nc
            r8 = r2
            r3 = r24
            r4 = r9
            r5 = r26
            r6 = r7
            r7 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r24
        L_0x040e:
            int r3 = r5.codePointAt(r8)
            r0 = 63
            if (r3 != r0) goto L_0x04b1
            r0 = 35
            int r1 = r5.indexOf(r0, r8)
            if (r1 >= 0) goto L_0x0420
            r1 = r27
        L_0x0420:
            java.lang.String r6 = r5.substring(r8, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalArgumentException -> 0x049d }
            if (r0 != 0) goto L_0x04b3
            r4.setText(r6)     // Catch:{ IllegalArgumentException -> 0x049d }
            int r10 = r6.length()     // Catch:{ IllegalArgumentException -> 0x049d }
            int r0 = r4.current()     // Catch:{ IllegalArgumentException -> 0x049d }
            int r3 = r6.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x049d }
            r0 = 63
            if (r3 == r0) goto L_0x0444
            java.lang.String r0 = "Query must start with ASCII question mark '?'"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x049d }
            throw r0     // Catch:{ IllegalArgumentException -> 0x049d }
        L_0x0444:
            int r8 = r4.next()     // Catch:{ IllegalArgumentException -> 0x049d }
            if (r8 >= r10) goto L_0x04b3
            r0 = -1
            if (r8 == r0) goto L_0x04b3
            int r3 = r6.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x049d }
            boolean r0 = X.C160867oX.A03(r3)     // Catch:{ IllegalArgumentException -> 0x049d }
            if (r0 != 0) goto L_0x0444
            boolean r0 = X.C160867oX.A02(r3)     // Catch:{ IllegalArgumentException -> 0x049d }
            if (r0 != 0) goto L_0x0444
            r0 = 37
            if (r3 == r0) goto L_0x0472
            r0 = 47
            if (r3 == r0) goto L_0x0444
            r0 = 58
            if (r3 == r0) goto L_0x0444
            r0 = 63
            if (r3 == r0) goto L_0x0444
            r0 = 64
            if (r3 == r0) goto L_0x0444
            goto L_0x0479
        L_0x0472:
            r4.next()     // Catch:{ IllegalArgumentException -> 0x048c }
            X.C160867oX.A00(r6, r4)     // Catch:{ IllegalArgumentException -> 0x048c }
            goto L_0x0444
        L_0x0479:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x049d }
            java.lang.String r0 = "Query contains illegal character "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x049d }
            X.AnonymousClass6C7.A1L(r1, r3)     // Catch:{ IllegalArgumentException -> 0x049d }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r8)     // Catch:{ IllegalArgumentException -> 0x049d }
            throw r0     // Catch:{ IllegalArgumentException -> 0x049d }
        L_0x048c:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x049d }
            java.lang.String r0 = "Query contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r8)     // Catch:{ IllegalArgumentException -> 0x049d }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x049d }
            r0.<init>(r1, r3)     // Catch:{ IllegalArgumentException -> 0x049d }
            throw r0     // Catch:{ IllegalArgumentException -> 0x049d }
        L_0x049d:
            r4 = move-exception
            X.7nc r3 = new X.7nc
            r8 = r3
            r10 = r26
            r11 = r7
            r12 = r6
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r1 = "Uri contained invalid query string"
            X.6zT r0 = new X.6zT
            r0.<init>(r3, r1, r4)
            throw r0
        L_0x04b1:
            r6 = r2
            goto L_0x04bc
        L_0x04b3:
            r0 = r27
            if (r1 >= r0) goto L_0x0551
            int r3 = r5.codePointAt(r1)
            r8 = r1
        L_0x04bc:
            r0 = 35
            if (r3 != r0) goto L_0x04c4
            java.lang.String r2 = r5.substring(r8)
        L_0x04c4:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalArgumentException -> 0x053d }
            if (r0 != 0) goto L_0x0551
            r4.setText(r2)     // Catch:{ IllegalArgumentException -> 0x053d }
            int r1 = r2.length()     // Catch:{ IllegalArgumentException -> 0x053d }
            int r0 = r4.current()     // Catch:{ IllegalArgumentException -> 0x053d }
            int r3 = r2.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x053d }
            r0 = 35
            if (r3 == r0) goto L_0x04e4
            java.lang.String r0 = "Fragment must start with ASCII number sign '#'"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x053d }
        L_0x04e3:
            throw r1     // Catch:{ IllegalArgumentException -> 0x053d }
        L_0x04e4:
            int r5 = r4.next()     // Catch:{ IllegalArgumentException -> 0x053d }
            if (r5 >= r1) goto L_0x0551
            r0 = -1
            if (r5 == r0) goto L_0x0551
            int r3 = r2.codePointAt(r5)     // Catch:{ IllegalArgumentException -> 0x053d }
            boolean r0 = X.C160867oX.A03(r3)     // Catch:{ IllegalArgumentException -> 0x053d }
            if (r0 != 0) goto L_0x04e4
            boolean r0 = X.C160867oX.A02(r3)     // Catch:{ IllegalArgumentException -> 0x053d }
            if (r0 != 0) goto L_0x04e4
            r0 = 37
            if (r3 == r0) goto L_0x0512
            r0 = 47
            if (r3 == r0) goto L_0x04e4
            r0 = 58
            if (r3 == r0) goto L_0x04e4
            r0 = 63
            if (r3 == r0) goto L_0x04e4
            r0 = 64
            if (r3 == r0) goto L_0x04e4
            goto L_0x0519
        L_0x0512:
            r4.next()     // Catch:{ IllegalArgumentException -> 0x052c }
            X.C160867oX.A00(r2, r4)     // Catch:{ IllegalArgumentException -> 0x052c }
            goto L_0x04e4
        L_0x0519:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x053d }
            java.lang.String r0 = "Fragment contains illegal character "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x053d }
            X.AnonymousClass6C7.A1L(r1, r3)     // Catch:{ IllegalArgumentException -> 0x053d }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0G(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x053d }
            goto L_0x04e3
        L_0x052c:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x053d }
            java.lang.String r0 = "Fragment contains invalid percent encoded character at string index "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x053d }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x053d }
            r1.<init>(r0, r3)     // Catch:{ IllegalArgumentException -> 0x053d }
            goto L_0x04e3
        L_0x053d:
            r4 = move-exception
            X.7nc r3 = new X.7nc
            r8 = r3
            r10 = r26
            r11 = r7
            r12 = r6
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r1 = "Uri contained invalid fragment"
            X.6zT r0 = new X.6zT
            r0.<init>(r3, r1, r4)
            throw r0
        L_0x0551:
            X.7nc r24 = new X.7nc
            r8 = r24
            r10 = r26
            r11 = r7
            r12 = r6
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            return r24
        L_0x055e:
            r3 = move-exception
            X.7nc r1 = new X.7nc
            r13 = r2
            r8 = r1
            r10 = r26
            r11 = r7
            r12 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r0 = "Uri contained an invalid path"
            X.6zT r2 = new X.6zT
            r2.<init>(r1, r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160427nc.A01(java.lang.String, java.lang.String, java.text.BreakIterator, int, int):X.7nc");
    }

    public C160427nc(C160387nY r1, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A00 = r1;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public String A02() {
        StringBuilder A0o = AnonymousClass001.A0o();
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            C18290x4.A1R(A0o, str);
        }
        C160387nY r1 = this.A00;
        if (r1 != null) {
            A0o.append("//");
            A0o.append(r1.A01());
        }
        String str2 = this.A02;
        if (!TextUtils.isEmpty(str2)) {
            A0o.append(str2);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            A0o.append("?<REDACTED>");
        }
        if (!TextUtils.isEmpty(this.A01)) {
            A0o.append("#<REDACTED>");
        }
        return A0o.toString();
    }

    public String toString() {
        return A02();
    }
}
