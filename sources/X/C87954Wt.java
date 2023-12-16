package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.List;

/* renamed from: X.4Wt  reason: invalid class name and case insensitive filesystem */
public final class C87954Wt extends AnonymousClass0R6 {
    public AnonymousClass4q5 A00;
    public List A01 = C72023d3.A00;
    public final AnonymousClass5FK A02;
    public final AnonymousClass5FL A03;
    public final AnonymousClass5FN A04;
    public final C105365Uq A05;
    public final UpdatesFragment A06;
    public final AnonymousClass66R A07;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        int i2 = R.layout.f8nameremoved;
        if (i == 2) {
            i2 = R.layout.f8nameremoved;
        }
        View inflate = C18280x3.A0D(viewGroup).inflate(i2, viewGroup, false);
        if (i == 0) {
            AnonymousClass5FK r0 = this.A02;
            C162457s7.A0H(inflate);
            C105365Uq r8 = this.A05;
            UpdatesFragment updatesFragment = this.A06;
            C64333Db r1 = r0.A00.A01;
            AnonymousClass5UX A0R = C86614Ku.A0R(r1);
            C112765kG APv = r1.A00.APv();
            return new AnonymousClass53H(inflate, C86614Ku.A0N(r1), A0R, C64333Db.A28(r1), r8, C64333Db.A2t(r1), updatesFragment, APv);
        } else if (i == 1) {
            AnonymousClass5FL r02 = this.A03;
            C162457s7.A0H(inflate);
            C105365Uq r6 = this.A05;
            UpdatesFragment updatesFragment2 = this.A06;
            C64333Db r12 = r02.A00.A01;
            C107695bk r03 = r12.A00;
            return new AnonymousClass53I(inflate, C86614Ku.A0R(r12), r6, (C103295Mi) r03.ABB.get(), updatesFragment2, r03.APv());
        } else if (i == 2) {
            C162457s7.A0H(inflate);
            return new AnonymousClass53Q(inflate, this.A06);
        } else {
            throw AnonymousClass001.A0c("View type not supported");
        }
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        C88504Yz r22 = (C88504Yz) r2;
        C162457s7.A0J(r22, 0);
        C86644Kx.A1O(r22, this.A01, i);
    }

    public int getItemViewType(int i) {
        AnonymousClass58F r0;
        Object obj = this.A01.get(i);
        if (obj instanceof C986452r) {
            r0 = AnonymousClass58F.CONTACT_STATUS;
        } else if (obj instanceof C986352q) {
            r0 = AnonymousClass58F.MY_STATUS;
        } else if (obj instanceof C986252p) {
            r0 = AnonymousClass58F.MUTED_STATUSES;
        } else {
            throw C73153f1.A00();
        }
        return r0.ordinal();
    }

    public C87954Wt(AnonymousClass5FK r2, AnonymousClass5FL r3, AnonymousClass5FN r4, C105365Uq r5, UpdatesFragment updatesFragment, AnonymousClass4FS r7) {
        C18260x0.A0c(r7, r2, r3, r4);
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = updatesFragment;
        this.A07 = C154517dI.A01(new C120355yS(r7));
    }
}
