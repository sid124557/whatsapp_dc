package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2qi  reason: invalid class name and case insensitive filesystem */
public class C55662qi {
    public final C111095hX A00;
    public final AnonymousClass5X8 A01;
    public final AnonymousClass5ST A02;
    public final C620633i A03;
    public final C56612sH A04;
    public final C114635nM A05;
    public final AnonymousClass36Y A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass3LP A08;
    public final AnonymousClass4FV A09;
    public final C54702p9 A0A;
    public final C614030o A0B;
    public final C55312q9 A0C;
    public final C61242zw A0D;
    public final C53262mo A0E;
    public final C45082Yp A0F;
    public final C53552nH A0G;
    public final C69183Wa A0H;
    public final AnonymousClass4FS A0I;

    public void A00(Context context, TextEmojiLabel textEmojiLabel, C93314oJ r15, TemplateButtonListBottomSheet templateButtonListBottomSheet, C58932w3 r17, boolean z, boolean z2, boolean z3) {
        int A002;
        CharSequence A022;
        long parseLong;
        C58932w3 r8 = r17;
        Context context2 = context;
        if (C616831v.A02(this.A07, r8)) {
            A022 = r8.A08;
        } else {
            C614030o r4 = this.A0B;
            if (r4.A07(r8)) {
                A022 = Uri.parse(r8.A01).getQueryParameter("cta_display_name");
            } else {
                if (z2) {
                    A002 = R.color.f5nameremoved;
                } else {
                    A002 = C18290x4.A00(context);
                }
                if (!z) {
                    A002 = R.color.f5nameremoved;
                }
                int i = R.drawable.ic_link_action;
                if (r8.A06 == 3) {
                    i = R.drawable.ic_action_call;
                } else if (r4.A08(r8) || this.A0G.A02(r8)) {
                    i = R.drawable.ic_action_copy;
                }
                Drawable A042 = C107335b8.A04(context, i, A002);
                A042.setAlpha(204);
                if (z3) {
                    A022 = C87044Mw.A01(textEmojiLabel.getPaint(), A042, r8.A08);
                } else {
                    Resources resources = context.getResources();
                    int i2 = R.dimen.f6nameremoved;
                    if (z2) {
                        i2 = R.dimen.f6nameremoved;
                    }
                    int dimensionPixelSize = resources.getDimensionPixelSize(i2);
                    A022 = C87044Mw.A02(textEmojiLabel.getPaint(), A042, r8.A08, dimensionPixelSize, context.getResources().getInteger(R.integer.f7nameremoved));
                }
            }
        }
        textEmojiLabel.setText(A022);
        C614030o r3 = this.A0B;
        C93314oJ r9 = r15;
        if (r3.A07(r8)) {
            C624134x fMessage = r15.getFMessage();
            C162457s7.A0J(fMessage, 1);
            if (r8.A0A.get() == 1) {
                long A043 = C56612sH.A04(r3.A02, fMessage);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                String queryParameter = Uri.parse(r8.A01).getQueryParameter("code_expiration_minutes");
                if (queryParameter == null) {
                    parseLong = 10;
                } else {
                    parseLong = Long.parseLong(queryParameter);
                }
                if (A043 > timeUnit.toMillis(parseLong)) {
                    textEmojiLabel.setClickable(false);
                    AnonymousClass0x2.A0q(context, textEmojiLabel, R.color.f5nameremoved);
                    return;
                }
            }
        }
        textEmojiLabel.setClickable(true);
        AnonymousClass0x2.A0q(context, textEmojiLabel, C18290x4.A00(context));
        textEmojiLabel.setOnClickListener(new C635139n(this, context2, r8, r9, templateButtonListBottomSheet, 1));
    }

