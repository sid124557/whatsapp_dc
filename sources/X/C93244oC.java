package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.4oC  reason: invalid class name and case insensitive filesystem */
public abstract class C93244oC extends C93024nk {
    public C116985rC A00;
    public C106055Xl A01;
    public AnonymousClass5ZR A02;
    public AnonymousClass5PP A03;
    public C56232re A04;
    public C620133d A05;
    public C104295Qk A06;
    public C56072rN A07;
    public final C109665ez A08 = new AnonymousClass54F(this, 39);
    public final C109665ez A09 = new AnonymousClass54F(this, 37);
    public final C109665ez A0A = new AnonymousClass54F(this, 38);
    public final C109665ez A0B = new AnonymousClass54F(this, 40);
    public final AnonymousClass66v A0C;

    public static void A0o(ConversationRowMediaControlView conversationRowMediaControlView, boolean z, boolean z2) {
        A04(conversationRowMediaControlView, conversationRowMediaControlView.A00, conversationRowMediaControlView.A05, conversationRowMediaControlView.A04, z, z2, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ea, code lost:
        if (r24 != false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.view.View r19, android.view.View r20, X.AnonymousClass5UY r21, X.AnonymousClass5UY r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r7 = r19
            int r4 = r7.getWidth()
            r11 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r15 = 1
            r2 = 8
            r8 = 0
            r9 = r21
            int r0 = r9.A03()
            r6 = r20
            r5 = r22
            if (r23 == 0) goto L_0x00ac
            if (r0 != 0) goto L_0x0021
            int r0 = r5.A03()
            if (r0 == 0) goto L_0x00a7
        L_0x0021:
            r0 = 150(0x96, double:7.4E-322)
            if (r24 == 0) goto L_0x00a8
            r12 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r10 = new android.view.animation.ScaleAnimation
            r16 = r12
            r18 = r12
            r13 = r11
            r14 = r12
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            android.view.animation.AnimationSet r10 = X.C86614Ku.A0G(r10, r11, r3)
            r10.setDuration(r0)
            r6.startAnimation(r10)
        L_0x003e:
            r6.setVisibility(r2)
            android.view.View r6 = r9.A04()
            android.view.View r9 = r5.A04()
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r6.setVisibility(r8)
            r9.setVisibility(r8)
            r2 = 0
            r9.setContentDescription(r2)
            r2 = 2131231108(0x7f080184, float:1.8078288E38)
            if (r26 == 0) goto L_0x005d
            r2 = 2131232829(0x7f08083d, float:1.8081778E38)
        L_0x005d:
            r9.setImageResource(r2)
            if (r24 == 0) goto L_0x00ed
            android.view.animation.AlphaAnimation r5 = X.AnonymousClass4L0.A0C(r3, r11)
            r2 = 300(0x12c, double:1.48E-321)
            r5.setDuration(r2)
            r5.setStartOffset(r0)
            r6.startAnimation(r5)
            r9.startAnimation(r5)
        L_0x0074:
            X.C86604Kt.A19(r7)
            int r3 = r7.getMeasuredWidth()
            android.graphics.drawable.Drawable r1 = r7.getBackground()
            boolean r0 = r1 instanceof X.AnonymousClass4M5
            if (r0 != 0) goto L_0x008d
            X.4M5 r0 = new X.4M5
            r2 = r25
            r0.<init>(r1, r2)
            r7.setBackground(r0)
        L_0x008d:
            android.graphics.drawable.Drawable r2 = r7.getBackground()
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r0 = java.lang.Math.max(r4, r3)
            r1.width = r0
            X.67U r1 = new X.67U
            r1.<init>(r2, r4, r3, r8)
            r0 = 4
            X.C1232367q.A00(r1, r2, r7, r0)
            X.C86604Kt.A1H(r7, r1)
        L_0x00a7:
            return
        L_0x00a8:
            r6.clearAnimation()
            goto L_0x003e
        L_0x00ac:
            if (r0 != r2) goto L_0x00b4
            int r0 = r5.A03()
            if (r0 == r2) goto L_0x00a7
        L_0x00b4:
            r6.setVisibility(r8)
            if (r24 == 0) goto L_0x00d6
            r16 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r0 = new android.view.animation.ScaleAnimation
            r19 = r11
            r21 = r16
            r22 = r15
            r23 = r16
            r17 = r11
            r18 = r16
            r20 = r15
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            android.view.animation.AnimationSet r0 = X.C86614Ku.A0G(r0, r3, r11)
            X.C86604Kt.A1H(r6, r0)
        L_0x00d6:
            android.view.View r0 = r9.A01
            if (r0 == 0) goto L_0x00dd
            r0.clearAnimation()
        L_0x00dd:
            r9.A06(r2)
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x00e7
            r0.clearAnimation()
        L_0x00e7:
            r5.A06(r2)
            if (r24 == 0) goto L_0x00f3
            goto L_0x0074
        L_0x00ed:
            r6.clearAnimation()
            r9.clearAnimation()
        L_0x00f3:
            r7.clearAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93244oC.A04(android.view.View, android.view.View, X.5UY, X.5UY, boolean, boolean, boolean, boolean):void");
    }

    public void A1N() {
        C117085rM.A01(this.A25, this, 42);
    }

    public void A25(View view, TextEmojiLabel textEmojiLabel, String str) {
        TextView textView;
        if (textEmojiLabel != null) {
            C30471mV fMessage = getFMessage();
            A1j(fMessage);
            Resources resources = getResources();
            int A032 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
            int secondaryTextColor = getSecondaryTextColor();
            if (!TextUtils.isEmpty(str)) {
                textEmojiLabel.setVisibility(0);
                setMessageText(str, textEmojiLabel, fMessage);
                textView = this.A0K;
                textView.setTextColor(secondaryTextColor);
                this.A08.setPadding(resources.getDimensionPixelSize(R.dimen.f6nameremoved), 0, resources.getDimensionPixelSize(R.dimen.f6nameremoved), resources.getDimensionPixelSize(R.dimen.f6nameremoved));
                AnonymousClass001.A0T(view).topMargin = 0;
            } else {
                textEmojiLabel.setVisibility(8);
                textView = this.A0K;
                textView.setTextColor(A032);
                ViewGroup viewGroup = this.A08;
                viewGroup.setPadding(resources.getDimensionPixelSize(R.dimen.f6nameremoved), 0, resources.getDimensionPixelSize(R.dimen.f6nameremoved), 0);
                C86604Kt.A19(viewGroup);
                if (view != null) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    AnonymousClass001.A0T(view).topMargin = (-viewGroup.getMeasuredHeight()) - dimensionPixelSize;
                    if (this.A0O.A0X(4860)) {
                        AnonymousClass001.A0T(view).bottomMargin = dimensionPixelSize;
                    }
                }
            }
            AnonymousClass5UY r0 = this.A24;
            if (r0 != null) {
                ((TextView) r0.A04()).setTextColor(textView.getTextColors());
            }
            ImageView imageView = this.A0D;
            if (imageView != null) {
                A03(getContext(), imageView, this, 1);
            }
            ImageView imageView2 = this.A0E;
            if (imageView2 != null) {
                A03(getContext(), imageView2, this, 2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r15.A04 == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A26(X.C624134x r21) {
        /*
            r20 = this;
            r13 = r21
            X.2U8 r1 = r13.A0c
            r7 = r20
            r0 = 2131434886(0x7f0b1d86, float:1.8491599E38)
            if (r1 == 0) goto L_0x0075
            android.view.ViewGroup r2 = X.C86644Kx.A0J(r7, r0)
            if (r2 == 0) goto L_0x0074
            X.1VX r1 = r7.A0O
            X.5Zz r0 = r7.A1Z
            X.32K r15 = X.AnonymousClass32K.A00(r1, r0, r13)
            r0 = 0
            r2.setVisibility(r0)
            X.5Xl r0 = r7.A01
            if (r0 != 0) goto L_0x0053
            android.content.Context r4 = r7.getContext()
            X.679 r8 = r7.A0n
            X.4Fm r5 = r7.A0Y
            X.2rN r11 = r7.A07
            X.5nM r9 = r7.A1M
            X.1sV r12 = r7.A22
            X.5KC r6 = r7.A1B()
            X.5rC r1 = r7.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x003e
            r1.A04()
        L_0x003e:
            X.1VX r10 = r7.A0O
            X.5Xl r3 = new X.5Xl
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r7.A01 = r3
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r3.A0D
            X.C86624Kv.A15(r0, r2)
            X.5Xl r0 = r7.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0D
            X.C93314oJ.A0q(r0, r7)
        L_0x0053:
            X.66v r14 = r7.A0C
            boolean r0 = r14 instanceof X.C116505qO
            if (r0 == 0) goto L_0x005f
            boolean r0 = r15.A04
            r16 = 1
            if (r0 != 0) goto L_0x0061
        L_0x005f:
            r16 = 0
        L_0x0061:
            X.5Xl r12 = r7.A01
            X.5PP r0 = r7.A03
            boolean r17 = r0.A00(r13)
            X.5PP r0 = r7.A03
            boolean r18 = r0.A01(r13)
            r19 = 0
            r12.A04(r13, r14, r15, r16, r17, r18, r19)
        L_0x0074:
            return
        L_0x0075:
            android.view.ViewGroup r1 = X.C86644Kx.A0J(r7, r0)
            if (r1 == 0) goto L_0x0074
            X.5Xl r0 = r7.A01
            if (r0 == 0) goto L_0x0087
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0D
            r1.removeView(r0)
            r0 = 0
            r7.A01 = r0
        L_0x0087:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93244oC.A26(X.34x):void");
    }

    public C30471mV getFMessage() {
        return (C30471mV) this.A0S;
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30471mV);
        this.A0S = r2;
    }

    public C93244oC(Context context, AnonymousClass677 r4, C30471mV r5) {
        super(context, r4, r5);
        this.A0C = C107315b6.A01(context);
    }

    public static String A02(C624134x r2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0S(r2, "status-transition-", A0o);
        return A0o.toString();
    }

    public static void A03(Context context, ImageView imageView, C93314oJ r5, int i) {
        int i2;
        boolean A1x = r5.A1x();
        C162457s7.A0J(context, 0);
        if (i != 0) {
            i2 = R.drawable.keep;
            if (i != 1) {
                i2 = R.drawable.vec_message_badge_pinned;
            }
        } else {
            i2 = R.drawable.message_star;
        }
        int i3 = R.color.f5nameremoved;
        if (A1x) {
            i3 = R.color.f5nameremoved;
        }
        imageView.setImageDrawable(C107335b8.A04(context, i2, i3));
    }

    public static void A0n(C93244oC r3, AnonymousClass2z0 r4) {
        if (r3.A27()) {
            return;
        }
        if (r3.A0n.BoA()) {
            C89654ea r1 = (C89654ea) C621633u.A01(r3.getContext(), C89654ea.class);
            if (r1 != null) {
                r3.A0T.A01(r1);
                return;
            }
            return;
        }
        r3.getContext().startActivity(C627736r.A0Q(r3.getContext(), r4.A00, r4.hashCode()));
    }

    public int A19(int i) {
        if (!C86614Ku.A1Z(getFMessage()) || (!(this instanceof C93214o9) && !(this instanceof C92894nX) && !(this instanceof AnonymousClass4o3) && !(this instanceof C93154nz))) {
            return super.A19(i);
        }
        if (AnonymousClass001.A1U(AnonymousClass358.A00(i, 13))) {
            return R.drawable.message_got_read_receipt_from_target_onmedia;
        }
        if (AnonymousClass001.A1U(AnonymousClass358.A00(i, 5))) {
            return R.drawable.message_got_receipt_from_target_onmedia;
        }
        if (i == 4) {
            return R.drawable.message_got_receipt_from_server_onmedia;
        }
        return R.drawable.message_unsent_onmedia;
    }

    public void A1Y(ViewGroup viewGroup, TextView textView, C624134x r4) {
        if (!AnonymousClass36V.A06(r4)) {
            super.A1Y(viewGroup, textView, r4);
        }
    }

    public void A24() {
        int i;
        C30471mV fMessage = getFMessage();
        C71333bw.A00(this.A25, this, fMessage, 20);
        if (C383527f.A00(fMessage)) {
            C104295Qk r0 = this.A06;
            C626936e.A06(r0);
            r0.A00(fMessage);
            return;
        }
        C95814uZ r1 = fMessage.A1J.A00;
        if (C30471mV.A00(fMessage).A07 == 1) {
            byte b = fMessage.A1I;
            C69263Wi r2 = this.A0X;
            if (b == 2) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
                if (b == 9) {
                    i = R.string.f11nameremoved;
                }
            }
            r2.A0F(i, 1);
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message with suspicious content");
        } else if (C627336j.A0K(r1) && this.A1W.A02(r1)) {
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message because group is integrity suspended");
            this.A0X.A0F(R.string.f11nameremoved, 1);
        } else if (fMessage.A22()) {
            this.A0h.A07(C111095hX.A05(getContext()), fMessage, true);
        } else {
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message with no media attached");
            this.A0X.A0H(R.string.f11nameremoved, 0);
        }
    }

    public boolean A27() {
        AnonymousClass33C r1;
        C30471mV fMessage = getFMessage();
        C33141sV r2 = this.A22;
        if (fMessage.A1J.A02 || (r1 = fMessage.A01) == null) {
            return false;
        }
        r1.A0Z = true;
        r2.A0G(fMessage);
        A1H();
        return true;
    }

    public ViewGroup getExternalAdContentHolder() {
        return C86644Kx.A0J(this, R.id.web_page_preview_holder);
    }

    public C166147yD getTempFMessageMediaInfo() {
        String str;
        C30471mV fMessage = getFMessage();
        File A012 = C30471mV.A01(fMessage);
        String A1w = fMessage.A1w();
        if (A012 != null) {
            str = A012.toURI().toString();
        } else {
            str = null;
        }
        if (A1w == null || str == null) {
            return null;
        }
        return new C166147yD(A1w, str, fMessage.A1I, fMessage.A0K);
    }
}
