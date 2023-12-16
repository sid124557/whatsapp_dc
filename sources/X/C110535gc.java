package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5gc  reason: invalid class name and case insensitive filesystem */
public final class C110535gc implements C15930sC {
    public View A00;
    public final ViewGroup A01;
    public final C15910sA A02;
    public final C89704el A03;
    public final C112185jK A04;
    public final C620733j A05;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r5 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = r7.A02;
        r3 = r7.A05;
        r0 = r7.A03;
        r5 = new X.AnonymousClass6J8(r0);
        r1 = (com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel) X.AnonymousClass0x9.A0H(r0).A01(com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel.class);
        X.C162457s7.A0J(r1, 2);
        r5.getContext();
        X.C18320x8.A19(r5, 0);
        r5.setAdapter(new X.AnonymousClass4WJ(r2, r1));
        r2 = r5.getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f6nameremoved);
        r5.A0o(new X.AnonymousClass4XT(r3, r2));
        r5.setPadding(r2, 0, r2, r5.getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f6nameremoved));
        r5.setClipToPadding(false);
        r7.A01.addView(r5, 0, new android.widget.FrameLayout.LayoutParams(-1, -2, 80));
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006f, code lost:
        r5.setVisibility(0);
        r7.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0074, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BOf(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.List r8 = (java.util.List) r8
            r6 = 0
            X.C162457s7.A0J(r8, r6)
            android.view.View r5 = r7.A00
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0012
            X.C86604Kt.A1A(r5)
            return
        L_0x0012:
            if (r5 != 0) goto L_0x006f
            X.0sA r2 = r7.A02
            X.33j r3 = r7.A05
            X.4el r0 = r7.A03
            X.6J8 r5 = new X.6J8
            r5.<init>(r0)
            X.0XL r1 = X.AnonymousClass0x9.A0H(r0)
            java.lang.Class<com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel> r0 = com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel.class
            X.0Ty r1 = r1.A01(r0)
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r1 = (com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel) r1
            r0 = 2
            X.C162457s7.A0J(r1, r0)
            r5.getContext()
            X.C18320x8.A19(r5, r6)
            X.4WJ r0 = new X.4WJ
            r0.<init>(r2, r1)
            r5.setAdapter(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168272(0x7f070c10, float:1.7950841E38)
            int r2 = r1.getDimensionPixelSize(r0)
            X.4XT r0 = new X.4XT
            r0.<init>(r3, r2)
            r5.A0o(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168278(0x7f070c16, float:1.7950853E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.setPadding(r2, r6, r2, r0)
            r5.setClipToPadding(r6)
            android.view.ViewGroup r4 = r7.A01
            r3 = -2
            r2 = 80
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r3, r2)
            r4.addView(r5, r6, r0)
        L_0x006f:
            r5.setVisibility(r6)
            r7.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110535gc.BOf(java.lang.Object):void");
    }

    public C110535gc(ViewGroup viewGroup, C15910sA r2, C89704el r3, C112185jK r4, C620733j r5) {
        this.A02 = r2;
        this.A05 = r5;
        this.A01 = viewGroup;
        this.A04 = r4;
        this.A03 = r3;
    }
}
