package X;

import java.util.LinkedList;

/* renamed from: X.9Un  reason: invalid class name and case insensitive filesystem */
public class C194799Un {
    public long A00;
    public Integer A01 = null;
    public boolean A02;
    public final C193239Nr A03 = new C193239Nr();

    public static /* synthetic */ void A00(C194799Un r3, String str) {
        C193239Nr r32 = r3.A03;
        synchronized (r32) {
            r32.A00 = System.nanoTime();
            LinkedList linkedList = r32.A01;
            linkedList.addLast(str);
            if (linkedList.size() > 40) {
                linkedList.removeFirst();
            }
        }
    }
}
