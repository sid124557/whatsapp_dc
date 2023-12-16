package X;

import java.util.List;

/* renamed from: X.2x7  reason: invalid class name and case insensitive filesystem */
public class C59562x7 {
    public final C56972sr A00;
    public final C54292oU A01;
    public final C620733j A02;
    public final C34171uL A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
        if (r9 > 18000000) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.List r8, long r9, boolean r11) {
        /*
            r7 = this;
            r6 = 2
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "DisclosureCmsDownloader/fetchDisclosures no disclosure ids to create uri"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x000d:
            X.2sr r0 = r7.A00
            com.whatsapp.Me r3 = X.C56972sr.A00(r0)
            if (r3 != 0) goto L_0x001f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DisclosureCmsDownloader/fetchDisclosures could not create uri for disclosure ids "
            X.C18260x0.A1Q(r1, r0, r8)
            return
        L_0x001f:
            android.net.Uri$Builder r1 = X.C18300x5.A0C()
            java.lang.String r0 = "whatsapp.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "user-notice"
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = "v2"
            android.net.Uri$Builder r2 = r1.appendPath(r0)
            java.lang.String r1 = "ids"
            java.lang.String r0 = A00(r8)
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r1, r0)
            X.33j r0 = r7.A02
            android.net.Uri$Builder r3 = X.C620733j.A00(r1, r3, r0)
            java.lang.String r2 = "img-size"
            X.2oU r0 = r7.A01
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r1 = r0.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x0096
            java.lang.String r0 = "hdpi"
        L_0x005a:
            android.net.Uri r5 = X.C18290x4.A0H(r3, r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DisclosureCmsDownloader/getDownloadUri/uri: "
            java.lang.String r0 = X.C18300x5.A0k(r5, r0, r1)
            X.C18260x0.A1J(r1, r0)
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            r1 = 18000000(0x112a880, double:8.8931816E-317)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0079
        L_0x0078:
            r9 = r1
        L_0x0079:
            X.0Q9 r4 = new X.0Q9
            r4.<init>()
            java.lang.String r3 = "disclosure_ids"
            int r0 = r8.size()
            int[] r2 = new int[r0]
            r1 = 0
        L_0x0087:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x009a
            int r0 = X.AnonymousClass000.A09(r8, r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0087
        L_0x0096:
            java.lang.String r0 = "xxhdpi"
            goto L_0x005a
        L_0x009a:
            r4.A02(r3, r2)
            java.lang.String r0 = "handler"
            r4.A01(r0, r6)
            java.lang.String r2 = "url"
            java.lang.String r1 = r5.toString()
            java.util.Map r0 = r4.A00
            r0.put(r2, r1)
            X.0Xq r6 = r4.A00()
            X.0XS r5 = X.C18270x1.A07()
            java.lang.Class<com.whatsapp.privacy.protocol.http.DisclosureContentWorker> r0 = com.whatsapp.privacy.protocol.http.DisclosureContentWorker.class
            X.0Aw r4 = new X.0Aw
            r4.<init>(r0)
            java.lang.String r0 = "tag.whatsapp.privacy.disclosure.content.fetch"
            r4.A06(r0)
            X.0FN r3 = X.AnonymousClass0FN.EXPONENTIAL
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.A03(r3, r2, r9)
            X.0Wv r0 = r4.A00
            r0.A0B = r6
            java.lang.Class<com.whatsapp.privacy.protocol.http.DisclosureIconsWorker> r0 = com.whatsapp.privacy.protocol.http.DisclosureIconsWorker.class
            X.0Aw r1 = new X.0Aw
            r1.<init>(r0)
            java.lang.String r0 = "tag.whatsapp.privacy.disclosure.icons.fetch"
            r1.A06(r0)
            r1.A03(r3, r2, r9)
            X.0Wv r0 = r1.A00
            r0.A0B = r6
            if (r11 == 0) goto L_0x0137
            X.0FO r0 = X.AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r4.A05(r0)
            r1.A05(r0)
        L_0x00ec:
            X.0Ay r4 = X.AnonymousClass0x9.A0I(r4)
            X.0Ay r3 = X.AnonymousClass0x9.A0I(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "tag.whatsapp.privacy.disclosure.content.fetch."
            r1.append(r0)
            java.lang.String r0 = A00(r8)
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DisclosureCmsDownloader/fetchDisclosures: worker name: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "disclosure ids: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", expedited: "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r11)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1uL r0 = r7.A03
            X.0Xb r1 = X.C72333dY.A01(r0)
            X.0Fs r0 = X.C02320Fs.REPLACE
            X.0XO r0 = r1.A03(r0, r4, r2)
            X.0XO r0 = r0.A03(r3)
            r0.A02()
            return
        L_0x0137:
            r4.A04(r5)
            r1.A04(r5)
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59562x7.A01(java.util.List, long, boolean):void");
    }

    public C59562x7(C56972sr r1, C54292oU r2, C620733j r3, C34171uL r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static final String A00(List list) {
        if (list.size() == 0) {
            return "";
        }
        String obj = C18290x4.A0k(list).toString();
        for (int i = 1; i < list.size(); i++) {
            StringBuilder A0l = AnonymousClass000.A0l(obj);
            C18320x8.A1K(A0l);
            AnonymousClass000.A1B(list.get(i), A0l);
            obj = A0l.toString();
        }
        return obj;
    }
}
