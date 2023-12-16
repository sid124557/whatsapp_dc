package X;

import java.io.IOException;

/* renamed from: X.6KR  reason: invalid class name */
public class AnonymousClass6KR extends C140616uC {
    public final C161387pX dataSpec;
    public final int type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public AnonymousClass6KR(C161387pX r3, IOException iOException, int i) {
        super((Throwable) iOException, i == 1 ? 2001 : 2000);
        this.dataSpec = r3;
        this.type = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KR(C161387pX r3, IOException iOException, String str, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.dataSpec = r3;
        this.type = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public AnonymousClass6KR(C161387pX r3, String str, int i) {
        super(str, i == 1 ? 2001 : 2000);
        this.dataSpec = r3;
        this.type = i;
    }
}
