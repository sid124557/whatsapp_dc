package X;

import android.content.Intent;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.6Ae  reason: invalid class name and case insensitive filesystem */
public class C123896Ae implements C17190ui {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C123896Ae(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A01 = obj2;
        this.A03 = obj4;
        this.A00 = obj3;
        this.A02 = obj;
    }

    public /* synthetic */ C05550Ty Azr(Class cls) {
        if (this.A04 != 0) {
            StatusesViewModel statusesViewModel = (StatusesViewModel) this.A02;
            UpdatesAdvertiseViewModel updatesAdvertiseViewModel = (UpdatesAdvertiseViewModel) this.A03;
            C64333Db r0 = ((AnonymousClass5FB) this.A00).A00.A01;
            AnonymousClass4FS A8y = C64333Db.A8y(r0);
            C107695bk r9 = r0.A00;
            AnonymousClass5UP A0n = C86634Kw.A0n(r0);
            AnonymousClass4C1 r20 = r9.A1Q;
            AnonymousClass4C1 r19 = r9.AA9;
            C102335Il APZ = r9.APZ();
            C102185Hu APb = r9.APb();
            AnonymousClass2MD Aqu = r0.Aqu();
            C56612sH A2p = C64333Db.A2p(r0);
            C64333Db r02 = r9.ACP;
            AnonymousClass33p A0W = C86614Ku.A0W(r02);
            AnonymousClass33p r1 = A0W;
            C102715Jz r2 = new C102715Jz(r1, C86604Kt.A0Y(r02), (AnonymousClass5UP) r02.ANe.get(), (AnonymousClass5YD) r02.ANq.get());
            C183538qC A002 = C72343dZ.A00(r9.AAQ);
            AnonymousClass46Q r39 = AnonymousClass2C4.A01;
            C615931l.A00(r39);
            AnonymousClass4C1 r37 = r20;
            AnonymousClass4C1 r38 = r19;
            AnonymousClass5FF r202 = (AnonymousClass5FF) r9.A1R.get();
            AnonymousClass5FG r21 = (AnonymousClass5FG) r9.A5S.get();
            AnonymousClass5FH r22 = (AnonymousClass5FH) r9.A5T.get();
            C53502nC r24 = (C53502nC) r9.A82.get();
            C103295Mi r26 = (C103295Mi) r9.ABB.get();
            return new UpdatesViewModel((AnonymousClass5FC) r9.ABr.get(), (AnonymousClass5FD) r9.A5U.get(), (AnonymousClass5FE) r9.A6d.get(), r202, r21, r22, A2p, r24, A0n, r26, APZ, updatesAdvertiseViewModel, APb, Aqu, (CrossPostingUpdatesViewModel) this.A01, (AnonymousClass5X9) r9.ABC.get(), statusesViewModel, r2, A8y, A002, r37, r38, r39);
        }
        throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public C05550Ty B09(AnonymousClass0N3 r34, Class cls) {
        if (this.A04 != 0) {
            return C86604Kt.A0K(this, cls);
        }
        C118075sx r2 = ((C101395Ep) this.A01).A00;
        C88834as r0 = r2.A01;
        C64333Db r22 = r2.A03;
        AnonymousClass4FS A8y = C64333Db.A8y(r22);
        AnonymousClass1VX A4B = C64333Db.A4B(r22);
        C107695bk r1 = r22.A00;
        C66473Lo A0f = C86634Kw.A0f(r22);
        C56972sr A06 = C64333Db.A06(r22);
        AnonymousClass5ZU A28 = C64333Db.A28(r22);
        AnonymousClass3LP Akp = r22.Akp();
        C48952fk A17 = C86664Kz.A17(r22);
        C53202mi A0Z = C86654Ky.A0Z(r22);
        AnonymousClass46Q r31 = AnonymousClass2C4.A01;
        C615931l.A00(r31);
        AnonymousClass2R8 r21 = (AnonymousClass2R8) r22.AWC.get();
        C102005Hc r25 = (C102005Hc) r0.A3k.get();
        C149867Of r26 = (C149867Of) r1.A6c.get();
        C95814uZ r27 = (C95814uZ) this.A03;
        C50452iC r28 = (C50452iC) r1.ABs.get();
        AnonymousClass5WX r29 = (AnonymousClass5WX) r1.A9K.get();
        return new C91524kJ((Intent) this.A02, (C39512Cg) r0.A3G.get(), (AnonymousClass2V0) r0.A3H.get(), (C101405Eq) r0.A3I.get(), (AnonymousClass2V1) r0.A3J.get(), A06, (C106185Xy) r1.A1j.get(), A28, A17, A0f, (AnonymousClass3ZH) this.A00, (C49022fr) r1.A3R.get(), r21, A4B, Akp, A0Z, r25, r26, r27, r28, r29, A8y, r31, C69723Yd.A00());
    }
}
