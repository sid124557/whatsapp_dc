package X;

import java.util.List;

/* renamed from: X.2wx  reason: invalid class name and case insensitive filesystem */
public final class C59462wx {
    public final AnonymousClass5Q7 A00;
    public final C103515Ng A01;
    public final C52722lw A02;

    public static final AnonymousClass228 A00(List list) {
        if (list.size() == 1) {
            int ordinal = ((AnonymousClass223) list.get(0)).ordinal();
            if (ordinal == 0) {
                return AnonymousClass228.FB;
            }
            if (ordinal == 1) {
                return AnonymousClass228.IG;
            }
            throw C73153f1.A00();
        } else if (list.size() > 1) {
            return AnonymousClass228.ALL;
        } else {
            throw AnonymousClass001.A0c("Invalid destination list or it is empty");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r12, X.C73263fC r13, java.lang.String r14, java.lang.String r15, java.util.List r16, java.util.List r17, int r18) {
        /*
            r11 = this;
            r0 = 4
            X.C162457s7.A0J(r14, r0)
            boolean r1 = r13 instanceof X.C34561vM
            if (r1 == 0) goto L_0x0032
            java.lang.String r8 = "crosspost-text-status-burning-error"
        L_0x000a:
            X.5Ng r4 = r11.A01
            r10 = 3
            java.util.Iterator r3 = r16.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r5 = r3.next()
            X.223 r5 = (X.AnonymousClass223) r5
            java.util.Iterator r2 = r17.iterator()
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0011
            X.34x r6 = X.C18300x5.A0T(r2)
            r7 = r15
            r9 = r18
            r4.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0021
        L_0x0032:
            boolean r0 = r13 instanceof X.C34601vQ
            if (r0 == 0) goto L_0x0039
            java.lang.String r8 = "eligibility-purpose-encryption-validation-error"
            goto L_0x000a
        L_0x0039:
            boolean r0 = r13 instanceof X.C34611vR
            if (r0 == 0) goto L_0x0040
            java.lang.String r8 = "eligibility-session-data-validation-error"
            goto L_0x000a
        L_0x0040:
            boolean r0 = r13 instanceof X.C34551vL
            if (r0 == 0) goto L_0x0047
            java.lang.String r8 = "crosspost-generic-error"
            goto L_0x000a
        L_0x0047:
            boolean r0 = r13 instanceof X.C34571vN
            if (r0 == 0) goto L_0x004e
            java.lang.String r8 = "eligibility-generic-error"
            goto L_0x000a
        L_0x004e:
            boolean r0 = r13 instanceof X.C34541vK
            if (r0 == 0) goto L_0x0055
            java.lang.String r8 = "crosspost-linking-error"
            goto L_0x000a
        L_0x0055:
            boolean r0 = r13 instanceof X.C34581vO
            if (r0 == 0) goto L_0x005c
            java.lang.String r8 = "eligibility-account-link-error"
            goto L_0x000a
        L_0x005c:
            X.1vP r0 = X.C34591vP.A00
            boolean r0 = X.C162457s7.A0P(r13, r0)
            if (r0 == 0) goto L_0x0075
            X.2lw r3 = r11.A02
            X.228 r0 = A00(r16)
            r2 = 0
            X.C162457s7.A0J(r0, r2)
            int r1 = r0.crosspostingNoVoiceStatusText
        L_0x0070:
            r0 = 0
            r3.A00(r0, r14, r1, r2)
        L_0x0074:
            return
        L_0x0075:
            X.1vI r0 = X.C34521vI.A00
            boolean r0 = X.C162457s7.A0P(r13, r0)
            if (r0 == 0) goto L_0x008a
            X.2lw r3 = r11.A02
            X.228 r0 = A00(r16)
            r2 = 0
            X.C162457s7.A0J(r0, r2)
            int r1 = r0.crosspostingAlreadySharedText
            goto L_0x0070
        L_0x008a:
            X.1vJ r0 = X.C34531vJ.A00
            boolean r0 = X.C162457s7.A0P(r13, r0)
            if (r0 == 0) goto L_0x009f
            X.2lw r3 = r11.A02
            X.228 r0 = A00(r16)
            r2 = 0
            X.C162457s7.A0J(r0, r2)
            int r1 = r0.crosspostingAlreadySharingText
            goto L_0x0070
        L_0x009f:
            if (r1 != 0) goto L_0x00d3
            boolean r0 = r13 instanceof X.C34601vQ
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r13 instanceof X.C34611vR
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r13 instanceof X.C34551vL
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r13 instanceof X.C34571vN
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r13 instanceof X.C34541vK
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r13 instanceof X.C34581vO
            if (r0 == 0) goto L_0x0074
        L_0x00b9:
            X.2lw r3 = r11.A02
            X.228 r1 = A00(r16)
            r0 = 36
            X.54E r2 = new X.54E
            r2.<init>(r11, r0, r12)
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            int r1 = r1.crosspostingAccountLinkErrorText
            r0 = 2131896457(0x7f122889, float:1.9427776E38)
            r3.A00(r2, r14, r1, r0)
            return
        L_0x00d3:
            X.2lw r3 = r11.A02
            X.228 r0 = A00(r16)
            r2 = 0
            X.C162457s7.A0J(r0, r2)
            int r1 = r0.crosspostingErrorText
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59462wx.A01(android.content.Context, X.3fC, java.lang.String, java.lang.String, java.util.List, java.util.List, int):void");
    }

    public C59462wx(AnonymousClass5Q7 r1, C103515Ng r2, C52722lw r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
