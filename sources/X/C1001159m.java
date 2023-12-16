package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.59m  reason: invalid class name and case insensitive filesystem */
public class C1001159m {
    public static void A00(Context context, View view, C05650Ui r6, String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -2137403731:
                    if (str.equals("Header")) {
                        c = 0;
                        break;
                    }
                    break;
                case -565577257:
                    if (str.equals("Image Button")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2368538:
                    if (str.equals("Link")) {
                        c = 2;
                        break;
                    }
                    break;
                case 70760763:
                    if (str.equals("Image")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109450440:
                    if (str.equals("Tab Bar")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1404906583:
                    if (str.equals("Selected Button")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2001146706:
                    if (str.equals("Button")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            String str2 = "android.widget.Button";
            switch (c) {
                case 0:
                    r6.A0I(true);
                    if (view != null) {
                        C06560Yg.A0T(view, true);
                        return;
                    }
                    return;
                case 1:
                case 6:
                    break;
                case 2:
                    r6.A01.setClassName(str2);
                    r6.A0C(context.getString(C02450Gf.accessibility_link_role));
                    return;
                case 3:
                    r6.A01.setClassName("android.widget.ImageView");
                    r6.A08(C06220Ws.A0e);
                    return;
                case 4:
                    str2 = "android.widget.TabWidget";
                    break;
                case 5:
                    AccessibilityNodeInfo accessibilityNodeInfo = r6.A01;
                    accessibilityNodeInfo.setClassName(str2);
                    accessibilityNodeInfo.setSelected(true);
                    return;
                default:
                    return;
            }
            r6.A01.setClassName(str2);
        }
    }
}
