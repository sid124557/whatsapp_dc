package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2wh  reason: invalid class name and case insensitive filesystem */
public class C59302wh {
    public final C612830a A00;
    public final C46042az A01;

    public static File A00(C624134x r6) {
        String str;
        if (!(r6 instanceof C30471mV)) {
            str = "ThumbnailHelper/getFile/Message shouldn't have a file attached to it.";
        } else {
            C30471mV r62 = (C30471mV) r6;
            AnonymousClass33C r0 = r62.A01;
            if (r0 == null) {
                str = "ThumbnailHelper/getFile/Message mediaDataV2 is null";
            } else {
                File file = r0.A0F;
                if (file == null) {
                    str = "ThumbnailHelper/getFile/Message mediaDataV2 has no file";
                } else if (!file.exists()) {
                    str = "ThumbnailHelper/getFile/Message mediaDataV2 file doesn't exists anymore";
                } else if (r62.A01.A0F.length() > 0) {
                    return r62.A01.A0F;
                } else {
                    str = "ThumbnailHelper/getFile/Message mediaDataV2 has not been downloaded yet";
                }
            }
        }
        Log.d(str);
        return null;
    }

    public byte[] A01(C624134x r10) {
        StringBuilder A0o;
        String str;
        AnonymousClass2QF A002;
        StringBuilder A0o2;
        String str2;
        C612830a r5 = this.A00;
        byte[] A05 = r5.A05(r10);
        if (A05 != null) {
            A0o = AnonymousClass001.A0o();
            str = "ThumbnailHelper/regenerateThumbnailForMessage/Returning the already present thumbnail for message rowId: ";
        } else {
            if (r10.A0l() != 1) {
                A0o2 = AnonymousClass001.A0o();
                str2 = "ThumbnailHelper/regenerateThumbnailForMessage/message is not in the main store (";
            } else if (r10.A1L <= 0) {
                A0o2 = AnonymousClass001.A0o();
                str2 = "ThumbnailHelper/regenerateThumbnailForMessage/message doesn't have row_id so we shouldn't re-generate thumbnail (";
            } else {
                if (r10 instanceof C30471mV) {
                    C30471mV r0 = (C30471mV) r10;
                    File A003 = A00(r0);
                    if (!(A003 == null || (A002 = this.A01.A00(new C149557Mx(AnonymousClass36O.A02(r0), A003, r0.A05, false))) == null || (A05 = A002.A02) == null)) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("ThumbnailHelper/regenerateThumbnailForMessage/Thumbnail regenerated for message row id: ");
                        C18260x0.A1H(A0o3, r10.A1L);
                        r5.A03(r10, A05);
                    }
                    return null;
                }
                StringBuilder A0o4 = AnonymousClass001.A0o();
                C624134x.A0P(r10, "ThumbnailHelper/regenerateThumbnailForMessage/Thumbnail not regenerable (yet) for message row id: ", A0o4);
                A0o4.append(" with type: ");
                C18260x0.A1F(A0o4, r10.A1I);
                A0o = AnonymousClass001.A0o();
                str = "ThumbnailHelper/regenerateThumbnailForMessage/Returning the generated thumbnail for message rowId: ";
            }
            C624134x.A0S(r10, str2, A0o2);
            C18260x0.A1J(A0o2, ")");
            return null;
        }
        A0o.append(str);
        C18260x0.A1H(A0o, r10.A1L);
        return A05;
    }

    public C59302wh(C612830a r1, C46042az r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
