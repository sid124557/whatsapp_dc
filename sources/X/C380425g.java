package X;

import android.content.SharedPreferences;

/* renamed from: X.25g  reason: invalid class name and case insensitive filesystem */
public class C380425g {
    public static int A00(AnonymousClass33p r1, int i) {
        SharedPreferences A0F;
        String str;
        int i2;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            A0F = AnonymousClass0x2.A0F(r1);
            str = "autodownload_wifi_mask";
            i2 = 15;
        } else if (i == 2) {
            A0F = AnonymousClass0x2.A0F(r1);
            str = "autodownload_cellular_mask";
            i2 = 1;
        } else if (i == 3) {
            A0F = AnonymousClass0x2.A0F(r1);
            str = "autodownload_roaming_mask";
            i2 = 0;
        } else {
            throw AnonymousClass001.A0c("network_type not valid");
        }
        return A0F.getInt(str, i2);
    }
}
