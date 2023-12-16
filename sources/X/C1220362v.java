package X;

import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;

/* renamed from: X.62v  reason: invalid class name and case insensitive filesystem */
public final class C1220362v extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C69903Yy $currentUiState;
    public final /* synthetic */ PushToVideoInlineVideoPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1220362v(PushToVideoInlineVideoPlayer pushToVideoInlineVideoPlayer, C69903Yy r3) {
        super(1);
        this.$currentUiState = r3;
        this.this$0 = pushToVideoInlineVideoPlayer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (X.C162457s7.A0P(r0, r4) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            X.5Xk r9 = (X.C106045Xk) r9
            X.3Yy r0 = r8.$currentUiState
            java.lang.Object r3 = r0.element
            X.5Xk r3 = (X.C106045Xk) r3
            r0.element = r9
            X.1pC r2 = r9.A03
            r4 = 0
            if (r2 == 0) goto L_0x00e0
            X.2z0 r1 = r2.A1J
        L_0x0011:
            if (r3 == 0) goto L_0x00dd
            X.1pC r0 = r3.A03
            if (r0 == 0) goto L_0x00dd
            X.2z0 r0 = r0.A1J
        L_0x0019:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            r5 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x002e
            X.1sV r0 = r9.A04
            if (r3 == 0) goto L_0x0028
            X.1sV r4 = r3.A04
        L_0x0028:
            boolean r0 = X.C162457s7.A0P(r0, r4)
            if (r0 != 0) goto L_0x003d
        L_0x002e:
            if (r2 == 0) goto L_0x003d
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            X.1sV r4 = r9.A04
            if (r4 == 0) goto L_0x003d
            com.whatsapp.WaImageView r1 = r0.A08
            X.8tp r0 = r0.A0A
            r4.A09(r1, r2, r0)
        L_0x003d:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            android.view.View$OnClickListener r1 = r9.A00
            r0.setOnClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            android.view.View$OnTouchListener r1 = r9.A02
            r0.setOnTouchListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnTouchListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.view.View$OnLongClickListener r1 = r9.A01
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r1 = r0.A07
            r0 = 2131886126(0x7f12002e, float:1.9406822E38)
            X.C107295b4.A05(r1, r0)
            if (r3 == 0) goto L_0x00db
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            X.1VX r0 = r0.getAbProps()
            boolean r7 = r3.A00(r0)
        L_0x0088:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            X.1VX r0 = r0.getAbProps()
            boolean r6 = r9.A00(r0)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r1 = r8.this$0
            X.566 r4 = r1.A09
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x009d
            r4.A0G()
        L_0x009d:
            boolean r3 = r9.A08
            X.1VX r1 = r1.getAbProps()
            r0 = 1
            if (r3 != 0) goto L_0x00b1
            r0 = 3483(0xd9b, float:4.881E-42)
            int r0 = r1.A0N(r0)
            if (r0 > 0) goto L_0x00b1
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x00b1:
            r4.A0i(r2, r0)
            X.5Xh r2 = r4.A00
            X.5Rg r1 = r2.A03
            int r0 = r2.A02
            X.AnonymousClass566.A00(r4, r1, r2, r0, r6)
            r0 = r3 ^ 1
            r4.A0Z(r0)
            if (r6 == 0) goto L_0x00c9
            if (r7 != 0) goto L_0x00c9
            r4.A0f()
        L_0x00c9:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r8.this$0
            android.widget.FrameLayout r1 = r0.A07
            if (r3 == 0) goto L_0x00d9
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x00d9
        L_0x00d3:
            r1.setKeepScreenOn(r5)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00d9:
            r5 = 0
            goto L_0x00d3
        L_0x00db:
            r7 = 0
            goto L_0x0088
        L_0x00dd:
            r0 = r4
            goto L_0x0019
        L_0x00e0:
            r1 = r4
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1220362v.invoke(java.lang.Object):java.lang.Object");
    }
}
