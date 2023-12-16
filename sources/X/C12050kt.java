package X;

/* renamed from: X.0kt  reason: invalid class name and case insensitive filesystem */
public class C12050kt implements Runnable {
    public final /* synthetic */ AnonymousClass0TC A00;
    public final /* synthetic */ C06250Wv A01;

    public C12050kt(AnonymousClass0TC r1, C06250Wv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C06240Wu A002 = C06240Wu.A00();
        String str = AnonymousClass0TC.A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Scheduling work ");
        C06250Wv r3 = this.A01;
        C06240Wu.A03(A002, r3.A0J, str, A0o);
        this.A00.A01.Bkm(r3);
    }
}
