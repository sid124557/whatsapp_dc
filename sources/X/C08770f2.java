package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0f2  reason: invalid class name and case insensitive filesystem */
public class C08770f2 implements C16980uL {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C009907x A01;
    public final /* synthetic */ ArrayList A02;

    public C08770f2(View view, C009907x r2, ArrayList arrayList) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public void Bef(C10560i8 r6) {
        r6.A0C(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass001.A0S(arrayList, i).setVisibility(0);
        }
    }

    public void Bei(C10560i8 r1) {
        r1.A0C(this);
        r1.A0B(this);
    }

    public void Bee(C10560i8 r1) {
    }

    public void Beg(C10560i8 r1) {
    }

    public void Beh(C10560i8 r1) {
    }
}
