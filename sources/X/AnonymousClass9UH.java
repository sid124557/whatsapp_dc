package X;

/* renamed from: X.9UH  reason: invalid class name */
public class AnonymousClass9UH implements C16510tW {
    public Object A00;
    public final int A01;

    public AnonymousClass9UH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.9GW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.9Gi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.9Gh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.9GW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.9GW} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BZJ(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0053;
                case 2: goto L_0x0087;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A00
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r1 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r1
            X.33j r0 = r1.A04
            java.util.ArrayList r0 = X.C107155an.A03(r0, r6)
            r1.A0M = r0
            r1.A0L = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.A0M = r0
        L_0x001c:
            r1.A75()
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            java.lang.Object r3 = r5.A00
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r3 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r3
            r3.A0A = r6
            X.33j r0 = r3.A00
            java.util.ArrayList r0 = X.C107155an.A03(r0, r6)
            r3.A0B = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0038
            r0 = 0
            r3.A0B = r0
        L_0x0038:
            X.9Gh r1 = r3.A07
            if (r1 == 0) goto L_0x0043
            r0 = 1
            r1.A0D(r0)
            r0 = 0
            r3.A07 = r0
        L_0x0043:
            java.util.ArrayList r2 = r3.A0B
            java.lang.String r1 = r3.A0A
            X.9U1 r0 = r3.A0L
            java.util.ArrayList r0 = r0.A05
            X.9Gh r4 = new X.9Gh
            r4.<init>(r3, r1, r2, r0)
            r3.A07 = r4
            goto L_0x0084
        L_0x0053:
            java.lang.Object r3 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r3 = (com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld) r3
            r3.A0C = r6
            X.33j r0 = r3.A00
            java.util.ArrayList r0 = X.C107155an.A03(r0, r6)
            r3.A0D = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x006a
            r0 = 0
            r3.A0D = r0
        L_0x006a:
            X.9Gi r1 = r3.A09
            if (r1 == 0) goto L_0x0075
            r0 = 1
            r1.A0D(r0)
            r0 = 0
            r3.A09 = r0
        L_0x0075:
            java.util.ArrayList r2 = r3.A0D
            java.lang.String r1 = r3.A0C
            X.9U1 r0 = r3.A0L
            java.util.ArrayList r0 = r0.A05
            X.9Gi r4 = new X.9Gi
            r4.<init>(r3, r1, r2, r0)
            r3.A09 = r4
        L_0x0084:
            X.4FS r0 = r3.A04
            goto L_0x00b2
        L_0x0087:
            java.lang.Object r2 = r5.A00
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r2 = (com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity) r2
            X.33j r0 = r2.A00
            java.util.ArrayList r0 = X.C107155an.A03(r0, r6)
            r2.A0J = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009c
            r0 = 0
            r2.A0J = r0
        L_0x009c:
            X.9GW r1 = r2.A0D
            if (r1 == 0) goto L_0x00a7
            r0 = 1
            r1.A0D(r0)
            r0 = 0
            r2.A0D = r0
        L_0x00a7:
            java.util.ArrayList r0 = r2.A0J
            X.9GW r4 = new X.9GW
            r4.<init>(r2, r0)
            r2.A0D = r4
            X.4FS r0 = r2.A04
        L_0x00b2:
            X.C18270x1.A0w(r4, r0)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UH.BZJ(java.lang.String):boolean");
    }

    public boolean BZK(String str) {
        return false;
    }
}
