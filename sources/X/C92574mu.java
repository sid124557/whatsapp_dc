package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;

/* renamed from: X.4mu  reason: invalid class name and case insensitive filesystem */
public class C92574mu extends C93314oJ {
    public boolean A00;
    public final C89654ea A01;
    public final AnonymousClass49C A02 = new C170868Ev(this);
    public final SharePhoneNumberRowViewModel A03;
    public final C95814uZ A04;

    private AnonymousClass3LX getSharePhoneNumberBridge() {
        return (AnonymousClass3LX) ((C48062eH) this.A2B.get()).A02(AnonymousClass3LX.class);
    }

    public void A0v() {
        if (!this.A00) {
            this.A00 = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0L(A0A, r2, this);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public C92574mu(Context context, AnonymousClass677 r8, C30371mL r9) {
        super(context, r8, r9);
        A0v();
        setLongClickable(false);
        C89654ea A05 = C111095hX.A05(context);
        this.A01 = A05;
        this.A03 = (SharePhoneNumberRowViewModel) AnonymousClass0x9.A0H(A05).A01(SharePhoneNumberRowViewModel.class);
        AnonymousClass2z0 r1 = r9.A1J;
        this.A04 = r1.A00;
        setVisibility(8);
        C95814uZ r5 = this.A04;
        if (r5 != null) {
            boolean z = r1.A02;
            SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel = this.A03;
            AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
            C70333aK.A00(sharePhoneNumberRowViewModel.A04, sharePhoneNumberRowViewModel, r5, A0b, 33);
            A0b.A0B(this.A01, new C100345Ao(1, this, z));
            if (!z) {
                setUpShareCta(r5);
            }
        }
    }

    private void setUpShareCta(C95814uZ r4) {
        AnonymousClass547.A00(C06560Yg.A02(getRootView(), R.id.request_phone_button), r4, this, AnonymousClass32Y.A03(r4), 13);
    }

    public int getMainChildMaxWidth() {
        if (A14() || !C87094Nz.A0g(this)) {
            return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        return 0;
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
