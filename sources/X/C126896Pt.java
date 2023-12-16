package X;

import java.util.Map;

/* renamed from: X.6Pt  reason: invalid class name and case insensitive filesystem */
public final class C126896Pt extends C140596uA {
    public final Map headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public C126896Pt(C157677ih r3, String str, Map map, byte[] bArr, int i) {
        super(r3, AnonymousClass000.A0Y("Response code: ", AnonymousClass001.A0o(), i));
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
