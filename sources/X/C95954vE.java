package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.json.JSONObject;

/* renamed from: X.4vE  reason: invalid class name and case insensitive filesystem */
public class C95954vE extends C105425Uw {
    public int A00;
    public Bitmap A01;
    public PointF A02;
    public C106115Xr A03;
    public C156767hA A04;
    public boolean A05;
    public final float A06;

    public void A0X(C156767hA r3) {
        this.A04 = r3;
        C106115Xr r1 = this.A03;
        if (r1 != null && (r1 instanceof AnonymousClass4vL)) {
            ((AnonymousClass4vL) r1).A00 = r3;
        }
    }

    public C95954vE(float f) {
        this.A00 = 1;
        this.A05 = false;
        C86634Kw.A17(this.A01);
        this.A06 = f;
    }

    public void A0P(JSONObject jSONObject) {
        super.A0P(jSONObject);
        this.A03.A05(jSONObject);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95954vE(org.json.JSONObject r19, float r20) {
        /*
            r18 = this;
            r2 = r18
            r14 = r20
            r2.<init>(r14)
            r4 = r19
            super.A0O(r4)
            r0 = 1
            r2.A05 = r0
            r6 = 0
            java.lang.String r9 = "brush_blur"
            boolean r8 = r4.optBoolean(r9, r6)     // Catch:{ JSONException -> 0x00eb }
            java.lang.String r0 = "points"
            org.json.JSONArray r7 = r4.getJSONArray(r0)     // Catch:{ JSONException -> 0x00eb }
            if (r8 != 0) goto L_0x002b
            java.lang.String r0 = "times"
            org.json.JSONArray r3 = r4.getJSONArray(r0)     // Catch:{ JSONException -> 0x00eb }
        L_0x0024:
            java.lang.String r5 = "width"
            int r0 = r4.getInt(r5)     // Catch:{ JSONException -> 0x00eb }
            goto L_0x002d
        L_0x002b:
            r3 = 0
            goto L_0x0024
        L_0x002d:
            float r1 = (float) r0     // Catch:{ JSONException -> 0x00eb }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r0 = 0
            if (r8 == 0) goto L_0x0076
            if (r7 == 0) goto L_0x00eb
        L_0x0036:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            boolean r3 = r4.optBoolean(r9, r6)
            android.graphics.Bitmap r9 = r2.A01
            android.graphics.PointF r12 = r2.A02
            int r0 = r2.A00
            android.graphics.Paint r10 = r2.A01
            int r1 = r4.getInt(r5)
            if (r3 == 0) goto L_0x007b
            float r14 = (float) r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r14 = r14 / r1
            java.util.List r5 = X.C106115Xr.A00(r4)
            java.lang.Object r11 = r5.get(r6)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            r13 = 0
            X.4vL r8 = new X.4vL
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r4 = 1
        L_0x0062:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x00e8
            java.lang.Object r3 = r5.get(r4)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            r0 = 0
            r8.A04(r3, r0)
            int r4 = r4 + 1
            goto L_0x0062
        L_0x0076:
            if (r7 == 0) goto L_0x00eb
            if (r3 == 0) goto L_0x00eb
            goto L_0x0036
        L_0x007b:
            float r13 = (float) r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 / r1
            java.util.List r3 = X.C106115Xr.A00(r4)
            java.lang.String r1 = "times"
            org.json.JSONArray r8 = r4.getJSONArray(r1)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r7 = 0
        L_0x008e:
            int r1 = r8.length()
            if (r7 >= r1) goto L_0x00a2
            long r5 = r8.getLong(r7)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r4.add(r1)
            int r7 = r7 + 1
            goto L_0x008e
        L_0x00a2:
            r1 = 0
            java.lang.Object r11 = r3.get(r1)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            java.lang.Object r1 = r4.get(r1)
            long r16 = X.C18310x6.A0B(r1)
            X.6l8 r8 = new X.6l8
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = 1
            r6 = 1
        L_0x00b9:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x00d3
            java.lang.Object r5 = r3.get(r6)
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            java.lang.Object r0 = r4.get(r6)
            long r0 = X.C18310x6.A0B(r0)
            r8.A04(r5, r0)
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x00d3:
            int r0 = X.AnonymousClass002.A04(r3, r7)
            java.lang.Object r3 = r3.get(r0)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            java.lang.Object r0 = r4.get(r0)
            long r0 = X.C18310x6.A0B(r0)
            r8.A03(r3, r0)
        L_0x00e8:
            r2.A03 = r8
            return
        L_0x00eb:
            java.lang.String r0 = "Json is not valid for PenBrushModel"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95954vE.<init>(org.json.JSONObject, float):void");
    }
}
