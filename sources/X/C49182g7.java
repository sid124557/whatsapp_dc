package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2g7  reason: invalid class name and case insensitive filesystem */
public class C49182g7 {
    public final C85244Fm A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass33X A02;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            X.33X r5 = r9.A02
            r8 = 0
            X.2qt r4 = r5.A05
            X.34e r7 = r4.A02()
            if (r7 == 0) goto L_0x0015
            r3 = 3
            if (r11 != 0) goto L_0x001b
            int r1 = r7.A00
            if (r1 == r3) goto L_0x001b
            r0 = 4
            if (r1 == r0) goto L_0x001b
        L_0x0015:
            java.lang.String r0 = "UserNoticeLinkActionHandler/handleOpenModal/no modal"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001b:
            int r2 = r7.A01
            X.1VX r6 = r5.A03
            boolean r0 = X.AnonymousClass31f.A00(r6, r2)
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UserNoticeManager/getModal/green alert disabled, notice: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
        L_0x002f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0015
        L_0x0033:
            X.34m r0 = r5.A04
            X.2nY r1 = r0.A03(r7)
            if (r1 == 0) goto L_0x0015
            r2 = 1
            if (r11 != 0) goto L_0x0053
            int r0 = r7.A00
            if (r0 == r3) goto L_0x0053
            X.1kU r3 = r1.A03
            if (r3 != 0) goto L_0x0061
            java.lang.String r0 = "UserNoticeManager/getModal/no content for stage 4"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2qk r1 = r5.A00
            java.lang.String r0 = "UserNoticeManager/getModal/blockingModal/noContent"
        L_0x004f:
            r1.A0A(r0, r2, r8)
            goto L_0x0015
        L_0x0053:
            X.1kU r3 = r1.A04
            if (r3 != 0) goto L_0x006c
            java.lang.String r0 = "UserNoticeManager/getModal/no content for stage 3"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2qk r1 = r5.A00
            java.lang.String r0 = "UserNoticeManager/getModal/modal/noContent"
            goto L_0x004f
        L_0x0061:
            X.2zs r1 = r3.A00
            boolean r0 = r5.A0B(r1)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "UserNoticeManager/getModal/blocking modal not shown as per timing"
            goto L_0x002f
        L_0x006c:
            if (r11 != 0) goto L_0x008f
            X.2zs r1 = r3.A00
            boolean r0 = r5.A0B(r1)
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "UserNoticeManager/getModal/modal not shown as per timing"
            goto L_0x002f
        L_0x0079:
            boolean r0 = X.AnonymousClass31f.A01(r6, r7)
            r5.A09(r1, r0)
            java.lang.String r0 = "UserNoticeManager/getModal/has blocking modal"
            goto L_0x008c
        L_0x0083:
            boolean r0 = X.AnonymousClass31f.A01(r6, r7)
            r5.A09(r1, r0)
            java.lang.String r0 = "UserNoticeManager/getModal/has modal"
        L_0x008c:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x008f:
            X.34e r0 = r4.A02()
            if (r0 == 0) goto L_0x00be
            X.1VX r1 = r9.A01
            X.34e r0 = r4.A02()
            boolean r0 = X.AnonymousClass31f.A01(r1, r0)
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "GreenAlert/launchModal"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "com.whatsapp.greenalert.GreenAlertActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "page"
            r2.putExtra(r0, r3)
            r10.startActivity(r2)
            return
        L_0x00be:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r1 = "icon_light_url"
            java.lang.String r0 = r3.A06
            r2.putString(r1, r0)
            java.lang.String r1 = "icon_dark_url"
            java.lang.String r0 = r3.A05
            r2.putString(r1, r0)
            java.lang.String r1 = "icon_description"
            java.lang.String r0 = r3.A04
            r2.putString(r1, r0)
            java.lang.String r1 = "title"
            java.lang.String r0 = r3.A07
            r2.putString(r1, r0)
            java.util.List r5 = r3.A08
            int r1 = r5.size()
            java.lang.String r0 = "bullets_size"
            r2.putInt(r0, r1)
            r4 = 0
        L_0x00eb:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x0127
            java.lang.Object r6 = r5.get(r4)
            X.5SH r6 = (X.AnonymousClass5SH) r6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bullet_text_"
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r4)
            java.lang.String r0 = r6.A02
            r2.putString(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bullet_icon_light_url_"
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r4)
            java.lang.String r0 = r6.A01
            r2.putString(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bullet_icon_dark_url_"
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r4)
            java.lang.String r0 = r6.A00
            r2.putString(r1, r0)
            int r4 = r4 + 1
            goto L_0x00eb
        L_0x0127:
            java.lang.String r1 = "agree_button_text"
            java.lang.String r0 = r3.A01
            r2.putString(r1, r0)
            X.2zs r6 = r3.A00
            X.5RT r0 = r6.A02
            if (r0 == 0) goto L_0x013c
            java.lang.String r4 = "start_time_millis"
            long r0 = r0.A00
            r2.putLong(r4, r0)
        L_0x013c:
            X.5Rt r5 = r6.A00
            if (r5 == 0) goto L_0x014e
            java.lang.String r4 = "duration_static"
            long r0 = r5.A00
            r2.putLong(r4, r0)
            long[] r1 = r5.A01
            java.lang.String r0 = "duration_repeat"
            r2.putLongArray(r0, r1)
        L_0x014e:
            X.5RT r0 = r6.A01
            if (r0 == 0) goto L_0x0159
            java.lang.String r4 = "end_time_millis"
            long r0 = r0.A00
            r2.putLong(r4, r0)
        L_0x0159:
            java.lang.String r1 = "body"
            java.lang.String r0 = r3.A02
            r2.putString(r1, r0)
            java.lang.String r1 = "footer"
            java.lang.String r0 = r3.A04
            r2.putString(r1, r0)
            java.lang.String r1 = "dismiss_button_text"
            java.lang.String r0 = r3.A03
            r2.putString(r1, r0)
            X.6x8 r0 = r3.A02
            if (r0 == 0) goto L_0x0179
            java.lang.String r1 = r0.id
            java.lang.String r0 = "icon_role"
            r2.putString(r0, r1)
        L_0x0179:
            X.6x9 r0 = r3.A03
            if (r0 == 0) goto L_0x0184
            java.lang.String r1 = r0.id
            java.lang.String r0 = "icon_style"
            r2.putString(r0, r1)
        L_0x0184:
            java.lang.String r1 = "light_icon_path"
            java.io.File r0 = r3.A01
            if (r0 == 0) goto L_0x0191
            java.lang.String r0 = r0.getAbsolutePath()
            r2.putString(r1, r0)
        L_0x0191:
            java.lang.String r1 = "dark_icon_path"
            java.io.File r0 = r3.A00
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r0.getAbsolutePath()
            r2.putString(r1, r0)
        L_0x019e:
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r1 = new com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment
            r1.<init>()
            r1.A0u(r2)
            java.lang.Class<X.4ea> r0 = X.C89654ea.class
            android.app.Activity r0 = X.C111095hX.A03(r10, r0)
            X.4ea r0 = (X.C89654ea) r0
            r0.Boo(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49182g7.A01(android.content.Context, boolean):void");
    }

    public C49182g7(C85244Fm r1, AnonymousClass1VX r2, AnonymousClass33X r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A00(Context context, String str, Map map) {
        String str2;
        if (!str.equals("open-modal")) {
            if (!str.equals("open-link")) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("UserNoticeLinkActionHandler/handleAction unknown action: ");
                A0o.append(str);
                str2 = AnonymousClass000.A0P(map, " with params: ", A0o);
            } else {
                String A0o2 = C18310x6.A0o("link", map);
                if (A0o2 == null) {
                    str2 = "UserNoticeLinkActionHandler/handleOpenLink null url";
                } else {
                    this.A00.BkW(context, Uri.parse(A0o2), (C624134x) null);
                    return;
                }
            }
            Log.e(str2);
            return;
        }
        A01(context, false);
    }
}
