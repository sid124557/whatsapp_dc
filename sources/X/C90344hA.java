package X;

/* renamed from: X.4hA  reason: invalid class name and case insensitive filesystem */
public final class C90344hA extends C67163Of {
    public final AnonymousClass4AO A00;

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A02(org.json.JSONObject r10, long r11) {
        /*
            r9 = this;
            java.lang.String r4 = "options"
            java.lang.String r2 = "name"
            java.lang.String[] r1 = new java.lang.String[]{r2, r4}
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            java.util.Collections.addAll(r0, r1)
            boolean r0 = X.C57332tT.A02(r0, r10)
            if (r0 != 0) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            java.lang.String r2 = X.C57332tT.A00(r2, r10)
            if (r2 == 0) goto L_0x00f0
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            org.json.JSONArray r7 = r10.optJSONArray(r4)
            if (r7 == 0) goto L_0x00b0
            int r6 = r7.length()
            r5 = 0
        L_0x0030:
            if (r5 >= r6) goto L_0x00b5
            org.json.JSONObject r4 = r7.optJSONObject(r5)
            if (r4 == 0) goto L_0x006a
            java.lang.String r0 = "value"
            java.lang.String r8 = X.C57332tT.A00(r0, r4)
            if (r8 == 0) goto L_0x00ab
            java.lang.String r0 = "thumbnail_media"
            org.json.JSONObject r4 = r4.optJSONObject(r0)
            if (r4 == 0) goto L_0x009e
            X.4AO r0 = r9.A00
            java.lang.Object r0 = r0.Azj(r4, r11)
            X.5db r0 = (X.C108815db) r0
            if (r0 == 0) goto L_0x009e
            X.6ev r4 = new X.6ev
            r4.<init>(r0, r8)
        L_0x0057:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x006d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x006d
            boolean r0 = r4 instanceof X.C132236ev
            if (r0 == 0) goto L_0x006d
        L_0x0067:
            r3.add(r4)
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0030
        L_0x006d:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0081
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0081
            boolean r0 = r4 instanceof X.C132226eu
            if (r0 == 0) goto L_0x0081
        L_0x007d:
            r1.add(r4)
            goto L_0x006a
        L_0x0081:
            boolean r0 = X.AnonymousClass0x7.A1S(r3)
            if (r0 == 0) goto L_0x008b
            boolean r0 = r4 instanceof X.C132226eu
            if (r0 != 0) goto L_0x00a4
        L_0x008b:
            boolean r0 = X.AnonymousClass0x7.A1S(r1)
            if (r0 == 0) goto L_0x0095
            boolean r0 = r4 instanceof X.C132236ev
            if (r0 != 0) goto L_0x00a4
        L_0x0095:
            boolean r0 = r4 instanceof X.C132236ev
            if (r0 != 0) goto L_0x0067
            boolean r0 = r4 instanceof X.C132226eu
            if (r0 == 0) goto L_0x006a
            goto L_0x007d
        L_0x009e:
            X.6eu r4 = new X.6eu
            r4.<init>(r8)
            goto L_0x0057
        L_0x00a4:
            java.lang.String r0 = "Either all options should contain ProductImage or none of them should contain it"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00ab:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        L_0x00b0:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            goto L_0x00d3
        L_0x00b5:
            boolean r0 = X.AnonymousClass0x7.A1S(r3)
            if (r0 == 0) goto L_0x00c6
            boolean r0 = X.AnonymousClass0x7.A1S(r1)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "getOptions: both result candidates or not empty. Preceding logic should prevent such cases!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00c6:
            boolean r0 = X.AnonymousClass0x7.A1S(r3)
            if (r0 != 0) goto L_0x00d3
            boolean r0 = X.AnonymousClass0x7.A1S(r1)
            if (r0 == 0) goto L_0x00b0
            r3 = r1
        L_0x00d3:
            java.lang.Object r1 = X.C73723fy.A03(r3)
            boolean r0 = r1 instanceof X.C132226eu
            if (r0 == 0) goto L_0x00e1
            X.6es r0 = new X.6es
            r0.<init>(r2, r3)
            return r0
        L_0x00e1:
            boolean r0 = r1 instanceof X.C132236ev
            if (r0 == 0) goto L_0x00eb
            X.6et r0 = new X.6et
            r0.<init>(r2, r3)
            return r0
        L_0x00eb:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90344hA.A02(org.json.JSONObject, long):java.lang.Object");
    }

    public C90344hA(AnonymousClass4AO r1) {
        this.A00 = r1;
    }
}
