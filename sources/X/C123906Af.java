package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6Af  reason: invalid class name and case insensitive filesystem */
public class C123906Af implements C17190ui {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C123906Af(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = obj3;
    }

    public /* synthetic */ C05550Ty Azr(Class cls) {
        if (this.A03 != 0) {
            C64333Db r0 = ((AnonymousClass5D2) this.A01).A00.A03;
            AnonymousClass4FS A8y = C64333Db.A8y(r0);
            return new C87694Uy(r0.A00.AJR(), (UserJid) this.A02, (C104725Sc) this.A00, A8y);
        }
        throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public C05550Ty B09(AnonymousClass0N3 r15, Class cls) {
        if (this.A03 != 0) {
            return C86604Kt.A0K(this, cls);
        }
        AnonymousClass3ZH r8 = (AnonymousClass3ZH) this.A00;
        C118075sx r2 = ((AnonymousClass5DY) this.A01).A00;
        C88834as r1 = r2.A01;
        C39512Cg r4 = (C39512Cg) r1.A3G.get();
        C64333Db r22 = r2.A03;
        AnonymousClass4FS A8y = C64333Db.A8y(r22);
        C64333Db r0 = r1.A4Z;
        C94174qF r5 = new C94174qF(C86634Kw.A0a(r0), C86614Ku.A0U(r0), C86604Kt.A0g(r0));
        C56982ss A39 = C64333Db.A39(r22);
        C107695bk r12 = r22.A00;
        C103605Nq r11 = (C103605Nq) r12.A84.get();
        C56662sM r9 = (C56662sM) r22.AaX.get();
        return new C91534kK(r4, r5, C64333Db.A26(r22), A39, r8, r9, (C95814uZ) this.A02, r11, (C103985Pe) r12.A8A.get(), A8y);
    }
}
