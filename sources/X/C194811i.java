package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;

/* renamed from: X.11i  reason: invalid class name and case insensitive filesystem */
public final class C194811i extends AnonymousClass09G {
    public final /* synthetic */ BonsaiDiscoveryFragment A00;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass1MZ(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this.A00);
        } else if (i == 0) {
            return new AnonymousClass1MY(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this.A00);
        } else if (i == 2) {
            return new AnonymousClass1MX(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this.A00);
        } else {
            throw AnonymousClass0x9.A0i(AnonymousClass000.A0Y("Unknown view type ", AnonymousClass001.A0o(), i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C194811i(BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super((AnonymousClass0O4) AnonymousClass11a.A00);
        this.A00 = bonsaiDiscoveryFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c0, code lost:
        if (r2 != 0) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r12, int r13) {
        /*
            r11 = this;
            X.12d r12 = (X.C196812d) r12
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            java.lang.Object r4 = r11.A0K(r13)
            X.47w r4 = (X.AnonymousClass47w) r4
            boolean r0 = r12 instanceof X.AnonymousClass1MZ
            if (r0 == 0) goto L_0x007b
            X.1MZ r12 = (X.AnonymousClass1MZ) r12
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.bonsai.discovery.LoadedDiscoveryBots.Section.LargeBot"
            X.C162457s7.A0K(r4, r0)
            X.3EK r4 = (X.AnonymousClass3EK) r4
            r7 = 0
            X.C162457s7.A0J(r4, r7)
            r12.A00 = r4
            com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment r0 = r12.A04
            X.5Uq r5 = r0.A03
            if (r5 == 0) goto L_0x0115
            X.3ZH r3 = r4.A03
            com.whatsapp.WaImageView r2 = r12.A03
            r1 = 1
            X.3F0 r0 = X.AnonymousClass3F0.A00
            r5.A05(r2, r0, r3, r1)
            android.widget.TextView r5 = r12.A02
            X.2o1 r8 = r4.A00
            java.lang.String r0 = r8.A07
            r5.setText(r0)
            X.2m5 r3 = r4.A01
            android.view.View r1 = r12.A00
            int r0 = r3.A00
            r1.setBackgroundColor(r0)
            int r2 = r3.A01
            r5.setTextColor(r2)
            android.widget.TextView r6 = r12.A02
            r6.setTextColor(r2)
            android.widget.ImageView r5 = r12.A01
            r5.setColorFilter(r2)
            android.widget.TextView r1 = r12.A03
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x005b
            int r2 = r0.intValue()
        L_0x005b:
            r1.setTextColor(r2)
            java.lang.String r0 = r8.A06
            r1.setText(r0)
            X.2m6 r0 = r4.A02
            long r3 = r0.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010c
            r6.setVisibility(r7)
            r5.setVisibility(r7)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r6.setText(r0)
        L_0x007a:
            return
        L_0x007b:
            boolean r0 = r12 instanceof X.AnonymousClass1MY
            if (r0 == 0) goto L_0x00e9
            X.1MY r12 = (X.AnonymousClass1MY) r12
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.bonsai.discovery.LoadedDiscoveryBots.Section.SmallBot"
            X.C162457s7.A0K(r4, r0)
            X.3EJ r4 = (X.AnonymousClass3EJ) r4
            r9 = 0
            X.C162457s7.A0J(r4, r9)
            r12.A00 = r4
            com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment r0 = r12.A01
            X.5Uq r3 = r0.A03
            if (r3 == 0) goto L_0x011c
            X.3ZH r2 = r4.A02
            com.whatsapp.WaImageView r1 = r12.A03
            X.3F0 r0 = X.AnonymousClass3F0.A00
            r8 = 1
            r3.A05(r1, r0, r2, r8)
            android.widget.TextView r2 = r12.A02
            X.2o1 r1 = r4.A00
            java.lang.String r0 = r1.A07
            r2.setText(r0)
            java.lang.String r7 = r1.A02
            X.2m6 r0 = r4.A01
            long r2 = r0.A00
            android.widget.TextView r6 = r12.A00
            int r10 = r7.length()
            boolean r0 = X.AnonymousClass001.A1W(r10)
            r4 = 0
            if (r0 != 0) goto L_0x00c2
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 8
            if (r1 == 0) goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            r6.setVisibility(r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x00e2
            if (r0 == 0) goto L_0x00de
            android.content.Context r4 = r6.getContext()
            r1 = 2131886935(0x7f120357, float:1.9408463E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r7, r9)
            X.AnonymousClass0x2.A1S(r0, r8, r2)
            java.lang.String r7 = r4.getString(r1, r0)
        L_0x00de:
            r6.setText(r7)
            return
        L_0x00e2:
            if (r0 == 0) goto L_0x007a
            java.lang.String r7 = java.lang.String.valueOf(r2)
            goto L_0x00de
        L_0x00e9:
            boolean r0 = r12 instanceof X.AnonymousClass1MX
            if (r0 == 0) goto L_0x007a
            X.1MX r12 = (X.AnonymousClass1MX) r12
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.bonsai.discovery.LoadedDiscoveryBots.Section.SmallBotShimmer"
            X.C162457s7.A0K(r4, r0)
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            r12.A00 = r4
            android.widget.TextView r1 = r12.A02
            java.lang.String r0 = "████"
            r1.setText(r0)
            android.widget.TextView r1 = r12.A00
            java.lang.String r0 = "███████████"
            r1.setText(r0)
            return
        L_0x010c:
            r0 = 8
            r6.setVisibility(r0)
            r5.setVisibility(r0)
            return
        L_0x0115:
            java.lang.String r0 = "contactPhotosLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x011c:
            java.lang.String r0 = "contactPhotosLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194811i.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        Object A0K = A0K(i);
        if (A0K instanceof AnonymousClass3EK) {
            return 1;
        }
        if ((A0K instanceof AnonymousClass3EJ) || !(A0K instanceof AnonymousClass3EI)) {
            return 0;
        }
        return 2;
    }
}
