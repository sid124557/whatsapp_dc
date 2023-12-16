package X;

import java.util.ArrayList;

/* renamed from: X.0mg  reason: invalid class name and case insensitive filesystem */
public class C13130mg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0WL A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;

    public void run() {
        for (int i = 0; i < this.A00; i++) {
            AnonymousClass0YZ.A0F(AnonymousClass001.A0S(this.A04, i), (String) this.A02.get(i));
            AnonymousClass0YZ.A0F(AnonymousClass001.A0S(this.A05, i), (String) this.A03.get(i));
        }
    }

    public C13130mg(AnonymousClass0WL r1, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A04 = arrayList;
        this.A02 = arrayList2;
        this.A05 = arrayList3;
        this.A03 = arrayList4;
    }
}
