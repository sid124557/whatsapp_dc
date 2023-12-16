package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.566  reason: invalid class name */
public final class AnonymousClass566 extends AnonymousClass5YG {
    public C106015Xh A00 = new C106015Xh((C104515Rg) null, AnonymousClass58U.UNINITIALIZED, (AnonymousClass7ND) null, 1, 0, 4, false, true);
    public C183348pt A01;
    public final View A02;
    public final ViewGroup A03;
    public final C69263Wi A04;
    public final AnonymousClass5RW A05;
    public final Runnable A06 = C117085rM.A00(this, 41);
    public final Runnable A07 = C117085rM.A00(this, 40);

    public AnonymousClass566(View view, ViewGroup viewGroup, C69263Wi r12, AnonymousClass5RW r13) {
        C18260x0.A0Z(r12, r13, viewGroup, 1);
        C162457s7.A0J(view, 4);
        this.A04 = r12;
        this.A05 = r13;
        this.A03 = viewGroup;
        this.A02 = view;
    }

    public static void A00(AnonymousClass566 r9, C104515Rg r10, C106015Xh r11, int i, boolean z) {
        C104515Rg r1 = r10;
        int i2 = i;
        r9.A0h(new C106015Xh(r1, r11.A04, r11.A05, i2, r11.A01, r11.A00, z, r11.A06));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0h(X.C106015Xh r8) {
        /*
            r7 = this;
            X.5Xh r3 = r7.A00
            r7.A00 = r8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/ConversationRowInlineVideoPlayer/update nextState="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " prevState="
            X.C18260x0.A1P(r1, r0, r3)
            boolean r0 = X.C162457s7.A0P(r8, r3)
            if (r0 != 0) goto L_0x0074
            android.view.View r6 = r7.A02
            X.58U r5 = r8.A04
            X.58U r4 = X.AnonymousClass58U.INITIALIZED
            if (r5 != r4) goto L_0x007e
            int r0 = r8.A01()
            r2 = 4
            if (r0 == r2) goto L_0x007e
            int r0 = r8.A01()
            r1 = 3
            if (r0 != r1) goto L_0x0079
            int r0 = r3.A01()
            if (r0 == r1) goto L_0x0079
        L_0x0037:
            r6.setVisibility(r2)
            X.5Xh r0 = r7.A00
            X.7ND r2 = r0.A05
            if (r2 == 0) goto L_0x0059
            boolean r1 = r8.A06
            X.5YG r0 = r2.A03
            r0.A0Z(r1)
            int r0 = r8.A00
            X.5YG r1 = r2.A03
            r1.A0Q(r0)
            if (r5 != r4) goto L_0x0075
            X.5Xh r0 = r7.A00
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0075
            r1.A0N()
        L_0x0059:
            boolean r2 = r8.A07
            boolean r0 = r3.A07
            if (r2 != r0) goto L_0x0069
            int r1 = r8.A01()
            int r0 = r3.A01()
            if (r1 == r0) goto L_0x0074
        L_0x0069:
            X.8pt r1 = r7.A01
            if (r1 == 0) goto L_0x0074
            int r0 = r8.A01()
            r1.BYM(r2, r0)
        L_0x0074:
            return
        L_0x0075:
            r1.A0C()
            goto L_0x0059
        L_0x0079:
            int r2 = r6.getVisibility()
            goto L_0x0037
        L_0x007e:
            r2 = 0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass566.A0h(X.5Xh):void");
    }

    public final void A0i(C31981pC r5, int i) {
        C31981pC r0;
        C104515Rg r3;
        C104515Rg r1 = this.A00.A03;
        if (r1 != null) {
            r0 = r1.A01;
        } else {
            r0 = null;
        }
        if (!C162457s7.A0P(r5, r0) || r1 == null || i != r1.A00) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("conversation/row/ConversationRowInlineVideoPlayer/setMediaSource message=");
            A0o.append(r5);
            A0o.append("; loopCount=");
            A0o.append(i);
            A0o.append("; state=");
            C18260x0.A0m(this.A00, A0o);
            A0G();
            if (r5 == null) {
                r3 = null;
            } else {
                r3 = new C104515Rg(r5, i);
            }
            C106015Xh r2 = this.A00;
            A00(this, r3, r2, r2.A02, r2.A07);
        }
    }

    public final void A0f() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversation/row/ConversationRowInlineVideoPlayer/prepare state=");
        C18260x0.A0m(this.A00, A0o);
        C106015Xh r2 = this.A00;
        AnonymousClass58U r1 = r2.A04;
        if (r1 == AnonymousClass58U.UNINITIALIZED || r1 == AnonymousClass58U.FAILED) {
            A0h(C106015Xh.A00(AnonymousClass58U.CREATING_PLAYER, r2));
            this.A04.A0S(this.A07);
        }
    }

    public final void A0g() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversation/row/ConversationRowInlineVideoPlayer/stopImpl state=");
        C18260x0.A0m(this.A00, A0o);
        C69263Wi r1 = this.A04;
        r1.A0R(this.A07);
        r1.A0R(this.A06);
        C106015Xh r0 = this.A00;
        AnonymousClass7ND r12 = r0.A05;
        C104515Rg r3 = r0.A03;
        boolean z = r0.A07;
        boolean z2 = r0.A06;
        A0h(new C106015Xh(r3, AnonymousClass58U.UNINITIALIZED, (AnonymousClass7ND) null, 1, 0, r0.A00, z, z2));
        if (r12 != null) {
            AnonymousClass5YG r02 = r12.A03;
            r02.A0V((C183348pt) null);
            r12.A01 = null;
            r02.A0O();
            r12.A00 = null;
        }
    }
}
