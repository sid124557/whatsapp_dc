package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: X.337  reason: invalid class name */
public class AnonymousClass337 {
    public static final AnonymousClass2QV A06 = new AnonymousClass2QV(0, 0, false, false);
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FX A01;
    public volatile Boolean A02;
    public volatile Boolean A03;
    public volatile Long A04;
    public volatile ConcurrentHashMap A05;

    public boolean A03() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(AnonymousClass000.A1S(this.A00.A0Y(C58422vE.A02, 212) ? 1 : 0));
                }
            }
        }
        return this.A02.booleanValue();
    }

    public static final void A00(ConcurrentHashMap concurrentHashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                int i2 = jSONArray2.getInt(0);
                int i3 = jSONArray2.getInt(1);
                concurrentHashMap.put(Integer.valueOf(i2), new AnonymousClass2QV(Math.max(jSONArray2.getLong(2), 0), jSONArray2.optLong(3), AnonymousClass000.A1U(3, i3), false));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r9 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010c, code lost:
        if (r9.hasNext() == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010e, code lost:
        r8 = (long[]) r9.next();
        r7 = (int) r8[0];
        r6 = (int) r8[1];
        r11 = java.lang.Math.max(r8[2], 0);
        r13 = r8[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        r15 = X.AnonymousClass000.A1U(3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r6 = java.lang.Integer.valueOf(r7);
        r2 = (X.AnonymousClass2QV) r5.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0136, code lost:
        if (r2 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        r3 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013a, code lost:
        if (r3 == r15) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013c, code lost:
        r2 = r4.A01;
        r1 = X.AnonymousClass001.A0o();
        r1.append("Failed to overwrite sampling for eventId:");
        r1.append(r7);
        r1.append(" base config sampling type: ");
        r1.append(r3);
        r2.B2f(X.AnonymousClass000.A0b(" overwrite sampling type: ", r1, r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015c, code lost:
        r0 = r2.A01;
        r11 = java.lang.Math.min(r11, r0);
        r2 = r2.A00;
        r13 = r13 | r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0167, code lost:
        if (r11 != r0) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0169, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016d, code lost:
        if (r13 == r2) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0170, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0172, code lost:
        r5.put(r6, new X.AnonymousClass2QV(r11, r13, r15, r16));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2QV A01(int r18) {
        /*
            r17 = this;
            r4 = r17
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05
            if (r0 != 0) goto L_0x01a0
            monitor-enter(r4)
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x019b
            java.util.concurrent.ConcurrentHashMap r5 = X.AnonymousClass0x9.A1D()     // Catch:{ all -> 0x019d }
            X.1VX r6 = r4.A00     // Catch:{ Exception -> 0x018c }
            r0 = 226(0xe2, float:3.17E-43)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ Exception -> 0x018c }
            org.json.JSONObject r0 = r6.A0T(r3, r0)     // Catch:{ Exception -> 0x018c }
            java.lang.String r7 = "sampling"
            org.json.JSONArray r1 = r0.getJSONArray(r7)     // Catch:{ Exception -> 0x018c }
            int r0 = r1.length()     // Catch:{ Exception -> 0x018c }
            if (r0 != 0) goto L_0x005d
            r0 = 1716(0x6b4, float:2.405E-42)
            org.json.JSONObject r2 = r6.A0T(r3, r0)     // Catch:{ Exception -> 0x018c }
            r0 = 1717(0x6b5, float:2.406E-42)
            org.json.JSONObject r1 = r6.A0T(r3, r0)     // Catch:{ Exception -> 0x018c }
            org.json.JSONArray r0 = r2.getJSONArray(r7)     // Catch:{ Exception -> 0x018c }
            A00(r5, r0)     // Catch:{ Exception -> 0x018c }
            org.json.JSONArray r0 = r1.getJSONArray(r7)     // Catch:{ Exception -> 0x018c }
            A00(r5, r0)     // Catch:{ Exception -> 0x018c }
        L_0x0040:
            r0 = 3035(0xbdb, float:4.253E-42)
            boolean r0 = r6.A0Y(r3, r0)     // Catch:{ Exception -> 0x018c }
            if (r0 == 0) goto L_0x0199
            r0 = 1199(0x4af, float:1.68E-42)
            java.lang.String r7 = r6.A0R(r3, r0)     // Catch:{ Exception -> 0x018c }
            if (r7 == 0) goto L_0x0199
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x018c }
            r0 = 4
            long[] r10 = new long[r0]     // Catch:{ Exception -> 0x018c }
            r9 = 0
            r3 = 0
            r8 = 0
            r15 = 0
            r14 = 0
            goto L_0x0061
        L_0x005d:
            A00(r5, r1)     // Catch:{ Exception -> 0x018c }
            goto L_0x0040
        L_0x0061:
            int r12 = r7.length()     // Catch:{ Exception -> 0x017b }
            if (r3 >= r12) goto L_0x0104
            char r6 = r7.charAt(r3)     // Catch:{ Exception -> 0x017b }
            r0 = 91
            r1 = 0
            if (r6 != r0) goto L_0x0075
            java.util.Arrays.fill(r10, r1)     // Catch:{ Exception -> 0x017b }
            goto L_0x00ae
        L_0x0075:
            r0 = 93
            if (r6 != r0) goto L_0x0088
            r0 = 2
            if (r8 >= r0) goto L_0x007d
            goto L_0x00c7
        L_0x007d:
            java.lang.Object r0 = r10.clone()     // Catch:{ Exception -> 0x017b }
            long[] r0 = (long[]) r0     // Catch:{ Exception -> 0x017b }
            r11.add(r0)     // Catch:{ Exception -> 0x017b }
            r15 = 0
            goto L_0x008e
        L_0x0088:
            r0 = 44
            if (r6 != r0) goto L_0x0091
            int r8 = r8 + 1
        L_0x008e:
            int r3 = r3 + 1
            goto L_0x0061
        L_0x0091:
            boolean r0 = java.lang.Character.isDigit(r6)     // Catch:{ Exception -> 0x017b }
            if (r0 == 0) goto L_0x00b2
            r12 = r10[r8]     // Catch:{ Exception -> 0x017b }
            r0 = 10
            long r12 = r12 * r0
            r10[r8] = r12     // Catch:{ Exception -> 0x017b }
            int r0 = java.lang.Character.getNumericValue(r6)     // Catch:{ Exception -> 0x017b }
            long r0 = (long) r0     // Catch:{ Exception -> 0x017b }
            long r12 = r12 + r0
            r10[r8] = r12     // Catch:{ Exception -> 0x017b }
            if (r14 == 0) goto L_0x008e
            r0 = -1
            long r12 = r12 * r0
            r10[r8] = r12     // Catch:{ Exception -> 0x017b }
            goto L_0x00b0
        L_0x00ae:
            r8 = 0
            r15 = 1
        L_0x00b0:
            r14 = 0
            goto L_0x008e
        L_0x00b2:
            r0 = 45
            if (r6 != r0) goto L_0x00be
            r12 = r10[r8]     // Catch:{ Exception -> 0x017b }
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            r14 = 1
            goto L_0x008e
        L_0x00be:
            boolean r0 = java.lang.Character.isWhitespace(r6)     // Catch:{ Exception -> 0x017b }
            if (r0 != 0) goto L_0x008e
            if (r15 == 0) goto L_0x008e
            goto L_0x00eb
        L_0x00c7:
            int r0 = r3 + -20
            int r6 = java.lang.Math.max(r9, r0)     // Catch:{ Exception -> 0x017b }
            int r0 = r3 + 20
            int r3 = java.lang.Math.min(r12, r0)     // Catch:{ Exception -> 0x017b }
            X.4FX r2 = r4.A01     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "Failed to parse config, not enough argumentscheck config around: "
            r1.append(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = r7.substring(r6, r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x017b }
            r2.B2f(r0)     // Catch:{ Exception -> 0x017b }
            goto L_0x0199
        L_0x00eb:
            X.4FX r2 = r4.A01     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "Failed to parse overwrite config, wrong symbol: '"
            r1.append(r0)     // Catch:{ Exception -> 0x017b }
            r1.append(r6)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "' at position: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ Exception -> 0x017b }
            r2.B2f(r0)     // Catch:{ Exception -> 0x017b }
            goto L_0x0199
        L_0x0104:
            java.util.Iterator r9 = r11.iterator()     // Catch:{ Exception -> 0x018c }
        L_0x0108:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x018c }
            if (r0 == 0) goto L_0x0199
            java.lang.Object r8 = r9.next()     // Catch:{ Exception -> 0x018c }
            long[] r8 = (long[]) r8     // Catch:{ Exception -> 0x018c }
            r0 = 0
            r0 = r8[r0]     // Catch:{ Exception -> 0x018c }
            int r7 = (int) r0     // Catch:{ Exception -> 0x018c }
            r0 = 1
            r0 = r8[r0]     // Catch:{ Exception -> 0x018c }
            int r6 = (int) r0     // Catch:{ Exception -> 0x018c }
            r0 = 2
            r2 = r8[r0]     // Catch:{ Exception -> 0x018c }
            r0 = 0
            long r11 = java.lang.Math.max(r2, r0)     // Catch:{ Exception -> 0x018c }
            r0 = 3
            r13 = r8[r0]     // Catch:{ Exception -> 0x018c }
            boolean r15 = X.AnonymousClass000.A1U(r0, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x018c }
            java.lang.Object r2 = r5.get(r6)     // Catch:{ Exception -> 0x018c }
            X.2QV r2 = (X.AnonymousClass2QV) r2     // Catch:{ Exception -> 0x018c }
            if (r2 == 0) goto L_0x0170
            boolean r3 = r2.A03     // Catch:{ Exception -> 0x018c }
            if (r3 == r15) goto L_0x015c
            X.4FX r2 = r4.A01     // Catch:{ Exception -> 0x018c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x018c }
            java.lang.String r0 = "Failed to overwrite sampling for eventId:"
            r1.append(r0)     // Catch:{ Exception -> 0x018c }
            r1.append(r7)     // Catch:{ Exception -> 0x018c }
            java.lang.String r0 = " base config sampling type: "
            r1.append(r0)     // Catch:{ Exception -> 0x018c }
            r1.append(r3)     // Catch:{ Exception -> 0x018c }
            java.lang.String r0 = " overwrite sampling type: "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r15)     // Catch:{ Exception -> 0x018c }
            r2.B2f(r0)     // Catch:{ Exception -> 0x018c }
            goto L_0x0108
        L_0x015c:
            long r0 = r2.A01     // Catch:{ Exception -> 0x018c }
            long r11 = java.lang.Math.min(r11, r0)     // Catch:{ Exception -> 0x018c }
            long r2 = r2.A00     // Catch:{ Exception -> 0x018c }
            long r13 = r13 | r2
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0170
            r16 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0108
            goto L_0x0172
        L_0x0170:
            r16 = 1
        L_0x0172:
            X.2QV r10 = new X.2QV     // Catch:{ Exception -> 0x018c }
            r10.<init>(r11, r13, r15, r16)     // Catch:{ Exception -> 0x018c }
            r5.put(r6, r10)     // Catch:{ Exception -> 0x018c }
            goto L_0x0108
        L_0x017b:
            r3 = move-exception
            X.4FX r2 = r4.A01     // Catch:{ Exception -> 0x018c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x018c }
            java.lang.String r0 = "Failed to parse overwrite config exception: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r3)     // Catch:{ Exception -> 0x018c }
            r2.B2f(r0)     // Catch:{ Exception -> 0x018c }
            goto L_0x0199
        L_0x018c:
            r0 = move-exception
            X.4FX r1 = r4.A01     // Catch:{ all -> 0x019d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x019d }
            r1.B2f(r0)     // Catch:{ all -> 0x019d }
            r5.clear()     // Catch:{ all -> 0x019d }
        L_0x0199:
            r4.A05 = r5     // Catch:{ all -> 0x019d }
        L_0x019b:
            monitor-exit(r4)     // Catch:{ all -> 0x019d }
            goto L_0x01a0
        L_0x019d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x019d }
            throw r0
        L_0x01a0:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            java.lang.Object r1 = r0.get(r2)
            X.2QV r1 = (X.AnonymousClass2QV) r1
            if (r1 != 0) goto L_0x01c1
            int r1 = r18 >> 16
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05
            java.lang.Object r1 = X.C18290x4.A0j(r0, r1)
            X.2QV r1 = (X.AnonymousClass2QV) r1
            if (r1 != 0) goto L_0x01bc
            X.2QV r1 = A06
        L_0x01bc:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05
            r0.put(r2, r1)
        L_0x01c1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass337.A01(int):X.2QV");
    }

    public final void A02() {
        if (this.A03 == null || this.A04 == null) {
            synchronized (this) {
                if (this.A03 == null || this.A04 == null) {
                    AnonymousClass1VX r2 = this.A00;
                    this.A03 = C56952sp.A07(r2, 397);
                    this.A04 = AnonymousClass0x9.A0m(r2.A0O(C58422vE.A02, 398));
                }
            }
        }
    }

    public AnonymousClass337(AnonymousClass1VX r1, AnonymousClass4FX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
