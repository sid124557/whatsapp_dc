package X;

/* renamed from: X.91q  reason: invalid class name and case insensitive filesystem */
public class C1895291q implements C835148s {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1895291q(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BGn(Object obj) {
        switch (this.A02) {
            case 0:
                ((C186488vR) obj).BeS(((C160747oF) this.A00).A08, (C151537Ve) this.A01);
                return;
            case 1:
                throw AnonymousClass001.A0g("onRenderedFirstFrame");
            case 2:
                throw AnonymousClass001.A0g("onMetadata");
            case 3:
                throw AnonymousClass001.A0g("onAudioEnabled");
            case 4:
                throw AnonymousClass001.A0g("onPlayerError");
            case 5:
                throw AnonymousClass001.A0g("onStaticMetadataChanged");
            case 6:
                throw AnonymousClass001.A0g("onMediaItemTransition");
            case 7:
                throw AnonymousClass001.A0g("onVideoDisabled");
            case 8:
                throw AnonymousClass001.A0g("onPlaybackParametersChanged");
            case 9:
                throw AnonymousClass001.A0g("onAudioAttributesChanged");
            case 10:
                throw AnonymousClass001.A0g("onAudioSinkError");
            case 11:
                throw AnonymousClass001.A0g("onVideoEnabled");
            case 12:
                throw AnonymousClass001.A0g("onAudioDisabled");
            default:
                throw AnonymousClass001.A0g("onDownstreamFormatChanged");
        }
    }
}
