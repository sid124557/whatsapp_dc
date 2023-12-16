package X;

import java.util.ArrayList;

/* renamed from: X.1wW  reason: invalid class name and case insensitive filesystem */
public final class C35221wW extends C41032Ir {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"audio", "avatar_sticker", "buttons_response", "catalog", "cataloglink", "contact", "contact_array", "document", "genai_sticker", "gif", "image", "invite", "list", "list_response", "livelocation", "location", "native_flow_response", "order", "product", "productlink", "product_list", "ptt", "ptv", "sticker", "system", "unknown", "url", "vcard", "video"});

    public C35221wW(C35511wz r6, String str, byte[] bArr) {
        C56052rL A04 = C56052rL.A04("raw");
        C626836d.A0H(bArr, -9007199254740991L, 9007199254740991L);
        A04.A01 = bArr;
        A04.A0K(str, "mediatype", A00);
        C41032Ir.A0C(A04, r6, this);
    }
}
