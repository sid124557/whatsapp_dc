package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.11x  reason: invalid class name and case insensitive filesystem */
public final class C196211x extends AnonymousClass0R6 {
    public List A00 = C72023d3.A00;
    public final C111095hX A01;
    public final C620733j A02;
    public final C95804uY A03;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e0, code lost:
        if (r1 == r0) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            boolean r0 = r12 instanceof X.AnonymousClass12R
            if (r0 == 0) goto L_0x0020
            X.12R r12 = (X.AnonymousClass12R) r12
            com.whatsapp.WaTextView r2 = r12.A00
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.HeaderDataItem"
            X.C162457s7.A0K(r1, r0)
            X.1kZ r1 = (X.AnonymousClass1kZ) r1
            int r0 = r1.A00
            r2.setText(r0)
        L_0x001f:
            return
        L_0x0020:
            boolean r0 = r12 instanceof X.AnonymousClass12X
            if (r0 == 0) goto L_0x001f
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            boolean r0 = r1 instanceof X.AnonymousClass1kY
            if (r0 == 0) goto L_0x00b2
            X.12X r12 = (X.AnonymousClass12X) r12
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.AlertDataItem"
            X.C162457s7.A0K(r1, r0)
            X.1kY r1 = (X.AnonymousClass1kY) r1
            X.28E r6 = r1.A00
            android.view.View r5 = r12.A0H
            android.content.Context r4 = r5.getContext()
            boolean r0 = r6 instanceof X.AnonymousClass1kW
            if (r0 == 0) goto L_0x0070
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131890069(0x7f120f95, float:1.941482E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r12.A01
            r0 = 2131890068(0x7f120f94, float:1.9414817E38)
            r1.setText(r0)
            r0 = 4
        L_0x005b:
            X.39f r1 = new X.39f
            r1.<init>(r11, r0, r4)
        L_0x0060:
            r5.setOnClickListener(r1)
        L_0x0063:
            com.whatsapp.WaImageView r1 = r12.A00
            r0 = 2131232481(0x7f0806e1, float:1.8081072E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0VX.A01(r4, r0)
            r1.setImageDrawable(r0)
            return
        L_0x0070:
            boolean r0 = r6 instanceof X.AnonymousClass1kX
            if (r0 == 0) goto L_0x0086
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131894176(0x7f121fa0, float:1.942315E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r12.A01
            r0 = 2131894175(0x7f121f9f, float:1.9423147E38)
            r1.setText(r0)
            r0 = 5
            goto L_0x005b
        L_0x0086:
            boolean r0 = r6 instanceof X.AnonymousClass1kV
            if (r0 == 0) goto L_0x0063
            com.whatsapp.WaTextView r1 = r12.A02
            r0 = 2131889650(0x7f120df2, float:1.941397E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r12.A01
            X.33j r0 = r11.A02
            java.lang.String r2 = r0.A08()
            r0 = r6
            X.1kV r0 = (X.AnonymousClass1kV) r0
            java.lang.String r1 = r0.A00
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r2, r1)
            java.lang.String r0 = r0.getDisplayCountry()
            r3.setText(r0)
            r0 = 2
            X.5el r1 = new X.5el
            r1.<init>(r11, r4, r6, r0)
            goto L_0x0060
        L_0x00b2:
            boolean r0 = r1 instanceof X.C29581ka
            if (r0 == 0) goto L_0x001f
            X.12X r12 = (X.AnonymousClass12X) r12
            java.util.List r0 = r11.A00
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.alerts.ReviewDataItem"
            X.C162457s7.A0K(r1, r0)
            X.1ka r1 = (X.C29581ka) r1
            X.38T r7 = r1.A00
            android.view.View r6 = r12.A0H
            android.content.Context r5 = r6.getContext()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = r7.A00()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT
            if (r1 == r0) goto L_0x00e2
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.SUCCESS
            if (r1 == r0) goto L_0x00e2
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.CONTENT_UNAVAILABLE
            r10 = 0
            r8 = 2131232480(0x7f0806e0, float:1.808107E38)
            if (r1 != r0) goto L_0x00e6
        L_0x00e2:
            r10 = 1
            r8 = 2131232479(0x7f0806df, float:1.8081068E38)
        L_0x00e6:
            boolean r0 = r7 instanceof X.C28531hG
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L_0x012e
            r1 = 2131890993(0x7f121331, float:1.9416693E38)
            if (r10 == 0) goto L_0x00f4
            r1 = 2131890983(0x7f121327, float:1.9416673E38)
        L_0x00f4:
            com.whatsapp.WaTextView r0 = r12.A02
            r0.setText(r1)
        L_0x00f9:
            com.whatsapp.WaImageView r1 = r12.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0VX.A01(r5, r8)
            r1.setImageDrawable(r0)
            java.lang.String r0 = r7.A01()
            if (r0 == 0) goto L_0x0124
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r2.toMillis(r0)
            X.33j r2 = r11.A02
            java.lang.String r3 = X.C107505bQ.A05(r2, r0)
            com.whatsapp.WaTextView r2 = r12.A01
            r1 = 2131890999(0x7f121337, float:1.9416706E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r9] = r3
            X.AnonymousClass001.A0y(r5, r2, r0, r1)
        L_0x0124:
            r1 = 3
            X.5el r0 = new X.5el
            r0.<init>(r11, r5, r7, r1)
            r6.setOnClickListener(r0)
            return
        L_0x012e:
            boolean r0 = r7 instanceof X.C28511hE
            if (r0 == 0) goto L_0x013b
            r1 = 2131890994(0x7f121332, float:1.9416696E38)
            if (r10 == 0) goto L_0x00f4
            r1 = 2131890984(0x7f121328, float:1.9416675E38)
            goto L_0x00f4
        L_0x013b:
            boolean r0 = r7 instanceof X.C28521hF
            if (r0 == 0) goto L_0x00f9
            X.33j r0 = r11.A02
            java.lang.String r2 = r0.A08()
            r0 = r7
            X.1hF r0 = (X.C28521hF) r0
            java.lang.String r1 = r0.A03
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r2, r1)
            java.lang.String r3 = r0.getDisplayCountry()
            r2 = 2131890986(0x7f12132a, float:1.941668E38)
            if (r10 == 0) goto L_0x015b
            r2 = 2131890985(0x7f121329, float:1.9416677E38)
        L_0x015b:
            com.whatsapp.WaTextView r1 = r12.A02
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r9] = r3
            X.AnonymousClass001.A0y(r5, r1, r0, r2)
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196211x.BNf(X.0Ua, int):void");
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            return new AnonymousClass12R(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false));
        }
        if (i == 1) {
            return new AnonymousClass12X(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false));
        }
        throw AnonymousClass001.A0c("Invalid view type");
    }

    public int A0G() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        return (this.A00.get(i) instanceof AnonymousClass1kZ) ^ true ? 1 : 0;
    }

    public C196211x(C111095hX r2, C620733j r3, C95804uY r4) {
        C18260x0.A0Q(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
