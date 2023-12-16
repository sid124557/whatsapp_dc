package X;

import java.util.ArrayList;

/* renamed from: X.0kY  reason: invalid class name and case insensitive filesystem */
public class C11840kY implements Runnable {
    public final /* synthetic */ C010107z A00;
    public final /* synthetic */ ArrayList A01;

    public C11840kY(C010107z r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass001.A0S(arrayList, size).setVisibility(4);
            } else {
                return;
            }
        }
    }
}
