package X;

import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.5AQ  reason: invalid class name */
public class AnonymousClass5AQ extends AnonymousClass8V2 implements AnonymousClass4GP {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5AQ(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001a;
                case 2: goto L_0x0021;
                case 3: goto L_0x0028;
                case 4: goto L_0x002f;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.578> r3 = X.AnonymousClass578.class
            java.lang.String r4 = "updateViewState"
            java.lang.String r5 = "updateViewState()V"
        L_0x000c:
            r1 = 0
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.4cM> r3 = X.C89354cM.class
            java.lang.String r4 = "logMuteClick"
            java.lang.String r5 = "logMuteClick()V"
            goto L_0x000c
        L_0x001a:
            java.lang.Class<X.4mO> r3 = X.C92284mO.class
            java.lang.String r4 = "undoFollowingNewsletter"
            java.lang.String r5 = "undoFollowingNewsletter()V"
            goto L_0x000c
        L_0x0021:
            java.lang.Class<X.4mO> r3 = X.C92284mO.class
            java.lang.String r4 = "undoMute"
            java.lang.String r5 = "undoMute()V"
            goto L_0x000c
        L_0x0028:
            java.lang.Class<X.4mO> r3 = X.C92284mO.class
            java.lang.String r4 = "undoUnmute"
            java.lang.String r5 = "undoUnmute()V"
            goto L_0x000c
        L_0x002f:
            java.lang.Class<com.whatsapp.home.ui.HomePlaceholderActivity$HomePlaceholderView> r3 = com.whatsapp.home.ui.HomePlaceholderActivity.HomePlaceholderView.class
            java.lang.String r4 = "updateEmptySpaceOnStatusBarBackgroundColor"
            java.lang.String r5 = "updateEmptySpaceOnStatusBarBackgroundColor()V"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AQ.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C95804uY r3;
        AnonymousClass59F r2;
        StringBuilder sb;
        String str;
        switch (this.A00) {
            case 0:
                C95084sb r1 = ((C89354cM) this.receiver).A05;
                if (r1 != null) {
                    r1.A07 = Boolean.TRUE;
                    break;
                } else {
                    throw C18270x1.A0S("wamGroupInfo");
                }
            case 1:
                C92284mO r0 = (C92284mO) this.receiver;
                r0.A0A();
                r3 = r0.A07();
                r2 = C92284mO.A0C;
                C18260x0.A0O(r3, r2);
                sb = AnonymousClass001.A0o();
                str = "Undo following newsletter: ";
                break;
            case 2:
                C92284mO r12 = (C92284mO) this.receiver;
                r12.A0E(true);
                r3 = r12.A07();
                r2 = C92284mO.A0C;
                C18260x0.A0O(r3, r2);
                sb = AnonymousClass001.A0o();
                str = "Undo Muted newsletter: ";
                break;
            case 3:
                C92284mO r13 = (C92284mO) this.receiver;
                r13.A0D(true);
                r3 = r13.A07();
                r2 = C92284mO.A0C;
                C18260x0.A0O(r3, r2);
                sb = AnonymousClass001.A0o();
                str = "Undo Unmuted newsletter: ";
                break;
            case 4:
                ((HomePlaceholderActivity.HomePlaceholderView) this.receiver).A03();
                break;
            default:
                ((AnonymousClass578) this.receiver).A0M();
                break;
        }
        sb.append(str);
        sb.append(r3);
        AnonymousClass5YD.A01(AnonymousClass000.A0P(r2, " clicked, source: ", sb));
        return C59022wD.A00;
    }
}
