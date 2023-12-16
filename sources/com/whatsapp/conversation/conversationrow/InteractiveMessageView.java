package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YG;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass39Z;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass5PN;
import X.AnonymousClass5R6;
import X.AnonymousClass5UY;
import X.AnonymousClass7HW;
import X.C06560Yg;
import X.C111685iW;
import X.C116855qy;
import X.C155417eq;
import X.C18260x0;
import X.C18290x4;
import X.C50222hp;
import X.C53552nH;
import X.C54702p9;
import X.C55662qi;
import X.C620733j;
import X.C86654Ky;
import X.C86664Kz;
import X.C86964Mo;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class InteractiveMessageView extends LinearLayout implements AnonymousClass4GJ {
    public View.OnLongClickListener A00;
    public View A01;
    public View A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public C55662qi A08;
    public AnonymousClass5R6 A09;
    public C155417eq A0A;
    public AnonymousClass5PN A0B;
    public C620733j A0C;
    public AnonymousClass1VX A0D;
    public C54702p9 A0E;
    public C50222hp A0F;
    public C53552nH A0G;
    public AnonymousClass4FS A0H;
    public C116855qy A0I;
    public Map A0J;
    public boolean A0K;
    public final FrameLayout A0L;
    public final TextEmojiLabel A0M;
    public final TextEmojiLabel A0N;
    public final AnonymousClass7HW A0O;
    public final DynamicMessageView A0P;
    public final AnonymousClass5UY A0Q;
    public final AnonymousClass5UY A0R;

    public static final JSONObject A00(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return AnonymousClass0x9.A1H(str);
            } catch (JSONException e) {
                C18260x0.A0u("InteractiveMessageView/parseNfmMessageParamsJson/invalid json=", str, AnonymousClass001.A0o(), e);
            }
        }
        return AnonymousClass0x9.A1G();
    }

    public final void A01() {
        this.A03.setImageResource(R.drawable.ic_gift_card_disabled);
        AnonymousClass0YG.A06(this.A03.getDrawable(), AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved));
        C06560Yg.A0C(AnonymousClass0Y8.A07(getContext(), R.color.f5nameremoved), this.A03);
        if (this.A09.A03 == null) {
            this.A01.setOnClickListener(new AnonymousClass39Z(1));
            this.A0L.setOnClickListener(new AnonymousClass39Z(2));
            setOnClickListener(new AnonymousClass39Z(3));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0287, code lost:
        if (r4.has("limited_time_offer") == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04c1, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        r3 = r10.A00;
        r3.setVisibility(0);
        r0 = (X.C150427Qr) X.AnonymousClass001.A0i(r10.A01, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (r0 == null) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r0.A00(r3, r9, r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        if (r3 != 2) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0390 A[Catch:{ JSONException -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03ea A[Catch:{ JSONException -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C93314oJ r18, X.C624134x r19) {
        /*
            r17 = this;
            r7 = r19
            boolean r0 = r7 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x04c2
            r8 = r7
            X.4DV r8 = (X.AnonymousClass4DV) r8
            X.39W r6 = r8.B5s()
            r2 = r17
            X.2hp r0 = r2.A0F
            X.315 r5 = r0.A01(r8)
            X.7HW r10 = r2.A0O
            X.39W r4 = r8.B5s()
            r9 = r18
            if (r4 == 0) goto L_0x0024
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x00d5;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00a8;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00ac;
                default: goto L_0x0024;
            }
        L_0x0024:
            android.widget.FrameLayout r3 = r10.A00
            r0 = 8
            r3.setVisibility(r0)
        L_0x002b:
            r4 = 8
            r1 = 0
            if (r6 == 0) goto L_0x00dc
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x00dc
            X.39P r0 = r6.A03
            int r10 = r0.A01
            r0 = 2
            if (r10 != r0) goto L_0x00dc
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r13 = r2.A0P
            r13.setVisibility(r1)
            X.39P r0 = r6.A03
            java.util.List r12 = r0.A04
            X.C162457s7.A0J(r7, r1)
            java.lang.Object r5 = r13.getTag()
            X.2z0 r0 = r7.A1J
            java.lang.String r11 = r0.A01
            boolean r0 = X.C162457s7.A0P(r5, r11)
            if (r0 != 0) goto L_0x0123
            if (r12 == 0) goto L_0x011c
            java.util.Iterator r16 = r12.iterator()
        L_0x005d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r14 = r16.next()
            X.7xe r14 = (X.C165797xe) r14
            boolean r0 = r14 instanceof X.C97584yn
            if (r0 == 0) goto L_0x00d7
            X.4yn r14 = (X.C97584yn) r14
            android.content.Context r5 = r13.getContext()
            r0 = 0
            com.whatsapp.StarRatingBar r10 = new com.whatsapp.StarRatingBar
            r10.<init>(r5, r0)
            java.lang.String r0 = r14.A01
            r10.setTag(r0)
            r15 = -2
            r5 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r15, r15, r5)
            r10.setLayoutParams(r0)
            r0 = 17
            r10.setGravity(r0)
            r5 = 1
            X.69Y r0 = new X.69Y
            r0.<init>(r14, r5)
            r10.A01 = r0
            X.7xf r5 = r14.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.interactive.layout.RatingType.Stars"
            X.C162457s7.A0K(r5, r0)
            X.6op r5 = (X.C137526op) r5
            int r0 = r5.A00
            r10.setRating(r0)
            r13.addView(r10)
            goto L_0x005d
        L_0x00a8:
            r1 = 4
            goto L_0x00bc
        L_0x00aa:
            r1 = 3
            goto L_0x00bc
        L_0x00ac:
            r1 = 1
            goto L_0x00bc
        L_0x00ae:
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x00d5
            X.39P r0 = r4.A03
            int r3 = r0.A01
            r0 = 1
            if (r3 != r0) goto L_0x00d1
            r1 = 5
        L_0x00bc:
            android.widget.FrameLayout r3 = r10.A00
            r0 = 0
            r3.setVisibility(r0)
            java.util.Map r0 = r10.A01
            java.lang.Object r0 = X.AnonymousClass001.A0i(r0, r1)
            X.7Qr r0 = (X.C150427Qr) r0
            if (r0 == 0) goto L_0x04bc
            r0.A00(r3, r9, r7, r4)
            goto L_0x002b
        L_0x00d1:
            r0 = 2
            r1 = 6
            if (r3 == r0) goto L_0x00bc
        L_0x00d5:
            r1 = 2
            goto L_0x00bc
        L_0x00d7:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00dc:
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r0 = r2.A0P
            r0.setVisibility(r4)
            if (r5 == 0) goto L_0x0116
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r5.A09(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0116
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r5.A09(r0)
            com.whatsapp.TextEmojiLabel r5 = r2.A0M
            r9.setMessageText(r0, r5, r7)
            r5.setVisibility(r1)
        L_0x0101:
            if (r6 == 0) goto L_0x013a
            java.lang.String r0 = r6.A09
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x013a
            com.whatsapp.TextEmojiLabel r10 = r2.A0N
            r10.setVisibility(r1)
            java.lang.String r0 = r6.A09
            r9.setMessageText(r0, r10, r7)
            goto L_0x013f
        L_0x0116:
            com.whatsapp.TextEmojiLabel r5 = r2.A0M
            r5.setVisibility(r4)
            goto L_0x0101
        L_0x011c:
            r13.A04 = r12
            r13.A03 = r7
            r13.setTag(r11)
        L_0x0123:
            X.39P r0 = r6.A03
            X.391 r0 = r0.A00
            if (r0 == 0) goto L_0x02f4
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x02f4
            r13.A05 = r1
            r13.setClickable(r1)
            r13.setFocusable(r1)
        L_0x0135:
            com.whatsapp.TextEmojiLabel r5 = r2.A0M
            r5.setVisibility(r4)
        L_0x013a:
            com.whatsapp.TextEmojiLabel r10 = r2.A0N
            r10.setVisibility(r4)
        L_0x013f:
            X.39W r0 = r8.B5s()
            if (r0 == 0) goto L_0x02e1
            X.39P r0 = r0.A03
            if (r0 == 0) goto L_0x02e1
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x02e1
            int r4 = r0.size()
            r0 = 1
            if (r4 <= r0) goto L_0x02e1
        L_0x0154:
            X.33j r0 = r2.A0C
            boolean r0 = X.C620733j.A04(r0)
            r8 = 3
            r4 = 5
            if (r0 == 0) goto L_0x015f
            r4 = 3
        L_0x015f:
            android.widget.LinearLayout$LayoutParams r0 = X.AnonymousClass001.A0U(r10)
            r0.gravity = r4
            r10.setLayoutParams(r0)
            android.widget.LinearLayout$LayoutParams r0 = X.AnonymousClass001.A0U(r5)
            r0.gravity = r4
            r5.setLayoutParams(r0)
            X.2z0 r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0192
            android.view.ViewGroup r5 = r9.getDateWrapper()
            X.C626936e.A04(r5)
            android.widget.LinearLayout$LayoutParams r4 = X.AnonymousClass001.A0U(r5)
            X.33j r0 = r2.A0C
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x018b
            r8 = 5
        L_0x018b:
            r0 = r8 | 80
            r4.gravity = r0
            r5.setLayoutParams(r4)
        L_0x0192:
            r4 = 2131430253(0x7f0b0b6d, float:1.8482202E38)
            android.view.View r0 = r3.findViewById(r4)
            if (r0 == 0) goto L_0x01a6
            android.widget.FrameLayout r3 = X.C86664Kz.A0s(r3, r4)
            android.graphics.drawable.Drawable r0 = r9.getInnerFrameForegroundDrawable()
            r3.setForeground(r0)
        L_0x01a6:
            if (r6 == 0) goto L_0x04c2
            X.39P r0 = r6.A03
            if (r0 == 0) goto L_0x023d
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x023d
            X.5UY r10 = r2.A0R
            if (r10 == 0) goto L_0x023d
            X.39P r0 = r6.A03
            java.lang.String r0 = r0.A02
            org.json.JSONObject r4 = A00(r0)
            android.content.Context r9 = r2.getContext()
            X.C162457s7.A0J(r9, r1)
            java.lang.String r3 = "reminder_info"
            boolean r0 = r4.has(r3)
            if (r0 == 0) goto L_0x023d
            org.json.JSONObject r5 = r4.optJSONObject(r3)
            if (r5 == 0) goto L_0x023d
            java.lang.String r0 = "reminder_status"
            java.lang.String r4 = r5.optString(r0)
            if (r4 == 0) goto L_0x023d
            int r3 = r4.hashCode()
            r0 = -954581179(0xffffffffc71a3f45, float:-39487.27)
            if (r3 == r0) goto L_0x02d0
            r0 = -750561850(0xffffffffd34355c6, float:-8.3895766E11)
            if (r3 == r0) goto L_0x02c4
            r0 = 682647242(0x28b05eca, float:1.9581033E-14)
            if (r3 != r0) goto L_0x023d
            java.lang.String r0 = "reminder_pending"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x023d
            java.lang.String r0 = "scheduled_timestamp"
            java.lang.String r0 = r5.optString(r0)
            if (r0 == 0) goto L_0x023d
            long r3 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x023d
            java.util.Date r8 = new java.util.Date
            r8.<init>(r3)
            java.text.SimpleDateFormat r0 = X.C155417eq.A00
            java.lang.String r5 = r0.format(r8)
            java.text.SimpleDateFormat r0 = X.C155417eq.A01
            java.lang.String r4 = r0.format(r8)
            r3 = 2131896141(0x7f12274d, float:1.9427135E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.C18280x3.A19(r5, r4, r0)
            java.lang.String r3 = r9.getString(r3, r0)
        L_0x0229:
            if (r3 == 0) goto L_0x023d
            android.view.View r0 = X.AnonymousClass5UY.A00(r10, r1)
            r2.A02 = r0
            r0 = 2131432968(0x7f0b1608, float:1.8487708E38)
            com.whatsapp.WaTextView r0 = X.C86644Kx.A0O(r2, r0)
            r2.A07 = r0
            r0.setText(r3)
        L_0x023d:
            X.39P r0 = r6.A03
            if (r0 == 0) goto L_0x04c2
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04c2
            X.2nH r0 = r2.A0G
            X.1VX r1 = r0.A03
            r0 = 4693(0x1255, float:6.576E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x04c2
            X.5UY r0 = r2.A0Q
            if (r0 == 0) goto L_0x04c2
            X.5R6 r0 = r2.A09
            if (r0 == 0) goto L_0x04c2
            X.39P r0 = r6.A03
            java.lang.String r0 = r0.A02
            org.json.JSONObject r4 = A00(r0)
            X.5R6 r5 = r2.A09
            X.5Pb r0 = new X.5Pb
            r0.<init>(r2, r7)
            r5.A02 = r0
            byte r3 = r7.A1I
            java.lang.String r1 = "expiration_time"
            X.2nH r0 = r5.A0C
            X.1VX r6 = r0.A03
            r0 = 4693(0x1255, float:6.576E-42)
            boolean r0 = r6.A0X(r0)
            java.lang.String r9 = "limited_time_offer"
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0289
            boolean r8 = r4.has(r9)
            r0 = 1
            if (r8 != 0) goto L_0x028a
        L_0x0289:
            r0 = 0
        L_0x028a:
            r5.A09 = r0
            if (r0 == 0) goto L_0x0491
            X.5Pb r0 = r5.A02
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r8 = r0.A00
            X.5UY r0 = r8.A0Q
            android.view.View r10 = X.AnonymousClass5UY.A00(r0, r7)
            r8.A01 = r10
            android.view.View$OnLongClickListener r0 = r8.A00
            r10.setOnLongClickListener(r0)
            r0 = 2131429137(0x7f0b0711, float:1.8479938E38)
            com.whatsapp.WaImageView r0 = X.C86664Kz.A11(r8, r0)
            r8.A03 = r0
            r0 = 2131431925(0x7f0b11f5, float:1.8485593E38)
            com.whatsapp.WaTextView r0 = X.C86644Kx.A0O(r8, r0)
            r8.A06 = r0
            r0 = 2131431141(0x7f0b0ee5, float:1.8484003E38)
            com.whatsapp.WaTextView r0 = X.C86644Kx.A0O(r8, r0)
            r8.A05 = r0
            r0 = 2131429202(0x7f0b0752, float:1.848007E38)
            com.whatsapp.WaTextView r0 = X.C86644Kx.A0O(r8, r0)
            r8.A04 = r0
            goto L_0x02ff
        L_0x02c4:
            java.lang.String r0 = "reminder_canceled"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x023d
            r0 = 2131896139(0x7f12274b, float:1.942713E38)
            goto L_0x02db
        L_0x02d0:
            java.lang.String r0 = "reminder_sent"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x023d
            r0 = 2131896143(0x7f12274f, float:1.9427139E38)
        L_0x02db:
            java.lang.String r3 = r9.getString(r0)
            goto L_0x0229
        L_0x02e1:
            android.widget.FrameLayout r4 = r2.A0L
            r0 = 29
            X.C109475eg.A00(r4, r2, r7, r0)
            r4 = 30
            X.5eg r0 = new X.5eg
            r0.<init>(r2, r4, r7)
            r2.setOnClickListener(r0)
            goto L_0x0154
        L_0x02f4:
            r0 = 1
            r13.A05 = r0
            r13.setClickable(r0)
            r13.setFocusable(r0)
            goto L_0x0135
        L_0x02ff:
            org.json.JSONObject r0 = r4.optJSONObject(r9)     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r8 = "text"
            java.lang.String r8 = r0.getString(r8)     // Catch:{ JSONException -> 0x0480 }
            r5.A06 = r8     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r8 = "url"
            java.lang.String r8 = r0.getString(r8)     // Catch:{ JSONException -> 0x0480 }
            r5.A07 = r8     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r8 = "copy_code"
            java.lang.String r8 = r0.optString(r8)     // Catch:{ JSONException -> 0x0480 }
            r5.A05 = r8     // Catch:{ JSONException -> 0x0480 }
            boolean r14 = r0.has(r1)     // Catch:{ JSONException -> 0x0480 }
            r5.A08 = r14     // Catch:{ JSONException -> 0x0480 }
            X.5Pb r10 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r12 = r5.A05     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r13 = r5.A07     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r9 = r10.A00     // Catch:{ JSONException -> 0x0480 }
            X.5R6 r8 = r9.A09     // Catch:{ JSONException -> 0x0480 }
            X.8o7 r8 = r8.A03     // Catch:{ JSONException -> 0x0480 }
            if (r8 == 0) goto L_0x0342
            android.view.View r9 = r9.A01     // Catch:{ JSONException -> 0x0480 }
            r8 = 38
            X.C109345eT.A00(r9, r10, r8)     // Catch:{ JSONException -> 0x0480 }
        L_0x0336:
            X.5Pb r8 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r9 = r5.A06     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r8 = r8.A00     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaTextView r8 = r8.A06     // Catch:{ JSONException -> 0x0480 }
            r8.setText(r9)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x034f
        L_0x0342:
            android.view.View r8 = r9.A01     // Catch:{ JSONException -> 0x0480 }
            X.34x r11 = r10.A01     // Catch:{ JSONException -> 0x0480 }
            X.39m r9 = new X.39m     // Catch:{ JSONException -> 0x0480 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0480 }
            r8.setOnClickListener(r9)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x0336
        L_0x034f:
            r12 = 2
            java.lang.String r10 = "%s: Limited Time offer not defined for message - %s"
            r11 = 62
            r9 = 57
            r8 = 55
            if (r3 == r8) goto L_0x0365
            if (r3 == r9) goto L_0x035f
            if (r3 == r11) goto L_0x035f
            goto L_0x037a
        L_0x035f:
            X.5Pb r13 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r15 = 2131233539(0x7f080b03, float:1.8083218E38)
            goto L_0x036a
        L_0x0365:
            X.5Pb r13 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r15 = 2131233547(0x7f080b0b, float:1.8083235E38)
        L_0x036a:
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r13 = r13.A00     // Catch:{ JSONException -> 0x0480 }
            android.view.View r14 = r13.A01     // Catch:{ JSONException -> 0x0480 }
            android.content.Context r13 = r13.getContext()     // Catch:{ JSONException -> 0x0480 }
            android.graphics.drawable.Drawable r13 = X.AnonymousClass0VX.A01(r13, r15)     // Catch:{ JSONException -> 0x0480 }
            r14.setBackground(r13)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x038c
        L_0x037a:
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ JSONException -> 0x0480 }
            java.lang.Class r13 = r5.getClass()     // Catch:{ JSONException -> 0x0480 }
            r14[r7] = r13     // Catch:{ JSONException -> 0x0480 }
            X.C18310x6.A1T(r14, r3, r6)     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r13 = java.lang.String.format(r10, r14)     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.util.Log.d((java.lang.String) r13)     // Catch:{ JSONException -> 0x0480 }
        L_0x038c:
            boolean r13 = r5.A08     // Catch:{ JSONException -> 0x0480 }
            if (r13 == 0) goto L_0x03ea
            java.lang.String r0 = r0.optString(r1)     // Catch:{ JSONException -> 0x0480 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0480 }
            r5.A04 = r0     // Catch:{ JSONException -> 0x0480 }
            boolean r0 = r5.A01()     // Catch:{ JSONException -> 0x0480 }
            if (r0 != 0) goto L_0x03c4
            r5.A00()     // Catch:{ JSONException -> 0x0480 }
            X.5Pb r0 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r9 = r5.A05     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaTextView r8 = r0.A04     // Catch:{ JSONException -> 0x0480 }
            android.content.Context r3 = r0.getContext()     // Catch:{ JSONException -> 0x0480 }
            r1 = 2131890402(0x7f1210e2, float:1.9415495E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x0480 }
            r0[r7] = r9     // Catch:{ JSONException -> 0x0480 }
            X.AnonymousClass001.A0y(r3, r8, r0, r1)     // Catch:{ JSONException -> 0x0480 }
            X.5Pb r0 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaTextView r0 = r0.A04     // Catch:{ JSONException -> 0x0480 }
            r0.setVisibility(r7)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x0491
        L_0x03c4:
            X.5Pb r3 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r1 = 2131890403(0x7f1210e3, float:1.9415497E38)
            r0 = 0
            r3.A00(r0, r1, r6, r7)     // Catch:{ JSONException -> 0x0480 }
            X.5Pb r0 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r3 = 2131100211(0x7f060233, float:1.7812797E38)
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaTextView r1 = r0.A05     // Catch:{ JSONException -> 0x0480 }
            android.content.Context r0 = r0.getContext()     // Catch:{ JSONException -> 0x0480 }
            X.AnonymousClass0x2.A0q(r0, r1, r3)     // Catch:{ JSONException -> 0x0480 }
            X.5Pb r0 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaTextView r1 = r0.A04     // Catch:{ JSONException -> 0x0480 }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x0491
        L_0x03ea:
            X.5Pb r0 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaTextView r1 = r0.A04     // Catch:{ JSONException -> 0x0480 }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ JSONException -> 0x0480 }
            if (r3 == r8) goto L_0x045b
            if (r3 == r9) goto L_0x040f
            if (r3 == r11) goto L_0x040f
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ JSONException -> 0x0480 }
            java.lang.Class r0 = r5.getClass()     // Catch:{ JSONException -> 0x0480 }
            r1[r7] = r0     // Catch:{ JSONException -> 0x0480 }
            X.C18310x6.A1T(r1, r3, r6)     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r0 = java.lang.String.format(r10, r1)     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x0491
        L_0x040f:
            java.lang.String r0 = r5.A05     // Catch:{ JSONException -> 0x0480 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0480 }
            if (r0 == 0) goto L_0x0450
            X.5Pb r0 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r8 = 2131168693(0x7f070db5, float:1.7951695E38)
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r3 = r0.A00     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaImageView r0 = r3.A03     // Catch:{ JSONException -> 0x0480 }
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch:{ JSONException -> 0x0480 }
            int r0 = X.C86614Ku.A05(r3, r8)     // Catch:{ JSONException -> 0x0480 }
            r1.width = r0     // Catch:{ JSONException -> 0x0480 }
            int r0 = X.C86614Ku.A05(r3, r8)     // Catch:{ JSONException -> 0x0480 }
            r1.height = r0     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaImageView r0 = r3.A03     // Catch:{ JSONException -> 0x0480 }
            r0.setLayoutParams(r1)     // Catch:{ JSONException -> 0x0480 }
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ JSONException -> 0x0480 }
            r0 = 2131168761(0x7f070df9, float:1.7951833E38)
            int r1 = r1.getDimensionPixelSize(r0)     // Catch:{ JSONException -> 0x0480 }
            com.whatsapp.WaImageView r0 = r3.A03     // Catch:{ JSONException -> 0x0480 }
            r0.setPadding(r1, r1, r1, r1)     // Catch:{ JSONException -> 0x0480 }
            X.5Pb r3 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r1 = 2131890408(0x7f1210e8, float:1.9415507E38)
            java.lang.String r0 = r5.A07     // Catch:{ JSONException -> 0x0480 }
            r3.A00(r0, r1, r7, r6)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x0491
        L_0x0450:
            X.5Pb r3 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r1 = 2131890402(0x7f1210e2, float:1.9415495E38)
            java.lang.String r0 = r5.A05     // Catch:{ JSONException -> 0x0480 }
            r3.A00(r0, r1, r6, r6)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x0491
        L_0x045b:
            X.5Pb r1 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r3 = 2131890408(0x7f1210e8, float:1.9415507E38)
            java.lang.String r0 = r5.A07     // Catch:{ JSONException -> 0x0480 }
            r1.A00(r0, r3, r6, r6)     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r0 = r5.A05     // Catch:{ JSONException -> 0x0480 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0480 }
            if (r0 == 0) goto L_0x0475
            X.5Pb r1 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            java.lang.String r0 = r5.A07     // Catch:{ JSONException -> 0x0480 }
            r1.A00(r0, r3, r6, r6)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x0491
        L_0x0475:
            X.5Pb r3 = r5.A02     // Catch:{ JSONException -> 0x0480 }
            r1 = 2131890402(0x7f1210e2, float:1.9415495E38)
            java.lang.String r0 = r5.A05     // Catch:{ JSONException -> 0x0480 }
            r3.A00(r0, r1, r6, r6)     // Catch:{ JSONException -> 0x0480 }
            goto L_0x0491
        L_0x0480:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.Class r0 = r5.getClass()
            r1.append(r0)
            java.lang.String r0 = "/parseLimitedTimeOfferParams/invalid json="
            X.C18260x0.A0k(r4, r0, r1, r3)
        L_0x0491:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x04b0
            java.lang.Long r0 = r5.A04
            long r3 = r0.longValue()
            X.2sH r0 = r5.A0B
            long r0 = r0.A0H()
            long r3 = r3 - r0
            X.67R r0 = new X.67R
            r0.<init>(r5, r3)
            r5.A00 = r0
            X.4FS r1 = r5.A0D
            r0 = 49
            X.C117085rM.A01(r1, r5, r0)
        L_0x04b0:
            X.5R6 r0 = r2.A09
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x04c2
            r2.A01()
            return
        L_0x04bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x04c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveMessageView.A03(X.4oJ, X.34x):void");
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0I;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public FrameLayout getInnerFrameLayout() {
        return C86664Kz.A0s(this.A0O.A00, R.id.frame_header);
    }

    public void setDescriptionMinLines(int i) {
        this.A0M.setMinLines(i);
    }

    public void setLayoutView(int i) {
        TextEmojiLabel textEmojiLabel;
        Context context;
        int i2;
        if (i == 0) {
            textEmojiLabel = this.A0N;
            context = getContext();
            i2 = R.color.f5nameremoved;
        } else if (i == 1) {
            textEmojiLabel = this.A0N;
            context = getContext();
            i2 = R.color.f5nameremoved;
        } else {
            return;
        }
        AnonymousClass0x2.A0q(context, textEmojiLabel, i2);
    }

    public InteractiveMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0K) {
            this.A0K = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4i(this);
        }
    }

    public void A02(View.OnLongClickListener onLongClickListener, AnonymousClass5R6 r3) {
        setOnLongClickListener(onLongClickListener);
        this.A0L.setOnLongClickListener(onLongClickListener);
        this.A00 = onLongClickListener;
        this.A09 = r3;
    }

    public InteractiveMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0K) {
            this.A0K = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4i(this);
        }
        this.A01 = null;
        this.A03 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A00 = null;
        this.A07 = null;
        this.A02 = null;
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        FrameLayout A0L2 = C86654Ky.A0L(this, R.id.interactive_message_header_holder);
        this.A0L = A0L2;
        AnonymousClass5UY A0X = C18290x4.A0X(this, R.id.conversation_row_lto_offer_content);
        this.A0Q = A0X;
        A0X.A06(8);
        AnonymousClass5UY A0X2 = C18290x4.A0X(this, R.id.conversation_row_reminder_content);
        this.A0R = A0X2;
        A0X2.A06(8);
        this.A0O = new AnonymousClass7HW(A0L2, this.A0J);
        this.A0M = AnonymousClass0x7.A0K(this, R.id.description);
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(this, R.id.bottom_message);
        this.A0N = A0K2;
        this.A0P = (DynamicMessageView) C06560Yg.A02(this, R.id.dynamic_content);
        C86964Mo.A00(this.A0D, this.A0M);
        AnonymousClass0x2.A14(this.A0D, A0K2);
    }

    public InteractiveMessageView(Context context) {
        this(context, (AttributeSet) null);
    }
}
