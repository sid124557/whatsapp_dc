package X;

import android.content.SharedPreferences;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2nR  reason: invalid class name and case insensitive filesystem */
public class C53652nR {
    public SharedPreferences A00;
    public boolean A01;
    public final AnonymousClass1VX A02;
    public final C56142rU A03;
    public final AnonymousClass2YE A04;
    public final C45212Zc A05;
    public final C60152y5 A06;

    public synchronized int A00(int i) {
        A01();
        return this.A02.A0O(C58422vE.A02, i);
    }

    public final synchronized void A01() {
        synchronized (this) {
            if (!this.A01) {
                AnonymousClass2YE r8 = this.A04;
                C45212Zc r6 = this.A05;
                List<C149007Ko> list = r8.A01.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (C149007Ko r9 : list) {
                    if (r9.A00.BHT(r6)) {
                        r8.A00().update(r9.A01.getBytes());
                        int intValue = new BigInteger(1, r8.A00().digest(((String) r6.A00("device_id")).getBytes())).mod(new BigInteger(Integer.toString(SearchActionVerificationClientService.NOTIFICATION_ID))).intValue();
                        Iterator it = r9.A02.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C149477Mp r3 = (C149477Mp) it.next();
                            Iterator it2 = r3.A03.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    C148997Kn r1 = (C148997Kn) it2.next();
                                    i += r1.A00;
                                    if (intValue < i) {
                                        Pair create = Pair.create(r3, r1);
                                        if (create != null) {
                                            C149477Mp r4 = (C149477Mp) create.first;
                                            C148997Kn r32 = (C148997Kn) create.second;
                                            if (r4.A01.BHT(r6)) {
                                                long A07 = C18280x3.A07();
                                                if (A07 >= r4.A00 && A07 <= 1735632000) {
                                                    AnonymousClass7T3 r0 = new AnonymousClass7T3(r32, r4, r9);
                                                    A0s.add(r0);
                                                    A0s2.addAll(r0.A00.A02);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                SparseArray sparseArray = new SparseArray();
                Iterator it3 = A0s2.iterator();
                while (it3.hasNext()) {
                    C148147Hc r02 = (C148147Hc) it3.next();
                    int i2 = r02.A00;
                    Object obj = r02.A01;
                    if (obj instanceof Boolean) {
                        obj = Integer.valueOf(AnonymousClass001.A1Z(obj) ? 1 : 0);
                    }
                    sparseArray.append(i2, obj.toString());
                }
                C56142rU r42 = this.A03;
                synchronized (r42) {
                    try {
                        SharedPreferences.Editor edit = r42.A00.edit();
                        edit.remove("ab_props:sys:config_hash");
                        edit.remove("ab_props:sys:last_refresh_time");
                        edit.remove("ab_props:sys:last_version");
                        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                            r42.A06(edit, (String) sparseArray.valueAt(i3), sparseArray.keyAt(i3));
                        }
                        edit.apply();
                        r42.A06.A0U();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                HashSet A0K = AnonymousClass002.A0K();
                Iterator it4 = A0s.iterator();
                while (it4.hasNext()) {
                    AnonymousClass0x7.A1D((AnonymousClass7T3) it4.next(), A0K);
                }
                try {
                    SharedPreferences sharedPreferences = this.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = this.A06.A03(C58152un.A0A);
                        this.A00 = sharedPreferences;
                    }
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putStringSet("ab_offline_props:offline_exposure_strings", A0K);
                    edit2.apply();
                    this.A01 = true;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
    }

    public synchronized boolean A02(int i) {
        A01();
        return this.A02.A0Y(C58422vE.A02, i);
    }

    public C53652nR(AnonymousClass1VX r1, C56142rU r2, AnonymousClass2YE r3, C45212Zc r4, C60152y5 r5) {
        this.A02 = r1;
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r5;
    }
}
