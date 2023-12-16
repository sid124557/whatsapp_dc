package X;

/* renamed from: X.1Sg  reason: invalid class name and case insensitive filesystem */
public class C23351Sg extends AnonymousClass24V {
    public final String index;
    public final byte[] mutationMac;
    public final C60642yt operation;
    public final int reason;
    public final AnonymousClass1EO syncActionValue;
    public final AnonymousClass33J syncdKeyId;
    public final int version;

    public C23351Sg(C60642yt r3, AnonymousClass33J r4, AnonymousClass1EO r5, Integer num, String str, byte[] bArr, int i) {
        super(AnonymousClass000.A0Y("MalformedMutationException with reason ", AnonymousClass001.A0o(), i));
        this.index = str;
        this.reason = i;
        this.version = C18310x6.A06(num);
        this.syncdKeyId = r4;
        this.mutationMac = bArr;
        this.syncActionValue = r5;
        this.operation = r3;
    }

    public String getMessage() {
        return super.getMessage();
    }
}
