package X;

import java.util.Map;

/* renamed from: X.0QT  reason: invalid class name */
public class AnonymousClass0QT {
    public AnonymousClass0PA A00 = new AnonymousClass0PA();
    public AnonymousClass0CI A01 = null;
    public Map A02 = AnonymousClass001.A0t();

    /* JADX WARNING: type inference failed for: r1v1, types: [X.0NJ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C01780Ce A02(X.C16810u0 r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = r5
            X.0Ce r3 = (X.C01780Ce) r3
            java.lang.String r0 = r3.A03
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r5.B5U()
            java.util.Iterator r2 = r0.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r2.next()
            X.0NJ r1 = (X.AnonymousClass0NJ) r1
            boolean r0 = r1 instanceof X.C01780Ce
            if (r0 == 0) goto L_0x0013
            r3 = r1
            X.0Ce r3 = (X.C01780Ce) r3
            java.lang.String r0 = r3.A03
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1 instanceof X.C16810u0
            if (r0 == 0) goto L_0x0013
            X.0u0 r1 = (X.C16810u0) r1
            X.0Ce r3 = r4.A02(r1, r6)
            if (r3 == 0) goto L_0x0013
        L_0x003a:
            return r3
        L_0x003b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QT.A02(X.0u0, java.lang.String):X.0Ce");
    }

    public AnonymousClass0NJ A04(String str) {
        String substring;
        String str2;
        String replace;
        if (str != null) {
            String str3 = "\"";
            if (!str.startsWith(str3) || !str.endsWith(str3)) {
                str3 = "'";
                if (str.startsWith(str3) && str.endsWith(str3)) {
                    substring = str.substring(1, str.length() - 1);
                    str2 = "\\'";
                }
                replace = str.replace("\\\n", "").replace("\\A", "\n");
                if (replace.length() > 1 && replace.startsWith("#")) {
                    return A03(replace.substring(1));
                }
            } else {
                substring = str.substring(1, str.length() - 1);
                str2 = "\\\"";
            }
            str = substring.replace(str2, str3);
            replace = str.replace("\\\n", "").replace("\\A", "\n");
            return A03(replace.substring(1));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r7 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture A00(X.C05420Tg r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0025
            X.0Te r5 = r7.A02
            if (r5 == 0) goto L_0x0025
        L_0x0006:
            X.0Te r3 = r7.A03
            if (r3 == 0) goto L_0x002c
            float r1 = r3.A01
            float r0 = r3.A03
            float r1 = r1 + r0
            float r2 = r3.A02
            float r0 = r3.A00
            float r2 = r2 + r0
        L_0x0014:
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            double r0 = (double) r2
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            android.graphics.Picture r0 = r6.A01(r7, r3, r0)
            return r0
        L_0x0025:
            X.0CI r0 = r6.A01
            X.0Te r5 = r0.A00
            if (r7 == 0) goto L_0x002c
            goto L_0x0006
        L_0x002c:
            X.0CI r4 = r6.A01
            X.0i6 r3 = r4.A01
            if (r3 == 0) goto L_0x0056
            X.0G3 r0 = r3.A01
            X.0G3 r1 = X.AnonymousClass0G3.percent
            if (r0 == r1) goto L_0x0049
            X.0i6 r2 = r4.A00
            if (r2 == 0) goto L_0x0049
            X.0G3 r0 = r2.A01
            if (r0 == r1) goto L_0x0049
            float r1 = r3.A00()
            float r2 = r2.A00()
            goto L_0x0014
        L_0x0049:
            if (r5 == 0) goto L_0x0056
            float r1 = r3.A00()
            float r2 = r5.A00
            float r2 = r2 * r1
            float r0 = r5.A03
            float r2 = r2 / r0
            goto L_0x0014
        L_0x0056:
            X.0i6 r0 = r4.A00
            if (r0 == 0) goto L_0x0067
            if (r5 == 0) goto L_0x0067
            float r2 = r0.A00()
            float r1 = r5.A03
            float r1 = r1 * r2
            float r0 = r5.A00
            float r1 = r1 / r0
            goto L_0x0014
        L_0x0067:
            r0 = 512(0x200, float:7.175E-43)
            android.graphics.Picture r0 = r6.A01(r7, r0, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QT.A00(X.0Tg):android.graphics.Picture");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture A01(X.C05420Tg r11, int r12, int r13) {
        /*
            r10 = this;
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r5 = r3.beginRecording(r12, r13)
            if (r11 == 0) goto L_0x0124
            X.0Te r0 = r11.A03
            if (r0 != 0) goto L_0x001f
            X.0Tg r0 = new X.0Tg
            r0.<init>(r11)
            r11 = r0
        L_0x0015:
            float r4 = (float) r12
            float r2 = (float) r13
            r1 = 0
            X.0Te r0 = new X.0Te
            r0.<init>(r1, r1, r4, r2)
            r11.A03 = r0
        L_0x001f:
            X.0YF r7 = new X.0YF
            r7.<init>(r5)
            r7.A01 = r10
            X.0CI r6 = r10.A01
            r8 = 0
            if (r6 != 0) goto L_0x003c
            java.lang.String r2 = "Nothing to render. Document is empty."
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "SVGAndroidRenderer"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            android.util.Log.w(r1, r0)
        L_0x0038:
            r3.endRecording()
            return r3
        L_0x003c:
            java.lang.String r9 = r11.A04
            if (r9 == 0) goto L_0x0068
            X.0Ce r4 = r10.A03(r9)
            r1 = 1
            java.lang.String r2 = "SVGAndroidRenderer"
            if (r4 == 0) goto L_0x0061
            boolean r0 = r4 instanceof X.AnonymousClass0CK
            if (r0 == 0) goto L_0x0061
            X.0CN r4 = (X.AnonymousClass0CN) r4
            X.0Te r5 = r4.A00
            if (r5 != 0) goto L_0x0075
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r9
            java.lang.String r0 = "View element with id \"%s\" is missing a viewBox attribute."
        L_0x0059:
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r2, r0)
            goto L_0x0038
        L_0x0061:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r9
            java.lang.String r0 = "View element with id \"%s\" not found."
            goto L_0x0059
        L_0x0068:
            X.0Te r5 = r11.A02
            if (r5 != 0) goto L_0x006e
            X.0Te r5 = r6.A00
        L_0x006e:
            X.0Tw r4 = r11.A01
            if (r4 != 0) goto L_0x0077
            X.0Tw r4 = r6.A00
            goto L_0x0077
        L_0x0075:
            X.0Tw r4 = r4.A00
        L_0x0077:
            X.0PA r0 = r11.A00
            if (r0 == 0) goto L_0x008c
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x008c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x008c
            X.0PA r1 = r11.A00
            X.0PA r0 = r10.A00
            r0.A01(r1)
        L_0x008c:
            X.0TM r0 = new X.0TM
            r0.<init>(r7)
            r7.A02 = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A05 = r0
            X.0TM r1 = r7.A02
            X.0i4 r0 = X.C10520i4.A00()
            r7.A0e(r0, r1)
            X.0TM r2 = r7.A02
            r0 = 0
            r2.A03 = r0
            r2.A07 = r8
            java.util.Stack r1 = r7.A05
            X.0TM r0 = new X.0TM
            r0.<init>(r2, r7)
            r1.push(r0)
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A03 = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A04 = r0
            java.lang.Boolean r0 = r6.A02
            if (r0 == 0) goto L_0x00ce
            X.0TM r1 = r7.A02
            boolean r0 = r0.booleanValue()
            r1.A07 = r0
        L_0x00ce:
            r7.A0R()
            X.0Te r0 = r11.A03
            X.0Te r2 = new X.0Te
            r2.<init>(r0)
            X.0i6 r1 = r6.A01
            if (r1 == 0) goto L_0x00e4
            float r0 = r2.A03
            float r0 = r1.A04(r7, r0)
            r2.A03 = r0
        L_0x00e4:
            X.0i6 r1 = r6.A00
            if (r1 == 0) goto L_0x00f0
            float r0 = r2.A00
            float r0 = r1.A04(r7, r0)
            r2.A00 = r0
        L_0x00f0:
            r7.A0W(r4, r2, r5, r6)
            r7.A0Q()
            X.0PA r0 = r11.A00
            if (r0 == 0) goto L_0x0038
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0038
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0038
            X.0PA r0 = r10.A00
            X.0FX r2 = X.AnonymousClass0FX.RenderOptions
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0038
            java.util.Iterator r1 = r0.iterator()
        L_0x0110:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.0NW r0 = (X.AnonymousClass0NW) r0
            X.0FX r0 = r0.A01
            if (r0 != r2) goto L_0x0110
            r1.remove()
            goto L_0x0110
        L_0x0124:
            X.0Tg r11 = new X.0Tg
            r11.<init>()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QT.A01(X.0Tg, int, int):android.graphics.Picture");
    }

    public C01780Ce A03(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        AnonymousClass0CI r1 = this.A01;
        if (str.equals(r1.A03)) {
            return r1;
        }
        Map map = this.A02;
        if (map.containsKey(str)) {
            return (C01780Ce) map.get(str);
        }
        C01780Ce A022 = A02(this.A01, str);
        map.put(str, A022);
        return A022;
    }
}
