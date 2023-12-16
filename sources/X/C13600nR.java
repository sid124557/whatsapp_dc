package X;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.0nR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13600nR implements Callable {
    public final /* synthetic */ C09020fW A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ ArrayList A02;

    public final Object call() {
        C09020fW r0 = this.A00;
        ArrayList arrayList = this.A02;
        String str = this.A01;
        WorkDatabase workDatabase = r0.A03;
        arrayList.addAll(workDatabase.A0K().BDX(str));
        return workDatabase.A0J().BEX(str);
    }

    public /* synthetic */ C13600nR(C09020fW r1, String str, ArrayList arrayList) {
        this.A00 = r1;
        this.A02 = arrayList;
        this.A01 = str;
    }
}
