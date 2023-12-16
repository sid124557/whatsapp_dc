package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.30E  reason: invalid class name */
public final class AnonymousClass30E {
    public final C69263Wi A00;
    public final WfalManager A01;
    public final AnonymousClass4FS A02;
    public final AnonymousClass5Q7 A03;
    public final AnonymousClass2MW A04;
    public final C55542qW A05;
    public final C29121iJ A06;
    public final C59462wx A07;
    public final AnonymousClass2IV A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final C183538qC A0C;
    public final C183538qC A0D;
    public final Map A0E;

    public final SpannableStringBuilder A01(Context context, C624134x r4, int i, int i2) {
        C162457s7.A0J(context, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (A05(AnonymousClass223.FACEBOOK, r4)) {
            spannableStringBuilder.append(A00(context, i, R.drawable.ic_settings_fb, i2));
        }
        if (A05(AnonymousClass223.INSTAGRAM, r4)) {
            spannableStringBuilder.append(A00(context, i, R.drawable.ic_settings_ig, i2));
        }
        return spannableStringBuilder;
    }

    public final void A03(Context context, AnonymousClass223 r13, String str, List list, int i) {
        C18260x0.A0a(list, r13, str, 2);
        int i2 = i;
        AnonymousClass356.A01(AnonymousClass000.A0Y("Crossposting invoked from entrypoint: ", AnonymousClass001.A0o(), i2));
        Context context2 = context;
        C46842cI r4 = new C46842cI(context2, r13, this, str, list, i2);
        AnonymousClass2MW r3 = this.A04;
        WfalManager wfalManager = r3.A00;
        if (!wfalManager.A02()) {
            return;
        }
        if (wfalManager.A01(r13) == null || AnonymousClass0x9.A1Q(AnonymousClass0x9.A0c(wfalManager.A06).A02())) {
            r3.A01.A01(context, AnonymousClass21A.WA_CROSSPOST_NEW_STATUS, new AnonymousClass3EU(r4), r13);
            return;
        }
        r4.A00();
    }

    public final boolean A05(AnonymousClass223 r6, C624134x r7) {
        Integer A012;
        C162457s7.A0J(r6, 1);
        AnonymousClass2IV r0 = this.A08;
        long j = r7.A1L;
        C56012rH r4 = r0.A00;
        if (r4.A05(r6, j)) {
            if (!r4.A02) {
                Log.e("[WAFFLE] WaffleStatusCrosspostStateCache/getNonBlocking cache not initialized");
            } else {
                synchronized (r4.A00) {
                    A012 = r4.A01(r6, j);
                }
                if (A012 == null || 3 != A012.intValue()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final C111145hc A02() {
        return (C111145hc) AnonymousClass001.A0i(this.A0E, 551499239);
    }

    public AnonymousClass30E(C69263Wi r8, WfalManager wfalManager, AnonymousClass4FS r10, AnonymousClass5Q7 r11, AnonymousClass2MW r12, C55542qW r13, C29121iJ r14, C59462wx r15, AnonymousClass2IV r16, C183538qC r17, C183538qC r18, C183538qC r19, C183538qC r20, C183538qC r21, Map map) {
        C18260x0.A0f(r8, r10, wfalManager, r11, r14);
        C183538qC r3 = r18;
        C183538qC r4 = r17;
        AnonymousClass0x2.A1B(r4, r3);
        C162457s7.A0J(r13, 9);
        C183538qC r1 = r21;
        C183538qC r2 = r20;
        C183538qC r5 = r19;
        C18270x1.A15(r5, r2, r1, 11);
        Map map2 = map;
        C162457s7.A0J(map2, 15);
        this.A00 = r8;
        this.A02 = r10;
        this.A01 = wfalManager;
        this.A03 = r11;
        this.A06 = r14;
        this.A07 = r15;
        this.A09 = r4;
        this.A0D = r3;
        this.A05 = r13;
        this.A04 = r12;
        this.A0C = r5;
        this.A08 = r16;
        this.A0A = r2;
        this.A0B = r1;
        this.A0E = map2;
    }

    public static final SpannableStringBuilder A00(Context context, int i, int i2, int i3) {
        Drawable A002 = AnonymousClass0RP.A00(context, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (A002 != null) {
            spannableStringBuilder.append(' ').append(' ');
            A002.setBounds(0, 0, i, i);
            A002.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
            spannableStringBuilder.setSpan(new C87044Mw(A002), 1, 2, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.util.List r8, java.util.List r9, int r10) {
        /*
            r7 = this;
            X.5hc r3 = r7.A02()
            if (r3 == 0) goto L_0x00e9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            if (r0 == 0) goto L_0x0083
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x004b
            java.lang.String r2 = "auto_xpost_status_creation_share_view"
        L_0x0015:
            java.lang.String r1 = "INIT_CROSSPOST"
            r0 = 551499239(0x20df35e7, float:3.781334E-19)
            r3.A02(r0, r2, r1)
            java.lang.String r0 = "entrypoint"
            r3.A06(r0, r2)
            java.util.Iterator r2 = r8.iterator()
        L_0x0026:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = r2.next()
            X.223 r1 = (X.AnonymousClass223) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            java.lang.String r1 = r1.iqValue
            java.lang.String r0 = "FB"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0048
            java.lang.String r1 = "is_destination_fb"
        L_0x0042:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A06(r1, r0)
            goto L_0x0026
        L_0x0048:
            java.lang.String r1 = "is_destination_ig"
            goto L_0x0042
        L_0x004b:
            r0 = 2
            if (r1 != r0) goto L_0x0051
            java.lang.String r2 = "auto_xpost_status_creation_audience_selector_view"
            goto L_0x0015
        L_0x0051:
            r0 = 3
            if (r1 != r0) goto L_0x0057
            java.lang.String r2 = "contextual_share_icon"
            goto L_0x0015
        L_0x0057:
            r0 = 4
            if (r1 != r0) goto L_0x005e
            java.lang.String r2 = "status_list_single_status_share_menu"
            goto L_0x0015
        L_0x005e:
            r0 = 5
            if (r1 != r0) goto L_0x0065
            java.lang.String r2 = "status_list_single_status_long_press_share_menu"
            goto L_0x0015
        L_0x0065:
            r0 = 6
            if (r1 != r0) goto L_0x006c
            java.lang.String r2 = "status_list_multiple_statuses_share_menu"
            goto L_0x0015
        L_0x006c:
            r0 = 7
            if (r1 != r0) goto L_0x0073
            java.lang.String r2 = "status_detail_top_share_menu"
            goto L_0x0015
        L_0x0073:
            r0 = 8
            if (r1 != r0) goto L_0x007b
            java.lang.String r2 = "status_detail_overlay_app_icon"
            goto L_0x0015
        L_0x007b:
            r0 = 10
            if (r1 != r0) goto L_0x0083
            java.lang.String r2 = "xpost_retry"
            goto L_0x0015
        L_0x0083:
            java.lang.String r2 = "other"
            goto L_0x0015
        L_0x0087:
            java.lang.String r6 = "status_id_to_type_map"
            java.util.LinkedHashMap r5 = X.C18320x8.A0r()
            java.util.Iterator r4 = r9.iterator()
        L_0x0092:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00bf
            X.34x r1 = X.C18300x5.A0T(r4)
            java.lang.String r2 = X.AnonymousClass2z0.A06(r1)
            boolean r0 = r1 instanceof X.C30481mW
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = "text"
        L_0x00a7:
            r5.put(r2, r0)
            goto L_0x0092
        L_0x00ab:
            byte r1 = r1.A1I
            r0 = 1
            if (r1 != r0) goto L_0x00b4
            java.lang.String r0 = "photo"
            goto L_0x00a7
        L_0x00b4:
            r0 = 3
            if (r1 != r0) goto L_0x00bb
            java.lang.String r0 = "video"
            goto L_0x00a7
        L_0x00bb:
            java.lang.String r0 = "other"
            goto L_0x00a7
        L_0x00bf:
            java.util.Map r0 = X.C73813g7.A0D(r5)
            java.lang.String r0 = X.C18280x3.A0d(r0)
            X.C162457s7.A0D(r0)
            r3.A06(r6, r0)
            com.whatsapp.bridge.wfal.WfalManager r0 = r7.A01
            X.2ye r2 = r0.A00()
            boolean r0 = r2.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_auto_crosspost_setting_fb"
            r3.A06(r0, r1)
            boolean r0 = r2.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_auto_crosspost_setting_ig"
            r3.A06(r0, r1)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30E.A04(java.util.List, java.util.List, int):void");
    }
}
