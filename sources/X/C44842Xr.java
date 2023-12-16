package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2Xr  reason: invalid class name and case insensitive filesystem */
public final class C44842Xr {
    public final C64773Ex A00;
    public final AnonymousClass1VX A01;

    public final C60662yv A00() {
        Cursor A09;
        if (!this.A01.A0Y(C58422vE.A02, 5868)) {
            return new C60662yv(AnonymousClass001.A0s(), AnonymousClass001.A0s(), AnonymousClass001.A0s());
        }
        C34461vC r5 = this.A00.A05;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        try {
            AnonymousClass4GK A03 = C18630y0.A03(r5);
            try {
                A09 = AnonymousClass361.A09(A03, C58142um.A09, "NATIVE_CONTACTS_NOT_SYNC_WITH_DEVICE");
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1F(A0o, AnonymousClass0x9.A02(A09, "contact-mgr-db/getSyncPendingNativeContacts/cursor count=", A0o));
                i = A09.getCount();
                while (A09.moveToNext()) {
                    A0s.add(AnonymousClass25S.A00(A09));
                }
                A09.close();
                A03.close();
                r5.A0S(A0s);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18260x0.A19("returned ", A0o2, A0s);
                AnonymousClass33M.A04(A002, " Native contacts | time: ", A0o2);
                ArrayList A0s2 = AnonymousClass001.A0s();
                ArrayList A0s3 = AnonymousClass001.A0s();
                ArrayList A0s4 = AnonymousClass001.A0s();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A0R = C18310x6.A0R(it);
                    if (A0R.A0l) {
                        A0s4.add(A0R);
                    } else {
                        int i2 = A0R.A07;
                        if (i2 == 1) {
                            A0s2.add(A0R);
                        } else if (i2 == 2) {
                            A0s3.add(A0R);
                        }
                    }
                }
                return new C60662yv(A0s2, A0s3, A0s4);
            } catch (Throwable th) {
                A03.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            C34461vC.A05(e, "contactmanagerdb/getSyncPendingNativeContacts/", A0s, i);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public C44842Xr(C64773Ex r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
