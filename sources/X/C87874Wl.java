package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.4Wl  reason: invalid class name and case insensitive filesystem */
public final class C87874Wl extends AnonymousClass0R6 {
    public int A00;
    public final C147337Ds A01;
    public final ArrayList A02;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YG(C18300x5.A0F(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved), this);
    }

    public int A0G() {
        return this.A02.size();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ae, code lost:
        r1 = new X.C94924sJ();
        r1.A00 = r6;
        r1.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b7, code lost:
        r1.A04 = java.lang.Long.valueOf(r2);
        r1.A03 = r5;
        r7.A00.BhD(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r4.A04 = java.lang.System.currentTimeMillis();
        r4.A1V();
        r4.AxH(r4.A1N());
        r0 = r9.A00;
        r9.A00 = r10;
        A06(r10);
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(int r10) {
        /*
            r9 = this;
            X.7Ds r1 = r9.A01
            java.util.ArrayList r0 = r9.A02
            java.lang.Object r0 = r0.get(r10)
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            java.lang.Object r7 = r0.first
            java.lang.String r7 = (java.lang.String) r7
            com.whatsapp.conversationslist.ConversationsFragment r4 = r1.A00
            int r0 = r7.hashCode()
            r8 = 3
            java.lang.String r3 = "UNREAD_FILTER"
            java.lang.String r2 = "GROUP_FILTER"
            java.lang.String r1 = "CONTACTS_FILTER"
            java.lang.Integer r6 = X.C18280x3.A0S()
            java.lang.Integer r5 = X.C18290x4.A0Z()
            switch(r0) {
                case -1730152220: goto L_0x0041;
                case -19153930: goto L_0x005b;
                case 72525144: goto L_0x007e;
                case 1827283464: goto L_0x0098;
                default: goto L_0x0026;
            }
        L_0x0026:
            long r0 = java.lang.System.currentTimeMillis()
            r4.A04 = r0
            r4.A1V()
            X.5U2 r0 = r4.A1N()
            r4.AxH(r0)
            int r0 = r9.A00
            r9.A00 = r10
            r9.A06(r10)
            r9.A06(r0)
            return
        L_0x0041:
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L_0x0026
            X.5U2 r0 = r4.A1N()
            r0.A02(r1)
            X.5PO r7 = r4.A1Z
            X.5U2 r0 = r4.A1N()
            long r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass0x7.A0h()
            goto L_0x00ae
        L_0x005b:
            java.lang.String r0 = "ALL_FILTER"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0026
            X.5U2 r1 = r4.A1N()
            r0 = 0
            r1.A02 = r0
            r1.A03 = r0
            X.5PO r7 = r4.A1Z
            X.5U2 r0 = r4.A1N()
            long r2 = r0.A00
            X.4sJ r1 = new X.4sJ
            r1.<init>()
            r1.A00 = r6
            r1.A01 = r5
            goto L_0x00b7
        L_0x007e:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x0026
            X.5U2 r0 = r4.A1N()
            r0.A02(r2)
            X.5PO r7 = r4.A1Z
            X.5U2 r0 = r4.A1N()
            long r2 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x00ae
        L_0x0098:
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0026
            X.5U2 r0 = r4.A1N()
            r0.A02(r3)
            X.5PO r7 = r4.A1Z
            X.5U2 r0 = r4.A1N()
            long r2 = r0.A00
            r0 = r6
        L_0x00ae:
            X.4sJ r1 = new X.4sJ
            r1.<init>()
            r1.A00 = r6
            r1.A01 = r0
        L_0x00b7:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A04 = r0
            r1.A03 = r5
            X.4FV r0 = r7.A00
            r0.BhD(r1)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87874Wl.A0K(int):void");
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r3, int i) {
        AnonymousClass4YG r32 = (AnonymousClass4YG) r3;
        C162457s7.A0J(r32, 0);
        TextView textView = r32.A00;
        textView.setText((CharSequence) ((AnonymousClass3Z6) this.A02.get(i)).second);
        textView.setSelected(AnonymousClass000.A1U(i, this.A00));
        C106905aM.A04(textView);
        C109695f2.A00(textView, this, i, 10);
    }

    public C87874Wl(C147337Ds r1, ArrayList arrayList) {
        this.A02 = arrayList;
        this.A01 = r1;
    }
}