    public final void A01(Context context, C93314oJ r7, C624134x r8, C58932w3 r9) {
        String str;
        List list;
        this.A0F.A00(r8, "cta-url", String.valueOf(r9.A05));
        C614030o r2 = this.A0B;
        if (!r2.A08(r9) && !r2.A07(r9)) {
            C53552nH r3 = this.A0G;
            if (r3.A02(r9)) {
                Log.d("Coupon: copy code button clicked");
                AnonymousClass4FG r4 = (AnonymousClass4FG) r7.getFMessage();
                C162457s7.A0J(r4, 0);
                if (r3.A03.A0Y(C58422vE.A02, 3630) && (list = r4.BDY().A06) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C58932w3 r1 = (C58932w3) it.next();
                        C162457s7.A0H(r1);
                        if (r3.A02(r1)) {
                            if (r1 != null) {
                                str = r3.A00(r1.A01);
                            }
                        }
                    }
                }
                str = null;
                r3.A01(str);
                C70333aK.A00(this.A0I, this, r8, r9, 13);
            } else {
                String str2 = r9.A01;
                C89654ea r22 = (C89654ea) C621633u.A01(context, C89654ea.class);
                if (r22 != null) {
                    Set A002 = this.A05.A00(r8.A0o(), str2);
                    if (A002 != null) {
                        r22.Boo(C379624s.A00(str2, r8.A1J.A01, A002));
                        return;
                    }
                } else {
                    Log.e("ClickToActionButtonUtils/suspiciousLinkHandler/error: not click in Conversation");
                }
                C70333aK.A00(this.A0I, this, r8, r9, 12);
                A03(context, r8, r9);
                return;
            }
        } else if (r2.A08(r9)) {
            Log.d("OTP: copy code button clicked");
            r2.A05((AnonymousClass1p5) r7.getFMessage(), 2);
        } else if (r2.A07(r9)) {
            Log.d("OTP: autofill button clicked");
            r2.A04(context, (AnonymousClass1p5) r7.getFMessage(), 2);
        } else {
            return;
        }
        AnonymousClass67A A012 = AnonymousClass31N.A01(r7.getContext());
        if (A012 != null) {
            A012.BiX();
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Context r14, X.C93314oJ r15, X.C624134x r16, X.C58932w3 r17, java.lang.String r18, boolean r19) {
        /*
            r13 = this;
            r9 = r16
            X.2z0 r0 = r9.A1J
            X.4uZ r4 = r0.A00
            java.lang.Class<X.4ea> r0 = X.C89654ea.class
            r5 = r14
            android.app.Activity r3 = X.C621633u.A01(r14, r0)
            X.4ea r3 = (X.C89654ea) r3
            if (r4 == 0) goto L_0x003c
            if (r3 == 0) goto L_0x003c
            r7 = r13
            X.2zw r2 = r13.A0D
            X.1VX r1 = r2.A03
            r0 = 976(0x3d0, float:1.368E-42)
            boolean r0 = X.C56952sp.A0J(r1, r0)
            if (r0 == 0) goto L_0x003d
            X.214 r0 = X.AnonymousClass214.NON_BLOCKING_DISCLOSURE
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r6 = X.AnonymousClass26I.A00(r4, r2, r0)
        L_0x0026:
            boolean r0 = r6 instanceof X.C838349y
            if (r0 == 0) goto L_0x0039
            X.3L6 r4 = new X.3L6
            r8 = r15
            r10 = r17
            r11 = r18
            r12 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r6.Blt(r4)
        L_0x0039:
            r3.Boo(r6)
        L_0x003c:
            return
        L_0x003d:
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFullscreenFragment r6 = new com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFullscreenFragment
            r6.<init>(r4, r2)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55662qi.A02(android.content.Context, X.4oJ, X.34x, X.2w3, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C624134x r13) {
        /*
            r12 = this;
            X.2z0 r0 = r13.A1J
            X.4uZ r9 = r0.A00
            X.2jD r0 = r13.A0u()
            if (r9 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0034
            X.2zw r11 = r12.A0D
            X.3Wa r3 = r12.A0H
            r6 = 1
            X.C162457s7.A0J(r3, r6)
            X.1VX r10 = r11.A03
            r0 = 5869(0x16ed, float:8.224E-42)
            X.2vE r8 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r8, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0034
            X.2g9 r1 = r11.A05
            X.20g r0 = X.C369220g.MARKETING_MESSAGE
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0036
            X.2q9 r0 = r11.A06
            r0.A02(r9, r6)
        L_0x0034:
            r1 = 0
        L_0x0035:
            return r1
        L_0x0036:
            X.2Yg r0 = r11.A08
            X.66R r0 = r0.A01
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r0)
            java.lang.String r0 = "pref_disclosure_tos_state"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x004e
            X.2q9 r1 = r11.A06
            r0 = 2
            r1.A02(r9, r0)
            goto L_0x0034
        L_0x004e:
            X.2Yf r0 = r11.A07
            r7 = 0
            X.66R r1 = r0.A01
            android.content.SharedPreferences r2 = X.C18310x6.A0F(r1)
            java.lang.String r0 = r9.getRawString()
            boolean r0 = r2.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x008b
            java.lang.String r5 = "20210210"
            X.2km r4 = r3.A08
            int r0 = r4.A00(r5)
            if (r0 != r6) goto L_0x008b
            X.33p r3 = r11.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r2 = "tos_2016_opt_out_state"
            boolean r0 = X.C18280x3.A1W(r0, r2)
            if (r0 == 0) goto L_0x0091
            X.3zM r1 = new X.3zM
            r1.<init>(r9, r11)
        L_0x007f:
            r0 = 6730(0x1a4a, float:9.431E-42)
            boolean r0 = r10.A0Y(r8, r0)
            if (r0 == 0) goto L_0x0034
            r1.invoke()
            goto L_0x0034
        L_0x008b:
            X.3zL r1 = new X.3zL
            r1.<init>(r9, r11)
            goto L_0x007f
        L_0x0091:
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r1)
            java.lang.String r0 = r9.getRawString()
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x0034
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r3)
            boolean r0 = X.C18280x3.A1W(r0, r2)
            if (r0 != 0) goto L_0x0034
            int r0 = r4.A00(r5)
            r1 = 1
            if (r0 == r6) goto L_0x0035
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55662qi.A04(X.34x):boolean");
    }

    public C55662qi(C111095hX r2, AnonymousClass5X8 r3, AnonymousClass5ST r4, C620633i r5, C56612sH r6, C114635nM r7, AnonymousClass36Y r8, AnonymousClass1VX r9, AnonymousClass3LP r10, AnonymousClass4FV r11, C54702p9 r12, C614030o r13, C55312q9 r14, C61242zw r15, C53262mo r16, C45082Yp r17, C53552nH r18, C69183Wa r19, AnonymousClass4FS r20) {
        this.A04 = r6;
        this.A07 = r9;
        this.A0I = r20;
        this.A09 = r11;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r8;
        this.A03 = r5;
        this.A0F = r17;
        this.A05 = r7;
        this.A02 = r4;
        this.A0B = r13;
        this.A08 = r10;
        this.A0H = r19;
        this.A0G = r18;
        this.A0E = r16;
        this.A0D = r15;
        this.A0A = r12;
        this.A0C = r14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        if ("compact".equalsIgnoreCase(r1) == false) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.content.Context r10, X.C624134x r11, X.C58932w3 r12) {
        /*
            r9 = this;
            r11.A0u()
            X.1VX r2 = r9.A07
            boolean r0 = X.C616831v.A02(r2, r12)
            if (r0 == 0) goto L_0x001c
            java.lang.String r3 = r12.A01
            java.lang.String r2 = "research-survey"
            r1 = 1
            r0 = 0
            android.content.Intent r1 = X.C627736r.A17(r10, r3, r2, r1, r0)
        L_0x0016:
            X.5hX r0 = r9.A00
            r0.A0A(r10, r1)
            return
        L_0x001c:
            java.lang.String r4 = r12.A01
            X.36Y r3 = r9.A06     // Catch:{ Exception -> 0x003f }
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x003f }
            r0 = 0
            int r1 = r3.A0B(r1, r0)     // Catch:{ Exception -> 0x003f }
            r0 = 1
            if (r1 == r0) goto L_0x0051
            X.3LP r2 = r9.A08
            X.4FV r1 = r9.A09
            r0 = 4
            X.AnonymousClass31G.A02(r2, r1, r11, r0)
            java.lang.String r0 = r12.A01
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = X.C627736r.A0G(r10, r0)
            goto L_0x0016
        L_0x003f:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ClickToActionButtonUtils/isDeepLinkUri/<"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "> is not a valid URL. Error="
            X.C18260x0.A1Q(r1, r0, r3)
        L_0x0051:
            X.3LP r3 = r9.A08
            X.2z0 r0 = r11.A1J
            X.4uZ r4 = r0.A00
            boolean r0 = X.C57362tW.A00(r3, r4)
            if (r0 == 0) goto L_0x006b
            X.4FV r1 = r9.A09
            r0 = 4
            X.AnonymousClass31G.A02(r3, r1, r11, r0)
        L_0x0063:
            X.5hX r1 = r9.A00
            java.lang.String r0 = r12.A01
            X.C18310x6.A0y(r10, r1, r0)
            return
        L_0x006b:
            java.lang.String r0 = r12.A01
            if (r4 == 0) goto L_0x00b3
            boolean r0 = X.C57592tt.A01(r2, r4, r0)
            if (r0 == 0) goto L_0x00b3
        L_0x0075:
            r3 = 1
        L_0x0076:
            java.lang.String r0 = r12.A01
            java.lang.String r1 = X.C57592tt.A00(r2, r4, r0)
            if (r3 != 0) goto L_0x00e3
            java.lang.String r0 = "webview"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "browser_tab"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            java.util.List r1 = java.util.Collections.emptyList()
            r0 = 0
            java.lang.String r0 = X.AnonymousClass0H1.A00(r10, r1, r0)
            if (r0 == 0) goto L_0x0063
            X.0OV r0 = new X.0OV
            r0.<init>()
            X.0KG r1 = r0.A00()
            java.lang.String r0 = r12.A01
            android.net.Uri r0 = com.whatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r0)
            android.content.Intent r1 = r1.A00
            r1.setData(r0)
            r0 = 0
            X.AnonymousClass0RN.A00(r10, r1, r0)
            return
        L_0x00b3:
            r1 = 5970(0x1752, float:8.366E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r12.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "full"
            java.lang.String r1 = r12.A03
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "tall"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "compact"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00e1
            goto L_0x0075
        L_0x00e1:
            r3 = 0
            goto L_0x0076
        L_0x00e3:
            X.2mo r3 = r9.A0E
            boolean r0 = r11 instanceof X.AnonymousClass1p5
            if (r0 == 0) goto L_0x0135
            X.1p5 r11 = (X.AnonymousClass1p5) r11
            X.2cm r0 = r11.A00
            java.lang.String r6 = r0.A05
        L_0x00ef:
            java.lang.String r5 = "marketing_msg_webview"
            r7 = 0
            r8 = r7
            r3.A00(r4, r5, r6, r7, r8)
            if (r4 == 0) goto L_0x0133
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://api.whatsapp.com/send/?phone="
            r1.append(r0)
            java.lang.String r0 = r4.user
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0107:
            r1 = 0
            java.lang.String r0 = r12.A01
            android.content.Intent r2 = X.C627736r.A14(r10, r0, r2, r1)
            java.lang.String r0 = "webview_should_ask_before_close"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "message_cta_type"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x0125
            java.lang.String r1 = r4.getRawString()
            java.lang.String r0 = "webview_receiver_jid"
            r2.putExtra(r0, r1)
        L_0x0125:
            if (r6 == 0) goto L_0x012d
            java.lang.String r0 = "webview_message_template_id"
            r2.putExtra(r0, r6)
        L_0x012d:
            X.5hX r0 = r9.A00
            r0.A0A(r10, r2)
            return
        L_0x0133:
            r2 = 0
            goto L_0x0107
        L_0x0135:
            r6 = 0
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55662qi.A03(android.content.Context, X.34x, X.2w3):void");
    }
}
