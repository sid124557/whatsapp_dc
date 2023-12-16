package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.Main;
import com.whatsapp.accountsync.ProfileActivity;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import java.util.Objects;

/* renamed from: X.1FB  reason: invalid class name */
public abstract class AnonymousClass1FB extends AnonymousClass1Fj {
    public AnonymousClass3LN A00;
    public C85114Ez A01;
    public final boolean A02;
    public final boolean A03;

    public static void A1g(C64333Db r1, ProfileActivity profileActivity, C66493Lq r3) {
        profileActivity.A06 = r3;
        profileActivity.A07 = (WhatsAppLibLoader) r1.AbT.get();
        profileActivity.A03 = (C44772Xk) r1.A6I.get();
        profileActivity.A05 = (C72303dV) r1.AMC.get();
        profileActivity.A08 = (AnonymousClass317) r1.ATf.get();
    }

    public static boolean A1h(Main main) {
        return ((C53962nx) main.A0A.get()).A01();
    }

    public C183538qC A74() {
        if (this instanceof ProfileActivity) {
            return new C72333dY(((ProfileActivity) this).A08, (AnonymousClass4C1) null);
        }
        C183538qC r1 = ((Main) this).A0E;
        Objects.requireNonNull(r1);
        return C72333dY.A05(r1, 0);
    }

    public void A75() {
        if (this instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) this;
            if (profileActivity.A06.A0l.A01) {
                C33701tY r0 = profileActivity.A01;
                if (r0 == null || r0.A06() != 1) {
                    C33701tY r1 = new C33701tY(profileActivity);
                    profileActivity.A01 = r1;
                    C18270x1.A0w(r1, profileActivity.A04);
                    return;
                }
                return;
            }
            profileActivity.A79();
        }
    }

    public void A76(int i) {
    }

    public void A77(C59852xb r1) {
    }

    public void A78(boolean z) {
        this.A01.BkT(z, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 200) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            A78(false);
        } else if (this.A01.Ayl()) {
            this.A01.BsA();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass3LN r0 = this.A00;
        boolean z = this.A03;
        boolean z2 = this.A02;
        AnonymousClass2ET r13 = new AnonymousClass2ET(this);
        C64333Db r02 = r0.A00.A00.A01;
        C69263Wi A04 = C64333Db.A04(r02);
        AnonymousClass4FS A8y = C64333Db.A8y(r02);
        C183538qC A002 = C72343dZ.A00(r02.ATf);
        C66423Lj r26 = (C66423Lj) r02.AUX.get();
        C28861ht r27 = (C28861ht) r02.AJH.get();
        C50602iS r28 = (C50602iS) r02.AR1.get();
        C47322d4 r24 = (C47322d4) r02.AMD.get();
        C66523Lt r25 = (C66523Lt) r02.ASB.get();
        C48502f0 r22 = (C48502f0) r02.A1s.get();
        C55272q5 r23 = (C55272q5) r02.AMB.get();
        C56512s6 r20 = (C56512s6) r02.AK3.get();
        C61072zf r21 = (C61072zf) r02.AXI.get();
        AnonymousClass2ET r17 = r13;
        C32381qJ r14 = new C32381qJ(this, A04, r17, (AnonymousClass0N6) r02.A1u.get(), (C65203Gp) r02.AXm.get(), r20, r21, r22, r23, r24, r25, r26, r27, r28, A8y, A002, C72343dZ.A00(r02.AUj), z, z2);
        this.A01 = r14;
        AnonymousClass1Ha.A21(this, r14.A00, 0);
    }

    public Dialog onCreateDialog(int i) {
        Dialog BQM = this.A01.BQM(i);
        if (BQM == null) {
            return super.onCreateDialog(i);
        }
        return BQM;
    }

    public AnonymousClass1FB(boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
    }

    public AnonymousClass1FB() {
        this(false, true);
    }
}
