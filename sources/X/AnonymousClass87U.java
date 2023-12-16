package X;

/* renamed from: X.87U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass87U implements C180678lS {
    public final int BCU(Object obj) {
        String str = ((C160687o8) obj).A03;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (C162387ry.A01 >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
