package X;

import java.util.AbstractCollection;

/* renamed from: X.73K  reason: invalid class name */
public final class AnonymousClass73K {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.7Bm} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r13v2, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C146777Bo A00(X.C185628tz r16) {
        /*
            r8 = 0
            X.7Bo r7 = new X.7Bo
            r7.<init>()
            r9 = r16
            X.6wj r0 = r9.Bgg()
            X.6wj r6 = X.C142156wj.START_OBJECT
            if (r0 == r6) goto L_0x0014
            r9.BpQ()
            return r8
        L_0x0014:
            X.6wj r0 = r9.BLY()
            X.6wj r5 = X.C142156wj.END_OBJECT
            if (r0 == r5) goto L_0x05ce
            java.lang.String r2 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r2)
            r4 = 32
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            r1 = 0
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "layout"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0048
            X.7Bn r16 = new X.7Bn
            r16.<init>()
            X.6wj r0 = r9.Bgg()
            if (r0 == r6) goto L_0x004c
            r9.BpQ()
        L_0x0046:
            r7.A00 = r1
        L_0x0048:
            r9.BpQ()
            goto L_0x0014
        L_0x004c:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x05ca
            java.lang.String r2 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r2)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            r1 = 0
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "bloks_payload"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            X.7QF r10 = new X.7QF
            r10.<init>()
            X.6wj r0 = r9.Bgg()
            if (r0 == r6) goto L_0x0082
            r9.BpQ()
        L_0x007a:
            r0 = r16
            r0.A00 = r1
        L_0x007e:
            r9.BpQ()
            goto L_0x004c
        L_0x0082:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x05c7
            java.lang.String r1 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r1)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            r2 = 0
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "action"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b0
            X.8uL r0 = r9.Bgh()
            X.48t r0 = X.AnonymousClass73O.A00(r0)
            r10.A03 = r0
        L_0x00ac:
            r9.BpQ()
            goto L_0x0082
        L_0x00b0:
            java.lang.String r0 = "tree"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = X.AnonymousClass739.A00(r9)
            X.84O r0 = (X.AnonymousClass84O) r0
            r10.A00 = r0
            goto L_0x00ac
        L_0x00c1:
            java.lang.String r11 = "data"
            boolean r0 = r11.equals(r1)
            r3 = 0
            if (r0 == 0) goto L_0x0156
            X.6wj r1 = r9.Bgg()
            X.6wj r0 = X.C142156wj.START_ARRAY
            if (r1 != r0) goto L_0x0152
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x00d6:
            X.6wj r1 = r9.BLY()
            X.6wj r0 = X.C142156wj.END_ARRAY
            if (r1 == r0) goto L_0x0152
            X.7gX r12 = new X.7gX
            r12.<init>()
            X.6wj r0 = r9.Bgg()
            if (r0 == r6) goto L_0x00ed
            r9.BpQ()
            goto L_0x00d6
        L_0x00ed:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x014e
            java.lang.String r1 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r1)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = A01(r9)
            r12.A00 = r0
        L_0x0112:
            r9.BpQ()
            goto L_0x00ed
        L_0x0116:
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = A01(r9)
            r12.A01 = r0
            goto L_0x0112
        L_0x0125:
            boolean r0 = r11.equals(r1)
            if (r0 == 0) goto L_0x0112
            X.6wj r0 = r9.Bgg()
            if (r0 != r6) goto L_0x014a
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
        L_0x0135:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x014b
            java.lang.String r1 = r9.Bgf()
            r9.BLY()
            java.lang.Object r0 = X.C154147cg.A00(r9)
            r2.put(r1, r0)
            goto L_0x0135
        L_0x014a:
            r2 = 0
        L_0x014b:
            r12.A02 = r2
            goto L_0x0112
        L_0x014e:
            r3.add(r12)
            goto L_0x00d6
        L_0x0152:
            r10.A05 = r3
            goto L_0x00ac
        L_0x0156:
            java.lang.String r0 = "embedded_payloads"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0180
            X.6wj r1 = r9.Bgg()
            X.6wj r0 = X.C142156wj.START_ARRAY
            if (r1 != r0) goto L_0x017c
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x016a:
            X.6wj r1 = r9.BLY()
            X.6wj r0 = X.C142156wj.END_ARRAY
            if (r1 == r0) goto L_0x017c
            X.7fy r0 = X.AnonymousClass73I.A00(r9)
            if (r0 == 0) goto L_0x016a
            r3.add(r0)
            goto L_0x016a
        L_0x017c:
            r10.A06 = r3
            goto L_0x00ac
        L_0x0180:
            java.lang.String r0 = "referenced"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01a4
            X.6wj r1 = r9.Bgg()
            X.6wj r0 = X.C142156wj.START_ARRAY
            if (r1 != r0) goto L_0x01a0
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x0194:
            X.6wj r1 = r9.BLY()
            X.6wj r0 = X.C142156wj.END_ARRAY
            if (r1 == r0) goto L_0x01a0
            A02(r9, r3)
            goto L_0x0194
        L_0x01a0:
            r10.A0B = r3
            goto L_0x00ac
        L_0x01a4:
            java.lang.String r0 = "referenced_external"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            X.6wj r1 = r9.Bgg()
            X.6wj r0 = X.C142156wj.START_ARRAY
            if (r1 != r0) goto L_0x01c4
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x01b8:
            X.6wj r1 = r9.BLY()
            X.6wj r0 = X.C142156wj.END_ARRAY
            if (r1 == r0) goto L_0x01c4
            A02(r9, r3)
            goto L_0x01b8
        L_0x01c4:
            r10.A0A = r3
            goto L_0x00ac
        L_0x01c8:
            java.lang.String r0 = "referenced_embedded_payloads"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ec
            X.6wj r1 = r9.Bgg()
            X.6wj r0 = X.C142156wj.START_ARRAY
            if (r1 != r0) goto L_0x01e8
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x01dc:
            X.6wj r1 = r9.BLY()
            X.6wj r0 = X.C142156wj.END_ARRAY
            if (r1 == r0) goto L_0x01e8
            A02(r9, r3)
            goto L_0x01dc
        L_0x01e8:
            r10.A09 = r3
            goto L_0x00ac
        L_0x01ec:
            java.lang.String r0 = "props"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0257
            X.6wj r1 = r9.Bgg()
            X.6wj r0 = X.C142156wj.START_ARRAY
            if (r1 != r0) goto L_0x0253
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x0200:
            X.6wj r1 = r9.BLY()
            X.6wj r0 = X.C142156wj.END_ARRAY
            if (r1 == r0) goto L_0x0253
            X.7fx r1 = new X.7fx
            r1.<init>()
            X.6wj r0 = r9.Bgg()
            if (r0 == r6) goto L_0x0217
            r9.BpQ()
            goto L_0x0200
        L_0x0217:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x024f
            java.lang.String r2 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r2)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            if (r0 != 0) goto L_0x023c
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0240
            java.lang.String r0 = A01(r9)
            r1.A00 = r0
        L_0x023c:
            r9.BpQ()
            goto L_0x0217
        L_0x0240:
            java.lang.String r0 = "name"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x023c
            java.lang.String r0 = A01(r9)
            r1.A01 = r0
            goto L_0x023c
        L_0x024f:
            r3.add(r1)
            goto L_0x0200
        L_0x0253:
            r10.A08 = r3
            goto L_0x00ac
        L_0x0257:
            java.lang.String r0 = "error_attribution"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x029c
            X.7Bm r3 = new X.7Bm
            r3.<init>()
            X.6wj r0 = r9.Bgg()
            if (r0 == r6) goto L_0x0271
            r9.BpQ()
        L_0x026d:
            r10.A01 = r2
            goto L_0x00ac
        L_0x0271:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x029a
            java.lang.String r1 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r1)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            if (r0 != 0) goto L_0x0296
            java.lang.String r0 = "logging_id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0296
            java.lang.String r0 = X.AnonymousClass6C8.A0e(r9)
            r3.A00 = r0
        L_0x0296:
            r9.BpQ()
            goto L_0x0271
        L_0x029a:
            r2 = r3
            goto L_0x026d
        L_0x029c:
            java.lang.String r0 = "component_queries"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03dd
            X.6wj r0 = r9.Bgg()
            X.6wj r11 = X.C142156wj.START_ARRAY
            if (r0 != r11) goto L_0x03d9
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x02b0:
            X.6wj r0 = r9.BLY()
            X.6wj r2 = X.C142156wj.END_ARRAY
            if (r0 == r2) goto L_0x03d9
            X.7Pf r1 = new X.7Pf
            r1.<init>()
            X.6wj r0 = r9.Bgg()
            if (r0 == r6) goto L_0x02c7
            r9.BpQ()
            goto L_0x02b0
        L_0x02c7:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x03d4
            java.lang.String r12 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r12)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            if (r0 != 0) goto L_0x02ed
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r12)
            r13 = 0
            if (r0 == 0) goto L_0x02f1
            java.lang.String r0 = A01(r9)
            r1.A06 = r0
        L_0x02ed:
            r9.BpQ()
            goto L_0x02c7
        L_0x02f1:
            java.lang.String r0 = "app_id_expr"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0304
            X.8uL r0 = r9.Bgh()
            X.48t r0 = X.AnonymousClass73O.A00(r0)
            r1.A00 = r0
            goto L_0x02ed
        L_0x0304:
            java.lang.String r0 = "params"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0317
            X.8uL r0 = r9.Bgh()
            X.48t r0 = X.AnonymousClass73O.A00(r0)
            r1.A03 = r0
            goto L_0x02ed
        L_0x0317:
            java.lang.String r0 = "client_params"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x032a
            X.8uL r0 = r9.Bgh()
            X.48t r0 = X.AnonymousClass73O.A00(r0)
            r1.A02 = r0
            goto L_0x02ed
        L_0x032a:
            java.lang.String r0 = "deps"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0349
            X.6wj r0 = r9.Bgg()
            if (r0 != r11) goto L_0x0346
            java.util.HashSet r13 = X.AnonymousClass002.A0K()
        L_0x033c:
            X.6wj r0 = r9.BLY()
            if (r0 == r2) goto L_0x0346
            A02(r9, r13)
            goto L_0x033c
        L_0x0346:
            r1.A08 = r13
            goto L_0x02ed
        L_0x0349:
            java.lang.String r0 = "targets"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0390
            X.6wj r0 = r9.Bgg()
            if (r0 != r6) goto L_0x038c
            java.util.HashMap r13 = X.AnonymousClass001.A0t()
        L_0x035b:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x038c
            java.lang.String r12 = r9.Bgf()
            r9.BLY()
            X.6wj r14 = r9.Bgg()
            X.6wj r0 = X.C142156wj.NULL
            if (r14 != r0) goto L_0x0374
            r13.put(r12, r8)
            goto L_0x035b
        L_0x0374:
            X.8uL r0 = r9.Bgh()
            boolean r0 = r0.BID()
            if (r0 != 0) goto L_0x035b
            X.8uL r0 = r9.Bgh()
            java.lang.String r0 = r0.BqG()
            if (r0 == 0) goto L_0x035b
            r13.put(r12, r0)
            goto L_0x035b
        L_0x038c:
            r1.A07 = r13
            goto L_0x02ed
        L_0x0390:
            java.lang.String r0 = "cache_ttl_expr"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x03a4
            X.8uL r0 = r9.Bgh()
            X.48t r0 = X.AnonymousClass73O.A00(r0)
            r1.A01 = r0
            goto L_0x02ed
        L_0x03a4:
            java.lang.String r0 = "disk_cache_enabled"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x03bc
            X.8uL r0 = r9.Bgh()
            boolean r0 = r0.Ay6()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A04 = r0
            goto L_0x02ed
        L_0x03bc:
            java.lang.String r0 = "is_scoped"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x02ed
            X.8uL r0 = r9.Bgh()
            boolean r0 = r0.Ay6()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A05 = r0
            goto L_0x02ed
        L_0x03d4:
            r3.add(r1)
            goto L_0x02b0
        L_0x03d9:
            r10.A04 = r3
            goto L_0x00ac
        L_0x03dd:
            java.lang.String r0 = "hoisted_async_components"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04d8
            X.6wj r0 = r9.Bgg()
            X.6wj r14 = X.C142156wj.START_ARRAY
            if (r0 != r14) goto L_0x04d4
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x03f1:
            X.6wj r0 = r9.BLY()
            X.6wj r13 = X.C142156wj.END_ARRAY
            if (r0 == r13) goto L_0x04d4
            X.7Gi r12 = new X.7Gi
            r12.<init>()
            X.6wj r0 = r9.Bgg()
            if (r0 == r6) goto L_0x0408
            r9.BpQ()
            goto L_0x03f1
        L_0x0408:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x04cf
            java.lang.String r1 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r1)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            if (r0 != 0) goto L_0x042d
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0431
            java.lang.String r0 = X.AnonymousClass6C8.A0e(r9)
            r12.A01 = r0
        L_0x042d:
            r9.BpQ()
            goto L_0x0408
        L_0x0431:
            java.lang.String r0 = "payload"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x042d
            X.6wj r2 = r9.Bgg()
            X.6wj r0 = X.C142156wj.STRING
            if (r2 == r0) goto L_0x0454
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Expected string while parsing string-encoded component payload, got "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.lang.String r0 = "BloksComponentQueryPayload"
            X.C159737mN.A01(r1, r0)
            r0 = 0
        L_0x0451:
            r12.A00 = r0
            goto L_0x042d
        L_0x0454:
            X.8uL r0 = r9.Bgh()
            java.lang.String r11 = r0.BqG()
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r11)
            android.util.JsonReader r0 = new android.util.JsonReader
            r0.<init>(r1)
            X.8D3 r2 = new X.8D3
            r2.<init>(r0)
            r2.BLY()
            r15 = 0
            X.7Gh r1 = new X.7Gh
            r1.<init>()
            X.6wj r0 = r2.A01
            if (r0 == r6) goto L_0x0480
            r2.BpQ()
        L_0x047b:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r11, r15)
            goto L_0x0451
        L_0x0480:
            X.6wj r0 = r2.BLY()
            if (r0 == r5) goto L_0x04cd
            java.lang.String r15 = r2.A02
            int r0 = X.AnonymousClass73G.A00(r15)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r2.BLY()
            if (r0 != 0) goto L_0x04c9
            java.lang.String r0 = "components"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x04b5
            X.6wj r0 = r2.A01
            if (r0 != r14) goto L_0x04c6
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()
        L_0x04a5:
            X.6wj r0 = r2.BLY()
            if (r0 == r13) goto L_0x04c7
            X.7fy r0 = X.AnonymousClass73I.A00(r2)
            if (r0 == 0) goto L_0x04a5
            r15.add(r0)
            goto L_0x04a5
        L_0x04b5:
            java.lang.String r0 = "prefetch_script"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x04c9
            X.8D6 r0 = r2.A00
            X.48t r0 = X.AnonymousClass73O.A00(r0)
            r1.A00 = r0
            goto L_0x04c9
        L_0x04c6:
            r15 = 0
        L_0x04c7:
            r1.A01 = r15
        L_0x04c9:
            r2.BpQ()
            goto L_0x0480
        L_0x04cd:
            r15 = r1
            goto L_0x047b
        L_0x04cf:
            r3.add(r12)
            goto L_0x03f1
        L_0x04d4:
            r10.A07 = r3
            goto L_0x00ac
        L_0x04d8:
            java.lang.String r0 = "ft"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0518
            X.6wj r1 = r9.Bgg()
            r0 = 0
            if (r1 != r6) goto L_0x0514
            java.util.LinkedHashMap r3 = X.C18320x8.A0r()
        L_0x04eb:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x050f
            java.lang.String r2 = r9.Bgf()
            r9.BLY()
            java.lang.Object r1 = X.C154147cg.A00(r9)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            X.C162457s7.A0D(r2)
            X.7fz r0 = new X.7fz
            r0.<init>(r1)
            r3.put(r2, r0)
            goto L_0x04eb
        L_0x050f:
            X.7Xi r0 = new X.7Xi
            r0.<init>(r3)
        L_0x0514:
            r10.A02 = r0
            goto L_0x00ac
        L_0x0518:
            java.lang.String r0 = "templates"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0543
            X.6wj r0 = r9.Bgg()
            if (r0 != r6) goto L_0x053f
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
        L_0x052a:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x053f
            java.lang.String r1 = r9.Bgf()
            r9.BLY()
            java.lang.Object r0 = X.AnonymousClass739.A00(r9)
            r2.put(r1, r0)
            goto L_0x052a
        L_0x053f:
            r10.A0D = r2
            goto L_0x00ac
        L_0x0543:
            java.lang.String r0 = "values"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ac
            X.6wj r1 = r9.Bgg()
            X.6wj r0 = X.C142156wj.START_ARRAY
            if (r1 != r0) goto L_0x05c3
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
        L_0x0557:
            X.6wj r1 = r9.BLY()
            X.6wj r0 = X.C142156wj.END_ARRAY
            if (r1 == r0) goto L_0x05c3
            X.7Gj r2 = new X.7Gj
            r2.<init>()
            X.6wj r0 = r9.Bgg()
            if (r0 == r6) goto L_0x056e
            r9.BpQ()
            goto L_0x0557
        L_0x056e:
            X.6wj r0 = r9.BLY()
            if (r0 == r5) goto L_0x05bf
            java.lang.String r1 = r9.Bgf()
            int r0 = X.AnonymousClass73G.A00(r1)
            boolean r0 = X.C18280x3.A1U(r0, r4)
            r9.BLY()
            if (r0 != 0) goto L_0x0593
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0597
            java.lang.String r0 = X.AnonymousClass6C8.A0e(r9)
            r2.A01 = r0
        L_0x0593:
            r9.BpQ()
            goto L_0x056e
        L_0x0597:
            java.lang.String r0 = "depth"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05a7
            X.8uL r0 = r9.Bgh()
            r0.BGg()
            goto L_0x0593
        L_0x05a7:
            java.lang.String r0 = "expression"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0593
            X.8uL r0 = r9.Bgh()
            java.lang.String r1 = r0.BqG()
            X.7fz r0 = new X.7fz
            r0.<init>(r1)
            r2.A00 = r0
            goto L_0x0593
        L_0x05bf:
            r3.add(r2)
            goto L_0x0557
        L_0x05c3:
            r10.A0C = r3
            goto L_0x00ac
        L_0x05c7:
            r1 = r10
            goto L_0x007a
        L_0x05ca:
            r1 = r16
            goto L_0x0046
        L_0x05ce:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73K.A00(X.8tz):X.7Bo");
    }

    public static String A01(C185628tz r2) {
        if (r2.Bgh().BID()) {
            return null;
        }
        return r2.Bgh().BqG();
    }

    public static void A02(C185628tz r1, AbstractCollection abstractCollection) {
        String BqG;
        if (!r1.Bgh().BID() && (BqG = r1.Bgh().BqG()) != null) {
            abstractCollection.add(BqG);
        }
    }
}
