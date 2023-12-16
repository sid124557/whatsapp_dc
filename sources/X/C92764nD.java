package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4nD  reason: invalid class name and case insensitive filesystem */
public final class C92764nD extends C93164o0 {
    public C114015mM A00;
    public C179238ip A01;
    public AnonymousClass4UU A02;
    public boolean A03;
    public final Context A04;
    public final C17190ui A05;
    public final AnonymousClass677 A06;
    public final C30341mI A07;
    public final AnonymousClass5UY A08 = C18290x4.A0X(this, R.id.conversationRow_groupCreatedContextCard_addMembersButtonStub);
    public final WDSProfilePhoto A09 = ((WDSProfilePhoto) C18290x4.A0M(this, R.id.conversationRow_groupCreatedContextCard_groupPhoto));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92764nD(Context context, AnonymousClass677 r7, C30341mI r8) {
        super(context, r7, r8);
        Boolean bool;
        C162457s7.A0J(context, 1);
        A0v();
        this.A04 = context;
        this.A07 = r8;
        this.A06 = r7;
        C179238ip viewModelAssistedFactory = getViewModelAssistedFactory();
        AnonymousClass3ZH r2 = this.A03;
        C162457s7.A0J(r2, 1);
        C124086Ax r1 = new C124086Ax(r2, 5, viewModelAssistedFactory);
        this.A05 = r1;
        this.A02 = (AnonymousClass4UU) AnonymousClass4L0.A0F(r1, getBaseActivity()).A01(AnonymousClass4UU.class);
        C86604Kt.A1N(getBaseActivity(), this.A02.A01, new AnonymousClass61E(this), 188);
        C86604Kt.A1N(getBaseActivity(), this.A02.A00, new AnonymousClass61F(this), 189);
        C107555bV.A05(this, this.A0M, 0, 0);
        AnonymousClass4UU r3 = this.A02;
        AnonymousClass08M r0 = r3.A03;
        AnonymousClass3ZH r22 = r3.A06;
        r0.A0G(r22);
        boolean A012 = AnonymousClass31Y.A01(r3.A05, r22, r3.A07);
        AnonymousClass08M r12 = r3.A02;
        if (!A012) {
            bool = Boolean.FALSE;
        } else {
            bool = Boolean.TRUE;
        }
        r12.A0G(bool);
    }

    public final void setContactPhotos(C114015mM r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setViewModelAssistedFactory(C179238ip r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public void A0v() {
        if (!this.A03) {
            this.A03 = true;
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
            this.A00 = C86654Ky.A0W(r2);
            this.A01 = (C179238ip) A0C.A00.get();
            this.A00 = C86604Kt.A0S(r2);
        }
    }

    public final C114015mM getContactPhotos() {
        C114015mM r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public final C179238ip getViewModelAssistedFactory() {
        C179238ip r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("viewModelAssistedFactory");
    }

    public int getLayoutResId() {
        return R.layout.f8nameremoved;
    }
}
