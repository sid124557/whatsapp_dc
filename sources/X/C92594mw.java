package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4mw  reason: invalid class name and case insensitive filesystem */
public class C92594mw extends C93314oJ {
    public C71333bw A00;
    public C103115Lp A01;
    public C1907099n A02;
    public AnonymousClass9Tp A03;
    public C55942rA A04;
    public boolean A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final WaFrameLayout A08;
    public final WaTextView A09;
    public final WaTextView A0A;
    public final ThumbnailButton A0B = ((ThumbnailButton) findViewById(R.id.thumb));
    public final AnonymousClass5UY A0C;

    private String getOrderMessageBtnTextForBuyer() {
        boolean A052 = this.A03.A05();
        Context context = getContext();
        int i = R.string.f11nameremoved;
        if (A052) {
            i = R.string.f11nameremoved;
        }
        return context.getString(i);
    }

    private String getOrderMessageBtnTextForSeller() {
        boolean A052 = this.A03.A05();
        Context context = getContext();
        int i = R.string.f11nameremoved;
        if (A052) {
            i = R.string.f11nameremoved;
        }
        return context.getString(i);
    }

    public void A0v() {
        if (!this.A05) {
            this.A05 = true;
            C88864av A0C2 = C87094Nz.A0C(this);
            C64333Db r3 = A0C2.A0K;
            C87094Nz.A0W(r3, this);
            C87094Nz.A0X(r3, this);
            C87094Nz.A0Y(r3, this);
            C87094Nz.A0Z(r3, this);
            C87094Nz.A0a(r3, this, C87094Nz.A0D(r3));
            C116985rC A0A2 = C87094Nz.A0A(r3, this);
            C87094Nz.A0R(r3, r3.A00, this);
            C87094Nz.A0M(A0A2, r3, this, r3.A4V);
            C88834as r1 = A0C2.A0I;
            C87094Nz.A0Q(r1, r3, this);
            C87094Nz.A0b(r3, this, C87094Nz.A0E(r3));
            C87094Nz.A0I(A0A2, r3, A0C2, this, C86604Kt.A0i(r3));
            C87094Nz.A0L(A0A2, r3, this);
            this.A01 = (C103115Lp) r3.A00.A8P.get();
            this.A03 = r1.ACq();
            this.A02 = C86614Ku.A0e(r3);
            this.A04 = (C55942rA) r3.AOm.get();
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r2 == 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A22() {
        /*
            r5 = this;
            X.34x r4 = r5.A0S
            X.1nD r4 = (X.C30821nD) r4
            r5.setThumbnail(r4)
            com.whatsapp.WaTextView r1 = r5.A0A
            X.33j r0 = r5.A0M
            java.lang.String r0 = X.C107315b6.A03(r0, r4)
            X.C86664Kz.A1T(r1, r0)
            android.content.Context r1 = r5.getContext()
            X.33j r0 = r5.A0M
            java.lang.String r3 = X.C107315b6.A02(r1, r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r2 = 0
            com.whatsapp.WaTextView r1 = r5.A09
            if (r0 == 0) goto L_0x0067
            r0 = 8
            r1.setVisibility(r0)
        L_0x002a:
            com.whatsapp.TextEmojiLabel r3 = r5.A07
            X.2z0 r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r5.getOrderMessageBtnTextForBuyer()
        L_0x0036:
            r3.setText(r0)
            java.lang.String r1 = r4.A06
            if (r1 == 0) goto L_0x0042
            com.whatsapp.TextEmojiLabel r0 = r5.A06
            r5.setMessageText(r1, r0, r4)
        L_0x0042:
            X.9Tp r0 = r5.A03
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0061
            X.5UY r0 = r5.A0C
            r0.A06(r2)
            int r2 = r4.A02
            r0 = 2
            if (r2 == r0) goto L_0x0058
            r0 = 3
            r1 = 1
            if (r2 != r0) goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            r3.setEnabled(r1)
            com.whatsapp.WaFrameLayout r0 = r5.A08
            r0.setEnabled(r1)
        L_0x0061:
            return
        L_0x0062:
            java.lang.String r0 = r5.getOrderMessageBtnTextForSeller()
            goto L_0x0036
        L_0x0067:
            java.lang.CharSequence r0 = r5.A1E(r3)
            r1.setText(r0)
            r1.setVisibility(r2)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92594mw.A22():void");
    }

    public C30821nD getFMessage() {
        return (C30821nD) this.A0S;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30821nD);
        this.A0S = r2;
    }

    public C92594mw(Context context, AnonymousClass677 r7, C30821nD r8) {
        super(context, r7, r8);
        A0v();
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.message_text);
        this.A06 = A0M;
        C86964Mo.A00(this.A0O, A0M);
        TextEmojiLabel A0M2 = C86644Kx.A0M(this, R.id.order_message_btn);
        this.A07 = A0M2;
        this.A0A = C86644Kx.A0O(this, R.id.order_title);
        this.A09 = C86644Kx.A0O(this, R.id.order_subtitle);
        WaFrameLayout waFrameLayout = (WaFrameLayout) findViewById(R.id.order_message_preview);
        this.A08 = waFrameLayout;
        this.A0C = C18290x4.A0X(this, R.id.order_via_catalog_header);
        Activity A002 = C621633u.A00(context);
        if (A002 instanceof C15910sA) {
            C71333bw r0 = new C71333bw();
            this.A00 = r0;
            AnonymousClass6C6.A02((C15910sA) A002, (C06270Wx) r0.A00, this, 182);
        }
        AnonymousClass543 r02 = new AnonymousClass543(context, 47, this);
        A0M2.setOnClickListener(r02);
        waFrameLayout.setOnClickListener(r02);
        A22();
    }

    private void setThumbnail(C30821nD r3) {
        C71333bw r1;
        C614630w A0y = r3.A0y();
        if (A0y != null && A0y.A05() && (r1 = this.A00) != null) {
            synchronized (r1) {
                r1.A01 = r3;
            }
            this.A25.BkM(r1);
        }
    }

    public void A1H() {
        A22();
        A1t(false);
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
}
