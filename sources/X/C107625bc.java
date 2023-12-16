package X;

import android.content.Context;

/* renamed from: X.5bc  reason: invalid class name and case insensitive filesystem */
public class C107625bc implements AnonymousClass4C1 {
    public Object A00;
    public final int A01;

    public C107625bc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final Object A00(C107625bc r0) {
        return C389229y.A01(((Context) r0.A00).getApplicationContext()).AcK.A00.A6H.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r2.A0D.A0X(5077) == false) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0077;
                case 2: goto L_0x0098;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00c4;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x000e;
                case 8: goto L_0x00d8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.8qC r0 = (X.C183538qC) r0
            java.lang.Object r2 = r0.get()
            return r2
        L_0x000e:
            java.lang.Object r2 = A00(r10)
            return r2
        L_0x0013:
            java.lang.Object r0 = r10.A00
            com.whatsapp.calling.views.VoipContactPickerDialogFragment r0 = (com.whatsapp.calling.views.VoipContactPickerDialogFragment) r0
            X.5Fy r9 = r0.A01
            X.4xk r0 = r0.A00
            X.5XK r7 = r0.A08()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.8OQ r8 = r7.A02
            java.util.Collection r0 = r8.values()
            X.8Sy r0 = (X.C174098Sy) r0
            X.8Nf r3 = r0.iterator()
        L_0x002f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0049
            X.5Lb r2 = X.C86664Kz.A13(r3)
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x002f
            int r1 = r2.A02
            r0 = 11
            if (r1 == r0) goto L_0x002f
            com.whatsapp.jid.UserJid r0 = r2.A08
            r6.add(r0)
            goto L_0x002f
        L_0x0049:
            boolean r5 = r7.A0K
            java.lang.String r4 = r7.A09
            X.1VX r1 = r9.A00
            r0 = 5411(0x1523, float:7.582E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x005e
            r0 = 0
        L_0x0058:
            X.5SP r2 = new X.5SP
            r2.<init>(r0, r4, r6, r5)
            return r2
        L_0x005e:
            int r3 = X.AnonymousClass5AJ.A00(r8)
            int r2 = r8.size()
            int r1 = r7.A01
            if (r1 != 0) goto L_0x006c
            r1 = 32
        L_0x006c:
            int r0 = r1 - r3
            if (r3 < r1) goto L_0x0072
            int r0 = 64 - r2
        L_0x0072:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0058
        L_0x0077:
            java.lang.Object r2 = r10.A00
            com.whatsapp.community.LinkExistingGroups r2 = (com.whatsapp.community.LinkExistingGroups) r2
            X.1fJ r1 = r2.A09
            if (r1 == 0) goto L_0x0092
            X.2sj r0 = r2.A06
            boolean r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x0092
            X.1VX r1 = r2.A0D
            r0 = 5077(0x13d5, float:7.114E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0098:
            java.lang.Object r1 = r10.A00
            X.4eX r1 = (X.C89634eX) r1
            boolean r0 = r1 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r0 == 0) goto L_0x00a8
            r0 = 18
        L_0x00a2:
            X.687 r2 = new X.687
            r2.<init>(r1, r0)
            return r2
        L_0x00a8:
            boolean r0 = r1 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x00ae
            r0 = 5
            goto L_0x00a2
        L_0x00ae:
            r0 = 6
            goto L_0x00a2
        L_0x00b0:
            java.lang.Object r0 = r10.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131231772(0x7f08041c, float:1.8079634E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r1, r0)
            android.graphics.drawable.Drawable r2 = r0.mutate()
            return r2
        L_0x00c4:
            java.lang.Object r0 = r10.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131231603(0x7f080373, float:1.8079292E38)
            android.graphics.drawable.Drawable r0 = X.C18310x6.A0G(r1, r0)
            android.graphics.drawable.Drawable r2 = r0.mutate()
            return r2
        L_0x00d8:
            java.lang.Object r2 = r10.A00
            X.3Wy r2 = (X.C69423Wy) r2
            java.lang.String r1 = "PttTranscriptionPool"
            r0 = 1
            java.util.concurrent.ThreadPoolExecutor r2 = r2.A00(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107625bc.get():java.lang.Object");
    }
}
