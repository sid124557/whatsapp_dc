package com.whatsapp.contact.picker;

import X.AnonymousClass1VX;
import X.C18260x0;
import X.C84434Ci;
import com.whatsapp.community.DirectoryContactsLoader;

public final class DefaultContactsLoader implements C84434Ci {
    public final DirectoryContactsLoader A00;
    public final DeviceContactsLoader A01;
    public final NonWaContactsLoader A02;
    public final RecentlyAcceptedInviteContactsLoader A03;
    public final AnonymousClass1VX A04;

    public String B8w() {
        return "com.whatsapp.contact.picker.DefaultContactsLoader";
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BJp(X.C27991fJ r11, X.C84814Du r12, X.C73853gB r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C118765u4
            if (r0 == 0) goto L_0x010e
            r4 = r12
            X.5u4 r4 = (X.C118765u4) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r9 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 4
            r7 = 3
            r8 = 2
            r6 = 1
            if (r0 == 0) goto L_0x007e
            if (r0 == r6) goto L_0x0066
            if (r0 == r8) goto L_0x004e
            if (r0 == r7) goto L_0x0035
            if (r0 != r3) goto L_0x0115
            java.lang.Object r2 = r4.L$1
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r0 = r4.L$0
            X.C57682u2.A01(r9)
        L_0x002f:
            java.util.Collection r9 = (java.util.Collection) r9
            r2.addAll(r9)
            return r0
        L_0x0035:
            java.lang.Object r0 = r4.L$4
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r2 = r4.L$3
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r13 = r4.L$2
            X.3gB r13 = (X.C73853gB) r13
            java.lang.Object r11 = r4.L$1
            X.1fJ r11 = (X.C27991fJ) r11
            java.lang.Object r6 = r4.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r6 = (com.whatsapp.contact.picker.DefaultContactsLoader) r6
            X.C57682u2.A01(r9)
            goto L_0x00e5
        L_0x004e:
            java.lang.Object r1 = r4.L$4
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = r4.L$3
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r13 = r4.L$2
            X.3gB r13 = (X.C73853gB) r13
            java.lang.Object r11 = r4.L$1
            X.1fJ r11 = (X.C27991fJ) r11
            java.lang.Object r6 = r4.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r6 = (com.whatsapp.contact.picker.DefaultContactsLoader) r6
            X.C57682u2.A01(r9)
            goto L_0x00c1
        L_0x0066:
            java.lang.Object r0 = r4.L$4
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r1 = r4.L$3
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r13 = r4.L$2
            X.3gB r13 = (X.C73853gB) r13
            java.lang.Object r11 = r4.L$1
            X.1fJ r11 = (X.C27991fJ) r11
            java.lang.Object r6 = r4.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r6 = (com.whatsapp.contact.picker.DefaultContactsLoader) r6
            X.C57682u2.A01(r9)
            goto L_0x00a7
        L_0x007e:
            X.C57682u2.A01(r9)
            java.util.LinkedHashSet r1 = X.AnonymousClass0x9.A17()
            X.1VX r2 = r10.A04
            r0 = 3795(0xed3, float:5.318E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x010c
            com.whatsapp.community.DirectoryContactsLoader r2 = r10.A00
            r4.L$0 = r10
            r4.L$1 = r11
            r4.L$2 = r13
            r4.L$3 = r1
            r4.L$4 = r1
            r4.label = r6
            X.46Q r0 = X.AnonymousClass2C4.A01
            java.lang.Object r9 = r2.BJp(r11, r4, r0)
            if (r9 == r5) goto L_0x011b
            r6 = r10
            r0 = r1
        L_0x00a7:
            java.util.Collection r9 = (java.util.Collection) r9
            r0.addAll(r9)
        L_0x00ac:
            com.whatsapp.contact.picker.DeviceContactsLoader r0 = r6.A01
            r4.L$0 = r6
            r4.L$1 = r11
            r4.L$2 = r13
            r4.L$3 = r1
            r4.L$4 = r1
            r4.label = r8
            java.lang.Object r9 = r0.BJp(r11, r4, r13)
            if (r9 == r5) goto L_0x011b
            r2 = r1
        L_0x00c1:
            java.util.Collection r9 = (java.util.Collection) r9
            r1.addAll(r9)
            X.1VX r1 = r6.A04
            r0 = 3689(0xe69, float:5.17E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00ea
            com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader r0 = r6.A03
            r4.L$0 = r6
            r4.L$1 = r11
            r4.L$2 = r13
            r4.L$3 = r2
            r4.L$4 = r2
            r4.label = r7
            java.lang.Object r9 = r0.BJp(r11, r4, r13)
            if (r9 == r5) goto L_0x011b
            r0 = r2
        L_0x00e5:
            java.util.Collection r9 = (java.util.Collection) r9
            r0.addAll(r9)
        L_0x00ea:
            X.1VX r1 = r6.A04
            r0 = 3871(0xf1f, float:5.424E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x011a
            com.whatsapp.contact.picker.NonWaContactsLoader r1 = r6.A02
            r4.L$0 = r2
            r4.L$1 = r2
            r0 = 0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r3
            java.lang.Object r9 = r1.BJp(r11, r4, r13)
            if (r9 == r5) goto L_0x011b
            r0 = r2
            goto L_0x002f
        L_0x010c:
            r6 = r10
            goto L_0x00ac
        L_0x010e:
            X.5u4 r4 = new X.5u4
            r4.<init>(r10, r12)
            goto L_0x0012
        L_0x0115:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x011a:
            return r2
        L_0x011b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.DefaultContactsLoader.BJp(X.1fJ, X.4Du, X.3gB):java.lang.Object");
    }

    public DefaultContactsLoader(DirectoryContactsLoader directoryContactsLoader, DeviceContactsLoader deviceContactsLoader, NonWaContactsLoader nonWaContactsLoader, RecentlyAcceptedInviteContactsLoader recentlyAcceptedInviteContactsLoader, AnonymousClass1VX r5) {
        C18260x0.A0f(r5, deviceContactsLoader, nonWaContactsLoader, recentlyAcceptedInviteContactsLoader, directoryContactsLoader);
        this.A04 = r5;
        this.A01 = deviceContactsLoader;
        this.A02 = nonWaContactsLoader;
        this.A03 = recentlyAcceptedInviteContactsLoader;
        this.A00 = directoryContactsLoader;
    }
}
