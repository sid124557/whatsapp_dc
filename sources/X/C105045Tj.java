package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5Tj  reason: invalid class name and case insensitive filesystem */
public class C105045Tj {
    public View A00;
    public final C620633i A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass5WX A03;
    public final C106715a2 A04;
    public final AnonymousClass4FS A05;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r1 != 200) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C08310eF r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x0039
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0039
            boolean r0 = r5.A0l
            if (r0 == 0) goto L_0x0039
            X.1VX r1 = r4.A02
            r0 = 1071(0x42f, float:1.501E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0039
            boolean r0 = r5 instanceof X.C1229966q
            if (r0 == 0) goto L_0x003f
            X.66q r5 = (X.C1229966q) r5
            int r1 = r5.BDV()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x003f
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x003a
            r3 = 6
        L_0x002d:
            X.4FS r2 = r4.A05
            r1 = 26
            X.5sM r0 = new X.5sM
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.BkM(r0)
        L_0x0039:
            return
        L_0x003a:
            r0 = 200(0xc8, float:2.8E-43)
            r3 = 7
            if (r1 == r0) goto L_0x002d
        L_0x003f:
            r3 = 8
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105045Tj.A01(X.0eF):void");
    }

    public C105045Tj(C620633i r1, AnonymousClass1VX r2, AnonymousClass5WX r3, C106715a2 r4, AnonymousClass4FS r5) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r1;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r3 != 400) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.widget.ListView r9, X.C08310eF r10) {
        /*
            r8 = this;
            r1 = 2131624803(0x7f0e0363, float:1.8876796E38)
            android.view.LayoutInflater r0 = r10.A0I()     // Catch:{ all -> 0x0068 }
            android.view.View r1 = X.AnonymousClass001.A0R(r0, r9, r1)     // Catch:{ all -> 0x0068 }
            r8.A00 = r1     // Catch:{ all -> 0x0068 }
            r0 = 2131429640(0x7f0b0908, float:1.8480958E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass0x7.A0K(r1, r0)
            boolean r0 = r10 instanceof X.C1229966q
            if (r0 == 0) goto L_0x0033
            r0 = r10
            X.66q r0 = (X.C1229966q) r0
            int r3 = r0.BDV()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0033
            r0 = 300(0x12c, float:4.2E-43)
            r2 = 2131893983(0x7f121edf, float:1.9422758E38)
            if (r3 == r0) goto L_0x0036
            r0 = 400(0x190, float:5.6E-43)
            r2 = 2131892526(0x7f12192e, float:1.9419803E38)
            if (r3 == r0) goto L_0x0036
        L_0x0033:
            r2 = 2131892528(0x7f121930, float:1.9419807E38)
        L_0x0036:
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r5 = r0.getString(r2)
            X.5a2 r2 = r8.A04
            android.content.Context r3 = r1.getContext()
            java.lang.String r6 = "%s"
            int r7 = X.AnonymousClass5Yj.A04(r1)
            r0 = 34
            X.5rT r4 = new X.5rT
            r4.<init>(r8, r0, r10)
            android.text.SpannableStringBuilder r0 = r2.A06(r3, r4, r5, r6, r7)
            r1.setText(r0)
            X.33i r0 = r8.A01
            X.AnonymousClass0x2.A12(r1, r0)
            X.1VX r0 = r8.A02
            X.C18270x1.A0q(r1, r0)
            android.view.View r0 = r8.A00
            r9.addFooterView(r0)
            return
        L_0x0068:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105045Tj.A00(android.widget.ListView, X.0eF):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2 != 400) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C08310eF r5) {
        /*
            r4 = this;
            X.03q r3 = r5.A0Q()
            boolean r0 = r3 instanceof X.C89654ea
            if (r0 == 0) goto L_0x002d
            X.4ea r3 = (X.C89654ea) r3
            boolean r0 = r5 instanceof X.C1229966q
            if (r0 == 0) goto L_0x0025
            X.66q r5 = (X.C1229966q) r5
            int r2 = r5.BDV()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0025
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 8
            if (r2 == r0) goto L_0x0026
            r0 = 400(0x190, float:5.6E-43)
            r1 = 6
            if (r2 == r0) goto L_0x0026
        L_0x0025:
            r1 = 7
        L_0x0026:
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r0 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r1)
            r3.Boo(r0)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105045Tj.A02(X.0eF):void");
    }

    public void A03(C89654ea r8, TextEmojiLabel textEmojiLabel, C620633i r10, int i) {
        String string = r8.getString(i);
        textEmojiLabel.setText(this.A04.A06(textEmojiLabel.getContext(), new C117155rT(this, 33, r8), string, "%s", AnonymousClass5Yj.A04(textEmojiLabel)));
        AnonymousClass0x2.A12(textEmojiLabel, r10);
        C18270x1.A0q(textEmojiLabel, this.A02);
    }
}
