package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2p9  reason: invalid class name and case insensitive filesystem */
public final class C54702p9 {
    public final C153167am A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;
    public final AnonymousClass2OM A03;

    public final void A00(C624134x r8) {
        C624134x r1 = r8;
        C162457s7.A0J(r8, 0);
        if (C384227m.A00(r8)) {
            A02(r1, (Integer) null, (Long) null, 1, 1, 1);
        }
    }

    public final void A01(C624134x r11, int i, int i2) {
        C624134x r4 = r11;
        if (C384227m.A00(r11)) {
            if (this.A01.A0Y(C58422vE.A02, 6545)) {
                this.A00.A04(C18290x4.A12(r11), 5);
            }
            A02(r4, Integer.valueOf(i2), (Long) null, i, 1, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a0, code lost:
        r2 = (X.AnonymousClass4DV) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f4, code lost:
        if (r2.A04 == null) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C624134x r13, java.lang.Integer r14, java.lang.Long r15, int r16, int r17, int r18) {
        /*
            r12 = this;
            byte r2 = r13.A1I
            r0 = 27
            r3 = 0
            r1 = 1
            if (r2 == r0) goto L_0x010b
            r0 = 55
            if (r2 == r0) goto L_0x010b
            r0 = 28
            if (r2 == r0) goto L_0x0108
            r0 = 62
            if (r2 == r0) goto L_0x0108
            r0 = 25
            if (r2 == r0) goto L_0x0102
            r0 = 57
            if (r2 == r0) goto L_0x0102
            r0 = 26
            if (r2 == r0) goto L_0x00ff
            r0 = 63
            if (r2 == r0) goto L_0x00ff
            r0 = 30
            if (r2 == r0) goto L_0x00fc
            r0 = 85
            if (r2 == r0) goto L_0x00fc
            r0 = 29
            if (r2 != r0) goto L_0x00f9
            r0 = 5
        L_0x0031:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0035:
            boolean r1 = X.AnonymousClass36V.A07(r13)
            boolean r0 = X.AnonymousClass36V.A06(r13)
            r1 = r1 | r0
            if (r1 == 0) goto L_0x00e2
            r11 = 0
        L_0x0041:
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()
            boolean r5 = r13 instanceof X.AnonymousClass4DV
            if (r5 == 0) goto L_0x005c
            r0 = r13
            X.4DV r0 = (X.AnonymousClass4DV) r0
            if (r0 == 0) goto L_0x005c
            X.39W r0 = r0.B5s()
            if (r0 == 0) goto L_0x005c
            X.39P r0 = r0.A03
            if (r0 == 0) goto L_0x005c
            java.util.List r0 = r0.A03
            if (r0 != 0) goto L_0x006f
        L_0x005c:
            boolean r0 = r13 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x0079
            r0 = r13
            X.4FG r0 = (X.AnonymousClass4FG) r0
            if (r0 == 0) goto L_0x0079
            X.2cm r0 = r0.BDY()
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x0079
        L_0x006f:
            int r1 = r0.size()
            java.lang.String r0 = "num_buttons"
            r4.put(r0, r1)
        L_0x0079:
            if (r14 == 0) goto L_0x0084
            int r1 = r14.intValue()
            java.lang.String r0 = "button_index"
            r4.put(r0, r1)
        L_0x0084:
            if (r15 == 0) goto L_0x008f
            long r0 = r15.longValue()
            java.lang.String r2 = "duration_ms"
            r4.put(r2, r0)
        L_0x008f:
            java.lang.Integer r0 = X.AnonymousClass36V.A03(r13)
            if (r0 == 0) goto L_0x009e
            int r1 = r0.intValue()
            java.lang.String r0 = "card_index"
            r4.put(r0, r1)
        L_0x009e:
            if (r5 == 0) goto L_0x0141
            r2 = r13
            X.4DV r2 = (X.AnonymousClass4DV) r2
            X.39W r1 = r2.B5s()
            if (r1 == 0) goto L_0x0141
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0141
            X.39P r0 = r1.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0141
            java.lang.String r1 = "feature_type"
            java.lang.String r0 = "offer"
            r4.put(r1, r0)
            X.39W r1 = r2.B5s()
            if (r1 == 0) goto L_0x0141
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0141
            X.39P r0 = r1.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0141
            X.39W r0 = r2.B5s()
            X.39P r5 = r0.A03
            java.lang.String r6 = "expiration_time"
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x0141
            goto L_0x0111
        L_0x00e2:
            boolean r0 = r13 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x00f6
            X.39W r2 = X.AnonymousClass0x9.A0Y(r13)
            if (r2 == 0) goto L_0x00f6
            int r1 = r2.A00
            r0 = 6
            if (r1 != r0) goto L_0x00f6
            X.39E r0 = r2.A04
            r11 = 1
            if (r0 != 0) goto L_0x0041
        L_0x00f6:
            r11 = 2
            goto L_0x0041
        L_0x00f9:
            r3 = 0
            goto L_0x0035
        L_0x00fc:
            r0 = 3
            goto L_0x0031
        L_0x00ff:
            r0 = 4
            goto L_0x0031
        L_0x0102:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            goto L_0x0035
        L_0x0108:
            r0 = 2
            goto L_0x0031
        L_0x010b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0035
        L_0x0111:
            java.lang.String r0 = r5.A02     // Catch:{ JSONException -> 0x012e }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x012e }
            java.lang.String r0 = "limited_time_offer"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x012e }
            boolean r0 = r1.has(r6)     // Catch:{ JSONException -> 0x012e }
            if (r0 == 0) goto L_0x0141
            long r1 = r1.getLong(r6)     // Catch:{ JSONException -> 0x012e }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ JSONException -> 0x012e }
            if (r0 == 0) goto L_0x0141
            goto L_0x013e
        L_0x012e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InteractiveMessageContent/getLTOExpirationTime/invalid json="
            r1.append(r0)
            java.lang.String r0 = r5.A02
            X.C18260x0.A15(r0, r1, r2)
            goto L_0x0141
        L_0x013e:
            r4.put(r6, r1)
        L_0x0141:
            X.34x r1 = X.AnonymousClass36V.A01(r13)
            boolean r0 = r1 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x0163
            X.4DV r1 = (X.AnonymousClass4DV) r1
            if (r1 == 0) goto L_0x0163
            X.39W r0 = r1.B5s()
            if (r0 == 0) goto L_0x0163
            X.38e r0 = r0.A05
            if (r0 == 0) goto L_0x0163
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            java.lang.String r0 = "num_cards"
            r4.put(r0, r1)
        L_0x0163:
            java.lang.String r9 = X.C18290x4.A0o(r4)
            java.lang.String r8 = X.AnonymousClass36V.A04(r13)
            X.1VX r7 = r12.A01
            r1 = 6748(0x1a5c, float:9.456E-42)
            X.2vE r6 = X.C58422vE.A02
            boolean r0 = r7.A0Y(r6, r1)
            r5 = 0
            if (r0 == 0) goto L_0x0186
            X.34x r0 = X.AnonymousClass36V.A01(r13)
            X.3ZC r0 = r0.A0n
            if (r0 == 0) goto L_0x0186
            int r0 = r0.hostStorage
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0186:
            boolean r0 = r7.A0Y(r6, r1)
            if (r0 == 0) goto L_0x01b2
            X.34x r0 = X.AnonymousClass36V.A01(r13)
            X.4uZ r0 = r0.A0n()
            java.lang.String r4 = "ZZ"
            if (r0 == 0) goto L_0x01be
            X.7rN r2 = X.AnonymousClass36V.A00     // Catch:{ 6zC -> 0x01b4 }
            java.lang.String r1 = X.AnonymousClass36P.A03(r0)     // Catch:{ 6zC -> 0x01b4 }
            r0 = 0
            X.8LC r2 = r2.A0F(r1, r0)     // Catch:{ 6zC -> 0x01b4 }
            int r0 = r2.countryCode_     // Catch:{ 6zC -> 0x01b4 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ 6zC -> 0x01b4 }
            java.lang.String r0 = X.C162167rN.A01(r2)     // Catch:{ 6zC -> 0x01b4 }
            java.lang.String r4 = X.C106675Zy.A01(r1, r0)     // Catch:{ 6zC -> 0x01b4 }
            goto L_0x01be
        L_0x01b2:
            r4 = 0
            goto L_0x01be
        L_0x01b4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InteractiveMessageUtil/retrieveSenderCountryFromPhoneNumber: Couldn't parse the contact number: "
            X.C18260x0.A16(r0, r1, r2)
        L_0x01be:
            r0 = 6816(0x1aa0, float:9.551E-42)
            boolean r0 = r7.A0Y(r6, r0)
            if (r0 == 0) goto L_0x021b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.34x r0 = X.AnonymousClass36V.A01(r13)
            long r0 = r0.A0I
            java.lang.Long r10 = X.C18320x8.A0Y(r2, r0)
        L_0x01d2:
            r0 = 6837(0x1ab5, float:9.58E-42)
            boolean r0 = r7.A0Y(r6, r0)
            if (r0 == 0) goto L_0x0219
            X.34x r0 = X.AnonymousClass36V.A01(r13)
            X.2z0 r0 = r0.A1J
            int r0 = r0.hashCode()
            java.lang.Long r2 = X.AnonymousClass0x9.A0m(r0)
        L_0x01e8:
            X.1ax r1 = new X.1ax
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r1.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r1.A02 = r0
            r1.A03 = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1.A05 = r0
            r1.A08 = r9
            r1.A0A = r8
            r1.A04 = r5
            r1.A09 = r4
            r1.A07 = r10
            r1.A06 = r2
            X.4FV r0 = r12.A02
            r0.BhD(r1)
            return
        L_0x0219:
            r2 = 0
            goto L_0x01e8
        L_0x021b:
            r10 = 0
            goto L_0x01d2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54702p9.A02(X.34x, java.lang.Integer, java.lang.Long, int, int, int):void");
    }

    public final void A03(Collection collection) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                if (C384227m.A00(A0T)) {
                    A02(A0T, (Integer) null, (Long) null, 0, 2, 0);
                }
            }
        }
    }

    public C54702p9(C153167am r1, AnonymousClass1VX r2, AnonymousClass4FV r3, AnonymousClass2OM r4) {
        C18260x0.A0V(r3, r4, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
    }
}
