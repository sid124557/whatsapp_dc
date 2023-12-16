package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.5hl  reason: invalid class name and case insensitive filesystem */
public class C111235hl implements C184998st {
    public View A00;
    public final FrameLayout A01;
    public final C111095hX A02;
    public final C105675Vy A03;
    public final AnonymousClass33p A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;

    public void A00(int i) {
        AnonymousClass1Y2 r1 = new AnonymousClass1Y2();
        r1.A01 = 39;
        r1.A00 = Integer.valueOf(i);
        this.A06.BhD(r1);
    }

    public boolean A01() {
        if (this.A05.A0X(3283)) {
            C183538qC r3 = this.A04.A01;
            if (!C18300x5.A0B(r3).getBoolean("smb_enforcement_bottomsheet_shown", false) || !C18300x5.A0B(r3).getBoolean("should_show_smb_enforcement_banner", false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BFb() {
        C86604Kt.A1A(this.A00);
    }

    public boolean Bo4() {
        if (this.A05.A0X(2986)) {
            C183538qC r3 = this.A04.A01;
            if (!C18300x5.A0B(r3).getBoolean("smb_enforcement_bottomsheet_shown", false) || !C18300x5.A0B(r3).getBoolean("should_show_smb_enforcement_banner", false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C111235hl(FrameLayout frameLayout, C111095hX r2, C105675Vy r3, AnonymousClass33p r4, AnonymousClass1VX r5, AnonymousClass4FV r6) {
        this.A05 = r5;
        this.A06 = r6;
        this.A02 = r2;
        this.A01 = frameLayout;
        this.A04 = r4;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c5, code lost:
        if (r10 != null) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BrS() {
        /*
            r14 = this;
            boolean r0 = r14.Bo4()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r14.A01()
            if (r0 == 0) goto L_0x0022
        L_0x000c:
            android.view.View r0 = r14.A00
            if (r0 != 0) goto L_0x0022
            android.widget.FrameLayout r2 = r14.A01
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r2)
            r0 = 2131624716(0x7f0e030c, float:1.887662E38)
            android.view.View r0 = X.AnonymousClass001.A0R(r1, r2, r0)
            r14.A00 = r0
            r2.addView(r0)
        L_0x0022:
            android.widget.FrameLayout r9 = r14.A01
            android.content.Context r8 = r9.getContext()
            android.content.res.Resources r7 = r9.getResources()
            android.view.View r6 = r14.A00
            if (r6 != 0) goto L_0x003d
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r9)
            r0 = 2131624716(0x7f0e030c, float:1.887662E38)
            android.view.View r6 = X.AnonymousClass001.A0R(r1, r9, r0)
            r14.A00 = r6
        L_0x003d:
            android.content.Context r2 = r6.getContext()
            r1 = 2130968736(0x7f0400a0, float:1.7546134E38)
            r0 = 2131099812(0x7f0600a4, float:1.7811988E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            X.C86624Kv.A0l(r7, r6, r0)
            r0 = 2131427908(0x7f0b0244, float:1.8477446E38)
            android.widget.ImageView r1 = X.AnonymousClass0x9.A0E(r6, r0)
            r0 = 2131099813(0x7f0600a5, float:1.781199E38)
            android.content.res.ColorStateList r0 = X.AnonymousClass0Y8.A07(r8, r0)
            X.C06560Yg.A0C(r0, r1)
            r5 = 0
            r0 = 2131234293(0x7f080df5, float:1.8084748E38)
            android.graphics.drawable.Drawable r0 = X.C02680He.A00(r5, r7, r0)
            android.graphics.drawable.Drawable r0 = X.C06130Wj.A01(r0)
            r1.setImageDrawable(r0)
            r0 = 2131427916(0x7f0b024c, float:1.8477462E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r6, r0)
            r0 = 2131893868(0x7f121e6c, float:1.9422525E38)
            r1.setText(r0)
            r0 = 2131893867(0x7f121e6b, float:1.9422523E38)
            java.lang.String r0 = r8.getString(r0)
            android.text.SpannableStringBuilder r3 = X.C18330xA.A00(r0)
            r0 = 2131893869(0x7f121e6d, float:1.9422527E38)
            java.lang.String r0 = r8.getString(r0)
            android.text.SpannableString r10 = X.AnonymousClass4L0.A0A(r0)
            int r0 = X.C18290x4.A00(r8)
            android.text.style.ForegroundColorSpan r1 = X.C86634Kw.A0I(r8, r0)
            int r0 = r10.length()
            r4 = 0
            r2 = 33
            r10.setSpan(r1, r4, r0, r2)
            X.4N1 r1 = new X.4N1
            r1.<init>()
            int r0 = r10.length()
            r10.setSpan(r1, r4, r0, r2)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r3.append(r0)
            r0.append(r10)
            r0 = 2131427902(0x7f0b023e, float:1.8477433E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass0x7.A0K(r6, r0)
            r0.A0K(r5, r3)
            X.5Vy r3 = r14.A03
            X.33p r0 = r3.A00
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r1 = "smb_app_install_source"
            java.lang.String r0 = "unknown|unknown"
            java.lang.String r1 = r2.getString(r1, r0)
            X.C162457s7.A0D(r1)
            X.1VX r3 = r3.A01
            r0 = 2951(0xb87, float:4.135E-42)
            java.lang.String r0 = r3.A0Q(r0)
            android.net.Uri r13 = android.net.Uri.parse(r0)
            java.lang.String r12 = "biz_enforce_download_boost_post"
            boolean r0 = X.C175728Zm.A0S(r1, r12, r4)
            r2 = 2952(0xb88, float:4.137E-42)
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = r3.A0Q(r2)
            android.net.Uri r13 = android.net.Uri.parse(r0)
        L_0x00f3:
            r0 = 3283(0xcd3, float:4.6E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "|"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.C175728Zm.A0P(r1, r0, r4)
            java.lang.String[] r1 = X.AnonymousClass0x7.A1b(r0)
            int r0 = r1.length
            r10 = 1
            if (r0 == 0) goto L_0x01c9
            r1 = r1[r4]
            java.lang.String r0 = "biz_enforce_download_reminder"
            boolean r0 = X.C175728Zm.A0S(r1, r0, r4)
            if (r0 == 0) goto L_0x0177
            int r11 = r1.length()
            r0 = 29
            if (r11 <= r0) goto L_0x0177
            r0 = 30
        L_0x0121:
            java.lang.String r10 = r1.substring(r0)
            X.C162457s7.A0D(r10)
        L_0x0128:
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = r3.A0Q(r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "en_id"
            android.net.Uri r13 = X.C18290x4.A0H(r1, r0, r10)
        L_0x0140:
            X.C162457s7.A0H(r13)
            android.content.Intent r1 = X.C18310x6.A0D(r13)
            r0 = 4
            X.C109725f5.A00(r9, r14, r8, r1, r0)
            r1 = 2131100239(0x7f06024f, float:1.7812854E38)
            r0 = 2131231720(0x7f0803e8, float:1.8079529E38)
            android.graphics.drawable.Drawable r0 = X.C02680He.A00(r5, r7, r0)
            android.graphics.drawable.Drawable r2 = X.C06130Wj.A01(r0)
            int r0 = r7.getColor(r1)
            X.AnonymousClass0YG.A06(r2, r0)
            r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
            android.widget.ImageView r1 = X.AnonymousClass0x9.A0E(r6, r0)
            r1.setImageDrawable(r2)
            r0 = 11
            X.C18320x8.A15(r1, r14, r0)
            r6.setVisibility(r4)
            r0 = 1
            r14.A00(r0)
            return
        L_0x0177:
            boolean r0 = X.C175728Zm.A0S(r1, r12, r4)
            if (r0 == 0) goto L_0x0188
            int r11 = r1.length()
            r0 = 31
            if (r11 <= r0) goto L_0x0188
            r0 = 32
            goto L_0x0121
        L_0x0188:
            java.lang.String r0 = "biz_enforce_download_create"
            boolean r0 = X.C175728Zm.A0S(r1, r0, r4)
            if (r0 == 0) goto L_0x019b
            int r11 = r1.length()
            r0 = 27
            if (r11 <= r0) goto L_0x019b
            r0 = 28
            goto L_0x0121
        L_0x019b:
            java.lang.String r0 = "biz_enforce_download"
            boolean r0 = X.C175728Zm.A0S(r1, r0, r4)
            if (r0 == 0) goto L_0x01c9
            int r11 = r1.length()
            r0 = 20
            if (r11 <= r0) goto L_0x01c9
            java.util.List r0 = X.C105675Vy.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = "_"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r1 = X.C175728Zm.A0P(r1, r0, r4)
            int r0 = X.AnonymousClass002.A04(r1, r10)
            java.lang.String r10 = X.AnonymousClass001.A0n(r1, r0)
            if (r10 == 0) goto L_0x0140
            goto L_0x0128
        L_0x01c9:
            java.lang.String r10 = ""
            goto L_0x0128
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111235hl.BrS():void");
    }
}
