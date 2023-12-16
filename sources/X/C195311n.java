package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.11n  reason: invalid class name and case insensitive filesystem */
public class C195311n extends AnonymousClass09G {
    public static final AnonymousClass0O4 A02 = new AnonymousClass4H0(0);
    public C105365Uq A00;
    public final C39502Cf A01;

    public C195311n(C39502Cf r2) {
        super(A02);
        this.A01 = r2;
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        Context context = viewGroup2.getContext();
        C626936e.A06(context);
        int i2 = i;
        if (i == 0) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
            inflate.setEnabled(false);
            return new AnonymousClass12C(inflate);
        } else if (i2 == 1) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup2, false);
            C39502Cf r1 = this.A01;
            C105365Uq r8 = this.A00;
            C626936e.A07(r8, "UpcomingScheduledCallsAdapter/onCreateViewHolder single contact photo loader null");
            C64333Db r0 = r1.A00.A03;
            C56612sH A2p = C64333Db.A2p(r0);
            AnonymousClass1VX A4B = C64333Db.A4B(r0);
            C69263Wi A04 = C64333Db.A04(r0);
            C56972sr A06 = C64333Db.A06(r0);
            AnonymousClass4FS A8y = C64333Db.A8y(r0);
            r0.AaA.get();
            r0.AbU.get();
            C55832qz A8F = C64333Db.A8F(r0);
            C56762sW r10 = (C56762sW) r0.A4R.get();
            C56322rn r13 = (C56322rn) r0.AIT.get();
            C66543Lv A3D = C64333Db.A3D(r0);
            C183538qC A002 = C72343dZ.A00(r0.A82);
            return new C197612l(inflate2, A04, A06, (AnonymousClass64J) r0.AEN.get(), (C1230066r) r0.A4Q.get(), r8, A2p, r10, A3D, (AnonymousClass30G) r0.A8h.get(), r13, (C55422qK) r0.AUG.get(), (C50562iN) r0.AKi.get(), A4B, (AnonymousClass35J) r0.ABJ.get(), A8F, A8y, A002);
        } else {
            C18260x0.A0x("UpcomingScheduledCallsAdapter/onCreateViewHolder failed to match type to view: ", AnonymousClass001.A0o(), i2);
            throw AnonymousClass001.A0c("UpcomingScheduledCallsAdapter/onCreateViewHolder type mismatch");
        }
    }

    public void BNf(C05570Ua r8, int i) {
        StringBuilder A0o;
        String str;
        if (i >= A0G()) {
            A0o = AnonymousClass001.A0o();
            str = "UpcomingScheduledCallsAdapter/onBindViewHolder no item exists at position ";
        } else {
            C84354Ca r1 = (C84354Ca) A0K(i);
            if (r1 == null) {
                A0o = AnonymousClass001.A0o();
                str = "UpcomingScheduledCallsAdapter/onBindViewHolder null item at position ";
            } else if (r1.B8k() != 0) {
                ((C197612l) r8).A08((C64573Ea) r1);
                return;
            } else {
                C51312jc r6 = ((AnonymousClass3EZ) r1).A00;
                View view = r8.A0H;
                Context context = view.getContext();
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = r6.A01;
                C18300x5.A0G(view, R.id.title).setText(AnonymousClass002.A0F(context, r6.A00, A0M, 1, R.string.f11nameremoved));
                return;
            }
        }
        C18260x0.A0z(str, A0o, i);
    }

    public int getItemViewType(int i) {
        return ((C84354Ca) A0K(i)).B8k();
    }
}
