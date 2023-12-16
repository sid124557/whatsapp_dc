package X;

import android.view.View;
import androidx.cardview.widget.CardView;

/* renamed from: X.4Z0  reason: invalid class name */
public abstract class AnonymousClass4Z0 extends C05570Ua {
    public final View A00;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if ((r10 instanceof X.C31941p8) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C92374mZ
            if (r0 == 0) goto L_0x005c
            r2 = r9
            X.4mZ r2 = (X.C92374mZ) r2
            boolean r0 = r10 instanceof X.AnonymousClass1n1
            r3 = 1
            if (r0 != 0) goto L_0x0011
            boolean r1 = r10 instanceof X.C31941p8
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.C626936e.A0B(r0)
            android.view.View r1 = r2.A00
            boolean r0 = r1 instanceof android.widget.FrameLayout
            X.C626936e.A0B(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia"
            X.C162457s7.A0K(r10, r0)
            r7 = r10
            X.1mV r7 = (X.C30471mV) r7
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.C162457s7.A0K(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.4oC r0 = r2.A00
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r7 instanceof X.AnonymousClass1n1
            if (r0 == 0) goto L_0x0048
            android.content.Context r4 = r2.A02
            X.0df r5 = r2.A03
            X.1n1 r7 = (X.AnonymousClass1n1) r7
            X.677 r6 = r2.A04
            int r8 = r2.A01
            X.4nI r3 = new X.4nI
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x0042:
            r2.A00 = r3
            r1.addView(r3)
        L_0x0047:
            return
        L_0x0048:
            boolean r0 = r7 instanceof X.C31941p8
            if (r0 == 0) goto L_0x00a9
            android.content.Context r4 = r2.A02
            X.0df r5 = r2.A03
            X.1p8 r7 = (X.C31941p8) r7
            X.677 r6 = r2.A04
            int r8 = r2.A01
            X.4nf r3 = new X.4nf
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0042
        L_0x005c:
            boolean r1 = r9 instanceof X.C92364mY
            boolean r0 = r10 instanceof X.C104535Ri
            if (r1 == 0) goto L_0x0078
            if (r0 == 0) goto L_0x0047
            X.5Ri r10 = (X.C104535Ri) r10
            if (r10 == 0) goto L_0x0047
            android.view.View r1 = r9.A00
            boolean r0 = r1 instanceof X.C93384oT
        L_0x006c:
            if (r0 == 0) goto L_0x0047
            X.4oW r1 = (X.C93414oW) r1
            if (r1 == 0) goto L_0x0047
            X.1mW r0 = r10.A01
            r1.A02(r0)
            return
        L_0x0078:
            if (r0 == 0) goto L_0x0047
            X.5Ri r10 = (X.C104535Ri) r10
            if (r10 == 0) goto L_0x0047
            int r0 = r10.A00
            boolean r4 = X.AnonymousClass001.A1T(r0)
            android.view.View r3 = r9.A0H
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.content.res.Resources r1 = X.C18290x4.A0G(r3)
            r0 = 2131166048(0x7f070360, float:1.794633E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
            if (r4 == 0) goto L_0x00a4
            r0 = -1
        L_0x009a:
            r2.width = r0
            r3.setLayoutParams(r2)
            android.view.View r1 = r9.A00
            boolean r0 = r1 instanceof X.C93374oS
            goto L_0x006c
        L_0x00a4:
            int r0 = X.AnonymousClass5YO.A02(r3)
            goto L_0x009a
        L_0x00a9:
            java.lang.String r0 = "InteractiveMessageCarouselViewHolder/createConversationRowInteractive; unsupported message type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00b0:
            X.34x r10 = (X.C624134x) r10
            r0.A1q(r10, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z0.A07(java.lang.Object):void");
    }

    public AnonymousClass4Z0(CardView cardView) {
        super(cardView);
        View A0G = C86644Kx.A0G(cardView);
        C162457s7.A0D(A0G);
        this.A00 = A0G;
    }
}
