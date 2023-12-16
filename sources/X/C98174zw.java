package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4zw  reason: invalid class name and case insensitive filesystem */
public abstract class C98174zw extends C98184zx {
    public AnonymousClass0PJ A00;
    public TextEmojiLabel A01;
    public C105075Tm A02;
    public AnonymousClass4qE A03;
    public AnonymousClass4q9 A04;
    public CharSequence A05;
    public final int A06;
    public final int A07;
    public final C103445Mz A08;

    public abstract CharSequence A04(AnonymousClass3ZH r1, C624134x r2);

    private void setTitleColorBasedOnQuery(List list) {
        C105075Tm r0;
        int i;
        if (list == null || list.isEmpty()) {
            r0 = this.A02;
            i = this.A07;
        } else {
            r0 = this.A02;
            i = this.A06;
        }
        r0.A03.A00.setTextColor(i);
    }

    public CharSequence A05(C624134x r11, List list) {
        String str;
        String str2;
        if (this instanceof C98084zn) {
            C98084zn r2 = (C98084zn) this;
            C30481mW r112 = (C30481mW) r11;
            if (r2 instanceof C98074zm) {
                C98074zm r22 = (C98074zm) r2;
                AnonymousClass1VX r1 = r22.A08;
                C106685Zz r5 = r22.A03;
                if (r112.A1w() == null) {
                    str2 = "";
                } else {
                    str2 = r112.A1w();
                }
                if (list != null && !"".equals(str2)) {
                    String str3 = AnonymousClass32K.A00(r1, r5, r112).A03;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (!str3.isEmpty() && str2.contains(str3)) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (str3.contains(AnonymousClass001.A0m(it))) {
                                int indexOf = str2.indexOf(str3);
                                if (indexOf == 0 || indexOf == str2.length() - str3.length()) {
                                    String[] strArr = {r112.A06, r112.A04, C57132t9.A00(r5, str3)};
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        int i = 0;
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        String A0m = AnonymousClass001.A0m(it2);
                                        while (true) {
                                            String str4 = strArr[i];
                                            if (str4 != null && str4.contains(A0m)) {
                                                return str2.replace(str3, "");
                                            }
                                            i++;
                                            if (i >= 3) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                str2 = "";
                if (C40802Hu.A01(r112) != null) {
                    String str5 = C40802Hu.A01(r112).A00;
                    if (!TextUtils.isEmpty(str5)) {
                        str2 = str5;
                    }
                    if (!C624134x.A0a(r112)) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("*");
                        A0o.append(r112.A13());
                        return AnonymousClass000.A0V("*\n\n", str2, A0o);
                    }
                } else if (r112.A1w() != null) {
                    return r112.A1w();
                }
            }
            return str2;
        }
        if (!(this instanceof C98114zq) && !(this instanceof C98124zr)) {
            if (this instanceof C98164zv) {
                C98164zv r23 = (C98164zv) this;
                C30471mV r113 = (C30471mV) r11;
                String A012 = AnonymousClass353.A01(r113);
                if (!TextUtils.isEmpty(A012) || ((A012 = r113.A1w()) != null && !AnonymousClass353.A04(r113))) {
                    return A012;
                }
                return r23.getDefaultMessageText();
            } else if (((C98104zp) this) instanceof C98014zg) {
                C30361mK r114 = (C30361mK) r11;
                if (!(r114 instanceof C30801n8) || (str = ((C30801n8) r114).A03) == null) {
                    return "";
                }
                return str;
            }
        }
        return "";
    }

    public void A06(AnonymousClass3ZH r6, AnonymousClass3ZH r7, C624134x r8, List list) {
        C105075Tm r0;
        int i;
        this.A00 = AnonymousClass0x9.A0G(Boolean.TRUE, r7);
        this.A02.A02(r6, C107075ae.A01, list);
        this.A02.A05.A0D(r6);
        setTitleColorBasedOnQuery(list);
        if (!(this instanceof C98164zv)) {
            AnonymousClass0PJ A0G = AnonymousClass0x9.A0G(C107565bW.A0F(this.A06, this.A05.A0I(r8.A0K), false), C107565bW.A0F(this.A06, this.A05.A0I(r8.A0K), true));
            if (A0G != null) {
                ConversationListRowHeaderView conversationListRowHeaderView = this.A02.A03;
                conversationListRowHeaderView.A01.setText((CharSequence) A0G.A00);
                conversationListRowHeaderView.A01.setContentDescription((CharSequence) A0G.A01);
                r0 = this.A02;
                i = 0;
                r0.A03.A01.setVisibility(i);
                A08(r8, list);
            }
        }
        r0 = this.A02;
        i = 8;
        r0.A03.A01.setVisibility(i);
        A08(r8, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C624134x r12, java.util.List r13) {
        /*
            r11 = this;
            X.4q9 r0 = r11.A04
            X.C86604Kt.A1R(r0)
            X.4qE r0 = r11.A03
            X.C86604Kt.A1R(r0)
            r8 = r13
            r11.setTitleColorBasedOnQuery(r13)
            X.3Ex r1 = r11.A02
            X.4uZ r0 = X.AnonymousClass2z0.A00(r12)
            X.3ZH r3 = r1.A06(r0)
            r2 = 0
            if (r3 == 0) goto L_0x002b
            X.2sr r0 = r11.A01
            X.4uZ r1 = X.C106795aB.A00(r0, r3, r12)
            if (r1 == 0) goto L_0x00a3
            X.3Ex r0 = r11.A02
            X.3ZH r0 = r0.A06(r1)
            if (r0 != 0) goto L_0x00a4
        L_0x002b:
            X.5Tm r0 = r11.A02
            r0.A01()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r0, r2)
            r11.A00 = r0
            X.2sr r1 = r11.A01
            X.3Ex r0 = r11.A02
            X.4q9 r2 = new X.4q9
            r2.<init>(r1, r0, r12)
            r11.A04 = r2
            X.5Mz r1 = r11.A08
            X.5lF r0 = new X.5lF
            r0.<init>(r12, r11, r13)
            r1.A02(r0, r2)
            java.lang.CharSequence r7 = r11.A05(r12, r13)
        L_0x0051:
            android.content.Context r1 = r11.getContext()
            com.whatsapp.TextEmojiLabel r0 = r11.A01
            android.text.TextPaint r2 = r0.getPaint()
            r9 = 3
            com.whatsapp.TextEmojiLabel r0 = r11.A01
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            int r10 = r0.getMeasuredWidth()
            X.5Y0 r5 = r11.A07
            X.33i r3 = r11.A04
            X.33j r4 = r11.A06
            X.2y5 r6 = r11.A09
            X.4qE r0 = new X.4qE
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A03 = r0
            X.8G5 r5 = new X.8G5
            r5.<init>(r12, r11, r13)
            int r1 = r7.length()
            r0 = 768(0x300, float:1.076E-42)
            if (r1 > r0) goto L_0x00b6
            X.4qs r10 = new X.4qs
            r10.<init>(r7)
            int r9 = r7.length()
            r8 = 0
            r7 = 0
        L_0x008f:
            if (r7 >= r9) goto L_0x00ac
            r10.A00 = r7
            long r3 = com.whatsapp.emoji.EmojiDescriptor.A00(r10, r8)
            int r6 = r10.A02(r7, r3)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b6
            int r7 = r7 + r6
            goto L_0x008f
        L_0x00a3:
            r0 = r2
        L_0x00a4:
            java.lang.CharSequence r7 = r11.A05(r12, r13)
            r11.A06(r3, r0, r12, r13)
            goto L_0x0051
        L_0x00ac:
            X.4qE r0 = r11.A03
            java.lang.Object r0 = r0.call()     // Catch:{ 0nr -> 0x00c4 }
            r5.BPS(r0)     // Catch:{ 0nr -> 0x00c4 }
            return
        L_0x00b6:
            com.whatsapp.TextEmojiLabel r1 = r11.A01
            r0 = 80
            r1.setPlaceholder(r0)
            X.5Mz r1 = r11.A08
            X.4qE r0 = r11.A03
            r1.A02(r5, r0)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98174zw.A07(X.34x, java.util.List):void");
    }

    public final void A08(C624134x r4, List list) {
        AnonymousClass0PJ r2 = this.A00;
        if (r2 != null && Boolean.TRUE.equals(r2.A00) && this.A05 != null) {
            CharSequence A022 = C106795aB.A02(C107075ae.A01(getContext(), this.A06, A04((AnonymousClass3ZH) r2.A01, r4), list), this.A05);
            this.A01.setPlaceholder(0);
            if (TextUtils.isEmpty(A022)) {
                this.A01.setVisibility(8);
                return;
            }
            this.A01.setVisibility(0);
            this.A01.A0K((List) null, A022);
        }
    }

    public Paint getMessageViewPaint() {
        return this.A01.getPaint();
    }

    public C98174zw(Context context, C103445Mz r4) {
        super(context);
        this.A08 = r4;
        this.A06 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A07 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        if (!(this instanceof C98014zg) && !(this instanceof C97994ze)) {
            A03();
        }
    }
}
