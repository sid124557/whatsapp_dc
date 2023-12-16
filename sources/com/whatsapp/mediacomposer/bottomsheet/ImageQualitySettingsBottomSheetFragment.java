package com.whatsapp.mediacomposer.bottomsheet;

import X.AnonymousClass2OS;
import X.AnonymousClass3Z6;
import X.AnonymousClass5YF;
import X.AnonymousClass7YH;
import X.C182648ol;
import X.C18310x6;
import X.C55682qk;
import X.C73813g7;
import com.whatsapp.R;
import java.util.SortedMap;
import java.util.TreeMap;

public final class ImageQualitySettingsBottomSheetFragment extends Hilt_ImageQualitySettingsBottomSheetFragment {
    public C55682qk A00;
    public AnonymousClass2OS A01;
    public final AnonymousClass5YF A02;
    public final C182648ol A03;
    public final SortedMap A04;

    public ImageQualitySettingsBottomSheetFragment(AnonymousClass5YF r7, C182648ol r8, Integer num) {
        super(r8, C18310x6.A06(num));
        this.A03 = r8;
        this.A02 = r7;
        AnonymousClass3Z6[] r3 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A09(Integer.valueOf(R.id.media_quality_default), new AnonymousClass7YH(0, R.string.f11nameremoved), r3, 0);
        AnonymousClass3Z6.A05(Integer.valueOf(R.id.media_quality_hd), new AnonymousClass7YH(3, R.string.f11nameremoved), r3);
        TreeMap treeMap = new TreeMap();
        C73813g7.A0H(treeMap, r3);
        this.A04 = treeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 == 270) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            super.A0w(r5, r6)
            X.5YF r2 = r4.A02     // Catch:{ FileNotFoundException -> 0x002f }
            int r1 = r2.A01()     // Catch:{ FileNotFoundException -> 0x002f }
            r0 = 90
            if (r1 == r0) goto L_0x001a
            int r1 = r2.A01()     // Catch:{ FileNotFoundException -> 0x002f }
            r0 = 270(0x10e, float:3.78E-43)
            r2 = 0
            if (r1 != r0) goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            X.4FS r1 = r4.A06     // Catch:{ FileNotFoundException -> 0x002f }
            if (r1 == 0) goto L_0x0028
            X.5sH r0 = new X.5sH     // Catch:{ FileNotFoundException -> 0x002f }
            r0.<init>(r4, r2)     // Catch:{ FileNotFoundException -> 0x002f }
            r1.BkM(r0)     // Catch:{ FileNotFoundException -> 0x002f }
            goto L_0x003e
        L_0x0028:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ FileNotFoundException -> 0x002f }
            throw r0     // Catch:{ FileNotFoundException -> 0x002f }
        L_0x002f:
            r0 = move-exception
            X.2qk r3 = r4.A00
            if (r3 == 0) goto L_0x0064
            java.lang.String r2 = r0.getMessage()
            r1 = 1
            java.lang.String r0 = "ImageQualitySettingsBottomSheetFragment/getSubtitles/getTargetResolution/FileNotFoundException"
            r3.A0A(r0, r1, r2)
        L_0x003e:
            X.1VX r1 = r4.A04
            if (r1 == 0) goto L_0x005f
            r0 = 4039(0xfc7, float:5.66E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0057
            X.4FS r2 = r4.A06
            if (r2 == 0) goto L_0x0058
            r1 = 3
            X.3Zn r0 = new X.3Zn
            r0.<init>(r4, r1)
            r2.BkM(r0)
        L_0x0057:
            return
        L_0x0058:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x005f:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0064:
            java.lang.String r0 = "crashLogs"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment.A0w(android.os.Bundle, android.view.View):void");
    }
}
