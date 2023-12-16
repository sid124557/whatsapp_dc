package X;

/* renamed from: X.6zk  reason: invalid class name and case insensitive filesystem */
public class C143946zk extends Exception implements C177618gA {
    public final int errorCode;
    public final long timestampMs;

    public C143946zk(String str, Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = j;
    }
}
