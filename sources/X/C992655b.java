package X;

import android.provider.ContactsContract;
import android.util.SparseArray;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.55b  reason: invalid class name and case insensitive filesystem */
public class C992655b extends AnonymousClass5ZM {
    public final C106175Xx A00;
    public final C621033m A01;
    public final C56612sH A02;
    public final C620733j A03;
    public final C66543Lv A04;
    public final C95814uZ A05;
    public final C27991fJ A06;
    public final AnonymousClass2z0 A07;
    public final C55832qz A08;
    public final WeakReference A09;
    public final ArrayList A0A;
    public final ArrayList A0B;
    public final boolean A0C;

    public C992655b(C106175Xx r2, C621033m r3, C56612sH r4, C620733j r5, C66543Lv r6, C95814uZ r7, C27991fJ r8, AnonymousClass2z0 r9, C55832qz r10, ViewSharedContactArrayActivity viewSharedContactArrayActivity, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        super(viewSharedContactArrayActivity, true);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
        this.A08 = r10;
        this.A09 = AnonymousClass0x9.A14(viewSharedContactArrayActivity);
        this.A05 = r7;
        this.A0A = arrayList;
        this.A0B = arrayList2;
        this.A0C = z;
        this.A07 = r9;
        this.A06 = r8;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        C89654ea A0F = C18320x8.A0F(this.A09);
        if (A0F != null) {
            A0F.BjL();
            if (bool.booleanValue()) {
                C18290x4.A18(A0F);
            } else {
                A0F.Bot(R.string.f11nameremoved);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        C624134x r9;
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            arrayList = this.A0A;
            r9 = null;
            if (i >= arrayList.size()) {
                break;
            }
            C106705a1 r6 = (C106705a1) arrayList.get(i);
            SparseArray sparseArray = (SparseArray) this.A0B.get(i);
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                AnonymousClass5I7 r8 = (AnonymousClass5I7) sparseArray.get(i2);
                if (!r8.A01) {
                    C18260x0.A0y("unchecked:", AnonymousClass001.A0o(), i2);
                    if (r8.A00 instanceof AnonymousClass5T6) {
                        AnonymousClass5T6 r82 = (AnonymousClass5T6) r8.A00;
                        List list = (List) r6.A08.get(r82.A01);
                        if (list != null) {
                            list.remove(r82);
                            if (list.isEmpty()) {
                                r6.A08.remove(r82.A01);
                            }
                        }
                    } else {
                        Object obj = r8.A00;
                        if (obj instanceof AnonymousClass5KP) {
                            AnonymousClass5KP r1 = (AnonymousClass5KP) obj;
                            r6.A03.remove(r1);
                            Class<ContactsContract.CommonDataKinds.StructuredPostal> cls = r1.A01;
                            if (cls == ContactsContract.CommonDataKinds.Email.class) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("email");
                                C18260x0.A0o(r8.A00, A0o);
                            } else if (cls == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("postal");
                                C18260x0.A0o(r8.A00, A0o2);
                            }
                        } else if (obj instanceof AnonymousClass7OD) {
                            r6.A06.remove(r8.A00);
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            A0o3.append("phone:");
                            C18260x0.A0o(r8.A00, A0o3);
                        } else if (r8.A00 instanceof C148467Im) {
                            r6.A07.remove(r8.A00);
                            StringBuilder A0o4 = AnonymousClass001.A0o();
                            A0o4.append("website:");
                            C18260x0.A0o(r8.A00, A0o4);
                        } else if (r8.A00 instanceof C148447Ik) {
                            r6.A09.A01 = null;
                            StringBuilder A0o5 = AnonymousClass001.A0o();
                            A0o5.append("lid:");
                            C18260x0.A0o(r8.A00, A0o5);
                        }
                    }
                }
            }
            try {
                A0s.add(new C105755Wg(this.A00, this.A03).A01(r6));
                i++;
            } catch (C143696zK e) {
                Log.e((Throwable) e);
                return Boolean.FALSE;
            }
        }
        AnonymousClass2z0 r12 = this.A07;
        if (r12 != null) {
            r9 = this.A08.A05(r12);
        } else {
            C27991fJ r2 = this.A06;
            if (r2 != null) {
                r9 = C385328b.A00(r2, (String) null, (String) null, this.A02.A0H());
            }
        }
        if (arrayList.size() > 1) {
            C621033m r22 = this.A01;
            C95814uZ r0 = this.A05;
            r22.A0W(r9, Collections.singletonList(r0), A0s, this.A0C);
        } else {
            C621033m r83 = this.A01;
            C95814uZ r13 = this.A05;
            r83.A0V(r9, ((C106705a1) arrayList.get(0)).A03(), C86664Kz.A1M(A0s, 0), Collections.singletonList(r13), this.A0C);
        }
        return Boolean.TRUE;
    }
}
