package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.633  reason: invalid class name */
public final class AnonymousClass633 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UpdatesViewModel $updatesViewModel;
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass633(UpdatesFragment updatesFragment, UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesFragment;
        this.$updatesViewModel = updatesViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r4 < 0) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            com.whatsapp.updates.ui.UpdatesFragment r0 = r9.this$0
            X.03q r5 = r0.A0Q()
            boolean r0 = r5 instanceof X.AnonymousClass673
            if (r0 == 0) goto L_0x006e
            X.673 r5 = (X.AnonymousClass673) r5
            if (r5 == 0) goto L_0x006e
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r9.$updatesViewModel
            X.08M r0 = r0.A0T
            java.lang.Object r0 = r0.A07()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r6 = 0
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r0.iterator()
        L_0x0023:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r6 = r7.next()
            r0 = r6
            X.536 r0 = (X.AnonymousClass536) r0
            long r3 = r0.A02
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0023
            r8.add(r6)
            goto L_0x0023
        L_0x003c:
            int r6 = r8.size()
        L_0x0040:
            com.whatsapp.HomeActivity r5 = (com.whatsapp.HomeActivity) r5
            int r0 = r5.A07
            int r4 = r6 - r0
            int r0 = r5.A06
            r3 = 300(0x12c, float:4.2E-43)
            if (r0 == r3) goto L_0x0073
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r5)
            java.lang.String r0 = "newsletter_message_received"
            boolean r2 = X.C18280x3.A1W(r1, r0)
            X.4Tb r1 = r5.A0l
            int r0 = com.whatsapp.HomeActivity.A0C(r3)
            X.5KQ r1 = r1.A0I(r0)
            if (r2 == 0) goto L_0x0071
            if (r4 <= 0) goto L_0x0071
            int r0 = r1.A00
            int r0 = r0 + r4
            r1.A00 = r0
            r5.A07 = r6
            r5.A7E()
        L_0x006e:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0071:
            if (r4 >= 0) goto L_0x006e
        L_0x0073:
            r5.A7R()
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass633.invoke(java.lang.Object):java.lang.Object");
    }
}
