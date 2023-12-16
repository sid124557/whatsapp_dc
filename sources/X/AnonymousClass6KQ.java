package X;

import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.6KQ  reason: invalid class name */
public class AnonymousClass6KQ extends AnonymousClass6KR {
    public final Map headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public AnonymousClass6KQ(C161387pX r5, Map map, int i) {
        super(r5, (IOException) null, AnonymousClass000.A0Y("Response code: ", AnonymousClass001.A0o(), i), 2004);
        byte[] bArr = Util.A09;
        this.responseCode = i;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
