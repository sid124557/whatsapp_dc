package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.4W8  reason: invalid class name */
public class AnonymousClass4W8 extends AnonymousClass09G {
    public int A00 = -1;
    public boolean A01;
    public boolean A02;
    public final C101085Dk A03;
    public final C101095Dl A04;
    public final PollCreatorViewModel A05;
    public final List A06 = AnonymousClass001.A0s();

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            C101085Dk r0 = this.A03;
            PollCreatorViewModel pollCreatorViewModel = this.A05;
            C64333Db r02 = r0.A00.A03;
            AnonymousClass1VX A4B = C64333Db.A4B(r02);
            AnonymousClass5Y0 A3o = C64333Db.A3o(r02);
            return new C97474yN(inflate, C64333Db.A2o(r02), C107695bk.A1l(r02.A00), A3o, A4B, pollCreatorViewModel, C64333Db.A74(r02));
        } else if (i == 1) {
            return new C137366oZ(C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false));
        } else {
            if (i == 2) {
                View inflate2 = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
                C101095Dl r03 = this.A04;
                PollCreatorViewModel pollCreatorViewModel2 = this.A05;
                C64333Db r04 = r03.A00.A03;
                AnonymousClass1VX A4B2 = C64333Db.A4B(r04);
                AnonymousClass5Y0 A3o2 = C64333Db.A3o(r04);
                return new C97484yO(inflate2, C64333Db.A2o(r04), C64333Db.A2t(r04), C107695bk.A1l(r04.A00), A3o2, A4B2, pollCreatorViewModel2, C64333Db.A74(r04));
            }
            throw C86604Kt.A0h("Unrecognized view type = ", AnonymousClass001.A0o(), i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ((X.AnonymousClass000.A09(r3, X.AnonymousClass002.A04(r3, 1)) + 2) != r10) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r9, int r10) {
        /*
            r8 = this;
            X.6I5 r9 = (X.AnonymousClass6I5) r9
            boolean r0 = r9 instanceof X.C97484yO
            if (r0 == 0) goto L_0x00be
            java.util.List r3 = r8.A06
            java.util.Iterator r1 = r3.iterator()
        L_0x000c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bb
            int r0 = X.C18280x3.A05(r1)
            int r0 = r0 + 2
            if (r0 != r10) goto L_0x000c
            r7 = 1
        L_0x001b:
            r2 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0036
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0036
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0036
            int r0 = X.AnonymousClass002.A04(r3, r1)
            int r0 = X.AnonymousClass000.A09(r3, r0)
            int r0 = r0 + 2
            r6 = 1
            if (r0 == r10) goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            X.4yO r9 = (X.C97484yO) r9
            java.lang.Object r1 = r8.A0K(r10)
            X.4yQ r1 = (X.C97504yQ) r1
            int r0 = r8.A00
            if (r0 != r10) goto L_0x0044
            r2 = 1
        L_0x0044:
            int r0 = r1.A00
            r9.A00 = r0
            java.lang.String r5 = r1.A00
            com.whatsapp.WaEditText r4 = r9.A02
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = X.C18290x4.A0m(r4)
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 != 0) goto L_0x005f
            r4.setText(r5)
        L_0x005f:
            if (r2 == 0) goto L_0x00b0
            java.lang.String r0 = "PollCreatorOptionViewHolder/showMaxOptionText"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.view.View r0 = r9.A0H
            android.content.Context r3 = r0.getContext()
            X.33i r2 = r9.A03
            android.content.Context r1 = r0.getContext()
            r0 = 2131892673(0x7f1219c1, float:1.94201E38)
            java.lang.String r0 = r1.getString(r0)
            X.C107295b4.A00(r3, r2, r0)
            X.5UY r1 = r9.A05
            r0 = 0
            r1.A06(r0)
        L_0x0082:
            if (r6 == 0) goto L_0x00ac
            r4.requestFocus()
            X.C86654Ky.A1D(r4, r5)
        L_0x008a:
            X.5UY r1 = r9.A04
            int r0 = X.C86614Ku.A09(r7)
            r1.A06(r0)
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto L_0x00ab
            android.graphics.drawable.Drawable r2 = r9.A01
            java.lang.String r0 = r0.toString()
            boolean r1 = r0.isEmpty()
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x00a8
            r0 = 0
        L_0x00a8:
            r2.setAlpha(r0)
        L_0x00ab:
            return
        L_0x00ac:
            r4.clearFocus()
            goto L_0x008a
        L_0x00b0:
            X.5UY r1 = r9.A05
            r0 = 8
            r1.A06(r0)
            X.C86654Ky.A1D(r4, r5)
            goto L_0x0082
        L_0x00bb:
            r7 = 0
            goto L_0x001b
        L_0x00be:
            boolean r0 = r9 instanceof X.C97474yN
            if (r0 == 0) goto L_0x00ab
            X.4yN r9 = (X.C97474yN) r9
            java.lang.Object r2 = r8.A0K(r10)
            X.4yR r2 = (X.C97514yR) r2
            com.whatsapp.WaEditText r1 = r9.A00
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = r2.A00
            X.C86654Ky.A1D(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4W8.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return 2;
        }
        return 1;
    }

    public AnonymousClass4W8(AnonymousClass0O4 r2, C101085Dk r3, C101095Dl r4, PollCreatorViewModel pollCreatorViewModel) {
        super(r2);
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = pollCreatorViewModel;
    }
}
