package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4nz  reason: invalid class name and case insensitive filesystem */
public class C93154nz extends AnonymousClass4nS {
    public int A00;
    public int A01;
    public long A02 = 0;
    public View A03 = findViewById(R.id.control_frame);
    public View A04 = findViewById(R.id.text_and_date);
    public ViewGroup A05 = C86644Kx.A0J(this, R.id.video_containter);
    public ImageView A06 = AnonymousClass0x9.A0F(this, R.id.gif_attribution);
    public TextView A07 = AnonymousClass002.A09(this, R.id.control_btn);
    public TextView A08 = AnonymousClass002.A09(this, R.id.info);
    public C64393Dh A09;
    public TextEmojiLabel A0A = C86644Kx.A0M(this, R.id.caption);
    public WaFrameLayout A0B = ((WaFrameLayout) C06560Yg.A02(this, R.id.media_container));
    public AnonymousClass5XQ A0C;
    public AnonymousClass566 A0D;
    public ConversationRowVideo$RowVideoView A0E = ((ConversationRowVideo$RowVideoView) findViewById(R.id.thumb));
    public AnonymousClass5UY A0F = C18290x4.A0X(this, R.id.cancel_download);
    public AnonymousClass5UY A0G = C18290x4.A0X(this, R.id.progress_bar);
    public AnonymousClass5RW A0H;
    public final C185528tp A0I = new C100465Ba(this, 2);
    public final C109665ez A0J = new AnonymousClass54F(this, 31);

