package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView;

/* renamed from: X.5UV  reason: invalid class name */
public class AnonymousClass5UV {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public ViewGroup A07;
    public LinearLayout A08;
    public ShimmerFrameLayout A09;
    public CircleWaImageView A0A;
    public C56972sr A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public WaImageButton A0E;
    public WaImageView A0F;
    public WaImageView A0G;
    public WaTextView A0H;
    public WaTextView A0I;
    public WaTextView A0J;
    public WaTextView A0K;
    public WaTextView A0L;
    public WaTextView A0M;
    public WaTextView A0N;
    public WaTextView A0O;
    public AnonymousClass5U9 A0P;
    public AnonymousClass5QM A0Q;
    public C44702Xd A0R;
    public DirectoryProductImagesCardView A0S;
    public C613330g A0T;
    public C54292oU A0U;
    public C620733j A0V;
    public AnonymousClass1VX A0W;
    public C105355Up A0X;
    public AnonymousClass5PS A0Y;
    public AnonymousClass4FS A0Z;
    public final Handler A0a = new Handler();

    public static void A00(AnonymousClass5UV r4, C96414wK r5) {
        String str = r5.A01;
        if (TextUtils.isEmpty(str)) {
            r4.A06.setVisibility(8);
            return;
        }
        r4.A0D.setVisibility(0);
        r4.A09.setVisibility(8);
        r4.A07.setVisibility(8);
        r4.A0D.setText(str);
    }

    public final Integer A01(C96414wK r2) {
        int A002;
        if (!r2.A0D) {
            return null;
        }
        if (!r2.A0B.A0P) {
            A002 = 0;
        } else if (this.A0S.A00()) {
            A002 = 3;
        } else {
            A002 = C18280x3.A00(this.A0S.A01() ? 1 : 0);
        }
        return Integer.valueOf(A002);
    }

