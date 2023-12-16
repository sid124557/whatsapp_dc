package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9Tt  reason: invalid class name and case insensitive filesystem */
public class C194619Tt {
    public long A00 = -1;
    public final AnonymousClass2XO A01;
    public final C69263Wi A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final AnonymousClass31C A05;
    public final AnonymousClass9U1 A06;
    public final C196629bS A07;
    public final C40602Ha A08;
    public final C620933l A09;
    public final Set A0A = AnonymousClass002.A0K();

    public synchronized int A00() {
        return this.A0A.size();
    }

    public synchronized Set A01() {
        HashSet A0K;
        A0K = AnonymousClass002.A0K();
        for (AnonymousClass9SS r0 : this.A0A) {
            A0K.add((String) r0.A00.A00);
        }
        return A0K;
    }

    public void A02(Activity activity, C202479m5 r10, AnonymousClass9U5 r11, String str, boolean z) {
        this.A01.A00(activity, new C195919a0(activity, this, r10, r11, str, z), z);
    }

    public synchronized void A03(C166557yt r6, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: IndiaUpiBlockListManager before block vpa: ");
        A0o.append(r6);
        C18260x0.A1E(" blocked: ", A0o, z);
        if (z) {
            AnonymousClass9SS r2 = new AnonymousClass9SS(r6, this);
            Set<AnonymousClass9SS> set = this.A0A;
            if (!set.contains(r2)) {
                set.add(r2);
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiBlockListManager add vpa: ", r2);
                C620933l r3 = this.A09;
                HashSet A0K = AnonymousClass002.A0K();
                for (AnonymousClass9SS r0 : set) {
                    A0K.add(r0.A00.A00);
                }
                C18270x1.A0j(C620933l.A00(r3), "payments_block_list", TextUtils.join(";", A0K));
            }
        } else {
            AnonymousClass9SS r22 = new AnonymousClass9SS(r6, this);
            Set<AnonymousClass9SS> set2 = this.A0A;
            if (set2.contains(r22)) {
                set2.remove(r22);
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiBlockListManager remove vpa: ", r22);
                C620933l r32 = this.A09;
                HashSet A0K2 = AnonymousClass002.A0K();
                for (AnonymousClass9SS r02 : set2) {
                    A0K2.add(r02.A00.A00);
                }
                C18270x1.A0j(C620933l.A00(r32), "payments_block_list", TextUtils.join(";", A0K2));
            }
        }
    }

    public synchronized boolean A05() {
        return AnonymousClass000.A1S((this.A00 > -1 ? 1 : (this.A00 == -1 ? 0 : -1)));
    }

    public synchronized boolean A06() {
        boolean z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: IndiaUpiBlockListManager shouldFetch lastFetched: ");
        A0o.append(this.A00);
        C18280x3.A14(A0o);
        if (!this.A07.A04().A01()) {
            if (this.A00 != -1) {
                if (this.A03.A0H() - this.A00 >= 86400000) {
                }
            }
            z = true;
        }
        z = false;
        return z;
    }

    public synchronized boolean A07(C166557yt r3) {
        return this.A0A.contains(new AnonymousClass9SS(r3, this));
    }

    public void A04(C202479m5 r25, AnonymousClass9U5 r26) {
        AnonymousClass9A7 r10 = new AnonymousClass9A7(this.A04.A00, this.A02, this.A05, this, this.A06, this.A08, r26);
        AnonymousClass9O9 r15 = new AnonymousClass9O9(this, r25);
        Log.i("PAY: getBlockedVpas called");
        ArrayList A0J = AnonymousClass002.A0J(r10.A03.A01());
        for (int i = 0; i < A0J.size(); i++) {
            A0J.set(i, C627236i.A05(AnonymousClass0x9.A0z((String) A0J.get(i))));
        }
        Collections.sort(A0J);
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            A0o.append(AnonymousClass001.A0m(it));
        }
        String A052 = C627236i.A05(A0o.toString());
        C153607bd r3 = r10.A00;
        if (r3 != null) {
            r3.A03("upi-get-blocked-vpas");
        }
        AnonymousClass31C r2 = r10.A02;
        String A032 = r2.A03();
        C35371wl A0X = C1899693i.A0X(A032);
        C56052rL A012 = C56052rL.A01();
        C1899593h.A1M(A012);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-get-blocked-vpas");
        if (A052 != null && C1899593h.A1Z(A052, 0, true)) {
            C56052rL.A0D(A0U, "hash", A052);
        }
        A0U.A0K("2", "version", C192089Id.A00);
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A012, A0X);
        C40602Ha r16 = r10.A04;
        r2.A0D(new C203929oX(r10.A00, r10.A01, r15, r16, r3, r10), A033, A032, 204, 0);
    }

    public C194619Tt(AnonymousClass2XO r7, C69263Wi r8, C56612sH r9, C54292oU r10, AnonymousClass31C r11, AnonymousClass9U1 r12, C196629bS r13, C40602Ha r14, C620933l r15) {
        this.A04 = r10;
        this.A03 = r9;
        this.A01 = r7;
        this.A02 = r8;
        this.A05 = r11;
        this.A09 = r15;
        this.A06 = r12;
        this.A08 = r14;
        this.A07 = r13;
        this.A00 = r15.A03().getLong("payments_block_list_last_sync_time", -1);
        String string = r15.A03().getString("payments_block_list", "");
        if (!TextUtils.isEmpty(string)) {
            for (String A0B : string.split(";")) {
                this.A0A.add(new AnonymousClass9SS(C1899593h.A0B(A0B), this));
            }
        }
    }
}