    public void A1H() {
        A00(false);
        A1t(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0229, code lost:
        if (r9 < r5) goto L_0x022b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(boolean r26) {
        /*
            r25 = this;
            r3 = r25
            X.34x r2 = r3.A0S
            X.1mV r2 = (X.C30471mV) r2
            X.1pC r2 = (X.C31981pC) r2
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/gif/fillView for "
            X.2z0 r1 = X.C624134x.A08(r2, r0, r4)
            r4.append(r1)
            java.lang.String r0 = " is-new = "
            r4.append(r0)
            r7 = r26
            r4.append(r7)
            java.lang.String r0 = " conversationRowGif="
            X.C86604Kt.A1V(r4, r0, r3)
            X.33C r4 = X.C30471mV.A00(r2)
            if (r26 == 0) goto L_0x0036
            android.widget.TextView r5 = r3.A07
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r5.setTag(r0)
            r3.A2B()
        L_0x0036:
            android.widget.TextView r6 = r3.A08
            r5 = 8
            r6.setVisibility(r5)
            android.widget.TextView r10 = r3.A07
            r15 = 0
            r10.setVisibility(r15)
            X.34x r9 = r3.A0S
            X.2ld r8 = r3.A1b
            X.1VX r0 = r3.A0O
            boolean r16 = X.C624234y.A00(r0, r8, r9)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r0 = r3.A0E
            r13 = 1
            r0.setIsGif(r13)
            boolean r8 = X.C87094Nz.A0m(r3)
            if (r8 == 0) goto L_0x0159
            r10.setVisibility(r5)
            r14 = r26 ^ 1
            android.view.View r9 = r3.A03
            X.5UY r11 = r3.A0G
            X.5UY r12 = r3.A0F
            X.C93244oC.A04(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.setVisibility(r15)
            r6.setVisibility(r5)
            boolean r5 = r1.A02
            if (r5 == 0) goto L_0x0156
            X.5ez r6 = r3.A0B
        L_0x0073:
            r0.setOnClickListener(r6)
            android.view.ViewGroup r5 = r3.A05
            r5.setOnClickListener(r6)
            X.5ez r5 = r3.A08
            r10.setOnClickListener(r5)
            r11.A07(r5)
        L_0x0083:
            r7 = 1
        L_0x0084:
            r3.A1L()
            android.view.View$OnLongClickListener r6 = r3.A2T
            r0.setOnLongClickListener(r6)
            android.view.ViewGroup r5 = r3.A05
            r5.setOnLongClickListener(r6)
            com.whatsapp.WaFrameLayout r11 = r3.A0B
            boolean r12 = r1.A02
            android.content.Context r5 = r3.getContext()
            if (r12 == 0) goto L_0x0150
            android.graphics.drawable.Drawable r10 = X.C106205Ya.A02(r5)
        L_0x009f:
            android.content.Context r8 = r11.getContext()
            r6 = 2130968814(0x7f0400ee, float:1.7546292E38)
            r5 = 2131099929(0x7f060119, float:1.7812225E38)
            if (r12 == 0) goto L_0x00b1
            r6 = 2130968816(0x7f0400f0, float:1.7546296E38)
            r5 = 2131099931(0x7f06011b, float:1.781223E38)
        L_0x00b1:
            int r9 = X.AnonymousClass5Yj.A02(r8, r6, r5)
            android.content.Context r8 = r11.getContext()
            r6 = 2130968815(0x7f0400ef, float:1.7546294E38)
            r5 = 2131099930(0x7f06011a, float:1.7812227E38)
            if (r12 == 0) goto L_0x00c7
            r6 = 2130968817(0x7f0400f1, float:1.7546298E38)
            r5 = 2131099932(0x7f06011c, float:1.7812231E38)
        L_0x00c7:
            int r5 = X.AnonymousClass5Yj.A02(r8, r6, r5)
            r11.A03 = r9
            r11.A02 = r5
            r11.setForeground(r10)
            android.content.Context r5 = r3.getContext()
            float r6 = X.C86604Kt.A00(r5)
            r5 = 1118218923(0x42a6aaab, float:83.333336)
            float r6 = r6 * r5
            int r6 = (int) r6
            int r5 = X.C33141sV.A00(r2, r6)
            if (r5 > 0) goto L_0x00e9
            int r5 = r6 * 9
            int r5 = r5 / 16
        L_0x00e9:
            r3.A00 = r5
            r3.A01 = r6
            r0.A02(r6, r5, r7)
            X.1sV r6 = r3.A22
            X.8tp r5 = r3.A0I
            r6.A09(r0, r2, r5)
            int r0 = r2.A0B
            if (r0 != 0) goto L_0x0103
            java.io.File r0 = r4.A0F
            int r0 = X.C107655bf.A0F(r0)
            r2.A0B = r0
        L_0x0103:
            X.34x r0 = r3.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = X.C30471mV.A00(r0)
            int r6 = r0.A05
            android.widget.ImageView r5 = r3.A06
            if (r6 == r7) goto L_0x0146
            r4 = 2
            r0 = 2131231874(0x7f080482, float:1.8079841E38)
            if (r6 == r4) goto L_0x0149
            r0 = 8
            r5.setVisibility(r0)
        L_0x011c:
            android.view.View r5 = r3.A04
            com.whatsapp.TextEmojiLabel r4 = r3.A0A
            X.1mV r0 = r3.getFMessage()
            java.lang.String r0 = r0.A1w()
            r3.A25(r5, r4, r0)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/gif/fillView/end for "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "conversationRowGif="
            X.C86604Kt.A1V(r4, r0, r3)
            r3.A26(r2)
            r3.A1n(r2)
            r3.A1l(r2)
            return
        L_0x0146:
            r0 = 2131231873(0x7f080481, float:1.807984E38)
        L_0x0149:
            r5.setImageResource(r0)
            r5.setVisibility(r15)
            goto L_0x011c
        L_0x0150:
            android.graphics.drawable.Drawable r10 = X.C106205Ya.A00(r5)
            goto L_0x009f
        L_0x0156:
            r6 = 0
            goto L_0x0073
        L_0x0159:
            boolean r8 = X.C87094Nz.A0j(r3)
            if (r8 == 0) goto L_0x0253
            android.view.View r9 = r3.A03
            X.5UY r8 = r3.A0G
            X.5UY r7 = r3.A0F
            r13 = 0
            r22 = r15
            r23 = r15
            r17 = r9
            r18 = r10
            r19 = r8
            r20 = r7
            r21 = r15
            r24 = r16
            X.C93244oC.A04(r17, r18, r19, r20, r21, r22, r23, r24)
            android.view.View r8 = X.AnonymousClass5UY.A00(r7, r15)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r7 = 2131232272(0x7f080610, float:1.8080649E38)
            r8.setImageResource(r7)
            if (r16 == 0) goto L_0x01e2
            r6.setVisibility(r15)
            X.33j r7 = r3.A0M
            boolean r7 = X.C620733j.A04(r7)
            if (r7 == 0) goto L_0x01d2
            r7 = 2131232299(0x7f08062b, float:1.8080703E38)
            r6.setCompoundDrawablesWithIntrinsicBounds(r7, r15, r15, r15)
        L_0x0198:
            r10.setVisibility(r5)
            android.view.ViewGroup r7 = r3.A05
            X.5ez r5 = r3.A0B
            r7.setOnClickListener(r5)
            android.content.Context r6 = r7.getContext()
            r5 = 2131895063(0x7f122317, float:1.9424948E38)
            X.C18300x5.A13(r6, r7, r5)
            r6 = 11
            X.5eg r5 = new X.5eg
            r5.<init>(r3, r6, r2)
            r10.setOnClickListener(r5)
            r0.setOnClickListener(r5)
            android.content.Context r6 = r0.getContext()
            r5 = 2131892616(0x7f121988, float:1.9419985E38)
            X.C18300x5.A13(r6, r0, r5)
            X.1VX r6 = r3.A0O
            r5 = 2281(0x8e9, float:3.196E-42)
            boolean r5 = r6.A0X(r5)
            if (r5 == 0) goto L_0x01e6
            r3.A2A()
            goto L_0x0083
        L_0x01d2:
            android.content.Context r8 = r3.getContext()
            r7 = 2131232299(0x7f08062b, float:1.8080703E38)
            android.graphics.drawable.Drawable r8 = X.AnonymousClass0RP.A00(r8, r7)
            r7 = 0
            r6.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r8, r7)
            goto L_0x0198
        L_0x01e2:
            r6.setVisibility(r5)
            goto L_0x0198
        L_0x01e6:
            X.5XQ r8 = r3.A0C
            if (r8 == 0) goto L_0x0083
            monitor-enter(r8)
            java.util.Map r5 = r8.A00     // Catch:{ all -> 0x02a1 }
            if (r5 == 0) goto L_0x022c
            java.lang.Object r6 = r5.get(r1)     // Catch:{ all -> 0x02a1 }
            X.0PJ r6 = (X.AnonymousClass0PJ) r6     // Catch:{ all -> 0x02a1 }
            if (r6 == 0) goto L_0x022c
            X.1VX r10 = r8.A01     // Catch:{ all -> 0x02a1 }
            java.lang.Object r5 = r6.A00     // Catch:{ all -> 0x02a1 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x02a1 }
            long r11 = r5.longValue()     // Catch:{ all -> 0x02a1 }
            java.lang.Object r5 = r6.A01     // Catch:{ all -> 0x02a1 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x02a1 }
            int r9 = r5.intValue()     // Catch:{ all -> 0x02a1 }
            r5 = 2281(0x8e9, float:3.196E-42)
            boolean r5 = r10.A0X(r5)     // Catch:{ all -> 0x02a1 }
            if (r5 == 0) goto L_0x0222
            r5 = 3684(0xe64, float:5.162E-42)
            long r6 = X.C56952sp.A04(r10, r5)     // Catch:{ all -> 0x02a1 }
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x022c
            r5 = 3683(0xe63, float:5.161E-42)
            int r5 = r10.A0N(r5)     // Catch:{ all -> 0x02a1 }
            goto L_0x0229
        L_0x0222:
            r6 = 6000(0x1770, double:2.9644E-320)
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x022b
            r5 = 3
        L_0x0229:
            if (r9 >= r5) goto L_0x022c
        L_0x022b:
            r13 = 1
        L_0x022c:
            monitor-exit(r8)
            if (r13 == 0) goto L_0x0083
            X.34x r5 = r3.A0S
            X.1mV r5 = (X.C30471mV) r5
            X.33C r5 = X.C30471mV.A00(r5)
            boolean r5 = A01(r5)
            if (r5 != 0) goto L_0x0242
            r3.A28()
            goto L_0x0083
        L_0x0242:
            r3.A29()
            int r6 = r8.A00(r2)
            X.566 r5 = r3.A0D
            r5.A0i(r2, r6)
            r5.A0F()
            goto L_0x0083
        L_0x0253:
            X.5UY r12 = r3.A0F
            r12.A06(r5)
            r6.setVisibility(r5)
            boolean r5 = X.C87094Nz.A0k(r3)
            if (r5 != 0) goto L_0x0288
            r6 = 2131893203(0x7f121bd3, float:1.9421176E38)
            android.content.Context r5 = X.C86654Ky.A0B(r3, r10, r6)
            X.C18300x5.A13(r5, r10, r6)
            r5 = 2131232839(0x7f080847, float:1.8081799E38)
            r10.setCompoundDrawablesWithIntrinsicBounds(r5, r15, r15, r15)
            X.5ez r5 = r3.A0A
            r10.setOnClickListener(r5)
            X.5ez r5 = r3.A0B
        L_0x0278:
            r0.setOnClickListener(r5)
            r14 = r26 ^ 1
            android.view.View r9 = r3.A03
            X.5UY r11 = r3.A0G
            r7 = 1
            r13 = r15
            X.C93244oC.A04(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0084
        L_0x0288:
            X.C87094Nz.A0H(r10, r3, r2)
            android.content.Context r6 = r10.getContext()
            r5 = 2131887188(0x7f120454, float:1.9408976E38)
            X.C18300x5.A13(r6, r10, r5)
            r5 = 2131232831(0x7f08083f, float:1.8081782E38)
            r10.setCompoundDrawablesWithIntrinsicBounds(r5, r15, r15, r15)
            X.5ez r5 = r3.A0J
            r10.setOnClickListener(r5)
            goto L_0x0278
        L_0x02a1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93154nz.A00(boolean):void");
    }

    public static final boolean A01(AnonymousClass33C r0) {
        File file = r0.A0F;
        if (file == null) {
            return false;
        }
        return C18310x6.A0a(Uri.fromFile(file)).exists();
    }

    public int A1A(int i) {
        if (!C86614Ku.A1Z((C30471mV) this.A0S)) {
            return super.A1A(i);
        }
        return 0;
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A00(A1W);
        }
    }

    public final void A28() {
        Log.w("viewmessage/ no file");
        C624134x r1 = this.A0S;
        if (A27()) {
            return;
        }
        if (this.A0n.BoA()) {
            C89654ea r12 = (C89654ea) C86614Ku.A0A(this);
            if (r12 != null) {
                this.A0T.A01(r12);
                return;
            }
            return;
        }
        Context context = getContext();
        AnonymousClass2z0 r0 = r1.A1J;
        C86614Ku.A14(C627736r.A0Q(context, r0.A00, r0.hashCode()), this);
    }

    public final void A29() {
        WaFrameLayout waFrameLayout = this.A0B;
        int width = waFrameLayout.getWidth();
        int height = waFrameLayout.getHeight();
        ViewGroup.LayoutParams layoutParams = waFrameLayout.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        waFrameLayout.setLayoutParams(layoutParams);
        waFrameLayout.setClipChildren(true);
        this.A05.setVisibility(0);
        this.A0D.A0Q(4);
    }

    public final void A2A() {
        AnonymousClass5ZR r0;
        if (this.A0O.A0X(2281) && C87094Nz.A0j(this) && (r0 = this.A02) != null && r0.A04() != C997357z.DENIED && A01(C30471mV.A00((C30471mV) this.A0S))) {
            this.A03.setVisibility(4);
            this.A0X.A0S(C117085rM.A00(this, 37));
        }
    }

    public final void A2B() {
        AnonymousClass566 r1 = this.A0D;
        r1.A0Q(0);
        r1.A0G();
        WaFrameLayout waFrameLayout = this.A0B;
        ViewGroup.LayoutParams layoutParams = waFrameLayout.getLayoutParams();
        this.A05.setVisibility(8);
        layoutParams.width = -1;
        layoutParams.height = -1;
        waFrameLayout.setLayoutParams(layoutParams);
    }

    public int getBroadcastDrawableId() {
        if (C86614Ku.A1Z((C30471mV) this.A0S)) {
            return R.drawable.broadcast_status_icon_onmedia;
        }
        return R.drawable.broadcast_status_icon;
    }

    public C31961pA getFMessage() {
        return (C31961pA) ((C30471mV) this.A0S);
    }

    public int getReactionsViewVerticalOverlap() {
        if (C86614Ku.A1Z((C30471mV) this.A0S)) {
            return getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        }
        return super.getReactionsViewVerticalOverlap();
    }

    public void onDetachedFromWindow() {
        C624134x r1 = this.A0S;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A082 = C624134x.A08(r1, "conversation/row/gif/onDetachedFromWindow/", A0o);
        AnonymousClass2z0.A0A(A082, A0o);
        C86604Kt.A1V(A0o, " conversationRowGif=", this);
        super.onDetachedFromWindow();
        A2B();
        AnonymousClass5XQ r0 = this.A0C;
        if (r0 != null) {
            r0.A02(A082);
        }
    }

    public void onStartTemporaryDetach() {
        AnonymousClass5XQ r5;
        long j;
        AnonymousClass0PJ r1;
        C30471mV r7 = (C30471mV) this.A0S;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A082 = C624134x.A08(r7, "conversation/row/gif/onStartTemporaryDetach", A0o);
        AnonymousClass2z0.A0A(A082, A0o);
        C86604Kt.A1V(A0o, " conversationRowGif=", this);
        super.onStartTemporaryDetach();
        if (this.A0D.A07() != 1) {
            long j2 = this.A02;
            if (j2 > 0 && (r5 = this.A0C) != null) {
                long A052 = AnonymousClass0x9.A05(j2);
                synchronized (r5) {
                    AnonymousClass1VX r6 = r5.A01;
                    if (r7.A0B <= 1) {
                        j = 600;
                    } else {
                        j = C18290x4.A0A(r7.A0B);
                    }
                    int i = (int) (A052 / j);
                    Map map = r5.A00;
                    if (!(map == null || (r1 = (AnonymousClass0PJ) map.get(A082)) == null)) {
                        long longValue = ((Long) r1.A00).longValue() + A052;
                        int intValue = ((Integer) r1.A01).intValue();
                        if (i > 0) {
                            intValue += i;
                        }
                        r5.A00.put(A082, AnonymousClass0x9.A0G(Long.valueOf(longValue), Integer.valueOf(intValue)));
                        if (r6.A0X(2281) && longValue < C56952sp.A04(r6, 3684)) {
                            r6.A0N(3683);
                        }
                    }
                }
                this.A02 = 0;
            }
        }
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C31961pA);
        super.setFMessage(r2);
    }

    public C93154nz(Context context, AnonymousClass677 r8, C31961pA r9) {
        super(context, r8, r9);
        AnonymousClass5XQ r0;
        this.A07.setTextSize(0, C86664Kz.A01(getResources(), R.dimen.f6nameremoved));
        C69263Wi r5 = this.A0X;
        AnonymousClass5RW r3 = this.A0H;
        this.A0D = new AnonymousClass566(this.A0E, this.A05, r5, r3);
        this.A0D.A0V(new C1235068r(this, 0, new AtomicBoolean(false)));
        AnonymousClass677 r1 = this.A0m;
        if (r1 != null) {
            r0 = (AnonymousClass5XQ) r1.B5x(AnonymousClass5XQ.class);
        } else {
            r0 = null;
        }
        this.A0C = r0;
        TextEmojiLabel textEmojiLabel = this.A0A;
        if (textEmojiLabel != null) {
            AnonymousClass0x2.A14(this.A0O, textEmojiLabel);
        }
        this.A0G.A09(new AnonymousClass92F(0));
        A00(true);
    }

    public void A1N() {
        C69263Wi r1;
        int i;
        String str;
        super.A1N();
        if (this.A02 == null || C87094Nz.A0l(this)) {
            C30471mV r6 = (C30471mV) this.A0S;
            AnonymousClass33C A002 = C30471mV.A00(r6);
            AnonymousClass2z0 r4 = r6.A1J;
            boolean z = r4.A02;
            if (z || A002.A0R) {
                if (z && !A002.A0R && !A002.A0Q && (str = A002.A0H) != null && C107655bf.A0R(this.A09, str).exists()) {
                    r1 = this.A0X;
                    i = R.string.f11nameremoved;
                } else if (A002.A07 == 1) {
                    r1 = this.A0X;
                    i = R.string.f11nameremoved;
                } else {
                    boolean A012 = A01(A002);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("viewmessage/ from_me:");
                    C87094Nz.A0e(A002, r6, A0o, z);
                    if (!A012) {
                        A28();
                        return;
                    }
                    View findViewById = findViewById(R.id.media_container);
                    boolean BoA = this.A0n.BoA();
                    AnonymousClass5P1 r0 = new AnonymousClass5P1(getContext());
                    r0.A0A = BoA;
                    AnonymousClass5P1.A00(r0, r4);
                    Intent A013 = r0.A01();
                    if (findViewById != null) {
                        C107275b2.A08(getContext(), A013, findViewById);
                        AnonymousClass5MG.A02(getContext(), getContext(), A013, findViewById, r4);
                        return;
                    }
                    return;
                }
                r1.A0F(i, 1);
            }
        }
    }

    public final void A2C(C31961pA r3) {
        AnonymousClass5XQ r1;
        if (!C87094Nz.A0j(this)) {
            return;
        }
        if ((this.A02 == null || C87094Nz.A0l(this)) && (r1 = this.A0C) != null) {
            r1.A01(r3.A1J);
            A29();
            int A002 = r1.A00(r3);
            AnonymousClass566 r0 = this.A0D;
            r0.A0i(r3, A002);
            r0.A0F();
        }
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this)) {
            return 0;
        }
        int A022 = AnonymousClass5YO.A02(this);
        int i = this.A00;
        int i2 = this.A01;
        if (i > i2) {
            return Math.max((int) ((((float) A022) / ((float) i)) * ((float) i2)), AnonymousClass5YO.A01(getContext(), 36));
        }
        return A022;
    }

    public void onAttachedToWindow() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversation/row/gif/onAttachedToWindow");
        AnonymousClass2z0.A0A(this.A0S.A1J, A0o);
        C86604Kt.A1V(A0o, " conversationRowGif=", this);
        super.onAttachedToWindow();
        A2A();
    }

    public void onFinishTemporaryDetach() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversation/row/gif/onFinishTemporaryDetach");
        AnonymousClass2z0.A0A(this.A0S.A1J, A0o);
        C86604Kt.A1V(A0o, " conversationRowGif=", this);
        super.onFinishTemporaryDetach();
    }

    public void onWindowFocusChanged(boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversation/row/gif/onWindowFocusChanged");
        AnonymousClass2z0.A0A(this.A0S.A1J, A0o);
        C18280x3.A1G(A0o, " conversationRowGif=", this);
        C18260x0.A1D(" hasWindowFocus=", A0o, z);
        super.onWindowFocusChanged(z);
        if (!this.A0O.A0X(2281)) {
            return;
        }
        if (z) {
            A2A();
        } else if (this.A0D.A07() != 1 && this.A02 > 0 && this.A0C != null) {
            A2B();
            this.A02 = 0;
        }
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
