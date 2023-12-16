package X;

import android.view.View;

/* renamed from: X.5zG  reason: invalid class name and case insensitive filesystem */
public final class C120845zG extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ View $view;
    public final /* synthetic */ C88634aS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120845zG(View view, C88634aS r3) {
        super(0);
        this.$view = view;
        this.this$0 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r10.this$0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            android.view.View r1 = r10.$view
            r0 = 2131432053(0x7f0b1275, float:1.8485853E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x009e
            X.4aS r4 = r10.this$0
            android.graphics.drawable.Drawable r8 = r4.A00
            if (r8 == 0) goto L_0x009e
            r0 = 2131434347(0x7f0b1b6b, float:1.8490505E38)
            android.view.View r6 = X.C18290x4.A0M(r1, r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r9 = 0
            r6.setVisibility(r9)
            r0 = 2131434315(0x7f0b1b4b, float:1.849044E38)
            android.widget.LinearLayout r3 = X.C86664Kz.A0v(r6, r0)
            int r0 = r3.getPaddingLeft()
            X.C86604Kt.A1D(r3, r0, r9)
            r2 = 17
            r3.setGravity(r2)
            r0 = 2131427668(0x7f0b0154, float:1.8476959E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r3, r0)
            r1.setGravity(r2)
            r0 = 1
            r1.setTextAlignment(r0)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x00a3
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.gravity = r2
            r1.setLayoutParams(r0)
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0053
            r9 = 1
        L_0x0053:
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626365(0x7f0e097d, float:1.8879964E38)
            android.view.View r5 = X.C18310x6.A0H(r1, r0)
            r0 = 2131430654(0x7f0b0cfe, float:1.8483015E38)
            android.view.View r7 = r5.findViewById(r0)
            int r4 = r7.getPaddingLeft()
            int r3 = r7.getPaddingTop()
            int r2 = r7.getPaddingRight()
            android.content.Context r0 = X.C18290x4.A0F(r7)
            if (r9 == 0) goto L_0x00a1
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168873(0x7f070e69, float:1.795206E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x0086:
            r7.setPadding(r4, r3, r2, r0)
            r0 = 2131427681(0x7f0b0161, float:1.8476985E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0F(r5, r0)
            r0.setImageDrawable(r8)
            r2 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r2, r0)
            r0 = 0
            r6.addView(r5, r0, r1)
        L_0x009e:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00a1:
            r0 = 0
            goto L_0x0086
        L_0x00a3:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120845zG.invoke():java.lang.Object");
    }
}
