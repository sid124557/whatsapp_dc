package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.90V  reason: invalid class name */
public class AnonymousClass90V implements C183698qT {
    public Object A00;
    public final int A01;

    public AnonymousClass90V(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass90V r1) {
        ((AnonymousClass4PH) r1.A00).A0T.BlT("zoom");
    }

    public void BOO() {
        if (2 - this.A01 == 0) {
            BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = (BusinessDirectoryMapViewActivity) this.A00;
            AnonymousClass4U2 r2 = businessDirectoryMapViewActivity.A0N;
            if (r2 == null) {
                throw C86604Kt.A0j();
            }
            C110885hC r0 = businessDirectoryMapViewActivity.A07;
            C162457s7.A0H(r0);
            C166477yk A02 = r0.A02();
            C110885hC r02 = businessDirectoryMapViewActivity.A07;
            C162457s7.A0H(r02);
            C106725a3 r03 = r02.A0S;
            C162457s7.A0D(r03);
            r2.A0K(r03, A02);
        }
    }

    public void BTW() {
        switch (this.A01) {
            case 2:
                BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = (BusinessDirectoryMapViewActivity) this.A00;
                AnonymousClass4U2 r2 = businessDirectoryMapViewActivity.A0N;
                if (r2 == null) {
                    throw C86604Kt.A0j();
                }
                C110885hC r0 = businessDirectoryMapViewActivity.A07;
                C162457s7.A0H(r0);
                C166477yk A02 = r0.A02();
                C110885hC r02 = businessDirectoryMapViewActivity.A07;
                C162457s7.A0H(r02);
                C106725a3 r03 = r02.A0S;
                C162457s7.A0D(r03);
                r2.A0K(r03, A02);
                return;
            case 3:
                return;
            default:
                A00(this);
                return;
        }
    }
}
