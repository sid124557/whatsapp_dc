package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass4GR;
import X.C53152md;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2", f = "ExpressionsKeyboardTabHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardTabHandler$createTabsListByOpener$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $opener;
    public final /* synthetic */ boolean $showEmoji;
    public int label;
    public final /* synthetic */ C53152md this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardTabHandler$createTabsListByOpener$2(C53152md r2, C84814Du r3, int i, boolean z) {
        super(r3, 2);
        this.$opener = i;
        this.$showEmoji = z;
        this.this$0 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r5.A03.A01() != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r5.A00.A0Y() != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r5.A02.A0Y(X.C58422vE.A02, 4890) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r3 = X.AnonymousClass1TY.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r5.A02.A0Y(X.C58422vE.A02, 6081) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r3.A00 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        r4.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r3 = X.AnonymousClass1Tb.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r5.A02.A0Y(X.C58422vE.A02, 6081) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r3.A00 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r4.add(r3);
        r1 = X.C159507lx.A0h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r1.A02.A0Y(X.C58422vE.A02, 811) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f6, code lost:
        if (r0 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f8, code lost:
        r0 = X.AnonymousClass1TY.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fa, code lost:
        r3.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fd, code lost:
        r0 = X.AnonymousClass1Tb.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ff, code lost:
        r3.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0102, code lost:
        r1 = X.C159507lx.A0h(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        return X.C73723fy.A0H(r1, 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4.add(X.AnonymousClass1Ta.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0114
            X.C57682u2.A01(r7)
            int r2 = r6.$opener
            switch(r2) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0107;
                case 2: goto L_0x0086;
                case 3: goto L_0x0092;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00bc;
                case 6: goto L_0x0107;
                case 7: goto L_0x00e4;
                case 8: goto L_0x007e;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExpressionsKeyboardOpener = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x001f:
            boolean r0 = r6.$showEmoji
            if (r0 == 0) goto L_0x007e
            X.2md r5 = r6.this$0
            X.8U9 r4 = new X.8U9
            r4.<init>()
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            r4.add(r0)
        L_0x002f:
            X.1Ta r0 = X.AnonymousClass1Ta.A00
            r4.add(r0)
            X.2gs r0 = r5.A03
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0050
            X.2sr r0 = r5.A00
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0064
            X.1VX r2 = r5.A02
            r1 = 4890(0x131a, float:6.852E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0064
        L_0x0050:
            X.1TY r3 = X.AnonymousClass1TY.A00
            X.1VX r2 = r5.A02
            r1 = 6081(0x17c1, float:8.521E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0061
            r0 = 3
            r3.A00 = r0
        L_0x0061:
            r4.add(r3)
        L_0x0064:
            X.1Tb r3 = X.AnonymousClass1Tb.A00
            X.1VX r2 = r5.A02
            r1 = 6081(0x17c1, float:8.521E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0075
            r0 = 2
            r3.A00 = r0
        L_0x0075:
            r4.add(r3)
            java.util.List r1 = X.C159507lx.A0h(r4)
            goto L_0x010d
        L_0x007e:
            X.2md r5 = r6.this$0
            X.8U9 r4 = new X.8U9
            r4.<init>()
            goto L_0x002f
        L_0x0086:
            boolean r0 = r6.$showEmoji
            X.8U9 r3 = new X.8U9
            r3.<init>()
            if (r0 == 0) goto L_0x00fd
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            goto L_0x00fa
        L_0x0092:
            X.2md r1 = r6.this$0
            X.8U9 r3 = new X.8U9
            r3.<init>()
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            r3.add(r0)
            X.1VX r2 = r1.A02
            r1 = 811(0x32b, float:1.136E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0102
            goto L_0x00fd
        L_0x00ab:
            boolean r0 = r6.$showEmoji
            X.8U9 r3 = new X.8U9
            r3.<init>()
            if (r0 == 0) goto L_0x00b9
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            r3.add(r0)
        L_0x00b9:
            X.1Ta r0 = X.AnonymousClass1Ta.A00
            goto L_0x00ff
        L_0x00bc:
            X.2md r1 = r6.this$0
            boolean r0 = r6.$showEmoji
            X.8U9 r3 = new X.8U9
            r3.<init>()
            if (r0 == 0) goto L_0x00cc
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            r3.add(r0)
        L_0x00cc:
            X.1Ta r0 = X.AnonymousClass1Ta.A00
            r3.add(r0)
            X.1VX r2 = r1.A02
            r0 = 6110(0x17de, float:8.562E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0102
            r0 = 6383(0x18ef, float:8.944E-42)
            boolean r0 = r2.A0Y(r1, r0)
            goto L_0x00f6
        L_0x00e4:
            X.2md r1 = r6.this$0
            X.8U9 r3 = new X.8U9
            r3.<init>()
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            r3.add(r0)
            X.2gs r0 = r1.A03
            boolean r0 = r0.A01()
        L_0x00f6:
            if (r0 == 0) goto L_0x00fd
            X.1TY r0 = X.AnonymousClass1TY.A00
        L_0x00fa:
            r3.add(r0)
        L_0x00fd:
            X.1Tb r0 = X.AnonymousClass1Tb.A00
        L_0x00ff:
            r3.add(r0)
        L_0x0102:
            java.util.List r1 = X.C159507lx.A0h(r3)
            goto L_0x010d
        L_0x0107:
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            java.util.List r1 = X.C18290x4.A12(r0)
        L_0x010d:
            r0 = 17
            java.util.List r0 = X.C73723fy.A0H(r1, r0)
            return r0
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ExpressionsKeyboardTabHandler$createTabsListByOpener$2(this.this$0, r6, this.$opener, this.$showEmoji);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
