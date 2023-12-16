package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.4WX  reason: invalid class name */
public final class AnonymousClass4WX extends AnonymousClass0R6 {
    public List A00 = C72023d3.A00;
    public final AnonymousClass5FY A01;
    public final C105365Uq A02;
    public final AnonymousClass5UP A03;
    public final AnonymousClass53Z A04;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        boolean A022 = this.A03.A02();
        int i2 = R.layout.f8nameremoved;
        if (A022) {
            i2 = R.layout.f8nameremoved;
        }
        View inflate = C18280x3.A0D(viewGroup).inflate(i2, viewGroup, false);
        AnonymousClass5FY r0 = this.A01;
        C162457s7.A0H(inflate);
        C105365Uq r4 = this.A02;
        AnonymousClass53Z r6 = this.A04;
        C64333Db r1 = r0.A00.A01;
        return new C88354Yk(inflate, C64333Db.A28(r1), r4, C86634Kw.A0n(r1), r6, r1.A00.APv());
    }

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        int i2;
        C88354Yk r82 = (C88354Yk) r8;
        C162457s7.A0J(r82, 0);
        AnonymousClass5SK r3 = (AnonymousClass5SK) this.A00.get(i);
        C162457s7.A0J(r3, 0);
        AnonymousClass3ZH r5 = r3.A00;
        int i3 = 0;
        r82.A05.A05(r82.A03, r82.A08, r5, false);
        WaTextView waTextView = r82.A02;
        waTextView.setText(r82.A04.A0L(r5));
        if (r82.A06.A02()) {
            C106905aM.A04(waTextView);
        }
        C109715f4.A00(r82.A0H, r82, r3, i, 15);
        WaButtonWithLoader waButtonWithLoader = r82.A00;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A00 = new C109715f4(r82, r3, i, 16);
            waButtonWithLoader.A06 = AnonymousClass000.A1S(r3.A01 ? 1 : 0);
            waButtonWithLoader.A00();
            if (AnonymousClass000.A1Y(r3.A02.A07, C372821q.GUEST)) {
                waButtonWithLoader.setVariant(C142006wU.TONAL);
                i2 = R.string.f11nameremoved;
            } else {
                waButtonWithLoader.setVariant(C142006wU.OUTLINE);
                i2 = R.string.f11nameremoved;
            }
            waButtonWithLoader.setButtonText(i2);
        }
        ViewStub viewStub = r82.A01;
        C162457s7.A0C(viewStub);
        if (!r3.A02.A0L()) {
            i3 = 8;
        }
        viewStub.setVisibility(i3);
    }

    public AnonymousClass4WX(AnonymousClass5FY r2, C105365Uq r3, AnonymousClass5UP r4, AnonymousClass53Z r5) {
        C18260x0.A0Q(r2, r4);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }
}