    public final Integer A02(C96414wK r4) {
        int i;
        if (!r4.A0D) {
            return null;
        }
        C109065e1 r2 = r4.A0B;
        if (r2.A0P) {
            return null;
        }
        if (!r2.A0Q) {
            i = 0;
        } else if (r2.A01 != 1 || C86664Kz.A1V(this.A0D)) {
            int i2 = r2.A01;
            i = 2;
            if (i2 != 2) {
                return 1;
            }
        } else {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    public final Integer A03(C96414wK r2) {
        int A002;
        if (!r2.A0D) {
            return null;
        }
        if (!r2.A0B.A0R) {
            A002 = 0;
        } else if (this.A0S.A00()) {
            A002 = 3;
        } else {
            A002 = C18280x3.A00(this.A0S.A01() ? 1 : 0);
        }
        return Integer.valueOf(A002);
    }

    public final void A04(Context context, View view, WaTextView waTextView, Integer num, int i, int i2) {
        if (num != null) {
            int i3 = 0;
            view.setVisibility(0);
            int intValue = num.intValue();
            if (intValue > 0) {
                long j = (long) intValue;
                String A012 = AnonymousClass5VH.A01(this.A0V, j);
                String A002 = AnonymousClass5VH.A00(j);
                if (A002 != null) {
                    switch (A002.hashCode()) {
                        case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                            if (A002.equals("B")) {
                                i3 = R.string.f11nameremoved;
                                break;
                            }
                            break;
                        case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER:
                            if (A002.equals("K")) {
                                i3 = R.string.f11nameremoved;
                                break;
                            }
                            break;
                        case AnonymousClass1EU.COMMENT_MESSAGE_FIELD_NUMBER:
                            if (A002.equals("M")) {
                                i3 = R.string.f11nameremoved;
                                break;
                            }
                            break;
                    }
                    StringBuilder A0l = AnonymousClass000.A0l(A012);
                    AnonymousClass0x2.A0s(context, A0l, i3);
                    A012 = A0l.toString();
                }
                C86614Ku.A16(context.getResources(), waTextView, AnonymousClass000.A1b(A012), i, intValue);
                return;
            }
            waTextView.setText(i2);
            return;
        }
        view.setVisibility(8);
    }

    public void A05(View view) {
        this.A03 = view;
        this.A0A = (CircleWaImageView) C06560Yg.A02(view, R.id.business_avatar);
        this.A0C = AnonymousClass0x7.A0K(view, R.id.business_name);
        this.A0M = AnonymousClass0x7.A0L(view, R.id.open_status);
        this.A0N = AnonymousClass0x7.A0L(view, R.id.price_tier);
        this.A0G = AnonymousClass0x9.A0L(view, R.id.open_status_dot_divider);
        this.A0I = AnonymousClass0x7.A0L(view, R.id.category);
        this.A0H = AnonymousClass0x7.A0L(view, R.id.address);
        this.A0J = AnonymousClass0x7.A0L(view, R.id.distance);
        this.A0F = AnonymousClass0x9.A0L(view, R.id.address_dot_divider);
        this.A0E = C86664Kz.A10(view, R.id.message_btn);
        this.A0K = AnonymousClass0x7.A0L(view, R.id.fb_likes);
        this.A0L = AnonymousClass0x7.A0L(view, R.id.ig_followers);
        this.A01 = C06560Yg.A02(view, R.id.fb_layout);
        this.A02 = C06560Yg.A02(view, R.id.ig_layout);
        this.A00 = C06560Yg.A02(view, R.id.fb_ig_layout);
        this.A0D = AnonymousClass0x7.A0K(view, R.id.business_description);
        this.A07 = C86644Kx.A0I(view, R.id.description_error);
        this.A09 = (ShimmerFrameLayout) C06560Yg.A02(view, R.id.description_shimmer);
        this.A04 = C06560Yg.A02(view, R.id.responiveness_signal);
        this.A06 = C86644Kx.A0I(view, R.id.description_container);
        this.A0S = (DirectoryProductImagesCardView) C06560Yg.A02(view, R.id.product_images_preview);
        this.A05 = C86644Kx.A0I(view, R.id.additional_data_container);
        this.A08 = C86654Ky.A0N(view, R.id.service_offerings_layout);
        this.A0O = AnonymousClass0x7.A0L(view, R.id.offering_name);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021c, code lost:
        if ("facebook".equals(r7.A01) == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x021e, code lost:
        r11 = java.lang.Integer.valueOf(r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0224, code lost:
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022c, code lost:
        if (r8.hasNext() == false) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022e, code lost:
        r7 = (X.C108775dX) r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023c, code lost:
        if ("instagram".equals(r7.A01) == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023e, code lost:
        r14 = java.lang.Integer.valueOf(r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0244, code lost:
        if (r11 != null) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0246, code lost:
        if (r14 == null) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0248, code lost:
        r4.A00.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024d, code lost:
        r8 = r19;
        A04(r8, r4.A01, r4.A0K, r11, com.whatsapp.R.plurals.f9nameremoved, com.whatsapp.R.string.f11nameremoved);
        A04(r8, r4.A02, r4.A0L, r14, com.whatsapp.R.plurals.f9nameremoved, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0272, code lost:
        if (r6.A05 == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0274, code lost:
        r1 = r4.A0X.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x027c, code lost:
        if (X.C86634Kw.A1a(r1) == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0284, code lost:
        if (r1.A0X(1696) == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0288, code lost:
        if (r5.A0S == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1.A0X(3429) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028a, code lost:
        r4.A04.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028f, code lost:
        r1 = r5.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0291, code lost:
        if (r1 == null) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0297, code lost:
        if (r1.isEmpty() != false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0299, code lost:
        r6 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02a1, code lost:
        if (r6.hasNext() == false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a3, code lost:
        r5 = (X.C108835dd) r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ab, code lost:
        if (r5.A04 == false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b5, code lost:
        if ("restaurant_delivery".equals(r5.A03) == false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b7, code lost:
        r1 = r4.A0X.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02bf, code lost:
        if (X.C86634Kw.A1a(r1) == false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c7, code lost:
        if (r1.A0X(4457) == false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c9, code lost:
        r5 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02cb, code lost:
        r1 = android.text.TextUtils.isEmpty(r5);
        r0 = r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d1, code lost:
        if (r1 != false) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d3, code lost:
        r0.setVisibility(0);
        r4.A0O.setText(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02dc, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02de, code lost:
        r4.A04.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e4, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e7, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ea, code lost:
        r4.A0J.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f1, code lost:
        r0.setText(r9);
        r4.A0H.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02fb, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0300, code lost:
        r4.A0N.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0307, code lost:
        r0.setText(r9);
        r7 = r4.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r9 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x030c, code lost:
        if (r10 == 0) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x030e, code lost:
        r1 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0312, code lost:
        if (r10 == 1) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0314, code lost:
        r1 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0317, code lost:
        X.AnonymousClass0x2.A0q(r19, r7, r1);
        r4.A0M.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0323, code lost:
        r1 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0327, code lost:
        r4.A0C.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0330, code lost:
        if (r6.A03 == false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0332, code lost:
        r9 = r5.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0338, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033a, code lost:
        r10 = r4.A0R;
        r8 = r4.A0A;
        r7 = X.AnonymousClass0RP.A00(r8.getContext(), com.whatsapp.R.drawable.avatar_contact);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0351, code lost:
        if (r10.A00.A0X(2185) == false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0353, code lost:
        r8.setTag(com.whatsapp.R.id.optin_for_bitmapool_caching, java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x035b, code lost:
        r10.A01.A02(r7, r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0362, code lost:
        r4.A0A.setImageResource(com.whatsapp.R.drawable.avatar_contact);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x036c, code lost:
        A00(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0371, code lost:
        r4.A09.setVisibility(0);
        r4.A0D.setVisibility(4);
        r0 = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x037f, code lost:
        r26 = r4.A03;
        r4.A06.setVisibility(8);
        r11 = false;
        r4.A0S.setVisibility(0);
        r14 = X.AnonymousClass002.A0I(3);
        r1 = r5.A06;
        r0 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0397, code lost:
        if (r1 == null) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r5.A0Q == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0399, code lost:
        r14.addAll(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x039c, code lost:
        if (r0 == null) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x039e, code lost:
        r14.addAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03a1, code lost:
        r1 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03a3, code lost:
        if (r1 == 0) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03a5, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03a6, code lost:
        if (r1 == 1) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03a9, code lost:
        if (r1 == 2) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ab, code lost:
        X.C109725f5.A00(r4.A0S, r4, r6, r26, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r1 = r4.A0X.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ba, code lost:
        if (r14.isEmpty() != false) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03bc, code lost:
        r13 = r4.A0S;
        r12 = r4.A0R;
        X.C162457s7.A0J(r12, 1);
        r18 = X.C18280x3.A0D(r13);
        r1 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03c9, code lost:
        if (r1 == null) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03cb, code lost:
        r1.A05((X.AnonymousClass7QQ) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03cf, code lost:
        r11 = r13.A01;
        r11.removeAllViews();
        r17 = X.C73723fy.A0J(r14, 3).iterator();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e2, code lost:
        if (r17.hasNext() == false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03e4, code lost:
        r9 = r17.next();
        r16 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03ea, code lost:
        if (r10 >= 0) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (X.C86634Kw.A1a(r1) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f0, code lost:
        throw X.C18280x3.A0X();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03f1, code lost:
        r9 = (java.lang.String) r9;
        X.C162457s7.A0H(r18);
        r8 = r18.inflate(com.whatsapp.R.layout.f8nameremoved, r13, false);
        r8.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
        r8 = (com.facebook.shimmer.ShimmerFrameLayout) r8;
        r15 = X.AnonymousClass0x9.A0F(r8, com.whatsapp.R.id.product_image_view);
        r7 = X.C86664Kz.A11(r8, com.whatsapp.R.id.product_empty_view);
        r7.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0425, code lost:
        if (r12.A00.A0X(2185) == false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0427, code lost:
        r15.setTag(com.whatsapp.R.id.optin_for_bitmapool_caching, java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x042f, code lost:
        r12.A01.A01((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r15, new X.C171998Jf(r8, r7, r12), r9);
        r11.addView(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x044c, code lost:
        if (r10 == X.C86664Kz.A0M(r14)) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x044e, code lost:
        r7 = new android.view.View(r13.getContext());
        X.C86654Ky.A14(r7, r7.getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f6nameremoved), -1);
        r11.addView(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0469, code lost:
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x046d, code lost:
        r4.A0S.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0474, code lost:
        r10 = r4.A0S;
        r9 = r10.A01;
        r9.removeAllViews();
        r1 = X.C18280x3.A0D(r10);
        X.C162457s7.A0D(r1);
        r8 = r1.inflate(com.whatsapp.R.layout.f8nameremoved, r10, false);
        r8.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
        r8 = (com.facebook.shimmer.ShimmerFrameLayout) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0496, code lost:
        if (r11 == false) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0498, code lost:
        X.C18290x4.A0M(r8, com.whatsapp.R.id.product_empty_view).setVisibility(0);
        r8.A05((X.AnonymousClass7QQ) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04a6, code lost:
        r10.A00 = r8;
        r9.addView(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04ad, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r1.A0X(3361) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r1 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r9 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r7 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r8 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r9 != false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r8 != false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r7 == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        r7 = r4.A03;
        r4.A06.setVisibility(0);
        r4.A0S.setVisibility(8);
        r8 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r8 == 0) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r8 == 1) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r8 != 2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        r4.A07.setVisibility(0);
        r4.A0D.setVisibility(4);
        r0 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        r0.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r5.A0P == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r4.A0B.A0a(X.AnonymousClass32Y.A08(r5.A0F)) == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0097, code lost:
        A00(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        X.C109725f5.A00(r4.A06, r4, r6, r7, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a1, code lost:
        r1 = r4.A0P;
        r1.A00 = r6.A06;
        r1.A09 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (r6.A03 == false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        if (r4.A0B.A0a(X.AnonymousClass32Y.A08(r5.A0F)) == false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        X.C70323aJ.A00(r4.A0Z, r4, r4.A03.getContext(), r4.A0A, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cc, code lost:
        r4.A0A.setVisibility(X.AnonymousClass001.A08(r6.A04 ? 1 : 0));
        r4.A0C.setText(r5.A0I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
        if (r5.A08 != 2) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        r4.A0C.A0F(X.AnonymousClass29N.A00(r4.A0W), com.whatsapp.R.dimen.f6nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r10 = r5.A07;
        r9 = X.AnonymousClass5ZZ.A02(r19, r10);
        r1 = android.text.TextUtils.isEmpty(r9);
        r8 = 8;
        r0 = r4.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        if (r1 == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0103, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0106, code lost:
        r7 = r5.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0108, code lost:
        if (r7 == null) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010a, code lost:
        r1 = r4.A0X.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0112, code lost:
        if (X.C86634Kw.A1a(r1) == false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011a, code lost:
        if (r1.A0X(4457) == false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011c, code lost:
        r4.A0N.setVisibility(0);
        r4.A0N.setText(r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012c, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0135, code lost:
        if (r4.A0N.getVisibility() == 0) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0137, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0138, code lost:
        r0 = r4.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013a, code lost:
        if (r1 == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013c, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013d, code lost:
        r0.setVisibility(r8);
        r7 = r5.A0L;
        r0 = r7.isEmpty();
        r1 = r4.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0148, code lost:
        if (r0 != false) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014a, code lost:
        r1.setText(android.text.TextUtils.join(", ", r7));
        r4.A0I.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0158, code lost:
        r9 = r5.A0D;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015f, code lost:
        if (r5.A06() == false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0161, code lost:
        r9 = ((X.C108765dW) r5.A0K.get(0)).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016b, code lost:
        r1 = android.text.TextUtils.isEmpty(r9);
        r0 = r4.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0171, code lost:
        if (r1 == false) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0173, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0176, code lost:
        r8 = r6.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r5.A0R == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0178, code lost:
        if (r8 == false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017a, code lost:
        r11 = X.AnonymousClass5ZZ.A01(r6.A07, X.C86624Kv.A0H(r5.A0C, r5.A0B.doubleValue()));
        r4.A0J.setText(X.AnonymousClass5A8.A00(r19, X.C620733j.A02(r4.A0V), r11));
        r4.A0J.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a6, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a8, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a9, code lost:
        if (r8 != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ab, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ac, code lost:
        r0 = r4.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ae, code lost:
        if (r1 != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b0, code lost:
        r7 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r1 = r4.A0X.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b2, code lost:
        r0.setVisibility(r7);
        X.C109705f3.A00(r4.A0E, r4, r6, 27);
        r9 = r4.A0B;
        r8 = r5.A0F;
        r7 = com.whatsapp.jid.UserJid.Companion;
        r4.A0E.setEnabled(!r9.A0a(r7.A0E(r8)));
        r4.A03.setEnabled(!r9.A0a(r7.A0E(r8)));
        X.C109705f3.A00(r4.A03, r4, r6, 28);
        r4.A00.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ee, code lost:
        if (r6.A05 == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f0, code lost:
        r1 = r4.A0X.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f8, code lost:
        if (X.C86634Kw.A1a(r1) == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0200, code lost:
        if (r1.A0X(1564) == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0202, code lost:
        r9 = r5.A0N;
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x020c, code lost:
        if (r8.hasNext() == false) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020e, code lost:
        r7 = (X.C108775dX) r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (X.C86634Kw.A1a(r1) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C96414wK r28) {
        /*
            r27 = this;
            r6 = r28
            X.5e1 r5 = r6.A0B
            r4 = r27
            android.view.View r0 = r4.A03
            android.content.Context r19 = r0.getContext()
            boolean r2 = r6.A0D
            r3 = 0
            if (r2 == 0) goto L_0x0016
            boolean r0 = r5.A0P
            r9 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0016:
            r9 = 0
            if (r2 == 0) goto L_0x0030
        L_0x0019:
            boolean r0 = r5.A0R
            if (r0 == 0) goto L_0x0030
            X.5Up r0 = r4.A0X
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x0030
            r0 = 3429(0xd65, float:4.805E-42)
            boolean r0 = r1.A0X(r0)
            r8 = 1
            if (r0 != 0) goto L_0x004c
        L_0x0030:
            r8 = 0
            if (r2 == 0) goto L_0x004c
            if (r9 != 0) goto L_0x004c
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x004c
            X.5Up r0 = r4.A0X
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x004c
            r0 = 3361(0xd21, float:4.71E-42)
            boolean r0 = r1.A0X(r0)
            r7 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            android.view.ViewGroup r1 = r4.A05
            r2 = 8
            if (r9 != 0) goto L_0x0059
            if (r7 != 0) goto L_0x0059
            r0 = 8
            if (r8 == 0) goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r1.setVisibility(r0)
            if (r9 != 0) goto L_0x037f
            if (r8 != 0) goto L_0x037f
            if (r7 == 0) goto L_0x00a1
            android.view.View r7 = r4.A03
            android.view.ViewGroup r0 = r4.A06
            r0.setVisibility(r3)
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r4.A0S
            r0.setVisibility(r2)
            int r8 = r5.A01
            r1 = 4
            if (r8 == 0) goto L_0x0371
            r0 = 1
            if (r8 == r0) goto L_0x036c
            r0 = 2
            if (r8 != r0) goto L_0x0089
            android.view.ViewGroup r0 = r4.A07
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r4.A0D
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r4.A09
        L_0x0086:
            r0.setVisibility(r1)
        L_0x0089:
            X.2sr r1 = r4.A0B
            java.lang.String r0 = r5.A0F
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x009a
            A00(r4, r6)
        L_0x009a:
            android.view.ViewGroup r1 = r4.A06
            r0 = 10
            X.C109725f5.A00(r1, r4, r6, r7, r0)
        L_0x00a1:
            X.5U9 r1 = r4.A0P
            int r0 = r6.A06
            r1.A00 = r0
            java.lang.String r0 = r6.A02
            r1.A09 = r0
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x032e
            X.2sr r1 = r4.A0B
            java.lang.String r0 = r5.A0F
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x032e
            android.view.View r0 = r4.A03
            android.content.Context r8 = r0.getContext()
            com.whatsapp.CircleWaImageView r7 = r4.A0A
            X.4FS r1 = r4.A0Z
            r0 = 10
            X.C70323aJ.A00(r1, r4, r8, r7, r0)
        L_0x00cc:
            com.whatsapp.CircleWaImageView r1 = r4.A0A
            boolean r0 = r6.A04
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            com.whatsapp.TextEmojiLabel r1 = r4.A0C
            java.lang.String r0 = r5.A0I
            r1.setText(r0)
            int r1 = r5.A08
            r0 = 2
            if (r1 != r0) goto L_0x0327
            X.1VX r0 = r4.A0W
            int r7 = X.AnonymousClass29N.A00(r0)
            com.whatsapp.TextEmojiLabel r1 = r4.A0C
            r0 = 2131166868(0x7f070694, float:1.7947994E38)
            r1.A0F(r7, r0)
        L_0x00f1:
            int r10 = r5.A07
            r0 = r19
            java.lang.String r9 = X.AnonymousClass5ZZ.A02(r0, r10)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r8 = 8
            com.whatsapp.WaTextView r0 = r4.A0M
            if (r1 == 0) goto L_0x0307
            r0.setVisibility(r2)
        L_0x0106:
            X.7y6 r7 = r5.A09
            if (r7 == 0) goto L_0x0300
            X.5Up r0 = r4.A0X
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x0300
            r0 = 4457(0x1169, float:6.246E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0300
            com.whatsapp.WaTextView r0 = r4.A0N
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r1 = r4.A0N
            java.lang.String r0 = r7.A02
            r1.setText(r0)
        L_0x0128:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0137
            com.whatsapp.WaTextView r0 = r4.A0N
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x0138
        L_0x0137:
            r1 = 0
        L_0x0138:
            com.whatsapp.WaImageView r0 = r4.A0G
            if (r1 == 0) goto L_0x013d
            r8 = 0
        L_0x013d:
            r0.setVisibility(r8)
            java.util.List r7 = r5.A0L
            boolean r0 = r7.isEmpty()
            com.whatsapp.WaTextView r1 = r4.A0I
            if (r0 != 0) goto L_0x02fb
            java.lang.String r0 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r0, r7)
            r1.setText(r0)
            com.whatsapp.WaTextView r0 = r4.A0I
            r0.setVisibility(r3)
        L_0x0158:
            java.lang.String r9 = r5.A0D
            boolean r0 = r5.A06()
            r7 = 0
            if (r0 == 0) goto L_0x016b
            java.util.List r0 = r5.A0K
            java.lang.Object r0 = r0.get(r3)
            X.5dW r0 = (X.C108765dW) r0
            java.lang.String r9 = r0.A03
        L_0x016b:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            com.whatsapp.WaTextView r0 = r4.A0H
            if (r1 == 0) goto L_0x02f1
            r0.setVisibility(r2)
        L_0x0176:
            boolean r8 = r6.A0C
            if (r8 == 0) goto L_0x02ea
            com.google.android.gms.maps.model.LatLng r11 = r6.A07
            java.lang.Double r0 = r5.A0B
            double r0 = r0.doubleValue()
            java.lang.Double r10 = r5.A0C
            com.google.android.gms.maps.model.LatLng r0 = X.C86624Kv.A0H(r10, r0)
            float r11 = X.AnonymousClass5ZZ.A01(r11, r0)
            com.whatsapp.WaTextView r10 = r4.A0J
            X.33j r0 = r4.A0V
            java.util.Locale r1 = X.C620733j.A02(r0)
            r0 = r19
            java.lang.String r0 = X.AnonymousClass5A8.A00(r0, r1, r11)
            r10.setText(r0)
            com.whatsapp.WaTextView r0 = r4.A0J
            r0.setVisibility(r3)
        L_0x01a2:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x01ab
            r1 = 1
            if (r8 != 0) goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            com.whatsapp.WaImageView r0 = r4.A0F
            if (r1 != 0) goto L_0x01b2
            r7 = 8
        L_0x01b2:
            r0.setVisibility(r7)
            com.whatsapp.WaImageButton r1 = r4.A0E
            r0 = 27
            X.C109705f3.A00(r1, r4, r6, r0)
            X.2sr r9 = r4.A0B
            java.lang.String r8 = r5.A0F
            X.32Y r7 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r7.A0E(r8)
            boolean r0 = r9.A0a(r0)
            com.whatsapp.WaImageButton r1 = r4.A0E
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            android.view.View r1 = r4.A03
            com.whatsapp.jid.UserJid r0 = r7.A0E(r8)
            boolean r0 = r9.A0a(r0)
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            android.view.View r1 = r4.A03
            r0 = 28
            X.C109705f3.A00(r1, r4, r6, r0)
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0270
            X.5Up r0 = r4.A0X
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x0270
            r0 = 1564(0x61c, float:2.192E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0270
            java.util.List r9 = r5.A0N
            java.util.Iterator r8 = r9.iterator()
        L_0x0208:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02e7
            java.lang.Object r7 = r8.next()
            X.5dX r7 = (X.C108775dX) r7
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "facebook"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0208
            int r0 = r7.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x0224:
            java.util.Iterator r8 = r9.iterator()
        L_0x0228:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02e4
            java.lang.Object r7 = r8.next()
            X.5dX r7 = (X.C108775dX) r7
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0228
            int r0 = r7.A00
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x0244:
            if (r11 != 0) goto L_0x0248
            if (r14 == 0) goto L_0x024d
        L_0x0248:
            android.view.View r0 = r4.A00
            r0.setVisibility(r3)
        L_0x024d:
            r12 = 2131755019(0x7f10000b, float:1.9140905E38)
            r13 = 2131889291(0x7f120c8b, float:1.9413241E38)
            com.whatsapp.WaTextView r1 = r4.A0K
            android.view.View r0 = r4.A01
            r7 = r4
            r8 = r19
            r9 = r0
            r10 = r1
            r7.A04(r8, r9, r10, r11, r12, r13)
            r15 = 2131755020(0x7f10000c, float:1.9140907E38)
            r16 = 2131890199(0x7f121017, float:1.9415083E38)
            com.whatsapp.WaTextView r1 = r4.A0L
            android.view.View r0 = r4.A02
            r10 = r4
            r11 = r8
            r12 = r0
            r13 = r1
            r10.A04(r11, r12, r13, r14, r15, r16)
        L_0x0270:
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x02de
            X.5Up r0 = r4.A0X
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x02de
            r0 = 1696(0x6a0, float:2.377E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x02de
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x02de
            android.view.View r0 = r4.A04
            r0.setVisibility(r3)
        L_0x028f:
            java.util.List r1 = r5.A0O
            if (r1 == 0) goto L_0x02dc
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02dc
            java.util.Iterator r6 = r1.iterator()
        L_0x029d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02dc
            java.lang.Object r5 = r6.next()
            X.5dd r5 = (X.C108835dd) r5
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x029d
            java.lang.String r1 = "restaurant_delivery"
            java.lang.String r0 = r5.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x029d
            X.5Up r0 = r4.A0X
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x029d
            r0 = 4457(0x1169, float:6.246E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x029d
            java.lang.String r5 = r5.A02
        L_0x02cb:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            android.widget.LinearLayout r0 = r4.A08
            if (r1 != 0) goto L_0x04ad
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r4.A0O
            r0.setText(r5)
            return
        L_0x02dc:
            r5 = 0
            goto L_0x02cb
        L_0x02de:
            android.view.View r0 = r4.A04
            r0.setVisibility(r2)
            goto L_0x028f
        L_0x02e4:
            r14 = 0
            goto L_0x0244
        L_0x02e7:
            r11 = 0
            goto L_0x0224
        L_0x02ea:
            com.whatsapp.WaTextView r0 = r4.A0J
            r0.setVisibility(r2)
            goto L_0x01a2
        L_0x02f1:
            r0.setText(r9)
            com.whatsapp.WaTextView r0 = r4.A0H
            r0.setVisibility(r3)
            goto L_0x0176
        L_0x02fb:
            r1.setVisibility(r2)
            goto L_0x0158
        L_0x0300:
            com.whatsapp.WaTextView r0 = r4.A0N
            r0.setVisibility(r2)
            goto L_0x0128
        L_0x0307:
            r0.setText(r9)
            com.whatsapp.WaTextView r7 = r4.A0M
            if (r10 == 0) goto L_0x0323
            r0 = 1
            r1 = 2131099943(0x7f060127, float:1.7812253E38)
            if (r10 == r0) goto L_0x0317
            r1 = 2131101333(0x7f060695, float:1.7815073E38)
        L_0x0317:
            r0 = r19
            X.AnonymousClass0x2.A0q(r0, r7, r1)
            com.whatsapp.WaTextView r0 = r4.A0M
            r0.setVisibility(r3)
            goto L_0x0106
        L_0x0323:
            r1 = 2131099942(0x7f060126, float:1.7812251E38)
            goto L_0x0317
        L_0x0327:
            com.whatsapp.TextEmojiLabel r0 = r4.A0C
            r0.A0E()
            goto L_0x00f1
        L_0x032e:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0362
            java.lang.String r9 = r5.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0362
            X.2Xd r10 = r4.A0R
            com.whatsapp.CircleWaImageView r8 = r4.A0A
            android.content.Context r1 = r8.getContext()
            r0 = 2131231006(0x7f08011e, float:1.807808E38)
            android.graphics.drawable.Drawable r7 = X.AnonymousClass0RP.A00(r1, r0)
            X.1VX r1 = r10.A00
            r0 = 2185(0x889, float:3.062E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x035b
            r1 = 2131431953(0x7f0b1211, float:1.848565E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.setTag(r1, r0)
        L_0x035b:
            X.2pB r0 = r10.A01
            r0.A02(r7, r7, r8, r9)
            goto L_0x00cc
        L_0x0362:
            com.whatsapp.CircleWaImageView r1 = r4.A0A
            r0 = 2131231006(0x7f08011e, float:1.807808E38)
            r1.setImageResource(r0)
            goto L_0x00cc
        L_0x036c:
            A00(r4, r6)
            goto L_0x0089
        L_0x0371:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r4.A09
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r4.A0D
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r4.A07
            goto L_0x0086
        L_0x037f:
            android.view.View r0 = r4.A03
            r26 = r0
            android.view.ViewGroup r0 = r4.A06
            r0.setVisibility(r2)
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r4.A0S
            r11 = 0
            r0.setVisibility(r3)
            r0 = 3
            java.util.ArrayList r14 = X.AnonymousClass002.A0I(r0)
            java.util.List r1 = r5.A06
            java.util.List r0 = r5.A05
            if (r1 == 0) goto L_0x039c
            r14.addAll(r1)
        L_0x039c:
            if (r0 == 0) goto L_0x03a1
            r14.addAll(r0)
        L_0x03a1:
            int r1 = r5.A01
            if (r1 == 0) goto L_0x0474
            r11 = 1
            if (r1 == r11) goto L_0x03b6
            r0 = 2
            if (r1 == r0) goto L_0x0474
        L_0x03ab:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r7 = r4.A0S
            r1 = 11
            r0 = r26
            X.C109725f5.A00(r7, r4, r6, r0, r1)
            goto L_0x00a1
        L_0x03b6:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x046d
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r13 = r4.A0S
            X.2Xd r12 = r4.A0R
            X.C162457s7.A0J(r12, r11)
            android.view.LayoutInflater r18 = X.C18280x3.A0D(r13)
            com.facebook.shimmer.ShimmerFrameLayout r1 = r13.A00
            if (r1 == 0) goto L_0x03cf
            r0 = 0
            r1.A05(r0)
        L_0x03cf:
            android.widget.LinearLayout r11 = r13.A01
            r11.removeAllViews()
            r0 = 3
            java.util.List r0 = X.C73723fy.A0J(r14, r0)
            java.util.Iterator r17 = r0.iterator()
            r10 = 0
        L_0x03de:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x03ab
            java.lang.Object r9 = r17.next()
            int r16 = r10 + 1
            if (r10 >= 0) goto L_0x03f1
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x03f1:
            java.lang.String r9 = (java.lang.String) r9
            X.C162457s7.A0H(r18)
            r1 = 2131624252(0x7f0e013c, float:1.8875678E38)
            r0 = r18
            android.view.View r8 = r0.inflate(r1, r13, r3)
            r7 = -1
            r1 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r7, r7, r1)
            r8.setLayoutParams(r0)
            com.facebook.shimmer.ShimmerFrameLayout r8 = (com.facebook.shimmer.ShimmerFrameLayout) r8
            r0 = 2131432664(0x7f0b14d8, float:1.8487092E38)
            android.widget.ImageView r15 = X.AnonymousClass0x9.A0F(r8, r0)
            r0 = 2131432661(0x7f0b14d5, float:1.8487086E38)
            com.whatsapp.WaImageView r7 = X.C86664Kz.A11(r8, r0)
            r7.setVisibility(r2)
            X.1VX r1 = r12.A00
            r0 = 2185(0x889, float:3.062E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x042f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            r15.setTag(r0, r1)
        L_0x042f:
            X.2pB r1 = r12.A01
            r21 = 0
            X.8Jf r0 = new X.8Jf
            r0.<init>(r8, r7, r12)
            r20 = r1
            r22 = r21
            r23 = r15
            r24 = r0
            r25 = r9
            r20.A01(r21, r22, r23, r24, r25)
            r11.addView(r8)
            int r0 = X.C86664Kz.A0M(r14)
            if (r10 == r0) goto L_0x0469
            android.content.Context r0 = r13.getContext()
            android.view.View r7 = new android.view.View
            r7.<init>(r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166241(0x7f070421, float:1.7946722E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = -1
            X.C86654Ky.A14(r7, r1, r0)
            r11.addView(r7)
        L_0x0469:
            r10 = r16
            goto L_0x03de
        L_0x046d:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r4.A0S
            r0.setVisibility(r2)
            goto L_0x03ab
        L_0x0474:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r10 = r4.A0S
            android.widget.LinearLayout r9 = r10.A01
            r9.removeAllViews()
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r10)
            X.C162457s7.A0D(r1)
            r0 = 2131624252(0x7f0e013c, float:1.8875678E38)
            android.view.View r8 = r1.inflate(r0, r10, r3)
            r7 = -1
            r1 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r7, r7, r1)
            r8.setLayoutParams(r0)
            com.facebook.shimmer.ShimmerFrameLayout r8 = (com.facebook.shimmer.ShimmerFrameLayout) r8
            if (r11 == 0) goto L_0x04a6
            r0 = 2131432661(0x7f0b14d5, float:1.8487086E38)
            android.view.View r0 = X.C18290x4.A0M(r8, r0)
            r0.setVisibility(r3)
            r0 = 0
            r8.A05(r0)
        L_0x04a6:
            r10.A00 = r8
            r9.addView(r8)
            goto L_0x03ab
        L_0x04ad:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UV.A06(X.4wK):void");
    }

    public void A07(C96414wK r13) {
        C186368vB r0 = r13.A0A;
        if (r0 != null) {
            AnonymousClass5PS r1 = this.A0Y;
            int BiA = r0.BiA();
            r1.A01(r0.Bh8(), AnonymousClass0x7.A0h(), r0.Bi2(), r0.Bku(), r0.Bkw(), r0.BiB(), r0.BhS(), r0.BLV(), BiA, r0.B2X());
        }
    }

    public AnonymousClass5UV(C56972sr r2, AnonymousClass5U9 r3, AnonymousClass5QM r4, C44702Xd r5, C613330g r6, C54292oU r7, C620733j r8, AnonymousClass1VX r9, C105355Up r10, AnonymousClass5PS r11, AnonymousClass4FS r12) {
        this.A0W = r9;
        this.A0U = r7;
        this.A0B = r2;
        this.A0Z = r12;
        this.A0R = r5;
        this.A0V = r8;
        this.A0X = r10;
        this.A0Q = r4;
        this.A0P = r3;
        this.A0T = r6;
        this.A0Y = r11;
    }
}
