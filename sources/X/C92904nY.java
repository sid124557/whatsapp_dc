package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4nY  reason: invalid class name and case insensitive filesystem */
public class C92904nY extends C93244oC {
    public AnonymousClass7CY A00;
    public AnonymousClass5XF A01;
    public AnonymousClass7KZ A02;
    public boolean A03;
    public boolean A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final FrameLayout A08;
    public final LinearLayout A09;
    public final TextView A0A = C18300x5.A0G(this, R.id.control_btn);
    public final TextView A0B;
    public final TextView A0C;
    public final TextEmojiLabel A0D;
    public final TextEmojiLabel A0E;
    public final TextEmojiLabel A0F;
    public final TextEmojiLabel A0G;
    public final TextAndDateLayout A0H;
    public final ConversationRowImage$RowImageView A0I = ((ConversationRowImage$RowImageView) C06560Yg.A02(this, R.id.image));
    public final C185528tp A0J = new C100465Ba(this, 8);
    public final AnonymousClass5UY A0K;
    public final AnonymousClass5UY A0L;

    public void A1H() {
        A1t(false);
        A00(false);
    }

    private void A00(boolean z) {
        int A002;
        C30771mz r3 = (C30771mz) ((C30471mV) this.A0S);
        AnonymousClass33C A003 = C30471mV.A00(r3);
        if (z) {
            this.A0A.setTag(Collections.singletonList(r3));
        }
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A0I;
        conversationRowImage$RowImageView.setImageBitmap((Bitmap) null);
        conversationRowImage$RowImageView.setImageData(new AnonymousClass33C(A003));
        conversationRowImage$RowImageView.setInAlbum(false);
        conversationRowImage$RowImageView.setFullWidth(C87094Nz.A0h(this));
        conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
        if (C87094Nz.A0m(this)) {
            View view = this.A05;
            view.setVisibility(0);
            AnonymousClass5UY r12 = this.A0L;
            AnonymousClass5UY r5 = this.A0K;
            TextView textView = this.A0A;
            C93244oC.A04(view, textView, r12, r5, true, !z, false, false);
            C18300x5.A13(getContext(), conversationRowImage$RowImageView, R.string.f11nameremoved);
            if (r3.A1J.A02) {
                conversationRowImage$RowImageView.setOnClickListener(this.A0B);
            } else {
                conversationRowImage$RowImageView.setOnClickListener((View.OnClickListener) null);
            }
            C109665ez r52 = this.A08;
            textView.setOnClickListener(r52);
            r12.A07(r52);
        } else {
            boolean A0j = C87094Nz.A0j(this);
            View view2 = this.A05;
            if (A0j) {
                view2.setVisibility(8);
                AnonymousClass5UY r8 = this.A0L;
                AnonymousClass5UY r53 = this.A0K;
                TextView textView2 = this.A0A;
                C93244oC.A04(view2, textView2, r8, r53, false, false, false, false);
                C18300x5.A13(getContext(), conversationRowImage$RowImageView, R.string.f11nameremoved);
                C109665ez r54 = this.A0B;
                textView2.setOnClickListener(r54);
                conversationRowImage$RowImageView.setOnClickListener(r54);
            } else {
                view2.setVisibility(0);
                AnonymousClass5UY r82 = this.A0L;
                AnonymousClass5UY r55 = this.A0K;
                TextView textView3 = this.A0A;
                View view3 = view2;
                TextView textView4 = textView3;
                C93244oC.A04(view3, textView4, r82, r55, false, !z, false, false);
                conversationRowImage$RowImageView.setContentDescription((CharSequence) null);
                if (!C87094Nz.A0k(this)) {
                    textView3.setText(R.string.f11nameremoved);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                    textView3.setOnClickListener(this.A0A);
                    conversationRowImage$RowImageView.setOnClickListener(this.A0B);
                } else {
                    A1c(textView4, (Integer) null, Collections.singletonList(r3), r3.A00);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                    C109665ez r56 = this.A09;
                    textView3.setOnClickListener(r56);
                    conversationRowImage$RowImageView.setOnClickListener(r56);
                }
            }
        }
        A1L();
        C93314oJ.A0q(conversationRowImage$RowImageView, this);
        SpannableString A004 = this.A01.A00(r3);
        String str = r3.A09;
        String str2 = r3.A02;
        String str3 = r3.A05;
        Resources A0G2 = C18290x4.A0G(this);
        TextEmojiLabel textEmojiLabel = this.A0G;
        textEmojiLabel.setTextSize(getTextFontSize());
        TextEmojiLabel textEmojiLabel2 = this.A0D;
        textEmojiLabel2.setTextSize(this.A0y.A03(getResources(), -1));
        textEmojiLabel2.A0A();
        textEmojiLabel2.setTextColor(getSecondaryTextColor());
        textEmojiLabel2.setVisibility(8);
        TextAndDateLayout textAndDateLayout = this.A0H;
        textAndDateLayout.setMaxTextLineCount(2);
        textAndDateLayout.invalidate();
        if (!TextUtils.isEmpty(str)) {
            setMessageText(str, textEmojiLabel, r3);
            textEmojiLabel.setVisibility(0);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        View A022 = C06560Yg.A02(this, R.id.product_content_layout);
        boolean z2 = r3.A1J.A02;
        if (z2 || AnonymousClass31H.A01(r3)) {
            A022.setVisibility(8);
            this.A07.setVisibility(0);
        } else if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            boolean isEmpty = TextUtils.isEmpty(str2);
            TextEmojiLabel textEmojiLabel3 = this.A0E;
            if (!isEmpty) {
                setMessageText(str2, textEmojiLabel3, r3);
                textEmojiLabel3.setVisibility(0);
            } else {
                textEmojiLabel3.setVisibility(8);
            }
            boolean isEmpty2 = TextUtils.isEmpty(str3);
            TextEmojiLabel textEmojiLabel4 = this.A0F;
            if (!isEmpty2) {
                A1d(textEmojiLabel4, r3, str3, true, false);
                textEmojiLabel4.setVisibility(0);
            } else {
                textEmojiLabel4.setVisibility(8);
            }
            A022.setVisibility(0);
            this.A07.setVisibility(8);
        } else {
            A022.setVisibility(8);
        }
        A1i(r3);
        if (!TextUtils.isEmpty(A004)) {
            TextEmojiLabel textEmojiLabel5 = textEmojiLabel2;
            textEmojiLabel5.A0H(C107075ae.A00, A004, getHighlightTerms(), 300, false);
            textEmojiLabel2.setVisibility(0);
        } else if (!TextUtils.isEmpty(str)) {
            textEmojiLabel.setVisibility(8);
            textAndDateLayout.setMaxTextLineCount(1);
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.A0J(str, (List) null, 150, false);
            textEmojiLabel2.setTextSize(getTextFontSize());
            textEmojiLabel2.getContext();
            textEmojiLabel2.setTypeface(C106905aM.A00());
            C18320x8.A11(A0G2, textEmojiLabel2, AnonymousClass5Yj.A02(textEmojiLabel2.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
        conversationRowImage$RowImageView.setOutgoing(z2);
        conversationRowImage$RowImageView.A0E = false;
        int i = A003.A08;
        if (i == 0 || (A002 = A003.A06) == 0) {
            i = 100;
            A002 = C33141sV.A00(r3, 100);
            if (A002 <= 0) {
                i = (int) (C86604Kt.A00(getContext()) * 83.333336f);
                A002 = (i * 9) / 16;
            }
        }
        conversationRowImage$RowImageView.A04(i, A002);
        C86644Kx.A1A(conversationRowImage$RowImageView);
        if (!z && this.A04) {
            this.A22.A0G(r3);
        }
        this.A04 = false;
        this.A22.A09(conversationRowImage$RowImageView, r3, this.A0J);
        this.A02.A02.A0X(3544);
        this.A02.A02.A0X(3545);
        A1l(r3);
    }

    public void A0v() {
        if (!this.A03) {
            this.A03 = true;
            C88864av A0C2 = C87094Nz.A0C(this);
            C64333Db r2 = A0C2.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A2 = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A2, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C2, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A2, r2, A0C2, this, C86604Kt.A0i(r2));
            C87094Nz.A0P(A0A2, r2, this);
            this.A01 = (AnonymousClass5XF) r2.A4f.get();
            this.A02 = A0C2.A42();
            this.A00 = (AnonymousClass7CY) A0C2.A07.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0.exists() == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1N() {
        /*
            r7 = this;
            X.5ZR r0 = r7.A02
            if (r0 == 0) goto L_0x000b
            boolean r0 = X.C87094Nz.A0l(r7)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            X.34x r6 = r7.A0S
            X.1mV r6 = (X.C30471mV) r6
            X.1mz r6 = (X.C30771mz) r6
            X.33C r5 = X.C30471mV.A00(r6)
            X.2z0 r0 = r6.A1J
            boolean r4 = r0.A02
            if (r4 != 0) goto L_0x0020
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            java.io.File r0 = r5.A0F
            r3 = 0
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.exists()
            r2 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "viewmessage/ from_me:"
            r1.append(r0)
            X.C87094Nz.A0e(r5, r6, r1, r4)
            if (r2 != 0) goto L_0x0047
            boolean r0 = r7.A27()
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "viewmessage/ no file to download from receiver side"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0047:
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r7.A0I
            r7.A1W(r0, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92904nY.A1N():void");
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A00(A1W);
        }
    }

    public int getBroadcastDrawableId() {
        if (C86614Ku.A1Z((C30471mV) this.A0S)) {
            return R.drawable.broadcast_status_icon_onmedia;
        }
        return R.drawable.broadcast_status_icon;
    }

    public TextView getDateView() {
        C30771mz r1 = (C30771mz) ((C30471mV) this.A0S);
        if ((!TextUtils.isEmpty(r1.A02) || !TextUtils.isEmpty(r1.A05)) && !r1.A1J.A02 && !AnonymousClass31H.A01(r1)) {
            return this.A0B;
        }
        return this.A0C;
    }

    public ViewGroup getDateWrapper() {
        C30771mz r1 = (C30771mz) ((C30471mV) this.A0S);
        if ((!TextUtils.isEmpty(r1.A02) || !TextUtils.isEmpty(r1.A05)) && !r1.A1J.A02 && !AnonymousClass31H.A01(r1)) {
            return this.A06;
        }
        return this.A07;
    }

    public C30771mz getFMessage() {
        return (C30771mz) ((C30471mV) this.A0S);
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30771mz);
        super.setFMessage(r2);
    }

    public C92904nY(Context context, AnonymousClass677 r9, C30771mz r10) {
        super(context, r9, r10);
        A0v();
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(this, R.id.progress_bar);
        this.A0L = A0M;
        A0M.A09(new AnonymousClass92F(5));
        this.A0K = AnonymousClass0x2.A0M(this, R.id.cancel_download);
        this.A05 = C06560Yg.A02(this, R.id.control_frame);
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(this, R.id.caption);
        this.A0D = A0K2;
        this.A0H = (TextAndDateLayout) C06560Yg.A02(this, R.id.text_and_date);
        TextEmojiLabel A0K3 = AnonymousClass0x7.A0K(this, R.id.view_product_btn);
        TextEmojiLabel A0K4 = AnonymousClass0x7.A0K(this, R.id.product_title);
        this.A0G = A0K4;
        this.A0E = AnonymousClass0x7.A0K(this, R.id.product_body);
        this.A0F = AnonymousClass0x7.A0K(this, R.id.product_footer);
        FrameLayout A0L2 = C86654Ky.A0L(this, R.id.product_content_date_layout);
        this.A08 = A0L2;
        this.A07 = C86644Kx.A0I(this, R.id.date_wrapper);
        this.A0C = C18300x5.A0G(this, R.id.date);
        this.A06 = C86644Kx.A0I(A0L2, R.id.date_wrapper);
        this.A0B = C18300x5.A0G(A0L2, R.id.date);
        LinearLayout A0N = C86654Ky.A0N(this, R.id.product_message_view);
        this.A09 = A0N;
        AnonymousClass0x2.A14(this.A0O, A0K2);
        A0K2.setAutoLinkMask(0);
        A0K2.setLinksClickable(false);
        A0K2.setFocusable(false);
        A0K2.setLongClickable(false);
        A0K3.A0K((List) null, getContext().getString(R.string.f11nameremoved));
        A0K4.setAutoLinkMask(0);
        A0K4.setLinksClickable(false);
        A0K4.setFocusable(false);
        A0K4.setLongClickable(false);
        C93314oJ.A0q(A0N, this);
        C109345eT.A00(A0N, this, 30);
        A00(true);
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A0I;
        boolean isPressed = isPressed();
        if (conversationRowImage$RowImageView.A0J != isPressed) {
            conversationRowImage$RowImageView.A0J = isPressed;
            conversationRowImage$RowImageView.A02();
            conversationRowImage$RowImageView.invalidate();
        }
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this)) {
            return 0;
        }
        int A052 = C87094Nz.A05(this);
        int i = 72;
        if (this.A0W) {
            i = 100;
        }
        return Math.min(A052, AnonymousClass5YO.A01(getContext(), i));
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
