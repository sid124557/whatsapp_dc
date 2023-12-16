package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4WZ  reason: invalid class name */
public final class AnonymousClass4WZ extends AnonymousClass0R6 {
    public String A00;
    public String A01;
    public final AnonymousClass5Y0 A02;
    public final C101905Gs A03;
    public final C101915Gt A04;
    public final C101925Gu A05;
    public final List A06 = AnonymousClass001.A0s();
    public final List A07;

    public AnonymousClass4WZ(AnonymousClass5Y0 r4, C101905Gs r5, C101915Gt r6, List list) {
        C18270x1.A11(r6, 3, r5);
        this.A07 = list;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        for (Object add : C73723fy.A0J(list, 5)) {
            this.A06.add(add);
        }
        this.A05 = new C101925Gu(this);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YZ(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false), this.A04, this.A05, this);
    }

    public int A0G() {
        return this.A06.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
        if (X.C162457s7.A0P(r4, r7.A00) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r8, int r9) {
        /*
            r7 = this;
            X.4YZ r8 = (X.AnonymousClass4YZ) r8
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            java.util.List r0 = r7.A06
            java.lang.Object r1 = r0.get(r9)
            X.2mD r1 = (X.C52892mD) r1
            com.whatsapp.TextEmojiLabel r0 = r8.A00
            java.lang.String r6 = r1.A03
            r5 = 0
            r0.A0K(r5, r6)
            java.lang.String r4 = r1.A02
            if (r4 == 0) goto L_0x0047
            com.whatsapp.WaImageView r2 = r8.A02
            android.content.res.Resources r1 = r0.getResources()
            X.C162457s7.A0D(r1)
            X.5Y0 r0 = r7.A02
            android.graphics.drawable.Drawable r0 = X.AnonymousClass31U.A00(r1, r0, r4)
            r2.setImageDrawable(r0)
            r8.A03 = r4
        L_0x002e:
            com.whatsapp.WaImageView r2 = r8.A01
            java.lang.String r0 = r7.A01
            boolean r0 = X.C162457s7.A0P(r6, r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r7.A00
            boolean r1 = X.C162457s7.A0P(r4, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0043
        L_0x0041:
            r0 = 8
        L_0x0043:
            r2.setVisibility(r0)
            return
        L_0x0047:
            com.whatsapp.WaImageView r3 = r8.A02
            android.content.Context r2 = r3.getContext()
            r1 = 2131231686(0x7f0803c6, float:1.807946E38)
            r0 = 2131101258(0x7f06064a, float:1.781492E38)
            X.C107335b8.A0C(r2, r3, r1, r0)
            r8.A03 = r5
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WZ.BNf(X.0Ua, int):void");
    }
}
