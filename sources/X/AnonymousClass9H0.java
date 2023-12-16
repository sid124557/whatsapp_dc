package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
/* renamed from: X.9H0  reason: invalid class name */
public class AnonymousClass9H0 extends AnonymousClass5ZM {
    public final int A00;
    public final C194539Ti A01;
    public final C194489Tb A02;
    public final AnonymousClass9U4 A03;
    public final AnonymousClass2T7 A04;
    public final AnonymousClass4FS A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final WeakReference A08;
    public final boolean A09;
    public final boolean A0A = true;
    public final boolean A0B;

    public AnonymousClass9H0(C89644eZ r4, C194539Ti r5, C194489Tb r6, AnonymousClass9U4 r7, AnonymousClass2T7 r8, AnonymousClass4FS r9, WeakReference weakReference, WeakReference weakReference2, boolean z, boolean z2) {
        this.A05 = r9;
        this.A04 = r8;
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = AnonymousClass0x9.A14(r4);
        this.A0B = z;
        this.A09 = z2;
        this.A00 = 3;
        this.A07 = weakReference;
        this.A08 = weakReference2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass9P3 r8 = (AnonymousClass9P3) obj;
        synchronized (this) {
            C89644eZ r3 = (C89644eZ) this.A06.get();
            C202819md r2 = (C202819md) this.A07.get();
            C203209nI r4 = (C203209nI) this.A08.get();
            if (r3 != null) {
                r3.BjL();
                if (r2 != null) {
                    List list = r8.A00;
                    r2.Brm(list);
                    if (this.A09) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C166587yw A0C = C1899693i.A0C(it);
                            if (!TextUtils.isEmpty(A0C.A0A)) {
                                A0s.add(A0C.A0A);
                            }
                        }
                        AnonymousClass4FS r22 = this.A05;
                        C194489Tb r1 = this.A02;
                        Objects.requireNonNull(r1);
                        r22.BkM(new C199579go(r1));
                    }
                }
                if (this.A0B && r4 != null) {
                    List list2 = r8.A02;
                    r4.Bs5(list2);
                    List list3 = r8.A01;
                    r4.Brv(list3);
                    if (this.A09) {
                        A0G(list2);
                        A0G(list3);
                    }
                }
                r3.invalidateOptionsMenu();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0s = AnonymousClass001.A0s();
        List A0s2 = AnonymousClass001.A0s();
        List A0s3 = AnonymousClass001.A0s();
        if (this.A0B) {
            AnonymousClass2T7 r2 = this.A04;
            r2.A04 = true;
            AnonymousClass9U4 r0 = this.A03;
            AnonymousClass36F A012 = AnonymousClass9U4.A01(r0);
            A0s2 = A012.A0Q(r2);
            r0.A0J();
            A0s3 = A012.A0M(this.A00);
        }
        if (this.A0A) {
            A0s = AnonymousClass9U4.A03(this.A03).A0A();
        }
        return new AnonymousClass9P3(A0s, A0s2, A0s3);
    }

    public final void A0G(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624034w A0E = C1899693i.A0E(it);
            if (!TextUtils.isEmpty(A0E.A0K)) {
                A0s.add(A0E.A0K);
            }
        }
        this.A05.BkM(new C200539iU(this, A0s));
    }
}
