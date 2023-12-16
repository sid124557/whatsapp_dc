package com.whatsapp.payments.pix.ui;

import X.C162457s7;
import X.C203499no;
import X.C620633i;
import X.C620733j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class FoundPixQrCodeBottomSheet extends Hilt_FoundPixQrCodeBottomSheet {
    public C620633i A00;
    public C620733j A01;
    public C203499no A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r10, android.view.View r11) {
        /*
            r9 = this;
            r6 = 0
            X.C162457s7.A0J(r11, r6)
            super.A0w(r10, r11)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r7 = 0
            android.os.Bundle r2 = r9.A06
            if (r1 < r0) goto L_0x005d
            if (r2 == 0) goto L_0x0066
            java.lang.String r1 = "bundle_key_pix_qrcode"
            java.lang.Class<X.7yV> r0 = X.C166327yV.class
            java.lang.Object r8 = r2.getParcelable(r1, r0)
        L_0x001a:
            X.7yV r8 = (X.C166327yV) r8
        L_0x001c:
            android.os.Bundle r1 = r9.A06
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "referral_screen"
            java.lang.String r5 = r1.getString(r0)
        L_0x0026:
            if (r8 == 0) goto L_0x00ce
            r0 = 2131432462(0x7f0b140e, float:1.8486682E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r11, r0)
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x00c7
            r1.setText(r0)
            r0 = 2131432460(0x7f0b140c, float:1.8486678E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r11, r0)
            java.lang.String r0 = r8.A00
            r1.setText(r0)
            r0 = 2131427708(0x7f0b017c, float:1.847704E38)
            android.view.View r4 = X.C18280x3.A0E(r11, r0)
            java.lang.String r0 = r8.A09
            if (r0 == 0) goto L_0x0090
            boolean r0 = X.C175738Zn.A0V(r0)
            if (r0 != 0) goto L_0x0090
            r0 = 2131427709(0x7f0b017d, float:1.8477042E38)
            android.widget.TextView r3 = X.AnonymousClass0x2.A0I(r11, r0)
            goto L_0x0068
        L_0x005b:
            r5 = r7
            goto L_0x0026
        L_0x005d:
            if (r2 == 0) goto L_0x0066
            java.lang.String r0 = "bundle_key_pix_qrcode"
            android.os.Parcelable r8 = r2.getParcelable(r0)
            goto L_0x001a
        L_0x0066:
            r8 = r7
            goto L_0x001c
        L_0x0068:
            java.lang.String r0 = r8.A09     // Catch:{ NumberFormatException -> 0x0096 }
            X.C626936e.A06(r0)     // Catch:{ NumberFormatException -> 0x0096 }
            X.C162457s7.A0D(r0)     // Catch:{ NumberFormatException -> 0x0096 }
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0096 }
            r1.<init>(r0)     // Catch:{ NumberFormatException -> 0x0096 }
            r0 = 2
            X.39Q r2 = new X.39Q     // Catch:{ NumberFormatException -> 0x0096 }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x0096 }
            X.4Fi r1 = X.AnonymousClass1S3.A04     // Catch:{ NumberFormatException -> 0x0096 }
            X.33j r0 = r9.A01     // Catch:{ NumberFormatException -> 0x0096 }
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = r1.B3V(r0, r2)     // Catch:{ NumberFormatException -> 0x0096 }
            r3.setText(r0)     // Catch:{ NumberFormatException -> 0x0096 }
            goto L_0x00a0
        L_0x0089:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ NumberFormatException -> 0x0096 }
            throw r0     // Catch:{ NumberFormatException -> 0x0096 }
        L_0x0090:
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x00a3
        L_0x0096:
            java.lang.String r0 = "Unable to format the Amount data, showing raw value"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = r8.A09
            r3.setText(r0)
        L_0x00a0:
            r4.setVisibility(r6)
        L_0x00a3:
            r0 = 2131428354(0x7f0b0402, float:1.847835E38)
            android.view.View r1 = X.C06560Yg.A02(r11, r0)
            X.918 r0 = new X.918
            r0.<init>(r8, r9, r5, r6)
            r1.setOnClickListener(r0)
            X.9no r2 = r9.A02
            if (r2 == 0) goto L_0x00c0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "pix_qr_code_found_prompt"
            r2.BKB(r1, r7, r0, r5)
            return
        L_0x00c0:
            java.lang.String r0 = "paymentUIEventLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00c7:
            java.lang.String r0 = "payeeName"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ce:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unable to read "
            r1.append(r0)
            java.lang.Class<X.7yV> r0 = X.C166327yV.class
            X.AnonymousClass6C9.A0y(r0, r1)
            java.lang.String r0 = " from bundle"
            X.C18260x0.A1K(r1, r0)
            r9.A1K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet.A0w(android.os.Bundle, android.view.View):void");
    }
}
