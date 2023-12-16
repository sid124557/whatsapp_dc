package X;

/* renamed from: X.8R6  reason: invalid class name */
public class AnonymousClass8R6 implements C183668qQ {
    public long A00;
    public final C183668qQ A01;

    public AnonymousClass8R6(C183668qQ r1) {
        this.A01 = r1;
    }

    public String readLine() {
        long currentTimeMillis = System.currentTimeMillis();
        String readLine = this.A01.readLine();
        this.A00 += System.currentTimeMillis() - currentTimeMillis;
        return readLine;
    }
}
