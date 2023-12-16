package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5aV  reason: invalid class name and case insensitive filesystem */
public class C106985aV {
    public int A00;
    public RectF A01;
    public RectF A02;
    public String A03;
    public List A04;

    public void A06(int i, Bitmap bitmap) {
        Canvas A06 = AnonymousClass4L0.A06(bitmap);
        A08(bitmap, A06, i, false, false);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C86664Kz.A1F(it).A0L(A06);
        }
    }

    public void A07(Bitmap bitmap, int i, boolean z, boolean z2) {
        Canvas A06 = AnonymousClass4L0.A06(bitmap);
        A08(bitmap, A06, i, z, z2);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C86664Kz.A1F(it).A0K(A06);
        }
    }

    public static C106985aV A01(Context context, C620733j r4, AnonymousClass5Y0 r5, AnonymousClass33O r6, File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    A0o.append(readLine);
                } else {
                    C106985aV A032 = A03(context, r4, r5, r6, A0o.toString());
                    bufferedReader.close();
                    return A032;
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0146, code lost:
        r10.A0E();
        r3.add(r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C106985aV A03(android.content.Context r12, X.C620733j r13, X.AnonymousClass5Y0 r14, X.AnonymousClass33O r15, java.lang.String r16) {
        /*
            java.lang.String r8 = "blurred-bitmap-provider"
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            r11 = 0
            if (r0 != 0) goto L_0x01a7
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1H(r16)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            android.graphics.RectF r9 = X.AnonymousClass002.A07()     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r1 = X.C86644Kx.A00(r9, r7)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            android.graphics.RectF r6 = X.AnonymousClass002.A07()     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "crop-l"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r0 = r0 / r1
            r6.left = r0     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "crop-t"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r0 = r0 / r1
            r6.top = r0     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "crop-r"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r0 = r0 / r1
            r6.right = r0     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "crop-b"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            float r0 = r0 / r1
            r6.bottom = r0     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "rotate"
            int r5 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "shapes"
            org.json.JSONArray r4 = r7.getJSONArray(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r2 = 0
        L_0x0052:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r2 >= r0) goto L_0x0150
            org.json.JSONObject r1 = r4.getJSONObject(r2)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "type"
            java.lang.String r10 = r1.getString(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            int r0 = r10.hashCode()     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            switch(r0) {
                case -2069773495: goto L_0x006b;
                case -1890252483: goto L_0x007a;
                case -1853985446: goto L_0x0089;
                case -1676415975: goto L_0x0098;
                case -1493474063: goto L_0x00a7;
                case -841189240: goto L_0x00b6;
                case -841116134: goto L_0x00c5;
                case 110873: goto L_0x00d3;
                case 3423314: goto L_0x00e5;
                case 3496420: goto L_0x00f3;
                case 3556653: goto L_0x0101;
                case 93090825: goto L_0x010f;
                case 96632902: goto L_0x011d;
                case 1102578873: goto L_0x012b;
                case 1901043637: goto L_0x0139;
                default: goto L_0x0069;
            }     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
        L_0x0069:
            goto L_0x014c
        L_0x006b:
            java.lang.String r0 = "thinking-bubble"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vG r10 = new X.4vG     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x007a:
            java.lang.String r0 = "sticker"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4v7 r10 = new X.4v7     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r12, r15, r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x0089:
            java.lang.String r0 = "circular-mask"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4v8 r10 = new X.4v8     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x0098:
            java.lang.String r0 = "digital-clock"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4v6 r10 = new X.4v6     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>((android.content.Context) r12, (X.C620733j) r13, (org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x00a7:
            java.lang.String r0 = "analog-clock"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vI r10 = new X.4vI     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>((android.content.Context) r12, (X.C620733j) r13, (org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x00b6:
            java.lang.String r0 = "speech-bubble-oval"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vC r10 = new X.4vC     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x00c5:
            java.lang.String r0 = "speech-bubble-rect"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vD r10 = new X.4vD     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x00d3:
            java.lang.String r0 = "pen"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            float r0 = X.C86604Kt.A00(r12)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            X.4vE r10 = new X.4vE     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1, r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x00e5:
            java.lang.String r0 = "oval"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vA r10 = new X.4vA     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x00f3:
            java.lang.String r0 = "rect"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vB r10 = new X.4vB     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x0101:
            java.lang.String r0 = "text"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vF r10 = new X.4vF     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r12, r14, r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x010f:
            java.lang.String r0 = "arrow"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4v9 r10 = new X.4v9     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x011d:
            java.lang.String r0 = "emoji"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4v5 r10 = new X.4v5     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r12, r14, r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x012b:
            java.lang.String r0 = "newsletter"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vH r10 = new X.4vH     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0146
        L_0x0139:
            java.lang.String r0 = "location"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x014c
            X.4vJ r10 = new X.4vJ     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r10.<init>(r12, r13, r1)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
        L_0x0146:
            r10.A0E()     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r3.add(r10)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
        L_0x014c:
            int r2 = r2 + 1
            goto L_0x0052
        L_0x0150:
            X.5aV r4 = new X.5aV     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r4.<init>(r9, r6, r3, r5)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            boolean r0 = r7.has(r8)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x019c
            org.json.JSONObject r3 = r7.getJSONObject(r8)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r3 == 0) goto L_0x019c
            java.lang.String r0 = "small-bitmap"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            int r0 = r1.length     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "origin-width"
            int r1 = r3.getInt(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.lang.String r0 = "origin-height"
            int r0 = r3.getInt(r0)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            X.7hA r3 = new X.7hA     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r3.<init>(r1, r0, r2)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.util.List r0 = r4.A04     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
        L_0x0188:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x019c
            X.5Uw r1 = X.C86664Kz.A1F(r2)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            boolean r0 = r1 instanceof X.C95954vE     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            if (r0 == 0) goto L_0x0188
            X.4vE r1 = (X.C95954vE) r1     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            r1.A0X(r3)     // Catch:{ JSONException -> 0x01a1, IllegalArgumentException -> 0x019d }
            goto L_0x0188
        L_0x019c:
            return r4
        L_0x019d:
            r1 = move-exception
            java.lang.String r0 = "Doodle/Drawable or picture unable to load from JSON"
            goto L_0x01a4
        L_0x01a1:
            r1 = move-exception
            java.lang.String r0 = "Doodle/load unable to load from JSON"
        L_0x01a4:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01a7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106985aV.A03(android.content.Context, X.33j, X.5Y0, X.33O, java.lang.String):X.5aV");
    }

    public void A09(C95204sn r11) {
        if (A0B(new String[]{"pen"})) {
            r11.A0C = C86624Kv.A0Y(r11.A0C);
        }
        if (A0B(new String[]{"arrow", "oval", "thinking-bubble", "speech-bubble-oval", "speech-bubble-rect", "digital-clock", "analog-clock", "location", "sticker", "emoji"})) {
            r11.A0G = C86624Kv.A0Y(r11.A0G);
        }
        if (A0B(new String[]{"text"})) {
            r11.A0I = C86624Kv.A0Y(r11.A0I);
        }
        r11.A03 = Boolean.valueOf(A0B(new String[]{"location"}));
    }

    public final boolean A0B(String[] strArr) {
        List list = this.A04;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass367.A03(C86664Kz.A1F(it).A0B(), strArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C106985aV(RectF rectF, RectF rectF2, List list, int i) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A04 = list;
        this.A00 = i;
    }

    public static Matrix A00(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        float f6;
        float f7;
        float f8;
        Matrix A05 = AnonymousClass002.A05();
        int i = ((f3 % 180.0f) > 90.0f ? 1 : ((f3 % 180.0f) == 90.0f ? 0 : -1));
        if (i == 0) {
            f6 = f2 / f4;
            f7 = f / f5;
        } else {
            float f9 = f2 / f5;
            f6 = f / f4;
            f7 = f9;
        }
        A05.preScale(f6, f7);
        float f10 = 0.0f;
        if (z) {
            Matrix A052 = AnonymousClass002.A05();
            A052.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            A05.preConcat(A052);
            float f11 = f4;
            if (i == 0) {
                f11 = f5;
            }
            A05.preTranslate(-f11, 0.0f);
        }
        if (z2) {
            Matrix A053 = AnonymousClass002.A05();
            A053.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            A05.preConcat(A053);
            float f12 = f5;
            if (i == 0) {
                f12 = f4;
            }
            A05.preTranslate(-f12, 0.0f);
        }
        A05.preRotate(f3);
        if (f3 == 90.0f) {
            A05.preTranslate(0.0f, -f5);
        } else {
            if (f3 == 180.0f) {
                f8 = -f4;
                f10 = -f5;
            } else {
                f8 = -f4;
                if (f3 != 270.0f) {
                    if (f3 != 0.0f) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            A05.preTranslate(f8, f10);
            return A05;
        }
        return A05;
    }

    public static C106985aV A02(Context context, C620733j r1, AnonymousClass5Y0 r2, AnonymousClass33O r3, File file) {
        try {
            return A01(context, r1, r2, r3, file);
        } catch (IOException e) {
            Log.e("Doodle/safeLoad could not load doodle from file", e);
            return null;
        }
    }

    public String A04() {
        C156767hA r5;
        JSONObject jSONObject;
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("version", 1);
            RectF rectF = this.A02;
            A1G.put("l", (int) (rectF.left * 100.0f));
            A1G.put("t", (int) (rectF.top * 100.0f));
            A1G.put("r", (int) (rectF.right * 100.0f));
            A1G.put("b", (int) (rectF.bottom * 100.0f));
            RectF rectF2 = this.A01;
            A1G.put("crop-l", (int) (rectF2.left * 100.0f));
            A1G.put("crop-t", (int) (rectF2.top * 100.0f));
            A1G.put("crop-r", (int) (rectF2.right * 100.0f));
            A1G.put("crop-b", (int) (rectF2.bottom * 100.0f));
            A1G.put("rotate", this.A00);
            List list = this.A04;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r5 = null;
                    break;
                }
                C105425Uw A1F = C86664Kz.A1F(it);
                if ((A1F instanceof C95954vE) && (r5 = ((C95954vE) A1F).A04) != null) {
                    break;
                }
            }
            if (r5 != null) {
                if (r5.A03 == null) {
                    jSONObject = null;
                } else {
                    jSONObject = AnonymousClass0x9.A1G();
                    jSONObject.put("origin-width", r5.A01);
                    jSONObject.put("origin-height", r5.A00);
                    jSONObject.put("small-bitmap", C107245ax.A07(r5.A03));
                }
                A1G.put("blurred-bitmap-provider", jSONObject);
            }
            JSONArray A1F2 = AnonymousClass0x9.A1F();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C105425Uw A1F3 = C86664Kz.A1F(it2);
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                A1F3.A0P(A1G2);
                A1F2.put(A1G2);
            }
            A1G.put("shapes", A1F2);
            return A1G.toString();
        } catch (JSONException e) {
            Log.e("Doodle/toJson error while constructing JSON", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        r2 = (X.C95984vH) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A05(float r21, float r22) {
        /*
            r20 = this;
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r4 = r20
            java.util.List r0 = r4.A04
            java.util.Iterator r3 = r0.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.C184488ru
            if (r0 == 0) goto L_0x000c
            r2.add(r1)
            goto L_0x000c
        L_0x001e:
            boolean r0 = r2.isEmpty()
            r9 = 0
            if (r0 != 0) goto L_0x00a3
            int r0 = r4.A00
            float r12 = (float) r0
            android.graphics.RectF r4 = r4.A01
            float r13 = r4.width()
            float r14 = r4.height()
            r15 = 0
            r10 = r21
            r11 = r22
            r16 = r15
            android.graphics.Matrix r6 = A00(r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r2.iterator()
        L_0x0045:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r3 = r8.next()
            X.8ru r3 = (X.C184488ru) r3
            android.graphics.PointF r0 = X.AnonymousClass4L0.A08(r10, r11)
            com.whatsapp.SerializablePoint[] r16 = r3.BEG(r6, r0, r4)
            boolean r0 = r3 instanceof X.AnonymousClass4vJ
            if (r0 == 0) goto L_0x0079
            r7 = r3
            X.4vJ r7 = (X.AnonymousClass4vJ) r7
            boolean r19 = r3.BpN()
            double r2 = r7.A00
            double r0 = r7.A01
            java.lang.String r7 = r7.A06
            com.whatsapp.InteractiveAnnotation r12 = new com.whatsapp.InteractiveAnnotation
            r13 = r7
            r14 = r16
            r15 = r2
            r17 = r0
            r12.<init>(r13, r14, r15, r17, r19)
        L_0x0075:
            r5.add(r12)
            goto L_0x0045
        L_0x0079:
            boolean r0 = r3 instanceof X.C95984vH
            if (r0 == 0) goto L_0x0045
            r2 = r3
            X.4vH r2 = (X.C95984vH) r2
            java.lang.String r1 = r2.A02
            X.5Yx r0 = X.C95804uY.A03
            X.4uY r13 = r0.A01(r1)
            if (r13 == 0) goto L_0x0045
            boolean r18 = r3.BpN()
            int r0 = r2.A00
            java.lang.String r15 = r2.A03
            X.21p r14 = r2.A01
            com.whatsapp.InteractiveAnnotation r12 = new com.whatsapp.InteractiveAnnotation
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L_0x0075
        L_0x009c:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00a3
            return r5
        L_0x00a3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106985aV.A05(float, float):java.util.List");
    }

    public void A08(Bitmap bitmap, Canvas canvas, int i, boolean z, boolean z2) {
        RectF rectF = this.A02;
        canvas.concat(A00((float) bitmap.getWidth(), (float) bitmap.getHeight(), (float) i, rectF.width(), rectF.height(), z, z2));
    }

    public boolean A0A(File file) {
        FileWriter fileWriter;
        String A042 = A04();
        if (A042 == null) {
            return false;
        }
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(A042);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            Log.e("Doodle/save failed to save doodle string to file", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
