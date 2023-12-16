package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6UL  reason: invalid class name */
public class AnonymousClass6UL extends AnonymousClass6UM {
    public static final Parcelable.Creator CREATOR = new C163647u9();
    public final int A00;
    public final Parcel A01;
    public final AnonymousClass6SX A02;
    public final String A03;

    public static final void A00(Object obj, StringBuilder sb, int i) {
        String str;
        byte[] bArr;
        int i2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                C162177rO.A02(obj);
                str = C155317ef.A00(obj.toString());
                break;
            case 8:
                sb.append("\"");
                bArr = (byte[]) obj;
                i2 = 0;
                break;
            case 9:
                sb.append("\"");
                bArr = (byte[]) obj;
                i2 = 10;
                break;
            case 10:
                C162177rO.A02(obj);
                AnonymousClass72N.A00(sb, (HashMap) obj);
                return;
            case 11:
                throw AnonymousClass001.A0c("Method does not accept concrete type.");
            default:
                throw AnonymousClass000.A0G("Unknown type = ", AnonymousClass001.A0o(), i);
        }
        if (bArr == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bArr, i2);
        }
        sb.append(str);
        sb.append("\"");
    }

    public final String toString() {
        AnonymousClass6SX r4 = this.A02;
        C162177rO.A03(r4, "Cannot convert to JSON on client side.");
        Parcel parcel = this.A01;
        parcel.setDataPosition(0);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(100);
        String str = this.A03;
        C162177rO.A02(str);
        Map map = (Map) r4.A02.get(str);
        C162177rO.A02(map);
        A06(parcel, A0Y, map);
        return A0Y.toString();
    }

    public AnonymousClass6UL(Parcel parcel, AnonymousClass6SX r3, int i) {
        String str;
        this.A00 = i;
        C162177rO.A02(parcel);
        this.A01 = parcel;
        this.A02 = r3;
        if (r3 == null) {
            str = null;
        } else {
            str = r3.A01;
        }
        this.A03 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0387, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0394, code lost:
        r4.append(r0);
        r4.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0417, code lost:
        r4.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x041b, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0105, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        r10 = X.AnonymousClass7o5.A01(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0119, code lost:
        if (r9.A09 == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011b, code lost:
        r10 = (java.util.AbstractList) r10;
        r4.append("[");
        r8 = r10.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0127, code lost:
        if (r7 >= r8) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0129, code lost:
        if (r7 == 0) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012b, code lost:
        r4.append(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012e, code lost:
        A00(r10.get(r7), r4, r9.A02);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013a, code lost:
        A00(r10, r4, r9.A02);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(android.os.Parcel r18, java.lang.StringBuilder r19, java.util.Map r20) {
        /*
            r17 = this;
            android.util.SparseArray r6 = X.AnonymousClass6CA.A0I()
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r20)
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r2)
            java.lang.Object r0 = r1.getValue()
            X.6To r0 = (X.C127856To) r0
            int r0 = r0.A04
            r6.put(r0, r1)
            goto L_0x0008
        L_0x001e:
            r0 = 123(0x7b, float:1.72E-43)
            r4 = r19
            r4.append(r0)
            r2 = r18
            int r3 = X.C162447s6.A02(r2)
            r5 = 0
            r8 = 0
        L_0x002d:
            int r0 = r2.dataPosition()
            if (r0 >= r3) goto L_0x043f
            int r1 = r2.readInt()
            char r0 = (char) r1
            java.lang.Object r7 = r6.get(r0)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            if (r7 == 0) goto L_0x002d
            java.lang.String r11 = ","
            if (r8 == 0) goto L_0x0047
            r4.append(r11)
        L_0x0047:
            java.lang.String r0 = X.C18310x6.A0q(r7)
            java.lang.Object r9 = r7.getValue()
            X.6To r9 = (X.C127856To) r9
            java.lang.String r10 = "\""
            r4.append(r10)
            r4.append(r0)
            java.lang.String r0 = "\":"
            r4.append(r0)
            X.8hX r0 = r9.A00
            if (r0 == 0) goto L_0x0141
            int r7 = r9.A03
            switch(r7) {
                case 0: goto L_0x007c;
                case 1: goto L_0x00ed;
                case 2: goto L_0x0072;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00db;
                case 5: goto L_0x00ba;
                case 6: goto L_0x0107;
                case 7: goto L_0x00b5;
                case 8: goto L_0x00b0;
                case 9: goto L_0x00b0;
                case 10: goto L_0x0086;
                case 11: goto L_0x0431;
                default: goto L_0x0067;
            }
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown field out type = "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0G(r0, r1, r7)
            throw r1
        L_0x0072:
            long r0 = X.C162447s6.A07(r2, r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L_0x0113
        L_0x007c:
            int r0 = X.C162447s6.A03(r2, r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x0113
        L_0x0086:
            android.os.Bundle r10 = X.C162447s6.A08(r2, r1)
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.util.Set r0 = r10.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0096:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = X.AnonymousClass001.A0m(r7)
            java.lang.String r0 = r10.getString(r1)
            X.C162177rO.A02(r0)
            r8.put(r1, r0)
            goto L_0x0096
        L_0x00ab:
            java.lang.Object r10 = X.AnonymousClass7o5.A01(r9, r8)
            goto L_0x0117
        L_0x00b0:
            byte[] r7 = X.C162447s6.A0O(r2, r1)
            goto L_0x0113
        L_0x00b5:
            java.lang.String r7 = X.C162447s6.A0D(r2, r1)
            goto L_0x0113
        L_0x00ba:
            int r8 = X.C162447s6.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r8 == 0) goto L_0x0105
            byte[] r7 = r2.createByteArray()
            int r1 = r2.readInt()
            int r0 = r0 + r8
            r2.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r7)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r0, r1)
            goto L_0x0113
        L_0x00db:
            double r0 = X.C162447s6.A00(r2, r1)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            goto L_0x0113
        L_0x00e4:
            float r0 = X.C162447s6.A01(r2, r1)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            goto L_0x0113
        L_0x00ed:
            int r7 = X.C162447s6.A04(r2, r1)
            int r1 = r2.dataPosition()
            if (r7 == 0) goto L_0x0105
            byte[] r0 = r2.createByteArray()
            int r1 = r1 + r7
            r2.setDataPosition(r1)
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r0)
            goto L_0x0113
        L_0x0105:
            r7 = 0
            goto L_0x0113
        L_0x0107:
            int r0 = X.C162447s6.A03(r2, r1)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0113:
            java.lang.Object r10 = X.AnonymousClass7o5.A01(r9, r7)
        L_0x0117:
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x013a
            java.util.AbstractList r10 = (java.util.AbstractList) r10
            java.lang.String r0 = "["
            r4.append(r0)
            int r8 = r10.size()
            r7 = 0
        L_0x0127:
            if (r7 >= r8) goto L_0x0429
            if (r7 == 0) goto L_0x012e
            r4.append(r11)
        L_0x012e:
            int r1 = r9.A02
            java.lang.Object r0 = r10.get(r7)
            A00(r0, r4, r1)
            int r7 = r7 + 1
            goto L_0x0127
        L_0x013a:
            int r0 = r9.A02
            A00(r10, r4, r0)
            goto L_0x042e
        L_0x0141:
            boolean r0 = r9.A0A
            r8 = r17
            if (r0 == 0) goto L_0x030b
            java.lang.String r0 = "["
            r4.append(r0)
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x0173;
                case 1: goto L_0x02d3;
                case 2: goto L_0x02aa;
                case 3: goto L_0x0281;
                case 4: goto L_0x0258;
                case 5: goto L_0x0217;
                case 6: goto L_0x01ee;
                case 7: goto L_0x0158;
                case 8: goto L_0x0438;
                case 9: goto L_0x0438;
                case 10: goto L_0x0438;
                case 11: goto L_0x018c;
                default: goto L_0x0151;
            }
        L_0x0151:
            java.lang.String r0 = "Unknown field type out."
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x0158:
            java.lang.String[] r8 = X.C162447s6.A0S(r2, r1)
            int r7 = r8.length
            r1 = 0
        L_0x015e:
            if (r1 >= r7) goto L_0x0429
            if (r1 == 0) goto L_0x0165
            r4.append(r11)
        L_0x0165:
            r4.append(r10)
            r0 = r8[r1]
            r4.append(r0)
            r4.append(r10)
            int r1 = r1 + 1
            goto L_0x015e
        L_0x0173:
            int[] r8 = X.C162447s6.A0Q(r2, r1)
            int r7 = r8.length
            r1 = 0
        L_0x0179:
            if (r1 >= r7) goto L_0x0429
            if (r1 == 0) goto L_0x0180
            r4.append(r11)
        L_0x0180:
            r0 = r8[r1]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0179
        L_0x018c:
            int r16 = X.C162447s6.A04(r2, r1)
            int r15 = r2.dataPosition()
            r14 = 0
            if (r16 == 0) goto L_0x01c3
            int r13 = r2.readInt()
            android.os.Parcel[] r12 = new android.os.Parcel[r13]
            r10 = 0
        L_0x019e:
            if (r10 >= r13) goto L_0x01bd
            int r7 = r2.readInt()
            if (r7 == 0) goto L_0x01ba
            int r1 = r2.dataPosition()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.appendFrom(r2, r1, r7)
            r12[r10] = r0
            int r1 = r1 + r7
            r2.setDataPosition(r1)
        L_0x01b7:
            int r10 = r10 + 1
            goto L_0x019e
        L_0x01ba:
            r12[r10] = r14
            goto L_0x01b7
        L_0x01bd:
            int r15 = r15 + r16
            r2.setDataPosition(r15)
            r14 = r12
        L_0x01c3:
            int r10 = r14.length
            r7 = 0
        L_0x01c5:
            if (r7 >= r10) goto L_0x0429
            if (r7 <= 0) goto L_0x01cc
            r4.append(r11)
        L_0x01cc:
            r0 = r14[r7]
            r0.setDataPosition(r5)
            java.lang.String r1 = r9.A08
            X.C162177rO.A02(r1)
            X.6SX r0 = r9.A01
            X.C162177rO.A02(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.C162177rO.A02(r1)
            r0 = r14[r7]
            r8.A06(r0, r4, r1)
            int r7 = r7 + 1
            goto L_0x01c5
        L_0x01ee:
            int r1 = X.C162447s6.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x020e
            r8 = 0
        L_0x01f9:
            int r7 = r8.length
            r1 = 0
        L_0x01fb:
            if (r1 >= r7) goto L_0x0429
            if (r1 == 0) goto L_0x0202
            r4.append(r11)
        L_0x0202:
            boolean r0 = r8[r1]
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x01fb
        L_0x020e:
            boolean[] r8 = r2.createBooleanArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x01f9
        L_0x0217:
            int r13 = X.C162447s6.A04(r2, r1)
            int r12 = r2.dataPosition()
            if (r13 != 0) goto L_0x0233
            r10 = 0
        L_0x0222:
            int r7 = r10.length
            r1 = 0
        L_0x0224:
            if (r1 >= r7) goto L_0x0429
            if (r1 == 0) goto L_0x022b
            r4.append(r11)
        L_0x022b:
            r0 = r10[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0224
        L_0x0233:
            int r9 = r2.readInt()
            java.math.BigDecimal[] r10 = new java.math.BigDecimal[r9]
            r8 = 0
        L_0x023a:
            if (r8 >= r9) goto L_0x0253
            byte[] r0 = r2.createByteArray()
            int r7 = r2.readInt()
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r7)
            r10[r8] = r0
            int r8 = r8 + 1
            goto L_0x023a
        L_0x0253:
            int r12 = r12 + r13
            r2.setDataPosition(r12)
            goto L_0x0222
        L_0x0258:
            int r1 = X.C162447s6.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x0278
            r9 = 0
        L_0x0263:
            int r8 = r9.length
            r7 = 0
        L_0x0265:
            if (r7 >= r8) goto L_0x0429
            if (r7 == 0) goto L_0x026c
            r4.append(r11)
        L_0x026c:
            r0 = r9[r7]
            java.lang.String r0 = java.lang.Double.toString(r0)
            r4.append(r0)
            int r7 = r7 + 1
            goto L_0x0265
        L_0x0278:
            double[] r9 = r2.createDoubleArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x0263
        L_0x0281:
            int r1 = X.C162447s6.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x02a1
            r8 = 0
        L_0x028c:
            int r7 = r8.length
            r1 = 0
        L_0x028e:
            if (r1 >= r7) goto L_0x0429
            if (r1 == 0) goto L_0x0295
            r4.append(r11)
        L_0x0295:
            r0 = r8[r1]
            java.lang.String r0 = java.lang.Float.toString(r0)
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x028e
        L_0x02a1:
            float[] r8 = r2.createFloatArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x028c
        L_0x02aa:
            int r1 = X.C162447s6.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x02ca
            r9 = 0
        L_0x02b5:
            int r8 = r9.length
            r7 = 0
        L_0x02b7:
            if (r7 >= r8) goto L_0x0429
            if (r7 == 0) goto L_0x02be
            r4.append(r11)
        L_0x02be:
            r0 = r9[r7]
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4.append(r0)
            int r7 = r7 + 1
            goto L_0x02b7
        L_0x02ca:
            long[] r9 = r2.createLongArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x02b5
        L_0x02d3:
            int r12 = X.C162447s6.A04(r2, r1)
            int r10 = r2.dataPosition()
            if (r12 != 0) goto L_0x02ef
            r9 = 0
        L_0x02de:
            int r7 = r9.length
            r1 = 0
        L_0x02e0:
            if (r1 >= r7) goto L_0x0429
            if (r1 == 0) goto L_0x02e7
            r4.append(r11)
        L_0x02e7:
            r0 = r9[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x02e0
        L_0x02ef:
            int r8 = r2.readInt()
            java.math.BigInteger[] r9 = new java.math.BigInteger[r8]
            r7 = 0
        L_0x02f6:
            if (r7 >= r8) goto L_0x0306
            byte[] r1 = r2.createByteArray()
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r9[r7] = r0
            int r7 = r7 + 1
            goto L_0x02f6
        L_0x0306:
            int r10 = r10 + r12
            r2.setDataPosition(r10)
            goto L_0x02de
        L_0x030b:
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x0320;
                case 1: goto L_0x0400;
                case 2: goto L_0x0317;
                case 3: goto L_0x03f8;
                case 4: goto L_0x03f0;
                case 5: goto L_0x03cf;
                case 6: goto L_0x041d;
                case 7: goto L_0x0389;
                case 8: goto L_0x0379;
                case 9: goto L_0x0369;
                case 10: goto L_0x0329;
                case 11: goto L_0x039c;
                default: goto L_0x0310;
            }
        L_0x0310:
            java.lang.String r0 = "Unknown field type out"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x0317:
            long r0 = X.C162447s6.A07(r2, r1)
            r4.append(r0)
            goto L_0x042e
        L_0x0320:
            int r0 = X.C162447s6.A03(r2, r1)
            r4.append(r0)
            goto L_0x042e
        L_0x0329:
            android.os.Bundle r9 = X.C162447s6.A08(r2, r1)
            java.util.Set r1 = r9.keySet()
            java.lang.String r0 = "{"
            r4.append(r0)
            java.util.Iterator r8 = r1.iterator()
            r7 = 1
        L_0x033b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0365
            java.lang.String r1 = X.AnonymousClass001.A0m(r8)
            if (r7 != 0) goto L_0x034a
            r4.append(r11)
        L_0x034a:
            r4.append(r10)
            r4.append(r1)
            java.lang.String r0 = "\":\""
            r4.append(r0)
            java.lang.String r0 = r9.getString(r1)
            java.lang.String r0 = X.C155317ef.A00(r0)
            r4.append(r0)
            r4.append(r10)
            r7 = 0
            goto L_0x033b
        L_0x0365:
            java.lang.String r0 = "}"
            goto L_0x042b
        L_0x0369:
            byte[] r1 = X.C162447s6.A0O(r2, r1)
            r4.append(r10)
            if (r1 == 0) goto L_0x0387
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            goto L_0x0394
        L_0x0379:
            byte[] r0 = X.C162447s6.A0O(r2, r1)
            r4.append(r10)
            if (r0 == 0) goto L_0x0387
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            goto L_0x0394
        L_0x0387:
            r0 = 0
            goto L_0x0394
        L_0x0389:
            java.lang.String r0 = X.C162447s6.A0D(r2, r1)
            r4.append(r10)
            java.lang.String r0 = X.C155317ef.A00(r0)
        L_0x0394:
            r4.append(r0)
            r4.append(r10)
            goto L_0x042e
        L_0x039c:
            int r1 = X.C162447s6.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x03c3
            r7 = 0
        L_0x03a7:
            r7.setDataPosition(r5)
            java.lang.String r1 = r9.A08
            X.C162177rO.A02(r1)
            X.6SX r0 = r9.A01
            X.C162177rO.A02(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            X.C162177rO.A02(r0)
            r8.A06(r7, r4, r0)
            goto L_0x042e
        L_0x03c3:
            android.os.Parcel r7 = android.os.Parcel.obtain()
            r7.appendFrom(r2, r0, r1)
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x03a7
        L_0x03cf:
            int r8 = X.C162447s6.A04(r2, r1)
            int r0 = r2.dataPosition()
            if (r8 == 0) goto L_0x041b
            byte[] r7 = r2.createByteArray()
            int r1 = r2.readInt()
            int r0 = r0 + r8
            r2.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r7)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r0, r1)
            goto L_0x0417
        L_0x03f0:
            double r0 = X.C162447s6.A00(r2, r1)
            r4.append(r0)
            goto L_0x042e
        L_0x03f8:
            float r0 = X.C162447s6.A01(r2, r1)
            r4.append(r0)
            goto L_0x042e
        L_0x0400:
            int r7 = X.C162447s6.A04(r2, r1)
            int r1 = r2.dataPosition()
            if (r7 == 0) goto L_0x041b
            byte[] r0 = r2.createByteArray()
            int r1 = r1 + r7
            r2.setDataPosition(r1)
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r0)
        L_0x0417:
            r4.append(r7)
            goto L_0x042e
        L_0x041b:
            r7 = 0
            goto L_0x0417
        L_0x041d:
            int r0 = X.C162447s6.A03(r2, r1)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r4.append(r0)
            goto L_0x042e
        L_0x0429:
            java.lang.String r0 = "]"
        L_0x042b:
            r4.append(r0)
        L_0x042e:
            r8 = 1
            goto L_0x002d
        L_0x0431:
            java.lang.String r0 = "Method does not accept concrete type."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)
            throw r1
        L_0x0438:
            java.lang.String r0 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass002.A0G(r0)
            throw r1
        L_0x043f:
            int r0 = r2.dataPosition()
            if (r0 != r3) goto L_0x044b
            r0 = 125(0x7d, float:1.75E-43)
            r4.append(r0)
            return
        L_0x044b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            X.8RI r1 = new X.8RI
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UL.A06(android.os.Parcel, java.lang.StringBuilder, java.util.Map):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        Parcel parcel2 = this.A01;
        if (parcel2 != null) {
            int A012 = C162417s1.A01(parcel, 2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            C162417s1.A06(parcel, A012);
        }
        C162417s1.A0A(parcel, this.A02, 3, i, false);
        C162417s1.A06(parcel, A002);
    }
}
