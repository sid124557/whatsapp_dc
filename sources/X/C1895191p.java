package X;

/* renamed from: X.91p  reason: invalid class name and case insensitive filesystem */
public class C1895191p implements C835148s {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1895191p(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void BGn(Object obj) {
        switch (this.A03) {
            case 0:
                throw AnonymousClass001.A0g("onVideoInputFormatChanged");
            case 1:
                throw AnonymousClass001.A0g("onAudioInputFormatChanged");
            case 2:
                throw AnonymousClass001.A0g("onLoadStarted");
            case 3:
                throw AnonymousClass001.A0g("onLoadCompleted");
            case 4:
                throw AnonymousClass001.A0g("onLoadCanceled");
            default:
                throw AnonymousClass001.A0g("onTracksChanged");
        }
    }
}
